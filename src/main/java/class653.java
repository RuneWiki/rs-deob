import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class653 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    private int field8799 = 2;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "[I")
    private int[] field8798 = new int[2];

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[I")
    private int[] field8800 = new int[2];

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public int field8801;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field8802;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public int field8803;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    private int field8804;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    private int field8805;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    private int field8806;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    private int field8807;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    private int field8808;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ldt;)V")
    public final void method3631(class254 arg0) {
        this.field8801 = arg0.method1731((byte) 64);
        this.field8803 = arg0.method1672(-16516);
        this.field8802 = arg0.method1672(-16516);
        this.method3634(arg0);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
    public final void method3632() {
        this.field8805 = 0;
        this.field8804 = 0;
        this.field8806 = 0;
        this.field8808 = 0;
        this.field8807 = 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)I")
    public final int method3633(int arg0) {
        if (this.field8807 >= this.field8805) {
            this.field8808 = this.field8800[this.field8804++] << 15;
            if (this.field8804 >= this.field8799) {
                this.field8804 = this.field8799 - 1;
            }
            this.field8805 = (int) ((double) this.field8798[this.field8804] / 65536.0D * (double) arg0);
            if (this.field8805 > this.field8807) {
                this.field8806 = ((this.field8800[this.field8804] << 15) - this.field8808) / (this.field8805 - this.field8807);
            }
        }
        this.field8808 += this.field8806;
        this.field8807++;
        return this.field8808 - this.field8806 >> 15;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Ldt;)V")
    public final void method3634(class254 arg0) {
        this.field8799 = arg0.method1731((byte) 64);
        this.field8798 = new int[this.field8799];
        this.field8800 = new int[this.field8799];
        for (int var2 = 0; var2 < this.field8799; var2++) {
            this.field8798[var2] = arg0.method1728((byte) 23);
            this.field8800[var2] = arg0.method1728((byte) 77);
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class653() {
        this.field8798[0] = 0;
        this.field8798[1] = 65535;
        this.field8800[0] = 0;
        this.field8800[1] = 65535;
    }
}
