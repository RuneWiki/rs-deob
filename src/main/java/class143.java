import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class143 {

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "J")
    public long field1720;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lrda;")
    private class690 field1718;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1724 = new String[] { method1217(method1216("\u001f\u001e#xw")), method1217(method1216("\u001f\u001e#\u00056\u0019\u0002y\u0007w")), method1217(method1216("\u0019\u001eaU")), method1217(method1216("\fE#\u0017\"")), method1217(method1216("\u001f\u001e#_6\u0019\naP%\u0012C")) };

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Lqha;")
    public static class112 field1719 = new class112(32);

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "[J")
    public static long[] field1722 = new long[256];

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "F")
    public static float field1721;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!hu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.field1718.method5052(-11984, this.field1720);
            field1717++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1724[4] + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method1215(byte arg0) {
        try {
            if (arg0 > 106) {
                field1719 = null;
                field1722 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1724[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lrda;JI)V")
    public class143(class690 arg0, long arg1, int arg2) {
        try {
            this.field1720 = arg1;
            this.field1718 = arg0;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1724[1] + (arg0 == null ? field1724[2] : field1724[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1722[var0] = var1;
        }
        field1723 = 0;
    }

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1216(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1217(char[] arg0) {
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
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
