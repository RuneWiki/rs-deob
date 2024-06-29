import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class495 extends class206 {

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
    public int[] field7103 = new int[] { -1 };

    @OriginalMember(owner = "client!so", name = "n", descriptor = "[I")
    public int[] field7108 = new int[1];

    @OriginalMember(owner = "client!so", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7109 = new String[] { method3740(method3739("$\t\f\u00114")), method3740(method3739("9\u0013N<")), method3740(method3739("$\t\f\u00144")), method3740(method3739(",H\f~a")), method3740(method3739("$\t\f\u00124")), method3740(method3739("$\t\f\u00134")) };

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Lwia;")
    public static class790 field7106 = new class790(12, -1);

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IILha;Lef;I)V")
    public static final void method3735(int arg0, int arg1, class66 arg2, class513 arg3, int arg4) {
        try {
            if (arg1 != 4) {
                field7106 = null;
            }
            field7107++;
            class728.field10550.method3879(arg1 + 105);
            if (!class416.field6131) {
                for (class131 var5 = (class131) arg3.method3863((byte) 64); var5 != null; var5 = (class131) arg3.method3862(arg1 ^ 0xFFFFFE9B)) {
                    class306 var6 = class161.field2147.method622(var5.field1532, (byte) 86);
                    if (class326.method2762(62, var6)) {
                        boolean var7 = class739.method5391(arg4, arg0, arg2, var5, (byte) 113, var6);
                        if (var7) {
                            class519.method3945(var6, arg2, var5, 0);
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7109[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7109[1] : field7109[3]) + ',' + (arg3 == null ? field7109[1] : field7109[3]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
    public static void method3736(boolean arg0) {
        try {
            if (arg0) {
                field7106 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7109[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I[I[IIZ)J")
    private final long method3737(int arg0, int[] arg1, int[] arg2, int arg3, boolean arg4) {
        try {
            field7105++;
            long[] var6 = class143.field1722;
            long var7 = -1L;
            long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)];
            long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
            for (int var13 = 0; var13 < arg1.length; var13++) {
                long var14 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
                long var16 = var14 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 16) ^ var14) & 0xFFL)];
                long var18 = var16 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var16) & 0xFFL)];
                var11 = var6[(int) ((var18 ^ (long) arg1[var13]) & 0xFFL)] ^ var18 >>> 8;
            }
            if (arg2 != null) {
                for (int var20 = 0; var20 < 5; var20++) {
                    var11 = var11 >>> 8 ^ var6[(int) (((long) arg2[var20] ^ var11) & 0xFFL)];
                }
            }
            return var11 >>> 8 ^ var6[(int) ((long) arg0 & (var11 ^ (long) (arg4 ? 1 : 0)))];
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field7109[5] + arg0 + ',' + (arg1 == null ? field7109[1] : field7109[3]) + ',' + (arg2 == null ? field7109[1] : field7109[3]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILee;Lhs;BIILha;ZII)Lka;")
    public final class497 method3738(int arg0, class704 arg1, class344 arg2, byte arg3, int arg4, int arg5, class66 arg6, boolean arg7, int arg8, int arg9) {
        try {
            field7104++;
            class497 var11 = null;
            int var12 = arg0;
            class144 var13 = null;
            if (arg8 != -1) {
                var13 = class496.field7116.method4847(arg8, 32259);
            }
            int[] var14 = this.field7103;
            if (var13 != null && var13.field1734 != null) {
                var14 = new int[var13.field1734.length];
                for (int var15 = 0; var15 < var13.field1734.length; var15++) {
                    int var16 = var13.field1734[var15];
                    if (var16 >= 0 && this.field7103.length > var16) {
                        var14[var15] = this.field7103[var16];
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
            int var24 = 22 % ((arg3 - 45) / 53);
            class87 var25 = null;
            class87 var26 = null;
            if (arg2 != null) {
                var12 = arg0 | 0x20;
                int var27 = arg2.field5366[arg4];
                int var28 = var27 >>> 16;
                var25 = class272.field4122.method2243(var28, 64);
                var21 = var27 & 0xFFFF;
                if (var25 != null) {
                    var18 |= var25.method737(var21, -25695);
                    var17 |= var25.method733(var21, (byte) 93);
                    var20 |= var25.method731(true, var21);
                    var19 |= arg2.field5367;
                }
                if ((arg2.field5342 || class341.field5310) && arg9 != -1 && arg2.field5366.length > arg9) {
                    int var29 = arg2.field5366[arg9];
                    var23 = arg2.field5361[arg4];
                    int var30 = var29 >>> 16;
                    var22 = var29 & 0xFFFF;
                    if (var28 == var30) {
                        var26 = var25;
                    } else {
                        var26 = class272.field4122.method2243(var22 >>> 16, 64);
                    }
                    if (var26 != null) {
                        var18 |= var26.method737(var22, -25695);
                        var17 |= var26.method733(var22, (byte) 93);
                        var20 |= var26.method731(true, var22);
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
            long var31 = this.method3737(255, var14, arg1 == null ? null : arg1.field10225, arg8, arg7);
            if (class396.field5928 != null) {
                var11 = (class497) class396.field5928.method1558((byte) 96, var31);
            }
            if (var11 == null || arg6.method509(var11.method330(), var12) != 0) {
                if (var11 != null) {
                    var12 = arg6.method499(var12, var11.method330());
                }
                int var33 = var12;
                boolean var34 = false;
                for (int var35 = 0; var35 < var14.length; var35++) {
                    if (var14[var35] != -1 && !class540.field7920.method5000(var14[var35], (byte) 107).method4002(null, arg7, -79)) {
                        var34 = true;
                    }
                }
                if (var34) {
                    return null;
                }
                class137[] var36 = new class137[var14.length];
                for (int var37 = 0; var37 < var14.length; var37++) {
                    if (var14[var37] != -1) {
                        var36[var37] = class540.field7920.method5000(var14[var37], (byte) 70).method4011(null, (byte) 99, arg7);
                    }
                }
                if (var13 != null && var13.field1769 != null) {
                    for (int var38 = 0; var38 < var13.field1769.length; var38++) {
                        if (var13.field1769[var38] != null && var36[var38] != null) {
                            int var39 = var13.field1769[var38][0];
                            int var40 = var13.field1769[var38][1];
                            int var41 = var13.field1769[var38][2];
                            int var42 = var13.field1769[var38][3];
                            int var43 = var13.field1769[var38][4];
                            int var44 = var13.field1769[var38][5];
                            if (var42 != 0 || var43 != 0 || var44 != 0) {
                                var36[var38].method1177(var44, var43, (byte) 55, var42);
                            }
                            if (var39 != 0 || var40 != 0 || var41 != 0) {
                                var36[var38].method1176(0, var40, var41, var39);
                            }
                        }
                    }
                }
                class137 var45 = new class137(var36, var36.length);
                if (arg1 != null) {
                    var33 = var12 | 0x4000;
                }
                var11 = arg6.method552(var45, var33, class202.field3135, 64, 850);
                if (arg1 != null) {
                    for (int var46 = 0; var46 < 5; var46++) {
                        for (int var47 = 0; var47 < class58.field621.length; var47++) {
                            if (class58.field621[var47][var46].length > arg1.field10225[var46]) {
                                var11.method311(class322.field5078[var47][var46], class58.field621[var47][var46][arg1.field10225[var46]]);
                            }
                        }
                    }
                }
                if (class396.field5928 != null) {
                    var11.method347(var12);
                    class396.field5928.method1556(var31, var11, 1);
                }
            }
            if (arg2 == null || var25 == null) {
                return var11;
            } else {
                class497 var48 = var11.method332((byte) 1, var12, true);
                var48.method3764(var23, var26, var22, var25, arg2.field5367, var21, 2, arg5 - 1, 0);
                return var48;
            }
        } catch (RuntimeException var50) {
            throw class759.method5498(var50, field7109[2] + arg0 + ',' + (arg1 == null ? field7109[1] : field7109[3]) + ',' + (arg2 == null ? field7109[1] : field7109[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field7109[1] : field7109[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3739(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!so", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3740(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
