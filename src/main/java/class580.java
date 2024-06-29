import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class580 extends class496 {

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "[I")
    public int[] field8538 = new int[] { -1 };

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "[I")
    public int[] field8543 = new int[1];

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field8539 = 0;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "F")
    public static float field8540 = 1.0F;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "Leaa;")
    public static class43 field8541 = new class43(16);

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Ldda;")
    public static class597 field8544;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZB[II[I)J")
    private final long method3390(boolean arg0, byte arg1, int[] arg2, int arg3, int[] arg4) {
        field8542++;
        long[] var6 = class498.field7478;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) (((long) arg4[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg1 <= 105) {
            return -74L;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg2[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((var11 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method3391(int arg0) {
        field8544 = null;
        field8541 = null;
        if (arg0 != 3334) {
            field8539 = -27;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IILjk;Lqa;IIIILaba;Z)Lr;")
    public final class520 method3392(int arg0, int arg1, class170 arg2, class167 arg3, int arg4, int arg5, int arg6, int arg7, class224 arg8, boolean arg9) {
        field8537++;
        class520 var11 = null;
        int var12 = arg4;
        class229 var13 = null;
        if (arg7 != -1) {
            var13 = class345.field5023.method526(-440, arg7);
        }
        if (arg5 != 15013) {
            this.method3392(-13, -113, null, null, -26, 97, 13, 70, null, false);
        }
        int[] var14 = this.field8538;
        if (var13 != null && var13.field3404 != null) {
            var14 = new int[var13.field3404.length];
            for (int var15 = 0; var15 < var13.field3404.length; var15++) {
                int var16 = var13.field3404[var15];
                if (var16 >= 0 && var16 < this.field8538.length) {
                    var14[var15] = this.field8538[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class433 var24 = null;
        class433 var25 = null;
        if (arg8 != null) {
            int var26 = arg8.field3296[arg1];
            var12 = arg4 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class470.field7205.method3500(var27, -77);
            if (var24 != null) {
                var18 |= var24.method2646(true, var21);
                var17 |= var24.method2644((byte) -10, var21);
                var20 |= var24.method2643(var21, -239);
                var19 |= arg8.field3311;
            }
            if ((arg8.field3309 || class516.field7637) && arg6 != -1 && arg6 < arg8.field3296.length) {
                var23 = arg8.field3307[arg1];
                int var28 = arg8.field3296[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class470.field7205.method3500(var22 >>> 16, -95);
                }
                if (var25 != null) {
                    var18 |= var25.method2646(true, var22);
                    var17 |= var25.method2644((byte) 125, var22);
                    var20 |= var25.method2643(var22, -239);
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
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method3390(arg9, (byte) 111, arg2 == null ? null : arg2.field2316, arg7, var14);
        if (class228.field3353 != null) {
            var11 = (class520) class228.field3353.method2025(var30, arg5 ^ 0x3AA7);
        }
        if (var11 == null || arg3.method1026(var11.method1950(), var12) != 0) {
            if (var11 != null) {
                var12 = arg3.method978(var12, var11.method1950());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class216.field3204.method3357(var14[var34], (byte) -100).method2454(arg9, 64)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class114[] var35 = new class114[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class216.field3204.method3357(var14[var36], (byte) -74).method2467(arg9, false);
                }
            }
            if (var13 != null && var13.field3381 != null) {
                for (int var37 = 0; var37 < var13.field3381.length; var37++) {
                    if (var13.field3381[var37] != null && var35[var37] != null) {
                        int var38 = var13.field3381[var37][0];
                        int var39 = var13.field3381[var37][1];
                        int var40 = var13.field3381[var37][2];
                        int var41 = var13.field3381[var37][3];
                        int var42 = var13.field3381[var37][4];
                        int var43 = var13.field3381[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method694(var41, var43, var42, -100);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method689(var40, (byte) -85, var39, var38);
                        }
                    }
                }
            }
            class114 var44 = new class114(var35, var35.length);
            if (arg2 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg3.method954(var44, var32, class639.field9296, 64, 850);
            if (arg2 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class317.field4743[var45].length > arg2.field2316[var45]) {
                        var11.method1957(class264.field3922[var45], class317.field4743[var45][arg2.field2316[var45]]);
                    }
                    if (arg2.field2316[var45] < class601.field8869[var45].length) {
                        var11.method1957(class224.field3318[var45], class601.field8869[var45][arg2.field2316[var45]]);
                    }
                }
            }
            if (class228.field3353 != null) {
                var11.method1973(var12);
                class228.field3353.method2029(false, var11, var30);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class520 var46 = var11.method369((byte) 1, var12, true);
            var46.method3084(var24, -82, arg8.field3311, var21, 0, var25, var23, arg0 - 1, var22);
            return var46;
        }
    }
}
