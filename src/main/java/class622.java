import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class622 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public int field8774;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    private int field8778;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Ltga;")
    public static class64 field8773 = new class64(4);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[Ls;")
    public static class292[] field8777;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I", line = 6)
    public final int method3555(int arg0) {
        field8776++;
        int var2 = -61 % ((7 - arg0) / 36);
        return this.field8778;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 19)
    public static void method3556(int arg0) {
        if (arg0 != 4) {
            method3556(-99);
        }
        field8777 = null;
        field8773 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V", line = 42)
    public class622(int arg0, int arg1) {
        this.field8774 = arg1;
        this.field8778 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        field8772++;
        throw new IllegalStateException();
    }
}
