import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    private int field640 = 2;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    private int[] field641 = new int[2];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    private int[] field642 = new int[2];

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
    public final int method205(int arg0) {
        if (this.field650 >= this.field647) {
            this.field646 = this.field642[this.field648++] << 15;
            if (this.field648 >= this.field640) {
                this.field648 = this.field640 - 1;
            }
            this.field647 = (int) ((double) this.field641[this.field648] / 65536.0D * (double) arg0);
            if (this.field647 > this.field650) {
                this.field649 = ((this.field642[this.field648] << 15) - this.field646) / (this.field647 - this.field650);
            }
        }
        this.field646 += this.field649;
        this.field650++;
        return this.field646 - this.field649 >> 15;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lof;)V")
    public final void method206(class103 arg0) {
        this.field645 = arg0.method829((byte) -93);
        this.field644 = arg0.method803(false);
        this.field643 = arg0.method803(false);
        this.method207(arg0);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Lof;)V")
    public final void method207(class103 arg0) {
        this.field640 = arg0.method829((byte) -97);
        this.field641 = new int[this.field640];
        this.field642 = new int[this.field640];
        for (int var2 = 0; var2 < this.field640; var2++) {
            this.field641[var2] = arg0.method808(-20054);
            this.field642[var2] = arg0.method808(-20054);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
    public final void method208() {
        this.field647 = 0;
        this.field648 = 0;
        this.field649 = 0;
        this.field646 = 0;
        this.field650 = 0;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class27() {
        this.field641[0] = 0;
        this.field641[1] = 65535;
        this.field642[0] = 0;
        this.field642[1] = 65535;
    }
}
