import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class49 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    private int field1135 = 2;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    private int[] field1140 = new int[2];

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
    private int[] field1139 = new int[2];

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ls;)V")
    public final void method344(class128 arg0) {
        this.field1135 = arg0.method1025(255);
        this.field1140 = new int[this.field1135];
        this.field1139 = new int[this.field1135];
        for (int var2 = 0; var2 < this.field1135; var2++) {
            this.field1140[var2] = arg0.method1041(212464720);
            this.field1139[var2] = arg0.method1041(212464720);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ls;)V")
    public final void method345(class128 arg0) {
        this.field1138 = arg0.method1025(255);
        this.field1137 = arg0.method1037(18834);
        this.field1136 = arg0.method1037(18834);
        this.method344(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)I")
    public final int method346(int arg0) {
        if (this.field1143 >= this.field1144) {
            this.field1142 = this.field1139[this.field1141++] << 15;
            if (this.field1141 >= this.field1135) {
                this.field1141 = this.field1135 - 1;
            }
            this.field1144 = (int) ((double) this.field1140[this.field1141] / 65536.0D * (double) arg0);
            if (this.field1144 > this.field1143) {
                this.field1145 = ((this.field1139[this.field1141] << 15) - this.field1142) / (this.field1144 - this.field1143);
            }
        }
        this.field1142 += this.field1145;
        this.field1143++;
        return this.field1142 - this.field1145 >> 15;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public final void method347() {
        this.field1144 = 0;
        this.field1141 = 0;
        this.field1145 = 0;
        this.field1142 = 0;
        this.field1143 = 0;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class49() {
        this.field1140[0] = 0;
        this.field1140[1] = 65535;
        this.field1139[0] = 0;
        this.field1139[1] = 65535;
    }
}
