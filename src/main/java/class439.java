import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class439 {

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "[I")
    public int[] field6857;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[I")
    public int[] field6852;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "[I")
    public int[] field6853;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "[[F")
    public float[][] field6851;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6861 = new String[] { method3448(method3447("\u000f\u0013\nK`")), method3448(method3447("\u000f\u0013\n6!\u000f\u0014P4`")), method3448(method3447("\u000f\bHf")), method3448(method3447("\u001aS\n$5")), method3448(method3447("\u000f\u0013\nH`")) };

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Lvn;")
    public static class330 field6854 = new class330(67, 11);

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Z")
    public static boolean field6859 = false;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lat;")
    public static class398 field6858 = new class398();

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "[[I")
    public static int[][] field6860 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[Lmj;")
    public static class683[] field6856;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIBI)V")
    public static final void method3445(int arg0, int arg1, byte arg2, int arg3) {
        try {
            if (arg2 > -78) {
                method3446(-46);
            }
            field6855++;
            if (arg0 == 1006) {
                class598.method4382(class710.field10275, arg3, arg1);
            } else if (arg0 == 1008) {
                class598.method4382(class620.field8957, arg3, arg1);
                return;
            } else if (arg0 == 1011) {
                class598.method4382(class431.field6775, arg3, arg1);
                return;
            } else if (arg0 == 1012) {
                class598.method4382(class163.field2640, arg3, arg1);
                return;
            } else if (arg0 == 1004) {
                class598.method4382(class265.field4295, arg3, arg1);
                return;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6861[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method3446(int arg0) {
        try {
            field6858 = null;
            if (arg0 < 28) {
                field6856 = null;
            }
            field6860 = null;
            field6854 = null;
            field6856 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6861[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class439(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        try {
            this.field6857 = arg0;
            this.field6852 = arg2;
            this.field6853 = arg1;
            this.field6851 = arg3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6861[1] + (arg0 == null ? field6861[2] : field6861[3]) + ',' + (arg1 == null ? field6861[2] : field6861[3]) + ',' + (arg2 == null ? field6861[2] : field6861[3]) + ',' + (arg3 == null ? field6861[2] : field6861[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3447(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3448(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
