import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class SoundEnvelope {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    private int field888 = 707;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    private int[] field890;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    private int[] field891;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llb;Z)V")
    public final void method309(Packet arg0, boolean arg1) {
        this.field894 = arg0.method229();
        this.field892 = arg0.method234();
        this.field893 = arg0.method234();
        if (arg1) {
            throw new NullPointerException();
        }
        this.method310(arg0, true);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Llb;Z)V")
    public final void method310(Packet arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field889 = arg0.method229();
        this.field890 = new int[this.field889];
        this.field891 = new int[this.field889];
        for (int var4 = 0; var4 < this.field889; var4++) {
            this.field890[var4] = arg0.method231();
            this.field891[var4] = arg0.method231();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method311(int arg0) {
        this.field895 = 0;
        this.field896 = 0;
        this.field897 = 0;
        this.field898 = 0;
        this.field899 = 0;
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public final int method312(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field899 >= this.field895) {
            this.field898 = this.field891[this.field896++] << 15;
            if (this.field896 >= this.field889) {
                this.field896 = this.field889 - 1;
            }
            this.field895 = (int) ((double) this.field890[this.field896] / 65536.0D * (double) arg1);
            if (this.field895 > this.field899) {
                this.field897 = ((this.field891[this.field896] << 15) - this.field898) / (this.field895 - this.field899);
            }
        }
        this.field898 += this.field897;
        this.field899++;
        return this.field898 - this.field897 >> 15;
    }
}
