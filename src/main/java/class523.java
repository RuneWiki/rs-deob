import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class523 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field7105 = 128;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field7100 = 128;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field7109;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field7112;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field7104;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lbaa;")
    public static class593 field7101 = new class593(14, 0, 4, 1);

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field7118 = 999999;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field7102;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public int field7113;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public int field7114;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public int field7119;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lrj;")
    public static class648 field7117;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "[Ldda;")
    public static class652[] field7115;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILni;II)V")
    public static final void method2852(int arg0, int arg1, class687 arg2, int arg3, int arg4) {
        field7106++;
        class601 var5 = arg2.method3872(32195);
        int var6 = arg2.field9697 - arg2.field9672.field7215 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg2.field9678 > 25) {
                if (arg0 < 0 && var5.field8463 != -1) {
                    arg2.field9744 = var5.field8463;
                } else if (arg0 <= 0 || var5.field8458 == -1) {
                    arg2.field9744 = var5.field8445;
                } else {
                    arg2.field9744 = var5.field8458;
                }
                arg2.field9660 = false;
            } else if (!arg2.field9660 || !var5.method3299(arg2.field9744, arg3 ^ 0xFFFF984C)) {
                arg2.field9744 = var5.method3296(arg3 + 26564);
                arg2.field9660 = arg2.field9744 != -1;
            }
        } else if (arg2.field9650 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class190.field2378[arg4] - arg2.field9672.field7215 & 0x3FFF;
            if (arg1 == 2 && var5.field8426 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field8468 != -1) {
                    arg2.field9744 = var5.field8468;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field8457 != -1) {
                    arg2.field9744 = var5.field8457;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field8425 == -1) {
                    arg2.field9744 = var5.field8426;
                } else {
                    arg2.field9744 = var5.field8425;
                }
            } else if (arg1 == 0 && var5.field8428 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field8439 != -1) {
                    arg2.field9744 = var5.field8439;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field8431 != -1) {
                    arg2.field9744 = var5.field8431;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field8423 == -1) {
                    arg2.field9744 = var5.field8428;
                } else {
                    arg2.field9744 = var5.field8423;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field8433 != -1) {
                arg2.field9744 = var5.field8433;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field8436 != -1) {
                arg2.field9744 = var5.field8436;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field8453 == -1) {
                arg2.field9744 = var5.field8445;
            } else {
                arg2.field9744 = var5.field8453;
            }
            arg2.field9660 = false;
        } else if (var6 == 0 && arg2.field9678 <= 25) {
            arg2.field9660 = false;
            if (arg1 == 2 && var5.field8426 != -1) {
                arg2.field9744 = var5.field8426;
            } else if (arg1 == 0 && var5.field8428 != -1) {
                arg2.field9744 = var5.field8428;
            } else {
                arg2.field9744 = var5.field8445;
            }
        } else {
            if (arg1 == 2 && var5.field8426 != -1) {
                if (arg0 < 0 && var5.field8452 != -1) {
                    arg2.field9744 = var5.field8452;
                } else if (arg0 <= 0 || var5.field8464 == -1) {
                    arg2.field9744 = var5.field8426;
                } else {
                    arg2.field9744 = var5.field8464;
                }
            } else if (arg1 == 0 && var5.field8428 != -1) {
                if (arg0 < 0 && var5.field8446 != -1) {
                    arg2.field9744 = var5.field8446;
                } else if (arg0 <= 0 || var5.field8451 == -1) {
                    arg2.field9744 = var5.field8428;
                } else {
                    arg2.field9744 = var5.field8451;
                }
            } else if (arg0 < 0 && var5.field8444 != -1) {
                arg2.field9744 = var5.field8444;
            } else if (arg0 <= 0 || var5.field8462 == -1) {
                arg2.field9744 = var5.field8445;
            } else {
                arg2.field9744 = var5.field8462;
            }
            arg2.field9660 = false;
        }
        if (arg3 != -26563) {
            method2853(-85, -26, -7, 112, 36, -23, -103, 104);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7108++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg3 - arg4;
        int var12 = arg1 - arg4;
        int var13 = arg3 * arg3;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        if (arg2 != 6144) {
            method2854((byte) 84);
        }
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg0 >= class289.field3595 && class159.field2063 >= arg0) {
            int[] var39 = class550.field7650[arg0];
            int var40 = class605.method3315(arg5 - arg3, arg2 ^ 0x17FF, class263.field3294, class314.field4052);
            int var41 = class605.method3315(arg3 + arg5, 4095, class263.field3294, class314.field4052);
            int var42 = class605.method3315(arg5 - var11, 4095, class263.field3294, class314.field4052);
            int var43 = class605.method3315(arg5 + var11, arg2 + -2049, class263.field3294, class314.field4052);
            class57.method362(var40, var39, arg6, var42, -104);
            class57.method362(var42, var39, arg7, var43, arg2 ^ 0xFFFFE785);
            class57.method362(var43, var39, arg6, var41, arg2 ^ 0xFFFFE791);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var46 >= class289.field3595 && class159.field2063 >= var45) {
                int var47 = class605.method3315(arg5 + var8, 4095, class263.field3294, class314.field4052);
                int var48 = class605.method3315(arg5 - var8, 4095, class263.field3294, class314.field4052);
                if (var44) {
                    int var49 = class605.method3315(arg5 + var10, 4095, class263.field3294, class314.field4052);
                    int var50 = class605.method3315(arg5 - var10, 4095, class263.field3294, class314.field4052);
                    if (var45 >= class289.field3595) {
                        int[] var51 = class550.field7650[var45];
                        class57.method362(var48, var51, arg6, var50, -128);
                        class57.method362(var50, var51, arg7, var49, 84);
                        class57.method362(var49, var51, arg6, var47, 60);
                    }
                    if (var46 <= class159.field2063) {
                        int[] var52 = class550.field7650[var46];
                        class57.method362(var48, var52, arg6, var50, -117);
                        class57.method362(var50, var52, arg7, var49, arg2 ^ 0xFFFFE782);
                        class57.method362(var49, var52, arg6, var47, -119);
                    }
                } else {
                    if (var45 >= class289.field3595) {
                        class57.method362(var48, class550.field7650[var45], arg6, var47, -124);
                    }
                    if (var46 <= class159.field2063) {
                        class57.method362(var48, class550.field7650[var46], arg6, var47, -121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method2854(byte arg0) {
        field7115 = null;
        int var1 = 3 % ((arg0 + 4) / 36);
        field7101 = null;
        field7117 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILff;)V")
    public final void method2855(int arg0, class523 arg1) {
        this.field7100 = arg1.field7100;
        this.field7105 = arg1.field7105;
        int var3 = -71 % ((36 - arg0) / 42);
        this.field7112 = arg1.field7112;
        this.field7103 = arg1.field7103;
        this.field7109 = arg1.field7109;
        field7116++;
        this.field7104 = arg1.field7104;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lff;")
    public final class523 method2856(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field7107++;
            return new class523(this.field7109, this.field7100, this.field7105, this.field7103, this.field7112, this.field7104);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class523(int arg0) {
        this.field7109 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIII)V")
    private class523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7100 = arg1;
        this.field7112 = arg4;
        this.field7103 = arg3;
        this.field7109 = arg0;
        this.field7105 = arg2;
        this.field7104 = arg5;
    }
}
