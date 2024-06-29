import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class432 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lh;")
    public static class434 field5883 = new class434(27, 8);

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "[I")
    public static int[] field5886 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[[I")
    public static int[][] field5887 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field5888 = 0;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    public static int[] field5884;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method2551(int arg0) {
        field5886 = null;
        if (arg0 == -27340) {
            field5887 = null;
            field5884 = null;
            field5883 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 218) {
            method2552(-23, -124, 9, -112, -122, 78, -104);
        }
        field5885++;
        class316.field4177 = arg6;
        class111.field1684 = arg4;
        class257.field3429 = arg0;
        class369.field5057 = arg5;
        class429.field5871 = arg3;
        class291.field3907 = arg1;
    }
}
