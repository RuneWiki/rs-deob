import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private int field886 = 9527;

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "ac", name = "e", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "ac", name = "c", descriptor = "[I")
    private int[] field888;

    @OriginalMember(owner = "ac", name = "d", descriptor = "[I")
    private int[] field889;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Llb;Z)V")
    public final void method309(Packet arg0, boolean arg1) {
        this.field892 = arg0.method229();
        this.field890 = arg0.method234();
        this.field891 = arg0.method234();
        if (arg1) {
            this.field886 = -207;
        }
        this.method310(0, arg0);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ILlb;)V")
    public final void method310(int arg0, Packet arg1) {
        this.field887 = arg1.method229();
        this.field888 = new int[this.field887];
        if (arg0 != 0) {
            this.field886 = 76;
        }
        this.field889 = new int[this.field887];
        for (int var3 = 0; var3 < this.field887; var3++) {
            this.field888[var3] = arg1.method231();
            this.field889[var3] = arg1.method231();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(I)V")
    public final void method311(int arg0) {
        int var2 = 42 / arg0;
        this.field893 = 0;
        this.field894 = 0;
        this.field895 = 0;
        this.field896 = 0;
        this.field897 = 0;
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(II)I")
    public final int method312(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            return 4;
        }
        if (this.field897 >= this.field893) {
            this.field896 = this.field889[this.field894++] << 15;
            if (this.field894 >= this.field887) {
                this.field894 = this.field887 - 1;
            }
            this.field893 = (int) ((double) this.field888[this.field894] / 65536.0D * (double) arg1);
            if (this.field893 > this.field897) {
                this.field895 = ((this.field889[this.field894] << 15) - this.field896) / (this.field893 - this.field897);
            }
        }
        this.field896 += this.field895;
        this.field897++;
        return this.field896 - this.field895 >> 15;
    }
}
