import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class80 extends class270 {

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "Z")
    private boolean field1393 = false;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field1397;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1396;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1394;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "[B")
    private byte[] field1392;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()V", line = 12)
    public final void method578() throws LineUnavailableException {
        this.field1394.flush();
        if (!this.field1393) {
            return;
        }
        this.field1394.close();
        this.field1394 = null;
        Info var1 = new Info(field1397 == null ? (field1397 = method584("javax.sound.sampled.SourceDataLine")) : field1397, this.field1396, this.field1395 << (class236.field3576 ? 2 : 1));
        this.field1394 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1394.open();
        this.field1394.start();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 18)
    public static Class method584(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 35)
    public final void method579(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1397 == null ? (field1397 = method584("javax.sound.sampled.SourceDataLine")) : field1397, this.field1396, arg0 << (class236.field3576 ? 2 : 1));
            this.field1394 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1394.open();
            this.field1394.start();
            this.field1395 = arg0;
        } catch (LineUnavailableException var4) {
            if (class400.method2377(true, arg0) == 1) {
                this.field1394 = null;
                throw var4;
            } else {
                this.method579(class99.method749(arg0, -23866));
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()V", line = 58)
    public final void method580() {
        int var1 = 256;
        if (class236.field3576) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4078[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1392[var2 * 2] = (byte) (var3 >> 8);
            this.field1392[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1394.write(this.field1392, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 94)
    public final void method581(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1393 = true;
                    }
                }
            }
        }
        this.field1396 = new AudioFormat((float) class170.field2646, 16, class236.field3576 ? 2 : 1, true, false);
        this.field1392 = new byte[0x100 << (class236.field3576 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()I", line = 128)
    public final int method582() {
        return this.field1395 - (this.field1394.available() >> (class236.field3576 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()V", line = 136)
    public final void method583() {
        if (this.field1394 != null) {
            this.field1394.close();
            this.field1394 = null;
        }
    }
}
