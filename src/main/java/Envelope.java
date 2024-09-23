import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class Envelope {

    @OriginalMember(owner = "ac", name = "b", descriptor = "I")
    private int field887 = -7404;

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "ac", name = "c", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "ac", name = "f", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "ac", name = "g", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "ac", name = "h", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "ac", name = "i", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "ac", name = "j", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "ac", name = "k", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "ac", name = "l", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "ac", name = "m", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "ac", name = "n", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "ac", name = "d", descriptor = "[I")
    private int[] field889;

    @OriginalMember(owner = "ac", name = "e", descriptor = "[I")
    private int[] field890;

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZLlb;)V")
    public final void method309(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.field893 = arg1.method229();
        this.field891 = arg1.method234();
        this.field892 = arg1.method234();
        this.method310(-977, arg1);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ILlb;)V")
    public final void method310(int arg0, Packet arg1) {
        this.field888 = arg1.method229();
        while (arg0 >= 0) {
            this.field887 = 102;
        }
        this.field889 = new int[this.field888];
        this.field890 = new int[this.field888];
        for (int var3 = 0; var3 < this.field888; var3++) {
            this.field889[var3] = arg1.method231();
            this.field890[var3] = arg1.method231();
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(B)V")
    public final void method311(byte arg0) {
        this.field894 = 0;
        this.field895 = 0;
        this.field896 = 0;
        this.field897 = 0;
        this.field898 = 0;
        if (arg0 == 105) {
            ;
        }
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IZ)I")
    public final int method312(int arg0, boolean arg1) {
        if (arg1) {
            return this.field886;
        }
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
        this.field898++;
        return this.field897 - this.field896 >> 15;
    }
}
