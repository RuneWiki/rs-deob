import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class368 extends class232 {

    @OriginalMember(owner = "client!tu", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field5983 = new String[] { method3037(method3036(";<\u001cf)")), method3037(method3036(";<\u001cc)")), method3037(method3036(";<\u001ck)")) };

    @OriginalMember(owner = "client!tu", name = "H", descriptor = "Lhl;")
    public static class556 field5979 = new class556(5, -2);

    @OriginalMember(owner = "client!tu", name = "K", descriptor = "Z")
    public static boolean field5980 = false;

    @OriginalMember(owner = "client!tu", name = "J", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!tu", name = "G", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
    public static void method3034(int arg0) {
        try {
            field5979 = null;
            if (arg0 != 18451) {
                field5979 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5983[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            if (arg1 != 123) {
                this.method66(114, (byte) -68);
            }
            field5982++;
            return class788.field11518;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5983[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIB)V")
    public static final void method3035(int arg0, int arg1, byte arg2) {
        try {
            class116.field1695 = arg0 - class770.field11270;
            field5978++;
            if (arg2 >= 63) {
                class62.field822 = arg1 - class770.field11276;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5983[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
    public class368() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3036(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3037(char[] arg0) {
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
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
