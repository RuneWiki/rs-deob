import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class137 extends class349 {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Z")
    public boolean field1774 = false;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
    public final boolean method967(int arg0, int arg1) {
        if (!this.field1774) {
            return false;
        }
        int var3 = this.field1771 - this.field1773;
        int var4 = this.field1775 - this.field1772;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1773 * var3 + this.field1772 * var4);
        if (var6 <= 0) {
            int var7 = this.field1773 - arg0;
            int var8 = this.field1772 - arg1;
            return var7 * var7 + var8 * var8 < this.field1776 * this.field1776;
        } else if (var6 > var5) {
            int var9 = this.field1771 - arg0;
            int var10 = this.field1775 - arg1;
            return var9 * var9 + var10 * var10 < this.field1776 * this.field1776;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1773 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1772 - arg1;
            return var12 * var12 + var13 * var13 < this.field1776 * this.field1776;
        }
    }
}
