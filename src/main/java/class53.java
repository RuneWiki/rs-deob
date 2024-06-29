import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    private int field1105 = 2;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
    private int[] field1106 = new int[2];

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
    private int[] field1109 = new int[2];

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 3)
    public final void method451() {
        this.field1112 = 0;
        this.field1111 = 0;
        this.field1113 = 0;
        this.field1114 = 0;
        this.field1115 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Leb;)V", line = 13)
    public final void method452(class27 arg0) {
        this.field1105 = arg0.method231(255);
        this.field1106 = new int[this.field1105];
        this.field1109 = new int[this.field1105];
        for (int var2 = 0; var2 < this.field1105; var2++) {
            this.field1106[var2] = arg0.method227(127);
            this.field1109[var2] = arg0.method227(127);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 33)
    public class53() {
        this.field1106[0] = 0;
        this.field1106[1] = 65535;
        this.field1109[0] = 0;
        this.field1109[1] = 65535;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Leb;)V", line = 44)
    public final void method453(class27 arg0) {
        this.field1108 = arg0.method231(255);
        this.field1110 = arg0.method251((byte) 105);
        this.field1107 = arg0.method251((byte) 105);
        this.method452(arg0);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I", line = 51)
    public final int method454(int arg0) {
        if (this.field1115 >= this.field1112) {
            this.field1114 = this.field1109[this.field1111++] << 15;
            if (this.field1111 >= this.field1105) {
                this.field1111 = this.field1105 - 1;
            }
            this.field1112 = (int) ((double) this.field1106[this.field1111] / 65536.0D * (double) arg0);
            if (this.field1112 > this.field1115) {
                this.field1113 = ((this.field1109[this.field1111] << 15) - this.field1114) / (this.field1112 - this.field1115);
            }
        }
        this.field1114 += this.field1113;
        this.field1115++;
        return this.field1114 - this.field1113 >> 15;
    }
}
