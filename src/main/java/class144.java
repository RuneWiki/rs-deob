import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class144 extends class361 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public final void method604(int arg0, int arg1, int arg2) {
        this.field1917 += arg0;
        this.field1925 += arg1;
        this.field1918 += arg2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[I)V")
    public final void method606(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (this.field1919 * arg2 + this.field1926 * arg0 + this.field1923 * arg1 >> 15) + this.field1917;
        arg3[1] = (this.field1915 * arg2 + this.field1922 * arg0 + this.field1921 * arg1 >> 15) + this.field1925;
        arg3[2] = (this.field1916 * arg2 + this.field1924 * arg1 + this.field1920 * arg0 >> 15) + this.field1918;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public final void method615(int arg0) {
        this.field1926 = 32768;
        this.field1921 = this.field1916 = class110.field1452[arg0 & 0x3FFF];
        this.field1924 = class110.field1450[arg0 & 0x3FFF];
        this.field1915 = -this.field1924;
        this.field1923 = this.field1919 = this.field1917 = this.field1922 = this.field1925 = this.field1920 = this.field1918 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public final void method610(int arg0) {
        this.field1921 = 32768;
        this.field1926 = this.field1916 = class110.field1452[arg0 & 0x3FFF];
        this.field1919 = class110.field1450[arg0 & 0x3FFF];
        this.field1920 = -this.field1919;
        this.field1923 = this.field1917 = this.field1922 = this.field1915 = this.field1925 = this.field1924 = this.field1918 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
    public final void method601() {
        this.field1922 = this.field1920 = this.field1923 = this.field1924 = this.field1919 = this.field1915 = this.field1917 = this.field1925 = this.field1918 = 0;
        this.field1926 = this.field1921 = this.field1916 = 32768;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
    public final void method603(int arg0) {
        int var2 = class110.field1452[arg0 & 0x3FFF];
        int var3 = class110.field1450[arg0 & 0x3FFF];
        int var4 = this.field1922;
        int var5 = this.field1921;
        int var6 = this.field1915;
        int var7 = this.field1925;
        this.field1922 = var2 * var4 - this.field1920 * var3 >> 15;
        this.field1920 = this.field1920 * var2 + var3 * var4 >> 15;
        this.field1921 = var2 * var5 - this.field1924 * var3 >> 15;
        this.field1924 = this.field1924 * var2 + var3 * var5 >> 15;
        this.field1915 = var2 * var6 - this.field1916 * var3 >> 15;
        this.field1916 = this.field1916 * var2 + var3 * var6 >> 15;
        this.field1925 = var2 * var7 - this.field1918 * var3 >> 15;
        this.field1918 = this.field1918 * var2 + var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
    public final void method611(int arg0, int arg1, int arg2) {
        this.field1922 = this.field1920 = this.field1923 = this.field1924 = this.field1919 = this.field1915 = 0;
        this.field1926 = this.field1921 = this.field1916 = 32768;
        this.field1917 = arg0;
        this.field1925 = arg1;
        this.field1918 = arg2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public final void method607(int arg0) {
        int var2 = class110.field1452[arg0 & 0x3FFF];
        int var3 = class110.field1450[arg0 & 0x3FFF];
        int var4 = this.field1926;
        int var5 = this.field1923;
        int var6 = this.field1919;
        int var7 = this.field1917;
        this.field1926 = this.field1920 * var3 + var2 * var4 >> 15;
        this.field1920 = this.field1920 * var2 - var3 * var4 >> 15;
        this.field1923 = this.field1924 * var3 + var2 * var5 >> 15;
        this.field1924 = this.field1924 * var2 - var3 * var5 >> 15;
        this.field1919 = this.field1916 * var3 + var2 * var6 >> 15;
        this.field1916 = this.field1916 * var2 - var3 * var6 >> 15;
        this.field1917 = this.field1918 * var3 + var2 * var7 >> 15;
        this.field1918 = this.field1918 * var2 - var3 * var7 >> 15;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public final void method609(int arg0) {
        this.field1916 = 32768;
        this.field1926 = this.field1921 = class110.field1452[arg0 & 0x3FFF];
        this.field1922 = class110.field1450[arg0 & 0x3FFF];
        this.field1923 = -this.field1922;
        this.field1919 = this.field1917 = this.field1915 = this.field1925 = this.field1920 = this.field1924 = this.field1918 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public final void method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class110.field1452[arg3 & 0x3FFF];
        int var8 = class110.field1450[arg3 & 0x3FFF];
        int var9 = class110.field1452[arg4 & 0x3FFF];
        int var10 = class110.field1450[arg4 & 0x3FFF];
        int var11 = class110.field1452[arg5 & 0x3FFF];
        int var12 = class110.field1450[arg5 & 0x3FFF];
        int var13 = var8 * var11 >> 15;
        int var14 = var8 * var12 >> 15;
        this.field1926 = var9 * var11 + var10 * var14 >> 15;
        this.field1922 = -var9 * var12 + var10 * var13 >> 15;
        this.field1920 = var7 * var10 >> 15;
        this.field1923 = var7 * var12 >> 15;
        this.field1921 = var7 * var11 >> 15;
        this.field1924 = -var8;
        this.field1919 = -var10 * var11 + var9 * var14 >> 15;
        this.field1915 = var9 * var13 + var10 * var12 >> 15;
        this.field1916 = var7 * var9 >> 15;
        this.field1917 = -arg0 * this.field1926 - this.field1923 * arg1 - this.field1919 * arg2 >> 15;
        this.field1925 = -arg0 * this.field1922 - this.field1921 * arg1 - this.field1915 * arg2 >> 15;
        this.field1918 = -arg0 * this.field1920 - this.field1924 * arg1 - this.field1916 * arg2 >> 15;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()Lch;")
    public final class144 method892() {
        class144 var1 = new class144();
        var1.field1926 = this.field1926;
        var1.field1923 = this.field1923;
        var1.field1919 = this.field1919;
        var1.field1917 = this.field1917;
        var1.field1922 = this.field1922;
        var1.field1921 = this.field1921;
        var1.field1915 = this.field1915;
        var1.field1925 = this.field1925;
        var1.field1920 = this.field1920;
        var1.field1924 = this.field1924;
        var1.field1916 = this.field1916;
        var1.field1918 = this.field1918;
        return var1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([I)V")
    public final void method605(int[] arg0) {
        int var2 = arg0[0] - this.field1917;
        int var3 = arg0[1] - this.field1925;
        int var4 = arg0[2] - this.field1918;
        arg0[0] = this.field1920 * var4 + this.field1926 * var2 + this.field1922 * var3 >> 15;
        arg0[1] = this.field1924 * var4 + this.field1923 * var2 + this.field1921 * var3 >> 15;
        arg0[2] = this.field1916 * var4 + this.field1919 * var2 + this.field1915 * var3 >> 15;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljd;)V")
    public final void method614(class361 arg0) {
        class144 var2 = (class144) arg0;
        this.field1926 = var2.field1926;
        this.field1923 = var2.field1923;
        this.field1919 = var2.field1919;
        this.field1917 = var2.field1917;
        this.field1922 = var2.field1922;
        this.field1921 = var2.field1921;
        this.field1915 = var2.field1915;
        this.field1925 = var2.field1925;
        this.field1920 = var2.field1920;
        this.field1924 = var2.field1924;
        this.field1916 = var2.field1916;
        this.field1918 = var2.field1918;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class144() {
        this.method601();
    }
}
