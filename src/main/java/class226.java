import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class226 extends class22 {

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "Lpj;")
    public static class237 field3876 = class33.method353(")2", 94);

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "Lfa;")
    public static class239 field3874;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Leh;")
    public static class80 field3870;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[I")
    public static int[] field3868;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[S")
    public static short[] field3869;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method1506(int arg0) {
        if (arg0 != 4096) {
            return;
        }
        field3874 = null;
        field3868 = null;
        field3870 = null;
        field3869 = null;
        field3876 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)V")
    public static final void method1507(boolean arg0, int arg1) {
        class175 var2 = class210.field3585;
        synchronized (class210.field3585) {
            class24.field441 = arg1;
        }
        field3873++;
        if (!arg0) {
            field3874 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Z")
    public static final boolean method1508(int arg0, byte arg1) {
        if (arg1 <= 11) {
            return true;
        } else {
            field3875++;
            return ((arg0 & 0x6F98900D) >> 30) != 0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public static final void method1509(int arg0, int arg1) {
        field3872++;
        if (class47.method434(0, arg0)) {
            class112.method826(4345, class22.field406[arg0], -1);
            int var2 = 56 / ((-arg1 - 72) / 43);
        }
    }
}
