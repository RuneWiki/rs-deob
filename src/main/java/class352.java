import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class352 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public int field5434 = -1;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5440 = new String[] { method2889(method2888("3\u0019\u0012c")), method2889(method2888("3\u0019\u0011c")) };

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Z")
    public static boolean field5427 = false;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
    public static int[] field5433 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public int field5429;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public int field5431;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public int field5436;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field5437;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 20)
    public static void method2886(int arg0) {
        try {
            if (arg0 != 2) {
                method2887(-39, -24, false);
            }
            field5433 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5440[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)I", line = 38)
    public static final int method2887(int arg0, int arg1, boolean arg2) {
        try {
            field5428++;
            if (!arg2) {
                field5433 = null;
            }
            byte var3;
            if (arg0 > 20000) {
                var3 = 4;
                class90.method771(-20247);
            } else if (arg0 > 10000) {
                class551.method4149(106);
                var3 = 3;
            } else if (arg0 > 5000) {
                class496.method3750(true);
                var3 = 2;
            } else {
                class176.method1545((byte) -91, true);
                var3 = 1;
            }
            if (class289.field4305.field812.method1610(false) != arg1) {
                class289.field4305.method655(17, arg1, class289.field4305.field834);
                class640.method4693(arg1, -13558, false);
            }
            class124.method1077(-3);
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5440[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2888(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!b", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2889(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
