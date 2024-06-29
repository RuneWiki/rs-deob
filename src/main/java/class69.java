import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class69 extends class35 {

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "[B")
    public byte[] field1471;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "F")
    public static float field1467 = 0.0F;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Lab;")
    public static class279 field1470 = new class279(64);

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "[[I")
    public static int[][] field1472 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1475 = " is already on your ignore list.";

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "[I")
    public static int[] field1474;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 6)
    public static final String method532(int arg0, String arg1) {
        field1465++;
        int var2 = -87 / ((arg0 + 10) / 40);
        String var3 = class159.method1024(class116.method767(-127, arg1), (byte) 83);
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIZ)V", line = 22)
    public static final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1469++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (class249.field3893) {
            int var6 = arg3 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class254.field3969 + ((class187.field3038 - class254.field3969) * var6 / 100);
            if (class39.field765 > var7) {
                var7 = class39.field765;
            } else if (var7 > class168.field2699) {
                var7 = class168.field2699;
            }
            int var8 = var7 * 512 * arg3 / (arg0 * 334);
            if (var8 < class228.field3607) {
                short var9 = class228.field3607;
                var7 = arg0 * 334 * var9 / (arg3 * 512);
                if (class168.field2699 < var7) {
                    var7 = class168.field2699;
                    int var10 = arg3 * 512 * var7 / (var9 * 334);
                    int var11 = (arg0 - var10) / 2;
                    if (arg5) {
                        class115.method753();
                        class115.method755(arg4, arg1, var11, arg3, 0);
                        class115.method755(arg4 + arg0 - var11, arg1, var11, arg3, 0);
                    }
                    arg0 -= var11 * 2;
                    arg4 += var11;
                }
            } else if (class256.field3997 < var8) {
                short var12 = class256.field3997;
                var7 = arg0 * var12 * 334 / (arg3 * 512);
                if (class39.field765 > var7) {
                    var7 = class39.field765;
                    int var13 = arg0 * var12 * 334 / (var7 * 512);
                    int var14 = (arg3 - var13) / 2;
                    if (arg5) {
                        class115.method753();
                        class115.method755(arg4, arg1, arg0, var14, 0);
                        class115.method755(arg4, arg1 + arg3 - var14, arg0, var14, 0);
                    }
                    arg3 -= var14 * 2;
                    arg1 += var14;
                }
            }
            class40.field778 = arg3 * var7 / 334;
        }
        if (arg2 == 0) {
            class282.field4365 = arg4;
            class50.field1016 = (short) arg3;
            class174.field2794 = arg1;
            class146.field2393 = (short) arg0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 125)
    public static final int method534(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        field1473++;
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = 80 / ((90 - arg1) / 32);
        int var6 = (var4 >>> 8) + var4;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIIIII)V", line = 143)
    public static final void method535(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1466++;
        int var8 = arg3;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0 - arg6;
        int var12 = arg3 - arg6;
        int var13 = arg0 * arg0;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var14 << 1;
        int var17 = var13 << 1;
        int var18 = var12 * var12;
        int var19 = var18 << 1;
        int var20 = arg3 << 1;
        int var21 = var12 << 1;
        int var22 = var14 - ((var20 - 1) * var17);
        int var23 = var15 << 1;
        int var24 = (1 - var21) * var15 + var19;
        int var25 = (1 - var20) * var13 + var16;
        int var26 = var18 - ((var21 - 1) * var23);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        if (arg1) {
            method536(true, 78);
        }
        int var29 = var15 << 2;
        int var30 = var18 << 2;
        int var31 = var16 * 3;
        int var32 = (var21 - 3) * var23;
        int var33 = (var20 - 3) * var17;
        int var34 = var30;
        int var35 = (arg3 - 1) * var27;
        int var36 = var28;
        int var37 = var19 * 3;
        if (class59.field1162 <= arg5 && class186.field3028 >= arg5) {
            int[] var38 = class155.field2522[arg5];
            int var39 = class8.method73(8, class259.field4024, class147.field2416, arg7 - arg0);
            int var40 = class8.method73(8, class259.field4024, class147.field2416, arg0 + arg7);
            int var41 = class8.method73(8, class259.field4024, class147.field2416, arg7 - var11);
            int var42 = class8.method73(8, class259.field4024, class147.field2416, arg7 + var11);
            class241.method1598(arg2, -7, var38, var41, var39);
            class241.method1598(arg4, -7, var38, var42, var41);
            class241.method1598(arg2, -7, var38, var40, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var8 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var25 += var31;
                    var31 += var28;
                    var10++;
                    var22 += var36;
                    var36 += var28;
                }
            }
            if (var22 < 0) {
                var25 += var31;
                var31 += var28;
                var22 += var36;
                var10++;
                var36 += var28;
            }
            var22 += -var33;
            var33 -= var27;
            var25 += -var35;
            var35 -= var27;
            boolean var44 = var12 >= var8;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var26 += var34;
                        var24 += var37;
                        var37 += var30;
                        var9++;
                        var34 += var30;
                    }
                }
                if (var26 < 0) {
                    var9++;
                    var24 += var37;
                    var37 += var30;
                    var26 += var34;
                    var34 += var30;
                }
                var26 += -var32;
                var32 -= var29;
                var24 += -var43;
                var43 -= var29;
            }
            var8--;
            int var45 = arg5 - var8;
            int var46 = arg5 + var8;
            if (var46 >= class59.field1162 && class186.field3028 >= var45) {
                int var47 = class8.method73(8, class259.field4024, class147.field2416, arg7 + var10);
                int var48 = class8.method73(8, class259.field4024, class147.field2416, arg7 - var10);
                if (var44) {
                    int var49 = class8.method73(8, class259.field4024, class147.field2416, arg7 + var9);
                    int var50 = class8.method73(8, class259.field4024, class147.field2416, arg7 - var9);
                    if (var45 >= class59.field1162) {
                        int[] var51 = class155.field2522[var45];
                        class241.method1598(arg2, -7, var51, var50, var48);
                        class241.method1598(arg4, -7, var51, var49, var50);
                        class241.method1598(arg2, -7, var51, var47, var49);
                    }
                    if (var46 <= class186.field3028) {
                        int[] var52 = class155.field2522[var46];
                        class241.method1598(arg2, -7, var52, var50, var48);
                        class241.method1598(arg4, -7, var52, var49, var50);
                        class241.method1598(arg2, -7, var52, var47, var49);
                    }
                } else {
                    if (class59.field1162 <= var45) {
                        class241.method1598(arg2, -7, class155.field2522[var45], var47, var48);
                    }
                    if (class186.field3028 >= var46) {
                        class241.method1598(arg2, -7, class155.field2522[var46], var47, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(ZI)I", line = 347)
    public static final int method536(boolean arg0, int arg1) {
        field1468++;
        return arg0 ? arg1 >>> 8 : -112;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V", line = 362)
    public static void method537(boolean arg0) {
        field1474 = null;
        field1472 = (int[][]) null;
        if (arg0) {
            field1470 = (class279) null;
        }
        field1470 = null;
        field1475 = null;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([B)V", line = 383)
    public class69(byte[] arg0) {
        this.field1471 = arg0;
    }
}
