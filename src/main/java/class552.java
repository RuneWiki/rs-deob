import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class552 extends class502 {

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "Z")
    public boolean field7341 = false;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public int field7343;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public int field7344;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public int field7346;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)Z")
    public final boolean method3063(int arg0, int arg1) {
        if (!this.field7341) {
            return false;
        }
        int var3 = this.field7343 - this.field7346;
        int var4 = this.field7342 - this.field7345;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field7346 * var3 + this.field7345 * var4);
        if (var6 <= 0) {
            int var7 = this.field7346 - arg0;
            int var8 = this.field7345 - arg1;
            return var7 * var7 + var8 * var8 < this.field7344 * this.field7344;
        } else if (var6 > var5) {
            int var9 = this.field7343 - arg0;
            int var10 = this.field7342 - arg1;
            return var9 * var9 + var10 * var10 < this.field7344 * this.field7344;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field7346 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field7345 - arg1;
            return var12 * var12 + var13 * var13 < this.field7344 * this.field7344;
        }
    }
}
