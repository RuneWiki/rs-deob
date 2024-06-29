import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class706 {

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10254 = new String[] { method5163(method5162("Ve3=l")), method5163(method5162("Eno\u0019\"Cin\u0014")), method5163(method5162("J\"3R9")), method5163(method5162("_yq\u0010")), method5163(method5162("Ve3>l")) };

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field10253 = -1;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lsg;B)I")
    public static final int method5160(class417 arg0, byte arg1) {
        try {
            field10251++;
            String var2 = class270.method2237(-69, arg0);
            int[] var3 = null;
            if (class83.method713(arg0.field6146, -50)) {
                var3 = class540.field7920.method5000((int) arg0.field6137, (byte) 116).field7734;
            } else if (arg0.field6145 != -1) {
                var3 = class540.field7920.method5000(arg0.field6145, (byte) 82).field7734;
            } else if (class473.method3592((byte) 126, arg0.field6146)) {
                class383 var6 = (class383) class207.field3184.method977((long) ((int) arg0.field6137), 1);
                if (var6 != null) {
                    class612 var7 = var6.field5799;
                    class496 var8 = var7.field8947;
                    if (var8.field7110 != null) {
                        var8 = var8.method3742(-1, class276.field4168);
                    }
                    if (var8 != null) {
                        var3 = var8.field7130;
                    }
                }
            } else if (class31.method207(arg0.field6146, false)) {
                Object var4 = null;
                class198 var5;
                if (arg0.field6146 == 1003) {
                    var5 = class417.field6144.method3030(0, (int) arg0.field6137);
                } else {
                    var5 = class417.field6144.method3030(0, (int) (arg0.field6137 >>> 32 & 0x7FFFFFFFL));
                }
                if (var5.field3017 != null) {
                    var5 = var5.method1764(class276.field4168, -174);
                }
                if (var5 != null) {
                    var3 = var5.field3065;
                }
            }
            if (arg1 > -67) {
                method5161((byte) -92);
            }
            if (var3 != null) {
                var2 = var2 + class584.method4361(13271, var3);
            }
            int var9 = class475.field6895.method4316(var2, class106.field1221, (byte) -98);
            if (arg0.field6148) {
                var9 += class604.field8852.method991() + 4;
            }
            return var9;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10254[4] + (arg0 == null ? field10254[3] : field10254[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static final void method5161(byte arg0) {
        try {
            field10252++;
            int var1 = 104 % ((69 - arg0) / 50);
            if (class64.field667 != class3.field17) {
                try {
                    class600.method4461(class43.field504, field10254[1], (byte) -68);
                } catch (Throwable var3) {
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10254[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5162(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5163(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
