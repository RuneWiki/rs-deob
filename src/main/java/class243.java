import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class243 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    private int field4132 = 2;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    private int[] field4133 = new int[2];

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    private int[] field4135 = new int[2];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field4134;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    private int field4137;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    private int field4138;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    private int field4139;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    private int field4140;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)I", line = 5)
    public final int method1674(int arg0) {
        if (this.field4138 >= this.field4139) {
            this.field4141 = this.field4135[this.field4140++] << 15;
            if (this.field4140 >= this.field4132) {
                this.field4140 = this.field4132 - 1;
            }
            this.field4139 = (int) ((double) this.field4133[this.field4140] / 65536.0D * (double) arg0);
            if (this.field4139 > this.field4138) {
                this.field4137 = ((this.field4135[this.field4140] << 15) - this.field4141) / (this.field4139 - this.field4138);
            }
        }
        this.field4141 += this.field4137;
        this.field4138++;
        return this.field4141 - this.field4137 >> 15;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V", line = 23)
    public final void method1675() {
        this.field4139 = 0;
        this.field4140 = 0;
        this.field4137 = 0;
        this.field4141 = 0;
        this.field4138 = 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lj;)V", line = 31)
    public final void method1676(class153 arg0) {
        this.field4132 = arg0.method1042((byte) 100);
        this.field4133 = new int[this.field4132];
        this.field4135 = new int[this.field4132];
        for (int var2 = 0; var2 < this.field4132; var2++) {
            this.field4133[var2] = arg0.method1069(44);
            this.field4135[var2] = arg0.method1069(97);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Lj;)V", line = 48)
    public final void method1677(class153 arg0) {
        this.field4131 = arg0.method1042((byte) 119);
        this.field4136 = arg0.method1089((byte) -14);
        this.field4134 = arg0.method1089((byte) -14);
        this.method1676(arg0);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 55)
    public class243() {
        this.field4133[0] = 0;
        this.field4133[1] = 65535;
        this.field4135[0] = 0;
        this.field4135[1] = 65535;
    }
}
