import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class447 extends class183 {

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Z")
    public boolean field6507 = false;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public int field6504;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public int field6508;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
    public final boolean method2764(int arg0, int arg1) {
        if (!this.field6507) {
            return false;
        }
        int var3 = this.field6508 - this.field6505;
        int var4 = this.field6504 - this.field6506;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6506 * var4 + this.field6505 * var3);
        if (var6 <= 0) {
            int var7 = this.field6505 - arg0;
            int var8 = this.field6506 - arg1;
            return var7 * var7 + var8 * var8 < this.field6509 * this.field6509;
        } else if (var6 > var5) {
            int var9 = this.field6508 - arg0;
            int var10 = this.field6504 - arg1;
            return var9 * var9 + var10 * var10 < this.field6509 * this.field6509;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6505 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6506 - arg1;
            return var12 * var12 + var13 * var13 < this.field6509 * this.field6509;
        }
    }
}
