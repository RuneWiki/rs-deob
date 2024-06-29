import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class37 extends class430 {

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "[I")
    public int[] field334 = new int[] { -1 };

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "[I")
    public int[] field332 = new int[1];

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "Llc;")
    public static class435 field336 = new class435(91, 8);

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "J")
    public static long field339 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "[S")
    public static short[] field338;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "([IZBI[I)J")
    private final long method188(int[] arg0, boolean arg1, byte arg2, int arg3, int[] arg4) {
        field335++;
        if (arg2 <= 48) {
            method191(93);
        }
        long[] var6 = class434.field6216;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg3 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg4[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)];
            }
        }
        return var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ)I")
    public static final int method189(int arg0, boolean arg1) {
        field333++;
        double var2 = (double) ((arg0 & 0xFF4ABD) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF84) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return arg1 ? (var21 >> 5 << 7) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1) : -109;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIII)Z")
    public static final boolean method190(byte arg0, int arg1, int arg2, int arg3) {
        class561.field8130.method859(arg1, arg3, arg2, class633.field8935);
        field337++;
        int var4 = class633.field8935[2];
        if (var4 < 50) {
            return false;
        }
        class633.field8935[2] = var4;
        int var5 = 34 / ((arg0 + 57) / 33);
        class633.field8935[0] = class633.field8935[0] * class709.field9967 / var4 + class137.field1884;
        class633.field8935[1] = class633.field8935[1] * class332.field4510 / var4 + class64.field1007;
        return true;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static void method191(int arg0) {
        field336 = null;
        if (arg0 == 256) {
            field338 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIILaca;)V")
    public static final void method192(int arg0, int arg1, int arg2, int arg3, class217 arg4) {
        class375 var5 = class211.method1494(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field3923 = (arg1 << class639.field9095) + class231.field3477;
        arg4.field3922 = arg3;
        arg4.field3916 = (arg2 << class639.field9095) + class231.field3477;
        var5.field5432 = arg4;
        int var6 = class95.field1372 == class25.field221 ? 1 : 0;
        if (arg4.method607((byte) 103)) {
            if (arg4.method614((byte) 33)) {
                class499.field7174[var6][class575.field8273[var6]++] = arg4;
                return;
            }
            class132.field1818[var6][class355.field5248[var6]++] = arg4;
            class235.field3518 = true;
            return;
        }
        class399.field5714[var6][class145.field1963[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILvo;ILha;IZIILjr;)Lka;")
    public final class282 method193(int arg0, int arg1, class131 arg2, int arg3, class543 arg4, int arg5, boolean arg6, int arg7, int arg8, class132 arg9) {
        field331++;
        class282 var11 = null;
        int var12 = arg8;
        class83 var13 = null;
        if (arg5 != -1) {
            var13 = class306.field4169.method1688(-109, arg5);
        }
        int[] var14 = this.field334;
        if (var13 != null && var13.field1194 != null) {
            var14 = new int[var13.field1194.length];
            for (int var15 = 0; var15 < var13.field1194.length; var15++) {
                int var16 = var13.field1194[var15];
                if (var16 >= 0 && this.field334.length > var16) {
                    var14[var15] = this.field334[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        if (arg3 >= -118) {
            method189(-38, false);
        }
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class700 var24 = null;
        class700 var25 = null;
        if (arg2 != null) {
            int var26 = arg2.field1792[arg7];
            var12 = arg8 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class610.field8698.method3005(var27, 14344);
            if (var24 != null) {
                var18 |= var24.method3931(var21, (byte) -78);
                var17 |= var24.method3930((byte) 63, var21);
                var20 |= var24.method3934(var21, (byte) -18);
                var19 |= arg2.field1794;
            }
            if ((arg2.field1783 || class316.field4266) && arg0 != -1 && arg2.field1792.length > arg0) {
                int var28 = arg2.field1792[arg0];
                var23 = arg2.field1812[arg7];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class610.field8698.method3005(var22 >>> 16, 14344);
                }
                if (var25 != null) {
                    var18 |= var25.method3931(var22, (byte) -78);
                    var17 |= var25.method3930((byte) 63, var22);
                    var20 |= var25.method3934(var22, (byte) 0);
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
        long var30 = this.method188(arg9 == null ? null : arg9.field1840, arg6, (byte) 66, arg5, var14);
        if (class141.field1924 != null) {
            var11 = (class282) class141.field1924.method2216(0, var30);
        }
        if (var11 == null || arg4.method300(var11.method528(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method374(var12, var11.method528());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class425.field6147.method4144(var14[var34], 126).method2626(arg6, (byte) 93)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class637[] var35 = new class637[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class425.field6147.method4144(var14[var36], 124).method2628(0, arg6);
                }
            }
            if (var13 != null && var13.field1237 != null) {
                for (int var37 = 0; var37 < var13.field1237.length; var37++) {
                    if (var13.field1237[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1237[var37][0];
                        int var39 = var13.field1237[var37][1];
                        int var40 = var13.field1237[var37][2];
                        int var41 = var13.field1237[var37][3];
                        int var42 = var13.field1237[var37][4];
                        int var43 = var13.field1237[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3664(var42, 0, var41, var43);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3674(var38, var39, var40, 110);
                        }
                    }
                }
            }
            class637 var44 = new class637(var35, var35.length);
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg4.method404(var44, var32, class63.field1005, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class349.field5157.length; var46++) {
                        if (class349.field5157[var46][var45].length > arg9.field1840[var45]) {
                            var11.method486(class587.field8366[var46][var45], class349.field5157[var46][var45][arg9.field1840[var45]]);
                        }
                    }
                }
            }
            if (class141.field1924 != null) {
                var11.method487(var12);
                class141.field1924.method2213((byte) -16, var30, var11);
            }
        }
        if (arg2 == null || var24 == null) {
            return var11;
        } else {
            class282 var47 = var11.method509((byte) 1, var12, true);
            var47.method1808(0, arg2.field1794, var24, 0, var21, var25, arg1 - 1, var23, var22);
            return var47;
        }
    }
}
