import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LYKGAWTC")
public class class37 {

    @OriginalMember(owner = "LYKGAWTC", name = "a", descriptor = "Z")
    private boolean field1051 = true;

    @OriginalMember(owner = "LYKGAWTC", name = "b", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "LYKGAWTC", name = "e", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "LYKGAWTC", name = "f", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "LYKGAWTC", name = "g", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "LYKGAWTC", name = "h", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "LYKGAWTC", name = "i", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "LYKGAWTC", name = "j", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "LYKGAWTC", name = "k", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "LYKGAWTC", name = "l", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "LYKGAWTC", name = "m", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "LYKGAWTC", name = "c", descriptor = "[I")
    private int[] field1053;

    @OriginalMember(owner = "LYKGAWTC", name = "d", descriptor = "[I")
    private int[] field1054;

    @OriginalMember(owner = "LYKGAWTC", name = "a", descriptor = "(BLGLMIQHJI;)V")
    public final void method385(byte arg0, class21 arg1) {
        this.field1057 = arg1.method244();
        this.field1055 = arg1.method249();
        this.field1056 = arg1.method249();
        this.method386(arg1, -433);
        if (arg0 != 8) {
            this.field1051 = !this.field1051;
        }
    }

    @OriginalMember(owner = "LYKGAWTC", name = "a", descriptor = "(LGLMIQHJI;I)V")
    public final void method386(class21 arg0, int arg1) {
        this.field1052 = arg0.method244();
        if (arg1 >= 0) {
            return;
        }
        this.field1053 = new int[this.field1052];
        this.field1054 = new int[this.field1052];
        for (int var3 = 0; var3 < this.field1052; var3++) {
            this.field1053[var3] = arg0.method246();
            this.field1054[var3] = arg0.method246();
        }
    }

    @OriginalMember(owner = "LYKGAWTC", name = "a", descriptor = "(I)V")
    public final void method387(int arg0) {
        this.field1058 = 0;
        this.field1059 = 0;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1060 = 0;
        this.field1061 = 0;
        this.field1062 = 0;
    }

    @OriginalMember(owner = "LYKGAWTC", name = "a", descriptor = "(BI)I")
    public final int method388(byte arg0, int arg1) {
        if (arg0 != 75) {
            return 0;
        }
        if (this.field1062 >= this.field1058) {
            this.field1061 = this.field1054[this.field1059++] << 15;
            if (this.field1059 >= this.field1052) {
                this.field1059 = this.field1052 - 1;
            }
            this.field1058 = (int) ((double) this.field1053[this.field1059] / 65536.0D * (double) arg1);
            if (this.field1058 > this.field1062) {
                this.field1060 = ((this.field1054[this.field1059] << 15) - this.field1061) / (this.field1058 - this.field1062);
            }
        }
        this.field1061 += this.field1060;
        this.field1062++;
        return this.field1061 - this.field1060 >> 15;
    }
}
