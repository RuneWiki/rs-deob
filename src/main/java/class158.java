import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class158 extends class177 {

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
    public final void method976() {
        this.field2141 = this.field2140 = this.field2133 = this.field2143 = this.field2142 = this.field2139 = this.field2137 = this.field2134 = this.field2138 = 0;
        this.field2144 = this.field2136 = this.field2135 = 32768;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()Lc;")
    public final class158 method977() {
        class158 var1 = new class158();
        var1.field2144 = this.field2144;
        var1.field2133 = this.field2133;
        var1.field2142 = this.field2142;
        var1.field2137 = this.field2137;
        var1.field2141 = this.field2141;
        var1.field2136 = this.field2136;
        var1.field2139 = this.field2139;
        var1.field2134 = this.field2134;
        var1.field2140 = this.field2140;
        var1.field2143 = this.field2143;
        var1.field2135 = this.field2135;
        var1.field2138 = this.field2138;
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method978(int arg0) {
        this.field2144 = 32768;
        this.field2136 = this.field2135 = class117.field1636[arg0 & 0x3FFF];
        this.field2143 = class117.field1644[arg0 & 0x3FFF];
        this.field2139 = -this.field2143;
        this.field2133 = this.field2142 = this.field2137 = this.field2141 = this.field2134 = this.field2140 = this.field2138 = 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public final void method979(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2142 * arg2 + this.field2144 * arg0 + this.field2133 * arg1 >> 15) + this.field2137;
        arg3[1] = (this.field2139 * arg2 + this.field2141 * arg0 + this.field2136 * arg1 >> 15) + this.field2134;
        arg3[2] = (this.field2135 * arg2 + this.field2143 * arg1 + this.field2140 * arg0 >> 15) + this.field2138;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public final void method980(int arg0) {
        int var2 = class117.field1636[arg0 & 0x3FFF];
        int var3 = class117.field1644[arg0 & 0x3FFF];
        int var4 = this.field2144;
        int var5 = this.field2133;
        int var6 = this.field2142;
        int var7 = this.field2137;
        this.field2144 = this.field2140 * var3 + var2 * var4 >> 15;
        this.field2140 = this.field2140 * var2 - var3 * var4 >> 15;
        this.field2133 = this.field2143 * var3 + var2 * var5 >> 15;
        this.field2143 = this.field2143 * var2 - var3 * var5 >> 15;
        this.field2142 = this.field2135 * var3 + var2 * var6 >> 15;
        this.field2135 = this.field2135 * var2 - var3 * var6 >> 15;
        this.field2137 = this.field2138 * var3 + var2 * var7 >> 15;
        this.field2138 = this.field2138 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
    public final void method981(int arg0, int arg1, int arg2) {
        this.field2137 += arg0;
        this.field2134 += arg1;
        this.field2138 += arg2;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public final void method982(int arg0) {
        this.field2135 = 32768;
        this.field2144 = this.field2136 = class117.field1636[arg0 & 0x3FFF];
        this.field2141 = class117.field1644[arg0 & 0x3FFF];
        this.field2133 = -this.field2141;
        this.field2142 = this.field2137 = this.field2139 = this.field2134 = this.field2140 = this.field2143 = this.field2138 = 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
    public final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class117.field1636[arg3 & 0x3FFF];
        int var8 = class117.field1644[arg3 & 0x3FFF];
        int var9 = class117.field1636[arg4 & 0x3FFF];
        int var10 = class117.field1644[arg4 & 0x3FFF];
        int var11 = class117.field1636[arg5 & 0x3FFF];
        int var12 = class117.field1644[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field2144 = var9 * var11 + var10 * var14 >> 15;
        this.field2141 = -var9 * var12 + var10 * var13 >> 15;
        this.field2140 = var7 * var10 >> 15;
        this.field2133 = var7 * var12 >> 15;
        this.field2136 = var7 * var11 >> 15;
        this.field2143 = -var8;
        this.field2142 = -var10 * var11 + var9 * var14 >> 15;
        this.field2139 = var9 * var13 + var10 * var12 >> 15;
        this.field2135 = var7 * var9 >> 15;
        this.field2137 = -arg0 * this.field2144 - this.field2133 * arg1 - this.field2142 * arg2 >> 15;
        this.field2134 = -arg0 * this.field2141 - this.field2136 * arg1 - this.field2139 * arg2 >> 15;
        this.field2138 = -arg0 * this.field2140 - this.field2143 * arg1 - this.field2135 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public final void method984(int arg0) {
        this.field2136 = 32768;
        this.field2144 = this.field2135 = class117.field1636[arg0 & 0x3FFF];
        this.field2142 = class117.field1644[arg0 & 0x3FFF];
        this.field2140 = -this.field2142;
        this.field2133 = this.field2137 = this.field2141 = this.field2139 = this.field2134 = this.field2143 = this.field2138 = 0;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(III)V")
    public final void method985(int arg0, int arg1, int arg2) {
        this.field2141 = this.field2140 = this.field2133 = this.field2143 = this.field2142 = this.field2139 = 0;
        this.field2144 = this.field2136 = this.field2135 = 32768;
        this.field2137 = arg0;
        this.field2134 = arg1;
        this.field2138 = arg2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvj;)V")
    public final void method986(class177 arg0) {
        class158 var2 = (class158) arg0;
        this.field2144 = var2.field2144;
        this.field2133 = var2.field2133;
        this.field2142 = var2.field2142;
        this.field2137 = var2.field2137;
        this.field2141 = var2.field2141;
        this.field2136 = var2.field2136;
        this.field2139 = var2.field2139;
        this.field2134 = var2.field2134;
        this.field2140 = var2.field2140;
        this.field2143 = var2.field2143;
        this.field2135 = var2.field2135;
        this.field2138 = var2.field2138;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I)V")
    public final void method987(int[] arg0) {
        int var2 = arg0[0] - this.field2137;
        int var3 = arg0[1] - this.field2134;
        int var4 = arg0[2] - this.field2138;
        arg0[0] = this.field2140 * var4 + this.field2144 * var2 + this.field2141 * var3 >> 15;
        arg0[1] = this.field2143 * var4 + this.field2136 * var3 + this.field2133 * var2 >> 15;
        arg0[2] = this.field2135 * var4 + this.field2142 * var2 + this.field2139 * var3 >> 15;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public final void method988(int arg0) {
        int var2 = class117.field1636[arg0 & 0x3FFF];
        int var3 = class117.field1644[arg0 & 0x3FFF];
        int var4 = this.field2141;
        int var5 = this.field2136;
        int var6 = this.field2139;
        int var7 = this.field2134;
        this.field2141 = var2 * var4 - this.field2140 * var3 >> 15;
        this.field2140 = this.field2140 * var2 + var3 * var4 >> 15;
        this.field2136 = var2 * var5 - this.field2143 * var3 >> 15;
        this.field2143 = this.field2143 * var2 + var3 * var5 >> 15;
        this.field2139 = var2 * var6 - this.field2135 * var3 >> 15;
        this.field2135 = this.field2135 * var2 + var3 * var6 >> 15;
        this.field2134 = var2 * var7 - this.field2138 * var3 >> 15;
        this.field2138 = this.field2138 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class158() {
        this.method976();
    }
}
