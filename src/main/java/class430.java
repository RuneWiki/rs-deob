import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class430 extends class685 {

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "Lcf;")
    public class196 field6239;

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6244 = new String[] { method3353(method3352("=@A\\$b")), method3353(method3352("=@A\\'b")), method3353(method3352("=@A\\%b")), method3353(method3352("$RL\u001e")), method3353(method3352("1\t\u000e\\\u001b")), method3353(method3352("=@A\\Z#II\u0006Xb")) };

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "Lsb;")
    public static class261 field6240 = new class261(81, 16);

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "Lsb;")
    public static class261 field6241 = new class261(87, 3);

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "Llga;")
    public static class47 field6237;

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "Llga;")
    public static class47 field6242;

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "[Lvo;")
    public static class782[] field6243;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public static void method3349(int arg0) {
        try {
            if (arg0 < -31) {
                field6240 = null;
                field6237 = null;
                field6241 = null;
                field6242 = null;
                field6243 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6244[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)Z")
    public static final boolean method3350(int arg0, int arg1) {
        try {
            if (arg0 != 14402) {
                field6242 = null;
            }
            field6236++;
            return arg1 == 9 || arg1 == 10;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6244[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(CI)I")
    public static final int method3351(char arg0, int arg1) {
        try {
            field6238++;
            if (arg0 >= '\u0000' && arg0 < class309.field4265.length) {
                return class309.field4265[arg0];
            } else if (arg1 == 3) {
                return -1;
            } else {
                return -66;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6244[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ljj;II[B)V")
    public class430(class334 arg0, int arg1, int arg2, byte[] arg3) {
        try {
            this.field6239 = arg0.method2675(arg2, false, arg3, class18.field235, (byte) -75, arg1);
            this.field6239.method1706(-18440, false, false);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6244[5] + (arg0 == null ? field6244[3] : field6244[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6244[3] : field6244[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ljj;II[I)V")
    public class430(class334 arg0, int arg1, int arg2, int[] arg3) {
        try {
            this.field6239 = arg0.method2613(arg1, 10, false, arg3, arg2);
            this.field6239.method1706(-18440, false, false);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6244[5] + (arg0 == null ? field6244[3] : field6244[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6244[3] : field6244[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3352(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3353(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
