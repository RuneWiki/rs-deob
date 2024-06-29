import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class518 extends class756 {

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7492 = new String[] { method3936(method3935("S\u001e!g")), method3936(method3935("FEc%7")), method3936(method3935("X\u001ccHb")), method3936(method3935("X\u001ccJb")), method3936(method3935("X\u001ccIb")) };

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "[I")
    public static int[] field7489 = new int[256];

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "Lel;")
    public static class573 field7491;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    private int field7488;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "Ljava/lang/String;")
    private String field7487;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7489[var0] = var1;
        }
        field7491 = new class573(88, 3);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lkp;I)V", line = 3)
    public final void method41(class514 arg0, int arg1) {
        try {
            if (arg1 != 9893) {
                method3934(74);
            }
            arg0.method3902(this.field7487, this.field7488, 105);
            field7490++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7492[2] + (arg0 == null ? field7492[0] : field7492[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLib;)V", line = 14)
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field7488 = arg1.method1453((byte) 120);
            if (arg0 <= 32) {
                this.field7487 = null;
            }
            field7486++;
            this.field7487 = arg1.method1423(91);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7492[4] + arg0 + ',' + (arg1 == null ? field7492[0] : field7492[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 26)
    public static void method3934(int arg0) {
        try {
            if (arg0 == -3301) {
                field7489 = null;
                field7491 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7492[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3935(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3936(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
