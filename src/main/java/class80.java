import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 {

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field910 = new String[] { method701(method700("7&X\u001f\u0002")), method701(method700("7&X\u001d\u0002")), method701(method700("7&X\u0018\u0002")), method701(method700("7&X\u001e\u0002")), method701(method700("7&X\u0019\u0002")) };

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[S")
    private static short[] field900 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "[S")
    private static short[] field899 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "[S")
    private static short[] field905 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[[S")
    public static short[][] field904 = new short[][] { field905, field900, field899 };

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lqq;")
    public static class501 field901;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Llk;")
    public static class613 field909;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[[[I")
    public static int[][][] field902;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "[[[Liia;")
    public static class96[][][] field907;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method695(int arg0) {
        try {
            field905 = null;
            field902 = null;
            if (arg0 == 6798) {
                field904 = null;
                field899 = null;
                field901 = null;
                field909 = null;
                field907 = null;
                field900 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field910[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
    public static final int method696(int arg0, int arg1, int arg2) {
        try {
            field898++;
            int var3 = arg2 >>> 31;
            return arg1 == -1 ? (arg2 + var3) / arg0 - var3 : -14;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field910[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public static final void method697(int arg0) {
        try {
            class478.field6955 = false;
            field908++;
            class649.method4771((byte) -73);
            if (arg0 != 0) {
                method696(-84, -102, -106);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field910[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static final void method698(int arg0) {
        try {
            field906++;
            class400.field5981 = arg0;
            class91.field1044 = arg0;
            class247.field3804 = arg0;
            class225.field3448 = arg0;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field910[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)Z")
    public static final boolean method699(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 6009) {
                field899 = null;
            }
            field897++;
            return (arg0 & 0xC580) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field910[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method700(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method701(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
