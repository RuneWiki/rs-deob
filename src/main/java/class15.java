import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EZOFESYN")
public class class15 extends class4 {

    @OriginalMember(owner = "EZOFESYN", name = "n", descriptor = "I")
    private int field697 = 351;

    @OriginalMember(owner = "EZOFESYN", name = "x", descriptor = "Z")
    private boolean field707 = true;

    @OriginalMember(owner = "EZOFESYN", name = "o", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "EZOFESYN", name = "p", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "EZOFESYN", name = "q", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "EZOFESYN", name = "y", descriptor = "I")
    private int field708;

    @OriginalMember(owner = "EZOFESYN", name = "z", descriptor = "I")
    private int field709;

    @OriginalMember(owner = "EZOFESYN", name = "A", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "EZOFESYN", name = "B", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "EZOFESYN", name = "u", descriptor = "LZKWMIVTX;")
    private class71 field704;

    @OriginalMember(owner = "EZOFESYN", name = "t", descriptor = "I")
    private int field703;

    @OriginalMember(owner = "EZOFESYN", name = "r", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "EZOFESYN", name = "v", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "EZOFESYN", name = "w", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "EZOFESYN", name = "s", descriptor = "[I")
    public int[] field702;

    @OriginalMember(owner = "EZOFESYN", name = "C", descriptor = "Lclient;")
    public static client field712;

    @OriginalMember(owner = "EZOFESYN", name = "a", descriptor = "(I)LPZZVQRQI;")
    public final class41 method210(int arg0) {
        int var2 = -1;
        int var3 = 79 / arg0;
        if (this.field705 != -1) {
            class2 var4 = class2.field12[this.field705];
            int var5 = var4.field14;
            int var6 = var4.field15;
            int var7 = var4.field16;
            int var8 = client.field299[var7 - var6];
            var2 = field712.field216[var5] >> var6 & var8;
        } else if (this.field706 != -1) {
            var2 = field712.field216[this.field706];
        }
        return var2 < 0 || var2 >= this.field702.length || this.field702[var2] == -1 ? null : class41.method398(this.field702[var2]);
    }

    @OriginalMember(owner = "EZOFESYN", name = "<init>", descriptor = "(IZIIIIIIII)V")
    public class15(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field698 = arg7;
        this.field699 = arg9;
        this.field700 = arg0;
        this.field708 = arg5;
        if (arg6 != 0) {
            throw new NullPointerException();
        }
        this.field709 = arg2;
        this.field710 = arg4;
        this.field711 = arg3;
        if (arg8 != -1) {
            this.field704 = class71.field1705[arg8];
            this.field703 = 0;
            this.field701 = client.field609;
            if (arg1 && this.field704.field1710 != -1) {
                this.field703 = (int) (Math.random() * (double) this.field704.field1706);
                this.field701 -= (int) (Math.random() * (double) this.field704.method591(0, this.field703));
            }
        }
        class41 var11 = class41.method398(this.field698);
        this.field705 = var11.field1058;
        this.field706 = var11.field1089;
        this.field702 = var11.field1070;
    }

    @OriginalMember(owner = "EZOFESYN", name = "a", descriptor = "(Z)LYABPKWWG;")
    public final class67 method16(boolean arg0) {
        if (!arg0) {
            this.field697 = -241;
        }
        int var2 = -1;
        if (this.field704 != null) {
            int var3 = client.field609 - this.field701;
            if (var3 > 100 && this.field704.field1710 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field704.method591(0, this.field703)) {
                            break label44;
                        }
                        var3 -= this.field704.method591(0, this.field703);
                        this.field703++;
                    } while (this.field703 < this.field704.field1706);
                    this.field703 -= this.field704.field1710;
                } while (this.field703 >= 0 && this.field703 < this.field704.field1706);
                this.field704 = null;
            }
            this.field701 = client.field609 - var3;
            if (this.field704 != null) {
                var2 = this.field704.field1707[this.field703];
            }
        }
        class41 var4;
        if (this.field702 == null) {
            var4 = class41.method398(this.field698);
        } else {
            var4 = this.method210(228);
        }
        return var4 == null ? null : var4.method405(this.field699, this.field700, this.field708, this.field709, this.field710, this.field711, var2);
    }
}
