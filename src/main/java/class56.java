import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class56 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    private int field786 = 2;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    private int[] field787 = new int[2];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    private int[] field782 = new int[2];

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    private int field789;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljj;)V", line = 3)
    public final void method357(class44 arg0) {
        this.field786 = arg0.method286((byte) -127);
        this.field787 = new int[this.field786];
        this.field782 = new int[this.field786];
        for (int var2 = 0; var2 < this.field786; var2++) {
            this.field787[var2] = arg0.method271(21081);
            this.field782[var2] = arg0.method271(21081);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I", line = 19)
    public final int method358(int arg0) {
        if (this.field788 >= this.field792) {
            this.field791 = this.field782[this.field790++] << 15;
            if (this.field790 >= this.field786) {
                this.field790 = this.field786 - 1;
            }
            this.field792 = (int) ((double) this.field787[this.field790] / 65536.0D * (double) arg0);
            if (this.field792 > this.field788) {
                this.field789 = ((this.field782[this.field790] << 15) - this.field791) / (this.field792 - this.field788);
            }
        }
        this.field791 += this.field789;
        this.field788++;
        return this.field791 - this.field789 >> 15;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 41)
    public final void method359() {
        this.field792 = 0;
        this.field790 = 0;
        this.field789 = 0;
        this.field791 = 0;
        this.field788 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Ljj;)V", line = 50)
    public final void method360(class44 arg0) {
        this.field784 = arg0.method286((byte) -101);
        this.field785 = arg0.method238((byte) 82);
        this.field783 = arg0.method238((byte) 82);
        this.method357(arg0);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 56)
    public class56() {
        this.field787[0] = 0;
        this.field787[1] = 65535;
        this.field782[0] = 0;
        this.field782[1] = 65535;
    }
}
