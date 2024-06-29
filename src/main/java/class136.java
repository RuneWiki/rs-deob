import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class136 extends class157 {

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    private int field2211;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field2213;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    private int field2210;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2216 = "Connecting to update server";

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field2218 = -1;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Z")
    public static boolean field2219 = false;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lpk;")
    public static class120 field2209;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Ltk;")
    public static class266 field2208;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "Lsj;")
    public static class62 field2220;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[Loi;")
    public static class335[] field2221;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 5)
    public static final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class106 var20 = new class106(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class34.field521[var21][arg1][arg2] == null) {
                    class34.field521[var21][arg1][arg2] = new class42(var21, arg1, arg2);
                }
            }
            class34.field521[arg0][arg1][arg2].field674 = var20;
        } else if (arg3 == 1) {
            class106 var22 = new class106(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class34.field521[var23][arg1][arg2] == null) {
                    class34.field521[var23][arg1][arg2] = new class42(var23, arg1, arg2);
                }
            }
            class34.field521[arg0][arg1][arg2].field674 = var22;
        } else {
            class127 var24 = new class127(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class34.field521[var25][arg1][arg2] == null) {
                    class34.field521[var25][arg1][arg2] = new class42(var25, arg1, arg2);
                }
            }
            class34.field521[arg0][arg1][arg2].field669 = var24;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 54)
    public static final void method1051(boolean arg0) {
        field2212++;
        int var1 = class146.field2392.method1468(class307.field4872);
        for (int var2 = 0; var2 < class137.field2225; var2++) {
            int var3 = class146.field2392.method1468(class71.method574(88, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class137.field2225 * 15 + 21;
        int var5 = class95.field1535 - (var1 / 2);
        if (class211.field3314 < (var1 + var5)) {
            var5 = class211.field3314 - var1;
        }
        int var6 = class146.field2394;
        if ((var6 + var4) > class338.field5219) {
            var6 = class338.field5219 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (!arg0) {
            method1050(-88, 121, 72, 60, -92, 62, -98, 110, -88, 39, -68, -75, 111, -55, -96, -46, -113, 69, 90, 95);
        }
        if (class4.field109 == 1) {
            if (class95.field1535 == class101.field1633 && class207.field3271 == class146.field2394) {
                class326.field5096 = class137.field2225 * 15 + (class183.field2908 ? 26 : 22);
                class37.field554 = var5;
                class99.field1591 = var1;
                class260.field3858 = true;
                class315.field4968 = var6;
                class4.field109 = 0;
            }
        } else if (class95.field1535 == class170.field2740 && class243.field3639 == class146.field2394) {
            class315.field4968 = var6;
            class260.field3858 = true;
            class326.field5096 = class137.field2225 * 15 + (class183.field2908 ? 26 : 22);
            class99.field1591 = var1;
            class4.field109 = 0;
            class37.field554 = var5;
        } else {
            class207.field3271 = class243.field3639;
            class101.field1633 = class170.field2740;
            class4.field109 = 1;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)V", line = 147)
    public final void method142(int arg0, int arg1, int arg2) {
        int var4 = this.field2211 * arg2 >> 12;
        field2215++;
        int var5 = this.field2210 * arg2 >> 12;
        int var6 = this.field2213 * arg0 >> 12;
        int var7 = this.field2217 * arg0 >> 12;
        if (arg1 != -1) {
            field2220 = (class62) null;
        }
        class9.method149(false, var7, var5, this.field2570, var4, var6);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V", line = 168)
    public final void method141(int arg0, int arg1, int arg2) {
        field2214++;
        int var4 = this.field2211 * arg0 >> 12;
        int var5 = 32 / ((-arg1 - 24) / 60);
        int var6 = this.field2210 * arg0 >> 12;
        int var7 = this.field2217 * arg2 >> 12;
        int var8 = this.field2213 * arg2 >> 12;
        class213.method1546(var6, var7, 29547, this.field2574, var8, var4, this.field2573);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 188)
    public static void method1052(int arg0) {
        if (arg0 != 18098) {
            method1050(46, 28, 69, -101, -87, 78, -82, 102, -94, -112, 115, -10, -98, -75, 97, -93, 70, 87, 121, -48);
        }
        field2220 = null;
        field2209 = null;
        field2208 = null;
        field2216 = null;
        field2221 = null;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(III)V", line = 207)
    public final void method144(int arg0, int arg1, int arg2) {
        int var4 = this.field2211 * arg0 >> 12;
        if (arg1 != 1) {
            method1051(false);
        }
        int var5 = this.field2210 * arg0 >> 12;
        field2207++;
        int var6 = this.field2213 * arg2 >> 12;
        int var7 = this.field2217 * arg2 >> 12;
        class87.method686(this.field2570, var7, var5, this.field2574, this.field2573, var6, var4, (byte) -47);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIII)V", line = 238)
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2211 = arg0;
        this.field2217 = arg3;
        this.field2213 = arg1;
        this.field2210 = arg2;
    }
}
