import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class175 extends class77 {

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "Z")
    public static boolean field2515 = false;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lph;")
    public static class361 field2519;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Lph;")
    public static class361 field2523;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "Ljava/lang/String;")
    public String field2531;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "[C")
    public char[] field2522;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "[C")
    public char[] field2526;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
    public int[] field2525;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "[I")
    public int[] field2528;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V", line = 4)
    public final void method1223(byte arg0) {
        if (arg0 > -64) {
            field2523 = (class361) null;
        }
        field2530++;
        if (this.field2525 != null) {
            for (int var2 = 0; var2 < this.field2525.length; var2++) {
                this.field2525[var2] = class81.method666(this.field2525[var2], 32768);
            }
        }
        if (this.field2528 != null) {
            for (int var3 = 0; var3 < this.field2528.length; var3++) {
                this.field2528[var3] = class81.method666(this.field2528[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1224(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class81.field1154; var3++) {
            class252 var4 = class193.field2814[var3];
            if (var4.field3750 == 1) {
                int var5 = var4.field3745 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3761 * var5 >> 8) + var4.field3755;
                    int var7 = (var4.field3741 * var5 >> 8) + var4.field3747;
                    int var8 = (var4.field3738 * var5 >> 8) + var4.field3739;
                    int var9 = (var4.field3736 * var5 >> 8) + var4.field3743;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3750 == 2) {
                int var10 = arg0 - var4.field3745;
                if (var10 > 0) {
                    int var11 = (var4.field3761 * var10 >> 8) + var4.field3755;
                    int var12 = (var4.field3741 * var10 >> 8) + var4.field3747;
                    int var13 = (var4.field3738 * var10 >> 8) + var4.field3739;
                    int var14 = (var4.field3736 * var10 >> 8) + var4.field3743;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3750 == 3) {
                int var15 = var4.field3755 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3751 * var15 >> 8) + var4.field3745;
                    int var17 = (var4.field3754 * var15 >> 8) + var4.field3740;
                    int var18 = (var4.field3738 * var15 >> 8) + var4.field3739;
                    int var19 = (var4.field3736 * var15 >> 8) + var4.field3743;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3750 == 4) {
                int var20 = arg2 - var4.field3755;
                if (var20 > 0) {
                    int var21 = (var4.field3751 * var20 >> 8) + var4.field3745;
                    int var22 = (var4.field3754 * var20 >> 8) + var4.field3740;
                    int var23 = (var4.field3738 * var20 >> 8) + var4.field3739;
                    int var24 = (var4.field3736 * var20 >> 8) + var4.field3743;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3750 == 5) {
                int var25 = arg1 - var4.field3739;
                if (var25 > 0) {
                    int var26 = (var4.field3751 * var25 >> 8) + var4.field3745;
                    int var27 = (var4.field3754 * var25 >> 8) + var4.field3740;
                    int var28 = (var4.field3761 * var25 >> 8) + var4.field3755;
                    int var29 = (var4.field3741 * var25 >> 8) + var4.field3747;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILsb;I)V", line = 156)
    private final void method1225(int arg0, class190 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2531 = arg1.method1329((byte) 59);
        } else if (arg2 == 2) {
            int var4 = arg1.method1319(255);
            this.field2528 = new int[var4];
            this.field2522 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2528[var5] = arg1.method1317((byte) 113);
                byte var6 = arg1.method1322(9813);
                this.field2522[var5] = var6 == 0 ? 0 : class7.method45((byte) -127, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1319(255);
            this.field2526 = new char[var7];
            this.field2525 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2525[var8] = arg1.method1317((byte) 41);
                byte var9 = arg1.method1322(9813);
                this.field2526[var8] = var9 == 0 ? 0 : class7.method45((byte) -86, var9);
            }
        } else if (arg2 == 4) {
        }
        field2517++;
        if (arg0 > -86) {
            this.field2522 = (char[]) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 223)
    public static final void method1226(int arg0, int arg1) {
        field2527++;
        class247.field3658.method464(3398, arg1);
        if (arg0 > -35) {
            method1227(126, 70, 52, 10, 90, -41, 126, 119, -86, 38);
        }
        class59.field866.method464(3398, arg1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIII)V", line = 237)
    public static final void method1227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class217 var10 = (class217) class149.field2158.method93((byte) -59);
        field2524++;
        class217 var11 = null;
        while (var10 != null) {
            if (var10.field3197 == arg8 && var10.field3194 == arg0 && var10.field3201 == arg4 && var10.field3192 == arg2) {
                var11 = var10;
                break;
            }
            var10 = (class217) class149.field2158.method97(arg3 - 3425);
        }
        if (var11 == null) {
            var11 = new class217();
            var11.field3192 = arg2;
            var11.field3197 = arg8;
            var11.field3194 = arg0;
            var11.field3201 = arg4;
            class215.method1559(var11, (byte) 126);
            class149.field2158.method106(var11, -126);
        }
        var11.field3191 = arg1;
        var11.field3204 = arg7;
        if (arg3 == 3344) {
            var11.field3202 = arg9;
            var11.field3198 = arg5;
            var11.field3190 = arg6;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lrb;", line = 284)
    public static final class122 method1228(byte arg0, int arg1) {
        class122 var2 = (class122) class126.field1833.method461((byte) 120, (long) arg1);
        field2518++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field854.method2520(class32.method227(arg1, 98048), class57.method465(arg1, arg0 - 54), (byte) -25);
        class122 var4 = new class122();
        var4.field1768 = arg1;
        if (var3 != null) {
            var4.method912(0, new class190(var3));
        }
        var4.method920((byte) 72);
        if (var4.field1758 != -1) {
            var4.method919((byte) 62, method1228((byte) 54, var4.field1758), method1228((byte) 54, var4.field1741));
        }
        if (var4.field1763 != -1) {
            var4.method914(method1228((byte) 54, var4.field1750), method1228((byte) 54, var4.field1763), (byte) 46);
        }
        if (!class244.field3642 && var4.field1771) {
            var4.field1727 = class11.field181;
            var4.field1737 = class154.field2207;
            var4.field1742 = class75.field1088;
            var4.field1762 = 0;
            var4.field1751 = false;
        }
        class126.field1833.method460(var4, -26089, (long) arg1);
        if (arg0 != 54) {
            method1224(-107, 113, 19);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 327)
    public static void method1229(boolean arg0) {
        field2523 = null;
        field2519 = null;
        if (arg0) {
            field2519 = (class361) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(CI)I", line = 344)
    public final int method1230(char arg0, int arg1) {
        field2516++;
        if (this.field2528 == null) {
            return -1;
        }
        if (arg1 != 8) {
            method1224(-57, 5, -41);
        }
        for (int var3 = 0; var3 < this.field2528.length; var3++) {
            if (this.field2522[var3] == arg0) {
                return this.field2528[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(CI)I", line = 369)
    public final int method1231(char arg0, int arg1) {
        field2521++;
        if (this.field2525 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2525.length; var3++) {
            if (this.field2526[var3] == arg0) {
                return this.field2525[var3];
            }
        }
        if (arg1 != -1) {
            this.field2522 = (char[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)V", line = 395)
    public static final void method1232(int arg0, int arg1, int arg2) {
        if (arg0 >= -21) {
            field2519 = (class361) null;
        }
        int var3 = class267.field4077 * arg2 >> 8;
        field2529++;
        if (arg1 == -1 && !class65.field958) {
            class208.method1522((byte) -39);
        } else if (arg1 != -1 && (class150.field2187 != arg1 || !class172.method1209((byte) 31)) && var3 != 0 && !class65.field958) {
            class143.method1030(class332.field5085, var3, 2, arg1, 0, -113, false);
        }
        class150.field2187 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lsb;I)V", line = 434)
    public final void method1233(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1319(255);
            if (var3 == 0) {
                field2520++;
                if (arg1 != -1) {
                    field2523 = (class361) null;
                }
                return;
            }
            this.method1225(-127, arg0, var3);
        }
    }
}
