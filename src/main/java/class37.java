import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class37 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private int field840 = 2;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
    private int[] field842 = new int[2];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    private int[] field839 = new int[2];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method232() {
        this.field846 = 0;
        this.field845 = 0;
        this.field847 = 0;
        this.field844 = 0;
        this.field848 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public final int method233(int arg0) {
        if (this.field848 >= this.field846) {
            this.field844 = this.field839[this.field845++] << 15;
            if (this.field845 >= this.field840) {
                this.field845 = this.field840 - 1;
            }
            this.field846 = (int) ((double) this.field842[this.field845] / 65536.0D * (double) arg0);
            if (this.field846 > this.field848) {
                this.field847 = ((this.field839[this.field845] << 15) - this.field844) / (this.field846 - this.field848);
            }
        }
        this.field844 += this.field847;
        this.field848++;
        return this.field844 - this.field847 >> 15;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lh;)V")
    public final void method234(class70 arg0) {
        this.field840 = arg0.method443(255);
        this.field842 = new int[this.field840];
        this.field839 = new int[this.field840];
        for (int var2 = 0; var2 < this.field840; var2++) {
            this.field842[var2] = arg0.method442(-21351);
            this.field839[var2] = arg0.method442(-21351);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Lh;)V")
    public final void method235(class70 arg0) {
        this.field843 = arg0.method443(255);
        this.field841 = arg0.method453(127);
        this.field838 = arg0.method453(60);
        this.method234(arg0);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class37() {
        this.field842[0] = 0;
        this.field842[1] = 65535;
        this.field839[0] = 0;
        this.field839[1] = 65535;
    }
}
