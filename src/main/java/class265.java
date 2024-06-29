import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class265 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    private int field4519 = 2;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "[I")
    private int[] field4523 = new int[2];

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    private int[] field4524 = new int[2];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field4525;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private int field4528;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
    public final void method1767() {
        this.field4527 = 0;
        this.field4528 = 0;
        this.field4529 = 0;
        this.field4525 = 0;
        this.field4526 = 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
    public final int method1768(int arg0) {
        if (this.field4526 >= this.field4527) {
            this.field4525 = this.field4524[this.field4528++] << 15;
            if (this.field4528 >= this.field4519) {
                this.field4528 = this.field4519 - 1;
            }
            this.field4527 = (int) ((double) this.field4523[this.field4528] / 65536.0D * (double) arg0);
            if (this.field4527 > this.field4526) {
                this.field4529 = ((this.field4524[this.field4528] << 15) - this.field4525) / (this.field4527 - this.field4526);
            }
        }
        this.field4525 += this.field4529;
        this.field4526++;
        return this.field4525 - this.field4529 >> 15;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class265() {
        this.field4523[0] = 0;
        this.field4523[1] = 65535;
        this.field4524[0] = 0;
        this.field4524[1] = 65535;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lie;)V")
    public final void method1769(class32 arg0) {
        this.field4519 = arg0.method316((byte) -37);
        this.field4523 = new int[this.field4519];
        this.field4524 = new int[this.field4519];
        for (int var2 = 0; var2 < this.field4519; var2++) {
            this.field4523[var2] = arg0.method339(-16777216);
            this.field4524[var2] = arg0.method339(-16777216);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lie;)V")
    public final void method1770(class32 arg0) {
        this.field4522 = arg0.method316((byte) -102);
        this.field4520 = arg0.method319((byte) -18);
        this.field4521 = arg0.method319((byte) -18);
        this.method1769(arg0);
    }
}
