import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class667 extends class631 {

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Z")
    public boolean field9487 = false;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field9482;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field9483;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public int field9484;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field9485;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field9486;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method3796(int arg0, int arg1) {
        if (!this.field9487) {
            return false;
        }
        int var3 = this.field9486 - this.field9485;
        int var4 = this.field9483 - this.field9482;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field9485 * var3 + this.field9482 * var4);
        if (var6 <= 0) {
            int var7 = this.field9485 - arg0;
            int var8 = this.field9482 - arg1;
            return var7 * var7 + var8 * var8 < this.field9484 * this.field9484;
        } else if (var6 > var5) {
            int var9 = this.field9486 - arg0;
            int var10 = this.field9483 - arg1;
            return var9 * var9 + var10 * var10 < this.field9484 * this.field9484;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field9485 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field9482 - arg1;
            return var12 * var12 + var13 * var13 < this.field9484 * this.field9484;
        }
    }
}
