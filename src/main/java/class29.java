import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JDDBCSRY")
public class class29 {

    @OriginalMember(owner = "JDDBCSRY", name = "a", descriptor = "I")
    private int field921 = 17642;

    @OriginalMember(owner = "JDDBCSRY", name = "b", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "JDDBCSRY", name = "e", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "JDDBCSRY", name = "f", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "JDDBCSRY", name = "g", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "JDDBCSRY", name = "h", descriptor = "I")
    private int field928;

    @OriginalMember(owner = "JDDBCSRY", name = "i", descriptor = "I")
    private int field929;

    @OriginalMember(owner = "JDDBCSRY", name = "j", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "JDDBCSRY", name = "k", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "JDDBCSRY", name = "l", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "JDDBCSRY", name = "m", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "JDDBCSRY", name = "c", descriptor = "[I")
    private int[] field923;

    @OriginalMember(owner = "JDDBCSRY", name = "d", descriptor = "[I")
    private int[] field924;

    @OriginalMember(owner = "JDDBCSRY", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    public final void method257(boolean arg0, class69 arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field927 = arg1.method465();
        this.field925 = arg1.method470();
        this.field926 = arg1.method470();
        this.method258(arg1, 43184);
    }

    @OriginalMember(owner = "JDDBCSRY", name = "a", descriptor = "(LXGRGMPUQ;I)V")
    public final void method258(class69 arg0, int arg1) {
        this.field922 = arg0.method465();
        this.field923 = new int[this.field922];
        this.field924 = new int[this.field922];
        if (arg1 == 43184) {
            for (int var3 = 0; var3 < this.field922; var3++) {
                this.field923[var3] = arg0.method467();
                this.field924[var3] = arg0.method467();
            }
        }
    }

    @OriginalMember(owner = "JDDBCSRY", name = "a", descriptor = "(I)V")
    public final void method259(int arg0) {
        this.field928 = 0;
        this.field929 = 0;
        this.field930 = 0;
        this.field931 = 0;
        if (arg0 != 7) {
            this.field921 = 157;
        }
        this.field932 = 0;
    }

    @OriginalMember(owner = "JDDBCSRY", name = "a", descriptor = "(BI)I")
    public final int method260(byte arg0, int arg1) {
        if (this.field932 >= this.field928) {
            this.field931 = this.field924[this.field929++] << 15;
            if (this.field929 >= this.field922) {
                this.field929 = this.field922 - 1;
            }
            this.field928 = (int) ((double) this.field923[this.field929] / 65536.0D * (double) arg1);
            if (this.field928 > this.field932) {
                this.field930 = ((this.field924[this.field929] << 15) - this.field931) / (this.field928 - this.field932);
            }
        }
        this.field931 += this.field930;
        if (arg0 == 5) {
            boolean var3 = false;
            this.field932++;
            return this.field931 - this.field930 >> 15;
        } else {
            return 4;
        }
    }
}
