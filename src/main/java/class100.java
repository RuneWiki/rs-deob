import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class100 {

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1110 = new String[] { method829(method828("`D4\u0017T)")), method829(method828("`D4\u0017V)")), method829(method828("`D4\u0017W)")) };

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "[I")
    public static int[] field1107 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "[I")
    public static int[] field1105 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "[I")
    public static int[] field1109;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZI)Z")
    public static final boolean method825(boolean arg0, int arg1) {
        try {
            field1106++;
            for (class417 var2 = (class417) class728.field10549.method3863((byte) 64); var2 != null; var2 = (class417) class728.field10549.method3862(-353)) {
                if (class473.method3592((byte) 127, var2.field6146) && ((long) arg1) == var2.field6137) {
                    return true;
                }
            }
            if (!arg0) {
                method825(true, -66);
            }
            return false;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1110[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
    public static final void method826(int arg0) {
        try {
            if (field1109 == null || class713.field10336 == null) {
                field1109 = new int[256];
                class713.field10336 = new int[256];
                for (int var1 = 0; var1 < 256; var1++) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    field1109[var1] = (int) (Math.sin(var2) * 4096.0D);
                    class713.field10336[var1] = (int) (Math.cos(var2) * 4096.0D);
                }
            }
            field1108++;
            if (arg0 != 15667) {
                method826(-41);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1110[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V")
    public static void method827(byte arg0) {
        try {
            if (arg0 != 100) {
                field1107 = null;
            }
            field1107 = null;
            field1105 = null;
            field1109 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1110[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method828(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method829(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
