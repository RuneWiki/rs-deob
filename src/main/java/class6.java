import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class362 {

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
    public int[] field44 = new int[] { -1 };

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[I")
    public int[] field45 = new int[1];

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Z")
    public static boolean field46 = true;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIILkda;B)V")
    public static final void method23(int arg0, int arg1, int arg2, int arg3, int arg4, class390 arg5, byte arg6) {
        int var7 = 1 / ((arg6 - 6) / 48);
        field41++;
        class393.method2472(arg5.field5926, arg3, arg0, arg4, arg5.field5922, 0, arg5.field5933, (byte) 110, arg1, arg2);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([IIZ[IB)J")
    private final long method24(int[] arg0, int arg1, boolean arg2, int[] arg3, byte arg4) {
        field42++;
        long[] var6 = class438.field6253;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg1) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg3[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) (((long) arg3[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != -74) {
            this.field44 = null;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lhg;Loo;IIIIILha;ZI)Lka;")
    public final class472 method25(class691 arg0, class627 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class59 arg7, boolean arg8, int arg9) {
        field43++;
        class472 var11 = null;
        int var12 = arg6;
        class399 var13 = null;
        if (arg2 != -1) {
            var13 = class624.field8505.method1443(arg2, 32);
        }
        int[] var14 = this.field44;
        if (var13 != null && var13.field5850 != null) {
            var14 = new int[var13.field5850.length];
            for (int var15 = 0; var15 < var13.field5850.length; var15++) {
                int var16 = var13.field5850[var15];
                if (var16 >= 0 && this.field44.length > var16) {
                    var14[var15] = this.field44[var16];
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
        class172 var24 = null;
        class172 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field9327[arg3];
            var12 = arg6 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class456.field6436.method1025(var27, arg9 + 4);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method1292(var21, 0);
                var17 |= var24.method1291(var21, 14);
                var20 |= var24.method1287((byte) -112, var21);
                var19 |= arg0.field9332;
            }
            if ((arg0.field9331 || class133.field2243) && arg5 != -1 && arg0.field9327.length > arg5) {
                int var28 = arg0.field9327[arg5];
                var23 = arg0.field9357[arg3];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class456.field6436.method1025(var22 >>> 16, 3);
                }
                if (var25 != null) {
                    var18 |= var25.method1292(var22, 0);
                    var17 |= var25.method1291(var22, 14);
                    var20 |= var25.method1287((byte) -118, var22);
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
        long var30 = this.method24(arg1 == null ? null : arg1.field8628, arg2, arg8, var14, (byte) -74);
        if (class601.field8260 != null) {
            var11 = (class472) class601.field8260.method992(var30, arg9 ^ 0x56);
        }
        if (var11 == null || arg7.method343(var11.method527(), var12) != 0) {
            if (var11 != null) {
                var12 = arg7.method219(var12, var11.method527());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class721.field9801.method162(-91, var14[var34]).method2212(arg8, -1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class37[] var35 = new class37[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class721.field9801.method162(class710.method3948(arg9, -112), var14[var36]).method2205(arg8, false);
                }
            }
            if (var13 != null && var13.field5883 != null) {
                for (int var37 = 0; var37 < var13.field5883.length; var37++) {
                    if (var13.field5883[var37] != null && var35[var37] != null) {
                        int var38 = var13.field5883[var37][0];
                        int var39 = var13.field5883[var37][1];
                        int var40 = var13.field5883[var37][2];
                        int var41 = var13.field5883[var37][3];
                        int var42 = var13.field5883[var37][4];
                        int var43 = var13.field5883[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method473(6875, var42, var43, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method465((byte) -91, var40, var38, var39);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            class37 var44 = new class37(var35, var35.length);
            var11 = arg7.method174(var44, var32, class506.field7037, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class189.field2818.length; var46++) {
                        if (class189.field2818[var46][var45].length > arg1.field8628[var45]) {
                            var11.method517(class419.field6060[var46][var45], class189.field2818[var46][var45][arg1.field8628[var45]]);
                        }
                    }
                }
            }
            if (class601.field8260 != null) {
                var11.method484(var12);
                class601.field8260.method991(var11, var30, (byte) -128);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class472 var47 = var11.method504((byte) 1, var12, true);
            var47.method2784(var21, var23, var25, 0, var24, false, arg0.field9332, var22, arg4 + arg9);
            return var47;
        }
    }
}
