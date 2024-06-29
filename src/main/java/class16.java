import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 extends class54 {

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field200 = new String[] { method117(method116("\\q\u001c\u0016\u0004")), method117(method116("\\q\u001c\u0011\u0004")), method117(method116("\\q\u001c\u0010\u0004")), method117(method116("\\q\u001c\u0012\u0004")), method117(method116("\\q\u001c\u0015\u0004")), method117(method116("\\q\u001c\u001a\u0004")), method117(method116("\\q\u001c\u0013\u0004")) };

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field194 = -1;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Lel;")
    public static class573 field189 = new class573(34, 4);

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Lwia;")
    public static class790 field196 = new class790(43, -1);

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "Ljava/lang/String;")
    public static String field198 = null;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field199 = 1;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "Z")
    public static boolean field197 = true;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field188;
            if (super.field589.method656(true)) {
                return 3;
            } else if (arg1 >= -106) {
                return -22;
            } else {
                return ~super.field589.field835.method1184(false) == -1 ? 3 : 1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field200[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)Z")
    public final boolean method110(int arg0) {
        try {
            ++field191;
            if (arg0 != -10243) {
                method114((byte) 31);
            }
            if (super.field589.method656(true)) {
                return false;
            } else {
                return super.field589.field835.method1184(false) != 0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field200[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lhia;)V")
    public class16(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                field189 = null;
            }
            ++field195;
            return 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field200[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(Z)I")
    public final int method112(boolean arg0) {
        try {
            if (arg0) {
                return -31;
            } else {
                ++field192;
                return super.field593;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field200[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(ILhia;)V")
    public class16(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                this.method113(-37, 58);
            }
            super.field593 = arg1;
            ++field193;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field200[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static void method114(byte arg0) {
        try {
            field198 = null;
            field189 = null;
            field196 = null;
            if (arg0 != 20) {
                method114((byte) -50);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field200[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (super.field589.method656(arg0)) {
                super.field593 = 0;
            }
            ++field190;
            if (super.field589.field835.method1184(false) == 0) {
                super.field593 = 0;
            }
            if (super.field593 < 0 || ~super.field593 < -3) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field200[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method116(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method117(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
