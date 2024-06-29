import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class297 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "[Laca;")
    public static class620[] field4068 = new class620[128];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lit;")
    public static class555 field4071 = new class555();

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[[I")
    public static int[][] field4076 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lcba;")
    public static class471 field4074 = new class471(95, 11);

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[I")
    public static int[] field4077 = new int[25];

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lkb;")
    public static class592 field4070;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
    public static final int method1893(int arg0) {
        field4073++;
        return arg0 > -80 ? 108 : 14;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lqa;Ljt;IIIII)V")
    public static final void method1894(class207 arg0, class87 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class395.field5610 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class332.field4447) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class34.field624 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class622 var15 = class356.field4807[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class590.field8430[var12].method1104(var13, var14) + class590.field8430[var12].method1104(var13 + 1, var14) + class590.field8430[var12].method1104(var13, var14 + 1) + class590.field8430[var12].method1104(var13 + 1, var14 + 1)) / 4 - (class590.field8430[arg2].method1104(arg3, arg4) + class590.field8430[arg2].method1104(arg3 + 1, arg4) + class590.field8430[arg2].method1104(arg3, arg4 + 1) + class590.field8430[arg2].method1104(arg3 + 1, arg4 + 1)) / 4;
                                    class344 var17 = var15.field8985;
                                    class344 var18 = var15.field8982;
                                    if (var17 != null && var17.method264(1)) {
                                        arg1.method258((var14 - arg4) * class41.field808 + (1 - arg6) * class194.field2745, var7, 89, var16, var17, (var13 - arg3) * class41.field808 + (1 - arg5) * class194.field2745, arg0);
                                    }
                                    if (var18 != null && var18.method264(1)) {
                                        arg1.method258((var14 - arg4) * class41.field808 + (1 - arg6) * class194.field2745, var7, 115, var16, var18, (var13 - arg3) * class41.field808 + (1 - arg5) * class194.field2745, arg0);
                                    }
                                    for (class559 var19 = var15.field8973; var19 != null; var19 = var19.field7736) {
                                        class425 var20 = var19.field7742;
                                        if (var20 != null && var20.method264(1) && (var20.field6036 == var13 || var8 == var13) && (var20.field6028 == var14 || var10 == var14)) {
                                            int var21 = var20.field6030 + 1 - var20.field6036;
                                            int var22 = var20.field6031 + 1 - var20.field6028;
                                            arg1.method258((var20.field6028 - arg4) * class41.field808 + (var22 - arg6) * class194.field2745, var7, 87, var16, var20, (var20.field6036 - arg3) * class41.field808 + (var21 - arg5) * class194.field2745, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method1895(byte arg0) {
        field4071 = null;
        field4068 = null;
        if (arg0 != 48) {
            method1895((byte) 25);
        }
        field4076 = null;
        field4074 = null;
        field4077 = null;
        field4070 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BZI)V")
    public static final void method1896(byte arg0, boolean arg1, int arg2) {
        if (arg0 < 74) {
            method1896((byte) -55, false, -101);
        }
        class40.field797 = 3;
        field4072++;
        class320.field4337 = arg2;
        class483.method2807(18205, class31.field506.field2680, class31.field506.field2686);
        if (arg1) {
            class403.method2406(false, (byte) 85, "", "");
        } else {
            class645.method3717(-56);
            class403.method2406(false, (byte) 88, class395.field5620, class394.field5558);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lpe;III)V")
    public static final void method1897(class524 arg0, int arg1, int arg2, int arg3) {
        class300.field4116[arg2][arg3] = arg0;
        if (arg1 != 1) {
            method1896((byte) -90, true, 94);
        }
        field4069++;
    }
}
