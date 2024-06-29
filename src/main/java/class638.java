import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class638 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    private int field9025 = 2;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
    private int[] field9020 = new int[2];

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
    private int[] field9021 = new int[2];

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public int field9022;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public int field9023;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field9024;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    private int field9026;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    private int field9027;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    private int field9028;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field9029;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    private int field9030;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Ljc;)V", line = 4)
    public final void method4645(class711 arg0) {
        this.field9024 = arg0.method5128(0);
        this.field9023 = arg0.method5113(18443);
        this.field9022 = arg0.method5113(18443);
        this.method4647(arg0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I", line = 10)
    public final int method4646(int arg0) {
        if (this.field9027 >= this.field9028) {
            this.field9029 = this.field9021[this.field9026++] << 15;
            if (this.field9026 >= this.field9025) {
                this.field9026 = this.field9025 - 1;
            }
            this.field9028 = (int) ((double) this.field9020[this.field9026] / 65536.0D * (double) arg0);
            if (this.field9028 > this.field9027) {
                this.field9030 = ((this.field9021[this.field9026] << 15) - this.field9029) / (this.field9028 - this.field9027);
            }
        }
        this.field9029 += this.field9030;
        this.field9027++;
        return this.field9029 - this.field9030 >> 15;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljc;)V", line = 31)
    public final void method4647(class711 arg0) {
        this.field9025 = arg0.method5128(0);
        this.field9020 = new int[this.field9025];
        this.field9021 = new int[this.field9025];
        for (int var2 = 0; var2 < this.field9025; var2++) {
            this.field9020[var2] = arg0.method5116((byte) -118);
            this.field9021[var2] = arg0.method5116((byte) -121);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V", line = 48)
    public final void method4648() {
        this.field9028 = 0;
        this.field9026 = 0;
        this.field9030 = 0;
        this.field9029 = 0;
        this.field9027 = 0;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 56)
    public class638() {
        this.field9020[0] = 0;
        this.field9020[1] = 65535;
        this.field9021[0] = 0;
        this.field9021[1] = 65535;
    }
}
