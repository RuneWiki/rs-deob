import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class144 extends class156 {

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "Z")
    private boolean field2196 = false;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    private int field2199;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field2201;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2200;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2197;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "[B")
    private byte[] field2198;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()I")
    public final int method198() {
        return this.field2199 - (this.field2197.available() >> (class368.field5405 ? 2 : 1));
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "()V")
    public final void method203() {
        int var1 = 256;
        if (class368.field5405) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2319[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2198[var2 * 2] = (byte) (var3 >> 8);
            this.field2198[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2197.write(this.field2198, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public final void method201(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2201 == null ? (field2201 = method1027("javax.sound.sampled.SourceDataLine")) : field2201, this.field2200, arg0 << (class368.field5405 ? 2 : 1));
            this.field2197 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2197.open();
            this.field2197.start();
            this.field2199 = arg0;
        } catch (LineUnavailableException var4) {
            if (client.method1379(arg0, 64) == 1) {
                this.field2197 = null;
                throw var4;
            } else {
                this.method201(class396.method2493((byte) 66, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method200(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2196 = true;
                    }
                }
            }
        }
        this.field2200 = new AudioFormat((float) class40.field540, 16, class368.field5405 ? 2 : 1, true, false);
        this.field2198 = new byte[0x100 << (class368.field5405 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
    public final void method204() throws LineUnavailableException {
        this.field2197.flush();
        if (!this.field2196) {
            return;
        }
        this.field2197.close();
        this.field2197 = null;
        Info var1 = new Info(field2201 == null ? (field2201 = method1027("javax.sound.sampled.SourceDataLine")) : field2201, this.field2200, this.field2199 << (class368.field5405 ? 2 : 1));
        this.field2197 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2197.open();
        this.field2197.start();
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "()V")
    public final void method202() {
        if (this.field2197 != null) {
            this.field2197.close();
            this.field2197 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1027(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
