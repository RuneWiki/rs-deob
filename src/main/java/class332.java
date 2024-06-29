import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class332 {

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5438 = new String[] { method2811(method2810("E'6t\u0010")), method2811(method2810("E'6w\u0010")), method2811(method2810("E'6z\u0010")), method2811(method2810("E'6{\u0010")), method2811(method2810("E'6u\u0010")) };

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field5430 = -60;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field5434;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public int field5437;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2805(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 != -42) {
                field5430 = -128;
            }
            field5431++;
            return (arg0 & 0x10) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5438[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Z")
    public final boolean method2806(byte arg0) {
        try {
            field5433++;
            if (arg0 < 37) {
                this.field5434 = 108;
            }
            return (this.field5435 & 0x8) != 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5438[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Z")
    public final boolean method2807(int arg0) {
        try {
            if (arg0 != -1) {
                this.method2809((byte) -118);
            }
            field5432++;
            return (this.field5435 & 0x4) != 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5438[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z")
    public final boolean method2808(byte arg0) {
        try {
            field5429++;
            if (arg0 <= 57) {
                return true;
            } else {
                return (this.field5435 & 0x2) != 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5438[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Z")
    public final boolean method2809(byte arg0) {
        try {
            if (arg0 < 66) {
                return true;
            } else {
                field5436++;
                return (this.field5435 & 0x1) != 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5438[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2810(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2811(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 50;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
