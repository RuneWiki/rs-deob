import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class414 {

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    private int field5764 = 2;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "[I")
    private int[] field5763 = new int[2];

    @OriginalMember(owner = "client!av", name = "c", descriptor = "[I")
    private int[] field5762 = new int[2];

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public int field5760;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public int field5761;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public int field5765;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    private int field5766;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    private int field5767;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    private int field5768;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    private int field5769;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    private int field5770;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lvj;)V")
    public final void method2520(class26 arg0) {
        this.field5764 = arg0.method194((byte) 119);
        this.field5763 = new int[this.field5764];
        this.field5762 = new int[this.field5764];
        for (int var2 = 0; var2 < this.field5764; var2++) {
            this.field5763[var2] = arg0.method193(2);
            this.field5762[var2] = arg0.method193(2);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)I")
    public final int method2521(int arg0) {
        if (this.field5766 >= this.field5768) {
            this.field5770 = this.field5762[this.field5767++] << 15;
            if (this.field5767 >= this.field5764) {
                this.field5767 = this.field5764 - 1;
            }
            this.field5768 = (int) ((double) this.field5763[this.field5767] / 65536.0D * (double) arg0);
            if (this.field5768 > this.field5766) {
                this.field5769 = ((this.field5762[this.field5767] << 15) - this.field5770) / (this.field5768 - this.field5766);
            }
        }
        this.field5770 += this.field5769;
        this.field5766++;
        return this.field5770 - this.field5769 >> 15;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Lvj;)V")
    public final void method2522(class26 arg0) {
        this.field5765 = arg0.method194((byte) 119);
        this.field5760 = arg0.method189(255);
        this.field5761 = arg0.method189(255);
        this.method2520(arg0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "()V")
    public final void method2523() {
        this.field5768 = 0;
        this.field5767 = 0;
        this.field5769 = 0;
        this.field5770 = 0;
        this.field5766 = 0;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
    public class414() {
        this.field5763[0] = 0;
        this.field5763[1] = 65535;
        this.field5762[0] = 0;
        this.field5762[1] = 65535;
    }
}
