import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class539 extends class154 {

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[I")
    public int[] field7320 = new int[] { -1 };

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "[I")
    public int[] field7323 = new int[1];

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field7316 = 0;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field7319 = 0;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "Lfja;")
    public static class783 field7321 = new class783(132, 20);

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "[I")
    public static int[] field7324 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[IZ[II)J")
    private final long method3047(int arg0, int[] arg1, boolean arg2, int[] arg3, int arg4) {
        field7322++;
        long[] var6 = class126.field2227;
        long var7 = -1L;
        if (arg0 != -1) {
            this.field7320 = null;
        }
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg4 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg1[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg1[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg3[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method3048(int arg0) {
        if (arg0 != 255) {
            field7316 = -15;
        }
        field7321 = null;
        field7324 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILc;IZILha;ILqha;)Lka;")
    public final class499 method3049(int arg0, int arg1, int arg2, class200 arg3, int arg4, boolean arg5, int arg6, class66 arg7, int arg8, class112 arg9) {
        field7318++;
        class499 var11 = null;
        int var12 = arg8;
        class540 var13 = null;
        if (arg2 != 65535) {
            return null;
        }
        if (arg6 != -1) {
            var13 = class706.field9695.method92(arg6, (byte) 6);
        }
        int[] var14 = this.field7320;
        if (var13 != null && var13.field7379 != null) {
            var14 = new int[var13.field7379.length];
            for (int var15 = 0; var15 < var13.field7379.length; var15++) {
                int var16 = var13.field7379[var15];
                if (var16 >= 0 && this.field7320.length > var16) {
                    var14[var15] = this.field7320[var16];
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
        class366 var24 = null;
        class366 var25 = null;
        if (arg3 != null) {
            int var26 = arg3.field3040[arg0];
            var12 = arg8 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class108.field1696.method1277(var27, arg2 - 65536);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2236(var21, (byte) 114);
                var17 |= var24.method2238(var21, 0);
                var20 |= var24.method2231(86, var21);
                var19 |= arg3.field3034;
            }
            if ((arg3.field3048 || class499.field6821) && arg4 != -1 && arg4 < arg3.field3040.length) {
                var23 = arg3.field3024[arg0];
                int var28 = arg3.field3040[arg4];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class108.field1696.method1277(var22 >>> 16, -1);
                }
                if (var25 != null) {
                    var18 |= var25.method2236(var22, (byte) 61);
                    var17 |= var25.method2238(var22, 0);
                    var20 |= var25.method2231(65, var22);
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
        long var30 = this.method3047(-1, var14, arg5, arg9 == null ? null : arg9.field2109, arg6);
        if (class687.field9553 != null) {
            var11 = (class499) class687.field9553.method266((byte) -105, var30);
        }
        if (var11 == null || arg7.method482(var11.method300(), var12) != 0) {
            if (var11 != null) {
                var12 = arg7.method593(var12, var11.method300());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class143.field2427.method1410((byte) 10, var14[var34]).method4056(88, null, arg5)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class5[] var35 = new class5[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class143.field2427.method1410((byte) 109, var14[var36]).method4050(arg5, 105, null);
                }
            }
            if (var13 != null && var13.field7374 != null) {
                for (int var37 = 0; var37 < var13.field7374.length; var37++) {
                    if (var13.field7374[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7374[var37][0];
                        int var39 = var13.field7374[var37][1];
                        int var40 = var13.field7374[var37][2];
                        int var41 = var13.field7374[var37][3];
                        int var42 = var13.field7374[var37][4];
                        int var43 = var13.field7374[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method42(var43, var42, arg2 ^ 0xFFB1, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method38(var39, var40, false, var38);
                        }
                    }
                }
            }
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            class5 var44 = new class5(var35, var35.length);
            var11 = arg7.method505(var44, var32, class282.field3914, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class647.field8943.length; var46++) {
                        if (arg9.field2109[var45] < class647.field8943[var46][var45].length) {
                            var11.method308(class260.field3651[var46][var45], class647.field8943[var46][var45][arg9.field2109[var45]]);
                        }
                    }
                }
            }
            if (class687.field9553 != null) {
                var11.method303(var12);
                class687.field9553.method270(var11, var30, -122);
            }
        }
        if (arg3 == null || var24 == null) {
            return var11;
        } else {
            class499 var47 = var11.method324((byte) 1, var12, true);
            var47.method2854(0, arg3.field3034, var23, arg1 - 1, var22, -87, var24, var25, var21);
            return var47;
        }
    }
}
