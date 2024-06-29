import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class83 extends class184 {

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "J")
    public long field1292;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Lsf;")
    public static class108 field1277 = class140.method973(255, "Hidden)2use");

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Lsf;")
    private static class108 field1284 = class140.method973(255, "Feb");

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lsf;")
    private static class108 field1279 = class140.method973(255, "Apr");

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Lsf;")
    private static class108 field1281 = class140.method973(255, "Nov");

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "Lsf;")
    private static class108 field1291 = class140.method973(255, "Aug");

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Lsf;")
    private static class108 field1289 = class140.method973(255, "Sep");

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "Lsf;")
    private static class108 field1294 = class140.method973(255, "Mar");

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field1298 = 0;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "Lsf;")
    public static class108 field1283 = class140.method973(255, "Utiliser");

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "[I")
    public static int[] field1287 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Lsf;")
    private static class108 field1296 = class140.method973(255, "May");

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "[[I")
    public static int[][] field1280 = new int[104][104];

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "Lsf;")
    private static class108 field1295 = class140.method973(255, "Jul");

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "Lsf;")
    private static class108 field1303 = class140.method973(255, "Oct");

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "Lsf;")
    private static class108 field1305 = class140.method973(255, "Jun");

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "Lsf;")
    private static class108 field1302 = class140.method973(255, "Jan");

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "Lsf;")
    private static class108 field1306 = class140.method973(255, "Dec");

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "[Lsf;")
    public static class108[] field1282 = new class108[] { field1302, field1284, field1294, field1279, field1296, field1305, field1295, field1291, field1289, field1303, field1281, field1306 };

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "Lsf;")
    public static class108 field1286;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "Z")
    public static boolean field1299;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZ)V", line = 15)
    public static final void method555(byte arg0, boolean arg1) {
        int var2 = -63 % ((arg0 + 52) / 35);
        for (int var3 = 0; var3 < class61.field969; var3++) {
            class45 var4 = class159.field2863[class168.field3020[var3]];
            long var5 = (long) class168.field3020[var3] << 32 | 0x20000000L;
            if (var4 != null && var4.method319(true) && arg1 == var4.field646.field2365 && var4.field646.method930(-31946)) {
                int var7 = var4.field4452 >> 7;
                int var8 = var4.field4457 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.method363((byte) 47) == 1 && (var4.field4452 & 0x7F) == 64 && (var4.field4457 & 0x7F) == 64) {
                        if (class160.field2882[var7][var8] == class278.field4886) {
                            continue;
                        }
                        class160.field2882[var7][var8] = class278.field4886;
                    }
                    if (!var4.field646.field2373) {
                        var5 |= Long.MIN_VALUE;
                    }
                    var4.field4464 = class45.method321(120, var4.field4457, var4.field4452, class295.field5159);
                    class146.method1018(class295.field5159, var4.field4452, var4.field4457, var4.field4464, (var4.method363((byte) -33) * 64 - 64) + 60, var4, var4.field4518, var5, var4.field4479);
                }
            }
        }
        field1301++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JI)V", line = 75)
    public static final void method556(long arg0, int arg1) {
        field1290++;
        if (arg1 <= 120 || arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class262.method1883(-16, arg0 - 1L);
            class262.method1883(-57, 1L);
        } else {
            class262.method1883(-27, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lik;IIB)[Lvd;", line = 107)
    public static final class135[] method557(class262 arg0, int arg1, int arg2, byte arg3) {
        int var4 = 28 % ((arg3 + 19) / 36);
        field1276++;
        return class167.method1166(arg0, arg2, (byte) 109, arg1) ? class283.method2036(-75) : null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 125)
    public class83() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(J)V", line = 165)
    public class83(long arg0) {
        this.field1292 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 175)
    public static void method558(int arg0) {
        field1289 = null;
        field1280 = (int[][]) null;
        field1283 = null;
        field1281 = null;
        field1305 = null;
        field1287 = null;
        field1277 = null;
        if (arg0 != -5133) {
            field1281 = (class108) null;
        }
        field1306 = null;
        field1296 = null;
        field1294 = null;
        field1282 = null;
        field1291 = null;
        field1279 = null;
        field1284 = null;
        field1295 = null;
        field1302 = null;
        field1303 = null;
        field1286 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIIB)V", line = 203)
    public static final void method559(boolean arg0, int arg1, int arg2, byte arg3) {
        field1300++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class210.field3755 = arg1;
        class10.field126 = arg0;
        int var4 = 120 % ((-arg3 - 54) / 34);
        class182.field3335 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILik;)[Lwf;", line = 227)
    public static final class59[] method560(int arg0, int arg1, int arg2, class262 arg3) {
        field1297++;
        if (class167.method1166(arg3, arg1, (byte) -58, arg0)) {
            return arg2 >= -101 ? (class59[]) null : class220.method1512(0);
        } else {
            return null;
        }
    }
}
