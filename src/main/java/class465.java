import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class465 extends class428 {

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Z")
    public boolean field6548 = false;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public int field6543;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public int field6544;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public int field6545;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public int field6546;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public int field6547;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)Z")
    public final boolean method2734(int arg0, int arg1) {
        if (!this.field6548) {
            return false;
        }
        int var3 = this.field6543 - this.field6546;
        int var4 = this.field6544 - this.field6547;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6547 * var4 + this.field6546 * var3);
        if (var6 <= 0) {
            int var7 = this.field6546 - arg0;
            int var8 = this.field6547 - arg1;
            return var7 * var7 + var8 * var8 < this.field6545 * this.field6545;
        } else if (var6 > var5) {
            int var9 = this.field6543 - arg0;
            int var10 = this.field6544 - arg1;
            return var9 * var9 + var10 * var10 < this.field6545 * this.field6545;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6546 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6547 - arg1;
            return var12 * var12 + var13 * var13 < this.field6545 * this.field6545;
        }
    }
}
