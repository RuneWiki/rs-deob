import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class75 extends class346 {

    @OriginalMember(owner = "client!in", name = "k", descriptor = "Lrg;")
    public static class548 field875 = new class548(9, 2);

    @OriginalMember(owner = "client!in", name = "o", descriptor = "[I")
    public static int[] field879 = new int[14];

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLqa;)V", line = 6)
    public static final void method432(byte arg0, class206 arg1) {
        field876++;
        if (class464.field6498.method1055(0) == 0) {
            return;
        }
        int var2 = -63 % ((9 - arg0) / 34);
        if (class529.field7429 == 0) {
            for (class207 var5 = (class207) class464.field6498.method1050((byte) 73); var5 != null; var5 = (class207) class464.field6498.method1047(-7962)) {
                class449.field6217.method2028(false, (byte) 0, arg1, arg1, var5.field2495, class403.field5290, false, var5.field2493, var5.field2486, var5.field2498, var5.field2492 ? class103.field1265.field8002 : null, var5.field2497);
                var5.method3187(true);
            }
            class562.method3279((byte) -123);
            return;
        }
        if (class319.field4068 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class319.field4068 = class206.method1152(var3, 0, (byte) 50, class516.field7285, class491.field6848, 0);
            class416.field5421 = class319.field4068.method1153(class530.method3021(false, 0, class478.field6708, class593.field8621), class3.method14(class39.field299, class478.field6708, 0), true);
        }
        for (class207 var4 = (class207) class464.field6498.method1050((byte) 73); var4 != null; var4 = (class207) class464.field6498.method1047(-7962)) {
            class449.field6217.method2028(false, (byte) 0, arg1, class319.field4068, var4.field2495, class416.field5421, false, var4.field2493, var4.field2486, var4.field2498, var4.field2492 ? class103.field1265.field8002 : null, var4.field2497);
            var4.method3187(true);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 68)
    public static void method433(byte arg0) {
        field879 = null;
        field875 = null;
        int var1 = 37 / ((arg0 + 60) / 60);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lmd;IZ)V", line = 81)
    public static final void method434(class463 arg0, int arg1, boolean arg2) {
        field878++;
        class352 var3 = arg0.method2704(0);
        if (arg0.field6486 == 0) {
            arg0.field6487 = 0;
            class288.field3745 = 0;
            class474.field6644 = -1;
            return;
        }
        if (arg0.field6465 != -1 && arg0.field6449 == 0) {
            class502 var4 = class393.field5190.method770(arg0.field6465, -113);
            if (arg0.field6489 > 0 && var4.field6951 == 0) {
                class474.field6644 = -1;
                class288.field3745 = 0;
                arg0.field6487++;
                return;
            }
            if (arg0.field6489 <= 0 && var4.field6962 == 0) {
                class474.field6644 = -1;
                class288.field3745 = 0;
                arg0.field6487++;
                return;
            }
        }
        if (arg0.field6400 != -1 && arg0.field6426 <= class335.field4358) {
            class356 var5 = class344.field4461.method1393(64, arg0.field6400);
            if (var5.field4657 && var5.field4667 != -1) {
                class502 var6 = class393.field5190.method770(var5.field4667, -67);
                if (arg0.field6489 > 0 && var6.field6951 == 0) {
                    arg0.field6487++;
                    class288.field3745 = 0;
                    class474.field6644 = -1;
                    return;
                }
                if (arg0.field6489 <= 0 && var6.field6962 == 0) {
                    class288.field3745 = 0;
                    arg0.field6487++;
                    class474.field6644 = -1;
                    return;
                }
            }
        }
        if (arg0.field6400 != -1 && class335.field4358 >= arg0.field6426) {
            class356 var7 = class344.field4461.method1393(64, arg0.field6400);
            if (var7.field4657 && var7.field4667 != -1) {
                class502 var8 = class393.field5190.method770(var7.field4667, -99);
                if (arg0.field6489 > 0 && var8.field6951 == 0) {
                    arg0.field6487++;
                    class288.field3745 = 0;
                    class474.field6644 = -1;
                    return;
                }
                if (arg0.field6489 <= 0 && var8.field6962 == 0) {
                    class288.field3745 = 0;
                    class474.field6644 = -1;
                    arg0.field6487++;
                    return;
                }
            }
        }
        int var9 = arg0.field8661;
        int var10 = arg0.field8652;
        int var11 = arg0.field6483[arg0.field6486 - 1] * 128 + arg0.method2694(28146) * 64;
        int var12 = arg0.field6491[arg0.field6486 - 1] * 128 + (arg0.method2694(28146) * 64);
        if (var9 < var11) {
            if (var12 > var10) {
                arg0.method2705(10240, false);
            } else if (var10 <= var12) {
                arg0.method2705(12288, false);
            } else {
                arg0.method2705(14336, false);
            }
        } else if (var9 > var11) {
            if (var12 > var10) {
                arg0.method2705(6144, false);
            } else if (var12 < var10) {
                arg0.method2705(2048, false);
            } else {
                arg0.method2705(4096, false);
            }
        } else if (var12 > var10) {
            arg0.method2705(8192, false);
        } else if (var12 < var10) {
            arg0.method2705(0, false);
        }
        byte var13 = arg0.field6482[arg0.field6486 - 1];
        int var14 = -86 % ((75 - arg1) / 47);
        if (!arg2 && (var11 - var9) > 256 || var11 - var9 < -256 || (var12 - var10) > 256 || (var12 - var10) < -256) {
            arg0.field8661 = var11;
            arg0.field8652 = var12;
            arg0.method2706(false, 104, arg0.field6446);
            class474.field6644 = -1;
            class288.field3745 = 0;
            arg0.field6486--;
            if (arg0.field6489 > 0) {
                arg0.field6489--;
            }
            return;
        }
        int var15 = 4;
        boolean var16 = true;
        if (arg0 instanceof class459) {
            var16 = ((class459) arg0).field6334.field804;
        }
        if (var16) {
            int var17 = arg0.field6446 - arg0.field6412.field2099;
            if (var17 != 0 && arg0.field6479 == -1 && arg0.field6461 != 0) {
                var15 = 2;
            }
            if (!arg2 && arg0.field6486 > 2) {
                var15 = 6;
            }
            if (!arg2 && arg0.field6486 > 3) {
                var15 = 8;
            }
        } else {
            if (!arg2 && arg0.field6486 > 1) {
                var15 = 6;
            }
            if (!arg2 && arg0.field6486 > 2) {
                var15 = 8;
            }
        }
        if (arg0.field6487 > 0 && arg0.field6486 > 1) {
            arg0.field6487--;
            var15 = 8;
        }
        if (var13 == 2) {
            var15 <<= 0x1;
        } else if (var13 == 0) {
            var15 >>= 0x1;
        }
        if (var3.field4537 != -1) {
            int var18 = var15 << 7;
            if (arg0.field6486 == 1) {
                int var19 = arg0.field6492 * arg0.field6492;
                int var20 = (var11 < arg0.field8661 ? arg0.field8661 - var11 : -arg0.field8661 + var11) << 7;
                int var21 = (arg0.field8652 <= var12 ? var12 - arg0.field8652 : -var12 + arg0.field8652) << 7;
                int var22 = var21 >= var20 ? var21 : var20;
                int var23 = var22 * 2 * var3.field4537;
                if (var19 > var23) {
                    arg0.field6492 /= 2;
                } else if (var22 < var19 / 2) {
                    arg0.field6492 -= var3.field4537;
                    if (arg0.field6492 < 0) {
                        arg0.field6492 = 0;
                    }
                } else if (var18 > arg0.field6492) {
                    arg0.field6492 += var3.field4537;
                    if (arg0.field6492 > var18) {
                        arg0.field6492 = var18;
                    }
                }
            } else if (var18 > arg0.field6492) {
                arg0.field6492 += var3.field4537;
                if (var18 < arg0.field6492) {
                    arg0.field6492 = var18;
                }
            } else if (arg0.field6492 > 0) {
                arg0.field6492 -= var3.field4537;
                if (arg0.field6492 < 0) {
                    arg0.field6492 = 0;
                }
            }
            var15 = arg0.field6492 >> 7;
            if (var15 < 1) {
                var15 = 1;
            }
        }
        class288.field3745 = 0;
        if (var9 == var11 && var10 == var12) {
            class474.field6644 = -1;
        } else {
            if (var11 > var9) {
                arg0.field8661 += var15;
                class288.field3745 |= 0x4;
                if (arg0.field8661 > var11) {
                    arg0.field8661 = var11;
                }
            } else if (var11 < var9) {
                arg0.field8661 -= var15;
                class288.field3745 |= 0x8;
                if (var11 > arg0.field8661) {
                    arg0.field8661 = var11;
                }
            }
            if (var15 >= 8) {
                class474.field6644 = 2;
            } else {
                class474.field6644 = var13;
            }
            if (var10 < var12) {
                arg0.field8652 += var15;
                class288.field3745 |= 0x1;
                if (arg0.field8652 > var12) {
                    arg0.field8652 = var12;
                }
            } else if (var10 > var12) {
                class288.field3745 |= 0x2;
                arg0.field8652 -= var15;
                if (var12 > arg0.field8652) {
                    arg0.field8652 = var12;
                }
            }
        }
        if (arg0.field8661 == var11 && arg0.field8652 == var12) {
            if (arg0.field6489 > 0) {
                arg0.field6489--;
            }
            arg0.field6486--;
        }
    }
}
