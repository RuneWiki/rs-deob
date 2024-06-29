import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class67 {

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field994 = new String[] { method711(method710("0ic{V")), method711(method710("0icyV")), method711(method710(".$c\u0016\u0003")), method711(method710(";\u007f!T")), method711(method710("0iczV")), method711(method710("0ic|V")) };

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lmv;")
    public static class125 field985 = new class125(78, -1);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
    public static boolean field988 = false;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "C")
    public char field990;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljc;II)V", line = 9)
    private final void method706(class711 arg0, int arg1, int arg2) {
        try {
            if (arg1 == 1) {
                this.field990 = class365.method2901((byte) 116, arg0.method5125((byte) 111));
            } else if (arg1 == 3) {
                this.field987 = arg0.method5116((byte) -127);
                this.field986 = arg0.method5128(0);
                this.field992 = arg0.method5128(0);
            }
            if (arg2 == 13569) {
                field989++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field994[5] + (arg0 == null ? field994[3] : field994[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLjc;)V", line = 39)
    public final void method707(byte arg0, class711 arg1) {
        try {
            field993++;
            while (true) {
                int var3 = arg1.method5128(arg0 ^ 0x47);
                if (var3 == 0) {
                    if (arg0 == 71) {
                        return;
                    } else {
                        this.field987 = -49;
                        return;
                    }
                }
                this.method706(arg1, var3, 13569);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field994[4] + arg0 + ',' + (arg1 == null ? field994[3] : field994[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 59)
    public static void method708(byte arg0) {
        try {
            field985 = null;
            int var1 = 29 / ((arg0 + 35) / 63);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field994[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z", line = 73)
    public static final boolean method709(int arg0, int arg1, int arg2) {
        try {
            if (arg2 != 3) {
                field988 = true;
            }
            field991++;
            return class324.method2564(arg1, arg0, 48) & class218.method1844(true, arg1, arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field994[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method710(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method711(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
