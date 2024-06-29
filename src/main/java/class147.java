import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class147 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    private int field2583 = 2;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
    private int[] field2582 = new int[2];

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
    private int[] field2580 = new int[2];

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    private int field2585;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    private int field2586;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field2587;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    private int field2588;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    private int field2589;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I", line = 4)
    public final int method1072(int arg0) {
        if (this.field2588 >= this.field2585) {
            this.field2586 = this.field2580[this.field2587++] << 15;
            if (this.field2587 >= this.field2583) {
                this.field2587 = this.field2583 - 1;
            }
            this.field2585 = (int) ((double) this.field2582[this.field2587] / 65536.0D * (double) arg0);
            if (this.field2585 > this.field2588) {
                this.field2589 = ((this.field2580[this.field2587] << 15) - this.field2586) / (this.field2585 - this.field2588);
            }
        }
        this.field2586 += this.field2589;
        this.field2588++;
        return this.field2586 - this.field2589 >> 15;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lra;)V", line = 25)
    public final void method1073(class41 arg0) {
        this.field2584 = arg0.method357(false);
        this.field2579 = arg0.method327(4);
        this.field2581 = arg0.method327(4);
        this.method1074(arg0);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lra;)V", line = 31)
    public final void method1074(class41 arg0) {
        this.field2583 = arg0.method357(false);
        this.field2582 = new int[this.field2583];
        this.field2580 = new int[this.field2583];
        for (int var2 = 0; var2 < this.field2583; var2++) {
            this.field2582[var2] = arg0.method346(-16);
            this.field2580[var2] = arg0.method346(-16);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V", line = 47)
    public final void method1075() {
        this.field2585 = 0;
        this.field2587 = 0;
        this.field2589 = 0;
        this.field2586 = 0;
        this.field2588 = 0;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 56)
    public class147() {
        this.field2582[0] = 0;
        this.field2582[1] = 65535;
        this.field2580[0] = 0;
        this.field2580[1] = 65535;
    }
}
