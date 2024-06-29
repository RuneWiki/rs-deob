import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class134 {

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1565 = new String[] { method1148(method1147("BJ]+\r")), method1148(method1147("BJ],\r")) };

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lbda;")
    public static class531 field1562 = new class531();

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1563 = 0;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lel;")
    public static class573 field1564 = new class573(15, 0);

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Z")
    public abstract boolean method397(byte arg0);

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)Z")
    public final boolean method1145(byte arg0) {
        try {
            if (arg0 > -105) {
                return true;
            } else {
                field1560++;
                return this.method394(0) || this.method397((byte) -75) || this.method392(15);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1565[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)I")
    public abstract int method391(byte arg0);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)Lbk;")
    public abstract class394 method396(int arg0);

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)Z")
    public abstract boolean method392(int arg0);

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)Z")
    public abstract boolean method394(int arg0);

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
    public abstract void method403(int arg0);

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)V")
    public abstract void method400(byte arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method1146(int arg0) {
        try {
            if (arg0 >= 84) {
                field1562 = null;
                field1564 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1565[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)I")
    public abstract int method401(int arg0);

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1147(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1148(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
