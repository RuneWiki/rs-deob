import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private int field892 = 39;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field893 = 633;

    @OriginalMember(owner = "ac", name = "c", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "ac", name = "n", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "ac", name = "d", descriptor = "[I")
    private int[] field895;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private int[] field896;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Llb;I)V")
    public final void method309(Packet arg0, int arg1) {
        this.field899 = arg0.method229();
        if (arg1 != 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field897 = arg0.method234();
        this.field898 = arg0.method234();
        this.method310(arg0, this.field892);
    }

    @OriginalMember(owner = "ac", name = "b", descriptor = "(Llb;I)V")
    public final void method310(Packet arg0, int arg1) {
        this.field894 = arg0.method229();
        this.field895 = new int[this.field894];
        this.field896 = new int[this.field894];
        if (arg1 <= 0) {
            this.field893 = 182;
        }
        for (int var3 = 0; var3 < this.field894; var3++) {
            this.field895[var3] = arg0.method231();
            this.field896[var3] = arg0.method231();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Z)V")
    public final void method311(boolean arg0) {
        this.field900 = 0;
        this.field901 = 0;
        this.field902 = 0;
        if (!arg0) {
            this.field893 = -395;
        }
        this.field903 = 0;
        this.field904 = 0;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(II)I")
    public final int method312(int arg0, int arg1) {
        if (arg0 != -45088) {
            this.field893 = 308;
        }
        if (this.field904 >= this.field900) {
            this.field903 = this.field896[this.field901++] << 15;
            if (this.field901 >= this.field894) {
                this.field901 = this.field894 - 1;
            }
            this.field900 = (int) ((double) this.field895[this.field901] / 65536.0D * (double) arg1);
            if (this.field900 > this.field904) {
                this.field902 = ((this.field896[this.field901] << 15) - this.field903) / (this.field900 - this.field904);
            }
        }
        this.field903 += this.field902;
        this.field904++;
        return this.field903 - this.field902 >> 15;
    }
}
