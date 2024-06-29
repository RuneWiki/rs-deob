import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class69 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    private int field1389 = 2;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
    private int[] field1391 = new int[2];

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[I")
    private int[] field1388 = new int[2];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
    public final int method442(int arg0) {
        if (this.field1394 >= this.field1393) {
            this.field1395 = this.field1388[this.field1397++] << 15;
            if (this.field1397 >= this.field1389) {
                this.field1397 = this.field1389 - 1;
            }
            this.field1393 = (int) ((double) this.field1391[this.field1397] / 65536.0D * (double) arg0);
            if (this.field1393 > this.field1394) {
                this.field1396 = ((this.field1388[this.field1397] << 15) - this.field1395) / (this.field1393 - this.field1394);
            }
        }
        this.field1395 += this.field1396;
        this.field1394++;
        return this.field1395 - this.field1396 >> 15;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public final void method443() {
        this.field1393 = 0;
        this.field1397 = 0;
        this.field1396 = 0;
        this.field1395 = 0;
        this.field1394 = 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lsi;)V")
    public final void method444(class194 arg0) {
        this.field1392 = arg0.method1301(-8317);
        this.field1387 = arg0.method1266(4);
        this.field1390 = arg0.method1266(4);
        this.method445(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lsi;)V")
    public final void method445(class194 arg0) {
        this.field1389 = arg0.method1301(-8317);
        this.field1391 = new int[this.field1389];
        this.field1388 = new int[this.field1389];
        for (int var2 = 0; var2 < this.field1389; var2++) {
            this.field1391[var2] = arg0.method1294((byte) 3);
            this.field1388[var2] = arg0.method1294((byte) 3);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class69() {
        this.field1391[0] = 0;
        this.field1391[1] = 65535;
        this.field1388[0] = 0;
        this.field1388[1] = 65535;
    }
}
