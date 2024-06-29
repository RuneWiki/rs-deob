import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class224 extends class257 {

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field3234;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 5)
    public final void method102(int arg0) {
        int var2 = class319.field4504[arg0 & 0x3FFF];
        int var3 = class319.field4501[arg0 & 0x3FFF];
        int var4 = this.field3236;
        int var5 = this.field3227;
        int var6 = this.field3229;
        int var7 = this.field3232;
        this.field3236 = this.field3230 * var3 + var2 * var4 >> 15;
        this.field3230 = this.field3230 * var2 - var3 * var4 >> 15;
        this.field3227 = this.field3233 * var3 + var2 * var5 >> 15;
        this.field3233 = this.field3233 * var2 - var3 * var5 >> 15;
        this.field3229 = this.field3235 * var3 + var2 * var6 >> 15;
        this.field3235 = this.field3235 * var2 - var3 * var6 >> 15;
        this.field3232 = this.field3234 * var3 + var2 * var7 >> 15;
        this.field3234 = this.field3234 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lde;)V", line = 29)
    public final void method109(class257 arg0) {
        class224 var2 = (class224) arg0;
        this.field3236 = var2.field3236;
        this.field3227 = var2.field3227;
        this.field3229 = var2.field3229;
        this.field3232 = var2.field3232;
        this.field3228 = var2.field3228;
        this.field3237 = var2.field3237;
        this.field3226 = var2.field3226;
        this.field3231 = var2.field3231;
        this.field3230 = var2.field3230;
        this.field3233 = var2.field3233;
        this.field3235 = var2.field3235;
        this.field3234 = var2.field3234;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V", line = 45)
    public final void method110(int arg0) {
        this.field3237 = 32768;
        this.field3236 = this.field3235 = class319.field4504[arg0 & 0x3FFF];
        this.field3229 = class319.field4501[arg0 & 0x3FFF];
        this.field3230 = -this.field3229;
        this.field3227 = this.field3232 = this.field3228 = this.field3226 = this.field3231 = this.field3233 = this.field3234 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()Lkf;", line = 53)
    public final class224 method1529() {
        class224 var1 = new class224();
        var1.field3236 = this.field3236;
        var1.field3227 = this.field3227;
        var1.field3229 = this.field3229;
        var1.field3232 = this.field3232;
        var1.field3228 = this.field3228;
        var1.field3237 = this.field3237;
        var1.field3226 = this.field3226;
        var1.field3231 = this.field3231;
        var1.field3230 = this.field3230;
        var1.field3233 = this.field3233;
        var1.field3235 = this.field3235;
        var1.field3234 = this.field3234;
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V", line = 71)
    public final void method107(int arg0, int arg1, int arg2) {
        this.field3232 += arg0;
        this.field3231 += arg1;
        this.field3234 += arg2;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V", line = 77)
    public final void method106(int arg0) {
        this.field3236 = 32768;
        this.field3237 = this.field3235 = class319.field4504[arg0 & 0x3FFF];
        this.field3233 = class319.field4501[arg0 & 0x3FFF];
        this.field3226 = -this.field3233;
        this.field3227 = this.field3229 = this.field3232 = this.field3228 = this.field3231 = this.field3230 = this.field3234 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V", line = 84)
    public final void method101(int arg0) {
        this.field3235 = 32768;
        this.field3236 = this.field3237 = class319.field4504[arg0 & 0x3FFF];
        this.field3228 = class319.field4501[arg0 & 0x3FFF];
        this.field3227 = -this.field3228;
        this.field3229 = this.field3232 = this.field3226 = this.field3231 = this.field3230 = this.field3233 = this.field3234 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)V", line = 92)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class319.field4504[arg3 & 0x3FFF];
        int var8 = class319.field4501[arg3 & 0x3FFF];
        int var9 = class319.field4504[arg4 & 0x3FFF];
        int var10 = class319.field4501[arg4 & 0x3FFF];
        int var11 = class319.field4504[arg5 & 0x3FFF];
        int var12 = class319.field4501[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field3236 = var9 * var11 + var10 * var14 >> 15;
        this.field3228 = -var9 * var12 + var10 * var13 >> 15;
        this.field3230 = var7 * var10 >> 15;
        this.field3227 = var7 * var12 >> 15;
        this.field3237 = var7 * var11 >> 15;
        this.field3233 = -var8;
        this.field3229 = -var10 * var11 + var9 * var14 >> 15;
        this.field3226 = var9 * var13 + var10 * var12 >> 15;
        this.field3235 = var7 * var9 >> 15;
        this.field3232 = -arg0 * this.field3236 - this.field3227 * arg1 - this.field3229 * arg2 >> 15;
        this.field3231 = -arg0 * this.field3228 - this.field3237 * arg1 - this.field3226 * arg2 >> 15;
        this.field3234 = -arg0 * this.field3230 - this.field3233 * arg1 - this.field3235 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([I)V", line = 124)
    public final void method103(int[] arg0) {
        int var2 = arg0[0] - this.field3232;
        int var3 = arg0[1] - this.field3231;
        int var4 = arg0[2] - this.field3234;
        arg0[0] = this.field3230 * var4 + this.field3236 * var2 + this.field3228 * var3 >> 15;
        arg0[1] = this.field3233 * var4 + this.field3237 * var3 + this.field3227 * var2 >> 15;
        arg0[2] = this.field3235 * var4 + this.field3229 * var2 + this.field3226 * var3 >> 15;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V", line = 134)
    public final void method96(int arg0, int arg1, int arg2) {
        this.field3228 = this.field3230 = this.field3227 = this.field3233 = this.field3229 = this.field3226 = 0;
        this.field3236 = this.field3237 = this.field3235 = 32768;
        this.field3232 = arg0;
        this.field3231 = arg1;
        this.field3234 = arg2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III[I)V", line = 144)
    public final void method108(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field3229 * arg2 + this.field3236 * arg0 + this.field3227 * arg1 >> 15) + this.field3232;
        arg3[1] = (this.field3226 * arg2 + this.field3237 * arg1 + this.field3228 * arg0 >> 15) + this.field3231;
        arg3[2] = (this.field3235 * arg2 + this.field3233 * arg1 + this.field3230 * arg0 >> 15) + this.field3234;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V", line = 150)
    public final void method104(int arg0) {
        int var2 = class319.field4504[arg0 & 0x3FFF];
        int var3 = class319.field4501[arg0 & 0x3FFF];
        int var4 = this.field3228;
        int var5 = this.field3237;
        int var6 = this.field3226;
        int var7 = this.field3231;
        this.field3228 = var2 * var4 - this.field3230 * var3 >> 15;
        this.field3230 = this.field3230 * var2 + var3 * var4 >> 15;
        this.field3237 = var2 * var5 - this.field3233 * var3 >> 15;
        this.field3233 = this.field3233 * var2 + var3 * var5 >> 15;
        this.field3226 = var2 * var6 - this.field3235 * var3 >> 15;
        this.field3235 = this.field3235 * var2 + var3 * var6 >> 15;
        this.field3231 = var2 * var7 - this.field3234 * var3 >> 15;
        this.field3234 = this.field3234 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 173)
    public final void method100() {
        this.field3228 = this.field3230 = this.field3227 = this.field3233 = this.field3229 = this.field3226 = this.field3232 = this.field3231 = this.field3234 = 0;
        this.field3236 = this.field3237 = this.field3235 = 32768;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 177)
    public class224() {
        this.method100();
    }
}
