import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class180 extends class104 {

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lbb;")
    public class99 field2610;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Ldh;")
    public static class179 field2607 = new class179(50);

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "[I")
    public static int[] field2612 = new int[2048];

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2608 = 0;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lqb;IIBI)V", line = 8)
    public static final void method1245(class109 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2614++;
        if (class118.field1664 == arg0 || class310.field4794 >= 400) {
            return;
        }
        String var11;
        if (arg0.field1526 == 0) {
            boolean var5 = true;
            if (class118.field1664.field1524 != -1 && arg0.field1524 != -1) {
                int var6 = class118.field1664.field1495 <= arg0.field1495 ? arg0.field1495 : class118.field1664.field1495;
                int var7 = class118.field1664.field1524 >= arg0.field1524 ? arg0.field1524 : class118.field1664.field1524;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class118.field1664.field1495 - arg0.field1495;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class249.field3769 == 1 ? class19.field252 : class279.field4338;
            if (arg0.field1502 <= arg0.field1495) {
                var11 = arg0.method742(-1) + (var5 ? class284.method2028(-7, class118.field1664.field1495, arg0.field1495) : "<col=ffffff>") + " (" + var10 + arg0.field1495 + ")";
            } else {
                var11 = arg0.method742(-1) + (var5 ? class284.method2028(-7, class118.field1664.field1495, arg0.field1495) : "<col=ffffff>") + " (" + var10 + arg0.field1495 + "+" + (arg0.field1502 - arg0.field1495) + ")";
            }
        } else {
            var11 = arg0.method742(-1) + " (" + class240.field3612 + arg0.field1526 + ")";
        }
        if (class314.field4848 == 1) {
            class168.method1100(arg1, (short) 31, (long) arg2, class285.field4488 + " -> <col=ffffff>" + var11, arg4, -501, class47.field551, class50.field629);
            class328.field5008++;
        } else if (!class72.field909) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class112.field1594[var12] != null) {
                    class301.field4696++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class249.field3769 == 0 && class112.field1594[var12].equalsIgnoreCase(class311.field4813)) {
                        if (class118.field1664.field1495 < arg0.field1495) {
                            var13 = 2000;
                        }
                        if (class118.field1664.field1504 != 0 && arg0.field1504 != 0) {
                            if (class118.field1664.field1504 == arg0.field1504) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class325.field4981[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class271.field4265[var12];
                    short var16 = (short) (var13 + var15);
                    class168.method1100(arg1, var16, (long) arg2, "<col=ffffff>" + var11, arg4, -501, class295.field4605[var12], class112.field1594[var12]);
                }
            }
        } else if ((class37.field442 & 0x8) != 0) {
            class168.method1100(arg1, (short) 45, (long) arg2, class255.field3892 + " -> <col=ffffff>" + var11, arg4, -501, class229.field3343, class260.field3943);
            field2611++;
        }
        int var17 = -9 / ((arg3 + 37) / 44);
        for (int var18 = 0; var18 < class310.field4794; var18++) {
            if (class30.field371[var18] == 5) {
                class148.field2061[var18] = "<col=ffffff>" + var11;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)Lbf;", line = 137)
    public static final class345 method1246(int arg0, byte arg1) {
        field2606++;
        class345 var2 = (class345) class97.field1267.method1239((byte) -28, (long) arg0);
        if (arg1 != 50) {
            field2608 = 100;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class231.field3374.method1199(28815, arg0, 29);
        class345 var4 = new class345();
        if (var3 != null) {
            var4.method2381(arg0, new class107(var3), (byte) 5);
        }
        class97.field1267.method1243(var4, (long) arg0, -29282);
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V", line = 163)
    public static final void method1247(boolean arg0) {
        class208.field2951.method1237((byte) 12);
        if (arg0) {
            method1249(-13);
        }
        class291.field4573.method1237((byte) -101);
        class319.field4897.method1237((byte) -71);
        field2615++;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V", line = 189)
    public static void method1248(byte arg0) {
        field2612 = null;
        field2607 = null;
        if (arg0 > -49) {
            field2612 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V", line = 200)
    public static final void method1249(int arg0) {
        field2609++;
        int var1 = 0;
        if (arg0 != -101) {
            field2612 = (int[]) null;
        }
        while (var1 < 100) {
            class285.field4483[var1] = true;
            var1++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lbb;)V", line = 221)
    public class180(class99 arg0) {
        this.field2610 = arg0;
    }
}
