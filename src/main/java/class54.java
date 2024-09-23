import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TDXKKGZV")
public class class54 {

    @OriginalMember(owner = "TDXKKGZV", name = "a", descriptor = "Z")
    private boolean field1413 = false;

    @OriginalMember(owner = "TDXKKGZV", name = "b", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "TDXKKGZV", name = "e", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "TDXKKGZV", name = "f", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "TDXKKGZV", name = "g", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "TDXKKGZV", name = "h", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "TDXKKGZV", name = "i", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "TDXKKGZV", name = "j", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "TDXKKGZV", name = "k", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "TDXKKGZV", name = "l", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "TDXKKGZV", name = "m", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "TDXKKGZV", name = "c", descriptor = "[I")
    private int[] field1415;

    @OriginalMember(owner = "TDXKKGZV", name = "d", descriptor = "[I")
    private int[] field1416;

    @OriginalMember(owner = "TDXKKGZV", name = "a", descriptor = "(ILIMUIZRAF;)V")
    public final void method485(int arg0, class24 arg1) {
        this.field1419 = arg1.method238();
        this.field1417 = arg1.method243();
        this.field1418 = arg1.method243();
        this.method486(false, arg1);
        if (arg0 != 8) {
            this.field1413 = !this.field1413;
        }
    }

    @OriginalMember(owner = "TDXKKGZV", name = "a", descriptor = "(ZLIMUIZRAF;)V")
    public final void method486(boolean arg0, class24 arg1) {
        if (arg0) {
            return;
        }
        this.field1414 = arg1.method238();
        this.field1415 = new int[this.field1414];
        this.field1416 = new int[this.field1414];
        for (int var3 = 0; var3 < this.field1414; var3++) {
            this.field1415[var3] = arg1.method240();
            this.field1416[var3] = arg1.method240();
        }
    }

    @OriginalMember(owner = "TDXKKGZV", name = "a", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.field1420 = 0;
        this.field1421 = 0;
        this.field1422 = 0;
        if (arg0 >= 4 && arg0 <= 4) {
            this.field1423 = 0;
            this.field1424 = 0;
        }
    }

    @OriginalMember(owner = "TDXKKGZV", name = "a", descriptor = "(II)I")
    public final int method488(int arg0, int arg1) {
        if (this.field1424 >= this.field1420) {
            this.field1423 = this.field1416[this.field1421++] << 15;
            if (this.field1421 >= this.field1414) {
                this.field1421 = this.field1414 - 1;
            }
            this.field1420 = (int) ((double) this.field1415[this.field1421] / 65536.0D * (double) arg0);
            if (this.field1420 > this.field1424) {
                this.field1422 = ((this.field1416[this.field1421] << 15) - this.field1423) / (this.field1420 - this.field1424);
            }
        }
        this.field1423 += this.field1422;
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1424++;
        return this.field1423 - this.field1422 >> 15;
    }
}
