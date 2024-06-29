import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class214 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private int field3776 = 2;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
    private int[] field3779 = new int[2];

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
    private int[] field3778 = new int[2];

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I")
    public final int method1460(int arg0) {
        if (this.field3784 >= this.field3786) {
            this.field3782 = this.field3778[this.field3785++] << 15;
            if (this.field3785 >= this.field3776) {
                this.field3785 = this.field3776 - 1;
            }
            this.field3786 = (int) ((double) this.field3779[this.field3785] / 65536.0D * (double) arg0);
            if (this.field3786 > this.field3784) {
                this.field3783 = ((this.field3778[this.field3785] << 15) - this.field3782) / (this.field3786 - this.field3784);
            }
        }
        this.field3782 += this.field3783;
        this.field3784++;
        return this.field3782 - this.field3783 >> 15;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public final void method1461() {
        this.field3786 = 0;
        this.field3785 = 0;
        this.field3783 = 0;
        this.field3782 = 0;
        this.field3784 = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lji;)V")
    public final void method1462(class225 arg0) {
        this.field3776 = arg0.method1580(-124);
        this.field3779 = new int[this.field3776];
        this.field3778 = new int[this.field3776];
        for (int var2 = 0; var2 < this.field3776; var2++) {
            this.field3779[var2] = arg0.method1593(true);
            this.field3778[var2] = arg0.method1593(true);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lji;)V")
    public final void method1463(class225 arg0) {
        this.field3780 = arg0.method1580(-122);
        this.field3777 = arg0.method1562(21705);
        this.field3781 = arg0.method1562(21705);
        this.method1462(arg0);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class214() {
        this.field3779[0] = 0;
        this.field3779[1] = 65535;
        this.field3778[0] = 0;
        this.field3778[1] = 65535;
    }
}
