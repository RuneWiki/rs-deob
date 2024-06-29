import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class194 extends class184 {

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "Z")
    public boolean field2938;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "Lvg;")
    public class54 field2936;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field2941 = -1;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field2946 = 104;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "Ljj;")
    public static class120 field2944;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "Z")
    public boolean field2933;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
    public boolean field2935;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Z")
    public boolean field2939;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2945;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[I[IB)V")
    public static final void method1346(int arg0, int arg1, int[] arg2, int[] arg3, byte arg4) {
        field2943++;
        if (arg1 < arg0) {
            int var5 = (arg1 + arg0) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if ((var9 & var10) + var7 > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method1346(var6 - 1, arg1, arg2, arg3, (byte) 58);
            method1346(arg0, var6 + 1, arg2, arg3, (byte) 58);
        }
        if (arg4 != 58) {
            method1346(58, 28, null, null, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public static void method1347(boolean arg0) {
        if (arg0) {
            field2947 = -101;
        }
        field2945 = null;
        field2944 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method1348(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class118.field1620 = arg0;
        class686.field9489 = arg1;
        class413.field6206 = class686.field9489 > 1 && class118.field1620.method496();
        class459.field6769 = arg2;
        class504.field7164 = 0x1 << class459.field6769;
        class631.field8819 = class504.field7164 >> 1;
        Math.sqrt((double) (class631.field8819 * class631.field8819 + class631.field8819 * class631.field8819));
        class409.field6165 = arg3;
        class34.field356 = arg4;
        class565.field8040 = arg5;
        class60.field843 = arg6;
        class115.field1596 = class562.method3279(-120);
        class517.method3052(0);
        class375.field5686 = new class186[arg3][class34.field356][class565.field8040];
        class531.field7566 = new class280[arg3];
        if (arg7) {
            class624.field8740 = new int[class34.field356][class565.field8040];
            class289.field4115 = new byte[class34.field356][class565.field8040];
            class21.field225 = new short[class34.field356][class565.field8040];
            class277.field3946 = new class186[1][class34.field356][class565.field8040];
            class46.field568 = new class280[1];
        } else {
            class624.field8740 = null;
            class289.field4115 = null;
            class21.field225 = null;
            class277.field3946 = null;
            class46.field568 = null;
        }
        if (arg8) {
            class146.field1947 = new long[arg3][arg4][arg5];
            class234.field3410 = new class14[65535];
            class313.field4428 = new boolean[65535];
            class625.field8752 = 0;
        } else {
            class146.field1947 = null;
            class234.field3410 = null;
            class313.field4428 = null;
            class625.field8752 = 0;
        }
        class320.method2023(false);
        class577.field8153 = new class593[2];
        class614.field8664 = new class593[2];
        class374.field5677 = new class593[2];
        class518.field7395 = new class593[10000];
        class91.field1277 = 0;
        class274.field3907 = new class593[5000];
        class630.field8794 = 0;
        class187.field2850 = new class119[5000];
        class425.field6313 = 0;
        class464.field6819 = new boolean[class60.field843 + class60.field843 + 1][class60.field843 + class60.field843 + 1];
        class582.field8264 = new boolean[class60.field843 + class60.field843 + 2][class60.field843 + class60.field843 + 2];
        class364.field5242 = new int[class60.field843 + class60.field843 + 2];
        class177.field2736 = class177.field2746;
        if (class413.field6206) {
            class727.field10148 = new boolean[arg3][class60.field843 + class60.field843 + 1][class60.field843 + class60.field843 + 1];
            class760.field10608 = new boolean[arg3][][];
            if (class449.field6662 != null) {
                class705.method4010();
            }
            class449.field6662 = new class203[class686.field9489];
            class118.field1620.method486(class449.field6662.length + 1);
            class118.field1620.method471(0);
            for (int var9 = 0; var9 < class449.field6662.length; var9++) {
                class449.field6662[var9] = new class203(var9 + 1, class118.field1620);
                (new Thread(class449.field6662[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class686.field9489 == 2) {
                var10 = 4;
                class412.field6191 = 2;
            } else if (class686.field9489 == 3) {
                var10 = 6;
                class412.field6191 = 3;
            } else {
                var10 = 8;
                class412.field6191 = 4;
            }
            class379.field5736 = new class41[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class379.field5736[var11] = new class41(class423.field6296[class686.field9489 - 2][var11]);
            }
        } else {
            class412.field6191 = 1;
        }
        class575.field8142 = new int[class412.field6191 - 1];
        class192.field2905 = new int[class412.field6191 - 1];
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLjava/lang/String;Lha;IIIII)V")
    public static final void method1349(byte arg0, String arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class337.field4914 == null || class273.field3883 == null) {
            if (class640.field8990.method208(class659.field9230, (byte) 70) && class640.field8990.method208(class725.field10113, (byte) 70)) {
                class337.field4914 = arg2.method422(class129.method919(class640.field8990, class659.field9230, 0), true);
                class129 var8 = class129.method919(class640.field8990, class725.field10113, 0);
                class273.field3883 = arg2.method422(var8, true);
                var8.method914();
                class597.field8461 = arg2.method422(var8, true);
            } else {
                arg2.method516(arg4, arg3, arg7, arg6, 255 - class531.field7572 << 24 | class189.field2863, 1);
            }
        }
        field2942++;
        if (class337.field4914 != null && class273.field3883 != null) {
            int var9 = (arg7 - (class273.field3883.method1517() * 2)) / class337.field4914.method1517();
            for (int var10 = 0; var10 < var9; var10++) {
                class337.field4914.method3142(arg4 + (class273.field3883.method1517() + (var10 * class337.field4914.method1517())), arg3);
            }
            class273.field3883.method3142(arg4, arg3);
            class597.field8461.method3142(arg7 + arg4 - class597.field8461.method1517(), arg3);
        }
        class298.field4225.method546(false, -1, arg4 + 3, arg1, arg3 + 14, class346.field4999 | 0xFF000000);
        arg2.method516(arg4, arg3 + arg6, arg7, arg5 - arg6, -class531.field7572 + 255 << 24 | class189.field2863, 1);
        if (arg0 >= -72) {
            method1348(null, -104, -115, 43, 74, 42, 90, true, true);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lrg;I)Lhha;")
    public static final class521 method1350(class645 arg0, int arg1) {
        field2937++;
        class478 var2 = class304.method1924(arg0, -9);
        if (arg1 != 1) {
            method1349((byte) -60, null, null, -17, -46, -81, -6, -44);
        }
        int var3 = arg0.method3756(65536);
        return new class521(var2.field10372, var2.field10360, var2.field10369, var2.field10365, var2.field10371, var2.field10364, var2.field10359, var2.field10368, var2.field10358, var2.field6938, var2.field6932, var2.field6937, var2.field6933, var2.field6928, var2.field6926, var3);
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(ILvg;IZ)V")
    public class194(int arg0, class54 arg1, int arg2, boolean arg3) {
        this.field2940 = arg2;
        this.field2938 = arg3;
        this.field2934 = arg0;
        this.field2936 = arg1;
    }
}
