import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[B")
    private byte[] field128 = new byte[4];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lea;")
    private class42 field120;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "J")
    private long field129;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lrf;")
    public static class163 field122 = class53.method392(-77, "scrollbar");

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lrf;")
    private static class163 field127 = class53.method392(-126, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lrf;")
    public static class163 field134 = null;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lrf;")
    public static class163 field126 = field127;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lrh;")
    public static class165 field121;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field130;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[B")
    private byte[] field133;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method55(int arg0) {
        field127 = null;
        field121 = null;
        field126 = null;
        field134 = null;
        field122 = null;
        if (arg0 != 4) {
            method55(-92);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)[B")
    public final byte[] method56(int arg0) throws IOException {
        field131++;
        if (class155.method994(90) > this.field129) {
            throw new IOException("fdt");
        }
        if (arg0 <= 116) {
            field127 = null;
        }
        if (this.field123 == 0) {
            if (this.field120.field855 == 2) {
                throw new IOException("fds");
            }
            if (this.field120.field855 == 1) {
                this.field130 = (DataInputStream) this.field120.field854;
                this.field123 = 1;
            }
        }
        if (this.field123 == 1) {
            int var2 = this.field130.available();
            if (var2 > 0) {
                if (this.field118 + var2 > 4) {
                    var2 = 4 - this.field118;
                }
                this.field118 += this.field130.read(this.field128, this.field118, var2);
                if (this.field118 == 4) {
                    int var3 = (new class52(this.field128)).method383(18);
                    this.field123 = 2;
                    this.field133 = new byte[var3];
                }
            }
        }
        if (this.field123 == 2) {
            int var4 = this.field130.available();
            if (var4 > 0) {
                if (this.field124 + var4 > this.field133.length) {
                    var4 = this.field133.length - this.field124;
                }
                this.field124 += this.field130.read(this.field133, this.field124, var4);
                if (this.field133.length == this.field124) {
                    return this.field133;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([[IZ)V")
    public static final void method57(int[][] arg0, boolean arg1) {
        if (arg1) {
            method59(53, -95, 28, 52, -13, 36, null, -119, 8L);
        }
        field119++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)J")
    public static final long method58(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        return var3 == null || var3.field2345 == null ? 0L : var3.field2345.field1520;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIILs;IJ)Z")
    public static final boolean method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class166 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class100.method683(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lgg;Ljava/net/URL;)V")
    public class6(class67 arg0, URL arg1) {
        this.field120 = arg0.method474(arg1, 99);
        this.field123 = 0;
        this.field129 = class155.method994(104) + 30000L;
    }
}
