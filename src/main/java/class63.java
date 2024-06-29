import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class63 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    private int field1138 = 2;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
    private int[] field1143 = new int[2];

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    private int[] field1140 = new int[2];

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
    public final int method458(int arg0) {
        if (this.field1144 >= this.field1147) {
            this.field1148 = this.field1140[this.field1145++] << 15;
            if (this.field1145 >= this.field1138) {
                this.field1145 = this.field1138 - 1;
            }
            this.field1147 = (int) ((double) this.field1143[this.field1145] / 65536.0D * (double) arg0);
            if (this.field1147 > this.field1144) {
                this.field1146 = ((this.field1140[this.field1145] << 15) - this.field1148) / (this.field1147 - this.field1144);
            }
        }
        this.field1148 += this.field1146;
        this.field1144++;
        return this.field1148 - this.field1146 >> 15;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lv;)V")
    public final void method459(class149 arg0) {
        this.field1139 = arg0.method1045((byte) 91);
        this.field1141 = arg0.method1076(65280);
        this.field1142 = arg0.method1076(65280);
        this.method461(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
    public final void method460() {
        this.field1147 = 0;
        this.field1145 = 0;
        this.field1146 = 0;
        this.field1148 = 0;
        this.field1144 = 0;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lv;)V")
    public final void method461(class149 arg0) {
        this.field1138 = arg0.method1045((byte) -67);
        this.field1143 = new int[this.field1138];
        this.field1140 = new int[this.field1138];
        for (int var2 = 0; var2 < this.field1138; var2++) {
            this.field1143[var2] = arg0.method1050(1272006568);
            this.field1140[var2] = arg0.method1050(1272006568);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class63() {
        this.field1143[0] = 0;
        this.field1143[1] = 65535;
        this.field1140[0] = 0;
        this.field1140[1] = 65535;
    }
}
