import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class70 extends class510 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
    public int[] field957;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[I")
    public int[] field956;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ltga;")
    public static class64 field959 = new class64(64);

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[I")
    public static int[] field960 = new int[250];

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 3)
    public static void method557(boolean arg0) {
        field959 = null;
        if (!arg0) {
            field960 = null;
        }
        field960 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II[I[I)V", line = 26)
    public class70(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field957 = arg2;
        this.field956 = arg3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lcb;ILcb;I)V", line = 42)
    public static final void method558(class544 arg0, int arg1, class544 arg2, int arg3) {
        class386.field5500 = arg0;
        class527.field7498 = arg2;
        field958++;
        if (arg1 != 64) {
            method558(null, 4, null, 46);
        }
    }
}
