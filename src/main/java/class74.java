import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class74 extends class137 {

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "[I")
    public int[] field1187 = new int[] { -1 };

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "[I")
    public int[] field1188 = new int[1];

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1183 = "flash2:";

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "[I")
    public static int[] field1186 = new int[5];

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static volatile int field1182 = -1;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1197 = "Created gameworld";

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Li;")
    public static class58 field1192 = new class58(8);

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "Lgi;")
    public static class164 field1190;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "[S")
    public static short[] field1193;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method533(int arg0) {
        field1195++;
        String var1;
        if (class45.field669 == 1 && class291.field4776 < 2) {
            var1 = class33.field537 + class70.field1127 + class259.field4248 + " ->";
        } else if (class101.field1579 && class291.field4776 < 2) {
            var1 = class205.field3297 + class70.field1127 + class211.field3367 + " ->";
        } else if (class122.field1929 && class8.field170[81] && class291.field4776 > 2) {
            var1 = class292.method2016(class291.field4776 - 2, 76);
        } else {
            var1 = class292.method2016(class291.field4776 - 1, 47);
        }
        if (class291.field4776 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class291.field4776 - 2) + class307.field4990;
        }
        if (arg0 != 708) {
            method539(-82, 122, 1, -39, 2, 80, true, -16, 45, 33, -105);
        }
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public static void method534(int arg0) {
        field1183 = null;
        field1197 = null;
        field1190 = null;
        if (arg0 >= -100) {
            method536((String) null, (String) null, (byte) -70, -43);
        }
        field1192 = null;
        field1193 = null;
        field1186 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ltl;Lfj;IZ)V")
    public static final void method535(class69 arg0, class274 arg1, int arg2, boolean arg3) {
        field1181++;
        class218 var4 = new class218();
        if (arg3) {
            field1189 = -121;
        }
        var4.field3419 = arg1.method1849(255);
        var4.field3428 = arg1.method1833((byte) -104);
        var4.field3425 = new int[var4.field3419];
        var4.field3426 = new class301[var4.field3419];
        var4.field3431 = new int[var4.field3419];
        var4.field3418 = new int[var4.field3419];
        var4.field3423 = new class301[var4.field3419];
        var4.field3421 = new byte[var4.field3419][][];
        for (int var5 = 0; var5 < var4.field3419; var5++) {
            try {
                int var6 = arg1.method1849(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method1855(101);
                    int var8 = 0;
                    String var9 = arg1.method1855(-108);
                    if (var6 == 1) {
                        var8 = arg1.method1833((byte) -104);
                    }
                    var4.field3418[var5] = var6;
                    var4.field3425[var5] = var8;
                    var4.field3423[var5] = arg0.method486(var9, class46.method304(false, var7), 9);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method1855(-80);
                    String var11 = arg1.method1855(-116);
                    int var12 = arg1.method1849(255);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method1855(-81);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method1833((byte) -104);
                            var15[var16] = new byte[var17];
                            arg1.method1810(var17, 0, 75, var15[var16]);
                        }
                    }
                    var4.field3418[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class46.method304(false, var13[var19]);
                    }
                    var4.field3426[var5] = arg0.method475(var18, class46.method304(false, var10), var11, 0);
                    var4.field3421[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3431[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3431[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3431[var5] = -3;
            } catch (Exception var23) {
                var4.field3431[var5] = -4;
            } catch (Throwable var24) {
                var4.field3431[var5] = -5;
            }
        }
        class247.field3881.method1554(5257, var4);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
    public static final void method536(String arg0, String arg1, byte arg2, int arg3) {
        if (arg2 >= -50) {
            field1185 = 116;
        }
        field1198++;
        class35.method258(arg0, (String) null, -1, arg1, arg3, -1);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)[Lag;")
    public static final class197[] method537(byte arg0) {
        field1184++;
        class197[] var1 = new class197[class98.field1559];
        for (int var2 = 0; var2 < class98.field1559; var2++) {
            var1[var2] = new class2(class14.field295, class13.field272, class80.field1286[var2], class211.field3364[var2], class217.field3413[var2], class140.field2284[var2], class232.field3635[var2], class310.field5024);
        }
        if (arg0 >= -84) {
            method538(-99);
        }
        class180.method1265(44);
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)I")
    public static final int method538(int arg0) {
        field1196++;
        if (arg0 != -27785) {
            return -99;
        } else if (class251.field4131) {
            return 0;
        } else if (class143.method981(22351)) {
            return class33.field545 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIZIIII)V")
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field1191++;
        if (arg7 == ~class217.field3408.method101(false)) {
            class164.method1152(arg3, arg10, arg9, arg0, arg5, arg8, (byte) -110, arg4, arg2, arg1, arg6);
        } else if (class217.field3408.method101(false) <= 2) {
            class103.method736(arg6, arg10, arg2, 29, arg5, arg4, arg3, arg8, arg9, arg1, arg0);
        } else {
            class121.method833(arg5, arg4, arg0, arg6, arg10, arg2, arg9, class217.field3408.method101(false), arg1, arg3, arg8, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILgi;)V")
    public static final void method540(int arg0, class164 arg1) {
        field1194++;
        if (arg0 != 2) {
            method538(50);
        }
        field1190 = arg1;
    }
}
