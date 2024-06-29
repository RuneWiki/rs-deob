import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class125 {

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1577 = new String[] { method1120(method1119("\u001ciV\u001f}")), method1120(method1119("\u001ciV\u001c}")), method1120(method1119("\u001ciV\u001d}")), method1120(method1119("\u001ciV\u001a}")), method1120(method1119("\u001ciVb<\u001fv\f`}")), method1120(method1119("\u001ciV*:\"k\n7;\u00167")) };

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "[[B")
    public static byte[][] field1576;

    @OriginalMember(owner = "client!mv", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        try {
            field1571++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1577[5] + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V", line = 11)
    public static void method1114(boolean arg0) {
        try {
            if (arg0) {
                method1117(-52, 37, 106);
            }
            field1576 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1577[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lpi;)V", line = 21)
    public static final void method1115(class217 arg0) {
        class80.field1125 = arg0;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIIIIII)V", line = 27)
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            if (arg4 == 19) {
                field1573++;
                class376.field5495[class740.field10526++] = new class182(arg6, arg8, arg2, arg0, arg0, arg2, arg7, arg3, arg3, arg7, arg5, arg5, arg1, arg1);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field1577[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)V", line = 40)
    public static final void method1117(int arg0, int arg1, int arg2) {
        try {
            field1572++;
            class294 var3 = class146.method1261((long) arg2 | (long) arg0 << 32, -32, 19);
            var3.method2376(127);
            if (arg1 != -3239) {
                method1115(null);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1577[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)I", line = 54)
    public final int method1118(byte arg0) {
        try {
            if (arg0 >= -55) {
                method1116(69, -43, -95, -122, 14, -84, -12, -105, -79);
            }
            field1570++;
            return this.field1574;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1577[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(II)V", line = 68)
    public class125(int arg0, int arg1) {
        try {
            this.field1575 = arg1;
            this.field1574 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1577[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1119(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1120(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
