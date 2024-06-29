import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class203 extends class46 {

    @OriginalMember(owner = "client!se", name = "rb", descriptor = "[J")
    public static long[] field3217 = new long[200];

    @OriginalMember(owner = "client!se", name = "tb", descriptor = "Lck;")
    public static class119 field3219 = class298.method1987((byte) 52, "p11_full");

    @OriginalMember(owner = "client!se", name = "ub", descriptor = "Lck;")
    public static class119 field3220 = class298.method1987((byte) 38, "");

    @OriginalMember(owner = "client!se", name = "wb", descriptor = "Lck;")
    public static class119 field3222 = class298.method1987((byte) 63, "radeon");

    @OriginalMember(owner = "client!se", name = "ob", descriptor = "[Lck;")
    public static class119[] field3214 = new class119[100];

    @OriginalMember(owner = "client!se", name = "zb", descriptor = "Z")
    public static boolean field3225 = true;

    @OriginalMember(owner = "client!se", name = "yb", descriptor = "Lck;")
    public static class119 field3224 = class298.method1987((byte) 32, "Nehmen");

    @OriginalMember(owner = "client!se", name = "qb", descriptor = "Lck;")
    public static class119 field3216 = field3220;

    @OriginalMember(owner = "client!se", name = "nb", descriptor = "Z")
    public static boolean field3213 = false;

    @OriginalMember(owner = "client!se", name = "Bb", descriptor = "I")
    public static int field3227 = 500;

    @OriginalMember(owner = "client!se", name = "Ab", descriptor = "Lck;")
    public static class119 field3226 = field3220;

    @OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!se", name = "sb", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!se", name = "vb", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!se", name = "Cb", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!se", name = "xb", descriptor = "Lva;")
    public static class36 field3223;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V", line = 5)
    public static void method1284(int arg0) {
        field3216 = null;
        field3222 = null;
        field3220 = null;
        field3226 = null;
        field3219 = null;
        field3223 = null;
        field3214 = null;
        field3224 = null;
        field3217 = null;
        if (arg0 >= -27) {
            method1287(87, 14, 100, (class119) null);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[[I", line = 31)
    public final int[][] method9(byte arg0, int arg1) {
        int[][] var3 = this.field3126.method603(arg1, arg0 - 131);
        field3218++;
        if (arg0 != 3) {
            this.method9((byte) -50, -51);
        }
        if (this.field3126.field1372 && this.method348(14048)) {
            int[] var4 = var3[0];
            int var5 = arg1 % this.field672 * this.field672;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class157.field2504; var8++) {
                int var9 = this.field677[var8 % this.field669 + var5];
                var7[var8] = class19.method151(255, var9) << 4;
                var6[var8] = class19.method151(4080, var9 >> 4);
                var4[var8] = class19.method151(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILml;B)Lck;", line = 81)
    public static final class119 method1285(int arg0, class134 arg1, byte arg2) {
        field3212++;
        if (!class92.method630(arg0, client.method620(arg1), -54) && arg1.field2048 == null) {
            return null;
        } else if (arg1.field2103 == null || arg1.field2103.length <= arg0 || arg1.field2103[arg0] == null || arg1.field2103[arg0].method787((byte) 25).method776((byte) -69) == 0) {
            return class106.field1626 ? class170.method1074(new class119[] { class255.field4105, class234.method1506(arg0, (byte) -79) }, -92) : null;
        } else {
            int var3 = 39 % ((-arg2) / 59);
            return arg1.field2103[arg0];
        }
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V", line = 114)
    public static final void method1286(int arg0) {
        field3228++;
        class276.method1820(105, 5);
        class61.method450((byte) -116, 5);
        class243.method1584(5, (byte) 125);
        class78.method547(5, false);
        class293.method1947(true, 5);
        class88.method598(5, -21732);
        class19.method147(5, (byte) 124);
        class139.method917(5, false);
        class61.method454(5, 99);
        if (arg0 != -30537) {
            field3216 = (class119) null;
        }
        class88.method601(5, 107);
        class242.method1575(-71, 5);
        class265.method1743(5063219, 50);
        class84.method569(5, 99);
        class126.method845(-2, 5);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILck;)Z", line = 157)
    public static final boolean method1287(int arg0, int arg1, int arg2, class119 arg3) {
        field3215++;
        int var4 = arg2;
        if (arg0 != 16711680) {
            field3223 = (class36) null;
        }
        while (var4 < arg1 + arg2) {
            if (!class156.method993(arg3.method755((byte) -64, var4), (byte) -46)) {
                return false;
            }
            var4++;
        }
        return true;
    }
}
