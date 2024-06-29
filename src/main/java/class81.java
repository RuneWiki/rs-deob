import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class81 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private int field898 = 2;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    private int[] field894 = new int[2];

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
    private int[] field897 = new int[2];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 4)
    public final void method444() {
        this.field902 = 0;
        this.field900 = 0;
        this.field904 = 0;
        this.field903 = 0;
        this.field901 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ltq;)V", line = 13)
    public final void method445(class250 arg0) {
        this.field895 = arg0.method1350(31351);
        this.field896 = arg0.method1359(255);
        this.field899 = arg0.method1359(255);
        this.method446(arg0);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Ltq;)V", line = 20)
    public final void method446(class250 arg0) {
        this.field898 = arg0.method1350(31351);
        this.field894 = new int[this.field898];
        this.field897 = new int[this.field898];
        for (int var2 = 0; var2 < this.field898; var2++) {
            this.field894[var2] = arg0.method1374(-2);
            this.field897[var2] = arg0.method1374(-2);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I", line = 38)
    public final int method447(int arg0) {
        if (this.field901 >= this.field902) {
            this.field903 = this.field897[this.field900++] << 15;
            if (this.field900 >= this.field898) {
                this.field900 = this.field898 - 1;
            }
            this.field902 = (int) ((double) this.field894[this.field900] / 65536.0D * (double) arg0);
            if (this.field902 > this.field901) {
                this.field904 = ((this.field897[this.field900] << 15) - this.field903) / (this.field902 - this.field901);
            }
        }
        this.field903 += this.field904;
        this.field901++;
        return this.field903 - this.field904 >> 15;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 56)
    public class81() {
        this.field894[0] = 0;
        this.field894[1] = 65535;
        this.field897[0] = 0;
        this.field897[1] = 65535;
    }
}
