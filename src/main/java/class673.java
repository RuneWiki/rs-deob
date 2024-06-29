import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class673 {

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "[I")
    public static int[] field9168 = new int[1];

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "[[I")
    public static int[][] field9171 = new int[128][128];

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "F")
    public static float field9170;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
    public int field9166;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "Ljava/lang/String;")
    public String field9165;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[S)[S", line = 5)
    public static final short[] method3626(int arg0, int arg1, short[] arg2) {
        field9167++;
        if (arg1 != 2329) {
            method3628(-111);
        }
        short[] var3 = new short[arg0];
        class617.method3385(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", line = 20)
    public static final void method3627(byte arg0, String arg1, String arg2, int arg3, String arg4, int arg5, String arg6) {
        field9169++;
        if (arg0 >= -123) {
            field9170 = 0.40355742F;
        }
        class45.method368(arg3, arg4, arg6, null, 0, arg2, -1, arg5, arg1);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V", line = 38)
    public static void method3628(int arg0) {
        field9168 = null;
        if (arg0 >= -81) {
            field9168 = null;
        }
        field9171 = null;
    }
}
