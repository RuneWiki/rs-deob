import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class741 {

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    private int field10036 = 2;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[I")
    private int[] field10035 = new int[2];

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
    private int[] field10039 = new int[2];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public int field10034;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public int field10037;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public int field10038;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    private int field10040;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    private int field10041;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    private int field10042;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field10043;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    private int field10044;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method4031(int arg0) {
        if (this.field10042 >= this.field10040) {
            this.field10044 = this.field10039[this.field10043++] << 15;
            if (this.field10043 >= this.field10036) {
                this.field10043 = this.field10036 - 1;
            }
            this.field10040 = (int) ((double) this.field10035[this.field10043] / 65536.0D * (double) arg0);
            if (this.field10040 > this.field10042) {
                this.field10041 = ((this.field10039[this.field10043] << 15) - this.field10044) / (this.field10040 - this.field10042);
            }
        }
        this.field10044 += this.field10041;
        this.field10042++;
        return this.field10044 - this.field10041 >> 15;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lmc;)V")
    public final void method4032(class234 arg0) {
        this.field10036 = arg0.method1509(true);
        this.field10035 = new int[this.field10036];
        this.field10039 = new int[this.field10036];
        for (int var2 = 0; var2 < this.field10036; var2++) {
            this.field10035[var2] = arg0.method1553((byte) -111);
            this.field10039[var2] = arg0.method1553((byte) 72);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public final void method4033() {
        this.field10040 = 0;
        this.field10043 = 0;
        this.field10041 = 0;
        this.field10044 = 0;
        this.field10042 = 0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lmc;)V")
    public final void method4034(class234 arg0) {
        this.field10038 = arg0.method1509(true);
        this.field10037 = arg0.method1497((byte) 69);
        this.field10034 = arg0.method1497((byte) 115);
        this.method4032(arg0);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class741() {
        this.field10035[0] = 0;
        this.field10035[1] = 65535;
        this.field10039[0] = 0;
        this.field10039[1] = 65535;
    }
}
