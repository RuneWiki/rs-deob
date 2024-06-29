import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class289 extends class319 {

    @OriginalMember(owner = "client!af", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field4090 = new String[] { method2351(method2350("0z{:8")), method2351(method2350("0z{98")), method2351(method2350("0z{;8")) };

    @OriginalMember(owner = "client!af", name = "I", descriptor = "Llc;")
    public static class608 field4086 = new class608();

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field4089 = 2;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "B")
    public byte field4087;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Ljc;")
    public class711 field4085;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)I", line = 7)
    public final int method2022(int arg0) {
        try {
            if (arg0 != 100) {
                return -16;
            } else {
                ++field4088;
                return this.field4085 == null ? 0 : this.field4085.field9945 * 100 / (this.field4085.field9996.length + -this.field4087);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4090[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)[B", line = 22)
    public final byte[] method2023(int arg0) {
        try {
            ++field4083;
            if (!super.field4364 && ~this.field4085.field9945 <= ~(this.field4085.field9996.length + -this.field4087)) {
                return arg0 != 97 ? null : this.field4085.field9996;
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4090[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "j", descriptor = "(I)V", line = 47)
    public static void method2349(int arg0) {
        try {
            if (arg0 != 19300) {
                field4086 = null;
            }
            field4086 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4090[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!af", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2350(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!af", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2351(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
