import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class104 extends class257 {

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "Z")
    private boolean field1414 = false;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1419;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1415;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1418;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[B")
    private byte[] field1416;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 12)
    public final void method763(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1419 == null ? (field1419 = method769("javax.sound.sampled.SourceDataLine")) : field1419, this.field1415, arg0 << (class10.field93 ? 2 : 1));
            this.field1418 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1418.open();
            this.field1418.start();
            this.field1417 = arg0;
        } catch (LineUnavailableException var4) {
            if (class197.method1391(arg0, (byte) 101) == 1) {
                this.field1418 = null;
                throw var4;
            } else {
                this.method763(class110.method804(arg0, (byte) 72));
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method769(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()V", line = 34)
    public final void method764() throws LineUnavailableException {
        this.field1418.flush();
        if (!this.field1414) {
            return;
        }
        this.field1418.close();
        this.field1418 = null;
        Info var1 = new Info(field1419 == null ? (field1419 = method769("javax.sound.sampled.SourceDataLine")) : field1419, this.field1415, this.field1417 << (class10.field93 ? 2 : 1));
        this.field1418 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1418.open();
        this.field1418.start();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 55)
    public final void method765(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1414 = true;
                    }
                }
            }
        }
        this.field1415 = new AudioFormat((float) class273.field4085, 16, class10.field93 ? 2 : 1, true, false);
        this.field1416 = new byte[0x100 << (class10.field93 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()V", line = 97)
    public final void method766() {
        int var1 = 256;
        if (class10.field93) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3775[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1416[var2 * 2] = (byte) (var3 >> 8);
            this.field1416[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1418.write(this.field1416, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V", line = 130)
    public final void method767() {
        if (this.field1418 != null) {
            this.field1418.close();
            this.field1418 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()I", line = 147)
    public final int method768() {
        return this.field1417 - (this.field1418.available() >> (class10.field93 ? 2 : 1));
    }
}
