import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class41 {

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[I")
    private int[] field661;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lce;")
    public static class126 field650 = class206.method1445(-7923, ")1a2)1m");

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field669 = 0;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lml;")
    public static class160 field659 = new class160(30);

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Lce;")
    public static class126 field671 = class206.method1445(-7923, "Fertigkeit: ");

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "F")
    public static float field655;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lwg;")
    public static class178 field657;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Ljk;")
    public static class273 field652;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method257(boolean arg0) {
        int var1 = -1;
        if (!arg0) {
            method257(false);
        }
        while (class239.field4036 > var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class166.field2958[var1];
            }
            class301 var3 = class85.field1352[var2];
            if (var3 != null) {
                class298.method2011(64, var3.method1013(false), var3);
            }
            var1++;
        }
        field668++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIIIIII)I", line = 43)
    public static final int method258(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 89 / ((-arg0 - 39) / 54);
        if ((arg5 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        int var9 = arg6 & 0x3;
        field663++;
        if (var9 == 0) {
            return arg2;
        } else if (var9 == 1) {
            return arg4;
        } else if (var9 == 2) {
            return 7 - arg2 - (arg3 + -1);
        } else {
            return 1 + 7 - arg1 - arg4;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILgd;)V", line = 82)
    public static final void method259(int arg0, class138 arg1) {
        field653++;
        int var2 = arg1.field2455 - class249.field4174;
        int var3 = arg1.field2469 * 128 + arg1.method1013(false) * 64;
        int var4 = arg1.field2452 * 128 + (arg1.method1013(false) * 64);
        arg1.field2461 += (var3 - arg1.field2461) / var2;
        arg1.field2487 += (var4 - arg1.field2487) / var2;
        if (~arg1.field2499 == arg0) {
            arg1.field2444 = 1024;
        }
        if (arg1.field2499 == 1) {
            arg1.field2444 = 1536;
        }
        arg1.field2490 = 0;
        if (arg1.field2499 == 2) {
            arg1.field2444 = 0;
        }
        if (arg1.field2499 == 3) {
            arg1.field2444 = 512;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lcc;B)V", line = 114)
    public static final void method260(class313 arg0, byte arg1) {
        field667++;
        class288.field4786 = arg0;
        class262.field4386 = class288.field4786.method2165(arg1 ^ 0x1E, 16);
        if (arg1 != 30) {
            method261((class260) null, -20, 122, -23, 99, -123, 60, -45, false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lcf;IIIIIIIZ)V", line = 135)
    public static final void method261(class260 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class39.field625;
        int var11;
        int var12 = var11 = (arg7 << 7) - class318.field5452;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class264.field4396[arg1][arg6][arg7] - class189.field3241;
        int var18 = class264.field4396[arg1][arg6 + 1][arg7] - class189.field3241;
        int var19 = class264.field4396[arg1][arg6 + 1][arg7 + 1] - class189.field3241;
        int var20 = class264.field4396[arg1][arg6][arg7 + 1] - class189.field3241;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class236.field3981;
        int var46 = (var24 << 9) / var25 + class236.field3976;
        int var47 = (var27 << 9) / var31 + class236.field3981;
        int var48 = (var30 << 9) / var31 + class236.field3976;
        int var49 = (var33 << 9) / var37 + class236.field3981;
        int var50 = (var36 << 9) / var37 + class236.field3976;
        int var51 = (var39 << 9) / var43 + class236.field3981;
        int var52 = (var42 << 9) / var43 + class236.field3976;
        class236.field3972 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class27.field377 && class85.method594(class301.field4997 + class236.field3981, class318.field5455 + class236.field3976, var50, var52, var48, var49, var51, var47)) {
                class152.field2786 = arg6;
                class40.field637 = arg7;
            }
            if (!class56.field846 && !arg8) {
                class236.field3986 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class236.field3984 || var51 > class236.field3984 || var47 > class236.field3984) {
                    class236.field3986 = true;
                }
                if (arg0.field4364 == -1) {
                    if (arg0.field4365 != 12345678) {
                        class236.method1626(var50, var52, var48, var49, var51, var47, arg0.field4365, arg0.field4360, arg0.field4356);
                    }
                } else if (!class44.field684) {
                    int var53 = class236.field3987.method597(arg0.field4364, (byte) -98);
                    class236.method1626(var50, var52, var48, var49, var51, var47, class232.method1579(var53, arg0.field4365), class232.method1579(var53, arg0.field4360), class232.method1579(var53, arg0.field4356));
                } else if (arg0.field4369) {
                    class236.method1617(var50, var52, var48, var49, var51, var47, arg0.field4365, arg0.field4360, arg0.field4356, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4364);
                } else {
                    class236.method1617(var50, var52, var48, var49, var51, var47, arg0.field4365, arg0.field4360, arg0.field4356, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4364);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class27.field377 && class85.method594(class301.field4997 + class236.field3981, class318.field5455 + class236.field3976, var46, var48, var52, var45, var47, var51)) {
            class152.field2786 = arg6;
            class40.field637 = arg7;
        }
        if (class56.field846 || arg8) {
            return;
        }
        class236.field3986 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class236.field3984 || var47 > class236.field3984 || var51 > class236.field3984) {
            class236.field3986 = true;
        }
        if (arg0.field4364 == -1) {
            if (arg0.field4357 != 12345678) {
                class236.method1626(var46, var48, var52, var45, var47, var51, arg0.field4357, arg0.field4356, arg0.field4360);
            }
        } else if (class44.field684) {
            class236.method1617(var46, var48, var52, var45, var47, var51, arg0.field4357, arg0.field4356, arg0.field4360, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4364);
        } else {
            int var54 = class236.field3987.method597(arg0.field4364, (byte) -98);
            class236.method1626(var46, var48, var52, var45, var47, var51, class232.method1579(var54, arg0.field4357), class232.method1579(var54, arg0.field4356), class232.method1579(var54, arg0.field4360));
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lui;III)V", line = 293)
    public static final void method262(class89 arg0, int arg1, int arg2, int arg3) {
        field664++;
        if (arg3 != 0) {
            field657 = (class178) null;
        }
        if (arg0.field2476 == arg2 && arg2 != -1) {
            class294 var4 = class110.method721(-127, arg2);
            int var5 = var4.field4884;
            if (var5 == 1) {
                arg0.field2508 = 0;
                arg0.field2484 = 0;
                arg0.field2449 = arg1;
                arg0.field2509 = 0;
                class241.method1660(arg0.field2509, arg0.field2461, false, arg0.field2487, var4, (byte) -83);
            }
            if (var5 == 2) {
                arg0.field2508 = 0;
            }
        } else if (arg2 == -1 || arg0.field2476 == -1 || class110.method721(-128, arg2).field4878 >= class110.method721(-126, arg0.field2476).field4878) {
            arg0.field2485 = arg0.field2489;
            arg0.field2509 = 0;
            arg0.field2449 = arg1;
            arg0.field2508 = 0;
            arg0.field2476 = arg2;
            arg0.field2484 = 0;
            if (arg0.field2476 != -1) {
                class241.method1660(arg0.field2509, arg0.field2461, false, arg0.field2487, class110.method721(arg3 ^ 0xFFFFFF81, arg0.field2476), (byte) -113);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lce;B)I", line = 361)
    public static final int method263(class126 arg0, byte arg1) {
        field656++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class14.field197; var2++) {
            if (arg0.method881(class298.field4953[var2], (byte) 92)) {
                return var2;
            }
        }
        if (arg1 < 77) {
            field671 = (class126) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILcc;I)Ljk;", line = 388)
    public static final class273 method264(int arg0, int arg1, class313 arg2, int arg3) {
        field658++;
        if (class298.method2012(arg0, (byte) -110, arg2, arg3)) {
            if (arg1 != -14151) {
                field670 = 107;
            }
            return class10.method62((byte) -59);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V", line = 402)
    public static void method265(boolean arg0) {
        field652 = null;
        if (!arg0) {
            field655 = 1.3614824F;
        }
        field671 = null;
        field659 = null;
        field657 = null;
        field650 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Laf;", line = 417)
    public static final class181 method266(int arg0, int arg1, int arg2) {
        field662++;
        class181 var3 = new class181();
        class229 var4 = (class229) class100.field1616.method898((byte) -104);
        if (arg2 != -2294) {
            field652 = (class273) null;
        }
        while (var4 != null) {
            if (var4.field3860 && var4.method1555(arg1, 0, arg0)) {
                var3.method1295(-116, var4);
            }
            var4 = (class229) class100.field1616.method893((byte) -75);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I", line = 444)
    public final int method267(int arg0, byte arg1) {
        field666++;
        int var3 = (this.field661.length >> 1) - 1;
        if (arg1 != 37) {
            field650 = (class126) null;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field661[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field661[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([I)V", line = 482)
    public class41(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field661 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field661[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field661[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field661[var5 + var5] = arg0[var4];
            this.field661[var5 + var5 + 1] = var4++;
        }
    }
}
