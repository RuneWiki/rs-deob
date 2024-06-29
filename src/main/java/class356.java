import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class356 {

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Z")
    public static boolean field4538 = false;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "[Ldr;")
    public static class395[] field4557 = new class395[14];

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lwl;")
    public static class679 field4534 = new class679("WIP", 2);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public int field4555;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[[I")
    public int[][] field4537;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 6)
    public static void method1949(byte arg0) {
        field4534 = null;
        if (arg0 > 13) {
            field4557 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILr;)V", line = 17)
    public static final void method1950(int arg0, class566 arg1) {
        field4541++;
        int var2 = class219.field2680;
        int var3 = class88.field1231;
        int var4 = class672.field9461;
        int var5 = class50.field720;
        int var6 = -10660793;
        arg1.method3118(var6, var2, var3, arg0 - 30, var5, var4);
        arg1.method3118(-16777216, var2 + 1, var3 + 1, arg0 - 30, 16, var4 - 2);
        arg1.method3110(var4 - 2, var3 + 18, var5 - 19, var2 + 1, arg0 ^ 0x5149, -16777216);
        class65.field889.method2192(var6, true, var2 + 3, class83.field1132.method476((byte) 120, class250.field3068), -1, var3 + 14);
        int var7 = class289.field3592.method944(arg0 ^ 0x7CF);
        if (arg0 != 31) {
            method1955((byte) 8, null);
        }
        int var8 = class289.field3592.method941(arg0 + 61);
        int var9 = 0;
        for (class145 var10 = (class145) class1.field7.method237(arg0 + 96); var10 != null; var10 = (class145) class1.field7.method245((byte) 62)) {
            int var11 = (class463.field5904 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && (var11 - 13) < var8 && (var11 + 3) > var8 && var10.field1877) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class497.method2674(var10.field1873, (byte) 112)) {
                var13 = class633.field8881.method434(12388, (int) var10.field1865).field80;
            } else if (var10.field1866 != -1) {
                var13 = class633.field8881.method434(12388, var10.field1866).field80;
            } else if (class605.method3316(-1, var10.field1873)) {
                class206 var14 = (class206) class180.field2318.method399(-32748, (long) ((int) var10.field1865));
                if (var14 != null) {
                    class307 var15 = var14.field2618;
                    class586 var16 = var15.field3902;
                    if (var16.field8205 != null) {
                        var16 = var16.method3220(arg0 - 4292, class684.field9606);
                    }
                    if (var16 != null) {
                        var13 = var16.field8200;
                    }
                }
            } else if (class556.method3060(var10.field1873, 21922)) {
                Object var17 = null;
                class441 var18;
                if (var10.field1873 == 1008) {
                    var18 = class428.field5352.method3138((byte) 54, (int) var10.field1865);
                } else {
                    var18 = class428.field5352.method3138((byte) 42, (int) (var10.field1865 >>> 32 & 0x7FFFFFFFL));
                }
                if (var18.field5574 != null) {
                    var18 = var18.method2355(class684.field9606, arg0 ^ 0xFFFFF98A);
                }
                if (var18 != null) {
                    var13 = var18.field5510;
                }
            }
            String var19 = class425.method2255(var10, arg0 + 86);
            if (var13 != null) {
                var19 = var19 + class531.method2880(var13, (byte) 126);
            }
            class65.field889.method2193(-4611, 0, class478.field6077, var11, class304.field3747, var12, var2 + 3, var19);
            if (var10.field1864) {
                class600.field8418.method2902(class546.field7269.method3269((byte) 99, var19) + var2 + 5, var11 + -12);
            }
            var9++;
        }
        class698.method3925(class88.field1231, class219.field2680, class672.field9461, (byte) -63, class50.field720);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 125)
    public static final void method1951(boolean arg0) {
        field4551++;
        if (class475.field6031 != null) {
            return;
        }
        class475.field6031 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (!arg0) {
            method1951(true);
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var9 = var16;
                    var11 = var8;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class475.field6031[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIII)Z", line = 249)
    public final boolean method1952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4548++;
        if (arg8 > 1) {
            return class43.method259(arg6, false, arg8, arg3, arg1, arg2, arg4, arg8, arg5) ? true : this.method1962(arg1, arg8, (byte) 39, arg4, arg7, arg2, arg5, arg3, arg6, arg8);
        }
        int var10 = arg1 + arg2 - 1;
        int var11 = arg4 + arg5 - 1;
        if (arg6 >= arg2 && var10 >= arg6 && arg3 >= arg4 && var11 >= arg3) {
            return true;
        } else if (arg2 - 1 == arg6 && arg3 >= arg4 && var11 >= arg3 && (this.field4537[arg6 - this.field4555][arg3 - this.field4547] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg4 <= arg3 && var11 >= arg3 && (this.field4537[arg6 - this.field4555][arg3 - this.field4547] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if ((arg0 + arg4) == arg3 && arg6 >= arg2 && arg6 <= var10 && (this.field4537[arg6 - this.field4555][arg3 - this.field4547] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg3 && arg6 >= arg2 && arg6 <= var10 && (this.field4537[arg6 - this.field4555][arg3 - this.field4547] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([S[Ljava/lang/String;I)V", line = 288)
    public static final void method1953(short[] arg0, String[] arg1, int arg2) {
        field4546++;
        class513.method2771((byte) 54, arg2, arg1, arg1.length - 1, arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 299)
    public final void method1954(int arg0) {
        field4535++;
        for (int var2 = 0; var2 < this.field4556; var2++) {
            for (int var3 = 0; var3 < this.field4542; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4556 - 5 || this.field4542 - 5 <= var3) {
                    this.field4537[var2][var3] = -1;
                } else {
                    this.field4537[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != 2097152) {
            method1951(true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLes;)Lmj;", line = 335)
    public static final class343 method1955(byte arg0, class630 arg1) {
        if (arg0 != 1) {
            field4534 = null;
        }
        field4545++;
        return new class343(arg1.method3510(91), arg1.method3510(118), arg1.method3510(55), arg1.method3510(43), arg1.method3517(-1), arg1.method3517(arg0 - 2), arg1.method3501(-9268));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)Z", line = 349)
    public final boolean method1956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4549++;
        if (arg0 == 1) {
            if (arg6 == arg7 && arg3 == arg5) {
                return true;
            }
        } else if (arg7 >= arg6 && (arg0 + arg6 - 1) >= arg7 && arg3 <= arg3 && arg3 <= arg3 + arg0 - 1) {
            return true;
        }
        int var9 = arg6 - this.field4555;
        int var10 = arg7 - this.field4555;
        int var11 = arg5 - this.field4547;
        int var12 = -62 % ((arg1 + 49) / 61);
        int var13 = arg3 - this.field4547;
        if (arg0 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var9 && var11 == var13 && (this.field4537[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var13 - 1) == var11 && (this.field4537[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - 1) == var9 && var11 == var13 && (this.field4537[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var13 - 1) == var11 && (this.field4537[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - 1 == var9 && var11 == var13 && (this.field4537[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var13 + 1) == var11 && (this.field4537[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 + 1) == var9 && var11 == var13 && (this.field4537[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var13 + 1) == var11 && (this.field4537[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var10 && (var13 + 1) == var11 && (this.field4537[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var13 - 1) == var11 && (this.field4537[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var9 && var11 == var13 && (this.field4537[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var13 && (this.field4537[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg0 + var9 - 1;
            int var15 = arg0 + var11 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var9 && var11 <= var13 && var13 <= var15 && (this.field4537[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && (var13 - arg0) == var11 && (this.field4537[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - arg0 == var9 && var13 >= var11 && var15 >= var13 && (this.field4537[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var14 && var13 - arg0 == var11 && (this.field4537[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - arg0) == var9 && var13 >= var11 && var13 <= var15 && (this.field4537[var14][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var14 >= var10 && var13 + 1 == var11 && (this.field4537[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var9 && var11 <= var13 && var15 >= var13 && (this.field4537[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var14 && var13 + 1 == var11 && (this.field4537[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 <= var10 && var10 <= var14 && (var13 + 1) == var11 && (this.field4537[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var9 && var10 <= var14 && var13 - arg0 == var11 && (this.field4537[var10][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg0) == var9 && var11 <= var13 && var13 <= var15 && (this.field4537[var14][var13] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 <= var13 && var13 <= var15 && (this.field4537[var9][var13] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)V", line = 536)
    public final void method1957(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field4555;
        field4552++;
        int var5 = arg0 - this.field4547;
        if (arg1 != -3) {
            this.field4537 = null;
        }
        this.field4537[var4][var5] = class444.method2376(this.field4537[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V", line = 551)
    private final void method1958(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1) {
            field4557 = null;
        }
        this.field4537[arg1][arg2] = class695.method3921(this.field4537[arg1][arg2], ~arg3);
        field4543++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IBI)V", line = 565)
    public final void method1959(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field4547;
        int var5 = arg2 - this.field4555;
        if (arg1 > -95) {
            this.method1966(false, 69, -100, 52, -49, false, 70);
        }
        field4540++;
        this.field4537[var5][var4] = class695.method3921(this.field4537[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V", line = 582)
    public final void method1960(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4547;
        int var5 = arg2 - this.field4555;
        field4559++;
        if (arg0 > 77) {
            this.field4537[var5][var4] = class444.method2376(this.field4537[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIIIIZI)V", line = 596)
    public final void method1961(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field4555;
        if (arg2 < 27) {
            this.method1959(-90, (byte) -84, -85);
        }
        int var9 = arg3 - this.field4547;
        field4550++;
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method1963(128, 17861, var8, var9);
                this.method1963(8, 17861, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method1963(2, 17861, var8, var9);
                this.method1963(32, 17861, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1963(8, 17861, var8, var9);
                this.method1963(128, 17861, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method1963(32, 17861, var8, var9);
                this.method1963(2, 17861, var8, var9 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method1963(1, 17861, var8, var9);
                this.method1963(16, 17861, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method1963(4, 17861, var8, var9);
                this.method1963(64, 17861, var8 + 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1963(16, 17861, var8, var9);
                this.method1963(1, 17861, var8 + 1, var9 + -1);
            }
            if (arg6 == 3) {
                this.method1963(64, 17861, var8, var9);
                this.method1963(4, 17861, var8 - 1, var9 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg6 == 0) {
                this.method1963(130, 17861, var8, var9);
                this.method1963(8, 17861, var8 - 1, var9);
                this.method1963(32, 17861, var8, var9 + 1);
            }
            if (arg6 == 1) {
                this.method1963(10, 17861, var8, var9);
                this.method1963(32, 17861, var8, var9 + 1);
                this.method1963(128, 17861, var8 + 1, var9);
            }
            if (arg6 == 2) {
                this.method1963(40, 17861, var8, var9);
                this.method1963(128, 17861, var8 + 1, var9);
                this.method1963(2, 17861, var8, var9 - 1);
            }
            if (arg6 == 3) {
                this.method1963(160, 17861, var8, var9);
                this.method1963(2, 17861, var8, var9 - 1);
                this.method1963(8, 17861, var8 - 1, var9);
            }
        }
        if (arg0) {
            if (arg1 == 0) {
                if (arg6 == 0) {
                    this.method1963(65536, 17861, var8, var9);
                    this.method1963(4096, 17861, var8 - 1, var9);
                }
                if (arg6 == 1) {
                    this.method1963(1024, 17861, var8, var9);
                    this.method1963(16384, 17861, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method1963(4096, 17861, var8, var9);
                    this.method1963(65536, 17861, var8 + 1, var9);
                }
                if (arg6 == 3) {
                    this.method1963(16384, 17861, var8, var9);
                    this.method1963(1024, 17861, var8, var9 - 1);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg6 == 0) {
                    this.method1963(512, 17861, var8, var9);
                    this.method1963(8192, 17861, var8 - 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method1963(2048, 17861, var8, var9);
                    this.method1963(32768, 17861, var8 + 1, var9 - -1);
                }
                if (arg6 == 2) {
                    this.method1963(8192, 17861, var8, var9);
                    this.method1963(512, 17861, var8 + 1, var9 + -1);
                }
                if (arg6 == 3) {
                    this.method1963(32768, 17861, var8, var9);
                    this.method1963(2048, 17861, var8 - 1, var9 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg6 == 0) {
                    this.method1963(66560, 17861, var8, var9);
                    this.method1963(4096, 17861, var8 - 1, var9);
                    this.method1963(16384, 17861, var8, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method1963(5120, 17861, var8, var9);
                    this.method1963(16384, 17861, var8, var9 + 1);
                    this.method1963(65536, 17861, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method1963(20480, 17861, var8, var9);
                    this.method1963(65536, 17861, var8 + 1, var9);
                    this.method1963(1024, 17861, var8, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method1963(81920, 17861, var8, var9);
                    this.method1963(1024, 17861, var8, var9 - 1);
                    this.method1963(4096, 17861, var8 - 1, var9);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method1963(536870912, 17861, var8, var9);
                this.method1963(33554432, 17861, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method1963(8388608, 17861, var8, var9);
                this.method1963(134217728, 17861, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1963(33554432, 17861, var8, var9);
                this.method1963(536870912, 17861, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method1963(134217728, 17861, var8, var9);
                this.method1963(8388608, 17861, var8, var9 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method1963(4194304, 17861, var8, var9);
                this.method1963(67108864, 17861, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method1963(16777216, 17861, var8, var9);
                this.method1963(268435456, 17861, var8 + 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1963(67108864, 17861, var8, var9);
                this.method1963(4194304, 17861, var8 + 1, var9 + -1);
            }
            if (arg6 == 3) {
                this.method1963(268435456, 17861, var8, var9);
                this.method1963(16777216, 17861, var8 - 1, var9 + -1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method1963(545259520, 17861, var8, var9);
            this.method1963(33554432, 17861, var8 - 1, var9);
            this.method1963(134217728, 17861, var8, var9 + 1);
        }
        if (arg6 == 1) {
            this.method1963(41943040, 17861, var8, var9);
            this.method1963(134217728, 17861, var8, var9 + 1);
            this.method1963(536870912, 17861, var8 + 1, var9);
        }
        if (arg6 == 2) {
            this.method1963(167772160, 17861, var8, var9);
            this.method1963(536870912, 17861, var8 + 1, var9);
            this.method1963(8388608, 17861, var8, var9 - 1);
        }
        if (arg6 == 3) {
            this.method1963(671088640, 17861, var8, var9);
            this.method1963(8388608, 17861, var8, var9 - 1);
            this.method1963(33554432, 17861, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBIIIIIII)Z", line = 909)
    public final boolean method1962(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4536++;
        int var11 = arg1 + arg8;
        int var12 = arg7 + arg9;
        if (arg2 <= 36) {
            return false;
        }
        int var13 = arg5 + arg0;
        int var14 = arg3 + arg6;
        if (arg8 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg3 < arg7 ? arg7 : arg3;
            int var16 = var14 <= var12 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field4537[var13 - this.field4555 - 1][var15 - this.field4547] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg5 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg3 < arg7 ? arg7 : arg3;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field4537[arg5 - this.field4555][var17 - this.field4547] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg7 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg5 < arg8 ? arg8 : arg5;
            int var20 = var11 < var13 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field4537[var19 - this.field4555][var14 - this.field4547 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg5 < arg8 ? arg8 : arg5;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field4537[var21 - this.field4555][arg3 - this.field4547] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIII)V", line = 1004)
    private final void method1963(int arg0, int arg1, int arg2, int arg3) {
        field4553++;
        if (arg1 != 17861) {
            this.field4537 = null;
        }
        this.field4537[arg2][arg3] = class444.method2376(this.field4537[arg2][arg3], arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZIBIZI)V", line = 1016)
    public final void method1964(int arg0, boolean arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        field4554++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg4 - this.field4555;
        if (arg5) {
            var8 |= 0x40000000;
        }
        int var10 = arg6 - this.field4547;
        int var11 = var9;
        if (arg3 != 100) {
            this.field4542 = -89;
        }
        while (arg0 + var9 > var11) {
            if (var11 >= 0 && this.field4556 > var11) {
                for (int var12 = var10; var12 < (arg2 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field4542) {
                        this.method1963(var8, arg3 + 17761, var11, var12);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZIZI)V", line = 1062)
    public final void method1965(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field4560++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        int var10 = arg7 - this.field4547;
        int var11 = arg5 - this.field4555;
        if (arg2 == 1 || arg2 == 3) {
            int var12 = arg3;
            arg3 = arg1;
            arg1 = var12;
        }
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var13 = 47 / ((-arg0 - 49) / 50);
        for (int var14 = var11; var14 < (arg3 + var11); var14++) {
            if (var14 >= 0 && this.field4556 > var14) {
                for (int var15 = var10; var15 < (arg1 + var10); var15++) {
                    if (var15 >= 0 && this.field4542 > var15) {
                        this.method1958(1, var14, var15, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZIIIIZI)V", line = 1125)
    public final void method1966(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field4547;
        field4544++;
        int var9 = arg4 - this.field4555;
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method1958(1, var9, var8, 128);
                this.method1958(1, var9 - 1, var8, 8);
            }
            if (arg6 == 1) {
                this.method1958(1, var9, var8, 2);
                this.method1958(1, var9, var8 + 1, 32);
            }
            if (arg6 == 2) {
                this.method1958(1, var9, var8, 8);
                this.method1958(1, var9 + 1, var8, 128);
            }
            if (arg6 == 3) {
                this.method1958(1, var9, var8, 32);
                this.method1958(1, var9, var8 - 1, 2);
            }
        }
        int var10 = -7 % ((68 - arg3) / 48);
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method1958(1, var9, var8, 1);
                this.method1958(1, var9 - 1, var8 - -1, 16);
            }
            if (arg6 == 1) {
                this.method1958(1, var9, var8, 4);
                this.method1958(1, var9 + 1, var8 + 1, 64);
            }
            if (arg6 == 2) {
                this.method1958(1, var9, var8, 16);
                this.method1958(1, var9 + 1, var8 + -1, 1);
            }
            if (arg6 == 3) {
                this.method1958(1, var9, var8, 64);
                this.method1958(1, var9 - 1, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg6 == 0) {
                this.method1958(1, var9, var8, 130);
                this.method1958(1, var9 - 1, var8, 8);
                this.method1958(1, var9, var8 + 1, 32);
            }
            if (arg6 == 1) {
                this.method1958(1, var9, var8, 10);
                this.method1958(1, var9, var8 + 1, 32);
                this.method1958(1, var9 + 1, var8, 128);
            }
            if (arg6 == 2) {
                this.method1958(1, var9, var8, 40);
                this.method1958(1, var9 + 1, var8, 128);
                this.method1958(1, var9, var8 - 1, 2);
            }
            if (arg6 == 3) {
                this.method1958(1, var9, var8, 160);
                this.method1958(1, var9, var8 - 1, 2);
                this.method1958(1, var9 - 1, var8, 8);
            }
        }
        if (arg5) {
            if (arg1 == 0) {
                if (arg6 == 0) {
                    this.method1958(1, var9, var8, 65536);
                    this.method1958(1, var9 - 1, var8, 4096);
                }
                if (arg6 == 1) {
                    this.method1958(1, var9, var8, 1024);
                    this.method1958(1, var9, var8 + 1, 16384);
                }
                if (arg6 == 2) {
                    this.method1958(1, var9, var8, 4096);
                    this.method1958(1, var9 + 1, var8, 65536);
                }
                if (arg6 == 3) {
                    this.method1958(1, var9, var8, 16384);
                    this.method1958(1, var9, var8 - 1, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg6 == 0) {
                    this.method1958(1, var9, var8, 512);
                    this.method1958(1, var9 - 1, var8 + 1, 8192);
                }
                if (arg6 == 1) {
                    this.method1958(1, var9, var8, 2048);
                    this.method1958(1, var9 + 1, var8 + 1, 32768);
                }
                if (arg6 == 2) {
                    this.method1958(1, var9, var8, 8192);
                    this.method1958(1, var9 + 1, var8 + -1, 512);
                }
                if (arg6 == 3) {
                    this.method1958(1, var9, var8, 32768);
                    this.method1958(1, var9 - 1, var8 - 1, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg6 == 0) {
                    this.method1958(1, var9, var8, 66560);
                    this.method1958(1, var9 - 1, var8, 4096);
                    this.method1958(1, var9, var8 + 1, 16384);
                }
                if (arg6 == 1) {
                    this.method1958(1, var9, var8, 5120);
                    this.method1958(1, var9, var8 + 1, 16384);
                    this.method1958(1, var9 + 1, var8, 65536);
                }
                if (arg6 == 2) {
                    this.method1958(1, var9, var8, 20480);
                    this.method1958(1, var9 + 1, var8, 65536);
                    this.method1958(1, var9, var8 - 1, 1024);
                }
                if (arg6 == 3) {
                    this.method1958(1, var9, var8, 81920);
                    this.method1958(1, var9, var8 - 1, 1024);
                    this.method1958(1, var9 - 1, var8, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg6 == 0) {
                this.method1958(1, var9, var8, 536870912);
                this.method1958(1, var9 - 1, var8, 33554432);
            }
            if (arg6 == 1) {
                this.method1958(1, var9, var8, 8388608);
                this.method1958(1, var9, var8 + 1, 134217728);
            }
            if (arg6 == 2) {
                this.method1958(1, var9, var8, 33554432);
                this.method1958(1, var9 + 1, var8, 536870912);
            }
            if (arg6 == 3) {
                this.method1958(1, var9, var8, 134217728);
                this.method1958(1, var9, var8 - 1, 8388608);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg6 == 0) {
                this.method1958(1, var9, var8, 4194304);
                this.method1958(1, var9 - 1, var8 + 1, 67108864);
            }
            if (arg6 == 1) {
                this.method1958(1, var9, var8, 16777216);
                this.method1958(1, var9 + 1, var8 + 1, 268435456);
            }
            if (arg6 == 2) {
                this.method1958(1, var9, var8, 67108864);
                this.method1958(1, var9 + 1, var8 + -1, 4194304);
            }
            if (arg6 == 3) {
                this.method1958(1, var9, var8, 268435456);
                this.method1958(1, var9 - 1, var8 - 1, 16777216);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method1958(1, var9, var8, 545259520);
            this.method1958(1, var9 - 1, var8, 33554432);
            this.method1958(1, var9, var8 + 1, 134217728);
        }
        if (arg6 == 1) {
            this.method1958(1, var9, var8, 41943040);
            this.method1958(1, var9, var8 + 1, 134217728);
            this.method1958(1, var9 + 1, var8, 536870912);
        }
        if (arg6 == 2) {
            this.method1958(1, var9, var8, 167772160);
            this.method1958(1, var9 + 1, var8, 536870912);
            this.method1958(1, var9, var8 - 1, 8388608);
        }
        if (arg6 == 3) {
            this.method1958(1, var9, var8, 671088640);
            this.method1958(1, var9, var8 - 1, 8388608);
            this.method1958(1, var9 - 1, var8, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIIIII)Z", line = 1435)
    public final boolean method1967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 67108864) {
            field4557 = null;
        }
        field4539++;
        if (arg2 == 1) {
            if (arg0 == arg7 && arg1 == arg4) {
                return true;
            }
        } else if (arg7 >= arg0 && arg7 <= arg0 + arg2 - 1 && arg4 <= arg4 && arg4 <= arg4 - (1 - arg2)) {
            return true;
        }
        int var9 = arg4 - this.field4547;
        int var10 = arg1 - this.field4547;
        int var11 = arg7 - this.field4555;
        int var12 = arg0 - this.field4555;
        if (arg2 == 1) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4537[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4537[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4537[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4537[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field4537[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field4537[var12][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field4537[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field4537[var12][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field4537[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field4537[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field4537[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var12 - 1;
            int var14 = var10 + arg2 - 1;
            if (arg6 == 0) {
                if (arg5 == 0) {
                    if ((var11 - arg2) == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10 && (this.field4537[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg2) == var10 && (this.field4537[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 - arg2) == var12 && var10 <= var9 && var9 <= var14 && (this.field4537[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14 && (this.field4537[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 + 1 == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 + 1) == var10 && (this.field4537[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 - arg2) == var10 && (this.field4537[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 >= var12 && var13 >= var11 && var9 - arg2 == var10) {
                        return true;
                    }
                    if ((var11 - arg2) == var12 && var10 <= var9 && var9 <= var14 && (this.field4537[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14 && (this.field4537[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    if (var11 - arg2 == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field4537[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 - arg2 == var10 && (this.field4537[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - arg2 == var12 && var9 >= var10 && var14 >= var9 && (this.field4537[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg2) == var10 && (this.field4537[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - arg2) == var12 && var9 >= var10 && var9 <= var14 && (this.field4537[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10 && (this.field4537[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg2) == var10) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 - arg2 == var12 && var9 >= var10 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var9 + 1 == var10 && (this.field4537[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var14 >= var9 && (this.field4537[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 - arg2) == var10) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field4537[var11][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 <= var11 && var11 <= var13 && (var9 - arg2) == var10 && (this.field4537[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg2) == var12 && var10 <= var9 && var14 >= var9 && (this.field4537[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var10 <= var9 && var9 <= var14 && (this.field4537[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 1803)
    public final void method1968(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4547;
        int var5 = arg0 - this.field4555;
        if (arg1 <= 4) {
            this.field4555 = 52;
        }
        field4533++;
        this.field4537[var5][var4] = class695.method3921(this.field4537[var5][var4], -262145);
    }
}
