import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class344 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    private int field4604 = 2;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[I")
    private int[] field4600 = new int[2];

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    private int[] field4603 = new int[2];

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    private int field4607;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    private int field4608;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    private int field4610;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lug;)V")
    public final void method1998(class396 arg0) {
        this.field4602 = arg0.method2388((byte) -111);
        this.field4605 = arg0.method2406((byte) -108);
        this.field4601 = arg0.method2406((byte) -73);
        this.method1999(arg0);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lug;)V")
    public final void method1999(class396 arg0) {
        this.field4604 = arg0.method2388((byte) -121);
        this.field4600 = new int[this.field4604];
        this.field4603 = new int[this.field4604];
        for (int var2 = 0; var2 < this.field4604; var2++) {
            this.field4600[var2] = arg0.method2386(-23648);
            this.field4603[var2] = arg0.method2386(-23648);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public final void method2000() {
        this.field4606 = 0;
        this.field4610 = 0;
        this.field4609 = 0;
        this.field4608 = 0;
        this.field4607 = 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
    public final int method2001(int arg0) {
        if (this.field4607 >= this.field4606) {
            this.field4608 = this.field4603[this.field4610++] << 15;
            if (this.field4610 >= this.field4604) {
                this.field4610 = this.field4604 - 1;
            }
            this.field4606 = (int) ((double) this.field4600[this.field4610] / 65536.0D * (double) arg0);
            if (this.field4606 > this.field4607) {
                this.field4609 = ((this.field4603[this.field4610] << 15) - this.field4608) / (this.field4606 - this.field4607);
            }
        }
        this.field4608 += this.field4609;
        this.field4607++;
        return this.field4608 - this.field4609 >> 15;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class344() {
        this.field4600[0] = 0;
        this.field4600[1] = 65535;
        this.field4603[0] = 0;
        this.field4603[1] = 65535;
    }
}
