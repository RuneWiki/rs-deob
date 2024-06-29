import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    private int field983 = 2;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
    private int[] field984 = new int[2];

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
    private int[] field987 = new int[2];

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lhb;)V")
    public final void method325(class51 arg0) {
        this.field983 = arg0.method373(25094);
        this.field984 = new int[this.field983];
        this.field987 = new int[this.field983];
        for (int var2 = 0; var2 < this.field983; var2++) {
            this.field984[var2] = arg0.method383(-2056200760);
            this.field987[var2] = arg0.method383(-2056200760);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    public final void method326() {
        this.field989 = 0;
        this.field993 = 0;
        this.field991 = 0;
        this.field992 = 0;
        this.field990 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
    public final int method327(int arg0) {
        if (this.field990 >= this.field989) {
            this.field992 = this.field987[this.field993++] << 15;
            if (this.field993 >= this.field983) {
                this.field993 = this.field983 - 1;
            }
            this.field989 = (int) ((double) this.field984[this.field993] / 65536.0D * (double) arg0);
            if (this.field989 > this.field990) {
                this.field991 = ((this.field987[this.field993] << 15) - this.field992) / (this.field989 - this.field990);
            }
        }
        this.field992 += this.field991;
        this.field990++;
        return this.field992 - this.field991 >> 15;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lhb;)V")
    public final void method328(class51 arg0) {
        this.field986 = arg0.method373(25094);
        this.field988 = arg0.method399(-539722392);
        this.field985 = arg0.method399(-539722392);
        this.method325(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class45() {
        this.field984[0] = 0;
        this.field984[1] = 65535;
        this.field987[0] = 0;
        this.field987[1] = 65535;
    }
}
