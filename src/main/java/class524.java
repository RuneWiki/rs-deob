import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class524 extends class272 {

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Z")
    public boolean field6625 = false;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public int field6623;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public int field6624;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public int field6626;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public int field6627;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public int field6628;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)Z", line = 10)
    public final boolean method2830(int arg0, int arg1) {
        if (!this.field6625) {
            return false;
        }
        int var3 = this.field6626 - this.field6624;
        int var4 = this.field6628 - this.field6627;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6627 * var4 + this.field6624 * var3);
        if (var6 <= 0) {
            int var7 = this.field6624 - arg0;
            int var8 = this.field6627 - arg1;
            return var7 * var7 + var8 * var8 < this.field6623 * this.field6623;
        } else if (var6 > var5) {
            int var9 = this.field6626 - arg0;
            int var10 = this.field6628 - arg1;
            return var9 * var9 + var10 * var10 < this.field6623 * this.field6623;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6624 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6627 - arg1;
            return var12 * var12 + var13 * var13 < this.field6623 * this.field6623;
        }
    }
}
