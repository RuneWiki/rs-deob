import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    private int field638 = 2;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    private int[] field639 = new int[2];

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
    private int[] field637 = new int[2];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    private int field642;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lgb;)V", line = 3)
    public final void method217(class39 arg0) {
        this.field638 = arg0.method330(-30864);
        this.field639 = new int[this.field638];
        this.field637 = new int[this.field638];
        for (int var2 = 0; var2 < this.field638; var2++) {
            this.field639[var2] = arg0.method343((byte) -6);
            this.field637[var2] = arg0.method343((byte) -6);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I", line = 19)
    public final int method218(int arg0) {
        if (this.field643 >= this.field646) {
            this.field644 = this.field637[this.field645++] << 15;
            if (this.field645 >= this.field638) {
                this.field645 = this.field638 - 1;
            }
            this.field646 = (int) ((double) this.field639[this.field645] / 65536.0D * (double) arg0);
            if (this.field646 > this.field643) {
                this.field642 = ((this.field637[this.field645] << 15) - this.field644) / (this.field646 - this.field643);
            }
        }
        this.field644 += this.field642;
        this.field643++;
        return this.field644 - this.field642 >> 15;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V", line = 37)
    public final void method219() {
        this.field646 = 0;
        this.field645 = 0;
        this.field642 = 0;
        this.field644 = 0;
        this.field643 = 0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lgb;)V", line = 45)
    public final void method220(class39 arg0) {
        this.field640 = arg0.method330(-30864);
        this.field636 = arg0.method322((byte) -118);
        this.field641 = arg0.method322((byte) -118);
        this.method217(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 55)
    public class26() {
        this.field639[0] = 0;
        this.field639[1] = 65535;
        this.field637[0] = 0;
        this.field637[1] = 65535;
    }
}
