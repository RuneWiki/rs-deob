import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public abstract class class388 {

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Lqfa;")
    public static class85 field5673 = new class85(66, 6);

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "[[I")
    public static int[][] field5670;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)J")
    public abstract long method2284(int arg0);

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lr;BLer;)I")
    public static final int method2390(class167 arg0, byte arg1, class92 arg2) {
        if (arg1 != -1) {
            return 120;
        }
        field5676++;
        if (arg2.field1678 != -1) {
            return arg2.field1678;
        }
        if (arg2.field1681 != -1) {
            class699 var3 = arg0.field2768.method1500(arg2.field1681, -77);
            if (!var3.field9844) {
                return var3.field9828;
            }
        }
        return arg2.field1686;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
    public abstract void method2286(byte arg0);

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IJ)I")
    public final int method2391(int arg0, long arg1) {
        field5671++;
        long var4 = this.method2284(arg0 ^ 0x2);
        if ((long) arg0 < var4) {
            class185.method1354(var4, 10);
        }
        return this.method2285(117, arg1);
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(B)V")
    public static void method2392(byte arg0) {
        if (arg0 >= -47) {
            field5673 = null;
        }
        field5670 = null;
        field5673 = null;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(IJ)I")
    public abstract int method2285(int arg0, long arg1);

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLpl;B)V")
    public static final void method2393(boolean arg0, class604 arg1, byte arg2) {
        field5674++;
        class658 var3 = arg1.method3465(~arg2);
        if (arg2 != -1) {
            method2390(null, (byte) 90, null);
        }
        if (arg1.field8779 == 0) {
            arg1.field8778 = 0;
            class301.field4487 = 0;
            class183.field2941 = -1;
            return;
        }
        if (arg1.field8755 != -1 && arg1.field8738 == 0) {
            class138 var4 = class357.field5338.method2099(arg1.field8755, true);
            if (arg1.field8780 > 0 && var4.field2452 == 0) {
                class183.field2941 = -1;
                arg1.field8778++;
                class301.field4487 = 0;
                return;
            }
            if (arg1.field8780 <= 0 && var4.field2442 == 0) {
                class183.field2941 = -1;
                arg1.field8778++;
                class301.field4487 = 0;
                return;
            }
        }
        if (arg1.field8723 != -1 && arg1.field8771 <= class336.field5031) {
            class526 var5 = class261.field3825.method1313((byte) -119, arg1.field8723);
            if (var5.field7423 && var5.field7427 != -1) {
                class138 var6 = class357.field5338.method2099(var5.field7427, true);
                if (arg1.field8780 > 0 && var6.field2452 == 0) {
                    arg1.field8778++;
                    class301.field4487 = 0;
                    class183.field2941 = -1;
                    return;
                }
                if (arg1.field8780 <= 0 && var6.field2442 == 0) {
                    arg1.field8778++;
                    class183.field2941 = -1;
                    class301.field4487 = 0;
                    return;
                }
            }
        }
        if (arg1.field8723 != -1 && arg1.field8771 <= class336.field5031) {
            class526 var7 = class261.field3825.method1313((byte) -108, arg1.field8723);
            if (var7.field7423 && var7.field7427 != -1) {
                class138 var8 = class357.field5338.method2099(var7.field7427, true);
                if (arg1.field8780 > 0 && var8.field2452 == 0) {
                    class183.field2941 = -1;
                    arg1.field8778++;
                    class301.field4487 = 0;
                    return;
                }
                if (arg1.field8780 <= 0 && var8.field2442 == 0) {
                    class183.field2941 = -1;
                    arg1.field8778++;
                    class301.field4487 = 0;
                    return;
                }
            }
        }
        int var9 = arg1.field9806;
        int var10 = arg1.field9815;
        int var11 = arg1.field8787[arg1.field8779 - 1] * 512 + (arg1.method3446(0) * 256);
        int var12 = arg1.field8785[arg1.field8779 - 1] * 512 + arg1.method3446(0) * 256;
        if (var9 >= var11) {
            if (var9 <= var11) {
                if (var10 < var12) {
                    arg1.method3452(8192, false);
                } else if (var12 < var10) {
                    arg1.method3452(0, false);
                }
            } else if (var10 < var12) {
                arg1.method3452(6144, false);
            } else if (var12 < var10) {
                arg1.method3452(2048, false);
            } else {
                arg1.method3452(4096, false);
            }
        } else if (var12 > var10) {
            arg1.method3452(10240, false);
        } else if (var10 <= var12) {
            arg1.method3452(12288, false);
        } else {
            arg1.method3452(14336, false);
        }
        byte var13 = arg1.field8786[arg1.field8779 - 1];
        if (!arg0 && (var11 - var9) > 1024 || (var11 - var9) < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg1.field9806 = var11;
            arg1.field9815 = var12;
            arg1.method3454(arg1.field8710, ~arg2, false);
            class183.field2941 = -1;
            arg1.field8779--;
            if (arg1.field8780 > 0) {
                arg1.field8780--;
            }
            class301.field4487 = 0;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg1 instanceof class22) {
            var15 = ((class22) arg1).field880.field4939;
        }
        if (var15) {
            int var16 = arg1.field8710 - arg1.field8737.field5766;
            if (var16 != 0 && arg1.field8770 == -1 && arg1.field8675 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg1.field8779 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg1.field8779 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg1.field8779 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg1.field8779 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field8778 > 0 && arg1.field8779 > 1) {
            arg1.field8778--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field9489 != -1) {
            int var17 = var14 << 9;
            if (arg1.field8779 == 1) {
                int var18 = arg1.field8788 * arg1.field8788;
                int var19 = (var11 >= arg1.field9806 ? var11 - arg1.field9806 : -var11 + arg1.field9806) << 9;
                int var20 = (arg1.field9815 > var12 ? arg1.field9815 - var12 : -arg1.field9815 + var12) << 9;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var21 * 2 * var3.field9489;
                if (var22 < var18) {
                    arg1.field8788 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg1.field8788 -= var3.field9489;
                    if (arg1.field8788 < 0) {
                        arg1.field8788 = 0;
                    }
                } else if (var17 > arg1.field8788) {
                    arg1.field8788 += var3.field9489;
                    if (arg1.field8788 > var17) {
                        arg1.field8788 = var17;
                    }
                }
            } else if (var17 > arg1.field8788) {
                arg1.field8788 += var3.field9489;
                if (var17 < arg1.field8788) {
                    arg1.field8788 = var17;
                }
            } else if (arg1.field8788 > 0) {
                arg1.field8788 -= var3.field9489;
                if (arg1.field8788 < 0) {
                    arg1.field8788 = 0;
                }
            }
            var14 = arg1.field8788 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class301.field4487 = 0;
        if (var9 == var11 && var10 == var12) {
            class183.field2941 = -1;
        } else {
            if (var11 > var9) {
                arg1.field9806 += var14;
                class301.field4487 |= 0x4;
                if (var11 < arg1.field9806) {
                    arg1.field9806 = var11;
                }
            } else if (var9 > var11) {
                arg1.field9806 -= var14;
                class301.field4487 |= 0x8;
                if (var11 > arg1.field9806) {
                    arg1.field9806 = var11;
                }
            }
            if (var14 < 32) {
                class183.field2941 = var13;
            } else {
                class183.field2941 = 2;
            }
            if (var12 > var10) {
                class301.field4487 |= 0x1;
                arg1.field9815 += var14;
                if (arg1.field9815 > var12) {
                    arg1.field9815 = var12;
                }
            } else if (var10 > var12) {
                class301.field4487 |= 0x2;
                arg1.field9815 -= var14;
                if (var12 > arg1.field9815) {
                    arg1.field9815 = var12;
                }
            }
        }
        if (arg1.field9806 == var11 && arg1.field9815 == var12) {
            if (arg1.field8780 > 0) {
                arg1.field8780--;
            }
            arg1.field8779--;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILlk;I)Ljava/lang/String;")
    public static final String method2394(int arg0, class545 arg1, int arg2) {
        field5672++;
        if (!client.method1825(arg1).method3527(arg2, 1776287617) && arg1.field7736 == null) {
            return null;
        }
        if (arg0 != 1) {
            method2395((byte) 55, 21);
        }
        if (arg1.field7606 == null || arg1.field7606.length <= arg2 || arg1.field7606[arg2] == null || arg1.field7606[arg2].trim().length() == 0) {
            return class609.field8870 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field7606[arg2];
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)J")
    public abstract long method2287(int arg0);

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)Z")
    public static final boolean method2395(byte arg0, int arg1) {
        field5675++;
        if (arg0 >= -28) {
            method2390(null, (byte) 80, null);
        }
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }
}
