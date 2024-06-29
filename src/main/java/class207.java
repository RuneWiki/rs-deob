import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class207 extends class216 {

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Z")
    private boolean field3323 = false;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    private int field3327;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field3328;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3326;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3324;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "[B")
    private byte[] field3325;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1454(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3323 = true;
                    }
                }
            }
        }
        this.field3326 = new AudioFormat((float) class413.field6106, 16, class29.field339 ? 2 : 1, true, false);
        this.field3325 = new byte[0x100 << (class29.field339 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
    public final void method1455() {
        int var1 = 256;
        if (class29.field339) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3519[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3325[var2 * 2] = (byte) (var3 >> 8);
            this.field3325[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3324.write(this.field3325, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public final void method1456() {
        if (this.field3324 != null) {
            this.field3324.close();
            this.field3324 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()I")
    public final int method1457() {
        return this.field3327 - (this.field3324.available() >> (class29.field339 ? 2 : 1));
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()V")
    public final void method1458() throws LineUnavailableException {
        this.field3324.flush();
        if (!this.field3323) {
            return;
        }
        this.field3324.close();
        this.field3324 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field3328 == null ? (field3328 = method1460("javax.sound.sampled.SourceDataLine")) : field3328, this.field3326, this.field3327 << (class29.field339 ? 2 : 1));
        this.field3324 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3324.open();
        this.field3324.start();
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public final void method1459(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field3328 == null ? (field3328 = method1460("javax.sound.sampled.SourceDataLine")) : field3328, this.field3326, arg0 << (class29.field339 ? 2 : 1));
            this.field3324 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3324.open();
            this.field3324.start();
            this.field3327 = arg0;
        } catch (LineUnavailableException var4) {
            if (class300.method2020(arg0, -214748365) == 1) {
                this.field3324 = null;
                throw var4;
            } else {
                this.method1459(class111.method822((byte) 106, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1460(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
