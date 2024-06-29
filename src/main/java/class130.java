import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class130 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lke;")
    public static class256 field2270 = class316.method2202(")3)3)3", 27626);

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2274 = 0;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lke;")
    private static class256 field2272 = class316.method2202("Please wait )2 attempting to reestablish)3", 27626);

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lke;")
    public static class256 field2277 = field2272;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[Lke;")
    public static class256[] field2271 = new class256[500];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[I")
    public static int[] field2273;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIB)V", line = 13)
    public static final void method888(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class308.field5322.field738 = 0;
        field2275++;
        class308.field5322.method308(7, -2);
        if (arg4 > -108) {
            return;
        }
        class308.field5322.method308(arg1, -2);
        class308.field5322.method308(arg2, -2);
        class308.field5322.method366(arg3, -112);
        class308.field5322.method366(arg0, -98);
        class114.field2010 = 0;
        class54.field1000 = 1;
        class168.field2990 = -3;
        class42.field805 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)Z", line = 41)
    public static final boolean method889(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class135.field2355 * arg0 + class119.field2113 * arg3 >> 16;
        int var6 = class135.field2355 * arg3 - class119.field2113 * arg0 >> 16;
        int var7 = class93.field1680 * arg1 + class255.field4374 * var6 >> 16;
        int var8 = class255.field4374 * arg1 - class93.field1680 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class93.field1680 * arg2 + class255.field4374 * var6 >> 16;
        int var12 = class255.field4374 * arg2 - class93.field1680 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class105.field1885 && var13 < class105.field1885) {
            return false;
        } else if (var9 > class91.field1667 && var13 > class91.field1667) {
            return false;
        } else if (var10 < class295.field5122 && var14 < class295.field5122) {
            return false;
        } else {
            return var10 <= class49.field890 || var14 <= class49.field890;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 96)
    public static void method890(byte arg0) {
        field2277 = null;
        if (arg0 > -116) {
            method891(-34, -26);
        }
        field2271 = null;
        field2273 = null;
        field2272 = null;
        field2270 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I", line = 116)
    public static final int method891(int arg0, int arg1) {
        if (arg0 != 11545) {
            field2273 = (int[]) null;
        }
        field2269++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 130)
    public static final void method892(int arg0) {
        class201.field3664 = arg0;
        for (int var1 = 0; var1 < class129.field2264; var1++) {
            for (int var2 = 0; var2 < class57.field1051; var2++) {
                if (class41.field790[arg0][var1][var2] == null) {
                    class41.field790[arg0][var1][var2] = new class271(arg0, var1, var2);
                }
            }
        }
    }
}
