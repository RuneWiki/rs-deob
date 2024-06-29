import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class212 extends class41 {

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "[Lfb;")
    public class212[] field3659;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Z")
    public boolean field3651;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lsc;")
    public static class181 field3641 = class149.method967(255, "0(U");

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "Lsc;")
    public static class181 field3647 = class149.method967(255, "sl_stars");

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Ljd;")
    public static class265 field3655 = new class265(64);

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lff;")
    public class110 field3640;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Ljb;")
    public static class11 field3663;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "Ld;")
    public static class120 field3661;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Llb;")
    public class201 field3645;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static final void method1403(byte arg0) {
        int var1 = 12 / ((-arg0 - 31) / 47);
        field3643++;
        class253.field4417.method1790(0);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3641 = null;
        if (arg0 >= -119) {
            field3661 = null;
        }
        field3661 = null;
        field3655 = null;
        field3647 = null;
        field3663 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[[I")
    public int[][] method260(int arg0, int arg1) {
        field3639++;
        if (arg1 == 16383) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[I")
    public int[] method24(int arg0, byte arg1) {
        field3644++;
        if (arg1 > 25) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)[I")
    public final int[] method1405(int arg0, int arg1, int arg2) {
        if (arg2 <= 1) {
            field3663 = null;
        }
        field3657++;
        return this.field3659[arg1].field3651 ? this.field3659[arg1].method24(arg0, (byte) 72) : this.field3659[arg1].method260(arg0, 16383)[0];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg9 - arg2;
        int var12 = arg8 - arg6;
        field3648++;
        if (class62.field967 > arg9) {
            var11++;
        }
        if (class222.field3840 > arg8) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var33 = arg1 * var13 + arg4 >> 16;
            int var34 = arg4 + ((var13 + 1) * arg1) >> 16;
            int var35 = var34 - var33;
            if (var35 > 0) {
                int var36 = arg2 + var13 >> 6;
                if (var36 >= 0 && var36 <= class262.field4563.length - 1) {
                    int var37 = arg5 + var33;
                    int[][] var38 = class262.field4563[var36];
                    byte[][] var39 = class83.field1327[var36];
                    int var40 = arg5 + var34;
                    byte[][] var41 = class242.field4210[var36];
                    byte[][] var42 = class126.field2095[var36];
                    byte[][] var43 = class217.field3737[var36];
                    byte[][] var44 = class52.field816[var36];
                    for (int var45 = 0; var45 < var12; var45++) {
                        int var46 = (var45 + 1) * arg3 + arg7 >> 16;
                        int var47 = arg3 * var45 + arg7 >> 16;
                        int var48 = var46 - var47;
                        if (var48 > 0) {
                            int var49 = arg10 + var46;
                            int var50 = arg10 + var47;
                            int var51 = arg6 + var45 >> 6;
                            int var52 = var45 + arg6 & 0x3F;
                            int var53 = arg2 + var13 & 0x3F;
                            int var54 = (var52 << 6) + var53;
                            int var55;
                            if (var51 < 0 || var51 > (var38.length - 1) || var38[var51] == null) {
                                if (field3661.field1967 != -1) {
                                    var55 = field3661.field1967;
                                } else if ((arg2 + var13 & 0x4) == (arg6 + var45 & 0x4)) {
                                    var55 = class162.field2757[class157.field2660 + 1];
                                } else {
                                    var55 = 4936552;
                                }
                                if (var51 < 0 || var51 > (var38.length - 1)) {
                                    if (var55 == 0) {
                                        var55 = 1;
                                    }
                                    class17.method156(var37, var50, var35, var48, var55);
                                    continue;
                                }
                            } else {
                                var55 = var38[var51][var54];
                            }
                            int var56 = var39[var51] == null ? 0 : class162.field2757[var39[var51][var54] & 0xFF];
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            int var57 = var44[var51] == null ? 0 : class162.field2757[var44[var51][var54] & 0xFF];
                            if (var56 == 0 && var57 == 0) {
                                class17.method156(var37, var50, var35, var48, var55);
                            } else {
                                if (var56 != 0) {
                                    if (var56 == -1) {
                                        var56 = 1;
                                    }
                                    byte var58 = var42[var51] == null ? 0 : var42[var51][var54];
                                    int var59 = var58 & 0xFC;
                                    if (var59 == 0 || var35 <= 1 || var48 <= 1) {
                                        class17.method156(var37, var50, var35, var48, var56);
                                    } else {
                                        class188.method1306(class17.field307, var59 >> 2, var35, var58 & 0x3, var37, var56, true, (byte) -47, var48, var50, var55);
                                    }
                                }
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = var55;
                                    }
                                    byte var60 = var41[var51][var54];
                                    int var61 = var60 & 0xFC;
                                    if (var61 == 0 || var35 <= 1 || var48 <= 1) {
                                        class17.method156(var37, var50, var35, var48, var57);
                                    }
                                    class188.method1306(class17.field307, var61 >> 2, var35, var60 & 0x3, var37, var57, var56 == 0, (byte) -47, var48, var50, 0);
                                }
                            }
                            if (var43[var51] != null) {
                                int var62 = var43[var51][var54] & 0xFF;
                                if (var62 != 0) {
                                    int var63;
                                    if (var35 == 1) {
                                        var63 = var37;
                                    } else {
                                        var63 = var40 - 1;
                                    }
                                    int var64;
                                    if (var48 == 1) {
                                        var64 = var50;
                                    } else {
                                        var64 = var49 - 1;
                                    }
                                    int var65 = 13421772;
                                    if (var62 >= 5 && var62 <= 8 || var62 >= 13 && var62 <= 16 || var62 >= 21 && var62 <= 24 || var62 == 27 || var62 == 28) {
                                        var65 = 13369344;
                                        var62 -= 4;
                                    }
                                    if (var62 == 1) {
                                        class17.method152(var37, var50, var48, var65);
                                    } else if (var62 == 2) {
                                        class17.method167(var37, var50, var35, var65);
                                    } else if (var62 == 3) {
                                        class17.method152(var63, var50, var48, var65);
                                    } else if (var62 == 4) {
                                        class17.method167(var37, var64, var35, var65);
                                    } else if (var62 == 9) {
                                        class17.method152(var37, var50, var48, 16777215);
                                        class17.method167(var37, var50, var35, var65);
                                    } else if (var62 == 10) {
                                        class17.method152(var63, var50, var48, 16777215);
                                        class17.method167(var37, var50, var35, var65);
                                    } else if (var62 == 11) {
                                        class17.method152(var63, var50, var48, 16777215);
                                        class17.method167(var37, var64, var35, var65);
                                    } else if (var62 == 12) {
                                        class17.method152(var37, var50, var48, 16777215);
                                        class17.method167(var37, var64, var35, var65);
                                    } else if (var62 == 17) {
                                        class17.method167(var37, var50, 1, var65);
                                    } else if (var62 == 18) {
                                        class17.method167(var63, var50, 1, var65);
                                    } else if (var62 == 19) {
                                        class17.method167(var63, var64, 1, var65);
                                    } else if (var62 == 20) {
                                        class17.method167(var37, var64, 1, var65);
                                    } else if (var62 == 25) {
                                        for (int var67 = 0; var67 < var48; var67++) {
                                            class17.method167(var37 + var67, -var67 + var64, 1, var65);
                                        }
                                    } else if (var62 == 26) {
                                        for (int var66 = 0; var66 < var48; var66++) {
                                            class17.method167(var37 + var66, var50 + var66, 1, var65);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg5 + var34;
                    int var69 = arg5 + var33;
                    for (int var70 = 0; var70 < var12; var70++) {
                        int var71;
                        if (field3661.field1967 != -1) {
                            var71 = field3661.field1967;
                        } else if ((var70 + arg6 & 0x4) == (arg2 + var13 & 0x4)) {
                            var71 = class162.field2757[class157.field2660 + 1];
                        } else {
                            var71 = 4936552;
                        }
                        if (var71 == 0) {
                            var71 = 1;
                        }
                        int var72 = (arg7 + (arg3 * var70) >> 16) + arg10;
                        int var73 = ((var70 + 1) * arg3 + arg7 >> 16) + arg10;
                        int var74 = var73 - var72;
                        class17.method156(var69, var72, var35, var74, var71);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var16 = arg4 + ((var14 + 1) * arg1) >> 16;
            int var17 = arg1 * var14 + arg4 >> 16;
            int var18 = var16 - var17;
            if (var18 > 0) {
                int var19 = arg2 + var14 >> 6;
                int var20 = arg5 + var17;
                var10000 = arg5 + var16;
                if (var19 >= 0 && var19 <= class113.field1841.length - 1) {
                    short[][] var22 = class113.field1841[var19];
                    for (int var23 = -2; var23 < var12 + 2; var23++) {
                        int var24 = arg3 * var23 + arg7 >> 16;
                        int var25 = (var23 + 1) * arg3 + arg7 >> 16;
                        int var26 = var25 - var24;
                        if (var26 > 0) {
                            int var27 = var23 + arg6 >> 6;
                            int var28 = arg10 + var24;
                            var10000 = arg10 + var25;
                            if (var27 >= 0 && var27 <= var22.length - 1) {
                                int var30 = (var23 + arg6 & 0x3F << 6) + (arg2 + var14 & 0x3F);
                                if (var22[var27] != null) {
                                    int var31 = var22[var27][var30] & 0x3FFF;
                                    int var32 = var22[var27][var30] >> 14 & 0x3;
                                    if (var31 != 0) {
                                        if (var32 == 0) {
                                            class64.field999[var31 - 1].method864(var20, var28, var18 * 2, var26 * 2);
                                        } else if (var32 == 1) {
                                            class132.field2187[var31 - 1].method864(var20, var28, var18 * 2, var26 * 2);
                                        } else if (var32 == 2) {
                                            class5.field101[var31 - 1].method864(var20, var28, var18 * 2, var26 * 2);
                                        } else if (var32 == 3) {
                                            class115.field1862[var31 - 1].method864(var20, var28, var18 * 2, var26 * 2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int var15 = 106 / ((29 - arg0) / 50);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IB)I")
    public static final int method1407(int arg0, byte arg1) {
        if (arg1 < 14) {
            method1406(25, 54, 2, -44, 94, -106, 44, 6, 55, 20, -67);
        }
        field3652++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public void method1042(int arg0) {
        field3642++;
        if (arg0 != 7889) {
            return;
        }
        if (this.field3651) {
            this.field3640.method731(-4234);
            this.field3640 = null;
        } else {
            this.field3645.method1353((byte) -108);
            this.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)V")
    public final void method1408(int arg0, int arg1, int arg2) {
        int var4 = ~this.field3654 == arg2 ? arg0 : this.field3654;
        field3650++;
        if (this.field3651) {
            this.field3640 = new class110(var4, arg0, arg1);
        } else {
            this.field3645 = new class201(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lvf;II)V")
    public void method26(class230 arg0, int arg1, int arg2) {
        field3660++;
        if (arg2 != -3) {
            method1403((byte) 47);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(III)I")
    public static final int method1409(int arg0, int arg1, int arg2) {
        if (arg0 != 3) {
            method1409(-80, 87, -7);
        }
        field3646++;
        class196 var3 = (class196) class254.field4435.method1424(true, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field3418.length) {
            return var3.field3418[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method1410(int arg0, int arg1, byte arg2) {
        if (arg2 > -29) {
            return null;
        }
        field3658++;
        if (!this.field3659[arg1].field3651) {
            return this.field3659[arg1].method260(arg0, 16383);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field3659[arg1].method24(arg0, (byte) 70);
        var4[1] = var5;
        var4[2] = var5;
        var4[0] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)I")
    public int method1411(int arg0) {
        field3662++;
        if (arg0 != -1) {
            this.field3659 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lqh;)V")
    public static final void method1412(class100 arg0) {
        for (int var1 = arg0.field1688; var1 <= arg0.field1671; var1++) {
            for (int var2 = arg0.field1672; var2 <= arg0.field1676; var2++) {
                class220 var3 = class221.field3820[arg0.field1670][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3806; var4++) {
                        if (var3.field3797[var4] == arg0) {
                            var3.field3806--;
                            for (int var5 = var4; var5 < var3.field3806; var5++) {
                                var3.field3797[var5] = var3.field3797[var5 + 1];
                                var3.field3808[var5] = var3.field3808[var5 + 1];
                            }
                            var3.field3797[var3.field3806] = null;
                            break;
                        }
                    }
                    var3.field3802 = 0;
                    for (int var6 = 0; var6 < var3.field3806; var6++) {
                        var3.field3802 |= var3.field3808[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
    public void method46(boolean arg0) {
        if (!arg0) {
            method1412((class100) null);
        }
        field3656++;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)I")
    public int method1040(byte arg0) {
        if (arg0 != -92) {
            this.field3640 = null;
        }
        field3653++;
        return -1;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IZ)V")
    public class212(int arg0, boolean arg1) {
        this.field3659 = new class212[arg0];
        this.field3651 = arg1;
    }
}
