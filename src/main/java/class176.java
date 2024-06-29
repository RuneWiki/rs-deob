import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class176 extends class104 {

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "Z")
    private boolean field2829 = false;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    private int field2825;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field2830;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2826;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2827;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "[B")
    private byte[] field2828;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method414(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2829 = true;
                    }
                }
            }
        }
        this.field2826 = new AudioFormat((float) class29.field343, 16, class278.field4456 ? 2 : 1, true, false);
        this.field2828 = new byte[0x100 << (class278.field4456 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method416() {
        int var1 = 256;
        if (class278.field4456) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1731[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2828[var2 * 2] = (byte) (var3 >> 8);
            this.field2828[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2827.write(this.field2828, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()I")
    public final int method417() {
        return this.field2825 - (this.field2827.available() >> (class278.field4456 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()V")
    public final void method415() {
        if (this.field2827 != null) {
            this.field2827.close();
            this.field2827 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method413() throws LineUnavailableException {
        this.field2827.flush();
        if (!this.field2829) {
            return;
        }
        this.field2827.close();
        this.field2827 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field2830 == null ? (field2830 = method1218("javax.sound.sampled.SourceDataLine")) : field2830, this.field2826, this.field2825 << (class278.field4456 ? 2 : 1));
        this.field2827 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2827.open();
        this.field2827.start();
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public final void method412(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field2830 == null ? (field2830 = method1218("javax.sound.sampled.SourceDataLine")) : field2830, this.field2826, arg0 << (class278.field4456 ? 2 : 1));
            this.field2827 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2827.open();
            this.field2827.start();
            this.field2825 = arg0;
        } catch (LineUnavailableException var4) {
            if (class19.method135(arg0, 1076237636) == 1) {
                this.field2827 = null;
                throw var4;
            } else {
                this.method412(class290.method1941(arg0, -1675860440));
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1218(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
