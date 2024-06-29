import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class400 extends class134 {

    @OriginalMember(owner = "client!fha", name = "r", descriptor = "J")
    private long field6327 = -1L;

    @OriginalMember(owner = "client!fha", name = "q", descriptor = "Ljava/lang/String;")
    private String field6323 = null;

    @OriginalMember(owner = "client!fha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6331 = new String[] { method3235(method3234("\u0015BEE\u001d")), method3235(method3234("\u0000\u0019\u0007\u0007")), method3235(method3234("\b\u0004\nE#F")), method3235(method3234("\b\u0004\nE$F")), method3235(method3234("\b\u0004\nE!F")) };

    @OriginalMember(owner = "client!fha", name = "v", descriptor = "S")
    public static short field6322 = 1;

    @OriginalMember(owner = "client!fha", name = "s", descriptor = "[Lkc;")
    public static class141[] field6328 = new class141[4];

    @OriginalMember(owner = "client!fha", name = "u", descriptor = "Lhl;")
    public static class556 field6325 = new class556(79, 0);

    @OriginalMember(owner = "client!fha", name = "w", descriptor = "Lhl;")
    public static class556 field6330 = new class556(104, 6);

    @OriginalMember(owner = "client!fha", name = "t", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!fha", name = "y", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!fha", name = "x", descriptor = "Lsj;")
    public static class486 field6321;

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "Ljava/applet/Applet;")
    public static Applet field6326;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILwq;)V")
    public final void method102(int arg0, class176 arg1) {
        try {
            field6324++;
            if (arg1.method1645((byte) -71) != 255) {
                arg1.field2799--;
                this.field6327 = arg1.method1658(-24862);
            }
            this.field6323 = arg1.method1666(-73);
            int var3 = -85 / ((83 - arg0) / 34);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6331[3] + arg0 + ',' + (arg1 == null ? field6331[1] : field6331[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lsca;I)V")
    public final void method100(class47 arg0, int arg1) {
        try {
            if (arg1 >= -81) {
                this.field6327 = 19L;
            }
            arg0.method473(this.field6327, this.field6323, 103);
            field6329++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6331[2] + (arg0 == null ? field6331[1] : field6331[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V")
    public static void method3233(byte arg0) {
        try {
            field6325 = null;
            field6330 = null;
            field6326 = null;
            int var1 = 70 % ((arg0 + 22) / 36);
            field6321 = null;
            field6328 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6331[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3234(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3235(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
