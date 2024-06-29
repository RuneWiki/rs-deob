import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class322 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    private int field4857 = 2;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[I")
    private int[] field4860 = new int[2];

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
    private int[] field4859 = new int[2];

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field4858;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    private int field4863;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    private int field4865;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    private int field4866;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    private int field4867;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lre;)V", line = 7)
    public final void method2205(class263 arg0) {
        this.field4861 = arg0.method1787(false);
        this.field4862 = arg0.method1826(-206227536);
        this.field4858 = arg0.method1826(-206227536);
        this.method2208(arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V", line = 13)
    public final void method2206() {
        this.field4867 = 0;
        this.field4866 = 0;
        this.field4863 = 0;
        this.field4864 = 0;
        this.field4865 = 0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I", line = 22)
    public final int method2207(int arg0) {
        if (this.field4865 >= this.field4867) {
            this.field4864 = this.field4859[this.field4866++] << 15;
            if (this.field4866 >= this.field4857) {
                this.field4866 = this.field4857 - 1;
            }
            this.field4867 = (int) ((double) this.field4860[this.field4866] / 65536.0D * (double) arg0);
            if (this.field4867 > this.field4865) {
                this.field4863 = ((this.field4859[this.field4866] << 15) - this.field4864) / (this.field4867 - this.field4865);
            }
        }
        this.field4864 += this.field4863;
        this.field4865++;
        return this.field4864 - this.field4863 >> 15;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lre;)V", line = 39)
    public final void method2208(class263 arg0) {
        this.field4857 = arg0.method1787(false);
        this.field4860 = new int[this.field4857];
        this.field4859 = new int[this.field4857];
        for (int var2 = 0; var2 < this.field4857; var2++) {
            this.field4860[var2] = arg0.method1830((byte) -77);
            this.field4859[var2] = arg0.method1830((byte) -77);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 56)
    public class322() {
        this.field4860[0] = 0;
        this.field4860[1] = 65535;
        this.field4859[0] = 0;
        this.field4859[1] = 65535;
    }
}
