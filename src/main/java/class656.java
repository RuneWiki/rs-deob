import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class656 extends class202 {

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "S")
    public short field9299;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "S")
    public short field9298;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field9308 = new String[] { method4765(method4764("|\u0011\bx")), method4765(method4764("iJJ:\u0006")), method4765(method4764("~\u0003J\\::")), method4765(method4764("~\u0003JS::")), method4765(method4764("~\u0003JVS")), method4765(method4764("~\u0003JSS")), method4765(method4764("~\u0003J(\u0012|\r\u0010*S")), method4765(method4764("~\u0003J]::")), method4765(method4764("~\u0003JPS")) };

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field9307 = 999999;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method43(byte arg0) {
        try {
            ++field9306;
            int var2 = -77 % ((-37 - arg0) / 55);
            return class30.field385[(super.field2969 >> class179.field2328) - -class501.field7316 + -class269.field3812][(super.field2984 >> class179.field2328) + class501.field7316 + -class98.field1331];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9308[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBILrfa;ZILha;)V", line = 18)
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            int var8 = -44 % ((9 - arg1) / 35);
            ++field9300;
            throw new IllegalStateException();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9308[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9308[1] : field9308[0]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9308[1] : field9308[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIII)V", line = 27)
    public class656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            super.field2969 = arg0;
            super.field2981 = (byte) arg3;
            super.field2984 = arg2;
            super.field2971 = (byte) arg4;
            super.field2975 = arg1;
            this.field9299 = (short) arg5;
            this.field9298 = (short) arg6;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9308[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lha;B)Z", line = 41)
    public final boolean method45(class18 arg0, byte arg1) {
        try {
            if (arg1 >= -76) {
                this.field9298 = 109;
            }
            ++field9301;
            return class86.method861(super.field2971, this.method575(false), super.field2984 >> class179.field2328, (byte) -97, super.field2969 >> class179.field2328);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9308[2] + (arg0 != null ? field9308[1] : field9308[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)Z", line = 54)
    public final boolean method46(int arg0) {
        try {
            ++field9304;
            return arg0 >= -97;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9308[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B[Lta;)I", line = 66)
    public final int method41(byte arg0, class330[] arg1) {
        try {
            int var3 = 51 % ((45 - arg0) / 33);
            ++field9302;
            return this.method1732(super.field2969 >> class179.field2328, super.field2984 >> class179.field2328, arg1, 16);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9308[3] + arg0 + ',' + (arg1 != null ? field9308[1] : field9308[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V", line = 78)
    public final void method44(byte arg0) {
        try {
            ++field9303;
            if (arg0 > 111) {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9308[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4764(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 123);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4765(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
