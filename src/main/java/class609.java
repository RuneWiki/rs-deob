import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class609 extends class206 {

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public int field8902;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8905 = new String[] { method4506(method4505("@\u0019\u001d$.\u0003")), method4506(method4505("@\u0019\u001d$SB\u001f\u0015~Q\u0003")), method4506(method4505("E\u0004\u0010f")), method4506(method4505("P_R$\u0012")), method4506(method4505("@\u0019\u001d$-\u0003")) };

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "[S")
    public static short[] field8900;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILcn;)V", line = 3)
    public static final void method4503(int arg0, class541 arg1) {
        try {
            if (arg0 >= 87) {
                field8903++;
                class541 var2 = class311.method2624(10616, arg1);
                int var3;
                int var4;
                if (var2 == null) {
                    var4 = class94.field1062;
                    var3 = class179.field2489;
                } else {
                    var3 = var2.field8029;
                    var4 = var2.field8045;
                }
                class547.method4123(var3, arg1, false, -2, var4);
                class484.method3688(var3, 2, var4, arg1);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8905[4] + arg0 + ',' + (arg1 == null ? field8905[2] : field8905[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 33)
    public static void method4504(int arg0) {
        try {
            if (arg0 != -28597) {
                method4503(-35, null);
            }
            field8900 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8905[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "()V", line = 45)
    public class609() {
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(I)V", line = 49)
    public class609(int arg0) {
        try {
            this.field8902 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8905[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4505(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4506(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 124;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
