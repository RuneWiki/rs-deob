import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class414 extends class75 {

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "Z")
    private boolean field6293 = false;

    @OriginalMember(owner = "client!fs", name = "R", descriptor = "I")
    private int field6297;

    @OriginalMember(owner = "client!fs", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field6298;

    @OriginalMember(owner = "client!fs", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field6296;

    @OriginalMember(owner = "client!fs", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field6294;

    @OriginalMember(owner = "client!fs", name = "P", descriptor = "[B")
    private byte[] field6295;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "()V")
    public final void method538() throws LineUnavailableException {
        this.field6294.flush();
        if (!this.field6293) {
            return;
        }
        this.field6294.close();
        this.field6294 = null;
        Info var1 = new Info(field6298 == null ? (field6298 = method2560("javax.sound.sampled.SourceDataLine")) : field6298, this.field6296, this.field6297 << (class175.field2777 ? 2 : 1));
        this.field6294 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field6294.open();
        this.field6294.start();
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "()V")
    public final void method531() {
        int var1 = 256;
        if (class175.field2777) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1280[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field6295[var2 * 2] = (byte) (var3 >> 8);
            this.field6295[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field6294.write(this.field6295, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "()V")
    public final void method543() {
        if (this.field6294 != null) {
            this.field6294.close();
            this.field6294 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
    public final int method526() {
        return this.field6297 - (this.field6294.available() >> (class175.field2777 ? 2 : 1));
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method530(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field6293 = true;
                    }
                }
            }
        }
        this.field6296 = new AudioFormat((float) class12.field141, 16, class175.field2777 ? 2 : 1, true, false);
        this.field6295 = new byte[0x100 << (class175.field2777 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method525(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6298 == null ? (field6298 = method2560("javax.sound.sampled.SourceDataLine")) : field6298, this.field6296, arg0 << (class175.field2777 ? 2 : 1));
            this.field6294 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field6294.open();
            this.field6294.start();
            this.field6297 = arg0;
        } catch (LineUnavailableException var4) {
            if (class123.method973(-117, arg0) == 1) {
                this.field6294 = null;
                throw var4;
            } else {
                this.method525(class206.method1351(arg0, 123));
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2560(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
