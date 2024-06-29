import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class127 extends class12 {

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Z")
    public boolean field1784 = false;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
    public final boolean method777(int arg0, int arg1) {
        if (!this.field1784) {
            return false;
        }
        int var3 = this.field1781 - this.field1782;
        int var4 = this.field1779 - this.field1780;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1782 * var3 + this.field1780 * var4);
        if (var6 <= 0) {
            int var7 = this.field1782 - arg0;
            int var8 = this.field1780 - arg1;
            return var7 * var7 + var8 * var8 < this.field1783 * this.field1783;
        } else if (var6 > var5) {
            int var9 = this.field1781 - arg0;
            int var10 = this.field1779 - arg1;
            return var9 * var9 + var10 * var10 < this.field1783 * this.field1783;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1782 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1780 - arg1;
            return var12 * var12 + var13 * var13 < this.field1783 * this.field1783;
        }
    }
}
