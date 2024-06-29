import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class333 {

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    private int field4724 = 2;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[I")
    private int[] field4722 = new int[2];

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[I")
    private int[] field4725 = new int[2];

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public int field4723;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public int field4726;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    private int field4729;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    private int field4730;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    private int field4732;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
    public final void method2044() {
        this.field4728 = 0;
        this.field4730 = 0;
        this.field4732 = 0;
        this.field4731 = 0;
        this.field4729 = 0;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lol;)V")
    public final void method2045(class431 arg0) {
        this.field4724 = arg0.method2557(14929);
        this.field4722 = new int[this.field4724];
        this.field4725 = new int[this.field4724];
        for (int var2 = 0; var2 < this.field4724; var2++) {
            this.field4722[var2] = arg0.method2565((byte) -102);
            this.field4725[var2] = arg0.method2565((byte) -112);
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class333() {
        this.field4722[0] = 0;
        this.field4722[1] = 65535;
        this.field4725[0] = 0;
        this.field4725[1] = 65535;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)I")
    public final int method2046(int arg0) {
        if (this.field4729 >= this.field4728) {
            this.field4731 = this.field4725[this.field4730++] << 15;
            if (this.field4730 >= this.field4724) {
                this.field4730 = this.field4724 - 1;
            }
            this.field4728 = (int) ((double) this.field4722[this.field4730] / 65536.0D * (double) arg0);
            if (this.field4728 > this.field4729) {
                this.field4732 = ((this.field4725[this.field4730] << 15) - this.field4731) / (this.field4728 - this.field4729);
            }
        }
        this.field4731 += this.field4732;
        this.field4729++;
        return this.field4731 - this.field4732 >> 15;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Lol;)V")
    public final void method2047(class431 arg0) {
        this.field4726 = arg0.method2557(14929);
        this.field4727 = arg0.method2526(17);
        this.field4723 = arg0.method2526(17);
        this.method2045(arg0);
    }
}
