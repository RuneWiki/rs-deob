import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class140 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field3308 = 2;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    private int[] field3311 = new int[2];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    private int[] field3307 = new int[2];

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field3309;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    private int field3315;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lrd;)V")
    public final void method1146(class122 arg0) {
        this.field3306 = arg0.method931((byte) 124);
        this.field3309 = arg0.method972(106);
        this.field3310 = arg0.method972(119);
        this.method1148(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public final void method1147() {
        this.field3314 = 0;
        this.field3316 = 0;
        this.field3313 = 0;
        this.field3312 = 0;
        this.field3315 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lrd;)V")
    public final void method1148(class122 arg0) {
        this.field3308 = arg0.method931((byte) 124);
        this.field3311 = new int[this.field3308];
        this.field3307 = new int[this.field3308];
        for (int var2 = 0; var2 < this.field3308; var2++) {
            this.field3311[var2] = arg0.method965(false);
            this.field3307[var2] = arg0.method965(false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method1149(int arg0) {
        if (this.field3315 >= this.field3314) {
            this.field3312 = this.field3307[this.field3316++] << 15;
            if (this.field3316 >= this.field3308) {
                this.field3316 = this.field3308 - 1;
            }
            this.field3314 = (int) ((double) this.field3311[this.field3316] / 65536.0D * (double) arg0);
            if (this.field3314 > this.field3315) {
                this.field3313 = ((this.field3307[this.field3316] << 15) - this.field3312) / (this.field3314 - this.field3315);
            }
        }
        this.field3312 += this.field3313;
        this.field3315++;
        return this.field3312 - this.field3313 >> 15;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class140() {
        this.field3311[0] = 0;
        this.field3311[1] = 65535;
        this.field3307[0] = 0;
        this.field3307[1] = 65535;
    }
}
