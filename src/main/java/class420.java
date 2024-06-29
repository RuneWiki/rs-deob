import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class420 extends class568 {

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Z")
    public boolean field6632 = false;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field6636 = -1;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6640 = new String[] { method3346(method3345("\u000e\u0011B6,\u0013\u001f\u00184m")), method3346(method3345("\u000e\u0011BKm")) };

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lvn;")
    public static class330 field6637 = new class330(12, 8);

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public int field6630;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field6631;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public int field6634;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public int field6635;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Z")
    public static boolean field6639;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3344(boolean arg0) {
        try {
            if (arg0) {
                field6638 = -99;
            }
            field6637 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6640[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V", line = 32)
    public class420(int arg0) {
        try {
            this.field6636 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6640[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3345(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3346(char[] arg0) {
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
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
