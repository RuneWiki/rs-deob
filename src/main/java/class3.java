import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    private int field52 = 2;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[I")
    private int[] field54 = new int[2];

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
    private int[] field57 = new int[2];

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    private int field58;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    private int field61;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lva;)V")
    public final void method20(class187 arg0) {
        this.field52 = arg0.method1268(255);
        this.field54 = new int[this.field52];
        this.field57 = new int[this.field52];
        for (int var2 = 0; var2 < this.field52; var2++) {
            this.field54[var2] = arg0.method1244(false);
            this.field57[var2] = arg0.method1244(false);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
    public final void method21() {
        this.field61 = 0;
        this.field62 = 0;
        this.field60 = 0;
        this.field59 = 0;
        this.field58 = 0;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Lva;)V")
    public final void method22(class187 arg0) {
        this.field53 = arg0.method1268(255);
        this.field55 = arg0.method1290((byte) 90);
        this.field56 = arg0.method1290((byte) 90);
        this.method20(arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I")
    public final int method23(int arg0) {
        if (this.field58 >= this.field61) {
            this.field59 = this.field57[this.field62++] << 15;
            if (this.field62 >= this.field52) {
                this.field62 = this.field52 - 1;
            }
            this.field61 = (int) ((double) this.field54[this.field62] / 65536.0D * (double) arg0);
            if (this.field61 > this.field58) {
                this.field60 = ((this.field57[this.field62] << 15) - this.field59) / (this.field61 - this.field58);
            }
        }
        this.field59 += this.field60;
        this.field58++;
        return this.field59 - this.field60 >> 15;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class3() {
        this.field54[0] = 0;
        this.field54[1] = 65535;
        this.field57[0] = 0;
        this.field57[1] = 65535;
    }
}
