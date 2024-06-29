import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class303 extends class62 {

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field4070 = 0;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[I")
    public static int[] field4065 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Ljava/lang/String;")
    public String field4069;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[B")
    public static byte[] field4061;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Laq;I)V", line = 5)
    public static final void method1923(class453 arg0, int arg1) {
        if (arg1 != 10240) {
            method1926(false, -48);
        }
        if (class293.field3859 == arg0.field6393) {
            class65.field786[arg0.field6440] = true;
        }
        field4062++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lki;ZB)V", line = 21)
    public static final void method1924(class204 arg0, boolean arg1, byte arg2) {
        field4063++;
        class437 var3 = arg0.method1250(-109);
        if (arg0.field2486 == 0) {
            class397.field5393 = -1;
            class325.field4335 = 0;
            arg0.field2474 = 0;
            return;
        }
        int var4 = 1 % ((arg2 + 3) / 51);
        if (arg0.field2400 != -1 && arg0.field2432 == 0) {
            class156 var5 = class430.method2621((byte) -79, arg0.field2400);
            if (arg0.field2491 > 0 && var5.field1814 == 0) {
                arg0.field2474++;
                class325.field4335 = 0;
                class397.field5393 = -1;
                return;
            }
            if (arg0.field2491 <= 0 && var5.field1802 == 0) {
                class397.field5393 = -1;
                class325.field4335 = 0;
                arg0.field2474++;
                return;
            }
        }
        if (arg0.field2467 != -1 && arg0.field2417 <= class106.field1273) {
            class167 var6 = class179.method1124((byte) -42, arg0.field2467);
            if (var6.field1937 && var6.field1935 != -1) {
                class156 var7 = class430.method2621((byte) -47, var6.field1935);
                if (arg0.field2491 > 0 && var7.field1814 == 0) {
                    class325.field4335 = 0;
                    arg0.field2474++;
                    class397.field5393 = -1;
                    return;
                }
                if (arg0.field2491 <= 0 && var7.field1802 == 0) {
                    arg0.field2474++;
                    class397.field5393 = -1;
                    class325.field4335 = 0;
                    return;
                }
            }
        }
        int var8 = arg0.field1516;
        int var9 = arg0.field1514;
        int var10 = arg0.field2480[arg0.field2486 - 1] * 128 + arg0.method841(true) * 64;
        int var11 = arg0.field2482[arg0.field2486 - 1] * 128 + (arg0.method841(true) * 64);
        if (!arg1 && (var10 - var8) > 256 || var10 - var8 < -256 || var11 - var9 > 256 || var11 - var9 < -256) {
            arg0.field1514 = var11;
            arg0.field1516 = var10;
            class397.field5393 = -1;
            class325.field4335 = 0;
            return;
        }
        if (var10 <= var8) {
            if (var8 <= var10) {
                if (var11 > var9) {
                    arg0.method1251((byte) 126, 8192);
                } else if (var9 > var11) {
                    arg0.method1251((byte) 118, 0);
                }
            } else if (var11 > var9) {
                arg0.method1251((byte) -52, 6144);
            } else if (var11 >= var9) {
                arg0.method1251((byte) -99, 4096);
            } else {
                arg0.method1251((byte) 75, 2048);
            }
        } else if (var9 < var11) {
            arg0.method1251((byte) 102, 10240);
        } else if (var9 > var11) {
            arg0.method1251((byte) 84, 14336);
        } else {
            arg0.method1251((byte) -76, 12288);
        }
        int var12 = 4;
        boolean var13 = true;
        if (arg0 instanceof class298) {
            var13 = ((class298) arg0).field3971.field4143;
        }
        if (var13) {
            int var14 = arg0.field2388 - arg0.field2431.field2696;
            if (var14 != 0 && arg0.field2399 == -1 && arg0.field2421 != 0) {
                var12 = 2;
            }
            if (!arg1 && arg0.field2486 > 2) {
                var12 = 6;
            }
            if (!arg1 && arg0.field2486 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg1 && arg0.field2486 > 1) {
                var12 = 6;
            }
            if (!arg1 && arg0.field2486 > 2) {
                var12 = 8;
            }
        }
        if (arg0.field2474 > 0 && arg0.field2486 > 1) {
            arg0.field2474--;
            var12 = 8;
        }
        byte var15 = arg0.field2478[arg0.field2486 - 1];
        if (var15 == 2) {
            var12 <<= 0x1;
        } else if (var15 == 0) {
            var12 >>= 0x1;
        }
        class325.field4335 = 0;
        if (var3.field5968 != -1) {
            int var16 = var12 << 7;
            if (arg0.field2486 == 1) {
                int var17 = arg0.field2475 * arg0.field2475;
                int var18 = (arg0.field1516 <= var10 ? var10 - arg0.field1516 : -var10 + arg0.field1516) << 7;
                int var19 = (arg0.field1514 > var11 ? arg0.field1514 - var11 : -arg0.field1514 + var11) << 7;
                int var20 = var19 >= var18 ? var19 : var18;
                int var21 = var3.field5968 * 2 * var20;
                if (var17 > var21) {
                    arg0.field2475 /= 2;
                } else if ((var17 / 2) > var20) {
                    arg0.field2475 -= var3.field5968;
                    if (arg0.field2475 < 0) {
                        arg0.field2475 = 0;
                    }
                } else if (arg0.field2475 < var16) {
                    arg0.field2475 += var3.field5968;
                    if (arg0.field2475 > var16) {
                        arg0.field2475 = var16;
                    }
                }
            } else if (var16 > arg0.field2475) {
                arg0.field2475 += var3.field5968;
                if (var16 < arg0.field2475) {
                    arg0.field2475 = var16;
                }
            } else if (arg0.field2475 > 0) {
                arg0.field2475 -= var3.field5968;
                if (arg0.field2475 < 0) {
                    arg0.field2475 = 0;
                }
            }
            var12 = arg0.field2475 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var8 < var10) {
            class325.field4335 |= 0x4;
            arg0.field1516 += var12;
            if (arg0.field1516 > var10) {
                arg0.field1516 = var10;
            }
        } else if (var8 > var10) {
            class325.field4335 |= 0x8;
            arg0.field1516 -= var12;
            if (var10 > arg0.field1516) {
                arg0.field1516 = var10;
            }
        }
        if (var11 > var9) {
            arg0.field1514 += var12;
            class325.field4335 |= 0x1;
            if (var11 < arg0.field1514) {
                arg0.field1514 = var11;
            }
        } else if (var9 > var11) {
            class325.field4335 |= 0x2;
            arg0.field1514 -= var12;
            if (var11 > arg0.field1514) {
                arg0.field1514 = var11;
            }
        }
        if (var12 >= 8) {
            class397.field5393 = 2;
        } else {
            class397.field5393 = var15;
        }
        if (arg0.field1516 == var10 && arg0.field1514 == var11) {
            if (arg0.field2491 > 0) {
                arg0.field2491--;
            }
            arg0.field2486--;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V", line = 321)
    public static void method1925(int arg0) {
        field4065 = null;
        field4061 = null;
        if (arg0 != -21195) {
            field4061 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V", line = 332)
    public static final void method1926(boolean arg0, int arg1) {
        field4071++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var3 = class31.field345;
            var2 = 1;
        } else {
            var2 = 4;
            var3 = class126.field1411;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class358.field4867[var5] >> 8;
            int var14 = class358.field4867[var5] & 0xFF;
            int var15 = var13 * 64 - class278.field3608;
            int var16 = var14 * 64 - class129.field1432;
            if (var12 != null) {
                class94.method589(-127);
                var11 = class394.method2445(class278.field3608, var12, class156.field1815, var2, var16, var15, class129.field1432, class267.field3454, arg0, 744);
            }
            if (!arg0 && class234.field3069 / 8 == var13 && (class108.field1296 / 8) == var14) {
                if (var11 == null) {
                    class451.field6298 = null;
                } else {
                    class451.field6298 = class450.method2785(var11[3], var11[2], (byte) 15, var11[0], var11[1]);
                    class190.field2231 = var11[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class358.field4867[var6] >> 8) * 64 - class278.field3608;
            int var8 = (class358.field4867[var6] & 0xFF) * 64 - class129.field1432;
            byte[] var9 = var3[var6];
            if (var9 == null && class108.field1296 < 800) {
                class94.method589(-118);
                for (int var10 = 0; var10 < var2; var10++) {
                    class80.method506(var8, 64, 115, var10, var7, 64);
                }
            }
        }
        if (arg1 < 3) {
            method1925(108);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 425)
    public static final void method1927(byte arg0) {
        if (arg0 < 7) {
            return;
        }
        class269.method1687((byte) -106);
        field4064++;
        class284.field3715 = null;
        class138.field1577 = null;
        class276.field3581 = null;
        class263.field3380 = null;
        class190.field2227 = null;
    }
}
