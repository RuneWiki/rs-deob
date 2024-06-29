import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class147 {

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2063 = new String[] { method1344(method1343("(-}=N")), method1344(method1343("?p}R\u001b")), method1344(method1343("=v?\u007f")), method1344(method1343("?p}Q\u001b")) };

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Z")
    public static boolean field2062 = true;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "D")
    public static double field2058;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IJ)V", line = 8)
    public static final void method1341(int arg0, long arg1) {
        try {
            field2060++;
            if (arg0 != 26301) {
                field2059 = -65;
            }
            class679.field9666.setTime(new Date(arg1));
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2063[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILoi;IIIIBLoi;I)V", line = 29)
    public static final void method1342(int arg0, int arg1, class77 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, class77 arg8, int arg9) {
        try {
            field2061++;
            int var10 = arg8.method799((byte) -86);
            if (var10 != -1) {
                Object var11 = null;
                class107 var12 = (class107) class320.field5210.method302(-110, (long) var10);
                if (var12 == null) {
                    class174[] var13 = class174.method1613(class550.field8065, var10, 0);
                    if (var13 == null) {
                        return;
                    }
                    var12 = class662.field9437.method213(var13[0], true);
                    class320.field5210.method295(false, (long) var10, var12);
                }
                class326.method2772(false, arg2.field9975, arg5, arg6 >> 1, arg1 >> 1, arg2.field9983, arg2.field9985, 0, arg0, arg2.method804(true) * 256);
                int var14 = class208.field3248[0] + arg3 - 18;
                int var15 = arg9 / 4 * 18 + var14;
                int var16 = class208.field3248[1] + arg4 - 70;
                int var17 = arg9 % 4 * 18 + var16;
                var12.method1001(var15, var17);
                if (arg2 == arg8) {
                    class662.field9437.method661(var17 - 1, -256, 18, 58, var15 - 1, 18);
                }
                class458.method3552(var17 - 1, var15 - -18, var17 + 18, var15 + -1, -63);
                if (arg7 <= 39) {
                    method1341(52, 32L);
                }
                class318 var18 = class453.method3517(-119);
                var18.field5183 = arg8;
                var18.field5185 = var15;
                var18.field5188 = var15 + 16;
                var18.field5187 = var17 + 16;
                var18.field5186 = var17;
                class239.field3688.method748(101, var18);
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field2063[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2063[2] : field2063[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field2063[2] : field2063[0]) + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1343(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1344(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
