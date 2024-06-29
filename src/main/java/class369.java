import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class369 extends class292 {

    @OriginalMember(owner = "client!mt", name = "P", descriptor = "Z")
    private boolean field4765 = false;

    @OriginalMember(owner = "client!mt", name = "R", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!mt", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4768;

    @OriginalMember(owner = "client!mt", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4766;

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4763;

    @OriginalMember(owner = "client!mt", name = "O", descriptor = "[B")
    private byte[] field4764;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)V")
    public final void method1763(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4768 == null ? (field4768 = method2147("javax.sound.sampled.SourceDataLine")) : field4768, this.field4766, arg0 << (class487.field6095 ? 2 : 1));
            this.field4763 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4763.open();
            this.field4763.start();
            this.field4767 = arg0;
        } catch (LineUnavailableException var4) {
            if (class281.method1708(arg0, true) == 1) {
                this.field4763 = null;
                throw var4;
            } else {
                this.method1763(class560.method2979(arg0, (byte) 115));
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "()V")
    public final void method1751() {
        if (this.field4763 != null) {
            this.field4763.close();
            this.field4763 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "()I")
    public final int method1754() {
        return this.field4767 - (this.field4763.available() >> (class487.field6095 ? 2 : 1));
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "()V")
    public final void method1762() throws LineUnavailableException {
        this.field4763.flush();
        if (!this.field4765) {
            return;
        }
        this.field4763.close();
        this.field4763 = null;
        Info var1 = new Info(field4768 == null ? (field4768 = method2147("javax.sound.sampled.SourceDataLine")) : field4768, this.field4766, this.field4767 << (class487.field6095 ? 2 : 1));
        this.field4763 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4763.open();
        this.field4763.start();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1759(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4765 = true;
                    }
                }
            }
        }
        this.field4766 = new AudioFormat((float) class278.field3535, 16, class487.field6095 ? 2 : 1, true, false);
        this.field4764 = new byte[0x100 << (class487.field6095 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "()V")
    public final void method1766() {
        int var1 = 256;
        if (class487.field6095) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3701[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4764[var2 * 2] = (byte) (var3 >> 8);
            this.field4764[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4763.write(this.field4764, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2147(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
