import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class132 extends IOException {

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1633 = new String[] { method1154(method1153("pFtd[<")), method1154(method1153("pFtdZ<")), method1154(method1153("z[y&")), method1154(method1153("o\u0000;de")), method1154(method1153("pFtdY<")) };

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class132(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lbo;I)V")
    public static final void method1150(class801 arg0, int arg1) {
        try {
            field1631++;
            boolean var2 = false;
            arg0.method4911(121);
            for (class801 var3 = (class801) class520.field7588.method3932((byte) -28); var3 != null; var3 = (class801) class520.field7588.method3939((byte) -75)) {
                if (class269.method2206(arg0.method5775(105), var3.method5775(82), (byte) -113)) {
                    var2 = true;
                    class52.method559((byte) -29, arg0, var3);
                    break;
                }
            }
            if (arg1 == 0 && !var2) {
                class520.field7588.method3937(true, arg0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1633[1] + (arg0 == null ? field1633[2] : field1633[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BII)V")
    public static final void method1151(byte arg0, int arg1, int arg2) {
        try {
            if (class385.field5631 != 0) {
                if (arg1 >= 0) {
                    class604.field8671[arg1] = arg2;
                } else {
                    for (int var3 = 0; var3 < 16; var3++) {
                        class604.field8671[var3] = arg2;
                    }
                }
            }
            field1629++;
            class786.field11354.method3312(arg2, arg1, (byte) -101);
            if (arg0 != -78) {
                field1632 = -75;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1633[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method1152(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            field1630++;
            byte[] var4 = new byte[arg1];
            class569.method4247(arg3, arg0, var4, 0, arg1);
            return arg2 > -80 ? null : var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1633[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1633[2] : field1633[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1153(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1154(char[] arg0) {
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
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
