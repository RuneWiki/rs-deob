import java.io.File;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class447 {

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6573 = new String[] { method3471(method3470("|_z\u001fW")), method3471(method3470("w\u0015zs\u0002")), method3471(method3470("bN81")), method3471(method3470("|_z\u001cW")) };

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field6568 = 0;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field6567 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lu;")
    public static class741 field6570;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6571;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field6572;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI[ILrha;)Lak;")
    public static final class126 method3468(byte arg0, int arg1, int[] arg2, class60 arg3) {
        try {
            field6569++;
            int[] var4 = null;
            if (arg0 <= 26) {
                field6567 = 113;
            }
            int[] var5 = null;
            int[] var6 = null;
            float[][] var7 = null;
            if (arg3.field898 != null) {
                int var8 = arg3.field920;
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
                var7 = new float[var8][];
                for (int var16 = 0; var16 < arg1; var16++) {
                    int var17 = arg2[var16];
                    if (arg3.field898[var17] != -1) {
                        int var18 = arg3.field898[var17] & 0xFF;
                        for (int var19 = 0; var19 < 3; var19++) {
                            short var20;
                            if (var19 == 0) {
                                var20 = arg3.field914[var17];
                            } else if (var19 == 1) {
                                var20 = arg3.field889[var17];
                            } else {
                                var20 = arg3.field900[var17];
                            }
                            int var21 = arg3.field905[var20];
                            int var22 = arg3.field921[var20];
                            int var23 = arg3.field918[var20];
                            if (var9[var18] > var21) {
                                var9[var18] = var21;
                            }
                            if (var21 > var10[var18]) {
                                var10[var18] = var21;
                            }
                            if (var22 < var11[var18]) {
                                var11[var18] = var22;
                            }
                            if (var22 > var12[var18]) {
                                var12[var18] = var22;
                            }
                            if (var13[var18] > var23) {
                                var13[var18] = var23;
                            }
                            if (var23 > var14[var18]) {
                                var14[var18] = var23;
                            }
                        }
                    }
                }
                var5 = new int[var8];
                for (int var24 = 0; var24 < var8; var24++) {
                    byte var25 = arg3.field922[var24];
                    if (var25 > 0) {
                        var4[var24] = (var9[var24] + var10[var24]) / 2;
                        var5[var24] = (var11[var24] + var12[var24]) / 2;
                        var6[var24] = (var13[var24] + var14[var24]) / 2;
                        float var27;
                        float var28;
                        float var29;
                        if (var25 == 1) {
                            int var26 = arg3.field907[var24];
                            var27 = 64.0F / (float) arg3.field912[var24];
                            if (var26 == 0) {
                                var28 = 1.0F;
                                var29 = 1.0F;
                            } else if (var26 > 0) {
                                var28 = 1.0F;
                                var29 = (float) var26 / 1024.0F;
                            } else {
                                var29 = 1.0F;
                                var28 = (float) (-var26) / 1024.0F;
                            }
                        } else if (var25 == 2) {
                            var28 = 64.0F / (float) arg3.field907[var24];
                            var27 = 64.0F / (float) arg3.field912[var24];
                            var29 = 64.0F / (float) arg3.field877[var24];
                        } else {
                            var27 = (float) arg3.field912[var24] / 1024.0F;
                            var29 = (float) arg3.field877[var24] / 1024.0F;
                            var28 = (float) arg3.field907[var24] / 1024.0F;
                        }
                        var7[var24] = class443.method3450(arg3.field909[var24], var27, class434.method3377(255, arg3.field917[var24]), var29, var28, 0, arg3.field891[var24], arg3.field899[var24]);
                    }
                }
            }
            return new class126(var4, var5, var6, var7);
        } catch (RuntimeException var31) {
            throw class665.method4799(var31, field6573[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6573[2] : field6573[1]) + ',' + (arg3 == null ? field6573[2] : field6573[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method3469(int arg0) {
        try {
            field6571 = null;
            field6572 = null;
            if (arg0 <= -68) {
                field6570 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6573[0] + arg0 + ')');
        }
    }

    static {
        new BitSet(65536);
        field6570 = new class741(method3471(method3470("[o\u0005\u001c")), method3471(method3470("c]24\u001ci")), method3471(method3470("SJ5")), 2);
        String var0 = method3471(method3470("YU?3\u0010{U"));
        try {
            var0 = System.getProperty(method3471(method3470("fZ\"<Qz^:9\u0010~"))).toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = method3471(method3470("YU?3\u0010{U"));
        try {
            var1 = System.getProperty(method3471(method3470("fZ\"<Qz^&.\u0016cU"))).toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = method3471(method3470("YU?3\u0010{U"));
        try {
            var2 = System.getProperty(method3471(method3470("cHz3\u001ea^"))).toLowerCase();
        } catch (Exception var9) {
        }
        field6571 = var2.toLowerCase();
        String var3 = method3471(method3470("YU?3\u0010{U"));
        try {
            var3 = System.getProperty(method3471(method3470("cHz<\roS"))).toLowerCase();
        } catch (Exception var8) {
        }
        field6572 = var3.toLowerCase();
        String var4 = method3471(method3470("YU?3\u0010{U"));
        try {
            var4 = System.getProperty(method3471(method3470("cHz+\u001a~H=2\u0011"))).toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = method3471(method3470("r\u0014"));
        try {
            var5 = System.getProperty(method3471(method3470("yH1/QdT98"))).toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3470(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3471(char[] arg0) {
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
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
