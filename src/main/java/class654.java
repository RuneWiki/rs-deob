import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class654 extends class518 {

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field9285 = new String[] { method4753(method4752("\u001fEV=q")), method4753(method4752("\u001fEV;q")), method4753(method4752("\u001fEV>q")) };

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "Ljava/lang/String;")
    public static String field9279 = null;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "[F")
    public static float[] field9284 = new float[16];

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "Llga;")
    public static class47 field9281;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "[Llt;")
    public static class182[] field9283;

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class654() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)V")
    public static void method4750(int arg0) {
        try {
            field9284 = null;
            field9279 = null;
            if (arg0 == 0) {
                field9283 = null;
                field9281 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9285[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)I")
    public static final int method4751(byte arg0, int arg1) {
        try {
            field9280++;
            if (arg0 != -65) {
                method4750(-47);
            }
            return arg1 >>> 8;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9285[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        try {
            int var3 = -48 / ((arg1 + 57) / 55);
            field9277++;
            return class393.field5718;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9285[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4752(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4753(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
