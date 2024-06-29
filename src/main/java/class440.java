import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class440 extends class42 {

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    private int field6864;

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
    private int field6875;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
    private int field6874;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
    private int field6867;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
    private int field6870;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "Lvf;")
    private class159 field6866;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
    private int field6869;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6876 = new String[] { method3453(method3452("*>]XZ")), method3453(method3452("1<\u001fv")), method3453(method3452("$g]4\u000f")), method3453(method3452("*>]&\u001b1 \u0007$Z")), method3453(method3452("*>]YZ")), method3453(method3452("*>]^Z")), method3453(method3452("*>][Z")) };

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "Leh;")
    public static class380 field6863 = new class380();

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "Ldka;")
    private class12 field6862;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "Lgda;")
    public static class58 field6872;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "Lwc;")
    public static class71 field6871;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)Ldka;")
    public final class12 method439(int arg0) {
        try {
            field6865++;
            int var2 = -54 % ((38 - arg0) / 33);
            if (this.field6862 == null) {
                class212.field3355[5] = this.field6875;
                class158 var3 = this.field6866.field864;
                class212.field3355[2] = this.field6874;
                class212.field3355[1] = this.field6870;
                class212.field3355[4] = this.field6869;
                class212.field3355[3] = this.field6867;
                class212.field3355[0] = this.field6864;
                boolean var4 = false;
                int var5 = 0;
                for (int var6 = 0; var6 < 6; var6++) {
                    if (!var3.method1417((byte) -41, class212.field3355[var6])) {
                        return null;
                    }
                    class304 var7 = var3.method1419(class212.field3355[var6], -108);
                    int var8 = var7.field4911 ? 64 : 128;
                    if (var5 < var8) {
                        var5 = var8;
                    }
                    if (var7.field4904 > 0) {
                        var4 = true;
                    }
                }
                for (int var9 = 0; var9 < 6; var9++) {
                    class350.field5666[var9] = var3.method1420(var5, false, var5, class212.field3355[var9], 1.0F, -7385);
                }
                this.field6862 = new class12(this.field6866, 6407, var5, var4, class350.field5666);
            }
            return this.field6862;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6876[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V")
    public static final void method3449(byte arg0) {
        try {
            field6868++;
            if (arg0 == 92 && class666.field9479) {
                while (true) {
                    while (class696.field10027.length > class747.field11031) {
                        class139 var1 = class696.field10027[class747.field11031];
                        if (var1 != null && var1.field1950 == -1) {
                            if (class620.field8959 == null) {
                                class620.field8959 = class709.field10268.method4776(var1.field1948, 0);
                            }
                            int var2 = class620.field8959.field1960;
                            if (var2 == -1) {
                                return;
                            }
                            class747.field11031++;
                            class620.field8959 = null;
                            var1.field1950 = var2;
                        } else {
                            class747.field11031++;
                        }
                    }
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6876[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method3450(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            if (arg2 <= 61) {
                method3449((byte) 60);
            }
            if (arg0 == arg7 && arg4 == arg9 && arg5 == arg8 && arg1 == arg6) {
                class149.method1355(arg6, arg9, arg5, arg7, arg3, false);
            } else {
                int var10 = arg7;
                int var11 = arg9;
                int var12 = arg7 * 3;
                int var13 = arg9 * 3;
                int var14 = arg0 * 3;
                int var15 = arg4 * 3;
                int var16 = arg8 * 3;
                int var17 = arg1 * 3;
                int var18 = arg5 + var14 - arg7 - var16;
                int var19 = arg6 + var15 - var17 - arg9;
                int var20 = var16 + var12 - var14 - var14;
                int var21 = var13 + var17 - var15 - var15;
                int var22 = var14 - var12;
                int var23 = var15 - var13;
                for (int var24 = 128; var24 <= 4096; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var24 * var25 >> 12;
                    int var27 = var18 * var26;
                    int var28 = var19 * var26;
                    int var29 = var20 * var25;
                    int var30 = var21 * var25;
                    int var31 = var22 * var24;
                    int var32 = var23 * var24;
                    int var33 = (var29 + var31 + var27 >> 12) + arg7;
                    int var34 = arg9 + (var28 + var32 + var30 >> 12);
                    class149.method1355(var34, var11, var33, var10, arg3, false);
                    var10 = var33;
                    var11 = var34;
                }
            }
            field6873++;
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field6876[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)V")
    public static void method3451(int arg0) {
        try {
            field6871 = null;
            if (arg0 != 3406) {
                field6871 = null;
            }
            field6872 = null;
            field6863 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6876[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lvf;IIIIII)V")
    public class440(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.field6864 = arg1;
            this.field6875 = arg6;
            this.field6874 = arg3;
            this.field6867 = arg4;
            this.field6870 = arg2;
            this.field6866 = arg0;
            this.field6869 = arg5;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6876[3] + (arg0 == null ? field6876[1] : field6876[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3452(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3453(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
