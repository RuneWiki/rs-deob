import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class128 {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    private int field2251 = 2;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    private int[] field2247 = new int[2];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
    private int[] field2250 = new int[2];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    private int field2253;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
    public final void method882() {
        this.field2257 = 0;
        this.field2253 = 0;
        this.field2256 = 0;
        this.field2255 = 0;
        this.field2254 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Leh;)V")
    public final void method883(class101 arg0) {
        this.field2252 = arg0.method669((byte) 36);
        this.field2249 = arg0.method655((byte) 57);
        this.field2248 = arg0.method655((byte) 67);
        this.method884(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Leh;)V")
    public final void method884(class101 arg0) {
        this.field2251 = arg0.method669((byte) 36);
        this.field2247 = new int[this.field2251];
        this.field2250 = new int[this.field2251];
        for (int var2 = 0; var2 < this.field2251; var2++) {
            this.field2247[var2] = arg0.method677(false);
            this.field2250[var2] = arg0.method677(false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class128() {
        this.field2247[0] = 0;
        this.field2247[1] = 65535;
        this.field2250[0] = 0;
        this.field2250[1] = 65535;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
    public final int method885(int arg0) {
        if (this.field2254 >= this.field2257) {
            this.field2255 = this.field2250[this.field2253++] << 15;
            if (this.field2253 >= this.field2251) {
                this.field2253 = this.field2251 - 1;
            }
            this.field2257 = (int) ((double) this.field2247[this.field2253] / 65536.0D * (double) arg0);
            if (this.field2257 > this.field2254) {
                this.field2256 = ((this.field2250[this.field2253] << 15) - this.field2255) / (this.field2257 - this.field2254);
            }
        }
        this.field2255 += this.field2256;
        this.field2254++;
        return this.field2255 - this.field2256 >> 15;
    }
}
