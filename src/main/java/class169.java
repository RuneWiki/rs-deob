import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class169 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
    public static int[] field2004 = new int[50];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[[I")
    public static int[][] field2006 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lgj;")
    public static class405 field2005;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2007;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method825(int arg0) {
        field2007 = null;
        field2006 = null;
        field2005 = null;
        if (arg0 != 10) {
            field2006 = null;
        }
        field2004 = null;
    }
}
