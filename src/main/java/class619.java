import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class619 {

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8950 = new String[] { method4527(method4526("\u0013\n\tJ-")), method4527(method4526("\u0013\n\tK-")) };

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "[I")
    public static int[] field8948 = new int[25];

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILqia;)Lqia;")
    public abstract class21 method39(int arg0, class21 arg1);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
    public static final boolean method4524(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 0) {
                field8948 = null;
            }
            field8947++;
            return (arg1 & 0x70000) != 0 | class356.method2946(52, arg2, arg1) || class639.method4622(arg2, (byte) -128, arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8950[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    public static void method4525(byte arg0) {
        try {
            field8948 = null;
            int var1 = -115 / ((-arg0 - 73) / 49);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8950[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4526(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4527(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
