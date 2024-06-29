import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 extends class315 {

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
    public boolean field919 = false;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method572(int arg0, int arg1) {
        if (!this.field919) {
            return false;
        }
        int var3 = this.field915 - this.field917;
        int var4 = this.field916 - this.field914;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field917 * var3 + this.field914 * var4);
        if (var6 <= 0) {
            int var7 = this.field917 - arg0;
            int var8 = this.field914 - arg1;
            return var7 * var7 + var8 * var8 < this.field918 * this.field918;
        } else if (var6 > var5) {
            int var9 = this.field915 - arg0;
            int var10 = this.field916 - arg1;
            return var9 * var9 + var10 * var10 < this.field918 * this.field918;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field917 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field914 - arg1;
            return var12 * var12 + var13 * var13 < this.field918 * this.field918;
        }
    }
}
