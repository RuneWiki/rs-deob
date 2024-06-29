import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class299 extends class600 {

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Z")
    public boolean field4209 = false;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public int field4205;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
    public final boolean method1845(int arg0, int arg1) {
        if (!this.field4209) {
            return false;
        }
        int var3 = this.field4205 - this.field4208;
        int var4 = this.field4204 - this.field4206;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4208 * var3 + this.field4206 * var4);
        if (var6 <= 0) {
            int var7 = this.field4208 - arg0;
            int var8 = this.field4206 - arg1;
            return var7 * var7 + var8 * var8 < this.field4207 * this.field4207;
        } else if (var6 > var5) {
            int var9 = this.field4205 - arg0;
            int var10 = this.field4204 - arg1;
            return var9 * var9 + var10 * var10 < this.field4207 * this.field4207;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4208 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4206 - arg1;
            return var12 * var12 + var13 * var13 < this.field4207 * this.field4207;
        }
    }
}
