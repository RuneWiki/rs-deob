import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class75 extends class310 {

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    private int field1271 = 1;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    private int field1280 = 0;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    private int field1281 = 0;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "Z")
    public static boolean field1272 = true;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1273 = "Drop";

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "[I")
    public static int[] field1278 = new int[14];

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field1279;

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 16)
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(II)I", line = 25)
    public static int method624(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I", line = 34)
    public final int[] method77(int arg0, int arg1) {
        field1275++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (arg1 != -13093) {
            this.field1280 = 92;
        }
        if (this.field4950.field2001) {
            int var4 = class230.field3818[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class261.field4405; var6++) {
                int var7 = class293.field4737[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field1280 == 0) {
                    var11 = (var7 - var4) * this.field1271;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1271 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field1281 == 0) {
                    var12 = class74.field1265[(var12 & 0xFFF) >> 4] + 4096 >> 1;
                } else if (this.field1281 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqm;II)V", line = 101)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field1276++;
        if (arg1 != -2470) {
            return;
        }
        if (arg2 == 0) {
            this.field1280 = arg0.method1720((byte) -61);
        } else if (arg2 == 1) {
            this.field1281 = arg0.method1720((byte) -12);
        } else if (arg2 == 3) {
            this.field1271 = arg0.method1720((byte) -54);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZI[B[Lic;IIBIII)V", line = 146)
    public static final void method625(int arg0, boolean arg1, int arg2, byte[] arg3, class22[] arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        field1277++;
        int var11 = 33 % ((54 - arg7) / 48);
        class227 var12 = new class227(arg3);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1742(6789);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1708((byte) 103);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = (var15 & 0xFF6) >> 6;
                int var18 = var15 >> 12;
                int var19 = var15 & 0x3F;
                int var20 = var12.method1720((byte) -25);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg9 == var18 && var17 >= arg0 && (arg0 + 8) > var17 && var19 >= arg2 && var19 < arg2 + 8) {
                    class29 var23 = class166.method1292(0, var13);
                    int var24 = arg10 + class7.method32(var19 & 0x7, var17 & 0x7, var23.field414, var22, arg5, true, var23.field342);
                    int var25 = arg6 + class90.method712(arg5, 94, var23.field342, var19 & 0x7, var22, var23.field414, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class22 var26 = null;
                        if (!arg1) {
                            int var27 = arg8;
                            if ((class178.field2856[1][var24][var25] & 0x2) == 2) {
                                var27 = arg8 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg4[var27];
                            }
                        }
                        class134.method1023(var13, arg1, 1, arg8, var21, arg5 + var22 & 0x3, arg8, var25, var24, !arg1, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V", line = 229)
    public static void method626(byte arg0) {
        field1279 = null;
        if (arg0 != -119) {
            method627((class220) null, -26);
        }
        field1278 = null;
        field1273 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lug;I)V", line = 256)
    public static final void method627(class220 arg0, int arg1) {
        field1274++;
        class106 var2 = arg0.method1641(0);
        arg0.field3544 = var2.field1737;
        int var3 = -87 / ((-arg1 - 69) / 56);
        if (arg0.field3503 == 0) {
            arg0.field3573 = 0;
            return;
        }
        if (arg0.field3547 != -1 && arg0.field3559 == 0) {
            class43 var4 = class198.method1524(arg0.field3547, 90);
            if (arg0.field3491 > 0 && var4.field656 == 0) {
                arg0.field3573++;
                return;
            }
            if (arg0.field3491 <= 0 && var4.field670 == 0) {
                arg0.field3573++;
                return;
            }
        }
        if (arg0.field3552 != -1 && arg0.field3500 <= class332.field5261) {
            class94 var5 = class282.method2071(arg0.field3552, 0);
            if (var5.field1591 && var5.field1594 != -1) {
                class43 var6 = class198.method1524(var5.field1594, -82);
                if (arg0.field3491 > 0 && var6.field656 == 0) {
                    arg0.field3573++;
                    return;
                }
                if (arg0.field3491 <= 0 && var6.field670 == 0) {
                    arg0.field3573++;
                    return;
                }
            }
        }
        int var7 = arg0.field3511;
        int var8 = arg0.field3577;
        int var9 = arg0.field3519[arg0.field3503 - 1] * 128 + arg0.method1634(-1) * 64;
        int var10 = arg0.field3553[arg0.field3503 - 1] * 128 + (arg0.method1634(-1) * 64);
        if (var9 - var8 > 256 || (var9 - var8) < -256 || (var10 - var7) > 256 || (var10 - var7) < -256) {
            arg0.field3577 = var9;
            arg0.field3511 = var10;
            return;
        }
        if (var8 >= var9) {
            if (var8 <= var9) {
                if (var10 > var7) {
                    arg0.field3549 = 1024;
                } else if (var10 < var7) {
                    arg0.field3549 = 0;
                }
            } else if (var7 < var10) {
                arg0.field3549 = 768;
            } else if (var7 > var10) {
                arg0.field3549 = 256;
            } else {
                arg0.field3549 = 512;
            }
        } else if (var10 > var7) {
            arg0.field3549 = 1280;
        } else if (var7 > var10) {
            arg0.field3549 = 1792;
        } else {
            arg0.field3549 = 1536;
        }
        int var11 = var2.field1740;
        int var12 = arg0.field3549 - arg0.field3477 & 0x7FF;
        boolean var13 = true;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        int var14 = 4;
        if (var12 >= -256 && var12 <= 256) {
            var11 = var2.field1726;
        } else if (var12 >= 256 && var12 < 768) {
            var11 = var2.field1757;
        } else if (var12 >= -768 && var12 <= -256) {
            var11 = var2.field1749;
        }
        if (var11 == -1) {
            var11 = var2.field1726;
        }
        arg0.field3544 = var11;
        if (arg0 instanceof class288) {
            var13 = ((class288) arg0).field4692.field2061;
        }
        if (var13) {
            if (arg0.field3549 != arg0.field3477 && arg0.field3567 == -1 && arg0.field3514 != 0) {
                var14 = 2;
            }
            if (arg0.field3503 > 2) {
                var14 = 6;
            }
            if (arg0.field3503 > 3) {
                var14 = 8;
            }
            if (arg0.field3573 > 0 && arg0.field3503 > 1) {
                arg0.field3573--;
                var14 = 8;
            }
        } else {
            if (arg0.field3503 > 1) {
                var14 = 6;
            }
            if (arg0.field3503 > 2) {
                var14 = 8;
            }
            if (arg0.field3573 > 0 && arg0.field3503 > 1) {
                var14 = 8;
                arg0.field3573--;
            }
        }
        byte var15 = 1;
        if (arg0.field3496[arg0.field3503 - 1] == 2) {
            var14 <<= 0x1;
            var15 = 2;
        } else if (arg0.field3496[arg0.field3503 - 1] == 0) {
            var15 = 0;
            var14 >>= 0x1;
        }
        if (var14 < 8 || var2.field1723 == -1) {
            if (var2.field1733 != -1 && var15 == 0) {
                if (arg0.field3544 == var2.field1740 && var2.field1730 != -1) {
                    arg0.field3544 = var2.field1730;
                } else if (arg0.field3544 == var2.field1749 && var2.field1747 != -1) {
                    arg0.field3544 = var2.field1747;
                } else if (arg0.field3544 == var2.field1757 && var2.field1746 != -1) {
                    arg0.field3544 = var2.field1746;
                } else {
                    arg0.field3544 = var2.field1733;
                }
            }
        } else if (arg0.field3544 == var2.field1740 && var2.field1729 != -1) {
            arg0.field3544 = var2.field1729;
        } else if (arg0.field3544 == var2.field1749 && var2.field1754 != -1) {
            arg0.field3544 = var2.field1754;
        } else if (arg0.field3544 == var2.field1757 && var2.field1731 != -1) {
            arg0.field3544 = var2.field1731;
        } else {
            arg0.field3544 = var2.field1723;
        }
        if (var2.field1718 != -1) {
            int var16 = var14 << 7;
            if (arg0.field3503 == 1) {
                int var17 = arg0.field3482 * arg0.field3482;
                int var18 = (arg0.field3577 <= var9 ? var9 - arg0.field3577 : arg0.field3577 - var9) << 7;
                int var19 = (var10 < arg0.field3511 ? arg0.field3511 - var10 : var10 - arg0.field3511) << 7;
                int var20 = var18 <= var19 ? var19 : var18;
                int var21 = var2.field1718 * 2 * var20;
                if (var21 < var17) {
                    arg0.field3482 /= 2;
                } else if ((var17 / 2) > var20) {
                    arg0.field3482 -= var2.field1718;
                    if (arg0.field3482 < 0) {
                        arg0.field3482 = 0;
                    }
                } else if (arg0.field3482 < var16) {
                    arg0.field3482 += var2.field1718;
                    if (arg0.field3482 > var16) {
                        arg0.field3482 = var16;
                    }
                }
            } else if (var16 > arg0.field3482) {
                arg0.field3482 += var2.field1718;
                if (var16 < arg0.field3482) {
                    arg0.field3482 = var16;
                }
            } else if (arg0.field3482 > 0) {
                arg0.field3482 -= var2.field1718;
                if (arg0.field3482 < 0) {
                    arg0.field3482 = 0;
                }
            }
            var14 = arg0.field3482 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var7 < var10) {
            arg0.field3511 += var14;
            if (arg0.field3511 > var10) {
                arg0.field3511 = var10;
            }
        } else if (var10 < var7) {
            arg0.field3511 -= var14;
            if (arg0.field3511 < var10) {
                arg0.field3511 = var10;
            }
        }
        if (var9 > var8) {
            arg0.field3577 += var14;
            if (var9 < arg0.field3577) {
                arg0.field3577 = var9;
            }
        } else if (var9 < var8) {
            arg0.field3577 -= var14;
            if (var9 > arg0.field3577) {
                arg0.field3577 = var9;
            }
        }
        if (arg0.field3577 == var9 && arg0.field3511 == var10) {
            arg0.field3503--;
            if (arg0.field3491 > 0) {
                arg0.field3491--;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V", line = 601)
    public final void method553(byte arg0) {
        field1283++;
        if (arg0 > -82) {
            method625(-101, false, -6, (byte[]) null, (class22[]) null, -94, -57, (byte) -102, -5, 57, -11);
        }
        class26.method169(-65);
    }
}
