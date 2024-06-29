import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class299 extends class236 {

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Z")
    public boolean field4346 = false;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field4348;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method1809(int arg0, int arg1) {
        if (!this.field4346) {
            return false;
        }
        int var3 = this.field4349 - this.field4344;
        int var4 = this.field4348 - this.field4345;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4345 * var4 + this.field4344 * var3);
        if (var6 <= 0) {
            int var7 = this.field4344 - arg0;
            int var8 = this.field4345 - arg1;
            return var7 * var7 + var8 * var8 < this.field4347 * this.field4347;
        } else if (var6 > var5) {
            int var9 = this.field4349 - arg0;
            int var10 = this.field4348 - arg1;
            return var9 * var9 + var10 * var10 < this.field4347 * this.field4347;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4344 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4345 - arg1;
            return var12 * var12 + var13 * var13 < this.field4347 * this.field4347;
        }
    }
}
