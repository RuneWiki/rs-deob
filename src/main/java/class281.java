import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class281 extends class182 {

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4579 = new String[] { method2407(method2406("i\u00122F*")), method2407(method2406("|Ip\u0004")), method2407(method2406("yJ2)\u007f")) };

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "Z")
    public static boolean field4574 = false;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "Lrda;")
    public class693 field4577;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Z")
    public boolean field4575;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "[Lrp;")
    public class463[] field4578;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method2405(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            field4576++;
            int var5 = this.field4577.method3375(false);
            if (arg1 != 0) {
                return false;
            }
            if (this.field4578 != null) {
                for (int var6 = 0; var6 < this.field4578.length; var6++) {
                    this.field4578[var6].field7119 <<= var5;
                    if (this.field4578[var6].method3582(arg0, arg2) && this.field4577.method46(131072, arg2, arg0, arg3)) {
                        this.field4578[var6].field7119 >>= var5;
                        return true;
                    }
                    this.field4578[var6].field7119 >>= var5;
                }
            }
            return false;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4579[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4579[1] : field4579[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2406(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2407(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
