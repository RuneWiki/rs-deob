import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class165 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    private int field2675 = 2;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
    private int[] field2674 = new int[2];

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    private int[] field2676 = new int[2];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V", line = 3)
    public final void method1138() {
        this.field2680 = 0;
        this.field2681 = 0;
        this.field2682 = 0;
        this.field2679 = 0;
        this.field2683 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lim;)V", line = 10)
    public final void method1139(class192 arg0) {
        this.field2675 = arg0.method1399(-1172389784);
        this.field2674 = new int[this.field2675];
        this.field2676 = new int[this.field2675];
        for (int var2 = 0; var2 < this.field2675; var2++) {
            this.field2674[var2] = arg0.method1396(-109);
            this.field2676[var2] = arg0.method1396(-51);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lim;)V", line = 26)
    public final void method1140(class192 arg0) {
        this.field2677 = arg0.method1399(-1172389784);
        this.field2678 = arg0.method1354((byte) 77);
        this.field2673 = arg0.method1354((byte) -113);
        this.method1139(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I", line = 39)
    public final int method1141(int arg0) {
        if (this.field2683 >= this.field2680) {
            this.field2679 = this.field2676[this.field2681++] << 15;
            if (this.field2681 >= this.field2675) {
                this.field2681 = this.field2675 - 1;
            }
            this.field2680 = (int) ((double) this.field2674[this.field2681] / 65536.0D * (double) arg0);
            if (this.field2680 > this.field2683) {
                this.field2682 = ((this.field2676[this.field2681] << 15) - this.field2679) / (this.field2680 - this.field2683);
            }
        }
        this.field2679 += this.field2682;
        this.field2683++;
        return this.field2679 - this.field2682 >> 15;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 56)
    public class165() {
        this.field2674[0] = 0;
        this.field2674[1] = 65535;
        this.field2676[0] = 0;
        this.field2676[1] = 65535;
    }
}
