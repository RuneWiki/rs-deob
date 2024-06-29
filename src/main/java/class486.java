import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class486 extends class166 {

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "Z")
    public boolean field6676 = false;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    public int field6672;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public int field6673;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public int field6674;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    public int field6675;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)Z")
    public final boolean method2744(int arg0, int arg1) {
        if (!this.field6676) {
            return false;
        }
        int var3 = this.field6672 - this.field6673;
        int var4 = this.field6674 - this.field6675;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6675 * var4 + this.field6673 * var3);
        if (var6 <= 0) {
            int var7 = this.field6673 - arg0;
            int var8 = this.field6675 - arg1;
            return var7 * var7 + var8 * var8 < this.field6671 * this.field6671;
        } else if (var6 > var5) {
            int var9 = this.field6672 - arg0;
            int var10 = this.field6674 - arg1;
            return var9 * var9 + var10 * var10 < this.field6671 * this.field6671;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6673 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6675 - arg1;
            return var12 * var12 + var13 * var13 < this.field6671 * this.field6671;
        }
    }
}
