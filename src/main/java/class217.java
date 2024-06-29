import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class217 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    private int field3723 = 2;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
    private int[] field3725 = new int[2];

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
    private int[] field3726 = new int[2];

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    private int field3729;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    private int field3732;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    private int field3733;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Llj;)V")
    public final void method1452(class25 arg0) {
        this.field3724 = arg0.method189((byte) -103);
        this.field3727 = arg0.method199((byte) -85);
        this.field3728 = arg0.method199((byte) -85);
        this.method1454(arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
    public final int method1453(int arg0) {
        if (this.field3733 >= this.field3729) {
            this.field3731 = this.field3726[this.field3732++] << 15;
            if (this.field3732 >= this.field3723) {
                this.field3732 = this.field3723 - 1;
            }
            this.field3729 = (int) ((double) this.field3725[this.field3732] / 65536.0D * (double) arg0);
            if (this.field3729 > this.field3733) {
                this.field3730 = ((this.field3726[this.field3732] << 15) - this.field3731) / (this.field3729 - this.field3733);
            }
        }
        this.field3731 += this.field3730;
        this.field3733++;
        return this.field3731 - this.field3730 >> 15;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Llj;)V")
    public final void method1454(class25 arg0) {
        this.field3723 = arg0.method189((byte) -103);
        this.field3725 = new int[this.field3723];
        this.field3726 = new int[this.field3723];
        for (int var2 = 0; var2 < this.field3723; var2++) {
            this.field3725[var2] = arg0.method193((byte) 77);
            this.field3726[var2] = arg0.method193((byte) 77);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class217() {
        this.field3725[0] = 0;
        this.field3725[1] = 65535;
        this.field3726[0] = 0;
        this.field3726[1] = 65535;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public final void method1455() {
        this.field3729 = 0;
        this.field3732 = 0;
        this.field3730 = 0;
        this.field3731 = 0;
        this.field3733 = 0;
    }
}
