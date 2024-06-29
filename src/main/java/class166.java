import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class166 {

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    private int field2758 = 2;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "[I")
    private int[] field2760 = new int[2];

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "[I")
    private int[] field2762 = new int[2];

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    private int field2763;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    private int field2764;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    private int field2765;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    private int field2767;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lqh;)V")
    public final void method1256(class61 arg0) {
        this.field2757 = arg0.method732(-559537960);
        this.field2761 = arg0.method730(89);
        this.field2759 = arg0.method730(-121);
        this.method1258(arg0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
    public final int method1257(int arg0) {
        if (this.field2764 >= this.field2766) {
            this.field2763 = this.field2762[this.field2767++] << 15;
            if (this.field2767 >= this.field2758) {
                this.field2767 = this.field2758 - 1;
            }
            this.field2766 = (int) ((double) this.field2760[this.field2767] / 65536.0D * (double) arg0);
            if (this.field2766 > this.field2764) {
                this.field2765 = ((this.field2762[this.field2767] << 15) - this.field2763) / (this.field2766 - this.field2764);
            }
        }
        this.field2763 += this.field2765;
        this.field2764++;
        return this.field2763 - this.field2765 >> 15;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(Lqh;)V")
    public final void method1258(class61 arg0) {
        this.field2758 = arg0.method732(-559537960);
        this.field2760 = new int[this.field2758];
        this.field2762 = new int[this.field2758];
        for (int var2 = 0; var2 < this.field2758; var2++) {
            this.field2760[var2] = arg0.method723((byte) -25);
            this.field2762[var2] = arg0.method723((byte) -25);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "()V")
    public final void method1259() {
        this.field2766 = 0;
        this.field2767 = 0;
        this.field2765 = 0;
        this.field2763 = 0;
        this.field2764 = 0;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
    public class166() {
        this.field2760[0] = 0;
        this.field2760[1] = 65535;
        this.field2762[0] = 0;
        this.field2762[1] = 65535;
    }
}
