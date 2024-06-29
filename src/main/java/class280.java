import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class280 extends class248 {

    @OriginalMember(owner = "client!si", name = "S", descriptor = "Z")
    private boolean field4929 = false;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    private int field4926;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field4930;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4928;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4927;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "[B")
    private byte[] field4925;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1641(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4929 = true;
                    }
                }
            }
        }
        this.field4928 = new AudioFormat((float) class190.field3494, 16, class83.field1509 ? 2 : 1, true, false);
        this.field4925 = new byte[0x100 << (class83.field1509 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public final void method1651(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field4930 == null ? (field4930 = method1844("javax.sound.sampled.SourceDataLine")) : field4930, this.field4928, arg0 << (class83.field1509 ? 2 : 1));
            this.field4927 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4927.open();
            this.field4927.start();
            this.field4926 = arg0;
        } catch (LineUnavailableException var4) {
            if (class289.method1923(arg0, -22843) == 1) {
                this.field4927 = null;
                throw var4;
            } else {
                this.method1651(class29.method198(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()V")
    public final void method1645() {
        if (this.field4927 != null) {
            this.field4927.close();
            this.field4927 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "()V")
    public final void method1650() {
        int var1 = 256;
        if (class83.field1509) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4464[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4925[var2 * 2] = (byte) (var3 >> 8);
            this.field4925[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4927.write(this.field4925, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "()V")
    public final void method1648() throws LineUnavailableException {
        this.field4927.flush();
        if (!this.field4929) {
            return;
        }
        this.field4927.close();
        this.field4927 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field4930 == null ? (field4930 = method1844("javax.sound.sampled.SourceDataLine")) : field4930, this.field4928, this.field4926 << (class83.field1509 ? 2 : 1));
        this.field4927 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4927.open();
        this.field4927.start();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()I")
    public final int method1644() {
        return this.field4926 - (this.field4927.available() >> (class83.field1509 ? 2 : 1));
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1844(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
