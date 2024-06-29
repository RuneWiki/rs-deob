import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class228 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    private int field3540 = 2;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "[I")
    private int[] field3541 = new int[2];

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "[I")
    private int[] field3544 = new int[2];

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    private int field3546;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    private int field3548;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
    public final int method1510(int arg0) {
        if (this.field3546 >= this.field3547) {
            this.field3548 = this.field3544[this.field3550++] << 15;
            if (this.field3550 >= this.field3540) {
                this.field3550 = this.field3540 - 1;
            }
            this.field3547 = (int) ((double) this.field3541[this.field3550] / 65536.0D * (double) arg0);
            if (this.field3547 > this.field3546) {
                this.field3549 = ((this.field3544[this.field3550] << 15) - this.field3548) / (this.field3547 - this.field3546);
            }
        }
        this.field3548 += this.field3549;
        this.field3546++;
        return this.field3548 - this.field3549 >> 15;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lnn;)V")
    public final void method1511(class289 arg0) {
        this.field3545 = arg0.method1858(-3256);
        this.field3542 = arg0.method1815((byte) -43);
        this.field3543 = arg0.method1815((byte) -92);
        this.method1513(arg0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
    public final void method1512() {
        this.field3547 = 0;
        this.field3550 = 0;
        this.field3549 = 0;
        this.field3548 = 0;
        this.field3546 = 0;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Lnn;)V")
    public final void method1513(class289 arg0) {
        this.field3540 = arg0.method1858(-3256);
        this.field3541 = new int[this.field3540];
        this.field3544 = new int[this.field3540];
        for (int var2 = 0; var2 < this.field3540; var2++) {
            this.field3541[var2] = arg0.method1841((byte) 87);
            this.field3544[var2] = arg0.method1841((byte) -127);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
    public class228() {
        this.field3541[0] = 0;
        this.field3541[1] = 65535;
        this.field3544[0] = 0;
        this.field3544[1] = 65535;
    }
}
