import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class637 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field8869 = 0;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Laj;")
    public static class333 field8871;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[I")
    public static int[] field8872;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Z")
    public abstract boolean method773(byte arg0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Z")
    public abstract boolean method768(boolean arg0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Z")
    public abstract boolean method771(int arg0);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)I")
    public abstract int method778(int arg0);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public abstract void method775(int arg0);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
    public abstract int method777(byte arg0);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)Z")
    public final boolean method3557(byte arg0) {
        int var2 = -63 % ((28 - arg0) / 62);
        field8870++;
        return this.method768(false) || this.method773((byte) 88) || this.method771(0);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public abstract void method767(int arg0);

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
    public static void method3558(int arg0) {
        int var1 = 127 / ((56 - arg0) / 38);
        field8871 = null;
        field8872 = null;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)Lqq;")
    public abstract class504 method774(int arg0);
}
