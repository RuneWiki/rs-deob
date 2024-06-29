import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class357 extends class35 {

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public int field5429;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Z")
    public boolean field5426;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public int field5422;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lct;")
    public static class285 field5424 = new class285(10, 1);

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5428 = null;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field5431;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field5432;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public static final void method2199(int arg0) {
        field5425++;
        for (class64 var1 = (class64) class257.field3801.method2456(32101); var1 != null; var1 = (class64) class257.field3801.method2461(301)) {
            if (class170.field2427 == null) {
                var1.method283(2);
            } else if (class452.field6418 >= var1.field881) {
                int var2 = class352.field5363[var1.field884];
                if (var2 == 0) {
                    class100 var9 = class147.method1006(var1.field888, var1.field886, var1.field876);
                    if (var9 instanceof class463) {
                        class465.method2734(var1.field888, var1.field886, var1.field876);
                        class463 var10 = (class463) var9;
                        if (var10.field6534 != null) {
                            class157.method1074(var1.field888, var1.field886, var1.field876, var10.field6534, (class100) null);
                        }
                    }
                } else if (var2 == 1) {
                    class287 var7 = class115.method826(var1.field888, var1.field886, var1.field876);
                    if (var7 instanceof class282) {
                        class186.method1284(var1.field888, var1.field886, var1.field876);
                        class282 var8 = (class282) var7;
                        if (var8.field4259 != null) {
                            class124.method869(var1.field888, var1.field886, var1.field876, var8.field4259, (class287) null);
                        }
                    }
                } else if (var2 == 2) {
                    class305 var3 = class390.method2350(var1.field888, var1.field886, var1.field876, field5432 == null ? (field5432 = method2201("ki")) : field5432);
                    if (var3 instanceof class307) {
                        class433.method2535(var1.field888, var1.field886, var1.field876, field5432 == null ? (field5432 = method2201("ki")) : field5432);
                        class307 var4 = (class307) var3;
                        if (var4.field4584 != null) {
                            class204.method1394(var4.field4584, false);
                        }
                    }
                } else if (var2 == 3) {
                    class47 var5 = class487.method2848(var1.field888, var1.field886, var1.field876);
                    if (var5 instanceof class109) {
                        class370.method2294(var1.field888, var1.field886, var1.field876);
                        class109 var6 = (class109) var5;
                        if (var6.field1527 != null) {
                            class100.method773(var1.field888, var1.field886, var1.field876, var6.field1527);
                        }
                    }
                }
                var1.method283(2);
            } else if (class452.field6418 == var1.field883) {
                int var11 = class352.field5363[var1.field884];
                if (var11 == 0) {
                    class100 var21 = class147.method1006(var1.field888, var1.field886, var1.field876);
                    if (var21 instanceof class463) {
                        var1.method283(2);
                    } else if (class123.method863(var1.field888, var1.field886, var1.field876) == null) {
                        class463 var22 = new class463(var1.field884, var1.field892, var1.field880, var1.field874, var1.field872, var21);
                        class157.method1074(var1.field888, var1.field886, var1.field876, var22, (class100) null);
                    } else {
                        var1.method283(2);
                    }
                } else if (var11 == 1) {
                    class287 var19 = class115.method826(var1.field888, var1.field886, var1.field876);
                    if (var19 instanceof class282) {
                        var1.method283(2);
                    } else if (class212.method1428(var1.field888, var1.field886, var1.field876) == null) {
                        class282 var20 = new class282(var1.field884, var1.field892, var1.field880, var1.field874, var1.field872, var19);
                        class124.method869(var1.field888, var1.field886, var1.field876, var20, (class287) null);
                    } else {
                        var1.method283(2);
                    }
                } else if (var11 == 2) {
                    class305 var12 = class390.method2350(var1.field888, var1.field886, var1.field876, field5432 == null ? (field5432 = method2201("ki")) : field5432);
                    if (var12 instanceof class307) {
                        var1.method283(2);
                    } else {
                        class433.method2535(var1.field888, var1.field886, var1.field876, field5432 == null ? (field5432 = method2201("ki")) : field5432);
                        class271 var13 = class206.field3124.method338((byte) 114, var1.field878);
                        int var14;
                        int var15;
                        if (var1.field892 == 1 || var1.field892 == 3) {
                            var14 = var13.field4014;
                            var15 = var13.field4048;
                        } else {
                            var14 = var13.field4048;
                            var15 = var13.field4014;
                        }
                        class307 var16 = new class307(var1.field884, var1.field892, var1.field888, var1.field880, var1.field874, var1.field872, var1.field886, var1.field886 + var15 - 1, var1.field876, var1.field876 + var14 - 1, var12);
                        class204.method1394(var16, false);
                    }
                } else if (var11 == 3) {
                    class47 var17 = class487.method2848(var1.field888, var1.field886, var1.field876);
                    if (var17 instanceof class109) {
                        var1.method283(2);
                    } else {
                        class109 var18 = new class109(var1.field880, var1.field874, var1.field872, var17);
                        class100.method773(var1.field888, var1.field886, var1.field876, var18);
                    }
                }
            }
        }
        if (arg0 <= 113) {
            method2200((byte) 113);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method2200(byte arg0) {
        if (arg0 > -95) {
            field5431 = -14;
        }
        field5428 = null;
        field5424 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIZ)V")
    public class357(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5423 = arg2;
        this.field5429 = arg3;
        this.field5426 = arg5;
        this.field5422 = arg0;
        this.field5427 = arg4;
        this.field5430 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2201(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
