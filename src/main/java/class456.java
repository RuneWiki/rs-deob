import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class456 extends class238 {

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
    public int[] field6410 = new int[] { -1 };

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "[I")
    public int[] field6415 = new int[1];

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "Ldk;")
    public static class326 field6412 = new class326("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Ldk;")
    public static class326 field6413 = new class326("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "Lea;")
    public static class353 field6416 = null;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Lnp;")
    public static class313 field6417;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Ld;")
    public static class93 field6414;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)[Lk;")
    public static final class365[] method2674(int arg0) {
        field6409++;
        int var1 = -37 % ((arg0 + 55) / 63);
        return new class365[] { class30.field401, class54.field728, class182.field2704 };
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
    public static void method2675(boolean arg0) {
        field6414 = null;
        field6417 = null;
        field6416 = null;
        field6412 = null;
        if (arg0) {
            method2675(true);
        }
        field6413 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([IZ[III)J")
    private final long method2676(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            field6414 = null;
        }
        field6408++;
        long[] var6 = class427.field5983;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BILnp;IILcu;ILok;IZ)Lf;")
    public final class491 method2677(byte arg0, int arg1, class313 arg2, int arg3, int arg4, class132 arg5, int arg6, class153 arg7, int arg8, boolean arg9) {
        field6411++;
        if (arg0 <= 117) {
            this.field6415 = null;
        }
        class491 var11 = null;
        int var12 = arg1;
        class332 var13 = null;
        if (arg3 != -1) {
            var13 = class459.field6436.method404(false, arg3);
        }
        int[] var14 = this.field6410;
        if (var13 != null && var13.field4818 != null) {
            var14 = new int[var13.field4818.length];
            for (int var15 = 0; var15 < var13.field4818.length; var15++) {
                int var16 = var13.field4818[var15];
                if (var16 >= 0 && var16 < this.field6410.length) {
                    var14[var15] = this.field6410[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class31 var23 = null;
        class31 var24 = null;
        if (arg7 != null) {
            int var25 = arg7.field2254[arg4];
            var12 = arg1 | 0x20;
            int var26 = var25 >>> 16;
            var23 = class64.field836.method2082(-23748, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method218(14, var20);
                var17 |= var23.method217(65280, var20);
                var19 |= arg7.field2271;
            }
            if ((arg7.field2264 || class70.field884) && arg8 != -1 && arg7.field2254.length > arg8) {
                int var27 = arg7.field2254[arg8];
                var22 = arg7.field2275[arg4];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class64.field836.method2082(-23748, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method218(14, var21);
                    var17 |= var24.method217(65280, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method2676(var14, arg9, arg5 == null ? null : arg5.field1731, arg3, 1);
        if (class204.field3031 != null) {
            var11 = (class491) class204.field3031.method1479(0, var29);
        }
        if (var11 == null || arg2.method653(var11.method1319(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method647(var12, var11.method1319());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class64.field834.method2129(var14[var33], false).method272(arg9, -126)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class187[] var34 = new class187[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class64.field834.method2129(var14[var35], false).method275(arg9, (byte) 120);
                }
            }
            if (var13 != null && var13.field4805 != null) {
                for (int var36 = 0; var36 < var13.field4805.length; var36++) {
                    if (var13.field4805[var36] != null && var34[var36] != null) {
                        int var37 = var13.field4805[var36][0];
                        int var38 = var13.field4805[var36][1];
                        int var39 = var13.field4805[var36][2];
                        int var40 = var13.field4805[var36][3];
                        int var41 = var13.field4805[var36][4];
                        int var42 = var13.field4805[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1153(var40, var41, var42, (byte) 17);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1158(var38, var37, 15124, var39);
                        }
                    }
                }
            }
            if (arg5 != null) {
                var31 = var12 | 0x2000;
            }
            class187 var43 = new class187(var34, var34.length);
            var11 = arg2.method696(var43, var31, class305.field4344, 64, 850);
            if (arg5 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class332.field4835[var44].length > arg5.field1731[var44]) {
                        var11.method1309(class9.field84[var44], class332.field4835[var44][arg5.field1731[var44]]);
                    }
                    if (arg5.field1731[var44] < class163.field2413[var44].length) {
                        var11.method1309(class386.field5488[var44], class163.field2413[var44][arg5.field1731[var44]]);
                    }
                }
            }
            if (class204.field3031 != null) {
                var11.method1344(var12);
                class204.field3031.method1473(var11, var29, -106);
            }
        }
        if (arg7 == null || var23 == null) {
            return var11;
        } else {
            class491 var45 = var11.method1292((byte) 1, var12, true);
            var45.method2885(var20, var23, var22, 0, arg6 - 1, (byte) -59, arg7.field2271, var21, var24);
            return var45;
        }
    }
}
