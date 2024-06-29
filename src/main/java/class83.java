import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class83 extends class59 {

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "Z")
    public boolean field1201 = false;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Z")
    public final boolean method693(int arg0, int arg1) {
        if (!this.field1201) {
            return false;
        }
        int var3 = this.field1199 - this.field1200;
        int var4 = this.field1202 - this.field1203;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1203 * var4 + this.field1200 * var3);
        if (var6 <= 0) {
            int var7 = this.field1200 - arg0;
            int var8 = this.field1203 - arg1;
            return var7 * var7 + var8 * var8 < this.field1198 * this.field1198;
        } else if (var6 > var5) {
            int var9 = this.field1199 - arg0;
            int var10 = this.field1202 - arg1;
            return var9 * var9 + var10 * var10 < this.field1198 * this.field1198;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1200 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1203 - arg1;
            return var12 * var12 + var13 * var13 < this.field1198 * this.field1198;
        }
    }
}
