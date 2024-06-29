import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    private int field82 = 2;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    private int[] field84 = new int[2];

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    private int[] field86 = new int[2];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lbc;)V", line = 3)
    public final void method67(class153 arg0) {
        this.field82 = arg0.method1082(-89);
        this.field84 = new int[this.field82];
        this.field86 = new int[this.field82];
        for (int var2 = 0; var2 < this.field82; var2++) {
            this.field84[var2] = arg0.method1090(false);
            this.field86[var2] = arg0.method1090(false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I", line = 21)
    public final int method68(int arg0) {
        if (this.field90 >= this.field88) {
            this.field89 = this.field86[this.field91++] << 15;
            if (this.field91 >= this.field82) {
                this.field91 = this.field82 - 1;
            }
            this.field88 = (int) ((double) this.field84[this.field91] / 65536.0D * (double) arg0);
            if (this.field88 > this.field90) {
                this.field92 = ((this.field86[this.field91] << 15) - this.field89) / (this.field88 - this.field90);
            }
        }
        this.field89 += this.field92;
        this.field90++;
        return this.field89 - this.field92 >> 15;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V", line = 41)
    public final void method69() {
        this.field88 = 0;
        this.field91 = 0;
        this.field92 = 0;
        this.field89 = 0;
        this.field90 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lbc;)V", line = 51)
    public final void method70(class153 arg0) {
        this.field85 = arg0.method1082(-87);
        this.field87 = arg0.method1097((byte) -87);
        this.field83 = arg0.method1097((byte) -81);
        this.method67(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 56)
    public class11() {
        this.field84[0] = 0;
        this.field84[1] = 65535;
        this.field86[0] = 0;
        this.field86[1] = 65535;
    }
}
