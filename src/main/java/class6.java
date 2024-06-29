import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private int field98 = 2;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
    private int[] field95 = new int[2];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
    private int[] field94 = new int[2];

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I", line = 4)
    public final int method37(int arg0) {
        if (this.field104 >= this.field100) {
            this.field103 = this.field94[this.field101++] << 15;
            if (this.field101 >= this.field98) {
                this.field101 = this.field98 - 1;
            }
            this.field100 = (int) ((double) this.field95[this.field101] / 65536.0D * (double) arg0);
            if (this.field100 > this.field104) {
                this.field102 = ((this.field94[this.field101] << 15) - this.field103) / (this.field100 - this.field104);
            }
        }
        this.field103 += this.field102;
        this.field104++;
        return this.field103 - this.field102 >> 15;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 24)
    public final void method38() {
        this.field100 = 0;
        this.field101 = 0;
        this.field102 = 0;
        this.field103 = 0;
        this.field104 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltc;)V", line = 35)
    public final void method39(class113 arg0) {
        this.field98 = arg0.method821(true);
        this.field95 = new int[this.field98];
        this.field94 = new int[this.field98];
        for (int var2 = 0; var2 < this.field98; var2++) {
            this.field95[var2] = arg0.method870(-1);
            this.field94[var2] = arg0.method870(-1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Ltc;)V", line = 50)
    public final void method40(class113 arg0) {
        this.field96 = arg0.method821(true);
        this.field99 = arg0.method822(-708753192);
        this.field97 = arg0.method822(-708753192);
        this.method39(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 56)
    public class6() {
        this.field95[0] = 0;
        this.field95[1] = 65535;
        this.field94[0] = 0;
        this.field94[1] = 65535;
    }
}
