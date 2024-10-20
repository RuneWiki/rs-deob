package deob;

@ObfuscatedName("dn")
public class class121 {

    @ObfuscatedName("dn.w")
    public static boolean field1688 = false;

    @ObfuscatedName("dn.m")
    public static int field1682 = 0;

    @ObfuscatedName("dn.q")
    public static int field1681 = 0;

    @ObfuscatedName("dn.b")
    public static boolean field1684 = false;

    @ObfuscatedName("dn.p")
    public static int field1687 = 0;

    @ObfuscatedName("dn.g")
    public static long[] field1689 = new long[1000];

    public class121() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.w(J)Z")
    public static boolean method456(long arg0) {
        return arg0 != 0L && !method4559(arg0);
    }

    @ObfuscatedName("dd.m(II)J")
    public static long method2309(int arg0) {
        return field1689[arg0];
    }

    @ObfuscatedName("fw.q(IS)I")
    public static int method3227(int arg0) {
        return method60(field1689[arg0]);
    }

    @ObfuscatedName("n.x(J)I")
    public static int method60(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("bp.j(II)I")
    public static int method1031(int arg0) {
        long var1 = field1689[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("jx.a(J)Z")
    public static boolean method4559(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("j.l(J)I")
    public static int method94(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("v.s(IIB)V")
    public static final void method438(int arg0, int arg1) {
        field1682 = arg0;
        field1681 = arg1;
        field1688 = true;
        field1687 = 0;
        field1684 = false;
    }

    @ObfuscatedName("hy.p(I)V")
    public static final void method4012() {
        field1688 = false;
        field1687 = 0;
    }

    @ObfuscatedName("ew.g(I)I")
    public static final int method3031() {
        return field1681;
    }

    @ObfuscatedName("ah.y(B)V")
    public static final void method611() {
        if (field1684) {
            return;
        }
        int var0 = Statics.field1768;
        int var1 = Statics.field1769;
        int var2 = Statics.field1771;
        int var3 = Statics.field1785;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1682 - Statics.field1706) * var4 / class123.field1712;
        int var7 = (field1681 - Statics.field1714) * var4 / class123.field1712;
        int var8 = (field1682 - Statics.field1706) * var5 / class123.field1712;
        int var9 = (field1681 - Statics.field1714) * var5 / class123.field1712;
        int var10 = class123.method2627(var7, var4, var1, var0);
        int var11 = class123.method2629(var7, var4, var1, var0);
        int var13 = class123.method2627(var9, var5, var1, var0);
        int var14 = class123.method2629(var9, var5, var1, var0);
        int var16 = class123.method2625(var6, var11, var3, var2);
        int var17 = class123.method2626(var6, var11, var3, var2);
        int var19 = class123.method2625(var8, var14, var3, var2);
        int var20 = class123.method2626(var8, var14, var3, var2);
        Statics.field1685 = (var16 + var19) / 2;
        Statics.field1937 = (var10 + var13) / 2;
        Statics.field3738 = (var17 + var20) / 2;
        Statics.field1057 = (var19 - var16) / 2;
        Statics.field3663 = (var13 - var10) / 2;
        Statics.field1686 = (var20 - var17) / 2;
        Statics.field3693 = Math.abs(Statics.field1057);
        Statics.field1981 = Math.abs(Statics.field3663);
        Statics.field1683 = Math.abs(Statics.field1686);
    }
}
