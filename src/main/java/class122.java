import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class122 extends class291 {

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "Z")
    public boolean field1672 = false;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Z")
    public final boolean method811(int arg0, int arg1) {
        if (!this.field1672) {
            return false;
        }
        int var3 = this.field1673 - this.field1675;
        int var4 = this.field1674 - this.field1671;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1675 * var3 + this.field1671 * var4);
        if (var6 <= 0) {
            int var7 = this.field1675 - arg0;
            int var8 = this.field1671 - arg1;
            return var7 * var7 + var8 * var8 < this.field1676 * this.field1676;
        } else if (var6 > var5) {
            int var9 = this.field1673 - arg0;
            int var10 = this.field1674 - arg1;
            return var9 * var9 + var10 * var10 < this.field1676 * this.field1676;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1675 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1671 - arg1;
            return var12 * var12 + var13 * var13 < this.field1676 * this.field1676;
        }
    }
}
