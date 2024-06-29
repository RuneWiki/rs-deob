import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class76 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    private int field1479 = 2;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    private int[] field1481 = new int[2];

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
    private int[] field1483 = new int[2];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 8)
    public final void method646() {
        this.field1485 = 0;
        this.field1487 = 0;
        this.field1488 = 0;
        this.field1486 = 0;
        this.field1484 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lvh;)V", line = 15)
    public final void method647(class53 arg0) {
        this.field1479 = arg0.method483(-123);
        this.field1481 = new int[this.field1479];
        this.field1483 = new int[this.field1479];
        for (int var2 = 0; var2 < this.field1479; var2++) {
            this.field1481[var2] = arg0.method468(28214);
            this.field1483[var2] = arg0.method468(28214);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 30)
    public class76() {
        this.field1481[0] = 0;
        this.field1481[1] = 65535;
        this.field1483[0] = 0;
        this.field1483[1] = 65535;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 41)
    public final int method648(int arg0) {
        if (this.field1484 >= this.field1485) {
            this.field1486 = this.field1483[this.field1487++] << 15;
            if (this.field1487 >= this.field1479) {
                this.field1487 = this.field1479 - 1;
            }
            this.field1485 = (int) ((double) this.field1481[this.field1487] / 65536.0D * (double) arg0);
            if (this.field1485 > this.field1484) {
                this.field1488 = ((this.field1483[this.field1487] << 15) - this.field1486) / (this.field1485 - this.field1484);
            }
        }
        this.field1486 += this.field1488;
        this.field1484++;
        return this.field1486 - this.field1488 >> 15;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lvh;)V", line = 58)
    public final void method649(class53 arg0) {
        this.field1482 = arg0.method483(-106);
        this.field1480 = arg0.method453(1);
        this.field1478 = arg0.method453(1);
        this.method647(arg0);
    }
}
