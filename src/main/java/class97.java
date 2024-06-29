import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class97 {

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
    private boolean field1297 = true;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    private int field1306 = -1;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "[Lka;")
    private class314[] field1305;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Lka;")
    private class314 field1301;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "[Lka;")
    private class314[] field1300;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "[[I")
    public static int[][] field1296 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "[Z")
    public static boolean[] field1307 = new boolean[200];

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "Lqg;")
    private class307 field1304;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1312;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIILeq;III)V")
    public final void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, int arg7, int arg8, int arg9) {
        int var11 = arg1 + arg4 & 0x3FFF;
        field1313++;
        if (this.field1298 == -1) {
            arg6.method770(arg2, arg8, arg5, arg9, arg3, 0);
        } else {
            class118 var12 = class136.field1758.method432(this.field1298, true);
            if (this.field1304 == null && class136.field1758.method428(-14471, this.field1298)) {
                int[] var13 = var12.field1523 ? class136.field1758.method429(this.field1298, this.field1310, false, 0.7F, -2472, this.field1310) : class136.field1758.method430(0.7F, this.field1310, false, this.field1310, (byte) -21, this.field1298);
                this.field1304 = arg6.method784(var13, 0, this.field1310, this.field1310, this.field1310);
            }
            if (!var12.field1523) {
                arg6.method770(arg2, arg8, arg5, arg9, arg3, 0);
            }
            if (this.field1304 != null) {
                int var14 = var12.field1523 ? 0 : 1;
                int var15 = arg0 * arg9 / -4096;
                int var16;
                for (var16 = arg9 * var11 / 4096 + (arg5 - arg9) / 2; var16 > arg9; var16 -= arg9) {
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (arg9 < var15) {
                    var15 -= arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg5; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field1304.method86(arg2 + var17, arg8 + var18, arg9, arg9, 1, 0, var14);
                    }
                }
            }
        }
        if (arg7 >= 116) {
            for (int var19 = this.field1311 - 1; var19 >= 0; var19--) {
                this.field1300[var19].method1894(arg6, arg2, arg8, arg5, arg9, arg0, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
    public final void method591(byte arg0) {
        field1309++;
        if (arg0 != -103) {
            this.field1305 = null;
        }
        if (this.field1305 != null) {
            for (int var2 = 0; var2 < this.field1305.length; var2++) {
                this.field1305[var2].method1896();
            }
        }
        this.field1304 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method592(int arg0) {
        field1307 = null;
        field1312 = null;
        field1296 = null;
        int var1 = -121 / ((arg0 - 14) / 57);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZILeq;)Z")
    public final boolean method593(boolean arg0, int arg1, class134 arg2) {
        if (!arg0) {
            return true;
        }
        field1308++;
        if (this.field1306 != arg1) {
            this.field1306 = arg1;
            int var4 = class340.method2064(68, arg1);
            if (var4 > arg1) {
                var4 = class70.method477(arg1, !arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1310 != var4) {
                this.field1304 = null;
                this.field1310 = var4;
            }
            if (this.field1305 != null) {
                this.field1311 = 0;
                int[] var5 = new int[this.field1305.length];
                for (int var6 = 0; var6 < this.field1305.length; var6++) {
                    class314 var7 = this.field1305[var6];
                    if (var7.method1889(this.field1302, this.field1303, this.field1299, this.field1306)) {
                        var5[this.field1311] = var7.field4612;
                        this.field1300[this.field1311++] = var7;
                    }
                }
                class198.method1235(-81, 0, var5, this.field1300, this.field1311 - 1);
            }
            this.field1297 = true;
        }
        boolean var8 = false;
        if (this.field1297) {
            this.field1297 = false;
            for (int var9 = this.field1311 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1300[var9].method1891(arg2, this.field1301);
                this.field1297 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I[Lka;IIII)V")
    public class97(int arg0, class314[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1298 = arg0;
        this.field1302 = arg3;
        this.field1299 = arg5;
        this.field1303 = arg4;
        this.field1305 = arg1;
        if (arg1 == null) {
            this.field1301 = null;
            this.field1300 = null;
        } else {
            this.field1300 = new class314[arg1.length];
            this.field1301 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
