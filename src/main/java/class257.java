import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class257 extends class248 {

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "Z")
    private boolean field3679 = false;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    private int field3677;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field3682;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3678;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3680;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "[B")
    private byte[] field3681;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "()V")
    public final void method1576() throws LineUnavailableException {
        this.field3680.flush();
        if (!this.field3679) {
            return;
        }
        this.field3680.close();
        this.field3680 = null;
        Info var1 = new Info(field3682 == null ? (field3682 = method1643("javax.sound.sampled.SourceDataLine")) : field3682, this.field3678, this.field3677 << (class103.field1505 ? 2 : 1));
        this.field3680 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3680.open();
        this.field3680.start();
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()V")
    public final void method1567() {
        int var1 = 256;
        if (class103.field1505) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3565[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3681[var2 * 2] = (byte) (var3 >> 8);
            this.field3681[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3680.write(this.field3681, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1573(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3679 = true;
                    }
                }
            }
        }
        this.field3678 = new AudioFormat((float) class270.field3834, 16, class103.field1505 ? 2 : 1, true, false);
        this.field3681 = new byte[0x100 << (class103.field1505 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "()V")
    public final void method1578() {
        if (this.field3680 != null) {
            this.field3680.close();
            this.field3680 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
    public final void method1574(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3682 == null ? (field3682 = method1643("javax.sound.sampled.SourceDataLine")) : field3682, this.field3678, arg0 << (class103.field1505 ? 2 : 1));
            this.field3680 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3680.open();
            this.field3680.start();
            this.field3677 = arg0;
        } catch (LineUnavailableException var4) {
            if (class460.method2788((byte) -79, arg0) == 1) {
                this.field3680 = null;
                throw var4;
            } else {
                this.method1574(class322.method1938(arg0, 72));
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "()I")
    public final int method1579() {
        return this.field3677 - (this.field3680.available() >> (class103.field1505 ? 2 : 1));
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1643(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
