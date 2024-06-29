import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class82 extends class198 {

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "Z")
    public boolean field994 = false;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method456(int arg0, int arg1) {
        if (!this.field994) {
            return false;
        }
        int var3 = this.field992 - this.field996;
        int var4 = this.field997 - this.field995;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field996 * var3 + this.field995 * var4);
        if (var6 <= 0) {
            int var7 = this.field996 - arg0;
            int var8 = this.field995 - arg1;
            return var7 * var7 + var8 * var8 < this.field993 * this.field993;
        } else if (var6 > var5) {
            int var9 = this.field992 - arg0;
            int var10 = this.field997 - arg1;
            return var9 * var9 + var10 * var10 < this.field993 * this.field993;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field996 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field995 - arg1;
            return var12 * var12 + var13 * var13 < this.field993 * this.field993;
        }
    }
}
