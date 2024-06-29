import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class580 {

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "Lhca;")
    public class515 field8599 = new class515();

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8604 = new String[] { method4340(method4339("f\u0005_\u001bl")), method4340(method4339("b\u0007\u001d3")), method4340(method4339("f\u0005_\u001cl")), method4340(method4339("w\\_q9")), method4340(method4339("f\u0005_\u001el")), method4340(method4339("f\u0005_\u001dl")) };

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "J")
    public static long field8597 = 0L;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "Lel;")
    public static class573 field8600 = new class573(22, 6);

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "Lmca;")
    public static class33 field8601;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BZ)V", line = 5)
    public static final void method4335(byte arg0, boolean arg1) {
        try {
            field8598++;
            class727.method5304(class742.field10801, -1, class179.field2489, class94.field1062, arg1);
            int var2 = 61 / ((arg0 + 34) / 51);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8604[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "([BIB)[B", line = 16)
    public static final byte[] method4336(byte[] arg0, int arg1, byte arg2) {
        try {
            int var3 = 9 / ((47 - arg2) / 37);
            field8596++;
            byte[] var4 = new byte[arg1];
            class467.method3556(arg0, 0, var4, 0, arg1);
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8604[2] + (arg0 == null ? field8604[1] : field8604[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "([IIILju;)Ltaa;", line = 29)
    public static final class428 method4337(int[] arg0, int arg1, int arg2, class137 arg3) {
        try {
            field8602++;
            if (arg1 != -8812) {
                field8601 = null;
            }
            int[] var4 = null;
            int[] var5 = null;
            int[] var6 = null;
            float[][] var7 = null;
            if (arg3.field1620 != null) {
                int var8 = arg3.field1616;
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                int[] var11 = new int[var8];
                int[] var12 = new int[var8];
                int[] var13 = new int[var8];
                int[] var14 = new int[var8];
                for (int var15 = 0; var15 < var8; var15++) {
                    var9[var15] = Integer.MAX_VALUE;
                    var10[var15] = -2147483647;
                    var11[var15] = Integer.MAX_VALUE;
                    var12[var15] = -2147483647;
                    var13[var15] = Integer.MAX_VALUE;
                    var14[var15] = -2147483647;
                }
                var4 = new int[var8];
                var6 = new int[var8];
                var5 = new int[var8];
                for (int var16 = 0; var16 < arg2; var16++) {
                    int var17 = arg0[var16];
                    if (arg3.field1620[var17] != -1) {
                        int var18 = arg3.field1620[var17] & 0xFF;
                        for (int var19 = 0; var19 < 3; var19++) {
                            short var20;
                            if (var19 == 0) {
                                var20 = arg3.field1605[var17];
                            } else if (var19 == 1) {
                                var20 = arg3.field1628[var17];
                            } else {
                                var20 = arg3.field1589[var17];
                            }
                            int var21 = arg3.field1592[var20];
                            int var22 = arg3.field1595[var20];
                            int var23 = arg3.field1597[var20];
                            if (var21 < var9[var18]) {
                                var9[var18] = var21;
                            }
                            if (var10[var18] < var21) {
                                var10[var18] = var21;
                            }
                            if (var22 < var11[var18]) {
                                var11[var18] = var22;
                            }
                            if (var12[var18] < var22) {
                                var12[var18] = var22;
                            }
                            if (var13[var18] > var23) {
                                var13[var18] = var23;
                            }
                            if (var14[var18] < var23) {
                                var14[var18] = var23;
                            }
                        }
                    }
                }
                var7 = new float[var8][];
                for (int var24 = 0; var24 < var8; var24++) {
                    byte var25 = arg3.field1633[var24];
                    if (var25 > 0) {
                        var4[var24] = (var9[var24] + var10[var24]) / 2;
                        var5[var24] = (var11[var24] + var12[var24]) / 2;
                        var6[var24] = (var13[var24] + var14[var24]) / 2;
                        float var26;
                        float var27;
                        float var28;
                        if (var25 == 1) {
                            int var29 = arg3.field1594[var24];
                            if (var29 == 0) {
                                var26 = 1.0F;
                                var28 = 1.0F;
                            } else if (var29 <= 0) {
                                var28 = (float) (-var29) / 1024.0F;
                                var26 = 1.0F;
                            } else {
                                var28 = 1.0F;
                                var26 = (float) var29 / 1024.0F;
                            }
                            var27 = 64.0F / (float) arg3.field1603[var24];
                        } else if (var25 == 2) {
                            var27 = 64.0F / (float) arg3.field1603[var24];
                            var28 = 64.0F / (float) arg3.field1594[var24];
                            var26 = 64.0F / (float) arg3.field1588[var24];
                        } else {
                            var26 = (float) arg3.field1588[var24] / 1024.0F;
                            var27 = (float) arg3.field1603[var24] / 1024.0F;
                            var28 = (float) arg3.field1594[var24] / 1024.0F;
                        }
                        var7[var24] = class350.method2877(false, arg3.field1590[var24], arg3.field1607[var24], arg3.field1622[var24], var27, var28, var26, class291.method2359(arg3.field1606[var24], 255));
                    }
                }
            }
            return new class428(var4, var5, var6, var7);
        } catch (RuntimeException var31) {
            throw class759.method5498(var31, field8604[4] + (arg0 == null ? field8604[1] : field8604[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8604[1] : field8604[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 206)
    public static void method4338(int arg0) {
        try {
            field8600 = null;
            if (arg0 != 3692) {
                field8597 = 82L;
            }
            field8601 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8604[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4339(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4340(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
