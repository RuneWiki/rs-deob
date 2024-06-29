import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class428 extends class250 {

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public int field5897;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public int field5898;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public int field5899;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public int field5900;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public int field5901;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public int field5902;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public int field5903;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public int field5904;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public int field5905;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public int field5906;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public int field5907;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public int field5908;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIII)V")
    public final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class432.field5957[arg3 & 0x3FFF];
        int var8 = class432.field5955[arg3 & 0x3FFF];
        int var9 = class432.field5957[arg4 & 0x3FFF];
        int var10 = class432.field5955[arg4 & 0x3FFF];
        int var11 = class432.field5957[arg5 & 0x3FFF];
        int var12 = class432.field5955[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field5899 = var9 * var11 + var10 * var14 >> 15;
        this.field5905 = -var9 * var12 + var10 * var13 >> 15;
        this.field5898 = var7 * var10 >> 15;
        this.field5907 = var7 * var12 >> 15;
        this.field5908 = var7 * var11 >> 15;
        this.field5903 = -var8;
        this.field5906 = -var10 * var11 + var9 * var14 >> 15;
        this.field5900 = var9 * var13 + var10 * var12 >> 15;
        this.field5901 = var7 * var9 >> 15;
        this.field5897 = -arg0 * this.field5899 - this.field5907 * arg1 - this.field5906 * arg2 >> 15;
        this.field5904 = -arg0 * this.field5905 - this.field5908 * arg1 - this.field5900 * arg2 >> 15;
        this.field5902 = -arg0 * this.field5898 - this.field5903 * arg1 - this.field5901 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "()Lit;")
    public final class428 method2515() {
        class428 var1 = new class428();
        var1.field5899 = this.field5899;
        var1.field5907 = this.field5907;
        var1.field5906 = this.field5906;
        var1.field5897 = this.field5897;
        var1.field5905 = this.field5905;
        var1.field5908 = this.field5908;
        var1.field5900 = this.field5900;
        var1.field5904 = this.field5904;
        var1.field5898 = this.field5898;
        var1.field5903 = this.field5903;
        var1.field5901 = this.field5901;
        var1.field5902 = this.field5902;
        return var1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(III)V")
    public final void method1382(int arg0, int arg1, int arg2) {
        this.field5905 = this.field5898 = this.field5907 = this.field5903 = this.field5906 = this.field5900 = 0;
        this.field5899 = this.field5908 = this.field5901 = 32768;
        this.field5897 = arg0;
        this.field5904 = arg1;
        this.field5902 = arg2;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public final void method1380(int arg0, int arg1, int arg2) {
        this.field5897 += arg0;
        this.field5904 += arg1;
        this.field5902 += arg2;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ldr;)V")
    public final void method1376(class250 arg0) {
        class428 var2 = (class428) arg0;
        this.field5899 = var2.field5899;
        this.field5907 = var2.field5907;
        this.field5906 = var2.field5906;
        this.field5897 = var2.field5897;
        this.field5905 = var2.field5905;
        this.field5908 = var2.field5908;
        this.field5900 = var2.field5900;
        this.field5904 = var2.field5904;
        this.field5898 = var2.field5898;
        this.field5903 = var2.field5903;
        this.field5901 = var2.field5901;
        this.field5902 = var2.field5902;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III[I)V")
    public final void method1385(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field5906 * arg2 + this.field5907 * arg1 + this.field5899 * arg0 >> 15) + this.field5897;
        arg3[1] = (this.field5900 * arg2 + this.field5908 * arg1 + this.field5905 * arg0 >> 15) + this.field5904;
        arg3[2] = (this.field5901 * arg2 + this.field5903 * arg1 + this.field5898 * arg0 >> 15) + this.field5902;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([I)V")
    public final void method1375(int[] arg0) {
        int var2 = arg0[0] - this.field5897;
        int var3 = arg0[1] - this.field5904;
        int var4 = arg0[2] - this.field5902;
        arg0[0] = this.field5898 * var4 + this.field5905 * var3 + this.field5899 * var2 >> 15;
        arg0[1] = this.field5903 * var4 + this.field5908 * var3 + this.field5907 * var2 >> 15;
        arg0[2] = this.field5901 * var4 + this.field5906 * var2 + this.field5900 * var3 >> 15;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
    public final void method1379(int arg0) {
        this.field5899 = 32768;
        this.field5908 = this.field5901 = class432.field5957[arg0 & 0x3FFF];
        this.field5903 = class432.field5955[arg0 & 0x3FFF];
        this.field5900 = -this.field5903;
        this.field5907 = this.field5906 = this.field5897 = this.field5905 = this.field5904 = this.field5898 = this.field5902 = 0;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
    public final void method1378(int arg0) {
        int var2 = class432.field5957[arg0 & 0x3FFF];
        int var3 = class432.field5955[arg0 & 0x3FFF];
        int var4 = this.field5899;
        int var5 = this.field5907;
        int var6 = this.field5906;
        int var7 = this.field5897;
        this.field5899 = this.field5898 * var3 + var2 * var4 >> 15;
        this.field5898 = this.field5898 * var2 - var3 * var4 >> 15;
        this.field5907 = this.field5903 * var3 + var2 * var5 >> 15;
        this.field5903 = this.field5903 * var2 - var3 * var5 >> 15;
        this.field5906 = this.field5901 * var3 + var2 * var6 >> 15;
        this.field5901 = this.field5901 * var2 - var3 * var6 >> 15;
        this.field5897 = this.field5902 * var3 + var2 * var7 >> 15;
        this.field5902 = this.field5902 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    public final void method1384(int arg0) {
        this.field5901 = 32768;
        this.field5899 = this.field5908 = class432.field5957[arg0 & 0x3FFF];
        this.field5905 = class432.field5955[arg0 & 0x3FFF];
        this.field5907 = -this.field5905;
        this.field5906 = this.field5897 = this.field5900 = this.field5904 = this.field5898 = this.field5903 = this.field5902 = 0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
    public final void method1388() {
        this.field5905 = this.field5898 = this.field5907 = this.field5903 = this.field5906 = this.field5900 = this.field5897 = this.field5904 = this.field5902 = 0;
        this.field5899 = this.field5908 = this.field5901 = 32768;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public final void method1374(int arg0) {
        int var2 = class432.field5957[arg0 & 0x3FFF];
        int var3 = class432.field5955[arg0 & 0x3FFF];
        int var4 = this.field5905;
        int var5 = this.field5908;
        int var6 = this.field5900;
        int var7 = this.field5904;
        this.field5905 = var2 * var4 - this.field5898 * var3 >> 15;
        this.field5898 = this.field5898 * var2 + var3 * var4 >> 15;
        this.field5908 = var2 * var5 - this.field5903 * var3 >> 15;
        this.field5903 = this.field5903 * var2 + var3 * var5 >> 15;
        this.field5900 = var2 * var6 - this.field5901 * var3 >> 15;
        this.field5901 = this.field5901 * var2 + var3 * var6 >> 15;
        this.field5904 = var2 * var7 - this.field5902 * var3 >> 15;
        this.field5902 = this.field5902 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public final void method1373(int arg0) {
        this.field5908 = 32768;
        this.field5899 = this.field5901 = class432.field5957[arg0 & 0x3FFF];
        this.field5906 = class432.field5955[arg0 & 0x3FFF];
        this.field5898 = -this.field5906;
        this.field5907 = this.field5897 = this.field5905 = this.field5900 = this.field5904 = this.field5903 = this.field5902 = 0;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
    public class428() {
        this.method1388();
    }
}
