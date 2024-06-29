import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class240 extends class203 {

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([I)V", line = 7)
    public final void method1019(int[] arg0) {
        int var2 = arg0[0] - this.field3195;
        int var3 = arg0[1] - this.field3193;
        int var4 = arg0[2] - this.field3198;
        arg0[0] = this.field3201 * var4 + this.field3204 * var3 + this.field3202 * var2 >> 15;
        arg0[1] = this.field3199 * var4 + this.field3203 * var3 + this.field3197 * var2 >> 15;
        arg0[2] = this.field3200 * var4 + this.field3196 * var3 + this.field3194 * var2 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 17)
    public final void method1028(int arg0) {
        this.field3200 = 32768;
        this.field3202 = this.field3203 = class364.field4992[arg0 & 0x3FFF];
        this.field3204 = class364.field4994[arg0 & 0x3FFF];
        this.field3197 = -this.field3204;
        this.field3194 = this.field3195 = this.field3196 = this.field3193 = this.field3201 = this.field3199 = this.field3198 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()V", line = 24)
    public final void method1023() {
        this.field3204 = this.field3201 = this.field3197 = this.field3199 = this.field3194 = this.field3196 = this.field3195 = this.field3193 = this.field3198 = 0;
        this.field3202 = this.field3203 = this.field3200 = 32768;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIII)V", line = 32)
    public final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class364.field4992[arg3 & 0x3FFF];
        int var8 = class364.field4994[arg3 & 0x3FFF];
        int var9 = class364.field4992[arg4 & 0x3FFF];
        int var10 = class364.field4994[arg4 & 0x3FFF];
        int var11 = class364.field4992[arg5 & 0x3FFF];
        int var12 = class364.field4994[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field3202 = var9 * var11 + var10 * var14 >> 15;
        this.field3204 = -var9 * var12 + var10 * var13 >> 15;
        this.field3201 = var7 * var10 >> 15;
        this.field3197 = var7 * var12 >> 15;
        this.field3203 = var7 * var11 >> 15;
        this.field3199 = -var8;
        this.field3194 = -var10 * var11 + var9 * var14 >> 15;
        this.field3196 = var9 * var13 + var10 * var12 >> 15;
        this.field3200 = var7 * var9 >> 15;
        this.field3195 = -arg0 * this.field3202 - this.field3197 * arg1 - this.field3194 * arg2 >> 15;
        this.field3193 = -arg0 * this.field3204 - this.field3203 * arg1 - this.field3196 * arg2 >> 15;
        this.field3198 = -arg0 * this.field3201 - this.field3199 * arg1 - this.field3200 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 61)
    public final void method1029(int arg0, int arg1, int arg2) {
        this.field3204 = this.field3201 = this.field3197 = this.field3199 = this.field3194 = this.field3196 = 0;
        this.field3202 = this.field3203 = this.field3200 = 32768;
        this.field3195 = arg0;
        this.field3193 = arg1;
        this.field3198 = arg2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 70)
    public final void method1020(int arg0) {
        this.field3203 = 32768;
        this.field3202 = this.field3200 = class364.field4992[arg0 & 0x3FFF];
        this.field3194 = class364.field4994[arg0 & 0x3FFF];
        this.field3201 = -this.field3194;
        this.field3197 = this.field3195 = this.field3204 = this.field3196 = this.field3193 = this.field3199 = this.field3198 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 78)
    public final void method1034(int arg0) {
        int var2 = class364.field4992[arg0 & 0x3FFF];
        int var3 = class364.field4994[arg0 & 0x3FFF];
        int var4 = this.field3204;
        int var5 = this.field3203;
        int var6 = this.field3196;
        int var7 = this.field3193;
        this.field3204 = var2 * var4 - this.field3201 * var3 >> 15;
        this.field3201 = this.field3201 * var2 + var3 * var4 >> 15;
        this.field3203 = var2 * var5 - this.field3199 * var3 >> 15;
        this.field3199 = this.field3199 * var2 + var3 * var5 >> 15;
        this.field3196 = var2 * var6 - this.field3200 * var3 >> 15;
        this.field3200 = this.field3200 * var2 + var3 * var6 >> 15;
        this.field3193 = var2 * var7 - this.field3198 * var3 >> 15;
        this.field3198 = this.field3198 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lon;)V", line = 100)
    public final void method1024(class203 arg0) {
        class240 var2 = (class240) arg0;
        this.field3202 = var2.field3202;
        this.field3197 = var2.field3197;
        this.field3194 = var2.field3194;
        this.field3195 = var2.field3195;
        this.field3204 = var2.field3204;
        this.field3203 = var2.field3203;
        this.field3196 = var2.field3196;
        this.field3193 = var2.field3193;
        this.field3201 = var2.field3201;
        this.field3199 = var2.field3199;
        this.field3200 = var2.field3200;
        this.field3198 = var2.field3198;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 118)
    public final void method1031(int arg0) {
        this.field3202 = 32768;
        this.field3203 = this.field3200 = class364.field4992[arg0 & 0x3FFF];
        this.field3199 = class364.field4994[arg0 & 0x3FFF];
        this.field3196 = -this.field3199;
        this.field3197 = this.field3194 = this.field3195 = this.field3204 = this.field3193 = this.field3201 = this.field3198 = 0;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V", line = 125)
    public final void method1027(int arg0, int arg1, int arg2) {
        this.field3195 += arg0;
        this.field3193 += arg1;
        this.field3198 += arg2;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 132)
    public final void method1032(int arg0) {
        int var2 = class364.field4992[arg0 & 0x3FFF];
        int var3 = class364.field4994[arg0 & 0x3FFF];
        int var4 = this.field3202;
        int var5 = this.field3197;
        int var6 = this.field3194;
        int var7 = this.field3195;
        this.field3202 = this.field3201 * var3 + var2 * var4 >> 15;
        this.field3201 = this.field3201 * var2 - var3 * var4 >> 15;
        this.field3197 = this.field3199 * var3 + var2 * var5 >> 15;
        this.field3199 = this.field3199 * var2 - var3 * var5 >> 15;
        this.field3194 = this.field3200 * var3 + var2 * var6 >> 15;
        this.field3200 = this.field3200 * var2 - var3 * var6 >> 15;
        this.field3195 = this.field3198 * var3 + var2 * var7 >> 15;
        this.field3198 = this.field3198 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[I)V", line = 153)
    public final void method1022(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field3194 * arg2 + this.field3202 * arg0 + this.field3197 * arg1 >> 15) + this.field3195;
        arg3[1] = (this.field3196 * arg2 + this.field3204 * arg0 + this.field3203 * arg1 >> 15) + this.field3193;
        arg3[2] = (this.field3200 * arg2 + this.field3201 * arg0 + this.field3199 * arg1 >> 15) + this.field3198;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()Lba;", line = 162)
    public final class240 method1327() {
        class240 var1 = new class240();
        var1.field3202 = this.field3202;
        var1.field3197 = this.field3197;
        var1.field3194 = this.field3194;
        var1.field3195 = this.field3195;
        var1.field3204 = this.field3204;
        var1.field3203 = this.field3203;
        var1.field3196 = this.field3196;
        var1.field3193 = this.field3193;
        var1.field3201 = this.field3201;
        var1.field3199 = this.field3199;
        var1.field3200 = this.field3200;
        var1.field3198 = this.field3198;
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 177)
    public class240() {
        this.method1023();
    }
}
