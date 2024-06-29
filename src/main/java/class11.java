import java.awt.Frame;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "[B")
    private byte[] field180 = new byte[4];

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lcc;")
    private class18 field192;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "J")
    private long field190;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "J")
    public static long field182 = 0L;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[I")
    public static int[] field188 = new int[128];

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lec;")
    public static class32 field183 = class73.method594("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", true);

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lec;")
    public static class32 field186 = class73.method594("Die Verbindung konnte", true);

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
    public static int[] field191 = new int[32];

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lwd;")
    public static class157 field176 = new class157();

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field194 = 1;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lcc;")
    public static class18 field174;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field184;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field178;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Z")
    public static boolean field193;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[B")
    private byte[] field177;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
    public static final int method62(int arg0, int arg1, int arg2) {
        field179++;
        int var3 = class97.method753(arg0 - 1, arg2 + -121, arg1 - 1) + class97.method753(arg0 - 1, arg2 + -121, arg1 + 1) + class97.method753(arg0 + 1, arg2 + -92, arg1 + -1) + class97.method753(arg0 + 1, -127, arg1 + 1);
        int var4 = class97.method753(arg0, -124, arg1 + arg2) + class97.method753(arg0, -115, arg1 + 1) + class97.method753(arg0 - 1, -81, arg1) + class97.method753(arg0 + 1, -84, arg1);
        int var5 = class97.method753(arg0, arg2 ^ 0x61, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)[B")
    public final byte[] method63(boolean arg0) throws IOException {
        field175++;
        if (this.field190 < class52.method408((byte) -79)) {
            throw new IOException("fdt");
        }
        if (this.field181 == 0) {
            if (this.field192.field355 == 2) {
                throw new IOException("fds");
            }
            if (this.field192.field355 == 1) {
                this.field181 = 1;
                this.field178 = (DataInputStream) this.field192.field352;
            }
        }
        if (this.field181 == 1) {
            int var2 = this.field178.available();
            if (var2 > 0) {
                if (this.field172 + var2 > 4) {
                    var2 = 4 - this.field172;
                }
                this.field172 += this.field178.read(this.field180, this.field172, var2);
                if (this.field172 == 4) {
                    int var3 = (new class66(this.field180)).method539(true);
                    this.field177 = new byte[var3];
                    this.field181 = 2;
                }
            }
        }
        if (this.field181 == 2) {
            int var4 = this.field178.available();
            if (var4 > 0) {
                if (this.field177.length < this.field171 + var4) {
                    var4 = this.field177.length - this.field171;
                }
                this.field171 += this.field178.read(this.field177, this.field171, var4);
                if (this.field177.length == this.field171) {
                    return this.field177;
                }
            }
        }
        if (arg0) {
            method62(-79, 104, 93);
        }
        return null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method64(int arg0) {
        int var1 = -59 / ((26 - arg0) / 39);
        field186 = null;
        field176 = null;
        field191 = null;
        field188 = null;
        field174 = null;
        field184 = null;
        field183 = null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ldc;Ljava/net/URL;)V")
    public class11(class25 arg0, URL arg1) {
        this.field192 = arg0.method178((byte) 45, arg1);
        this.field181 = 0;
        this.field190 = class52.method408((byte) -125) + 30000L;
    }
}
