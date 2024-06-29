import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class197 extends class95 {

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public int field3555 = 0;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Lsf;")
    public static class108 field3557 = class140.method973(255, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "[I")
    public static int[] field3562 = new int[128];

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "[Lsf;")
    public static class108[] field3563 = new class108[200];

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "F")
    public static float field3558;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLrm;)V", line = 8)
    public final void method1395(byte arg0, class249 arg1) {
        field3554++;
        if (arg0 != -18) {
            method1399(-90, -125, 115, -21, 75, -6, 97, 118);
        }
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                return;
            }
            this.method1397(-1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 29)
    public static final Object method1396(byte[] arg0, int arg1, boolean arg2) {
        field3561++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > arg1 && !class287.field5017) {
            try {
                class207 var3 = (class207) Class.forName("hj").getDeclaredConstructor().newInstance();
                var3.method216(-100, arg0);
                return var3;
            } catch (Throwable var5) {
                class287.field5017 = true;
            }
        }
        return arg2 ? class247.method1697((byte) 46, arg0) : arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILrm;)V", line = 62)
    private final void method1397(int arg0, int arg1, class249 arg2) {
        if (arg0 != -1) {
            method1398((byte) -99);
        }
        if (arg1 == 2) {
            this.field3555 = arg2.method1712(arg0 ^ 0x0);
        }
        field3556++;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V", line = 83)
    public static void method1398(byte arg0) {
        field3562 = null;
        field3557 = null;
        if (arg0 > -93) {
            method1400(70, 118, 43, -94);
        }
        field3563 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIII)V", line = 111)
    public static final void method1399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg0;
        field3552++;
        int var10 = arg4 - arg3;
        int var11 = arg0 - arg3;
        int var12 = 0;
        int var13 = arg4 * arg4;
        int var14 = var10 * var10;
        if (arg2 != 769014469) {
            return;
        }
        int var15 = arg0 * arg0;
        int var16 = var15 << 1;
        int var17 = var11 * var11;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var17 << 1;
        int var21 = arg0 << 1;
        int var22 = (1 - var21) * var13 + var16;
        int var23 = var15 - ((var21 - 1) * var18);
        int var24 = var11 << 1;
        int var25 = var13 << 2;
        int var26 = var17 - ((var24 - 1) * var19);
        int var27 = var17 << 2;
        int var28 = var16 * 3;
        int var29 = var14 << 2;
        int var30 = (1 - var24) * var14 + var20;
        int var31 = (var21 - 3) * var18;
        int var32 = var20 * 3;
        int var33 = var15 << 2;
        int var34 = (var24 - 3) * var19;
        int var35 = var33;
        int var36 = (arg0 - 1) * var25;
        int var37 = var27;
        if (arg1 >= class266.field4677 && class166.field2984 >= arg1) {
            int[] var38 = class106.field1839[arg1];
            int var39 = class174.method1236(class260.field4593, arg5 - arg4, class79.field1202, -6219);
            int var40 = class174.method1236(class260.field4593, arg4 + arg5, class79.field1202, -6219);
            int var41 = class174.method1236(class260.field4593, arg5 - var10, class79.field1202, -6219);
            int var42 = class174.method1236(class260.field4593, arg5 + var10, class79.field1202, -6219);
            class209.method1452(var41, var38, 7, var39, arg6);
            class209.method1452(var42, var38, 7, var41, arg7);
            class209.method1452(var40, var38, 7, var42, arg6);
        }
        int var43 = (var11 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var11 >= var9;
            if (var44) {
                if (var30 < 0) {
                    while (var30 < 0) {
                        var30 += var32;
                        var12++;
                        var26 += var37;
                        var32 += var27;
                        var37 += var27;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var37 += var27;
                    var30 += var32;
                    var12++;
                    var32 += var27;
                }
                var30 += -var43;
                var43 -= var29;
                var26 += -var34;
                var34 -= var29;
            }
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var28;
                    var28 += var33;
                    var23 += var35;
                    var35 += var33;
                }
            }
            if (var23 < 0) {
                var23 += var35;
                var8++;
                var35 += var33;
                var22 += var28;
                var28 += var33;
            }
            var22 += -var36;
            var9--;
            int var45 = arg1 - var9;
            var36 -= var25;
            var23 += -var31;
            var31 -= var25;
            int var46 = arg1 + var9;
            if (class266.field4677 <= var46 && class166.field2984 >= var45) {
                int var47 = class174.method1236(class260.field4593, arg5 + var8, class79.field1202, -6219);
                int var48 = class174.method1236(class260.field4593, arg5 - var8, class79.field1202, -6219);
                if (var44) {
                    int var49 = class174.method1236(class260.field4593, arg5 + var12, class79.field1202, arg2 ^ 0xD229DD70);
                    int var50 = class174.method1236(class260.field4593, arg5 - var12, class79.field1202, -6219);
                    if (class266.field4677 <= var45) {
                        int[] var51 = class106.field1839[var45];
                        class209.method1452(var50, var51, 7, var48, arg6);
                        class209.method1452(var49, var51, 7, var50, arg7);
                        class209.method1452(var47, var51, arg2 - 769014462, var49, arg6);
                    }
                    if (var46 <= class166.field2984) {
                        int[] var52 = class106.field1839[var46];
                        class209.method1452(var50, var52, 7, var48, arg6);
                        class209.method1452(var49, var52, 7, var50, arg7);
                        class209.method1452(var47, var52, arg2 ^ 0x2DD63AC2, var49, arg6);
                    }
                } else {
                    if (var45 >= class266.field4677) {
                        class209.method1452(var47, class106.field1839[var45], 7, var48, arg6);
                    }
                    if (class166.field2984 >= var46) {
                        class209.method1452(var47, class106.field1839[var46], arg2 ^ 0x2DD63AC2, var48, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)I", line = 323)
    public static final int method1400(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 2) {
            return 102;
        }
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        field3559++;
        return (arg1 >> 5 << 7) + ((arg0 >> 2 << 10) + (arg2 >> 1));
    }
}
