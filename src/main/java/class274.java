import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class274 extends class276 {

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4391 = "K";

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "Lrc;")
    public static class9 field4390 = new class9(64);

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "Lrc;")
    public static class9 field4392 = new class9(30);

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "[I")
    public static int[] field4393 = new int[200];

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
    public static void method1799(int arg0) {
        field4393 = null;
        field4390 = null;
        if (arg0 != -19948) {
            method1799(-124);
        }
        field4391 = null;
        field4392 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIILtb;IZJ)Z")
    public static final boolean method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class184 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class95.field1642 == class31.field464;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class191.field3084 || var24 >= class277.field4439) {
                    return false;
                }
                class109 var25 = class79.field1367[arg0][var15][var24];
                if (var25 != null && var25.field1968 >= 5) {
                    return false;
                }
            }
        }
        class173 var16 = new class173();
        var16.field2850 = arg11;
        var16.field2838 = arg0;
        var16.field2846 = arg5;
        var16.field2845 = arg6;
        var16.field2835 = arg7;
        var16.field2842 = arg8;
        var16.field2847 = arg9;
        var16.field2840 = arg1;
        var16.field2839 = arg2;
        var16.field2855 = arg1 + arg3 - 1;
        var16.field2843 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class79.field1367[var22][var17][var20] == null) {
                        class79.field1367[var22][var17][var20] = new class109(var22, var17, var20);
                    }
                }
                class109 var23 = class79.field1367[arg0][var17][var20];
                var23.field1961[var23.field1968] = var16;
                var23.field1979[var23.field1968] = var21;
                var23.field1975 |= var21;
                ++var23.field1968;
                if (var13 && class171.field2818[var17][var20] != 0) {
                    var14 = class171.field2818[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class171.field2818[var18][var19] == 0) {
                        class171.field2818[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class89.field1579[class211.field3561++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field4389;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            class235.method1560(var3, 0, class53.field929, class206.field3389[arg1]);
        }
        if (arg0 < 39) {
            method1800(-21, 112, -88, 51, -120, 107, 8, 101, (class184) null, -38, true, -18L);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class274() {
        super(0, true);
    }
}
