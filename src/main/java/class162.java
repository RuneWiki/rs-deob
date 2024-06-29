import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class162 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[Z")
    public static boolean[] field2201 = new boolean[8];

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[I")
    public static int[] field2207 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ljw;")
    public static class581 field2205 = new class581(99, 6);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lvr;")
    public static class147 field2208;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Laj;")
    public static class333 field2210;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Ldn;")
    public static class544 field2200;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lha;")
    public static class65 field2211;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 6)
    public static void method1179(int arg0) {
        field2211 = null;
        field2201 = null;
        field2205 = null;
        if (arg0 != 16777215) {
            field2201 = null;
        }
        field2200 = null;
        field2208 = null;
        field2210 = null;
        field2207 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;I)V", line = 24)
    public static final void method1180(class65 arg0, int arg1) {
        int var2 = 104 % ((arg1 + 87) / 34);
        field2203++;
        if (!(class746.field10297 >= 2 || class497.field6870) || class437.field6161 != null) {
            return;
        }
        String var3;
        if (class497.field6870 && class746.field10297 < 2) {
            var3 = class66.field942 + class474.field6571.method2780(114, class38.field589) + class341.field4924 + " ->";
        } else if (class672.field9457 && class469.field6507.method828(-2, 81) && class746.field10297 > 2) {
            var3 = class383.method2440(class788.field10852, false);
        } else {
            class275 var4 = class788.field10852;
            if (var4 == null) {
                return;
            }
            var3 = class383.method2440(var4, false);
            int[] var5 = null;
            if (class403.method2514((byte) 6, var4.field4080)) {
                var5 = class770.field10602.method2467(-99, (int) var4.field4079).field4663;
            } else if (var4.field4085 != -1) {
                var5 = class770.field10602.method2467(-100, var4.field4085).field4663;
            } else if (class18.method146(var4.field4080, -13)) {
                class174 var6 = (class174) class234.field3169.method3953((long) ((int) var4.field4079), 14);
                if (var6 != null) {
                    class192 var7 = var6.field2336;
                    class220 var8 = var7.field2577;
                    if (var8.field2995 != null) {
                        var8 = var8.method1449(class382.field5602, -1);
                    }
                    if (var8 != null) {
                        var5 = var8.field2938;
                    }
                }
            } else if (class33.method236(var4.field4080, -1)) {
                Object var9 = null;
                class589 var10;
                if (var4.field4080 == 1008) {
                    var10 = class350.field5132.method3732((byte) 93, (int) var4.field4079);
                } else {
                    var10 = class350.field5132.method3732((byte) 28, (int) (var4.field4079 >>> 32 & 0x7FFFFFFFL));
                }
                if (var10.field7865 != null) {
                    var10 = var10.method3290(1, class382.field5602);
                }
                if (var10 != null) {
                    var5 = var10.field7850;
                }
            }
            if (var5 != null) {
                var3 = var3 + class94.method754((byte) -91, var5);
            }
        }
        if (class746.field10297 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class746.field10297 - 2) + class474.field6564.method2780(91, class38.field589);
        }
        if (class131.field1944 != null) {
            class66 var12 = class131.field1944.method3705(-99, arg0);
            if (var12 == null) {
                var12 = class251.field3716;
            }
            var12.method581((byte) -101, class131.field1944.field9282, class131.field1944.field9231, class688.field9677, class342.field5037, class131.field1944.field9297, class709.field9941, class407.field5889, class584.field7796, var3, class8.field86, class131.field1944.field9290, class131.field1944.field9263, class630.field8819, class131.field1944.field9352);
            class38.method270(-2409, class407.field5889[0], class407.field5889[3], class407.field5889[1], class407.field5889[2]);
        } else if (class781.field10726 != null && class380.field5545 == class21.field332) {
            int var11 = class251.field3716.method571(class8.field86, 59, var3, class688.field9677, class733.field10173 + 16, class584.field7796, 0, class717.field10009 + 4, 16777215, class630.field8819);
            class38.method270(-2409, class717.field10009 + 4, 16, class733.field10173, var11 + class548.field7413.method1696(var3, 0));
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)Z", line = 136)
    public static final boolean method1181(int arg0, int arg1, boolean arg2) {
        field2206++;
        if (!arg2) {
            field2210 = null;
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 149)
    public static final void method1182(int arg0) {
        class718.field10016 = false;
        field2202++;
        class229.method1502(0);
        int var1 = 97 / ((-arg0 - 40) / 37);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V", line = 163)
    public static final void method1183(int arg0, int arg1, int arg2) {
        if (arg1 < 11) {
            field2210 = null;
        }
        field2204++;
        class16 var3 = class94.method753(7, 13175, (long) arg0);
        var3.method119(-78);
        var3.field237 = arg2;
    }
}
