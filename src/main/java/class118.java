import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class118 extends class14 {

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "Z")
    private boolean field2229 = false;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    private int field2230;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field2234;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2232;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2231;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "[B")
    private byte[] field2233;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "()I")
    public final int method104() {
        return this.field2230 - (this.field2231.available() >> (class121.field2268 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()V")
    public final void method94() throws LineUnavailableException {
        this.field2231.flush();
        if (!this.field2229) {
            return;
        }
        this.field2231.close();
        this.field2231 = null;
        Info var1 = new Info(field2234 == null ? (field2234 = method764("javax.sound.sampled.SourceDataLine")) : field2234, this.field2232, this.field2230 << (class121.field2268 ? 2 : 1));
        this.field2231 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2231.open();
        this.field2231.start();
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public final void method105(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2234 == null ? (field2234 = method764("javax.sound.sampled.SourceDataLine")) : field2234, this.field2232, arg0 << (class121.field2268 ? 2 : 1));
            this.field2231 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2231.open();
            this.field2231.start();
            this.field2230 = arg0;
        } catch (LineUnavailableException var4) {
            if (class95.method611(arg0, 858993459) == 1) {
                this.field2231 = null;
                throw var4;
            } else {
                this.method105(class125.method789(-117, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
    public final void method93() {
        int var1 = 256;
        if (class121.field2268) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field338[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2233[var2 * 2] = (byte) (var3 >> 8);
            this.field2233[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2231.write(this.field2233, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()V")
    public final void method99() {
        if (this.field2231 != null) {
            this.field2231.close();
            this.field2231 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method95(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2229 = true;
                    }
                }
            }
        }
        this.field2232 = new AudioFormat((float) class80.field1542, 16, class121.field2268 ? 2 : 1, true, false);
        this.field2233 = new byte[0x100 << (class121.field2268 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method764(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
