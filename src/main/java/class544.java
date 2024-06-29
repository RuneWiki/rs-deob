import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class544 {

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public int field7999;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8012 = new String[] { method4047(method4046("\u0010fu+m'|)6l\u0013 ")), method4047(method4046("\u0010fu\u001e*")), method4047(method4046("\u0010fu\u001d*")), method4047(method4046("\u0010fuck\u001aa/a*")) };

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Ldn;")
    public static class544 field8000 = new class544(1);

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Ldn;")
    public static class544 field8001 = new class544(2);

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "Ldn;")
    public static class544 field8002 = new class544(4);

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Ldn;")
    public static class544 field8004 = new class544(1);

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Ldn;")
    public static class544 field8005 = new class544(2);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Ldn;")
    public static class544 field8006 = new class544(4);

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Ldn;")
    public static class544 field8007 = new class544(2);

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Ldn;")
    public static class544 field8008 = new class544(4);

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Lko;")
    public static class532 field8010 = new class532("", 19);

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "[B")
    public static byte[] field8011;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)V")
    public static final void method4044(int arg0, int arg1, boolean arg2) {
        try {
            field7998++;
            class454 var3 = class173.method1596(arg2, 13510, arg0);
            if (var3 != null) {
                if (arg1 != 22801) {
                    method4044(-31, -45, true);
                }
                var3.method4173(arg1 ^ 0xFFFFA6EE);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8012[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
    private class544(int arg0) {
        try {
            this.field7999 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8012[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method4045(byte arg0) {
        try {
            field8001 = null;
            field8011 = null;
            field8002 = null;
            field8005 = null;
            field8000 = null;
            field8004 = null;
            field8008 = null;
            if (arg0 == 73) {
                field8007 = null;
                field8010 = null;
                field8006 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8012[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field8003++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8012[0] + ')');
        }
    }

    static {
        int var0 = 0;
        field8011 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field8011[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4046(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4047(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
