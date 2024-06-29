import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class660 {

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public int field9055;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "[I")
    public int[] field9056;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "[I")
    public int[] field9054;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)I", line = 7)
    public static final int method3581(boolean arg0, int arg1) {
        if (arg0) {
            method3581(true, -25);
        }
        field9053++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V", line = 18)
    public class660(int arg0) {
        this.field9055 = arg0;
        this.field9056 = new int[this.field9055];
        this.field9054 = new int[this.field9055];
    }
}
