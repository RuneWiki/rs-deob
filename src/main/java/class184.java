import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class184 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    private int field3392 = 2;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[I")
    private int[] field3390 = new int[2];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    private int[] field3389 = new int[2];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    private int field3394;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    private int field3396;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    private int field3397;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lee;)V")
    public final void method1344(class280 arg0) {
        this.field3388 = arg0.method1907(16832);
        this.field3391 = arg0.method1872(126);
        this.field3393 = arg0.method1872(94);
        this.method1345(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lee;)V")
    public final void method1345(class280 arg0) {
        this.field3392 = arg0.method1907(16832);
        this.field3390 = new int[this.field3392];
        this.field3389 = new int[this.field3392];
        for (int var2 = 0; var2 < this.field3392; var2++) {
            this.field3390[var2] = arg0.method1891(-116);
            this.field3389[var2] = arg0.method1891(-128);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I")
    public final int method1346(int arg0) {
        if (this.field3398 >= this.field3395) {
            this.field3394 = this.field3389[this.field3396++] << 15;
            if (this.field3396 >= this.field3392) {
                this.field3396 = this.field3392 - 1;
            }
            this.field3395 = (int) ((double) this.field3390[this.field3396] / 65536.0D * (double) arg0);
            if (this.field3395 > this.field3398) {
                this.field3397 = ((this.field3389[this.field3396] << 15) - this.field3394) / (this.field3395 - this.field3398);
            }
        }
        this.field3394 += this.field3397;
        this.field3398++;
        return this.field3394 - this.field3397 >> 15;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public final void method1347() {
        this.field3395 = 0;
        this.field3396 = 0;
        this.field3397 = 0;
        this.field3394 = 0;
        this.field3398 = 0;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class184() {
        this.field3390[0] = 0;
        this.field3390[1] = 65535;
        this.field3389[0] = 0;
        this.field3389[1] = 65535;
    }
}
