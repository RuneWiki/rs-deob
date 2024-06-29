import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class283 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lkf;")
    public static class229 field3931 = new class229(1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public static int[] field3932 = new int[1];

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lkh;")
    public static class15 field3934 = new class15();

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[[I")
    public static int[][] field3935;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method1710(int arg0, int arg1) {
        if (arg1 != -6060) {
            method1710(-7, 119);
        }
        field3933++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 14)
    public static void method1711(byte arg0) {
        int var1 = 75 / ((-arg0 - 53) / 36);
        field3935 = null;
        field3931 = null;
        field3934 = null;
        field3932 = null;
    }
}
