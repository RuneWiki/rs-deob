import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class134 {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    public static int[] field1999 = new int[13];

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[C")
    public static char[] field2004 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[[I")
    public static int[][] field2007 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[Lwn;")
    public static class77[] field2005;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[[B")
    public static byte[][] field2008;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[[[I")
    public static int[][][] field1997;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)Ljava/lang/String;", line = 5)
    public static final String method997(int arg0, byte arg1, int arg2) {
        field2000++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        }
        if (arg1 != 115) {
            method999(false, 54, -8);
        }
        if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 56)
    public static void method998(int arg0) {
        field2005 = null;
        field2004 = null;
        field1997 = null;
        if (arg0 <= -105) {
            field2007 = null;
            field2008 = null;
            field1999 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)V", line = 76)
    public static final void method999(boolean arg0, int arg1, int arg2) {
        field2003++;
        if (arg2 == -7) {
            class57 var3 = (class57) class30.field419.method837((byte) -72, (long) arg1);
            if (var3 != null) {
                var3.method1884(false);
            }
        }
    }
}
