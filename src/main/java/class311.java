import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class311 extends class206 {

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "I")
    public int field4928;

    @OriginalMember(owner = "client!pfa", name = "v", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "[Z")
    public boolean[] field4924;

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "[I")
    public int[] field4922;

    @OriginalMember(owner = "client!pfa", name = "t", descriptor = "[I")
    public int[] field4931;

    @OriginalMember(owner = "client!pfa", name = "y", descriptor = "[[I")
    public int[][] field4930;

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4936 = new String[] { method2629(method2628("\u0013TsB")), method2629(method2628("\u0006\u000f1\u0000D")), method2629(method2628("\rG~\u0000{U")), method2629(method2628("\rG~\u0000zU")), method2629(method2628("\rG~\u0000|U")), method2629(method2628("\rG~\u0000}U")), method2629(method2628("\rG~\u0000xU")), method2629(method2628("\rG~\u0000\u0005\u0014OvZ\u0007U")) };

    @OriginalMember(owner = "client!pfa", name = "u", descriptor = "I")
    public static int field4926 = -1;

    @OriginalMember(owner = "client!pfa", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4925 = new BigInteger(method2629(method2628("L\u0011/\u001e\b")), 16);

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4935 = new String[200];

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "Lel;")
    public static class573 field4934 = new class573(127, 1);

    @OriginalMember(owner = "client!pfa", name = "q", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!pfa", name = "w", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!pfa", name = "p", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!pfa", name = "x", descriptor = "Lfs;")
    public static class581 field4933;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
    public static void method2623(int arg0) {
        try {
            field4925 = null;
            field4933 = null;
            field4934 = null;
            field4935 = null;
            if (arg0 > -12) {
                field4926 = -68;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4936[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILcn;)Lcn;")
    public static final class541 method2624(int arg0, class541 arg1) {
        try {
            field4927++;
            if (arg1.field8079 != -1) {
                return class461.method3513(arg1.field8079, arg0 ^ 0x290C);
            }
            if (arg0 != 10616) {
                method2623(53);
            }
            int var2 = arg1.field8034 >>> 16;
            class342 var3 = new class342(class661.field9563);
            for (class454 var4 = (class454) var3.method2840(-128); var4 != null; var4 = (class454) var3.method2838(90)) {
                if (var4.field6640 == var2) {
                    return class461.method3513((int) var4.field3177, 125);
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4936[6] + arg0 + ',' + (arg1 == null ? field4936[0] : field4936[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;Z[BI)I")
    public static final int method2625(String arg0, boolean arg1, byte[] arg2, int arg3) {
        try {
            field4920++;
            int var4 = arg3;
            int var5 = arg0.length();
            if (arg1) {
                method2627(69, 112, null, false);
            }
            for (int var6 = 0; var6 < var5; var6 += 4) {
                int var7 = class730.method5326(-1, arg0.charAt(var6));
                int var8 = var5 <= var6 + 1 ? -1 : class730.method5326(-1, arg0.charAt(var6 + 1));
                int var9 = var5 <= var6 + 2 ? -1 : class730.method5326(-1, arg0.charAt(var6 + 2));
                int var10 = var5 > (var6 + 3) ? class730.method5326(-1, arg0.charAt(var6 + 3)) : -1;
                arg2[arg3++] = (byte) class544.method4107(var7 << 2, var8 >>> 4);
                if (var9 == -1) {
                    break;
                }
                arg2[arg3++] = (byte) class544.method4107(class291.method2359(15, var8) << 4, var9 >>> 2);
                if (var10 == -1) {
                    break;
                }
                arg2[arg3++] = (byte) class544.method4107(class291.method2359(var9, 3) << 6, var10);
            }
            return arg3 - var4;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field4936[5] + (arg0 == null ? field4936[0] : field4936[1]) + ',' + arg1 + ',' + (arg2 == null ? field4936[0] : field4936[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BLeu;)I")
    public static final int method2626(byte arg0, class505 arg1) {
        try {
            field4921++;
            if (class671.field9751 == arg1) {
                return 6407;
            } else if (class215.field3276 == arg1) {
                return 6408;
            } else if (class667.field9691 == arg1) {
                return 6406;
            } else if (class65.field675 == arg1) {
                return 6409;
            } else if (class172.field2400 == arg1) {
                return 6410;
            } else if (class218.field3374 == arg1) {
                return 6145;
            } else {
                if (arg0 != -117) {
                    field4926 = -78;
                }
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4936[4] + arg0 + ',' + (arg1 == null ? field4936[0] : field4936[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IILha;Z)Ldaa;")
    public static final class12 method2627(int arg0, int arg1, class66 arg2, boolean arg3) {
        try {
            field4929++;
            if (arg1 == -1) {
                return null;
            }
            if (class151.field1867 != null) {
                for (int var4 = 0; var4 < class151.field1867.length; var4++) {
                    if (class151.field1867[var4] == arg1) {
                        return class613.field8960[var4];
                    }
                }
            }
            class12 var5 = (class12) class130.field1524.method1558((byte) 96, (long) arg1);
            if (arg0 != -2130806110) {
                field4926 = 28;
            }
            if (var5 != null) {
                if (arg3 && var5.field140 == null) {
                    class578 var6 = class350.method2876(7, arg1, class657.field9488);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field140 = var6;
                }
                return var5;
            }
            class481[] var7 = class481.method3677(class451.field6617, arg1);
            if (var7 == null) {
                return null;
            }
            class578 var8 = class350.method2876(arg0 + 2130806117, arg1, class657.field9488);
            if (var8 == null) {
                return null;
            }
            class12 var9;
            if (arg3) {
                var9 = new class12(arg2.method563(var8, var7, true), var8);
            } else {
                var9 = new class12(arg2.method563(var8, var7, true));
            }
            class130.field1524.method1556((long) arg1, var9, 1);
            return var9;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4936[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4936[0] : field4936[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I[B)V")
    public class311(int arg0, byte[] arg1) {
        try {
            this.field4928 = arg0;
            class163 var3 = new class163(arg1);
            this.field4923 = var3.method1455((byte) 62);
            this.field4924 = new boolean[this.field4923];
            this.field4922 = new int[this.field4923];
            this.field4931 = new int[this.field4923];
            this.field4930 = new int[this.field4923][];
            for (int var4 = 0; var4 < this.field4923; var4++) {
                this.field4931[var4] = var3.method1455((byte) 62);
                if (this.field4931[var4] == 6) {
                    this.field4931[var4] = 2;
                }
            }
            for (int var5 = 0; var5 < this.field4923; var5++) {
                this.field4924[var5] = var3.method1455((byte) 62) == 1;
            }
            for (int var6 = 0; var6 < this.field4923; var6++) {
                this.field4922[var6] = var3.method1445((byte) 126);
            }
            for (int var7 = 0; var7 < this.field4923; var7++) {
                this.field4930[var7] = new int[var3.method1455((byte) 62)];
            }
            for (int var8 = 0; var8 < this.field4923; var8++) {
                for (int var9 = 0; var9 < this.field4930[var8].length; var9++) {
                    this.field4930[var8][var9] = var3.method1455((byte) 62);
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4936[7] + arg0 + ',' + (arg1 == null ? field4936[0] : field4936[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2628(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2629(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
