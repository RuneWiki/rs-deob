import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class179 {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    private int field2725 = 2;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "[I")
    private int[] field2723 = new int[2];

    @OriginalMember(owner = "client!su", name = "d", descriptor = "[I")
    private int[] field2726 = new int[2];

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    private int field2731;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    private int field2733;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I", line = 5)
    public final int method1258(int arg0) {
        if (this.field2732 >= this.field2730) {
            this.field2731 = this.field2726[this.field2733++] << 15;
            if (this.field2733 >= this.field2725) {
                this.field2733 = this.field2725 - 1;
            }
            this.field2730 = (int) ((double) this.field2723[this.field2733] / 65536.0D * (double) arg0);
            if (this.field2730 > this.field2732) {
                this.field2729 = ((this.field2726[this.field2733] << 15) - this.field2731) / (this.field2730 - this.field2732);
            }
        }
        this.field2731 += this.field2729;
        this.field2732++;
        return this.field2731 - this.field2729 >> 15;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "()V", line = 23)
    public final void method1259() {
        this.field2730 = 0;
        this.field2733 = 0;
        this.field2729 = 0;
        this.field2731 = 0;
        this.field2732 = 0;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lgw;)V", line = 31)
    public final void method1260(class148 arg0) {
        this.field2725 = arg0.method1032((byte) -33);
        this.field2723 = new int[this.field2725];
        this.field2726 = new int[this.field2725];
        for (int var2 = 0; var2 < this.field2725; var2++) {
            this.field2723[var2] = arg0.method1045(true);
            this.field2726[var2] = arg0.method1045(true);
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V", line = 50)
    public class179() {
        this.field2723[0] = 0;
        this.field2723[1] = 65535;
        this.field2726[0] = 0;
        this.field2726[1] = 65535;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Lgw;)V", line = 60)
    public final void method1261(class148 arg0) {
        this.field2724 = arg0.method1032((byte) -33);
        this.field2727 = arg0.method1026(-917302120);
        this.field2728 = arg0.method1026(-917302120);
        this.method1260(arg0);
    }
}
