import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LRDFYKJP")
public class class29 {

    @OriginalMember(owner = "LRDFYKJP", name = "a", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "LRDFYKJP", name = "d", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "LRDFYKJP", name = "e", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "LRDFYKJP", name = "f", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "LRDFYKJP", name = "g", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "LRDFYKJP", name = "h", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "LRDFYKJP", name = "i", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "LRDFYKJP", name = "j", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "LRDFYKJP", name = "k", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "LRDFYKJP", name = "l", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "LRDFYKJP", name = "b", descriptor = "[I")
    private int[] field890;

    @OriginalMember(owner = "LRDFYKJP", name = "c", descriptor = "[I")
    private int[] field891;

    @OriginalMember(owner = "LRDFYKJP", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    public final void method261(class33 arg0, boolean arg1) {
        this.field894 = arg0.method292();
        this.field892 = arg0.method297();
        this.field893 = arg0.method297();
        if (arg1) {
            throw new NullPointerException();
        }
        this.method262(arg0, true);
    }

    @OriginalMember(owner = "LRDFYKJP", name = "b", descriptor = "(LMUKVLYLC;Z)V")
    public final void method262(class33 arg0, boolean arg1) {
        this.field889 = arg0.method292();
        this.field890 = new int[this.field889];
        this.field891 = new int[this.field889];
        for (int var3 = 0; var3 < this.field889; var3++) {
            this.field890[var3] = arg0.method294();
            this.field891[var3] = arg0.method294();
        }
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "LRDFYKJP", name = "a", descriptor = "(I)V")
    public final void method263(int arg0) {
        this.field895 = 0;
        this.field896 = 0;
        this.field897 = 0;
        this.field898 = 0;
        if (arg0 == 0) {
            this.field899 = 0;
        }
    }

    @OriginalMember(owner = "LRDFYKJP", name = "a", descriptor = "(II)I")
    public final int method264(int arg0, int arg1) {
        if (this.field899 >= this.field895) {
            this.field898 = this.field891[this.field896++] << 15;
            if (this.field896 >= this.field889) {
                this.field896 = this.field889 - 1;
            }
            this.field895 = (int) ((double) this.field890[this.field896] / 65536.0D * (double) arg0);
            if (this.field895 > this.field899) {
                this.field897 = ((this.field891[this.field896] << 15) - this.field898) / (this.field895 - this.field899);
            }
        }
        this.field898 += this.field897;
        if (arg1 < 0) {
            this.field899++;
            return this.field898 - this.field897 >> 15;
        } else {
            return 2;
        }
    }
}
