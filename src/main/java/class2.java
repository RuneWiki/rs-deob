import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    private int field25 = 2;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    private int[] field27 = new int[2];

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
    private int[] field24 = new int[2];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
    public final int method2(int arg0) {
        if (this.field33 >= this.field31) {
            this.field29 = this.field24[this.field32++] << 15;
            if (this.field32 >= this.field25) {
                this.field32 = this.field25 - 1;
            }
            this.field31 = (int) ((double) this.field27[this.field32] / 65536.0D * (double) arg0);
            if (this.field31 > this.field33) {
                this.field30 = ((this.field24[this.field32] << 15) - this.field29) / (this.field31 - this.field33);
            }
        }
        this.field29 += this.field30;
        this.field33++;
        return this.field29 - this.field30 >> 15;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lla;)V")
    public final void method3(class77 arg0) {
        this.field26 = arg0.method570((byte) 123);
        this.field23 = arg0.method554((byte) 59);
        this.field28 = arg0.method554((byte) 86);
        this.method5(arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
    public final void method4() {
        this.field31 = 0;
        this.field32 = 0;
        this.field30 = 0;
        this.field29 = 0;
        this.field33 = 0;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Lla;)V")
    public final void method5(class77 arg0) {
        this.field25 = arg0.method570((byte) 123);
        this.field27 = new int[this.field25];
        this.field24 = new int[this.field25];
        for (int var2 = 0; var2 < this.field25; var2++) {
            this.field27[var2] = arg0.method597(53);
            this.field24[var2] = arg0.method597(57);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        this.field27[0] = 0;
        this.field27[1] = 65535;
        this.field24[0] = 0;
        this.field24[1] = 65535;
    }
}
