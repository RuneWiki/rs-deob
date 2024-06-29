import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class130 extends class238 {

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "Z")
    public boolean field1462 = false;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
    public final boolean method736(int arg0, int arg1) {
        if (!this.field1462) {
            return false;
        }
        int var3 = this.field1458 - this.field1460;
        int var4 = this.field1459 - this.field1457;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1460 * var3 + this.field1457 * var4);
        if (var6 <= 0) {
            int var7 = this.field1460 - arg0;
            int var8 = this.field1457 - arg1;
            return var7 * var7 + var8 * var8 < this.field1461 * this.field1461;
        } else if (var6 > var5) {
            int var9 = this.field1458 - arg0;
            int var10 = this.field1459 - arg1;
            return var9 * var9 + var10 * var10 < this.field1461 * this.field1461;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1460 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1457 - arg1;
            return var12 * var12 + var13 * var13 < this.field1461 * this.field1461;
        }
    }
}
