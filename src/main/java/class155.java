import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class155 extends class142 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public int field2053;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!se", name = "ma", descriptor = "(I)V")
    public final void method985(int arg0) {
        this.field2061 = 32768;
        this.field2051 = this.field2052 = class21.field397[arg0 & 0x3FFF];
        this.field2055 = class21.field385[arg0 & 0x3FFF];
        this.field2060 = -this.field2055;
        this.field2054 = this.field2057 = this.field2058 = this.field2050 = this.field2059 = this.field2056 = this.field2053 = 0;
    }

    @OriginalMember(owner = "client!se", name = "ba", descriptor = "(Lia;)V")
    public final void method988(class142 arg0) {
        class155 var2 = (class155) arg0;
        this.field2051 = var2.field2051;
        this.field2060 = var2.field2060;
        this.field2054 = var2.field2054;
        this.field2057 = var2.field2057;
        this.field2055 = var2.field2055;
        this.field2052 = var2.field2052;
        this.field2058 = var2.field2058;
        this.field2050 = var2.field2050;
        this.field2059 = var2.field2059;
        this.field2056 = var2.field2056;
        this.field2061 = var2.field2061;
        this.field2053 = var2.field2053;
    }

    @OriginalMember(owner = "client!se", name = "O", descriptor = "(I)V")
    public final void method986(int arg0) {
        this.field2052 = 32768;
        this.field2051 = this.field2061 = class21.field397[arg0 & 0x3FFF];
        this.field2054 = class21.field385[arg0 & 0x3FFF];
        this.field2059 = -this.field2054;
        this.field2060 = this.field2057 = this.field2055 = this.field2058 = this.field2050 = this.field2056 = this.field2053 = 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()Lia;")
    public final class142 method977() {
        class155 var1 = new class155();
        var1.field2051 = this.field2051;
        var1.field2060 = this.field2060;
        var1.field2054 = this.field2054;
        var1.field2057 = this.field2057;
        var1.field2055 = this.field2055;
        var1.field2052 = this.field2052;
        var1.field2058 = this.field2058;
        var1.field2050 = this.field2050;
        var1.field2059 = this.field2059;
        var1.field2056 = this.field2056;
        var1.field2061 = this.field2061;
        var1.field2053 = this.field2053;
        return var1;
    }

    @OriginalMember(owner = "client!se", name = "E", descriptor = "(III[I)V")
    public final void method980(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field2054 * arg2 + this.field2060 * arg1 + this.field2051 * arg0 >> 15;
        arg3[1] = this.field2058 * arg2 + this.field2055 * arg0 + this.field2052 * arg1 >> 15;
        arg3[2] = this.field2061 * arg2 + this.field2059 * arg0 + this.field2056 * arg1 >> 15;
    }

    @OriginalMember(owner = "client!se", name = "YA", descriptor = "(I)V")
    public final void method991(int arg0) {
        this.field2051 = 32768;
        this.field2052 = this.field2061 = class21.field397[arg0 & 0x3FFF];
        this.field2056 = class21.field385[arg0 & 0x3FFF];
        this.field2058 = -this.field2056;
        this.field2060 = this.field2054 = this.field2057 = this.field2055 = this.field2050 = this.field2059 = this.field2053 = 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III[I)V")
    public final void method992(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field2054 * arg2 + this.field2060 * arg1 + this.field2051 * arg0 >> 15) + this.field2057;
        arg3[1] = (this.field2058 * arg2 + this.field2055 * arg0 + this.field2052 * arg1 >> 15) + this.field2050;
        arg3[2] = (this.field2061 * arg2 + this.field2059 * arg0 + this.field2056 * arg1 >> 15) + this.field2053;
    }

    @OriginalMember(owner = "client!se", name = "HA", descriptor = "()V")
    public final void method979() {
        this.field2055 = this.field2059 = this.field2060 = this.field2056 = this.field2054 = this.field2058 = this.field2057 = this.field2050 = this.field2053 = 0;
        this.field2051 = this.field2052 = this.field2061 = 32768;
    }

    @OriginalMember(owner = "client!se", name = "na", descriptor = "(I)V")
    public final void method981(int arg0) {
        int var2 = class21.field397[arg0 & 0x3FFF];
        int var3 = class21.field385[arg0 & 0x3FFF];
        int var4 = this.field2055;
        int var5 = this.field2052;
        int var6 = this.field2058;
        int var7 = this.field2050;
        this.field2055 = var2 * var4 - this.field2059 * var3 >> 15;
        this.field2059 = this.field2059 * var2 + var3 * var4 >> 15;
        this.field2052 = var2 * var5 - this.field2056 * var3 >> 15;
        this.field2056 = this.field2056 * var2 + var3 * var5 >> 15;
        this.field2058 = var2 * var6 - this.field2061 * var3 >> 15;
        this.field2061 = this.field2061 * var2 + var3 * var6 >> 15;
        this.field2050 = var2 * var7 - this.field2053 * var3 >> 15;
        this.field2053 = this.field2053 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "(IIIIII)V")
    public final void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class21.field397[arg3 & 0x3FFF];
        int var8 = class21.field385[arg3 & 0x3FFF];
        int var9 = class21.field397[arg4 & 0x3FFF];
        int var10 = class21.field385[arg4 & 0x3FFF];
        int var11 = class21.field397[arg5 & 0x3FFF];
        int var12 = class21.field385[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field2051 = var9 * var11 + var10 * var14 >> 15;
        this.field2055 = -var9 * var12 + var10 * var13 >> 15;
        this.field2059 = var7 * var10 >> 15;
        this.field2060 = var7 * var12 >> 15;
        this.field2052 = var7 * var11 >> 15;
        this.field2056 = -var8;
        this.field2054 = -var10 * var11 + var9 * var14 >> 15;
        this.field2058 = var9 * var13 + var10 * var12 >> 15;
        this.field2061 = var7 * var9 >> 15;
        this.field2057 = -arg0 * this.field2051 - this.field2060 * arg1 - this.field2054 * arg2 >> 15;
        this.field2050 = -arg0 * this.field2055 - this.field2052 * arg1 - this.field2058 * arg2 >> 15;
        this.field2053 = -arg0 * this.field2059 - this.field2056 * arg1 - this.field2061 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public final void method990(int arg0) {
        int var2 = class21.field397[arg0 & 0x3FFF];
        int var3 = class21.field385[arg0 & 0x3FFF];
        int var4 = this.field2051;
        int var5 = this.field2060;
        int var6 = this.field2054;
        int var7 = this.field2057;
        this.field2051 = this.field2059 * var3 + var2 * var4 >> 15;
        this.field2059 = this.field2059 * var2 - var3 * var4 >> 15;
        this.field2060 = this.field2056 * var3 + var2 * var5 >> 15;
        this.field2056 = this.field2056 * var2 - var3 * var5 >> 15;
        this.field2054 = this.field2061 * var3 + var2 * var6 >> 15;
        this.field2061 = this.field2061 * var2 - var3 * var6 >> 15;
        this.field2057 = this.field2053 * var3 + var2 * var7 >> 15;
        this.field2053 = this.field2053 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!se", name = "ZA", descriptor = "(III)V")
    public final void method993(int arg0, int arg1, int arg2) {
        this.field2057 += arg0;
        this.field2050 += arg1;
        this.field2053 += arg2;
    }

    @OriginalMember(owner = "client!se", name = "X", descriptor = "([I)V")
    public final void method983(int[] arg0) {
        int var2 = arg0[0] - this.field2057;
        int var3 = arg0[1] - this.field2050;
        int var4 = arg0[2] - this.field2053;
        arg0[0] = this.field2059 * var4 + this.field2055 * var3 + this.field2051 * var2 >> 15;
        arg0[1] = this.field2056 * var4 + this.field2060 * var2 + this.field2052 * var3 >> 15;
        arg0[2] = this.field2061 * var4 + this.field2058 * var3 + this.field2054 * var2 >> 15;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class155() {
        this.method979();
    }

    @OriginalMember(owner = "client!se", name = "R", descriptor = "(III)V")
    public final void method982(int arg0, int arg1, int arg2) {
        this.field2055 = this.field2059 = this.field2060 = this.field2056 = this.field2054 = this.field2058 = 0;
        this.field2051 = this.field2052 = this.field2061 = 32768;
        this.field2057 = arg0;
        this.field2050 = arg1;
        this.field2053 = arg2;
    }
}
