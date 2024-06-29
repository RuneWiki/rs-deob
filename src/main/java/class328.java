import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class328 {

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Lph;")
    public static class229 field5581 = class266.method1858("Chargement de la liste des serveurs", 0);

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field5583 = 0;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field5587 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lph;")
    public static class229 field5580 = class266.method1858("", 0);

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Lph;")
    public static class229 field5588 = class266.method1858(")2", 0);

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "[I")
    public static int[] field5590 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Lph;")
    public static class229 field5584 = class266.method1858("overlay", 0);

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "Lph;")
    private static class229 field5595 = class266.method1858(" is already on your ignore list)3", 0);

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field5594 = 0;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lph;")
    public static class229 field5586 = field5595;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Ldh;")
    public static class166 field5582;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Lri;")
    public static class301 field5593;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "[Z")
    public static boolean[] field5596;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[Lri;I)V", line = 9)
    public static final void method2249(int arg0, class301[] arg1, int arg2) {
        field5592++;
        int var3 = 0;
        if (arg2 != 1) {
            method2251(127, 77, -105);
        }
        while (var3 < arg1.length) {
            class301 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field4920 == 0) {
                    if (var4.field4955 != null) {
                        method2249(arg0, var4.field4955, 1);
                    }
                    class48 var5 = (class48) class251.field4176.method713(3365, (long) var4.field4948);
                    if (var5 != null) {
                        class253.method1772(arg0, 0, var5.field700);
                    }
                }
                if (arg0 == 0 && var4.field4914 != null) {
                    class157 var6 = new class157();
                    var6.field2552 = var4.field4914;
                    var6.field2551 = var4;
                    class177.method1275(var6, -74);
                }
                if (arg0 == 1 && var4.field5015 != null) {
                    label64: {
                        if (var4.field4987 >= 0) {
                            class301 var7 = class206.method1440(var4.field4948, (byte) -68);
                            if (var7 == null || var7.field4955 == null || var7.field4955.length <= var4.field4987 || var7.field4955[var4.field4987] != var4) {
                                break label64;
                            }
                        }
                        class157 var8 = new class157();
                        var8.field2552 = var4.field5015;
                        var8.field2551 = var4;
                        class177.method1275(var8, -103);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 96)
    public static void method2250(int arg0) {
        field5582 = null;
        field5580 = null;
        field5586 = null;
        field5595 = null;
        field5590 = null;
        field5596 = null;
        if (arg0 != 23920) {
            field5582 = (class166) null;
        }
        field5584 = null;
        field5581 = null;
        field5588 = null;
        field5593 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V", line = 129)
    public static final void method2251(int arg0, int arg1, int arg2) {
        class281 var3 = class135.method957(0, arg2, 13);
        field5585++;
        var3.method1932(0);
        int var4 = 4 / ((arg1 - 32) / 50);
        var3.field4660 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lhb;I)V", line = 183)
    public static final void method2252(class164 arg0, int arg1) {
        field5591++;
        if ((arg0.field2668.length - arg0.field2670) < 1) {
            return;
        }
        int var2 = arg0.method1178(8);
        if (var2 < 0 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field2668.length - arg0.field2670) < var3 || arg1 != -14885) {
            return;
        }
        class191.field3153 = arg0.method1178(arg1 ^ 0xFFFFC5D3);
        if (class191.field3153 < 1) {
            class191.field3153 = 1;
        } else if (class191.field3153 > 4) {
            class191.field3153 = 4;
        }
        class302.method2041((byte) 102, arg0.method1178(8) == 1);
        class175.field2877 = arg0.method1178(8) == 1;
        class120.field2017 = arg0.method1178(8) == 1;
        class296.field4836 = arg0.method1178(8) == 1;
        class298.field4847 = arg0.method1178(8) == 1;
        class171.field2807 = arg0.method1178(arg1 ^ 0xFFFFC5D3) == 1;
        class215.field3547 = arg0.method1178(8) == 1;
        class45.field687 = arg0.method1178(arg1 ^ 0xFFFFC5D3) == 1;
        class157.field2559 = arg0.method1178(arg1 ^ 0xFFFFC5D3);
        if (class157.field2559 > 2) {
            class157.field2559 = 2;
        }
        if (var2 < 2) {
            class88.field1483 = arg0.method1178(8) == 1;
            arg0.method1178(8);
        } else {
            class88.field1483 = arg0.method1178(8) == 1;
        }
        class281.field4661 = arg0.method1178(8) == 1;
        class215.field3545 = arg0.method1178(8) == 1;
        class214.field3532 = arg0.method1178(arg1 + 14893);
        if (class214.field3532 > 2) {
            class214.field3532 = 2;
        }
        class272.field4546 = class214.field3532;
        class143.field2313 = arg0.method1178(8) == 1;
        class265.field4462 = arg0.method1178(8);
        if (class265.field4462 > 127) {
            class265.field4462 = 127;
        }
        class234.field3860 = arg0.method1178(8);
        class184.field2996 = arg0.method1178(arg1 + 14893);
        if (class184.field2996 > 127) {
            class184.field2996 = 127;
        }
        if (var2 >= 1) {
            class156.field2540 = arg0.method1161(true);
            class326.field5576 = arg0.method1161(true);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1178(8);
        }
        if (var2 >= 4) {
            class194.method1364(arg0.method1178(8));
        }
        if (var2 >= 5) {
            class8.field99 = arg0.method1191(arg1 + 46661);
        }
        if (var2 >= 6) {
            class72.field1231 = arg0.method1178(8);
        }
        if (var2 >= 7) {
            class160.field2594 = arg0.method1178(8) == 1;
        }
        if (var2 >= 8) {
            class255.field4267 = arg0.method1178(8) == 1;
        }
    }
}
