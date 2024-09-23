import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Envelope {

    @OriginalMember(owner = "bc", name = "a", descriptor = "Z")
    private boolean field887 = true;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "bc", name = "e", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "bc", name = "i", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    private int[] field889;

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    private int[] field890;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ILmb;)V")
    public final void method318(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field893 = arg1.method238();
        this.field891 = arg1.method243();
        this.field892 = arg1.method243();
        this.field888 = arg1.method238();
        this.field889 = new int[this.field888];
        this.field890 = new int[this.field888];
        for (int var4 = 0; var4 < this.field888; var4++) {
            this.field889[var4] = arg1.method240();
            this.field890[var4] = arg1.method240();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(B)V")
    public final void method319(byte arg0) {
        this.field894 = 0;
        this.field895 = 0;
        this.field896 = 0;
        if (arg0 != 3) {
            this.field887 = !this.field887;
        }
        this.field897 = 0;
        this.field898 = 0;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II)I")
    public final int method320(int arg0, int arg1) {
        if (this.field898 >= this.field894) {
            this.field897 = this.field890[this.field895++] << 15;
            if (this.field895 >= this.field888) {
                this.field895 = this.field888 - 1;
            }
            this.field894 = (int) ((double) this.field889[this.field895] / 65536.0D * (double) arg0);
            if (this.field894 > this.field898) {
                this.field896 = ((this.field890[this.field895] << 15) - this.field897) / (this.field894 - this.field898);
            }
        }
        this.field897 += this.field896;
        if (arg1 == 6) {
            this.field898++;
            return this.field897 - this.field896 >> 15;
        } else {
            return 2;
        }
    }
}
