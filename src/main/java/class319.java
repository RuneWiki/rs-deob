import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class319 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    private int field4977 = 2;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
    private int[] field4979 = new int[2];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    private int[] field4975 = new int[2];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    private int field4980;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    private int field4981;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    private int field4983;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    private int field4984;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I", line = 7)
    public final int method2232(int arg0) {
        if (this.field4980 >= this.field4984) {
            this.field4981 = this.field4975[this.field4982++] << 15;
            if (this.field4982 >= this.field4977) {
                this.field4982 = this.field4977 - 1;
            }
            this.field4984 = (int) ((double) this.field4979[this.field4982] / 65536.0D * (double) arg0);
            if (this.field4984 > this.field4980) {
                this.field4983 = ((this.field4975[this.field4982] << 15) - this.field4981) / (this.field4984 - this.field4980);
            }
        }
        this.field4981 += this.field4983;
        this.field4980++;
        return this.field4981 - this.field4983 >> 15;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V", line = 24)
    public final void method2233() {
        this.field4984 = 0;
        this.field4982 = 0;
        this.field4983 = 0;
        this.field4981 = 0;
        this.field4980 = 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Llf;)V", line = 32)
    public final void method2234(class143 arg0) {
        this.field4977 = arg0.method1043(true);
        this.field4979 = new int[this.field4977];
        this.field4975 = new int[this.field4977];
        for (int var2 = 0; var2 < this.field4977; var2++) {
            this.field4979[var2] = arg0.method1051(1);
            this.field4975[var2] = arg0.method1051(1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Llf;)V", line = 47)
    public final void method2235(class143 arg0) {
        this.field4978 = arg0.method1043(true);
        this.field4974 = arg0.method1057(-125);
        this.field4976 = arg0.method1057(-120);
        this.method2234(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 56)
    public class319() {
        this.field4979[0] = 0;
        this.field4979[1] = 65535;
        this.field4975[0] = 0;
        this.field4975[1] = 65535;
    }
}
