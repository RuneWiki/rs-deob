import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class352 extends class172 {

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public int field5588 = 0;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "Ljava/lang/String;")
    public static String field5586 = null;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field5574 = 0;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "Z")
    public static boolean field5587 = false;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "[I")
    public static int[] field5578 = new int[] { -2, 0, 5, 0, 0, 0, 0, 15, 0, 10, 0, 0, 0, 10, 0, 6, 3, 5, 0, 0, 0, 0, 8, 8, -2, 0, -1, 2, 3, -1, 6, 0, 0, -1, 2, 0, 7, 0, 6, 0, 8, 1, 0, 0, 6, 0, 0, 0, -1, 28, 0, 12, -1, 0, 15, 0, 0, 0, 2, 0, -1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, -1, 5, 0, -1, -1, 3, 2, 0, 6, 4, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 20, 2, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 14, 7, 0, 0, 0, 0, 0, -1, 0, 12, 8, 0, 3, 1, 0, 1, 3, 8, 8, 0, 7, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0, 12, 0, 0, 0, 0, 2, 8, -2, 0, 0, -2, 6, 0, 0, 0, -2, 0, 6, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, -2, 4, 14, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 6, 0, -2, 3, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, -2, 0, 0, 12, 0, 12, 0, 9, 0, 0, 0, 0, 2, 6, 0, 0, 4, 1, 6, 0, 0, 0, 0, 8, 0, 0, -2, 0, 0, 3, 0, 0, 2, 10, 1, 0, 0, 8, 0, -2, 7, 3, 0, 0, 11, -1, 0, 0, 4, -1, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5583 = "K";

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "[I")
    public static int[] field5576 = new int[8];

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "Lwf;")
    public static class250 field5579;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "[[B")
    public static byte[][] field5584;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V", line = 8)
    public static final void method2483(int arg0, int arg1, byte arg2) {
        class327 var3 = class211.field3372[class186.field2991][arg0][arg1];
        field5575++;
        if (var3 == null) {
            class247.method1907(class186.field2991, arg0, arg1);
            return;
        }
        class103 var4 = null;
        int var5 = -99999999;
        for (class103 var6 = (class103) var3.method2300((byte) 122); var6 != null; var6 = (class103) var3.method2306(-23)) {
            class52 var7 = class6.method22(var6.field1672.field3829, 16430);
            int var8 = var7.field865;
            if (var7.field884 == 1) {
                var8 = (var6.field1672.field3826 + 1) * var8;
            }
            if (var8 > var5) {
                var4 = var6;
                var5 = var8;
            }
        }
        int var9 = 97 / ((67 - arg2) / 51);
        if (var4 == null) {
            class247.method1907(class186.field2991, arg0, arg1);
            return;
        }
        class230 var10 = null;
        var3.method2299(false, var4);
        class230 var11 = null;
        for (class103 var12 = (class103) var3.method2300((byte) 122); var12 != null; var12 = (class103) var3.method2306(-23)) {
            class230 var13 = var12.field1672;
            if (var4.field1672.field3829 != var13.field3829) {
                if (var11 == null) {
                    var11 = var13;
                }
                if (var11.field3829 != var13.field3829 && var10 == null) {
                    var10 = var13;
                }
            }
        }
        long var14 = (long) (arg0 + (arg1 << 7) + 1610612736);
        client.method360(class186.field2991, arg0, arg1, class271.method2034(-1, arg1 * 128 + 64, arg0 * 128 + 64, class186.field2991), var4.field1672, var14, var11, var10);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 83)
    public static final int method2484(String arg0, int arg1, int arg2) {
        if (arg1 == -99999999) {
            field5573++;
            return class200.method1536(true, arg2, 109, arg0);
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lqm;I)V", line = 102)
    public final void method2485(class227 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1720((byte) -95);
            if (var3 == 0) {
                if (arg1 != 6) {
                    this.field5588 = -21;
                }
                field5577++;
                return;
            }
            this.method2487(var3, arg0, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ldf;ZI)V", line = 122)
    public static final void method2486(class171 arg0, boolean arg1, int arg2) {
        field5582++;
        if (class42.field607 || arg1) {
            int var3 = class252.field4266;
            int var4 = var3 * 956 / 503;
            class151.field2397.method90((class298.field4779 - var4) / 2, 0, var4, var3);
            class164.field2602.method2015(class298.field4779 / 2 - class164.field2602.field4652 / 2, 18);
        }
        arg0.method1328(class131.field2212 == 1 ? class300.field4841 : class160.field2548, class298.field4779 / arg2, class252.field4266 / 2 - 26, 16777215, -1);
        int var5 = class252.field4266 / 2 - 18;
        if (class42.field607) {
            class244.method1865(class298.field4779 / 2 - 152, var5, 304, 34, 9179409);
            class244.method1865(class298.field4779 / 2 - 151, var5 + 1, 302, 32, 0);
            class244.method1862(class298.field4779 / 2 - 150, var5 + 2, class323.field5152 * 3, 30, 9179409);
            class244.method1862(class298.field4779 / 2 + class323.field5152 * 3 - 150, var5 - -2, 300 - (class323.field5152 * 3), 30, 0);
        } else {
            class246.method1881(class298.field4779 / 2 - 152, var5, 304, 34, 9179409);
            class246.method1881(class298.field4779 / 2 - 151, var5 - -1, 302, 32, 0);
            class246.method1885(class298.field4779 / 2 - 150, var5 + 2, class323.field5152 * 3, 30, 9179409);
            class246.method1885(class298.field4779 / 2 - (150 - class323.field5152 * 3), var5 + 2, 300 - (class323.field5152 * 3), 30, 0);
        }
        arg0.method1328(class285.field4657, class298.field4779 / 2, class252.field4266 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILqm;B)V", line = 158)
    private final void method2487(int arg0, class227 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field5588 = arg1.method1765(true);
        }
        field5581++;
        if (arg2 <= 41) {
            field5578 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V", line = 177)
    public static final void method2488(int arg0, boolean arg1) {
        field5572++;
        if (arg0 >= -64) {
            field5586 = (String) null;
        }
        byte var2;
        byte[][] var3;
        if (class42.field607 && arg1) {
            var2 = 1;
            var3 = class160.field2546;
        } else {
            var2 = 4;
            var3 = class227.field3786;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var3[var5];
            int var8 = class121.field2079[var5] & 0xFF;
            int var9 = var8 * 64 - class275.field4546;
            int var10 = class121.field2079[var5] >> 8;
            int var11 = var10 * 64 - class93.field1562;
            if (var7 != null) {
                class195.method1506(false);
                var6 = class76.method635(class32.field459, var11, true, var9, arg1, class93.field1562, var7, class275.field4546);
            }
            if (!arg1 && (class316.field5050 / 8) == var10 && class113.field1844 / 8 == var8) {
                if (var6 == null) {
                    class293.field4732 = -1;
                } else {
                    class89.field1501 = var6[2];
                    class293.field4732 = var6[0];
                    class239.field3939 = var6[1];
                    class125.field2139 = var6[3];
                    class326.field5186 = var6[4];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class121.field2079[var12] >> 8) * 64 - class93.field1562;
            int var14 = (class121.field2079[var12] & 0xFF) * 64 - class275.field4546;
            byte[] var15 = var3[var12];
            if (var15 == null && class113.field1844 < 800) {
                class195.method1506(false);
                for (int var16 = 0; var16 < var2; var16++) {
                    class50.method390(var13, var14, 64, var16, 64, -14636);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjn;Lmf;)V", line = 291)
    public static final void method2489(int arg0, class59 arg1, class213 arg2) {
        field5589++;
        class341 var3 = arg2.method1608(false);
        if (var3 == null) {
            return;
        }
        int var4 = var3.field4652;
        if (var3.field4649 > var3.field4652) {
            var4 = var3.field4649;
        }
        int var5 = arg1.field1014;
        int var6 = arg1.field1017;
        int var7 = arg0;
        int var8 = 0;
        int var9 = 0;
        if (arg2.field3401 != null) {
            var7 = class286.field4663.method1343(arg2.field3401, (int[]) null, class84.field1432);
            for (int var10 = 0; var10 < var7; var10++) {
                String var11 = class84.field1432[var10];
                if (var10 < (var7 - 1)) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class109.field1796.method1138(var11);
                if (var9 < var12) {
                    var9 = var12;
                }
            }
            var8 = (var7 - 1) * class109.field1796.method1147() + (class109.field1796.method1145() / 2);
        }
        int var13 = arg1.field1014;
        if (var5 < (class174.field2785 + var4)) {
            var13 = var9 / 2 + (var4 / 2 + class174.field2785 + var4) + 5;
            var5 = class174.field2785 + var4;
        } else if ((class174.field2793 - var4) < var5) {
            var5 = class174.field2793 - var4;
            var13 = class174.field2793 - (var4 + (var4 / 2)) - (var9 / 2) - 5;
        }
        int var14 = -2;
        int var15 = arg1.field1017 - (var8 / 2);
        int var16 = -2;
        if ((class174.field2794 + var4) > var6) {
            var6 = class174.field2794 + var4;
            var15 = var4 / 2 + class174.field2794 + var4 + class109.field1796.method1147();
        } else if ((class174.field2797 - var4) < var6) {
            var6 = class174.field2797 - var4;
            var15 = class174.field2797 - var8 - var4 - (var4 / 2);
        }
        int var17 = var4 >> 1;
        int var18 = -2;
        int var19 = (int) ((Math.atan2((double) (var5 - arg1.field1014), (double) (var6 - arg1.field1017)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        int var20 = -2;
        var3.method2411(var3.field4642 << 3, var3.field4644 << 3, (var5 << 4) + var17, (var6 << 4) + var17, var19, 4096);
        if (arg2.field3401 != null) {
            var14 = var13 - (var9 / 2) - 5;
            var18 = var9 + var14 + 10;
            var16 = var15 - class109.field1796.method1145() - 3;
            var20 = var16 + (var7 * class109.field1796.method1147());
            if (arg2.field3390 != 0) {
                class246.method1905(var14, var16, var18 - var14, var20 - var16, arg2.field3390, arg2.field3390 >>> 24);
            }
            if (arg2.field3394 != 0) {
                class246.method1878(var14, var16, var18 - var14, -var16 + var20, arg2.field3394, arg2.field3394 >>> 24);
            }
            for (int var21 = 0; var21 < var7; var21++) {
                String var22 = class84.field1432[var21];
                if (var21 < (var7 - 1)) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class109.field1796.method1142(var22, var13, var15, arg2.field3399, true);
                var15 += class109.field1796.method1147();
            }
        }
        if ((var5 - var17) >= class333.field5275 || class333.field5275 >= (var5 + var17) || class77.field1343 <= var6 - var17 || class77.field1343 >= (var6 + var17) && class333.field5275 <= var14 || class333.field5275 >= var18 || var16 >= class77.field1343 || class77.field1343 >= var20) {
            return;
        }
        if (arg2.field3408[4] != null) {
            class55.method434(0, -1, false, (long) arg1.field1011, arg2.field3406, 0, arg2.field3408[4], (short) 1011);
        }
        if (arg2.field3408[3] != null) {
            class55.method434(0, -1, false, (long) arg1.field1011, arg2.field3406, 0, arg2.field3408[3], (short) 1012);
        }
        if (arg2.field3408[2] != null) {
            class55.method434(0, -1, false, (long) arg1.field1011, arg2.field3406, 0, arg2.field3408[2], (short) 1007);
        }
        if (arg2.field3408[1] != null) {
            class55.method434(0, -1, false, (long) arg1.field1011, arg2.field3406, 0, arg2.field3408[1], (short) 1006);
        }
        if (arg2.field3408[0] != null) {
            class55.method434(0, -1, false, (long) arg1.field1011, arg2.field3406, 0, arg2.field3408[0], (short) 1002);
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V", line = 439)
    public static void method2490(int arg0) {
        field5584 = (byte[][]) null;
        field5583 = null;
        field5576 = null;
        if (arg0 != -5) {
            field5586 = (String) null;
        }
        field5578 = null;
        field5579 = null;
        field5586 = null;
    }
}
