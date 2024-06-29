import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class635 {

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9121 = new String[] { method4607(method4606("u? J\u001e")), method4607(method4606("u? K\u001e")) };

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lvn;")
    public static class330 field9119 = new class330(75, -1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field9120 = 0;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Lia;")
    public abstract class616 method2666(int arg0);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method2662(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method4604(boolean arg0) {
        try {
            field9119 = null;
            if (arg0) {
                field9120 = 111;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9121[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Lmm;")
    public static final class292 method4605(int arg0, int arg1) {
        try {
            if (arg0 <= 101) {
                method4605(-61, -8);
            }
            field9118++;
            class292[] var2 = class721.method5239((byte) -84);
            for (int var3 = 0; var3 < var2.length; var3++) {
                class292 var4 = var2[var3];
                if (var4.field4692 == arg1) {
                    return var4;
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9121[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I")
    public abstract int method2667(int arg0, int arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
    public abstract void method2665(int arg0, byte arg1);

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4606(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4607(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
