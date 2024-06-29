import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class640 {

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9302 = new String[] { method4699(method4698("\u0000.<\u0017\u0007\\")), method4699(method4698("\u0000.<\u0010\u0007\\")), method4699(method4698("\u000fe<{8")), method4699(method4698("\u0000.<\u0013\u0007\\")), method4699(method4698("\u001a>~9")), method4699(method4698("\u0000.<\u0016\u0007\\")), method4699(method4698("\u0000.<\u0011\u0007\\")) };

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Z")
    public static boolean field9291 = false;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lel;")
    public static class573 field9294 = new class573(59, 8);

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[F")
    public static float[] field9300 = new float[4];

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lvba;")
    public static class45 field9301;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lte;")
    public class640 field9295;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lte;")
    public class640 field9298;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZ)V", line = 3)
    public static final void method4693(int arg0, int arg1, boolean arg2) {
        try {
            if (arg1 != -13558) {
                field9291 = false;
            }
            field9293++;
            class651.method4784(arg2, true, class309.field4859.method2616(false, class167.field2300), arg0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9302[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILec;IIIILec;IIB)V", line = 15)
    public static final void method4694(int arg0, class247 arg1, int arg2, int arg3, int arg4, int arg5, class247 arg6, int arg7, int arg8, byte arg9) {
        try {
            field9297++;
            int var10 = arg6.method2100((byte) -104);
            if (var10 != -1) {
                if (arg9 != -69) {
                    method4695(21);
                }
                Object var11 = null;
                class581 var12 = (class581) class83.field928.method1558((byte) 96, (long) var10);
                if (var12 == null) {
                    class481[] var13 = class481.method3673(class383.field5798, var10, 0);
                    if (var13 == null) {
                        return;
                    }
                    var12 = class610.field8913.method487(var13[0], true);
                    class83.field928.method1556((long) var10, var12, 1);
                }
                class360.method2928(arg1.method2101(31463) * 256, arg4 >> 1, arg8, 0, arg1.field6200, arg1.field6211, arg1.field6197, 512, arg3, arg5 >> 1);
                int var14 = class694.field10139[0] + arg7 - 18;
                int var15 = arg0 / 4 * 18 + var14;
                int var16 = class694.field10139[1] + arg2 - 70;
                int var17 = arg0 % 4 * 18 + var16;
                var12.method4347(var15, var17);
                if (arg1 == arg6) {
                    class610.field8913.method580(var15 - 1, 18, -256, 18, var17 - 1, 1);
                }
                class758.method5495((byte) 50, var17 + 18, var17 - 1, var15 + 18, var15 + -1);
                class536 var18 = class128.method1114(false);
                var18.field7847 = arg6;
                var18.field7841 = var15 + 16;
                var18.field7846 = var17 + 16;
                var18.field7840 = var15;
                var18.field7845 = var17;
                class622.field9116.method4541((byte) -109, var18);
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field9302[3] + arg0 + ',' + (arg1 == null ? field9302[4] : field9302[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field9302[4] : field9302[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 70)
    public static void method4695(int arg0) {
        try {
            if (arg0 != -24672) {
                field9294 = null;
            }
            field9294 = null;
            field9301 = null;
            field9300 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9302[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 82)
    public final void method4696(int arg0) {
        try {
            field9299++;
            if (this.field9295 != null) {
                int var2 = 52 / ((-arg0 - 37) / 56);
                this.field9295.field9298 = this.field9298;
                this.field9298.field9295 = this.field9295;
                this.field9295 = null;
                this.field9298 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9302[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)I", line = 110)
    public static final int method4697(int arg0, int arg1, int arg2, int arg3) {
        try {
            field9296++;
            if (arg3 > 243) {
                arg1 >>= 0x4;
            } else if (arg3 > 217) {
                arg1 >>= 0x3;
            } else if (arg3 > 192) {
                arg1 >>= 0x2;
            } else if (arg3 > 179) {
                arg1 >>= 0x1;
            }
            if (arg2 != -1131410014) {
                method4697(-84, 41, 110, 74);
            }
            return ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg3 >> 1);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9302[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4698(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4699(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
