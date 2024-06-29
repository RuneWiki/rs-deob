import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class91 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[[I")
    public static int[][] field1566 = new int[6][];

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1571 = -1;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIII)V")
    public static final void method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1570++;
        int var6 = arg1 - arg4;
        int var7 = 105 % ((-arg0 - 33) / 63);
        int var8 = arg3 - arg2;
        if (var6 == 0) {
            if (var8 != 0) {
                class241.method1576(arg2, arg5, arg3, arg4, (byte) -73);
            }
        } else if (var8 == 0) {
            class488.method2894(arg5, arg1, arg4, arg2, 0);
        } else {
            int var9 = (var8 << 12) / var6;
            int var10 = arg2 - (arg4 * var9 >> 12);
            int var11;
            int var12;
            if (arg4 < class315.field4754) {
                var12 = class315.field4754;
                var11 = (class315.field4754 * var9 >> 12) + var10;
            } else if (class156.field2455 < arg4) {
                var11 = (class156.field2455 * var9 >> 12) + var10;
                var12 = class156.field2455;
            } else {
                var11 = arg2;
                var12 = arg4;
            }
            int var13;
            int var14;
            if (class315.field4754 > arg1) {
                var13 = class315.field4754;
                var14 = (class315.field4754 * var9 >> 12) + var10;
            } else if (arg1 <= class156.field2455) {
                var13 = arg1;
                var14 = arg3;
            } else {
                var14 = var10 + (class156.field2455 * var9 >> 12);
                var13 = class156.field2455;
            }
            if (class70.field1213 > var14) {
                var13 = (class70.field1213 - var10 << 12) / var9;
                var14 = class70.field1213;
            } else if (var14 > class389.field5859) {
                var14 = class389.field5859;
                var13 = (class389.field5859 - var10 << 12) / var9;
            }
            if (class70.field1213 > var11) {
                var12 = (class70.field1213 - var10 << 12) / var9;
                var11 = class70.field1213;
            } else if (class389.field5859 < var11) {
                var11 = class389.field5859;
                var12 = (class389.field5859 - var10 << 12) / var9;
            }
            class286.method1819(var13, var11, (byte) 67, arg5, var14, var12);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public static final void method705(boolean arg0) {
        field1569++;
        for (class357 var1 = (class357) class149.field2372.method2427(117); var1 != null; var1 = (class357) class149.field2372.method2422(-85)) {
            class109 var2 = var1.field5432;
            if (class163.field2525 != var2.field6232 || var2.field1826 < class531.field7821) {
                var1.method2090(-1);
                var2.method815(-117);
            } else if (class531.field7821 >= var2.field1813) {
                if (var2.field1811 > 0) {
                    class255 var3 = class34.field668[var2.field1811 - 1];
                    if (var3 != null && var3.field6228 >= 0 && var3.field6228 < (class33.field662 * 128) && var3.field6233 >= 0 && var3.field6233 < class121.field1966 * 128) {
                        var2.method811(class343.method2188(var2.field6232, var3.field6228, (byte) -102, var3.field6233) - var2.field1827, var3.field6233, (byte) -123, class531.field7821, var3.field6228);
                    }
                }
                if (var2.field1811 < 0) {
                    int var4 = -var2.field1811 - 1;
                    class256 var5;
                    if (class148.field2368 == var4) {
                        var5 = class139.field2224;
                    } else {
                        var5 = class183.field2747[var4];
                    }
                    if (var5 != null && var5.field6228 >= 0 && var5.field6228 < class33.field662 * 128 && var5.field6233 >= 0 && var5.field6233 < (class121.field1966 * 128)) {
                        var2.method811(class343.method2188(var2.field6232, var5.field6228, (byte) -102, var5.field6233) - var2.field1827, var5.field6233, (byte) -128, class531.field7821, var5.field6228);
                    }
                }
                var2.method817(class514.field7564, -1);
                class84.method651(var2, true);
            }
        }
        if (arg0) {
            field1571 = 125;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lcu;II)Ljava/lang/String;")
    public static final String method706(class145 arg0, int arg1, int arg2) {
        field1567++;
        try {
            int var3 = arg0.method1119(97);
            if (var3 > arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field2289 += class3.field101.method2881(var3, arg0.field2270, 0, (byte) 112, arg0.field2289, var4);
            String var5 = class81.method644(var4, -88, var3, 0);
            int var6 = 67 / ((-arg1 - 3) / 50);
            return var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method707(int arg0) {
        int var1 = 61 / ((arg0 + 13) / 41);
        field1566 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;ZIILmq;Leu;Lea;Loa;IIII)V")
    public static final void method708(String arg0, boolean arg1, int arg2, int arg3, class350 arg4, class332 arg5, class381 arg6, class489 arg7, int arg8, int arg9, int arg10, int arg11) {
        field1572++;
        int var12;
        if (class85.field1473 == 4) {
            var12 = (int) class526.field7779 & 0x3FFF;
        } else {
            var12 = (int) class526.field7779 + class255.field3674 & 0x3FFF;
        }
        int var13 = Math.max(arg4.field5329 / 2, arg4.field5269 / 2) + 10;
        int var14 = arg2 * arg2 + arg11 * arg11;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class528.field7783[var12];
        int var16 = class528.field7786[var12];
        if (class85.field1473 != 4) {
            var16 = var16 * 256 / (class70.field1215 + 256);
            var15 = var15 * 256 / (class70.field1215 + 256);
        }
        int var17 = arg2 * var15 + arg11 * var16 >> 15;
        if (!arg1) {
            return;
        }
        int var18 = arg2 * var16 - (arg11 * var15) >> 15;
        int var19 = arg5.method2129(null, 100, 125, arg0);
        int var20 = var17 - var19 / 2;
        int var21 = arg5.method2128(-10148, null, 0, 100, arg0);
        if (var20 >= (-arg4.field5329) && arg4.field5329 >= var20 && var18 >= -arg4.field5269 && arg4.field5269 >= var18) {
            arg7.method2908(0, 0, arg9, null, -16777216, arg6, var19, 0, arg0, arg3, 1, 50, arg8, var20 + (arg4.field5329 / 2) + arg9, null, arg4.field5269 / 2 + arg8 - var18 - arg10 - var21);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)[B")
    public abstract byte[] method709(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([BI)V")
    public abstract void method710(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method711(boolean arg0);
}
