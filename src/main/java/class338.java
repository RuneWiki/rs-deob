import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class338 extends class14 {

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public int field5235;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public int field5236;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public int field5238;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public int field5242;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public int field5243;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public int field5245;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public int field5246;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "(III[I)V", line = 4)
    public final void method147(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field5241 * arg2 + this.field5245 * arg1 + this.field5242 * arg0 >> 15;
        arg3[1] = this.field5244 * arg2 + this.field5243 * arg1 + this.field5238 * arg0 >> 15;
        arg3[2] = this.field5246 * arg2 + this.field5240 * arg0 + this.field5237 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!ap", name = "ba", descriptor = "(I)V", line = 12)
    public final void method152(int arg0) {
        int var2 = class428.field6501[arg0 & 0x3FFF];
        int var3 = class428.field6502[arg0 & 0x3FFF];
        int var4 = this.field5238;
        int var5 = this.field5243;
        int var6 = this.field5244;
        int var7 = this.field5235;
        this.field5238 = var2 * var4 - this.field5240 * var3 >> 15;
        this.field5240 = this.field5240 * var2 + var3 * var4 >> 15;
        this.field5243 = var2 * var5 - this.field5237 * var3 >> 15;
        this.field5237 = this.field5237 * var2 + var3 * var5 >> 15;
        this.field5244 = var2 * var6 - this.field5246 * var3 >> 15;
        this.field5246 = this.field5246 * var2 + var3 * var6 >> 15;
        this.field5235 = var2 * var7 - this.field5236 * var3 >> 15;
        this.field5236 = this.field5236 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "([I)V", line = 35)
    public final void method149(int[] arg0) {
        int var2 = arg0[0] - this.field5239;
        int var3 = arg0[1] - this.field5235;
        int var4 = arg0[2] - this.field5236;
        arg0[0] = this.field5240 * var4 + this.field5242 * var2 + this.field5238 * var3 >> 15;
        arg0[1] = this.field5237 * var4 + this.field5245 * var2 + this.field5243 * var3 >> 15;
        arg0[2] = this.field5246 * var4 + this.field5244 * var3 + this.field5241 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ap", name = "CA", descriptor = "(I)V", line = 47)
    public final void method153(int arg0) {
        int var2 = class428.field6501[arg0 & 0x3FFF];
        int var3 = class428.field6502[arg0 & 0x3FFF];
        int var4 = this.field5242;
        int var5 = this.field5245;
        int var6 = this.field5241;
        int var7 = this.field5239;
        this.field5242 = this.field5240 * var3 + var2 * var4 >> 15;
        this.field5240 = this.field5240 * var2 - var3 * var4 >> 15;
        this.field5245 = this.field5237 * var3 + var2 * var5 >> 15;
        this.field5237 = this.field5237 * var2 - var3 * var5 >> 15;
        this.field5241 = this.field5246 * var3 + var2 * var6 >> 15;
        this.field5246 = this.field5246 * var2 - var3 * var6 >> 15;
        this.field5239 = this.field5236 * var3 + var2 * var7 >> 15;
        this.field5236 = this.field5236 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ap", name = "SA", descriptor = "(I)V", line = 68)
    public final void method145(int arg0) {
        this.field5242 = 32768;
        this.field5243 = this.field5246 = class428.field6501[arg0 & 0x3FFF];
        this.field5237 = class428.field6502[arg0 & 0x3FFF];
        this.field5244 = -this.field5237;
        this.field5245 = this.field5241 = this.field5239 = this.field5238 = this.field5235 = this.field5240 = this.field5236 = 0;
    }

    @OriginalMember(owner = "client!ap", name = "ya", descriptor = "(Ln;)V", line = 77)
    public final void method151(class14 arg0) {
        class338 var2 = (class338) arg0;
        this.field5242 = var2.field5242;
        this.field5245 = var2.field5245;
        this.field5241 = var2.field5241;
        this.field5239 = var2.field5239;
        this.field5238 = var2.field5238;
        this.field5243 = var2.field5243;
        this.field5244 = var2.field5244;
        this.field5235 = var2.field5235;
        this.field5240 = var2.field5240;
        this.field5237 = var2.field5237;
        this.field5246 = var2.field5246;
        this.field5236 = var2.field5236;
    }

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "(III)V", line = 92)
    public final void method146(int arg0, int arg1, int arg2) {
        this.field5239 += arg0;
        this.field5235 += arg1;
        this.field5236 += arg2;
    }

    @OriginalMember(owner = "client!ap", name = "WA", descriptor = "(I)V", line = 101)
    public final void method154(int arg0) {
        this.field5246 = 32768;
        this.field5242 = this.field5243 = class428.field6501[arg0 & 0x3FFF];
        this.field5238 = class428.field6502[arg0 & 0x3FFF];
        this.field5245 = -this.field5238;
        this.field5241 = this.field5239 = this.field5244 = this.field5235 = this.field5240 = this.field5237 = this.field5236 = 0;
    }

    @OriginalMember(owner = "client!ap", name = "IA", descriptor = "(IIIIII)V", line = 110)
    public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class428.field6501[arg3 & 0x3FFF];
        int var8 = class428.field6502[arg3 & 0x3FFF];
        int var9 = class428.field6501[arg4 & 0x3FFF];
        int var10 = class428.field6502[arg4 & 0x3FFF];
        int var11 = class428.field6501[arg5 & 0x3FFF];
        int var12 = class428.field6502[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5242 = var9 * var11 + var10 * var14 >> 15;
        this.field5238 = -var9 * var12 + var10 * var13 >> 15;
        this.field5240 = var7 * var10 >> 15;
        this.field5245 = var7 * var12 >> 15;
        this.field5243 = var7 * var11 >> 15;
        this.field5237 = -var8;
        this.field5241 = -var10 * var11 + var9 * var14 >> 15;
        this.field5244 = var9 * var13 + var10 * var12 >> 15;
        this.field5246 = var7 * var9 >> 15;
        this.field5239 = -arg0 * this.field5242 - this.field5245 * arg1 - this.field5241 * arg2 >> 15;
        this.field5235 = -arg0 * this.field5238 - this.field5243 * arg1 - this.field5244 * arg2 >> 15;
        this.field5236 = -arg0 * this.field5240 - this.field5237 * arg1 - this.field5246 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III[I)V", line = 141)
    public final void method142(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5241 * arg2 + this.field5245 * arg1 + this.field5242 * arg0 >> 15) + this.field5239;
        arg3[1] = (this.field5244 * arg2 + this.field5243 * arg1 + this.field5238 * arg0 >> 15) + this.field5235;
        arg3[2] = (this.field5246 * arg2 + this.field5240 * arg0 + this.field5237 * arg1 >> 15) + this.field5236;
    }

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "()V", line = 146)
    public final void method148() {
        this.field5238 = this.field5240 = this.field5245 = this.field5237 = this.field5241 = this.field5244 = this.field5239 = this.field5235 = this.field5236 = 0;
        this.field5242 = this.field5243 = this.field5246 = 32768;
    }

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "(I)V", line = 151)
    public final void method150(int arg0) {
        this.field5243 = 32768;
        this.field5242 = this.field5246 = class428.field6501[arg0 & 0x3FFF];
        this.field5241 = class428.field6502[arg0 & 0x3FFF];
        this.field5240 = -this.field5241;
        this.field5245 = this.field5239 = this.field5238 = this.field5244 = this.field5235 = this.field5237 = this.field5236 = 0;
    }

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "(III)V", line = 159)
    public final void method141(int arg0, int arg1, int arg2) {
        this.field5238 = this.field5240 = this.field5245 = this.field5237 = this.field5241 = this.field5244 = 0;
        this.field5242 = this.field5243 = this.field5246 = 32768;
        this.field5239 = arg0;
        this.field5235 = arg1;
        this.field5236 = arg2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()Ln;", line = 167)
    public final class14 method155() {
        class338 var1 = new class338();
        var1.field5242 = this.field5242;
        var1.field5245 = this.field5245;
        var1.field5241 = this.field5241;
        var1.field5239 = this.field5239;
        var1.field5238 = this.field5238;
        var1.field5243 = this.field5243;
        var1.field5244 = this.field5244;
        var1.field5235 = this.field5235;
        var1.field5240 = this.field5240;
        var1.field5237 = this.field5237;
        var1.field5246 = this.field5246;
        var1.field5236 = this.field5236;
        return var1;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 183)
    public class338() {
        this.method148();
    }
}
