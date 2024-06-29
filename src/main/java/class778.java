import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class778 {

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
    private int field11301;

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "Lpj;")
    private class157 field11297;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public int field11293;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public int field11294;

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11312 = new String[] { method5629(method5628("S.r-\u0005\f")), method5629(method5628("S.r-\u0006\f")), method5629(method5628("S.r-3K\u001agq.J.;")), method5629(method5628("S.r-{M'zwy\f")), method5629(method5628("J<\u007fo")), method5629(method5628("_g=-:")) };

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "Lwga;")
    public static class778 field11295 = new class778(0, 3, class157.field1956);

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "Lwga;")
    public static class778 field11300 = new class778(1, 3, class157.field1956);

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "Lwga;")
    public static class778 field11302 = new class778(2, 4, class157.field1952);

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "Lwga;")
    public static class778 field11303 = new class778(3, 1, class157.field1956);

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "Lwga;")
    public static class778 field11304 = new class778(4, 2, class157.field1956);

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "Lwga;")
    public static class778 field11305 = new class778(5, 3, class157.field1956);

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "Lwga;")
    public static class778 field11306 = new class778(6, 4, class157.field1956);

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
    public static int field11307 = class54.method410((byte) -60, 16);

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "Lwia;")
    public static class790 field11308 = new class790(19, 8);

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field11309 = -50;

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "[I")
    public static int[] field11311 = new int[6];

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
    public static int field11296;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field11298;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public static int field11299;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "J")
    public static long field11310;

    @OriginalMember(owner = "client!wga", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        try {
            field11296++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11312[2] + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IB)Lwga;", line = 17)
    public static final class778 method5626(int arg0, byte arg1) {
        try {
            int var2 = 17 % ((arg1 - 9) / 43);
            field11298++;
            if (arg0 == 0) {
                return field11295;
            } else if (arg0 == 1) {
                return field11300;
            } else if (arg0 == 2) {
                return field11302;
            } else if (arg0 == 3) {
                return field11303;
            } else if (arg0 == 4) {
                return field11304;
            } else if (arg0 == 5) {
                return field11305;
            } else if (arg0 == 6) {
                return field11306;
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11312[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V", line = 92)
    public static void method5627(int arg0) {
        try {
            field11304 = null;
            field11300 = null;
            field11311 = null;
            field11305 = null;
            field11308 = null;
            field11295 = null;
            if (arg0 > -109) {
                field11310 = 127L;
            }
            field11306 = null;
            field11303 = null;
            field11302 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11312[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(IILpj;)V", line = 119)
    private class778(int arg0, int arg1, class157 arg2) {
        try {
            this.field11301 = arg1;
            this.field11297 = arg2;
            this.field11293 = arg0;
            this.field11294 = this.field11297.field1946 * this.field11301;
            if (this.field11293 >= 16) {
                throw new RuntimeException();
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11312[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11312[4] : field11312[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5628(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5629(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
