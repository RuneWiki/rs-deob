import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class605 extends class426 {

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Z")
    public boolean field8717 = false;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field8714;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field8715;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public int field8716;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public int field8718;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public int field8719;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method3482(int arg0, int arg1) {
        if (!this.field8717) {
            return false;
        }
        int var3 = this.field8719 - this.field8714;
        int var4 = this.field8718 - this.field8716;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field8716 * var4 + this.field8714 * var3);
        if (var6 <= 0) {
            int var7 = this.field8714 - arg0;
            int var8 = this.field8716 - arg1;
            return var7 * var7 + var8 * var8 < this.field8715 * this.field8715;
        } else if (var6 > var5) {
            int var9 = this.field8719 - arg0;
            int var10 = this.field8718 - arg1;
            return var9 * var9 + var10 * var10 < this.field8715 * this.field8715;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field8714 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field8716 - arg1;
            return var12 * var12 + var13 * var13 < this.field8715 * this.field8715;
        }
    }
}
