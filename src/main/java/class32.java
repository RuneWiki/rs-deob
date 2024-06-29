import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class32 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    private int field842 = 2;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    private int[] field839 = new int[2];

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[I")
    private int[] field843 = new int[2];

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lrc;)V", line = 3)
    public final void method208(class104 arg0) {
        this.field842 = arg0.method798((byte) -46);
        this.field839 = new int[this.field842];
        this.field843 = new int[this.field842];
        for (int var2 = 0; var2 < this.field842; var2++) {
            this.field839[var2] = arg0.method797(-7916);
            this.field843[var2] = arg0.method797(-7916);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V", line = 19)
    public final void method209() {
        this.field845 = 0;
        this.field848 = 0;
        this.field847 = 0;
        this.field849 = 0;
        this.field846 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I", line = 30)
    public final int method210(int arg0) {
        if (this.field846 >= this.field845) {
            this.field849 = this.field843[this.field848++] << 15;
            if (this.field848 >= this.field842) {
                this.field848 = this.field842 - 1;
            }
            this.field845 = (int) ((double) this.field839[this.field848] / 65536.0D * (double) arg0);
            if (this.field845 > this.field846) {
                this.field847 = ((this.field843[this.field848] << 15) - this.field849) / (this.field845 - this.field846);
            }
        }
        this.field849 += this.field847;
        this.field846++;
        return this.field849 - this.field847 >> 15;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Lrc;)V", line = 49)
    public final void method211(class104 arg0) {
        this.field840 = arg0.method798((byte) -78);
        this.field841 = arg0.method774(-29404);
        this.field844 = arg0.method774(-29404);
        this.method208(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 56)
    public class32() {
        this.field839[0] = 0;
        this.field839[1] = 65535;
        this.field843[0] = 0;
        this.field843[1] = 65535;
    }
}
