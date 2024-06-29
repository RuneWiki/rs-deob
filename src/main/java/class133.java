import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class133 extends class202 {

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Z")
    private boolean field1862 = false;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    private int field1863;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1865;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1864;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1860;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "[B")
    private byte[] field1861;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()V")
    public final void method835() throws LineUnavailableException {
        this.field1860.flush();
        if (!this.field1862) {
            return;
        }
        this.field1860.close();
        this.field1860 = null;
        Info var1 = new Info(field1865 == null ? (field1865 = method841("javax.sound.sampled.SourceDataLine")) : field1865, this.field1864, this.field1863 << (class407.field6043 ? 2 : 1));
        this.field1860 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1860.open();
        this.field1860.start();
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final void method836(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1865 == null ? (field1865 = method841("javax.sound.sampled.SourceDataLine")) : field1865, this.field1864, arg0 << (class407.field6043 ? 2 : 1));
            this.field1860 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1860.open();
            this.field1860.start();
            this.field1863 = arg0;
        } catch (LineUnavailableException var4) {
            if (class413.method2638(arg0, -28139) == 1) {
                this.field1860 = null;
                throw var4;
            } else {
                this.method836(class139.method896(arg0, -121));
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method837(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1862 = true;
                    }
                }
            }
        }
        this.field1864 = new AudioFormat((float) class9.field153, 16, class407.field6043 ? 2 : 1, true, false);
        this.field1861 = new byte[0x100 << (class407.field6043 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()I")
    public final int method838() {
        return this.field1863 - (this.field1860.available() >> (class407.field6043 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
    public final void method839() {
        if (this.field1860 != null) {
            this.field1860.close();
            this.field1860 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
    public final void method840() {
        int var1 = 256;
        if (class407.field6043) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2718[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1861[var2 * 2] = (byte) (var3 >> 8);
            this.field1861[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1860.write(this.field1861, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method841(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
