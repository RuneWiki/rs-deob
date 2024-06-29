import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class411 extends class406 {

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "[I")
    public int[] field5902 = new int[1];

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "[I")
    public int[] field5904 = new int[] { -1 };

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field5900 = 0;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5899;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lqe;IIILkb;ZIILae;I)Lbk;")
    public final class210 method2621(class274 arg0, int arg1, int arg2, int arg3, class412 arg4, boolean arg5, int arg6, int arg7, class134 arg8, int arg9) {
        field5906++;
        class210 var11 = null;
        int var12 = arg6;
        class306 var13 = null;
        if (arg7 != -1) {
            var13 = class138.method853(arg7, (byte) 121);
        }
        if (arg2 != 1710352968) {
            method2623(-18);
        }
        int[] var14 = this.field5904;
        if (var13 != null && var13.field4340 != null) {
            var14 = new int[var13.field4340.length];
            for (int var15 = 0; var15 < var13.field4340.length; var15++) {
                int var16 = var13.field4340[var15];
                if (var16 >= 0 && var16 < this.field5904.length) {
                    var14[var15] = this.field5904[var16];
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
        class64 var23 = null;
        class64 var24 = null;
        if (arg4 != null) {
            int var25 = arg4.field5925[arg1];
            var12 = arg6 | 0x20;
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class229.method1526(var26, -16026);
            if (var23 != null) {
                var18 |= var23.method362((byte) -85, var20);
                var17 |= var23.method366(255, var20);
                var19 |= arg4.field5926;
            }
            if ((arg4.field5935 || class404.field5818) && arg3 != -1 && arg4.field5925.length > arg3) {
                var22 = arg4.field5918[arg1];
                int var27 = arg4.field5925[arg3];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class229.method1526(var21 >>> 16, -16026);
                }
                if (var24 != null) {
                    var18 |= var24.method362((byte) -85, var21);
                    var17 |= var24.method366(255, var21);
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
        long var29 = this.method2624(arg0 == null ? null : arg0.field3885, arg7, false, var14, arg5);
        if (class311.field4396 != null) {
            var11 = (class210) class311.field4396.method1625(var29, arg2 - 1710352968);
        }
        if (var11 == null || arg8.method689(var11.method1410(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method625(var12, var11.method1410());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class50.method288(0, var14[var33]).method1097(arg5, true)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class160[] var34 = new class160[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class50.method288(class2.method10(arg2, 1710352968), var14[var35]).method1095(arg5, 0);
                }
            }
            if (var13 != null && var13.field4298 != null) {
                for (int var36 = 0; var36 < var13.field4298.length; var36++) {
                    if (var13.field4298[var36] != null && var34[var36] != null) {
                        int var37 = var13.field4298[var36][0];
                        int var38 = var13.field4298[var36][1];
                        int var39 = var13.field4298[var36][2];
                        int var40 = var13.field4298[var36][3];
                        int var41 = var13.field4298[var36][4];
                        int var42 = var13.field4298[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1020(var40, var42, true, var41);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1026(var39, var38, var37, true);
                        }
                    }
                }
            }
            class160 var43 = new class160(var34, var34.length);
            if (arg0 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg8.method605(var43, var31, class4.field63, 64, 850);
            if (arg0 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class50.field601[var44].length > arg0.field3885[var44]) {
                        var11.method1392(class279.field3947[var44], class50.field601[var44][arg0.field3885[var44]]);
                    }
                    if (arg0.field3885[var44] < class202.field2904[var44].length) {
                        var11.method1392(class235.field3293[var44], class202.field2904[var44][arg0.field3885[var44]]);
                    }
                }
            }
            if (class311.field4396 != null) {
                var11.method1387(var12);
                class311.field4396.method1622((byte) 13, var11, var29);
            }
        }
        if (arg4 == null || var23 == null) {
            return var11;
        } else {
            class210 var45 = var11.method1411((byte) 1, var12, true);
            var45.method1384(var23, arg4.field5926, var24, arg9 - 1, 0, 0, var21, var20, var22);
            return var45;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V")
    public static final void method2622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5901++;
        int var9 = arg4 + 1;
        class296.method1954(arg1, arg0, class291.field4067[arg4], arg3, arg5);
        int var8 = arg2 - 1;
        class296.method1954(arg1, arg0, class291.field4067[arg2], arg3, -1);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class291.field4067[var6];
            var7[arg3] = var7[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public static void method2623(int arg0) {
        if (arg0 != -1253404072) {
            field5905 = 22;
        }
        field5899 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([IIZ[IZ)J")
    private final long method2624(int[] arg0, int arg1, boolean arg2, int[] arg3, boolean arg4) {
        field5903++;
        long[] var6 = class399.field5711;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) (((long) arg1 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        int var13 = 0;
        if (arg2) {
            return 54L;
        }
        while (arg3.length > var13) {
            long var17 = var6[(int) (((long) (arg3[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg3[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
            var13++;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg0[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4 ? 1 : 0)) & 0xFFL)];
    }

    static {
        new class362("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field5905 = -1;
    }
}
