import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 {

    @OriginalMember(owner = "client!o", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field292 = new String[] { method287(method286("c_;~")), method287(method286("c_9~")) };

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public static int[] field290 = new int[32];

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
    public static final void method282(int arg0, int arg1, int arg2, int arg3) {
        class290 var4 = class85.field1280[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class438 var5 = var4.field4673;
        class438 var6 = var4.field4669;
        if (var5 != null) {
            var5.field6840 = (short) (var5.field6840 * arg3 / (0x10 << class165.field2688 - 7));
            var5.field6839 = (short) (var5.field6839 * arg3 / (0x10 << class165.field2688 - 7));
        }
        if (var6 != null) {
            var6.field6840 = (short) (var6.field6840 * arg3 / (0x10 << class165.field2688 - 7));
            var6.field6839 = (short) (var6.field6839 * arg3 / (0x10 << class165.field2688 - 7));
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method283(class192 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class757.field11125 != class740.field10902) {
            int var6 = class493.field7420[arg1].method2497((byte) -97, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class293 var8 = class493.field7420[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2497((byte) -86, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method716(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method714(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public static final void method284(int arg0, int arg1) {
        try {
            field291++;
            class153.field2137 = arg0;
            class750.field11052 = 3;
            class581.field8367 = -1;
            class188.field2980 = arg1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field292[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method285(int arg0) {
        try {
            if (arg0 == 1000) {
                field290 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field292[1] + arg0 + ')');
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field290[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!o", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method286(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!o", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method287(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 31;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
