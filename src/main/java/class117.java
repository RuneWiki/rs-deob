import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class117 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field1510 = 2;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
    private int[] field1513 = new int[2];

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
    private int[] field1514 = new int[2];

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lun;)V")
    public final void method828(class389 arg0) {
        this.field1510 = arg0.method2229(255);
        this.field1513 = new int[this.field1510];
        this.field1514 = new int[this.field1510];
        for (int var2 = 0; var2 < this.field1510; var2++) {
            this.field1513[var2] = arg0.method2260(-64);
            this.field1514[var2] = arg0.method2260(-36);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
    public final void method829() {
        this.field1516 = 0;
        this.field1520 = 0;
        this.field1517 = 0;
        this.field1518 = 0;
        this.field1519 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
    public final int method830(int arg0) {
        if (this.field1519 >= this.field1516) {
            this.field1518 = this.field1514[this.field1520++] << 15;
            if (this.field1520 >= this.field1510) {
                this.field1520 = this.field1510 - 1;
            }
            this.field1516 = (int) ((double) this.field1513[this.field1520] / 65536.0D * (double) arg0);
            if (this.field1516 > this.field1519) {
                this.field1517 = ((this.field1514[this.field1520] << 15) - this.field1518) / (this.field1516 - this.field1519);
            }
        }
        this.field1518 += this.field1517;
        this.field1519++;
        return this.field1518 - this.field1517 >> 15;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class117() {
        this.field1513[0] = 0;
        this.field1513[1] = 65535;
        this.field1514[0] = 0;
        this.field1514[1] = 65535;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lun;)V")
    public final void method831(class389 arg0) {
        this.field1515 = arg0.method2229(255);
        this.field1511 = arg0.method2255(255);
        this.field1512 = arg0.method2255(255);
        this.method828(arg0);
    }
}
