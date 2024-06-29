import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class53 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    private int field950 = 2;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "[I")
    private int[] field947 = new int[2];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "[I")
    private int[] field946 = new int[2];

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lig;)V")
    public final void method437(class136 arg0) {
        this.field951 = arg0.method1012(4);
        this.field948 = arg0.method1022(95);
        this.field949 = arg0.method1022(-50);
        this.method438(arg0);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Lig;)V")
    public final void method438(class136 arg0) {
        this.field950 = arg0.method1012(4);
        this.field947 = new int[this.field950];
        this.field946 = new int[this.field950];
        for (int var2 = 0; var2 < this.field950; var2++) {
            this.field947[var2] = arg0.method996(65280);
            this.field946[var2] = arg0.method996(65280);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
    public final void method439() {
        this.field953 = 0;
        this.field954 = 0;
        this.field952 = 0;
        this.field956 = 0;
        this.field955 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)I")
    public final int method440(int arg0) {
        if (this.field955 >= this.field953) {
            this.field956 = this.field946[this.field954++] << 15;
            if (this.field954 >= this.field950) {
                this.field954 = this.field950 - 1;
            }
            this.field953 = (int) ((double) this.field947[this.field954] / 65536.0D * (double) arg0);
            if (this.field953 > this.field955) {
                this.field952 = ((this.field946[this.field954] << 15) - this.field956) / (this.field953 - this.field955);
            }
        }
        this.field956 += this.field952;
        this.field955++;
        return this.field956 - this.field952 >> 15;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class53() {
        this.field947[0] = 0;
        this.field947[1] = 65535;
        this.field946[0] = 0;
        this.field946[1] = 65535;
    }
}
