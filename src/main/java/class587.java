import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class587 {

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "[Lff;")
    private class9[] field8514;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    private int field8512;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "Lrg;")
    public static class548 field8510 = new class548(51, -1);

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Lcu;")
    public static class185 field8513 = new class185(10, 14);

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
    public static int[] field8517 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "J")
    private long field8515;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Lse;")
    public static class213 field8516;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "Lff;")
    private class9 field8518;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public static void method3406(byte arg0) {
        field8510 = null;
        if (arg0 != -90) {
            field8517 = null;
        }
        field8513 = null;
        field8517 = null;
        field8516 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lff;JZ)V")
    public final void method3407(class9 arg0, long arg1, boolean arg2) {
        if (arg0.field70 != null) {
            arg0.method48(-1);
        }
        if (arg2) {
            return;
        }
        field8520++;
        class9 var5 = this.field8514[(int) ((long) (this.field8512 - 1) & arg1)];
        arg0.field70 = var5.field70;
        arg0.field65 = var5;
        arg0.field70.field65 = arg0;
        arg0.field65.field70 = arg0;
        arg0.field67 = arg1;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(JI)Lff;")
    public final class9 method3408(long arg0, int arg1) {
        this.field8515 = arg0;
        field8519++;
        class9 var4 = this.field8514[(int) (arg0 & (long) (this.field8512 - 1))];
        this.field8518 = var4.field65;
        if (arg1 != 24221) {
            this.method3408(-45L, -25);
        }
        while (this.field8518 != var4) {
            if (this.field8518.field67 == arg0) {
                class9 var5 = this.field8518;
                this.field8518 = this.field8518.field65;
                return var5;
            }
            this.field8518 = this.field8518.field65;
        }
        this.field8518 = null;
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lff;")
    public final class9 method3409(int arg0) {
        field8511++;
        if (this.field8518 == null) {
            return null;
        }
        class9 var2 = this.field8514[(int) ((long) (this.field8512 + arg0) & this.field8515)];
        while (this.field8518 != var2) {
            if (this.field8518.field67 == this.field8515) {
                class9 var3 = this.field8518;
                this.field8518 = this.field8518.field65;
                return var3;
            }
            this.field8518 = this.field8518.field65;
        }
        this.field8518 = null;
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
    public class587(int arg0) {
        this.field8514 = new class9[arg0];
        this.field8512 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class9 var3 = this.field8514[var2] = new class9();
            var3.field65 = var3;
            var3.field70 = var3;
        }
    }
}
