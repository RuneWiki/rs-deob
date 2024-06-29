import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class168 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    private int field2576 = 2;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    private int[] field2577 = new int[2];

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    private int[] field2574 = new int[2];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    private int field2581;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    private int field2582;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I")
    public final int method1046(int arg0) {
        if (this.field2581 >= this.field2578) {
            this.field2579 = this.field2574[this.field2582++] << 15;
            if (this.field2582 >= this.field2576) {
                this.field2582 = this.field2576 - 1;
            }
            this.field2578 = (int) ((double) this.field2577[this.field2582] / 65536.0D * (double) arg0);
            if (this.field2578 > this.field2581) {
                this.field2580 = ((this.field2574[this.field2582] << 15) - this.field2579) / (this.field2578 - this.field2581);
            }
        }
        this.field2579 += this.field2580;
        this.field2581++;
        return this.field2579 - this.field2580 >> 15;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
    public final void method1047() {
        this.field2578 = 0;
        this.field2582 = 0;
        this.field2580 = 0;
        this.field2579 = 0;
        this.field2581 = 0;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class168() {
        this.field2577[0] = 0;
        this.field2577[1] = 65535;
        this.field2574[0] = 0;
        this.field2574[1] = 65535;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lfl;)V")
    public final void method1048(class248 arg0) {
        this.field2576 = arg0.method1593((byte) 27);
        this.field2577 = new int[this.field2576];
        this.field2574 = new int[this.field2576];
        for (int var2 = 0; var2 < this.field2576; var2++) {
            this.field2577[var2] = arg0.method1575(false);
            this.field2574[var2] = arg0.method1575(false);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lfl;)V")
    public final void method1049(class248 arg0) {
        this.field2573 = arg0.method1593((byte) 27);
        this.field2575 = arg0.method1576(-17672);
        this.field2572 = arg0.method1576(-17672);
        this.method1048(arg0);
    }
}
