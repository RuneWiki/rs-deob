import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class240 {

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3466 = new String[] { method1990(method1989("O%S\u000bCT9\t\t\u0002")), method1990(method1989("O%Sv\u0002")), method1990(method1989("O%Su\u0002")), method1990(method1989("T%\u0011[")), method1990(method1989("A~S\u0019W")), method1990(method1989("O%SCEi$\u000f^D]x")), method1990(method1989("O%Ss\u0002")), method1990(method1989("O%Sr\u0002")), method1990(method1989("O%St\u0002")) };

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "[I")
    public static int[] field3465 = new int[4];

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IC)Z")
    public static final boolean method1984(int arg0, char arg1) {
        try {
            int var2 = -111 % ((arg0 + 32) / 36);
            field3458++;
            if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
                return true;
            }
            if (arg1 != '\u0000') {
                char[] var3 = class615.field8785;
                for (int var4 = 0; var4 < var3.length; var4++) {
                    char var5 = var3[var4];
                    if (arg1 == var5) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3466[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field3463++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3466[5] + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBIILha;III)V")
    public static final void method1985(int arg0, byte arg1, int arg2, int arg3, class18 arg4, int arg5, int arg6, int arg7) {
        try {
            field3462++;
            int var8 = -119 % ((arg1 - 1) / 33);
            arg4.method121(arg7, arg6, -119, arg3, arg5, arg0);
            arg4.method121(arg7 - 2, arg6 + 1, -109, 16, arg2, arg0 + 1);
            arg4.method241(arg3 - 19, arg0 + 18, arg2, -61, arg7 - 2, arg6 - -1);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3466[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3466[3] : field3466[4]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public static void method1986(int arg0) {
        try {
            if (arg0 == -161) {
                field3465 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3466[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/io/File;I)[B")
    public static final byte[] method1987(int arg0, File arg1, int arg2) {
        try {
            field3464++;
            if (arg2 > -71) {
                field3465 = null;
            }
            try {
                byte[] var3 = new byte[arg0];
                class143.method1234(arg0, var3, arg1, true);
                return var3;
            } catch (IOException var5) {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3466[2] + arg0 + ',' + (arg1 == null ? field3466[3] : field3466[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(II)V")
    public class240(int arg0, int arg1) {
        try {
            this.field3459 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3466[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)[Lmq;")
    public static final class657[] method1988(int arg0) {
        try {
            field3460++;
            return arg0 < 59 ? null : new class657[] { class121.field1529, class130.field1614, class731.field10446 };
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3466[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1989(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1990(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
