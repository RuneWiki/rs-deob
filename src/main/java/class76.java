import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class76 extends class112 {

    @OriginalMember(owner = "client!ib", name = "kc", descriptor = "Lkb;")
    private static class93 field1363 = method390("Your profile will be transferred in:", 0);

    @OriginalMember(owner = "client!ib", name = "rc", descriptor = "Lkb;")
    public static class93 field1370 = field1363;

    @OriginalMember(owner = "client!ib", name = "tc", descriptor = "Lkb;")
    private static class93 field1372 = method390("cyan:", 0);

    @OriginalMember(owner = "client!ib", name = "nc", descriptor = "Lkb;")
    public static class93 field1366 = field1372;

    @OriginalMember(owner = "client!ib", name = "oc", descriptor = "Lkb;")
    public static class93 field1367 = field1372;

    @OriginalMember(owner = "client!ib", name = "xc", descriptor = "Lnb;")
    public static class120 field1376 = new class120(100);

    @OriginalMember(owner = "client!ib", name = "yc", descriptor = "J")
    public static volatile long field1377 = 0L;

    @OriginalMember(owner = "client!ib", name = "Bc", descriptor = "Lkb;")
    private static class93 field1380 = method390("level)2", 0);

    @OriginalMember(owner = "client!ib", name = "Ac", descriptor = "Lkb;")
    public static class93 field1379 = field1380;

    @OriginalMember(owner = "client!ib", name = "mc", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ib", name = "pc", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ib", name = "qc", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ib", name = "sc", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ib", name = "uc", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ib", name = "wc", descriptor = "Lme;")
    public static class114 field1375;

    @OriginalMember(owner = "client!ib", name = "vc", descriptor = "Lbb;")
    public static class13 field1374;

    @OriginalMember(owner = "client!ib", name = "lc", descriptor = "Lve;")
    public class195 field1364;

    @OriginalMember(owner = "client!ib", name = "zc", descriptor = "[I")
    public static int[] field1378;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public static void method389(int arg0) {
        field1374 = null;
        field1378 = null;
        field1367 = null;
        field1363 = null;
        field1375 = null;
        if (arg0 == 4) {
            field1366 = null;
            field1380 = null;
            field1376 = null;
            field1372 = null;
            field1379 = null;
            field1370 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1371;
        if (this.field1364 != null) {
            class37 var10 = ~super.field2077 != 0 && ~super.field2062 == -1 ? class39.method213(-10639, super.field2077) : null;
            class37 var11 = super.field2054 == -1 || ~super.field2054 == ~super.field2015 && var10 != null ? null : class39.method213(-10639, super.field2054);
            class52 var12 = this.field1364.method1250(super.field2012, var10, var11, super.field2018, (byte) 11);
            if (var12 != null) {
                var12.method269();
                super.field73 = var12.field73;
                if (~this.field1364.field3801 != -1 && this.field1364.field3799 != 0) {
                    int var13 = class150.field2896[arg0];
                    short var14 = this.field1364.field3801;
                    short var15 = this.field1364.field3799;
                    int var16 = class150.field2888[arg0];
                    int var17 = -var14 / 2;
                    int var18 = -var15 / 2;
                    int var19 = var16 * var18 + -(var13 * var17) >> 16;
                    int var20 = var13 * var18 + var16 * var17 >> 16;
                    int var21 = -var15 / 2;
                    int var22 = class189.method1226(super.field2045 + var19, -1, super.field2032 + var20, class114.field2145);
                    int var23 = var14 / 2;
                    int var24 = var16 * var21 + -(var13 * var23) >> 16;
                    int var25 = var13 * var21 - -(var16 * var23) >> 16;
                    int var26 = -var14 / 2;
                    int var27 = class189.method1226(super.field2045 + var24, -1, super.field2032 + var25, class114.field2145);
                    int var28 = var15 / 2;
                    int var29 = var14 / 2;
                    int var30 = var16 * var28 + -(var13 * var26) >> 16;
                    int var31 = var15 / 2;
                    int var32 = var13 * var28 + var16 * var26 >> 16;
                    int var33 = class189.method1226(super.field2045 + var30, -1, super.field2032 + var32, class114.field2145);
                    int var34 = var13 * var31 + var16 * var29 >> 16;
                    int var35 = var16 * var31 - var13 * var29 >> 16;
                    int var36 = class189.method1226(super.field2045 - -var35, -1, super.field2032 + var34, class114.field2145);
                    int var37 = var36 > var33 ? var33 : var36;
                    int var38 = var27 >= var36 ? var36 : var27;
                    int var39 = ~var27 >= ~var22 ? var27 : var22;
                    int var40 = ~var33 < ~var22 ? var22 : var33;
                    int var41 = (int) (Math.atan2((double) (var39 - var37), (double) var15) * 320.0D) & 2047;
                    var12.method276(var41);
                    int var42 = 2047 & (int) (Math.atan2((double) (var40 - var38), (double) var14) * 320.0D);
                    int var43 = (var39 - -var40 + var37 + var38) / 4;
                    var12.method284(var42);
                    var12.method285(0, var43 - super.field2028, 0);
                }
                class52 var44 = null;
                if (super.field2040 != -1 && super.field2019 != -1) {
                    var44 = class176.method1163(super.field2040, -57).method298(false, super.field2019);
                    if (var44 != null) {
                        var44.method285(0, -super.field2052, 0);
                    }
                }
                if (var44 != null) {
                    var12 = ((class125) var12).method712(var44);
                }
                if (this.field1364.field3806 == 1) {
                    var12.field867 = true;
                }
                var12.method23(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;I)Lkb;")
    public static final class93 method390(String arg0, int arg1) {
        ++field1373;
        byte[] var2 = arg0.getBytes();
        int var3 = arg1;
        int var4 = var2.length;
        class93 var5 = new class93();
        var5.field1726 = new byte[var4];
        while (~var3 > ~var4) {
            int var6 = 255 & var2[var3++];
            if (~var6 >= -46 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 255;
                var5.field1726[var5.field1701++] = (byte) (var6 * 43 + -1768 + var7);
            } else if (~var6 != -1) {
                var5.field1726[var5.field1701++] = (byte) var6;
            }
        }
        var5.method524(62);
        return var5.method504((byte) 109);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lh;IB)Lkb;")
    public static final class93 method391(class65 arg0, int arg1, byte arg2) {
        ++field1368;
        if (!class177.method1171(-218, arg1, class178.method1173(arg0, arg2 + 104)) && arg0.field1079 == null) {
            return null;
        } else if (arg0.field1161 != null && ~arg1 > ~arg0.field1161.length && arg0.field1161[arg1] != null && ~arg0.field1161[arg1].method513(-112).method510(arg2 ^ 48) != -1) {
            return arg2 != 20 ? null : arg0.field1161[arg1];
        } else {
            return class135.field2620 ? class203.method1321(new class93[] { class127.field2388, class67.method357((byte) -88, arg1) }, arg2 ^ 6) : null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)Z")
    public final boolean method190(byte arg0) {
        if (arg0 > -64) {
            return false;
        } else {
            ++field1369;
            return this.field1364 != null;
        }
    }
}
