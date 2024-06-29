import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class367 extends class118 {

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field5408;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public int field5409;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public int field5410;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public int field5412;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public int field5413;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public int field5414;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public int field5415;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public int field5416;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public int field5418;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 4)
    public final void method273(int arg0) {
        this.field5414 = 32768;
        this.field5416 = this.field5417 = class240.field3365[arg0 & 0x3FFF];
        this.field5411 = class240.field3364[arg0 & 0x3FFF];
        this.field5415 = -this.field5411;
        this.field5413 = this.field5407 = this.field5409 = this.field5412 = this.field5410 = this.field5408 = this.field5418 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lug;)V", line = 13)
    public final void method269(class118 arg0) {
        class367 var2 = (class367) arg0;
        this.field5416 = var2.field5416;
        this.field5413 = var2.field5413;
        this.field5411 = var2.field5411;
        this.field5407 = var2.field5407;
        this.field5409 = var2.field5409;
        this.field5414 = var2.field5414;
        this.field5412 = var2.field5412;
        this.field5410 = var2.field5410;
        this.field5415 = var2.field5415;
        this.field5408 = var2.field5408;
        this.field5417 = var2.field5417;
        this.field5418 = var2.field5418;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V", line = 29)
    public final void method277(int arg0) {
        int var2 = class240.field3365[arg0 & 0x3FFF];
        int var3 = class240.field3364[arg0 & 0x3FFF];
        int var4 = this.field5416;
        int var5 = this.field5413;
        int var6 = this.field5411;
        int var7 = this.field5407;
        this.field5416 = this.field5415 * var3 + var2 * var4 >> 15;
        this.field5415 = this.field5415 * var2 - var3 * var4 >> 15;
        this.field5413 = this.field5408 * var3 + var2 * var5 >> 15;
        this.field5408 = this.field5408 * var2 - var3 * var5 >> 15;
        this.field5411 = this.field5417 * var3 + var2 * var6 >> 15;
        this.field5417 = this.field5417 * var2 - var3 * var6 >> 15;
        this.field5407 = this.field5418 * var3 + var2 * var7 >> 15;
        this.field5418 = this.field5418 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V", line = 51)
    public final void method271(int arg0, int arg1, int arg2) {
        this.field5407 += arg0;
        this.field5410 += arg1;
        this.field5418 += arg2;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V", line = 58)
    public final void method268(int arg0) {
        int var2 = class240.field3365[arg0 & 0x3FFF];
        int var3 = class240.field3364[arg0 & 0x3FFF];
        int var4 = this.field5409;
        int var5 = this.field5414;
        int var6 = this.field5412;
        int var7 = this.field5410;
        this.field5409 = var2 * var4 - this.field5415 * var3 >> 15;
        this.field5415 = this.field5415 * var2 + var3 * var4 >> 15;
        this.field5414 = var2 * var5 - this.field5408 * var3 >> 15;
        this.field5408 = this.field5408 * var2 + var3 * var5 >> 15;
        this.field5412 = var2 * var6 - this.field5417 * var3 >> 15;
        this.field5417 = this.field5417 * var2 + var3 * var6 >> 15;
        this.field5410 = var2 * var7 - this.field5418 * var3 >> 15;
        this.field5418 = this.field5418 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lei;", line = 80)
    public final class367 method2417() {
        class367 var1 = new class367();
        var1.field5416 = this.field5416;
        var1.field5413 = this.field5413;
        var1.field5411 = this.field5411;
        var1.field5407 = this.field5407;
        var1.field5409 = this.field5409;
        var1.field5414 = this.field5414;
        var1.field5412 = this.field5412;
        var1.field5410 = this.field5410;
        var1.field5415 = this.field5415;
        var1.field5408 = this.field5408;
        var1.field5417 = this.field5417;
        var1.field5418 = this.field5418;
        return var1;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V", line = 97)
    public final void method272(int arg0) {
        this.field5417 = 32768;
        this.field5416 = this.field5414 = class240.field3365[arg0 & 0x3FFF];
        this.field5409 = class240.field3364[arg0 & 0x3FFF];
        this.field5413 = -this.field5409;
        this.field5411 = this.field5407 = this.field5412 = this.field5410 = this.field5415 = this.field5408 = this.field5418 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[I)V", line = 105)
    public final void method278(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5411 * arg2 + this.field5416 * arg0 + this.field5413 * arg1 >> 15) + this.field5407;
        arg3[1] = (this.field5412 * arg2 + this.field5414 * arg1 + this.field5409 * arg0 >> 15) + this.field5410;
        arg3[2] = (this.field5417 * arg2 + this.field5415 * arg0 + this.field5408 * arg1 >> 15) + this.field5418;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 114)
    public final void method270(int arg0) {
        this.field5416 = 32768;
        this.field5414 = this.field5417 = class240.field3365[arg0 & 0x3FFF];
        this.field5408 = class240.field3364[arg0 & 0x3FFF];
        this.field5412 = -this.field5408;
        this.field5413 = this.field5411 = this.field5407 = this.field5409 = this.field5410 = this.field5415 = this.field5418 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V", line = 121)
    public final void method264() {
        this.field5409 = this.field5415 = this.field5413 = this.field5408 = this.field5411 = this.field5412 = this.field5407 = this.field5410 = this.field5418 = 0;
        this.field5416 = this.field5414 = this.field5417 = 32768;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V", line = 127)
    public final void method274(int arg0, int arg1, int arg2) {
        this.field5409 = this.field5415 = this.field5413 = this.field5408 = this.field5411 = this.field5412 = 0;
        this.field5416 = this.field5414 = this.field5417 = 32768;
        this.field5407 = arg0;
        this.field5410 = arg1;
        this.field5418 = arg2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([I)V", line = 137)
    public final void method267(int[] arg0) {
        int var2 = arg0[0] - this.field5407;
        int var3 = arg0[1] - this.field5410;
        int var4 = arg0[2] - this.field5418;
        arg0[0] = this.field5415 * var4 + this.field5416 * var2 + this.field5409 * var3 >> 15;
        arg0[1] = this.field5408 * var4 + this.field5414 * var3 + this.field5413 * var2 >> 15;
        arg0[2] = this.field5417 * var4 + this.field5412 * var3 + this.field5411 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V", line = 148)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class240.field3365[arg3 & 0x3FFF];
        int var8 = class240.field3364[arg3 & 0x3FFF];
        int var9 = class240.field3365[arg4 & 0x3FFF];
        int var10 = class240.field3364[arg4 & 0x3FFF];
        int var11 = class240.field3365[arg5 & 0x3FFF];
        int var12 = class240.field3364[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5416 = var9 * var11 + var10 * var14 >> 15;
        this.field5409 = -var9 * var12 + var10 * var13 >> 15;
        this.field5415 = var7 * var10 >> 15;
        this.field5413 = var7 * var12 >> 15;
        this.field5414 = var7 * var11 >> 15;
        this.field5408 = -var8;
        this.field5411 = -var10 * var11 + var9 * var14 >> 15;
        this.field5412 = var9 * var13 + var10 * var12 >> 15;
        this.field5417 = var7 * var9 >> 15;
        this.field5407 = -arg0 * this.field5416 - this.field5413 * arg1 - this.field5411 * arg2 >> 15;
        this.field5410 = -arg0 * this.field5409 - this.field5414 * arg1 - this.field5412 * arg2 >> 15;
        this.field5418 = -arg0 * this.field5415 - this.field5408 * arg1 - this.field5417 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 177)
    public class367() {
        this.method264();
    }
}
