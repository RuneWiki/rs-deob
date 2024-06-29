import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ANPSASQF")
public class class2 {

    @OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "Z")
    private boolean field12 = false;

    @OriginalMember(owner = "client!ANPSASQF", name = "b", descriptor = "I")
    private int field13 = 159;

    @OriginalMember(owner = "client!ANPSASQF", name = "c", descriptor = "I")
    private int field14 = 5230;

    @OriginalMember(owner = "client!ANPSASQF", name = "d", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!ANPSASQF", name = "g", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!ANPSASQF", name = "h", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!ANPSASQF", name = "i", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!ANPSASQF", name = "j", descriptor = "I")
    private int field21;

    @OriginalMember(owner = "client!ANPSASQF", name = "k", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "client!ANPSASQF", name = "l", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!ANPSASQF", name = "m", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!ANPSASQF", name = "n", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!ANPSASQF", name = "o", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ANPSASQF", name = "e", descriptor = "[I")
    private int[] field16;

    @OriginalMember(owner = "client!ANPSASQF", name = "f", descriptor = "[I")
    private int[] field17;

    @OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(BLEYMNCFMK;)V")
    public final void method3(byte arg0, class18 arg1) {
        this.field20 = arg1.method239();
        this.field18 = arg1.method244();
        this.field19 = arg1.method244();
        if (arg0 != 5) {
            this.field12 = !this.field12;
        }
        this.method4(arg1, this.field14);
    }

    @OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(LEYMNCFMK;I)V")
    public final void method4(class18 arg0, int arg1) {
        if (arg1 != 5230) {
            this.field13 = 469;
        }
        this.field15 = arg0.method239();
        this.field16 = new int[this.field15];
        this.field17 = new int[this.field15];
        for (int var3 = 0; var3 < this.field15; var3++) {
            this.field16[var3] = arg0.method241();
            this.field17[var3] = arg0.method241();
        }
    }

    @OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(I)V")
    public final void method5(int arg0) {
        this.field21 = 0;
        this.field22 = 0;
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field23 = 0;
        this.field24 = 0;
        this.field25 = 0;
    }

    @OriginalMember(owner = "client!ANPSASQF", name = "a", descriptor = "(BI)I")
    public final int method6(byte arg0, int arg1) {
        if (this.field25 >= this.field21) {
            this.field24 = this.field17[this.field22++] << 15;
            if (this.field22 >= this.field15) {
                this.field22 = this.field15 - 1;
            }
            this.field21 = (int) ((double) this.field16[this.field22] / 65536.0D * (double) arg1);
            if (this.field21 > this.field25) {
                this.field23 = ((this.field17[this.field22] << 15) - this.field24) / (this.field21 - this.field25);
            }
        }
        this.field24 += this.field23;
        if (arg0 != 75) {
            this.field14 = -481;
        }
        this.field25++;
        return this.field24 - this.field23 >> 15;
    }
}
