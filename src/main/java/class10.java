import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private int field214 = 2;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
    private int[] field216 = new int[2];

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
    private int[] field215 = new int[2];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lhd;)V")
    public final void method81(class68 arg0) {
        this.field214 = arg0.method604((byte) -128);
        this.field216 = new int[this.field214];
        this.field215 = new int[this.field214];
        for (int var2 = 0; var2 < this.field214; var2++) {
            this.field216[var2] = arg0.method569(26496);
            this.field215[var2] = arg0.method569(26496);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Lhd;)V")
    public final void method82(class68 arg0) {
        this.field217 = arg0.method604((byte) -126);
        this.field218 = arg0.method599((byte) 96);
        this.field213 = arg0.method599((byte) 96);
        this.method81(arg0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public final void method83() {
        this.field219 = 0;
        this.field221 = 0;
        this.field223 = 0;
        this.field220 = 0;
        this.field222 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public final int method84(int arg0) {
        if (this.field222 >= this.field219) {
            this.field220 = this.field215[this.field221++] << 15;
            if (this.field221 >= this.field214) {
                this.field221 = this.field214 - 1;
            }
            this.field219 = (int) ((double) this.field216[this.field221] / 65536.0D * (double) arg0);
            if (this.field219 > this.field222) {
                this.field223 = ((this.field215[this.field221] << 15) - this.field220) / (this.field219 - this.field222);
            }
        }
        this.field220 += this.field223;
        this.field222++;
        return this.field220 - this.field223 >> 15;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        this.field216[0] = 0;
        this.field216[1] = 65535;
        this.field215[0] = 0;
        this.field215[1] = 65535;
    }
}
