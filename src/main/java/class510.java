import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class510 {

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    private int field6882 = 2;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "[I")
    private int[] field6878 = new int[2];

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
    private int[] field6881 = new int[2];

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public int field6877;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public int field6879;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public int field6880;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    private int field6883;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    private int field6884;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    private int field6885;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    private int field6886;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    private int field6887;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ldga;)V")
    public final void method2883(class138 arg0) {
        this.field6882 = arg0.method957((byte) -74);
        this.field6878 = new int[this.field6882];
        this.field6881 = new int[this.field6882];
        for (int var2 = 0; var2 < this.field6882; var2++) {
            this.field6878[var2] = arg0.method922((byte) -120);
            this.field6881[var2] = arg0.method922((byte) -115);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Ldga;)V")
    public final void method2884(class138 arg0) {
        this.field6877 = arg0.method957((byte) -113);
        this.field6880 = arg0.method943(-102);
        this.field6879 = arg0.method943(-123);
        this.method2883(arg0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "()V")
    public final void method2885() {
        this.field6886 = 0;
        this.field6883 = 0;
        this.field6885 = 0;
        this.field6884 = 0;
        this.field6887 = 0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
    public final int method2886(int arg0) {
        if (this.field6887 >= this.field6886) {
            this.field6884 = this.field6881[this.field6883++] << 15;
            if (this.field6883 >= this.field6882) {
                this.field6883 = this.field6882 - 1;
            }
            this.field6886 = (int) ((double) this.field6878[this.field6883] / 65536.0D * (double) arg0);
            if (this.field6886 > this.field6887) {
                this.field6885 = ((this.field6881[this.field6883] << 15) - this.field6884) / (this.field6886 - this.field6887);
            }
        }
        this.field6884 += this.field6885;
        this.field6887++;
        return this.field6884 - this.field6885 >> 15;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
    public class510() {
        this.field6878[0] = 0;
        this.field6878[1] = 65535;
        this.field6881[0] = 0;
        this.field6881[1] = 65535;
    }
}
