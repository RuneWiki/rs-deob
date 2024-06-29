import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class189 extends class20 {

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Z")
    private boolean field3495 = false;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field3493;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3498;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3497;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3494;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "[B")
    private byte[] field3496;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
    public final void method196() throws LineUnavailableException {
        this.field3494.flush();
        if (!this.field3495) {
            return;
        }
        this.field3494.close();
        this.field3494 = null;
        Info var1 = new Info(field3498 == null ? (field3498 = method1185("javax.sound.sampled.SourceDataLine")) : field3498, this.field3497, this.field3493 << (class168.field3201 ? 2 : 1));
        this.field3494 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3494.open();
        this.field3494.start();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public final void method189() {
        int var1 = 256;
        if (class168.field3201) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field474[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3496[var2 * 2] = (byte) (var3 >> 8);
            this.field3496[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3494.write(this.field3496, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()I")
    public final int method199() {
        return this.field3493 - (this.field3494.available() >> (class168.field3201 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public final void method194(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3498 == null ? (field3498 = method1185("javax.sound.sampled.SourceDataLine")) : field3498, this.field3497, arg0 << (class168.field3201 ? 2 : 1));
            this.field3494 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3494.open();
            this.field3494.start();
            this.field3493 = arg0;
        } catch (LineUnavailableException var4) {
            if (class17.method147(105, arg0) == 1) {
                this.field3494 = null;
                throw var4;
            } else {
                this.method194(class175.method1105(arg0, -118));
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method193(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3495 = true;
                    }
                }
            }
        }
        this.field3497 = new AudioFormat((float) class106.field1956, 16, class168.field3201 ? 2 : 1, true, false);
        this.field3496 = new byte[0x100 << (class168.field3201 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()V")
    public final void method197() {
        if (this.field3494 != null) {
            this.field3494.close();
            this.field3494 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1185(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
