import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class323 {

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    private int field5025 = 0;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    private int field5020;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    private int field5032;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "[[I")
    public int[][] field5037;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field5016 = -1;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "[J")
    public static long[] field5040 = new long[100];

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lsd;")
    public static class27 field5028;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "[I")
    public static int[] field5027;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "[[[B")
    public static byte[][][] field5018;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "[[[B")
    public static byte[][][] field5039;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII)V", line = 5)
    public final void method2202(boolean arg0, int arg1, int arg2) {
        field5024++;
        int var4 = arg2 - this.field5015;
        if (!arg0) {
            int var5 = arg1 - this.field5025;
            this.field5037[var5][var4] = class142.method1078(this.field5037[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 20)
    public final void method2203(boolean arg0) {
        if (!arg0) {
            this.field5032 = -19;
        }
        field5030++;
        for (int var2 = 0; var2 < this.field5020; var2++) {
            for (int var3 = 0; var3 < this.field5032; var3++) {
                if (var2 == 0 || var3 == 0 || this.field5020 - 5 <= var2 || (this.field5032 - 5) <= var3) {
                    this.field5037[var2][var3] = 16777215;
                } else {
                    this.field5037[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 57)
    public final void method2204(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field5025;
        if (arg0 != -13763) {
            this.method2215(-11, -77, 3, -82, -81, 116, -61, 113);
        }
        int var5 = arg1 - this.field5015;
        field5041++;
        this.field5037[var4][var5] = class147.method1098(this.field5037[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)Z", line = 77)
    public final boolean method2205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5029++;
        if (arg1 == arg4 && arg2 == arg3) {
            return true;
        }
        int var6 = arg3 - this.field5015;
        int var7 = arg1 - this.field5025;
        if (var7 < 0 || this.field5020 <= var7 || var6 < 0 || var6 >= this.field5032) {
            return false;
        } else if (arg0 == 19661058) {
            int var8 = arg2 - this.field5015;
            int var9 = arg4 - this.field5025;
            int var10;
            if (var8 >= var6) {
                var10 = var8 - var6;
            } else {
                var10 = var6 - var8;
            }
            int var11;
            if (var9 >= var7) {
                var11 = var9 - var7;
            } else {
                var11 = var7 - var9;
            }
            if (var10 < var11) {
                int var12 = 32768;
                int var13 = var10 * 65536 / var11;
                while (var7 != var9) {
                    if (var9 < var7) {
                        if ((this.field5037[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var7) {
                        if ((this.field5037[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                    var12 += var13;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var6 > var8) {
                            if ((this.field5037[var9][var8] & 0x12C0102) != 0) {
                                return false;
                            }
                            var8++;
                        } else if (var6 < var8) {
                            if ((this.field5037[var9][var8] & 0x12C0120) != 0) {
                                return false;
                            }
                            var8--;
                        }
                    }
                }
            } else {
                int var14 = var11 * 65536 / var10;
                int var15 = 32768;
                while (var6 != var8) {
                    if (var6 > var8) {
                        if ((this.field5037[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field5037[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var9 < var7) {
                            if ((this.field5037[var9][var8] & 0x12C0108) != 0) {
                                return false;
                            }
                            var9++;
                        } else if (var7 < var9) {
                            if ((this.field5037[var9][var8] & 0x12C0180) != 0) {
                                return false;
                            }
                            var9--;
                        }
                    }
                }
            }
            return (this.field5037[var7][var6] & 0x1240100) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIIIIIII)Z", line = 233)
    public final boolean method2206(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5019++;
        if (arg0 > 1) {
            return this.method2219(arg6, arg2, arg5, arg0, arg4, arg7, arg0, arg3, 77) ? true : this.method2208(arg0, arg2, arg3, arg8, (byte) -114, arg7, arg6, arg5, arg4, arg0);
        } else if (arg1) {
            return true;
        } else {
            int var10 = arg3 + arg4 - 1;
            int var11 = arg2 + arg5 - 1;
            if (arg6 >= arg3 && var10 >= arg6 && arg7 >= arg5 && var11 >= arg7) {
                return true;
            } else if ((arg3 - 1) == arg6 && arg7 >= arg5 && arg7 <= var11 && (this.field5037[arg6 - this.field5025][arg7 - this.field5015] & 0x8) == 0 && (arg8 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg6 && arg7 >= arg5 && var11 >= arg7 && (this.field5037[arg6 - this.field5025][arg7 - this.field5015] & 0x80) == 0 && (arg8 & 0x2) == 0) {
                return true;
            } else if ((arg5 - 1) == arg7 && arg3 <= arg6 && var10 >= arg6 && (this.field5037[arg6 - this.field5025][arg7 - this.field5015] & 0x2) == 0 && (arg8 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg7 && arg6 >= arg3 && arg6 <= var10 && (this.field5037[arg6 - this.field5025][arg7 - this.field5015] & 0x20) == 0 && (arg8 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 274)
    public static final void method2207(int arg0) {
        field5031++;
        class122.field1922 = 0;
        class167.field2521 = 0;
        class282.method1985(-161);
        class111.method879((byte) 22);
        class262.method1807(18566);
        for (int var1 = 0; var1 < class167.field2521; var1++) {
            int var2 = class224.field3493[var1];
            if (class312.field4852 != class161.field2394[var2].field4481) {
                if (class161.field2394[var2].field698.method1331(true)) {
                    class246.method1701(class161.field2394[var2], -18005);
                }
                class161.field2394[var2].method412((class183) null, true);
                class161.field2394[var2] = null;
            }
        }
        if (class79.field1112 != class88.field1293.field455) {
            throw new RuntimeException("gnp1 pos:" + class88.field1293.field455 + " psize:" + class79.field1112);
        }
        for (int var3 = arg0; var3 < class122.field1923; var3++) {
            if (class161.field2394[class126.field1995[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class122.field1923);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIBIIIII)Z", line = 323)
    private final boolean method2208(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5017++;
        int var11 = arg0 + arg6;
        int var12 = arg2 + arg8;
        int var13 = -12 % ((arg4 - 26) / 60);
        int var14 = arg1 + arg7;
        int var15 = arg5 + arg9;
        if (arg2 <= arg6 && arg6 < var12) {
            if (arg7 == var15 && (arg3 & 0x4) == 0) {
                int var16 = var12 >= var11 ? var11 : var12;
                for (int var17 = arg6; var17 < var16; var17++) {
                    if ((this.field5037[var17 - this.field5025][var15 - this.field5015 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var14 && (arg3 & 0x1) == 0) {
                int var18 = var12 >= var11 ? var11 : var12;
                for (int var19 = arg6; var19 < var18; var19++) {
                    if ((this.field5037[var19 - this.field5025][arg5 - this.field5015] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg2 < var11 && var11 <= var12) {
            if (arg7 == var15 && (arg3 & 0x4) == 0) {
                for (int var20 = arg2; var20 < var11; var20++) {
                    if ((this.field5037[var20 - this.field5025][var15 - this.field5015 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var14 && (arg3 & 0x1) == 0) {
                for (int var21 = arg2; var21 < var11; var21++) {
                    if ((this.field5037[var21 - this.field5025][arg5 - this.field5015] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 >= arg7 && arg5 < var14) {
            if (arg2 == var11 && (arg3 & 0x8) == 0) {
                int var22 = arg5;
                int var23 = var15 > var14 ? var14 : var15;
                while (var23 > var22) {
                    if ((this.field5037[var11 - this.field5025 - 1][var22 - this.field5015] & 0x8) == 0) {
                        return true;
                    }
                    var22++;
                }
            } else if (arg6 == var12 && (arg3 & 0x2) == 0) {
                int var24 = arg5;
                int var25 = var14 < var15 ? var14 : var15;
                while (var24 < var25) {
                    if ((this.field5037[arg6 - this.field5025][var24 - this.field5015] & 0x80) == 0) {
                        return true;
                    }
                    var24++;
                }
            }
        } else if (var15 > arg7 && var14 >= var15) {
            if (arg2 == var11 && (arg3 & 0x8) == 0) {
                for (int var26 = arg7; var26 < var15; var26++) {
                    if ((this.field5037[var11 - this.field5025 - 1][var26 - this.field5015] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var12 && (arg3 & 0x2) == 0) {
                for (int var27 = arg7; var27 < var15; var27++) {
                    if ((this.field5037[arg6 - this.field5025][var27 - this.field5015] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIII)V", line = 484)
    private final void method2209(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            field5016 = -42;
        }
        this.field5037[arg3][arg1] = class142.method1078(this.field5037[arg3][arg1], ~arg2);
        field5023++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI)V", line = 495)
    public final void method2210(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field5015;
        int var5 = arg2 - this.field5025;
        if (arg1) {
            this.field5037[var5][var4] = class147.method1098(this.field5037[var5][var4], 2097152);
            field5036++;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 511)
    public static final void method2211(byte arg0) {
        if (arg0 != -37) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class268.field4041[var1] = false;
        }
        class268.field4038 = -1;
        class222.field3473 = 0;
        class253.field3772 = 0;
        class78.field1104 = 1;
        class144.field2219 = -1;
        field5033++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIBIZ)V", line = 536)
    public final void method2212(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field5015;
        field5014++;
        int var8 = arg1 - this.field5025;
        if (arg3 > -101) {
            this.method2209(true, 10, -54, -22);
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method2209(false, var7, 128, var8);
                this.method2209(false, var7, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2209(false, var7, 2, var8);
                this.method2209(false, var7 + 1, 32, var8);
            }
            if (arg0 == 2) {
                this.method2209(false, var7, 8, var8);
                this.method2209(false, var7, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2209(false, var7, 32, var8);
                this.method2209(false, var7 - 1, 2, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method2209(false, var7, 1, var8);
                this.method2209(false, var7 + 1, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2209(false, var7, 4, var8);
                this.method2209(false, var7 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2209(false, var7, 16, var8);
                this.method2209(false, var7 - 1, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2209(false, var7, 64, var8);
                this.method2209(false, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method2209(false, var7, 130, var8);
                this.method2209(false, var7, 8, var8 - 1);
                this.method2209(false, var7 + 1, 32, var8);
            }
            if (arg0 == 1) {
                this.method2209(false, var7, 10, var8);
                this.method2209(false, var7 + 1, 32, var8);
                this.method2209(false, var7, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2209(false, var7, 40, var8);
                this.method2209(false, var7, 128, var8 + 1);
                this.method2209(false, var7 - 1, 2, var8);
            }
            if (arg0 == 3) {
                this.method2209(false, var7, 160, var8);
                this.method2209(false, var7 - 1, 2, var8);
                this.method2209(false, var7, 8, var8 - 1);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method2209(false, var7, 65536, var8);
                this.method2209(false, var7, 4096, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2209(false, var7, 1024, var8);
                this.method2209(false, var7 + 1, 16384, var8);
            }
            if (arg0 == 2) {
                this.method2209(false, var7, 4096, var8);
                this.method2209(false, var7, 65536, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2209(false, var7, 16384, var8);
                this.method2209(false, var7 - 1, 1024, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method2209(false, var7, 512, var8);
                this.method2209(false, var7 + 1, 8192, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2209(false, var7, 2048, var8);
                this.method2209(false, var7 + 1, 32768, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2209(false, var7, 8192, var8);
                this.method2209(false, var7 - 1, 512, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2209(false, var7, 32768, var8);
                this.method2209(false, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2209(false, var7, 66560, var8);
            this.method2209(false, var7, 4096, var8 - 1);
            this.method2209(false, var7 + 1, 16384, var8);
        }
        if (arg0 == 1) {
            this.method2209(false, var7, 5120, var8);
            this.method2209(false, var7 + 1, 16384, var8);
            this.method2209(false, var7, 65536, var8 + 1);
        }
        if (arg0 == 2) {
            this.method2209(false, var7, 20480, var8);
            this.method2209(false, var7, 65536, var8 + 1);
            this.method2209(false, var7 - 1, 1024, var8);
        }
        if (arg0 == 3) {
            this.method2209(false, var7, 81920, var8);
            this.method2209(false, var7 - 1, 1024, var8);
            this.method2209(false, var7, 4096, var8 - 1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lhb;I)Lnh;", line = 754)
    public static final class114 method2213(class35 arg0, int arg1) {
        field5026++;
        if (arg1 != 27958) {
            field5016 = -117;
        }
        return new class114(arg0.method260((byte) 107), arg0.method260((byte) -95), arg0.method260((byte) 108), arg0.method260((byte) -82), arg0.method269(false), arg0.method269(false), arg0.method273(arg1 + 37322));
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIIII)V", line = 769)
    public final void method2214(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field5025;
        int var9 = arg4 - this.field5015;
        int var10 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg5;
            arg5 = arg3;
            arg3 = var11;
        }
        if (arg0) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < (arg5 + var8); var12++) {
            if (var12 >= 0 && this.field5020 > var12) {
                for (int var13 = var9; var13 < arg3 + var9; var13++) {
                    if (var13 >= 0 && this.field5032 > var13) {
                        this.method2209(false, var13, var10, var12);
                    }
                }
            }
        }
        if (arg2 != 21011) {
            this.method2219(86, 104, -122, -8, 82, -117, 117, 40, -22);
        }
        field5035++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIII)Z", line = 819)
    public final boolean method2215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= -117) {
            field5028 = (class27) null;
        }
        field5021++;
        if (arg0 == 1) {
            if (arg2 == arg3 && arg1 == arg7) {
                return true;
            }
        } else if (arg3 >= arg2 && arg3 <= arg2 + arg0 - 1 && arg7 >= arg7 && arg7 + arg0 - 1 >= arg7) {
            return true;
        }
        int var9 = arg2 - this.field5025;
        int var10 = arg7 - this.field5015;
        int var11 = arg1 - this.field5015;
        int var12 = arg3 - this.field5025;
        if (arg0 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field5037[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field5037[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field5037[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field5037[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field5037[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field5037[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field5037[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field5037[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field5037[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field5037[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field5037[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field5037[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var9 - 1;
            int var14 = var11 + arg0 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field5037[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 - arg0) == var11 && (this.field5037[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg0) == var9 && var11 <= var10 && var10 <= var14 && (this.field5037[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg0 == var11 && (this.field5037[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - arg0 == var9 && var11 <= var10 && var14 >= var10 && (this.field5037[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11 && (this.field5037[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field5037[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var10 + 1) == var11 && (this.field5037[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 >= var9 && var13 >= var12 && (var10 + 1) == var11 && (this.field5037[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var12 && var12 <= var13 && var10 - arg0 == var11 && (this.field5037[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg0 == var9 && var10 >= var11 && var14 >= var10 && (this.field5037[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 >= var11 && var14 >= var10 && (this.field5037[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZBIII)V", line = 1011)
    public final void method2216(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field5025;
        field5013++;
        int var8 = 256;
        int var9 = arg5 - this.field5015;
        if (arg1) {
            var8 += 131072;
        }
        if (arg2 >= -32) {
            field5028 = (class27) null;
        }
        for (int var10 = var7; var10 < arg0 + var7; var10++) {
            if (var10 >= 0 && this.field5020 > var10) {
                for (int var11 = var9; var11 < (arg3 + var9); var11++) {
                    if (var11 >= 0 && var11 < this.field5032) {
                        this.method2220(var11, -84, var10, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)V", line = 1055)
    public static void method2217(boolean arg0) {
        field5028 = null;
        field5018 = (byte[][][]) null;
        if (!arg0) {
            field5016 = 49;
        }
        field5040 = null;
        field5039 = (byte[][][]) null;
        field5027 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBIIIIII)Z", line = 1073)
    public final boolean method2218(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5038++;
        if (arg6 == 1) {
            if (arg4 == arg7 && arg2 == arg5) {
                return true;
            }
        } else if (arg7 <= arg4 && arg7 + arg6 - 1 >= arg4 && arg5 <= arg5 && arg5 <= arg5 + arg6 - 1) {
            return true;
        }
        int var9 = arg4 - this.field5025;
        int var10 = arg2 - this.field5015;
        int var11 = arg7 - this.field5025;
        int var12 = arg5 - this.field5015;
        if (arg6 == 1) {
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field5037[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field5037[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field5037[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field5037[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field5037[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field5037[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field5037[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field5037[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field5037[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field5037[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field5037[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var11 - 1;
            int var14 = arg6 + var10 - 1;
            if (arg0 == 0) {
                if (arg3 == 0) {
                    if (var9 - arg6 == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field5037[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg6) == var10 && (this.field5037[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 <= var9 && var9 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var9 - arg6 == var11 && var12 >= var10 && var12 <= var14 && (this.field5037[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14 && (this.field5037[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10 && (this.field5037[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 - arg6) == var10 && (this.field5037[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg6) == var10) {
                        return true;
                    }
                    if ((var9 - arg6) == var11 && var12 >= var10 && var14 >= var12 && (this.field5037[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14 && (this.field5037[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 0) {
                    if ((var9 - arg6) == var11 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14 && (this.field5037[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 - arg6) == var10 && (this.field5037[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - arg6) == var11 && var12 >= var10 && var14 >= var12 && (this.field5037[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg6) == var10 && (this.field5037[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg6) == var11 && var12 >= var10 && var14 >= var12 && (this.field5037[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field5037[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 - arg6 == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - arg6) == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10 && (this.field5037[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14 && (this.field5037[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 - arg6 == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 <= var9 && var13 >= var9 && (var12 + 1) == var10 && (this.field5037[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var13 >= var9 && (var12 - arg6) == var10 && (this.field5037[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg6) == var11 && var12 >= var10 && var14 >= var12 && (this.field5037[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12 && (this.field5037[var11][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 != 89) {
            field5039 = (byte[][][]) ((byte[][][]) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIII)Z", line = 1435)
    private final boolean method2219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5034++;
        if (arg8 <= 47) {
            this.method2214(true, -14, -29, 4, 80, 56, -52);
        }
        if ((arg4 + arg7) > arg0 && arg0 + arg6 > arg7) {
            return (arg1 + arg2) > arg5 && arg2 < (arg5 + arg3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V", line = 1460)
    private final void method2220(int arg0, int arg1, int arg2, int arg3) {
        field5022++;
        this.field5037[arg2][arg0] = class147.method1098(this.field5037[arg2][arg0], arg3);
        if (arg1 > -79) {
            this.method2214(false, 117, -128, 48, -104, -22, 107);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(II)V", line = 1473)
    public class323(int arg0, int arg1) {
        this.field5020 = arg0;
        this.field5015 = 0;
        this.field5032 = arg1;
        this.field5037 = new int[this.field5020][this.field5032];
        this.method2203(true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIZI)V", line = 1487)
    public final void method2221(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field5042++;
        int var7 = arg5 - this.field5025;
        int var8 = arg0 - this.field5015;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method2220(var8, -103, var7, 128);
                this.method2220(var8, arg3 ^ 0xFFFFF546, var7 - 1, 8);
            }
            if (arg2 == 1) {
                this.method2220(var8, -103, var7, 2);
                this.method2220(var8 + 1, arg3 + -2869, var7, 32);
            }
            if (arg2 == 2) {
                this.method2220(var8, -98, var7, 8);
                this.method2220(var8, -116, var7 + 1, 128);
            }
            if (arg2 == 3) {
                this.method2220(var8, -84, var7, 32);
                this.method2220(var8 - 1, -80, var7, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method2220(var8, -94, var7, 1);
                this.method2220(var8 + 1, arg3 + -2861, var7 - 1, 16);
            }
            if (arg2 == 1) {
                this.method2220(var8, arg3 ^ 0xFFFFF545, var7, 4);
                this.method2220(var8 + 1, -127, var7 - -1, 64);
            }
            if (arg2 == 2) {
                this.method2220(var8, -125, var7, 16);
                this.method2220(var8 - 1, -123, var7 + 1, 1);
            }
            if (arg2 == 3) {
                this.method2220(var8, -103, var7, 64);
                this.method2220(var8 - 1, -93, var7 + -1, 4);
            }
        }
        if (arg3 != 2780) {
            field5018 = (byte[][][]) ((byte[][][]) null);
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method2220(var8, -114, var7, 130);
                this.method2220(var8, -116, var7 - 1, 8);
                this.method2220(var8 + 1, arg3 + -2902, var7, 32);
            }
            if (arg2 == 1) {
                this.method2220(var8, -100, var7, 10);
                this.method2220(var8 + 1, -90, var7, 32);
                this.method2220(var8, -127, var7 + 1, 128);
            }
            if (arg2 == 2) {
                this.method2220(var8, -96, var7, 40);
                this.method2220(var8, -81, var7 + 1, 128);
                this.method2220(var8 - 1, arg3 + -2870, var7, 2);
            }
            if (arg2 == 3) {
                this.method2220(var8, -101, var7, 160);
                this.method2220(var8 - 1, -90, var7, 2);
                this.method2220(var8, -113, var7 - 1, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method2220(var8, arg3 ^ 0xFFFFF557, var7, 65536);
                this.method2220(var8, -110, var7 - 1, 4096);
            }
            if (arg2 == 1) {
                this.method2220(var8, -127, var7, 1024);
                this.method2220(var8 + 1, -106, var7, 16384);
            }
            if (arg2 == 2) {
                this.method2220(var8, arg3 - 2892, var7, 4096);
                this.method2220(var8, arg3 - 2895, var7 + 1, 65536);
            }
            if (arg2 == 3) {
                this.method2220(var8, -102, var7, 16384);
                this.method2220(var8 - 1, arg3 + -2882, var7, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method2220(var8, -80, var7, 512);
                this.method2220(var8 + 1, -87, var7 - 1, 8192);
            }
            if (arg2 == 1) {
                this.method2220(var8, -122, var7, 2048);
                this.method2220(var8 + 1, arg3 ^ 0xFFFFF56C, var7 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method2220(var8, -110, var7, 8192);
                this.method2220(var8 - 1, -85, var7 + 1, 512);
            }
            if (arg2 == 3) {
                this.method2220(var8, -80, var7, 32768);
                this.method2220(var8 - 1, arg3 + -2899, var7 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method2220(var8, -83, var7, 66560);
            this.method2220(var8, arg3 - 2875, var7 + -1, 4096);
            this.method2220(var8 + 1, -124, var7, 16384);
        }
        if (arg2 == 1) {
            this.method2220(var8, -103, var7, 5120);
            this.method2220(var8 + 1, arg3 + -2891, var7, 16384);
            this.method2220(var8, arg3 - 2891, var7 + 1, 65536);
        }
        if (arg2 == 2) {
            this.method2220(var8, -108, var7, 20480);
            this.method2220(var8, -127, var7 + 1, 65536);
            this.method2220(var8 - 1, -116, var7, 1024);
        }
        if (arg2 == 3) {
            this.method2220(var8, -111, var7, 81920);
            this.method2220(var8 - 1, -85, var7, 1024);
            this.method2220(var8, -113, var7 - 1, 4096);
        }
    }
}
