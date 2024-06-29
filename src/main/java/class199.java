import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class199 extends class219 {

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    private int field3373 = 1024;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    private int field3372 = 1024;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    private int field3371 = 819;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    private int field3370 = 1024;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    private int field3374 = 1024;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    private int field3383 = 2048;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    private int field3380 = 0;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    private int field3388 = 0;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    private int field3385 = 409;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Lbd;")
    public static class162 field3378 = class17.method142(0, " <col=ffffff>");

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "Lce;")
    public static class128 field3381 = new class128();

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "[Z")
    public static boolean[] field3390 = new boolean[200];

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lbd;")
    public static class162 field3391 = class17.method142(0, "blinken2:");

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "[S")
    public static short[] field3377;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBIIIIII)V", line = 12)
    public static final void method1484(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3375++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg7 - arg5;
        int var12 = arg0 - arg5;
        int var13 = arg7 * arg7;
        int var14 = var11 * var11;
        int var15 = var12 * var12;
        int var16 = arg0 * arg0;
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var14 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var16 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var14 + var19;
        int var26 = var15 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var16 << 2;
        int var29 = var15 << 2;
        int var30 = (var21 - 3) * var18;
        int var31 = var14 << 2;
        int var32 = var17 * 3;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = (var12 - 1) * var31;
        int var38 = var29;
        int[] var39 = class184.field3180[arg6];
        class3.method14(arg2, arg3 - arg7, -var11 + arg3, var39, -100);
        class3.method14(arg4, arg3 - var11, arg3 + var11, var39, -117);
        int var40 = -124 / ((6 - arg1) / 53);
        class3.method14(arg2, arg3 + var11, arg3 - -arg7, var39, -118);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var35 += var28;
                    var23 += var32;
                    var8++;
                    var32 += var28;
                }
            }
            boolean var41 = var12 >= var9;
            if (var24 < 0) {
                var23 += var32;
                var24 += var35;
                var8++;
                var35 += var28;
                var32 += var28;
            }
            int var42 = arg3 + var8;
            var24 += -var30;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var10++;
                        var26 += var38;
                        var33 += var29;
                        var38 += var29;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var38;
                    var38 += var29;
                    var25 += var33;
                    var33 += var29;
                }
                var25 += -var37;
                var26 += -var34;
                var37 -= var31;
                var34 -= var31;
            }
            var30 -= var27;
            int var43 = arg3 - var8;
            var9--;
            var23 += -var36;
            int var44 = arg6 - var9;
            int var45 = arg6 + var9;
            if (var41) {
                int var46 = arg3 + var10;
                int var47 = arg3 - var10;
                class3.method14(arg2, var43, var47, class184.field3180[var44], -119);
                class3.method14(arg4, var47, var46, class184.field3180[var44], -107);
                class3.method14(arg2, var46, var42, class184.field3180[var44], -112);
                class3.method14(arg2, var43, var47, class184.field3180[var45], -108);
                class3.method14(arg4, var47, var46, class184.field3180[var45], -102);
                class3.method14(arg2, var46, var42, class184.field3180[var45], -120);
            } else {
                class3.method14(arg2, var43, var42, class184.field3180[var44], -109);
                class3.method14(arg2, var43, var42, class184.field3180[var45], -125);
            }
            var36 -= var27;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 838)
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)V", line = 201)
    public static final void method1485(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        field3387++;
        if (arg1 == -1 && !class127.field2307) {
            class158.method1222(-121);
        } else if (arg1 != -1 && (class163.field2887 != arg1 || !class223.method1616((byte) -13)) && class135.field2413 != 0 && !class127.field2307) {
            class209.method1537(arg1, 0, false, -91, class135.field2413, 2, class178.field3047);
        }
        class163.field2887 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILrg;)V", line = 224)
    public static final void method1486(int arg0, class301 arg1) {
        field3389++;
        int var2 = arg1.field5049 - class90.field1598;
        int var3 = arg1.field5054 * 128 + arg1.method293((byte) 25) * 64;
        int var4 = arg1.field5032 * 128 + arg1.method293((byte) 25) * 64;
        arg1.field5013 += (var3 - arg1.field5013) / var2;
        if (arg0 > -27) {
            return;
        }
        if (arg1.field5009 == 0) {
            arg1.field5025 = 1024;
        }
        if (arg1.field5009 == 1) {
            arg1.field5025 = 1536;
        }
        arg1.field5060 = 0;
        if (arg1.field5009 == 2) {
            arg1.field5025 = 0;
        }
        if (arg1.field5009 == 3) {
            arg1.field5025 = 512;
        }
        arg1.field5047 += (var4 - arg1.field5047) / var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)[I", line = 262)
    public final int[] method41(boolean arg0, int arg1) {
        int[] var3 = this.field3654.method2032(3, arg1);
        field3382++;
        if (this.field3654.field4967) {
            int var4 = 0;
            int[][] var5 = this.field3654.method2030(2595);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class128.field2326 * this.field3370 >> 12;
            int var15 = class128.field2326 * this.field3383 >> 12;
            int var16 = class47.field749 * this.field3385 >> 12;
            int var17 = class47.field749 * this.field3371 >> 12;
            if (var17 <= 1) {
                return var5[arg1];
            }
            this.field3376 = class128.field2326 / 8 * this.field3373 >> 12;
            int var18 = class128.field2326 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field3380);
            label130: while (true) {
                while (true) {
                    int var22 = class95.method771(var21, var15 - var14, (byte) 113) + var14;
                    int var23 = var8 + var22;
                    int var24 = var16 + class95.method771(var21, var17 - var16, (byte) 124);
                    if (var23 > class128.field2326) {
                        var23 = class128.field2326;
                        var22 = class128.field2326 - var8;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int[] var25 = var19[var9];
                        int var26 = var9;
                        int var27 = var4 + var23;
                        int var28 = 0;
                        if (var27 < 0) {
                            var27 += class128.field2326;
                        }
                        var29 = var25[2];
                        if (class128.field2326 < var27) {
                            var27 -= class128.field2326;
                        }
                        while (true) {
                            int[] var30 = var19[var26];
                            if (var30[0] <= var27 && var30[1] >= var27) {
                                if (var9 != var26) {
                                    int var31 = var4 + var8;
                                    if (var31 < 0) {
                                        var31 += class128.field2326;
                                    }
                                    if (class128.field2326 < var31) {
                                        var31 -= class128.field2326;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var19[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var19[(var9 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var29 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var31 < var27) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var27, var38);
                                            } else if (var37 == 0) {
                                                var40 = Math.min(var27, var38);
                                                var39 = 0;
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class128.field2326;
                                            }
                                            this.method1488(var36, (byte) -32, var39 + var7, -var39 + var40, var5, var29 - var36, var21);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            var28++;
                            var26++;
                            if (var12 <= var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if (var24 + var29 > class47.field749) {
                        var24 = class47.field749 - var29;
                    } else {
                        var10 = false;
                    }
                    if (class128.field2326 == var23) {
                        this.method1488(var29, (byte) -79, var8 + var6, var22, var5, var24, var21);
                        if (var10) {
                            break label130;
                        }
                        var10 = true;
                        var9 = 0;
                        var11 = false;
                        int[] var41 = var20[var13++];
                        var41[0] = var8;
                        var8 = 0;
                        var7 = var6;
                        var41[2] = var24 + var29;
                        var12 = var13;
                        var13 = 0;
                        int[][] var42 = var19;
                        var41[1] = var23;
                        var19 = var20;
                        var20 = var42;
                        var6 = class95.method771(var21, class128.field2326, (byte) 116);
                        var4 = var6 - var7;
                        int var43 = var4;
                        if (var4 < 0) {
                            var43 = class128.field2326 + var4;
                        }
                        if (var43 > class128.field2326) {
                            var43 -= class128.field2326;
                        }
                        while (true) {
                            int[] var44 = var19[var9];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            var9++;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var20[var13++];
                        var45[2] = var24 + var29;
                        var45[0] = var8;
                        var45[1] = var23;
                        this.method1488(var29, (byte) -110, var6 + var8, var22, var5, var24, var21);
                        var8 = var23;
                    }
                }
            }
        }
        if (!arg0) {
            this.field3376 = 43;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)V", line = 507)
    public static void method1487(byte arg0) {
        field3390 = null;
        if (arg0 >= -84) {
            method1487((byte) -91);
        }
        field3391 = null;
        field3381 = null;
        field3378 = null;
        field3377 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 534)
    public final void method39(byte arg0) {
        if (arg0 != 22) {
            this.field3370 = 77;
        }
        field3384++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILb;)V", line = 548)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field3380 = arg2.method756(arg1 + 915905888);
        } else if (arg0 == 1) {
            this.field3370 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field3383 = arg2.method761((byte) 108);
        } else if (arg0 == 3) {
            this.field3385 = arg2.method761((byte) 108);
        } else if (arg0 == 4) {
            this.field3371 = arg2.method761((byte) 108);
        } else if (arg0 == 5) {
            this.field3373 = arg2.method761((byte) 108);
        } else if (arg0 == 6) {
            this.field3388 = arg2.method756(arg1 + 915905888);
        } else if (arg0 == 7) {
            this.field3374 = arg2.method761((byte) 108);
        } else if (arg0 == 8) {
            this.field3372 = arg2.method761((byte) 108);
        }
        field3392++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBII[[IILjava/util/Random;)V", line = 643)
    private final void method1488(int arg0, byte arg1, int arg2, int arg3, int[][] arg4, int arg5, Random arg6) {
        field3386++;
        int var8 = this.field3372 > 0 ? 4096 - class95.method771(arg6, this.field3372, (byte) 115) : 4096;
        int var9 = this.field3376 * this.field3374 >> 12;
        if (arg1 > -31) {
            this.method1488(-68, (byte) 88, -73, -60, (int[][]) ((int[][]) null), -75, (Random) null);
        }
        int var10 = this.field3376 - (var9 <= 0 ? 0 : class95.method771(arg6, var9, (byte) 119));
        if (class128.field2326 <= arg2) {
            arg2 -= class128.field2326;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg3 <= 0) {
                return;
            }
            int var15 = arg3 / 2;
            int var16 = arg5 / 2;
            int var17 = var16 < var10 ? var16 : var10;
            int var18 = var10 <= var15 ? var10 : var15;
            int var19 = arg3 - (var18 * 2);
            int var20 = arg2 + var18;
            for (int var21 = 0; var21 < arg5; var21++) {
                int[] var22 = arg4[arg0 + var21];
                if (var17 <= var21) {
                    int var23 = arg5 - var21 - 1;
                    if (var17 > var23) {
                        int var24 = var8 * var23 / var17;
                        if (this.field3388 == 0) {
                            for (int var27 = 0; var27 < var18; var27++) {
                                int var28 = var8 * var27 / var18;
                                var22[class92.method695(class252.field4208, arg2 + var27)] = var22[class92.method695(class252.field4208, arg2 + arg3 - var27 - 1)] = var24 * var28 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var18; var25++) {
                                int var26 = var8 * var25 / var18;
                                var22[class92.method695(class252.field4208, arg2 + var25)] = var22[class92.method695(arg2 + arg3 - var25 - 1, class252.field4208)] = var26 < var24 ? var26 : var24;
                            }
                        }
                        if (var19 + var20 <= class128.field2326) {
                            class161.method1230(var22, var20, var19, var24);
                        } else {
                            int var29 = class128.field2326 - var20;
                            class161.method1230(var22, var20, var29, var24);
                            class161.method1230(var22, 0, var19 - var29, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var18; var30++) {
                            var22[class92.method695(class252.field4208, arg2 + var30)] = var22[class92.method695(class252.field4208, arg2 + arg3 - var30 - 1)] = var8 * var30 / var18;
                        }
                        if ((var19 + var20) > class128.field2326) {
                            int var31 = class128.field2326 - var20;
                            class161.method1230(var22, var20, var31, var8);
                            class161.method1230(var22, 0, var19 - var31, var8);
                        } else {
                            class161.method1230(var22, var20, var19, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var17;
                    if (this.field3388 == 0) {
                        for (int var35 = 0; var35 < var18; var35++) {
                            int var36 = var8 * var35 / var18;
                            var22[class92.method695(class252.field4208, arg2 + var35)] = var22[class92.method695(arg2 + arg3 - var35 - 1, class252.field4208)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var18; var33++) {
                            int var34 = var8 * var33 / var18;
                            var22[class92.method695(arg2 + var33, class252.field4208)] = var22[class92.method695(class252.field4208, arg3 + arg2 - var33 - 1)] = var32 > var34 ? var34 : var32;
                        }
                    }
                    if ((var20 + var19) > class128.field2326) {
                        int var37 = class128.field2326 - var20;
                        class161.method1230(var22, var20, var37, var32);
                        class161.method1230(var22, 0, var19 - var37, var32);
                    } else {
                        class161.method1230(var22, var20, var19, var32);
                    }
                }
            }
        } else if (class128.field2326 >= arg2 + arg3) {
            for (int var11 = 0; var11 < arg5; var11++) {
                class161.method1230(arg4[arg0 + var11], arg2, arg3, var8);
            }
        } else {
            int var12 = class128.field2326 - arg2;
            for (int var13 = 0; var13 < arg5; var13++) {
                int[] var14 = arg4[arg0 + var13];
                class161.method1230(var14, arg2, var12, var8);
                class161.method1230(var14, 0, arg3 - var12, var8);
            }
        }
    }
}
