import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class124 {

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field1735 = 128;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field1738 = 128;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Z")
    public static boolean field1737 = false;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[I")
    public static int[] field1728;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "[[Lwv;")
    public static class423[][] field1729;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static void method741(int arg0) {
        int var1 = 49 / ((56 - arg0) / 59);
        field1729 = null;
        field1728 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjl;)V")
    public final void method742(boolean arg0, class124 arg1) {
        this.field1726 = arg1.field1726;
        this.field1733 = arg1.field1733;
        if (arg0) {
            return;
        }
        this.field1730 = arg1.field1730;
        this.field1738 = arg1.field1738;
        field1731++;
        this.field1735 = arg1.field1735;
        this.field1740 = arg1.field1740;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Ljl;")
    public final class124 method743(int arg0) {
        if (arg0 != 128) {
            this.method742(false, null);
        }
        field1741++;
        return new class124(this.field1730, this.field1738, this.field1735, this.field1726, this.field1733, this.field1740);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
    public class124(int arg0) {
        this.field1730 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIII)V")
    private class124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1740 = arg5;
        this.field1730 = arg0;
        this.field1733 = arg4;
        this.field1735 = arg2;
        this.field1738 = arg1;
        this.field1726 = arg3;
    }
}
