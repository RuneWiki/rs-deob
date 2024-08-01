import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wh")
public class class210 {

    @OriginalMember(owner = "wh", name = "e", descriptor = "Llf;")
    public static class109 field4083 = class35.method275("Ladevorgang )2 bitte warten Sie)3", 2);

    @OriginalMember(owner = "wh", name = "f", descriptor = "Llf;")
    public static class109 field4084 = class35.method275("::gc", 2);

    @OriginalMember(owner = "wh", name = "a", descriptor = "Le;")
    public static class41 field4079 = new class41();

    @OriginalMember(owner = "wh", name = "g", descriptor = "Llf;")
    private static class109 field4085 = class35.method275("Please remove ", 2);

    @OriginalMember(owner = "wh", name = "h", descriptor = "Llf;")
    public static class109 field4086 = field4085;

    @OriginalMember(owner = "wh", name = "j", descriptor = "Llf;")
    public static class109 field4088 = field4085;

    @OriginalMember(owner = "wh", name = "i", descriptor = "Lrc;")
    public static class160 field4087 = new class160(30);

    @OriginalMember(owner = "wh", name = "k", descriptor = "Ltf;")
    public static class181 field4089 = new class181();

    @OriginalMember(owner = "wh", name = "m", descriptor = "Llf;")
    private static class109 field4091 = class35.method275("glow1:", 2);

    @OriginalMember(owner = "wh", name = "l", descriptor = "Llf;")
    public static class109 field4090 = field4091;

    @OriginalMember(owner = "wh", name = "p", descriptor = "I")
    public static int field4094 = -1;

    @OriginalMember(owner = "wh", name = "o", descriptor = "Llf;")
    public static class109 field4093 = class35.method275("Willkommen auf RuneScape", 2);

    @OriginalMember(owner = "wh", name = "n", descriptor = "Llf;")
    public static class109 field4092 = class35.method275("<br>", 2);

    @OriginalMember(owner = "wh", name = "q", descriptor = "Llf;")
    public static class109 field4095 = field4091;

    @OriginalMember(owner = "wh", name = "b", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "wh", name = "d", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "wh", name = "c", descriptor = "[Ldf;")
    public static class37[] field4081;

