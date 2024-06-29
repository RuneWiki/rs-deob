import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class13 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    private int field208 = 2;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[I")
    private int[] field209 = new int[2];

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[I")
    private int[] field210 = new int[2];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I")
    public final int method103(int arg0) {
        if (this.field212 >= this.field214) {
            this.field213 = this.field210[this.field216++] << 15;
            if (this.field216 >= this.field208) {
                this.field216 = this.field208 - 1;
            }
            this.field214 = (int) ((double) this.field209[this.field216] / 65536.0D * (double) arg0);
            if (this.field214 > this.field212) {
                this.field215 = ((this.field210[this.field216] << 15) - this.field213) / (this.field214 - this.field212);
            }
        }
        this.field213 += this.field215;
        this.field212++;
        return this.field213 - this.field215 >> 15;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lrg;)V")
    public final void method104(class239 arg0) {
        this.field208 = arg0.method1651(4139);
        this.field209 = new int[this.field208];
        this.field210 = new int[this.field208];
        for (int var2 = 0; var2 < this.field208; var2++) {
            this.field209[var2] = arg0.method1663((byte) 90);
            this.field210[var2] = arg0.method1663((byte) -68);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Lrg;)V")
    public final void method105(class239 arg0) {
        this.field211 = arg0.method1651(4139);
        this.field207 = arg0.method1617((byte) -43);
        this.field206 = arg0.method1617((byte) -43);
        this.method104(arg0);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class13() {
        this.field209[0] = 0;
        this.field209[1] = 65535;
        this.field210[0] = 0;
        this.field210[1] = 65535;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V")
    public final void method106() {
        this.field214 = 0;
        this.field216 = 0;
        this.field215 = 0;
        this.field213 = 0;
        this.field212 = 0;
    }
}
