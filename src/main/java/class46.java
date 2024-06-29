import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    private int field1031 = 2;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
    private int[] field1033 = new int[2];

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    private int[] field1032 = new int[2];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lb;)V", line = 5)
    public final void method384(class7 arg0) {
        this.field1034 = arg0.method96(27023);
        this.field1029 = arg0.method104(-1699);
        this.field1030 = arg0.method104(-1699);
        this.method387(arg0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 15)
    public final void method385() {
        this.field1037 = 0;
        this.field1039 = 0;
        this.field1035 = 0;
        this.field1036 = 0;
        this.field1038 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I", line = 22)
    public final int method386(int arg0) {
        if (this.field1038 >= this.field1037) {
            this.field1036 = this.field1032[this.field1039++] << 15;
            if (this.field1039 >= this.field1031) {
                this.field1039 = this.field1031 - 1;
            }
            this.field1037 = (int) ((double) this.field1033[this.field1039] / 65536.0D * (double) arg0);
            if (this.field1037 > this.field1038) {
                this.field1035 = ((this.field1032[this.field1039] << 15) - this.field1036) / (this.field1037 - this.field1038);
            }
        }
        this.field1036 += this.field1035;
        this.field1038++;
        return this.field1036 - this.field1035 >> 15;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lb;)V", line = 39)
    public final void method387(class7 arg0) {
        this.field1031 = arg0.method96(27023);
        this.field1033 = new int[this.field1031];
        this.field1032 = new int[this.field1031];
        for (int var2 = 0; var2 < this.field1031; var2++) {
            this.field1033[var2] = arg0.method101(2);
            this.field1032[var2] = arg0.method101(2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 56)
    public class46() {
        this.field1033[0] = 0;
        this.field1033[1] = 65535;
        this.field1032[0] = 0;
        this.field1032[1] = 65535;
    }
}
