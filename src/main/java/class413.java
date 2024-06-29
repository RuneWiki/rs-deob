import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class413 {

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    private int field6182 = 2;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "[I")
    private int[] field6183 = new int[2];

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "[I")
    private int[] field6181 = new int[2];

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public int field6184;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    private int field6187;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    private int field6188;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    private int field6189;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    private int field6190;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    private int field6191;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)I")
    public final int method2594(int arg0) {
        if (this.field6189 >= this.field6190) {
            this.field6188 = this.field6181[this.field6191++] << 15;
            if (this.field6191 >= this.field6182) {
                this.field6191 = this.field6182 - 1;
            }
            this.field6190 = (int) ((double) this.field6183[this.field6191] / 65536.0D * (double) arg0);
            if (this.field6190 > this.field6189) {
                this.field6187 = ((this.field6181[this.field6191] << 15) - this.field6188) / (this.field6190 - this.field6189);
            }
        }
        this.field6188 += this.field6187;
        this.field6189++;
        return this.field6188 - this.field6187 >> 15;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lhp;)V")
    public final void method2595(class217 arg0) {
        this.field6182 = arg0.method1515((byte) 127);
        this.field6183 = new int[this.field6182];
        this.field6181 = new int[this.field6182];
        for (int var2 = 0; var2 < this.field6182; var2++) {
            this.field6183[var2] = arg0.method1511(-45);
            this.field6181[var2] = arg0.method1511(95);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(Lhp;)V")
    public final void method2596(class217 arg0) {
        this.field6186 = arg0.method1515((byte) 124);
        this.field6185 = arg0.method1556(102);
        this.field6184 = arg0.method1556(113);
        this.method2595(arg0);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()V")
    public final void method2597() {
        this.field6190 = 0;
        this.field6191 = 0;
        this.field6187 = 0;
        this.field6188 = 0;
        this.field6189 = 0;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
    public class413() {
        this.field6183[0] = 0;
        this.field6183[1] = 65535;
        this.field6181[0] = 0;
        this.field6181[1] = 65535;
    }
}
