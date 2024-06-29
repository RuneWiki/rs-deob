import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class170 extends class313 {

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Z")
    public boolean field2671 = false;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field2668;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z", line = 10)
    public final boolean method1182(int arg0, int arg1) {
        if (!this.field2671) {
            return false;
        }
        int var3 = this.field2670 - this.field2669;
        int var4 = this.field2673 - this.field2668;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2669 * var3 + this.field2668 * var4);
        if (var6 <= 0) {
            int var7 = this.field2669 - arg0;
            int var8 = this.field2668 - arg1;
            return var7 * var7 + var8 * var8 < this.field2672 * this.field2672;
        } else if (var6 > var5) {
            int var9 = this.field2670 - arg0;
            int var10 = this.field2673 - arg1;
            return var9 * var9 + var10 * var10 < this.field2672 * this.field2672;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2669 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2668 - arg1;
            return var12 * var12 + var13 * var13 < this.field2672 * this.field2672;
        }
    }
}
