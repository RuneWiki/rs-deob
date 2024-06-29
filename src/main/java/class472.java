import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class472 {

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7217 = new String[] { method3629(method3628("elc4%")), method3629(method3628("zo!\u0019")), method3629(method3628("elc7%")), method3629(method3628("o4c[p")) };

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field7215 = 0;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIIII)V")
    public static final void method3626(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field7216++;
            float var5 = (float) class770.field11272 / (float) class770.field11284;
            int var6 = arg2;
            int var7 = arg1;
            if ((var5 < 1.0F)) {
                var7 = (int) ((float) arg2 * var5);
            } else {
                var6 = (int) ((float) arg1 / var5);
            }
            int var11 = arg4 - (arg2 - var6) / 2;
            int var10 = arg3 - (arg1 - var7) / 2;
            class95.field1383 = class770.field11284 * var11 / var6;
            class317.field5174 = class770.field11272 - (class770.field11272 * var10 / var7);
            class62.field822 = -1;
            class116.field1695 = -1;
            if (arg0 <= 62) {
                method3626((byte) -5, 97, 68, -80, -1);
            }
            class130.method1239((byte) -86);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7217[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILgda;ZLjava/lang/String;)Lwm;")
    public static final class591 method3627(int arg0, class58 arg1, boolean arg2, String arg3) {
        try {
            field7214++;
            int var4 = arg1.method585(arg0 - 19522, arg3);
            if (var4 == -1) {
                return new class591(0);
            }
            int[] var5 = arg1.method601(var4, -128);
            class591 var6 = new class591(var5.length);
            if (arg0 != 19521) {
                return null;
            }
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field8571) {
                    class176 var9 = new class176(arg1.method604((byte) -120, var5[var8++], var4));
                    int var10 = var9.method1622(-18712);
                    int var11 = var9.method1687((byte) -89);
                    int var12 = var9.method1645((byte) -85);
                    if (!arg2 && var12 == 1) {
                        var6.field8571--;
                    } else {
                        var6.field8570[var7] = var10;
                        var6.field8568[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field7217[2] + arg0 + ',' + (arg1 == null ? field7217[1] : field7217[3]) + ',' + arg2 + ',' + (arg3 == null ? field7217[1] : field7217[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3628(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3629(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
