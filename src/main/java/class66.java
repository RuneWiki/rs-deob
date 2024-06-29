import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class66 {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    private int field1114 = 2;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "[I")
    private int[] field1112 = new int[2];

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    private int[] field1113 = new int[2];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    private int field1118;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V")
    public final void method436() {
        this.field1118 = 0;
        this.field1119 = 0;
        this.field1120 = 0;
        this.field1117 = 0;
        this.field1116 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lik;)V")
    public final void method437(class261 arg0) {
        this.field1114 = arg0.method1693((byte) 116);
        this.field1112 = new int[this.field1114];
        this.field1113 = new int[this.field1114];
        for (int var2 = 0; var2 < this.field1114; var2++) {
            this.field1112[var2] = arg0.method1740((byte) 58);
            this.field1113[var2] = arg0.method1740((byte) 65);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)I")
    public final int method438(int arg0) {
        if (this.field1116 >= this.field1118) {
            this.field1117 = this.field1113[this.field1119++] << 15;
            if (this.field1119 >= this.field1114) {
                this.field1119 = this.field1114 - 1;
            }
            this.field1118 = (int) ((double) this.field1112[this.field1119] / 65536.0D * (double) arg0);
            if (this.field1118 > this.field1116) {
                this.field1120 = ((this.field1113[this.field1119] << 15) - this.field1117) / (this.field1118 - this.field1116);
            }
        }
        this.field1117 += this.field1120;
        this.field1116++;
        return this.field1117 - this.field1120 >> 15;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class66() {
        this.field1112[0] = 0;
        this.field1112[1] = 65535;
        this.field1113[0] = 0;
        this.field1113[1] = 65535;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Lik;)V")
    public final void method439(class261 arg0) {
        this.field1115 = arg0.method1693((byte) 49);
        this.field1110 = arg0.method1712(-4);
        this.field1111 = arg0.method1712(-4);
        this.method437(arg0);
    }
}
