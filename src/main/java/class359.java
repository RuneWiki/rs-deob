import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class359 {

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5225 = new String[] { method2872(method2871("J!<k`")), method2872(method2871("J!<h`")) };

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lmv;")
    public static class125 field5216 = new class125(71, -1);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field5223 = -60;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Z")
    public static boolean field5224 = false;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "B")
    public byte field5220;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Ljava/lang/String;")
    public String field5215;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljava/lang/String;")
    public String field5218;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Ljava/lang/String;")
    public String field5219;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/lang/String;")
    public String field5221;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
    public static int[] field5217;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method2869(int arg0) {
        try {
            int var1 = 98 % ((-arg0 - 45) / 58);
            field5216 = null;
            field5217 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5225[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIII)I")
    public static final int method2870(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field5214++;
            if (class511.field7506 < 100) {
                return -2;
            }
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = arg2 - class534.field7745;
            int var7 = arg1 - class534.field7751;
            class353 var8 = (class353) class534.field7732.method3977((byte) -48);
            if (arg0 <= 74) {
                return -79;
            }
            while (var8 != null) {
                if (var8.field5108 == arg3) {
                    int var9 = var8.field5110;
                    int var10 = var8.field5117;
                    int var11 = class534.field7745 + var9 << 14 | class534.field7751 + var10;
                    int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                    if (var4 < 0 || var12 < var5) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
                var8 = (class353) class534.field7732.method3987(0);
            }
            return var4;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5225[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2871(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2872(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
