import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class796 {

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public int field11572;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Ljava/lang/String;")
    public String field11574;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11579 = new String[] { method5744(method5743("Uf+\u00195")), method5744(method5743("Uf+/r`aw2sT=")), method5744(method5743("]`i7")), method5744(method5743("Uf+gt]|qe5")), method5744(method5743("H;+u`")), method5744(method5743("Uf+\u001a5")), method5744(method5743("Uf+\u00185")) };

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "[I")
    public static int[] field11576 = new int[4096];

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field11570;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field11571;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field11573;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field11575;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Llga;")
    public static class47 field11569;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "[I")
    public static int[] field11578;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "[[B")
    public static byte[][] field11577;

    @OriginalMember(owner = "client!fs", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        try {
            field11575++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11579[1] + ')');
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 22)
    public class796(String arg0, String arg1, int arg2) {
        try {
            this.field11572 = arg2;
            this.field11574 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11579[3] + (arg0 == null ? field11579[2] : field11579[4]) + ',' + (arg1 == null ? field11579[2] : field11579[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)I", line = 33)
    public static final int method5740(int arg0, int arg1) {
        try {
            if (arg0 >= -46) {
                return -48;
            }
            field11570++;
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field11579[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V", line = 57)
    public static final void method5741(int arg0) {
        try {
            class762.field10876.method2043(false);
            if (arg0 > -112) {
                field11569 = null;
            }
            field11571++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11579[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 68)
    public static void method5742(int arg0) {
        try {
            int var1 = 32 / ((20 - arg0) / 49);
            field11577 = null;
            field11569 = null;
            field11578 = null;
            field11576 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11579[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5743(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5744(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
