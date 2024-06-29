import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class225 extends class46 {

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
    public int field3442 = 0;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field3449 = new String[] { method1953(method1952("\u000fkq\\gD")), method1953(method1952("\u0017 >\\P")), method1953(method1952("\u000fkq\\dD")), method1953(method1952("\u0002{|\u001e")), method1953(method1952("\u000fkq\\jD")), method1953(method1952("\u000fkq\\eD")), method1953(method1952("\u000fkq\\kD")) };

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "Lel;")
    public static class573 field3445 = new class573(114, 2);

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
    public static int field3447 = 0;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "Lic;")
    public static class726 field3446;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method1947(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == 55) {
                field3444++;
                return (arg2 & 0x37) != 0;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3449[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lib;I)V", line = 17)
    public final void method1948(class163 arg0, int arg1) {
        try {
            field3441++;
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    if (arg1 == 0) {
                        return;
                    } else {
                        field3443 = 77;
                        return;
                    }
                }
                this.method1950(var3, (byte) 124, arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3449[6] + (arg0 == null ? field3449[3] : field3449[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1949(int arg0) {
        try {
            class156.field1943 = -2;
            class684.field9918 = -2;
            class251.field3897 = 0;
            field3440++;
            if (arg0 > -49) {
                method1949(4);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3449[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IBLib;)V", line = 59)
    private final void method1950(int arg0, byte arg1, class163 arg2) {
        try {
            if (arg0 == 2) {
                this.field3442 = arg2.method1445((byte) 105);
            }
            if (arg1 > 112) {
                field3439++;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3449[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3449[3] : field3449[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(B)V", line = 84)
    public static void method1951(byte arg0) {
        try {
            field3445 = null;
            if (arg0 != -31) {
                field3447 = 32;
            }
            field3446 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3449[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1952(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1953(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
