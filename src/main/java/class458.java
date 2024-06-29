import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class458 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lku;")
    public static class232 field6420 = new class232(32);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZLoa;)V")
    public static final void method2678(int arg0, boolean arg1, class452 arg2) {
        field6424++;
        if (class476.field6690 >= 400 || class492.field6935 == arg2 || arg0 != -1) {
            return;
        }
        String var9;
        if (arg2.field6293 == 0) {
            boolean var3 = true;
            if (class492.field6935.field6304 != -1 && arg2.field6304 != -1) {
                int var4 = class492.field6935.field6253 <= arg2.field6253 ? arg2.field6253 : class492.field6935.field6253;
                int var5 = arg2.field6304 > class492.field6935.field6304 ? class492.field6935.field6304 : arg2.field6304;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class492.field6935.field6253 - arg2.field6253;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var7 > var6) {
                    var3 = false;
                }
            }
            String var8 = class456.field6416 == class410.field5756 ? class167.field2443.method2065(-91, class326.field4711) : class311.field4393.method2065(-113, class326.field4711);
            if (arg2.field6253 >= arg2.field6278) {
                var9 = arg2.method2648(true, arg0 ^ 0x6F) + (var3 ? class99.method562(arg2.field6253, class492.field6935.field6253, true) : "<col=ffffff>") + " (" + var8 + arg2.field6253 + ")";
            } else {
                var9 = arg2.method2648(true, arg0 - 109) + (var3 ? class99.method562(arg2.field6253, class492.field6935.field6253, true) : "<col=ffffff>") + " (" + var8 + arg2.field6253 + "+" + (arg2.field6278 - arg2.field6253) + ")";
            }
        } else {
            var9 = arg2.method2648(true, -107) + " (" + class330.field4783.method2065(arg0 - 95, class326.field4711) + arg2.field6293 + ")";
        }
        if (class36.field473) {
            if (!arg1 && (class328.field4745 & 0x8) != 0) {
                class434.field6053++;
                class265.method1633(20, -1, 0, 0, (long) arg2.field2154, class373.field5386 + " -> <col=ffffff>" + var9, true, 500, class489.field6894, false, class22.field282);
            }
        } else if (arg1) {
            class265.method1633(-1, 0, 0, 0, 0L, "", false, 500, "<col=cccccc>" + var9, true, -1);
        } else {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (class306.field4358[var10] != null) {
                    short var11 = 0;
                    if (class95.field1225 == class456.field6416 && class306.field4358[var10].equalsIgnoreCase(class473.field6651.method2065(67, class326.field4711))) {
                        if (arg2.field6253 > class492.field6935.field6253) {
                            var11 = 2000;
                        }
                        if (class492.field6935.field6281 != 0 && arg2.field6281 != 0) {
                            if (class492.field6935.field6281 == arg2.field6281) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (class79.field974[var10]) {
                        var11 = 2000;
                    }
                    short var12 = (short) (class476.field6692[var10] + var11);
                    int var13 = class262.field3843[var10] == -1 ? class231.field3494 : class262.field3843[var10];
                    class214.field3220++;
                    class265.method1633(var12, -1, 0, 0, (long) arg2.field2154, "<col=ffffff>" + var9, true, 500, class306.field4358[var10], false, var13);
                }
            }
        }
        if (arg1) {
            return;
        }
        for (class451 var14 = (class451) class160.field2365.method2843(arg0 + 1123227613); var14 != null; var14 = (class451) class160.field2365.method2842(1673506446)) {
            if (var14.field6245 == 47) {
                var14.field6246 = "<col=ffffff>" + var9;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method2679(byte arg0) {
        field6420 = null;
        if (arg0 != -61) {
            field6420 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    public static final void method2680(int arg0, int arg1) {
        if (arg0 == 20577) {
            field6421++;
            class489 var2 = class116.method731(arg0 ^ 0xDAB6AE81, 11, arg1);
            var2.method2861(-229012000);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lug;")
    public static final class363 method2681(byte arg0) {
        if (arg0 >= -14) {
            field6420 = null;
        }
        field6419++;
        try {
            return (class363) Class.forName("oe").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method2682(int arg0) {
        field6422++;
        if (arg0 != -128) {
            method2683((class201) null, -52, -15);
        }
        if (class258.field3770) {
            return;
        }
        if (class314.field4438.field5782) {
            class157.field2346 = (float) ((int) class157.field2346 - 65 & 0xFFFFFF80);
        } else {
            class111.field1413 += (-24.0F - class111.field1413) / 2.0F;
        }
        class132.field1732 = true;
        class258.field3770 = true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lb;II)Lqb;")
    public static final class135 method2683(class201 arg0, int arg1, int arg2) {
        field6423++;
        byte[] var3 = arg0.method1228(arg1, 109);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != 0) {
                field6420 = null;
            }
            return new class135(var3);
        }
    }
}
