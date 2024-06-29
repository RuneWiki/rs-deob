import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class610 implements class285 {

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public int field8912;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8915 = new String[] { method4512(method4511("\u000f\u0007\u0011w\u0005")), method4512(method4511("\u0004D\u0011\u001aP")), method4512(method4511("\u0011\u001fSX")), method4512(method4511("\u000f\u0007\u0011v\u0005")), method4512(method4511("\u000f\u0007\u0011\bD\u0011\u0003K\n\u0005")), method4512(method4511("\u000f\u0007\u0011p\u0005")), method4512(method4511("\u000f\u0007\u0011u\u0005")), method4512(method4511("\u000f\u0007\u0011q\u0005")) };

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lef;")
    public static class513 field8911 = new class513();

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
    public static int[] field8914 = new int[14];

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lha;")
    public static class66 field8913;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
    public static boolean field8906;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLhaa;[[B)V", line = 7)
    public static final void method4507(byte arg0, class89 arg1, byte[][] arg2) {
        try {
            field8907++;
            if (arg0 == -117) {
                int[] var3 = new int[] { -1, 0, 0, 0, 0 };
                int var4 = arg2.length;
                for (int var5 = 0; var5 < var4; var5++) {
                    byte[] var6 = arg2[var5];
                    if (var6 != null) {
                        class163 var7 = new class163(var6);
                        int var8 = class752.field10938[var5] >> 8;
                        int var9 = class752.field10938[var5] & 0xFF;
                        int var10 = var8 * 64 - class494.field7101;
                        int var11 = var9 * 64 - class281.field4219;
                        class318.method2691(1);
                        arg1.method3351(var11, class429.field6298, class281.field4219, var10, (byte) -65, var7, class494.field7101);
                        arg1.method760(23657, var7, field8913, var11, var10, var3);
                        if (!arg1.field6424 && (class247.field3771 / 8) == var8 && class687.field9973 / 8 == var9 && var3[0] != -1) {
                            class492.field7061 = class596.field8739.method946(var3[2], arg0 ^ 0x729B, var3[3], var3[1], var3[0], class13.field162);
                            class559.field8329 = var3[4];
                        }
                    }
                }
                for (int var12 = 0; var12 < var4; var12++) {
                    int var13 = (class752.field10938[var12] >> 8) * 64 - class494.field7101;
                    int var14 = (class752.field10938[var12] & 0xFF) * 64 - class281.field4219;
                    byte[] var15 = arg2[var12];
                    if (var15 == null && class687.field9973 < 800) {
                        class318.method2691(1);
                        arg1.method3356(var14, 64, 64, var13, -20411);
                    }
                }
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field8915[0] + arg0 + ',' + (arg1 == null ? field8915[2] : field8915[1]) + ',' + (arg2 == null ? field8915[2] : field8915[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lwia;Lsa;B)Ltia;", line = 82)
    public static final class280 method4508(class790 arg0, class216 arg1, byte arg2) {
        try {
            field8908++;
            int var3 = -58 % ((-arg2 - 29) / 35);
            class280 var4 = class684.method5019((byte) 120);
            var4.field4195 = arg0;
            var4.field4203 = arg0.field11506;
            if (var4.field4203 == -1) {
                var4.field4197 = new class22(260);
            } else if (var4.field4203 == -2) {
                var4.field4197 = new class22(10000);
            } else if (var4.field4203 <= 18) {
                var4.field4197 = new class22(20);
            } else if (var4.field4203 > 98) {
                var4.field4197 = new class22(260);
            } else {
                var4.field4197 = new class22(100);
            }
            var4.field4197.method157((byte) 120, arg1);
            var4.field4197.method153(-2, var4.field4195.method5707((byte) -116));
            var4.field4200 = 0;
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8915[7] + (arg0 == null ? field8915[2] : field8915[1]) + ',' + (arg1 == null ? field8915[2] : field8915[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 116)
    public static void method4509(int arg0) {
        try {
            field8914 = null;
            field8913 = null;
            if (arg0 >= -38) {
                field8911 = null;
            }
            field8911 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8915[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lvaa;", line = 128)
    public final class494 method1226(int arg0) {
        try {
            field8910++;
            int var2 = 68 % ((57 - arg0) / 61);
            return class759.field11002;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8915[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lha;Z)V", line = 139)
    public static final void method4510(class66 arg0, boolean arg1) {
        try {
            if (arg1) {
                method4510(null, true);
            }
            field8909++;
            int var2 = 0;
            int var3 = 0;
            if (class235.field3549) {
                var2 = class398.method3141(1);
                var3 = class779.method5635((byte) 32);
            }
            int var4 = -10660793;
            class139.method1192((byte) 18, class371.field5655, -16777216, var4, class668.field9704 + var3, class476.field6905 + var2, arg0, class387.field5849);
            class269.field4100.method596(-1, 31, class309.field4871.method2616(arg1, class167.field2300), class668.field9704 + var3 + 14, var4, class476.field6905 + var2 + 3);
            int var5 = class606.field8875.method401(16428) + var2;
            int var6 = var3 + class606.field8875.method391((byte) 94);
            if (class514.field7425) {
                int var7 = 0;
                for (class655 var8 = (class655) class492.field7058.method4068(false); var8 != null; var8 = (class655) class492.field7058.method4072(-90)) {
                    int var9 = var7 * 16 + class668.field9704 + var3 + 31;
                    if (var8.field9459 == 1) {
                        class108.method952(0, class387.field5849, class476.field6905 + var2, class371.field5655, -256, var6, -1, var5, (class417) var8.field9457.field7916.field529, var9, arg0, class668.field9704 + var3);
                    } else {
                        class340.method2828(class387.field5849, var9, -10070, class668.field9704 + var3, -1, var5, var6, var8, class476.field6905 + var2, arg0, class371.field5655, -256);
                    }
                    var7++;
                }
                if (class381.field5783 != null) {
                    class139.method1192((byte) 18, class662.field9570, -16777216, var4, class80.field903, class348.field5390, arg0, class259.field3999);
                    int var10 = 0;
                    class269.field4100.method596(-1, 31, class381.field5783.field9460, class80.field903 + 14, var4, class348.field5390 + 3);
                    for (class417 var11 = (class417) class381.field5783.field9457.method4068(false); var11 != null; var11 = (class417) class381.field5783.field9457.method4072(-104)) {
                        int var12 = class80.field903 + var10 * 16 + 31;
                        class108.method952(0, class259.field3999, class348.field5390, class662.field9570, -256, var6, -1, var5, var11, var12, arg0, class80.field903);
                        var10++;
                    }
                    class321.method2721(class662.field9570, class80.field903, (byte) -86, class259.field3999, class348.field5390);
                }
            } else {
                int var13 = 0;
                for (class417 var14 = (class417) class728.field10549.method3863((byte) 64); var14 != null; var14 = (class417) class728.field10549.method3862(-353)) {
                    int var15 = (class593.field8707 - var13 - 1) * 16 + var3 + class668.field9704 + 31;
                    var13++;
                    class108.method952(0, class387.field5849, class476.field6905 + var2, class371.field5655, -256, var6, -1, var5, var14, var15, arg0, class668.field9704 + var3);
                }
            }
            class321.method2721(class371.field5655, class668.field9704 + var3, (byte) -82, class387.field5849, class476.field6905 + var2);
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field8915[5] + (arg0 == null ? field8915[2] : field8915[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V", line = 227)
    public class610(int arg0) {
        try {
            this.field8912 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8915[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4511(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4512(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
