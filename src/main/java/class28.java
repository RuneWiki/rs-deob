import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 {

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field351 = new String[] { method196(method195("b\fZ4R")), method196(method195("b\fZ7R")), method196(method195("pPZ[\u0007")), method196(method195("e\u000b\u0018\u0019")), method196(method195("b\fZ6R")) };

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[Z")
    public static boolean[] field345 = new boolean[5];

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field347 = 0;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field349 = 1;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "Z")
    public static boolean field344 = true;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "[[I")
    public static int[][] field350;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V", line = 3)
    public static final void method192(int arg0, int arg1, int arg2) {
        try {
            field346++;
            if (arg0 == -39) {
                if (class447.field6576 == class239.field3624) {
                    if (!class471.method3582(false, 0, arg2, 1, -2, arg1, 0, 1, 1)) {
                        class471.method3582(false, 0, arg2, 1, -3, arg1, 0, 1, 1);
                    }
                } else if (!class471.method3582(false, 0, arg2, arg0 + 40, -3, arg1, 0, 1, 1)) {
                    class471.method3582(false, 0, arg2, 1, -2, arg1, 0, 1, 1);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field351[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZILjava/lang/String;Ljava/lang/String;)V", line = 31)
    public static final void method193(boolean arg0, boolean arg1, int arg2, String arg3, String arg4) {
        try {
            if (!arg1) {
                class472.field6852 = -1;
            }
            field348++;
            class489.field7027 = arg3;
            class122.field1439 = arg4;
            class219.field3387 = arg0;
            class374.field5703 = arg1;
            if (!class374.field5703 && class122.field1439.equals("") || class489.field7027.equals("")) {
                class20.method134(false, 3);
            } else {
                class248.field3876 = false;
                if (class429.field6309 != 1) {
                    class562.field8355 = 0;
                    class470.field6826 = -1;
                }
                class20.method134(false, -3);
                class251.field3897 = arg2;
                class69.field735 = 0;
                class456.field6644 = 0;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field351[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field351[3] : field351[2]) + ',' + (arg4 == null ? field351[3] : field351[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 63)
    public static void method194(int arg0) {
        try {
            if (arg0 != -35) {
                method192(-2, -113, -85);
            }
            field345 = null;
            field350 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field351[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method195(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method196(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
