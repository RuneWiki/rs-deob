import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class594 extends class324 {

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "[I")
    public int[] field8680 = new int[] { -1 };

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "[I")
    public int[] field8676 = new int[1];

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field8678 = 0;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field8674 = 50;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "[I")
    public static int[] field8675 = new int[field8674];

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "[I")
    public static int[] field8681 = new int[field8674];

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field8683 = new String[field8674];

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "[I")
    public static int[] field8679 = new int[field8674];

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field8685 = 0;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "Z")
    public static boolean field8686 = false;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "[I")
    public static int[] field8672 = new int[field8674];

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "[I")
    public static int[] field8677 = new int[field8674];

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "[I")
    public static int[] field8682 = new int[field8674];

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lvv;Lhi;IILoa;BIIIZ)Lba;", line = 5)
    public final class327 method3468(class274 arg0, class177 arg1, int arg2, int arg3, class605 arg4, byte arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field8673++;
        class327 var11 = null;
        int var12 = arg6;
        class154 var13 = null;
        if (arg3 != -1) {
            var13 = class393.field6020.method35(arg5 + 139, arg3);
        }
        int[] var14 = this.field8680;
        if (var13 != null && var13.field1869 != null) {
            var14 = new int[var13.field1869.length];
            for (int var15 = 0; var15 < var13.field1869.length; var15++) {
                int var16 = var13.field1869[var15];
                if (var16 >= 0 && this.field8680.length > var16) {
                    var14[var15] = this.field8680[var16];
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
        if (arg5 != -37) {
            field8675 = null;
        }
        int var22 = -1;
        int var23 = 0;
        class66 var24 = null;
        class66 var25 = null;
        if (arg1 != null) {
            var12 = arg6 | 0x20;
            int var26 = arg1.field2181[arg2];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class259.field3686.method2964(var27, 126);
            if (var24 != null) {
                var18 |= var24.method454(var21, 91);
                var17 |= var24.method453(0, var21);
                var20 |= var24.method455(91, var21);
                var19 |= arg1.field2180;
            }
            if ((arg1.field2153 || class233.field3267) && arg7 != -1 && arg1.field2181.length > arg7) {
                var23 = arg1.field2150[arg2];
                int var28 = arg1.field2181[arg7];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class259.field3686.method2964(var22 >>> 16, 31);
                }
                if (var25 != null) {
                    var18 |= var25.method454(var22, 91);
                    var17 |= var25.method453(0, var22);
                    var20 |= var25.method455(91, var22);
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
        long var30 = this.method3469(arg0 == null ? null : arg0.field3827, arg5 ^ 0xFFFF8BAA, var14, arg3, arg9);
        if (class507.field7381 != null) {
            var11 = (class327) class507.field7381.method1801(0, var30);
        }
        if (var11 == null || arg4.method293(var11.method1375(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method300(var12, var11.method1375());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class622.field8999.method25(var14[var34], -128).method1125(arg9, 43)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class557[] var35 = new class557[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class622.field8999.method25(var14[var36], -59).method1144((byte) -126, arg9);
                }
            }
            if (var13 != null && var13.field1892 != null) {
                for (int var37 = 0; var37 < var13.field1892.length; var37++) {
                    if (var13.field1892[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1892[var37][0];
                        int var39 = var13.field1892[var37][1];
                        int var40 = var13.field1892[var37][2];
                        int var41 = var13.field1892[var37][3];
                        int var42 = var13.field1892[var37][4];
                        int var43 = var13.field1892[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3219(var43, -125, var41, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3223(var38, var40, var39, false);
                        }
                    }
                }
            }
            if (arg0 != null) {
                var32 = var12 | 0x4000;
            }
            class557 var44 = new class557(var35, var35.length);
            var11 = arg4.method326(var44, var32, class34.field390, 64, 850);
            if (arg0 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg0.field3827[var45] < class118.field1467[var45].length) {
                        var11.method1351(class132.field1658[var45], class118.field1467[var45][arg0.field3827[var45]]);
                    }
                    if (class13.field116[var45].length > arg0.field3827[var45]) {
                        var11.method1351(class204.field2746[var45], class13.field116[var45][arg0.field3827[var45]]);
                    }
                }
            }
            if (class507.field7381 != null) {
                var11.method1376(var12);
                class507.field7381.method1808(var30, var11, (byte) -11);
            }
        }
        if (arg1 == null || var24 == null) {
            return var11;
        } else {
            class327 var46 = var11.method1382((byte) 1, var12, true);
            var46.method2116(var21, arg1.field2180, 0, var24, true, arg8 - 1, var22, var23, var25);
            return var46;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([II[IIZ)J", line = 244)
    private final long method3469(int[] arg0, int arg1, int[] arg2, int arg3, boolean arg4) {
        field8684++;
        long[] var6 = class144.field1771;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg3 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg1 != 29809) {
            this.method3468(null, null, 80, -37, null, (byte) 16, 127, 12, -77, false);
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg0[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg4 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 289)
    public static void method3470(int arg0) {
        field8682 = null;
        field8675 = null;
        field8677 = null;
        field8681 = null;
        if (arg0 != 13662) {
            field8683 = null;
        }
        field8679 = null;
        field8683 = null;
        field8672 = null;
    }
}
