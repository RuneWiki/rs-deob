import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Envelope {

    @OriginalMember(owner = "xb", name = "b", descriptor = "Z")
    private boolean field750 = true;

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private static int field749 = 587;

    @OriginalMember(owner = "xb", name = "c", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "xb", name = "f", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "xb", name = "g", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "xb", name = "i", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "xb", name = "j", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "xb", name = "k", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "xb", name = "l", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "xb", name = "m", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    private int[] field752;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    private int[] field753;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(BLkb;)V")
    public final void method259(byte arg0, Packet arg1) {
        this.field756 = arg1.method208();
        this.field754 = arg1.method213();
        this.field755 = arg1.method213();
        this.field751 = arg1.method208();
        if (arg0 != 6) {
            field749 = 164;
        }
        this.field752 = new int[this.field751];
        this.field753 = new int[this.field751];
        for (int var3 = 0; var3 < this.field751; var3++) {
            this.field752[var3] = arg1.method210();
            this.field753[var3] = arg1.method210();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I)V")
    public final void method260(int arg0) {
        this.field757 = 0;
        if (arg0 != 0) {
            this.field750 = !this.field750;
        }
        this.field758 = 0;
        this.field759 = 0;
        this.field760 = 0;
        this.field761 = 0;
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(II)I")
    public final int method261(int arg0, int arg1) {
        if (this.field761 >= this.field757) {
            this.field760 = this.field753[this.field758++] << 15;
            if (this.field758 >= this.field751) {
                this.field758 = this.field751 - 1;
            }
            this.field757 = (int) ((double) this.field752[this.field758] / 65536.0D * (double) arg0);
            if (this.field757 > this.field761) {
                this.field759 = ((this.field753[this.field758] << 15) - this.field760) / (this.field757 - this.field761);
            }
        }
        this.field760 += this.field759;
        if (arg1 < 0) {
            this.field761++;
            return this.field760 - this.field759 >> 15;
        } else {
            return 3;
        }
    }
}
