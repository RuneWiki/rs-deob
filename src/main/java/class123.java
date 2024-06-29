import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class123 extends class592 {

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "B")
    public byte field1556 = 5;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field1559 = new String[] { method1107(method1106("X\u00059p*")), method1107(method1106("B\u0003{]")), method1107(method1106("WX9\u001f\u007f")), method1107(method1106("X\u00059s*")) };

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "Lqt;")
    public static class269 field1553;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "Ljava/awt/Image;")
    public static Image field1554;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "Z")
    public boolean field1552;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        try {
            field1554 = null;
            if (arg0 != -20769) {
                field1554 = null;
            }
            field1553 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1559[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(FLkc;ZFIIIFIFF)[B")
    public static final byte[] method1105(float arg0, class734 arg1, boolean arg2, float arg3, int arg4, int arg5, int arg6, float arg7, int arg8, float arg9, float arg10) {
        try {
            field1555++;
            if (arg2) {
                byte[] var11 = new byte[arg5 * arg8 * arg4];
                class643.method4696(var11, arg5, 0, arg6, arg8, arg3, arg10, arg1, arg9, (byte) 109, arg7, arg4, arg0);
                return var11;
            } else {
                return null;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1559[0] + arg0 + ',' + (arg1 == null ? field1559[1] : field1559[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1106(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1107(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
