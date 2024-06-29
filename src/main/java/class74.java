import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class74 {

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1070 = new String[] { method769(method768("\u0016\u0006p7p")), method769(method768("\u0016\u0006p5p")), method769(method768("\u000e\u00152\u0018")), method769(method768("\u001bNpZ%")), method769(method768("\u0016\u0006p6p")) };

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lsb;")
    public static class261 field1063 = new class261(1, 4);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lsb;")
    public static class261 field1067 = new class261(83, -1);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "[Lgd;")
    public static class133[] field1069 = new class133[37];

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Llga;")
    public static class47 field1065;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (class335.field4844 <= arg6 - arg0 && arg6 + arg0 <= class507.field7453 && (arg1 - arg0) >= class557.field8113 && (arg0 + arg1) <= class50.field717) {
                class151.method1285(arg5, arg4, arg0, arg1, arg3, arg6, (byte) -123);
            } else {
                class330.method2593(arg1, 0, arg4, arg3, arg6, arg5, arg0);
            }
            field1066++;
            if (arg2 <= 108) {
                field1063 = null;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1070[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method766(int arg0) {
        try {
            field1063 = null;
            field1065 = null;
            field1067 = null;
            if (arg0 != 0) {
                field1068 = 9;
            }
            field1069 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1070[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method767(String arg0, int arg1, int arg2) {
        try {
            field1064++;
            class294 var3 = class146.method1261((long) arg1, 90, 3);
            var3.method2378(arg2 - 30714);
            if (arg2 != 30626) {
                field1065 = null;
            }
            var3.field4135 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1070[4] + (arg0 == null ? field1070[2] : field1070[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    static {
        new class574("", 76);
    }

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method768(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method769(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
