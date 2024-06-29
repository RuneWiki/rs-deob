import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class279 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    private int field4812 = 2;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
    private int[] field4815 = new int[2];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
    private int[] field4813 = new int[2];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    private int field4817;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    private int field4819;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    private int field4820;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    private int field4821;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 4)
    public final void method1935() {
        this.field4820 = 0;
        this.field4819 = 0;
        this.field4817 = 0;
        this.field4818 = 0;
        this.field4821 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lkh;)V", line = 12)
    public final void method1936(class13 arg0) {
        this.field4812 = arg0.method152((byte) -74);
        this.field4815 = new int[this.field4812];
        this.field4813 = new int[this.field4812];
        for (int var2 = 0; var2 < this.field4812; var2++) {
            this.field4815[var2] = arg0.method112((byte) 92);
            this.field4813[var2] = arg0.method112((byte) 92);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lkh;)V", line = 27)
    public final void method1937(class13 arg0) {
        this.field4816 = arg0.method152((byte) -108);
        this.field4811 = arg0.method105((byte) 82);
        this.field4814 = arg0.method105((byte) 74);
        this.method1936(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I", line = 37)
    public final int method1938(int arg0) {
        if (this.field4821 >= this.field4820) {
            this.field4818 = this.field4813[this.field4819++] << 15;
            if (this.field4819 >= this.field4812) {
                this.field4819 = this.field4812 - 1;
            }
            this.field4820 = (int) ((double) this.field4815[this.field4819] / 65536.0D * (double) arg0);
            if (this.field4820 > this.field4821) {
                this.field4817 = ((this.field4813[this.field4819] << 15) - this.field4818) / (this.field4820 - this.field4821);
            }
        }
        this.field4818 += this.field4817;
        this.field4821++;
        return this.field4818 - this.field4817 >> 15;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 56)
    public class279() {
        this.field4815[0] = 0;
        this.field4815[1] = 65535;
        this.field4813[0] = 0;
        this.field4813[1] = 65535;
    }
}
