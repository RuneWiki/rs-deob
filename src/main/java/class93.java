import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class93 extends class29 {

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1435 = "Allocated memory";

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1436 = "Close";

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field1433 = 0;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field1444 = 0;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field1430 = 0;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1441 = "Connected to update server";

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "[[[I")
    public static int[][][] field1443;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 11)
    public static void method669(int arg0) {
        field1435 = null;
        field1443 = (int[][][]) null;
        field1441 = null;
        if (arg0 <= -115) {
            field1436 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)V", line = 30)
    public static final void method670(byte arg0, int arg1, int arg2) {
        if (arg0 != 127) {
            return;
        }
        if (class276.field4376 != arg2) {
            class27.field396 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class27.field396[var3] = (var3 << 12) / arg2;
            }
            class74.field935 = arg2 * 32;
            class276.field4376 = arg2;
            class148.field2215 = arg2 - 1;
        }
        if (class294.field4619 != arg1) {
            if (class276.field4376 == arg1) {
                class130.field1921 = class27.field396;
            } else {
                class130.field1921 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class130.field1921[var4] = (var4 << 12) / arg1;
                }
            }
            class294.field4619 = arg1;
            class240.field3798 = arg1 - 1;
        }
        field1432++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBILde;II)V", line = 76)
    public static final void method671(int arg0, int arg1, byte arg2, int arg3, class68 arg4, int arg5, int arg6) {
        field1437++;
        long var7 = 0L;
        if (arg6 == 0) {
            var7 = class155.method1079(arg1, arg0, arg5);
        } else if (arg6 == 1) {
            var7 = class132.method894(arg1, arg0, arg5);
        } else if (arg6 == 2) {
            var7 = class98.method694(arg1, arg0, arg5);
        } else if (arg6 == 3) {
            var7 = class303.method2120(arg1, arg0, arg5);
        }
        boolean var9 = false;
        int var10 = (int) var7 >> 14 & 0x1F;
        boolean var11 = false;
        boolean var12 = true;
        int var13 = ((int) var7 & 0x371F83) >> 20;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class149 var15 = class291.method2043(var14, 23006);
        if (arg2 != -43) {
            field1444 = -98;
        }
        if (var15.method1054((byte) -42)) {
            class314.method2183((byte) 26, arg1, var15, arg5, arg0);
        }
        if (var7 == 0L) {
            return;
        }
        class232 var16 = null;
        class232 var17 = null;
        if (arg6 == 0) {
            class19 var21 = class31.method199(arg1, arg0, arg5);
            if (var21 != null) {
                var17 = var21.field259;
                var16 = var21.field272;
            }
            if (var15.field2257 != 0) {
                arg4.method446(var15.field2281, !var15.field2216, var13, arg0, 2, arg5, var10);
            }
        } else if (arg6 == 1) {
            class145 var18 = class194.method1426(arg1, arg0, arg5);
            if (var18 != null) {
                var16 = var18.field2166;
                var17 = var18.field2174;
            }
        } else if (arg6 == 2) {
            class271 var19 = class194.method1421(arg1, arg0, arg5);
            if (var19 != null) {
                var17 = var19.field4286;
            }
            if (var15.field2257 != 0 && var15.field2253 + arg0 < 104 && arg5 + var15.field2253 < 104 && (var15.field2278 + arg0) < 104 && arg5 + var15.field2278 < 104) {
                arg4.method445(var15.field2253, var15.field2278, (byte) 121, arg5, arg0, var15.field2281, !var15.field2216, var13);
            }
        } else if (arg6 == 3) {
            class49 var20 = class149.method1051(arg1, arg0, arg5);
            if (var20 != null) {
                var17 = var20.field667;
            }
            if (var15.field2257 == 1) {
                arg4.method447(arg0, arg5, false);
            }
        }
        if (var15.field2223 != null) {
            var15 = var15.method1052(true);
        }
        if (!class186.field2991 || var15 == null || !var15.field2267) {
            return;
        }
        if (var10 == 2) {
            if ((var17 instanceof class240)) {
                ((class240) var17).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, var10, var13 + 4, arg0, 0, true, 0);
            }
            if ((var16 instanceof class240)) {
                ((class240) var16).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, var10, var13 + 1 & 0x3, arg0, 0, true, 0);
            }
        } else if (var10 == 5) {
            if (var17 instanceof class240) {
                ((class240) var17).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, 4, var13, arg0, class201.field3296[var13] * 8, true, class71.field924[var13] * 8);
            }
        } else if (var10 == 6) {
            if ((var17 instanceof class240)) {
                ((class240) var17).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, 4, var13 + 4, arg0, class342.field5333[var13] * 8, true, class329.field5121[var13] * 8);
            }
        } else if (var10 == 7) {
            if ((var17 instanceof class240)) {
                ((class240) var17).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, 4, (var13 + 2 & 0x3) + 4, arg0, 0, true, 0);
            }
        } else if (var10 == 8) {
            if ((var17 instanceof class240)) {
                ((class240) var17).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, 4, var13 + 4, arg0, class342.field5333[var13] * 8, true, class329.field5121[var13] * 8);
            }
            if ((var16 instanceof class240)) {
                ((class240) var16).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, 4, (var13 + 2 & 0x3) + 4, arg0, class342.field5333[var13] * 8, true, class329.field5121[var13] * 8);
            }
        } else if (var10 == 11) {
            if ((var17 instanceof class240)) {
                ((class240) var17).method1701(1);
            } else {
                class288.method2022(arg5, var15, arg3, 10, var13 + 4, arg0, 0, true, 0);
            }
        } else if (var17 instanceof class240) {
            ((class240) var17).method1701(1);
        } else {
            class288.method2022(arg5, var15, arg3, var10, var13, arg0, 0, true, 0);
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)[Lfj;", line = 278)
    public static final class254[] method672(byte arg0) {
        class254[] var1 = new class254[class56.field740];
        for (int var2 = 0; var2 < class56.field740; var2++) {
            if (class186.field2991) {
                var1[var2] = new class211(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], class3.field20[var2], class305.field4754);
            } else {
                var1[var2] = new class123(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], class3.field20[var2], class305.field4754);
            }
        }
        field1440++;
        if (arg0 <= 72) {
            field1441 = (String) null;
        }
        class17.method115((byte) 102);
        return var1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILok;)Ljava/lang/String;", line = 304)
    public static final String method673(int arg0, class160 arg1) {
        field1439++;
        if (client.method1913(arg1).method1172((byte) -52) == arg0) {
            return null;
        } else if (arg1.field2507 == null || arg1.field2507.trim().length() == 0) {
            return class147.field2201 ? "Hidden-use" : null;
        } else {
            return arg1.field2507;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(BC)Z", line = 332)
    public static final boolean method674(byte arg0, char arg1) {
        if (arg0 != 25) {
            method675(94, false);
        }
        field1438++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 349)
    public static final String method675(int arg0, boolean arg1) {
        if (!arg1) {
            field1433 = -8;
        }
        field1431++;
        return class147.field2199[arg0].length() > 0 ? class284.field4478[arg0] + class37.field500 + class147.field2199[arg0] : class284.field4478[arg0];
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V", line = 374)
    public static final void method676(int arg0, int[] arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (arg1[var9] < var7 + (var9 & 0x1)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method676(arg0, arg1, var6 - 1, arg3 ^ 0x0, arg4);
            method676(var6 + 1, arg1, arg2, 2, arg4);
        }
        field1434++;
        if (arg3 != 2) {
            method675(-40, true);
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)Z")
    public abstract boolean method22(byte arg0);

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method20(byte arg0);
}
