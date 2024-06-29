import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class293 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    private int field4738 = 2;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    private int[] field4739 = new int[2];

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
    private int[] field4740 = new int[2];

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    private int field4744;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    private int field4745;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    private int field4746;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    private int field4748;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V", line = 5)
    public final void method2028() {
        this.field4746 = 0;
        this.field4747 = 0;
        this.field4744 = 0;
        this.field4745 = 0;
        this.field4748 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Llb;)V", line = 13)
    public final void method2029(class112 arg0) {
        this.field4742 = arg0.method792(2);
        this.field4743 = arg0.method779(-27100);
        this.field4741 = arg0.method779(-27100);
        this.method2031(arg0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I", line = 24)
    public final int method2030(int arg0) {
        if (this.field4748 >= this.field4746) {
            this.field4745 = this.field4740[this.field4747++] << 15;
            if (this.field4747 >= this.field4738) {
                this.field4747 = this.field4738 - 1;
            }
            this.field4746 = (int) ((double) this.field4739[this.field4747] / 65536.0D * (double) arg0);
            if (this.field4746 > this.field4748) {
                this.field4744 = ((this.field4740[this.field4747] << 15) - this.field4745) / (this.field4746 - this.field4748);
            }
        }
        this.field4745 += this.field4744;
        this.field4748++;
        return this.field4745 - this.field4744 >> 15;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 41)
    public class293() {
        this.field4739[0] = 0;
        this.field4739[1] = 65535;
        this.field4740[0] = 0;
        this.field4740[1] = 65535;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Llb;)V", line = 53)
    public final void method2031(class112 arg0) {
        this.field4738 = arg0.method792(2);
        this.field4739 = new int[this.field4738];
        this.field4740 = new int[this.field4738];
        for (int var2 = 0; var2 < this.field4738; var2++) {
            this.field4739[var2] = arg0.method759((byte) -49);
            this.field4740[var2] = arg0.method759((byte) -52);
        }
    }
}
