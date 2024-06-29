import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class543 extends class176 {

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public int field7551;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field7554 = 52;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "[I")
    public static int[] field7553 = new int[14];

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(II)V")
    public class543(int arg0, int arg1) {
        this.field7551 = arg0;
        this.field7552 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method3107(int arg0) {
        if (arg0 != 14) {
            method3107(-47);
        }
        field7553 = null;
    }
}
