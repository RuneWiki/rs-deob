import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class359 extends class640 {

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
    public boolean field5492 = false;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public int field5493;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field5495;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field5496;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method2926(int arg0, int arg1) {
        if (!this.field5492) {
            return false;
        }
        int var3 = this.field5496 - this.field5494;
        int var4 = this.field5497 - this.field5493;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5494 * var3 + this.field5493 * var4);
        if (var6 <= 0) {
            int var7 = this.field5494 - arg0;
            int var8 = this.field5493 - arg1;
            return var7 * var7 + var8 * var8 < this.field5495 * this.field5495;
        } else if (var6 > var5) {
            int var9 = this.field5496 - arg0;
            int var10 = this.field5497 - arg1;
            return var9 * var9 + var10 * var10 < this.field5495 * this.field5495;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5494 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5493 - arg1;
            return var12 * var12 + var13 * var13 < this.field5495 * this.field5495;
        }
    }
}
