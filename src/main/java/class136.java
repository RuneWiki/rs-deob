import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class136 extends class589 {

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "Z")
    public boolean field1840 = false;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Z", line = 8)
    public final boolean method949(int arg0, int arg1) {
        if (!this.field1840) {
            return false;
        }
        int var3 = this.field1843 - this.field1842;
        int var4 = this.field1844 - this.field1841;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1842 * var3 + this.field1841 * var4);
        if (var6 <= 0) {
            int var7 = this.field1842 - arg0;
            int var8 = this.field1841 - arg1;
            return var7 * var7 + var8 * var8 < this.field1845 * this.field1845;
        } else if (var6 > var5) {
            int var9 = this.field1843 - arg0;
            int var10 = this.field1844 - arg1;
            return var9 * var9 + var10 * var10 < this.field1845 * this.field1845;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1842 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1841 - arg1;
            return var12 * var12 + var13 * var13 < this.field1845 * this.field1845;
        }
    }
}
