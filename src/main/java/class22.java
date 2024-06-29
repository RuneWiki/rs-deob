import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    private int field429 = 2;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
    private int[] field425 = new int[2];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "[I")
    private int[] field426 = new int[2];

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I", line = 8)
    public final int method154(int arg0) {
        if (this.field433 >= this.field435) {
            this.field431 = this.field426[this.field432++] << 15;
            if (this.field432 >= this.field429) {
                this.field432 = this.field429 - 1;
            }
            this.field435 = (int) ((double) this.field425[this.field432] / 65536.0D * (double) arg0);
            if (this.field435 > this.field433) {
                this.field434 = ((this.field426[this.field432] << 15) - this.field431) / (this.field435 - this.field433);
            }
        }
        this.field431 += this.field434;
        this.field433++;
        return this.field431 - this.field434 >> 15;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lka;)V", line = 29)
    public final void method155(class61 arg0) {
        this.field429 = arg0.method494(20471);
        this.field425 = new int[this.field429];
        this.field426 = new int[this.field429];
        for (int var2 = 0; var2 < this.field429; var2++) {
            this.field425[var2] = arg0.method507((byte) -30);
            this.field426[var2] = arg0.method507((byte) -21);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Lka;)V", line = 44)
    public final void method156(class61 arg0) {
        this.field428 = arg0.method494(20471);
        this.field427 = arg0.method496((byte) 122);
        this.field430 = arg0.method496((byte) 122);
        this.method155(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 50)
    public final void method157() {
        this.field435 = 0;
        this.field432 = 0;
        this.field434 = 0;
        this.field431 = 0;
        this.field433 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 56)
    public class22() {
        this.field425[0] = 0;
        this.field425[1] = 65535;
        this.field426[0] = 0;
        this.field426[1] = 65535;
    }
}
