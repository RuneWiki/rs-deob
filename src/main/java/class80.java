import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class80 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    private int field1294 = 2;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
    private int[] field1296 = new int[2];

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[I")
    private int[] field1293 = new int[2];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lbb;)V", line = 4)
    public final void method574(class134 arg0) {
        this.field1292 = arg0.method948(-125);
        this.field1295 = arg0.method957(496113200);
        this.field1291 = arg0.method957(496113200);
        this.method575(arg0);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Lbb;)V", line = 11)
    public final void method575(class134 arg0) {
        this.field1294 = arg0.method948(-125);
        this.field1296 = new int[this.field1294];
        this.field1293 = new int[this.field1294];
        for (int var2 = 0; var2 < this.field1294; var2++) {
            this.field1296[var2] = arg0.method942(true);
            this.field1293[var2] = arg0.method942(true);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I", line = 28)
    public final int method576(int arg0) {
        if (this.field1301 >= this.field1299) {
            this.field1300 = this.field1293[this.field1297++] << 15;
            if (this.field1297 >= this.field1294) {
                this.field1297 = this.field1294 - 1;
            }
            this.field1299 = (int) ((double) this.field1296[this.field1297] / 65536.0D * (double) arg0);
            if (this.field1299 > this.field1301) {
                this.field1298 = ((this.field1293[this.field1297] << 15) - this.field1300) / (this.field1299 - this.field1301);
            }
        }
        this.field1300 += this.field1298;
        this.field1301++;
        return this.field1300 - this.field1298 >> 15;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V", line = 47)
    public final void method577() {
        this.field1299 = 0;
        this.field1297 = 0;
        this.field1298 = 0;
        this.field1300 = 0;
        this.field1301 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 56)
    public class80() {
        this.field1296[0] = 0;
        this.field1296[1] = 65535;
        this.field1293[0] = 0;
        this.field1293[1] = 65535;
    }
}
