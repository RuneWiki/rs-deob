import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class9 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    private int field82 = 2;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
    private int[] field80 = new int[2];

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    private int[] field83 = new int[2];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhb;)V", line = 4)
    public final void method74(class35 arg0) {
        this.field82 = arg0.method273(65280);
        this.field80 = new int[this.field82];
        this.field83 = new int[this.field82];
        for (int var2 = 0; var2 < this.field82; var2++) {
            this.field80[var2] = arg0.method300(-1394191632);
            this.field83[var2] = arg0.method300(-1394191632);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 23)
    public final void method75() {
        this.field87 = 0;
        this.field86 = 0;
        this.field88 = 0;
        this.field89 = 0;
        this.field85 = 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I", line = 30)
    public final int method76(int arg0) {
        if (this.field85 >= this.field87) {
            this.field89 = this.field83[this.field86++] << 15;
            if (this.field86 >= this.field82) {
                this.field86 = this.field82 - 1;
            }
            this.field87 = (int) ((double) this.field80[this.field86] / 65536.0D * (double) arg0);
            if (this.field87 > this.field85) {
                this.field88 = ((this.field83[this.field86] << 15) - this.field89) / (this.field87 - this.field85);
            }
        }
        this.field89 += this.field88;
        this.field85++;
        return this.field89 - this.field88 >> 15;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Lhb;)V", line = 47)
    public final void method77(class35 arg0) {
        this.field84 = arg0.method273(65280);
        this.field79 = arg0.method299(-77);
        this.field81 = arg0.method299(-73);
        this.method74(arg0);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 56)
    public class9() {
        this.field80[0] = 0;
        this.field80[1] = 65535;
        this.field83[0] = 0;
        this.field83[1] = 65535;
    }
}
