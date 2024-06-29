import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class432 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    private int field6131 = 2;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    private int[] field6134 = new int[2];

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
    private int[] field6133 = new int[2];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public int field6132;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field6135;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public int field6136;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    private int field6137;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    private int field6138;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    private int field6139;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    private int field6140;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    private int field6141;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 4)
    public final void method2679() {
        this.field6137 = 0;
        this.field6141 = 0;
        this.field6140 = 0;
        this.field6139 = 0;
        this.field6138 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lap;)V", line = 14)
    public final void method2680(class289 arg0) {
        this.field6132 = arg0.method1861((byte) -72);
        this.field6135 = arg0.method1856((byte) 120);
        this.field6136 = arg0.method1856((byte) 119);
        this.method2681(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lap;)V", line = 23)
    public final void method2681(class289 arg0) {
        this.field6131 = arg0.method1861((byte) -72);
        this.field6134 = new int[this.field6131];
        this.field6133 = new int[this.field6131];
        for (int var2 = 0; var2 < this.field6131; var2++) {
            this.field6134[var2] = arg0.method1853(-52);
            this.field6133[var2] = arg0.method1853(100);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I", line = 38)
    public final int method2682(int arg0) {
        if (this.field6138 >= this.field6137) {
            this.field6139 = this.field6133[this.field6141++] << 15;
            if (this.field6141 >= this.field6131) {
                this.field6141 = this.field6131 - 1;
            }
            this.field6137 = (int) ((double) this.field6134[this.field6141] / 65536.0D * (double) arg0);
            if (this.field6137 > this.field6138) {
                this.field6140 = ((this.field6133[this.field6141] << 15) - this.field6139) / (this.field6137 - this.field6138);
            }
        }
        this.field6139 += this.field6140;
        this.field6138++;
        return this.field6139 - this.field6140 >> 15;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 56)
    public class432() {
        this.field6134[0] = 0;
        this.field6134[1] = 65535;
        this.field6133[0] = 0;
        this.field6133[1] = 65535;
    }
}
