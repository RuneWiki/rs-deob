import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class794 extends class568 {

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "S")
    public short field11605;

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11609 = new String[] { method5709(method5708("5\u0019\n$vj")), method5709(method5708(",\u0005\u0007f")), method5709(method5708("9^E$J")), method5709(method5708("5\u0019\n$uj")), method5709(method5708("5\u0019\n$\u000b+\u001e\u0002~\tj")) };

    @OriginalMember(owner = "client!wia", name = "r", descriptor = "Lhl;")
    public static class556 field11600 = new class556(132, 10);

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "Z")
    public static boolean field11604 = true;

    @OriginalMember(owner = "client!wia", name = "t", descriptor = "[I")
    public static int[] field11606 = new int[250];

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field11607 = new String[100];

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "Lat;")
    public static class398 field11602 = new class398();

    @OriginalMember(owner = "client!wia", name = "s", descriptor = "I")
    public static int field11601;

    @OriginalMember(owner = "client!wia", name = "q", descriptor = "Lhk;")
    public static class107 field11608;

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "Lnp;")
    public static class518 field11603;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ld;ZLgda;)V", line = 12)
    public static final void method5706(class158 arg0, boolean arg1, class58 arg2) {
        try {
            class750.field11050 = arg2;
            if (!arg1) {
                field11602 = null;
            }
            class418.field6601 = arg0;
            field11601++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11609[3] + (arg0 == null ? field11609[1] : field11609[2]) + ',' + arg1 + ',' + (arg2 == null ? field11609[1] : field11609[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V", line = 25)
    public static void method5707(byte arg0) {
        try {
            field11607 = null;
            field11600 = null;
            field11608 = null;
            int var1 = 53 % ((arg0 - 62) / 47);
            field11603 = null;
            field11602 = null;
            field11606 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11609[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V", line = 39)
    public class794() {
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(S)V", line = 45)
    public class794(short arg0) {
        try {
            this.field11605 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11609[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5708(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5709(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
