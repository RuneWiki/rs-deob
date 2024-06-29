import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class357 extends class388 {

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "Z")
    public boolean field4818 = false;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Z")
    public final boolean method2088(int arg0, int arg1) {
        if (!this.field4818) {
            return false;
        }
        int var3 = this.field4820 - this.field4815;
        int var4 = this.field4819 - this.field4817;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4817 * var4 + this.field4815 * var3);
        if (var6 <= 0) {
            int var7 = this.field4815 - arg0;
            int var8 = this.field4817 - arg1;
            return var7 * var7 + var8 * var8 < this.field4816 * this.field4816;
        } else if (var6 > var5) {
            int var9 = this.field4820 - arg0;
            int var10 = this.field4819 - arg1;
            return var9 * var9 + var10 * var10 < this.field4816 * this.field4816;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4815 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4817 - arg1;
            return var12 * var12 + var13 * var13 < this.field4816 * this.field4816;
        }
    }
}
