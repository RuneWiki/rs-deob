import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class137 extends class670 {

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Z")
    public boolean field1987 = false;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Z")
    public final boolean method972(int arg0, int arg1) {
        if (!this.field1987) {
            return false;
        }
        int var3 = this.field1990 - this.field1985;
        int var4 = this.field1989 - this.field1986;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1986 * var4 + this.field1985 * var3);
        if (var6 <= 0) {
            int var7 = this.field1985 - arg0;
            int var8 = this.field1986 - arg1;
            return var7 * var7 + var8 * var8 < this.field1988 * this.field1988;
        } else if (var6 > var5) {
            int var9 = this.field1990 - arg0;
            int var10 = this.field1989 - arg1;
            return var9 * var9 + var10 * var10 < this.field1988 * this.field1988;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1985 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1986 - arg1;
            return var12 * var12 + var13 * var13 < this.field1988 * this.field1988;
        }
    }
}
