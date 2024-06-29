import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class361 extends class237 {

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Z")
    public boolean field5443 = false;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public int field5441;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field5446;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method2320(int arg0, int arg1) {
        if (!this.field5443) {
            return false;
        }
        int var3 = this.field5445 - this.field5442;
        int var4 = this.field5444 - this.field5441;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5442 * var3 + this.field5441 * var4);
        if (var6 <= 0) {
            int var7 = this.field5442 - arg0;
            int var8 = this.field5441 - arg1;
            return var7 * var7 + var8 * var8 < this.field5446 * this.field5446;
        } else if (var6 > var5) {
            int var9 = this.field5445 - arg0;
            int var10 = this.field5444 - arg1;
            return var9 * var9 + var10 * var10 < this.field5446 * this.field5446;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5442 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5441 - arg1;
            return var12 * var12 + var13 * var13 < this.field5446 * this.field5446;
        }
    }
}
