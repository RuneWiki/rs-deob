import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class71 extends InputStream {

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1041 = new String[] { method749(method748("W:c5)")), method749(method748("W:c6)")), method749(method748("P,!\u001b")), method749(method748("EwcY|")), method749(method748("W:c\u0005d_=e")) };

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Z")
    public static boolean field1035 = false;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lsb;")
    public static class261 field1038 = new class261(52, 6);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1040 = -1;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B)[B", line = 4)
    public static final byte[] method746(int arg0, byte[] arg1) {
        try {
            int var2 = -103 / ((arg0 - 3) / 47);
            field1037++;
            class711 var3 = new class711(arg1);
            int var4 = var3.method5128(0);
            int var5 = var3.method5113(18443);
            if (var5 < 0 || class672.field9459 != 0 && class672.field9459 < var5) {
                throw new RuntimeException();
            } else if (var4 == 0) {
                byte[] var6 = new byte[var5];
                var3.method5117(var5, 0, var6, 59);
                return var6;
            } else {
                int var7 = var3.method5113(18443);
                if (var7 < 0 || class672.field9459 != 0 && class672.field9459 < var7) {
                    throw new RuntimeException();
                }
                byte[] var8 = new byte[var7];
                if (var4 == 1) {
                    class420.method3277(var8, var7, arg1, var5, 9);
                } else {
                    class179 var9 = class596.field8577;
                    synchronized (class596.field8577) {
                        class596.field8577.method1494(var3, var8, 10);
                    }
                }
                return var8;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1041[1] + arg0 + ',' + (arg1 == null ? field1041[2] : field1041[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 62)
    public static void method747(int arg0) {
        try {
            if (arg0 <= -48) {
                field1038 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1041[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ic", name = "read", descriptor = "()I", line = 82)
    public final int read() {
        try {
            class449.method3474(20817, 30000L);
            field1039++;
            return -1;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1041[4] + ')');
        }
    }

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method748(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method749(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
