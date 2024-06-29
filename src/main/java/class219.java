import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class219 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    private int field3613 = 2;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
    private int[] field3617 = new int[2];

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[I")
    private int[] field3616 = new int[2];

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    private int field3622;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    private int field3623;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lwe;)V", line = 4)
    public final void method1614(class47 arg0) {
        this.field3615 = arg0.method368(120);
        this.field3618 = arg0.method373((byte) 36);
        this.field3614 = arg0.method373((byte) 36);
        this.method1617(arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)I", line = 13)
    public final int method1615(int arg0) {
        if (this.field3621 >= this.field3622) {
            this.field3619 = this.field3616[this.field3623++] << 15;
            if (this.field3623 >= this.field3613) {
                this.field3623 = this.field3613 - 1;
            }
            this.field3622 = (int) ((double) this.field3617[this.field3623] / 65536.0D * (double) arg0);
            if (this.field3622 > this.field3621) {
                this.field3620 = ((this.field3616[this.field3623] << 15) - this.field3619) / (this.field3622 - this.field3621);
            }
        }
        this.field3619 += this.field3620;
        this.field3621++;
        return this.field3619 - this.field3620 >> 15;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V", line = 31)
    public final void method1616() {
        this.field3622 = 0;
        this.field3623 = 0;
        this.field3620 = 0;
        this.field3619 = 0;
        this.field3621 = 0;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Lwe;)V", line = 40)
    public final void method1617(class47 arg0) {
        this.field3613 = arg0.method368(55);
        this.field3617 = new int[this.field3613];
        this.field3616 = new int[this.field3613];
        for (int var2 = 0; var2 < this.field3613; var2++) {
            this.field3617[var2] = arg0.method379(-2);
            this.field3616[var2] = arg0.method379(-2);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 56)
    public class219() {
        this.field3617[0] = 0;
        this.field3617[1] = 65535;
        this.field3616[0] = 0;
        this.field3616[1] = 65535;
    }
}
