import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class52 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    private int field815 = 2;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
    private int[] field819 = new int[2];

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    private int[] field817 = new int[2];

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    private int field822;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I", line = 4)
    public final int method379(int arg0) {
        if (this.field825 >= this.field824) {
            this.field822 = this.field817[this.field821++] << 15;
            if (this.field821 >= this.field815) {
                this.field821 = this.field815 - 1;
            }
            this.field824 = (int) ((double) this.field819[this.field821] / 65536.0D * (double) arg0);
            if (this.field824 > this.field825) {
                this.field823 = ((this.field817[this.field821] << 15) - this.field822) / (this.field824 - this.field825);
            }
        }
        this.field822 += this.field823;
        this.field825++;
        return this.field822 - this.field823 >> 15;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V", line = 24)
    public final void method380() {
        this.field824 = 0;
        this.field821 = 0;
        this.field823 = 0;
        this.field822 = 0;
        this.field825 = 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lwa;)V", line = 34)
    public final void method381(class82 arg0) {
        this.field815 = arg0.method642((byte) -45);
        this.field819 = new int[this.field815];
        this.field817 = new int[this.field815];
        for (int var2 = 0; var2 < this.field815; var2++) {
            this.field819[var2] = arg0.method576(1);
            this.field817[var2] = arg0.method576(1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lwa;)V", line = 49)
    public final void method382(class82 arg0) {
        this.field816 = arg0.method642((byte) -37);
        this.field818 = arg0.method587(-502942936);
        this.field820 = arg0.method587(-502942936);
        this.method381(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 56)
    public class52() {
        this.field819[0] = 0;
        this.field819[1] = 65535;
        this.field817[0] = 0;
        this.field817[1] = 65535;
    }
}
