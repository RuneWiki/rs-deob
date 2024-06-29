import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class178 extends class307 {

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "Lqd;")
    public static class40 field2933 = class147.method1106("blinken2:", (byte) -93);

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "Z")
    public static boolean field2930 = false;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "Z")
    public static boolean field2929 = true;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "Lqd;")
    public static class40 field2937 = class147.method1106("m", (byte) -103);

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "B")
    public byte field2926;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Lqd;")
    public class40 field2924;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "Lqd;")
    public class40 field2935;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILce;B)Z", line = 9)
    public static final boolean method1311(int arg0, class239 arg1, byte arg2) {
        if (arg2 <= 53) {
            return true;
        }
        field2925++;
        byte[] var3 = arg1.method1674(arg0, -2);
        if (var3 == null) {
            return false;
        } else {
            class10.method63(var3, (byte) -102);
            return true;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 36)
    public static void method1312(int arg0) {
        field2933 = null;
        if (arg0 != -10) {
            method1311(-117, (class239) null, (byte) 102);
        }
        field2937 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILrf;IIIII)Lrf;", line = 50)
    public static final class266 method1313(int arg0, class266 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2932++;
        long var7 = (long) arg6;
        class266 var9 = (class266) class177.field2920.method1345(var7, 28150);
        if (var9 == null) {
            class311 var10 = class311.method2145(class85.field1472, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2138(64, 768, -50, -10, -50);
            class177.field2920.method1350(var9, var7, 86);
        }
        int var11 = arg1.method1136();
        int var12 = arg1.method1154();
        int var13 = 123 / ((18 - arg5) / 57);
        int var14 = arg1.method1178();
        int var15 = arg1.method1163();
        class266 var16 = var9.method1161(true, true);
        if (arg3 != 0) {
            var16.method1148(arg3);
        }
        if (class21.field350) {
            class152 var19 = (class152) var16;
            if (arg4 != class293.method2012(class160.field2671, arg2 + var14, 0, arg0 + var11) || arg4 != class293.method2012(class160.field2671, arg2 + var15, 0, arg0 + var12)) {
                for (int var20 = 0; var20 < var19.field2554; var20++) {
                    var19.field2547[var20] += class293.method2012(class160.field2671, var19.field2563[var20] + arg2, 0, var19.field2568[var20] + arg0) - arg4;
                }
                var19.field2586.field4378 = false;
                var19.field2544.field3854 = false;
            }
        } else {
            class175 var17 = (class175) var16;
            if (arg4 != class293.method2012(class160.field2671, arg2 + var14, 0, arg0 + var11) || class293.method2012(class160.field2671, arg2 + var15, 0, arg0 + var12) != arg4) {
                for (int var18 = 0; var18 < var17.field2849; var18++) {
                    var17.field2843[var18] += class293.method2012(class160.field2671, var17.field2831[var18] + arg2, 0, var17.field2845[var18] + arg0) - arg4;
                }
                var17.field2854 = false;
            }
        }
        return var16;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V", line = 140)
    public static final void method1314(int arg0) {
        if (arg0 == 4915) {
            class263.field4394.method1347(0);
            class209.field3340.method1347(0);
            field2927++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 152)
    public static final void method1315(int arg0, int arg1) {
        class254.field4202.method1348(0, arg1);
        field2928++;
        class68.field1245.method1348(0, arg1);
        if (arg0 != -50) {
            method1311(33, (class239) null, (byte) -13);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)I", line = 184)
    public static final int method1316(int arg0, byte arg1) {
        field2931++;
        if (arg0 < 0) {
            return 0;
        }
        class164 var2 = (class164) class48.field934.method1405((byte) 115, (long) arg0);
        if (var2 == null) {
            return class276.method1917(arg0, (byte) 102).field1076;
        }
        int var3 = 0;
        int var4 = 59 / ((arg1 + 10) / 54);
        for (int var5 = 0; var5 < var2.field2717.length; var5++) {
            if (var2.field2717[var5] == -1) {
                var3++;
            }
        }
        return var3 + class276.method1917(arg0, (byte) 119).field1076 - var2.field2717.length;
    }
}
