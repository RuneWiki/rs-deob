import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class464 extends class627 {

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public int[] field6712 = new int[1];

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
    public int[] field6715 = new int[] { -1 };

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field6716 = -1;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Lmq;")
    public static class78 field6714 = new class78(93, 4);

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[[I")
    public static int[][] field6717 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILvea;IIZIILrj;ILha;)Lka;", line = 7)
    public final class219 method2745(int arg0, class326 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class747 arg7, int arg8, class454 arg9) {
        field6713++;
        class219 var11 = null;
        int var12 = arg5;
        class459 var13 = null;
        if (arg0 != -1) {
            var13 = class190.field2501.method2848(-19, arg0);
        }
        int[] var14 = this.field6715;
        if (var13 != null && var13.field6410 != null) {
            var14 = new int[var13.field6410.length];
            for (int var15 = 0; var15 < var13.field6410.length; var15++) {
                int var16 = var13.field6410[var15];
                if (var16 >= 0 && this.field6715.length > var16) {
                    var14[var15] = this.field6715[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = arg2;
        int var22 = -1;
        int var23 = 0;
        class555 var24 = null;
        class555 var25 = null;
        if (arg7 != null) {
            var12 = arg5 | 0x20;
            int var26 = arg7.field10458[arg6];
            int var27 = var26 >>> 16;
            var24 = class646.field8903.method637((byte) -123, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method3154(var21, (byte) 80);
                var17 |= var24.method3156(-32146, var21);
                var20 |= var24.method3155(var21, (byte) -125);
                var19 |= arg7.field10459;
            }
            if ((arg7.field10436 || class322.field4112) && arg8 != -1 && arg7.field10458.length > arg8) {
                var23 = arg7.field10453[arg6];
                int var28 = arg7.field10458[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class646.field8903.method637((byte) -125, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method3154(var22, (byte) -36);
                    var17 |= var25.method3156(-32146, var22);
                    var20 |= var25.method3155(var22, (byte) 90);
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
        long var30 = this.method2748(arg1 == null ? null : arg1.field4154, arg4, var14, arg0, -126);
        if (class421.field5993 != null) {
            var11 = (class219) class421.field5993.method778(var30, arg2 - 76);
        }
        if (var11 == null || arg9.method135(var11.method1340(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method100(var12, var11.method1340());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class190.field2488.method3944(256, var14[var34]).method1042(arg4, false)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class415[] var35 = new class415[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class190.field2488.method3944(256, var14[var36]).method1052(false, arg4);
                }
            }
            if (var13 != null && var13.field6454 != null) {
                for (int var37 = 0; var37 < var13.field6454.length; var37++) {
                    if (var13.field6454[var37] != null && var35[var37] != null) {
                        int var38 = var13.field6454[var37][0];
                        int var39 = var13.field6454[var37][1];
                        int var40 = var13.field6454[var37][2];
                        int var41 = var13.field6454[var37][3];
                        int var42 = var13.field6454[var37][4];
                        int var43 = var13.field6454[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2467(var41, var43, arg2 ^ 0x3E8, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2459(var38, 19316, var39, var40);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            class415 var44 = new class415(var35, var35.length);
            var11 = arg9.method150(var44, var32, class545.field7647, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class674.field9172.length; var46++) {
                        if (arg1.field4154[var45] < class674.field9172[var46][var45].length) {
                            var11.method1362(class58.field823[var46][var45], class674.field9172[var46][var45][arg1.field4154[var45]]);
                        }
                    }
                }
            }
            if (class421.field5993 != null) {
                var11.method1327(var12);
                class421.field5993.method774(var30, -97, var11);
            }
        }
        if (arg7 == null || var24 == null) {
            return var11;
        } else {
            class219 var47 = var11.method1337((byte) 1, var12, true);
            var47.method1360(0, (byte) -82, var23, var25, arg7.field10459, var21, var22, var24, arg3 - 1);
            return var47;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 249)
    public static final void method2746(int arg0, int arg1, int arg2) {
        boolean var3 = class495.field7002[0][arg1][arg2] != null && class495.field7002[0][arg1][arg2].field962 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class495.field7002[var4][arg1][arg2] == null) {
                class73 var5 = class495.field7002[var4][arg1][arg2] = new class73(var4);
                if (var3) {
                    var5.field963++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 271)
    public static void method2747(byte arg0) {
        field6714 = null;
        if (arg0 != 31) {
            field6717 = null;
        }
        field6717 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([IZ[III)J", line = 283)
    private final long method2748(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        field6711++;
        long[] var6 = class364.field5171;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
        if (arg4 >= -83) {
            return 116L;
        }
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg2[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg2[var13]) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
    }
}
