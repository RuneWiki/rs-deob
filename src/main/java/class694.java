import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class694 {

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10141 = new String[] { method5074(method5073("W\u0010`D\u001b\u001e")), method5074(method5073("X\u0002m\u0006")), method5074(method5073("W\u0010`D\u0018\u001e")), method5074(method5073("MY/D$")) };

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
    public static int[] field10139 = new int[3];

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Lef;")
    public static class513 field10135 = new class513();

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public static int field10140 = 0;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public int field10130;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    public static int field10131;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public int field10132;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public int field10134;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public int field10136;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public int field10137;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public int field10138;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "[I")
    public static int[] field10133;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lpj;I)I")
    public static final int method5071(class157 arg0, int arg1) {
        try {
            field10131++;
            if (arg1 > -68) {
                field10139 = null;
            }
            if (class157.field1949 == arg0) {
                return 5120;
            } else if (class157.field1950 == arg0) {
                return 5122;
            } else if (class157.field1951 == arg0) {
                return 5124;
            } else if (class157.field1952 == arg0) {
                return 5121;
            } else if (class157.field1953 == arg0) {
                return 5123;
            } else if (class157.field1954 == arg0) {
                return 5125;
            } else if (class157.field1955 == arg0) {
                return 5131;
            } else if (class157.field1956 == arg0) {
                return 5126;
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10141[2] + (arg0 == null ? field10141[1] : field10141[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V")
    public static void method5072(byte arg0) {
        try {
            field10133 = null;
            field10135 = null;
            field10139 = null;
            if (arg0 >= -111) {
                method5071(null, 18);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10141[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5073(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5074(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
