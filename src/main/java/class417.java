import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class417 {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    public static int[] field5741 = new int[5];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field5736 = 0;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5742 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field5743;

    // $FF: synthetic field
    @OriginalMember(owner = "client!s", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field5744;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZ)V")
    public static final void method2432(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            method2437(true);
        }
        if (arg1) {
            class319.field4370--;
            if (class319.field4370 == 0) {
                class197.field2807 = null;
            }
        }
        field5739++;
        if (!arg0) {
            return;
        }
        class289.field3968--;
        if (class289.field3968 == 0) {
            class479.field6783 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method2433(int arg0, int arg1, int arg2) {
        field5735++;
        if (arg2 >= -34) {
            return null;
        }
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method2434(int arg0, byte arg1, String arg2) {
        field5737++;
        class265 var3 = class440.method2554(arg0, 2, 3);
        if (arg1 > -104) {
            method2433(83, -71, -109);
        }
        var3.method1675(false);
        var3.field3688 = arg2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)J")
    public abstract long method1568(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIB)V")
    public static final void method2435(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class299.field4121 <= arg2 && class248.field3487 >= arg2) {
            int var5 = class229.method1443(class53.field874, arg3, class8.field174, (byte) -68);
            int var6 = class229.method1443(class53.field874, arg1, class8.field174, (byte) -68);
            class48.method374(arg2, var5, arg0, var6, 45);
        }
        field5740++;
        int var7 = 121 / ((arg4 - 43) / 56);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)I")
    public abstract int method1569(byte arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public abstract void method1570(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static final void method2436(boolean arg0) {
        field5738++;
        for (class282 var1 = (class282) class411.field5697.method1544(-127); var1 != null; var1 = (class282) class411.field5697.method1546((byte) -42)) {
            if (class455.field6293 == null) {
                var1.method1182(28818);
            } else if (var1.field3873 <= class356.field4972) {
                int var2 = class104.field1501[var1.field3871];
                if (var2 == 0) {
                    class467 var3 = class37.method309(var1.field3877, var1.field3869, var1.field3876);
                    if (var3 instanceof class383) {
                        class211.method1325(var1.field3877, var1.field3869, var1.field3876);
                        class383 var4 = (class383) var3;
                        if (var4.field5435 != null) {
                            class287.method1769(var1.field3877, var1.field3869, var1.field3876, var4.field5435, (class467) null);
                        }
                    }
                } else if (var2 == 1) {
                    class87 var9 = class245.method1528(var1.field3877, var1.field3869, var1.field3876);
                    if (var9 instanceof class203) {
                        class437.method2541(var1.field3877, var1.field3869, var1.field3876);
                        class203 var10 = (class203) var9;
                        if (var10.field2904 != null) {
                            class478.method2810(var1.field3877, var1.field3869, var1.field3876, var10.field2904, (class87) null);
                        }
                    }
                } else if (var2 == 2) {
                    class478 var5 = class75.method518(var1.field3877, var1.field3869, var1.field3876, field5744 == null ? (field5744 = method2438("wk")) : field5744);
                    if (var5 instanceof class295) {
                        class439.method2548(var1.field3877, var1.field3869, var1.field3876, field5744 == null ? (field5744 = method2438("wk")) : field5744);
                        class295 var6 = (class295) var5;
                        if (var6.field4081 != null) {
                            class249.method1542(var6.field4081, false);
                        }
                    }
                } else if (var2 == 3) {
                    class367 var7 = class292.method1807(var1.field3877, var1.field3869, var1.field3876);
                    if (var7 instanceof class440) {
                        class353.method2129(var1.field3877, var1.field3869, var1.field3876);
                        class440 var8 = (class440) var7;
                        if (var8.field6032 != null) {
                            class330.method1969(var1.field3877, var1.field3869, var1.field3876, var8.field6032);
                        }
                    }
                }
                var1.method1182(28818);
            } else if (class356.field4972 == var1.field3875) {
                int var11 = class104.field1501[var1.field3871];
                if (var11 == 0) {
                    class467 var21 = class37.method309(var1.field3877, var1.field3869, var1.field3876);
                    if (var21 instanceof class383) {
                        var1.method1182(28818);
                    } else if (class184.method1204(var1.field3877, var1.field3869, var1.field3876) == null) {
                        class383 var22 = new class383(var1.field3871, var1.field3882, var1.field3864, var1.field3868, var1.field3865, var21);
                        class287.method1769(var1.field3877, var1.field3869, var1.field3876, var22, (class467) null);
                    } else {
                        var1.method1182(28818);
                    }
                } else if (var11 == 1) {
                    class87 var19 = class245.method1528(var1.field3877, var1.field3869, var1.field3876);
                    if (var19 instanceof class203) {
                        var1.method1182(28818);
                    } else if (class236.method1481(var1.field3877, var1.field3869, var1.field3876) == null) {
                        class203 var20 = new class203(var1.field3871, var1.field3882, var1.field3864, var1.field3868, var1.field3865, var19);
                        class478.method2810(var1.field3877, var1.field3869, var1.field3876, var20, (class87) null);
                    } else {
                        var1.method1182(28818);
                    }
                } else if (var11 == 2) {
                    class478 var12 = class75.method518(var1.field3877, var1.field3869, var1.field3876, field5744 == null ? (field5744 = method2438("wk")) : field5744);
                    if (var12 instanceof class295) {
                        var1.method1182(28818);
                    } else {
                        class439.method2548(var1.field3877, var1.field3869, var1.field3876, field5744 == null ? (field5744 = method2438("wk")) : field5744);
                        class475 var13 = class304.field4160.method2075(var1.field3881, false);
                        int var14;
                        int var15;
                        if (var1.field3882 == 1 || var1.field3882 == 3) {
                            var15 = var13.field6714;
                            var14 = var13.field6708;
                        } else {
                            var14 = var13.field6714;
                            var15 = var13.field6708;
                        }
                        class295 var16 = new class295(var1.field3871, var1.field3882, var1.field3877, var1.field3864, var1.field3868, var1.field3865, var1.field3869, var1.field3869 + var15 - 1, var1.field3876, var1.field3876 + var14 - 1, var12);
                        class249.method1542(var16, false);
                    }
                } else if (var11 == 3) {
                    class367 var17 = class292.method1807(var1.field3877, var1.field3869, var1.field3876);
                    if (var17 instanceof class440) {
                        var1.method1182(28818);
                    } else {
                        class440 var18 = new class440(var1.field3864, var1.field3868, var1.field3865, var17);
                        class330.method1969(var1.field3877, var1.field3869, var1.field3876, var18);
                    }
                }
            }
        }
        if (!arg0) {
            method2433(-118, 29, 94);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
    public static void method2437(boolean arg0) {
        if (!arg0) {
            method2432(false, true, false);
        }
        field5742 = null;
        field5741 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2438(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
