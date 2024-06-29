import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class48 extends class409 {

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Z")
    public boolean field904 = false;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z", line = 9)
    public final boolean method441(int arg0, int arg1) {
        if (!this.field904) {
            return false;
        }
        int var3 = this.field906 - this.field907;
        int var4 = this.field903 - this.field908;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field908 * var4 + this.field907 * var3);
        if (var6 <= 0) {
            int var7 = this.field907 - arg0;
            int var8 = this.field908 - arg1;
            return var7 * var7 + var8 * var8 < this.field905 * this.field905;
        } else if (var6 > var5) {
            int var9 = this.field906 - arg0;
            int var10 = this.field903 - arg1;
            return var9 * var9 + var10 * var10 < this.field905 * this.field905;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field907 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field908 - arg1;
            return var12 * var12 + var13 * var13 < this.field905 * this.field905;
        }
    }
}
