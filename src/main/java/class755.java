import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class755 extends class134 {

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "[I")
    public int[] field10531 = new int[] { -1 };

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "[I")
    public int[] field10534 = new int[1];

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "Lqo;")
    public static class22 field10532 = new class22();

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V", line = 5)
    public static void method4196(int arg0) {
        if (arg0 > 96) {
            field10532 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z[II[II)J", line = 16)
    private final long method4197(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 >= -25) {
            this.field10531 = null;
        }
        field10529++;
        long[] var6 = class471.field6753;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg2) & 0xFFL)];
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg3[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLuba;ILfba;IIZILha;I)Lka;", line = 68)
    public final class470 method4198(byte arg0, class429 arg1, int arg2, class25 arg3, int arg4, int arg5, boolean arg6, int arg7, class58 arg8, int arg9) {
        field10533++;
        class470 var11 = null;
        int var12 = arg2;
        class255 var13 = null;
        if (arg5 != -1) {
            var13 = class182.field2148.method2676(arg5, 116);
        }
        int var14 = -30 / ((arg0 + 24) / 37);
        int[] var15 = this.field10531;
        if (var13 != null && var13.field3111 != null) {
            var15 = new int[var13.field3111.length];
            for (int var16 = 0; var16 < var13.field3111.length; var16++) {
                int var17 = var13.field3111[var16];
                if (var17 >= 0 && var17 < this.field10531.length) {
                    var15[var16] = this.field10531[var17];
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
        class66 var25 = null;
        class66 var26 = null;
        if (arg3 != null) {
            var12 = arg2 | 0x20;
            int var27 = arg3.field256[arg4];
            int var28 = var27 >>> 16;
            var25 = class637.field9158.method1903((byte) 72, var28);
            var22 = var27 & 0xFFFF;
            if (var25 != null) {
                var19 |= var25.method494(0, var22);
                var18 |= var25.method492(var22, false);
                var21 |= var25.method489(var22, 1);
                var20 |= arg3.field259;
            }
            if ((arg3.field251 || class16.field153) && arg9 != -1 && arg9 < arg3.field256.length) {
                int var29 = arg3.field256[arg9];
                var24 = arg3.field253[arg4];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class637.field9158.method1903((byte) -72, var23 >>> 16);
                }
                if (var26 != null) {
                    var19 |= var26.method494(0, var23);
                    var18 |= var26.method492(var23, false);
                    var21 |= var26.method489(var23, 1);
                }
            }
            if (var19) {
                var12 |= 0x80;
            }
            if (var18) {
                var12 |= 0x100;
            }
            if (var20) {
                var12 |= 0x200;
            }
            if (var21) {
                var12 |= 0x400;
            }
        }
        long var31 = this.method4197(arg6, var15, arg5, arg1 == null ? null : arg1.field6244, -80);
        if (class519.field7380 != null) {
            var11 = (class470) class519.field7380.method3538(var31, 0);
        }
        if (var11 == null || arg8.method418(var11.method213(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method404(var12, var11.method213());
            }
            int var33 = var12;
            boolean var34 = false;
            for (int var35 = 0; var35 < var15.length; var35++) {
                if (var15[var35] != -1 && !class361.field4643.method912((byte) 1, var15[var35]).method2697(arg6, 0)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class260[] var36 = new class260[var15.length];
            for (int var37 = 0; var37 < var15.length; var37++) {
                if (var15[var37] != -1) {
                    var36[var37] = class361.field4643.method912((byte) 1, var15[var37]).method2707(arg6, -19118);
                }
            }
            if (var13 != null && var13.field3070 != null) {
                for (int var38 = 0; var38 < var13.field3070.length; var38++) {
                    if (var13.field3070[var38] != null && var36[var38] != null) {
                        int var39 = var13.field3070[var38][0];
                        int var40 = var13.field3070[var38][1];
                        int var41 = var13.field3070[var38][2];
                        int var42 = var13.field3070[var38][3];
                        int var43 = var13.field3070[var38][4];
                        int var44 = var13.field3070[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method1564(var43, var42, (byte) -126, var44);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method1558(var39, -124, var41, var40);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var33 = var12 | 0x4000;
            }
            class260 var45 = new class260(var36, var36.length);
            var11 = arg8.method383(var45, var33, class359.field4592, 64, 850);
            if (arg1 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    for (int var47 = 0; var47 < class127.field1332.length; var47++) {
                        if (class127.field1332[var47][var46].length > arg1.field6244[var46]) {
                            var11.method187(class291.field3581[var47][var46], class127.field1332[var47][var46][arg1.field6244[var46]]);
                        }
                    }
                }
            }
            if (class519.field7380 != null) {
                var11.method207(var12);
                class519.field7380.method3537(-103, var31, var11);
            }
        }
        if (arg3 == null || var25 == null) {
            return var11;
        } else {
            class470 var48 = var11.method237((byte) 1, var12, true);
            var48.method2838(arg3.field259, var23, var22, var26, var24, var25, -3369, arg7 - 1, 0);
            return var48;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIII)Z", line = 316)
    public static final boolean method4199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10530++;
        if ((class100.field1043[arg0][arg3][arg4] & 0x2) != 0) {
            return true;
        } else if ((class100.field1043[arg2][arg3][arg4] & 0x10) == 0) {
            return arg1 == class582.method3350(arg2, arg4, arg3, true);
        } else {
            return false;
        }
    }
}
