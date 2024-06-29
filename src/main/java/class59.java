import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class59 extends class74 {

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
    private boolean field1027 = false;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1029;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1025;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1028;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "[B")
    private byte[] field1026;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
    public final int method428() {
        return this.field1024 - (this.field1028.available() >> (class22.field380 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
    public final void method429() {
        if (this.field1028 != null) {
            this.field1028.close();
            this.field1028 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()V")
    public final void method430() {
        int var1 = 256;
        if (class22.field380) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1281[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1026[var2 * 2] = (byte) (var3 >> 8);
            this.field1026[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1028.write(this.field1026, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()V")
    public final void method431() throws LineUnavailableException {
        this.field1028.flush();
        if (!this.field1027) {
            return;
        }
        this.field1028.close();
        this.field1028 = null;
        Info var1 = new Info(field1029 == null ? (field1029 = method434("javax.sound.sampled.SourceDataLine")) : field1029, this.field1025, this.field1024 << (class22.field380 ? 2 : 1));
        this.field1028 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1028.open();
        this.field1028.start();
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public final void method432(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1029 == null ? (field1029 = method434("javax.sound.sampled.SourceDataLine")) : field1029, this.field1025, arg0 << (class22.field380 ? 2 : 1));
            this.field1028 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1028.open();
            this.field1028.start();
            this.field1024 = arg0;
        } catch (LineUnavailableException var4) {
            if (class119.method921((byte) 107, arg0) == 1) {
                this.field1028 = null;
                throw var4;
            } else {
                this.method432(class82.method578(0, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method433(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1027 = true;
                    }
                }
            }
        }
        this.field1025 = new AudioFormat((float) class139.field2490, 16, class22.field380 ? 2 : 1, true, false);
        this.field1026 = new byte[0x100 << (class22.field380 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method434(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
