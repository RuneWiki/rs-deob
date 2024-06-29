import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class455 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lgk;")
    private class472[] field6758;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    private int field6759;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lpu;")
    public static class179 field6763 = new class179("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field6767 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "J")
    private long field6757;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lbw;")
    public static class335 field6765;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lgk;")
    private class472 field6761;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[I")
    public static int[] field6766;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method2785(byte arg0) {
        if (arg0 != 54) {
            method2785((byte) -15);
        }
        field6766 = null;
        field6765 = null;
        field6763 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Lgk;")
    public final class472 method2786(long arg0, int arg1) {
        int var4 = -52 % ((arg1 + 20) / 40);
        this.field6757 = arg0;
        field6760++;
        class472 var5 = this.field6758[(int) ((long) (this.field6759 - 1) & arg0)];
        for (this.field6761 = var5.field6924; this.field6761 != var5; this.field6761 = this.field6761.field6924) {
            if (this.field6761.field6926 == arg0) {
                class472 var6 = this.field6761;
                this.field6761 = this.field6761.field6924;
                return var6;
            }
        }
        this.field6761 = null;
        return null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILgk;J)V")
    public final void method2787(int arg0, class472 arg1, long arg2) {
        if (arg1.field6921 != null) {
            arg1.method2859(-107);
        }
        field6756++;
        class472 var5 = this.field6758[(int) ((long) (this.field6759 + arg0) & arg2)];
        arg1.field6921 = var5.field6921;
        arg1.field6924 = var5;
        arg1.field6921.field6924 = arg1;
        arg1.field6924.field6921 = arg1;
        arg1.field6926 = arg2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)Lgk;")
    public final class472 method2788(boolean arg0) {
        field6762++;
        if (this.field6761 == null) {
            return null;
        }
        class472 var2 = this.field6758[(int) (this.field6757 & (long) (this.field6759 - 1))];
        while (this.field6761 != var2) {
            if (this.field6761.field6926 == this.field6757) {
                class472 var3 = this.field6761;
                this.field6761 = this.field6761.field6924;
                return var3;
            }
            this.field6761 = this.field6761.field6924;
        }
        if (arg0) {
            this.field6757 = -117L;
        }
        this.field6761 = null;
        return null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
    public class455(int arg0) {
        this.field6758 = new class472[arg0];
        this.field6759 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class472 var3 = this.field6758[var2] = new class472();
            var3.field6921 = var3;
            var3.field6924 = var3;
        }
    }
}
