import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class272 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method1823(int arg0, int arg1) {
        field4224++;
        class211.field3148.method938(arg0, (byte) -123);
        if (arg1 != 12230) {
            field4225 = -128;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lbg;IIIII)V")
    public static final void method1824(class264 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class43.field771 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class117.field1761) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class137.field1992 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class201 var14 = class3.field40[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class166.field2451[var11][var12 + 1][var13] + class166.field2451[var11][var12][var13] + class166.field2451[var11][var12][var13 + 1] + class166.field2451[var11][var12 + 1][var13 + 1]) / 4 - (class166.field2451[arg1][arg2 + 1][arg3] + class166.field2451[arg1][arg2][arg3] + class166.field2451[arg1][arg2][arg3 + 1] + class166.field2451[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class176 var16 = var14.field3024;
                                    if (var16 != null) {
                                        if (var16.field2575.method1494()) {
                                            arg0.method1492(var16.field2575, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2580 != null && var16.field2580.method1494()) {
                                            arg0.method1492(var16.field2580, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3026; var17++) {
                                        class128 var18 = var14.field3037[var17];
                                        if (var18 != null && var18.field1874.method1494() && (var18.field1882 == var12 || var7 == var12) && (var18.field1870 == var13 || var9 == var13)) {
                                            int var19 = var18.field1879 + 1 - var18.field1882;
                                            int var20 = var18.field1876 + 1 - var18.field1870;
                                            arg0.method1492(var18.field1874, (var18.field1882 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1870 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
