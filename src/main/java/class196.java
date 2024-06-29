import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class196 {

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lmh;")
    public class376 field2720 = new class376();

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lrg;")
    public static class383 field2706 = null;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2710 = 0;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Z")
    public static boolean field2722 = false;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lre;")
    public static class357 field2721;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lmh;")
    private class376 field2723;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method1300(byte arg0) {
        field2702++;
        int var2 = 96 % ((arg0 - 52) / 46);
        return this.field2720.field5365 == this.field2720;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILmh;)V", line = 15)
    public final void method1301(int arg0, class376 arg1) {
        if (arg1.field5369 != null) {
            arg1.method2459(198);
        }
        field2717++;
        arg1.field5365 = this.field2720;
        arg1.field5369 = this.field2720.field5369;
        arg1.field5369.field5365 = arg1;
        if (arg0 == 50) {
            arg1.field5365.field5369 = arg1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 36)
    public static void method1302(int arg0) {
        field2706 = null;
        if (arg0 != 2) {
            field2721 = null;
        }
        field2721 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltc;I)V", line = 53)
    public final void method1303(class196 arg0, int arg1) {
        if (arg1 != 50) {
            this.field2720 = null;
        }
        this.method1316(arg0, (byte) 39, this.field2720.field5365);
        field2711++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lmh;", line = 64)
    public final class376 method1304(int arg0) {
        field2712++;
        int var2 = 11 % ((30 - arg0) / 53);
        class376 var3 = this.field2723;
        if (this.field2720 == var3) {
            this.field2723 = null;
            return null;
        } else {
            this.field2723 = var3.field5365;
            return var3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 86)
    public static final void method1305(byte arg0) {
        field2718++;
        int var1 = 0;
        if (arg0 < 114) {
            method1310(-49, -67, -86, 92, 99, -90, -35, 126, 35, 53);
        }
        while (var1 < class221.field2910.length) {
            for (int var2 = 0; var2 < class221.field2910[0].length; var2++) {
                for (int var3 = 0; var3 < class221.field2910[0][0].length; var3++) {
                    class221.field2910[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Lmh;", line = 121)
    public final class376 method1306(int arg0) {
        field2707++;
        class376 var2 = this.field2723;
        if (this.field2720 == var2) {
            this.field2723 = null;
            return null;
        }
        this.field2723 = var2.field5369;
        if (arg0 != 737947202) {
            field2722 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lmh;I)V", line = 150)
    public final void method1307(class376 arg0, int arg1) {
        if (arg0.field5369 != null) {
            arg0.method2459(198);
        }
        if (arg1 != -4) {
            method1305((byte) -100);
        }
        field2719++;
        arg0.field5365 = this.field2720.field5365;
        arg0.field5369 = this.field2720;
        arg0.field5369.field5365 = arg0;
        arg0.field5365.field5369 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lkq;Z)[Lqi;", line = 170)
    public static final class337[] method1308(class351 arg0, boolean arg1) {
        field2709++;
        if (!arg0.method2245((byte) 31)) {
            return new class337[0];
        }
        class295 var2 = arg0.method2249(-23);
        while (var2.field4068 == 0) {
            class4.method28(10L, -92);
        }
        if (var2.field4068 == 2) {
            return new class337[0];
        }
        if (!arg1) {
            field2722 = true;
        }
        int[] var3 = (int[]) var2.field4070;
        class337[] var4 = new class337[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class337 var6 = new class337();
            var4[var5] = var6;
            var6.field4597 = var3[var5 << 2];
            var6.field4591 = var3[(var5 << 2) + 1];
            var6.field4593 = var3[(var5 << 2) + 2];
            var6.field4594 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)I", line = 215)
    public final int method1309(int arg0) {
        field2715++;
        int var2 = 0;
        if (arg0 != 16505) {
            this.method1304(-57);
        }
        class376 var3 = this.field2720.field5365;
        while (this.field2720 != var3) {
            var3 = var3.field5365;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V", line = 236)
    public static final void method1310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2703++;
        if (arg0 != 12138) {
            return;
        }
        if (arg2 == arg9 && arg1 == arg6 && arg3 == arg7 && arg5 == arg8) {
            class414.method2648(arg8, arg4, arg2, (byte) -121, arg6, arg7);
            return;
        }
        int var10 = arg2;
        int var11 = arg6;
        int var12 = arg2 * 3;
        int var13 = arg6 * 3;
        int var14 = arg9 * 3;
        int var15 = arg1 * 3;
        int var16 = arg3 * 3;
        int var17 = arg5 * 3;
        int var18 = var14 + arg7 - arg2 - var16;
        int var19 = arg8 + var15 - arg6 - var17;
        int var20 = var16 - var14 - (var14 - var12);
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg2;
            int var34 = arg6 + (var28 + var32 + var30 >> 12);
            class414.method2648(var34, arg4, var10, (byte) -119, var11, var33);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lie;IIZLaa;IIIZIIII)V", line = 311)
    public static final void method1311(class4 arg0, int arg1, int arg2, boolean arg3, class281 arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        field2713++;
        if (!class67.method457(31862) && !class76.method542(client.field2349, arg7, arg11, (byte) 82, arg5)) {
            return;
        }
        if (class180.field2518 > arg11) {
            class180.field2518 = arg11;
        }
        class369 var13 = class310.method1961(arg12, (byte) 35);
        if (class16.field205 == 1 && var13.field5194) {
            return;
        }
        int var14;
        int var15;
        if (arg1 == 1 || arg1 == 3) {
            var15 = var13.field5215;
            var14 = var13.field5200;
        } else {
            var14 = var13.field5215;
            var15 = var13.field5200;
        }
        int var16;
        int var17;
        if (class432.field6220 < arg7 + var14) {
            var16 = arg7 + 1;
            var17 = arg7;
        } else {
            var17 = arg7 + (var14 >> 1);
            var16 = arg7 + (var14 + 1 >> 1);
        }
        int var18;
        int var19;
        if (arg5 + var15 > class267.field3646) {
            var18 = arg5;
            var19 = arg5 + 1;
        } else {
            var18 = (var15 >> 1) + arg5;
            var19 = (var15 + 1 >> 1) + arg5;
        }
        class156 var20 = class249.field3456[arg6];
        int var21 = var20.method275(var17, var18) + var20.method275(var16, var18) + var20.method275(var17, var19) + var20.method275(var16, var19) >> 2;
        int var22 = (arg7 << 7) + (var14 << 6);
        int var23 = (arg5 << 7) + (var15 << 6);
        boolean var24 = arg3 && !arg8 && var13.field5211;
        if (var13.method2366(arg10 + 3)) {
            class386.method2523(arg5, arg10 - 30104, (class437) null, arg11, arg1, var13, arg7, (class354) null);
        }
        boolean var25 = arg2 == -1 && var13.field5216 == -1 && var13.field5203 == null && var13.field5202 == null && !var13.field5197;
        if (class361.field5067 && var13.field5222 != 1) {
            return;
        }
        if (arg9 == 22) {
            if (class21.field280 || var13.field5221 != 0 || var13.field5192 == 1 || var13.field5207) {
                class127 var27;
                if (var25) {
                    class245 var26 = new class245(arg4, var13, arg6, var22, var21, var23, arg8, arg1, var24);
                    var27 = var26;
                    if (var26.method127((byte) 31)) {
                        var26.method122(arg4, (byte) 74);
                    }
                } else {
                    var27 = new class429(arg4, var13, arg1, arg11, arg6, var22, var21, var23, arg8, arg2);
                }
                class118.method800(arg11, arg7, arg5, var27);
                if (var13.field5192 == 1 && arg0 != null) {
                    arg0.method22(102, arg5, arg7);
                }
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class86 var65 = null;
            int var66;
            class430 var67;
            if (var25) {
                class86 var68 = new class86(arg4, var13, arg11, arg6, var22, var21, var23, arg8, arg7, var14 + arg7 - 1, arg5, var15 + arg5 - 1, arg9, arg1, var24);
                var67 = var68;
                var65 = var68;
                var66 = var68.method598((byte) -127);
            } else {
                var66 = 15;
                var67 = new class278(arg4, var13, arg9, arg1, arg11, arg6, var22, var21, var23, arg8, arg7, arg7 + var14 - 1, arg5, arg5 + var15 - 1, arg2);
            }
            if (class259.method1601(var67, false)) {
                if (var65 != null && var65.method127((byte) -94)) {
                    var65.method122(arg4, (byte) 68);
                }
                if (var13.field5209 && arg3) {
                    if (var66 > 30) {
                        var66 = 30;
                    }
                    for (int var69 = 0; var69 <= var14; var69++) {
                        for (int var70 = 0; var70 <= var15; var70++) {
                            var20.method268(arg7 + var69, arg5 + var70, var66);
                        }
                    }
                }
            }
            if (var13.field5192 != 0 && arg0 != null) {
                arg0.method36((byte) 41, var13.field5166, !var13.field5195, var15, arg7, var14, arg5);
            }
        } else if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
            class430 var29;
            if (var25) {
                class86 var28 = new class86(arg4, var13, arg11, arg6, var22, var21, var23, arg8, arg7, var14 + arg7 - 1, arg5, arg5 + var15 - 1, arg9, arg1, var24);
                var29 = var28;
                if (var28.method127((byte) 119)) {
                    var28.method122(arg4, (byte) 84);
                }
            } else {
                var29 = new class278(arg4, var13, arg9, arg1, arg11, arg6, var22, var21, var23, arg8, arg7, arg7 + var14 - 1, arg5, arg5 - (1 - var15), arg2);
            }
            class259.method1601(var29, false);
            if (arg3 && !arg8 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg11 > 0 && var13.field5222 != 0) {
                class267.field3651[arg11][arg7][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5], 4);
            }
            if (var13.field5192 != 0 && arg0 != null) {
                arg0.method36((byte) 41, var13.field5166, !var13.field5195, var15, arg7, var14, arg5);
            }
        } else if (arg9 == 0) {
            class254 var30;
            if (var25) {
                class135 var31 = new class135(arg4, var13, arg6, var22, var21, var23, arg8, arg9, arg1, var24);
                var30 = var31;
                if (var31.method127((byte) 71)) {
                    var31.method122(arg4, (byte) 33);
                }
            } else {
                var30 = new class20(arg4, var13, 0, arg1, arg11, arg6, var22, var21, var23, arg8, arg2);
            }
            class4.method35(arg11, arg7, arg5, var30, (class254) null);
            if (arg3) {
                if (arg1 == 0) {
                    if (var13.field5209) {
                        var20.method268(arg7, arg5, 50);
                        var20.method268(arg7, arg5 + 1, 50);
                    }
                    if (var13.field5222 == 1 && !arg8) {
                        class267.field3651[arg11][arg7][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5], 1);
                    }
                } else if (arg1 == 1) {
                    if (var13.field5209) {
                        var20.method268(arg7, arg5 + 1, 50);
                        var20.method268(arg7 + 1, arg5 + 1, 50);
                    }
                    if (var13.field5222 == 1 && !arg8) {
                        class267.field3651[arg11][arg7][arg5 + 1] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var13.field5209) {
                        var20.method268(arg7 + 1, arg5, 50);
                        var20.method268(arg7 + 1, arg5 + 1, 50);
                    }
                    if (var13.field5222 == 1 && !arg8) {
                        class267.field3651[arg11][arg7 + 1][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7 + 1][arg5], 1);
                    }
                } else if (arg1 == 3) {
                    if (var13.field5209) {
                        var20.method268(arg7, arg5, 50);
                        var20.method268(arg7 + 1, arg5, 50);
                    }
                    if (var13.field5222 == 1 && !arg8) {
                        class267.field3651[arg11][arg7][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5], 2);
                    }
                }
            }
            if (var13.field5192 != 0 && arg0 != null) {
                arg0.method38(arg9, arg5, !var13.field5195, arg10 - 124, arg1, arg7, var13.field5166);
            }
            if (var13.field5224 != 16) {
                class14.method80(arg11, arg7, arg5, var13.field5224);
            }
        } else if (arg9 == 1) {
            class254 var32;
            if (var25) {
                class135 var33 = new class135(arg4, var13, arg6, var22, var21, var23, arg8, arg9, arg1, var24);
                if (var33.method127((byte) -124)) {
                    var33.method122(arg4, (byte) 31);
                }
                var32 = var33;
            } else {
                var32 = new class20(arg4, var13, 1, arg1, arg11, arg6, var22, var21, var23, arg8, arg2);
            }
            class4.method35(arg11, arg7, arg5, var32, (class254) null);
            if (var13.field5209 && arg3) {
                if (arg1 == 0) {
                    var20.method268(arg7, arg5 + 1, 50);
                } else if (arg1 == 1) {
                    var20.method268(arg7 + 1, arg5 + 1, 50);
                } else if (arg1 == 2) {
                    var20.method268(arg7 + 1, arg5, 50);
                } else if (arg1 == 3) {
                    var20.method268(arg7, arg5, 50);
                }
            }
            if (var13.field5192 != 0 && arg0 != null) {
                arg0.method38(arg9, arg5, !var13.field5195, -127, arg1, arg7, var13.field5166);
            }
        } else if (~arg9 == arg10) {
            int var34 = arg1 + 1 & 0x3;
            class254 var37;
            class254 var38;
            if (var25) {
                class135 var35 = new class135(arg4, var13, arg6, var22, var21, var23, arg8, arg9, arg1 + 4, var24);
                class135 var36 = new class135(arg4, var13, arg6, var22, var21, var23, arg8, arg9, var34, var24);
                if (var35.method127((byte) -108)) {
                    var35.method122(arg4, (byte) 104);
                }
                var37 = var35;
                var38 = var36;
                if (var36.method127((byte) 93)) {
                    var36.method122(arg4, (byte) 120);
                }
            } else {
                var37 = new class20(arg4, var13, 2, arg1 + 4, arg11, arg6, var22, var21, var23, arg8, arg2);
                var38 = new class20(arg4, var13, 2, var34, arg11, arg6, var22, var21, var23, arg8, arg2);
            }
            class4.method35(arg11, arg7, arg5, var37, var38);
            if (var13.field5222 == 1 && arg3 && !arg8) {
                if (arg1 == 0) {
                    class267.field3651[arg11][arg7][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5], 1);
                    class267.field3651[arg11][arg7][arg5 + 1] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5 + 1], 2);
                } else if (arg1 == 1) {
                    class267.field3651[arg11][arg7][arg5 + 1] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5 + 1], 2);
                    class267.field3651[arg11][arg7 + 1][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7 + 1][arg5], 1);
                } else if (arg1 == 2) {
                    class267.field3651[arg11][arg7 + 1][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7 + 1][arg5], 1);
                    class267.field3651[arg11][arg7][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5], 2);
                } else if (arg1 == 3) {
                    class267.field3651[arg11][arg7][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5], 2);
                    class267.field3651[arg11][arg7][arg5] = (byte) class311.method1970(class267.field3651[arg11][arg7][arg5], 1);
                }
            }
            if (var13.field5192 != 0 && arg0 != null) {
                arg0.method38(arg9, arg5, !var13.field5195, arg10 - 123, arg1, arg7, var13.field5166);
            }
            if (var13.field5224 != 16) {
                class14.method80(arg11, arg7, arg5, var13.field5224);
            }
        } else if (arg9 == 3) {
            class254 var40;
            if (var25) {
                class135 var39 = new class135(arg4, var13, arg6, var22, var21, var23, arg8, arg9, arg1, var24);
                var40 = var39;
                if (var39.method127((byte) -13)) {
                    var39.method122(arg4, (byte) 87);
                }
            } else {
                var40 = new class20(arg4, var13, 3, arg1, arg11, arg6, var22, var21, var23, arg8, arg2);
            }
            class4.method35(arg11, arg7, arg5, var40, (class254) null);
            if (var13.field5209 && arg3) {
                if (arg1 == 0) {
                    var20.method268(arg7, arg5 + 1, 50);
                } else if (arg1 == 1) {
                    var20.method268(arg7 + 1, arg5 + 1, 50);
                } else if (arg1 == 2) {
                    var20.method268(arg7 + 1, arg5, 50);
                } else if (arg1 == 3) {
                    var20.method268(arg7, arg5, 50);
                }
            }
            if (var13.field5192 != 0 && arg0 != null) {
                arg0.method38(arg9, arg5, !var13.field5195, -125, arg1, arg7, var13.field5166);
            }
        } else if (arg9 == 9) {
            class430 var41;
            if (var25) {
                class86 var42 = new class86(arg4, var13, arg11, arg6, var22, var21, var23, arg8, arg7, arg7, arg5, arg5, arg9, arg1, var24);
                var41 = var42;
                if (var42.method127((byte) -109)) {
                    var42.method122(arg4, (byte) 19);
                }
            } else {
                var41 = new class278(arg4, var13, arg9, arg1, arg11, arg6, var22, var21, var23, arg8, arg7, arg7 + var14 - 1, arg5, arg5 + var15 - 1, arg2);
            }
            class259.method1601(var41, false);
            if (var13.field5192 != 0 && arg0 != null) {
                arg0.method36((byte) 41, var13.field5166, !var13.field5195, var15, arg7, var14, arg5);
            }
            if (var13.field5224 != 16) {
                class14.method80(arg11, arg7, arg5, var13.field5224);
            }
        } else if (arg9 == 4) {
            class81 var43;
            if (var25) {
                class230 var44 = new class230(arg4, var13, arg6, var22, var21, var23, arg8, 0, 0, 0, arg9, arg1);
                var43 = var44;
                if (var44.method127((byte) 124)) {
                    var44.method122(arg4, (byte) 66);
                }
            } else {
                var43 = new class155(arg4, var13, arg9, arg1, arg11, arg6, var22, var21, var23, arg8, 0, 0, 0, arg2);
            }
            class299.method1931(arg11, arg7, arg5, var43, (class81) null);
        } else if (arg9 == 5) {
            int var45 = 16;
            class161 var46 = (class161) class57.method381(arg11, arg7, arg5);
            if (var46 != null) {
                var45 = class310.method1961(var46.method126(arg10 ^ 0x34AB), (byte) 35).field5224;
            }
            class81 var47;
            if (var25) {
                class230 var48 = new class230(arg4, var13, arg6, var22, var21, var23, arg8, 0, class64.field987[arg1] * var45, class71.field1104[arg1] * var45, arg9, arg1);
                var47 = var48;
                if (var48.method127((byte) 74)) {
                    var48.method122(arg4, (byte) 42);
                }
            } else {
                var47 = new class155(arg4, var13, arg9, arg1, arg11, arg6, var22, var21, var23, arg8, 0, class64.field987[arg1] * var45, class71.field1104[arg1] * var45, arg2);
            }
            class299.method1931(arg11, arg7, arg5, var47, (class81) null);
        } else if (arg9 == 6) {
            int var49 = 8;
            class161 var50 = (class161) class57.method381(arg11, arg7, arg5);
            if (var50 != null) {
                var49 = class310.method1961(var50.method126(-13482), (byte) 35).field5224 / 2;
            }
            class81 var52;
            if (var25) {
                class230 var51 = new class230(arg4, var13, arg6, var22, var21, var23, arg8, arg1, class64.field987[arg1] * var49, class71.field1104[arg1] * var49, arg9, arg1 + 4);
                var52 = var51;
                if (var51.method127((byte) 48)) {
                    var51.method122(arg4, (byte) 105);
                }
            } else {
                var52 = new class155(arg4, var13, arg9, arg1 + 4, arg11, arg6, var22, var21, var23, arg8, arg1, class403.field5869[arg1] * var49, class146.field2127[arg1] * var49, arg2);
            }
            class299.method1931(arg11, arg7, arg5, var52, (class81) null);
        } else if (arg9 == 7) {
            int var53 = arg1 + 2 & 0x3;
            class81 var54;
            if (var25) {
                class230 var55 = new class230(arg4, var13, arg6, var22, var21, var23, arg8, var53, 0, 0, arg9, var53 + 4);
                if (var55.method127((byte) 1)) {
                    var55.method122(arg4, (byte) 77);
                }
                var54 = var55;
            } else {
                var54 = new class155(arg4, var13, arg9, var53 + 4, arg11, arg6, var22, var21, var23, arg8, var53, 0, 0, arg2);
            }
            class299.method1931(arg11, arg7, arg5, var54, (class81) null);
        } else if (arg9 == 8) {
            int var56 = arg1 + 2 & 0x3;
            int var57 = 8;
            class161 var58 = (class161) class57.method381(arg11, arg7, arg5);
            if (var58 != null) {
                var57 = class310.method1961(var58.method126(-13482), (byte) 35).field5224 / 2;
            }
            class81 var60;
            class81 var62;
            if (var25) {
                class230 var63 = new class230(arg4, var13, arg6, var22, var21, var23, arg8, arg1, class403.field5869[arg1] * var57, class146.field2127[arg1] * var57, arg9, arg1 + 4);
                class230 var64 = new class230(arg4, var13, arg6, var22, var21, var23, arg8, arg1, 0, 0, arg9, var56 + 4);
                if (var63.method127((byte) -105)) {
                    var63.method122(arg4, (byte) 91);
                }
                var62 = var64;
                var60 = var63;
                if (var64.method127((byte) 119)) {
                    var64.method122(arg4, (byte) 55);
                }
            } else {
                class155 var59 = new class155(arg4, var13, arg9, arg1 + 4, arg11, arg6, var22, var21, var23, arg8, arg1, class403.field5869[arg1] * var57, class146.field2127[arg1] * var57, arg2);
                var60 = var59;
                class155 var61 = new class155(arg4, var13, arg9, var56 + 4, arg11, arg6, var22, var21, var23, arg8, arg1, 0, 0, arg2);
                var62 = var61;
            }
            class299.method1931(arg11, arg7, arg5, var60, var62);
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Lmh;", line = 926)
    public final class376 method1312(byte arg0) {
        if (arg0 != 25) {
            this.method1300((byte) -124);
        }
        field2704++;
        class376 var2 = this.field2720.field5365;
        if (this.field2720 == var2) {
            this.field2723 = null;
            return null;
        } else {
            this.field2723 = var2.field5365;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)Lmh;", line = 957)
    public final class376 method1313(int arg0) {
        field2714++;
        if (arg0 != -14122) {
            this.method1315(126);
        }
        class376 var2 = this.field2720.field5369;
        if (this.field2720 == var2) {
            this.field2723 = null;
            return null;
        } else {
            this.field2723 = var2.field5369;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)Lmh;", line = 982)
    public final class376 method1314(byte arg0) {
        field2705++;
        int var2 = -62 / ((-arg0 - 65) / 54);
        class376 var3 = this.field2720.field5365;
        if (this.field2720 == var3) {
            return null;
        } else {
            var3.method2459(198);
            return var3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 1000)
    public final void method1315(int arg0) {
        while (true) {
            class376 var2 = this.field2720.field5365;
            if (this.field2720 == var2) {
                if (arg0 <= 118) {
                    this.field2720 = null;
                }
                field2716++;
                this.field2723 = null;
                return;
            }
            var2.method2459(198);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltc;BLmh;)V", line = 1026)
    private final void method1316(class196 arg0, byte arg1, class376 arg2) {
        field2708++;
        class376 var4 = this.field2720.field5369;
        if (arg1 != 39) {
            return;
        }
        this.field2720.field5369 = arg2.field5369;
        arg2.field5369.field5365 = this.field2720;
        if (this.field2720 != arg2) {
            arg2.field5369 = arg0.field2720.field5369;
            arg2.field5369.field5365 = arg2;
            arg0.field2720.field5369 = var4;
            var4.field5365 = arg0.field2720;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 1055)
    public class196() {
        this.field2720.field5365 = this.field2720;
        this.field2720.field5369 = this.field2720;
    }
}
