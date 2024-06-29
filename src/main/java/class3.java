import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class127 {

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "Z")
    private boolean field14 = false;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field17;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field16;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field15;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "[B")
    private byte[] field12;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
    public final void method9() throws LineUnavailableException {
        this.field15.flush();
        if (!this.field14) {
            return;
        }
        this.field15.close();
        this.field15 = null;
        Info var1 = new Info(field17 == null ? (field17 = method15("javax.sound.sampled.SourceDataLine")) : field17, this.field16, this.field13 << (class286.field4477 ? 2 : 1));
        this.field15 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field15.open();
        this.field15.start();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public final void method10() {
        if (this.field15 != null) {
            this.field15.close();
            this.field15 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()V")
    public final void method11() {
        int var1 = 256;
        if (class286.field4477) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1788[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field12[var2 * 2] = (byte) (var3 >> 8);
            this.field12[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field15.write(this.field12, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public final void method12(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field17 == null ? (field17 = method15("javax.sound.sampled.SourceDataLine")) : field17, this.field16, arg0 << (class286.field4477 ? 2 : 1));
            this.field15 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field15.open();
            this.field15.start();
            this.field13 = arg0;
        } catch (LineUnavailableException var4) {
            if (class86.method542(arg0, 79) == 1) {
                this.field15 = null;
                throw var4;
            } else {
                this.method12(class89.method567(arg0, -1989));
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method13(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field14 = true;
                    }
                }
            }
        }
        this.field16 = new AudioFormat((float) class60.field845, 16, class286.field4477 ? 2 : 1, true, false);
        this.field12 = new byte[0x100 << (class286.field4477 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()I")
    public final int method14() {
        return this.field13 - (this.field15.available() >> (class286.field4477 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method15(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
