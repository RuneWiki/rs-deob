import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class457 extends class125 {

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public int field6405;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public int field6406;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public int field6407;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public int field6408;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field6409;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field6410;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field6411;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public int field6412;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public int field6413;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public int field6414;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public int field6415;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public int field6416;

    @OriginalMember(owner = "client!gj", name = "ha", descriptor = "(Lc;)V", line = 4)
    public final void method828(class125 arg0) {
        class457 var2 = (class457) arg0;
        this.field6407 = var2.field6407;
        this.field6412 = var2.field6412;
        this.field6411 = var2.field6411;
        this.field6415 = var2.field6415;
        this.field6413 = var2.field6413;
        this.field6416 = var2.field6416;
        this.field6414 = var2.field6414;
        this.field6406 = var2.field6406;
        this.field6405 = var2.field6405;
        this.field6410 = var2.field6410;
        this.field6408 = var2.field6408;
        this.field6409 = var2.field6409;
    }

    @OriginalMember(owner = "client!gj", name = "ea", descriptor = "(I)V", line = 21)
    public final void method832(int arg0) {
        int var2 = class95.field1241[arg0 & 0x3FFF];
        int var3 = class95.field1242[arg0 & 0x3FFF];
        int var4 = this.field6413;
        int var5 = this.field6416;
        int var6 = this.field6414;
        int var7 = this.field6406;
        this.field6413 = var2 * var4 - this.field6405 * var3 >> 15;
        this.field6405 = this.field6405 * var2 + var3 * var4 >> 15;
        this.field6416 = var2 * var5 - this.field6410 * var3 >> 15;
        this.field6410 = this.field6410 * var2 + var3 * var5 >> 15;
        this.field6414 = var2 * var6 - this.field6408 * var3 >> 15;
        this.field6408 = this.field6408 * var2 + var3 * var6 >> 15;
        this.field6406 = var2 * var7 - this.field6409 * var3 >> 15;
        this.field6409 = this.field6409 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lc;", line = 46)
    public final class125 method827() {
        class457 var1 = new class457();
        var1.field6407 = this.field6407;
        var1.field6412 = this.field6412;
        var1.field6411 = this.field6411;
        var1.field6415 = this.field6415;
        var1.field6413 = this.field6413;
        var1.field6416 = this.field6416;
        var1.field6414 = this.field6414;
        var1.field6406 = this.field6406;
        var1.field6405 = this.field6405;
        var1.field6410 = this.field6410;
        var1.field6408 = this.field6408;
        var1.field6409 = this.field6409;
        return var1;
    }

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "(III)V", line = 62)
    public final void method824(int arg0, int arg1, int arg2) {
        this.field6415 += arg0;
        this.field6406 += arg1;
        this.field6409 += arg2;
    }

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "(III[I)V", line = 69)
    public final void method818(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field6411 * arg2 + this.field6412 * arg1 + this.field6407 * arg0 >> 15;
        arg3[1] = this.field6414 * arg2 + this.field6416 * arg1 + this.field6413 * arg0 >> 15;
        arg3[2] = this.field6408 * arg2 + this.field6410 * arg1 + this.field6405 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "(I)V", line = 75)
    public final void method821(int arg0) {
        this.field6408 = 32768;
        this.field6407 = this.field6416 = class95.field1241[arg0 & 0x3FFF];
        this.field6413 = class95.field1242[arg0 & 0x3FFF];
        this.field6412 = -this.field6413;
        this.field6411 = this.field6415 = this.field6414 = this.field6406 = this.field6405 = this.field6410 = this.field6409 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "()V", line = 82)
    public final void method826() {
        this.field6413 = this.field6405 = this.field6412 = this.field6410 = this.field6411 = this.field6414 = this.field6415 = this.field6406 = this.field6409 = 0;
        this.field6407 = this.field6416 = this.field6408 = 32768;
    }

    @OriginalMember(owner = "client!gj", name = "EA", descriptor = "(I)V", line = 87)
    public final void method823(int arg0) {
        int var2 = class95.field1241[arg0 & 0x3FFF];
        int var3 = class95.field1242[arg0 & 0x3FFF];
        int var4 = this.field6407;
        int var5 = this.field6412;
        int var6 = this.field6411;
        int var7 = this.field6415;
        this.field6407 = this.field6405 * var3 + var2 * var4 >> 15;
        this.field6405 = this.field6405 * var2 - var3 * var4 >> 15;
        this.field6412 = this.field6410 * var3 + var2 * var5 >> 15;
        this.field6410 = this.field6410 * var2 - var3 * var5 >> 15;
        this.field6411 = this.field6408 * var3 + var2 * var6 >> 15;
        this.field6408 = this.field6408 * var2 - var3 * var6 >> 15;
        this.field6415 = this.field6409 * var3 + var2 * var7 >> 15;
        this.field6409 = this.field6409 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "(III)V", line = 110)
    public final void method825(int arg0, int arg1, int arg2) {
        this.field6413 = this.field6405 = this.field6412 = this.field6410 = this.field6411 = this.field6414 = 0;
        this.field6407 = this.field6416 = this.field6408 = 32768;
        this.field6415 = arg0;
        this.field6406 = arg1;
        this.field6409 = arg2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I)V", line = 119)
    public final void method819(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field6411 * arg2 + this.field6412 * arg1 + this.field6407 * arg0 >> 15) + this.field6415;
        arg3[1] = (this.field6414 * arg2 + this.field6416 * arg1 + this.field6413 * arg0 >> 15) + this.field6406;
        arg3[2] = (this.field6408 * arg2 + this.field6410 * arg1 + this.field6405 * arg0 >> 15) + this.field6409;
    }

    @OriginalMember(owner = "client!gj", name = "wa", descriptor = "([I)V", line = 126)
    public final void method820(int[] arg0) {
        int var2 = arg0[0] - this.field6415;
        int var3 = arg0[1] - this.field6406;
        int var4 = arg0[2] - this.field6409;
        arg0[0] = this.field6405 * var4 + this.field6413 * var3 + this.field6407 * var2 >> 15;
        arg0[1] = this.field6410 * var4 + this.field6416 * var3 + this.field6412 * var2 >> 15;
        arg0[2] = this.field6408 * var4 + this.field6414 * var3 + this.field6411 * var2 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "YA", descriptor = "(IIIIII)V", line = 138)
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class95.field1241[arg3 & 0x3FFF];
        int var8 = class95.field1242[arg3 & 0x3FFF];
        int var9 = class95.field1241[arg4 & 0x3FFF];
        int var10 = class95.field1242[arg4 & 0x3FFF];
        int var11 = class95.field1241[arg5 & 0x3FFF];
        int var12 = class95.field1242[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field6407 = var9 * var11 + var10 * var14 >> 15;
        this.field6413 = -var9 * var12 + var10 * var13 >> 15;
        this.field6405 = var7 * var10 >> 15;
        this.field6412 = var7 * var12 >> 15;
        this.field6416 = var7 * var11 >> 15;
        this.field6410 = -var8;
        this.field6411 = -var10 * var11 + var9 * var14 >> 15;
        this.field6414 = var9 * var13 + var10 * var12 >> 15;
        this.field6408 = var7 * var9 >> 15;
        this.field6415 = -arg0 * this.field6407 - this.field6412 * arg1 - this.field6411 * arg2 >> 15;
        this.field6406 = -arg0 * this.field6413 - this.field6416 * arg1 - this.field6414 * arg2 >> 15;
        this.field6409 = -arg0 * this.field6405 - this.field6410 * arg1 - this.field6408 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V", line = 167)
    public final void method831(int arg0) {
        this.field6407 = 32768;
        this.field6416 = this.field6408 = class95.field1241[arg0 & 0x3FFF];
        this.field6410 = class95.field1242[arg0 & 0x3FFF];
        this.field6414 = -this.field6410;
        this.field6412 = this.field6411 = this.field6415 = this.field6413 = this.field6406 = this.field6405 = this.field6409 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "ca", descriptor = "(I)V", line = 175)
    public final void method830(int arg0) {
        this.field6416 = 32768;
        this.field6407 = this.field6408 = class95.field1241[arg0 & 0x3FFF];
        this.field6411 = class95.field1242[arg0 & 0x3FFF];
        this.field6405 = -this.field6411;
        this.field6412 = this.field6415 = this.field6413 = this.field6414 = this.field6406 = this.field6410 = this.field6409 = 0;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 183)
    public class457() {
        this.method826();
    }
}
