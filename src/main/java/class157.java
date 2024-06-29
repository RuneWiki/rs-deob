import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class157 {

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    private int field2366 = 2;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "[I")
    private int[] field2365 = new int[2];

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "[I")
    private int[] field2367 = new int[2];

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
    private int field2370;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljr;)V", line = 3)
    public final void method1089(class96 arg0) {
        this.field2366 = arg0.method718(-109);
        this.field2365 = new int[this.field2366];
        this.field2367 = new int[this.field2366];
        for (int var2 = 0; var2 < this.field2366; var2++) {
            this.field2365[var2] = arg0.method743((byte) -72);
            this.field2367[var2] = arg0.method743((byte) -99);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)I", line = 21)
    public final int method1090(int arg0) {
        if (this.field2369 >= this.field2371) {
            this.field2370 = this.field2367[this.field2372++] << 15;
            if (this.field2372 >= this.field2366) {
                this.field2372 = this.field2366 - 1;
            }
            this.field2371 = (int) ((double) this.field2365[this.field2372] / 65536.0D * (double) arg0);
            if (this.field2371 > this.field2369) {
                this.field2368 = ((this.field2367[this.field2372] << 15) - this.field2370) / (this.field2371 - this.field2369);
            }
        }
        this.field2370 += this.field2368;
        this.field2369++;
        return this.field2370 - this.field2368 >> 15;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(Ljr;)V", line = 42)
    public final void method1091(class96 arg0) {
        this.field2362 = arg0.method718(112);
        this.field2363 = arg0.method714(false);
        this.field2364 = arg0.method714(false);
        this.method1089(arg0);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "()V", line = 48)
    public final void method1092() {
        this.field2371 = 0;
        this.field2372 = 0;
        this.field2368 = 0;
        this.field2370 = 0;
        this.field2369 = 0;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V", line = 56)
    public class157() {
        this.field2365[0] = 0;
        this.field2365[1] = 65535;
        this.field2367[0] = 0;
        this.field2367[1] = 65535;
    }
}
