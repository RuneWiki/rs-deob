import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class209 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field3150 = 1;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lo;")
    public static class332 field3147 = new class332("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[[B")
    public static byte[][] field3151;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1409(int arg0) {
        field3146++;
        class81.field1143 = new class370(8);
        class303.field4506 = 0;
        for (class59 var1 = (class59) class10.field153.method1594(16); var1 != null; var1 = (class59) class10.field153.method1596(true)) {
            var1.method465();
        }
        if (arg0 > -81) {
            field3151 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)I", line = 33)
    public static final int method1411(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return 70;
        }
        field3149++;
        int var3 = class73.method628(arg0 + 45365, -113, arg2 + 91923, 4) + (class73.method628(arg0 + 10294, 36, arg2 + 37821, 2) - 128 >> 1) + (class73.method628(arg0, 52, arg2, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLsk;I)V", line = 58)
    public static final void method1413(boolean arg0, class309 arg1, int arg2) {
        field3148++;
        class322 var3 = arg1.method1917(0);
        if (arg1.field4678 == 0) {
            arg1.field4677 = 0;
            class21.field258 = -1;
            class441.field6233 = 0;
            return;
        }
        if (~arg1.field4612 != arg2 && arg1.field4601 == 0) {
            class356 var4 = class170.field2423.method1586(arg1.field4612, (byte) 36);
            if (arg1.field4673 > 0 && var4.field5409 == 0) {
                class441.field6233 = 0;
                class21.field258 = -1;
                arg1.field4677++;
                return;
            }
            if (arg1.field4673 <= 0 && var4.field5418 == 0) {
                class21.field258 = -1;
                arg1.field4677++;
                class441.field6233 = 0;
                return;
            }
        }
        if (arg1.field4618 != -1 && arg1.field4637 <= class452.field6418) {
            class188 var5 = class322.field4848.method951(arg1.field4618, (byte) 101);
            if (var5.field2861 && var5.field2862 != -1) {
                class356 var6 = class170.field2423.method1586(var5.field2862, (byte) 36);
                if (arg1.field4673 > 0 && var6.field5409 == 0) {
                    class441.field6233 = 0;
                    class21.field258 = -1;
                    arg1.field4677++;
                    return;
                }
                if (arg1.field4673 <= 0 && var6.field5418 == 0) {
                    arg1.field4677++;
                    class21.field258 = -1;
                    class441.field6233 = 0;
                    return;
                }
            }
        }
        int var7 = arg1.field4543;
        int var8 = arg1.field4538;
        int var9 = arg1.field4675[arg1.field4678 - 1] * 128 + (arg1.method1705((byte) 65) * 64);
        int var10 = arg1.field4674[arg1.field4678 - 1] * 128 + arg1.method1705((byte) 65) * 64;
        if (var7 >= var9) {
            if (var9 < var7) {
                if (var10 > var8) {
                    arg1.method1924(6144, (byte) 105);
                } else if (var8 <= var10) {
                    arg1.method1924(4096, (byte) 105);
                } else {
                    arg1.method1924(2048, (byte) 125);
                }
            } else if (var10 > var8) {
                arg1.method1924(8192, (byte) 107);
            } else if (var10 < var8) {
                arg1.method1924(0, (byte) 125);
            }
        } else if (var8 < var10) {
            arg1.method1924(10240, (byte) 106);
        } else if (var10 >= var8) {
            arg1.method1924(12288, (byte) 102);
        } else {
            arg1.method1924(14336, (byte) 101);
        }
        byte var11 = arg1.field4672[arg1.field4678 - 1];
        if (!arg0 && ((var9 - var7) > 256 || var9 - var7 < -256 || (var10 - var8) > 256 || (var10 - var8) < -256)) {
            arg1.field4543 = var9;
            arg1.field4538 = var10;
            arg1.method1926(arg1.field4634, 85);
            class21.field258 = -1;
            arg1.field4678--;
            if (arg1.field4673 > 0) {
                arg1.field4673--;
            }
            class441.field6233 = 0;
            return;
        }
        int var12 = 4;
        boolean var13 = true;
        if (arg1 instanceof class349) {
            var13 = ((class349) arg1).field5309.field4105;
        }
        if (var13) {
            int var14 = arg1.field4634 - arg1.field4611.field6571;
            if (var14 != 0 && arg1.field4635 == -1 && arg1.field4621 != 0) {
                var12 = 2;
            }
            if (!arg0 && arg1.field4678 > 2) {
                var12 = 6;
            }
            if (!arg0 && arg1.field4678 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg0 && arg1.field4678 > 1) {
                var12 = 6;
            }
            if (!arg0 && arg1.field4678 > 2) {
                var12 = 8;
            }
        }
        if (arg1.field4677 > 0 && arg1.field4678 > 1) {
            var12 = 8;
            arg1.field4677--;
        }
        if (var11 == 2) {
            var12 <<= 0x1;
        } else if (var11 == 0) {
            var12 >>= 0x1;
        }
        if (var3.field4840 != -1) {
            int var15 = var12 << 7;
            if (arg1.field4678 == 1) {
                int var16 = arg1.field4670 * arg1.field4670;
                int var17 = (arg1.field4543 > var9 ? arg1.field4543 - var9 : -arg1.field4543 + var9) << 7;
                int var18 = (var10 < arg1.field4538 ? arg1.field4538 - var10 : var10 - arg1.field4538) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var19 * 2 * var3.field4840;
                if (var16 > var20) {
                    arg1.field4670 /= 2;
                } else if (var19 < (var16 / 2)) {
                    arg1.field4670 -= var3.field4840;
                    if (arg1.field4670 < 0) {
                        arg1.field4670 = 0;
                    }
                } else if (var15 > arg1.field4670) {
                    arg1.field4670 += var3.field4840;
                    if (arg1.field4670 > var15) {
                        arg1.field4670 = var15;
                    }
                }
            } else if (arg1.field4670 < var15) {
                arg1.field4670 += var3.field4840;
                if (var15 < arg1.field4670) {
                    arg1.field4670 = var15;
                }
            } else if (arg1.field4670 > 0) {
                arg1.field4670 -= var3.field4840;
                if (arg1.field4670 < 0) {
                    arg1.field4670 = 0;
                }
            }
            var12 = arg1.field4670 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        class441.field6233 = 0;
        if (var9 > var7) {
            class441.field6233 |= 0x4;
            arg1.field4543 += var12;
            if (arg1.field4543 > var9) {
                arg1.field4543 = var9;
            }
        } else if (var7 > var9) {
            arg1.field4543 -= var12;
            class441.field6233 |= 0x8;
            if (arg1.field4543 < var9) {
                arg1.field4543 = var9;
            }
        }
        if (var10 > var8) {
            arg1.field4538 += var12;
            class441.field6233 |= 0x1;
            if (arg1.field4538 > var10) {
                arg1.field4538 = var10;
            }
        } else if (var10 < var8) {
            arg1.field4538 -= var12;
            class441.field6233 |= 0x2;
            if (var10 > arg1.field4538) {
                arg1.field4538 = var10;
            }
        }
        if (var12 < 8) {
            class21.field258 = var11;
        } else {
            class21.field258 = 2;
        }
        if (arg1.field4543 == var9 && arg1.field4538 == var10) {
            if (arg1.field4673 > 0) {
                arg1.field4673--;
            }
            arg1.field4678--;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 361)
    public static void method1414(int arg0) {
        field3147 = null;
        field3151 = null;
        if (arg0 != 0) {
            field3147 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
    public abstract int method1408(int arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1410(int arg0, Component arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1412(Component arg0, int arg1);
}
