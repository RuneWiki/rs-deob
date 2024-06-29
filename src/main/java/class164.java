import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class164 extends class238 {

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Ljava/lang/String;")
    public String field2429;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lwf;")
    public static class79 field2423 = new class79(59, -1);

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
    public static int[] field2428 = new int[14];

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lwf;")
    public static class79 field2425 = new class79(64, -1);

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lkj;")
    public static class366 field2427;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[Lrl;")
    public static class468[] field2424;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public static void method1025(boolean arg0) {
        field2428 = null;
        field2425 = null;
        field2423 = null;
        field2427 = null;
        field2424 = null;
        if (!arg0) {
            field2427 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lnp;Z)V")
    public static final void method1026(class313 arg0, boolean arg1) {
        field2430++;
        if (!(class476.field6690 >= 2 || class36.field473) || class250.field3695 != null) {
            return;
        }
        String var2;
        if (class36.field473 && class476.field6690 < 2) {
            var2 = class489.field6894 + class251.field3703.method2065(77, class326.field4711) + class373.field5386 + " ->";
        } else if (class325.field4695 && class272.field3959.method2712(2, 81) && class476.field6690 > 2) {
            var2 = class179.method1093((byte) -115, (class451) class160.field2365.field6838.field3576.field3576);
        } else {
            class451 var3 = (class451) class160.field2365.field6838.field3576;
            var2 = class179.method1093((byte) 56, var3);
            int[] var4 = null;
            if (class242.method1532((byte) -127, var3.field6245)) {
                var4 = class64.field834.method2129((int) var3.field6235, false).field537;
            } else if (var3.field6247 != -1) {
                var4 = class64.field834.method2129(var3.field6247, false).field537;
            } else if (class128.method804(var3.field6245, true)) {
                class216 var7 = class139.field1851[(int) var3.field6235];
                if (var7 != null) {
                    class466 var8 = var7.field3232;
                    if (var8.field6526 != null) {
                        var8 = var8.method2742(-38, class140.field1859);
                    }
                    if (var8 != null) {
                        var4 = var8.field6546;
                    }
                }
            } else if (class424.method2490(var3.field6245, -115)) {
                Object var5 = null;
                class453 var6;
                if (var3.field6245 == 1007) {
                    var6 = class156.field2325.method808((int) var3.field6235, 0);
                } else {
                    var6 = class156.field2325.method808((int) (var3.field6235 >>> 32 & 0x7FFFFFFFL), 0);
                }
                if (var6.field6306 != null) {
                    var6 = var6.method2655(57, class140.field1859);
                }
                if (var6 != null) {
                    var4 = var6.field6315;
                }
            }
            if (var4 != null) {
                var2 = var2 + class229.method1462(var4, (byte) -104);
            }
        }
        if (class476.field6690 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class476.field6690 - 2) + class478.field6703.method2065(124, class326.field4711);
        }
        if (class481.field6762 != null) {
            class256 var10 = class481.field6762.method910(true, arg0);
            if (var10 == null) {
                var10 = class491.field6928;
            }
            var10.method1599(class481.field6762.field1950, class279.field4107, class466.field6525, (byte) 126, class11.field120, class460.field6457, class481.field6762.field2075, class267.field3906, class481.field6762.field2021, class448.field6194, class481.field6762.field1992, class481.field6762.field2010, class481.field6762.field2001, var2, class2.field25);
            class382.method2306(class2.field25[1], 0, class2.field25[0], class2.field25[2], class2.field25[3]);
        } else if (class168.field2462 != null && class95.field1225 == class456.field6416) {
            int var9 = class491.field6928.method1603(class267.field3906, 16777215, class243.field3626 + 4, class360.field5185 + 16, 0, class279.field4107, (byte) -34, class11.field120, var2, class466.field6525);
            class382.method2306(class360.field5185, 0, class243.field3626 + 4, class37.field488.method860(-46, var2) - -var9, 16);
        }
        if (arg1) {
            method1025(true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)V")
    public static final void method1027(boolean arg0) {
        if (class116.field1481 != null) {
            class116.field1481.method2475(94);
        }
        if (arg0) {
            method1026((class313) null, true);
        }
        field2426++;
        if (class28.field381 != null) {
            class28.field381.method2475(75);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class164() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class164(String arg0, int arg1) {
        this.field2429 = arg0;
    }
}
