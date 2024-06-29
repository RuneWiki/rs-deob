import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class58 {

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field623 = new String[] { method431(method430("~[\u001aa")), method431(method430("tCXN\u0003")), method431(method430("k\u0000X#V")), method431(method430("tCXL\u0003")), method431(method430("tCXI\u0003")), method431(method430("tCXO\u0003")) };

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field617 = -1;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Lwia;")
    public static class790 field619 = new class790(51, -1);

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Ljava/lang/String;")
    public static String field622;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[[[S")
    public static short[][][] field621;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 4)
    public static final byte[] method426(String arg0, byte arg1) {
        try {
            field616++;
            int var2 = arg0.length();
            if (var2 == 0) {
                return new byte[0];
            }
            int var3 = var2 + 3 & 0xFFFFFFFC;
            if (arg1 > -49) {
                return null;
            }
            int var4 = var3 / 4 * 3;
            if ((var3 - 2) >= var2 || class730.method5326(-1, arg0.charAt(var3 - 2)) == -1) {
                var4 -= 2;
            } else if ((var3 - 1) >= var2 || class730.method5326(-1, arg0.charAt(var3 - 1)) == -1) {
                var4--;
            }
            byte[] var5 = new byte[var4];
            class311.method2625(arg0, false, var5, 0);
            return var5;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field623[1] + (arg0 == null ? field623[0] : field623[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIII)V", line = 36)
    public static final void method427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field620++;
            class313 var5 = class196.method1670((long) arg2 << 32 | (long) arg3, arg0, -54);
            var5.method2636((byte) 85);
            var5.field4958 = arg4;
            var5.field4951 = arg1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field623[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 52)
    public static void method428(int arg0) {
        try {
            field619 = null;
            field622 = null;
            if (arg0 != -1) {
                method429(102, 55, -55);
            }
            field621 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field623[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method429(int arg0, int arg1, int arg2) {
        try {
            if (arg2 != 824) {
                method427(-110, -100, -60, -50, -76);
            }
            field618++;
            return (arg0 & 0x34) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field623[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method430(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method431(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
