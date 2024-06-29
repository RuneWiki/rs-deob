import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class102 extends class55 {

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "Z")
    public boolean field1430 = false;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method779(int arg0, int arg1) {
        if (!this.field1430) {
            return false;
        }
        int var3 = this.field1433 - this.field1432;
        int var4 = this.field1434 - this.field1431;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1432 * var3 + this.field1431 * var4);
        if (var6 <= 0) {
            int var7 = this.field1432 - arg0;
            int var8 = this.field1431 - arg1;
            return var7 * var7 + var8 * var8 < this.field1429 * this.field1429;
        } else if (var6 > var5) {
            int var9 = this.field1433 - arg0;
            int var10 = this.field1434 - arg1;
            return var9 * var9 + var10 * var10 < this.field1429 * this.field1429;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1432 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1431 - arg1;
            return var12 * var12 + var13 * var13 < this.field1429 * this.field1429;
        }
    }
}
