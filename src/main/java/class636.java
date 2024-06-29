import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public abstract class class636 extends class649 {

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V")
    public static final void method3637(boolean arg0) {
        field9157++;
        class284.method1679(class188.field2561, -108);
        class323.field4703++;
        if (class361.field5296 && class603.field8716) {
            int var1 = class315.field4612.method2340(40960);
            int var2 = class315.field4612.method2338((byte) -107);
            int var3 = var1 - class230.field3048;
            if (!arg0) {
                int var4 = var2 - class581.field8459;
                if (class371.field5495 > var3) {
                    var3 = class371.field5495;
                }
                if (var4 < class697.field9821) {
                    var4 = class697.field9821;
                }
                if (class188.field2561.field202 + var3 > class371.field5495 + class272.field3554.field202) {
                    var3 = class371.field5495 + class272.field3554.field202 - class188.field2561.field202;
                }
                if (class697.field9821 + class272.field3554.field76 < class188.field2561.field76 + var4) {
                    var4 = class697.field9821 + class272.field3554.field76 - class188.field2561.field76;
                }
                int var5 = var3 + class272.field3554.field74 - class371.field5495;
                int var6 = var4 - (class697.field9821 - class272.field3554.field196);
                if (class315.field4612.method3199(-785833812)) {
                    if (class323.field4703 > class188.field2561.field107) {
                        int var7 = var3 - class183.field2515;
                        int var8 = var4 - class422.field6196;
                        if (var7 > class188.field2561.field187 || var7 < (-class188.field2561.field187) || class188.field2561.field187 < var8 || (-class188.field2561.field187) > var8) {
                            class684.field9657 = true;
                        }
                    }
                    if (class188.field2561.field159 != null && class684.field9657) {
                        class303 var9 = new class303();
                        var9.field4500 = class188.field2561.field159;
                        var9.field4507 = var5;
                        var9.field4499 = class188.field2561;
                        var9.field4503 = var6;
                        class195.method1270(var9);
                        return;
                    }
                } else {
                    if (class684.field9657) {
                        class541.method3183(1);
                        if (class188.field2561.field55 != null) {
                            class303 var10 = new class303();
                            var10.field4499 = class188.field2561;
                            var10.field4503 = var6;
                            var10.field4500 = class188.field2561.field55;
                            var10.field4507 = var5;
                            var10.field4498 = class403.field6050;
                            class195.method1270(var10);
                        }
                        if (class403.field6050 != null && client.method571(class188.field2561) != null) {
                            class500.method2853(class188.field2561, class403.field6050, false);
                        }
                    } else if ((class342.field5060 == 1 || class221.method1388((byte) -47)) && class373.field5520 > 2) {
                        class410.method2515(class581.field8459 + class422.field6196, class230.field3048 + class183.field2515, true);
                    } else if (class682.method3821((byte) 116)) {
                        class410.method2515(class581.field8459 + class422.field6196, class230.field3048 - -class183.field2515, true);
                    }
                    class188.field2561 = null;
                }
            }
        } else if (class323.field4703 > 1) {
            class188.field2561 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3638(int arg0, int arg1, int arg2, int arg3) {
        field9155++;
        if (!class512.field7212) {
            return false;
        } else if (class56.field890 < 100) {
            return false;
        } else {
            int var4 = class154.field2177[arg2][arg3][arg1];
            if (arg0 != -20628) {
                return false;
            } else if (-class612.field8820 == var4) {
                return false;
            } else if (class612.field8820 == var4) {
                return true;
            } else if (class383.field5753 == class178.field2480) {
                return false;
            } else {
                int var5 = arg3 << class125.field1831;
                int var6 = arg1 << class125.field1831;
                if (class433.method2575(false, var6 + 1, class263.field3412 + var5 - 1, var6 + class263.field3412 - 1, var5 - -1, var5 + 1, class178.field2480[arg2].method3822(arg1 + 1, arg3, 0), class178.field2480[arg2].method3822(arg1 + 1, arg3 - -1, 0), class178.field2480[arg2].method3822(arg1, arg3, 0), class263.field3412 + var6 - 1) && class433.method2575(false, var6 + 1, class263.field3412 + var5 - 1, var6 - (1 - class263.field3412), class263.field3412 - 1 + var5, var5 + 1, class178.field2480[arg2].method3822(arg1 + 1, arg3 + 1, arg0 ^ 0xFFFFAF6C), class178.field2480[arg2].method3822(arg1, arg3 + 1, 0), class178.field2480[arg2].method3822(arg1, arg3, 0), var6 + 1)) {
                    class541.field8022++;
                    class154.field2177[arg2][arg3][arg1] = class612.field8820;
                    return true;
                } else {
                    class154.field2177[arg2][arg3][arg1] = -class612.field8820;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
    public static final void method3639(byte arg0) {
        field9156++;
        class248.method1511(53);
        class366.method2243(93, class335.field4872.field9504, 2, 22050);
        if (arg0 <= -30) {
            class128.field1846 = class634.method3633(class61.field978, class410.field6110, 22050, -3, 0);
            class507.method2884(class59.method367(null, -1226), -1, true);
            class378.field5680 = class634.method3633(class61.field978, class410.field6110, 2048, -3, 1);
            class378.field5680.method153((byte) 76, class556.field8166);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)Leg;")
    public abstract class364 method1498(int arg0);
}
