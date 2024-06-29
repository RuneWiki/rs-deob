import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class162 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field2253 = 2;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    private int[] field2252 = new int[2];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
    private int[] field2250 = new int[2];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private int field2258;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lql;)V")
    public final void method1076(class224 arg0) {
        this.field2254 = arg0.method1453((byte) -127);
        this.field2251 = arg0.method1483((byte) 46);
        this.field2249 = arg0.method1483((byte) 46);
        this.method1078(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
    public final void method1077() {
        this.field2255 = 0;
        this.field2258 = 0;
        this.field2259 = 0;
        this.field2257 = 0;
        this.field2256 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lql;)V")
    public final void method1078(class224 arg0) {
        this.field2253 = arg0.method1453((byte) -127);
        this.field2252 = new int[this.field2253];
        this.field2250 = new int[this.field2253];
        for (int var2 = 0; var2 < this.field2253; var2++) {
            this.field2252[var2] = arg0.method1445(false);
            this.field2250[var2] = arg0.method1445(false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class162() {
        this.field2252[0] = 0;
        this.field2252[1] = 65535;
        this.field2250[0] = 0;
        this.field2250[1] = 65535;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
    public final int method1079(int arg0) {
        if (this.field2256 >= this.field2255) {
            this.field2257 = this.field2250[this.field2258++] << 15;
            if (this.field2258 >= this.field2253) {
                this.field2258 = this.field2253 - 1;
            }
            this.field2255 = (int) ((double) this.field2252[this.field2258] / 65536.0D * (double) arg0);
            if (this.field2255 > this.field2256) {
                this.field2259 = ((this.field2250[this.field2258] << 15) - this.field2257) / (this.field2255 - this.field2256);
            }
        }
        this.field2257 += this.field2259;
        this.field2256++;
        return this.field2257 - this.field2259 >> 15;
    }
}
