import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class2 {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private int field94 = 2;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    private int[] field96 = new int[2];

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[I")
    private int[] field92 = new int[2];

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
    public final int method24(int arg0) {
        if (this.field101 >= this.field97) {
            this.field99 = this.field92[this.field98++] << 15;
            if (this.field98 >= this.field94) {
                this.field98 = this.field94 - 1;
            }
            this.field97 = (int) ((double) this.field96[this.field98] / 65536.0D * (double) arg0);
            if (this.field97 > this.field101) {
                this.field100 = ((this.field92[this.field98] << 15) - this.field99) / (this.field97 - this.field101);
            }
        }
        this.field99 += this.field100;
        this.field101++;
        return this.field99 - this.field100 >> 15;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lab;)V")
    public final void method25(class249 arg0) {
        this.field94 = arg0.method1802((byte) -128);
        this.field96 = new int[this.field94];
        this.field92 = new int[this.field94];
        for (int var2 = 0; var2 < this.field94; var2++) {
            this.field96[var2] = arg0.method1821((byte) 51);
            this.field92[var2] = arg0.method1821((byte) 51);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
    public final void method26() {
        this.field97 = 0;
        this.field98 = 0;
        this.field100 = 0;
        this.field99 = 0;
        this.field101 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lab;)V")
    public final void method27(class249 arg0) {
        this.field95 = arg0.method1802((byte) 105);
        this.field91 = arg0.method1800(-117);
        this.field93 = arg0.method1800(-81);
        this.method25(arg0);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class2() {
        this.field96[0] = 0;
        this.field96[1] = 65535;
        this.field92[0] = 0;
        this.field92[1] = 65535;
    }
}
