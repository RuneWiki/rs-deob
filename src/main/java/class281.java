import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class281 extends class87 {

    @OriginalMember(owner = "client!t", name = "O", descriptor = "Z")
    private boolean field4532 = true;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Z")
    private boolean field4527 = true;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field4528 = 0;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field4525 = 0;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "Z")
    public static boolean field4536 = true;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field4530 = 0;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4539 = "Opened title screen";

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Lve;")
    public static class203 field4537;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIZI)V")
    public static final void method1942(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class166.method1189(62, false);
        class248.field3697 = arg4;
        ++field4526;
        class195.field2864 = arg3;
        class55.field815 = arg2;
        if (arg0) {
            class46.method274(arg1);
            class171.field2584 = new class143(8);
            class312.field4998 = new class143(8);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(CB)C")
    public static final char method1943(char arg0, byte arg1) {
        ++field4538;
        if (arg0 != 181 && arg0 != 402) {
            if (arg1 != -86) {
                method1946(-28);
            }
            return Character.toTitleCase(arg0);
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIB)V")
    public static final void method1944(int arg0, int arg1, byte arg2) {
        if (arg2 != 121) {
            field4530 = -98;
        }
        class9.field103[arg0] = arg1;
        class292 var3 = (class292) class170.field2574.method1073(-1, (long) arg0);
        if (var3 != null) {
            if (var3.field4645 != 4611686018427387905L) {
                var3.field4645 = 500L + class3.method14(29853) | 4611686018427387904L;
            }
        } else {
            class292 var4 = new class292(4611686018427387905L);
            class170.field2574.method1074((byte) 39, var4, (long) arg0);
        }
        ++field4531;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public static final void method1945(boolean arg0) {
        if (!arg0) {
            method1945(false);
        }
        ++field4529;
        if (class46.field629 < class46.field627) {
            class46.field629 = (float) ((double) class46.field629 / 30.0D + (double) class46.field629);
            if (class46.field627 < class46.field629) {
                class46.field629 = class46.field627;
            }
            class82.method619(-1);
        } else if (class46.field629 > class46.field627) {
            class46.field629 = (float) ((double) class46.field629 - (double) class46.field629 / 30.0D);
            if (class46.field627 > class46.field629) {
                class46.field629 = class46.field627;
            }
            class82.method619(-1);
        }
        if (class39.field521 != -1 && ~class270.field4342 != 0) {
            int var1 = -class121.field1989 + class270.field4342;
            int var2 = -class30.field319 + class39.field521;
            if (var2 < 2 || ~var2 < -3) {
                var2 >>= 4;
            }
            class30.field319 += var2;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 4;
            }
            class121.field1989 -= -var1;
            if (var2 == 0 && ~var1 == -1) {
                class270.field4342 = -1;
                class39.field521 = -1;
            }
            class82.method619(-1);
        }
        if (~class141.field2276 < -1) {
            --class284.field4572;
            if (class284.field4572 == 0) {
                --class141.field2276;
                class284.field4572 = 100;
            }
        } else {
            class131.field2175 = -1;
            class59.field867 = -1;
        }
        if (class190.field2815 && class101.field1715 != null) {
            for (class1 var3 = (class1) class101.field1715.method8(-71); var3 != null; var3 = (class1) class101.field1715.method12((byte) 69)) {
                class66 var4 = class206.method1458(var3.field10.field2466, 22464);
                if (class111.field1855 == 0 && var3.method3(class204.field3017, Integer.MIN_VALUE, class44.field584)) {
                    if (!var3.field10.field2470) {
                        var3.field10.field2470 = true;
                        class1.method4(var4.field987, var3.field10.field2466, Integer.MAX_VALUE, 15);
                    }
                    if (var3.field10.field2470) {
                        class1.method4(var4.field987, var3.field10.field2466, Integer.MAX_VALUE, 17);
                    }
                } else if (var3.field10.field2470) {
                    var3.field10.field2470 = false;
                    class1.method4(var4.field987, var3.field10.field2466, Integer.MAX_VALUE, 16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field4533;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, this.field4532 ? -arg0 + class32.field406 : arg0, !arg1);
            if (!this.field4527) {
                class117.method878(var4, 0, var3, 0, class206.field3032);
            } else {
                for (int var5 = 0; var5 < class206.field3032; ++var5) {
                    var3[var5] = var4[class181.field2722 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class281() {
        super(1, false);
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public static void method1946(int arg0) {
        if (arg0 != 0) {
            field4537 = null;
        }
        field4539 = null;
        field4537 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        } else {
            int[][] var3 = super.field1390.method1902(-111, arg0);
            if (super.field1390.field4428) {
                int[][] var4 = this.method648(this.field4532 ? -arg0 + class32.field406 : arg0, -103, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                if (this.field4527) {
                    for (int var11 = 0; ~class206.field3032 < ~var11; ++var11) {
                        var10[var11] = var5[-var11 + class181.field2722];
                        var8[var11] = var6[-var11 + class181.field2722];
                        var9[var11] = var7[-var11 + class181.field2722];
                    }
                } else {
                    for (int var12 = 0; ~class206.field3032 < ~var12; ++var12) {
                        var10[var12] = var5[var12];
                        var8[var12] = var6[var12];
                        var9[var12] = var7[var12];
                    }
                }
            }
            ++field4535;
            return var3;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field4534;
        if (arg2 != 25645) {
            this.method37(86, true);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1381 = ~arg0.method366(arg2 ^ -9302) == -2;
                }
            } else {
                this.field4532 = arg0.method366(-16505) == 1;
            }
        } else {
            this.field4527 = ~arg0.method366(arg2 + -42150) == -2;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
    public static final void method1947(int arg0, int arg1) {
        class131.field2175 = arg0;
        if (arg1 != 2) {
            method1942(false, 30, -113, true, -29);
        }
        ++field4524;
        class284.field4572 = 100;
        class59.field867 = -1;
        class141.field2276 = 3;
    }
}
