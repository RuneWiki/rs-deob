import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class218 extends class137 {

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Ltl;")
    public static class59 field3536 = class85.method639(":clanreq:", 9588);

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Ltl;")
    public static class59 field3545 = class85.method639("::fps ", 9588);

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "[I")
    public static int[] field3543 = new int[1000];

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "Ltl;")
    private static class59 field3552 = class85.method639("yellow:", 9588);

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "Ltl;")
    private static class59 field3551 = class85.method639("Loading interfaces )2 ", 9588);

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Ltl;")
    public static class59 field3538 = field3551;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Ltl;")
    public static class59 field3548 = field3552;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Ltl;")
    public static class59 field3550 = field3552;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Lme;")
    public static class295 field3549;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Leh;")
    private class94 field3539;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V", line = 6)
    public static final void method1507(int arg0, int arg1, int arg2) {
        class186 var3 = class67.method561(32, arg1, 1);
        if (arg2 != 4927) {
            method1516(117, (byte) -56);
        }
        var3.method1380(3293);
        var3.field3117 = arg0;
        field3535++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILs;)V", line = 24)
    public final void method1508(int arg0, class170 arg1) {
        while (true) {
            int var3 = arg1.method1221(73);
            if (var3 == 0) {
                field3540++;
                if (arg0 != -1) {
                    this.method1511(-31, 82, (class59) null);
                }
                return;
            }
            this.method1512(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V", line = 46)
    public static final void method1509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3544++;
        class174.method1283(7, arg4, class163.field2662[arg3], arg2 - arg1, arg1 + arg2);
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 << 1;
        int var10 = arg5 * arg5;
        int var11 = var10 << 1;
        int var12 = var8 << 1;
        int var13 = (1 - var9) * var8 + var11;
        int var14 = var10 - ((var9 - 1) * var12);
        int var15 = var10 << 2;
        int var16 = var8 << 2;
        if (arg0 > -105) {
            return;
        }
        int var17 = ((arg5 << 1) - 3) * var12;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg5 - 1) * var16;
        while (var7 > 0) {
            var7--;
            int var21 = arg3 + var7;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var18;
                    var14 += var19;
                    var6++;
                    var18 += var15;
                    var19 += var15;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var19 += var15;
                var13 += var18;
                var18 += var15;
                var6++;
            }
            int var22 = arg3 - var7;
            var14 += -var17;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            var17 -= var16;
            class174.method1283(7, arg4, class163.field2662[var22], var24, var23);
            var13 += -var20;
            class174.method1283(7, arg4, class163.field2662[var21], var24, var23);
            var20 -= var16;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V", line = 130)
    public static final void method1510(int arg0) {
        class9.field123.method1484(false);
        if (arg0 != 1) {
            method1510(-97);
        }
        field3541++;
        class124.field2053.method1484(false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILtl;)Ltl;", line = 149)
    public final class59 method1511(int arg0, int arg1, class59 arg2) {
        field3534++;
        if (this.field3539 == null) {
            return arg2;
        }
        if (arg0 != 0) {
            method1507(5, -62, -101);
        }
        class252 var4 = (class252) this.field3539.method685((long) arg1, 128);
        return var4 == null ? arg2 : var4.field4195;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ls;II)V", line = 168)
    private final void method1512(class170 arg0, int arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method1221(arg1 ^ 0x6F);
            if (this.field3539 == null) {
                int var5 = class43.method293(true, var4);
                this.field3539 = new class94(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1221(106) == 1;
                int var8 = arg0.method1208((byte) -95);
                class287 var9;
                if (var7) {
                    var9 = new class252(arg0.method1250(false));
                } else {
                    var9 = new class174(arg0.method1233((byte) -77));
                }
                this.field3539.method694(var9, (byte) -90, (long) var8);
            }
        }
        if (arg1 != 0) {
            this.method1515(77, 21, -43);
        }
        field3546++;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V", line = 216)
    public static void method1513(int arg0) {
        field3538 = null;
        field3552 = null;
        field3545 = null;
        field3549 = null;
        field3550 = null;
        field3543 = null;
        field3551 = null;
        if (arg0 != 16342) {
            method1507(106, 29, -62);
        }
        field3548 = null;
        field3536 = null;
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Ls;", line = 237)
    public static final class170 method1514(int arg0) {
        field3537++;
        class170 var1 = new class170(30);
        var1.method1219(7, true);
        var1.method1219(class128.field2092, true);
        var1.method1219(class199.field3298 ? 1 : 0, true);
        var1.method1219(class228.field3683 ? 1 : 0, true);
        var1.method1219(class198.field3288 ? 1 : 0, true);
        var1.method1219(class131.field2163 ? 1 : 0, true);
        var1.method1219(class300.field5124 ? 1 : 0, true);
        var1.method1219(class94.field1452 ? 1 : 0, true);
        if (arg0 != -27411) {
            return (class170) null;
        }
        var1.method1219(class67.field1036 ? 1 : 0, true);
        var1.method1219(class266.field4584 ? 1 : 0, true);
        var1.method1219(class268.field4658, true);
        var1.method1219(class308.field5243 ? 1 : 0, true);
        var1.method1219(class193.field3216 ? 1 : 0, true);
        var1.method1219(class148.field2429 ? 1 : 0, true);
        var1.method1219(class227.field3666, true);
        var1.method1219(class146.field2386 ? 1 : 0, true);
        var1.method1219(class228.field3686, true);
        var1.method1219(class99.field1600, true);
        var1.method1219(class191.field3198, true);
        var1.method1237(true, class308.field5207);
        var1.method1237(true, class81.field1283);
        var1.method1219(2, true);
        var1.method1213(-1, class303.field5158);
        var1.method1219(class262.field4362, true);
        var1.method1219(class184.field3078 ? 1 : 0, true);
        return var1;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)I", line = 292)
    public final int method1515(int arg0, int arg1, int arg2) {
        field3542++;
        if (this.field3539 == null) {
            return arg2;
        }
        class174 var4 = (class174) this.field3539.method685((long) arg1, 128);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 != 29203) {
                field3550 = (class59) null;
            }
            return var4.field2851;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)I", line = 313)
    public static final int method1516(int arg0, byte arg1) {
        field3547++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        }
        if (arg1 != -58) {
            field3549 = (class295) null;
        }
        if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }
}
