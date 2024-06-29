import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class105 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    private int field2289 = 2;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    private int[] field2290 = new int[2];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    private int[] field2292 = new int[2];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    private int field2294;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    private int field2295;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    private int field2296;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    private int field2297;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class105() {
        this.field2290[0] = 0;
        this.field2290[1] = 65535;
        this.field2292[0] = 0;
        this.field2292[1] = 65535;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lpd;)V")
    public final void method784(class94 arg0) {
        this.field2288 = arg0.method703((byte) -76);
        this.field2287 = arg0.method667(5811);
        this.field2291 = arg0.method667(5811);
        this.method786(arg0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
    public final void method785() {
        this.field2294 = 0;
        this.field2293 = 0;
        this.field2296 = 0;
        this.field2295 = 0;
        this.field2297 = 0;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Lpd;)V")
    public final void method786(class94 arg0) {
        this.field2289 = arg0.method703((byte) 113);
        this.field2290 = new int[this.field2289];
        this.field2292 = new int[this.field2289];
        for (int var2 = 0; var2 < this.field2289; var2++) {
            this.field2290[var2] = arg0.method665(8666);
            this.field2292[var2] = arg0.method665(8666);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
    public final int method787(int arg0) {
        if (this.field2297 >= this.field2294) {
            this.field2295 = this.field2292[this.field2293++] << 15;
            if (this.field2293 >= this.field2289) {
                this.field2293 = this.field2289 - 1;
            }
            this.field2294 = (int) ((double) this.field2290[this.field2293] / 65536.0D * (double) arg0);
            if (this.field2294 > this.field2297) {
                this.field2296 = ((this.field2292[this.field2293] << 15) - this.field2295) / (this.field2294 - this.field2297);
            }
        }
        this.field2295 += this.field2296;
        this.field2297++;
        return this.field2295 - this.field2296 >> 15;
    }
}
