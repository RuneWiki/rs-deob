import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class727 {

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[Lwia;")
    private static class790[] field9849 = new class790[50];

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "[J")
    private static long[] field9859 = new long[1000];

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "[[I")
    private static int[][] field9860 = new int[5][5000];

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    private static int field9851 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    private static int field9842 = 0;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "[I")
    private static int[] field9848 = new int[5];

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    private static int field9861 = 0;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "[I")
    private static int[] field9844 = new int[1000];

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    private static int field9865 = 0;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "[I")
    private static int[] field9862 = new int[3];

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "[Ljava/lang/String;")
    private static String[] field9867 = new String[1000];

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lqj;")
    public static class535 field9855 = new class535(4);

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    private static int field9869 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field9839;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lofa;")
    private static class347 field9853;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "Lofa;")
    private static class347 field9868;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Lrp;")
    private static class460 field9840;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Lhr;")
    private static class551 field9856;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ltn;")
    private static class95 field9841;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[I")
    private static int[] field9847;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[J")
    private static long[] field9845;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field9854;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lwh;)V", line = 3)
    public static final void method4005(class158 arg0) {
        method4012(arg0, 200000);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V", line = 9)
    public static void method4006() {
        field9847 = null;
        field9854 = null;
        field9845 = null;
        field9848 = null;
        field9860 = null;
        field9844 = null;
        field9867 = null;
        field9859 = null;
        field9849 = null;
        field9853 = null;
        field9868 = null;
        field9840 = null;
        field9841 = null;
        field9856 = null;
        field9862 = null;
        field9855 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 27)
    public static final void method4007(int arg0) {
        if (arg0 == -1 || !class422.method2542(-95, arg0)) {
            return;
        }
        class347[] var1 = class419.field6032[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class347 var3 = var1[var2];
            if (var3.field5008 != null) {
                class158 var4 = new class158();
                var4.field2137 = var3;
                var4.field2128 = var3.field5008;
                method4012(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 67)
    private static final void method4008(int arg0) {
        class347 var1 = class445.method2655(arg0, (byte) 109);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class347[] var3 = class230.field2956[var2];
        if (var3 == null) {
            class347[] var4 = class419.field6032[var2];
            int var5 = var4.length;
            var3 = class230.field2956[var2] = new class347[var5];
            class421.method2533(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class421.method2533(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)Ljava/lang/String;", line = 110)
    private static final String method4009(int arg0) {
        String var1 = field9841.method738(class426.field6204.field3879 << 16 | arg0, true);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)J", line = 118)
    private static final long method4010(int arg0) {
        Long var1 = field9841.method742(class426.field6204.field3879 << 16 | arg0, (byte) -68);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)I", line = 126)
    private static final int method4011(int arg0) {
        class132 var1 = class285.field4087.method1800(arg0, 31188);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        Integer var2 = field9841.method731(var1.field1809, (byte) -111, var1.field1810, class426.field6204.field3879 << 16 | var1.field1814);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lwh;I)V", line = 150)
    private static final void method4012(class158 arg0, int arg1) {
        Object[] var2 = arg0.field2128;
        int var3 = (Integer) var2[0];
        class315 var4 = class776.method4267(var3, (byte) -84);
        if (var4 == null) {
            return;
        }
        field9847 = new int[var4.field4441];
        int var5 = 0;
        field9854 = new String[var4.field4435];
        int var6 = 0;
        field9845 = new long[var4.field4440];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field2129;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field2123;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field2137 == null ? -1 : arg0.field2137.field5003;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field2122;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field2137 == null ? -1 : arg0.field2137.field4955;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field2127 == null ? -1 : arg0.field2127.field5003;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field2127 == null ? -1 : arg0.field2127.field4955;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field2132;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field2136;
                }
                field9847[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field2131;
                }
                field9854[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field9845[var7++] = var11;
            }
        }
        field9869 = arg0.field2134;
        method4013(var4, arg1);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lnba;I)V", line = 239)
    private static final void method4013(class315 arg0, int arg1) {
        field9865 = 0;
        field9861 = 0;
        int var2 = -1;
        int[] var3 = arg0.field4446;
        int[] var4 = arg0.field4444;
        byte var5 = -1;
        field9842 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method4016(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method4015(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field9844[field9865++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field9844[field9865++] = class480.field6740.field10579[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class480.field6740.method4231(field9844[--field9865], 0, var8);
                } else if (var45 == 3) {
                    field9867[field9861++] = arg0.field4439[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field9865 -= 2;
                    if (field9844[field9865 + 1] != field9844[field9865]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field9865 -= 2;
                    if (field9844[field9865 + 1] == field9844[field9865]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field9865 -= 2;
                    if (field9844[field9865] < field9844[field9865 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field9865 -= 2;
                    if (field9844[field9865] > field9844[field9865 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field9842 == 0) {
                        return;
                    }
                    class790 var9 = field9849[--field9842];
                    arg0 = var9.field10848;
                    var3 = arg0.field4446;
                    var4 = arg0.field4444;
                    var2 = var9.field10846;
                    field9847 = var9.field10845;
                    field9854 = var9.field10844;
                    field9845 = var9.field10849;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field9844[field9865++] = class480.field6740.method2443(0, var10);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class480.field6740.method4232(var11, field9844[--field9865], 108);
                } else if (var45 == 31) {
                    field9865 -= 2;
                    if (field9844[field9865] <= field9844[field9865 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field9865 -= 2;
                    if (field9844[field9865] >= field9844[field9865 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field9844[field9865++] = field9847[var4[var2]];
                } else if (var45 == 34) {
                    field9847[var4[var2]] = field9844[--field9865];
                } else if (var45 == 35) {
                    field9867[field9861++] = field9854[var4[var2]];
                } else if (var45 == 36) {
                    field9854[var4[var2]] = field9867[--field9861];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field9861 -= var12;
                    String var13 = class539.method3121(field9867, false, field9861, var12);
                    field9867[field9861++] = var13;
                } else if (var45 == 38) {
                    field9865--;
                } else if (var45 == 39) {
                    field9861--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class315 var15 = class776.method4267(var14, (byte) -84);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field4441];
                    String[] var17 = new String[var15.field4435];
                    long[] var18 = new long[var15.field4440];
                    for (int var19 = 0; var19 < var15.field4453; var19++) {
                        var16[var19] = field9844[field9865 + var19 - var15.field4453];
                    }
                    for (int var20 = 0; var20 < var15.field4445; var20++) {
                        var17[var20] = field9867[field9861 + var20 - var15.field4445];
                    }
                    for (int var21 = 0; var21 < var15.field4437; var21++) {
                        var18[var21] = field9859[field9851 + var21 - var15.field4437];
                    }
                    field9865 -= var15.field4453;
                    field9861 -= var15.field4445;
                    field9851 -= var15.field4437;
                    class790 var22 = new class790();
                    var22.field10848 = arg0;
                    var22.field10846 = var2;
                    var22.field10845 = field9847;
                    var22.field10844 = field9854;
                    var22.field10849 = field9845;
                    if (field9842 >= field9849.length) {
                        throw new RuntimeException();
                    }
                    field9849[field9842++] = var22;
                    arg0 = var15;
                    var3 = var15.field4446;
                    var4 = var15.field4444;
                    var2 = -1;
                    field9847 = var16;
                    field9854 = var17;
                    field9845 = var18;
                } else if (var45 == 42) {
                    field9844[field9865++] = class138.field1865[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class138.field1865[var23] = field9844[--field9865];
                    class687.method3768(-22033, var23);
                    class303.field4255 |= class679.field9091[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field9844[--field9865];
                    if (var26 >= 0 && var26 <= 5000) {
                        field9848[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field9860[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field9844[--field9865];
                    if (var30 < 0 || var30 >= field9848[var29]) {
                        throw new RuntimeException();
                    }
                    field9844[field9865++] = field9860[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field9865 -= 2;
                    int var32 = field9844[field9865];
                    if (var32 < 0 || var32 >= field9848[var31]) {
                        throw new RuntimeException();
                    }
                    field9860[var31][var32] = field9844[field9865 + 1];
                } else if (var45 == 47) {
                    String var33 = class452.field6497[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field9867[field9861++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class452.field6497[var34] = field9867[--field9861];
                    class489.method2861(-119, var34);
                } else if (var45 == 51) {
                    class184 var35 = arg0.field4451[var4[var2]];
                    class445 var36 = (class445) var35.method1248(112, (long) field9844[--field9865]);
                    if (var36 != null) {
                        var2 += var36.field6408;
                    }
                } else if (var45 == 54) {
                    field9859[field9851++] = arg0.field4448[var2];
                } else if (var45 == 55) {
                    field9851--;
                } else if (var45 == 66) {
                    field9859[field9851++] = field9845[var4[var2]];
                } else if (var45 == 67) {
                    field9845[var4[var2]] = field9859[--field9851];
                } else if (var45 == 68) {
                    field9851 -= 2;
                    if (field9859[field9851 + 1] != field9859[field9851]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field9851 -= 2;
                    if (field9859[field9851 + 1] == field9859[field9851]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field9851 -= 2;
                    if (field9859[field9851] < field9859[field9851 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field9851 -= 2;
                    if (field9859[field9851] > field9859[field9851 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field9851 -= 2;
                    if (field9859[field9851] <= field9859[field9851 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field9851 -= 2;
                    if (field9859[field9851] >= field9859[field9851 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field9844[--field9865] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field9844[--field9865] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field9844[field9865++] = method4020(var4[var2]);
                } else if (var45 == 113) {
                    field9844[field9865++] = method4011(var4[var2]);
                } else if (var45 == 114) {
                    field9859[field9851++] = method4010(var4[var2]);
                } else if (var45 == 115) {
                    field9867[field9861++] = method4009(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field4450 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field2146).append(" ");
                for (int var43 = field9842 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field9849[var43].field10848.field2146).append(" ");
                }
                var42.append("op: ").append(var5);
                class607.method3379(var42.toString(), var44, true);
            } else {
                class743.method4082(-128, 4, "Clientscript error in: " + arg0.field4450);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field4450).append("\n");
                for (int var40 = field9842 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field9849[var40].field10848.field4450).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class607.method3379(var39.toString(), var44, true);
                class280.method1834((byte) 88, var39.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ltq;II)V", line = 803)
    public static final void method4014(class654 arg0, int arg1, int arg2) {
        class315 var3 = class338.method2161(arg0, arg1, -23265, arg2);
        if (var3 == null) {
            return;
        }
        field9847 = new int[var3.field4441];
        field9854 = new String[var3.field4435];
        if (class560.field7673 == var3.field4443 || class267.field3913 == var3.field4443 || class408.field5783 == var3.field4443) {
            int var4 = 0;
            int var5 = 0;
            if (class254.field3722 != null) {
                var4 = class254.field3722.field4934;
                var5 = class254.field3722.field4887;
            }
            field9847[0] = class494.field6961.method1652(0) - var4;
            field9847[1] = class494.field6961.method1663((byte) 124) - var5;
        }
        method4013(var3, 200000);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V", line = 831)
    private static final void method4015(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field9844[field9865++] = class49.field494;
                return;
            }
            if (arg0 == 5001) {
                field9865 -= 3;
                class49.field494 = field9844[field9865];
                class250.field3453 = class436.method2618(field9844[field9865 + 1], 8352);
                if (class250.field3453 == null) {
                    class250.field3453 = class141.field1894;
                }
                class445.field6412 = field9844[field9865 + 2];
                field9839++;
                class43 var2 = class492.method2903(class256.field3829, 0, class73.field983);
                var2.field457.method1725(class49.field494, 116);
                var2.field457.method1725(class250.field3453.field139, 103);
                var2.field457.method1725(class445.field6412, 127);
                class409.method2457((byte) -100, var2);
                return;
            }
            if (arg0 == 5002) {
                field9861 -= 2;
                String var3 = field9867[field9861];
                String var4 = field9867[field9861 + 1];
                field9865 -= 2;
                int var5 = field9844[field9865];
                int var6 = field9844[field9865 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field9863++;
                class43 var7 = class492.method2903(class124.field1711, 0, class73.field983);
                var7.field457.method1725(class525.method3045(81, var3) + class525.method3045(-122, var4) + 2, 65);
                var7.field457.method1678(var3, (byte) 96);
                var7.field457.method1725(var5 - 1, 77);
                var7.field457.method1725(var6, 95);
                var7.field457.method1678(var4, (byte) 72);
                class409.method2457((byte) -100, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field9844[--field9865];
                class696 var9 = class416.method2506(var8, (byte) 87);
                String var10 = "";
                if (var9 != null && var9.field9237 != null) {
                    var10 = var9.field9237;
                }
                field9867[field9861++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field9844[--field9865];
                class696 var12 = class416.method2506(var11, (byte) 28);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field9238;
                }
                field9844[field9865++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class250.field3453 == null) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = class250.field3453.field139;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field9844[--field9865];
                class43 var15 = class492.method2903(class731.field9898, 0, class73.field983);
                var15.field457.method1725(var14, 37);
                class409.method2457((byte) -100, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field9867[--field9861];
                method4021(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field9861 -= 2;
                String var17 = field9867[field9861];
                String var18 = field9867[field9861 + 1];
                if (class479.field6726 != 0 || (!class564.field7727 || class405.field5751) && !class704.field9640) {
                    field9857++;
                    class43 var19 = class492.method2903(class687.field9191, 0, class73.field983);
                    var19.field457.method1725(0, 53);
                    int var20 = var19.field457.field3725;
                    var19.field457.method1678(var17, (byte) 63);
                    class511.method2983(var18, 0, var19.field457);
                    var19.field457.method1726((byte) -126, var19.field457.field3725 - var20);
                    class409.method2457((byte) -100, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field9844[--field9865];
                class696 var22 = class416.method2506(var21, (byte) -106);
                String var23 = "";
                if (var22 != null && var22.field9236 != null) {
                    var23 = var22.field9236;
                }
                field9867[field9861++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field9844[--field9865];
                class696 var25 = class416.method2506(var24, (byte) 127);
                String var26 = "";
                if (var25 != null && var25.field9242 != null) {
                    var26 = var25.field9242;
                }
                field9867[field9861++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field9844[--field9865];
                class696 var28 = class416.method2506(var27, (byte) 42);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field9231;
                }
                field9844[field9865++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class625.field8475 == null || class625.field8475.field10354 == null) {
                    var30 = "";
                } else {
                    var30 = class625.field8475.method4156((byte) 40, true);
                }
                field9867[field9861++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field9844[field9865++] = class445.field6412;
                return;
            }
            if (arg0 == 5017) {
                field9844[field9865++] = class441.method2633(false);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field9844[--field9865];
                class696 var32 = class416.method2506(var31, (byte) 94);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field9233;
                }
                field9844[field9865++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field9844[--field9865];
                class696 var35 = class416.method2506(var34, (byte) -97);
                String var36 = "";
                if (var35 != null && var35.field9232 != null) {
                    var36 = var35.field9232;
                }
                field9867[field9861++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class625.field8475 == null || class625.field8475.field10354 == null) {
                    var37 = "";
                } else {
                    var37 = class625.field8475.method4159(0, false);
                }
                field9867[field9861++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field9844[--field9865];
                class696 var39 = class416.method2506(var38, (byte) 17);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field9234;
                }
                field9844[field9865++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field9844[--field9865];
                class696 var42 = class416.method2506(var41, (byte) 79);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field9239;
                }
                field9844[field9865++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field9844[--field9865];
                class696 var45 = class416.method2506(var44, (byte) 19);
                String var46 = "";
                if (var45 != null && var45.field9235 != null) {
                    var46 = var45.field9235;
                }
                field9867[field9861++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field9844[--field9865];
                field9867[field9861++] = class85.field1208.method4075(0, var47).field8967;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field9844[--field9865];
                class669 var49 = class85.field1208.method4075(0, var48);
                if (var49.field8968 == null) {
                    field9844[field9865++] = 0;
                    return;
                }
                field9844[field9865++] = var49.field8968.length;
                return;
            }
            if (arg0 == 5052) {
                field9865 -= 2;
                int var50 = field9844[field9865];
                int var51 = field9844[field9865 + 1];
                class669 var52 = class85.field1208.method4075(0, var50);
                int var53 = var52.field8968[var51];
                field9844[field9865++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field9844[--field9865];
                class669 var55 = class85.field1208.method4075(0, var54);
                if (var55.field8961 == null) {
                    field9844[field9865++] = 0;
                    return;
                }
                field9844[field9865++] = var55.field8961.length;
                return;
            }
            if (arg0 == 5054) {
                field9865 -= 2;
                int var56 = field9844[field9865];
                int var57 = field9844[field9865 + 1];
                field9844[field9865++] = class85.field1208.method4075(0, var56).field8961[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field9844[--field9865];
                field9867[field9861++] = class749.field10088.method3391(var58, -119).method3679(-1);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field9844[--field9865];
                class667 var60 = class749.field10088.method3391(var59, 96);
                if (var60.field8943 == null) {
                    field9844[field9865++] = 0;
                    return;
                }
                field9844[field9865++] = var60.field8943.length;
                return;
            }
            if (arg0 == 5057) {
                field9865 -= 2;
                int var61 = field9844[field9865];
                int var62 = field9844[field9865 + 1];
                field9844[field9865++] = class749.field10088.method3391(var61, 76).field8943[var62];
                return;
            }
            if (arg0 == 5058) {
                field9840 = new class460();
                field9840.field6559 = field9844[--field9865];
                field9840.field6562 = class749.field10088.method3391(field9840.field6559, -113);
                field9840.field6561 = new int[field9840.field6562.method3672((byte) 81)];
                return;
            }
            if (arg0 == 5059) {
                field9864++;
                class43 var63 = class492.method2903(class668.field8952, 0, class73.field983);
                var63.field457.method1725(0, 121);
                int var64 = var63.field457.field3725;
                var63.field457.method1725(0, 101);
                var63.field457.method1733(field9840.field6559, -32466);
                field9840.field6562.method3677(field9840.field6561, -1, var63.field457);
                var63.field457.method1726((byte) -128, var63.field457.field3725 - var64);
                class409.method2457((byte) -100, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field9867[--field9861];
                field9866++;
                class43 var66 = class492.method2903(class483.field6762, 0, class73.field983);
                var66.field457.method1725(0, 41);
                int var67 = var66.field457.field3725;
                var66.field457.method1678(var65, (byte) 105);
                var66.field457.method1733(field9840.field6559, -32466);
                field9840.field6562.method3677(field9840.field6561, -1, var66.field457);
                var66.field457.method1726((byte) -128, var66.field457.field3725 - var67);
                class409.method2457((byte) -100, var66);
                return;
            }
            if (arg0 == 5061) {
                field9864++;
                class43 var68 = class492.method2903(class668.field8952, 0, class73.field983);
                var68.field457.method1725(0, 63);
                int var69 = var68.field457.field3725;
                var68.field457.method1725(1, 72);
                var68.field457.method1733(field9840.field6559, -32466);
                field9840.field6562.method3677(field9840.field6561, -1, var68.field457);
                var68.field457.method1726((byte) -126, var68.field457.field3725 - var69);
                class409.method2457((byte) -100, var68);
                return;
            }
            if (arg0 == 5062) {
                field9865 -= 2;
                int var70 = field9844[field9865];
                int var71 = field9844[field9865 + 1];
                field9844[field9865++] = class85.field1208.method4075(0, var70).field8959[var71];
                return;
            }
            if (arg0 == 5063) {
                field9865 -= 2;
                int var72 = field9844[field9865];
                int var73 = field9844[field9865 + 1];
                field9844[field9865++] = class85.field1208.method4075(0, var72).field8965[var73];
                return;
            }
            if (arg0 == 5064) {
                field9865 -= 2;
                int var74 = field9844[field9865];
                int var75 = field9844[field9865 + 1];
                if (var75 == -1) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = class85.field1208.method4075(0, var74).method3693(-116, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field9865 -= 2;
                int var76 = field9844[field9865];
                int var77 = field9844[field9865 + 1];
                if (var77 == -1) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = class85.field1208.method4075(0, var76).method3688((char) var77, 94);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field9844[--field9865];
                field9844[field9865++] = class749.field10088.method3391(var78, 100).method3672((byte) -125);
                return;
            }
            if (arg0 == 5067) {
                field9865 -= 2;
                int var79 = field9844[field9865];
                int var80 = field9844[field9865 + 1];
                int var81 = class749.field10088.method3391(var79, -102).method3682(var80, (byte) 93).field9905;
                field9844[field9865++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field9865 -= 2;
                int var82 = field9844[field9865];
                int var83 = field9844[field9865 + 1];
                field9840.field6561[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field9865 -= 2;
                int var84 = field9844[field9865];
                int var85 = field9844[field9865 + 1];
                field9840.field6561[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field9865 -= 3;
                int var86 = field9844[field9865];
                int var87 = field9844[field9865 + 1];
                int var88 = field9844[field9865 + 2];
                class667 var89 = class749.field10088.method3391(var86, 106);
                if (var89.method3682(var87, (byte) 34).field9905 != 0) {
                    throw new RuntimeException("bad command");
                }
                field9844[field9865++] = var89.method3681(var88, var87, -121);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field9867[--field9861];
                boolean var91 = field9844[--field9865] == 1;
                class164.method1132(var91, 16, var90);
                field9844[field9865++] = class236.field3145;
                return;
            }
            if (arg0 == 5072) {
                if (class235.field3136 != null && class585.field7967 < class236.field3145) {
                    field9844[field9865++] = class235.field3136[class585.field7967++] & 0xFFFF;
                    return;
                }
                field9844[field9865++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class585.field7967 = 0;
                return;
            }
            if (arg0 == 5074) {
                class43 var92 = class492.method2903(class668.field8952, 0, class73.field983);
                var92.field457.method1725(0, 86);
                int var93 = var92.field457.field3725;
                var92.field457.method1725(2, 63);
                var92.field457.method1733(field9840.field6559, -32466);
                field9840.field6562.method3677(field9840.field6561, -1, var92.field457);
                var92.field457.method1726((byte) -128, var92.field457.field3725 - var93);
                class409.method2457((byte) -100, var92);
                return;
            }
            if (arg0 == 5075) {
                class43 var94 = class492.method2903(class668.field8952, 0, class73.field983);
                var94.field457.method1725(0, 51);
                int var95 = var94.field457.field3725;
                var94.field457.method1725(3, 30);
                var94.field457.method1733(field9840.field6559, -32466);
                field9840.field6562.method3677(field9840.field6561, -1, var94.field457);
                var94.field457.method1726((byte) -127, var94.field457.field3725 - var95);
                class409.method2457((byte) -100, var94);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class235.field3128.method983(101, 86)) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class235.field3128.method983(101, 82)) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class235.field3128.method983(101, 81)) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class631.method3484(field9844[--field9865], (byte) -72);
                return;
            }
            if (arg0 == 5201) {
                field9844[field9865++] = class424.method2555((byte) 122);
                return;
            }
            if (arg0 == 5205) {
                class16.method94(27861, -1, field9844[--field9865], false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field9844[--field9865];
                class199 var97 = class752.method4113(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = var97.field2576;
                return;
            }
            if (arg0 == 5207) {
                class199 var98 = class752.method4106(field9844[--field9865]);
                if (var98 != null && var98.field2578 != null) {
                    field9867[field9861++] = var98.field2578;
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 5208) {
                field9844[field9865++] = class386.field5609;
                field9844[field9865++] = class789.field10840;
                return;
            }
            if (arg0 == 5209) {
                field9844[field9865++] = class752.field10177 + class720.field9789;
                field9844[field9865++] = class81.field1129 + class752.field10178;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field9844[--field9865];
                class199 var100 = class752.method4106(var99);
                if (var100 == null) {
                    field9844[field9865++] = 0;
                    field9844[field9865++] = 0;
                    return;
                }
                field9844[field9865++] = var100.field2569 >> 14 & 0x3FFF;
                field9844[field9865++] = var100.field2569 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field9844[--field9865];
                class199 var102 = class752.method4106(var101);
                if (var102 == null) {
                    field9844[field9865++] = 0;
                    field9844[field9865++] = 0;
                    return;
                }
                field9844[field9865++] = var102.field2591 - var102.field2582;
                field9844[field9865++] = var102.field2577 - var102.field2573;
                return;
            }
            if (arg0 == 5212) {
                class223 var103 = class96.method757((byte) 65);
                if (var103 == null) {
                    field9844[field9865++] = -1;
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = var103.field2885;
                int var104 = var103.field2887 << 28 | class752.field10177 + var103.field2889 << 14 | class752.field10178 + var103.field2893;
                field9844[field9865++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class223 var105 = class750.method4096((byte) -63);
                if (var105 == null) {
                    field9844[field9865++] = -1;
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = var105.field2885;
                int var106 = var105.field2887 << 28 | class752.field10177 + var105.field2889 << 14 | class752.field10178 + var105.field2893;
                field9844[field9865++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field9844[--field9865];
                class199 var108 = class768.method4233(false);
                if (var108 != null) {
                    boolean var109 = var108.method1306(var107 & 0x3FFF, var107 >> 14 & 0x3FFF, field9862, var107 >> 28 & 0x3, 0);
                    if (var109) {
                        class588.method3306(0, field9862[1], field9862[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field9865 -= 2;
                int var110 = field9844[field9865];
                int var111 = field9844[field9865 + 1];
                class26 var112 = class752.method4114(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class199 var114 = (class199) var112.method152((byte) -13); var114 != null; var114 = (class199) var112.method146((byte) 97)) {
                    if (var114.field2576 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field9844[--field9865];
                class199 var116 = class752.method4106(var115);
                if (var116 == null) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = var116.field2579;
                return;
            }
            if (arg0 == 5220) {
                field9844[field9865++] = class286.field4101 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field9844[--field9865];
                class588.method3306(0, var117 >> 14 & 0x3FFF, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class199 var118 = class768.method4233(false);
                if (var118 != null) {
                    boolean var119 = var118.method1305(class752.field10177 + class720.field9789, field9862, -1, class81.field1129 + class752.field10178);
                    if (var119) {
                        field9844[field9865++] = field9862[1];
                        field9844[field9865++] = field9862[2];
                        return;
                    }
                    field9844[field9865++] = -1;
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = -1;
                field9844[field9865++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field9865 -= 2;
                int var120 = field9844[field9865];
                int var121 = field9844[field9865 + 1];
                class16.method94(27861, var121 >> 14 & 0x3FFF, var120, false, var121 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field9844[--field9865];
                class199 var123 = class768.method4233(false);
                if (var123 != null) {
                    boolean var124 = var123.method1306(var122 & 0x3FFF, var122 >> 14 & 0x3FFF, field9862, var122 >> 28 & 0x3, 0);
                    if (var124) {
                        field9844[field9865++] = field9862[1];
                        field9844[field9865++] = field9862[2];
                        return;
                    }
                    field9844[field9865++] = -1;
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = -1;
                field9844[field9865++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field9844[--field9865];
                class199 var126 = class768.method4233(false);
                if (var126 != null) {
                    boolean var127 = var126.method1305(var125 >> 14 & 0x3FFF, field9862, -1, var125 & 0x3FFF);
                    if (var127) {
                        field9844[field9865++] = field9862[1];
                        field9844[field9865++] = field9862[2];
                        return;
                    }
                    field9844[field9865++] = -1;
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = -1;
                field9844[field9865++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class604.method3374(field9844[--field9865], -6791);
                return;
            }
            if (arg0 == 5227) {
                field9865 -= 2;
                int var128 = field9844[field9865];
                int var129 = field9844[field9865 + 1];
                class16.method94(27861, var129 >> 14 & 0x3FFF, var128, true, var129 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class145.field1964 = field9844[--field9865] == 1;
                return;
            }
            if (arg0 == 5229) {
                field9844[field9865++] = class145.field1964 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field9844[--field9865];
                class515.method3008(36, var130);
                return;
            }
            if (arg0 == 5231) {
                field9865 -= 2;
                int var131 = field9844[field9865];
                boolean var132 = field9844[field9865 + 1] == 1;
                if (class291.field4153 != null) {
                    class159 var133 = class291.field4153.method1248(90, (long) var131);
                    if (var133 != null && !var132) {
                        var133.method1102((byte) 80);
                        return;
                    }
                    if (var133 == null && var132) {
                        class159 var134 = new class159();
                        class291.field4153.method1247(4070, (long) var131, var134);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field9844[--field9865];
                if (class291.field4153 != null) {
                    class159 var136 = class291.field4153.method1248(113, (long) var135);
                    field9844[field9865++] = var136 == null ? 0 : 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field9865 -= 2;
                int var137 = field9844[field9865];
                boolean var138 = field9844[field9865 + 1] == 1;
                if (class9.field77 != null) {
                    class159 var139 = class9.field77.method1248(88, (long) var137);
                    if (var139 != null && !var138) {
                        var139.method1102((byte) 114);
                        return;
                    }
                    if (var139 == null && var138) {
                        class159 var140 = new class159();
                        class9.field77.method1247(4070, (long) var137, var140);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field9844[--field9865];
                if (class9.field77 != null) {
                    class159 var142 = class9.field77.method1248(87, (long) var141);
                    field9844[field9865++] = var142 == null ? 0 : 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field9844[field9865++] = class752.field10158 == null ? -1 : class752.field10158.field2576;
                return;
            }
            if (arg0 == 5236) {
                field9865 -= 2;
                int var143 = field9844[field9865];
                int var144 = field9844[field9865 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class317.method2029(var146, var143, var145, (byte) 102);
                if (var147 < 0) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class346.method2200(11);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field9865 -= 2;
                int var148 = field9844[field9865];
                int var149 = field9844[field9865 + 1];
                class77.method625(false, true, 3, var149, var148);
                field9844[field9865++] = class393.field5661 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class393.field5661 != null) {
                    class77.method625(false, true, class125.field1721.field5183.method1441(43), -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class626[] var150 = class597.method3346(0);
                field9844[field9865++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field9844[--field9865];
                class626[] var152 = class597.method3346(0);
                field9844[field9865++] = var152[var151].field8479;
                field9844[field9865++] = var152[var151].field8481;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class776.field10674;
                int var154 = class104.field1485;
                int var155 = -1;
                class626[] var156 = class597.method3346(0);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class626 var158 = var156[var157];
                    if (var158.field8479 == var153 && var158.field8481 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field9844[field9865++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field9844[field9865++] = class164.method1133(-15388);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field9844[--field9865];
                if (var159 >= 1 && var159 <= 2) {
                    class77.method625(false, true, var159, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field9844[field9865++] = class125.field1721.field5183.method1441(43);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field9844[--field9865];
                if (var160 >= 1 && var160 <= 2) {
                    class125.field1721.method2255(true, var160, class125.field1721.field5183);
                    class125.field1721.method2255(true, var160, class125.field1721.field5179);
                    class515.method3006(-2);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field9861 -= 2;
                String var161 = field9867[field9861];
                String var162 = field9867[field9861 + 1];
                int var163 = field9844[--field9865];
                field9850++;
                class43 var164 = class492.method2903(class389.field5635, 0, class73.field983);
                var164.field457.method1725(class525.method3045(101, var161) + class525.method3045(0, var162) + 1, 68);
                var164.field457.method1678(var161, (byte) 98);
                var164.field457.method1678(var162, (byte) 105);
                var164.field457.method1725(var163, 63);
                class409.method2457((byte) -100, var164);
                return;
            }
            if (arg0 == 5401) {
                field9865 -= 2;
                class394.field5675[field9844[field9865]] = (short) class81.method650((byte) -57, field9844[field9865 + 1]);
                class16.field156.method2129(false);
                class16.field156.method2131(21503);
                class107.field1507.method3584((byte) -104);
                class166.method1137(false);
                return;
            }
            if (arg0 == 5405) {
                field9865 -= 2;
                int var165 = field9844[field9865];
                int var166 = field9844[field9865 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class263.field3880[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field9865 -= 7;
                int var167 = field9844[field9865];
                int var168 = field9844[field9865 + 1] << 1;
                int var169 = field9844[field9865 + 2];
                int var170 = field9844[field9865 + 3];
                int var171 = field9844[field9865 + 4];
                int var172 = field9844[field9865 + 5];
                int var173 = field9844[field9865 + 6];
                if (var167 >= 0 && var167 < 2 && class263.field3880[var167] != null && var168 >= 0 && var168 < class263.field3880[var167].length) {
                    class263.field3880[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class263.field3880[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class263.field3880[field9844[--field9865]].length >> 1;
                field9844[field9865++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class393.field5661 != null) {
                    class77.method625(false, true, class125.field1721.field5183.method1441(43), -1, -1);
                }
                if (class639.field8606 != null) {
                    class756.method4144((byte) 67);
                    System.exit(0);
                    return;
                }
                String var175 = class267.field3916 == null ? class687.method3772((byte) -107) : class267.field3916;
                class588.method3307(class786.field10800, var175, false, class125.field1721.field5141.method2541(43) == 1, (byte) 67);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class529.field7309 != null) {
                    if (class529.field7309.field8403 == null) {
                        var176 = class187.method1258(-86, class529.field7309.field8402);
                    } else {
                        var176 = (String) class529.field7309.field8403;
                    }
                }
                field9867[field9861++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field9844[field9865++] = class786.field10800.field3248 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class393.field5661 != null) {
                    class77.method625(false, true, class125.field1721.field5183.method1441(43), -1, -1);
                }
                String var177 = field9867[--field9861];
                boolean var178 = field9844[--field9865] == 1;
                String var179 = class687.method3772((byte) -107) + var177;
                class588.method3307(class786.field10800, var179, var178, class125.field1721.field5141.method2541(43) == 1, (byte) 67);
                return;
            }
            if (arg0 == 5422) {
                field9861 -= 2;
                String var180 = field9867[field9861];
                String var181 = field9867[field9861 + 1];
                int var182 = field9844[--field9865];
                if (var180.length() > 0) {
                    if (class652.field8797 == null) {
                        class652.field8797 = new String[class574.field7825[class426.field6204.field3879]];
                    }
                    class652.field8797[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class154.field2083 == null) {
                        class154.field2083 = new String[class574.field7825[class426.field6204.field3879]];
                    }
                    class154.field2083[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field9867[--field9861]);
                return;
            }
            if (arg0 == 5424) {
                field9865 -= 11;
                class415.field5993 = field9844[field9865];
                class149.field2005 = field9844[field9865 + 1];
                class43.field465 = field9844[field9865 + 2];
                class357.field5209 = field9844[field9865 + 3];
                class123.field1700 = field9844[field9865 + 4];
                class302.field4240 = field9844[field9865 + 5];
                class199.field2572 = field9844[field9865 + 6];
                class492.field6921 = field9844[field9865 + 7];
                class285.field4089 = field9844[field9865 + 8];
                class609.field8240 = field9844[field9865 + 9];
                class442.field6365 = field9844[field9865 + 10];
                class490.field6826.method1185(class123.field1700, 9330);
                class490.field6826.method1185(class302.field4240, 9330);
                class490.field6826.method1185(class199.field2572, 9330);
                class490.field6826.method1185(class492.field6921, 9330);
                class490.field6826.method1185(class285.field4089, 9330);
                class34.field374 = null;
                class90.field1279 = null;
                class120.field1627 = null;
                class324.field4598 = null;
                class429.field6219 = null;
                class574.field7826 = null;
                class446.field6414 = null;
                class339.field4752 = null;
                class348.field5048 = true;
                return;
            }
            if (arg0 == 5425) {
                class772.method4245(30003);
                class348.field5048 = false;
                return;
            }
            if (arg0 == 5426) {
                field9865 -= 2;
                class744.field10055 = field9844[field9865];
                class37.field393 = field9844[field9865 + 1];
                return;
            }
            if (arg0 == 5427) {
                field9865 -= 2;
                class463.field6579 = field9844[field9865 + 1];
                return;
            }
            if (arg0 == 5428) {
                field9865 -= 2;
                int var183 = field9844[field9865];
                int var184 = field9844[field9865 + 1];
                field9844[field9865++] = class9.method60((byte) -128, var183, var184) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class159.method1103(false, false, (byte) 111, field9867[--field9861]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class376.method2358(class552.field7624, 3860, "accountcreated");
                    return;
                } catch (Throwable var332) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class376.method2358(class552.field7624, 3860, "accountcreatestarted");
                    return;
                } catch (Throwable var333) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class26.field257 != null) {
                    Transferable var186 = class26.field257.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var334) {
                        }
                    }
                }
                field9867[field9861++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class676.field9069 = field9844[--field9865];
                return;
            }
            if (arg0 == 5435) {
                field9844[field9865++] = class273.field3971 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field9865 -= 4;
                int var187 = field9844[field9865];
                int var188 = field9844[field9865 + 1];
                int var189 = field9844[field9865 + 2];
                int var190 = field9844[field9865 + 3];
                class545.method3142(var190, var188 << 2, (var187 >> 14 & 0x3FFF) - class120.field1625, false, (var187 & 0x3FFF) - class259.field3849, var189, (byte) 126);
                return;
            }
            if (arg0 == 5501) {
                field9865 -= 4;
                int var191 = field9844[field9865];
                int var192 = field9844[field9865 + 1];
                int var193 = field9844[field9865 + 2];
                int var194 = field9844[field9865 + 3];
                class316.method2019(-1025, var193, var192 << 2, (var191 & 0x3FFF) - class259.field3849, (var191 >> 14 & 0x3FFF) - class120.field1625, var194);
                return;
            }
            if (arg0 == 5502) {
                field9865 -= 6;
                int var195 = field9844[field9865];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                class577.field7864 = var195;
                int var196 = field9844[field9865 + 1];
                if (var196 + 1 >= class263.field3880[class577.field7864].length >> 1) {
                    throw new RuntimeException();
                }
                class482.field6757 = var196;
                class6.field47 = 0;
                class70.field958 = field9844[field9865 + 2];
                class729.field9892 = field9844[field9865 + 3];
                int var197 = field9844[field9865 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class550.field7591 = var197;
                int var198 = field9844[field9865 + 5];
                if (var198 + 1 >= class263.field3880[class550.field7591].length >> 1) {
                    throw new RuntimeException();
                }
                class5.field36 = var198;
                class697.field9252 = 3;
                class609.field8242 = -1;
                class702.field9303 = -1;
                return;
            }
            if (arg0 == 5503) {
                class267.method1782(false);
                return;
            }
            if (arg0 == 5504) {
                field9865 -= 2;
                class228.method1445(3, field9844[field9865 + 1], field9844[field9865], 0);
                return;
            }
            if (arg0 == 5505) {
                field9844[field9865++] = (int) class294.field4169 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field9844[field9865++] = (int) class514.field7144 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class554.method3185(7);
                return;
            }
            if (arg0 == 5508) {
                class528.method3058(0);
                return;
            }
            if (arg0 == 5509) {
                class365.method2300((byte) 123);
                return;
            }
            if (arg0 == 5510) {
                class126.method896(false);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field9844[--field9865];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class120.field1625;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class102.field1467) {
                    var202 = class102.field1467;
                }
                int var203 = var201 - class259.field3849;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class393.field5663) {
                    var203 = class393.field5663;
                }
                class46.field479 = (var202 << 9) + 256;
                class265.field3902 = (var203 << 9) + 256;
                class697.field9252 = 4;
                class609.field8242 = -1;
                class702.field9303 = -1;
                return;
            }
            if (arg0 == 5512) {
                class122.method877((byte) 117);
                return;
            }
            if (arg0 == 5514) {
                class72.field981 = field9844[--field9865];
                return;
            }
            if (arg0 == 5516) {
                field9844[field9865++] = class72.field981;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field9844[--field9865];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class120.field1625;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class102.field1467) {
                        var207 = class102.field1467;
                    }
                    int var208 = var206 - class259.field3849;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class393.field5663) {
                        var208 = class393.field5663;
                    }
                    class702.field9303 = (var207 << 9) + 256;
                    class609.field8242 = (var208 << 9) + 256;
                    return;
                }
                class702.field9303 = -1;
                class609.field8242 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field9861 -= 2;
                String var209 = field9867[field9861];
                String var210 = field9867[field9861 + 1];
                int var211 = field9844[--field9865];
                if (var209.length() > 320) {
                    return;
                }
                if (class780.field10712 != 3) {
                    return;
                }
                if (class733.field9917 == 0 && class597.field8132 == 0) {
                    class115.field1558 = var209;
                    class669.field8960 = var210;
                    class340.field4758 = var211;
                    class170.method1148(6, -11239);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class177.method1211((byte) 84);
                return;
            }
            if (arg0 == 5602) {
                if (class733.field9917 == 0) {
                    class323.field4591 = -2;
                    class14.field146 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field9861--;
                if (class780.field10712 != 3) {
                    return;
                }
                if (class733.field9917 == 0 && class597.field8132 == 0) {
                    class599.method3358((byte) 30, field9867[field9861]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field9861 -= 2;
                field9865 -= 2;
                if (class780.field10712 != 3) {
                    return;
                }
                if (class733.field9917 == 0 && class597.field8132 == 0) {
                    class685.method3759(field9844[field9865 + 1] == 1, field9844[field9865], -22845, field9867[field9861], field9867[field9861 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class597.field8132 == 0) {
                    class537.field7446 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field9844[field9865++] = class14.field146;
                return;
            }
            if (arg0 == 5608) {
                field9844[field9865++] = class687.field9181;
                return;
            }
            if (arg0 == 5609) {
                field9844[field9865++] = class537.field7446;
                return;
            }
            if (arg0 == 5611) {
                field9844[field9865++] = class544.field7525;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field9844[--field9865];
                if (class780.field10712 != 7) {
                    return;
                }
                if (class733.field9917 == 0 && class597.field8132 == 0) {
                    if (class710.field9707 != null) {
                        class710.field9707.method138(-62);
                        class710.field9707 = null;
                    }
                    class340.field4758 = var212;
                    class170.method1148(9, -11239);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field9844[field9865++] = class14.field146;
                return;
            }
            if (arg0 == 5615) {
                field9861 -= 2;
                String var213 = field9867[field9861];
                String var214 = field9867[field9861 + 1];
                if (var213.length() > 320) {
                    return;
                }
                if (class780.field10712 != 3) {
                    return;
                }
                if (class733.field9917 == 0 && class597.field8132 == 0) {
                    if (class710.field9707 != null) {
                        class710.field9707.method138(-19);
                        class710.field9707 = null;
                    }
                    class115.field1558 = var213;
                    class669.field8960 = var214;
                    class170.method1148(5, -11239);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class87.method696(false, -97);
                return;
            }
            if (arg0 == 5617) {
                field9844[field9865++] = class323.field4591;
                return;
            }
            if (arg0 == 5618) {
                field9865--;
                return;
            }
            if (arg0 == 5619) {
                field9865--;
                return;
            }
            if (arg0 == 5620) {
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field9861 -= 2;
                field9865 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class157.field2106 != null) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field9844[field9865++] = (int) (class786.field10799 >> 32);
                field9844[field9865++] = (int) (class786.field10799 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field9844[field9865++] = class643.field8660 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class643.field8660 = true;
                class351.method2242((byte) 106);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var215 = field9844[--field9865];
                class125.field1721.method2255(true, var215, class125.field1721.field5136);
                class452.method2690(11);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var216 = field9844[--field9865] == 1;
                class125.field1721.method2255(true, var216 ? 1 : 0, class125.field1721.field5170);
                class125.field1721.method2255(true, var216 ? 1 : 0, class125.field1721.field5155);
                class452.method2690(11);
                class18.method99(-93);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var217 = field9844[--field9865] == 1;
                class125.field1721.method2255(true, var217 ? 2 : 1, class125.field1721.field5168);
                class125.field1721.method2255(true, var217 ? 2 : 1, class125.field1721.field5172);
                class18.method99(-87);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6005) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : 0, class125.field1721.field5166);
                class452.method2690(11);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6007) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5163);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6008) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : 0, class125.field1721.field5153);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6010) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : 0, class125.field1721.field5134);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6011) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5156);
                class452.method2690(11);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6012) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : 0, class125.field1721.field5160);
                class380.method2369((byte) 22);
                class697.method3787(-105);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6014) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 2 : 0, class125.field1721.field5188);
                class452.method2690(11);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6015) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : 0, class125.field1721.field5171);
                class452.method2690(11);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6016) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5184);
                class399.method2434(false, (byte) -78, class125.field1721.field5141.method2541(43));
                class515.method3006(-2);
                return;
            }
            if (arg0 == 6017) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : 0, class125.field1721.field5181);
                class83.method671(-13239);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6018) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5176);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6019) {
                int var218 = field9844[--field9865];
                int var219 = class125.field1721.field5173.method1871(43);
                if (var218 != var219) {
                    if (class487.method2845(class780.field10712, (byte) 26)) {
                        if (var219 == 0 && class264.field3886 != -1) {
                            class414.method2491(0, class66.field917, false, 11889, var218, class264.field3886);
                            class542.method3131(true);
                            class72.field973 = false;
                        } else if (var218 == 0) {
                            class423.method2549((byte) -100);
                            class72.field973 = false;
                        } else {
                            class685.method3761(var218, true);
                        }
                    }
                    class125.field1721.method2255(true, var218, class125.field1721.field5173);
                    class515.method3006(-2);
                    class180.field2362 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5169);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6021) {
                int var220 = class125.field1721.field5168.method2553(43);
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 0 : var220, class125.field1721.field5172);
                class18.method99(-99);
                return;
            }
            if (arg0 == 6023) {
                int var221 = field9844[--field9865];
                class125.field1721.method2255(true, var221, class125.field1721.field5175);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6024) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5174);
                class515.method3006(-2);
                return;
            }
            if (arg0 == 6025) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5144);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6027) {
                int var222 = field9844[--field9865];
                if (var222 < 0 || var222 > 1) {
                    var222 = 0;
                }
                class201.method1324(1073741823, var222 == 1);
                return;
            }
            if (arg0 == 6028) {
                class125.field1721.method2255(true, field9844[--field9865] == 0 ? 0 : 1, class125.field1721.field5162);
                class515.method3006(-2);
                return;
            }
            if (arg0 == 6029) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5163);
                class515.method3006(-2);
                return;
            }
            if (arg0 == 6030) {
                class125.field1721.method2255(true, field9844[--field9865] == 0 ? 0 : 1, class125.field1721.field5147);
                class515.method3006(-2);
                class452.method2690(11);
                return;
            }
            if (arg0 == 6031) {
                int var223 = field9844[--field9865];
                if (var223 < 0 || var223 > 5) {
                    var223 = 2;
                }
                class399.method2434(false, (byte) 108, var223);
                return;
            }
            if (arg0 == 6032) {
                field9865 -= 2;
                int var224 = field9844[field9865];
                boolean var225 = field9844[field9865 + 1] == 1;
                class125.field1721.method2255(true, var224, class125.field1721.field5140);
                if (!var225) {
                    class125.field1721.method2255(true, 0, class125.field1721.field5137);
                }
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6033) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5143);
                class515.method3006(-2);
                return;
            }
            if (arg0 == 6034) {
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : 0, class125.field1721.field5167);
                class515.method3006(-2);
                class380.method2369((byte) 22);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6035) {
                int var226 = class125.field1721.field5170.method591(43);
                class125.field1721.method2255(true, field9844[--field9865] == 1 ? 1 : var226, class125.field1721.field5155);
                class452.method2690(11);
                class18.method99(-93);
                return;
            }
            if (arg0 == 6036) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5182);
                class515.method3006(-2);
                class130.field1794 = true;
                return;
            }
            if (arg0 == 6037) {
                class125.field1721.method2255(true, field9844[--field9865], class125.field1721.field5138);
                class515.method3006(-2);
                class180.field2362 = false;
                return;
            }
            if (arg0 == 6038) {
                int var227 = field9844[--field9865];
                int var228 = class125.field1721.field5185.method1871(43);
                if (var227 != var228 && class552.field7619 == class264.field3886) {
                    if (!class487.method2845(class780.field10712, (byte) 26)) {
                        if (var228 == 0) {
                            class414.method2491(0, class66.field917, false, 11889, var227, class264.field3886);
                            class542.method3131(true);
                            class72.field973 = false;
                        } else if (var227 == 0) {
                            class423.method2549((byte) -100);
                            class72.field973 = false;
                        } else {
                            class685.method3761(var227, true);
                        }
                    }
                    class125.field1721.method2255(true, var227, class125.field1721.field5185);
                    class515.method3006(-2);
                    class180.field2362 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var229 = field9844[--field9865];
                if (var229 > 255 || var229 < 0) {
                    var229 = 0;
                }
                if (var229 != class125.field1721.field5180.method2146(43)) {
                    class125.field1721.method2255(true, var229, class125.field1721.field5180);
                    class515.method3006(-2);
                    class180.field2362 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var230 = field9844[--field9865];
                if (var230 != class125.field1721.field5154.method1216(43)) {
                    class125.field1721.method2255(true, var230, class125.field1721.field5154);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    class654.method3639(-54);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field9844[field9865++] = class125.field1721.field5136.method331(43);
                return;
            }
            if (arg0 == 6102) {
                field9844[field9865++] = class125.field1721.field5170.method591(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field9844[field9865++] = class125.field1721.field5168.method2553(43) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field9844[field9865++] = class125.field1721.field5166.method2848(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field9844[field9865++] = class125.field1721.field5163.method2356(43);
                return;
            }
            if (arg0 == 6108) {
                field9844[field9865++] = class125.field1721.field5153.method2504(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field9844[field9865++] = class125.field1721.field5134.method2409(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field9844[field9865++] = class125.field1721.field5156.method159(43);
                return;
            }
            if (arg0 == 6112) {
                field9844[field9865++] = class125.field1721.field5160.method3282(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field9844[field9865++] = class125.field1721.field5188.method2377(43) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field9844[field9865++] = class125.field1721.field5171.method3709(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field9844[field9865++] = class125.field1721.field5184.method335(43);
                return;
            }
            if (arg0 == 6117) {
                field9844[field9865++] = class125.field1721.field5181.method3364(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field9844[field9865++] = class125.field1721.field5176.method1871(43);
                return;
            }
            if (arg0 == 6119) {
                field9844[field9865++] = class125.field1721.field5173.method1871(43);
                return;
            }
            if (arg0 == 6120) {
                field9844[field9865++] = class125.field1721.field5169.method1871(43);
                return;
            }
            if (arg0 == 6123) {
                field9844[field9865++] = class684.method3750(-125);
                return;
            }
            if (arg0 == 6124) {
                field9844[field9865++] = class125.field1721.field5174.method335(43);
                return;
            }
            if (arg0 == 6125) {
                field9844[field9865++] = class125.field1721.field5144.method3724(43);
                return;
            }
            if (arg0 == 6127) {
                field9844[field9865++] = class125.field1721.field5164.method607(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field9844[field9865++] = class125.field1721.field5162.method2276(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field9844[field9865++] = class125.field1721.field5163.method2356(43);
                return;
            }
            if (arg0 == 6130) {
                field9844[field9865++] = class125.field1721.field5147.method3686(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field9844[field9865++] = class125.field1721.field5141.method2541(43);
                return;
            }
            if (arg0 == 6132) {
                field9844[field9865++] = class125.field1721.field5140.method2541(43);
                return;
            }
            if (arg0 == 6133) {
                field9844[field9865++] = class786.field10800.field3248 && !class786.field10800.field3233 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field9844[field9865++] = class125.field1721.field5143.method3194(43);
                return;
            }
            if (arg0 == 6136) {
                field9844[field9865++] = class125.field1721.field5167.method1438(43) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field9844[field9865++] = class400.method2437(200, (byte) -87, class125.field1721.field5141.method2541(43));
                return;
            }
            if (arg0 == 6139) {
                field9844[field9865++] = class125.field1721.field5182.method1840(43);
                return;
            }
            if (arg0 == 6142) {
                field9844[field9865++] = class125.field1721.field5138.method1871(43);
                return;
            }
            if (arg0 == 6143) {
                field9844[field9865++] = class125.field1721.field5185.method1871(43);
                return;
            }
            if (arg0 == 6144) {
                field9844[field9865++] = class648.field8735 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field9844[field9865++] = class125.field1721.field5180.method2146(43);
                return;
            }
            if (arg0 == 6146) {
                field9844[field9865++] = class125.field1721.field5154.method1216(43);
                return;
            }
            if (arg0 == 6147) {
                field9844[field9865++] = class706.field9663.field9953 < 512 || class648.field8735 || class40.field414 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field9844[field9865++] = class526.field7302 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field9865 -= 2;
                class775.field10668 = (short) field9844[field9865];
                if (class775.field10668 <= 0) {
                    class775.field10668 = 256;
                }
                class108.field1518 = (short) field9844[field9865 + 1];
                if (class108.field1518 <= 0) {
                    class108.field1518 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field9865 -= 2;
                class578.field7886 = (short) field9844[field9865];
                if (class578.field7886 <= 0) {
                    class578.field7886 = 256;
                }
                class423.field6086 = (short) field9844[field9865 + 1];
                if (class423.field6086 <= 0) {
                    class423.field6086 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field9865 -= 4;
                class791.field10858 = (short) field9844[field9865];
                if (class791.field10858 <= 0) {
                    class791.field10858 = 1;
                }
                class164.field2189 = (short) field9844[field9865 + 1];
                if (class164.field2189 <= 0) {
                    class164.field2189 = 32767;
                } else if (class164.field2189 < class791.field10858) {
                    class164.field2189 = class791.field10858;
                }
                class612.field8278 = (short) field9844[field9865 + 2];
                if (class612.field8278 <= 0) {
                    class612.field8278 = 1;
                }
                class157.field2112 = (short) field9844[field9865 + 3];
                if (class157.field2112 <= 0) {
                    class157.field2112 = 32767;
                    return;
                }
                if (class157.field2112 < class612.field8278) {
                    class157.field2112 = class612.field8278;
                }
                return;
            }
            if (arg0 == 6203) {
                class170.method1149(0, false, 3777, class400.field5718.field4940, 0, class400.field5718.field4986);
                field9844[field9865++] = class539.field7458;
                field9844[field9865++] = class698.field9255;
                return;
            }
            if (arg0 == 6204) {
                field9844[field9865++] = class578.field7886;
                field9844[field9865++] = class423.field6086;
                return;
            }
            if (arg0 == 6205) {
                field9844[field9865++] = class775.field10668;
                field9844[field9865++] = class108.field1518;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field9844[field9865++] = (int) (class401.method2440(false) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field9844[field9865++] = (int) (class401.method2440(false) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field9865 -= 3;
                int var231 = field9844[field9865];
                int var232 = field9844[field9865 + 1];
                int var233 = field9844[field9865 + 2];
                long var234 = class28.method164(var231, 0, 0, var233, true, 12, var232);
                int var236 = class196.method1288((byte) 33, var234);
                if (var233 < 1970) {
                    var236--;
                }
                field9844[field9865++] = var236;
                return;
            }
            if (arg0 == 6303) {
                field9844[field9865++] = class130.method922(class401.method2440(false), (byte) 98);
                return;
            }
            if (arg0 == 6304) {
                int var237 = field9844[--field9865];
                boolean var238 = true;
                if (var237 < 0) {
                    var238 = (var237 + 1) % 4 == 0;
                } else if (var237 < 1582) {
                    var238 = var237 % 4 == 0;
                } else if (var237 % 4 != 0) {
                    var238 = false;
                } else if (var237 % 100 != 0) {
                    var238 = true;
                } else if (var237 % 400 != 0) {
                    var238 = false;
                }
                field9844[field9865++] = var238 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var239 = field9844[--field9865];
                int[] var240 = class95.method732(0, var239);
                class421.method2531(var240, 0, field9844, field9865, 3);
                field9865 += 3;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field9844[field9865++] = class211.method1372((byte) -90) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field9844[field9865++] = class295.method1896(-89) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class780.field10712 == 7 && class733.field9917 == 0 && class597.field8132 == 0) {
                    if (class141.field1891) {
                        field9844[field9865++] = 0;
                        return;
                    }
                    if (class221.field2864 > class401.method2440(false) - 1000L) {
                        field9844[field9865++] = 1;
                        return;
                    }
                    class141.field1891 = true;
                    class43 var241 = class492.method2903(class548.field7573, 0, class73.field983);
                    var241.field457.method1686(-117, class654.field8816);
                    class409.method2457((byte) -100, var241);
                    field9844[field9865++] = 0;
                    return;
                }
                field9844[field9865++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class154 var242 = class137.method950(-124);
                if (var242 != null) {
                    field9844[field9865++] = var242.field2086;
                    field9844[field9865++] = var242.field3873;
                    field9867[field9861++] = var242.field2082;
                    class526 var243 = var242.method1070(9342);
                    field9844[field9865++] = var243.field7300;
                    field9867[field9861++] = var243.field7305;
                    field9844[field9865++] = var242.field3872;
                    field9844[field9865++] = var242.field2084;
                    field9867[field9861++] = var242.field2085;
                    return;
                }
                field9844[field9865++] = -1;
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                field9844[field9865++] = 0;
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 6502) {
                class154 var244 = class154.method1072((byte) -94);
                if (var244 != null) {
                    field9844[field9865++] = var244.field2086;
                    field9844[field9865++] = var244.field3873;
                    field9867[field9861++] = var244.field2082;
                    class526 var245 = var244.method1070(9342);
                    field9844[field9865++] = var245.field7300;
                    field9867[field9861++] = var245.field7305;
                    field9844[field9865++] = var244.field3872;
                    field9844[field9865++] = var244.field2084;
                    field9867[field9861++] = var244.field2085;
                    return;
                }
                field9844[field9865++] = -1;
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                field9844[field9865++] = 0;
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var246 = field9844[--field9865];
                String var247 = field9867[--field9861];
                if (class780.field10712 == 7 && class733.field9917 == 0 && class597.field8132 == 0) {
                    field9844[field9865++] = class624.method3445(var247, var246, -124) ? 1 : 0;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var248 = field9844[--field9865];
                class154 var249 = class673.method3712((byte) 111, var248);
                if (var249 != null) {
                    field9844[field9865++] = var249.field3873;
                    field9867[field9861++] = var249.field2082;
                    class526 var250 = var249.method1070(9342);
                    field9844[field9865++] = var250.field7300;
                    field9867[field9861++] = var250.field7305;
                    field9844[field9865++] = var249.field3872;
                    field9844[field9865++] = var249.field2084;
                    field9867[field9861++] = var249.field2085;
                    return;
                }
                field9844[field9865++] = -1;
                field9867[field9861++] = "";
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                field9844[field9865++] = 0;
                field9844[field9865++] = 0;
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 6507) {
                field9865 -= 4;
                int var251 = field9844[field9865];
                boolean var252 = field9844[field9865 + 1] == 1;
                int var253 = field9844[field9865 + 2];
                boolean var254 = field9844[field9865 + 3] == 1;
                class709.method3936(var251, var254, var253, false, var252);
                return;
            }
            if (arg0 == 6508) {
                class503.method2939(false);
                return;
            }
            if (arg0 == 6509) {
                if (class780.field10712 != 7) {
                    return;
                }
                class191.field2476 = field9844[--field9865] == 1;
                return;
            }
            if (arg0 == 6510) {
                field9844[field9865++] = class302.field4241;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class771.field10604 == class11.field126) {
                if (arg0 == 6700) {
                    int var255 = class355.field5178.method1245((byte) 124);
                    if (class227.field2935 != -1) {
                        var255++;
                    }
                    field9844[field9865++] = var255;
                    return;
                }
                if (arg0 == 6701) {
                    int var256 = field9844[--field9865];
                    if (class227.field2935 != -1) {
                        if (var256 == 0) {
                            field9844[field9865++] = class227.field2935;
                            return;
                        }
                        var256--;
                    }
                    class73 var257 = (class73) class355.field5178.method1249((byte) -121);
                    while (var256-- > 0) {
                        var257 = (class73) class355.field5178.method1246(true);
                    }
                    field9844[field9865++] = var257.field985;
                    return;
                }
                if (arg0 == 6702) {
                    int var258 = field9844[--field9865];
                    if (class419.field6032[var258] == null) {
                        field9867[field9861++] = "";
                        return;
                    }
                    String var259 = class419.field6032[var258][0].field4914;
                    if (var259 == null) {
                        field9867[field9861++] = "";
                        return;
                    }
                    field9867[field9861++] = var259.substring(0, var259.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var260 = field9844[--field9865];
                    if (class419.field6032[var260] == null) {
                        field9844[field9865++] = 0;
                        return;
                    }
                    field9844[field9865++] = class419.field6032[var260].length;
                    return;
                }
                if (arg0 == 6704) {
                    field9865 -= 2;
                    int var261 = field9844[field9865];
                    int var262 = field9844[field9865 + 1];
                    if (class419.field6032[var261] == null) {
                        field9867[field9861++] = "";
                        return;
                    }
                    String var263 = class419.field6032[var261][var262].field4914;
                    if (var263 == null) {
                        field9867[field9861++] = "";
                        return;
                    }
                    field9867[field9861++] = var263;
                    return;
                }
                if (arg0 == 6705) {
                    field9865 -= 2;
                    int var264 = field9844[field9865];
                    int var265 = field9844[field9865 + 1];
                    if (class419.field6032[var264] == null) {
                        field9844[field9865++] = 0;
                        return;
                    }
                    field9844[field9865++] = class419.field6032[var264][var265].field4883;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field9865 -= 3;
                    int var266 = field9844[field9865];
                    int var267 = field9844[field9865 + 1];
                    int var268 = field9844[field9865 + 2];
                    class711.method3947(-118, var268, var266 << 16 | var267, "", 1);
                    return;
                }
                if (arg0 == 6708) {
                    field9865 -= 3;
                    int var269 = field9844[field9865];
                    int var270 = field9844[field9865 + 1];
                    int var271 = field9844[field9865 + 2];
                    class711.method3947(-121, var271, var269 << 16 | var270, "", 2);
                    return;
                }
                if (arg0 == 6709) {
                    field9865 -= 3;
                    int var272 = field9844[field9865];
                    int var273 = field9844[field9865 + 1];
                    int var274 = field9844[field9865 + 2];
                    class711.method3947(-114, var274, var272 << 16 | var273, "", 3);
                    return;
                }
                if (arg0 == 6710) {
                    field9865 -= 3;
                    int var275 = field9844[field9865];
                    int var276 = field9844[field9865 + 1];
                    int var277 = field9844[field9865 + 2];
                    class711.method3947(74, var277, var275 << 16 | var276, "", 4);
                    return;
                }
                if (arg0 == 6711) {
                    field9865 -= 3;
                    int var278 = field9844[field9865];
                    int var279 = field9844[field9865 + 1];
                    int var280 = field9844[field9865 + 2];
                    class711.method3947(-113, var280, var278 << 16 | var279, "", 5);
                    return;
                }
                if (arg0 == 6712) {
                    field9865 -= 3;
                    int var281 = field9844[field9865];
                    int var282 = field9844[field9865 + 1];
                    int var283 = field9844[field9865 + 2];
                    class711.method3947(123, var283, var281 << 16 | var282, "", 6);
                    return;
                }
                if (arg0 == 6713) {
                    field9865 -= 3;
                    int var284 = field9844[field9865];
                    int var285 = field9844[field9865 + 1];
                    int var286 = field9844[field9865 + 2];
                    class711.method3947(45, var286, var284 << 16 | var285, "", 7);
                    return;
                }
                if (arg0 == 6714) {
                    field9865 -= 3;
                    int var287 = field9844[field9865];
                    int var288 = field9844[field9865 + 1];
                    int var289 = field9844[field9865 + 2];
                    class711.method3947(-117, var289, var287 << 16 | var288, "", 8);
                    return;
                }
                if (arg0 == 6715) {
                    field9865 -= 3;
                    int var290 = field9844[field9865];
                    int var291 = field9844[field9865 + 1];
                    int var292 = field9844[field9865 + 2];
                    class711.method3947(-122, var292, var290 << 16 | var291, "", 9);
                    return;
                }
                if (arg0 == 6716) {
                    field9865 -= 3;
                    int var293 = field9844[field9865];
                    int var294 = field9844[field9865 + 1];
                    int var295 = field9844[field9865 + 2];
                    class711.method3947(-124, var295, var293 << 16 | var294, "", 10);
                    return;
                }
                if (arg0 == 6717) {
                    field9865 -= 3;
                    int var296 = field9844[field9865];
                    int var297 = field9844[field9865 + 1];
                    int var298 = field9844[field9865 + 2];
                    class347 var299 = class90.method717(var296 << 16 | var297, var298, (byte) -42);
                    class579.method3278(-1);
                    class327 var300 = client.method2055(var299);
                    class485.method2839(var300.field4640, var299, (byte) -47, var300.method2114(-93));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var301 = field9844[--field9865];
                    class349 var302 = class323.field4586.method2074(97, var301);
                    if (var302.field5056 == null) {
                        field9867[field9861++] = "";
                        return;
                    }
                    field9867[field9861++] = var302.field5056;
                    return;
                }
                if (arg0 == 6801) {
                    int var303 = field9844[--field9865];
                    class349 var304 = class323.field4586.method2074(100, var303);
                    field9844[field9865++] = var304.field5077;
                    return;
                }
                if (arg0 == 6802) {
                    int var305 = field9844[--field9865];
                    class349 var306 = class323.field4586.method2074(119, var305);
                    field9844[field9865++] = var306.field5082;
                    return;
                }
                if (arg0 == 6803) {
                    int var307 = field9844[--field9865];
                    class349 var308 = class323.field4586.method2074(91, var307);
                    field9844[field9865++] = var308.field5098;
                    return;
                }
                if (arg0 == 6804) {
                    field9865 -= 2;
                    int var309 = field9844[field9865];
                    int var310 = field9844[field9865 + 1];
                    class560 var311 = class315.field4447.method3515(var310, 0);
                    if (var311.method3196(-104)) {
                        field9867[field9861++] = class323.field4586.method2074(111, var309).method2235((byte) -114, var311.field7683, var310);
                        return;
                    }
                    field9844[field9865++] = class323.field4586.method2074(94, var309).method2233((byte) 30, var310, var311.field7679);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field9844[field9865++] = class564.field7727 && !class405.field5751 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field9844[field9865++] = (int) (class778.field10686 / 60000L);
                    field9844[field9865++] = (int) ((class778.field10686 - class401.method2440(false) - class390.field5643) / 60000L);
                    field9844[field9865++] = class439.field6325 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field9844[field9865++] = class250.field3454;
                    return;
                }
                if (arg0 == 6903) {
                    field9844[field9865++] = class505.field7091;
                    return;
                }
                if (arg0 == 6904) {
                    field9844[field9865++] = class292.field4159;
                    return;
                }
                if (arg0 == 6905) {
                    String var312 = "";
                    if (class529.field7309 != null) {
                        if (class529.field7309.field8403 == null) {
                            var312 = class187.method1258(-114, class529.field7309.field8402);
                        } else {
                            var312 = (String) class529.field7309.field8403;
                        }
                    }
                    field9867[field9861++] = var312;
                    return;
                }
                if (arg0 == 6906) {
                    field9844[field9865++] = class614.field8307;
                    return;
                }
                if (arg0 == 6907) {
                    field9844[field9865++] = class2.field23;
                    return;
                }
                if (arg0 == 6908) {
                    field9844[field9865++] = class689.field9215;
                    return;
                }
                if (arg0 == 6909) {
                    field9844[field9865++] = class408.field5764 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field9844[field9865++] = class754.field10208;
                    return;
                }
                if (arg0 == 6911) {
                    field9844[field9865++] = class92.field1292;
                    return;
                }
                if (arg0 == 6912) {
                    field9844[field9865++] = class409.field5790;
                    return;
                }
                if (arg0 == 6913) {
                    field9844[field9865++] = class148.field1993;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var313 = class72.method589((byte) 39);
                    field9844[field9865++] = class705.field9643 = class125.field1721.field5141.method2541(43);
                    field9844[field9865++] = var313;
                    class452.method2690(11);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class630.method3480(false);
                    class452.method2690(11);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class383.method2379(-2);
                    class452.method2690(11);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class517.method3013((byte) -127);
                    class452.method2690(11);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class37.method212(28974, true);
                    class452.method2690(11);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class125.field1721.method2255(true, 0, class125.field1721.field5137);
                    class515.method3006(-2);
                    class180.field2362 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class705.field9643 == 2) {
                        class311.field4402 = true;
                        return;
                    }
                    if (class705.field9643 == 1) {
                        class81.field1116 = true;
                        return;
                    }
                    if (class705.field9643 == 3) {
                        class468.field6608 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field9844[field9865++] = class125.field1721.field5137.method4239(43);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field9865 -= 2;
                    int var314 = field9844[field9865];
                    int var315 = field9844[field9865 + 1];
                    if (var314 != -1) {
                        if (var315 > 255) {
                            var315 = 255;
                        } else if (var315 < 0) {
                            var315 = 0;
                        }
                        class259.method1757(var314, var315, false, (byte) 82);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var316 = field9844[--field9865];
                    if (var316 != -1) {
                        class384.method2389(0, var316);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var317 = field9844[--field9865];
                    if (var317 != -1) {
                        class158.method1097(var317, (byte) 125);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field9844[field9865++] = class546.method3146("jagtheora", (byte) 30) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field9844[field9865++] = class125.field1721.field5166.method2844((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field9844[field9865++] = class125.field1721.field5134.method2410((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field9844[field9865++] = class125.field1721.field5156.method158((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field9844[field9865++] = class125.field1721.field5188.method2376((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field9844[field9865++] = class125.field1721.field5174.method333((byte) 8) && class375.field5490.method480() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field9844[field9865++] = class125.field1721.field5175.method1394((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field9844[field9865++] = class125.field1721.field5144.method3725((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field9844[field9865++] = class125.field1721.field5164.method604((byte) 8) && class375.field5490.method460() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field9844[field9865++] = class125.field1721.field5147.method3683((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field9844[field9865++] = class125.field1721.field5167.method1440((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field9844[field9865++] = class125.field1721.field5182.method1839((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field9844[field9865++] = class125.field1721.field5171.method3708((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field9844[field9865++] = class125.field1721.field5154.method1214((byte) 8) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field9844[field9865++] = class125.field1721.field5140.method2545((byte) 8) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var318 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5166.method39(var318, (byte) 69);
                    return;
                }
                if (arg0 == 7302) {
                    int var319 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5134.method39(var319, (byte) 69);
                    return;
                }
                if (arg0 == 7303) {
                    int var320 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5156.method39(var320, (byte) 69);
                    return;
                }
                if (arg0 == 7304) {
                    int var321 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5188.method39(var321, (byte) 69);
                    return;
                }
                if (arg0 == 7305) {
                    int var322 = field9844[--field9865];
                    if (!class375.field5490.method480()) {
                        field9844[field9865++] = 3;
                        return;
                    }
                    field9844[field9865++] = class125.field1721.field5174.method39(var322, (byte) 69);
                    return;
                }
                if (arg0 == 7306) {
                    int var323 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5175.method39(var323, (byte) 69);
                    return;
                }
                if (arg0 == 7307) {
                    int var324 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5144.method39(var324, (byte) 69);
                    return;
                }
                if (arg0 == 7308) {
                    int var325 = field9844[--field9865];
                    if (!class375.field5490.method460()) {
                        field9844[field9865++] = 3;
                        return;
                    }
                    field9844[field9865++] = class125.field1721.field5164.method39(var325, (byte) 69);
                    return;
                }
                if (arg0 == 7309) {
                    int var326 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5147.method39(var326, (byte) 69);
                    return;
                }
                if (arg0 == 7310) {
                    int var327 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5167.method39(var327, (byte) 69);
                    return;
                }
                if (arg0 == 7311) {
                    int var328 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5182.method39(var328, (byte) 69);
                    return;
                }
                if (arg0 == 7312) {
                    int var329 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5171.method39(var329, (byte) 69);
                    return;
                }
                if (arg0 == 7313) {
                    int var330 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5154.method39(var330, (byte) 69);
                    return;
                }
                if (arg0 == 7314) {
                    int var331 = field9844[--field9865];
                    field9844[field9865++] = class125.field1721.field5140.method39(var331, (byte) 69);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V", line = 4616)
    private static final void method4016(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field9865 -= 3;
                int var2 = field9844[field9865];
                int var3 = field9844[field9865 + 1];
                int var4 = field9844[field9865 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class347 var5 = class445.method2655(var2, (byte) 119);
                if (var5.field4928 == null) {
                    var5.field4928 = new class347[var4 + 1];
                }
                if (var5.field4928.length <= var4) {
                    class347[] var6 = new class347[var4 + 1];
                    for (int var7 = 0; var7 < var5.field4928.length; var7++) {
                        var6[var7] = var5.field4928[var7];
                    }
                    var5.field4928 = var6;
                }
                if (var4 > 0 && var5.field4928[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class347 var8 = new class347();
                var8.field4884 = var3;
                var8.field4921 = var8.field5003 = var5.field5003;
                var8.field4955 = var4;
                var5.field4928[var4] = var8;
                if (arg1) {
                    field9868 = var8;
                } else {
                    field9853 = var8;
                }
                class151.method1062((byte) -125, var5);
                return;
            }
            if (arg0 == 151) {
                class347 var9 = arg1 ? field9868 : field9853;
                if (var9.field4955 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class347 var10 = class445.method2655(var9.field5003, (byte) 108);
                var10.field4928[var9.field4955] = null;
                class151.method1062((byte) -101, var10);
                return;
            }
            if (arg0 == 152) {
                class347 var11 = class445.method2655(field9844[--field9865], (byte) 113);
                var11.field4928 = null;
                class151.method1062((byte) -125, var11);
                return;
            }
            if (arg0 == 200) {
                field9865 -= 2;
                int var12 = field9844[field9865];
                int var13 = field9844[field9865 + 1];
                class347 var14 = class90.method717(var12, var13, (byte) -42);
                if (var14 != null && var13 != -1) {
                    field9844[field9865++] = 1;
                    if (arg1) {
                        field9868 = var14;
                        return;
                    }
                    field9853 = var14;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field9844[--field9865];
                class347 var16 = class445.method2655(var15, (byte) 123);
                if (var16 != null) {
                    field9844[field9865++] = 1;
                    if (arg1) {
                        field9868 = var16;
                        return;
                    }
                    field9853 = var16;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field9844[--field9865];
                method4018(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field9844[--field9865];
                method4008(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field9865 -= 2;
                int var19 = field9844[field9865];
                int var20 = field9844[field9865 + 1];
                if (class625.field8475.field10355 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class23.field231.length; var21++) {
                    if (class23.field231[var21] == var19) {
                        class625.field8475.field10355.method1320(var21, 13815, var20, class345.field4846);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class703.field9453.length; var22++) {
                    if (class703.field9453[var22] == var19) {
                        class625.field8475.field10355.method1320(var22, 13815, var20, class345.field4846);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field9865 -= 2;
                int var23 = field9844[field9865];
                int var24 = field9844[field9865 + 1];
                if (class625.field8475.field10355 == null) {
                    return;
                }
                class625.field8475.field10355.method1327(var24, var23, -50);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field9844[--field9865] != 0;
                if (class625.field8475.field10355 == null) {
                    return;
                }
                class625.field8475.field10355.method1328(var25, -1177040848);
                return;
            }
            if (arg0 == 411) {
                field9865 -= 2;
                int var26 = field9844[field9865];
                int var27 = field9844[field9865 + 1];
                if (class625.field8475.field10355 == null) {
                    return;
                }
                class625.field8475.field10355.method1329(-1, var27, class16.field156, var26);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class347 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class445.method2655(field9844[--field9865], (byte) 124);
            } else {
                var28 = arg1 ? field9868 : field9853;
            }
            if (arg0 == 1000) {
                field9865 -= 4;
                var28.field5032 = field9844[field9865];
                var28.field5006 = field9844[field9865 + 1];
                int var29 = field9844[field9865 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field9844[field9865 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field4886 = (byte) var29;
                var28.field4950 = (byte) var30;
                class151.method1062((byte) -124, var28);
                class375.method2357(-113, var28);
                if (var28.field4955 == -1) {
                    class193.method1279(var28.field5003, -6746);
                }
                return;
            }
            if (arg0 == 1001) {
                field9865 -= 4;
                var28.field4964 = field9844[field9865];
                var28.field4927 = field9844[field9865 + 1];
                var28.field5024 = 0;
                var28.field4874 = 0;
                int var31 = field9844[field9865 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field9844[field9865 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field4993 = (byte) var31;
                var28.field5019 = (byte) var32;
                class151.method1062((byte) -104, var28);
                class375.method2357(-24, var28);
                if (var28.field4884 == 0) {
                    class104.method799(false, var28, -1);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field9844[--field9865] == 1;
                if (var28.field4951 != var33) {
                    var28.field4951 = var33;
                    class151.method1062((byte) -123, var28);
                }
                if (var28.field4955 == -1) {
                    class360.method2279(var28.field5003, 31173);
                }
                return;
            }
            if (arg0 == 1004) {
                field9865 -= 2;
                var28.field4901 = field9844[field9865];
                var28.field4952 = field9844[field9865 + 1];
                class151.method1062((byte) -103, var28);
                class375.method2357(-35, var28);
                if (var28.field4884 == 0) {
                    class104.method799(false, var28, -1);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field4935 = field9844[--field9865] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class347 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class445.method2655(field9844[--field9865], (byte) 124);
            } else {
                var34 = arg1 ? field9868 : field9853;
            }
            if (arg0 == 1100) {
                field9865 -= 2;
                var34.field5004 = field9844[field9865];
                if (var34.field5004 > var34.field4946 - var34.field4986) {
                    var34.field5004 = var34.field4946 - var34.field4986;
                }
                if (var34.field5004 < 0) {
                    var34.field5004 = 0;
                }
                var34.field4949 = field9844[field9865 + 1];
                if (var34.field4949 > var34.field4978 - var34.field4940) {
                    var34.field4949 = var34.field4978 - var34.field4940;
                }
                if (var34.field4949 < 0) {
                    var34.field4949 = 0;
                }
                class151.method1062((byte) -122, var34);
                if (var34.field4955 == -1) {
                    class82.method654((byte) -71, var34.field5003);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field4944 = field9844[--field9865];
                class151.method1062((byte) -114, var34);
                if (var34.field4955 == -1) {
                    class548.method3153(var34.field5003, -116);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field4885 = field9844[--field9865] == 1;
                class151.method1062((byte) -112, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field4877 = field9844[--field9865];
                class151.method1062((byte) -118, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field5005 = field9844[--field9865];
                class151.method1062((byte) -123, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field9844[--field9865];
                if (var34.field4965 != var35) {
                    var34.field4965 = var35;
                    class151.method1062((byte) -122, var34);
                }
                if (var34.field4955 == -1) {
                    class540.method3127((byte) -94, var34.field5003);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field4942 = field9844[--field9865];
                class151.method1062((byte) -111, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field4919 = field9844[--field9865] == 1;
                class151.method1062((byte) -115, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field4985 = 1;
                var34.field5037 = field9844[--field9865];
                class151.method1062((byte) -102, var34);
                if (var34.field4955 == -1) {
                    class717.method3968(var34.field5003, 103);
                }
                return;
            }
            if (arg0 == 1109) {
                field9865 -= 6;
                var34.field5011 = field9844[field9865];
                var34.field4994 = field9844[field9865 + 1];
                var34.field5001 = field9844[field9865 + 2];
                var34.field5010 = field9844[field9865 + 3];
                var34.field4916 = field9844[field9865 + 4];
                var34.field4888 = field9844[field9865 + 5];
                class151.method1062((byte) -123, var34);
                if (var34.field4955 == -1) {
                    class502.method2936(85, var34.field5003);
                    class365.method2301((byte) 55, var34.field5003);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field9844[--field9865];
                if (var34.field4992 != var36) {
                    var34.field4992 = var36;
                    var34.field4906 = 0;
                    var34.field4984 = 1;
                    var34.field5022 = 0;
                    class317 var37 = var34.field4992 == -1 ? null : class693.field9223.method2388(var34.field4992, 0);
                    if (var37 != null) {
                        class159.method1101(var34.field4906, (byte) -124, var37);
                    }
                    class151.method1062((byte) -101, var34);
                }
                if (var34.field4955 == -1) {
                    class749.method4093((byte) -62, var34.field5003);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field5016 = field9844[--field9865] == 1;
                class151.method1062((byte) -109, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field9867[--field9861];
                if (!var38.equals(var34.field4890)) {
                    var34.field4890 = var38;
                    class151.method1062((byte) -124, var34);
                }
                if (var34.field4955 == -1) {
                    class442.method2639(var34.field5003, (byte) 93);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field4898 = field9844[--field9865];
                class151.method1062((byte) -104, var34);
                if (var34.field4955 == -1) {
                    class211.method1373(16, var34.field5003);
                }
                return;
            }
            if (arg0 == 1114) {
                field9865 -= 3;
                var34.field4966 = field9844[field9865];
                var34.field5035 = field9844[field9865 + 1];
                var34.field4982 = field9844[field9865 + 2];
                class151.method1062((byte) -108, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field4991 = field9844[--field9865] == 1;
                class151.method1062((byte) -119, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field4893 = field9844[--field9865];
                class151.method1062((byte) -118, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field5038 = field9844[--field9865];
                class151.method1062((byte) -109, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field4977 = field9844[--field9865] == 1;
                class151.method1062((byte) -109, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field5044 = field9844[--field9865] == 1;
                class151.method1062((byte) -108, var34);
                return;
            }
            if (arg0 == 1120) {
                field9865 -= 2;
                var34.field4946 = field9844[field9865];
                var34.field4978 = field9844[field9865 + 1];
                class151.method1062((byte) -112, var34);
                if (var34.field4884 == 0) {
                    class104.method799(false, var34, -1);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field5046 = field9844[--field9865] == 1;
                class151.method1062((byte) -114, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field4888 = field9844[--field9865];
                class151.method1062((byte) -103, var34);
                if (var34.field4955 == -1) {
                    class502.method2936(123, var34.field5003);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field9844[--field9865];
                var34.field5026 = var39 == 1;
                class151.method1062((byte) -110, var34);
                return;
            }
            if (arg0 == 1125) {
                field9865 -= 2;
                var34.field5027 = field9844[field9865];
                var34.field4920 = field9844[field9865 + 1];
                class151.method1062((byte) -108, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field4894 = field9844[--field9865];
                class151.method1062((byte) -106, var34);
                return;
            }
            if (arg0 == 1127) {
                field9865 -= 2;
                int var40 = field9844[field9865];
                int var41 = field9844[field9865 + 1];
                class560 var42 = class315.field4447.method3515(var40, 0);
                if (var42.field7679 != var41) {
                    var34.method2211(var40, var41, -95);
                    return;
                }
                var34.method2209(var40, -14464);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field9844[--field9865];
                String var44 = field9867[--field9861];
                class560 var45 = class315.field4447.method3515(var43, 0);
                if (!var45.field7683.equals(var44)) {
                    var34.method2207(-12, var43, var44);
                    return;
                }
                var34.method2209(var43, -14464);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field9844[--field9865];
                if ((var34.field4884 == 5 || arg0 != 1129) && (var34.field4884 == 4 || arg0 != 1130)) {
                    if (var34.field4875 != var52) {
                        var34.field4875 = var52;
                        class151.method1062((byte) -115, var34);
                    }
                    if (var34.field4955 == -1) {
                        class192.method1274(var34.field5003, 1);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field9865 -= 3;
                int var46 = field9844[field9865];
                short var47 = (short) field9844[field9865 + 1];
                short var48 = (short) field9844[field9865 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method2212(var47, var46, var48, (byte) -116);
                    class151.method1062((byte) -102, var34);
                    if (var34.field4955 == -1) {
                        class674.method3720(1, var34.field5003, var46);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field9865 -= 3;
                int var49 = field9844[field9865];
                short var50 = (short) field9844[field9865 + 1];
                short var51 = (short) field9844[field9865 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method2223(var51, var49, var50, false);
                    class151.method1062((byte) -112, var34);
                    if (var34.field4955 == -1) {
                        class27.method157(var49, -1, var34.field5003);
                    }
                    return;
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class347 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class445.method2655(field9844[--field9865], (byte) 119);
            } else {
                var53 = arg1 ? field9868 : field9853;
            }
            class151.method1062((byte) -103, var53);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field9865 -= 2;
                int var54 = field9844[field9865];
                int var55 = field9844[field9865 + 1];
                if (var53.field4955 == -1) {
                    class43.method240(var53.field5003, (byte) -123);
                    class502.method2936(109, var53.field5003);
                    class365.method2301((byte) 70, var53.field5003);
                }
                if (var54 == -1) {
                    var53.field4985 = 1;
                    var53.field5037 = -1;
                    var53.field4956 = -1;
                    return;
                }
                var53.field4956 = var54;
                var53.field5028 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field4938 = true;
                } else {
                    var53.field4938 = false;
                }
                class369 var56 = class16.field156.method2121(var54, 25928);
                var53.field5001 = var56.field5380;
                var53.field5010 = var56.field5334;
                var53.field4916 = var56.field5396;
                var53.field5011 = var56.field5356;
                var53.field4994 = var56.field5393;
                var53.field4888 = var56.field5385;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field5014 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field5014 = 1;
                } else {
                    var53.field5014 = 2;
                }
                if (var53.field5024 > 0) {
                    var53.field4888 = var53.field4888 * 32 / var53.field5024;
                    return;
                }
                if (var53.field4964 > 0) {
                    var53.field4888 = var53.field4888 * 32 / var53.field4964;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field4985 = 2;
                var53.field5037 = field9844[--field9865];
                if (var53.field4955 == -1) {
                    class717.method3968(var53.field5003, 116);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field4985 = 3;
                var53.field5037 = -1;
                if (var53.field4955 == -1) {
                    class717.method3968(var53.field5003, 99);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field4985 = 6;
                var53.field5037 = field9844[--field9865];
                if (var53.field4955 == -1) {
                    class717.method3968(var53.field5003, -73);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field4985 = 5;
                var53.field5037 = field9844[--field9865];
                if (var53.field4955 == -1) {
                    class717.method3968(var53.field5003, -119);
                }
                return;
            }
            if (arg0 == 1206) {
                field9865 -= 4;
                var53.field4873 = field9844[field9865];
                var53.field5013 = field9844[field9865 + 1];
                var53.field5023 = field9844[field9865 + 2];
                var53.field4933 = field9844[field9865 + 3];
                class151.method1062((byte) -109, var53);
                return;
            }
            if (arg0 == 1207) {
                field9865 -= 2;
                var53.field4972 = field9844[field9865];
                var53.field4936 = field9844[field9865 + 1];
                class151.method1062((byte) -127, var53);
                return;
            }
            if (arg0 == 1210) {
                field9865 -= 4;
                var53.field5037 = field9844[field9865];
                var53.field4925 = field9844[field9865 + 1];
                if (field9844[field9865 + 2] == 1) {
                    var53.field4985 = 9;
                } else {
                    var53.field4985 = 8;
                }
                if (field9844[field9865 + 3] == 1) {
                    var53.field4938 = true;
                } else {
                    var53.field4938 = false;
                }
                if (var53.field4955 == -1) {
                    class717.method3968(var53.field5003, -55);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field4985 = 5;
                var53.field5037 = class349.field5065;
                var53.field4925 = 0;
                if (var53.field4955 == -1) {
                    class717.method3968(var53.field5003, 102);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class347 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class445.method2655(field9844[--field9865], (byte) 122);
            } else {
                var57 = arg1 ? field9868 : field9853;
            }
            if (arg0 == 1300) {
                int var58 = field9844[--field9865] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method2215(var58, -1, field9867[--field9861]);
                    return;
                }
                field9861--;
                return;
            }
            if (arg0 == 1301) {
                field9865 -= 2;
                int var59 = field9844[field9865];
                int var60 = field9844[field9865 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field4954 = null;
                    return;
                }
                var57.field4954 = class90.method717(var59, var60, (byte) -42);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field9844[--field9865];
                if (class342.field4801 != var61 && class773.field10633 != var61 && class414.field5966 != var61) {
                    return;
                }
                var57.field4959 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field5002 = field9844[--field9865];
                return;
            }
            if (arg0 == 1304) {
                var57.field4903 = field9844[--field9865];
                return;
            }
            if (arg0 == 1305) {
                var57.field5036 = field9867[--field9861];
                return;
            }
            if (arg0 == 1306) {
                var57.field5012 = field9867[--field9861];
                return;
            }
            if (arg0 == 1307) {
                var57.field4983 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field4999 = field9844[--field9865];
                var57.field4958 = field9844[--field9865];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field9844[--field9865];
                int var63 = field9844[--field9865];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method2221(var63 - 1, (byte) 67, var62);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field4990 = field9867[--field9861];
                return;
            }
            if (arg0 == 1311) {
                var57.field4902 = field9844[--field9865];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field9865 -= 3;
                    var64 = field9844[field9865] - 1;
                    var65 = field9844[field9865 + 1];
                    var66 = field9844[field9865 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field9865 -= 2;
                    var64 = 10;
                    var65 = field9844[field9865];
                    var66 = field9844[field9865 + 1];
                }
                if (var57.field5021 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field5021 = new byte[11];
                    var57.field4904 = new byte[11];
                    var57.field4918 = new int[11];
                }
                var57.field5021[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field5047 = false;
                    for (int var67 = 0; var67 < var57.field5021.length; var67++) {
                        if (var57.field5021[var67] != 0) {
                            var57.field5047 = true;
                            break;
                        }
                    }
                } else {
                    var57.field5047 = true;
                }
                var57.field4904[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field4947 = field9844[--field9865];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class347 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class445.method2655(field9844[--field9865], (byte) 122);
            } else {
                var68 = arg1 ? field9868 : field9853;
            }
            if (arg0 == 1499) {
                var68.method2210((byte) -87);
                return;
            }
            String var69 = field9867[--field9861];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field9844[--field9865];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field9844[--field9865];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field9867[--field9861];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field9859[--field9851]);
                } else {
                    var72[var73] = Integer.valueOf(field9844[--field9865]);
                }
            }
            int var74 = field9844[--field9865];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field4996 = var72;
            } else if (arg0 == 1401) {
                var68.field4881 = var72;
            } else if (arg0 == 1402) {
                var68.field4880 = var72;
            } else if (arg0 == 1403) {
                var68.field5017 = var72;
            } else if (arg0 == 1404) {
                var68.field5041 = var72;
            } else if (arg0 == 1405) {
                var68.field4930 = var72;
            } else if (arg0 == 1406) {
                var68.field5025 = var72;
            } else if (arg0 == 1407) {
                var68.field5020 = var72;
                var68.field4929 = var70;
            } else if (arg0 == 1408) {
                var68.field5018 = var72;
            } else if (arg0 == 1409) {
                var68.field4941 = var72;
            } else if (arg0 == 1410) {
                var68.field5009 = var72;
            } else if (arg0 == 1411) {
                var68.field4889 = var72;
            } else if (arg0 == 1412) {
                var68.field4891 = var72;
            } else if (arg0 == 1414) {
                var68.field4967 = var72;
                var68.field5039 = var70;
            } else if (arg0 == 1415) {
                var68.field4998 = var72;
                var68.field5042 = var70;
            } else if (arg0 == 1416) {
                var68.field4913 = var72;
            } else if (arg0 == 1417) {
                var68.field4907 = var72;
            } else if (arg0 == 1418) {
                var68.field4943 = var72;
            } else if (arg0 == 1419) {
                var68.field4953 = var72;
            } else if (arg0 == 1420) {
                var68.field4923 = var72;
            } else if (arg0 == 1421) {
                var68.field5033 = var72;
            } else if (arg0 == 1422) {
                var68.field5007 = var72;
            } else if (arg0 == 1423) {
                var68.field4895 = var72;
            } else if (arg0 == 1424) {
                var68.field4974 = var72;
            } else if (arg0 == 1425) {
                var68.field4908 = var72;
            } else if (arg0 == 1426) {
                var68.field5034 = var72;
            } else if (arg0 == 1427) {
                var68.field4879 = var72;
            } else if (arg0 == 1428) {
                var68.field4945 = var72;
                var68.field4911 = var70;
            } else if (arg0 == 1429) {
                var68.field4948 = var72;
                var68.field4968 = var70;
            } else if (arg0 == 1430) {
                var68.field4976 = var72;
            } else if (arg0 == 1431) {
                var68.field4878 = var72;
            } else if (arg0 == 1432) {
                var68.field4980 = var72;
            }
            var68.field4960 = true;
            return;
        } else if (arg0 < 1600) {
            class347 var75 = arg1 ? field9868 : field9853;
            if (arg0 == 1500) {
                field9844[field9865++] = var75.field4934;
                return;
            }
            if (arg0 == 1501) {
                field9844[field9865++] = var75.field4887;
                return;
            }
            if (arg0 == 1502) {
                field9844[field9865++] = var75.field4986;
                return;
            }
            if (arg0 == 1503) {
                field9844[field9865++] = var75.field4940;
                return;
            }
            if (arg0 == 1504) {
                field9844[field9865++] = var75.field4951 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field9844[field9865++] = var75.field4921;
                return;
            }
            if (arg0 == 1506) {
                class347 var76 = class171.method1151(var75, (byte) -57);
                field9844[field9865++] = var76 == null ? -1 : var76.field5003;
                return;
            }
        } else if (arg0 < 1700) {
            class347 var77 = arg1 ? field9868 : field9853;
            if (arg0 == 1600) {
                field9844[field9865++] = var77.field5004;
                return;
            }
            if (arg0 == 1601) {
                field9844[field9865++] = var77.field4949;
                return;
            }
            if (arg0 == 1602) {
                field9867[field9861++] = var77.field4890;
                return;
            }
            if (arg0 == 1603) {
                field9844[field9865++] = var77.field4946;
                return;
            }
            if (arg0 == 1604) {
                field9844[field9865++] = var77.field4978;
                return;
            }
            if (arg0 == 1605) {
                field9844[field9865++] = var77.field4888;
                return;
            }
            if (arg0 == 1606) {
                field9844[field9865++] = var77.field5001;
                return;
            }
            if (arg0 == 1607) {
                field9844[field9865++] = var77.field4916;
                return;
            }
            if (arg0 == 1608) {
                field9844[field9865++] = var77.field5010;
                return;
            }
            if (arg0 == 1609) {
                field9844[field9865++] = var77.field4877;
                return;
            }
            if (arg0 == 1610) {
                field9844[field9865++] = var77.field5011;
                return;
            }
            if (arg0 == 1611) {
                field9844[field9865++] = var77.field4994;
                return;
            }
            if (arg0 == 1612) {
                field9844[field9865++] = var77.field4965;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field9844[--field9865];
                class560 var79 = class315.field4447.method3515(var78, 0);
                if (var79.method3196(-117)) {
                    field9867[field9861++] = var77.method2222(var79.field7683, var78, false);
                    return;
                }
                field9844[field9865++] = var77.method2226(true, var79.field7679, var78);
                return;
            }
            if (arg0 == 1614) {
                field9844[field9865++] = var77.field4942;
                return;
            }
            if (arg0 == 2614) {
                field9844[field9865++] = var77.field4985 == 1 ? var77.field5037 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class347 var80 = arg1 ? field9868 : field9853;
            if (arg0 == 1700) {
                field9844[field9865++] = var80.field4956;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field4956 != -1) {
                    field9844[field9865++] = var80.field5028;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field9844[field9865++] = var80.field4955;
                return;
            }
        } else if (arg0 < 1900) {
            class347 var81 = arg1 ? field9868 : field9853;
            if (arg0 == 1800) {
                field9844[field9865++] = client.method2055(var81).method2114(-111);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field9844[--field9865];
                int var383 = var82 - 1;
                if (var81.field4983 != null && var383 < var81.field4983.length && var81.field4983[var383] != null) {
                    field9867[field9861++] = var81.field4983[var383];
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field5036 == null) {
                    field9867[field9861++] = "";
                    return;
                }
                field9867[field9861++] = var81.field5036;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class347 var381;
            if (arg0 >= 2000) {
                var381 = class445.method2655(field9844[--field9865], (byte) 111);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field9868 : field9853;
            }
            if (field9869 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field4879 == null) {
                    return;
                }
                class158 var382 = new class158();
                var382.field2137 = var381;
                var382.field2128 = var381.field4879;
                var382.field2134 = field9869 + 1;
                class780.field10708.method689(var382, -106);
                return;
            }
        } else if (arg0 < 2600) {
            class347 var83 = class445.method2655(field9844[--field9865], (byte) 110);
            if (arg0 == 2500) {
                field9844[field9865++] = var83.field4934;
                return;
            }
            if (arg0 == 2501) {
                field9844[field9865++] = var83.field4887;
                return;
            }
            if (arg0 == 2502) {
                field9844[field9865++] = var83.field4986;
                return;
            }
            if (arg0 == 2503) {
                field9844[field9865++] = var83.field4940;
                return;
            }
            if (arg0 == 2504) {
                field9844[field9865++] = var83.field4951 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field9844[field9865++] = var83.field4921;
                return;
            }
            if (arg0 == 1506) {
                class347 var84 = class171.method1151(var83, (byte) -72);
                field9844[field9865++] = var84 == null ? -1 : var84.field5003;
                return;
            }
        } else if (arg0 < 2700) {
            class347 var85 = class445.method2655(field9844[--field9865], (byte) 110);
            if (arg0 == 2600) {
                field9844[field9865++] = var85.field5004;
                return;
            }
            if (arg0 == 2601) {
                field9844[field9865++] = var85.field4949;
                return;
            }
            if (arg0 == 2602) {
                field9867[field9861++] = var85.field4890;
                return;
            }
            if (arg0 == 2603) {
                field9844[field9865++] = var85.field4946;
                return;
            }
            if (arg0 == 2604) {
                field9844[field9865++] = var85.field4978;
                return;
            }
            if (arg0 == 2605) {
                field9844[field9865++] = var85.field4888;
                return;
            }
            if (arg0 == 2606) {
                field9844[field9865++] = var85.field5001;
                return;
            }
            if (arg0 == 2607) {
                field9844[field9865++] = var85.field4916;
                return;
            }
            if (arg0 == 2608) {
                field9844[field9865++] = var85.field5010;
                return;
            }
            if (arg0 == 2609) {
                field9844[field9865++] = var85.field4877;
                return;
            }
            if (arg0 == 2610) {
                field9844[field9865++] = var85.field5011;
                return;
            }
            if (arg0 == 2611) {
                field9844[field9865++] = var85.field4994;
                return;
            }
            if (arg0 == 2612) {
                field9844[field9865++] = var85.field4965;
                return;
            }
            if (arg0 == 2613) {
                field9844[field9865++] = var85.field4942;
                return;
            }
            if (arg0 == 2614) {
                field9844[field9865++] = var85.field4985 == 1 ? var85.field5037 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class347 var86 = class445.method2655(field9844[--field9865], (byte) 110);
                field9844[field9865++] = var86.field4956;
                return;
            }
            if (arg0 == 2701) {
                class347 var87 = class445.method2655(field9844[--field9865], (byte) 109);
                if (var87.field4956 != -1) {
                    field9844[field9865++] = var87.field5028;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field9844[--field9865];
                class73 var89 = (class73) class355.field5178.method1248(115, (long) var88);
                if (var89 != null) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class347 var90 = class445.method2655(field9844[--field9865], (byte) 112);
                if (var90.field4928 == null) {
                    field9844[field9865++] = 0;
                    return;
                }
                int var91 = var90.field4928.length;
                for (int var92 = 0; var92 < var90.field4928.length; var92++) {
                    if (var90.field4928[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field9844[field9865++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field9865 -= 2;
                int var93 = field9844[field9865];
                int var94 = field9844[field9865 + 1];
                class73 var95 = (class73) class355.field5178.method1248(103, (long) var93);
                if (var95 != null && var95.field985 == var94) {
                    field9844[field9865++] = 1;
                    return;
                } else {
                    field9844[field9865++] = 0;
                    return;
                }
            }
        } else if (arg0 < 2900) {
            class347 var96 = class445.method2655(field9844[--field9865], (byte) 124);
            if (arg0 == 2800) {
                field9844[field9865++] = client.method2055(var96).method2114(-102);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field9844[--field9865];
                int var384 = var97 - 1;
                if (var96.field4983 != null && var384 < var96.field4983.length && var96.field4983[var384] != null) {
                    field9867[field9861++] = var96.field4983[var384];
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field5036 == null) {
                    field9867[field9861++] = "";
                    return;
                }
                field9867[field9861++] = var96.field5036;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field9867[--field9861];
                class540.method3128((byte) 110, var98);
                return;
            }
            if (arg0 == 3101) {
                field9865 -= 2;
                class772.method4246(field9844[field9865], -15715, field9844[field9865 + 1], class625.field8475);
                return;
            }
            if (arg0 == 3103) {
                class181.method1232(true, (byte) 95);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field9867[--field9861];
                int var100 = 0;
                if (class398.method2429((byte) 37, var99)) {
                    var100 = class469.method2750((byte) 113, var99);
                }
                field9846++;
                class43 var101 = class492.method2903(class197.field2552, 0, class73.field983);
                var101.field457.method1686(124, var100);
                class409.method2457((byte) -100, var101);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field9867[--field9861];
                field9843++;
                class43 var103 = class492.method2903(class56.field654, 0, class73.field983);
                var103.field457.method1725(var102.length() + 1, 83);
                var103.field457.method1678(var102, (byte) 126);
                class409.method2457((byte) -100, var103);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field9867[--field9861];
                field9838++;
                class43 var105 = class492.method2903(class217.field2835, 0, class73.field983);
                var105.field457.method1725(var104.length() + 1, 22);
                var105.field457.method1678(var104, (byte) 112);
                class409.method2457((byte) -100, var105);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field9844[--field9865];
                String var107 = field9867[--field9861];
                class238.method1504(var107, var106, 9);
                return;
            }
            if (arg0 == 3108) {
                field9865 -= 3;
                int var108 = field9844[field9865];
                int var109 = field9844[field9865 + 1];
                int var110 = field9844[field9865 + 2];
                class347 var111 = class445.method2655(var110, (byte) 112);
                class657.method3652(-8674, var108, var109, var111);
                return;
            }
            if (arg0 == 3109) {
                field9865 -= 2;
                int var112 = field9844[field9865];
                int var113 = field9844[field9865 + 1];
                class347 var114 = arg1 ? field9868 : field9853;
                class657.method3652(-8674, var112, var113, var114);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field9844[--field9865];
                field9858++;
                class43 var116 = class492.method2903(class391.field5648, 0, class73.field983);
                var116.field457.method1733(var115, -32466);
                class409.method2457((byte) -100, var116);
                return;
            }
            if (arg0 == 3111) {
                field9865 -= 2;
                int var117 = field9844[field9865];
                int var118 = field9844[field9865 + 1];
                class73 var119 = (class73) class355.field5178.method1248(101, (long) var117);
                if (var119 != null) {
                    class314.method2010(var119, var119.field985 != var118, -124, true);
                }
                class371.method2330(var118, -107, 3, var117, true);
                return;
            }
            if (arg0 == 3112) {
                field9865--;
                int var120 = field9844[field9865];
                class73 var121 = (class73) class355.field5178.method1248(89, (long) var120);
                if (var121 != null && var121.field993 == 3) {
                    class314.method2010(var121, true, -97, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class379.method2366((byte) 11, field9867[--field9861]);
                return;
            }
            if (arg0 == 3114) {
                field9865 -= 2;
                int var122 = field9844[field9865];
                int var123 = field9844[field9865 + 1];
                String var124 = field9867[--field9861];
                class26.method148(var123, var124, -121, "", var122, "", "");
                return;
            }
            if (arg0 == 3115) {
                field9865 -= 11;
                class673[] var125 = class746.method4088((byte) 125);
                class705[] var126 = class717.method3966((byte) 27);
                class142.method989(field9844[field9865 + 8], field9844[field9865 + 7], field9844[field9865 + 4], field9844[field9865 + 2], field9844[field9865 + 5], var126[field9844[field9865 + 1]], field9844[field9865 + 3], field9844[field9865 + 6], field9844[field9865 + 9], -23247, field9844[field9865 + 10], var125[field9844[field9865]]);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field9844[--field9865];
                field9846++;
                class43 var128 = class492.method2903(class355.field5139, 0, class73.field983);
                var128.field457.method1733(var127, -32466);
                class409.method2457((byte) -100, var128);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field9867[--field9861];
                class43 var130 = class492.method2903(class694.field9227, 0, class73.field983);
                var130.field457.method1725(var129.length() + 1, 84);
                var130.field457.method1678(var129, (byte) 102);
                class409.method2457((byte) -100, var130);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field9865 -= 3;
                class449.method2673(field9844[field9865], field9844[field9865 + 2], 255, 256, 2003865932, field9844[field9865 + 1]);
                return;
            }
            if (arg0 == 3201) {
                class468.method2744(50, -6522, 255, field9844[--field9865]);
                return;
            }
            if (arg0 == 3202) {
                field9865 -= 2;
                class564.method3212(255, 110, field9844[field9865], field9844[field9865 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field9865 -= 4;
                class449.method2673(field9844[field9865], field9844[field9865 + 2], field9844[field9865 + 3], 256, 2003865932, field9844[field9865 + 1]);
                return;
            }
            if (arg0 == 3204) {
                field9865 -= 3;
                class468.method2744(field9844[field9865 + 2], -6522, field9844[field9865 + 1], field9844[field9865]);
                return;
            }
            if (arg0 == 3205) {
                field9865 -= 3;
                class564.method3212(field9844[field9865 + 2], -88, field9844[field9865], field9844[field9865 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field9865 -= 4;
                class416.method2509(256, field9844[field9865 + 1], field9844[field9865], field9844[field9865 + 3], false, field9844[field9865 + 2], true);
                return;
            }
            if (arg0 == 3207) {
                field9865 -= 4;
                class416.method2509(256, field9844[field9865 + 1], field9844[field9865], field9844[field9865 + 3], true, field9844[field9865 + 2], true);
                return;
            }
            if (arg0 == 3208) {
                field9865 -= 5;
                class449.method2673(field9844[field9865], field9844[field9865 + 2], field9844[field9865 + 3], field9844[field9865 + 4], 2003865932, field9844[field9865 + 1]);
                return;
            }
            if (arg0 == 3209) {
                field9865 -= 5;
                class416.method2509(field9844[field9865 + 4], field9844[field9865 + 1], field9844[field9865], field9844[field9865 + 3], false, field9844[field9865 + 2], true);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field9844[field9865++] = class572.field7788;
                return;
            }
            if (arg0 == 3301) {
                field9865 -= 2;
                int var131 = field9844[field9865];
                int var132 = field9844[field9865 + 1];
                field9844[field9865++] = class666.method3670(var132, var131, false, false);
                return;
            }
            if (arg0 == 3302) {
                field9865 -= 2;
                int var133 = field9844[field9865];
                int var134 = field9844[field9865 + 1];
                field9844[field9865++] = class55.method336(false, var134, -24226, var133);
                return;
            }
            if (arg0 == 3303) {
                field9865 -= 2;
                int var135 = field9844[field9865];
                int var136 = field9844[field9865 + 1];
                field9844[field9865++] = class371.method2333(-118, var135, false, var136);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field9844[--field9865];
                field9844[field9865++] = class464.field6586.method3031(var137, 0).field6590;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field9844[--field9865];
                field9844[field9865++] = class610.field8247[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field9844[--field9865];
                field9844[field9865++] = class408.field5787[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field9844[--field9865];
                field9844[field9865++] = class605.field8204[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class625.field8475.field2813;
                int var142 = (class625.field8475.field2802 >> 9) + class120.field1625;
                int var143 = (class625.field8475.field2810 >> 9) + class259.field3849;
                field9844[field9865++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field9844[--field9865];
                field9844[field9865++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field9844[--field9865];
                field9844[field9865++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field9844[--field9865];
                field9844[field9865++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field9844[field9865++] = class86.field1212 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field9865 -= 2;
                int var147 = field9844[field9865];
                int var148 = field9844[field9865 + 1];
                field9844[field9865++] = class666.method3670(var148, var147, false, true);
                return;
            }
            if (arg0 == 3314) {
                field9865 -= 2;
                int var149 = field9844[field9865];
                int var150 = field9844[field9865 + 1];
                field9844[field9865++] = class55.method336(true, var150, -24226, var149);
                return;
            }
            if (arg0 == 3315) {
                field9865 -= 2;
                int var151 = field9844[field9865];
                int var152 = field9844[field9865 + 1];
                field9844[field9865++] = class371.method2333(-105, var151, true, var152);
                return;
            }
            if (arg0 == 3316) {
                if (class479.field6726 >= 2) {
                    field9844[field9865++] = class479.field6726;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field9844[field9865++] = class73.field989;
                return;
            }
            if (arg0 == 3318) {
                field9844[field9865++] = class102.field1464.field9099;
                return;
            }
            if (arg0 == 3321) {
                field9844[field9865++] = class701.field9288;
                return;
            }
            if (arg0 == 3322) {
                field9844[field9865++] = class247.field3227;
                return;
            }
            if (arg0 == 3323) {
                if (class787.field10804 >= 5 && class787.field10804 <= 9) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class787.field10804 >= 5 && class787.field10804 <= 9) {
                    field9844[field9865++] = class787.field10804;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field9844[field9865++] = class254.field3755 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field9844[field9865++] = class625.field8475.field10358;
                return;
            }
            if (arg0 == 3327) {
                field9844[field9865++] = class625.field8475.field10355 != null && class625.field8475.field10355.field2607 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field9844[field9865++] = class704.field9640 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field9844[--field9865];
                field9844[field9865++] = class100.method784(false, 0, var153);
                return;
            }
            if (arg0 == 3331) {
                field9865 -= 2;
                int var154 = field9844[field9865];
                int var155 = field9844[field9865 + 1];
                field9844[field9865++] = class673.method3713(var154, var155, 0, false, false);
                return;
            }
            if (arg0 == 3332) {
                field9865 -= 2;
                int var156 = field9844[field9865];
                int var157 = field9844[field9865 + 1];
                field9844[field9865++] = class673.method3713(var156, var157, 0, true, false);
                return;
            }
            if (arg0 == 3333) {
                field9844[field9865++] = class340.field4758;
                return;
            }
            if (arg0 == 3335) {
                field9844[field9865++] = class55.field647;
                return;
            }
            if (arg0 == 3336) {
                field9865 -= 4;
                int var158 = field9844[field9865];
                int var159 = field9844[field9865 + 1];
                int var160 = field9844[field9865 + 2];
                int var161 = field9844[field9865 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field9844[field9865++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field9844[field9865++] = class416.field6007;
                return;
            }
            if (arg0 == 3338) {
                field9844[field9865++] = class127.method897(113);
                return;
            }
            if (arg0 == 3339) {
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field9844[field9865++] = class95.field1347 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field9844[field9865++] = class744.field10061 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field9844[field9865++] = class494.field6961.method1652(0);
                return;
            }
            if (arg0 == 3343) {
                field9844[field9865++] = class494.field6961.method1663((byte) 115);
                return;
            }
            if (arg0 == 3344) {
                field9867[field9861++] = class26.method154(110);
                return;
            }
            if (arg0 == 3345) {
                field9867[field9861++] = class131.method928(1);
                return;
            }
            if (arg0 == 3346) {
                field9844[field9865++] = class151.method1059(23540);
                return;
            }
            if (arg0 == 3347) {
                field9844[field9865++] = class719.field9785;
                return;
            }
            if (arg0 == 3349) {
                field9844[field9865++] = class625.field8475.field6109.method958((byte) -30) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field9865 -= 2;
                int var165 = field9844[field9865];
                int var166 = field9844[field9865 + 1];
                class385 var167 = class22.field213.method2583(124, var165);
                field9867[field9861++] = var167.method2396(var166, 27180);
                return;
            }
            if (arg0 == 3408) {
                field9865 -= 4;
                int var168 = field9844[field9865];
                int var169 = field9844[field9865 + 1];
                int var170 = field9844[field9865 + 2];
                int var171 = field9844[field9865 + 3];
                class385 var172 = class22.field213.method2583(124, var170);
                if (var172.field5595 == var168 && var172.field5587 == var169) {
                    if (var169 == 115) {
                        field9867[field9861++] = var172.method2396(var171, 27180);
                        return;
                    }
                    field9844[field9865++] = var172.method2393(var171, -117);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field9865 -= 3;
                int var173 = field9844[field9865];
                int var174 = field9844[field9865 + 1];
                int var175 = field9844[field9865 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class385 var176 = class22.field213.method2583(124, var174);
                if (var176.field5587 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field9844[field9865++] = var176.method2395(var175, -17150) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field9844[--field9865];
                String var178 = field9867[--field9861];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class385 var179 = class22.field213.method2583(127, var177);
                if (var179.field5587 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field9844[field9865++] = var179.method2394(-952056665, var178) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field9844[--field9865];
                class385 var181 = class22.field213.method2583(123, var180);
                field9844[field9865++] = var181.field5593.method1245((byte) 125);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class26.field261 == 0) {
                    field9844[field9865++] = -2;
                    return;
                }
                if (class26.field261 == 1) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = class525.field7289;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field9844[--field9865];
                if (class26.field261 == 2 && var182 < class525.field7289) {
                    field9867[field9861++] = class316.field4458[var182];
                    if (class758.field10398[var182] != null) {
                        field9867[field9861++] = class758.field10398[var182];
                        return;
                    }
                    field9867[field9861++] = "";
                    return;
                }
                field9867[field9861++] = "";
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field9844[--field9865];
                if (class26.field261 == 2 && var183 < class525.field7289) {
                    field9844[field9865++] = class565.field7737[var183];
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field9844[--field9865];
                if (class26.field261 == 2 && var184 < class525.field7289) {
                    field9844[field9865++] = class235.field3133[var184];
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field9867[--field9861];
                int var186 = field9844[--field9865];
                class685.method3752(var185, var186, -123);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field9867[--field9861];
                class450.method2675(var187, (byte) -103);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field9867[--field9861];
                class425.method2570(var188, (byte) 92);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field9867[--field9861];
                class411.method2467(false, var189, 22014);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field9867[--field9861];
                class420.method2526(-111, var190);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field9867[--field9861];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field9844[field9865++] = class91.method719(-45, var191) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field9844[--field9865];
                if (class26.field261 == 2 && var192 < class525.field7289) {
                    field9867[field9861++] = class246.field3216[var192];
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class86.field1213 != null) {
                    field9867[field9861++] = class389.method2408(13, class86.field1213);
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class86.field1213 != null) {
                    field9844[field9865++] = class199.field2588;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field9844[--field9865];
                if (class86.field1213 != null && var193 < class199.field2588) {
                    field9867[field9861++] = class245.field3209[var193].field1710;
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field9844[--field9865];
                if (class86.field1213 != null && var194 < class199.field2588) {
                    field9844[field9865++] = class245.field3209[var194].field1714;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field9844[--field9865];
                if (class86.field1213 != null && var195 < class199.field2588) {
                    field9844[field9865++] = class245.field3209[var195].field1718;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field9844[field9865++] = class87.field1223;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field9867[--field9861];
                class587.method3298(var196, (byte) 126);
                return;
            }
            if (arg0 == 3618) {
                field9844[field9865++] = class568.field7755;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field9867[--field9861];
                class611.method3400(var197, 4060);
                return;
            }
            if (arg0 == 3620) {
                class502.method2935(-13662);
                return;
            }
            if (arg0 == 3621) {
                if (class26.field261 == 0) {
                    field9844[field9865++] = -1;
                    return;
                }
                field9844[field9865++] = class664.field8915;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field9844[--field9865];
                if (class26.field261 != 0 && var198 < class664.field8915) {
                    field9867[field9861++] = class98.field1438[var198];
                    if (class194.field2533[var198] != null) {
                        field9867[field9861++] = class194.field2533[var198];
                        return;
                    }
                    field9867[field9861++] = "";
                    return;
                }
                field9867[field9861++] = "";
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field9867[--field9861];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field9844[field9865++] = client.method2049(var199, false) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field9844[--field9865];
                if (class245.field3209 != null && var200 < class199.field2588 && class245.field3209[var200].field1713.equalsIgnoreCase(class625.field8475.field10367)) {
                    field9844[field9865++] = 1;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class320.field4543 != null) {
                    field9867[field9861++] = class320.field4543;
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field9844[--field9865];
                if (class86.field1213 != null && var201 < class199.field2588) {
                    field9867[field9861++] = class245.field3209[var201].field1709;
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field9844[--field9865];
                if (class26.field261 == 2 && var202 >= 0 && var202 < class525.field7289) {
                    field9844[field9865++] = class666.field8921[var202] ? 1 : 0;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field9867[--field9861];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field9844[field9865++] = class39.method227(var203, 1);
                return;
            }
            if (arg0 == 3629) {
                field9844[field9865++] = class281.field4059;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field9867[--field9861];
                class411.method2467(true, var204, 22014);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field9844[--field9865];
                field9844[field9865++] = class100.field1456[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field9844[--field9865];
                if (class86.field1213 != null && var206 < class199.field2588) {
                    field9867[field9861++] = class245.field3209[var206].field1713;
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field9844[--field9865];
                if (class26.field261 != 0 && var207 < class664.field8915) {
                    field9867[field9861++] = class560.field7682[var207];
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class551.field7606 != null) {
                    field9844[field9865++] = 1;
                    field9841 = class551.field7606;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class43.field463 != null) {
                    field9844[field9865++] = 1;
                    field9841 = class43.field463;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field9867[field9861++] = field9841.field1350;
                return;
            }
            if (arg0 == 3703) {
                field9844[field9865++] = field9841.field1348 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field9844[field9865++] = field9841.field1344;
                return;
            }
            if (arg0 == 3705) {
                field9844[field9865++] = field9841.field1322;
                return;
            }
            if (arg0 == 3706) {
                field9844[field9865++] = field9841.field1334;
                return;
            }
            if (arg0 == 3707) {
                field9844[field9865++] = field9841.field1340;
                return;
            }
            if (arg0 == 3709) {
                field9844[field9865++] = field9841.field1338;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field9844[--field9865];
                field9867[field9861++] = field9841.field1351[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field9844[--field9865];
                field9844[field9865++] = field9841.field1364[var209];
                return;
            }
            if (arg0 == 3712) {
                field9844[field9865++] = field9841.field1359;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field9844[--field9865];
                field9867[field9861++] = field9841.field1332[var210];
                return;
            }
            if (arg0 == 3714) {
                field9865 -= 3;
                int var211 = field9844[field9865];
                int var212 = field9844[field9865 + 1];
                int var213 = field9844[field9865 + 2];
                field9844[field9865++] = field9841.method741(var213, var212, false, var211);
                return;
            }
            if (arg0 == 3715) {
                field9844[field9865++] = field9841.field1365;
                return;
            }
            if (arg0 == 3716) {
                field9844[field9865++] = field9841.field1363;
                return;
            }
            if (arg0 == 3717) {
                field9844[field9865++] = field9841.method747(-2807, field9867[--field9861]);
                return;
            }
            if (arg0 == 3718) {
                field9844[field9865 - 1] = field9841.method743(false)[field9844[field9865 - 1]];
                return;
            }
            if (arg0 == 3750) {
                if (class182.field2393 != null) {
                    field9844[field9865++] = 1;
                    field9856 = class182.field2393;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class747.field10081 != null) {
                    field9844[field9865++] = 1;
                    field9856 = class747.field10081;
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field9867[field9861++] = field9856.field7604;
                return;
            }
            if (arg0 == 3753) {
                field9844[field9865++] = field9856.field7615;
                return;
            }
            if (arg0 == 3754) {
                field9844[field9865++] = field9856.field7610;
                return;
            }
            if (arg0 == 3755) {
                field9844[field9865++] = field9856.field7599;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field9844[--field9865];
                field9867[field9861++] = field9856.field7598[var214].field1206;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field9844[--field9865];
                field9844[field9865++] = field9856.field7598[var215].field1209;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field9844[--field9865];
                field9844[field9865++] = field9856.field7598[var216].field1210;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field9844[--field9865];
                class496.method2913(var217, class747.field10081 == field9856, false);
                return;
            }
            if (arg0 == 3760) {
                field9844[field9865++] = field9856.method3167(field9867[--field9861], (byte) -19);
                return;
            }
            if (arg0 == 3761) {
                field9844[field9865 - 1] = field9856.method3168(86)[field9844[field9865 - 1]];
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field9844[--field9865];
                field9844[field9865++] = class652.field8790[var218].method3001(0);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field9844[--field9865];
                field9844[field9865++] = class652.field8790[var219].field7150;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field9844[--field9865];
                field9844[field9865++] = class652.field8790[var220].field7148;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field9844[--field9865];
                field9844[field9865++] = class652.field8790[var221].field7149;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field9844[--field9865];
                field9844[field9865++] = class652.field8790[var222].field7152;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field9844[--field9865];
                field9844[field9865++] = class652.field8790[var223].field7146;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field9844[--field9865];
                int var225 = class652.field8790[var224].method3003(true);
                field9844[field9865++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field9844[--field9865];
                int var227 = class652.field8790[var226].method3003(true);
                field9844[field9865++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field9844[--field9865];
                int var229 = class652.field8790[var228].method3003(true);
                field9844[field9865++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field9844[--field9865];
                int var231 = class652.field8790[var230].method3003(true);
                field9844[field9865++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field9865 -= 2;
                int var232 = field9844[field9865];
                int var233 = field9844[field9865 + 1];
                field9844[field9865++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field9865 -= 2;
                int var234 = field9844[field9865];
                int var235 = field9844[field9865 + 1];
                field9844[field9865++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field9865 -= 2;
                int var236 = field9844[field9865];
                int var237 = field9844[field9865 + 1];
                field9844[field9865++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field9865 -= 2;
                int var238 = field9844[field9865];
                int var239 = field9844[field9865 + 1];
                field9844[field9865++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field9844[--field9865];
                field9844[field9865++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field9844[--field9865];
                field9844[field9865++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field9865 -= 5;
                int var242 = field9844[field9865];
                int var243 = field9844[field9865 + 1];
                int var244 = field9844[field9865 + 2];
                int var245 = field9844[field9865 + 3];
                int var246 = field9844[field9865 + 4];
                field9844[field9865++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field9865 -= 2;
                long var247 = (long) field9844[field9865];
                long var249 = (long) field9844[field9865 + 1];
                field9844[field9865++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field9865 -= 2;
                int var251 = field9844[field9865];
                int var252 = field9844[field9865 + 1];
                field9844[field9865++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field9865 -= 2;
                int var253 = field9844[field9865];
                int var254 = field9844[field9865 + 1];
                field9844[field9865++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field9865 -= 2;
                int var255 = field9844[field9865];
                int var256 = field9844[field9865 + 1];
                field9844[field9865++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field9865 -= 2;
                int var257 = field9844[field9865];
                int var258 = field9844[field9865 + 1];
                field9844[field9865++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field9865 -= 2;
                int var259 = field9844[field9865];
                int var260 = field9844[field9865 + 1];
                if (var259 == 0) {
                    field9844[field9865++] = 0;
                    return;
                }
                field9844[field9865++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field9865 -= 2;
                int var261 = field9844[field9865];
                int var262 = field9844[field9865 + 1];
                if (var261 == 0) {
                    field9844[field9865++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field9844[field9865++] = Integer.MAX_VALUE;
                    return;
                }
                field9844[field9865++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field9865 -= 2;
                int var263 = field9844[field9865];
                int var264 = field9844[field9865 + 1];
                field9844[field9865++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field9865 -= 2;
                int var265 = field9844[field9865];
                int var266 = field9844[field9865 + 1];
                field9844[field9865++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field9865 -= 2;
                int var267 = field9844[field9865];
                int var268 = field9844[field9865 + 1];
                field9844[field9865++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field9865 -= 2;
                int var269 = field9844[field9865];
                int var270 = field9844[field9865 + 1];
                field9844[field9865++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field9865 -= 3;
                long var271 = (long) field9844[field9865];
                long var273 = (long) field9844[field9865 + 1];
                long var275 = (long) field9844[field9865 + 2];
                field9844[field9865++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field9865 -= 2;
                int var277 = field9844[field9865];
                int var278 = field9844[field9865 + 1];
                if (var277 > 700 || var278 > 700) {
                    field9844[field9865++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field9844[field9865++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field9844[--field9865];
                field9844[field9865++] = class462.field6576[class720.method3974(-594362713, var281) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field9867[--field9861];
                int var283 = field9844[--field9865];
                field9867[field9861++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field9861 -= 2;
                String var284 = field9867[field9861];
                String var285 = field9867[field9861 + 1];
                field9867[field9861++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field9867[--field9861];
                int var287 = field9844[--field9865];
                field9867[field9861++] = var286 + class648.method3603(var287, -63, true);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field9867[--field9861];
                field9867[field9861++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field9867[field9861++] = class742.method4080((byte) 122, class55.field647, class335.method2152(0, field9844[--field9865]));
                return;
            }
            if (arg0 == 4105) {
                field9861 -= 2;
                String var289 = field9867[field9861];
                String var290 = field9867[field9861 + 1];
                if (class625.field8475.field10355 != null && class625.field8475.field10355.field2607) {
                    field9867[field9861++] = var290;
                    return;
                }
                field9867[field9861++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field9844[--field9865];
                field9867[field9861++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field9861 -= 2;
                field9844[field9865++] = class307.method1986(field9867[field9861 + 1], field9867[field9861], class55.field647, 1);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field9867[--field9861];
                field9865 -= 2;
                int var293 = field9844[field9865];
                int var294 = field9844[field9865 + 1];
                class651 var295 = class278.method1822(class410.field5827, 0, var294, 0);
                field9844[field9865++] = var295.method3615(class603.field8192, 86, var292, var293);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field9867[--field9861];
                field9865 -= 2;
                int var297 = field9844[field9865];
                int var298 = field9844[field9865 + 1];
                class651 var299 = class278.method1822(class410.field5827, 0, var298, 0);
                field9844[field9865++] = var299.method3626(class603.field8192, var296, true, var297);
                return;
            }
            if (arg0 == 4110) {
                field9861 -= 2;
                String var300 = field9867[field9861];
                String var301 = field9867[field9861 + 1];
                if (field9844[--field9865] == 1) {
                    field9867[field9861++] = var300;
                    return;
                }
                field9867[field9861++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field9867[--field9861];
                field9867[field9861++] = class18.method98(false, var302);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field9867[--field9861];
                int var304 = field9844[--field9865];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field9867[field9861++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field9844[--field9865];
                field9844[field9865++] = method4017((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field9844[--field9865];
                field9844[field9865++] = class429.method2580((char) var306, true) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field9844[--field9865];
                field9844[field9865++] = class144.method1005((char) var307, 68) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field9844[--field9865];
                field9844[field9865++] = class341.method2173(-58, (char) var308) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field9867[--field9861];
                if (var309 != null) {
                    field9844[field9865++] = var309.length();
                    return;
                }
                field9844[field9865++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field9867[--field9861];
                field9865 -= 2;
                int var311 = field9844[field9865];
                int var312 = field9844[field9865 + 1];
                field9867[field9861++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field9867[--field9861];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field9867[field9861++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field9867[--field9861];
                field9865 -= 2;
                int var319 = field9844[field9865];
                int var320 = field9844[field9865 + 1];
                field9844[field9865++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field9861 -= 2;
                String var321 = field9867[field9861];
                String var322 = field9867[field9861 + 1];
                int var323 = field9844[--field9865];
                field9844[field9865++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field9844[--field9865];
                field9844[field9865++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field9844[--field9865];
                field9844[field9865++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field9844[--field9865] != 0;
                int var327 = field9844[--field9865];
                field9867[field9861++] = class219.method1403(7, class55.field647, 0, (long) var327, var326);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field9867[--field9861];
                int var329 = field9844[--field9865];
                class651 var330 = class278.method1822(class410.field5827, 0, var329, 0);
                field9844[field9865++] = var330.method3627(var328, class603.field8192, 31033);
                return;
            }
            if (arg0 == 4126) {
                field9867[field9861++] = class14.method86((long) field9844[--field9865] * 60000L, true, 14708, class55.field647) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field9859[--field9851];
                field9867[field9861++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field9844[--field9865];
                field9867[field9861++] = class16.field156.method2121(var333, 25928).field5349;
                return;
            }
            if (arg0 == 4201) {
                field9865 -= 2;
                int var334 = field9844[field9865];
                int var335 = field9844[field9865 + 1];
                class369 var336 = class16.field156.method2121(var334, 25928);
                if (var335 >= 1 && var335 <= 5 && var336.field5369[var335 - 1] != null) {
                    field9867[field9861++] = var336.field5369[var335 - 1];
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 4202) {
                field9865 -= 2;
                int var337 = field9844[field9865];
                int var338 = field9844[field9865 + 1];
                class369 var339 = class16.field156.method2121(var337, 25928);
                if (var338 >= 1 && var338 <= 5 && var339.field5363[var338 - 1] != null) {
                    field9867[field9861++] = var339.field5363[var338 - 1];
                    return;
                }
                field9867[field9861++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field9844[--field9865];
                field9844[field9865++] = class16.field156.method2121(var340, 25928).field5376;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field9844[--field9865];
                field9844[field9865++] = class16.field156.method2121(var341, 25928).field5367 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field9844[--field9865];
                class369 var343 = class16.field156.method2121(var342, 25928);
                if (var343.field5339 == -1 && var343.field5392 >= 0) {
                    field9844[field9865++] = var343.field5392;
                    return;
                }
                field9844[field9865++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field9844[--field9865];
                class369 var345 = class16.field156.method2121(var344, 25928);
                if (var345.field5339 >= 0 && var345.field5392 >= 0) {
                    field9844[field9865++] = var345.field5392;
                    return;
                }
                field9844[field9865++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field9844[--field9865];
                field9844[field9865++] = class16.field156.method2121(var346, 25928).field5364 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field9865 -= 2;
                int var347 = field9844[field9865];
                int var348 = field9844[field9865 + 1];
                class560 var349 = class315.field4447.method3515(var348, 0);
                if (var349.method3196(-93)) {
                    field9867[field9861++] = class16.field156.method2121(var347, 25928).method2317(false, var349.field7683, var348);
                    return;
                }
                field9844[field9865++] = class16.field156.method2121(var347, 25928).method2312(var349.field7679, var348, (byte) 109);
                return;
            }
            if (arg0 == 4209) {
                field9865 -= 2;
                int var350 = field9844[field9865];
                int var351 = field9844[field9865 + 1] - 1;
                class369 var352 = class16.field156.method2121(var350, 25928);
                if (var352.field5384 == var351) {
                    field9844[field9865++] = var352.field5386;
                    return;
                }
                if (var352.field5378 == var351) {
                    field9844[field9865++] = var352.field5323;
                    return;
                }
                field9844[field9865++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field9867[--field9861];
                int var354 = field9844[--field9865];
                class511.method2984(var354 == 1, 45, var353);
                field9844[field9865++] = class236.field3145;
                return;
            }
            if (arg0 == 4211) {
                if (class235.field3136 != null && class585.field7967 < class236.field3145) {
                    field9844[field9865++] = class235.field3136[class585.field7967++] & 0xFFFF;
                    return;
                }
                field9844[field9865++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class585.field7967 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field9844[--field9865];
                field9844[field9865++] = class16.field156.method2121(var355, 25928).field5358;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field9867[--field9861];
                field9865 -= 3;
                int var357 = field9844[field9865];
                int var358 = field9844[field9865 + 1];
                int var359 = field9844[field9865 + 2];
                class459.method2724(var359, (byte) 96, var356, var358, var357 == 1);
                field9844[field9865++] = class236.field3145;
                return;
            }
            if (arg0 == 4215) {
                field9861 -= 2;
                field9865 -= 2;
                String var360 = field9867[field9861];
                int var361 = field9844[field9865];
                int var362 = field9844[field9865 + 1];
                String var363 = field9867[field9861 + 1];
                class259.method1755(var361 == 1, var362, var363, var360, -6963);
                field9844[field9865++] = class236.field3145;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field9865 -= 2;
                int var364 = field9844[field9865];
                int var365 = field9844[field9865 + 1];
                class560 var366 = class315.field4447.method3515(var365, 0);
                if (var366.method3196(-86)) {
                    field9867[field9861++] = class107.field1507.method3587(var364, 0).method1958(var366.field7683, (byte) 79, var365);
                    return;
                }
                field9844[field9865++] = class107.field1507.method3587(var364, 0).method1965((byte) -102, var366.field7679, var365);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field9865 -= 2;
                int var367 = field9844[field9865];
                int var368 = field9844[field9865 + 1];
                class560 var369 = class315.field4447.method3515(var368, 0);
                if (var369.method3196(-91)) {
                    field9867[field9861++] = class210.field2705.method1362(0, var367).method2486(var368, var369.field7683, true);
                    return;
                }
                field9844[field9865++] = class210.field2705.method1362(0, var367).method2473((byte) -114, var369.field7679, var368);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field9865 -= 2;
                int var370 = field9844[field9865];
                int var371 = field9844[field9865 + 1];
                class560 var372 = class315.field4447.method3515(var371, 0);
                if (var372.method3196(-93)) {
                    field9867[field9861++] = class130.field1795.method3476(var370, -7513).method988(0, var371, var372.field7683);
                    return;
                }
                field9844[field9865++] = class130.field1795.method3476(var370, -7513).method990(var372.field7679, -104, var371);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field9844[--field9865];
                class588 var374 = class175.field2314.method2629(var373, (byte) -41);
                if (var374.field7982 != null && var374.field7982.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field7988[0];
                    for (int var377 = 1; var377 < var374.field7982.length; var377++) {
                        if (var374.field7988[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field7988[var377];
                        }
                    }
                    field9844[field9865++] = var374.field7982[var375];
                    return;
                }
                field9844[field9865++] = var374.field7998;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field9844[field9865++] = class401.field5727 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field9867[--field9861];
                if (class780.field10712 == 7 && class733.field9917 == 0) {
                    if (var378.length() > 20) {
                        class315.field4452 = -4;
                        return;
                    }
                    class315.field4452 = -1;
                    class43 var379 = class492.method2903(class178.field2350, 0, class73.field983);
                    var379.field457.method1725(0, 41);
                    int var380 = var379.field457.field3725;
                    var379.field457.method1678(var378, (byte) 45);
                    var379.field457.method1726((byte) -127, var379.field457.field3725 - var380);
                    class409.method2457((byte) -100, var379);
                    return;
                }
                class315.field4452 = -5;
                return;
            }
            if (arg0 == 4702) {
                field9844[field9865++] = class315.field4452;
                if (class315.field4452 != -1) {
                    class315.field4452 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(C)I")
    private static final int method4017(char arg0) {
        return class67.method569(-127, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    private static final void method4018(int arg0) {
        class347 var1 = class445.method2655(arg0, (byte) 115);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class347[] var3 = class230.field2956[var2];
        if (var3 == null) {
            class347[] var4 = class419.field6032[var2];
            int var5 = var4.length;
            var3 = class230.field2956[var2] = new class347[var5];
            class421.method2533(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class421.method2533(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()V")
    public static final void method4019() {
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)I")
    private static final int method4020(int arg0) {
        class132 var1 = class285.field4087.method1800(arg0, 31188);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field9841.method735(class426.field6204.field3879 << 16 | arg0, 0);
        if (var2 == null) {
            return var1.field1813 == 'i' || var1.field1813 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method4021(String arg0, int arg1) {
        if (class479.field6726 == 0 && !(!class564.field7727 || class405.field5751) || class704.field9640) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class58.field744.method365(0, (byte) 109))) {
            var3 = 0;
            arg0 = arg0.substring(class58.field744.method365(0, (byte) 107).length());
        } else if (var2.startsWith(class58.field745.method365(0, (byte) 94))) {
            var3 = 1;
            arg0 = arg0.substring(class58.field745.method365(0, (byte) 68).length());
        } else if (var2.startsWith(class58.field746.method365(0, (byte) 65))) {
            var3 = 2;
            arg0 = arg0.substring(class58.field746.method365(0, (byte) 103).length());
        } else if (var2.startsWith(class58.field747.method365(0, (byte) 50))) {
            var3 = 3;
            arg0 = arg0.substring(class58.field747.method365(0, (byte) 83).length());
        } else if (var2.startsWith(class58.field748.method365(0, (byte) 66))) {
            var3 = 4;
            arg0 = arg0.substring(class58.field748.method365(0, (byte) 71).length());
        } else if (var2.startsWith(class58.field749.method365(0, (byte) 102))) {
            var3 = 5;
            arg0 = arg0.substring(class58.field749.method365(0, (byte) 70).length());
        } else if (var2.startsWith(class58.field750.method365(0, (byte) 73))) {
            var3 = 6;
            arg0 = arg0.substring(class58.field750.method365(0, (byte) 56).length());
        } else if (var2.startsWith(class58.field751.method365(0, (byte) 76))) {
            var3 = 7;
            arg0 = arg0.substring(class58.field751.method365(0, (byte) 59).length());
        } else if (var2.startsWith(class58.field752.method365(0, (byte) 98))) {
            var3 = 8;
            arg0 = arg0.substring(class58.field752.method365(0, (byte) 56).length());
        } else if (var2.startsWith(class58.field753.method365(0, (byte) 117))) {
            var3 = 9;
            arg0 = arg0.substring(class58.field753.method365(0, (byte) 57).length());
        } else if (var2.startsWith(class58.field754.method365(0, (byte) 126))) {
            var3 = 10;
            arg0 = arg0.substring(class58.field754.method365(0, (byte) 127).length());
        } else if (var2.startsWith(class58.field755.method365(0, (byte) 53))) {
            var3 = 11;
            arg0 = arg0.substring(class58.field755.method365(0, (byte) 115).length());
        } else if (class55.field647 != 0) {
            if (var2.startsWith(class58.field744.method365(class55.field647, (byte) 64))) {
                var3 = 0;
                arg0 = arg0.substring(class58.field744.method365(class55.field647, (byte) 65).length());
            } else if (var2.startsWith(class58.field745.method365(class55.field647, (byte) 123))) {
                var3 = 1;
                arg0 = arg0.substring(class58.field745.method365(class55.field647, (byte) 109).length());
            } else if (var2.startsWith(class58.field746.method365(class55.field647, (byte) 51))) {
                var3 = 2;
                arg0 = arg0.substring(class58.field746.method365(class55.field647, (byte) 59).length());
            } else if (var2.startsWith(class58.field747.method365(class55.field647, (byte) 94))) {
                var3 = 3;
                arg0 = arg0.substring(class58.field747.method365(class55.field647, (byte) 118).length());
            } else if (var2.startsWith(class58.field748.method365(class55.field647, (byte) 51))) {
                var3 = 4;
                arg0 = arg0.substring(class58.field748.method365(class55.field647, (byte) 68).length());
            } else if (var2.startsWith(class58.field749.method365(class55.field647, (byte) 102))) {
                var3 = 5;
                arg0 = arg0.substring(class58.field749.method365(class55.field647, (byte) 117).length());
            } else if (var2.startsWith(class58.field750.method365(class55.field647, (byte) 116))) {
                var3 = 6;
                arg0 = arg0.substring(class58.field750.method365(class55.field647, (byte) 56).length());
            } else if (var2.startsWith(class58.field751.method365(class55.field647, (byte) 103))) {
                var3 = 7;
                arg0 = arg0.substring(class58.field751.method365(class55.field647, (byte) 123).length());
            } else if (var2.startsWith(class58.field752.method365(class55.field647, (byte) 111))) {
                var3 = 8;
                arg0 = arg0.substring(class58.field752.method365(class55.field647, (byte) 118).length());
            } else if (var2.startsWith(class58.field753.method365(class55.field647, (byte) 104))) {
                var3 = 9;
                arg0 = arg0.substring(class58.field753.method365(class55.field647, (byte) 72).length());
            } else if (var2.startsWith(class58.field754.method365(class55.field647, (byte) 83))) {
                var3 = 10;
                arg0 = arg0.substring(class58.field754.method365(class55.field647, (byte) 121).length());
            } else if (var2.startsWith(class58.field755.method365(class55.field647, (byte) 54))) {
                var3 = 11;
                arg0 = arg0.substring(class58.field755.method365(class55.field647, (byte) 111).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class58.field756.method365(0, (byte) 126))) {
            var5 = 1;
            arg0 = arg0.substring(class58.field756.method365(0, (byte) 68).length());
        } else if (var4.startsWith(class58.field757.method365(0, (byte) 110))) {
            var5 = 2;
            arg0 = arg0.substring(class58.field757.method365(0, (byte) 57).length());
        } else if (var4.startsWith(class58.field758.method365(0, (byte) 118))) {
            var5 = 3;
            arg0 = arg0.substring(class58.field758.method365(0, (byte) 106).length());
        } else if (var4.startsWith(class58.field759.method365(0, (byte) 84))) {
            var5 = 4;
            arg0 = arg0.substring(class58.field759.method365(0, (byte) 92).length());
        } else if (var4.startsWith(class58.field760.method365(0, (byte) 99))) {
            var5 = 5;
            arg0 = arg0.substring(class58.field760.method365(0, (byte) 76).length());
        } else if (class55.field647 != 0) {
            if (var4.startsWith(class58.field756.method365(class55.field647, (byte) 90))) {
                var5 = 1;
                arg0 = arg0.substring(class58.field756.method365(class55.field647, (byte) 82).length());
            } else if (var4.startsWith(class58.field757.method365(class55.field647, (byte) 70))) {
                var5 = 2;
                arg0 = arg0.substring(class58.field757.method365(class55.field647, (byte) 108).length());
            } else if (var4.startsWith(class58.field758.method365(class55.field647, (byte) 47))) {
                var5 = 3;
                arg0 = arg0.substring(class58.field758.method365(class55.field647, (byte) 119).length());
            } else if (var4.startsWith(class58.field759.method365(class55.field647, (byte) 55))) {
                var5 = 4;
                arg0 = arg0.substring(class58.field759.method365(class55.field647, (byte) 86).length());
            } else if (var4.startsWith(class58.field760.method365(class55.field647, (byte) 70))) {
                var5 = 5;
                arg0 = arg0.substring(class58.field760.method365(class55.field647, (byte) 97).length());
            }
        }
        field9852++;
        class43 var6 = class492.method2903(class716.field9762, 0, class73.field983);
        var6.field457.method1725(0, 49);
        int var7 = var6.field457.field3725;
        var6.field457.method1725(var3, 88);
        var6.field457.method1725(var5, 119);
        class511.method2983(arg0, 0, var6.field457);
        var6.field457.method1726((byte) -126, var6.field457.field3725 - var7);
        class409.method2457((byte) -100, var6);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IZ)V")
    public static final void method4022(int arg0, boolean arg1) {
    }
}
