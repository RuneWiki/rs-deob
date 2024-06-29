import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class373 extends class113 {

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Z")
    public boolean field5409 = false;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public int field5408;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public int field5410;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public int field5412;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
    public final boolean method2323(int arg0, int arg1) {
        if (!this.field5409) {
            return false;
        }
        int var3 = this.field5408 - this.field5407;
        int var4 = this.field5411 - this.field5410;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5410 * var4 + this.field5407 * var3);
        if (var6 <= 0) {
            int var7 = this.field5407 - arg0;
            int var8 = this.field5410 - arg1;
            return var7 * var7 + var8 * var8 < this.field5412 * this.field5412;
        } else if (var6 > var5) {
            int var9 = this.field5408 - arg0;
            int var10 = this.field5411 - arg1;
            return var9 * var9 + var10 * var10 < this.field5412 * this.field5412;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5407 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5410 - arg1;
            return var12 * var12 + var13 * var13 < this.field5412 * this.field5412;
        }
    }
}
