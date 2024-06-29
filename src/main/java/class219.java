import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class219 extends class472 {

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
    public boolean field3098 = false;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method1389(int arg0, int arg1) {
        if (!this.field3098) {
            return false;
        }
        int var3 = this.field3097 - this.field3096;
        int var4 = this.field3094 - this.field3093;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field3096 * var3 + this.field3093 * var4);
        if (var6 <= 0) {
            int var7 = this.field3096 - arg0;
            int var8 = this.field3093 - arg1;
            return var7 * var7 + var8 * var8 < this.field3095 * this.field3095;
        } else if (var6 > var5) {
            int var9 = this.field3097 - arg0;
            int var10 = this.field3094 - arg1;
            return var9 * var9 + var10 * var10 < this.field3095 * this.field3095;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field3096 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field3093 - arg1;
            return var12 * var12 + var13 * var13 < this.field3095 * this.field3095;
        }
    }
}
