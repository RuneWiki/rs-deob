import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class153 extends class438 {

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
    public boolean field2197 = false;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Z")
    public final boolean method1123(int arg0, int arg1) {
        if (!this.field2197) {
            return false;
        }
        int var3 = this.field2198 - this.field2194;
        int var4 = this.field2193 - this.field2195;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2195 * var4 + this.field2194 * var3);
        if (var6 <= 0) {
            int var7 = this.field2194 - arg0;
            int var8 = this.field2195 - arg1;
            return var7 * var7 + var8 * var8 < this.field2196 * this.field2196;
        } else if (var6 > var5) {
            int var9 = this.field2198 - arg0;
            int var10 = this.field2193 - arg1;
            return var9 * var9 + var10 * var10 < this.field2196 * this.field2196;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2194 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2195 - arg1;
            return var12 * var12 + var13 * var13 < this.field2196 * this.field2196;
        }
    }
}
