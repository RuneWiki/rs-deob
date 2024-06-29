import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class289 {

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Loe;")
    public static class127 field4380 = new class127(79, 12);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "[I")
    public static int[] field4381;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method1763(int arg0) {
        if (arg0 == 17859) {
            field4381 = null;
            field4380 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lta;II)V")
    public static final void method1764(class135 arg0, int arg1, int arg2) {
        field4375++;
        int var3 = -1;
        if (arg1 < 5) {
            return;
        }
        int var4 = 0;
        if (class369.field5424 < arg0.field2144) {
            class486.method2919(arg0, false);
        } else if (arg0.field2160 < class369.field5424) {
            class102.method757(false, 122, arg0);
            var4 = class265.field4014;
            var3 = class245.field3686;
        } else {
            class382.method2295(arg0, 128);
        }
        if (arg0.field3218 < 128 || arg0.field3222 < 128 || class150.field2422 * 128 - 128 <= arg0.field3218 || class21.field272 * 128 - 128 <= arg0.field3222) {
            arg0.field2160 = 0;
            var4 = 0;
            arg0.field2172 = -1;
            var3 = -1;
            arg0.field2144 = 0;
            arg0.field2170 = -1;
            arg0.field2174 = -1;
            arg0.field3218 = arg0.field2232[0] * 128 + arg0.method337(0) * 64;
            arg0.field3222 = arg0.field2239[0] * 128 + arg0.method337(0) * 64;
            arg0.method889((byte) -117);
        }
        if (class286.field4329 == arg0 && (arg0.field3218 < 1536 || arg0.field3222 < 1536 || arg0.field3218 >= ((class150.field2422 - 12) * 128) || (class21.field272 * 128 - 1536) <= arg0.field3222)) {
            arg0.field2160 = 0;
            arg0.field2174 = -1;
            arg0.field2144 = 0;
            var4 = 0;
            arg0.field2170 = -1;
            arg0.field2172 = -1;
            var3 = -1;
            arg0.field3218 = arg0.field2232[0] * 128 + arg0.method337(0) * 64;
            arg0.field3222 = arg0.field2239[0] * 128 + (arg0.method337(0) * 64);
            arg0.method889((byte) -79);
        }
        int var5 = class244.method1462(arg0, false);
        class451.method2687(var5, var3, arg0, 0, var4);
        class262.method1597(0, arg0);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIB)I")
    public static final int method1765(int arg0, int arg1, int arg2, byte arg3) {
        field4376++;
        int var4 = arg1 / arg0;
        int var5 = arg1 & arg0 - 1;
        int var6 = arg2 / arg0;
        int var7 = arg0 - 1 & arg2;
        int var8 = class362.method2199(var4, var6, false);
        int var9 = class362.method2199(var4 + 1, var6, false);
        int var10 = class362.method2199(var4, var6 + 1, false);
        int var11 = class362.method2199(var4 + 1, var6 + 1, false);
        if (arg3 != 11) {
            method1764(null, 23, 70);
        }
        int var12 = class129.method869(var5, arg0, var9, false, var8);
        int var13 = class129.method869(var5, arg0, var11, false, var10);
        return class129.method869(var7, arg0, var13, false, var12);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V")
    public static final void method1766(byte arg0, int arg1) {
        field4379++;
        if (arg0 > -101) {
            method1764(null, 56, -67);
        }
        class64 var2 = class230.method1387(arg1, (byte) 40, 12);
        var2.method446(-20033);
    }
}
