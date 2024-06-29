import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class532 implements class412 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public int field7812;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7814 = new String[] { method3972(method3971("Ijw\u0002uqq+\u001ftE-")), method3972(method3971("Lp5\u001a")), method3972(method3971("Y+wXg")), method3972(method3971("IjwJsLl-H2")) };

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        try {
            field7813++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7814[0] + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 23)
    public class532(String arg0, int arg1) {
        try {
            this.field7812 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7814[3] + (arg0 == null ? field7814[1] : field7814[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3971(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3972(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
