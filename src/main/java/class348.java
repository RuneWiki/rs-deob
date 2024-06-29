import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class348 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    private int field4791 = 2;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
    private int[] field4794 = new int[2];

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    private int[] field4793 = new int[2];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public int field4792;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    private int field4796;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field4797;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    private int field4799;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    private int field4800;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class348() {
        this.field4794[0] = 0;
        this.field4794[1] = 65535;
        this.field4793[0] = 0;
        this.field4793[1] = 65535;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
    public final int method2157(int arg0) {
        if (this.field4797 >= this.field4800) {
            this.field4796 = this.field4793[this.field4798++] << 15;
            if (this.field4798 >= this.field4791) {
                this.field4798 = this.field4791 - 1;
            }
            this.field4800 = (int) ((double) this.field4794[this.field4798] / 65536.0D * (double) arg0);
            if (this.field4800 > this.field4797) {
                this.field4799 = ((this.field4793[this.field4798] << 15) - this.field4796) / (this.field4800 - this.field4797);
            }
        }
        this.field4796 += this.field4799;
        this.field4797++;
        return this.field4796 - this.field4799 >> 15;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
    public final void method2158() {
        this.field4800 = 0;
        this.field4798 = 0;
        this.field4799 = 0;
        this.field4796 = 0;
        this.field4797 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lkk;)V")
    public final void method2159(class161 arg0) {
        this.field4792 = arg0.method1172((byte) 52);
        this.field4790 = arg0.method1168(255);
        this.field4795 = arg0.method1168(255);
        this.method2160(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Lkk;)V")
    public final void method2160(class161 arg0) {
        this.field4791 = arg0.method1172((byte) -118);
        this.field4794 = new int[this.field4791];
        this.field4793 = new int[this.field4791];
        for (int var2 = 0; var2 < this.field4791; var2++) {
            this.field4794[var2] = arg0.method1134(-16848);
            this.field4793[var2] = arg0.method1134(-16848);
        }
    }
}
