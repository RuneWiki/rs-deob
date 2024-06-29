import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[B")
    private byte[] field843 = new byte[4];

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Loc;")
    private class100 field854;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "J")
    private long field852;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Lwd;")
    private static class150 field856 = class2.method9(true, "Enter amount:");

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lwd;")
    public static class150 field844 = field856;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field851 = Calendar.getInstance();

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lwd;")
    public static class150 field858 = class2.method9(true, "Weiter");

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lwd;")
    public static class150 field861 = class2.method9(true, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lwd;")
    public static class150 field862 = class2.method9(true, "http:)4)4");

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lwd;")
    private static class150 field859 = class2.method9(true, "Continue");

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Lwd;")
    public static class150 field867 = class2.method9(true, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lwd;")
    private static class150 field860 = class2.method9(true, "Remove");

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lwd;")
    private static class150 field868 = class2.method9(true, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Lwd;")
    public static class150 field865 = field860;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lwd;")
    public static class150 field866 = field859;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lwd;")
    public static class150 field869 = field868;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Lpb;")
    public static class106 field863;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field849;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[B")
    private byte[] field847;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
    public static final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field842++;
        int var7 = 2048 - arg3 & 0x7FF;
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = arg0;
        int var10 = 0;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class60.field1523[var7];
            int var13 = class60.field1515[var7];
            int var14 = var11 * var13 - arg0 * var12 >> 16;
            var9 = arg0 * var13 + var11 * var12 >> 16;
            var11 = var14;
        }
        if (var8 != 0) {
            int var15 = class60.field1515[var8];
            int var16 = class60.field1523[var8];
            int var17 = var9 * var16 + var10 * var15 >> 16;
            var9 = var9 * var15 - var10 * var16 >> 16;
            var10 = var17;
        }
        class95.field2199 = arg2;
        class46.field1248 = arg6 - var9;
        class130.field3061 = arg1 - var11;
        class61.field1591 = arg5 - var10;
        int var18 = 11 % ((arg4 + 49) / 46);
        class97.field2230 = arg3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILva;ILva;)Lva;")
    public static final class141 method236(int arg0, int arg1, class141 arg2, int arg3, class141 arg4) {
        if (arg3 != -31145) {
            field863 = null;
        }
        field850++;
        class141 var5 = class135.method1011(arg3 ^ 0x79BA, 0, arg0, arg2, 0, class58.field1500[arg4.field3323 >> 16], arg4.field3326, 0, arg4.field3323, 0, arg4.field3321, arg1);
        if (var5 == null) {
            if (arg4.field3367 != null) {
                var5 = class135.method1011(-19, 0, arg0, arg2, 0, arg4.field3367, arg4.field3326, 0, arg4.field3323, 0, arg4.field3321, arg1);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)[B")
    public final byte[] method237(int arg0) throws IOException {
        field855++;
        if (arg0 <= 126) {
            field865 = null;
        }
        if (class55.method430(0) > this.field852) {
            throw new IOException("fdt");
        }
        if (this.field846 == 0) {
            if (this.field854.field2281 == 2) {
                throw new IOException("fds");
            }
            if (this.field854.field2281 == 1) {
                this.field846 = 1;
                this.field849 = (DataInputStream) this.field854.field2282;
            }
        }
        if (this.field846 == 1) {
            int var2 = this.field849.available();
            if (var2 > 0) {
                if (this.field845 + var2 > 4) {
                    var2 = 4 - this.field845;
                }
                this.field845 += this.field849.read(this.field843, this.field845, var2);
                if (this.field845 == 4) {
                    int var3 = (new class148(this.field843)).method1104(true);
                    this.field847 = new byte[var3];
                    this.field846 = 2;
                }
            }
        }
        if (this.field846 == 2) {
            int var4 = this.field849.available();
            if (var4 > 0) {
                if (this.field853 + var4 > this.field847.length) {
                    var4 = this.field847.length - this.field853;
                }
                this.field853 += this.field849.read(this.field847, this.field853, var4);
                if (this.field847.length == this.field853) {
                    return this.field847;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method238(int arg0) {
        field862 = null;
        field867 = null;
        field860 = null;
        field868 = null;
        field865 = null;
        field858 = null;
        field844 = null;
        field859 = null;
        field866 = null;
        field863 = null;
        field851 = null;
        field856 = null;
        field869 = null;
        field861 = null;
        if (arg0 != 4) {
            method238(-103);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lue;Ljava/net/URL;)V")
    public class28(class139 arg0, URL arg1) {
        this.field854 = arg0.method1030(-11251, arg1);
        this.field846 = 0;
        this.field852 = class55.method430(0) + 30000L;
    }
}
