import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class11 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    private int field131 = 2;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[I")
    private int[] field135 = new int[2];

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
    private int[] field133 = new int[2];

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I", line = 3)
    public final int method57(int arg0) {
        if (this.field139 >= this.field137) {
            this.field138 = this.field133[this.field140++] << 15;
            if (this.field140 >= this.field131) {
                this.field140 = this.field131 - 1;
            }
            this.field137 = (int) ((double) this.field135[this.field140] / 65536.0D * (double) arg0);
            if (this.field137 > this.field139) {
                this.field136 = ((this.field133[this.field140] << 15) - this.field138) / (this.field137 - this.field139);
            }
        }
        this.field138 += this.field136;
        this.field139++;
        return this.field138 - this.field136 >> 15;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lrm;)V", line = 24)
    public final void method58(class249 arg0) {
        this.field134 = arg0.method1731(true);
        this.field130 = arg0.method1738(-1756395344);
        this.field132 = arg0.method1738(-1756395344);
        this.method59(arg0);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Lrm;)V", line = 31)
    public final void method59(class249 arg0) {
        this.field131 = arg0.method1731(true);
        this.field135 = new int[this.field131];
        this.field133 = new int[this.field131];
        for (int var2 = 0; var2 < this.field131; var2++) {
            this.field135[var2] = arg0.method1712(-1);
            this.field133[var2] = arg0.method1712(-1);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V", line = 47)
    public final void method60() {
        this.field137 = 0;
        this.field140 = 0;
        this.field136 = 0;
        this.field138 = 0;
        this.field139 = 0;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 55)
    public class11() {
        this.field135[0] = 0;
        this.field135[1] = 65535;
        this.field133[0] = 0;
        this.field133[1] = 65535;
    }
}
