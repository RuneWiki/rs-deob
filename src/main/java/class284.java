import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class284 extends class71 {

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)V", line = 3)
    public final void method123(int arg0, int arg1, int arg2) {
        this.field3982 = this.field3986 = this.field3980 = this.field3985 = this.field3983 = this.field3979 = 0;
        this.field3976 = this.field3981 = this.field3984 = 32768;
        this.field3977 = arg0;
        this.field3978 = arg1;
        this.field3975 = arg2;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V", line = 13)
    public final void method117(int arg0) {
        this.field3981 = 32768;
        this.field3976 = this.field3984 = class286.field4035[arg0 & 0x3FFF];
        this.field3983 = class286.field4025[arg0 & 0x3FFF];
        this.field3986 = -this.field3983;
        this.field3980 = this.field3977 = this.field3982 = this.field3979 = this.field3978 = this.field3985 = this.field3975 = 0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 21)
    public final void method131(int arg0) {
        int var2 = class286.field4035[arg0 & 0x3FFF];
        int var3 = class286.field4025[arg0 & 0x3FFF];
        int var4 = this.field3982;
        int var5 = this.field3981;
        int var6 = this.field3979;
        int var7 = this.field3978;
        this.field3982 = var2 * var4 - this.field3986 * var3 >> 15;
        this.field3986 = this.field3986 * var2 + var3 * var4 >> 15;
        this.field3981 = var2 * var5 - this.field3985 * var3 >> 15;
        this.field3985 = this.field3985 * var2 + var3 * var5 >> 15;
        this.field3979 = var2 * var6 - this.field3984 * var3 >> 15;
        this.field3984 = this.field3984 * var2 + var3 * var6 >> 15;
        this.field3978 = var2 * var7 - this.field3975 * var3 >> 15;
        this.field3975 = this.field3975 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lvr;)V", line = 43)
    public final void method120(class71 arg0) {
        class284 var2 = (class284) arg0;
        this.field3976 = var2.field3976;
        this.field3980 = var2.field3980;
        this.field3983 = var2.field3983;
        this.field3977 = var2.field3977;
        this.field3982 = var2.field3982;
        this.field3981 = var2.field3981;
        this.field3979 = var2.field3979;
        this.field3978 = var2.field3978;
        this.field3986 = var2.field3986;
        this.field3985 = var2.field3985;
        this.field3984 = var2.field3984;
        this.field3975 = var2.field3975;
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V", line = 60)
    public final void method125(int arg0) {
        int var2 = class286.field4035[arg0 & 0x3FFF];
        int var3 = class286.field4025[arg0 & 0x3FFF];
        int var4 = this.field3976;
        int var5 = this.field3980;
        int var6 = this.field3983;
        int var7 = this.field3977;
        this.field3976 = this.field3986 * var3 + var2 * var4 >> 15;
        this.field3986 = this.field3986 * var2 - var3 * var4 >> 15;
        this.field3980 = this.field3985 * var3 + var2 * var5 >> 15;
        this.field3985 = this.field3985 * var2 - var3 * var5 >> 15;
        this.field3983 = this.field3984 * var3 + var2 * var6 >> 15;
        this.field3984 = this.field3984 * var2 - var3 * var6 >> 15;
        this.field3977 = this.field3975 * var3 + var2 * var7 >> 15;
        this.field3975 = this.field3975 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)V", line = 84)
    public final void method124(int arg0, int arg1, int arg2) {
        this.field3977 += arg0;
        this.field3978 += arg1;
        this.field3975 += arg2;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "()Lkp;", line = 90)
    public final class284 method1814() {
        class284 var1 = new class284();
        var1.field3976 = this.field3976;
        var1.field3980 = this.field3980;
        var1.field3983 = this.field3983;
        var1.field3977 = this.field3977;
        var1.field3982 = this.field3982;
        var1.field3981 = this.field3981;
        var1.field3979 = this.field3979;
        var1.field3978 = this.field3978;
        var1.field3986 = this.field3986;
        var1.field3985 = this.field3985;
        var1.field3984 = this.field3984;
        var1.field3975 = this.field3975;
        return var1;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V", line = 108)
    public final void method129(int arg0) {
        this.field3976 = 32768;
        this.field3981 = this.field3984 = class286.field4035[arg0 & 0x3FFF];
        this.field3985 = class286.field4025[arg0 & 0x3FFF];
        this.field3979 = -this.field3985;
        this.field3980 = this.field3983 = this.field3977 = this.field3982 = this.field3978 = this.field3986 = this.field3975 = 0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "()V", line = 116)
    public final void method116() {
        this.field3982 = this.field3986 = this.field3980 = this.field3985 = this.field3983 = this.field3979 = this.field3977 = this.field3978 = this.field3975 = 0;
        this.field3976 = this.field3981 = this.field3984 = 32768;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 120)
    public final void method118(int arg0) {
        this.field3984 = 32768;
        this.field3976 = this.field3981 = class286.field4035[arg0 & 0x3FFF];
        this.field3982 = class286.field4025[arg0 & 0x3FFF];
        this.field3980 = -this.field3982;
        this.field3983 = this.field3977 = this.field3979 = this.field3978 = this.field3986 = this.field3985 = this.field3975 = 0;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIII)V", line = 128)
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class286.field4035[arg3 & 0x3FFF];
        int var8 = class286.field4025[arg3 & 0x3FFF];
        int var9 = class286.field4035[arg4 & 0x3FFF];
        int var10 = class286.field4025[arg4 & 0x3FFF];
        int var11 = class286.field4035[arg5 & 0x3FFF];
        int var12 = class286.field4025[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field3976 = var9 * var11 + var10 * var14 >> 15;
        this.field3982 = -var9 * var12 + var10 * var13 >> 15;
        this.field3986 = var7 * var10 >> 15;
        this.field3980 = var7 * var12 >> 15;
        this.field3981 = var7 * var11 >> 15;
        this.field3985 = -var8;
        this.field3983 = -var10 * var11 + var9 * var14 >> 15;
        this.field3979 = var9 * var13 + var10 * var12 >> 15;
        this.field3984 = var7 * var9 >> 15;
        this.field3977 = -arg0 * this.field3976 - this.field3980 * arg1 - this.field3983 * arg2 >> 15;
        this.field3978 = -arg0 * this.field3982 - this.field3981 * arg1 - this.field3979 * arg2 >> 15;
        this.field3975 = -arg0 * this.field3986 - this.field3985 * arg1 - this.field3984 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([I)V", line = 159)
    public final void method121(int[] arg0) {
        int var2 = arg0[0] - this.field3977;
        int var3 = arg0[1] - this.field3978;
        int var4 = arg0[2] - this.field3975;
        arg0[0] = this.field3986 * var4 + this.field3982 * var3 + this.field3976 * var2 >> 15;
        arg0[1] = this.field3985 * var4 + this.field3981 * var3 + this.field3980 * var2 >> 15;
        arg0[2] = this.field3984 * var4 + this.field3983 * var2 + this.field3979 * var3 >> 15;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 171)
    public class284() {
        this.method116();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III[I)V", line = 176)
    public final void method130(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field3983 * arg2 + this.field3980 * arg1 + this.field3976 * arg0 >> 15) + this.field3977;
        arg3[1] = (this.field3979 * arg2 + this.field3982 * arg0 + this.field3981 * arg1 >> 15) + this.field3978;
        arg3[2] = (this.field3984 * arg2 + this.field3986 * arg0 + this.field3985 * arg1 >> 15) + this.field3975;
    }
}
