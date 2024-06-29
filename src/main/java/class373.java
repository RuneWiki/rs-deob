import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class373 extends class401 {

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "[I")
    public int[] field5021 = new int[] { -1 };

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "[I")
    public int[] field5020 = new int[1];

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "Lhm;")
    public static class202 field5024 = new class202("LIVE", 0);

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "Loh;")
    public static class370 field5025 = new class370(2, 2);

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "Z")
    public static boolean field5026 = false;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)Lsr;", line = 4)
    public static final class228 method2144(byte arg0) {
        field5019++;
        class474.field6526 = 0;
        if (arg0 != 44) {
            field5025 = null;
        }
        return class364.method2071(65280);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BIIIILqi;ZILks;Lr;)Lda;", line = 22)
    public final class55 method2145(byte arg0, int arg1, int arg2, int arg3, int arg4, class527 arg5, boolean arg6, int arg7, class403 arg8, class166 arg9) {
        field5023++;
        class55 var11 = null;
        int var12 = arg3;
        class67 var13 = null;
        if (arg0 != 110) {
            field5025 = null;
        }
        if (arg7 != -1) {
            var13 = class198.field2828.method2482(arg7, 112);
        }
        int[] var14 = this.field5021;
        if (var13 != null && var13.field877 != null) {
            var14 = new int[var13.field877.length];
            for (int var15 = 0; var15 < var13.field877.length; var15++) {
                int var16 = var13.field877[var15];
                if (var16 >= 0 && var16 < this.field5021.length) {
                    var14[var15] = this.field5021[var16];
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
        class109 var24 = null;
        class109 var25 = null;
        if (arg8 != null) {
            var12 = arg3 | 0x20;
            int var26 = arg8.field5667[arg4];
            int var27 = var26 >>> 16;
            var24 = class192.field2727.method3085(0, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method784(var21, (byte) -125);
                var17 |= var24.method785((byte) 118, var21);
                var20 |= var24.method788((byte) 127, var21);
                var19 |= arg8.field5653;
            }
            if ((arg8.field5644 || class553.field7458) && arg1 != -1 && arg8.field5667.length > arg1) {
                var23 = arg8.field5646[arg4];
                int var28 = arg8.field5667[arg1];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class192.field2727.method3085(arg0 - 110, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method784(var22, (byte) -120);
                    var17 |= var25.method785((byte) 71, var22);
                    var20 |= var25.method788((byte) 115, var22);
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
        long var30 = this.method2147(arg6, arg7, arg5 == null ? null : arg5.field7139, var14, 62);
        if (class623.field8642 != null) {
            var11 = (class55) class623.field8642.method3747((byte) -66, var30);
        }
        if (var11 == null || arg9.method134(var11.method422(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method114(var12, var11.method422());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class599.field8366.method3949(0, var14[var34]).method3724(arg6, arg0 ^ 0x11)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class270[] var35 = new class270[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class599.field8366.method3949(0, var14[var36]).method3713(-1611653406, arg6);
                }
            }
            if (var13 != null && var13.field903 != null) {
                for (int var37 = 0; var37 < var13.field903.length; var37++) {
                    if (var13.field903[var37] != null && var35[var37] != null) {
                        int var38 = var13.field903[var37][0];
                        int var39 = var13.field903[var37][1];
                        int var40 = var13.field903[var37][2];
                        int var41 = var13.field903[var37][3];
                        int var42 = var13.field903[var37][4];
                        int var43 = var13.field903[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1636(var41, var43, var42, -23378);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1646((byte) 125, var40, var39, var38);
                        }
                    }
                }
            }
            class270 var44 = new class270(var35, var35.length);
            if (arg5 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg9.method106(var44, var32, class485.field6664, 64, 850);
            if (arg5 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class611.field8470.length; var46++) {
                        if (class611.field8470[var46][var45].length > arg5.field7139[var45]) {
                            var11.method439(class335.field4509[var46][var45], class611.field8470[var46][var45][arg5.field7139[var45]]);
                        }
                    }
                }
            }
            if (class623.field8642 != null) {
                var11.method452(var12);
                class623.field8642.method3748(var30, var11, arg0 + 12427);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class55 var47 = var11.method462((byte) 1, var12, true);
            var47.method428((byte) -105, var25, arg8.field5653, arg2 - 1, var22, var21, var24, 0, var23);
            return var47;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IB)Z", line = 271)
    public static final boolean method2146(int arg0, byte arg1) {
        if (arg1 != 123) {
            field5024 = null;
        }
        field5018++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI[I[II)J", line = 282)
    private final long method2147(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field5022++;
        long[] var6 = class422.field5939;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg1) & 0xFFL)];
        if (arg4 <= 16) {
            this.field5020 = null;
        }
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg3[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg3[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg3[var13]) & 0xFFL)];
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)V", line = 333)
    public static void method2148(byte arg0) {
        field5024 = null;
        field5025 = null;
        if (arg0 >= -113) {
            field5024 = null;
        }
    }
}
