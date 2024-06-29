import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class289 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    private int field4726 = 2;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[I")
    private int[] field4728 = new int[2];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    private int[] field4725 = new int[2];

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field4730;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    private int field4732;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    private int field4733;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    private int field4734;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfj;)V")
    public final void method1991(class274 arg0) {
        this.field4726 = arg0.method1849(255);
        this.field4728 = new int[this.field4726];
        this.field4725 = new int[this.field4726];
        for (int var2 = 0; var2 < this.field4726; var2++) {
            this.field4728[var2] = arg0.method1837(252);
            this.field4725[var2] = arg0.method1837(252);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Lfj;)V")
    public final void method1992(class274 arg0) {
        this.field4729 = arg0.method1849(255);
        this.field4727 = arg0.method1833((byte) -104);
        this.field4724 = arg0.method1833((byte) -104);
        this.method1991(arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
    public final void method1993() {
        this.field4733 = 0;
        this.field4730 = 0;
        this.field4732 = 0;
        this.field4731 = 0;
        this.field4734 = 0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public final int method1994(int arg0) {
        if (this.field4734 >= this.field4733) {
            this.field4731 = this.field4725[this.field4730++] << 15;
            if (this.field4730 >= this.field4726) {
                this.field4730 = this.field4726 - 1;
            }
            this.field4733 = (int) ((double) this.field4728[this.field4730] / 65536.0D * (double) arg0);
            if (this.field4733 > this.field4734) {
                this.field4732 = ((this.field4725[this.field4730] << 15) - this.field4731) / (this.field4733 - this.field4734);
            }
        }
        this.field4731 += this.field4732;
        this.field4734++;
        return this.field4731 - this.field4732 >> 15;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class289() {
        this.field4728[0] = 0;
        this.field4728[1] = 65535;
        this.field4725[0] = 0;
        this.field4725[1] = 65535;
    }
}
