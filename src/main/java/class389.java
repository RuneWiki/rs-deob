import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class389 extends class379 {

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "Z")
    private boolean field5515 = false;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field5512;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field5517;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5516;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5514;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "[B")
    private byte[] field5513;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
    public final void method2054() throws LineUnavailableException {
        this.field5514.flush();
        if (!this.field5515) {
            return;
        }
        this.field5514.close();
        this.field5514 = null;
        Info var1 = new Info(field5517 == null ? (field5517 = method2347("javax.sound.sampled.SourceDataLine")) : field5517, this.field5516, this.field5512 << (class626.field9116 ? 2 : 1));
        this.field5514 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5514.open();
        this.field5514.start();
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V")
    public final void method2053(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5517 == null ? (field5517 = method2347("javax.sound.sampled.SourceDataLine")) : field5517, this.field5516, arg0 << (class626.field9116 ? 2 : 1));
            this.field5514 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5514.open();
            this.field5514.start();
            this.field5512 = arg0;
        } catch (LineUnavailableException var4) {
            if (class637.method3692((byte) -115, arg0) == 1) {
                this.field5514 = null;
                throw var4;
            } else {
                this.method2053(class32.method326(arg0, false));
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()V")
    public final void method2056() {
        if (this.field5514 != null) {
            this.field5514.close();
            this.field5514 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "()I")
    public final int method2052() {
        return this.field5512 - (this.field5514.available() >> (class626.field9116 ? 2 : 1));
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2055(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5515 = true;
                    }
                }
            }
        }
        this.field5516 = new AudioFormat((float) class223.field3180, 16, class626.field9116 ? 2 : 1, true, false);
        this.field5513 = new byte[0x100 << (class626.field9116 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "()V")
    public final void method2050() {
        int var1 = 256;
        if (class626.field9116) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5088[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5513[var2 * 2] = (byte) (var3 >> 8);
            this.field5513[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5514.write(this.field5513, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2347(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
