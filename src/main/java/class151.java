import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class151 extends class569 {

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "Z")
    public boolean field1930 = false;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public int field1929;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)Z")
    public final boolean method863(int arg0, int arg1) {
        if (!this.field1930) {
            return false;
        }
        int var3 = this.field1934 - this.field1933;
        int var4 = this.field1931 - this.field1929;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1933 * var3 + this.field1929 * var4);
        if (var6 <= 0) {
            int var7 = this.field1933 - arg0;
            int var8 = this.field1929 - arg1;
            return var7 * var7 + var8 * var8 < this.field1932 * this.field1932;
        } else if (var6 > var5) {
            int var9 = this.field1934 - arg0;
            int var10 = this.field1931 - arg1;
            return var9 * var9 + var10 * var10 < this.field1932 * this.field1932;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1933 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1929 - arg1;
            return var12 * var12 + var13 * var13 < this.field1932 * this.field1932;
        }
    }
}
