import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class87 extends class651 {

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1231 = new String[] { method869(method868("\b\u0012\u0010\u000e\f")), method869(method868("\b\u0012\u0010\u000f\f")), method869(method868("\b\u0012\u0010\r\f")) };

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Ltf;")
    public static class524 field1225 = new class524();

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lqo;")
    public class170 field1228;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method865(boolean arg0) {
        try {
            field1225 = null;
            if (!arg0) {
                field1225 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1231[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method866(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg2 <= 98) {
                method866(33, -127, -98, -8, -124);
            }
            field1230++;
            class294 var5 = class146.method1261((long) arg0 | (long) arg4 << 32, -43, 18);
            var5.method2378(-75);
            var5.field4136 = arg1;
            var5.field4133 = arg3;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1231[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
    public static final int method867(int arg0) {
        try {
            int var1 = -92 / ((18 - arg0) / 62);
            field1229++;
            return class298.field4155.method2229(-1324);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1231[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method868(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method869(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
