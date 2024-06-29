import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class105 extends class283 {

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1793 = -1;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILql;)V", line = 12)
    public static final void method645(int arg0, class16 arg1) {
        arg1.field445 = false;
        if (arg1.field474 != -1) {
            class1 var2 = class167.method1091(arg0 ^ 0xFFFFFF8C, arg1.field474);
            if (var2 == null || var2.field8 == null) {
                arg1.field474 = -1;
            } else {
                arg1.field457++;
                if (arg1.field444 < var2.field8.length && arg1.field457 > var2.field7[arg1.field444]) {
                    arg1.field444++;
                    arg1.field457 = 1;
                    class171.method1143(arg1.field418, arg0 ^ 0xFFFFFFC1, var2, class163.field2796 == arg1, arg1.field444, arg1.field478);
                }
                if (var2.field8.length <= arg1.field444) {
                    arg1.field457 = 0;
                    arg1.field444 = 0;
                    class171.method1143(arg1.field418, 120, var2, class163.field2796 == arg1, arg1.field444, arg1.field478);
                }
            }
        }
        field1800++;
        if (~arg1.field416 != arg0 && arg1.field456 <= class293.field5011) {
            int var3 = class169.method1134(2, arg1.field416).field2303;
            if (var3 == -1) {
                arg1.field416 = -1;
            } else {
                class1 var4 = class167.method1091(-99, var3);
                if (var4 == null || var4.field8 == null) {
                    arg1.field416 = -1;
                } else {
                    if (arg1.field475 < 0) {
                        arg1.field475 = 0;
                        class171.method1143(arg1.field418, arg0 - 94, var4, class163.field2796 == arg1, 0, arg1.field478);
                    }
                    arg1.field427++;
                    if (arg1.field475 < var4.field8.length && var4.field7[arg1.field475] < arg1.field427) {
                        arg1.field427 = 1;
                        arg1.field475++;
                        class171.method1143(arg1.field418, arg0 - 96, var4, class163.field2796 == arg1, arg1.field475, arg1.field478);
                    }
                    if (var4.field8.length <= arg1.field475) {
                        arg1.field416 = -1;
                    }
                }
            }
        }
        if (arg1.field451 != -1 && arg1.field463 <= 1) {
            class1 var5 = class167.method1091(-37, arg1.field451);
            if (var5.field23 == 1 && arg1.field442 > 0 && arg1.field426 <= class293.field5011 && class293.field5011 > arg1.field447) {
                arg1.field463 = 1;
                return;
            }
        }
        if (arg1.field451 != -1 && arg1.field463 == 0) {
            class1 var6 = class167.method1091(-51, arg1.field451);
            if (var6 == null || var6.field8 == null) {
                arg1.field451 = -1;
            } else {
                arg1.field430++;
                if (arg1.field461 < var6.field8.length && arg1.field430 > var6.field7[arg1.field461]) {
                    arg1.field461++;
                    arg1.field430 = 1;
                    class171.method1143(arg1.field418, -89, var6, class163.field2796 == arg1, arg1.field461, arg1.field478);
                }
                if (var6.field8.length <= arg1.field461) {
                    arg1.field470++;
                    arg1.field461 -= var6.field26;
                    if (var6.field15 <= arg1.field470) {
                        arg1.field451 = -1;
                    } else if (arg1.field461 >= 0 && arg1.field461 < var6.field8.length) {
                        class171.method1143(arg1.field418, 117, var6, class163.field2796 == arg1, arg1.field461, arg1.field478);
                    } else {
                        arg1.field451 = -1;
                    }
                }
                arg1.field445 = var6.field27;
            }
        }
        if (arg1.field463 > 0) {
            arg1.field463--;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V", line = 153)
    public static final void method646(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class130.field2271; var3++) {
            for (int var4 = 0; var4 < class297.field5067; var4++) {
                for (int var5 = 0; var5 < class155.field2670; var5++) {
                    class150 var6 = class182.field3184[var3][var4][var5];
                    if (var6 != null) {
                        class65 var7 = var6.field2571;
                        if (var7 != null && var7.field1252.method771()) {
                            class165.method1082(var7.field1252, var3, var4, var5, 1, 1);
                            if (var7.field1251 != null && var7.field1251.method771()) {
                                class165.method1082(var7.field1251, var3, var4, var5, 1, 1);
                                var7.field1252.method779(var7.field1251, 0, 0, 0, false);
                                var7.field1251 = var7.field1251.method780(arg0, arg1, arg2);
                            }
                            var7.field1252 = var7.field1252.method780(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2576; var8++) {
                            class5 var9 = var6.field2575[var8];
                            if (var9 != null && var9.field105.method771()) {
                                class165.method1082(var9.field105, var3, var4, var5, var9.field96 + 1 - var9.field92, var9.field86 - var9.field88 + 1);
                                var9.field105 = var9.field105.method780(arg0, arg1, arg2);
                            }
                        }
                        class92 var10 = var6.field2586;
                        if (var10 != null && var10.field1572.method771()) {
                            class65.method442(var10.field1572, var3, var4, var5);
                            var10.field1572 = var10.field1572.method780(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)Lqf;", line = 228)
    public static final class140 method647(int arg0, boolean arg1) {
        field1801++;
        if (arg1) {
            method648(-33, 121, -19);
        }
        return class252.field4356 && class161.field2754 <= arg0 && arg0 <= class65.field1253 ? class245.field4178[arg0 - class161.field2754] : null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)V", line = 247)
    public static final void method648(int arg0, int arg1, int arg2) {
        class229 var3 = class241.method1638(6, -42, arg0);
        var3.method1574(3199);
        var3.field3981 = arg2;
        if (arg1 != 0) {
            field1794 = -14;
        }
        field1802++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)V", line = 260)
    public static final void method649(byte arg0, int arg1) {
        if (arg0 != -108) {
            field1794 = -110;
        }
        class164.field2818.method1833(arg1, (byte) 64);
        field1798++;
    }
}
