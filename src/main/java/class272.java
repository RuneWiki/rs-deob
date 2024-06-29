import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class272 extends class46 {

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "[B")
    public byte[] field4125;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4128 = new String[] { method2254(method2253("\u0016I\u0012}+")), method2254(method2253("\u000b\u0004\u0012\u0015~")), method2254(method2253("\u001e_PW")), method2254(method2253("\u0016I\u0012\u0007j\u001eCH\u0005+")), method2254(method2253("\u0016I\u0012|+")) };

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lsda;")
    public static class271 field4122;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lqq;")
    public static class501 field4126;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V", line = 12)
    public static final void method2251(byte arg0, int arg1) {
        try {
            field4123++;
            if (arg0 != -89) {
                method2251((byte) 119, -66);
            }
            class313 var2 = class196.method1670((long) arg1, 14, -112);
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4128[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([B)V", line = 26)
    public class272(byte[] arg0) {
        try {
            this.field4125 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4128[3] + (arg0 == null ? field4128[2] : field4128[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V", line = 34)
    public static void method2252(boolean arg0) {
        try {
            if (!arg0) {
                method2252(false);
            }
            field4126 = null;
            field4122 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4128[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2253(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2254(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
