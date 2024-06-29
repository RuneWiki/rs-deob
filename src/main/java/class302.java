import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class302 extends class176 {

    @OriginalMember(owner = "client!st", name = "n", descriptor = "Z")
    public boolean field4424 = false;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public int field4422;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)Z")
    public final boolean method1913(int arg0, int arg1) {
        if (!this.field4424) {
            return false;
        }
        int var3 = this.field4427 - this.field4423;
        int var4 = this.field4422 - this.field4425;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4425 * var4 + this.field4423 * var3);
        if (var6 <= 0) {
            int var7 = this.field4423 - arg0;
            int var8 = this.field4425 - arg1;
            return var7 * var7 + var8 * var8 < this.field4426 * this.field4426;
        } else if (var6 > var5) {
            int var9 = this.field4427 - arg0;
            int var10 = this.field4422 - arg1;
            return var9 * var9 + var10 * var10 < this.field4426 * this.field4426;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4423 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4425 - arg1;
            return var12 * var12 + var13 * var13 < this.field4426 * this.field4426;
        }
    }
}
