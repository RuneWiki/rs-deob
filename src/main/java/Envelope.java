import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "a", descriptor = "Z")
    private boolean field878 = false;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "ac", name = "e", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "ac", name = "c", descriptor = "[I")
    private int[] field880;

    @OriginalMember(owner = "ac", name = "d", descriptor = "[I")
    private int[] field881;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Llb;B)V")
    public final void method305(Packet arg0, byte arg1) {
        this.field884 = arg0.method225();
        this.field882 = arg0.method230();
        this.field883 = arg0.method230();
        if (arg1 != 81) {
            throw new NullPointerException();
        }
        this.method306(0, arg0);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ILlb;)V")
    public final void method306(int arg0, Packet arg1) {
        this.field879 = arg1.method225();
        this.field880 = new int[this.field879];
        this.field881 = new int[this.field879];
        if (arg0 == 0) {
            for (int var3 = 0; var3 < this.field879; var3++) {
                this.field880[var3] = arg1.method227();
                this.field881[var3] = arg1.method227();
            }
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Z)V")
    public final void method307(boolean arg0) {
        this.field885 = 0;
        this.field886 = 0;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field887 = 0;
        this.field888 = 0;
        this.field889 = 0;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(BI)I")
    public final int method308(byte arg0, int arg1) {
        if (arg0 != 122) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field889 >= this.field885) {
            this.field888 = this.field881[this.field886++] << 15;
            if (this.field886 >= this.field879) {
                this.field886 = this.field879 - 1;
            }
            this.field885 = (int) ((double) this.field880[this.field886] / 65536.0D * (double) arg1);
            if (this.field885 > this.field889) {
                this.field887 = ((this.field881[this.field886] << 15) - this.field888) / (this.field885 - this.field889);
            }
        }
        this.field888 += this.field887;
        this.field889++;
        return this.field888 - this.field887 >> 15;
    }
}
