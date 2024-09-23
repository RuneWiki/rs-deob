import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ENGZWEMK")
public class class17 {

    @OriginalMember(owner = "ENGZWEMK", name = "a", descriptor = "Z")
    private boolean field748 = true;

    @OriginalMember(owner = "ENGZWEMK", name = "b", descriptor = "I")
    private int field749 = 649;

    @OriginalMember(owner = "ENGZWEMK", name = "c", descriptor = "Z")
    private boolean field750 = true;

    @OriginalMember(owner = "ENGZWEMK", name = "d", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "ENGZWEMK", name = "g", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "ENGZWEMK", name = "h", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "ENGZWEMK", name = "i", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "ENGZWEMK", name = "j", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "ENGZWEMK", name = "k", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "ENGZWEMK", name = "l", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "ENGZWEMK", name = "m", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "ENGZWEMK", name = "n", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "ENGZWEMK", name = "o", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "ENGZWEMK", name = "e", descriptor = "[I")
    private int[] field752;

    @OriginalMember(owner = "ENGZWEMK", name = "f", descriptor = "[I")
    private int[] field753;

    @OriginalMember(owner = "ENGZWEMK", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    public final void method221(class43 arg0, boolean arg1) {
        this.field756 = arg0.method330();
        this.field754 = arg0.method335();
        this.field755 = arg0.method335();
        this.method222(arg0, false);
        if (!arg1) {
            this.field750 = !this.field750;
        }
    }

    @OriginalMember(owner = "ENGZWEMK", name = "b", descriptor = "(LPKHWFJLM;Z)V")
    public final void method222(class43 arg0, boolean arg1) {
        if (arg1) {
            this.field749 = -108;
        }
        this.field751 = arg0.method330();
        this.field752 = new int[this.field751];
        this.field753 = new int[this.field751];
        for (int var3 = 0; var3 < this.field751; var3++) {
            this.field752[var3] = arg0.method332();
            this.field753[var3] = arg0.method332();
        }
    }

    @OriginalMember(owner = "ENGZWEMK", name = "a", descriptor = "(B)V")
    public final void method223(byte arg0) {
        this.field757 = 0;
        this.field758 = 0;
        this.field759 = 0;
        this.field760 = 0;
        if (arg0 != -88) {
            this.field748 = !this.field748;
        }
        this.field761 = 0;
    }

    @OriginalMember(owner = "ENGZWEMK", name = "a", descriptor = "(II)I")
    public final int method224(int arg0, int arg1) {
        if (arg0 < 9 || arg0 > 9) {
            return 0;
        }
        if (this.field761 >= this.field757) {
            this.field760 = this.field753[this.field758++] << 15;
            if (this.field758 >= this.field751) {
                this.field758 = this.field751 - 1;
            }
            this.field757 = (int) ((double) this.field752[this.field758] / 65536.0D * (double) arg1);
            if (this.field757 > this.field761) {
                this.field759 = ((this.field753[this.field758] << 15) - this.field760) / (this.field757 - this.field761);
            }
        }
        this.field760 += this.field759;
        this.field761++;
        return this.field760 - this.field759 >> 15;
    }
}
