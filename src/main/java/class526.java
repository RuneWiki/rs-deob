import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class526 extends class354 {

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    private int field7727 = 4096;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    private int field7728 = 4096;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    private int field7725 = 4096;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "Lao;")
    public static class188 field7730 = new class188(16, 3);

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "Lgf;")
    public static class180 field7732 = new class180("K", "T", "K", "K");

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "Lfb;")
    public static class473 field7733;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "Loa;")
    public static class488 field7731;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "[[Lui;")
    public static class151[][] field7726;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field7727 = arg1.method1868(0);
                }
            } else {
                this.field7728 = arg1.method1868(0);
            }
        } else {
            this.field7725 = arg1.method1868(0);
        }
        if (arg0 != 15180) {
            field7732 = null;
        }
        ++field7723;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
    public class526() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        if (arg0 >= -40) {
            this.field7728 = 13;
        }
        ++field7724;
        int[][] var3 = super.field5351.method2819((byte) -125, arg1);
        if (super.field5351.field6959) {
            int[][] var4 = this.method2291(0, (byte) -128, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class404.field5952; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field7725 * var12 >> 12;
                    var9[var11] = this.field7728 * var13 >> 12;
                    var10[var11] = this.field7727 * var14 >> 12;
                } else {
                    var8[var11] = this.field7725;
                    var9[var11] = this.field7728;
                    var10[var11] = this.field7727;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
    public static void method3106(byte arg0) {
        field7732 = null;
        field7731 = null;
        field7726 = null;
        field7733 = null;
        if (arg0 <= 59) {
            method3106((byte) -62);
        }
        field7730 = null;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(Z)V")
    public static final void method3107(boolean arg0) {
        if (!arg0) {
            class22.field343.method2350((byte) 112);
            ++field7729;
        }
    }
}
