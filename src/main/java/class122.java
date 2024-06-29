import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class122 extends class513 {

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "[I")
    public int[] field1572 = new int[1];

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[I")
    public int[] field1574 = new int[] { -1 };

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "[I")
    public static int[] field1571 = new int[1];

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1573 = -1;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z[I[IIZ)J")
    private final long method852(boolean arg0, int[] arg1, int[] arg2, int arg3, boolean arg4) {
        if (!arg4) {
            return 92L;
        }
        field1575++;
        long[] var6 = class529.field7725;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method853(int arg0) {
        field1571 = null;
        if (arg0 != 255) {
            field1573 = -52;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZILjaa;Lr;IILwt;I)Lda;")
    public final class55 method854(int arg0, int arg1, boolean arg2, int arg3, class569 arg4, class165 arg5, int arg6, int arg7, class282 arg8, int arg9) {
        field1570++;
        class55 var11 = null;
        int var12 = arg6;
        class573 var13 = null;
        if (arg1 != -1) {
            var13 = class332.field4418.method727(arg1, 64);
        }
        int[] var14 = this.field1574;
        if (var13 != null && var13.field8360 != null) {
            var14 = new int[var13.field8360.length];
            for (int var15 = 0; var15 < var13.field8360.length; var15++) {
                int var16 = var13.field8360[var15];
                if (var16 >= 0 && this.field1574.length > var16) {
                    var14[var15] = this.field1574[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        if (arg9 < 32) {
            method853(-54);
        }
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class612 var24 = null;
        class612 var25 = null;
        if (arg8 != null) {
            var12 = arg6 | 0x20;
            int var26 = arg8.field3827[arg3];
            int var27 = var26 >>> 16;
            var24 = class195.field2367.method3270(13161, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method3510(1, var21);
                var17 |= var24.method3509((byte) -115, var21);
                var20 |= var24.method3506((byte) 94, var21);
                var19 |= arg8.field3830;
            }
            if ((arg8.field3816 || class331.field4406) && arg7 != -1 && arg7 < arg8.field3827.length) {
                int var28 = arg8.field3827[arg7];
                var23 = arg8.field3840[arg3];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class195.field2367.method3270(13161, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method3510(1, var22);
                    var17 |= var25.method3509((byte) 111, var22);
                    var20 |= var25.method3506((byte) -44, var22);
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
        long var30 = this.method852(arg2, arg4 == null ? null : arg4.field8328, var14, arg1, true);
        if (class590.field8545 != null) {
            var11 = (class55) class590.field8545.method2766(-121, var30);
        }
        if (var11 == null || arg5.method306(var11.method118(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method271(var12, var11.method118());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class65.field1021.method178(false, var14[var34]).method1448((byte) -128, arg2)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class173[] var35 = new class173[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class65.field1021.method178(false, var14[var36]).method1465(-118, arg2);
                }
            }
            if (var13 != null && var13.field8397 != null) {
                for (int var37 = 0; var37 < var13.field8397.length; var37++) {
                    if (var13.field8397[var37] != null && var35[var37] != null) {
                        int var38 = var13.field8397[var37][0];
                        int var39 = var13.field8397[var37][1];
                        int var40 = var13.field8397[var37][2];
                        int var41 = var13.field8397[var37][3];
                        int var42 = var13.field8397[var37][4];
                        int var43 = var13.field8397[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1089(var41, false, var43, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1093(125, var40, var38, var39);
                        }
                    }
                }
            }
            if (arg4 != null) {
                var32 = var12 | 0x4000;
            }
            class173 var44 = new class173(var35, var35.length);
            var11 = arg5.method274(var44, var32, class83.field1189, 64, 850);
            if (arg4 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class422.field6004.length; var46++) {
                        if (class422.field6004[var46][var45].length > arg4.field8328[var45]) {
                            var11.method87(class499.field6975[var46][var45], class422.field6004[var46][var45][arg4.field8328[var45]]);
                        }
                    }
                }
            }
            if (class590.field8545 != null) {
                var11.method98(var12);
                class590.field8545.method2772(var11, true, var30);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class55 var47 = var11.method97((byte) 1, var12, true);
            var47.method580(arg8.field3830, var22, 0, var21, var24, var23, arg0 - 1, -3651, var25);
            return var47;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lha;III[Z)V")
    public static final void method855(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class340.field4500 == class155.field1899) {
            return;
        }
        int var5 = class399.field5631[arg1].method428(true, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class37 var7 = class399.field5631[var6];
                if (var7 != null) {
                    var7.method430(arg0, arg2, var5 - var7.method428(true, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
