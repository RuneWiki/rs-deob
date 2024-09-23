import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RSNWTZPO")
public class class54 {

    @OriginalMember(owner = "RSNWTZPO", name = "a", descriptor = "I")
    private int field1392 = 1;

    @OriginalMember(owner = "RSNWTZPO", name = "b", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "RSNWTZPO", name = "e", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "RSNWTZPO", name = "f", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "RSNWTZPO", name = "g", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "RSNWTZPO", name = "h", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "RSNWTZPO", name = "i", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "RSNWTZPO", name = "j", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "RSNWTZPO", name = "k", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "RSNWTZPO", name = "l", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "RSNWTZPO", name = "m", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "RSNWTZPO", name = "c", descriptor = "[I")
    private int[] field1394;

    @OriginalMember(owner = "RSNWTZPO", name = "d", descriptor = "[I")
    private int[] field1395;

    @OriginalMember(owner = "RSNWTZPO", name = "a", descriptor = "(ILINLHDAGO;)V")
    public final void method465(int arg0, class29 arg1) {
        this.field1398 = arg1.method308();
        this.field1396 = arg1.method313();
        this.field1397 = arg1.method313();
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method466(arg1, 0);
    }

    @OriginalMember(owner = "RSNWTZPO", name = "a", descriptor = "(LINLHDAGO;I)V")
    public final void method466(class29 arg0, int arg1) {
        this.field1393 = arg0.method308();
        if (arg1 != 0) {
            return;
        }
        this.field1394 = new int[this.field1393];
        this.field1395 = new int[this.field1393];
        for (int var3 = 0; var3 < this.field1393; var3++) {
            this.field1394[var3] = arg0.method310();
            this.field1395[var3] = arg0.method310();
        }
    }

    @OriginalMember(owner = "RSNWTZPO", name = "a", descriptor = "(I)V")
    public final void method467(int arg0) {
        this.field1399 = 0;
        this.field1400 = 0;
        if (arg0 != 35358) {
            this.field1392 = -47;
        }
        this.field1401 = 0;
        this.field1402 = 0;
        this.field1403 = 0;
    }

    @OriginalMember(owner = "RSNWTZPO", name = "a", descriptor = "(II)I")
    public final int method468(int arg0, int arg1) {
        if (this.field1403 >= this.field1399) {
            this.field1402 = this.field1395[this.field1400++] << 15;
            if (this.field1400 >= this.field1393) {
                this.field1400 = this.field1393 - 1;
            }
            this.field1399 = (int) ((double) this.field1394[this.field1400] / 65536.0D * (double) arg0);
            if (this.field1399 > this.field1403) {
                this.field1401 = ((this.field1395[this.field1400] << 15) - this.field1402) / (this.field1399 - this.field1403);
            }
        }
        this.field1402 += this.field1401;
        if (arg1 == 39226) {
            this.field1403++;
            return this.field1402 - this.field1401 >> 15;
        } else {
            return 0;
        }
    }
}
