import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class310 extends class640 {

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4919 = new String[] { method2622(method2621("I\bc2W")), method2622(method2621("F@c]\u0002")), method2622(method2621("S\u001b!\u001f")) };

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "J")
    public static long field4916 = 0L;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Ldf;")
    public class420 field4915;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "Z")
    public boolean field4914;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "[Lng;")
    public class359[] field4918;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lha;IIZ)Z")
    public final boolean method2620(class66 arg0, int arg1, int arg2, boolean arg3) {
        try {
            field4917++;
            if (arg3) {
                this.method2620(null, -4, -45, true);
            }
            int var5 = this.field4915.method2346(1);
            if (this.field4918 != null) {
                for (int var6 = 0; var6 < this.field4918.length; var6++) {
                    this.field4918[var6].field5495 <<= var5;
                    if (this.field4918[var6].method2926(arg1, arg2) && this.field4915.method1091(arg2, arg1, arg0, (byte) -105)) {
                        this.field4918[var6].field5495 >>= var5;
                        return true;
                    }
                    this.field4918[var6].field5495 >>= var5;
                }
            }
            return false;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4919[0] + (arg0 == null ? field4919[2] : field4919[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2621(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2622(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
