import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    private int field376 = 2;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
    private int[] field375 = new int[2];

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    private int[] field377 = new int[2];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    public final void method138() {
        this.field382 = 0;
        this.field380 = 0;
        this.field378 = 0;
        this.field379 = 0;
        this.field381 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lna;)V")
    public final void method139(class91 arg0) {
        this.field372 = arg0.method649(false);
        this.field373 = arg0.method631(-99);
        this.field374 = arg0.method631(-52);
        this.method141(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I")
    public final int method140(int arg0) {
        if (this.field381 >= this.field382) {
            this.field379 = this.field377[this.field380++] << 15;
            if (this.field380 >= this.field376) {
                this.field380 = this.field376 - 1;
            }
            this.field382 = (int) ((double) this.field375[this.field380] / 65536.0D * (double) arg0);
            if (this.field382 > this.field381) {
                this.field378 = ((this.field377[this.field380] << 15) - this.field379) / (this.field382 - this.field381);
            }
        }
        this.field379 += this.field378;
        this.field381++;
        return this.field379 - this.field378 >> 15;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lna;)V")
    public final void method141(class91 arg0) {
        this.field376 = arg0.method649(false);
        this.field375 = new int[this.field376];
        this.field377 = new int[this.field376];
        for (int var2 = 0; var2 < this.field376; var2++) {
            this.field375[var2] = arg0.method641(255);
            this.field377[var2] = arg0.method641(255);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class21() {
        this.field375[0] = 0;
        this.field375[1] = 65535;
        this.field377[0] = 0;
        this.field377[1] = 65535;
    }
}
