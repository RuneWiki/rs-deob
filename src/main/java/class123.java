import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class123 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field2983 = 2;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    private int[] field2980 = new int[2];

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
    private int[] field2981 = new int[2];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    private int field2985;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    private int field2986;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field2987;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    private int field2988;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    private int field2989;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lbf;)V")
    public final void method995(class14 arg0) {
        this.field2983 = arg0.method153(true);
        this.field2980 = new int[this.field2983];
        this.field2981 = new int[this.field2983];
        for (int var2 = 0; var2 < this.field2983; var2++) {
            this.field2980[var2] = arg0.method138((byte) 86);
            this.field2981[var2] = arg0.method138((byte) 120);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
    public final void method996() {
        this.field2985 = 0;
        this.field2989 = 0;
        this.field2986 = 0;
        this.field2987 = 0;
        this.field2988 = 0;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lbf;)V")
    public final void method997(class14 arg0) {
        this.field2982 = arg0.method153(true);
        this.field2984 = arg0.method121((byte) -70);
        this.field2979 = arg0.method121((byte) 105);
        this.method995(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
    public final int method998(int arg0) {
        if (this.field2988 >= this.field2985) {
            this.field2987 = this.field2981[this.field2989++] << 15;
            if (this.field2989 >= this.field2983) {
                this.field2989 = this.field2983 - 1;
            }
            this.field2985 = (int) ((double) this.field2980[this.field2989] / 65536.0D * (double) arg0);
            if (this.field2985 > this.field2988) {
                this.field2986 = ((this.field2981[this.field2989] << 15) - this.field2987) / (this.field2985 - this.field2988);
            }
        }
        this.field2987 += this.field2986;
        this.field2988++;
        return this.field2987 - this.field2986 >> 15;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class123() {
        this.field2980[0] = 0;
        this.field2980[1] = 65535;
        this.field2981[0] = 0;
        this.field2981[1] = 65535;
    }
}
