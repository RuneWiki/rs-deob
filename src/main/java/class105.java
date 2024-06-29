import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class105 extends class313 {

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    private int field1753 = 4;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    private int field1757 = 4;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "S")
    public static short field1754 = 1;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field1758 = 50;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Lcg;")
    public static class49 field1752;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Lvh;")
    public static class61 field1756;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIII)I", line = 5)
    public static final int method899(boolean arg0, int arg1, int arg2, int arg3) {
        field1760++;
        if (arg0) {
            field1752 = (class49) null;
        }
        return arg3 < arg2 ? arg2 : (arg1 >= arg3 ? arg3 : arg1);
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V", line = 18)
    public static void method900(int arg0) {
        field1756 = null;
        if (arg0 != 2) {
            field1756 = (class61) null;
        }
        field1752 = null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)Lli;", line = 34)
    public static final class241 method901(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4150; var4++) {
            class241 var5 = var3.field4147[var4];
            if ((var5.field3936 >> 29 & 0x3L) == 2L && var5.field3932 == arg1 && var5.field3929 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 151)
    public class105() {
        super(1, false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILpi;)V", line = 62)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field1750++;
        if (arg0 == 0) {
            this.field1757 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field1753 = arg2.method2364(-9069);
        }
        if (arg1 != -17848) {
            this.method299(72, -35);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[I", line = 99)
    public final int[] method111(int arg0, int arg1) {
        field1751++;
        if (arg0 != 4) {
            method901(-97, -59, 105);
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = class133.field2269 / this.field1757;
            int var5 = class77.field1247 / this.field1753;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method2156(0, true, class77.field1247 * var6 / var5);
            } else {
                var7 = this.method2156(0, true, 0);
            }
            for (int var8 = 0; var8 < class133.field2269; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class133.field2269 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[[I", line = 161)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            method901(-19, 39, 67);
        }
        int[][] var3 = this.field4958.method2404(arg0, (byte) 118);
        if (this.field4958.field5463) {
            int var4 = class133.field2269 / this.field1757;
            int var5 = class77.field1247 / this.field1753;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method2161(0, arg1 + 2, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2161(0, 4, class77.field1247 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; var14 < class133.field2269; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class133.field2269 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        field1755++;
        return var3;
    }
}
