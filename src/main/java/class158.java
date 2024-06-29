import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class158 extends class202 {

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "Z")
    private volatile boolean field2368 = false;

    @OriginalMember(owner = "client!je", name = "ob", descriptor = "Z")
    private boolean field2374 = false;

    @OriginalMember(owner = "client!je", name = "nb", descriptor = "I")
    private int field2373 = -1;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Lvi;")
    private class211 field2366;

    @OriginalMember(owner = "client!je", name = "mb", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!je", name = "kb", descriptor = "Lvi;")
    private class211 field2370;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Lma;")
    private static class5 field2365 = class12.method119("Examine", (byte) 57);

    @OriginalMember(owner = "client!je", name = "lb", descriptor = "Z")
    public static boolean field2371 = true;

    @OriginalMember(owner = "client!je", name = "xb", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!je", name = "wb", descriptor = "Lma;")
    public static class5 field2382 = class12.method119("http:)4)4", (byte) 81);

    @OriginalMember(owner = "client!je", name = "Eb", descriptor = "Lma;")
    private static class5 field2390 = class12.method119("skill)2", (byte) 121);

    @OriginalMember(owner = "client!je", name = "Gb", descriptor = "Lma;")
    public static class5 field2392 = field2390;

    @OriginalMember(owner = "client!je", name = "Hb", descriptor = "Lma;")
    public static class5 field2393 = field2365;

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!je", name = "pb", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!je", name = "sb", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!je", name = "tb", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!je", name = "ub", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!je", name = "vb", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!je", name = "yb", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!je", name = "zb", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!je", name = "Ab", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!je", name = "Bb", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!je", name = "Cb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!je", name = "Db", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!je", name = "Fb", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!je", name = "qb", descriptor = "Lni;")
    public static class202 field2376;

    @OriginalMember(owner = "client!je", name = "rb", descriptor = "Leb;")
    public static class253 field2377;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "[Z")
    private volatile boolean[] field2367;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V", line = 7)
    public final void method1011(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field2383 = 114;
        }
        field2389++;
        this.field2378 = arg0;
        this.field2385 = arg2;
        if (this.field2366 == null) {
            class255.method1783(true, this.field2372, (byte) 0, 255, this.field2385, 41, this);
        } else {
            class216.method1460(true, this.field2372, this.field2366, this);
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(BI)V", line = 29)
    public final void method1012(byte arg0, int arg1) {
        if (arg0 > -77) {
            return;
        }
        field2391++;
        if (!this.method1327((byte) 36, arg1)) {
            return;
        }
        if (this.field2370 == null || this.field2367 == null || !this.field2367[arg1]) {
            class255.method1783(true, arg1, (byte) 2, this.field2372, this.field3239[arg1], 116, this);
        } else {
            class216.method1460(true, arg1, this.field2370, this);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(III)J", line = 51)
    public static final long method1013(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3162; var4++) {
            class107 var5 = var3.field3166[var4];
            if ((var5.field1590 >> 29 & 0x3L) == 2L && var5.field1597 == arg1 && var5.field1595 == arg2) {
                return var5.field1590;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lvi;Lvi;IZZZ)V", line = 267)
    public class158(class211 arg0, class211 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2366 = arg1;
        this.field2374 = arg5;
        this.field2372 = arg2;
        this.field2370 = arg0;
        class84.method567(this, (byte) 97, this.field2372);
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)I", line = 83)
    public final int method1014(byte arg0) {
        if (arg0 != 31) {
            field2383 = 110;
        }
        field2388++;
        if (this.field2368) {
            return 100;
        } else if (this.field3213 == null) {
            int var2 = class16.method140(255, (byte) -46, this.field2372);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)V", line = 106)
    public final void method1015(int arg0, int arg1) {
        field2380++;
        if (this.method1327((byte) 36, arg0)) {
            if (arg1 != 0) {
                method1020(-116, 80, (class33) null, (class34) null, 75, -80, -61, -102, 8, -53, 101, 111, false, false);
            }
            class283.method1918(arg0, this.field2372, false);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIZI[B)V", line = 125)
    public final void method1016(boolean arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field2386++;
        if (arg3 != 9876) {
            this.method1017(false, 73);
        }
        if (arg2) {
            if (this.field2368) {
                throw new RuntimeException();
            }
            if (this.field2366 != null) {
                class175.method1149(this.field2372, arg4, true, this.field2366);
            }
            this.method1345(arg4, 1);
            this.method1022(-2785);
            return;
        }
        arg4[arg4.length - 2] = (byte) (this.field3208[arg1] >> 8);
        arg4[arg4.length - 1] = (byte) this.field3208[arg1];
        if (this.field2370 != null) {
            class175.method1149(arg1, arg4, true, this.field2370);
            this.field2367[arg1] = true;
        }
        if (arg0) {
            this.field3213[arg1] = class48.method361(false, false, arg4);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)I", line = 176)
    public final int method1017(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1011(-96, 88, 105);
        }
        field2379++;
        if (!this.method1327((byte) 36, arg1)) {
            return 0;
        } else if (this.field3213[arg1] == null) {
            return this.field2367[arg1] ? 100 : class16.method140(this.field2372, (byte) -46, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)V", line = 209)
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2387++;
        int var7 = arg3 + arg6;
        int var8 = arg0 - arg3;
        for (int var9 = arg6; var9 < var7; var9++) {
            class239.method1690(arg2, 23267, arg5, class137.field2032[var9], arg4);
        }
        int var10 = arg5 - arg3;
        int var11 = arg2 + arg3;
        for (int var12 = arg0; var12 > var8; var12--) {
            class239.method1690(arg2, 23267, arg5, class137.field2032[var12], arg4);
        }
        int var13 = 20 % ((-arg1 - 63) / 43);
        for (int var14 = var7; var14 <= var8; var14++) {
            int[] var15 = class137.field2032[var14];
            class239.method1690(arg2, 23267, var11, var15, arg4);
            class239.method1690(var10, 23267, arg5, var15, arg4);
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V", line = 252)
    public static void method1019(byte arg0) {
        if (arg0 != -101) {
            field2376 = (class202) null;
        }
        field2382 = null;
        field2377 = null;
        field2365 = null;
        field2393 = null;
        field2390 = null;
        field2392 = null;
        field2376 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILu;Lkl;IIIIIIIIZZ)Lkl;", line = 290)
    public static final class34 method1020(int arg0, int arg1, class33 arg2, class34 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        field2369++;
        long var14 = ((long) arg9 << 48) + ((long) arg6 << 32) + (long) ((arg8 << 16) + arg11 - -(arg1 << 24));
        class34 var16 = (class34) class12.field234.method521(var14, (byte) 80);
        if (var16 == null) {
            byte var17;
            if (arg11 == 1) {
                var17 = 9;
            } else if (arg11 == 2) {
                var17 = 12;
            } else if (arg11 == 3) {
                var17 = 15;
            } else if (arg11 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class183 var20 = new class183(var17 * var19 + 1, var17 * var19 * 2 - var17, 0);
            int var21 = var20.method1200(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class229.field3805[var27] * var24 + arg0 >> 16;
                    int var29 = class229.field3806[var27] * var25 + arg4 >> 16;
                    var22[var23][var26] = var20.method1200(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                short var33 = (short) (((arg6 & 0x7F) * var32 + (arg9 & 0x7F) * var31 & 0x7F00) + ((arg6 & 0xFC00) * var32 + (arg9 & 0xFC00) * var31 & 0xFC0000) + ((arg6 & 0x380) * var32 + (arg9 & 0x380) * var31 & 0x38000) >> 8);
                byte var34 = (byte) (arg1 * var31 + arg8 * var32 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1199(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var33, var34);
                    } else {
                        var20.method1199(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var20.method1199(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var20.method1198(64, 768, -50, -10, -50);
            class12.field234.method519((byte) -95, var16, var14);
        }
        int var36 = arg11 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg3.method232();
        int var41 = arg3.method236();
        int var42 = arg3.method237();
        class282 var43 = null;
        int var44 = var36;
        int var45 = arg3.method249();
        if (arg2 != null) {
            int var46 = arg2.field529[arg5];
            var43 = class303.method2053(var46 >> 16, (byte) 94);
            arg5 = var46 & 0xFFFF;
        }
        if (arg12) {
            if (arg7 > 640 && arg7 < 1408) {
                var44 = var36 + 128;
            }
            if (arg7 > 1664 || arg7 < 384) {
                var39 -= 128;
            }
            if (arg7 > 1152 && arg7 < 1920) {
                var38 = var36 + 128;
            }
            if (arg7 > 128 && arg7 < 896) {
                var37 -= 128;
            }
        }
        if (!arg13) {
            return (class34) null;
        }
        if (var40 < var37) {
            var40 = var37;
        }
        if (var41 > var38) {
            var41 = var38;
        }
        if (var42 < var39) {
            var42 = var39;
        }
        if (var44 < var45) {
            var45 = var44;
        }
        class34 var47;
        if (var43 == null) {
            var47 = var16.method241(true, true);
            var47.method251((var41 - var40) / 2, 128, (var45 - var42) / 2);
            var47.method243((var40 + var41) / 2, 0, (var42 + var45) / 2);
        } else {
            var47 = var16.method241(!var43.method1915((byte) -78, arg5), true);
            var47.method251((var41 - var40) / 2, 128, (var45 - var42) / 2);
            var47.method243((var40 + var41) / 2, 0, (var42 + var45) / 2);
            var47.method244(var43, arg5);
        }
        if (arg7 != 0) {
            var47.method245(arg7);
        }
        class160 var48 = (class160) var47;
        if (class20.method161(arg4 + var42, arg0 + var40, 1, class276.field4701) != arg10 || arg10 != class20.method161(arg4 + var45, arg0 - -var41, 1, class276.field4701)) {
            for (int var49 = 0; var49 < var48.field2417; var49++) {
                var48.field2423[var49] += class20.method161(var48.field2418[var49] + arg4, var48.field2399[var49] + arg0, 1, class276.field4701) - arg10;
            }
            var48.field2408.field1229 = false;
            var48.field2431.field1180 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lvi;IZ[BI)V", line = 507)
    public final void method1021(class211 arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg1 != -27430) {
            return;
        }
        field2384++;
        if (this.field2366 != arg0) {
            if (!arg2 && this.field2373 == arg4) {
                this.field2368 = true;
            }
            if (arg3 == null || arg3.length <= 2) {
                this.field2367[arg4] = false;
                if (this.field2374 || arg2) {
                    class255.method1783(arg2, arg4, (byte) 2, this.field2372, this.field3239[arg4], 87, this);
                }
                return;
            }
            class278.field4716.reset();
            class278.field4716.update(arg3, 0, arg3.length - 2);
            int var6 = (int) class278.field4716.getValue();
            int var7 = ((arg3[arg3.length - 2] & 0xFF) << 8) + (arg3[arg3.length - 1] & 0xFF);
            if (this.field3239[arg4] != var6 || this.field3208[arg4] != var7) {
                this.field2367[arg4] = false;
                if (this.field2374 || arg2) {
                    class255.method1783(arg2, arg4, (byte) 2, this.field2372, this.field3239[arg4], 91, this);
                }
                return;
            }
            this.field2367[arg4] = true;
            if (arg2) {
                this.field3213[arg4] = class48.method361(false, false, arg3);
            }
            return;
        }
        if (this.field2368) {
            throw new RuntimeException();
        }
        if (arg3 == null) {
            class255.method1783(true, this.field2372, (byte) 0, 255, this.field2385, 89, this);
            return;
        }
        class278.field4716.reset();
        class278.field4716.update(arg3, 0, arg3.length);
        int var8 = (int) class278.field4716.getValue();
        if (this.field2385 != var8) {
            class255.method1783(true, this.field2372, (byte) 0, 255, this.field2385, arg1 + 27554, this);
            return;
        }
        class221 var9;
        try {
            var9 = new class221(class51.method389(arg1 ^ 0xFFFF94DA, arg3));
        } catch (RuntimeException var13) {
            class255.method1783(true, this.field2372, (byte) 0, 255, this.field2385, 74, this);
            return;
        }
        int var11 = var9.method1509(true);
        if (var11 != 5 && var11 != 6) {
            class255.method1783(true, this.field2372, (byte) 0, 255, this.field2385, arg1 + 27481, this);
            return;
        }
        int var12 = 0;
        if (var11 >= 6) {
            var12 = var9.method1517((byte) -108);
        }
        if (this.field2378 != var12) {
            class255.method1783(true, this.field2372, (byte) 0, 255, this.field2385, 120, this);
            return;
        }
        this.method1345(arg3, arg1 ^ 0xFFFF94DB);
        this.method1022(-2785);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V", line = 641)
    private final void method1022(int arg0) {
        if (arg0 != -2785) {
            field2392 = (class5) null;
        }
        field2381++;
        this.field2367 = new boolean[this.field3213.length];
        for (int var2 = 0; var2 < this.field2367.length; var2++) {
            this.field2367[var2] = false;
        }
        if (this.field2370 == null) {
            this.field2368 = true;
            return;
        }
        this.field2373 = -1;
        for (int var3 = 0; var3 < this.field2367.length; var3++) {
            if (this.field3243[var3] > 0) {
                class246.method1726(this.field2370, var3, 124, this);
                this.field2373 = var3;
            }
        }
        if (this.field2373 == -1) {
            this.field2368 = true;
        }
    }
}
