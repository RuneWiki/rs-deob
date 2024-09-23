import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Envelope {

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private int field886 = -156;

    @OriginalMember(owner = "bc", name = "b", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "bc", name = "e", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "bc", name = "i", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    private int[] field888;

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    private int[] field889;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(BLmb;)V")
    public final void method308(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            throw new NullPointerException();
        }
        this.field892 = arg1.method228();
        this.field890 = arg1.method233();
        this.field891 = arg1.method233();
        this.method309(-156, arg1);
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ILmb;)V")
    public final void method309(int arg0, Packet arg1) {
        this.field887 = arg1.method228();
        this.field888 = new int[this.field887];
        if (arg0 >= 0) {
            return;
        }
        this.field889 = new int[this.field887];
        for (int var3 = 0; var3 < this.field887; var3++) {
            this.field888[var3] = arg1.method230();
            this.field889[var3] = arg1.method230();
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)V")
    public final void method310(int arg0) {
        this.field893 = 0;
        this.field894 = 0;
        this.field895 = 0;
        int var2 = 27 / arg0;
        this.field896 = 0;
        this.field897 = 0;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(IZ)I")
    public final int method311(int arg0, boolean arg1) {
        if (this.field897 >= this.field893) {
            this.field896 = this.field889[this.field894++] << 15;
            if (this.field894 >= this.field887) {
                this.field894 = this.field887 - 1;
            }
            this.field893 = (int) ((double) this.field888[this.field894] / 65536.0D * (double) arg0);
            if (this.field893 > this.field897) {
                this.field895 = ((this.field889[this.field894] << 15) - this.field896) / (this.field893 - this.field897);
            }
        }
        this.field896 += this.field895;
        this.field897++;
        return arg1 ? 1 : this.field896 - this.field895 >> 15;
    }
}
