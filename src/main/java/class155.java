import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class155 extends class116 {

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Z")
    private boolean field3003 = false;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field3005;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3000;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3004;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[B")
    private byte[] field3001;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()V")
    public final void method83() {
        if (this.field3004 != null) {
            this.field3004.close();
            this.field3004 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public final void method84(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3005 == null ? (field3005 = method1083("javax.sound.sampled.SourceDataLine")) : field3005, this.field3000, arg0 << (class16.field290 ? 2 : 1));
            this.field3004 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3004.open();
            this.field3004.start();
            this.field3002 = arg0;
        } catch (LineUnavailableException var4) {
            if (class22.method138(false, arg0) == 1) {
                this.field3004 = null;
                throw var4;
            } else {
                this.method84(class167.method1148(arg0, 25920));
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()V")
    public final void method81() throws LineUnavailableException {
        this.field3004.flush();
        if (!this.field3003) {
            return;
        }
        this.field3004.close();
        this.field3004 = null;
        Info var1 = new Info(field3005 == null ? (field3005 = method1083("javax.sound.sampled.SourceDataLine")) : field3005, this.field3000, this.field3002 << (class16.field290 ? 2 : 1));
        this.field3004 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3004.open();
        this.field3004.start();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()I")
    public final int method82() {
        return this.field3002 - (this.field3004.available() >> (class16.field290 ? 2 : 1));
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()V")
    public final void method80() {
        int var1 = 256;
        if (class16.field290) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2238[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3001[var2 * 2] = (byte) (var3 >> 8);
            this.field3001[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3004.write(this.field3001, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method85(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var4.length > var3) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3003 = true;
                    }
                }
                var3++;
            }
        }
        this.field3000 = new AudioFormat((float) class108.field2080, 16, class16.field290 ? 2 : 1, true, false);
        this.field3001 = new byte[0x100 << (class16.field290 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1083(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
