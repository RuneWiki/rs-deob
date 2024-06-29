import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class419 extends class68 {

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Z")
    public boolean field5942 = false;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public int field5944;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public int field5945;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public int field5946;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public int field5947;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method2466(int arg0, int arg1) {
        if (!this.field5942) {
            return false;
        }
        int var3 = this.field5946 - this.field5947;
        int var4 = this.field5944 - this.field5943;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5947 * var3 + this.field5943 * var4);
        if (var6 <= 0) {
            int var7 = this.field5947 - arg0;
            int var8 = this.field5943 - arg1;
            return var7 * var7 + var8 * var8 < this.field5945 * this.field5945;
        } else if (var6 > var5) {
            int var9 = this.field5946 - arg0;
            int var10 = this.field5944 - arg1;
            return var9 * var9 + var10 * var10 < this.field5945 * this.field5945;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5947 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5943 - arg1;
            return var12 * var12 + var13 * var13 < this.field5945 * this.field5945;
        }
    }
}
