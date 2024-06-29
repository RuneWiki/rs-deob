import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class574 extends class46 {

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Z")
    public volatile boolean field8473 = true;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8480 = new String[] { method4287(method4286("uPWF'")), method4287(method4286("i\u0016W!r")), method4287(method4286("|M\u0015c")), method4287(method4286("uPWG'")), method4287(method4286("uPWH'")) };

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field8475 = 1;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Z")
    public boolean field8478;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Z")
    public boolean field8479;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[[B")
    public static byte[][] field8476;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)[B")
    public abstract byte[] method4281(byte arg0);

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method4282(int arg0) {
        try {
            int var1 = 103 / ((36 - arg0) / 38);
            field8476 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8480[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Lot;")
    public static final class616 method4283(int arg0) {
        try {
            field8477++;
            if (arg0 != 25252) {
                field8476 = null;
            }
            return class396.field5927;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8480[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method4284(byte arg0, String arg1, String arg2) {
        try {
            class429.field6309 = 1;
            class591.field8684 = -1;
            field8474++;
            class28.method193(false, false, 1, arg2, arg1);
            if (arg0 > -59) {
                field8475 = 88;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8480[0] + arg0 + ',' + (arg1 == null ? field8480[2] : field8480[1]) + ',' + (arg2 == null ? field8480[2] : field8480[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)I")
    public abstract int method4285(byte arg0);

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4286(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4287(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
