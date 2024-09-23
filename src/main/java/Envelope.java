import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Envelope {

    @OriginalMember(owner = "xb", name = "a", descriptor = "Z")
    private static boolean field733 = true;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "xb", name = "e", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "xb", name = "f", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "xb", name = "g", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "xb", name = "i", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "xb", name = "j", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "xb", name = "k", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "xb", name = "l", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "xb", name = "c", descriptor = "[I")
    private int[] field735;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    private int[] field736;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Lkb;B)V")
    public final void method260(Packet arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            field733 = !field733;
        }
        this.field739 = arg0.method209();
        this.field737 = arg0.method214();
        this.field738 = arg0.method214();
        this.field734 = arg0.method209();
        this.field735 = new int[this.field734];
        this.field736 = new int[this.field734];
        for (int var4 = 0; var4 < this.field734; var4++) {
            this.field735[var4] = arg0.method211();
            this.field736[var4] = arg0.method211();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I)V")
    public final void method261(int arg0) {
        this.field740 = 0;
        this.field741 = 0;
        this.field742 = 0;
        this.field743 = 0;
        this.field744 = 0;
        if (arg0 != 37305) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(ZI)I")
    public final int method262(boolean arg0, int arg1) {
        if (this.field744 >= this.field740) {
            this.field743 = this.field736[this.field741++] << 15;
            if (this.field741 >= this.field734) {
                this.field741 = this.field734 - 1;
            }
            this.field740 = (int) ((double) this.field735[this.field741] / 65536.0D * (double) arg1);
            if (this.field740 > this.field744) {
                this.field742 = ((this.field736[this.field741] << 15) - this.field743) / (this.field740 - this.field744);
            }
        }
        this.field743 += this.field742;
        this.field744++;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field743 - this.field742 >> 15;
    }
}
