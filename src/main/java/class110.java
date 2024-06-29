import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class110 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    private int field2521 = 2;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    private int[] field2524 = new int[2];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
    private int[] field2520 = new int[2];

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    private int field2526;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    private int field2527;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    private int field2530;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I", line = 9)
    public final int method834(int arg0) {
        if (this.field2528 >= this.field2529) {
            this.field2526 = this.field2520[this.field2527++] << 15;
            if (this.field2527 >= this.field2521) {
                this.field2527 = this.field2521 - 1;
            }
            this.field2529 = (int) ((double) this.field2524[this.field2527] / 65536.0D * (double) arg0);
            if (this.field2529 > this.field2528) {
                this.field2530 = ((this.field2520[this.field2527] << 15) - this.field2526) / (this.field2529 - this.field2528);
            }
        }
        this.field2526 += this.field2530;
        this.field2528++;
        return this.field2526 - this.field2530 >> 15;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lwd;)V", line = 27)
    public final void method835(class140 arg0) {
        this.field2521 = arg0.method1105(255);
        this.field2524 = new int[this.field2521];
        this.field2520 = new int[this.field2521];
        for (int var2 = 0; var2 < this.field2521; var2++) {
            this.field2524[var2] = arg0.method1072(16);
            this.field2520[var2] = arg0.method1072(89);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lwd;)V", line = 43)
    public final void method836(class140 arg0) {
        this.field2525 = arg0.method1105(255);
        this.field2522 = arg0.method1118(4);
        this.field2523 = arg0.method1118(4);
        this.method835(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 49)
    public class110() {
        this.field2524[0] = 0;
        this.field2524[1] = 65535;
        this.field2520[0] = 0;
        this.field2520[1] = 65535;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 62)
    public final void method837() {
        this.field2529 = 0;
        this.field2527 = 0;
        this.field2530 = 0;
        this.field2526 = 0;
        this.field2528 = 0;
    }
}
