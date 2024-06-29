import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class253 {

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    private int field4328;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private int field4314;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[[I")
    public int[][] field4317;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Z")
    public static boolean field4311 = false;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "Luf;")
    public static class168 field4338 = class148.method1019(-1720, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field4334 = 0;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Ldk;")
    public static class241 field4326;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 6)
    public final void method1728(int arg0) {
        field4318++;
        if (arg0 != 16777216) {
            field4311 = true;
        }
        for (int var2 = 0; var2 < this.field4328; var2++) {
            for (int var3 = 0; var3 < this.field4323; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4328 - 5) <= var2 || this.field4323 - 5 <= var3) {
                    this.field4317[var2][var3] = 16777215;
                } else {
                    this.field4317[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIZIBI)V", line = 37)
    public final void method1729(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        field4316++;
        int var8 = arg4 - this.field4314;
        int var9 = arg1 - this.field4329;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg0;
            arg0 = arg6;
            arg6 = var10;
        }
        int var11 = 256;
        if (arg3) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < (arg0 + var8); var12++) {
            if (var12 >= 0 && var12 < this.field4328) {
                for (int var13 = var9; var13 < arg6 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field4323) {
                        this.method1743(var11, var13, var12, true);
                    }
                }
            }
        }
        if (arg5 >= -116) {
            field4311 = false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)V", line = 88)
    public final void method1730(int arg0, int arg1, byte arg2) {
        field4325++;
        int var4 = arg1 - this.field4314;
        int var5 = arg0 - this.field4329;
        if (arg2 >= -97) {
            method1734(22);
        }
        this.field4317[var4][var5] = class80.method492(this.field4317[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBIIZ)V", line = 101)
    public final void method1731(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field4329;
        field4332++;
        int var8 = arg1 - this.field4314;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < arg3 + var8; var10++) {
            if (var10 >= 0 && var10 < this.field4328) {
                for (int var11 = var7; var11 < arg4 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field4323) {
                        this.method1736(var9, var11, var10, -126);
                    }
                }
            }
        }
        if (arg2 > -56) {
            method1735(-110, -13, (byte[]) null, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIIII)V", line = 143)
    public final void method1732(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field4329;
        if (arg1 != -2) {
            this.method1736(72, -110, -97, -40);
        }
        field4322++;
        int var8 = arg3 - this.field4314;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1736(128, var7, var8, -119);
                this.method1736(8, var7, var8 - 1, arg1 + -118);
            }
            if (arg4 == 1) {
                this.method1736(2, var7, var8, arg1 - 125);
                this.method1736(32, var7 + 1, var8, 64);
            }
            if (arg4 == 2) {
                this.method1736(8, var7, var8, 75);
                this.method1736(128, var7, var8 + 1, 13);
            }
            if (arg4 == 3) {
                this.method1736(32, var7, var8, arg1 ^ 0x7E);
                this.method1736(2, var7 - 1, var8, -128);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1736(1, var7, var8, 27);
                this.method1736(16, var7 + 1, var8 + -1, 9);
            }
            if (arg4 == 1) {
                this.method1736(4, var7, var8, arg1 - 17);
                this.method1736(64, var7 + 1, var8 + 1, -124);
            }
            if (arg4 == 2) {
                this.method1736(16, var7, var8, -122);
                this.method1736(1, var7 - 1, var8 - -1, arg1 ^ 0x76);
            }
            if (arg4 == 3) {
                this.method1736(64, var7, var8, 84);
                this.method1736(4, var7 - 1, var8 - 1, arg1 ^ 0x78);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1736(130, var7, var8, -127);
                this.method1736(8, var7, var8 - 1, arg1 ^ 0xFFFFFFF6);
                this.method1736(32, var7 + 1, var8, -124);
            }
            if (arg4 == 1) {
                this.method1736(10, var7, var8, -6);
                this.method1736(32, var7 + 1, var8, arg1 + 4);
                this.method1736(128, var7, var8 + 1, 49);
            }
            if (arg4 == 2) {
                this.method1736(40, var7, var8, -123);
                this.method1736(128, var7, var8 + 1, -126);
                this.method1736(2, var7 - 1, var8, -6);
            }
            if (arg4 == 3) {
                this.method1736(160, var7, var8, -126);
                this.method1736(2, var7 - 1, var8, arg1 ^ 0xFFFFFFCD);
                this.method1736(8, var7, var8 - 1, -126);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1736(65536, var7, var8, -119);
                this.method1736(4096, var7, var8 - 1, 116);
            }
            if (arg4 == 1) {
                this.method1736(1024, var7, var8, -122);
                this.method1736(16384, var7 + 1, var8, arg1 ^ 0x79);
            }
            if (arg4 == 2) {
                this.method1736(4096, var7, var8, -7);
                this.method1736(65536, var7, var8 + 1, 70);
            }
            if (arg4 == 3) {
                this.method1736(16384, var7, var8, -120);
                this.method1736(1024, var7 - 1, var8, 36);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1736(512, var7, var8, arg1 - 122);
                this.method1736(8192, var7 + 1, var8 + -1, -124);
            }
            if (arg4 == 1) {
                this.method1736(2048, var7, var8, arg1 ^ 0x79);
                this.method1736(32768, var7 + 1, var8 - -1, arg1 + 69);
            }
            if (arg4 == 2) {
                this.method1736(8192, var7, var8, arg1 + 95);
                this.method1736(512, var7 - 1, var8 + 1, arg1 ^ 0xFFFFFFB9);
            }
            if (arg4 == 3) {
                this.method1736(32768, var7, var8, 16);
                this.method1736(2048, var7 - 1, var8 + -1, 74);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1736(66560, var7, var8, 101);
            this.method1736(4096, var7, var8 - 1, 23);
            this.method1736(16384, var7 + 1, var8, -121);
        }
        if (arg4 == 1) {
            this.method1736(5120, var7, var8, -125);
            this.method1736(16384, var7 + 1, var8, 75);
            this.method1736(65536, var7, var8 + 1, arg1 ^ 0xFFFFFFD2);
        }
        if (arg4 == 2) {
            this.method1736(20480, var7, var8, 16);
            this.method1736(65536, var7, var8 + 1, arg1 ^ 0xFFFFFF8F);
            this.method1736(1024, var7 - 1, var8, 12);
        }
        if (arg4 == 3) {
            this.method1736(81920, var7, var8, arg1 ^ 0xFFFFFFCC);
            this.method1736(1024, var7 - 1, var8, -128);
            this.method1736(4096, var7, var8 - 1, 62);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBIIIIIII)Z", line = 349)
    public final boolean method1733(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4339++;
        if (arg2 <= 1) {
            int var10 = arg0 + arg3 - 1;
            int var11 = arg5 + arg7 - 1;
            if (arg6 >= arg5 && arg6 <= var11 && arg0 <= arg8 && var10 >= arg8) {
                return true;
            } else if ((arg5 - 1) == arg6 && arg0 <= arg8 && arg8 <= var10 && (this.field4317[arg6 - this.field4314][arg8 - this.field4329] & 0x8) == 0 && (arg4 & 0x8) == 0) {
                return true;
            } else if (var11 + 1 == arg6 && arg8 >= arg0 && arg8 <= var10 && (this.field4317[arg6 - this.field4314][arg8 - this.field4329] & 0x80) == 0 && (arg4 & 0x2) == 0) {
                return true;
            } else if (arg0 - 1 == arg8 && arg5 <= arg6 && var11 >= arg6 && (this.field4317[arg6 - this.field4314][arg8 - this.field4329] & 0x2) == 0 && (arg4 & 0x4) == 0) {
                return true;
            } else if (var10 + 1 == arg8 && arg5 <= arg6 && var11 >= arg6 && (this.field4317[arg6 - this.field4314][arg8 - this.field4329] & 0x20) == 0 && (arg4 & 0x1) == 0) {
                return true;
            } else {
                int var12 = 101 / ((39 - arg1) / 52);
                return false;
            }
        } else if (this.method1746(17436672, arg0, arg6, arg3, arg8, arg2, arg5, arg2, arg7)) {
            return true;
        } else {
            return this.method1738(arg6, arg7, arg0, arg8, arg4, (byte) 6, arg2, arg3, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 404)
    public static final void method1734(int arg0) {
        field4319++;
        int var1 = -10 % ((12 - arg0) / 38);
        class194.field3147.method1429((byte) 120);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[BB)I", line = 418)
    public static final int method1735(int arg0, int arg1, byte[] arg2, byte arg3) {
        field4333++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class221.field3585[(var4 ^ arg2[var5]) & 0xFF];
        }
        if (arg3 < 71) {
            field4340 = 83;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V", line = 441)
    private final void method1736(int arg0, int arg1, int arg2, int arg3) {
        field4337++;
        int var5 = -120 / ((arg3 + 69) / 50);
        this.field4317[arg2][arg1] = class80.method492(this.field4317[arg2][arg1], arg0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V", line = 458)
    public final void method1737(int arg0, int arg1, int arg2) {
        field4313++;
        int var4 = arg0 - this.field4314;
        int var5 = arg1 - this.field4329;
        if (arg2 == 16909312) {
            this.field4317[var4][var5] = class80.method492(this.field4317[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIBIIII)Z", line = 471)
    private final boolean method1738(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field4330++;
        int var11 = arg3 + arg6;
        if (arg5 != 6) {
            field4340 = -78;
        }
        int var12 = arg0 + arg9;
        int var13 = arg1 + arg8;
        int var14 = arg2 + arg7;
        if (arg0 >= arg8 && var13 > arg0) {
            if (arg2 == var11 && (arg4 & 0x4) == 0) {
                int var15 = arg0;
                int var16 = var12 <= var13 ? var12 : var13;
                while (var16 > var15) {
                    if ((this.field4317[var15 - this.field4314][var11 - this.field4329 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg3 == var14 && (arg4 & 0x1) == 0) {
                int var17 = arg0;
                int var18 = var13 < var12 ? var13 : var12;
                while (var18 > var17) {
                    if ((this.field4317[var17 - this.field4314][arg3 - this.field4329] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var12 > arg8 && var12 <= var13) {
            if (arg2 == var11 && (arg4 & 0x4) == 0) {
                for (int var19 = arg8; var19 < var12; var19++) {
                    if ((this.field4317[var19 - this.field4314][var11 - this.field4329 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var14 && (arg4 & 0x1) == 0) {
                for (int var20 = arg8; var20 < var12; var20++) {
                    if ((this.field4317[var20 - this.field4314][arg3 - this.field4329] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 >= arg2 && var14 > arg3) {
            if (arg8 == var12 && (arg4 & 0x8) == 0) {
                int var21 = arg3;
                int var22 = var11 <= var14 ? var11 : var14;
                while (var22 > var21) {
                    if ((this.field4317[var12 - this.field4314 - 1][var21 - this.field4329] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg0 == var13 && (arg4 & 0x2) == 0) {
                int var23 = arg3;
                int var24 = var14 < var11 ? var14 : var11;
                while (var24 > var23) {
                    if ((this.field4317[arg0 - this.field4314][var23 - this.field4329] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg2 && var11 <= var14) {
            if (arg8 == var12 && (arg4 & 0x8) == 0) {
                for (int var25 = arg2; var25 < var11; var25++) {
                    if ((this.field4317[var12 - this.field4314 - 1][var25 - this.field4329] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg4 & 0x2) == 0) {
                for (int var26 = arg2; var26 < var11; var26++) {
                    if ((this.field4317[arg0 - this.field4314][var26 - this.field4329] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIII)Z", line = 632)
    public final boolean method1739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4335++;
        if (arg7 == 1) {
            if (arg0 == arg4 && arg1 == arg6) {
                return true;
            }
        } else if (arg0 >= arg4 && (arg4 + arg7 - 1) >= arg0 && arg1 >= arg1 && (arg1 + arg7 - 1) >= arg1) {
            return true;
        }
        int var9 = arg0 - this.field4314;
        int var10 = arg6 - this.field4329;
        int var11 = arg1 - this.field4329;
        if (arg3 != 0) {
            this.method1743(-94, 79, -9, false);
        }
        int var12 = arg4 - this.field4314;
        if (arg7 == 1) {
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field4317[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field4317[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field4317[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field4317[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field4317[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field4317[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var10 && (this.field4317[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field4317[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field4317[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field4317[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var11 && (this.field4317[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg7 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg5 == 0) {
                if (arg2 == 0) {
                    if (var9 - arg7 == var12 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 + 1 == var10 && (this.field4317[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 - arg7 == var10 && (this.field4317[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 <= var9 && var13 >= var9 && (var11 + 1) == var10) {
                        return true;
                    }
                    if (var9 - arg7 == var12 && var10 <= var11 && var11 <= var14 && (this.field4317[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 >= var10 && var14 >= var11 && (this.field4317[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var12 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 + 1 == var10 && (this.field4317[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var11 - arg7 == var10 && (this.field4317[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 >= var12 && var9 <= var13 && var11 - arg7 == var10) {
                        return true;
                    }
                    if (var9 - arg7 == var12 && var11 >= var10 && var11 <= var14 && (this.field4317[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 <= var11 && var11 <= var14 && (this.field4317[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg2 == 0) {
                    if ((var9 - arg7) == var12 && var10 <= var11 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 <= var11 && var11 <= var14 && (this.field4317[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 - arg7) == var10 && (this.field4317[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg7 == var12 && var11 >= var10 && var11 <= var14 && (this.field4317[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var11 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 >= var10 && var11 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var11 - arg7 == var10 && (this.field4317[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg7) == var12 && var10 <= var11 && var11 <= var14 && (this.field4317[var13][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var11 + 1) == var10 && (this.field4317[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 <= var11 && var11 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 - arg7 == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 - arg7) == var12 && var11 >= var10 && var14 >= var11) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 + 1 == var10 && (this.field4317[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 <= var11 && var11 <= var14 && (this.field4317[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 - arg7 == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 >= var12 && var13 >= var9 && var11 + 1 == var10 && (this.field4317[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var12 <= var9 && var9 <= var13 && var11 - arg7 == var10 && (this.field4317[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg7 == var12 && var10 <= var11 && var14 >= var11 && (this.field4317[var13][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 <= var11 && var14 >= var11 && (this.field4317[var12][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)V", line = 1016)
    public final void method1740(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4314;
        field4327++;
        int var5 = arg1 - this.field4329;
        if (arg2 != -23607) {
            this.method1731(-30, 39, (byte) -32, 26, -83, false);
        }
        this.field4317[var4][var5] = class159.method1119(this.field4317[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIIIIII)Z", line = 1033)
    public final boolean method1741(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4312++;
        if (arg2 == 1) {
            if (arg3 == arg7 && arg5 == arg6) {
                return true;
            }
        } else if (arg7 <= arg3 && arg2 + arg7 - 1 >= arg3 && arg5 >= arg5 && arg5 + arg2 - 1 >= arg5) {
            return true;
        }
        int var9 = arg3 - this.field4314;
        int var10 = arg7 - this.field4314;
        if (arg1) {
            this.method1729(-98, 11, 73, false, -44, (byte) -36, -70);
        }
        int var11 = arg5 - this.field4329;
        int var12 = arg6 - this.field4329;
        if (arg2 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field4317[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 - 1) == var12 && (this.field4317[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4317[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 - 1 == var12 && (this.field4317[var10][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4317[var10][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var11 + 1) == var12 && (this.field4317[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field4317[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var11 + 1 == var12 && (this.field4317[var10][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 == var10 && (var11 + 1) == var12 && (this.field4317[var10][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var12 && (this.field4317[var10][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var10 && var11 == var12 && (this.field4317[var10][var12] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var11 == var12 && (this.field4317[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg2 - 1;
            int var14 = var10 - (1 - arg2);
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var9 + 1 == var10 && var12 <= var11 && var11 <= var13 && (this.field4317[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && var11 - arg2 == var12 && (this.field4317[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var9 - arg2) == var10 && var12 <= var11 && var11 <= var13 && (this.field4317[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var14 && var11 - arg2 == var12 && (this.field4317[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 - arg2) == var10 && var12 <= var11 && var11 <= var13 && (this.field4317[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var14 && (var11 + 1) == var12 && (this.field4317[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 + 1) == var10 && var12 <= var11 && var13 >= var11 && (this.field4317[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var14 >= var9 && var11 + 1 == var12 && (this.field4317[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var10 <= var9 && var14 >= var9 && var11 + 1 == var12 && (this.field4317[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var10 && var9 <= var14 && (var11 - arg2) == var12 && (this.field4317[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg2 == var10 && var12 <= var11 && var11 <= var13 && (this.field4317[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var12 <= var11 && var11 <= var13 && (this.field4317[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 1224)
    public static void method1742(int arg0) {
        if (arg0 == 32) {
            field4326 = null;
            field4338 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIZ)V", line = 1235)
    private final void method1743(int arg0, int arg1, int arg2, boolean arg3) {
        field4321++;
        if (arg3) {
            this.field4317[arg2][arg1] = class159.method1119(this.field4317[arg2][arg1], ~arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIZII)V", line = 1255)
    public final void method1744(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != 0) {
            return;
        }
        int var7 = arg5 - this.field4314;
        int var8 = arg4 - this.field4329;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method1743(128, var8, var7, true);
                this.method1743(8, var8, var7 - 1, true);
            }
            if (arg2 == 1) {
                this.method1743(2, var8, var7, true);
                this.method1743(32, var8 + 1, var7, true);
            }
            if (arg2 == 2) {
                this.method1743(8, var8, var7, true);
                this.method1743(128, var8, var7 + 1, true);
            }
            if (arg2 == 3) {
                this.method1743(32, var8, var7, true);
                this.method1743(2, var8 - 1, var7, true);
            }
        }
        field4315++;
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method1743(1, var8, var7, true);
                this.method1743(16, var8 + 1, var7 + -1, true);
            }
            if (arg2 == 1) {
                this.method1743(4, var8, var7, true);
                this.method1743(64, var8 + 1, var7 + 1, true);
            }
            if (arg2 == 2) {
                this.method1743(16, var8, var7, true);
                this.method1743(1, var8 - 1, var7 + 1, true);
            }
            if (arg2 == 3) {
                this.method1743(64, var8, var7, true);
                this.method1743(4, var8 - 1, var7 + -1, true);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method1743(130, var8, var7, true);
                this.method1743(8, var8, var7 - 1, true);
                this.method1743(32, var8 + 1, var7, true);
            }
            if (arg2 == 1) {
                this.method1743(10, var8, var7, true);
                this.method1743(32, var8 + 1, var7, true);
                this.method1743(128, var8, var7 + 1, true);
            }
            if (arg2 == 2) {
                this.method1743(40, var8, var7, true);
                this.method1743(128, var8, var7 + 1, true);
                this.method1743(2, var8 - 1, var7, true);
            }
            if (arg2 == 3) {
                this.method1743(160, var8, var7, true);
                this.method1743(2, var8 - 1, var7, true);
                this.method1743(8, var8, var7 - 1, true);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method1743(65536, var8, var7, true);
                this.method1743(4096, var8, var7 - 1, true);
            }
            if (arg2 == 1) {
                this.method1743(1024, var8, var7, true);
                this.method1743(16384, var8 + 1, var7, true);
            }
            if (arg2 == 2) {
                this.method1743(4096, var8, var7, true);
                this.method1743(65536, var8, var7 + 1, true);
            }
            if (arg2 == 3) {
                this.method1743(16384, var8, var7, true);
                this.method1743(1024, var8 - 1, var7, true);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method1743(512, var8, var7, true);
                this.method1743(8192, var8 + 1, var7 + -1, true);
            }
            if (arg2 == 1) {
                this.method1743(2048, var8, var7, true);
                this.method1743(32768, var8 + 1, var7 + 1, true);
            }
            if (arg2 == 2) {
                this.method1743(8192, var8, var7, true);
                this.method1743(512, var8 - 1, var7 + 1, true);
            }
            if (arg2 == 3) {
                this.method1743(32768, var8, var7, true);
                this.method1743(2048, var8 - 1, var7 - 1, true);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1743(66560, var8, var7, true);
            this.method1743(4096, var8, var7 - 1, true);
            this.method1743(16384, var8 + 1, var7, true);
        }
        if (arg2 == 1) {
            this.method1743(5120, var8, var7, true);
            this.method1743(16384, var8 + 1, var7, true);
            this.method1743(65536, var8, var7 + 1, true);
        }
        if (arg2 == 2) {
            this.method1743(20480, var8, var7, true);
            this.method1743(65536, var8, var7 + 1, true);
            this.method1743(1024, var8 - 1, var7, true);
        }
        if (arg2 == 3) {
            this.method1743(81920, var8, var7, true);
            this.method1743(1024, var8 - 1, var7, true);
            this.method1743(4096, var8, var7 - 1, true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILg;III)V", line = 1465)
    public static final void method1745(int arg0, class242 arg1, int arg2, int arg3, int arg4) {
        class228.method1563(arg4, arg0, arg1.field3989 + arg4, arg0 - -arg1.field4057);
        if (class76.field1032 >= 3) {
            class284 var5 = arg1.method1666(-51, false);
            if (var5 != null) {
                var5.method151(arg4, arg0);
            }
        } else {
            ((class258) class275.field4637).method1776(arg4, arg0, arg1.field3989, arg1.field4057, class275.field4637.field4801 / 2, class275.field4637.field4808 / 2, class71.field959, 256, (class258) arg1.method1666(-81, false));
        }
        if (arg2 >= 81) {
            field4331++;
            class131.field2028[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIII)Z", line = 1509)
    private final boolean method1746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4320++;
        if (arg2 < arg6 + arg8 && arg2 + arg7 > arg6) {
            if (arg0 != 17436672) {
                method1735(-17, 102, (byte[]) null, (byte) -22);
            }
            return arg1 + arg3 > arg4 && arg1 < (arg4 + arg5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)Z", line = 1528)
    public final boolean method1747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4324++;
        if (arg3 == arg4 && arg0 == arg2) {
            return true;
        }
        int var6 = arg2 - this.field4329;
        int var7 = arg4 - this.field4314;
        if (arg1 != 17488) {
            field4340 = -81;
        }
        if (var7 < 0 || this.field4328 <= var7 || var6 < 0 || this.field4323 <= var6) {
            return false;
        }
        int var8 = arg0 - this.field4329;
        int var9 = arg3 - this.field4314;
        int var10;
        if (var7 > var9) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11;
        if (var6 > var8) {
            var11 = var6 - var8;
        } else {
            var11 = var8 - var6;
        }
        if (var11 >= var10) {
            int var12 = 32768;
            int var13 = var10 * 65536 / var11;
            while (var6 != var8) {
                if (var8 < var6) {
                    if ((this.field4317[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field4317[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var7 > var9) {
                        if ((this.field4317[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var7 < var9) {
                        if ((this.field4317[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 < var7) {
                    if ((this.field4317[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field4317[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var6) {
                        if ((this.field4317[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field4317[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field4317[var7][var6] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V", line = 1686)
    public class253(int arg0, int arg1) {
        this.field4328 = arg0;
        this.field4329 = 0;
        this.field4314 = 0;
        this.field4323 = arg1;
        this.field4317 = new int[this.field4328][this.field4323];
        this.method1728(16777216);
    }
}