    @OriginalMember(owner = "wh", name = "a", descriptor = "(ILsd;III)V")
    public static final void method1366(int arg0, class170 arg1, int arg2, int arg3, int arg4) {
        field4082++;
        if (class149.field2882 >= 400) {
            return;
        }
        if (arg1.field3170 != null) {
            arg1 = arg1.method1137(-1);
        }
        if (arg1 == null || !arg1.field3192) {
            return;
        }
        if (arg3 <= 98) {
            field4084 = null;
        }
        class109 var5 = arg1.field3154;
        if (arg1.field3156 != 0) {
            var5 = class36.method279(new class109[] { var5, class19.method181(arg1.field3156, class157.field2955.field3475, 32139), class29.field627, class92.field1903, class52.method345((byte) 85, arg1.field3156), class70.field1376 }, -104);
        }
        if (class140.field2725 == 1) {
            class107.field2124++;
            class12.method81(arg2, arg0, class70.field1350, (short) 26, (long) arg4, 500, class36.method279(new class109[] { class204.field4001, class95.field1941, var5 }, -87));
        } else if (!class123.field2360) {
            class18.field408++;
            class109[] var6 = arg1.field3184;
            if (class10.field165) {
                var6 = class103.method741((byte) -104, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method778((byte) -121, class91.field1876)) {
                        class160.field3004++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 37;
                        }
                        if (var7 == 1) {
                            var8 = 6;
                        }
                        if (var7 == 2) {
                            var8 = 35;
                        }
                        if (var7 == 3) {
                            var8 = 9;
                        }
                        if (var7 == 4) {
                            var8 = 32;
                        }
                        class12.method81(arg2, arg0, var6[var7], var8, (long) arg4, 500, class36.method279(new class109[] { class111.field2189, var5 }, 123));
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method778((byte) -121, class91.field1876)) {
                        class159.field2983++;
                        short var10 = 0;
                        if (arg1.field3156 > class157.field2955.field3475) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 37;
                        }
                        if (var9 == 1) {
                            var11 = 6;
                        }
                        if (var9 == 2) {
                            var11 = 35;
                        }
                        if (var9 == 3) {
                            var11 = 9;
                        }
                        if (var9 == 4) {
                            var11 = 32;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class12.method81(arg2, arg0, var6[var9], var11, (long) arg4, 500, class36.method279(new class109[] { class111.field2189, var5 }, -8));
                    }
                }
            }
            class12.method81(arg2, arg0, class55.field1103, (short) 1004, (long) arg4, 500, class36.method279(new class109[] { class111.field2189, var5 }, 121));
        } else if ((class156.field2939 & 0x2) == 2) {
            class46.field958++;
            class12.method81(arg2, arg0, class116.field2296, (short) 51, (long) arg4, 500, class36.method279(new class109[] { class170.field3161, class95.field1941, var5 }, 119));
            return;
        }
    }

    @OriginalMember(owner = "wh", name = "a", descriptor = "(I)V")
    public static void method1367(int arg0) {
        field4087 = null;
        field4095 = null;
        if (arg0 > -52) {
            return;
        }
        field4088 = null;
        field4079 = null;
        field4090 = null;
        field4085 = null;
        field4081 = null;
        field4083 = null;
        field4091 = null;
        field4092 = null;
        field4093 = null;
        field4089 = null;
        field4086 = null;
        field4084 = null;
    }

    @OriginalMember(owner = "wh", name = "a", descriptor = "(IIIILlb;ZIII)V")
    public static final void method1368(int arg0, int arg1, int arg2, int arg3, class105 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field4080++;
        class78 var9 = class140.method1000(arg0, 0);
        int var10;
        int var11;
        if (arg1 == 1 || arg1 == 3) {
            var11 = var9.field1501;
            var10 = var9.field1498;
        } else {
            var10 = var9.field1501;
            var11 = var9.field1498;
        }
        int var12;
        int var13;
        if (arg3 + var11 <= 104) {
            var12 = arg3 + (var11 + 1 >> 1);
            var13 = (var11 >> 1) + arg3;
        } else {
            var12 = arg3 + 1;
            var13 = arg3;
        }
        int var14;
        int var15;
        if (arg7 + var10 <= 104) {
            var14 = (var10 >> 1) + arg7;
            var15 = arg7 + (var10 + 1 >> 1);
        } else {
            var14 = arg7;
            var15 = arg7 + 1;
        }
        int[][] var16 = class184.field3448[arg6];
        if (!arg5) {
            field4083 = null;
        }
        int var17 = var16[var14][var13] + var16[var15][var12] + var16[var14][var12] + var16[var15][var13] >> 2;
        int var18 = (arg7 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = (long) (arg1 << 20 | arg2 << 14 | arg7 | arg3 << 7 | 0x40000000);
        if (var9.field1527 == 0) {
            var20 |= Long.MIN_VALUE;
        }
        if (var9.field1502 == 1) {
            var20 |= 0x400000L;
        }
        long var22 = var20 | (long) arg0 << 32;
        if (arg2 == 22) {
            class95 var24;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var24 = var9.method500(true, var18, arg1, var17, var16, 22, var19);
            } else {
                var24 = new class19(arg0, 22, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class169.method1132(arg8, arg7, arg3, var17, var24, var22);
            if (var9.field1511 == 1) {
                arg4.method757(arg3, arg7, (byte) 123);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class95 var50;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var50 = var9.method500(arg5, var18, arg1, var17, var16, 10, var19);
            } else {
                var50 = new class19(arg0, 10, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            if (var50 != null) {
                class206.method1350(arg8, arg7, arg3, var17, var10, var11, var50, arg2 == 11 ? 256 : 0, var22);
            }
            if (var9.field1511 != 0) {
                arg4.method752(arg7, var10, arg5, var9.field1539, arg3, var11);
            }
        } else if (arg2 >= 12) {
            class95 var25;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var25 = var9.method500(true, var18, arg1, var17, var16, arg2, var19);
            } else {
                var25 = new class19(arg0, arg2, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class206.method1350(arg8, arg7, arg3, var17, 1, 1, var25, 0, var22);
            if (var9.field1511 != 0) {
                arg4.method752(arg7, var10, true, var9.field1539, arg3, var11);
            }
        } else if (arg2 == 0) {
            class95 var26;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var26 = var9.method500(true, var18, arg1, var17, var16, 0, var19);
            } else {
                var26 = new class19(arg0, 0, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class127.method923(arg8, arg7, arg3, var17, var26, null, class21.field471[arg1], 0, var22);
            if (var9.field1511 != 0) {
                arg4.method756(arg7, var9.field1539, arg1, -1, arg2, arg3);
            }
        } else if (arg2 == 1) {
            class95 var27;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var27 = var9.method500(true, var18, arg1, var17, var16, 1, var19);
            } else {
                var27 = new class19(arg0, 1, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class127.method923(arg8, arg7, arg3, var17, var27, null, class24.field535[arg1], 0, var22);
            if (var9.field1511 != 0) {
                arg4.method756(arg7, var9.field1539, arg1, -1, arg2, arg3);
            }
        } else if (arg2 == 2) {
            int var28 = arg1 + 1 & 0x3;
            class95 var29;
            class95 var30;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var29 = var9.method500(true, var18, arg1 + 4, var17, var16, 2, var19);
                var30 = var9.method500(true, var18, var28, var17, var16, 2, var19);
            } else {
                var29 = new class19(arg0, 2, arg1 + 4, arg6, arg7, arg3, var9.field1544, true, null);
                var30 = new class19(arg0, 2, var28, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class127.method923(arg8, arg7, arg3, var17, var29, var30, class21.field471[arg1], class21.field471[var28], var22);
            if (var9.field1511 != 0) {
                arg4.method756(arg7, var9.field1539, arg1, -1, arg2, arg3);
            }
        } else if (arg2 == 3) {
            class95 var31;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var31 = var9.method500(true, var18, arg1, var17, var16, 3, var19);
            } else {
                var31 = new class19(arg0, 3, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class127.method923(arg8, arg7, arg3, var17, var31, null, class24.field535[arg1], 0, var22);
            if (var9.field1511 != 0) {
                arg4.method756(arg7, var9.field1539, arg1, -1, arg2, arg3);
            }
        } else if (arg2 == 9) {
            class95 var32;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var32 = var9.method500(true, var18, arg1, var17, var16, arg2, var19);
            } else {
                var32 = new class19(arg0, arg2, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class206.method1350(arg8, arg7, arg3, var17, 1, 1, var32, 0, var22);
            if (var9.field1511 != 0) {
                arg4.method752(arg7, var10, true, var9.field1539, arg3, var11);
            }
        } else if (arg2 == 4) {
            class95 var33;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var33 = var9.method500(arg5, var18, arg1, var17, var16, 4, var19);
            } else {
                var33 = new class19(arg0, 4, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class36.method277(arg8, arg7, arg3, var17, var33, null, class21.field471[arg1], 0, 0, 0, var22);
        } else if (arg2 == 5) {
            long var34 = class18.method155(arg8, arg7, arg3);
            int var36 = 16;
            if (var34 != 0L) {
                var36 = class140.method1000((int) (var34 >>> 32) & Integer.MAX_VALUE, 0).field1510;
            }
            class95 var37;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var37 = var9.method500(true, var18, arg1, var17, var16, 4, var19);
            } else {
                var37 = new class19(arg0, 4, arg1, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class36.method277(arg8, arg7, arg3, var17, var37, null, class21.field471[arg1], 0, class95.field1939[arg1] * var36, class203.field3996[arg1] * var36, var22);
        } else if (arg2 == 6) {
            int var38 = 8;
            long var39 = class18.method155(arg8, arg7, arg3);
            if (var39 != 0L) {
                var38 = class140.method1000(Integer.MAX_VALUE & (int) (var39 >>> 32), 0).field1510 / 2;
            }
            class95 var41;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var41 = var9.method500(arg5, var18, arg1 + 4, var17, var16, 4, var19);
            } else {
                var41 = new class19(arg0, 4, arg1 + 4, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class36.method277(arg8, arg7, arg3, var17, var41, null, 256, arg1, class42.field885[arg1] * var38, class103.field2045[arg1] * var38, var22);
        } else if (arg2 == 7) {
            int var42 = arg1 + 2 & 0x3;
            class95 var43;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var43 = var9.method500(true, var18, var42 + 4, var17, var16, 4, var19);
            } else {
                var43 = new class19(arg0, 4, var42 + 4, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class36.method277(arg8, arg7, arg3, var17, var43, null, 256, var42, 0, 0, var22);
        } else if (arg2 == 8) {
            long var44 = class18.method155(arg8, arg7, arg3);
            int var46 = 8;
            if (var44 != 0L) {
                var46 = class140.method1000(Integer.MAX_VALUE & (int) (var44 >>> 32), 0).field1510 / 2;
            }
            int var47 = arg1 + 2 & 0x3;
            class95 var48;
            class95 var49;
            if (var9.field1544 == -1 && var9.field1528 == null) {
                var48 = var9.method500(true, var18, arg1 + 4, var17, var16, 4, var19);
                var49 = var9.method500(true, var18, var47 + 4, var17, var16, 4, var19);
            } else {
                var48 = new class19(arg0, 4, arg1 + 4, arg6, arg7, arg3, var9.field1544, true, null);
                var49 = new class19(arg0, 4, var47 + 4, arg6, arg7, arg3, var9.field1544, true, null);
            }
            class36.method277(arg8, arg7, arg3, var17, var48, var49, 256, arg1, class42.field885[arg1] * var46, class103.field2045[arg1] * var46, var22);
        }
    }
}
