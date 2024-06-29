import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class304 {

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    private int field4355 = 2;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[I")
    private int[] field4354 = new int[2];

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[I")
    private int[] field4353 = new int[2];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    private int field4356;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    private int field4358;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    private int field4359;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    private int field4360;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lil;)V")
    public final void method1917(class265 arg0) {
        this.field4355 = arg0.method1697(120);
        this.field4354 = new int[this.field4355];
        this.field4353 = new int[this.field4355];
        for (int var2 = 0; var2 < this.field4355; var2++) {
            this.field4354[var2] = arg0.method1685(8104);
            this.field4353[var2] = arg0.method1685(8104);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
    public final void method1918() {
        this.field4359 = 0;
        this.field4358 = 0;
        this.field4360 = 0;
        this.field4356 = 0;
        this.field4357 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lil;)V")
    public final void method1919(class265 arg0) {
        this.field4350 = arg0.method1697(111);
        this.field4351 = arg0.method1666(-2);
        this.field4352 = arg0.method1666(-2);
        this.method1917(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
    public final int method1920(int arg0) {
        if (this.field4357 >= this.field4359) {
            this.field4356 = this.field4353[this.field4358++] << 15;
            if (this.field4358 >= this.field4355) {
                this.field4358 = this.field4355 - 1;
            }
            this.field4359 = (int) ((double) this.field4354[this.field4358] / 65536.0D * (double) arg0);
            if (this.field4359 > this.field4357) {
                this.field4360 = ((this.field4353[this.field4358] << 15) - this.field4356) / (this.field4359 - this.field4357);
            }
        }
        this.field4356 += this.field4360;
        this.field4357++;
        return this.field4356 - this.field4360 >> 15;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class304() {
        this.field4354[0] = 0;
        this.field4354[1] = 65535;
        this.field4353[0] = 0;
        this.field4353[1] = 65535;
    }
}
