import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class16 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ls;")
    public static class261 field225 = new class261();

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/lang/String;")
    public static String field228 = "flash2:";

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/lang/String;")
    public static String field229 = "Continue";

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lec;")
    public static class25 field227 = new class25(16);

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field232 = new String[1000];

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/lang/String;")
    public static String field231 = "K";

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field223;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILcl;IIIILtd;ILbl;)V")
    public static final void method103(int arg0, class208 arg1, int arg2, int arg3, int arg4, int arg5, class74 arg6, int arg7, class35 arg8) {
        class145 var9 = new class145();
        field226++;
        var9.field2285 = arg2 * arg7;
        var9.field2277 = arg4 * 128;
        var9.field2282 = arg3;
        if (arg6 != null) {
            var9.field2270 = arg6.field1134;
            var9.field2283 = arg6;
            var9.field2294 = arg6.field1100;
            int var10 = arg6.field1151;
            var9.field2271 = arg6.field1126 * 128;
            int var11 = arg6.field1169;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg6.field1151;
                var10 = arg6.field1169;
            }
            var9.field2279 = arg6.field1177;
            var9.field2287 = arg6.field1110;
            var9.field2273 = arg6.field1135;
            var9.field2268 = (arg2 + var11) * 128;
            var9.field2288 = (arg4 + var10) * 128;
            if (arg6.field1149 != null) {
                var9.field2272 = true;
                var9.method973(arg7 ^ 0x80);
            }
            if (var9.field2294 != null) {
                var9.field2284 = var9.field2273 + (int) (Math.random() * (double) (var9.field2270 - var9.field2273));
            }
            class226.field3589.method1952(var9, 76);
        } else if (arg8 != null) {
            var9.field2281 = arg8;
            class106 var12 = arg8.field442;
            if (var12.field1630 != null) {
                var9.field2272 = true;
                var12 = var12.method685(arg7 - 129);
            }
            if (var12 != null) {
                var9.field2288 = (var12.field1591 + arg4) * 128;
                var9.field2268 = (arg2 + var12.field1591) * 128;
                var9.field2279 = class79.method527(arg8, (byte) -124);
                var9.field2287 = var12.field1628;
                var9.field2271 = var12.field1608 * 128;
            }
            class66.field976.method1952(var9, 76);
        } else if (arg1 != null) {
            var9.field2274 = arg1;
            var9.field2268 = (arg1.method362(25892) + arg2) * 128;
            var9.field2288 = (arg1.method362(25892) + arg4) * 128;
            var9.field2279 = class74.method484(arg1, -11443);
            var9.field2271 = arg1.field3311 * 128;
            var9.field2287 = arg1.field3316;
            class89.field1371.method857(false, var9, (long) arg5);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BLma;B)V")
    public final void method104(byte[] arg0, class202 arg1, byte arg2) {
        field224++;
        if (arg1.field3234[arg1.field3272] != 31 || arg1.field3234[arg1.field3272 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field223 == null) {
            this.field223 = new Inflater(true);
        }
        try {
            this.field223.setInput(arg1.field3234, arg1.field3272 + 10, -arg1.field3272 + -10 + -8 + arg1.field3234.length);
            this.field223.inflate(arg0);
        } catch (Exception var4) {
            this.field223.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg2 > 76) {
            this.field223.reset();
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class16() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method105(byte arg0) {
        field227 = null;
        field228 = null;
        field225 = null;
        field232 = null;
        int var1 = -68 / ((-arg0 - 19) / 55);
        field231 = null;
        field229 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(III)V")
    private class16(int arg0, int arg1, int arg2) {
    }
}
