import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class53 extends class177 {

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "Lta;")
    public static class197 field810 = new class197(50);

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    private int field806;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "[[I")
    public static int[][] field809;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 3)
    public class53() {
        this(0);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V", line = 15)
    private final void method475(int arg0, int arg1) {
        if (arg0 != -487400988) {
            field807 = -49;
        }
        this.field805 = arg1 & 0xFF << 4;
        this.field806 = (arg1 & 0xFF00) >> 4;
        field804++;
        this.field801 = arg1 >> 12 & 0xFF0;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V", line = 29)
    private class53(int arg0) {
        super(0, false);
        this.method475(-487400988, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)[[I", line = 45)
    public final int[][] method99(int arg0, int arg1) {
        field808++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (arg1 != -23387) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field2645.field3203) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class287.field4415; var7++) {
                var4[var7] = this.field801;
                var5[var7] = this.field806;
                var6[var7] = this.field805;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 82)
    public static void method476(int arg0) {
        field810 = null;
        field809 = (int[][]) null;
        if (arg0 != -15651) {
            method476(-50);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Llb;ILlb;)V", line = 95)
    public static final void method477(class211 arg0, int arg1, class211 arg2) {
        class137.field2136 = arg2;
        if (arg1 != 32203) {
            method477((class211) null, -60, (class211) null);
        }
        field803++;
        class88.field1294 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lhb;II)V", line = 108)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            this.method99(-2, 93);
        }
        if (arg2 == 0) {
            this.method475(-487400988, arg0.method269(false));
        }
        field800++;
    }
}
