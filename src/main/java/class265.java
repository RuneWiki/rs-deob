import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class265 extends class426 {

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public static int field4038 = 0;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "Lwl;")
    public static class452 field4043 = new class452(61, 3);

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field4046 = 0;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "Ljg;")
    public static class241 field4045 = new class241(128);

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "Liq;")
    public static class134 field4048;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "[I")
    public static int[] field4049;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "[Lli;")
    public class340[] field4035;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "[[B")
    private byte[][] field4047;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Z")
    public final boolean method1639(int arg0, int arg1) {
        field4036++;
        return arg0 == -1 ? this.field4035[arg1].field5079 : false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Z")
    public final boolean method1640(int arg0, byte arg1) {
        if (arg1 != 11) {
            field4046 = 79;
        }
        field4050++;
        return this.field4035[arg0].field5083;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[II[IIILek;IIZIIIB)I")
    public static final int method1641(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, class375 arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13, byte arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class449.field6612[var15][var35] = 0;
                class150.field2072[var15][var35] = 99999999;
            }
        }
        field4037++;
        boolean var16;
        if (arg1 == 1) {
            var16 = class171.method1058((byte) -94, arg5, arg6, arg7, arg9, arg3, arg12, arg8, arg11, arg0, arg13);
        } else if (arg1 == 2) {
            var16 = class5.method44(arg5, arg7, arg0, arg6, arg11, arg13, arg9, false, arg12, arg3, arg8);
        } else {
            var16 = class282.method1736(arg6, arg5, arg0, arg11, arg12, (byte) -11, arg7, arg1, arg9, arg13, arg8, arg3);
        }
        if (arg14 > -31) {
            method1641(45, -68, (int[]) null, -60, (int[]) null, -86, -37, (class375) null, -77, -72, true, 43, 11, -23, (byte) -127);
        }
        int var17 = arg13 - 64;
        int var18 = arg11 - 64;
        int var19 = class191.field2846;
        int var20 = class399.field5956;
        if (!var16) {
            if (!arg10) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg5 - var23; var24 <= (arg5 + var23); var24++) {
                for (int var25 = arg0 - var23; var25 <= (arg0 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class150.field2072[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg5 > var24) {
                            var28 = arg5 - var24;
                        } else if ((arg5 + arg6 - 1) < var24) {
                            var28 = var24 + 1 - arg5 - arg6;
                        }
                        int var29 = 0;
                        if (var25 < arg0) {
                            var29 = arg0 - var25;
                        } else if (arg0 + arg3 - 1 < var25) {
                            var29 = var25 + 1 - arg0 - arg3;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class150.field2072[var26][var27] < var22) {
                            var20 = var25;
                            var19 = var24;
                            var22 = class150.field2072[var26][var27];
                            var21 = var30;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg13 == var19 && arg11 == var20) {
            return 0;
        }
        byte var31 = 0;
        class451.field6659[var31] = var19;
        int var37 = var31 + 1;
        class107.field1429[var31] = var20;
        int var32;
        int var33 = var32 = class449.field6612[var19 - var17][var20 - var18];
        while (arg13 != var19 || arg11 != var20) {
            if (var32 != var33) {
                class451.field6659[var37] = var19;
                var32 = var33;
                class107.field1429[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class449.field6612[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg4[var34] = class451.field6659[var37];
            arg2[var34++] = class107.field1429[var37];
            if (arg4.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
    public static void method1642(int arg0) {
        field4045 = null;
        if (arg0 != 4) {
            field4043 = null;
        }
        field4049 = null;
        field4048 = null;
        field4043 = null;
    }

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)V")
    public static final void method1643(int arg0) {
        if (arg0 != 205316200) {
            return;
        }
        field4039++;
        for (class343 var1 = (class343) class192.field2875.method2514((byte) 61); var1 != null; var1 = (class343) class192.field2875.method2511(-112)) {
            if (var1.field5130 > 0) {
                var1.field5130--;
            }
            if (var1.field5130 != 0) {
                if (var1.field5133 > 0) {
                    var1.field5133--;
                }
                if (var1.field5133 == 0 && var1.field5129 >= 1 && var1.field5135 >= 1 && (class115.field1522 - 2) >= var1.field5129 && class198.field3004 - 2 >= var1.field5135 && (var1.field5125 < 0 || class463.method2858(var1.field5127, var1.field5125, arg0 ^ 0xF3C31F92))) {
                    class113.method689(var1.field5124, var1.field5135, -1, var1.field5127, var1.field5137, var1.field5129, var1.field5131, var1.field5125, arg0 ^ 0xF3C31FC8);
                    var1.field5133 = -1;
                    if (var1.field5132 == var1.field5125 && var1.field5132 == -1) {
                        var1.method625((byte) -50);
                    } else if (var1.field5132 == var1.field5125 && var1.field5134 == var1.field5131 && var1.field5136 == var1.field5127) {
                        var1.method625((byte) -50);
                    }
                }
            } else if (var1.field5132 < 0 || class463.method2858(var1.field5136, var1.field5132, -6)) {
                class113.method689(var1.field5124, var1.field5135, -1, var1.field5136, var1.field5137, var1.field5129, var1.field5134, var1.field5132, -105);
                var1.method625((byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "(I)Z")
    public final boolean method1644(int arg0) {
        field4042++;
        if (this.field4035 != null) {
            return true;
        }
        if (this.field4047 == null) {
            if (!class413.field6133.method813(this.field4040, (byte) 110)) {
                return false;
            }
            int[] var2 = class413.field6133.method830(arg0 + 96, this.field4040);
            this.field4047 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4047[var3] = class413.field6133.method823(this.field4040, -20334, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4047.length; var5++) {
            byte[] var14 = this.field4047[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class387.field5728.method822(arg0 + 105, var15);
        }
        if (!var4) {
            return false;
        }
        class398 var6 = new class398();
        int var7 = class413.field6133.method812(this.field4040, (byte) -41);
        this.field4035 = new class340[var7];
        int[] var8 = class413.field6133.method830(107, this.field4040);
        for (int var9 = arg0; var9 < var8.length; var9++) {
            byte[] var10 = this.field4047[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class168 var12 = null;
            for (class168 var13 = (class168) var6.method2514((byte) 61); var13 != null; var13 = (class168) var6.method2511(-104)) {
                if (var13.field2408 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class168(var11, class387.field5728.method825(var11, 0));
                var6.method2504(arg0 ^ 0x2A, var12);
            }
            this.field4035[var8[var9]] = new class340(var10, var12);
        }
        this.field4047 = null;
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)V")
    public static final void method1645(byte arg0) {
        field4041++;
        if (arg0 <= 103) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class79.field1038[var1] = false;
        }
        class391.field5769 = -1;
        class80.field1054 = 1;
        class176.field2674 = 0;
        class451.field6652 = 0;
        class284.field4337 = -1;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V")
    public class265(int arg0) {
        this.field4040 = arg0;
    }
}
