import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class165 extends class229 {

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Z")
    private boolean field2959 = false;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    private int field2963;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field2964;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2961;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2962;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[B")
    private byte[] field2960;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()I")
    public final int method1103() {
        return this.field2963 - (this.field2962.available() >> (class61.field1028 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method1104(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2964 == null ? (field2964 = method1186("javax.sound.sampled.SourceDataLine")) : field2964, this.field2961, arg0 << (class61.field1028 ? 2 : 1));
            this.field2962 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2962.open();
            this.field2962.start();
            this.field2963 = arg0;
        } catch (LineUnavailableException var4) {
            if (class114.method854(-26613, arg0) == 1) {
                this.field2962 = null;
                throw var4;
            } else {
                this.method1104(class186.method1286((byte) 114, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public final void method1100() throws LineUnavailableException {
        this.field2962.flush();
        if (!this.field2959) {
            return;
        }
        this.field2962.close();
        this.field2962 = null;
        Info var1 = new Info(field2964 == null ? (field2964 = method1186("javax.sound.sampled.SourceDataLine")) : field2964, this.field2961, this.field2963 << (class61.field1028 ? 2 : 1));
        this.field2962 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2962.open();
        this.field2962.start();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public final void method1099() {
        if (this.field2962 != null) {
            this.field2962.close();
            this.field2962 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public final void method1105() {
        int var1 = 256;
        if (class61.field1028) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3940[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2960[var2 * 2] = (byte) (var3 >> 8);
            this.field2960[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2962.write(this.field2960, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1102(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2959 = true;
                    }
                }
            }
        }
        this.field2961 = new AudioFormat((float) class253.field4432, 16, class61.field1028 ? 2 : 1, true, false);
        this.field2960 = new byte[0x100 << (class61.field1028 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1186(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
