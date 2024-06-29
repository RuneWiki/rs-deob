import java.awt.Font;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class191 {

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public int field2866 = -1;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[[I")
    public static int[][] field2862 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2859 = " from your friend list first.";

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Ljava/util/Random;")
    public static Random field2858 = new Random();

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Ltb;")
    public static class220 field2865 = null;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lul;")
    public class217 field2861;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field2864;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "[I")
    public int[] field2860;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field2867;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 11)
    public static final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2863++;
        class128 var13 = new class128();
        var13.field2023 = arg9;
        var13.field2007 = arg8;
        var13.field2026 = arg0;
        var13.field2014 = arg3;
        var13.field2003 = arg11;
        var13.field2019 = arg12;
        var13.field2013 = arg6;
        var13.field2005 = arg5;
        var13.field2017 = arg4;
        var13.field2010 = arg1;
        var13.field2006 = arg7;
        int var14 = 17 / ((arg10 + 70) / 49);
        var13.field2018 = arg2;
        class288.field4483.method632(-118, var13);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I[J[I)V", line = 35)
    public static final void method1362(int arg0, long[] arg1, int[] arg2) {
        int var3 = 9 / ((-arg0 - 11) / 38);
        field2857++;
        class231.method1626(0, 27901, arg1.length - 1, arg1, arg2);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 48)
    public static void method1363(int arg0) {
        if (arg0 != 3967) {
            method1362(36, (long[]) null, (int[]) null);
        }
        field2862 = (int[][]) null;
        field2864 = null;
        field2865 = null;
        field2858 = null;
        field2859 = null;
    }
}
