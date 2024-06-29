import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class37 extends class770 {

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "[Ljava/lang/String;")
    private static final String[] field428 = new String[] { method368(method367("RIFK;")), method368(method367("K\u000fF$n")), method368(method367("RIFH;")), method368(method367("^T\u0004f")), method368(method367("RIFI;")) };

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "[Z")
    public static boolean[] field424 = new boolean[100];

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "Liha;")
    public static class29 field426 = new class29(4);

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "Lgda;")
    public static class58 field423;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JLgda;ZIIIB)V")
    public static final void method364(long arg0, class58 arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6) {
        try {
            int var8 = -91 / ((88 - arg6) / 35);
            field425++;
            class566.method4162(arg1, 0, arg2, arg4, 55, arg0, arg5, arg3);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field428[2] + arg0 + ',' + (arg1 == null ? field428[3] : field428[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method365(int arg0) {
        try {
            field423 = null;
            field424 = null;
            field426 = null;
            if (arg0 > -88) {
                method366(81, -101, 60, 69);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field428[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
    public static final void method366(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var8 = arg3 << arg0;
            int var6 = arg1 << 3;
            field422++;
            int var7 = arg2 << 3;
            if (class401.field6334 == 2) {
                class554.field8109 = var8;
                class134.field1902 = var7;
                class728.field10661 = var6;
            }
            class418.field6612 = var7;
            class29.field293 = var6;
            class610.method4447(-18418);
            class794.field11604 = true;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field428[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method367(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method368(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
