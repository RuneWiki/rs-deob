import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class68 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
    public static int[] field963 = new int[14];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    public static int[] field965 = new int[1];

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lsf;")
    public static class526 field966 = new class526("", 16);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLrl;II)V", line = 7)
    public static final void method625(byte arg0, class724 arg1, int arg2, int arg3) {
        field964++;
        int[] var4 = new int[arg0];
        class135.method997(var4, 0, var4.length, arg3);
        class621.method3493(arg1, arg2, var4, 122);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 23)
    public static void method626(int arg0) {
        if (arg0 <= -94) {
            field963 = null;
            field965 = null;
            field966 = null;
        }
    }
}
