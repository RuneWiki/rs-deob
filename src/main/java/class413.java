import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class413 {

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6574 = new String[] { method3304(method3303("abY*,")), method3304(method3303("ib\u001b\u0004")), method3304(method3303("|9YFy")), method3304(method3303("abY),")) };

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field6573 = 0;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[Ljava/lang/String;[I)V", line = 4)
    public static final void method3301(int arg0, String[] arg1, int[] arg2) {
        try {
            class139.method1293(24878, arg1, arg1.length - 1, arg2, arg0);
            field6570++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6574[0] + arg0 + ',' + (arg1 == null ? field6574[1] : field6574[2]) + ',' + (arg2 == null ? field6574[1] : field6574[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method3302(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field6571++;
            if (arg0 == 28131) {
                if (arg4 == 8 || arg4 == 16) {
                    for (int var5 = 0; var5 < class772.field11311; var5++) {
                        class781 var6 = class134.field1903[var5];
                        if (var6.field11405 == arg4 && var6.field11401 == arg3 && var6.field11394 == arg2 || var6.field11396 == arg3 && var6.field11394 == arg2) {
                            if (class772.field11311 != var5) {
                                class405.method3255(class134.field1903, var5 + 1, class134.field1903, var5, class134.field1903.length - var5 - 1);
                            }
                            class772.field11311--;
                            return;
                        }
                    }
                } else {
                    class290 var7 = class85.field1280[arg1][arg3][arg2];
                    if (var7 != null) {
                        if (arg4 == 1) {
                            var7.field4676 = 0;
                        } else if (arg4 == 2) {
                            var7.field4683 = 0;
                        }
                    }
                    class648.method4727(-123);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6574[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3303(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3304(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
