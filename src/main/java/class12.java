import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class12 extends class252 {

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "Z")
    private boolean field151 = false;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field154;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field149;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field152;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "[B")
    private byte[] field153;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V", line = 15)
    public final void method114() {
        if (this.field152 != null) {
            this.field152.close();
            this.field152 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()V", line = 30)
    public final void method115() {
        int var1 = 256;
        if (class61.field946) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3871[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field153[var2 * 2] = (byte) (var3 >> 8);
            this.field153[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field152.write(this.field153, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 66)
    public final void method116(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field154 == null ? (field154 = method120("javax.sound.sampled.SourceDataLine")) : field154, this.field149, arg0 << (class61.field946 ? 2 : 1));
            this.field152 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field152.open();
            this.field152.start();
            this.field150 = arg0;
        } catch (LineUnavailableException var4) {
            if (class172.method1354(arg0, (byte) -128) == 1) {
                this.field152 = null;
                throw var4;
            } else {
                this.method116(class261.method1918(arg0, 22));
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 66)
    public static Class method120(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()I", line = 89)
    public final int method117() {
        return this.field150 - (this.field152.available() >> (class61.field946 ? 2 : 1));
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V", line = 101)
    public final void method118() throws LineUnavailableException {
        this.field152.flush();
        if (!this.field151) {
            return;
        }
        this.field152.close();
        this.field152 = null;
        Info var1 = new Info(field154 == null ? (field154 = method120("javax.sound.sampled.SourceDataLine")) : field154, this.field149, this.field150 << (class61.field946 ? 2 : 1));
        this.field152 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field152.open();
        this.field152.start();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 120)
    public final void method119(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field151 = true;
                    }
                }
            }
        }
        this.field149 = new AudioFormat((float) class294.field4571, 16, class61.field946 ? 2 : 1, true, false);
        this.field153 = new byte[0x100 << (class61.field946 ? 2 : 1)];
    }
}
