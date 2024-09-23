import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KMZLAUEV")
public class class32 {

    @OriginalMember(owner = "KMZLAUEV", name = "a", descriptor = "I")
    private int field1105 = 4;

    @OriginalMember(owner = "KMZLAUEV", name = "b", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "KMZLAUEV", name = "e", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "KMZLAUEV", name = "f", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "KMZLAUEV", name = "g", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "KMZLAUEV", name = "h", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "KMZLAUEV", name = "i", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "KMZLAUEV", name = "j", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "KMZLAUEV", name = "k", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "KMZLAUEV", name = "l", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "KMZLAUEV", name = "m", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "KMZLAUEV", name = "c", descriptor = "[I")
    private int[] field1107;

    @OriginalMember(owner = "KMZLAUEV", name = "d", descriptor = "[I")
    private int[] field1108;

    @OriginalMember(owner = "KMZLAUEV", name = "a", descriptor = "(LKHOMSBHW;I)V")
    public final void method394(class30 arg0, int arg1) {
        this.field1111 = arg0.method349();
        this.field1109 = arg0.method354();
        this.field1110 = arg0.method354();
        if (arg1 != 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method395(arg0, 866);
    }

    @OriginalMember(owner = "KMZLAUEV", name = "b", descriptor = "(LKHOMSBHW;I)V")
    public final void method395(class30 arg0, int arg1) {
        int var3 = 84 / arg1;
        this.field1106 = arg0.method349();
        this.field1107 = new int[this.field1106];
        this.field1108 = new int[this.field1106];
        for (int var4 = 0; var4 < this.field1106; var4++) {
            this.field1107[var4] = arg0.method351();
            this.field1108[var4] = arg0.method351();
        }
    }

    @OriginalMember(owner = "KMZLAUEV", name = "a", descriptor = "(Z)V")
    public final void method396(boolean arg0) {
        this.field1112 = 0;
        this.field1113 = 0;
        this.field1114 = 0;
        this.field1115 = 0;
        this.field1116 = 0;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "KMZLAUEV", name = "a", descriptor = "(BI)I")
    public final int method397(byte arg0, int arg1) {
        if (this.field1116 >= this.field1112) {
            this.field1115 = this.field1108[this.field1113++] << 15;
            if (this.field1113 >= this.field1106) {
                this.field1113 = this.field1106 - 1;
            }
            this.field1112 = (int) ((double) this.field1107[this.field1113] / 65536.0D * (double) arg1);
            if (this.field1112 > this.field1116) {
                this.field1114 = ((this.field1108[this.field1113] << 15) - this.field1115) / (this.field1112 - this.field1116);
            }
        }
        this.field1115 += this.field1114;
        this.field1116++;
        if (arg0 != 2) {
            this.field1105 = -66;
        }
        return this.field1115 - this.field1114 >> 15;
    }
}
