import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class126 extends class189 {

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    private int field2775 = 1024;

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "I")
    private int field2789 = 3072;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    private int field2776 = 2048;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "[Lj;")
    public static class82[] field2778 = new class82[50];

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "Lgg;")
    private static class63 field2782 = class116.method911(43, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "Lgg;")
    public static class63 field2780 = field2782;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "Lgg;")
    public static class63 field2788 = field2782;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "[I")
    public static int[] field2784 = new int[1000];

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "I")
    public static int field2785 = 3;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "Ljc;")
    public static class85 field2779;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static void method950(int arg0) {
        field2782 = null;
        field2788 = null;
        field2779 = null;
        field2778 = null;
        field2780 = null;
        if (arg0 >= -116) {
            field2785 = 17;
        }
        field2784 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2783;
        int[] var3 = super.field3825.method681(arg1, (byte) -51);
        if (arg0 != 0) {
            this.method84(true);
        }
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(0, arg1, arg0 ^ 11433);
            for (int var5 = 0; ~var5 > ~class54.field1430; ++var5) {
                var3[var5] = this.field2775 - -(var4[var5] * this.field2776 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        this.field2776 = this.field2789 - this.field2775;
        ++field2787;
        if (!arg0) {
            this.method77(-88, (byte) 16, (class3) null);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        if (arg1 <= 34) {
            this.method90(82, 108);
        }
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[][] var4 = this.method1244((byte) 20, arg0, 0);
            int[] var5 = var4[2];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class54.field1430; ++var11) {
                var6[var11] = (var10[var11] * this.field2776 >> 12) + this.field2775;
                var8[var11] = (var7[var11] * this.field2776 >> 12) + this.field2775;
                var9[var11] = (var5[var11] * this.field2776 >> 12) + this.field2775;
            }
        }
        ++field2786;
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field2777;
        if (arg1 <= 32) {
            this.method77(38, (byte) 35, (class3) null);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field3811 = ~arg2.method64(31790) == -2;
                }
            } else {
                this.field2789 = arg2.method46((byte) 65);
            }
        } else {
            this.field2775 = arg2.method46((byte) 65);
        }
    }
}
