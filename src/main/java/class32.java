import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MMADHCLT")
public class class32 {

    @OriginalMember(owner = "MMADHCLT", name = "a", descriptor = "I")
    private int field1060 = 1;

    @OriginalMember(owner = "MMADHCLT", name = "b", descriptor = "I")
    private int field1061 = -799;

    @OriginalMember(owner = "MMADHCLT", name = "c", descriptor = "I")
    private int field1062 = 3;

    @OriginalMember(owner = "MMADHCLT", name = "d", descriptor = "I")
    private int field1063 = 18;

    @OriginalMember(owner = "MMADHCLT", name = "e", descriptor = "Z")
    private boolean field1064 = true;

    @OriginalMember(owner = "MMADHCLT", name = "f", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "MMADHCLT", name = "i", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "MMADHCLT", name = "j", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "MMADHCLT", name = "k", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "MMADHCLT", name = "l", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "MMADHCLT", name = "m", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "MMADHCLT", name = "n", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "MMADHCLT", name = "o", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "MMADHCLT", name = "p", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "MMADHCLT", name = "q", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "MMADHCLT", name = "g", descriptor = "[I")
    private int[] field1066;

    @OriginalMember(owner = "MMADHCLT", name = "h", descriptor = "[I")
    private int[] field1067;

    @OriginalMember(owner = "MMADHCLT", name = "a", descriptor = "(ILUAWAYCTK;)V")
    public final void method324(int arg0, class55 arg1) {
        this.field1070 = arg1.method455();
        if (arg0 != -7321) {
            this.field1063 = 343;
        }
        this.field1068 = arg1.method460();
        this.field1069 = arg1.method460();
        this.method325(arg1, -799);
    }

    @OriginalMember(owner = "MMADHCLT", name = "a", descriptor = "(LUAWAYCTK;I)V")
    public final void method325(class55 arg0, int arg1) {
        this.field1065 = arg0.method455();
        this.field1066 = new int[this.field1065];
        if (arg1 >= 0) {
            this.field1064 = !this.field1064;
        }
        this.field1067 = new int[this.field1065];
        for (int var3 = 0; var3 < this.field1065; var3++) {
            this.field1066[var3] = arg0.method457();
            this.field1067[var3] = arg0.method457();
        }
    }

    @OriginalMember(owner = "MMADHCLT", name = "a", descriptor = "(I)V")
    public final void method326(int arg0) {
        this.field1071 = 0;
        this.field1072 = 0;
        if (arg0 < this.field1062 || arg0 > this.field1062) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1073 = 0;
        this.field1074 = 0;
        this.field1075 = 0;
    }

    @OriginalMember(owner = "MMADHCLT", name = "a", descriptor = "(BI)I")
    public final int method327(byte arg0, int arg1) {
        if (this.field1075 >= this.field1071) {
            this.field1074 = this.field1067[this.field1072++] << 15;
            if (this.field1072 >= this.field1065) {
                this.field1072 = this.field1065 - 1;
            }
            this.field1071 = (int) ((double) this.field1066[this.field1072] / 65536.0D * (double) arg1);
            if (this.field1071 > this.field1075) {
                this.field1073 = ((this.field1067[this.field1072] << 15) - this.field1074) / (this.field1071 - this.field1075);
            }
        }
        this.field1074 += this.field1073;
        if (arg0 == 1) {
            boolean var3 = false;
            this.field1075++;
            return this.field1074 - this.field1073 >> 15;
        } else {
            return this.field1060;
        }
    }
}
