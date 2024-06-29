import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class277 extends class362 {

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "Z")
    private boolean field4206 = false;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field4210;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4208;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4205;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "[B")
    private byte[] field4209;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()V", line = 11)
    public final void method280() {
        if (this.field4205 != null) {
            this.field4205.close();
            this.field4205 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V", line = 26)
    public final void method279() {
        int var1 = 256;
        if (class436.field6165) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5483[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4209[var2 * 2] = (byte) (var3 >> 8);
            this.field4209[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4205.write(this.field4209, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 61)
    public final void method275(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4210 == null ? (field4210 = method1796("javax.sound.sampled.SourceDataLine")) : field4210, this.field4208, arg0 << (class436.field6165 ? 2 : 1));
            this.field4205 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4205.open();
            this.field4205.start();
            this.field4207 = arg0;
        } catch (LineUnavailableException var4) {
            if (class48.method348((byte) 116, arg0) == 1) {
                this.field4205 = null;
                throw var4;
            } else {
                this.method275(class158.method1078((byte) -126, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 61)
    public static Class method1796(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 88)
    public final void method278(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4206 = true;
                    }
                }
            }
        }
        this.field4208 = new AudioFormat((float) class144.field2047, 16, class436.field6165 ? 2 : 1, true, false);
        this.field4209 = new byte[0x100 << (class436.field6165 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()V", line = 126)
    public final void method276() throws LineUnavailableException {
        this.field4205.flush();
        if (!this.field4206) {
            return;
        }
        this.field4205.close();
        this.field4205 = null;
        Info var1 = new Info(field4210 == null ? (field4210 = method1796("javax.sound.sampled.SourceDataLine")) : field4210, this.field4208, this.field4207 << (class436.field6165 ? 2 : 1));
        this.field4205 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4205.open();
        this.field4205.start();
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()I", line = 149)
    public final int method277() {
        return this.field4207 - (this.field4205.available() >> (class436.field6165 ? 2 : 1));
    }
}
