import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class417 extends class359 {

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "[I")
    public int[] field5987 = new int[] { -1 };

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "[I")
    public int[] field5984 = new int[1];

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field5992 = 0;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field5989 = 0;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field5993 = new String[100];

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "[[[I")
    public static int[][][] field5988 = new int[2][][];

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Ljava/lang/String;")
    public static String field5995 = "Drop";

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "Lgp;")
    public static class31 field5985;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 10)
    public static void method2595(int arg0) {
        field5993 = null;
        field5985 = null;
        field5995 = null;
        field5988 = null;
        if (arg0 != 64) {
            field5992 = 89;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIZLen;Lbb;Leq;IIBI)Lmj;", line = 29)
    public final class393 method2596(int arg0, int arg1, boolean arg2, class174 arg3, class182 arg4, class116 arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 > -51) {
            this.field5987 = null;
        }
        field5991++;
        class393 var11 = null;
        int var12 = arg6;
        class270 var13 = null;
        if (arg0 != -1) {
            var13 = class403.method2555(arg0, (byte) 49);
        }
        int[] var14 = this.field5987;
        if (var13 != null && var13.field3803 != null) {
            var14 = new int[var13.field3803.length];
            for (int var15 = 0; var15 < var13.field3803.length; var15++) {
                int var16 = var13.field3803[var15];
                if (var16 >= 0 && this.field5987.length > var16) {
                    var14[var15] = this.field5987[var16];
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
        class152 var23 = null;
        class152 var24 = null;
        if (arg4 != null) {
            var12 = arg6 | 0x20;
            int var25 = arg4.field2493[arg1];
            int var26 = var25 >>> 16;
            var23 = class158.method1040(var26, false);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method914(var20, -1);
                var17 |= var23.method908(var20, (byte) -114);
                var19 |= arg4.field2496;
            }
            if ((arg4.field2490 || class98.field1105) && arg7 != -1 && arg7 < arg4.field2493.length) {
                int var27 = arg4.field2493[arg7];
                var22 = arg4.field2513[arg1];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class158.method1040(var21 >>> 16, false);
                }
                if (var24 != null) {
                    var18 |= var24.method914(var21, -1);
                    var17 |= var24.method908(var21, (byte) -91);
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
        long var29 = this.method2597(28095, var14, arg0, arg2, arg5 == null ? null : arg5.field1374);
        if (class383.field5621 != null) {
            var11 = (class393) class383.field5621.method2049(-74, var29);
        }
        if (var11 == null || arg3.method1016(var11.method720(), var12) != 0) {
            if (var11 != null) {
                var12 = arg3.method1013(var12, var11.method720());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class392.method2498(var14[var33], -106).method1623((byte) -111, arg2)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class200[] var34 = new class200[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class392.method2498(var14[var35], -118).method1636(arg2, (byte) -128);
                }
            }
            if (var13 != null && var13.field3833 != null) {
                for (int var36 = 0; var36 < var13.field3833.length; var36++) {
                    if (var13.field3833[var36] != null && var34[var36] != null) {
                        int var37 = var13.field3833[var36][0];
                        int var38 = var13.field3833[var36][1];
                        int var39 = var13.field3833[var36][2];
                        int var40 = var13.field3833[var36][3];
                        int var41 = var13.field3833[var36][4];
                        int var42 = var13.field3833[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1271((byte) 21, var41, var40, var42);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1275(var37, var38, 80, var39);
                        }
                    }
                }
            }
            if (arg5 != null) {
                var31 = var12 | 0x2000;
            }
            class200 var43 = new class200(var34, var34.length);
            var11 = arg3.method991(var43, var31, class219.field3009, 64, 850);
            if (arg5 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class198.field2693[var44].length > arg5.field1374[var44]) {
                        var11.method751(class323.field4559[var44], class198.field2693[var44][arg5.field1374[var44]]);
                    }
                    if (class101.field1147[var44].length > arg5.field1374[var44]) {
                        var11.method751(class108.field1248[var44], class101.field1147[var44][arg5.field1374[var44]]);
                    }
                }
            }
            if (class383.field5621 != null) {
                var11.method774(var12);
                class383.field5621.method2046(var29, 0, var11);
            }
        }
        if (arg4 == null || var23 == null) {
            return var11;
        } else {
            class393 var45 = var11.method717((byte) 1, var12, true);
            var45.method2503(var22, var21, var20, (byte) 103, arg4.field2496, var23, arg9 - 1, 0, var24);
            return var45;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIZ[I)J", line = 275)
    private final long method2597(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4) {
        field5983++;
        long[] var6 = class189.field2567;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        if (arg0 != 28095) {
            method2598(true, -8, -10, -63, -36, 84, -82, -123, 1.6044323F);
        }
        long var11 = var6[(int) ((var9 ^ (long) arg2) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg1[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZIIIIIIIF)[[I", line = 319)
    public static final int[][] method2598(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        field5986++;
        int[][] var9 = new int[arg1][arg4];
        class186 var10 = new class186();
        var10.field2539 = (int) (arg8 * 4096.0F);
        var10.field2534 = arg6;
        var10.field2537 = arg0;
        var10.field2528 = arg7;
        var10.field2532 = arg2;
        if (arg5 != 139672664) {
            method2595(-27);
        }
        var10.method140(0);
        class215.method1407(arg4, arg1, (byte) 19);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1194(var9[var11], 4095, var11);
        }
        return var9;
    }
}
