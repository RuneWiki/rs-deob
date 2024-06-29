import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class66 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    private int field980 = 2;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[I")
    private int[] field982 = new int[2];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "[I")
    private int[] field979 = new int[2];

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 3)
    public final void method403() {
        this.field985 = 0;
        this.field986 = 0;
        this.field988 = 0;
        this.field989 = 0;
        this.field987 = 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lpb;)V", line = 10)
    public final void method404(class70 arg0) {
        this.field980 = arg0.method481(0);
        this.field982 = new int[this.field980];
        this.field979 = new int[this.field980];
        for (int var2 = 0; var2 < this.field980; var2++) {
            this.field982[var2] = arg0.method423(255);
            this.field979[var2] = arg0.method423(255);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lpb;)V", line = 25)
    public final void method405(class70 arg0) {
        this.field981 = arg0.method481(0);
        this.field983 = arg0.method469(119);
        this.field984 = arg0.method469(125);
        this.method404(arg0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I", line = 34)
    public final int method406(int arg0) {
        if (this.field987 >= this.field985) {
            this.field989 = this.field979[this.field986++] << 15;
            if (this.field986 >= this.field980) {
                this.field986 = this.field980 - 1;
            }
            this.field985 = (int) ((double) this.field982[this.field986] / 65536.0D * (double) arg0);
            if (this.field985 > this.field987) {
                this.field988 = ((this.field979[this.field986] << 15) - this.field989) / (this.field985 - this.field987);
            }
        }
        this.field989 += this.field988;
        this.field987++;
        return this.field989 - this.field988 >> 15;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 55)
    public class66() {
        this.field982[0] = 0;
        this.field982[1] = 65535;
        this.field979[0] = 0;
        this.field979[1] = 65535;
    }
}
