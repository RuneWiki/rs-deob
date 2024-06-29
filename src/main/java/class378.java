import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class378 extends class588 {

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "Z")
    public boolean field5294 = false;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)Z")
    public final boolean method2306(int arg0, int arg1) {
        if (!this.field5294) {
            return false;
        }
        int var3 = this.field5292 - this.field5290;
        int var4 = this.field5293 - this.field5291;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5291 * var4 + this.field5290 * var3);
        if (var6 <= 0) {
            int var7 = this.field5290 - arg0;
            int var8 = this.field5291 - arg1;
            return var7 * var7 + var8 * var8 < this.field5289 * this.field5289;
        } else if (var6 > var5) {
            int var9 = this.field5292 - arg0;
            int var10 = this.field5293 - arg1;
            return var9 * var9 + var10 * var10 < this.field5289 * this.field5289;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5290 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5291 - arg1;
            return var12 * var12 + var13 * var13 < this.field5289 * this.field5289;
        }
    }
}
