import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class162 extends class282 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)V")
    public final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class53.field726[arg3 & 0x3FFF];
        int var8 = class53.field727[arg3 & 0x3FFF];
        int var9 = class53.field726[arg4 & 0x3FFF];
        int var10 = class53.field727[arg4 & 0x3FFF];
        int var11 = class53.field726[arg5 & 0x3FFF];
        int var12 = class53.field727[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field2405 = var9 * var11 + var10 * var14 >> 15;
        this.field2398 = -var9 * var12 + var10 * var13 >> 15;
        this.field2403 = var7 * var10 >> 15;
        this.field2401 = var7 * var12 >> 15;
        this.field2400 = var7 * var11 >> 15;
        this.field2396 = -var8;
        this.field2406 = -var10 * var11 + var9 * var14 >> 15;
        this.field2402 = var9 * var13 + var10 * var12 >> 15;
        this.field2404 = var7 * var9 >> 15;
        this.field2397 = -arg0 * this.field2405 - this.field2401 * arg1 - this.field2406 * arg2 >> 15;
        this.field2407 = -arg0 * this.field2398 - this.field2400 * arg1 - this.field2402 * arg2 >> 15;
        this.field2399 = -arg0 * this.field2403 - this.field2396 * arg1 - this.field2404 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()Ljl;")
    public final class162 method1009() {
        class162 var1 = new class162();
        var1.field2405 = this.field2405;
        var1.field2401 = this.field2401;
        var1.field2406 = this.field2406;
        var1.field2397 = this.field2397;
        var1.field2398 = this.field2398;
        var1.field2400 = this.field2400;
        var1.field2402 = this.field2402;
        var1.field2407 = this.field2407;
        var1.field2403 = this.field2403;
        var1.field2396 = this.field2396;
        var1.field2404 = this.field2404;
        var1.field2399 = this.field2399;
        return var1;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V")
    public final void method1010(int arg0) {
        this.field2404 = 32768;
        this.field2405 = this.field2400 = class53.field726[arg0 & 0x3FFF];
        this.field2398 = class53.field727[arg0 & 0x3FFF];
        this.field2401 = -this.field2398;
        this.field2406 = this.field2397 = this.field2402 = this.field2407 = this.field2403 = this.field2396 = this.field2399 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public final void method1011(int arg0) {
        this.field2400 = 32768;
        this.field2405 = this.field2404 = class53.field726[arg0 & 0x3FFF];
        this.field2406 = class53.field727[arg0 & 0x3FFF];
        this.field2403 = -this.field2406;
        this.field2401 = this.field2397 = this.field2398 = this.field2402 = this.field2407 = this.field2396 = this.field2399 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
    public final void method1012(int arg0, int arg1, int arg2) {
        this.field2397 += arg0;
        this.field2407 += arg1;
        this.field2399 += arg2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([I)V")
    public final void method1013(int[] arg0) {
        int var2 = arg0[0] - this.field2397;
        int var3 = arg0[1] - this.field2407;
        int var4 = arg0[2] - this.field2399;
        arg0[0] = this.field2403 * var4 + this.field2405 * var2 + this.field2398 * var3 >> 15;
        arg0[1] = this.field2396 * var4 + this.field2401 * var2 + this.field2400 * var3 >> 15;
        arg0[2] = this.field2404 * var4 + this.field2406 * var2 + this.field2402 * var3 >> 15;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Los;)V")
    public final void method1014(class282 arg0) {
        class162 var2 = (class162) arg0;
        this.field2405 = var2.field2405;
        this.field2401 = var2.field2401;
        this.field2406 = var2.field2406;
        this.field2397 = var2.field2397;
        this.field2398 = var2.field2398;
        this.field2400 = var2.field2400;
        this.field2402 = var2.field2402;
        this.field2407 = var2.field2407;
        this.field2403 = var2.field2403;
        this.field2396 = var2.field2396;
        this.field2404 = var2.field2404;
        this.field2399 = var2.field2399;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
    public final void method1015(int arg0) {
        this.field2405 = 32768;
        this.field2400 = this.field2404 = class53.field726[arg0 & 0x3FFF];
        this.field2396 = class53.field727[arg0 & 0x3FFF];
        this.field2402 = -this.field2396;
        this.field2401 = this.field2406 = this.field2397 = this.field2398 = this.field2407 = this.field2403 = this.field2399 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III[I)V")
    public final void method1016(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2406 * arg2 + this.field2405 * arg0 + this.field2401 * arg1 >> 15) + this.field2397;
        arg3[1] = (this.field2402 * arg2 + this.field2400 * arg1 + this.field2398 * arg0 >> 15) + this.field2407;
        arg3[2] = (this.field2404 * arg2 + this.field2403 * arg0 + this.field2396 * arg1 >> 15) + this.field2399;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
    public final void method1017() {
        this.field2398 = this.field2403 = this.field2401 = this.field2396 = this.field2406 = this.field2402 = this.field2397 = this.field2407 = this.field2399 = 0;
        this.field2405 = this.field2400 = this.field2404 = 32768;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public final void method1018(int arg0) {
        int var2 = class53.field726[arg0 & 0x3FFF];
        int var3 = class53.field727[arg0 & 0x3FFF];
        int var4 = this.field2398;
        int var5 = this.field2400;
        int var6 = this.field2402;
        int var7 = this.field2407;
        this.field2398 = var2 * var4 - this.field2403 * var3 >> 15;
        this.field2403 = this.field2403 * var2 + var3 * var4 >> 15;
        this.field2400 = var2 * var5 - this.field2396 * var3 >> 15;
        this.field2396 = this.field2396 * var2 + var3 * var5 >> 15;
        this.field2402 = var2 * var6 - this.field2404 * var3 >> 15;
        this.field2404 = this.field2404 * var2 + var3 * var6 >> 15;
        this.field2407 = var2 * var7 - this.field2399 * var3 >> 15;
        this.field2399 = this.field2399 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(III)V")
    public final void method1019(int arg0, int arg1, int arg2) {
        this.field2398 = this.field2403 = this.field2401 = this.field2396 = this.field2406 = this.field2402 = 0;
        this.field2405 = this.field2400 = this.field2404 = 32768;
        this.field2397 = arg0;
        this.field2407 = arg1;
        this.field2399 = arg2;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
    public final void method1020(int arg0) {
        int var2 = class53.field726[arg0 & 0x3FFF];
        int var3 = class53.field727[arg0 & 0x3FFF];
        int var4 = this.field2405;
        int var5 = this.field2401;
        int var6 = this.field2406;
        int var7 = this.field2397;
        this.field2405 = this.field2403 * var3 + var2 * var4 >> 15;
        this.field2403 = this.field2403 * var2 - var3 * var4 >> 15;
        this.field2401 = this.field2396 * var3 + var2 * var5 >> 15;
        this.field2396 = this.field2396 * var2 - var3 * var5 >> 15;
        this.field2406 = this.field2404 * var3 + var2 * var6 >> 15;
        this.field2404 = this.field2404 * var2 - var3 * var6 >> 15;
        this.field2397 = this.field2399 * var3 + var2 * var7 >> 15;
        this.field2399 = this.field2399 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class162() {
        this.method1017();
    }
}
