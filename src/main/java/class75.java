import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class75 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    private int field1077 = 2;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
    private int[] field1080 = new int[2];

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    private int[] field1078 = new int[2];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lhi;)V", line = 3)
    public final void method503(class291 arg0) {
        this.field1079 = arg0.method2011(-100);
        this.field1076 = arg0.method1969((byte) -16);
        this.field1081 = arg0.method1969((byte) -16);
        this.method506(arg0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 13)
    public final void method504() {
        this.field1083 = 0;
        this.field1084 = 0;
        this.field1086 = 0;
        this.field1082 = 0;
        this.field1085 = 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I", line = 21)
    public final int method505(int arg0) {
        if (this.field1085 >= this.field1083) {
            this.field1082 = this.field1078[this.field1084++] << 15;
            if (this.field1084 >= this.field1077) {
                this.field1084 = this.field1077 - 1;
            }
            this.field1083 = (int) ((double) this.field1080[this.field1084] / 65536.0D * (double) arg0);
            if (this.field1083 > this.field1085) {
                this.field1086 = ((this.field1078[this.field1084] << 15) - this.field1082) / (this.field1083 - this.field1085);
            }
        }
        this.field1082 += this.field1086;
        this.field1085++;
        return this.field1082 - this.field1086 >> 15;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lhi;)V", line = 38)
    public final void method506(class291 arg0) {
        this.field1077 = arg0.method2011(-84);
        this.field1080 = new int[this.field1077];
        this.field1078 = new int[this.field1077];
        for (int var2 = 0; var2 < this.field1077; var2++) {
            this.field1080[var2] = arg0.method2021((byte) 74);
            this.field1078[var2] = arg0.method2021((byte) 74);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 55)
    public class75() {
        this.field1080[0] = 0;
        this.field1080[1] = 65535;
        this.field1078[0] = 0;
        this.field1078[1] = 65535;
    }
}
