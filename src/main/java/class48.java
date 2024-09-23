import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RPKBYPNF")
public class class48 {

    @OriginalMember(owner = "RPKBYPNF", name = "a", descriptor = "I")
    private int field1165 = -261;

    @OriginalMember(owner = "RPKBYPNF", name = "b", descriptor = "I")
    private int field1166 = -19755;

    @OriginalMember(owner = "RPKBYPNF", name = "c", descriptor = "Z")
    private boolean field1167 = true;

    @OriginalMember(owner = "RPKBYPNF", name = "d", descriptor = "Z")
    private boolean field1168 = false;

    @OriginalMember(owner = "RPKBYPNF", name = "e", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "RPKBYPNF", name = "h", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "RPKBYPNF", name = "i", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "RPKBYPNF", name = "j", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "RPKBYPNF", name = "k", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "RPKBYPNF", name = "l", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "RPKBYPNF", name = "m", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "RPKBYPNF", name = "n", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "RPKBYPNF", name = "o", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "RPKBYPNF", name = "p", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "RPKBYPNF", name = "f", descriptor = "[I")
    private int[] field1170;

    @OriginalMember(owner = "RPKBYPNF", name = "g", descriptor = "[I")
    private int[] field1171;

    @OriginalMember(owner = "RPKBYPNF", name = "a", descriptor = "(LMQZHAILV;I)V")
    public final void method473(class33 arg0, int arg1) {
        this.field1174 = arg0.method325();
        this.field1172 = arg0.method330();
        this.field1173 = arg0.method330();
        while (arg1 >= 0) {
            this.field1167 = !this.field1167;
        }
        this.method474(arg0, (byte) -93);
    }

    @OriginalMember(owner = "RPKBYPNF", name = "a", descriptor = "(LMQZHAILV;B)V")
    public final void method474(class33 arg0, byte arg1) {
        if (arg1 != -93) {
            this.field1168 = !this.field1168;
        }
        this.field1169 = arg0.method325();
        this.field1170 = new int[this.field1169];
        this.field1171 = new int[this.field1169];
        for (int var3 = 0; var3 < this.field1169; var3++) {
            this.field1170[var3] = arg0.method327();
            this.field1171[var3] = arg0.method327();
        }
    }

    @OriginalMember(owner = "RPKBYPNF", name = "a", descriptor = "(B)V")
    public final void method475(byte arg0) {
        if (arg0 != 9) {
            return;
        }
        this.field1175 = 0;
        this.field1176 = 0;
        this.field1177 = 0;
        this.field1178 = 0;
        this.field1179 = 0;
    }

    @OriginalMember(owner = "RPKBYPNF", name = "a", descriptor = "(IB)I")
    public final int method476(int arg0, byte arg1) {
        if (this.field1179 >= this.field1175) {
            this.field1178 = this.field1171[this.field1176++] << 15;
            if (this.field1176 >= this.field1169) {
                this.field1176 = this.field1169 - 1;
            }
            this.field1175 = (int) ((double) this.field1170[this.field1176] / 65536.0D * (double) arg0);
            if (this.field1175 > this.field1179) {
                this.field1177 = ((this.field1171[this.field1176] << 15) - this.field1178) / (this.field1175 - this.field1179);
            }
        }
        this.field1178 += this.field1177;
        this.field1179++;
        if (arg1 != 123) {
            this.field1166 = -264;
        }
        return this.field1178 - this.field1177 >> 15;
    }
}
