import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class136 extends class64 {

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
    private int field2536 = 4096;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    private int field2538 = 4096;

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
    private int field2544 = 4096;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "Lsg;")
    private static class169 field2531 = class165.method1060("Hidden", 1536);

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "[I")
    public static int[] field2540 = new int[5];

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "Lsg;")
    public static class169 field2542 = field2531;

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
    public static int field2543 = 0;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "Lgd;")
    public static class59 field2537;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "Lgd;")
    public static class59 field2539;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "Z")
    public static boolean field2535;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class136() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLke;)V")
    public static final void method919(byte arg0, class95 arg1) {
        class46.field849 = arg1;
        ++field2534;
        if (arg0 <= 63) {
            field2537 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V")
    public static void method920(int arg0) {
        field2537 = null;
        field2540 = null;
        if (arg0 > -27) {
            field2539 = null;
        }
        field2539 = null;
        field2531 = null;
        field2542 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[Lsg;)[Lsg;")
    public static final class169[] method921(int arg0, class169[] arg1) {
        class169[] var2 = new class169[5];
        ++field2533;
        if (arg0 != -7884) {
            return null;
        } else {
            for (int var3 = 0; ~var3 > -6; ++var3) {
                var2[var3] = class165.method1058(class44.method277(arg0, -7884), new class169[] { class2.method18((byte) -62, var3), class185.field3624 });
                if (arg1 != null && arg1[var3] != null) {
                    var2[var3] = class165.method1058(arg0 + 7884, new class169[] { var2[var3], arg1[var3] });
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        if (arg0 != -40) {
            this.field2544 = -125;
        }
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532) {
            int[][] var4 = this.method402(false, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class147.field2715; ++var11) {
                int var12 = var7[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (~var12 == ~var13 && var12 == var14) {
                    var8[var11] = this.field2538 * var13 >> 12;
                    var10[var11] = this.field2536 * var12 >> 12;
                    var9[var11] = this.field2544 * var14 >> 12;
                } else {
                    var8[var11] = this.field2538;
                    var10[var11] = this.field2536;
                    var9[var11] = this.field2544;
                }
            }
        }
        ++field2532;
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2544 = arg1.method785(true);
                }
            } else {
                this.field2536 = arg1.method785(true);
            }
        } else {
            this.field2538 = arg1.method785(true);
        }
        ++field2541;
        int var5 = -93 % ((arg0 - -60) / 36);
    }
}
