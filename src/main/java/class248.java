import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class248 {

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3821 = new String[] { method2125(method2124("\u007fF!C\n<")), method2125(method2124("\u007fF!C\t<")) };

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2122(int arg0) {
        try {
            field3820++;
            if (!class481.field7319 && arg0 > 59) {
                class260.field3920 += (12.0F - class260.field3920) / 2.0F;
                class794.field11604 = true;
                class481.field7319 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3821[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(FFFIB)F", line = 30)
    public static final float method2123(float arg0, float arg1, float arg2, int arg3, byte arg4) {
        try {
            field3819++;
            float[] var5 = class467.field7176[arg3];
            if (arg4 > -101) {
                method2122(31);
            }
            return var5[2] * arg0 + var5[0] * arg1 + var5[1] * arg2;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3821[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2124(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2125(char[] arg0) {
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
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
