import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class260 {

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3697 = new String[] { method2165(method2164("\u0017}v*s")), method2165(method2164("\u0017}v\u001f4(o*\u00025\u001c3")), method2165(method2164("\u0017}v)s")), method2165(method2164("\u0017}v(s")) };

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lvo;")
    public static class782 field3694 = null;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lu;")
    public static class741 field3692 = new class741(method2165(method2164("2U\f)\u001e/Z")), method2165(method2164("\u0014}>\u00028\u001e")), method2165(method2164("$r6\u001f9\u001eo9")), 6);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Z")
    public static boolean field3696 = false;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2161(byte arg0) {
        try {
            field3691++;
            if (class451.field6612.field9089.method5427(3) == 0 && class693.field9689 != class475.field6973) {
                class555.method4155(12, false, class427.field6145, class353.field5113, -5);
            } else {
                if (arg0 != 73) {
                    field3696 = false;
                }
                class616.method4539(class236.field3418, arg0 - 154);
                if (class693.field9689 != class184.field2381) {
                    class51.method553((byte) -59);
                }
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3697[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V", line = 28)
    public static final void method2162(int arg0, int arg1, int arg2) {
        try {
            field3695++;
            if (class349.field5060 != null && arg1 == 12) {
                int var3 = class419.field6030;
                int var4 = class559.field8137;
                class246.method2009(arg2, arg0, -20);
                if (class101.field1360 == 0) {
                    class785.field11337 = null;
                    class785.field11337 = class349.field5060.method134(class349.field5060.method179(class576.field8332, class5.field63), class349.field5060.method191(class576.field8332, class5.field63));
                } else if (class101.field1360 == 1 && (class637.field9013 == null || class419.field6030 != var3 || class559.field8137 != var4)) {
                    class637.field9013 = new class296[class559.field8137 * class419.field6030];
                    for (int var5 = 0; var5 < class637.field9013.length; var5++) {
                        class637.field9013[var5] = class349.field5060.method134(class349.field5060.method179(class567.field8258, class389.field5670), class349.field5060.method191(class567.field8258, class389.field5670));
                    }
                    class613.field8768 = 1;
                    class492.field7235 = new int[class559.field8137 * class419.field6030];
                }
                class710.field9925 = true;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3697[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 75)
    public static void method2163(int arg0) {
        try {
            field3692 = null;
            if (arg0 > -20) {
                method2163(87);
            }
            field3694 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3697[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;", line = 88)
    public final String toString() {
        try {
            field3693++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3697[1] + ')');
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V", line = 109)
    public class260(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2164(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2165(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
