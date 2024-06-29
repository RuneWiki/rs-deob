import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class570 {

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8275 = new String[] { method4252(method4251("\u000eX\u001fG0")), method4252(method4251("\u000eX\u001fD0")) };

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
    public static int[] field8265 = new int[2048];

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field8272 = -1;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public int field8269;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public int field8271;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public int field8274;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lqa;")
    public static class104 field8270;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Z")
    public boolean field8268;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    public boolean field8273;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I", line = 4)
    public static final int method4249(int arg0, int arg1, byte arg2) {
        try {
            field8267++;
            int var3 = 17 / ((-arg2 - 2) / 53);
            int var4 = arg0 * 57 + arg1;
            int var5 = var4 << 13 ^ var4;
            int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
            return (var6 & 0x7FEF25F) >> 19;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8275[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 33)
    public static void method4250(int arg0) {
        try {
            field8270 = null;
            field8265 = null;
            if (arg0 != -20933) {
                method4249(3, 59, (byte) 39);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8275[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4251(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4252(char[] arg0) {
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
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
