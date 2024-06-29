import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class114 extends class327 {

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIII)V", line = 6)
    public final void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class16.field214[arg3 & 0x3FFF];
        int var8 = class16.field212[arg3 & 0x3FFF];
        int var9 = class16.field214[arg4 & 0x3FFF];
        int var10 = class16.field212[arg4 & 0x3FFF];
        int var11 = class16.field214[arg5 & 0x3FFF];
        int var12 = class16.field212[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1402 = var9 * var11 + var10 * var14 >> 15;
        this.field1408 = -var9 * var12 + var10 * var13 >> 15;
        this.field1404 = var7 * var10 >> 15;
        this.field1405 = var7 * var12 >> 15;
        this.field1403 = var7 * var11 >> 15;
        this.field1409 = -var8;
        this.field1407 = -var10 * var11 + var9 * var14 >> 15;
        this.field1401 = var9 * var13 + var10 * var12 >> 15;
        this.field1406 = var7 * var9 >> 15;
        this.field1398 = -arg0 * this.field1402 - this.field1405 * arg1 - this.field1407 * arg2 >> 15;
        this.field1399 = -arg0 * this.field1408 - this.field1403 * arg1 - this.field1401 * arg2 >> 15;
        this.field1400 = -arg0 * this.field1404 - this.field1409 * arg1 - this.field1406 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V", line = 36)
    public final void method550(int arg0, int arg1, int arg2) {
        this.field1398 += arg0;
        this.field1399 += arg1;
        this.field1400 += arg2;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([I)V", line = 42)
    public final void method551(int[] arg0) {
        int var2 = arg0[0] - this.field1398;
        int var3 = arg0[1] - this.field1399;
        int var4 = arg0[2] - this.field1400;
        arg0[0] = this.field1404 * var4 + this.field1408 * var3 + this.field1402 * var2 >> 15;
        arg0[1] = this.field1409 * var4 + this.field1405 * var2 + this.field1403 * var3 >> 15;
        arg0[2] = this.field1406 * var4 + this.field1407 * var2 + this.field1401 * var3 >> 15;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 53)
    public final void method552(int arg0) {
        int var2 = class16.field214[arg0 & 0x3FFF];
        int var3 = class16.field212[arg0 & 0x3FFF];
        int var4 = this.field1408;
        int var5 = this.field1403;
        int var6 = this.field1401;
        int var7 = this.field1399;
        this.field1408 = var2 * var4 - this.field1404 * var3 >> 15;
        this.field1404 = this.field1404 * var2 + var3 * var4 >> 15;
        this.field1403 = var2 * var5 - this.field1409 * var3 >> 15;
        this.field1409 = this.field1409 * var2 + var3 * var5 >> 15;
        this.field1401 = var2 * var6 - this.field1406 * var3 >> 15;
        this.field1406 = this.field1406 * var2 + var3 * var6 >> 15;
        this.field1399 = var2 * var7 - this.field1400 * var3 >> 15;
        this.field1400 = this.field1400 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)V", line = 76)
    public final void method553(int arg0, int arg1, int arg2) {
        this.field1408 = this.field1404 = this.field1405 = this.field1409 = this.field1407 = this.field1401 = 0;
        this.field1402 = this.field1403 = this.field1406 = 32768;
        this.field1398 = arg0;
        this.field1399 = arg1;
        this.field1400 = arg2;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V", line = 84)
    public final void method554(int arg0) {
        int var2 = class16.field214[arg0 & 0x3FFF];
        int var3 = class16.field212[arg0 & 0x3FFF];
        int var4 = this.field1402;
        int var5 = this.field1405;
        int var6 = this.field1407;
        int var7 = this.field1398;
        this.field1402 = this.field1404 * var3 + var2 * var4 >> 15;
        this.field1404 = this.field1404 * var2 - var3 * var4 >> 15;
        this.field1405 = this.field1409 * var3 + var2 * var5 >> 15;
        this.field1409 = this.field1409 * var2 - var3 * var5 >> 15;
        this.field1407 = this.field1406 * var3 + var2 * var6 >> 15;
        this.field1406 = this.field1406 * var2 - var3 * var6 >> 15;
        this.field1398 = this.field1400 * var3 + var2 * var7 >> 15;
        this.field1400 = this.field1400 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V", line = 105)
    public final void method555(int arg0) {
        this.field1406 = 32768;
        this.field1402 = this.field1403 = class16.field214[arg0 & 0x3FFF];
        this.field1408 = class16.field212[arg0 & 0x3FFF];
        this.field1405 = -this.field1408;
        this.field1407 = this.field1398 = this.field1401 = this.field1399 = this.field1404 = this.field1409 = this.field1400 = 0;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()Llr;", line = 113)
    public final class114 method556() {
        class114 var1 = new class114();
        var1.field1402 = this.field1402;
        var1.field1405 = this.field1405;
        var1.field1407 = this.field1407;
        var1.field1398 = this.field1398;
        var1.field1408 = this.field1408;
        var1.field1403 = this.field1403;
        var1.field1401 = this.field1401;
        var1.field1399 = this.field1399;
        var1.field1404 = this.field1404;
        var1.field1409 = this.field1409;
        var1.field1406 = this.field1406;
        var1.field1400 = this.field1400;
        return var1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III[I)V", line = 134)
    public final void method557(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1407 * arg2 + this.field1405 * arg1 + this.field1402 * arg0 >> 15) + this.field1398;
        arg3[1] = (this.field1401 * arg2 + this.field1408 * arg0 + this.field1403 * arg1 >> 15) + this.field1399;
        arg3[2] = (this.field1406 * arg2 + this.field1409 * arg1 + this.field1404 * arg0 >> 15) + this.field1400;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V", line = 139)
    public final void method558(int arg0) {
        this.field1403 = 32768;
        this.field1402 = this.field1406 = class16.field214[arg0 & 0x3FFF];
        this.field1407 = class16.field212[arg0 & 0x3FFF];
        this.field1404 = -this.field1407;
        this.field1405 = this.field1398 = this.field1408 = this.field1401 = this.field1399 = this.field1409 = this.field1400 = 0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lbd;)V", line = 150)
    public final void method559(class327 arg0) {
        class114 var2 = (class114) arg0;
        this.field1402 = var2.field1402;
        this.field1405 = var2.field1405;
        this.field1407 = var2.field1407;
        this.field1398 = var2.field1398;
        this.field1408 = var2.field1408;
        this.field1403 = var2.field1403;
        this.field1401 = var2.field1401;
        this.field1399 = var2.field1399;
        this.field1404 = var2.field1404;
        this.field1409 = var2.field1409;
        this.field1406 = var2.field1406;
        this.field1400 = var2.field1400;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V", line = 166)
    public final void method560(int arg0) {
        this.field1402 = 32768;
        this.field1403 = this.field1406 = class16.field214[arg0 & 0x3FFF];
        this.field1409 = class16.field212[arg0 & 0x3FFF];
        this.field1401 = -this.field1409;
        this.field1405 = this.field1407 = this.field1398 = this.field1408 = this.field1399 = this.field1404 = this.field1400 = 0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()V", line = 173)
    public final void method561() {
        this.field1408 = this.field1404 = this.field1405 = this.field1409 = this.field1407 = this.field1401 = this.field1398 = this.field1399 = this.field1400 = 0;
        this.field1402 = this.field1403 = this.field1406 = 32768;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 177)
    public class114() {
        this.method561();
    }
}
