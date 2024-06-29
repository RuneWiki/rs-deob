import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class290 {

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    private int field4517;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    private int field4521;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[[I")
    public int[][] field4520;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Z")
    public static boolean field4504 = true;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4509 = 0;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field4513 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLug;)V", line = 7)
    public static final void method2090(byte arg0, class25 arg1) {
        int var2 = class351.field5594 >> 2 << 10;
        byte[][] var3 = new byte[class351.field5596][class351.field5593];
        int var4 = class351.field5600 >> 1;
        while (arg1.field397 < arg1.field448.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method281(45) == 1) {
                var5 = true;
                var6 = arg1.method281(-128);
                var7 = arg1.method281(-128);
            }
            int var8 = arg1.method281(5);
            int var9 = arg1.method281(-126);
            int var10 = var8 * 64 - class351.field5592;
            int var11 = class351.field5598 + class351.field5593 - (var9 * 64) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class351.field5596 > var10 + 63 && class351.field5593 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var3[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && var12 < (var6 * 8 + 8) && var7 * 8 <= var14 && var14 < (var7 * 8 + 8)) {
                            var13[var11 - var14] = arg1.method286((byte) 96);
                        }
                    }
                }
            } else if (var5) {
                arg1.field397 += 64;
            } else {
                arg1.field397 += 4096;
            }
        }
        field4522++;
        int var15 = class351.field5596;
        int var16 = class351.field5593;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        int var22 = -5;
        if (arg0 <= 7) {
            method2104(false, 104, 110, 58, -81, 78);
        }
        while (var15 > var22) {
            if ((var22 & 0x1FF) == 0) {
                class246.method1852(3, true);
            }
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var3[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class203 var26 = class155.method1270((byte) -104, var25 - 1);
                        var20[var23] += var26.field3136;
                        var18[var23] += var26.field3135;
                        var17[var23] += var26.field3142;
                        var21[var23] += var26.field3134;
                        var10002 = var19[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var3[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class203 var29 = class155.method1270((byte) -128, var28 - 1);
                        var20[var23] -= var29.field3136;
                        var18[var23] -= var29.field3135;
                        var17[var23] -= var29.field3142;
                        var21[var23] -= var29.field3134;
                        var10002 = var19[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class351.field5609[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var35 += var19[var38];
                        var34 += var21[var38];
                        var32 += var18[var38];
                        var33 += var17[var38];
                        var31 += var20[var38];
                    }
                    if (var37 >= 0) {
                        var33 -= var17[var37];
                        var34 -= var21[var37];
                        var32 -= var18[var37];
                        var35 -= var19[var37];
                        var31 -= var20[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class185.method1428(var33 / var35, var32 / var35, var31 * 256 / var34, (byte) 35);
                        if (var3[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var4;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[(class301.method2169(63, var36) << 6) + class301.method2169(var22, 63)] = class107.field1603[class50.method483(96, var42, -116)];
                        } else if (var39 != null) {
                            var39[class301.method2169(var36 << 6, 4032) + class301.method2169(63, var22)] = 0;
                        }
                    }
                }
            }
            var22++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZIIZ)V", line = 242)
    public final void method2091(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field4507;
        int var9 = 256;
        int var10 = arg4 - this.field4521;
        field4518++;
        if (arg3) {
            var9 |= 0x20000;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var11 = var8; var11 < arg5 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field4512) {
                for (int var12 = var10; var12 < arg1 + var10; var12++) {
                    if (var12 >= 0 && this.field4517 > var12) {
                        this.method2098((byte) 45, var11, var9, var12);
                    }
                }
            }
        }
        if (arg2 != 0) {
            this.method2105(116, false, 48, -17, 56, false, -70, -98);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZI)Z", line = 287)
    public final boolean method2092(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4515++;
        if (arg1 == arg4 && arg0 == arg2) {
            return true;
        }
        int var6 = arg4 - this.field4507;
        int var7 = arg2 - this.field4521;
        if (var6 < 0 || this.field4512 <= var6 || var7 < 0 || this.field4517 <= var7) {
            return false;
        }
        int var8 = arg1 - this.field4507;
        int var9 = arg0 - this.field4521;
        if (var8 < 0 || var8 >= this.field4512 || var9 < 0 || this.field4517 <= var9) {
            return false;
        }
        if (arg3) {
            this.method2091(-91, 85, -17, false, 98, -96, true);
        }
        int var10;
        if (var6 > var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 >= var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        if (var11 < var10) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var6 != var8) {
                if (var8 < var6) {
                    if ((this.field4520[var8][var9] & 0x2C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field4520[var8][var9] & 0x2C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var7 > var9) {
                        if ((this.field4520[var8][var9] & 0x2C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var7) {
                        if ((this.field4520[var8][var9] & 0x2C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field4520[var8][var9] & 0x2C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field4520[var8][var9] & 0x2C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 > var8) {
                        if ((this.field4520[var8][var9] & 0x2C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field4520[var8][var9] & 0x2C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field4520[var6][var7] & 0x240100) == 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIII)Z", line = 445)
    public final boolean method2093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4503++;
        if (arg6 == 1) {
            if (arg0 == arg5 && arg3 == arg4) {
                return true;
            }
        } else if (arg5 <= arg0 && arg0 <= (arg5 - (1 - arg6)) && arg4 <= arg4 && arg4 <= arg4 + arg6 - 1) {
            return true;
        }
        int var9 = arg4 - this.field4521;
        int var10 = arg5 - this.field4507;
        int var11 = arg0 - this.field4507;
        int var12 = arg3 - this.field4521;
        if (arg6 == arg7) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field4520[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field4520[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field4520[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field4520[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field4520[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field4520[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4520[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field4520[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field4520[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field4520[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field4520[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field4520[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg6 - 1;
            int var14 = var10 + arg6 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var11 + 1 == var10 && var9 >= var12 && var13 >= var9 && (this.field4520[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && (var9 - arg6) == var12 && (this.field4520[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg6 == var10 && var9 >= var12 && var9 <= var13 && (this.field4520[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && var9 - arg6 == var12 && (this.field4520[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - arg6) == var10 && var12 <= var9 && var13 >= var9 && (this.field4520[var14][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var9 + 1 == var12 && (this.field4520[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 + 1 == var10 && var12 <= var9 && var13 >= var9 && (this.field4520[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var9 + 1) == var12 && (this.field4520[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 <= var11 && var11 <= var14 && (var9 + 1) == var12 && (this.field4520[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var14 >= var11 && (var9 - arg6) == var12 && (this.field4520[var11][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg6) == var10 && var12 <= var9 && var9 <= var13 && (this.field4520[var14][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 <= var9 && var13 >= var9 && (this.field4520[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)V", line = 634)
    public final void method2094(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field4507;
        field4511++;
        int var5 = arg0 - this.field4521;
        this.field4520[var4][var5] = class301.method2169(this.field4520[var4][var5], -262145);
        if (arg1 <= 120) {
            this.method2092(-63, 85, -25, true, 102);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIII)Z", line = 647)
    public final boolean method2095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4506++;
        if (arg4 <= 1) {
            int var10 = arg0 + arg7 - 1;
            int var11 = arg1 + arg6 - 1;
            if (arg7 <= arg3 && arg3 <= var10 && arg6 <= arg2 && var11 >= arg2) {
                return true;
            } else if ((arg7 - 1) == arg3 && arg6 <= arg2 && arg2 <= var11 && (this.field4520[arg3 - this.field4507][arg2 - this.field4521] & 0x8) == 0 && (arg8 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg3 && arg6 <= arg2 && var11 >= arg2 && (this.field4520[arg3 - this.field4507][arg2 - this.field4521] & 0x80) == 0 && (arg8 & 0x2) == 0) {
                return true;
            } else if (arg6 - 1 == arg2 && arg3 >= arg7 && var10 >= arg3 && (this.field4520[arg3 - this.field4507][arg2 - this.field4521] & 0x2) == 0 && (arg8 & 0x4) == 0) {
                return true;
            } else if (var11 + 1 == arg2 && arg7 <= arg3 && var10 >= arg3 && (this.field4520[arg3 - this.field4507][arg2 - this.field4521] & 0x20) == 0 && (arg8 & 0x1) == 0) {
                return true;
            } else {
                int var12 = -21 % ((arg5 - 24) / 45);
                return false;
            }
        } else if (class209.method1551(arg2, arg3, arg1, arg0, arg6, arg7, arg4, arg4, 506276088)) {
            return true;
        } else {
            return this.method2103(false, arg8, arg3, arg2, arg4, arg1, arg0, arg6, arg7, arg4);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIZBIZ)V", line = 687)
    public final void method2096(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field4507;
        field4510++;
        int var9 = arg1 - this.field4521;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2108(var9, 128, -11739, var8);
                this.method2108(var9, 8, -11739, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2108(var9, 2, -11739, var8);
                this.method2108(var9 + 1, 32, -11739, var8);
            }
            if (arg5 == 2) {
                this.method2108(var9, 8, -11739, var8);
                this.method2108(var9, 128, -11739, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2108(var9, 32, -11739, var8);
                this.method2108(var9 - 1, 2, -11739, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2108(var9, 1, -11739, var8);
                this.method2108(var9 + 1, 16, -11739, var8 - 1);
            }
            if (arg5 == 1) {
                this.method2108(var9, 4, -11739, var8);
                this.method2108(var9 + 1, 64, -11739, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2108(var9, 16, -11739, var8);
                this.method2108(var9 - 1, 1, -11739, var8 + 1);
            }
            if (arg5 == 3) {
                this.method2108(var9, 64, -11739, var8);
                this.method2108(var9 - 1, 4, -11739, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method2108(var9, 130, -11739, var8);
                this.method2108(var9, 8, -11739, var8 - 1);
                this.method2108(var9 + 1, 32, -11739, var8);
            }
            if (arg5 == 1) {
                this.method2108(var9, 10, -11739, var8);
                this.method2108(var9 + 1, 32, -11739, var8);
                this.method2108(var9, 128, -11739, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2108(var9, 40, -11739, var8);
                this.method2108(var9, 128, -11739, var8 + 1);
                this.method2108(var9 - 1, 2, -11739, var8);
            }
            if (arg5 == 3) {
                this.method2108(var9, 160, -11739, var8);
                this.method2108(var9 - 1, 2, -11739, var8);
                this.method2108(var9, 8, -11739, var8 - 1);
            }
        }
        if (arg6) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method2108(var9, 65536, -11739, var8);
                    this.method2108(var9, 4096, -11739, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method2108(var9, 1024, -11739, var8);
                    this.method2108(var9 + 1, 16384, -11739, var8);
                }
                if (arg5 == 2) {
                    this.method2108(var9, 4096, -11739, var8);
                    this.method2108(var9, 65536, -11739, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method2108(var9, 16384, -11739, var8);
                    this.method2108(var9 - 1, 1024, -11739, var8);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method2108(var9, 512, -11739, var8);
                    this.method2108(var9 + 1, 8192, -11739, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method2108(var9, 2048, -11739, var8);
                    this.method2108(var9 + 1, 32768, -11739, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2108(var9, 8192, -11739, var8);
                    this.method2108(var9 - 1, 512, -11739, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method2108(var9, 32768, -11739, var8);
                    this.method2108(var9 - 1, 2048, -11739, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method2108(var9, 66560, -11739, var8);
                    this.method2108(var9, 4096, -11739, var8 - 1);
                    this.method2108(var9 + 1, 16384, -11739, var8);
                }
                if (arg5 == 1) {
                    this.method2108(var9, 5120, -11739, var8);
                    this.method2108(var9 + 1, 16384, -11739, var8);
                    this.method2108(var9, 65536, -11739, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2108(var9, 20480, -11739, var8);
                    this.method2108(var9, 65536, -11739, var8 + 1);
                    this.method2108(var9 - 1, 1024, -11739, var8);
                }
                if (arg5 == 3) {
                    this.method2108(var9, 81920, -11739, var8);
                    this.method2108(var9 - 1, 1024, -11739, var8);
                    this.method2108(var9, 4096, -11739, var8 - 1);
                }
            }
        }
        if (arg3) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method2108(var9, 536870912, -11739, var8);
                    this.method2108(var9, 33554432, -11739, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method2108(var9, 8388608, -11739, var8);
                    this.method2108(var9 + 1, 134217728, -11739, var8);
                }
                if (arg5 == 2) {
                    this.method2108(var9, 33554432, -11739, var8);
                    this.method2108(var9, 536870912, -11739, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method2108(var9, 134217728, -11739, var8);
                    this.method2108(var9 - 1, 8388608, -11739, var8);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method2108(var9, 4194304, -11739, var8);
                    this.method2108(var9 + 1, 67108864, -11739, var8 - 1);
                }
                if (arg5 == 1) {
                    this.method2108(var9, 16777216, -11739, var8);
                    this.method2108(var9 + 1, 268435456, -11739, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2108(var9, 67108864, -11739, var8);
                    this.method2108(var9 - 1, 4194304, -11739, var8 + 1);
                }
                if (arg5 == 3) {
                    this.method2108(var9, 268435456, -11739, var8);
                    this.method2108(var9 - 1, 16777216, -11739, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method2108(var9, 545259520, -11739, var8);
                    this.method2108(var9, 33554432, -11739, var8 - 1);
                    this.method2108(var9 + 1, 134217728, -11739, var8);
                }
                if (arg5 == 1) {
                    this.method2108(var9, 41943040, -11739, var8);
                    this.method2108(var9 + 1, 134217728, -11739, var8);
                    this.method2108(var9, 536870912, -11739, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2108(var9, 167772160, -11739, var8);
                    this.method2108(var9, 536870912, -11739, var8 + 1);
                    this.method2108(var9 - 1, 8388608, -11739, var8);
                }
                if (arg5 == 3) {
                    this.method2108(var9, 671088640, -11739, var8);
                    this.method2108(var9 - 1, 8388608, -11739, var8);
                    this.method2108(var9, 33554432, -11739, var8 - 1);
                }
            }
        }
        int var10 = 27 % ((-arg4 - 44) / 58);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 1004)
    public final void method2097(int arg0) {
        field4524++;
        if (arg0 != 2097152) {
            field4513 = 16;
        }
        for (int var2 = 0; var2 < this.field4512; var2++) {
            for (int var3 = 0; var3 < this.field4517; var3++) {
                if (var2 == 0 || var3 == 0 || this.field4512 - 5 <= var2 || this.field4517 - 5 <= var3) {
                    this.field4520[var2][var3] = 16777215;
                } else {
                    this.field4520[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BIII)V", line = 1039)
    private final void method2098(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 45) {
            method2099((byte) 61, -62);
        }
        this.field4520[arg1][arg3] = class41.method426(this.field4520[arg1][arg3], arg2);
        field4526++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)I", line = 1053)
    public static final int method2099(byte arg0, int arg1) {
        field4525++;
        double var2 = (double) ((arg1 & 0xFFD5D3) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFA9) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = 0.0D;
        double var12 = 0.0D;
        double var14 = var2;
        if (var2 < var4) {
            var14 = var4;
        }
        if (var14 < var6) {
            var14 = var6;
        }
        double var16 = (var8 + var14) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        int var19 = 114 / ((-arg0 - 43) / 62);
        if (var8 != var14) {
            if (var16 < 0.5D) {
                var12 = (var14 - var8) / (var8 + var14);
            }
            if (var2 == var14) {
                var10 = (var4 - var6) / (var14 - var8);
            } else if (var4 == var14) {
                var10 = (var6 - var2) / (var14 - var8) + 2.0D;
            } else if (var6 == var14) {
                var10 = (var2 - var4) / (var14 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var12 = (var14 - var8) / (2.0D - var14 - var8);
            }
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var20 = (int) (var12 * 256.0D);
        double var21 = var10 / 6.0D;
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var23 = (int) (var21 * 256.0D);
        if (var18 > 243) {
            var20 >>= 0x4;
        } else if (var18 > 217) {
            var20 >>= 0x3;
        } else if (var18 > 192) {
            var20 >>= 0x2;
        } else if (var18 > 179) {
            var20 >>= 0x1;
        }
        return (var20 >> 5 << 7) + (var23 >> 2 << 10) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIIZIIZ)V", line = 1164)
    public final void method2100(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field4521;
        int var9 = arg0 - this.field4507;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method2098((byte) 45, var9, 128, var8);
                this.method2098((byte) 45, var9 - 1, 8, var8);
            }
            if (arg5 == 1) {
                this.method2098((byte) 45, var9, 2, var8);
                this.method2098((byte) 45, var9, 32, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2098((byte) 45, var9, 8, var8);
                this.method2098((byte) 45, var9 + 1, 128, var8);
            }
            if (arg5 == 3) {
                this.method2098((byte) 45, var9, 32, var8);
                this.method2098((byte) 45, var9, 2, var8 - 1);
            }
        }
        field4523++;
        if (arg1 == arg4 || arg4 == 3) {
            if (arg5 == 0) {
                this.method2098((byte) 45, var9, 1, var8);
                this.method2098((byte) 45, var9 - 1, 16, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2098((byte) 45, var9, 4, var8);
                this.method2098((byte) 45, var9 + 1, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2098((byte) 45, var9, 16, var8);
                this.method2098((byte) 45, var9 + 1, 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2098((byte) 45, var9, 64, var8);
                this.method2098((byte) 45, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method2098((byte) 45, var9, 130, var8);
                this.method2098((byte) 45, var9 - 1, 8, var8);
                this.method2098((byte) 45, var9, 32, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2098((byte) 45, var9, 10, var8);
                this.method2098((byte) 45, var9, 32, var8 + 1);
                this.method2098((byte) 45, var9 + 1, 128, var8);
            }
            if (arg5 == 2) {
                this.method2098((byte) 45, var9, 40, var8);
                this.method2098((byte) 45, var9 + 1, 128, var8);
                this.method2098((byte) 45, var9, 2, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2098((byte) 45, var9, 160, var8);
                this.method2098((byte) 45, var9, 2, var8 - 1);
                this.method2098((byte) 45, var9 - 1, 8, var8);
            }
        }
        if (arg6) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    this.method2098((byte) 45, var9, 65536, var8);
                    this.method2098((byte) 45, var9 - 1, 4096, var8);
                }
                if (arg5 == 1) {
                    this.method2098((byte) 45, var9, 1024, var8);
                    this.method2098((byte) 45, var9, 16384, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2098((byte) 45, var9, 4096, var8);
                    this.method2098((byte) 45, var9 + 1, 65536, var8);
                }
                if (arg5 == 3) {
                    this.method2098((byte) 45, var9, 16384, var8);
                    this.method2098((byte) 45, var9, 1024, var8 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg5 == 0) {
                    this.method2098((byte) 45, var9, 512, var8);
                    this.method2098((byte) 45, var9 - 1, 8192, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method2098((byte) 45, var9, 2048, var8);
                    this.method2098((byte) 45, var9 + 1, 32768, var8 + 1);
                }
                if (arg5 == 2) {
                    this.method2098((byte) 45, var9, 8192, var8);
                    this.method2098((byte) 45, var9 + 1, 512, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method2098((byte) 45, var9, 32768, var8);
                    this.method2098((byte) 45, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    this.method2098((byte) 45, var9, 66560, var8);
                    this.method2098((byte) 45, var9 - 1, 4096, var8);
                    this.method2098((byte) 45, var9, 16384, var8 + 1);
                }
                if (arg5 == 1) {
                    this.method2098((byte) 45, var9, 5120, var8);
                    this.method2098((byte) 45, var9, 16384, var8 + 1);
                    this.method2098((byte) 45, var9 + 1, 65536, var8);
                }
                if (arg5 == 2) {
                    this.method2098((byte) 45, var9, 20480, var8);
                    this.method2098((byte) 45, var9 + 1, 65536, var8);
                    this.method2098((byte) 45, var9, 1024, var8 - 1);
                }
                if (arg5 == 3) {
                    this.method2098((byte) 45, var9, 81920, var8);
                    this.method2098((byte) 45, var9, 1024, var8 - 1);
                    this.method2098((byte) 45, var9 - 1, 4096, var8);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method2098((byte) 45, var9, 536870912, var8);
                this.method2098((byte) 45, var9 - 1, 33554432, var8);
            }
            if (arg5 == 1) {
                this.method2098((byte) 45, var9, 8388608, var8);
                this.method2098((byte) 45, var9, 134217728, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2098((byte) 45, var9, 33554432, var8);
                this.method2098((byte) 45, var9 + 1, 536870912, var8);
            }
            if (arg5 == 3) {
                this.method2098((byte) 45, var9, 134217728, var8);
                this.method2098((byte) 45, var9, 8388608, var8 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method2098((byte) 45, var9, 4194304, var8);
                this.method2098((byte) 45, var9 - 1, 67108864, var8 + 1);
            }
            if (arg5 == 1) {
                this.method2098((byte) 45, var9, 16777216, var8);
                this.method2098((byte) 45, var9 + 1, 268435456, var8 + 1);
            }
            if (arg5 == 2) {
                this.method2098((byte) 45, var9, 67108864, var8);
                this.method2098((byte) 45, var9 + 1, 4194304, var8 - 1);
            }
            if (arg5 == 3) {
                this.method2098((byte) 45, var9, 268435456, var8);
                this.method2098((byte) 45, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2098((byte) 45, var9, 545259520, var8);
            this.method2098((byte) 45, var9 - 1, 33554432, var8);
            this.method2098((byte) 45, var9, 134217728, var8 + 1);
        }
        if (arg5 == 1) {
            this.method2098((byte) 45, var9, 41943040, var8);
            this.method2098((byte) 45, var9, 134217728, var8 + 1);
            this.method2098((byte) 45, var9 + 1, 536870912, var8);
        }
        if (arg5 == 2) {
            this.method2098((byte) 45, var9, 167772160, var8);
            this.method2098((byte) 45, var9 + 1, 536870912, var8);
            this.method2098((byte) 45, var9, 8388608, var8 - 1);
        }
        if (arg5 == 3) {
            this.method2098((byte) 45, var9, 671088640, var8);
            this.method2098((byte) 45, var9, 8388608, var8 - 1);
            this.method2098((byte) 45, var9 - 1, 33554432, var8);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V", line = 1478)
    public final void method2101(int arg0, int arg1, int arg2) {
        if (arg2 >= -36) {
            this.method2095(-59, 0, -37, -47, 42, -53, -101, -12, -11);
        }
        int var4 = arg0 - this.field4507;
        field4530++;
        int var5 = arg1 - this.field4521;
        this.field4520[var4][var5] = class41.method426(this.field4520[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIBI)Z", line = 1496)
    public final boolean method2102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 >= -121) {
            return false;
        }
        field4514++;
        if (arg2 == 1) {
            if (arg3 == arg5 && arg0 == arg4) {
                return true;
            }
        } else if (arg5 >= arg3 && (arg2 + arg3 - 1) >= arg5 && arg0 <= arg0 && (arg0 - (1 - arg2)) >= arg0) {
            return true;
        }
        int var9 = arg4 - this.field4521;
        int var10 = arg0 - this.field4521;
        int var11 = arg5 - this.field4507;
        int var12 = arg3 - this.field4507;
        if (arg2 == 1) {
            if (arg1 == 0) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field4520[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field4520[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field4520[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field4520[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg7 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4520[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4520[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field4520[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field4520[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var11 == var12 && (var10 + 1) == var9 && (this.field4520[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field4520[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field4520[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = var9 + arg2 - 1;
            if (arg1 == 0) {
                if (arg7 == 0) {
                    if ((var11 - arg2) == var12 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var10 + 1 == var9 && (this.field4520[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 - arg2) == var9 && (this.field4520[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 - arg2 == var12 && var10 >= var9 && var10 <= var14 && (this.field4520[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field4520[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 + 1 == var12 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9 && (this.field4520[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg2 == var9 && (this.field4520[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 <= var11 && var13 >= var11 && var10 - arg2 == var9) {
                        return true;
                    }
                    if ((var11 - arg2) == var12 && var10 >= var9 && var14 >= var10 && (this.field4520[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field4520[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg7 == 0) {
                    if (var11 - arg2 == var12 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field4520[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 - arg2) == var9 && (this.field4520[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var11 - arg2) == var12 && var10 >= var9 && var10 <= var14 && (this.field4520[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 - arg2) == var9 && (this.field4520[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg2) == var12 && var9 <= var10 && var10 <= var14 && (this.field4520[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var10 + 1 == var9 && (this.field4520[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var10 - arg2) == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 - arg2 == var12 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 + 1 == var9 && (this.field4520[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 <= var10 && var14 >= var10 && (this.field4520[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg2 == var9) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9 && (this.field4520[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var11 && var13 >= var11 && var10 - arg2 == var9 && (this.field4520[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg2) == var12 && var10 >= var9 && var10 <= var14 && (this.field4520[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 <= var10 && var10 <= var14 && (this.field4520[var12][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIIIIIIIII)Z", line = 1872)
    private final boolean method2103(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4531++;
        int var11 = arg2 + arg4;
        int var12 = arg7 + arg5;
        int var13 = arg6 + arg8;
        int var14 = arg3 + arg9;
        if (arg2 == var13 && (arg1 & 0x2) == 0) {
            int var15 = arg3 <= arg7 ? arg7 : arg3;
            int var16 = var12 <= var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field4520[var13 - this.field4507 - 1][var15 - this.field4521] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg1 & 0x8) == 0) {
            int var17 = arg3 <= arg7 ? arg7 : arg3;
            int var18 = var14 < var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field4520[arg8 - this.field4507][var17 - this.field4521] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var12 && (arg1 & 0x1) == 0) {
            int var19 = arg8 < arg2 ? arg2 : arg8;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field4520[var19 - this.field4507][var12 - this.field4521 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var14 && (arg1 & 0x4) == 0) {
            int var21 = arg8 >= arg2 ? arg8 : arg2;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field4520[var21 - this.field4507][arg7 - this.field4521] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        if (arg0) {
            this.method2101(33, -104, -37);
        }
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIIIII)V", line = 1965)
    public static final void method2104(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4527++;
        class192.field3027++;
        if (class173.field2746 != null && class173.field2746.field1359 - ((class173.field2746.method808(arg1 - 65) - 1) * 64) >> 7 == class266.field4126 && class173.field2746.field1286 - (class173.field2746.method808(-22) * 64 - 64) >> 7 == class278.field4291) {
            class266.field4126 = 0;
            class29.field472 = false;
        }
        class208.method1546((byte) 89);
        if (!arg0) {
            class202.method1513(true);
        }
        class176.method1372(true);
        if (class240.field3737) {
            class360.method2528(true, arg2, arg3, arg5, (byte) 66, arg4);
            arg3 = class233.field3637;
            arg4 = class352.field5629;
            arg2 = class288.field4495;
            arg5 = class181.field2846;
        }
        class273.field4212 = arg3;
        class273.field4209 = arg4;
        if (class314.field4858 == 1) {
            int var6 = (int) class279.field4312;
            if (var6 < (class66.field1004 / 256)) {
                var6 = class66.field1004 / 256;
            }
            int var7 = (int) class313.field4846 + class106.field1592 & 0x7FF;
            if (class32.field495[4] && var6 < class284.field4389[4] + 128) {
                var6 = class284.field4389[4] + 128;
            }
            class118.method1003(class231.field3609, var6 * 3 + 600, var6, class226.field3519, (byte) -125, class193.method1469(class173.field2746.field1286, class173.field2746.field1359, (byte) -47, class119.field1826) - 50, var7, arg2);
        } else if (class314.field4858 == 4) {
            int var8 = (int) class313.field4846 & 0x7FF;
            int var9 = (int) class279.field4312;
            if (var9 < (class66.field1004 / 256)) {
                var9 = class66.field1004 / 256;
            }
            if (class32.field495[4] && class284.field4389[4] + 128 > var9) {
                var9 = class284.field4389[4] + 128;
            }
            class118.method1003(class231.field3609, var9 * 3 + 600, var9, class226.field3519, (byte) -124, class193.method1469(class62.field950, class64.field979, (byte) -47, class119.field1826) - 50, var8, arg2);
        } else if (class314.field4858 == 5) {
            class94.method836(0, arg2);
        }
        int var10 = class151.field2465;
        int var11 = class64.field975;
        int var12 = class191.field3005;
        int var13 = class10.field143;
        int var14 = class15.field248;
        for (int var15 = arg1; var15 < 5; var15++) {
            if (class32.field495[var15]) {
                int var16 = (int) ((double) (class79.field1153[var15] * 2 + 1) * Math.random() + Math.sin((double) class309.field4773[var15] / 100.0D * (double) class239.field3718[var15]) * (double) class284.field4389[var15] - (double) class79.field1153[var15]);
                if (var15 == 4) {
                    class191.field3005 += var16;
                    if (class191.field3005 < 128) {
                        class191.field3005 = 128;
                    }
                    if (class191.field3005 > 383) {
                        class191.field3005 = 383;
                    }
                }
                if (var15 == 1) {
                    class64.field975 += var16;
                }
                if (var15 == 0) {
                    class151.field2465 += var16;
                }
                if (var15 == 3) {
                    class15.field248 = class15.field248 + var16 & 0x7FF;
                }
                if (var15 == 2) {
                    class10.field143 += var16;
                }
            }
        }
        class317.method2231(arg1 + 102);
        if (class240.field3737) {
            class213.method1595(arg3, arg4, arg3 + arg5, arg2 + arg4);
            float var18 = (float) class15.field248 * 0.17578125F;
            float var19 = (float) class191.field3005 * 0.17578125F;
            if (class314.field4858 == 3) {
                var18 = class318.field4902 * 360.0F / 6.2831855F;
                var19 = class176.field2780 * 360.0F / 6.2831855F;
            }
            boolean var20 = false;
            int var21;
            if (class295.field4578 == 10) {
                var21 = class78.method722(class139.field2321, class247.field3840, class151.field2465 >> 10, (byte) -124, class10.field143 >> 10);
            } else {
                var21 = class78.method722(class139.field2321, class247.field3840, class173.field2746.field1300[0] >> 3, (byte) -124, class173.field2746.field1290[0] >> 3);
            }
            if (class308.field4760 < 0) {
                class240.method1793(var21);
            } else {
                class240.method1796();
                class229 var22 = class208.method1547(class308.field4760, class346.field5507, class314.field4855, arg1 ^ 0x97325B50, class337.field5172);
                var22.method1723(class309.field4772, arg3, arg4, arg5, arg2, class191.field3005, class15.field248, var21);
            }
            class240.method1792(arg3, arg4, arg5, arg2, arg5 / 2 + arg3, arg2 / 2 + arg4, var19, var18, class209.field3223, class209.field3223);
            class104.method902(false, (byte) 36);
            class240.method1812();
            class240.method1807(true);
            class240.method1815(true);
        } else {
            class60.method598(arg3, arg4, arg3 + arg5, arg2 + arg4);
            class107.method923();
            if (class308.field4760 >= 0) {
                class229 var17 = class208.method1547(class308.field4760, class346.field5507, class314.field4855, -1758307504, class337.field5172);
                var17.method1722(class309.field4772, arg3, arg4, arg5, arg2, class191.field3005, class15.field248, 0);
            } else {
                class60.method611(arg3, arg4, arg5, arg2, 0);
            }
        }
        if (class6.field89 || arg3 > class344.field5479 || class344.field5479 >= arg3 + arg5 || arg4 > class191.field3003 || class191.field3003 >= arg2 + arg4) {
            class112.field1718 = false;
            class214.field3348 = true;
            class74.field1096 = 0;
        } else {
            int var23 = class66.field997;
            int var24 = class173.field2752;
            class224.field3486 = (class344.field5479 - arg3) * (var24 - var23) / arg5 + var23;
            class112.field1718 = true;
            class74.field1096 = 0;
            int var25 = class79.field1162;
            class214.field3348 = true;
            int var26 = class171.field2695;
            class85.field1211 = (var26 - var25) * (class191.field3003 - arg4) / arg2 + var25;
        }
        class102.method886(true);
        byte var27 = class243.method1832((byte) 95) == 2 ? (byte) class192.field3027 : 1;
        if (class240.field3737) {
            class299.method2155(class360.field5718, !class108.field1626);
            class253.method1884(class191.field3005, (byte) -127, class64.field975, class151.field2465, class15.field248, class10.field143);
            class240.field3748 = class360.field5718;
            class297.method2137(class151.field2465, class64.field975, class10.field143, class191.field3005, class15.field248, class157.field2521, class102.field1533, class31.field479, class83.field1199, class223.field3467, class120.field1870, class119.field1826 + 1, var27, class173.field2746.field1359 >> 7, class173.field2746.field1286 >> 7);
            class9.field130 = true;
            class299.method2146();
            class253.method1884(0, (byte) -127, 0, 0, 0, 0);
            class102.method886(true);
            class349.method2453(class209.field3223, arg4, class209.field3223, arg3, arg5, arg2, (byte) -24);
            class163.method1302(class209.field3223, arg2, arg4, arg5, class209.field3223, (byte) 51, arg3);
            class228.method1705();
        } else {
            class297.method2137(class151.field2465, class64.field975, class10.field143, class191.field3005, class15.field248, class157.field2521, class102.field1533, class31.field479, class83.field1199, class223.field3467, class120.field1870, class119.field1826 + 1, var27, class173.field2746.field1359 >> 7, class173.field2746.field1286 >> 7);
            class102.method886(true);
            class228.method1705();
            class349.method2453(256, arg4, 256, arg3, arg5, arg2, (byte) -54);
            class163.method1302(256, arg2, arg4, arg5, 256, (byte) 51, arg3);
        }
        ((class224) class107.field1619).method1684(70, class247.field3840);
        class138.method1148(arg4, arg2, arg3, arg5, -117);
        class64.field975 = var11;
        class15.field248 = var14;
        class10.field143 = var13;
        class151.field2465 = var10;
        class191.field3005 = var12;
        if (class165.field2611 && class160.field2553.method1711(80) == 0) {
            class165.field2611 = false;
        }
        if (class165.field2611) {
            if (class240.field3737) {
                class213.method1593(arg3, arg4, arg5, arg2, 0);
            } else {
                class60.method611(arg3, arg4, arg5, arg2, 0);
            }
            class307.method2198(-1, class268.field4134, false);
        }
        if (!arg0 && !class165.field2611 && !class6.field89 && arg3 <= class344.field5479 && class344.field5479 < (arg3 + arg5) && arg4 <= class191.field3003 && class191.field3003 < arg2 + arg4) {
            class334.method2350(arg4, class191.field3003, arg3, arg5, arg2, 84, class344.field5479);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZIIIZII)V", line = 2229)
    public final void method2105(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var9 = arg0 - this.field4521;
        field4519++;
        int var10 = arg6 - this.field4507;
        if (arg2 == arg4 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg7;
            arg7 = var11;
        }
        int var12 = 256;
        if (arg1) {
            var12 |= 0x20000;
        }
        if (arg5) {
            var12 |= 0x40000000;
        }
        for (int var13 = var10; var13 < (arg3 + var10); var13++) {
            if (var13 >= 0 && this.field4512 > var13) {
                for (int var14 = var9; var14 < (arg7 + var9); var14++) {
                    if (var14 >= 0 && this.field4517 > var14) {
                        this.method2108(var14, var12, arg4 - 11740, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V", line = 2280)
    public static final void method2106(int arg0, int arg1) {
        field4529++;
        if (!class328.method2321(0, arg1)) {
            return;
        }
        class342[] var2 = class334.field5108[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class342 var4 = var2[var3];
            if (var4 != null) {
                var4.field5361 = 0;
                var4.field5310 = 0;
                var4.field5364 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)V", line = 2317)
    public final void method2107(boolean arg0, int arg1, int arg2) {
        field4505++;
        int var4 = arg2 - this.field4507;
        int var5 = arg1 - this.field4521;
        this.field4520[var4][var5] = class41.method426(this.field4520[var4][var5], 2097152);
        if (!arg0) {
            this.field4520 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V", line = 2332)
    private final void method2108(int arg0, int arg1, int arg2, int arg3) {
        field4528++;
        this.field4520[arg3][arg0] = class301.method2169(this.field4520[arg3][arg0], ~arg1);
        if (arg2 != -11739) {
            this.method2097(17);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V", line = 2342)
    public class290(int arg0, int arg1) {
        this.field4517 = arg1;
        this.field4507 = 0;
        this.field4521 = 0;
        this.field4512 = arg0;
        this.field4520 = new int[this.field4512][this.field4517];
        this.method2097(2097152);
    }
}
