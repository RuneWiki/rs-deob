import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    private int field161 = 2;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
    private int[] field159 = new int[2];

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[I")
    private int[] field162 = new int[2];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "()V")
    public final void method105() {
        this.field168 = 0;
        this.field167 = 0;
        this.field166 = 0;
        this.field164 = 0;
        this.field165 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        if (this.field165 >= this.field168) {
            this.field164 = this.field162[this.field167++] << 15;
            if (this.field167 >= this.field161) {
                this.field167 = this.field161 - 1;
            }
            this.field168 = (int) ((double) this.field159[this.field167] / 65536.0D * (double) arg0);
            if (this.field168 > this.field165) {
                this.field166 = ((this.field162[this.field167] << 15) - this.field164) / (this.field168 - this.field165);
            }
        }
        this.field164 += this.field166;
        this.field165++;
        return this.field164 - this.field166 >> 15;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lv;)V")
    public final void method107(class152 arg0) {
        this.field163 = arg0.method1111(255);
        this.field160 = arg0.method1097(126);
        this.field158 = arg0.method1097(127);
        this.method108(arg0);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lv;)V")
    public final void method108(class152 arg0) {
        this.field161 = arg0.method1111(255);
        this.field159 = new int[this.field161];
        this.field162 = new int[this.field161];
        for (int var2 = 0; var2 < this.field161; var2++) {
            this.field159[var2] = arg0.method1126(false);
            this.field162[var2] = arg0.method1126(false);
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        this.field159[0] = 0;
        this.field159[1] = 65535;
        this.field162[0] = 0;
        this.field162[1] = 65535;
    }
}
