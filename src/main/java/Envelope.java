import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private int field880 = 1;

    @OriginalMember(owner = "ac", name = "b", descriptor = "Z")
    private boolean field881 = false;

    @OriginalMember(owner = "ac", name = "c", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "ac", name = "n", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "ac", name = "d", descriptor = "[I")
    private int[] field883;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private int[] field884;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(BLlb;)V")
    public final void method304(byte arg0, Packet arg1) {
        this.field887 = arg1.method224();
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field881 = !this.field881;
        }
        this.field885 = arg1.method229();
        this.field886 = arg1.method229();
        this.method305(arg1, 9);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Llb;I)V")
    public final void method305(Packet arg0, int arg1) {
        if (arg1 < 9 || arg1 > 9) {
            return;
        }
        this.field882 = arg0.method224();
        this.field883 = new int[this.field882];
        this.field884 = new int[this.field882];
        for (int var3 = 0; var3 < this.field882; var3++) {
            this.field883[var3] = arg0.method226();
            this.field884[var3] = arg0.method226();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)V")
    public final void method306(int arg0) {
        this.field888 = 0;
        this.field889 = 0;
        this.field890 = 0;
        this.field891 = 0;
        this.field892 = 0;
        if (arg0 != 0) {
            this.field880 = 193;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(BI)I")
    public final int method307(byte arg0, int arg1) {
        if (arg0 != -7) {
            return this.field880;
        }
        if (this.field892 >= this.field888) {
            this.field891 = this.field884[this.field889++] << 15;
            if (this.field889 >= this.field882) {
                this.field889 = this.field882 - 1;
            }
            this.field888 = (int) ((double) this.field883[this.field889] / 65536.0D * (double) arg1);
            if (this.field888 > this.field892) {
                this.field890 = ((this.field884[this.field889] << 15) - this.field891) / (this.field888 - this.field892);
            }
        }
        this.field891 += this.field890;
        this.field892++;
        return this.field891 - this.field890 >> 15;
    }
}
