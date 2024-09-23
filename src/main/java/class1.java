import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AUPOWMGG")
public class class1 {

    @OriginalMember(owner = "AUPOWMGG", name = "a", descriptor = "I")
    private int field1 = -17039;

    @OriginalMember(owner = "AUPOWMGG", name = "b", descriptor = "Z")
    private boolean field2 = true;

    @OriginalMember(owner = "AUPOWMGG", name = "j", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "AUPOWMGG", name = "k", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "AUPOWMGG", name = "l", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "AUPOWMGG", name = "m", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "AUPOWMGG", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "AUPOWMGG", name = "c", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "AUPOWMGG", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "AUPOWMGG", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "AUPOWMGG", name = "h", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "AUPOWMGG", name = "i", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "AUPOWMGG", name = "d", descriptor = "[I")
    private int[] field4;

    @OriginalMember(owner = "AUPOWMGG", name = "e", descriptor = "[I")
    private int[] field5;

    @OriginalMember(owner = "AUPOWMGG", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    public final void method1(boolean arg0, class35 arg1) {
        this.field8 = arg1.method349();
        if (arg0) {
            this.field2 = !this.field2;
        }
        this.field6 = arg1.method354();
        this.field7 = arg1.method354();
        this.method2(arg1, (byte) 7);
    }

    @OriginalMember(owner = "AUPOWMGG", name = "a", descriptor = "(LNHEPCMLW;B)V")
    public final void method2(class35 arg0, byte arg1) {
        if (arg1 != 7) {
            this.field2 = !this.field2;
        }
        this.field3 = arg0.method349();
        this.field4 = new int[this.field3];
        this.field5 = new int[this.field3];
        for (int var3 = 0; var3 < this.field3; var3++) {
            this.field4[var3] = arg0.method351();
            this.field5[var3] = arg0.method351();
        }
    }

    @OriginalMember(owner = "AUPOWMGG", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.field9 = 0;
        this.field10 = 0;
        this.field11 = 0;
        this.field12 = 0;
        if (arg0 != 1) {
            this.field1 = -275;
        }
        this.field13 = 0;
    }

    @OriginalMember(owner = "AUPOWMGG", name = "a", descriptor = "(ZI)I")
    public final int method4(boolean arg0, int arg1) {
        if (this.field13 >= this.field9) {
            this.field12 = this.field5[this.field10++] << 15;
            if (this.field10 >= this.field3) {
                this.field10 = this.field3 - 1;
            }
            this.field9 = (int) ((double) this.field4[this.field10] / 65536.0D * (double) arg1);
            if (this.field9 > this.field13) {
                this.field11 = ((this.field5[this.field10] << 15) - this.field12) / (this.field9 - this.field13);
            }
        }
        this.field12 += this.field11;
        if (arg0) {
            this.field1 = 479;
        }
        this.field13++;
        return this.field12 - this.field11 >> 15;
    }
}
