import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class521 extends class504 {

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "[I")
    public int[] field6961 = new int[] { -1 };

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "[I")
    public int[] field6958 = new int[1];

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Lnea;")
    public static class670 field6963 = new class670();

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "[Laea;")
    public static class47[] field6965 = new class47[5];

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Luk;")
    public static class242 field6960;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Loa;Lwi;IIIBIZILdv;)Lba;")
    public final class358 method2922(class651 arg0, class435 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7, int arg8, class616 arg9) {
        field6964++;
        class358 var11 = null;
        int var12 = 93 / ((arg5 - 68) / 41);
        int var13 = arg3;
        class543 var14 = null;
        if (arg2 != -1) {
            var14 = class674.field9537.method2319(arg2, (byte) -88);
        }
        int[] var15 = this.field6961;
        if (var14 != null && var14.field7144 != null) {
            var15 = new int[var14.field7144.length];
            for (int var16 = 0; var16 < var14.field7144.length; var16++) {
                int var17 = var14.field7144[var16];
                if (var17 >= 0 && var17 < this.field6961.length) {
                    var15[var16] = this.field6961[var17];
                } else {
                    var15[var16] = -1;
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = false;
        int var22 = -1;
        int var23 = -1;
        int var24 = 0;
        class696 var25 = null;
        class696 var26 = null;
        if (arg9 != null) {
            var13 = arg3 | 0x20;
            int var27 = arg9.field8160[arg8];
            int var28 = var27 >>> 16;
            var22 = var27 & 0xFFFF;
            var25 = class636.field8570.method229(-79, var28);
            if (var25 != null) {
                var19 |= var25.method3855(1, var22);
                var18 |= var25.method3853(var22, (byte) 19);
                var21 |= var25.method3856(false, var22);
                var20 |= arg9.field8165;
            }
            if ((arg9.field8156 || class672.field9512) && arg6 != -1 && arg9.field8160.length > arg6) {
                int var29 = arg9.field8160[arg6];
                var24 = arg9.field8163[arg8];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class636.field8570.method229(-101, var23 >>> 16);
                }
                if (var26 != null) {
                    var19 |= var26.method3855(1, var23);
                    var18 |= var26.method3853(var23, (byte) 19);
                    var21 |= var26.method3856(false, var23);
                }
            }
            if (var19) {
                var13 |= 0x80;
            }
            if (var18) {
                var13 |= 0x100;
            }
            if (var20) {
                var13 |= 0x200;
            }
            if (var21) {
                var13 |= 0x400;
            }
        }
        long var31 = this.method2924(13193, var15, arg1 == null ? null : arg1.field5952, arg7, arg2);
        if (class358.field4846 != null) {
            var11 = (class358) class358.field4846.method3750(var31, false);
        }
        if (var11 == null || arg0.method376(var11.method1945(), var13) != 0) {
            if (var11 != null) {
                var13 = arg0.method460(var13, var11.method1945());
            }
            int var33 = var13;
            boolean var34 = false;
            for (int var35 = 0; var35 < var15.length; var35++) {
                if (var15[var35] != -1 && !class193.field2826.method1047(var15[var35], -1).method3159(arg7, (byte) 57)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class545[] var36 = new class545[var15.length];
            for (int var37 = 0; var37 < var15.length; var37++) {
                if (var15[var37] != -1) {
                    var36[var37] = class193.field2826.method1047(var15[var37], -1).method3156(arg7, (byte) -103);
                }
            }
            if (var14 != null && var14.field7142 != null) {
                for (int var38 = 0; var38 < var14.field7142.length; var38++) {
                    if (var14.field7142[var38] != null && var36[var38] != null) {
                        int var39 = var14.field7142[var38][0];
                        int var40 = var14.field7142[var38][1];
                        int var41 = var14.field7142[var38][2];
                        int var42 = var14.field7142[var38][3];
                        int var43 = var14.field7142[var38][4];
                        int var44 = var14.field7142[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method3025(var44, (byte) 92, var43, var42);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method3026(var41, var39, var40, (byte) -45);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var33 = var13 | 0x4000;
            }
            class545 var45 = new class545(var36, var36.length);
            var11 = arg0.method443(var45, var33, class51.field719, 64, 850);
            if (arg1 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    for (int var47 = 0; var47 < class103.field1527.length; var47++) {
                        if (class103.field1527[var47][var46].length > arg1.field5952[var46]) {
                            var11.method1929(class487.field6583[var47][var46], class103.field1527[var47][var46][arg1.field5952[var46]]);
                        }
                    }
                }
            }
            if (class358.field4846 != null) {
                var11.method1899(var13);
                class358.field4846.method3745(1, var31, var11);
            }
        }
        if (arg9 == null || var25 == null) {
            return var11;
        } else {
            class358 var48 = var11.method1519((byte) 1, var13, true);
            var48.method2110(arg9.field8165, 0, var24, var23, -37, var26, var22, var25, arg4 - 1);
            return var48;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static void method2923(int arg0) {
        if (arg0 != -17344) {
            method2923(86);
        }
        field6963 = null;
        field6965 = null;
        field6960 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[I[IZI)J")
    private final long method2924(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        field6962++;
        long[] var6 = class246.field3431;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg1[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 != 13193) {
            field6960 = null;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg2[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
    public static final void method2925(int arg0) {
        field6959++;
        class358.field4846.method3739(0);
        if (arg0 != 16384) {
            method2925(-5);
        }
    }

    static {
        for (int var0 = 0; var0 < field6965.length; var0++) {
            field6965[var0] = new class47();
        }
    }
}
