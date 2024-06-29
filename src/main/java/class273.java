import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class273 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    private int field4386 = 2;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
    private int[] field4383 = new int[2];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
    private int[] field4387 = new int[2];

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    private int field4389;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    private int field4390;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    private int field4392;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V", line = 7)
    public final void method2347() {
        this.field4388 = 0;
        this.field4390 = 0;
        this.field4389 = 0;
        this.field4392 = 0;
        this.field4391 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwq;)V", line = 14)
    public final void method2348(class176 arg0) {
        this.field4385 = arg0.method1645((byte) -119);
        this.field4382 = arg0.method1622(-18712);
        this.field4384 = arg0.method1622(-18712);
        this.method2349(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lwq;)V", line = 24)
    public final void method2349(class176 arg0) {
        this.field4386 = arg0.method1645((byte) -127);
        this.field4383 = new int[this.field4386];
        this.field4387 = new int[this.field4386];
        for (int var2 = 0; var2 < this.field4386; var2++) {
            this.field4383[var2] = arg0.method1687((byte) -65);
            this.field4387[var2] = arg0.method1687((byte) -118);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I", line = 39)
    public final int method2350(int arg0) {
        if (this.field4391 >= this.field4388) {
            this.field4392 = this.field4387[this.field4390++] << 15;
            if (this.field4390 >= this.field4386) {
                this.field4390 = this.field4386 - 1;
            }
            this.field4388 = (int) ((double) this.field4383[this.field4390] / 65536.0D * (double) arg0);
            if (this.field4388 > this.field4391) {
                this.field4389 = ((this.field4387[this.field4390] << 15) - this.field4392) / (this.field4388 - this.field4391);
            }
        }
        this.field4392 += this.field4389;
        this.field4391++;
        return this.field4392 - this.field4389 >> 15;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 55)
    public class273() {
        this.field4383[0] = 0;
        this.field4383[1] = 65535;
        this.field4387[0] = 0;
        this.field4387[1] = 65535;
    }
}
