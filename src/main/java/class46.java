import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class46 extends class100 {

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Z")
    private boolean field1019 = false;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1021;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1017;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1016;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "[B")
    private byte[] field1020;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public final void method382(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1021 == null ? (field1021 = method388("javax.sound.sampled.SourceDataLine")) : field1021, this.field1017, arg0 << (class51.field1080 ? 2 : 1));
            this.field1016 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1016.open();
            this.field1016.start();
            this.field1018 = arg0;
        } catch (LineUnavailableException var4) {
            if (class143.method989((byte) -120, arg0) == 1) {
                this.field1016 = null;
                throw var4;
            } else {
                this.method382(class98.method651(arg0, (byte) -106));
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()V")
    public final void method383() {
        int var1 = 256;
        if (class51.field1080) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1767[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1020[var2 * 2] = (byte) (var3 >> 8);
            this.field1020[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1016.write(this.field1020, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
    public final void method384() {
        if (this.field1016 != null) {
            this.field1016.close();
            this.field1016 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()I")
    public final int method385() {
        return this.field1018 - (this.field1016.available() >> (class51.field1080 ? 2 : 1));
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
    public final void method386() throws LineUnavailableException {
        this.field1016.flush();
        if (!this.field1019) {
            return;
        }
        this.field1016.close();
        this.field1016 = null;
        Info var1 = new Info(field1021 == null ? (field1021 = method388("javax.sound.sampled.SourceDataLine")) : field1021, this.field1017, this.field1018 << (class51.field1080 ? 2 : 1));
        this.field1016 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1016.open();
        this.field1016.start();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method387(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1019 = true;
                    }
                }
            }
        }
        this.field1017 = new AudioFormat((float) class125.field2242, 16, class51.field1080 ? 2 : 1, true, false);
        this.field1020 = new byte[0x100 << (class51.field1080 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method388(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
