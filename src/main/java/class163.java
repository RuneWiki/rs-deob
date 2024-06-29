import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class163 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Z")
    public static boolean field2563 = false;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2561 = "red:";

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[Lkd;")
    public static class220[] field2559 = new class220[29];

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2567 = 2;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Lwa;")
    public static class281 field2568 = new class281();

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class245.method1720(class63.field941, -104, arg3, class75.field1180);
        field2562++;
        int var7 = class245.method1720(class63.field941, -95, arg1, class75.field1180);
        if (arg5 > -97) {
            return;
        }
        int var8 = class245.method1720(class53.field711, -90, arg2, class87.field1356);
        int var9 = class245.method1720(class53.field711, -104, arg4, class87.field1356);
        for (int var10 = var6; var10 <= var7; var10++) {
            class71.method451(arg0, true, var9, var8, class130.field2005[var10]);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field2568 = null;
        if (arg0 == 3) {
            field2561 = null;
            field2559 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lff;")
    public static final class20 method1080(int arg0, int arg1) {
        field2560++;
        class20 var2 = (class20) class102.field1547.method149((byte) -56, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field754.method1877(arg1, 16, (byte) 112);
        class20 var4 = new class20();
        if (var3 != null) {
            var4.method119((byte) -68, new class202(var3));
        }
        int var5 = -63 / ((arg0 - 8) / 63);
        class102.field1547.method152(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILfa;II)Z")
    public static final boolean method1081(int arg0, class273 arg1, int arg2, int arg3) {
        field2564++;
        if (arg0 != 0) {
            field2566 = -37;
        }
        byte[] var4 = arg1.method1877(arg2, arg3, (byte) 94);
        if (var4 == null) {
            return false;
        } else {
            class313.method2122(1, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static final void method1082(byte arg0) {
        field2565++;
        int var1 = 59 / ((14 - arg0) / 58);
        while (true) {
            class297 var2;
            class58 var4;
            do {
                var2 = (class297) class301.field4938.method1960((byte) -105);
                if (var2 == null) {
                    return;
                }
                if (var2.field4890 < 0) {
                    int var3 = -var2.field4890 - 1;
                    if (class31.field396 == var3) {
                        var4 = class309.field5006;
                    } else {
                        var4 = class300.field4925[var3];
                    }
                } else {
                    int var5 = var2.field4890 - 1;
                    var4 = class76.field1188[var5];
                }
            } while (var4 == null);
            class74 var6 = class216.method1510(0, var2.field4882);
            int var7;
            int var8;
            if (var2.field4894 == 1 || var2.field4894 == 3) {
                var8 = var6.field1151;
                var7 = var6.field1169;
            } else {
                var7 = var6.field1151;
                var8 = var6.field1169;
            }
            int var9 = (var8 >> 1) + var2.field4878;
            int var10 = (var7 + 1 >> 1) + var2.field4880;
            int var11 = (var7 >> 1) + var2.field4880;
            int var12 = var2.field4878 + (var8 + 1 >> 1);
            int[][] var13 = class242.field3842[class165.field2600];
            class276 var14 = null;
            int var15 = var13[var12][var10] + var13[var12][var11] + var13[var9][var11] + var13[var9][var10] >> 2;
            int var16 = class131.field2016[var2.field4883];
            if (var16 == 0) {
                class169 var20 = class177.method1184(class165.field2600, var2.field4878, var2.field4880);
                if (var20 != null) {
                    var14 = var20.field2639;
                }
            } else if (var16 == 1) {
                class98 var19 = class111.method713(class165.field2600, var2.field4878, var2.field4880);
                if (var19 != null) {
                    var14 = var19.field1480;
                }
            } else if (var16 == 2) {
                class114 var18 = class179.method1199(class165.field2600, var2.field4878, var2.field4880);
                if (var18 != null) {
                    var14 = var18.field1726;
                }
            } else if (var16 == 3) {
                class286 var17 = class69.method433(class165.field2600, var2.field4878, var2.field4880);
                if (var17 != null) {
                    var14 = var17.field4769;
                }
            }
            if (var14 != null) {
                class104.method671(var2.field4880, var2.field4884 + 1, (byte) 64, 0, class165.field2600, 0, var2.field4878, -1, var16, var2.field4881 + 1);
                var4.field819 = var2.field4878 * 128 + (var8 * 64);
                var4.field809 = class4.field32 + var2.field4884;
                var4.field882 = var14;
                int var21 = var2.field4892;
                var4.field790 = var2.field4880 * 128 + (var7 * 64);
                var4.field796 = var15;
                int var22 = var2.field4877;
                int var23 = var2.field4888;
                int var24 = var2.field4891;
                var4.field815 = class4.field32 + var2.field4881;
                if (var21 < var24) {
                    int var25 = var24;
                    var24 = var21;
                    var21 = var25;
                }
                var4.field828 = var2.field4878 + var21;
                if (var22 > var23) {
                    int var26 = var22;
                    var22 = var23;
                    var23 = var26;
                }
                var4.field798 = var2.field4880 + var23;
                var4.field820 = var2.field4878 + var24;
                var4.field811 = var2.field4880 + var22;
            }
        }
    }
}
