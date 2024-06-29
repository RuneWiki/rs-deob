import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class293 {

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private int field4675 = 2;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[I")
    private int[] field4671 = new int[2];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[I")
    private int[] field4676 = new int[2];

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public int field4672;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field4673;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field4674;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    private int field4677;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    private int field4678;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    private int field4679;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    private int field4680;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)I")
    public final int method1967(int arg0) {
        if (this.field4679 >= this.field4680) {
            this.field4677 = this.field4676[this.field4678++] << 15;
            if (this.field4678 >= this.field4675) {
                this.field4678 = this.field4675 - 1;
            }
            this.field4680 = (int) ((double) this.field4671[this.field4678] / 65536.0D * (double) arg0);
            if (this.field4680 > this.field4679) {
                this.field4681 = ((this.field4676[this.field4678] << 15) - this.field4677) / (this.field4680 - this.field4679);
            }
        }
        this.field4677 += this.field4681;
        this.field4679++;
        return this.field4677 - this.field4681 >> 15;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lbj;)V")
    public final void method1968(class215 arg0) {
        this.field4675 = arg0.method1374((byte) -60);
        this.field4671 = new int[this.field4675];
        this.field4676 = new int[this.field4675];
        for (int var2 = 0; var2 < this.field4675; var2++) {
            this.field4671[var2] = arg0.method1379(-121);
            this.field4676[var2] = arg0.method1379(-88);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lbj;)V")
    public final void method1969(class215 arg0) {
        this.field4674 = arg0.method1374((byte) -60);
        this.field4673 = arg0.method1383((byte) 80);
        this.field4672 = arg0.method1383((byte) -67);
        this.method1968(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
    public final void method1970() {
        this.field4680 = 0;
        this.field4678 = 0;
        this.field4681 = 0;
        this.field4677 = 0;
        this.field4679 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class293() {
        this.field4671[0] = 0;
        this.field4671[1] = 65535;
        this.field4676[0] = 0;
        this.field4676[1] = 65535;
    }
}
