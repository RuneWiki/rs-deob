import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class426 {

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "I")
    public int field6271;

    @OriginalMember(owner = "client!hja", name = "f", descriptor = "I")
    public int field6279;

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6285 = new String[] { method3287(method3286(",M\fp\u0012-I\u0004*\u0010l")), method3287(method3286(",M\fpll")), method3287(method3286(",M\fpml")), method3287(method3286(",M\fpol")), method3287(method3286(",M\fpjl")) };

    @OriginalMember(owner = "client!hja", name = "l", descriptor = "I")
    public static int field6270 = 0;

    @OriginalMember(owner = "client!hja", name = "o", descriptor = "Lwia;")
    public static class790 field6281 = new class790(18, 8);

    @OriginalMember(owner = "client!hja", name = "k", descriptor = "Lel;")
    public static class573 field6283 = new class573(49, 8);

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!hja", name = "g", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!hja", name = "m", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "I")
    public int field6277;

    @OriginalMember(owner = "client!hja", name = "j", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!hja", name = "n", descriptor = "I")
    public int field6280;

    @OriginalMember(owner = "client!hja", name = "i", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!hja", name = "e", descriptor = "Lhja;")
    public class426 field6284;

    @OriginalMember(owner = "client!hja", name = "h", descriptor = "Lla;")
    public static class476 field6273;

    @OriginalMember(owner = "client!hja", name = "d", descriptor = "Lqq;")
    public class501 field6276;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IC)Z")
    public static final boolean method3282(int arg0, char arg1) {
        try {
            field6282++;
            if (arg0 != 49) {
                method3285(52);
            }
            if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
                return true;
            }
            if (arg1 != '\u0000') {
                char[] var2 = class118.field1403;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6285[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(B)Ldn;")
    public final class542 method3283(byte arg0) {
        try {
            if (arg0 != 53) {
                this.method3283((byte) 38);
            }
            field6278++;
            return class360.method2930(-33, this.field6271);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6285[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IB)Lhja;")
    public final class426 method3284(int arg0, byte arg1) {
        try {
            if (arg1 == 124) {
                field6275++;
                return new class426(this.field6271, arg0);
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6285[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)V")
    public static void method3285(int arg0) {
        try {
            if (arg0 != 0) {
                method3285(24);
            }
            field6283 = null;
            field6281 = null;
            field6273 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6285[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(II)V")
    public class426(int arg0, int arg1) {
        try {
            this.field6271 = arg0;
            this.field6279 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6285[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3286(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3287(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
