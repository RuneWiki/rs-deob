import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class26 extends class205 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "(III[I)V")
    public final void method153(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field280 * arg2 + this.field289 * arg1 + this.field282 * arg0 >> 15;
        arg3[1] = this.field285 * arg2 + this.field288 * arg1 + this.field284 * arg0 >> 15;
        arg3[2] = this.field290 * arg2 + this.field286 * arg1 + this.field283 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III[I)V")
    public final void method154(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field280 * arg2 + this.field289 * arg1 + this.field282 * arg0 >> 15) + this.field281;
        arg3[1] = (this.field285 * arg2 + this.field288 * arg1 + this.field284 * arg0 >> 15) + this.field291;
        arg3[2] = (this.field290 * arg2 + this.field286 * arg1 + this.field283 * arg0 >> 15) + this.field287;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public final void method155(int arg0) {
        this.field282 = 32768;
        this.field288 = this.field290 = class147.field1986[arg0 & 0x3FFF];
        this.field286 = class147.field1988[arg0 & 0x3FFF];
        this.field285 = -this.field286;
        this.field289 = this.field280 = this.field281 = this.field284 = this.field291 = this.field283 = this.field287 = 0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()Lc;")
    public final class205 method156() {
        class26 var1 = new class26();
        var1.field282 = this.field282;
        var1.field289 = this.field289;
        var1.field280 = this.field280;
        var1.field281 = this.field281;
        var1.field284 = this.field284;
        var1.field288 = this.field288;
        var1.field285 = this.field285;
        var1.field291 = this.field291;
        var1.field283 = this.field283;
        var1.field286 = this.field286;
        var1.field290 = this.field290;
        var1.field287 = this.field287;
        return var1;
    }

    @OriginalMember(owner = "client!af", name = "ha", descriptor = "(Lc;)V")
    public final void method157(class205 arg0) {
        class26 var2 = (class26) arg0;
        this.field282 = var2.field282;
        this.field289 = var2.field289;
        this.field280 = var2.field280;
        this.field281 = var2.field281;
        this.field284 = var2.field284;
        this.field288 = var2.field288;
        this.field285 = var2.field285;
        this.field291 = var2.field291;
        this.field283 = var2.field283;
        this.field286 = var2.field286;
        this.field290 = var2.field290;
        this.field287 = var2.field287;
    }

    @OriginalMember(owner = "client!af", name = "U", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        this.field284 = this.field283 = this.field289 = this.field286 = this.field280 = this.field285 = 0;
        this.field282 = this.field288 = this.field290 = 32768;
        this.field281 = arg0;
        this.field291 = arg1;
        this.field287 = arg2;
    }

    @OriginalMember(owner = "client!af", name = "wa", descriptor = "([I)V")
    public final void method159(int[] arg0) {
        int var2 = arg0[0] - this.field281;
        int var3 = arg0[1] - this.field291;
        int var4 = arg0[2] - this.field287;
        arg0[0] = this.field283 * var4 + this.field284 * var3 + this.field282 * var2 >> 15;
        arg0[1] = this.field286 * var4 + this.field289 * var2 + this.field288 * var3 >> 15;
        arg0[2] = this.field290 * var4 + this.field285 * var3 + this.field280 * var2 >> 15;
    }

    @OriginalMember(owner = "client!af", name = "EA", descriptor = "(I)V")
    public final void method160(int arg0) {
        int var2 = class147.field1986[arg0 & 0x3FFF];
        int var3 = class147.field1988[arg0 & 0x3FFF];
        int var4 = this.field282;
        int var5 = this.field289;
        int var6 = this.field280;
        int var7 = this.field281;
        this.field282 = this.field283 * var3 + var2 * var4 >> 15;
        this.field283 = this.field283 * var2 - var3 * var4 >> 15;
        this.field289 = this.field286 * var3 + var2 * var5 >> 15;
        this.field286 = this.field286 * var2 - var3 * var5 >> 15;
        this.field280 = this.field290 * var3 + var2 * var6 >> 15;
        this.field290 = this.field290 * var2 - var3 * var6 >> 15;
        this.field281 = this.field287 * var3 + var2 * var7 >> 15;
        this.field287 = this.field287 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!af", name = "v", descriptor = "()V")
    public final void method161() {
        this.field284 = this.field283 = this.field289 = this.field286 = this.field280 = this.field285 = this.field281 = this.field291 = this.field287 = 0;
        this.field282 = this.field288 = this.field290 = 32768;
    }

    @OriginalMember(owner = "client!af", name = "A", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field290 = 32768;
        this.field282 = this.field288 = class147.field1986[arg0 & 0x3FFF];
        this.field284 = class147.field1988[arg0 & 0x3FFF];
        this.field289 = -this.field284;
        this.field280 = this.field281 = this.field285 = this.field291 = this.field283 = this.field286 = this.field287 = 0;
    }

    @OriginalMember(owner = "client!af", name = "W", descriptor = "(III)V")
    public final void method163(int arg0, int arg1, int arg2) {
        this.field281 += arg0;
        this.field291 += arg1;
        this.field287 += arg2;
    }

    @OriginalMember(owner = "client!af", name = "ca", descriptor = "(I)V")
    public final void method164(int arg0) {
        this.field288 = 32768;
        this.field282 = this.field290 = class147.field1986[arg0 & 0x3FFF];
        this.field280 = class147.field1988[arg0 & 0x3FFF];
        this.field283 = -this.field280;
        this.field289 = this.field281 = this.field284 = this.field285 = this.field291 = this.field286 = this.field287 = 0;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class26() {
        this.method161();
    }

    @OriginalMember(owner = "client!af", name = "YA", descriptor = "(IIIIII)V")
    public final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class147.field1986[arg3 & 0x3FFF];
        int var8 = class147.field1988[arg3 & 0x3FFF];
        int var9 = class147.field1986[arg4 & 0x3FFF];
        int var10 = class147.field1988[arg4 & 0x3FFF];
        int var11 = class147.field1986[arg5 & 0x3FFF];
        int var12 = class147.field1988[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field282 = var9 * var11 + var10 * var14 >> 15;
        this.field284 = -var9 * var12 + var10 * var13 >> 15;
        this.field283 = var7 * var10 >> 15;
        this.field289 = var7 * var12 >> 15;
        this.field288 = var7 * var11 >> 15;
        this.field286 = -var8;
        this.field280 = -var10 * var11 + var9 * var14 >> 15;
        this.field285 = var9 * var13 + var10 * var12 >> 15;
        this.field290 = var7 * var9 >> 15;
        this.field281 = -arg0 * this.field282 - this.field289 * arg1 - this.field280 * arg2 >> 15;
        this.field291 = -arg0 * this.field284 - this.field288 * arg1 - this.field285 * arg2 >> 15;
        this.field287 = -arg0 * this.field283 - this.field286 * arg1 - this.field290 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!af", name = "ea", descriptor = "(I)V")
    public final void method166(int arg0) {
        int var2 = class147.field1986[arg0 & 0x3FFF];
        int var3 = class147.field1988[arg0 & 0x3FFF];
        int var4 = this.field284;
        int var5 = this.field288;
        int var6 = this.field285;
        int var7 = this.field291;
        this.field284 = var2 * var4 - this.field283 * var3 >> 15;
        this.field283 = this.field283 * var2 + var3 * var4 >> 15;
        this.field288 = var2 * var5 - this.field286 * var3 >> 15;
        this.field286 = this.field286 * var2 + var3 * var5 >> 15;
        this.field285 = var2 * var6 - this.field290 * var3 >> 15;
        this.field290 = this.field290 * var2 + var3 * var6 >> 15;
        this.field291 = var2 * var7 - this.field287 * var3 >> 15;
        this.field287 = this.field287 * var2 + var3 * var7 >> 15;
    }
}
