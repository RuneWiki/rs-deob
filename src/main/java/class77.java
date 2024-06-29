import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class77 extends class123 {

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!co", name = "ja", descriptor = "(I)V")
    public final void method226(int arg0) {
        int var2 = class36.field478[arg0 & 0x3FFF];
        int var3 = class36.field443[arg0 & 0x3FFF];
        int var4 = this.field1001;
        int var5 = this.field1002;
        int var6 = this.field994;
        int var7 = this.field1003;
        this.field1001 = this.field997 * var3 + var2 * var4 >> 15;
        this.field997 = this.field997 * var2 - var3 * var4 >> 15;
        this.field1002 = this.field1005 * var3 + var2 * var5 >> 15;
        this.field1005 = this.field1005 * var2 - var3 * var5 >> 15;
        this.field994 = this.field999 * var3 + var2 * var6 >> 15;
        this.field999 = this.field999 * var2 - var3 * var6 >> 15;
        this.field1003 = this.field995 * var3 + var2 * var7 >> 15;
        this.field995 = this.field995 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!co", name = "j", descriptor = "(III)V")
    public final void method229(int arg0, int arg1, int arg2) {
        this.field996 = this.field997 = this.field1002 = this.field1005 = this.field994 = this.field1004 = 0;
        this.field1001 = this.field998 = this.field999 = 32768;
        this.field1003 = arg0;
        this.field1000 = arg1;
        this.field995 = arg2;
    }

    @OriginalMember(owner = "client!co", name = "ka", descriptor = "(I)V")
    public final void method234(int arg0) {
        int var2 = class36.field478[arg0 & 0x3FFF];
        int var3 = class36.field443[arg0 & 0x3FFF];
        int var4 = this.field996;
        int var5 = this.field998;
        int var6 = this.field1004;
        int var7 = this.field1000;
        this.field996 = var2 * var4 - this.field997 * var3 >> 15;
        this.field997 = this.field997 * var2 + var3 * var4 >> 15;
        this.field998 = var2 * var5 - this.field1005 * var3 >> 15;
        this.field1005 = this.field1005 * var2 + var3 * var5 >> 15;
        this.field1004 = var2 * var6 - this.field999 * var3 >> 15;
        this.field999 = this.field999 * var2 + var3 * var6 >> 15;
        this.field1000 = var2 * var7 - this.field995 * var3 >> 15;
        this.field995 = this.field995 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!co", name = "xa", descriptor = "()V")
    public final void method223() {
        this.field996 = this.field997 = this.field1002 = this.field1005 = this.field994 = this.field1004 = this.field1003 = this.field1000 = this.field995 = 0;
        this.field1001 = this.field998 = this.field999 = 32768;
    }

    @OriginalMember(owner = "client!co", name = "N", descriptor = "(I)V")
    public final void method232(int arg0) {
        this.field1001 = 32768;
        this.field998 = this.field999 = class36.field478[arg0 & 0x3FFF];
        this.field1005 = class36.field443[arg0 & 0x3FFF];
        this.field1004 = -this.field1005;
        this.field1002 = this.field994 = this.field1003 = this.field996 = this.field1000 = this.field997 = this.field995 = 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III[I)V")
    public final void method236(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field994 * arg2 + this.field1002 * arg1 + this.field1001 * arg0 >> 15) + this.field1003;
        arg3[1] = (this.field1004 * arg2 + this.field998 * arg1 + this.field996 * arg0 >> 15) + this.field1000;
        arg3[2] = (this.field999 * arg2 + this.field997 * arg0 + this.field1005 * arg1 >> 15) + this.field995;
    }

    @OriginalMember(owner = "client!co", name = "ra", descriptor = "(I)V")
    public final void method233(int arg0) {
        this.field998 = 32768;
        this.field1001 = this.field999 = class36.field478[arg0 & 0x3FFF];
        this.field994 = class36.field443[arg0 & 0x3FFF];
        this.field997 = -this.field994;
        this.field1002 = this.field1003 = this.field996 = this.field1004 = this.field1000 = this.field1005 = this.field995 = 0;
    }

    @OriginalMember(owner = "client!co", name = "za", descriptor = "(Lc;)V")
    public final void method237(class123 arg0) {
        class77 var2 = (class77) arg0;
        this.field1001 = var2.field1001;
        this.field1002 = var2.field1002;
        this.field994 = var2.field994;
        this.field1003 = var2.field1003;
        this.field996 = var2.field996;
        this.field998 = var2.field998;
        this.field1004 = var2.field1004;
        this.field1000 = var2.field1000;
        this.field997 = var2.field997;
        this.field1005 = var2.field1005;
        this.field999 = var2.field999;
        this.field995 = var2.field995;
    }

    @OriginalMember(owner = "client!co", name = "p", descriptor = "(III[I)V")
    public final void method228(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field994 * arg2 + this.field1002 * arg1 + this.field1001 * arg0 >> 15;
        arg3[1] = this.field1004 * arg2 + this.field998 * arg1 + this.field996 * arg0 >> 15;
        arg3[2] = this.field999 * arg2 + this.field997 * arg0 + this.field1005 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!co", name = "m", descriptor = "([I)V")
    public final void method238(int[] arg0) {
        int var2 = arg0[0] - this.field1003;
        int var3 = arg0[1] - this.field1000;
        int var4 = arg0[2] - this.field995;
        arg0[0] = this.field997 * var4 + this.field996 * var3 + this.field1001 * var2 >> 15;
        arg0[1] = this.field1005 * var4 + this.field998 * var3 + this.field1002 * var2 >> 15;
        arg0[2] = this.field999 * var4 + this.field994 * var2 + this.field1004 * var3 >> 15;
    }

    @OriginalMember(owner = "client!co", name = "o", descriptor = "(III)V")
    public final void method231(int arg0, int arg1, int arg2) {
        this.field1003 += arg0;
        this.field1000 += arg1;
        this.field995 += arg2;
    }

    @OriginalMember(owner = "client!co", name = "O", descriptor = "(I)V")
    public final void method225(int arg0) {
        this.field999 = 32768;
        this.field1001 = this.field998 = class36.field478[arg0 & 0x3FFF];
        this.field996 = class36.field443[arg0 & 0x3FFF];
        this.field1002 = -this.field996;
        this.field994 = this.field1003 = this.field1004 = this.field1000 = this.field997 = this.field1005 = this.field995 = 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "()Lc;")
    public final class123 method230() {
        class77 var1 = new class77();
        var1.field1001 = this.field1001;
        var1.field1002 = this.field1002;
        var1.field994 = this.field994;
        var1.field1003 = this.field1003;
        var1.field996 = this.field996;
        var1.field998 = this.field998;
        var1.field1004 = this.field1004;
        var1.field1000 = this.field1000;
        var1.field997 = this.field997;
        var1.field1005 = this.field1005;
        var1.field999 = this.field999;
        var1.field995 = this.field995;
        return var1;
    }

    @OriginalMember(owner = "client!co", name = "s", descriptor = "(IIIIII)V")
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class36.field478[arg3 & 0x3FFF];
        int var8 = class36.field443[arg3 & 0x3FFF];
        int var9 = class36.field478[arg4 & 0x3FFF];
        int var10 = class36.field443[arg4 & 0x3FFF];
        int var11 = class36.field478[arg5 & 0x3FFF];
        int var12 = class36.field443[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1001 = var9 * var11 + var10 * var14 >> 15;
        this.field996 = -var9 * var12 + var10 * var13 >> 15;
        this.field997 = var7 * var10 >> 15;
        this.field1002 = var7 * var12 >> 15;
        this.field998 = var7 * var11 >> 15;
        this.field1005 = -var8;
        this.field994 = -var10 * var11 + var9 * var14 >> 15;
        this.field1004 = var9 * var13 + var10 * var12 >> 15;
        this.field999 = var7 * var9 >> 15;
        this.field1003 = -arg0 * this.field1001 - this.field1002 * arg1 - this.field994 * arg2 >> 15;
        this.field1000 = -arg0 * this.field996 - this.field998 * arg1 - this.field1004 * arg2 >> 15;
        this.field995 = -arg0 * this.field997 - this.field1005 * arg1 - this.field999 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class77() {
        this.method223();
    }
}
