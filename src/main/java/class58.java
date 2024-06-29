import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class58 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lke;")
    public static class256 field1055 = class316.method2202("Fps:", 27626);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIILmc;IJ)Z", line = 3)
    public static final boolean method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class51 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class126.method872(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V", line = 15)
    public static final void method455(boolean arg0, byte arg1) {
        if (class121.field2124.field1192 >> 7 == class241.field4102 && class121.field2124.field1197 >> 7 == class269.field4588) {
            class241.field4102 = 0;
        }
        field1058++;
        int var2 = class67.field1206;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class144 var4;
            long var5;
            if (arg0) {
                var4 = class121.field2124;
                var5 = 8791798054912L;
            } else {
                var4 = class300.field5172[class140.field2463[var3]];
                var5 = (long) class140.field2463[var3] << 32;
            }
            if (var4 != null && var4.method519(106)) {
                var4.field2513 = false;
                int var7 = var4.field1192 >> 7;
                if ((class95.field1695 && class67.field1206 > 200 || class67.field1206 > 50) && !arg0 && var4.field1238 == var4.field1236) {
                    var4.field2513 = true;
                }
                int var8 = var4.field1197 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field2533 == null || class45.field840 < var4.field2516 || var4.field2553 <= class45.field840) {
                        if (var4.method515(5373952) == 1 && (var4.field1192 & 0x7F) == 64 && (var4.field1197 & 0x7F) == 64) {
                            if (class67.field1241[var7][var8] == class78.field1469) {
                                continue;
                            }
                            class67.field1241[var7][var8] = class78.field1469;
                        }
                        var4.field1243 = class297.method2080(var4.field1192, 123, class255.field4377, var4.field1197);
                        class78.method587(class255.field4377, var4.field1192, var4.field1197, var4.field1243, var4.method515(5373952) * 64 - 4, var4, var4.field1191, var5, var4.field1226);
                    } else {
                        var4.field2513 = false;
                        var4.field1243 = class297.method2080(var4.field1192, 119, class255.field4377, var4.field1197);
                        class74.method554(class255.field4377, var4.field1192, var4.field1197, var4.field1243, var4, var4.field1191, var5, var4.field2538, var4.field2526, var4.field2517, var4.field2536);
                    }
                }
            }
        }
        int var9 = -10 / ((-arg1 - 14) / 57);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 99)
    public static final void method456(int arg0) {
        if (arg0 > -111) {
            return;
        }
        field1054++;
        for (class166 var1 = (class166) class57.field1038.method1270((byte) -121); var1 != null; var1 = (class166) class57.field1038.method1277(1)) {
            class23 var2 = var1.field2933;
            if (class255.field4377 != var2.field304 || var2.field303) {
                var1.method1199(21966);
            } else if (class45.field840 >= var2.field297) {
                var2.method147((byte) -70, class29.field398);
                if (var2.field303) {
                    var1.method1199(21966);
                } else {
                    class78.method587(var2.field304, var2.field301, var2.field314, var2.field298, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 134)
    public static void method457(int arg0) {
        int var1 = -108 % ((42 - arg0) / 55);
        field1055 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Lal;", line = 147)
    public static final class38 method458(byte arg0, int arg1) {
        if (arg0 != -40) {
            return (class38) null;
        }
        field1057++;
        class38 var2 = (class38) class171.field3045.method2077(arg0 - 13368, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class83.field1519.method1016(class130.method891(arg0 ^ 0xFFFFD2C1, arg1), arg0 ^ 0xFFFFFFBC, class156.method1161(arg1, (byte) 58));
        class38 var4 = new class38();
        if (var3 != null) {
            var4.method292((byte) 118, new class41(var3));
        }
        class171.field3045.method2074(var4, (long) arg1, arg0 ^ 0x27);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILke;)V", line = 182)
    public static final void method459(int arg0, int arg1, class256 arg2) {
        field1056++;
        class256 var3 = arg2.method1800(-32).method1761(-80);
        boolean var4 = false;
        int var5 = 12 % ((arg1 - 64) / 36);
        for (int var6 = 0; var6 < class67.field1206; var6++) {
            class144 var7 = class300.field5172[class140.field2463[var6]];
            if (var7 != null && var7.field2532 != null && var7.field2532.method1769(var3, (byte) 106)) {
                class238.method1598(0, var7.field1215[0], var7.field1254[0], 1, class121.field2124.field1215[0], 0, class121.field2124.field1254[0], 2, false, -3, 0, 1);
                var4 = true;
                if (arg0 == 1) {
                    class310.field5347++;
                    class308.field5322.method1599(4, (byte) -102);
                    class308.field5322.method366(class140.field2463[var6], -116);
                } else if (arg0 == 4) {
                    class25.field322++;
                    class308.field5322.method1599(46, (byte) 75);
                    class308.field5322.method351(-128, class140.field2463[var6]);
                } else if (arg0 == 5) {
                    class91.field1664++;
                    class308.field5322.method1599(31, (byte) -76);
                    class308.field5322.method351(-128, class140.field2463[var6]);
                } else if (arg0 == 6) {
                    class308.field5322.method1599(27, (byte) -31);
                    class92.field1672++;
                    class308.field5322.method351(-128, class140.field2463[var6]);
                } else if (arg0 == 7) {
                    class308.field5322.method1599(23, (byte) 104);
                    class152.field2717++;
                    class308.field5322.method351(-128, class140.field2463[var6]);
                }
                break;
            }
        }
        if (!var4) {
            class274.method1895(0, 22156, class46.field844, class30.method214(new class256[] { class231.field3970, var3 }, 29784));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lke;", line = 257)
    public static final class256 method460(int arg0, int arg1) {
        if (arg1 != 471462887) {
            method455(true, (byte) -79);
        }
        field1059++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class256 var2 = new class256();
        var2.field4380 = new byte[1];
        var2.field4380[0] = (byte) arg0;
        var2.field4384 = 1;
        return var2;
    }
}
