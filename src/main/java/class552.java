import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class552 {

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "[S")
    public short[] field7710;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "J")
    public long field7709;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "[I")
    public int[] field7705;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "[S")
    public short[] field7706;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Lkg;")
    public static class275 field7707 = new class275(4, 4);

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "Lfia;")
    public static class577 field7712 = new class577(8, 0, 4, 1);

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
    public static int field7715 = -1;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "F")
    public static float field7713;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3203(int arg0) {
        if (arg0 < -31) {
            class442.field5874 = new class277(class454.field6007.method2547(-74, class243.field3143), "", class740.field10331, 1008, -1, 0L, 0, 0, true, false, 0L, true);
            field7711++;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V", line = 22)
    public static void method3204(int arg0) {
        field7707 = null;
        if (arg0 != -12087) {
            field7712 = null;
        }
        field7712 = null;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(J[I[S[S)V", line = 37)
    public class552(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field7710 = arg2;
        this.field7709 = arg0;
        this.field7705 = arg1;
        this.field7706 = arg3;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V", line = 52)
    protected class552() {
    }
}
