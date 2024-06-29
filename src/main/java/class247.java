import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class247 extends class371 {

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Z")
    public boolean field3629 = false;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z", line = 9)
    public final boolean method1661(int arg0, int arg1) {
        if (!this.field3629) {
            return false;
        }
        int var3 = this.field3632 - this.field3633;
        int var4 = this.field3630 - this.field3634;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field3634 * var4 + this.field3633 * var3);
        if (var6 <= 0) {
            int var7 = this.field3633 - arg0;
            int var8 = this.field3634 - arg1;
            return var7 * var7 + var8 * var8 < this.field3631 * this.field3631;
        } else if (var6 > var5) {
            int var9 = this.field3632 - arg0;
            int var10 = this.field3630 - arg1;
            return var9 * var9 + var10 * var10 < this.field3631 * this.field3631;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field3633 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field3634 - arg1;
            return var12 * var12 + var13 * var13 < this.field3631 * this.field3631;
        }
    }
}
