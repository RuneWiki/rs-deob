import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class18 extends class127 {

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Z")
    private boolean field219 = false;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field221;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field216;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field220;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "[B")
    private byte[] field218;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()I")
    public final int method107() {
        return this.field217 - (this.field220.available() >> (class152.field2211 ? 2 : 1));
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "()V")
    public final void method108() throws LineUnavailableException {
        this.field220.flush();
        if (!this.field219) {
            return;
        }
        this.field220.close();
        this.field220 = null;
        Info var1 = new Info(field221 == null ? (field221 = method113("javax.sound.sampled.SourceDataLine")) : field221, this.field216, this.field217 << (class152.field2211 ? 2 : 1));
        this.field220 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field220.open();
        this.field220.start();
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()V")
    public final void method109() {
        if (this.field220 != null) {
            this.field220.close();
            this.field220 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()V")
    public final void method110() {
        int var1 = 256;
        if (class152.field2211) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1813[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field218[var2 * 2] = (byte) (var3 >> 8);
            this.field218[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field220.write(this.field218, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method111(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field219 = true;
                    }
                }
            }
        }
        this.field216 = new AudioFormat((float) class50.field571, 16, class152.field2211 ? 2 : 1, true, false);
        this.field218 = new byte[0x100 << (class152.field2211 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public final void method112(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field221 == null ? (field221 = method113("javax.sound.sampled.SourceDataLine")) : field221, this.field216, arg0 << (class152.field2211 ? 2 : 1));
            this.field220 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field220.open();
            this.field220.start();
            this.field217 = arg0;
        } catch (LineUnavailableException var4) {
            if (class141.method917((byte) 118, arg0) == 1) {
                this.field220 = null;
                throw var4;
            } else {
                this.method112(class72.method450(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method113(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
