import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class290 extends class435 {

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Z")
    public boolean field4325 = false;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z")
    public final boolean method2036(int arg0, int arg1) {
        if (!this.field4325) {
            return false;
        }
        int var3 = this.field4326 - this.field4324;
        int var4 = this.field4321 - this.field4322;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4324 * var3 + this.field4322 * var4);
        if (var6 <= 0) {
            int var7 = this.field4324 - arg0;
            int var8 = this.field4322 - arg1;
            return var7 * var7 + var8 * var8 < this.field4323 * this.field4323;
        } else if (var6 > var5) {
            int var9 = this.field4326 - arg0;
            int var10 = this.field4321 - arg1;
            return var9 * var9 + var10 * var10 < this.field4323 * this.field4323;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4324 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4322 - arg1;
            return var12 * var12 + var13 * var13 < this.field4323 * this.field4323;
        }
    }
}
