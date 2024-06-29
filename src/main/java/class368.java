import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class368 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    private int field5515 = 2;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    private int[] field5513 = new int[2];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[I")
    private int[] field5517 = new int[2];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field5512;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field5514;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field5516;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    private int field5518;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    private int field5519;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    private int field5520;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    private int field5521;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    private int field5522;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lti;)V")
    public final void method2364(class303 arg0) {
        this.field5515 = arg0.method1918((byte) -57);
        this.field5513 = new int[this.field5515];
        this.field5517 = new int[this.field5515];
        for (int var2 = 0; var2 < this.field5515; var2++) {
            this.field5513[var2] = arg0.method1868(0);
            this.field5517[var2] = arg0.method1868(0);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Lti;)V")
    public final void method2365(class303 arg0) {
        this.field5516 = arg0.method1918((byte) 91);
        this.field5512 = arg0.method1870(-1945262512);
        this.field5514 = arg0.method1870(-1945262512);
        this.method2364(arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
    public final int method2366(int arg0) {
        if (this.field5520 >= this.field5521) {
            this.field5519 = this.field5517[this.field5522++] << 15;
            if (this.field5522 >= this.field5515) {
                this.field5522 = this.field5515 - 1;
            }
            this.field5521 = (int) ((double) this.field5513[this.field5522] / 65536.0D * (double) arg0);
            if (this.field5521 > this.field5520) {
                this.field5518 = ((this.field5517[this.field5522] << 15) - this.field5519) / (this.field5521 - this.field5520);
            }
        }
        this.field5519 += this.field5518;
        this.field5520++;
        return this.field5519 - this.field5518 >> 15;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class368() {
        this.field5513[0] = 0;
        this.field5513[1] = 65535;
        this.field5517[0] = 0;
        this.field5517[1] = 65535;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
    public final void method2367() {
        this.field5521 = 0;
        this.field5522 = 0;
        this.field5518 = 0;
        this.field5519 = 0;
        this.field5520 = 0;
    }
}
