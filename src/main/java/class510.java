import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class510 extends class414 {

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public int field7437;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public int field7438;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public int field7440;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public int field7441;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public int field7442;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public int field7443;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public int field7444;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public int field7445;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public int field7446;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public int field7447;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public int field7448;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[I)V")
    public final void method908(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field7448 * arg2 + this.field7446 * arg0 + this.field7440 * arg1 >> 15) + this.field7442;
        arg3[1] = (this.field7437 * arg2 + this.field7447 * arg0 + this.field7445 * arg1 >> 15) + this.field7438;
        arg3[2] = (this.field7441 * arg2 + this.field7444 * arg1 + this.field7439 * arg0 >> 15) + this.field7443;
    }

    @OriginalMember(owner = "client!cm", name = "YA", descriptor = "(I)V")
    public final void method907(int arg0) {
        this.field7446 = 32768;
        this.field7445 = this.field7441 = class457.field6759[arg0 & 0x3FFF];
        this.field7444 = class457.field6760[arg0 & 0x3FFF];
        this.field7437 = -this.field7444;
        this.field7440 = this.field7448 = this.field7442 = this.field7447 = this.field7438 = this.field7439 = this.field7443 = 0;
    }

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "(I)V")
    public final void method914(int arg0) {
        this.field7445 = 32768;
        this.field7446 = this.field7441 = class457.field6759[arg0 & 0x3FFF];
        this.field7448 = class457.field6760[arg0 & 0x3FFF];
        this.field7439 = -this.field7448;
        this.field7440 = this.field7442 = this.field7447 = this.field7437 = this.field7438 = this.field7444 = this.field7443 = 0;
    }

    @OriginalMember(owner = "client!cm", name = "ZA", descriptor = "(III)V")
    public final void method901(int arg0, int arg1, int arg2) {
        this.field7442 += arg0;
        this.field7438 += arg1;
        this.field7443 += arg2;
    }

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "(III)V")
    public final void method913(int arg0, int arg1, int arg2) {
        this.field7447 = this.field7439 = this.field7440 = this.field7444 = this.field7448 = this.field7437 = 0;
        this.field7446 = this.field7445 = this.field7441 = 32768;
        this.field7442 = arg0;
        this.field7438 = arg1;
        this.field7443 = arg2;
    }

    @OriginalMember(owner = "client!cm", name = "na", descriptor = "(I)V")
    public final void method905(int arg0) {
        int var2 = class457.field6759[arg0 & 0x3FFF];
        int var3 = class457.field6760[arg0 & 0x3FFF];
        int var4 = this.field7447;
        int var5 = this.field7445;
        int var6 = this.field7437;
        int var7 = this.field7438;
        this.field7447 = var2 * var4 - this.field7439 * var3 >> 15;
        this.field7439 = this.field7439 * var2 + var3 * var4 >> 15;
        this.field7445 = var2 * var5 - this.field7444 * var3 >> 15;
        this.field7444 = this.field7444 * var2 + var3 * var5 >> 15;
        this.field7437 = var2 * var6 - this.field7441 * var3 >> 15;
        this.field7441 = this.field7441 * var2 + var3 * var6 >> 15;
        this.field7438 = var2 * var7 - this.field7443 * var3 >> 15;
        this.field7443 = this.field7443 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "(III[I)V")
    public final void method912(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field7448 * arg2 + this.field7446 * arg0 + this.field7440 * arg1 >> 15;
        arg3[1] = this.field7437 * arg2 + this.field7447 * arg0 + this.field7445 * arg1 >> 15;
        arg3[2] = this.field7441 * arg2 + this.field7444 * arg1 + this.field7439 * arg0 >> 15;
    }

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "(IIIIII)V")
    public final void method900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class457.field6759[arg3 & 0x3FFF];
        int var8 = class457.field6760[arg3 & 0x3FFF];
        int var9 = class457.field6759[arg4 & 0x3FFF];
        int var10 = class457.field6760[arg4 & 0x3FFF];
        int var11 = class457.field6759[arg5 & 0x3FFF];
        int var12 = class457.field6760[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field7446 = var9 * var11 + var10 * var14 >> 15;
        this.field7447 = -var9 * var12 + var10 * var13 >> 15;
        this.field7439 = var7 * var10 >> 15;
        this.field7440 = var7 * var12 >> 15;
        this.field7445 = var7 * var11 >> 15;
        this.field7444 = -var8;
        this.field7448 = -var10 * var11 + var9 * var14 >> 15;
        this.field7437 = var9 * var13 + var10 * var12 >> 15;
        this.field7441 = var7 * var9 >> 15;
        this.field7442 = -arg0 * this.field7446 - this.field7440 * arg1 - this.field7448 * arg2 >> 15;
        this.field7438 = -arg0 * this.field7447 - this.field7445 * arg1 - this.field7437 * arg2 >> 15;
        this.field7443 = -arg0 * this.field7439 - this.field7444 * arg1 - this.field7441 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!cm", name = "ma", descriptor = "(I)V")
    public final void method911(int arg0) {
        this.field7441 = 32768;
        this.field7446 = this.field7445 = class457.field6759[arg0 & 0x3FFF];
        this.field7447 = class457.field6760[arg0 & 0x3FFF];
        this.field7440 = -this.field7447;
        this.field7448 = this.field7442 = this.field7437 = this.field7438 = this.field7439 = this.field7444 = this.field7443 = 0;
    }

    @OriginalMember(owner = "client!cm", name = "ba", descriptor = "(Lia;)V")
    public final void method903(class414 arg0) {
        class510 var2 = (class510) arg0;
        this.field7446 = var2.field7446;
        this.field7440 = var2.field7440;
        this.field7448 = var2.field7448;
        this.field7442 = var2.field7442;
        this.field7447 = var2.field7447;
        this.field7445 = var2.field7445;
        this.field7437 = var2.field7437;
        this.field7438 = var2.field7438;
        this.field7439 = var2.field7439;
        this.field7444 = var2.field7444;
        this.field7441 = var2.field7441;
        this.field7443 = var2.field7443;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()Lia;")
    public final class414 method910() {
        class510 var1 = new class510();
        var1.field7446 = this.field7446;
        var1.field7440 = this.field7440;
        var1.field7448 = this.field7448;
        var1.field7442 = this.field7442;
        var1.field7447 = this.field7447;
        var1.field7445 = this.field7445;
        var1.field7437 = this.field7437;
        var1.field7438 = this.field7438;
        var1.field7439 = this.field7439;
        var1.field7444 = this.field7444;
        var1.field7441 = this.field7441;
        var1.field7443 = this.field7443;
        return var1;
    }

    @OriginalMember(owner = "client!cm", name = "HA", descriptor = "()V")
    public final void method902() {
        this.field7447 = this.field7439 = this.field7440 = this.field7444 = this.field7448 = this.field7437 = this.field7442 = this.field7438 = this.field7443 = 0;
        this.field7446 = this.field7445 = this.field7441 = 32768;
    }

    @OriginalMember(owner = "client!cm", name = "X", descriptor = "([I)V")
    public final void method909(int[] arg0) {
        int var2 = arg0[0] - this.field7442;
        int var3 = arg0[1] - this.field7438;
        int var4 = arg0[2] - this.field7443;
        arg0[0] = this.field7439 * var4 + this.field7447 * var3 + this.field7446 * var2 >> 15;
        arg0[1] = this.field7444 * var4 + this.field7445 * var3 + this.field7440 * var2 >> 15;
        arg0[2] = this.field7441 * var4 + this.field7448 * var2 + this.field7437 * var3 >> 15;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public final void method906(int arg0) {
        int var2 = class457.field6759[arg0 & 0x3FFF];
        int var3 = class457.field6760[arg0 & 0x3FFF];
        int var4 = this.field7446;
        int var5 = this.field7440;
        int var6 = this.field7448;
        int var7 = this.field7442;
        this.field7446 = this.field7439 * var3 + var2 * var4 >> 15;
        this.field7439 = this.field7439 * var2 - var3 * var4 >> 15;
        this.field7440 = this.field7444 * var3 + var2 * var5 >> 15;
        this.field7444 = this.field7444 * var2 - var3 * var5 >> 15;
        this.field7448 = this.field7441 * var3 + var2 * var6 >> 15;
        this.field7441 = this.field7441 * var2 - var3 * var6 >> 15;
        this.field7442 = this.field7443 * var3 + var2 * var7 >> 15;
        this.field7443 = this.field7443 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class510() {
        this.method902();
    }
}
