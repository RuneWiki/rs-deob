import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "Z")
    public boolean field133;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field135 = new String[] { method84(method83("\u0013\b_:>_")), method84(method83("\u0013\b_:@\u001e\u0007W`B_")), method84(method83("\u0013\b_:?_")), method84(method83("\u0013\b_:=_")) };

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "[I")
    public static int[] field127 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "Lvn;")
    public static class330 field128 = new class330(72, 3);

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "Lfk;")
    public class682 field130;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "Lfk;")
    public class682 field132;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "Z")
    public boolean field131;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public final void method80(int arg0) {
        try {
            if (this.field132 != null) {
                this.field132.method981(1328);
            }
            field134++;
            if (arg0 == 16383) {
                this.field131 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field135[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)Z")
    public final boolean method81(int arg0) {
        try {
            if (arg0 <= 85) {
                return true;
            } else {
                field129++;
                return this.field131 && !this.field133;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field135[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public static void method82(byte arg0) {
        try {
            int var1 = -82 % ((-arg0 - 25) / 63);
            field127 = null;
            field128 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field135[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Z)V")
    public class11(boolean arg0) {
        try {
            this.field133 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field135[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method83(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method84(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
