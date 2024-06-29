import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    private int field2210 = 2;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    private int[] field2211 = new int[2];

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
    private int[] field2213 = new int[2];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    private int field2216;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    private int field2219;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ldc;)V", line = 3)
    public final void method799(class25 arg0) {
        this.field2214 = arg0.method322((byte) -50);
        this.field2209 = arg0.method313((byte) 105);
        this.field2212 = arg0.method313((byte) -96);
        this.method802(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 9)
    public final void method800() {
        this.field2215 = 0;
        this.field2217 = 0;
        this.field2216 = 0;
        this.field2218 = 0;
        this.field2219 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I", line = 20)
    public final int method801(int arg0) {
        if (this.field2219 >= this.field2215) {
            this.field2218 = this.field2213[this.field2217++] << 15;
            if (this.field2217 >= this.field2210) {
                this.field2217 = this.field2210 - 1;
            }
            this.field2215 = (int) ((double) this.field2211[this.field2217] / 65536.0D * (double) arg0);
            if (this.field2215 > this.field2219) {
                this.field2216 = ((this.field2213[this.field2217] << 15) - this.field2218) / (this.field2215 - this.field2219);
            }
        }
        this.field2218 += this.field2216;
        this.field2219++;
        return this.field2218 - this.field2216 >> 15;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ldc;)V", line = 38)
    public final void method802(class25 arg0) {
        this.field2210 = arg0.method322((byte) -50);
        this.field2211 = new int[this.field2210];
        this.field2213 = new int[this.field2210];
        for (int var2 = 0; var2 < this.field2210; var2++) {
            this.field2211[var2] = arg0.method301(-4853);
            this.field2213[var2] = arg0.method301(-4853);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 56)
    public class95() {
        this.field2211[0] = 0;
        this.field2211[1] = 65535;
        this.field2213[0] = 0;
        this.field2213[1] = 65535;
    }
}
