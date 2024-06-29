import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class37 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    private int field807 = 2;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
    private int[] field809 = new int[2];

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
    private int[] field805 = new int[2];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lra;)V")
    public final void method243(class185 arg0) {
        this.field807 = arg0.method1243(3);
        this.field809 = new int[this.field807];
        this.field805 = new int[this.field807];
        for (int var2 = 0; var2 < this.field807; var2++) {
            this.field809[var2] = arg0.method1252(2);
            this.field805[var2] = arg0.method1252(2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V")
    public final void method244() {
        this.field810 = 0;
        this.field812 = 0;
        this.field814 = 0;
        this.field811 = 0;
        this.field813 = 0;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lra;)V")
    public final void method245(class185 arg0) {
        this.field806 = arg0.method1243(3);
        this.field808 = arg0.method1231(-4898);
        this.field804 = arg0.method1231(-4898);
        this.method243(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public final int method246(int arg0) {
        if (this.field813 >= this.field810) {
            this.field811 = this.field805[this.field812++] << 15;
            if (this.field812 >= this.field807) {
                this.field812 = this.field807 - 1;
            }
            this.field810 = (int) ((double) this.field809[this.field812] / 65536.0D * (double) arg0);
            if (this.field810 > this.field813) {
                this.field814 = ((this.field805[this.field812] << 15) - this.field811) / (this.field810 - this.field813);
            }
        }
        this.field811 += this.field814;
        this.field813++;
        return this.field811 - this.field814 >> 15;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class37() {
        this.field809[0] = 0;
        this.field809[1] = 65535;
        this.field805[0] = 0;
        this.field805[1] = 65535;
    }
}
