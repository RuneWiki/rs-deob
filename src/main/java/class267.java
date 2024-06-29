import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class267 {

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    private int field4580 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lui;")
    private class268 field4571;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "[I")
    public static int[] field4574 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Ljf;")
    public static class229 field4572 = class212.method1457((byte) 83, "Okay");

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Ljf;")
    public static class229 field4577 = class212.method1457((byte) 126, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Ljf;")
    private static class229 field4581 = class212.method1457((byte) 74, "wishes to trade with you)3");

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "[J")
    public static long[] field4579 = new long[500];

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Ljf;")
    public static class229 field4578 = field4581;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Ljf;")
    private static class229 field4584 = class212.method1457((byte) 72, "Select");

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4575 = 0;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Ljf;")
    public static class229 field4582 = field4584;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Lfj;")
    private class242 field4576;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[I")
    public static int[] field4583;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method1878(boolean arg0, int arg1) {
        field4573++;
        if (arg0) {
            class223.field3807 = arg1;
            class228.method1604(3, (byte) -92);
            class228.method1604(4, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lfj;", line = 23)
    public final class242 method1879(int arg0) {
        this.field4580 = 0;
        field4586++;
        if (arg0 != 15504954) {
            this.method1882((byte) -9);
        }
        return this.method1882((byte) 110);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Ld;", line = 40)
    public static final class143 method1880(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        return var3 == null || var3.field2190 == null ? null : var3.field2190;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 60)
    public static void method1881(int arg0) {
        field4583 = null;
        field4584 = null;
        field4577 = null;
        if (arg0 != 4) {
            method1881(14);
        }
        field4572 = null;
        field4578 = null;
        field4581 = null;
        field4574 = null;
        field4582 = null;
        field4579 = null;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lui;)V", line = 133)
    public class267(class268 arg0) {
        this.field4571 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Lfj;", line = 99)
    public final class242 method1882(byte arg0) {
        field4585++;
        if (arg0 < 86) {
            this.method1882((byte) -15);
        }
        if (this.field4580 > 0 && this.field4571.field4603[this.field4580 - 1] != this.field4576) {
            class242 var2 = this.field4576;
            this.field4576 = var2.field4273;
            return var2;
        }
        class242 var3;
        do {
            if (this.field4580 >= this.field4571.field4599) {
                return null;
            }
            var3 = this.field4571.field4603[this.field4580++].field4273;
        } while (this.field4571.field4603[this.field4580 - 1] == var3);
        this.field4576 = var3.field4273;
        return var3;
    }
}
