import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class158 extends class447 {

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Z")
    public boolean field2200 = false;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z")
    public final boolean method968(int arg0, int arg1) {
        if (!this.field2200) {
            return false;
        }
        int var3 = this.field2201 - this.field2203;
        int var4 = this.field2199 - this.field2204;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2204 * var4 + this.field2203 * var3);
        if (var6 <= 0) {
            int var7 = this.field2203 - arg0;
            int var8 = this.field2204 - arg1;
            return var7 * var7 + var8 * var8 < this.field2202 * this.field2202;
        } else if (var6 > var5) {
            int var9 = this.field2201 - arg0;
            int var10 = this.field2199 - arg1;
            return var9 * var9 + var10 * var10 < this.field2202 * this.field2202;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2203 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2204 - arg1;
            return var12 * var12 + var13 * var13 < this.field2202 * this.field2202;
        }
    }
}
