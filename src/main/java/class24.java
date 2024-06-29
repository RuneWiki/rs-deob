import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class24 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    private int field413 = 2;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[I")
    private int[] field412 = new int[2];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    private int[] field411 = new int[2];

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public final void method207() {
        this.field419 = 0;
        this.field418 = 0;
        this.field420 = 0;
        this.field417 = 0;
        this.field421 = 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lvf;)V")
    public final void method208(class230 arg0) {
        this.field415 = arg0.method1516((byte) 82);
        this.field414 = arg0.method1529(-32494);
        this.field416 = arg0.method1529(-32494);
        this.method209(arg0);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Lvf;)V")
    public final void method209(class230 arg0) {
        this.field413 = arg0.method1516((byte) 82);
        this.field412 = new int[this.field413];
        this.field411 = new int[this.field413];
        for (int var2 = 0; var2 < this.field413; var2++) {
            this.field412[var2] = arg0.method1535(2);
            this.field411[var2] = arg0.method1535(2);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
    public final int method210(int arg0) {
        if (this.field421 >= this.field419) {
            this.field417 = this.field411[this.field418++] << 15;
            if (this.field418 >= this.field413) {
                this.field418 = this.field413 - 1;
            }
            this.field419 = (int) ((double) this.field412[this.field418] / 65536.0D * (double) arg0);
            if (this.field419 > this.field421) {
                this.field420 = ((this.field411[this.field418] << 15) - this.field417) / (this.field419 - this.field421);
            }
        }
        this.field417 += this.field420;
        this.field421++;
        return this.field417 - this.field420 >> 15;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class24() {
        this.field412[0] = 0;
        this.field412[1] = 65535;
        this.field411[0] = 0;
        this.field411[1] = 65535;
    }
}
