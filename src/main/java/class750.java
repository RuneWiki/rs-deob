import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class750 implements class105 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field11051;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11053 = new String[] { method5448(method5447(".\u0012J\u000e6")), method5448(method5447(".\u0012Jpw.\u0010\u0010r6")), method5448(method5447(".\u0012J\u000f6")), method5448(method5447(".\u0012J\r6")) };

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field11046;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field11047;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field11052;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lpja;")
    public static class40 field11048;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lgda;")
    public static class58 field11050;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lmk;")
    public static class59 field11049;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Lwh;")
    public final class155 method989(boolean arg0) {
        try {
            if (arg0) {
                return null;
            } else {
                field11047++;
                return class504.field7539;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11053[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method5445(byte arg0) {
        try {
            field11049 = null;
            field11048 = null;
            field11050 = null;
            if (arg0 != 105) {
                method5445((byte) 81);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11053[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static final void method5446(int arg0) {
        try {
            class683.field9892 = class185.field2943;
            field11046++;
            class42.field477 = -1;
            class193.field3048 = 1;
            String var1 = null;
            if (class210.field3329 != null) {
                class176 var2 = new class176(class210.field3329);
                var1 = class566.method4161(var2.method1658(-24862), -15453);
                class748.field11043 = var2.method1658(arg0 - 52609);
            }
            if (var1 == null) {
                class252.method2140(35, -128);
            } else {
                class442.method3466(true, "", 2116, false, var1);
                if (arg0 != 27747) {
                    method5446(76);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11053[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I)V")
    public class750(int arg0) {
        try {
            this.field11051 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11053[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5447(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5448(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
