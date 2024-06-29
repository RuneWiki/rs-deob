import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class490 {

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Liha;")
    private class29 field7389 = new class29(64);

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Lgda;")
    private class58 field7393;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7397 = new String[] { method3723(method3722("+\t\u0015\u0017r")), method3723(method3722("+\t\u0015\u0015r")), method3723(method3722("+\t\u0015o3&\bOmr")), method3723(method3722("&\u0014W?")), method3723(method3722("3O\u0015}'")), method3723(method3722("+\t\u0015\u0010r")), method3723(method3722("+\t\u0015\u0012r")), method3723(method3722("+\t\u0015\u0016r")), method3723(method3722("+\t\u0015\u0014r")) };

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lhl;")
    public static class556 field7391 = new class556(116, 0);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field7395 = 0;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[I")
    public static int[] field7396 = new int[3];

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILkc;[II)Lnn;")
    public static final class439 method3715(int arg0, class141 arg1, int[] arg2, int arg3) {
        try {
            field7394++;
            int[] var4 = null;
            int[] var5 = null;
            int[] var6 = null;
            float[][] var7 = null;
            if (arg3 <= 24) {
                field7395 = 36;
            }
            if (arg1.field2001 != null) {
                int var8 = arg1.field1968;
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
                var6 = new int[var8];
                for (int var16 = 0; var16 < arg0; var16++) {
                    int var17 = arg2[var16];
                    if (arg1.field2001[var17] != -1) {
                        int var18 = arg1.field2001[var17] & 0xFF;
                        for (int var19 = 0; var19 < 3; var19++) {
                            short var20;
                            if (var19 == 0) {
                                var20 = arg1.field1983[var17];
                            } else if (var19 == 1) {
                                var20 = arg1.field2002[var17];
                            } else {
                                var20 = arg1.field1969[var17];
                            }
                            int var21 = arg1.field2015[var20];
                            int var22 = arg1.field1967[var20];
                            int var23 = arg1.field1986[var20];
                            if (var21 < var9[var18]) {
                                var9[var18] = var21;
                            }
                            if (var10[var18] < var21) {
                                var10[var18] = var21;
                            }
                            if (var11[var18] > var22) {
                                var11[var18] = var22;
                            }
                            if (var22 > var12[var18]) {
                                var12[var18] = var22;
                            }
                            if (var23 < var13[var18]) {
                                var13[var18] = var23;
                            }
                            if (var14[var18] < var23) {
                                var14[var18] = var23;
                            }
                        }
                    }
                }
                var7 = new float[var8][];
                var5 = new int[var8];
                var4 = new int[var8];
                for (int var24 = 0; var24 < var8; var24++) {
                    byte var25 = arg1.field2007[var24];
                    if (var25 > 0) {
                        var4[var24] = (var9[var24] + var10[var24]) / 2;
                        var5[var24] = (var11[var24] + var12[var24]) / 2;
                        var6[var24] = (var13[var24] + var14[var24]) / 2;
                        float var26;
                        float var27;
                        float var28;
                        if (var25 == 1) {
                            int var29 = arg1.field1999[var24];
                            var28 = 64.0F / (float) arg1.field2010[var24];
                            if (var29 == 0) {
                                var27 = 1.0F;
                                var26 = 1.0F;
                            } else if (var29 <= 0) {
                                var27 = 1.0F;
                                var26 = (float) (-var29) / 1024.0F;
                            } else {
                                var27 = (float) var29 / 1024.0F;
                                var26 = 1.0F;
                            }
                        } else if (var25 == 2) {
                            var26 = 64.0F / (float) arg1.field1999[var24];
                            var27 = 64.0F / (float) arg1.field1963[var24];
                            var28 = 64.0F / (float) arg1.field2010[var24];
                        } else {
                            var28 = (float) arg1.field2010[var24] / 1024.0F;
                            var27 = (float) arg1.field1963[var24] / 1024.0F;
                            var26 = (float) arg1.field1999[var24] / 1024.0F;
                        }
                        var7[var24] = class662.method4803(var27, var26, class292.method2485(arg1.field1991[var24], 255), arg1.field1998[var24], var28, arg1.field1965[var24], arg1.field1970[var24], 116);
                    }
                }
            }
            return new class439(var4, var5, var6, var7);
        } catch (RuntimeException var31) {
            throw class590.method4333(var31, field7397[8] + arg0 + ',' + (arg1 == null ? field7397[3] : field7397[4]) + ',' + (arg2 == null ? field7397[3] : field7397[4]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII)Z")
    public static final boolean method3716(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != -86) {
                field7385 = -25;
            }
            field7387++;
            return class663.method4810(-1085436191, arg2, arg1) | (arg2 & 0x70000) != 0 || class639.method4622(arg1, (byte) -126, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7397[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILmha;Lmha;)V")
    public static final void method3717(int arg0, int arg1, int arg2, class438 arg3, class438 arg4) {
        class290 var5 = class438.method3442(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field4673 = arg3;
        var5.field4669 = arg4;
        int var6 = class757.field11125 == class740.field10902 ? 1 : 0;
        if (!arg3.method41((byte) 81)) {
            arg3.field9987 = class570.field8262[var6];
            class570.field8262[var6] = arg3;
        } else if (arg3.method45(-32768)) {
            arg3.field9987 = class50.field608[var6];
            class50.field608[var6] = arg3;
        } else {
            arg3.field9987 = class42.field476[var6];
            class42.field476[var6] = arg3;
            class540.field7961 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method41((byte) 111)) {
            if (arg4.method45(-32768)) {
                arg4.field9987 = class50.field608[var6];
                class50.field608[var6] = arg4;
                return;
            }
            arg4.field9987 = class42.field476[var6];
            class42.field476[var6] = arg4;
            class540.field7961 = true;
            return;
        }
        arg4.field9987 = class570.field8262[var6];
        class570.field8262[var6] = arg4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Luu;")
    public final class300 method3718(int arg0, int arg1) {
        try {
            field7388++;
            class29 var3 = this.field7389;
            class300 var4;
            synchronized (this.field7389) {
                var4 = (class300) this.field7389.method302(-124, (long) arg0);
                if (arg1 != -3292) {
                    this.field7393 = null;
                }
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field7393;
            byte[] var6;
            synchronized (this.field7393) {
                var6 = this.field7393.method604((byte) -127, arg0, 19);
            }
            class300 var7 = new class300();
            if (var6 != null) {
                var7.method2585(111, new class176(var6));
            }
            class29 var8 = this.field7389;
            synchronized (this.field7389) {
                this.field7389.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field7397[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Z")
    public static final boolean method3719(int arg0, int arg1) {
        try {
            field7386++;
            if (arg1 != 0) {
                method3716((byte) 127, -27, 19);
            }
            return arg0 == 0 || arg0 == 2;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7397[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method3720(int arg0) {
        try {
            field7396 = null;
            field7391 = null;
            if (arg0 != 64) {
                field7396 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7397[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)V")
    public static final void method3721(int arg0, int arg1) {
        try {
            class78.method819(5705);
            field7392++;
            int var2 = class531.field7801.method2074(arg0, 11651).field9332;
            if (arg1 != 15120) {
                field7385 = 28;
            }
            if (var2 != 0) {
                int var3 = class398.field6315.field5478[arg0];
                if (var2 == 5) {
                    class748.field11033 = var3;
                }
                if (var2 == 6) {
                    class457.field7058 = var3;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7397[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lpo;ILgda;)V")
    public class490(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field7393 = arg2;
            this.field7390 = this.field7393.method580(90, 19);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7397[2] + (arg0 == null ? field7397[3] : field7397[4]) + ',' + arg1 + ',' + (arg2 == null ? field7397[3] : field7397[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3722(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3723(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
