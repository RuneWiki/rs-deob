import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class98 extends class120 {

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "Z")
    public boolean field1258 = false;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)Z")
    public final boolean method561(int arg0, int arg1) {
        if (!this.field1258) {
            return false;
        }
        int var3 = this.field1259 - this.field1257;
        int var4 = this.field1260 - this.field1256;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1257 * var3 + this.field1256 * var4);
        if (var6 <= 0) {
            int var7 = this.field1257 - arg0;
            int var8 = this.field1256 - arg1;
            return var7 * var7 + var8 * var8 < this.field1255 * this.field1255;
        } else if (var6 > var5) {
            int var9 = this.field1259 - arg0;
            int var10 = this.field1260 - arg1;
            return var9 * var9 + var10 * var10 < this.field1255 * this.field1255;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1257 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1256 - arg1;
            return var12 * var12 + var13 * var13 < this.field1255 * this.field1255;
        }
    }
}
