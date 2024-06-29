import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class490 {

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "Z")
    public static boolean field6921 = false;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public int field6906;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public int field6907;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field6909;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public int field6914;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public int field6915;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public int field6916;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public int field6919;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public int field6922;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public int field6923;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    public int field6925;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    public int field6927;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Laq;")
    public static class385 field6912;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "[I")
    public static int[] field6905;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "[I")
    public static int[] field6908;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method2874(int arg0) {
        if (arg0 != 0) {
            method2874(-126);
        }
        field6908 = null;
        field6912 = null;
        field6905 = null;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static final void method2875(int arg0) {
        field6926++;
        for (int var1 = arg0; var1 < class205.field2947.length; var1++) {
            for (int var2 = 0; var2 < class205.field2947[0].length; var2++) {
                for (int var3 = 0; var3 < class205.field2947[0][0].length; var3++) {
                    class205.field2947[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2876(int arg0, byte[] arg1) {
        field6918++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class415.method2423(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }
}
