import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class279 extends class33 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field3967;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field3974;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 3)
    public final void method267(int arg0) {
        this.field3971 = 32768;
        this.field3970 = this.field3973 = class323.field4733[arg0 & 0x3FFF];
        this.field3967 = class323.field4731[arg0 & 0x3FFF];
        this.field3968 = -this.field3967;
        this.field3978 = this.field3977 = this.field3972 = this.field3976 = this.field3969 = this.field3975 = this.field3974 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V", line = 10)
    public final void method276(int arg0) {
        this.field3970 = 32768;
        this.field3971 = this.field3973 = class323.field4733[arg0 & 0x3FFF];
        this.field3977 = class323.field4731[arg0 & 0x3FFF];
        this.field3975 = -this.field3977;
        this.field3978 = this.field3972 = this.field3976 = this.field3968 = this.field3969 = this.field3967 = this.field3974 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V", line = 17)
    public final void method278(int arg0, int arg1, int arg2) {
        this.field3976 = this.field3975 = this.field3978 = this.field3967 = this.field3977 = this.field3968 = 0;
        this.field3971 = this.field3970 = this.field3973 = 32768;
        this.field3972 = arg0;
        this.field3969 = arg1;
        this.field3974 = arg2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III[I)V", line = 24)
    public final void method271(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field3977 * arg2 + this.field3978 * arg1 + this.field3971 * arg0 >> 15;
        arg3[1] = this.field3968 * arg2 + this.field3976 * arg0 + this.field3970 * arg1 >> 15;
        arg3[2] = this.field3973 * arg2 + this.field3975 * arg0 + this.field3967 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 31)
    public final void method268(int arg0) {
        this.field3973 = 32768;
        this.field3971 = this.field3970 = class323.field4733[arg0 & 0x3FFF];
        this.field3976 = class323.field4731[arg0 & 0x3FFF];
        this.field3978 = -this.field3976;
        this.field3977 = this.field3972 = this.field3968 = this.field3969 = this.field3975 = this.field3967 = this.field3974 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V", line = 40)
    public final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class323.field4733[arg3 & 0x3FFF];
        int var8 = class323.field4731[arg3 & 0x3FFF];
        int var9 = class323.field4733[arg4 & 0x3FFF];
        int var10 = class323.field4731[arg4 & 0x3FFF];
        int var11 = class323.field4733[arg5 & 0x3FFF];
        int var12 = class323.field4731[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field3971 = var9 * var11 + var10 * var14 >> 15;
        this.field3976 = -var9 * var12 + var10 * var13 >> 15;
        this.field3975 = var7 * var10 >> 15;
        this.field3978 = var7 * var12 >> 15;
        this.field3970 = var7 * var11 >> 15;
        this.field3967 = -var8;
        this.field3977 = -var10 * var11 + var9 * var14 >> 15;
        this.field3968 = var9 * var13 + var10 * var12 >> 15;
        this.field3973 = var7 * var9 >> 15;
        this.field3972 = -arg0 * this.field3971 - this.field3978 * arg1 - this.field3977 * arg2 >> 15;
        this.field3969 = -arg0 * this.field3976 - this.field3970 * arg1 - this.field3968 * arg2 >> 15;
        this.field3974 = -arg0 * this.field3975 - this.field3967 * arg1 - this.field3973 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V", line = 70)
    public final void method274() {
        this.field3976 = this.field3975 = this.field3978 = this.field3967 = this.field3977 = this.field3968 = this.field3972 = this.field3969 = this.field3974 = 0;
        this.field3971 = this.field3970 = this.field3973 = 32768;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III[I)V", line = 74)
    public final void method273(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field3977 * arg2 + this.field3978 * arg1 + this.field3971 * arg0 >> 15) + this.field3972;
        arg3[1] = (this.field3968 * arg2 + this.field3976 * arg0 + this.field3970 * arg1 >> 15) + this.field3969;
        arg3[2] = (this.field3973 * arg2 + this.field3975 * arg0 + this.field3967 * arg1 >> 15) + this.field3974;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V", line = 80)
    public final void method279(int arg0) {
        int var2 = class323.field4733[arg0 & 0x3FFF];
        int var3 = class323.field4731[arg0 & 0x3FFF];
        int var4 = this.field3971;
        int var5 = this.field3978;
        int var6 = this.field3977;
        int var7 = this.field3972;
        this.field3971 = this.field3975 * var3 + var2 * var4 >> 15;
        this.field3975 = this.field3975 * var2 - var3 * var4 >> 15;
        this.field3978 = this.field3967 * var3 + var2 * var5 >> 15;
        this.field3967 = this.field3967 * var2 - var3 * var5 >> 15;
        this.field3977 = this.field3973 * var3 + var2 * var6 >> 15;
        this.field3973 = this.field3973 * var2 - var3 * var6 >> 15;
        this.field3972 = this.field3974 * var3 + var2 * var7 >> 15;
        this.field3974 = this.field3974 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lgs;)V", line = 105)
    public final void method266(class33 arg0) {
        class279 var2 = (class279) arg0;
        this.field3971 = var2.field3971;
        this.field3978 = var2.field3978;
        this.field3977 = var2.field3977;
        this.field3972 = var2.field3972;
        this.field3976 = var2.field3976;
        this.field3970 = var2.field3970;
        this.field3968 = var2.field3968;
        this.field3969 = var2.field3969;
        this.field3975 = var2.field3975;
        this.field3967 = var2.field3967;
        this.field3973 = var2.field3973;
        this.field3974 = var2.field3974;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 121)
    public final void method270(int arg0) {
        int var2 = class323.field4733[arg0 & 0x3FFF];
        int var3 = class323.field4731[arg0 & 0x3FFF];
        int var4 = this.field3976;
        int var5 = this.field3970;
        int var6 = this.field3968;
        int var7 = this.field3969;
        this.field3976 = var2 * var4 - this.field3975 * var3 >> 15;
        this.field3975 = this.field3975 * var2 + var3 * var4 >> 15;
        this.field3970 = var2 * var5 - this.field3967 * var3 >> 15;
        this.field3967 = this.field3967 * var2 + var3 * var5 >> 15;
        this.field3968 = var2 * var6 - this.field3973 * var3 >> 15;
        this.field3973 = this.field3973 * var2 + var3 * var6 >> 15;
        this.field3969 = var2 * var7 - this.field3974 * var3 >> 15;
        this.field3974 = this.field3974 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 142)
    public final void method275(int arg0, int arg1, int arg2) {
        this.field3972 += arg0;
        this.field3969 += arg1;
        this.field3974 += arg2;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lgs;", line = 148)
    public final class33 method1703() {
        class279 var1 = new class279();
        var1.field3971 = this.field3971;
        var1.field3978 = this.field3978;
        var1.field3977 = this.field3977;
        var1.field3972 = this.field3972;
        var1.field3976 = this.field3976;
        var1.field3970 = this.field3970;
        var1.field3968 = this.field3968;
        var1.field3969 = this.field3969;
        var1.field3975 = this.field3975;
        var1.field3967 = this.field3967;
        var1.field3973 = this.field3973;
        var1.field3974 = this.field3974;
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([I)V", line = 170)
    public final void method272(int[] arg0) {
        int var2 = arg0[0] - this.field3972;
        int var3 = arg0[1] - this.field3969;
        int var4 = arg0[2] - this.field3974;
        arg0[0] = this.field3975 * var4 + this.field3976 * var3 + this.field3971 * var2 >> 15;
        arg0[1] = this.field3967 * var4 + this.field3978 * var2 + this.field3970 * var3 >> 15;
        arg0[2] = this.field3973 * var4 + this.field3977 * var2 + this.field3968 * var3 >> 15;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 182)
    public class279() {
        this.method274();
    }
}
