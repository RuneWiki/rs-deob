import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 extends class129 {

    @OriginalMember(owner = "client!he", name = "S", descriptor = "Lqb;")
    public class113 field1288 = new class113();

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "Loa;")
    public class98 field1297 = new class98();

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Lbf;")
    private class14 field1282;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[Z")
    public static boolean[] field1274 = new boolean[100];

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "Lr;")
    private static class118 field1286 = class153.method1136(75, "Please try again)3");

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lr;")
    public static class118 field1270 = field1286;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Lr;")
    public static class118 field1283 = class153.method1136(125, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "Lr;")
    private static class118 field1294 = class153.method1136(103, "Drop");

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lr;")
    public static class118 field1289 = field1294;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "Lr;")
    private static class118 field1296 = class153.method1136(98, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Lr;")
    public static class118 field1284 = field1296;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "[I")
    public static int[] field1293;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "[[[B")
    public static byte[][][] field1273;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILod;II[I)V")
    private final void method486(int arg0, int arg1, class101 arg2, int arg3, int arg4, int[] arg5) {
        field1277++;
        if (~(this.field1282.field306[arg2.field2313] & 0x4) != arg3 && arg2.field2321 < 0) {
            int var7 = this.field1282.field321[arg2.field2313] / class85.field2084;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2338) / var7;
                if (var8 > arg1) {
                    arg2.field2338 += arg1 * var7;
                    break;
                }
                arg2.field2316.method132(arg5, arg0, var8);
                arg0 += var8;
                class50 var9 = arg2.field2316;
                int var10 = 262144 / var7;
                arg1 -= var8;
                int var11 = class85.field2084 / 100;
                if (var10 < var11) {
                    var11 = var10;
                }
                arg2.field2338 += var7 * var8 - 1048576;
                if (this.field1282.field347[arg2.field2313] == 0) {
                    arg2.field2316 = class50.method453(arg2.field2331, var9.method452(), var9.method435(), var9.method446());
                } else {
                    arg2.field2316 = class50.method453(arg2.field2331, var9.method452(), 0, var9.method446());
                    this.field1282.method128(arg2, arg2.field2342.field1637[arg2.field2324] < 0, arg3);
                    arg2.field2316.method437(var11, var9.method435());
                }
                if (arg2.field2342.field1637[arg2.field2324] < 0) {
                    arg2.field2316.method448(-1);
                }
                var9.method440(var11);
                var9.method132(arg5, arg0, arg4 - arg0);
                if (var9.method450()) {
                    this.field1297.method759(var9);
                }
            }
        }
        arg2.field2316.method132(arg5, arg0, arg1);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public static void method487(byte arg0) {
        if (arg0 != -100) {
            method492(false, true, 83, true, -84);
        }
        field1284 = null;
        field1274 = null;
        field1289 = null;
        field1283 = null;
        field1273 = null;
        field1293 = null;
        field1296 = null;
        field1294 = null;
        field1270 = null;
        field1286 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILod;I)V")
    private final void method488(int arg0, class101 arg1, int arg2) {
        if (arg2 != 0) {
            this.method122();
        }
        if ((this.field1282.field306[arg1.field2313] & 0x4) != 0 && arg1.field2321 < 0) {
            int var4 = this.field1282.field321[arg1.field2313] / class85.field2084;
            int var5 = (var4 + 1048575 - arg1.field2338) / var4;
            arg1.field2338 = arg0 * var4 + arg1.field2338 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field1282.field347[arg1.field2313] == 0) {
                    arg1.field2316 = class50.method453(arg1.field2331, arg1.field2316.method452(), arg1.field2316.method435(), arg1.field2316.method446());
                } else {
                    arg1.field2316 = class50.method453(arg1.field2331, arg1.field2316.method452(), 0, arg1.field2316.method446());
                    this.field1282.method128(arg1, arg1.field2342.field1637[arg1.field2324] < 0, -1);
                }
                if (arg1.field2342.field1637[arg1.field2324] < 0) {
                    arg1.field2316.method448(-1);
                }
                arg0 = arg1.field2338 / var4;
            }
        }
        field1272++;
        arg1.field2316.method114(arg0);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIBIII)V")
    public static final void method489(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1281++;
        int var7 = 2048 - arg0 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = 2048 - arg1 & 0x7FF;
        int var11 = arg4;
        if (var7 != 0) {
            int var12 = class58.field1346[var7];
            int var13 = class58.field1354[var7];
            int var14 = var9 * var12 - arg4 * var13 >> 16;
            var11 = var9 * var13 + arg4 * var12 >> 16;
            var9 = var14;
        }
        if (var10 != 0) {
            int var15 = class58.field1346[var10];
            int var16 = class58.field1354[var10];
            int var17 = var8 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var8 * var16 >> 16;
            var8 = var17;
        }
        class85.field2093 = arg5 - var9;
        class85.field2092 = arg0;
        class44.field1051 = arg2 - var11;
        class24.field580 = arg6 - var8;
        class1.field25 = arg1;
        if (arg3 != -96) {
            method490(53);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public static final void method490(int arg0) {
        if (class127.field2902 != null) {
            class127.field2902.method374((byte) -74);
        }
        if (class47.field1134 != null) {
            class47.field1134.method374((byte) -74);
        }
        if (arg0 == 262144) {
            field1287++;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILhd;)V")
    public static final void method491(int arg0, class53 arg1) {
        field1285++;
        class103.field2370 = arg1;
        if (arg0 != -1) {
            field1279 = -17;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
    public final int method133() {
        field1276++;
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()Lsd;")
    public final class129 method102() {
        field1278++;
        class101 var1;
        do {
            var1 = (class101) this.field1288.method884(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2316 == null);
        return var1.field2316;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([III)V")
    public final void method132(int[] arg0, int arg1, int arg2) {
        this.field1297.method132(arg0, arg1, arg2);
        field1295++;
        for (class101 var4 = (class101) this.field1288.method889(-125); var4 != null; var4 = (class101) this.field1288.method884(true)) {
            if (!this.field1282.method117(var4, -118)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2344) {
                        this.method486(var5, var6, var4, -1, var5 + var6, arg0);
                        var4.field2344 -= var6;
                        break;
                    }
                    this.method486(var5, var4.field2344, var4, -1, var5 + var6, arg0);
                    var6 -= var4.field2344;
                    var5 += var4.field2344;
                } while (!this.field1282.method96(-30999, var6, var4, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZIZI)Ljf;")
    public static final class68 method492(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 != 1000000) {
            return null;
        }
        class65 var5 = null;
        field1290++;
        if (class127.field2919 != null) {
            var5 = new class65(arg4, class127.field2919, class148.field3311[arg4], 1000000);
        }
        return new class68(var5, class62.field1443, arg4, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()Lsd;")
    public final class129 method122() {
        class101 var1 = (class101) this.field1288.method889(-27);
        field1271++;
        if (var1 == null) {
            return null;
        } else if (var1.field2316 == null) {
            return this.method102();
        } else {
            return var1.field2316;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
    public static final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 92) {
            return;
        }
        for (int var5 = arg2; var5 <= arg2 + arg0; var5++) {
            for (int var6 = arg4; var6 <= arg4 + arg3; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class22.field541[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class72.field1668[0][var6][var5] = class72.field1668[0][var6 - 1][var5];
                    }
                    if (arg3 + arg4 == var6 && var6 < 103) {
                        class72.field1668[0][var6][var5] = class72.field1668[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class72.field1668[0][var6][var5] = class72.field1668[0][var6][var5 - 1];
                    }
                    if (arg2 + arg0 == var5 && var5 < 103) {
                        class72.field1668[0][var6][var5] = class72.field1668[0][var6][var5 + 1];
                    }
                }
            }
        }
        field1280++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method114(int arg0) {
        field1291++;
        this.field1297.method114(arg0);
        for (class101 var2 = (class101) this.field1288.method889(123); var2 != null; var2 = (class101) this.field1288.method884(true)) {
            if (!this.field1282.method117(var2, -128)) {
                int var3 = arg0;
                do {
                    if (var2.field2344 >= var3) {
                        this.method488(var3, var2, 0);
                        var2.field2344 -= var3;
                        break;
                    }
                    this.method488(var2.field2344, var2, 0);
                    var3 -= var2.field2344;
                } while (!this.field1282.method96(-30999, var3, var2, null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lbf;)V")
    public class54(class14 arg0) {
        this.field1282 = arg0;
    }
}
