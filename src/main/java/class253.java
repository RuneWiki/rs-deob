import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class253 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    private int field3545 = 2;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
    private int[] field3542 = new int[2];

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    private int[] field3544 = new int[2];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    private int field3546;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    private int field3548;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public final void method1571() {
        this.field3548 = 0;
        this.field3549 = 0;
        this.field3547 = 0;
        this.field3550 = 0;
        this.field3546 = 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Llk;)V")
    public final void method1572(class425 arg0) {
        this.field3543 = arg0.method2503(true);
        this.field3540 = arg0.method2502((byte) -86);
        this.field3541 = arg0.method2502((byte) -86);
        this.method1574(arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
    public final int method1573(int arg0) {
        if (this.field3546 >= this.field3548) {
            this.field3550 = this.field3544[this.field3549++] << 15;
            if (this.field3549 >= this.field3545) {
                this.field3549 = this.field3545 - 1;
            }
            this.field3548 = (int) ((double) this.field3542[this.field3549] / 65536.0D * (double) arg0);
            if (this.field3548 > this.field3546) {
                this.field3547 = ((this.field3544[this.field3549] << 15) - this.field3550) / (this.field3548 - this.field3546);
            }
        }
        this.field3550 += this.field3547;
        this.field3546++;
        return this.field3550 - this.field3547 >> 15;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Llk;)V")
    public final void method1574(class425 arg0) {
        this.field3545 = arg0.method2503(true);
        this.field3542 = new int[this.field3545];
        this.field3544 = new int[this.field3545];
        for (int var2 = 0; var2 < this.field3545; var2++) {
            this.field3542[var2] = arg0.method2508(true);
            this.field3544[var2] = arg0.method2508(true);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class253() {
        this.field3542[0] = 0;
        this.field3542[1] = 65535;
        this.field3544[0] = 0;
        this.field3544[1] = 65535;
    }
}
