import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class38 extends class417 {

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "[I")
    public int[] field465 = new int[1];

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "[I")
    public int[] field466 = new int[] { -1 };

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "Lada;")
    public static class144 field461 = new class144(16, 6);

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "Lkda;")
    public static class328 field467;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 7)
    public static void method247(int arg0) {
        if (arg0 <= 122) {
            method247(-20);
        }
        field467 = null;
        field461 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[IZ[IB)J", line = 18)
    private final long method248(int arg0, int[] arg1, boolean arg2, int[] arg3, byte arg4) {
        int var6 = -21 % ((57 - arg4) / 54);
        field462++;
        long[] var7 = class599.field8835;
        long var8 = -1L;
        long var10 = var7[(int) ((var8 ^ (long) (arg0 >> 8)) & 0xFFL)] ^ var8 >>> 8;
        long var12 = var10 >>> 8 ^ var7[(int) ((var10 ^ (long) arg0) & 0xFFL)];
        for (int var14 = 0; var14 < arg1.length; var14++) {
            long var18 = var7[(int) ((var12 ^ (long) (arg1[var14] >> 24)) & 0xFFL)] ^ var12 >>> 8;
            long var20 = var7[(int) ((var18 ^ (long) (arg1[var14] >> 16)) & 0xFFL)] ^ var18 >>> 8;
            long var22 = var7[(int) ((var20 ^ (long) (arg1[var14] >> 8)) & 0xFFL)] ^ var20 >>> 8;
            var12 = var22 >>> 8 ^ var7[(int) (((long) arg1[var14] ^ var22) & 0xFFL)];
        }
        if (arg3 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var7[(int) (((long) arg3[var15] ^ var12) & 0xFFL)] ^ var12 >>> 8;
            }
        }
        return var12 >>> 8 ^ var7[(int) (((long) (arg2 ? 1 : 0) ^ var12) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILrs;IZLqa;IIILtt;I)Lr;", line = 74)
    public final class159 method249(int arg0, class560 arg1, int arg2, boolean arg3, class208 arg4, int arg5, int arg6, int arg7, class78 arg8, int arg9) {
        field460++;
        class159 var11 = null;
        if (arg7 != -6) {
            this.method248(96, null, false, null, (byte) -29);
        }
        int var12 = arg6;
        class226 var13 = null;
        if (arg2 != -1) {
            var13 = class105.field1514.method921(arg7 ^ 0xFFFFFFDA, arg2);
        }
        int[] var14 = this.field466;
        if (var13 != null && var13.field3299 != null) {
            var14 = new int[var13.field3299.length];
            for (int var15 = 0; var15 < var13.field3299.length; var15++) {
                int var16 = var13.field3299[var15];
                if (var16 >= 0 && this.field466.length > var16) {
                    var14[var15] = this.field466[var16];
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
        class106 var24 = null;
        class106 var25 = null;
        if (arg8 != null) {
            var12 = arg6 | 0x20;
            int var26 = arg8.field1035[arg0];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class463.field6521.method2982(var27, -28);
            if (var24 != null) {
                var18 |= var24.method786(true, var21);
                var17 |= var24.method782(var21, -123);
                var20 |= var24.method780(var21, true);
                var19 |= arg8.field1052;
            }
            if ((arg8.field1048 || class638.field9309) && arg5 != -1 && arg8.field1035.length > arg5) {
                int var28 = arg8.field1035[arg5];
                var23 = arg8.field1049[arg0];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class463.field6521.method2982(var22 >>> 16, arg7 - 110);
                }
                if (var25 != null) {
                    var18 |= var25.method786(true, var22);
                    var17 |= var25.method782(var22, -126);
                    var20 |= var25.method780(var22, true);
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
        long var30 = this.method248(arg2, var14, arg3, arg1 == null ? null : arg1.field8313, (byte) -93);
        if (class131.field1806 != null) {
            var11 = (class159) class131.field1806.method842(0, var30);
        }
        if (var11 == null || arg4.method528(var11.method90(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method478(var12, var11.method90());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class150.field2242.method3606((byte) -127, var14[var34]).method3275((byte) -102, arg3)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class451[] var35 = new class451[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class150.field2242.method3606((byte) -116, var14[var36]).method3273(arg3, class354.method2138(arg7, -8));
                }
            }
            if (var13 != null && var13.field3306 != null) {
                for (int var37 = 0; var37 < var13.field3306.length; var37++) {
                    if (var13.field3306[var37] != null && var35[var37] != null) {
                        int var38 = var13.field3306[var37][0];
                        int var39 = var13.field3306[var37][1];
                        int var40 = var13.field3306[var37][2];
                        int var41 = var13.field3306[var37][3];
                        int var42 = var13.field3306[var37][4];
                        int var43 = var13.field3306[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2732(var41, var43, -30260, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2727(var38, var40, (byte) 44, var39);
                        }
                    }
                }
            }
            class451 var44 = new class451(var35, var35.length);
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg4.method491(var44, var32, class495.field7048, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class80.field1072[var45].length > arg1.field8313[var45]) {
                        var11.method95(class230.field3372[var45], class80.field1072[var45][arg1.field8313[var45]]);
                    }
                    if (class388.field5347[var45].length > arg1.field8313[var45]) {
                        var11.method95(class102.field1474[var45], class388.field5347[var45][arg1.field8313[var45]]);
                    }
                }
            }
            if (class131.field1806 != null) {
                var11.method79(var12);
                class131.field1806.method835((byte) 125, var30, var11);
            }
        }
        if (arg8 == null || var24 == null) {
            return var11;
        } else {
            class159 var46 = var11.method94((byte) 1, var12, true);
            var46.method1142(var24, var25, var23, var22, 0, var21, -32238, arg9 - 1, arg8.field1052);
            return var46;
        }
    }
}
