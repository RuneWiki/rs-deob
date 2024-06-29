import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class456 extends class34 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
    public boolean field6809 = false;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field6810;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field6814;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method2716(int arg0, int arg1) {
        if (!this.field6809) {
            return false;
        }
        int var3 = this.field6810 - this.field6812;
        int var4 = this.field6811 - this.field6813;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6813 * var4 + this.field6812 * var3);
        if (var6 <= 0) {
            int var7 = this.field6812 - arg0;
            int var8 = this.field6813 - arg1;
            return var7 * var7 + var8 * var8 < this.field6814 * this.field6814;
        } else if (var6 > var5) {
            int var9 = this.field6810 - arg0;
            int var10 = this.field6811 - arg1;
            return var9 * var9 + var10 * var10 < this.field6814 * this.field6814;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6812 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6813 - arg1;
            return var12 * var12 + var13 * var13 < this.field6814 * this.field6814;
        }
    }
}
