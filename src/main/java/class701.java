import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class701 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Ldba;")
    public static class101 field9893 = new class101(12, 19);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lsi;")
    public static class583 field9895 = new class583();

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lrh;")
    public static class275 field9897 = new class275(14, 0, 4, 1);

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "J")
    public static long field9898 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lcb;")
    public static class544 field9896;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
    public static final void method3974(int arg0, byte arg1) {
        class145.field1854 = new int[arg0];
        class206.field3023 = new int[arg0];
        if (arg1 == -92) {
            field9894++;
            class685.field9720 = new int[arg0];
            class624.field8795 = new int[arg0];
            class175.field2497 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILli;Z)V")
    public static final void method3975(int arg0, class449 arg1, boolean arg2) {
        field9891++;
        class607 var3 = arg1.method2708(119);
        if (arg1.field6443 == 0) {
            class663.field9305 = 0;
            class498.field7079 = -1;
            arg1.field6440 = 0;
            return;
        }
        if (arg1.field6404 != -1 && arg1.field6354 == 0) {
            class129 var4 = class203.field2975.method1931((byte) -81, arg1.field6404);
            if (arg1.field6442 > 0 && var4.field1685 == 0) {
                class498.field7079 = -1;
                arg1.field6440++;
                class663.field9305 = 0;
                return;
            }
            if (arg1.field6442 <= 0 && var4.field1673 == 0) {
                class498.field7079 = -1;
                arg1.field6440++;
                class663.field9305 = 0;
                return;
            }
        }
        for (int var5 = 0; var5 < arg1.field6434.length; var5++) {
            if (arg1.field6434[var5].field5987 != -1 && class673.field9441 >= arg1.field6434[var5].field5991) {
                class55 var21 = class87.field1131.method1548(64, arg1.field6434[var5].field5987);
                if (var21.field761 && var21.field753 != -1) {
                    class129 var22 = class203.field2975.method1931((byte) -81, var21.field753);
                    if (arg1.field6442 > 0 && var22.field1685 == 0) {
                        class498.field7079 = -1;
                        arg1.field6440++;
                        class663.field9305 = 0;
                        return;
                    }
                    if (arg1.field6442 <= 0 && var22.field1673 == 0) {
                        class663.field9305 = 0;
                        arg1.field6440++;
                        class498.field7079 = -1;
                        return;
                    }
                }
            }
        }
        int var6 = arg1.field7718;
        int var7 = arg1.field7719;
        int var8 = arg1.field6448[arg1.field6443 - 1] * 512 + arg1.method2692((byte) -126) * 256;
        int var9 = arg1.field6445[arg1.field6443 - 1] * 512 + (arg1.method2692((byte) -125) * 256);
        if (var8 > var6) {
            if (var9 > var7) {
                arg1.method2690(10240, true);
            } else if (var9 < var7) {
                arg1.method2690(14336, true);
            } else {
                arg1.method2690(12288, true);
            }
        } else if (var6 > var8) {
            if (var7 < var9) {
                arg1.method2690(6144, true);
            } else if (var9 >= var7) {
                arg1.method2690(4096, true);
            } else {
                arg1.method2690(2048, true);
            }
        } else if (var9 > var7) {
            arg1.method2690(8192, true);
        } else if (var9 < var7) {
            arg1.method2690(0, true);
        }
        byte var10 = arg1.field6446[arg1.field6443 - 1];
        if (!arg2 && (var8 - var6) > 1024 || (var8 - var6) < -1024 || (var9 - var7) > 1024 || (var9 - var7) < -1024) {
            arg1.field7718 = var8;
            arg1.field7719 = var9;
            arg1.method2700(75, false, arg1.field6351);
            if (arg1.field6442 > 0) {
                arg1.field6442--;
            }
            class498.field7079 = -1;
            arg1.field6443--;
            class663.field9305 = 0;
            return;
        }
        int var11 = 16;
        boolean var12 = true;
        if (arg1 instanceof class645) {
            var12 = ((class645) arg1).field9071.field3899;
        }
        if (var12) {
            int var13 = arg1.field6351 - arg1.field6420.field437;
            if (var13 != 0 && arg1.field6343 == -1 && arg1.field6370 != 0) {
                var11 = 8;
            }
            if (!arg2 && arg1.field6443 > 2) {
                var11 = 24;
            }
            if (!arg2 && arg1.field6443 > 3) {
                var11 = 32;
            }
        } else {
            if (!arg2 && arg1.field6443 > 1) {
                var11 = 24;
            }
            if (!arg2 && arg1.field6443 > 2) {
                var11 = 32;
            }
        }
        if (arg1.field6440 > 0 && arg1.field6443 > 1) {
            arg1.field6440--;
            var11 = 32;
        }
        if (var10 == 2) {
            var11 <<= 0x1;
        } else if (var10 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field8533 != -1) {
            int var14 = var11 << 9;
            if (arg1.field6443 == 1) {
                int var15 = arg1.field6441 * arg1.field6441;
                int var16 = (var8 < arg1.field7718 ? arg1.field7718 - var8 : var8 - arg1.field7718) << 9;
                int var17 = (var9 < arg1.field7719 ? arg1.field7719 - var9 : -arg1.field7719 + var9) << 9;
                int var18 = var16 <= var17 ? var17 : var16;
                int var19 = var3.field8533 * var18 * 2;
                if (var15 > var19) {
                    arg1.field6441 /= 2;
                } else if (var18 < (var15 / 2)) {
                    arg1.field6441 -= var3.field8533;
                    if (arg1.field6441 < 0) {
                        arg1.field6441 = 0;
                    }
                } else if (arg1.field6441 < var14) {
                    arg1.field6441 += var3.field8533;
                    if (arg1.field6441 > var14) {
                        arg1.field6441 = var14;
                    }
                }
            } else if (var14 > arg1.field6441) {
                arg1.field6441 += var3.field8533;
                if (var14 < arg1.field6441) {
                    arg1.field6441 = var14;
                }
            } else if (arg1.field6441 > 0) {
                arg1.field6441 -= var3.field8533;
                if (arg1.field6441 < 0) {
                    arg1.field6441 = 0;
                }
            }
            var11 = arg1.field6441 >> 9;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class663.field9305 = 0;
        if (var6 == var8 && var7 == var9) {
            class498.field7079 = -1;
        } else {
            if (var6 < var8) {
                class663.field9305 |= 0x4;
                arg1.field7718 += var11;
                if (var8 < arg1.field7718) {
                    arg1.field7718 = var8;
                }
            } else if (var6 > var8) {
                arg1.field7718 -= var11;
                class663.field9305 |= 0x8;
                if (var8 > arg1.field7718) {
                    arg1.field7718 = var8;
                }
            }
            if (var7 < var9) {
                class663.field9305 |= 0x1;
                arg1.field7719 += var11;
                if (var9 < arg1.field7719) {
                    arg1.field7719 = var9;
                }
            } else if (var7 > var9) {
                class663.field9305 |= 0x2;
                arg1.field7719 -= var11;
                if (var9 > arg1.field7719) {
                    arg1.field7719 = var9;
                }
            }
            if (var11 < 32) {
                class498.field7079 = var10;
            } else {
                class498.field7079 = 2;
            }
        }
        int var20 = 105 / ((64 - arg0) / 35);
        if (arg1.field7718 == var8 && arg1.field7719 == var9) {
            if (arg1.field6442 > 0) {
                arg1.field6442--;
            }
            arg1.field6443--;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method3976(int arg0) {
        field9896 = null;
        field9897 = null;
        field9893 = null;
        if (arg0 == 32) {
            field9895 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method3977(byte arg0) {
        field9892++;
        class33 var1 = (class33) class299.field4496.method2508((byte) -42);
        if (arg0 >= -90) {
            field9896 = null;
        }
        while (var1 != null) {
            class505 var2 = var1.field441;
            if (var2.field7240) {
                var1.method3117((byte) -124);
                var2.method2943((byte) 94);
            } else if (var2.field7241 <= class673.field9441) {
                var2.method2945((byte) -125, class55.field755);
                if (var2.field7240) {
                    var1.method3117((byte) 67);
                } else {
                    class513.method2991(var2, true);
                }
            }
            var1 = (class33) class299.field4496.method2505((byte) -55);
        }
    }
}
