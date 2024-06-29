import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class189 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    private int field2615 = 2;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
    private int[] field2613 = new int[2];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
    private int[] field2610 = new int[2];

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    private int field2616;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    private int field2617;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 5)
    public final void method1373() {
        this.field2616 = 0;
        this.field2617 = 0;
        this.field2620 = 0;
        this.field2618 = 0;
        this.field2619 = 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfd;)V", line = 15)
    public final void method1374(class299 arg0) {
        this.field2614 = arg0.method2096((byte) -122);
        this.field2612 = arg0.method2062(-25795);
        this.field2611 = arg0.method2062(-25795);
        this.method1376(arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I", line = 22)
    public final int method1375(int arg0) {
        if (this.field2619 >= this.field2616) {
            this.field2618 = this.field2610[this.field2617++] << 15;
            if (this.field2617 >= this.field2615) {
                this.field2617 = this.field2615 - 1;
            }
            this.field2616 = (int) ((double) this.field2613[this.field2617] / 65536.0D * (double) arg0);
            if (this.field2616 > this.field2619) {
                this.field2620 = ((this.field2610[this.field2617] << 15) - this.field2618) / (this.field2616 - this.field2619);
            }
        }
        this.field2618 += this.field2620;
        this.field2619++;
        return this.field2618 - this.field2620 >> 15;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Lfd;)V", line = 42)
    public final void method1376(class299 arg0) {
        this.field2615 = arg0.method2096((byte) -122);
        this.field2613 = new int[this.field2615];
        this.field2610 = new int[this.field2615];
        for (int var2 = 0; var2 < this.field2615; var2++) {
            this.field2613[var2] = arg0.method2083((byte) -127);
            this.field2610[var2] = arg0.method2083((byte) -66);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 56)
    public class189() {
        this.field2613[0] = 0;
        this.field2613[1] = 65535;
        this.field2610[0] = 0;
        this.field2610[1] = 65535;
    }
}
