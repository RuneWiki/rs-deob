import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class354 extends class260 {

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "Z")
    private boolean field5434 = false;

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
    private int field5435;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field5437;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5433;

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5436;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "[B")
    private byte[] field5432;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "()V")
    public final void method1632() {
        int var1 = 256;
        if (class116.field1749) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3877[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5432[var2 * 2] = (byte) (var3 >> 8);
            this.field5432[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5436.write(this.field5432, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1639(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5434 = true;
                    }
                }
            }
        }
        this.field5433 = new AudioFormat((float) class208.field3009, 16, class116.field1749 ? 2 : 1, true, false);
        this.field5432 = new byte[0x100 << (class116.field1749 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "()V")
    public final void method1633() {
        if (this.field5436 != null) {
            this.field5436.close();
            this.field5436 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method1626(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field5437 == null ? (field5437 = method2138("javax.sound.sampled.SourceDataLine")) : field5437, this.field5433, arg0 << (class116.field1749 ? 2 : 1));
            this.field5436 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5436.open();
            this.field5436.start();
            this.field5435 = arg0;
        } catch (LineUnavailableException var4) {
            if (class161.method1139(arg0, (byte) -111) == 1) {
                this.field5436 = null;
                throw var4;
            } else {
                this.method1626(class143.method1039(8, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "()I")
    public final int method1638() {
        return this.field5435 - (this.field5436.available() >> (class116.field1749 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "()V")
    public final void method1640() throws LineUnavailableException {
        this.field5436.flush();
        if (!this.field5434) {
            return;
        }
        this.field5436.close();
        this.field5436 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field5437 == null ? (field5437 = method2138("javax.sound.sampled.SourceDataLine")) : field5437, this.field5433, this.field5435 << (class116.field1749 ? 2 : 1));
        this.field5436 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5436.open();
        this.field5436.start();
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2138(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
