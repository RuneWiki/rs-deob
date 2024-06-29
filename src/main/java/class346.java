import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class346 extends class211 {

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
    public boolean field5122 = false;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public int field5123;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public int field5124;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public int field5125;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public int field5126;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public int field5127;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method2115(int arg0, int arg1) {
        if (!this.field5122) {
            return false;
        }
        int var3 = this.field5125 - this.field5126;
        int var4 = this.field5123 - this.field5127;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5127 * var4 + this.field5126 * var3);
        if (var6 <= 0) {
            int var7 = this.field5126 - arg0;
            int var8 = this.field5127 - arg1;
            return var7 * var7 + var8 * var8 < this.field5124 * this.field5124;
        } else if (var6 > var5) {
            int var9 = this.field5125 - arg0;
            int var10 = this.field5123 - arg1;
            return var9 * var9 + var10 * var10 < this.field5124 * this.field5124;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5126 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5127 - arg1;
            return var12 * var12 + var13 * var13 < this.field5124 * this.field5124;
        }
    }
}
