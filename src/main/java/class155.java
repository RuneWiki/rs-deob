import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class155 {

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "[C")
    public static char[] field2271 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "[[I")
    public static int[][] field2273 = new int[6][];

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
    public static final boolean method1104(int arg0, int arg1, int arg2) {
        field2270++;
        if (arg2 == 1376) {
            return (arg1 & 0x70000) != 0 | class355.method2034(arg1, arg0, arg2 ^ 0x560) || class639.method3564(arg0, arg1, 124);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lac;I)Ldv;")
    public static final class611 method1105(class501 arg0, int arg1) {
        field2274++;
        class611 var2 = new class611();
        var2.field8475 = arg0.method2845(-1);
        var2.field8477 = class213.field2984.method3922(var2.field8475, false);
        if (arg1 != 32) {
            field2271 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
    public static void method1106(boolean arg0) {
        if (arg0) {
            method1104(-100, -71, 95);
        }
        field2273 = null;
        field2271 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1107(long arg0, int arg1) {
        field2272++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = arg1;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class83.field1241[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Lln;")
    public static final class345 method1108(int arg0) {
        field2269++;
        if (arg0 != 14898) {
            return null;
        }
        try {
            return (class345) Class.forName("nh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class191();
        }
    }
}
