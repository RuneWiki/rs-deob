import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class45 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field1008 = 2;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[I")
    private int[] field1011 = new int[2];

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[I")
    private int[] field1012 = new int[2];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lm;)V", line = 4)
    public final void method366(class77 arg0) {
        this.field1009 = arg0.method620((byte) -8);
        this.field1007 = arg0.method647((byte) -72);
        this.field1010 = arg0.method647((byte) -72);
        this.method368(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 10)
    public final void method367() {
        this.field1016 = 0;
        this.field1017 = 0;
        this.field1014 = 0;
        this.field1013 = 0;
        this.field1015 = 0;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lm;)V", line = 18)
    public final void method368(class77 arg0) {
        this.field1008 = arg0.method620((byte) -8);
        this.field1011 = new int[this.field1008];
        this.field1012 = new int[this.field1008];
        for (int var2 = 0; var2 < this.field1008; var2++) {
            this.field1011[var2] = arg0.method636(93);
            this.field1012[var2] = arg0.method636(-4);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I", line = 36)
    public final int method369(int arg0) {
        if (this.field1015 >= this.field1016) {
            this.field1013 = this.field1012[this.field1017++] << 15;
            if (this.field1017 >= this.field1008) {
                this.field1017 = this.field1008 - 1;
            }
            this.field1016 = (int) ((double) this.field1011[this.field1017] / 65536.0D * (double) arg0);
            if (this.field1016 > this.field1015) {
                this.field1014 = ((this.field1012[this.field1017] << 15) - this.field1013) / (this.field1016 - this.field1015);
            }
        }
        this.field1013 += this.field1014;
        this.field1015++;
        return this.field1013 - this.field1014 >> 15;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 56)
    public class45() {
        this.field1011[0] = 0;
        this.field1011[1] = 65535;
        this.field1012[0] = 0;
        this.field1012[1] = 65535;
    }
}
