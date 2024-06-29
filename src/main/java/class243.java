import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class243 extends class201 {

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Z")
    private boolean field3811 = false;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    private int field3812;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field3815;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3814;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3810;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "[B")
    private byte[] field3813;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()V", line = 13)
    public final void method1401() {
        int var1 = 256;
        if (class349.field5573) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3048[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3813[var2 * 2] = (byte) (var3 >> 8);
            this.field3813[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3810.write(this.field3813, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 49)
    public final void method1400(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3811 = true;
                    }
                }
            }
        }
        this.field3814 = new AudioFormat((float) class361.field5710, 16, class349.field5573 ? 2 : 1, true, false);
        this.field3813 = new byte[0x100 << (class349.field5573 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V", line = 85)
    public final void method1398() throws LineUnavailableException {
        this.field3810.flush();
        if (!this.field3811) {
            return;
        }
        this.field3810.close();
        this.field3810 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field3815 == null ? (field3815 = method1723("javax.sound.sampled.SourceDataLine")) : field3815, this.field3814, this.field3812 << (class349.field5573 ? 2 : 1));
        this.field3810 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3810.open();
        this.field3810.start();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 91)
    public static Class method1723(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "()I", line = 108)
    public final int method1410() {
        return this.field3812 - (this.field3810.available() >> (class349.field5573 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "()V", line = 115)
    public final void method1408() {
        if (this.field3810 != null) {
            this.field3810.close();
            this.field3810 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 129)
    public final void method1411(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field3815 == null ? (field3815 = method1723("javax.sound.sampled.SourceDataLine")) : field3815, this.field3814, arg0 << (class349.field5573 ? 2 : 1));
            this.field3810 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3810.open();
            this.field3810.start();
            this.field3812 = arg0;
        } catch (LineUnavailableException var4) {
            if (class67.method422(arg0, false) == 1) {
                this.field3810 = null;
                throw var4;
            } else {
                this.method1411(class226.method1571(true, arg0));
            }
        }
    }
}
