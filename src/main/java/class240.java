import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class240 {

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    private int field2998 = 2;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "[I")
    private int[] field2995 = new int[2];

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "[I")
    private int[] field2994 = new int[2];

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public int field2996;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    private int field3003;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    private int field3004;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)I", line = 4)
    public final int method1436(int arg0) {
        if (this.field3001 >= this.field3000) {
            this.field3003 = this.field2994[this.field3002++] << 15;
            if (this.field3002 >= this.field2998) {
                this.field3002 = this.field2998 - 1;
            }
            this.field3000 = (int) ((double) this.field2995[this.field3002] / 65536.0D * (double) arg0);
            if (this.field3000 > this.field3001) {
                this.field3004 = ((this.field2994[this.field3002] << 15) - this.field3003) / (this.field3000 - this.field3001);
            }
        }
        this.field3003 += this.field3004;
        this.field3001++;
        return this.field3003 - this.field3004 >> 15;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "()V", line = 21)
    public final void method1437() {
        this.field3000 = 0;
        this.field3002 = 0;
        this.field3004 = 0;
        this.field3003 = 0;
        this.field3001 = 0;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Les;)V", line = 35)
    public final void method1438(class630 arg0) {
        this.field2998 = arg0.method3501(-9268);
        this.field2995 = new int[this.field2998];
        this.field2994 = new int[this.field2998];
        for (int var2 = 0; var2 < this.field2998; var2++) {
            this.field2995[var2] = arg0.method3470(13111);
            this.field2994[var2] = arg0.method3470(13111);
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(Les;)V", line = 50)
    public final void method1439(class630 arg0) {
        this.field2999 = arg0.method3501(-9268);
        this.field2997 = arg0.method3483(86);
        this.field2996 = arg0.method3483(113);
        this.method1438(arg0);
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V", line = 56)
    public class240() {
        this.field2995[0] = 0;
        this.field2995[1] = 65535;
        this.field2994[0] = 0;
        this.field2994[1] = 65535;
    }
}
