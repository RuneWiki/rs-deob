import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class154 extends class461 {

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "[C")
    public static char[] field2010 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "[[Z")
    public static boolean[][] field2011 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Lfm;")
    public static class279 field2013;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lns;")
    public class654 field2015;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BIIIIB)V")
    public static final void method1006(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2009++;
        if (arg2 >= arg1) {
            return;
        }
        int var6 = arg1 - arg2 >> 2;
        int var7 = arg2 + arg4;
        while (true) {
            var6--;
            if (var6 < 0) {
                if (arg5 >= -33) {
                    field2011 = null;
                }
                int var8 = arg1 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method1007(int arg0) {
        if (arg0 != 213) {
            field2011 = null;
        }
        field2011 = null;
        field2013 = null;
        field2010 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(JJ)J")
    public static long method1008(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
