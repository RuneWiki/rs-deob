import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class282 extends class3 {

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Lsf;")
    public static class108 field4936 = class140.method973(255, "Fertigkeit: ");

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[I")
    public static int[] field4937 = new int[2];

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lsf;")
    public static class108 field4941 = class140.method973(255, "<col=ffffff>");

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Z")
    public static boolean field4939;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[I")
    public static int[] field4943;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 7)
    public static void method2028(int arg0) {
        field4936 = null;
        if (arg0 > -75) {
            field4940 = -123;
        }
        field4943 = null;
        field4941 = null;
        field4937 = null;
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V", line = 23)
    public static final void method2029(int arg0) {
        class195.method1388(-82, class272.field4776);
        field4935++;
        class135.field2330++;
        if (class296.field5161 && class54.field797) {
            int var1 = class317.field5456;
            int var2 = var1 - class206.field3692;
            int var3 = class171.field3116;
            int var4 = var3 - class286.field5009;
            int var5 = class272.field4776.field1645;
            if (var2 < class239.field4165) {
                var2 = class239.field4165;
            }
            if ((class239.field4165 + class209.field3736.field1673) < (class272.field4776.field1673 + var2)) {
                var2 = class239.field4165 + class209.field3736.field1673 - class272.field4776.field1673;
            }
            if (var4 < class42.field558) {
                var4 = class42.field558;
            }
            if ((class42.field558 + class209.field3736.field1688) < (class272.field4776.field1688 + var4)) {
                var4 = class42.field558 + class209.field3736.field1688 - class272.field4776.field1688;
            }
            int var6 = var4 - class305.field5300;
            int var7 = var4 + class209.field3736.field1701 - class42.field558;
            int var8 = var2 - class162.field2907;
            int var9 = class209.field3736.field1597 + var2 - class239.field4165;
            if (class272.field4776.field1683 < class135.field2330 && (var5 < var8 || (-var5) > var8 || var5 < var6 || (-var5) > var6)) {
                class311.field5385 = true;
            }
            if (class272.field4776.field1719 != null && class311.field5385) {
                class286 var10 = new class286();
                var10.field4993 = class272.field4776.field1719;
                var10.field4994 = var9;
                var10.field4996 = var7;
                var10.field5006 = class272.field4776;
                class287.method2053(var10, 95);
            }
            if (class83.field1298 == arg0) {
                if (class311.field5385) {
                    if (class272.field4776.field1658 != null) {
                        class286 var11 = new class286();
                        var11.field5006 = class272.field4776;
                        var11.field4993 = class272.field4776.field1658;
                        var11.field4999 = class240.field4177;
                        var11.field4996 = var7;
                        var11.field4994 = var9;
                        class287.method2053(var11, 63);
                    }
                    if (class240.field4177 != null && client.method1822(class272.field4776) != null) {
                        class79.field1198++;
                        class256.field4471.method1427(24, 0);
                        class256.field4471.method1719(class240.field4177.field1649, arg0 ^ 0x8A0A4508);
                        class256.field4471.method1724(false, class272.field4776.field1583);
                        class256.field4471.method1729(class240.field4177.field1583, arg0 + 4110);
                        class256.field4471.method1765(class272.field4776.field1649, 0);
                    }
                } else if ((class155.field2798 == 1 || class274.method1980(class311.field5374 - 1, arg0 ^ 0x6E)) && class311.field5374 > 2) {
                    class90.method612(-19775);
                } else if (class311.field5374 > 0) {
                    class1.method6(0);
                }
                class272.field4776 = null;
            }
        } else if (class135.field2330 > 1) {
            class272.field4776 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lql;", line = 178)
    public static final class17 method2030(int arg0, int arg1) {
        if (arg0 != 27674) {
            return (class17) null;
        }
        field4942++;
        if (arg1 == 0) {
            return new class210();
        } else if (arg1 == 1) {
            return new class209();
        } else if (arg1 == 2) {
            return new class90();
        } else if (arg1 == 3) {
            return new class211();
        } else if (arg1 == 4) {
            return new class129();
        } else if (arg1 == 5) {
            return new class268();
        } else if (arg1 == 6) {
            return new class35();
        } else if (arg1 == 7) {
            return new class185();
        } else if (arg1 == 8) {
            return new class253();
        } else if (arg1 == 9) {
            return new class202();
        } else if (arg1 == 10) {
            return new class303();
        } else if (arg1 == 11) {
            return new class147();
        } else if (arg1 == 12) {
            return new class75();
        } else if (arg1 == 13) {
            return new class178();
        } else if (arg1 == 14) {
            return new class308();
        } else if (arg1 == 15) {
            return new class61();
        } else if (arg1 == 16) {
            return new class100();
        } else if (arg1 == 17) {
            return new class318();
        } else if (arg1 == 18) {
            return new class132();
        } else if (arg1 == 19) {
            return new class322();
        } else if (arg1 == 20) {
            return new class316();
        } else if (arg1 == 21) {
            return new class166();
        } else if (arg1 == 22) {
            return new class325();
        } else if (arg1 == 23) {
            return new class47();
        } else if (arg1 == 24) {
            return new class229();
        } else if (arg1 == 25) {
            return new class81();
        } else if (arg1 == 26) {
            return new class157();
        } else if (arg1 == 27) {
            return new class310();
        } else if (arg1 == 28) {
            return new class152();
        } else if (arg1 == 29) {
            return new class26();
        } else if (arg1 == 30) {
            return new class142();
        } else if (arg1 == 31) {
            return new class146();
        } else if (arg1 == 32) {
            return new class156();
        } else if (arg1 == 33) {
            return new class175();
        } else if (arg1 == 34) {
            return new class283();
        } else if (arg1 == 35) {
            return new class86();
        } else if (arg1 == 36) {
            return new class91();
        } else if (arg1 == 37) {
            return new class116();
        } else if (arg1 == 38) {
            return new class25();
        } else if (arg1 == 39) {
            return new class331();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)J", line = 496)
    public static final long method2031(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        return var3 == null || var3.field1117 == null ? 0L : var3.field1117.field3184;
    }
}
