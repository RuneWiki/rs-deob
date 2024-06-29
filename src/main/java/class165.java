import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class165 {

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public int field2682 = -1;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2689 = new String[] { method1556(method1555("$1wX\u001c")), method1556(method1555("$1wY\u001c")), method1556(method1555("4kw5I")), method1556(method1555("!05w")) };

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "[I")
    public static int[] field2685 = new int[3];

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "Lvn;")
    public static class330 field2686 = new class330(15, 8);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public int field2683;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method1552(int arg0) {
        try {
            field2686 = null;
            if (arg0 != 255) {
                field2685 = null;
            }
            field2685 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2689[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Laba;Z)V")
    public static final void method1553(class185 arg0, boolean arg1) {
        for (int var2 = arg0.field2945; var2 <= arg0.field2940; var2++) {
            for (int var3 = arg0.field2946; var3 <= arg0.field2939; var3++) {
                class290 var4 = class85.field1280[arg0.field9975][var2][var3];
                if (var4 != null) {
                    class135 var5 = var4.field4670;
                    class135 var6 = null;
                    while (var5 != null) {
                        if (var5.field1911 == arg0) {
                            if (var6 == null) {
                                var4.field4670 = var5.field1912;
                            } else {
                                var6.field1912 = var5.field1912;
                            }
                            var5.method1266(500);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field1912;
                    }
                }
            }
        }
        if (!arg1) {
            class292.method2484(arg0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z[I[[B[BI[II[[B)I")
    public static final int method1554(boolean arg0, int[] arg1, byte[][] arg2, byte[] arg3, int arg4, int[] arg5, int arg6, byte[][] arg7) {
        try {
            field2677++;
            int var8 = arg5[arg6];
            int var9 = arg1[arg6] + var8;
            int var10 = arg5[arg4];
            int var11 = arg1[arg4] + var10;
            int var12 = var8;
            if (var8 < var10) {
                var12 = var10;
            }
            int var13 = var9;
            if (var11 < var9) {
                var13 = var11;
            }
            int var14 = arg3[arg6] & 0xFF;
            if (var14 > (arg3[arg4] & 0xFF)) {
                var14 = arg3[arg4] & 0xFF;
            }
            byte[] var15 = arg7[arg6];
            byte[] var16 = arg2[arg4];
            if (arg0) {
                return 51;
            }
            int var17 = var12 - var8;
            int var18 = var12 - var10;
            for (int var19 = var12; var19 < var13; var19++) {
                int var20 = var16[var18++] + var15[var17++];
                if (var14 > var20) {
                    var14 = var20;
                }
            }
            return -var14;
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field2689[1] + arg0 + ',' + (arg1 == null ? field2689[3] : field2689[2]) + ',' + (arg2 == null ? field2689[3] : field2689[2]) + ',' + (arg3 == null ? field2689[3] : field2689[2]) + ',' + arg4 + ',' + (arg5 == null ? field2689[3] : field2689[2]) + ',' + arg6 + ',' + (arg7 == null ? field2689[3] : field2689[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1555(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1556(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
