import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class462 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field6853 = 0;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Llt;")
    public static class475 field6852 = new class475("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lki;")
    public static class498 field6855 = new class498(52, 4);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILoq;)I", line = 5)
    public static final int method2782(int arg0, class239 arg1) {
        field6854++;
        int var2 = arg1.field3517;
        class82 var3 = arg1.method845(arg0 ^ arg0);
        if (arg1.field1963) {
            var2 = arg1.field3547;
        } else if (arg1.field1931 == var3.field1267 || arg1.field1931 == var3.field1268 || arg1.field1931 == var3.field1252 || arg1.field1931 == var3.field1235) {
            var2 = arg1.field3557;
        } else if (arg1.field1931 == var3.field1260 || arg1.field1931 == var3.field1245 || arg1.field1931 == var3.field1232 || arg1.field1931 == var3.field1242) {
            var2 = arg1.field3554;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lqa;B)V", line = 44)
    public static final void method2783(class162 arg0, byte arg1) {
        field6851++;
        int var2 = class25.field267;
        int var3 = class11.field148;
        int var4 = class85.field1299;
        int var5 = class61.field928 - 3;
        byte var6 = 20;
        if (class179.field2637 == null || class202.field2920 == null) {
            if (class6.field81.method2924((byte) -128, class238.field3499) && class6.field81.method2924((byte) -125, class39.field575)) {
                class179.field2637 = arg0.method1030(class408.method2459(class6.field81, class238.field3499, 0), true);
                class408 var7 = class408.method2459(class6.field81, class39.field575, 0);
                class202.field2920 = arg0.method1030(var7, true);
                var7.method2463();
                class423.field6361 = arg0.method1030(var7, true);
            } else {
                arg0.method1036(var2, var3, var4, var6, 255 - class159.field2351 << 24 | class47.field766, 1);
            }
        }
        if (class179.field2637 != null && class202.field2920 != null) {
            int var8 = (var4 - (class202.field2920.method108() * 2)) / class179.field2637.method108();
            for (int var9 = 0; var9 < var8; var9++) {
                class179.field2637.method3121(var2 + class202.field2920.method108() + var9 * class179.field2637.method108(), var3);
            }
            class202.field2920.method3121(var2, var3);
            class423.field6361.method3121(var2 + var4 - class423.field6361.method108(), var3);
        }
        class294.field4202.method2899(var2 + 3, var3 + 14, -1, class397.field5946.method2838(false, class143.field2137), -16777216, class359.field5514 | -16777216);
        arg0.method1036(var2, var3 + var6, var4, var5 - var6, 255 - class159.field2351 << 24 | class47.field766, 1);
        int var10 = class54.field838.method1751(32);
        int var11 = -90 / ((57 - arg1) / 36);
        int var12 = class54.field838.method1749((byte) -124);
        int var13 = 0;
        for (class118 var14 = (class118) class312.field4467.method816(110); var14 != null; var14 = (class118) class312.field4467.method812(119)) {
            int var31 = (class450.field6706 - var13 - 1) * 16 + (var3 + 13) + var6;
            if (var10 > var2 && var2 + var4 > var10 && var31 - 13 < var12 && (var31 + 4) > var12 && var14.field1787) {
                arg0.method1036(var2, var31 - 12, var4, 16, 255 - class286.field4102 << 24 | class80.field1216, 1);
            }
            var13++;
        }
        if ((class307.field4412 == null || class8.field114 == null || class133.field2040 == null) && class6.field81.method2924((byte) -127, class170.field2512) && class6.field81.method2924((byte) -127, class511.field7484) && class6.field81.method2924((byte) -126, class60.field902)) {
            class408 var15 = class408.method2459(class6.field81, class511.field7484, 0);
            class8.field114 = arg0.method1030(var15, true);
            var15.method2463();
            class62.field947 = arg0.method1030(var15, true);
            class307.field4412 = arg0.method1030(class408.method2459(class6.field81, class170.field2512, 0), true);
            class408 var16 = class408.method2459(class6.field81, class60.field902, 0);
            class133.field2040 = arg0.method1030(var16, true);
            var16.method2463();
            class28.field289 = arg0.method1030(var16, true);
        }
        if (class307.field4412 != null && class8.field114 != null && class133.field2040 != null) {
            int var17 = (var4 - (class133.field2040.method108() * 2)) / class307.field4412.method108();
            for (int var18 = 0; var18 < var17; var18++) {
                class307.field4412.method3121(class133.field2040.method108() + var2 + class307.field4412.method108() * var18, var3 - (-var5 - -class307.field4412.method103()));
            }
            int var19 = (var5 - class133.field2040.method103() - var6) / class8.field114.method103();
            for (int var20 = 0; var20 < var19; var20++) {
                class8.field114.method3121(var2, var3 + var6 + class8.field114.method103() * var20);
                class62.field947.method3121(var4 + var2 - class62.field947.method108(), class8.field114.method103() * var20 + var3 - -var6);
            }
            class133.field2040.method3121(var2, var3 + var5 - class133.field2040.method103());
            class28.field289.method3121(var2 + var4 - class133.field2040.method108(), var5 + var3 + -class133.field2040.method103());
        }
        int var21 = 0;
        for (class118 var22 = (class118) class312.field4467.method816(127); var22 != null; var22 = (class118) class312.field4467.method812(116)) {
            int var23 = ((class450.field6706 - var21 - 1) * 16) + var3 + var6 + 13;
            int var24 = class359.field5514 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && var23 - 13 < var12 && var12 < (var23 + 4) && var22.field1787) {
                var24 = class329.field4684 | 0xFF000000;
            }
            int[] var25 = null;
            if (class208.method1398(var22.field1781, true)) {
                var25 = class294.field4196.method453(0, (int) var22.field1775).field4805;
            } else if (var22.field1779 != -1) {
                var25 = class294.field4196.method453(0, var22.field1779).field4805;
            } else if (class169.method1170(var22.field1781, -118)) {
                class167 var28 = class193.field2821[(int) var22.field1775];
                if (var28 != null) {
                    class342 var29 = var28.field2472;
                    if (var29.field4938 != null) {
                        var29 = var29.method2094(-120, class49.field796);
                    }
                    if (var29 != null) {
                        var25 = var29.field4872;
                    }
                }
            } else if (class253.method1701(var22.field1781, (byte) -110)) {
                Object var26 = null;
                class519 var27;
                if (var22.field1781 == 1006) {
                    var27 = class252.field3743.method2686((int) var22.field1775, (byte) 125);
                } else {
                    var27 = class252.field3743.method2686((int) (var22.field1775 >>> 32 & 0x7FFFFFFFL), (byte) 117);
                }
                if (var27.field7596 != null) {
                    var27 = var27.method3067(class49.field796, -13012);
                }
                if (var27 != null) {
                    var25 = var27.field7650;
                }
            }
            String var30 = class195.method1313((byte) 109, var22);
            if (var25 != null) {
                var30 = var30 + class474.method2833(-1, var25);
            }
            class294.field4202.method2916(var30, class337.field4733, var23, 24382, var2 + 3, class187.field2784, 0, var24);
            if (var22.field1777) {
                class475.field6994.method3121(class163.field2401.method1797(false, var30) + var2 + 5, var23 + -12);
            }
            var21++;
        }
        class50.method311(122, class61.field928, class11.field148, class85.field1299, class25.field267);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lqa;)V", line = 249)
    public static final void method2784(class162 arg0) {
        for (int var1 = class449.field6688; var1 < class208.field2979; var1++) {
            for (int var2 = 0; var2 < class361.field5554; var2++) {
                for (int var3 = 0; var3 < class484.field7096; var3++) {
                    class518 var4 = class108.field1553[var1][var2][var3];
                    if (var4 != null) {
                        class364 var5 = var4.field7559;
                        class364 var6 = var4.field7570;
                        if (var5 != null && var5.method18(83)) {
                            class437.method2625(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method18(79)) {
                                class437.method2625(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method19(false, 0, 0, var5, arg0, 0, (byte) -121);
                                var6.method13((byte) -89);
                            }
                            var5.method13((byte) -89);
                        }
                        for (class284 var7 = var4.field7569; var7 != null; var7 = var7.field4087) {
                            class117 var9 = var7.field4083;
                            if (var9 != null && var9.method18(89)) {
                                class437.method2625(arg0, var9, var1, var2, var3, var9.field1770 + 1 - var9.field1762, var9.field1765 - var9.field1771 + 1);
                                var9.method13((byte) -89);
                            }
                        }
                        class185 var8 = var4.field7550;
                        if (var8 != null && var8.method18(82)) {
                            class63.method369(arg0, var8, var1, var2, var3);
                            var8.method13((byte) -89);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 324)
    public static void method2785(int arg0) {
        field6855 = null;
        if (arg0 != 0) {
            method2784(null);
        }
        field6852 = null;
    }
}
