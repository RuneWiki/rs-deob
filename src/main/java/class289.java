import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class289 {

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4552 = -1;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Z")
    public static boolean field4554 = true;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lpb;")
    public static class85 field4551 = class211.method1542((byte) 51);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method2032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field4549++;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg7 - arg3;
        int var12 = arg6 - arg3;
        int var13 = arg7 * arg7;
        int var14 = arg6 * arg6;
        int var15 = var12 * var12;
        int var16 = var13 << 1;
        int var17 = var11 * var11;
        int var18 = var14 << 1;
        int var19 = var15 << 1;
        int var20 = arg6 << 1;
        int var21 = var12 << 1;
        int var22 = var14 - ((var20 - 1) * var16);
        int var23 = var17 << 1;
        int var24 = (1 - var21) * var17 + var19;
        int var25 = var15 - ((var21 - 1) * var23);
        int var26 = (1 - var20) * var13 + var18;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var17 << 2;
        int var30 = var15 << 2;
        int var31 = var18 * 3;
        int var32 = (arg5 + var21) * var23;
        int var33 = var19 * 3;
        int var34 = var28;
        int var35 = (arg6 - 1) * var27;
        int var36 = (var20 - 3) * var16;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class221.field3443[arg4];
        class323.method2273(arg2 - arg7, arg0, var39, arg2 - var11, arg5 + 120);
        class323.method2273(arg2 - var11, arg1, var39, arg2 + var11, arg5 + 85);
        class323.method2273(arg2 + var11, arg0, var39, arg2 + arg7, arg5 ^ 0xFFFFFF93);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var26 < 0) {
                while (var26 < 0) {
                    var26 += var31;
                    var31 += var28;
                    var22 += var34;
                    var8++;
                    var34 += var28;
                }
            }
            if (var22 < 0) {
                var26 += var31;
                var22 += var34;
                var31 += var28;
                var34 += var28;
                var8++;
            }
            var9--;
            var22 += -var36;
            var26 += -var35;
            var35 -= var27;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var33;
                        var10++;
                        var25 += var37;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var25 < 0) {
                    var24 += var33;
                    var25 += var37;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var25 += -var32;
                var32 -= var29;
                var24 += -var38;
                var38 -= var29;
            }
            int var41 = arg4 - var9;
            var36 -= var27;
            int var42 = arg2 + var8;
            int var43 = arg4 + var9;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class323.method2273(var44, arg0, class221.field3443[var41], var46, 62);
                class323.method2273(var46, arg1, class221.field3443[var41], var45, arg5 ^ 0xFFFFFFB0);
                class323.method2273(var45, arg0, class221.field3443[var41], var42, arg5 ^ 0xFFFFFFA2);
                class323.method2273(var44, arg0, class221.field3443[var43], var46, 33);
                class323.method2273(var46, arg1, class221.field3443[var43], var45, arg5 ^ 0xFFFFFFAF);
                class323.method2273(var45, arg0, class221.field3443[var43], var42, 75);
            } else {
                class323.method2273(var44, arg0, class221.field3443[var41], var42, 98);
                class323.method2273(var44, arg0, class221.field3443[var43], var42, arg5 + 124);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 173)
    public static void method2033(int arg0) {
        field4551 = null;
        if (arg0 != 256) {
            method2038((byte) 35, (class294) null);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIJ)Z", line = 200)
    public static final boolean method2034(int arg0, int arg1, int arg2, long arg3) {
        class42 var5 = class34.field521[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field665 != null && var5.field665.field1721 == arg3) {
            return true;
        } else if (var5.field666 != null && var5.field666.field4596 == arg3) {
            return true;
        } else if (var5.field655 != null && var5.field655.field3605 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field672; var6++) {
                if (var5.field659[var6].field2344 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ltk;I)V", line = 228)
    public static final void method2035(class266 arg0, int arg1) {
        field4553++;
        int var2 = arg0.field4064;
        int var3 = 48 % ((-arg1 - 41) / 40);
        if (var2 == 324) {
            if (class3.field81 == -1) {
                class233.field3548 = arg0.field4008;
                class3.field81 = arg0.field3982;
            }
            if (class91.field1465.field4164) {
                arg0.field3982 = class3.field81;
            } else {
                arg0.field3982 = class233.field3548;
            }
        } else if (var2 == 325) {
            if (class3.field81 == -1) {
                class233.field3548 = arg0.field4008;
                class3.field81 = arg0.field3982;
            }
            if (class91.field1465.field4164) {
                arg0.field3982 = class233.field3548;
            } else {
                arg0.field3982 = class3.field81;
            }
        } else if (var2 == 327) {
            arg0.field4020 = 150;
            arg0.field3968 = (int) (Math.sin((double) class307.field4869 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4003 = 5;
            arg0.field4005 = -1;
        } else if (var2 == 328) {
            if (class345.field5363.field1486 == null) {
                arg0.field4005 = 0;
            } else {
                arg0.field4020 = 150;
                arg0.field3968 = (int) (Math.sin((double) class307.field4869 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field4003 = 5;
                arg0.field4005 = ((int) class106.method851(class345.field5363.field1486, -58) << 11) + 2047;
                arg0.field4077 = class345.field5363.field4656;
                arg0.field4041 = 0;
                arg0.field3975 = class345.field5363.field4614;
                arg0.field3966 = class345.field5363.field4676;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V", line = 303)
    public static final void method2036(boolean arg0) {
        field4550++;
        if (class67.field1020 || class260.field3874 == 2) {
            return;
        }
        try {
            class51.method419((byte) 60, class5.field118, "tbrefresh");
        } catch (Throwable var2) {
        }
        if (!arg0) {
            method2037(17, 9, -14, -109);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)I", line = 323)
    public static final int method2037(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field4555++;
        if (~var4 == arg1) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLlk;)V", line = 345)
    public static final void method2038(byte arg0, class294 arg1) {
        class66 var2 = arg1.method2062((byte) -92);
        arg1.field4614 = var2.field1006;
        field4558++;
        if (arg1.field4645 == 0) {
            arg1.field4707 = 0;
        } else {
            if (arg1.field4660 != -1 && arg1.field4667 == 0) {
                class38 var3 = class63.method503(arg1.field4660, (byte) 97);
                if (arg1.field4641 > 0 && var3.field585 == 0) {
                    arg1.field4707++;
                    return;
                }
                if (arg1.field4641 <= 0 && var3.field567 == 0) {
                    arg1.field4707++;
                    return;
                }
            }
            if (arg1.field4679 != -1 && class307.field4869 >= arg1.field4708) {
                class74 var4 = class52.method429(4618, arg1.field4679);
                if (var4.field1124 && var4.field1135 != -1) {
                    class38 var5 = class63.method503(var4.field1135, (byte) 127);
                    if (arg1.field4641 > 0 && var5.field585 == 0) {
                        arg1.field4707++;
                        return;
                    }
                    if (arg1.field4641 <= 0 && var5.field567 == 0) {
                        arg1.field4707++;
                        return;
                    }
                }
            }
            int var6 = arg1.field4671;
            int var7 = arg1.field4672;
            int var8 = arg1.field4643[arg1.field4645 - 1] * 128 + (arg1.method738(-6421) * 64);
            int var9 = arg1.field4619[arg1.field4645 - 1] * 128 + (arg1.method738(-6421) * 64);
            if (var8 - var6 > 256 || var8 - var6 < -256 || var9 - var7 > 256 || var9 - var7 < -256) {
                arg1.field4671 = var8;
                arg1.field4672 = var9;
                return;
            }
            int var10 = 4;
            if (var6 >= var8) {
                if (var6 <= var8) {
                    if (var9 > var7) {
                        arg1.field4630 = 1024;
                    } else if (var9 < var7) {
                        arg1.field4630 = 0;
                    }
                } else if (var9 > var7) {
                    arg1.field4630 = 768;
                } else if (var7 <= var9) {
                    arg1.field4630 = 512;
                } else {
                    arg1.field4630 = 256;
                }
            } else if (var9 > var7) {
                arg1.field4630 = 1280;
            } else if (var7 > var9) {
                arg1.field4630 = 1792;
            } else {
                arg1.field4630 = 1536;
            }
            int var11 = var2.field1005;
            byte var12 = 1;
            int var13 = arg1.field4630 - arg1.field4682 & 0x7FF;
            if (var13 > 1024) {
                var13 -= 2048;
            }
            boolean var14 = true;
            if (var13 >= -256 && var13 <= 256) {
                var11 = var2.field961;
            } else if (var13 >= 256 && var13 < 768) {
                var11 = var2.field980;
            } else if (var13 >= -768 && var13 <= -256) {
                var11 = var2.field989;
            }
            if (var11 == -1) {
                var11 = var2.field961;
            }
            arg1.field4614 = var11;
            if (arg1 instanceof class86) {
                var14 = ((class86) arg1).field1381.field1302;
            }
            if (var14) {
                if (arg1.field4682 != arg1.field4630 && arg1.field4695 == -1 && arg1.field4683 != 0) {
                    var10 = 2;
                }
                if (arg1.field4645 > 2) {
                    var10 = 6;
                }
                if (arg1.field4645 > 3) {
                    var10 = 8;
                }
                if (arg1.field4707 > 0 && arg1.field4645 > 1) {
                    arg1.field4707--;
                    var10 = 8;
                }
            } else {
                if (arg1.field4645 > 1) {
                    var10 = 6;
                }
                if (arg1.field4645 > 2) {
                    var10 = 8;
                }
                if (arg1.field4707 > 0 && arg1.field4645 > 1) {
                    arg1.field4707--;
                    var10 = 8;
                }
            }
            if (arg1.field4709[arg1.field4645 - 1] == 2) {
                var10 <<= 0x1;
                var12 = 2;
            } else if (arg1.field4709[arg1.field4645 - 1] == 0) {
                var12 = 0;
                var10 >>= 0x1;
            }
            if (var10 < 8 || var2.field1004 == -1) {
                if (var2.field991 != -1 && var12 == 0) {
                    if (arg1.field4614 == var2.field1005 && var2.field964 != -1) {
                        arg1.field4614 = var2.field964;
                    } else if (arg1.field4614 == var2.field989 && var2.field972 != -1) {
                        arg1.field4614 = var2.field972;
                    } else if (arg1.field4614 == var2.field980 && var2.field999 != -1) {
                        arg1.field4614 = var2.field999;
                    } else {
                        arg1.field4614 = var2.field991;
                    }
                }
            } else if (arg1.field4614 == var2.field1005 && var2.field977 != -1) {
                arg1.field4614 = var2.field977;
            } else if (arg1.field4614 == var2.field989 && var2.field975 != -1) {
                arg1.field4614 = var2.field975;
            } else if (arg1.field4614 == var2.field980 && var2.field996 != -1) {
                arg1.field4614 = var2.field996;
            } else {
                arg1.field4614 = var2.field1004;
            }
            if (var2.field960 != -1) {
                int var15 = var10 << 7;
                if (arg1.field4645 == 1) {
                    int var16 = (arg1.field4672 <= var9 ? var9 - arg1.field4672 : arg1.field4672 - var9) << 7;
                    int var17 = (arg1.field4671 <= var8 ? var8 - arg1.field4671 : arg1.field4671 - var8) << 7;
                    int var18 = var17 > var16 ? var17 : var16;
                    int var19 = var2.field960 * var18 * 2;
                    int var20 = arg1.field4631 * arg1.field4631;
                    if (var20 > var19) {
                        arg1.field4631 /= 2;
                    } else if (var20 / 2 > var18) {
                        arg1.field4631 -= var2.field960;
                        if (arg1.field4631 < 0) {
                            arg1.field4631 = 0;
                        }
                    } else if (var15 > arg1.field4631) {
                        arg1.field4631 += var2.field960;
                        if (var15 < arg1.field4631) {
                            arg1.field4631 = var15;
                        }
                    }
                } else if (var15 > arg1.field4631) {
                    arg1.field4631 += var2.field960;
                    if (arg1.field4631 > var15) {
                        arg1.field4631 = var15;
                    }
                } else if (arg1.field4631 > 0) {
                    arg1.field4631 -= var2.field960;
                    if (arg1.field4631 < 0) {
                        arg1.field4631 = 0;
                    }
                }
                var10 = arg1.field4631 >> 7;
                if (var10 < 1) {
                    var10 = 1;
                }
            }
            if (var9 > var7) {
                arg1.field4672 += var10;
                if (arg1.field4672 > var9) {
                    arg1.field4672 = var9;
                }
            } else if (var9 < var7) {
                arg1.field4672 -= var10;
                if (arg1.field4672 < var9) {
                    arg1.field4672 = var9;
                }
            }
            if (var6 < var8) {
                arg1.field4671 += var10;
                if (arg1.field4671 > var8) {
                    arg1.field4671 = var8;
                }
            } else if (var6 > var8) {
                arg1.field4671 -= var10;
                if (arg1.field4671 < var8) {
                    arg1.field4671 = var8;
                }
            }
            if (arg1.field4671 == var8 && arg1.field4672 == var9) {
                arg1.field4645--;
                if (arg1.field4641 > 0) {
                    arg1.field4641--;
                }
            }
        }
        if (arg0 < 104) {
            method2032(-36, 113, -40, 1, 96, 123, 108, 42);
        }
    }
}
