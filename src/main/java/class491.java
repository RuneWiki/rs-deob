import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class491 extends class71 {

    @OriginalMember(owner = "client!vw", name = "I", descriptor = "Lne;")
    public static class175 field6900 = new class175();

    @OriginalMember(owner = "client!vw", name = "E", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!vw", name = "F", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!vw", name = "G", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!vw", name = "H", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!vw", name = "J", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!vw", name = "K", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!vw", name = "L", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!vw", name = "M", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!vw", name = "N", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Llh;[BII)Lqg;", line = 4)
    public static final class201 method2804(class125 arg0, byte[] arg1, int arg2, int arg3) {
        ++field6896;
        if (arg1 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class576.field8227, 0);
            if (arg3 != -6876) {
                field6900 = null;
            }
            if (class576.field8227[0] != -1) {
                OpenGL.glBindProgramARB(arg2, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg2, 0);
                return new class201(arg0, arg2, var4);
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)V", line = 34)
    public static void method2805(int arg0) {
        field6900 = null;
        if (arg0 != -1) {
            method2808((byte) 91);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIIIII[[Z)V", line = 44)
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6904;
        class412 var9 = (class412) super.field1341.method395(Thread.currentThread());
        class613 var10 = var9.field6106;
        var10.field8704 = 0;
        var10.field8707 = false;
        if (super.field1342 != null) {
            this.method2806(var10, arg1, arg5, 121, arg0, arg6, arg4, arg2, arg7, var9.field2530, arg3, var9.field2569);
        } else if (super.field1326 != null) {
            this.method2807(65535, arg6, arg1, arg7, var9.field2530, arg3, arg5, arg2, var10, arg0, arg4, var9.field2569);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Leq;IIIIIII[[Z[II[I)V", line = 65)
    private final void method2806(class613 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8, int[] arg9, int arg10, int[] arg11) {
        ++field6897;
        int var13 = (arg5 - arg6) * arg7 / 256;
        if (arg3 <= 88) {
            field6900 = null;
        }
        arg0.field8703 = false;
        arg0.field8696 = false;
        int var14 = arg7 >> 8;
        int var15 = arg4;
        int var16 = arg1 + var13;
        for (int var17 = arg10; ~arg2 < ~var17; ++var17) {
            for (int var18 = arg6; var18 < arg5; ++var18) {
                if (arg8[-arg10 + var17][var18 - arg6]) {
                    if (super.field1342[var17][var18] != null) {
                        class462 var33 = super.field1342[var17][var18];
                        if (var33.field6683 != -1 && (2 & var33.field6688) == 0 && var33.field6691 == 0) {
                            int var34 = super.field1341.method1925(var33.field6683);
                            arg0.method3487(var16 - var14, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, class519.method2936((byte) 115, var34, var33.field6692), class519.method2936((byte) 102, var34, var33.field6687), class519.method2936((byte) 77, var34, var33.field6690));
                            arg0.method3487(var16, var16, -var14 + var16, var15, var14 + var15, var15, class519.method2936((byte) 97, var34, var33.field6689), class519.method2936((byte) 105, var34, var33.field6690), class519.method2936((byte) 94, var34, var33.field6687));
                        } else if (var33.field6691 == 0) {
                            arg0.method3480(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var33.field6692, var33.field6687, var33.field6690);
                            arg0.method3480(var16, var16, -var14 + var16, var15, var14 + var15, var15, var33.field6689, var33.field6690, var33.field6687);
                        } else {
                            int var35 = var33.field6691;
                            arg0.method3480(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class276.method1777((byte) 84, var33.field6692 & -16777216, var35), class276.method1777((byte) 127, -16777216 & var33.field6687, var35), class276.method1777((byte) 112, -16777216 & var33.field6690, var35));
                            arg0.method3480(var16, var16, -var14 + var16, var15, var14 + var15, var15, class276.method1777((byte) 106, -16777216 & var33.field6689, var35), class276.method1777((byte) 117, -16777216 & var33.field6690, var35), class276.method1777((byte) 63, var33.field6687 & -16777216, var35));
                        }
                    } else if (super.field1335[var17][var18] != null) {
                        class3 var19 = super.field1335[var17][var18];
                        for (int var20 = 0; var19.field26 > var20; ++var20) {
                            arg9[var20] = var19.field25[var20] * var14 / super.field7544 + var15;
                            arg11[var20] = -(var19.field22[var20] * var14 / super.field7544) + var16;
                        }
                        for (int var21 = 0; ~var19.field24 < ~var21; ++var21) {
                            int var22 = var21 * 3;
                            int var23 = var22 + 1;
                            int var24 = var23 + 1;
                            int var25 = arg9[var22];
                            int var26 = arg9[var23];
                            int var27 = arg9[var24];
                            int var28 = arg11[var22];
                            int var29 = arg11[var23];
                            int var30 = arg11[var24];
                            if (var19.field27 != null && var19.field27[var21] != 0 && (var19.field29 == null || var19.field29 != null && var19.field29[var21] == -1)) {
                                int var31 = var19.field27[var21];
                                arg0.method3480(var28, var29, var30, var25, var26, var27, class276.method1777((byte) 102, -(var19.field28[var22] & -16777216) + -16777216, var31), class276.method1777((byte) 96, -(var19.field28[var23] & -16777216) + -16777216, var31), class276.method1777((byte) 98, -(-16777216 & var19.field28[var24]) + -16777216, var31));
                            } else if (var19.field29 != null && var19.field29[var21] != -1) {
                                int var32 = super.field1341.method1925(var19.field29[var21]);
                                arg0.method3487(var28, var29, var30, var25, var26, var27, var32, var32, var32);
                            } else {
                                arg0.method3480(var28, var29, var30, var25, var26, var27, var19.field28[var22], var19.field28[var23], var19.field28[var24]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg1 + var13;
            var15 += var14;
        }
        arg0.field8696 = true;
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lvda;IIII[[I[[II)V", line = 203)
    public class491(class309 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(III[[Z[IIIILeq;II[I)V", line = 207)
    private final void method2807(int arg0, int arg1, int arg2, boolean[][] arg3, int[] arg4, int arg5, int arg6, int arg7, class613 arg8, int arg9, int arg10, int[] arg11) {
        ++field6901;
        int var13 = (-arg10 + arg1) * arg7 / 256;
        arg8.field8696 = false;
        arg8.field8703 = false;
        int var14 = arg7 >> 8;
        int var15 = arg9;
        if (arg0 == 65535) {
            int var16 = arg2 + var13;
            for (int var17 = arg5; ~arg6 < ~var17; ++var17) {
                for (int var18 = arg10; arg1 > var18; ++var18) {
                    if (arg3[-arg5 + var17][var18 - arg10]) {
                        if (super.field1326[var17][var18] != null) {
                            class535 var34 = super.field1326[var17][var18];
                            if (var34.field7464 != -1 && ~(2 & var34.field7466) == -1 && ~var34.field7463 == 0) {
                                int var35 = super.field1341.method1925(var34.field7464);
                                arg8.method3487(-var14 + var16, var16 - var14, var16, var15 - -var14, var15, var14 + var15, class519.method2936((byte) 75, var35, 65535 & var34.field7462), class519.method2936((byte) 93, var35, var34.field7465 & 65535), class519.method2936((byte) 113, var35, 65535 & var34.field7468));
                                arg8.method3487(var16, var16, -var14 + var16, var15, var14 + var15, var15, class519.method2936((byte) 75, var35, 65535 & var34.field7467), class519.method2936((byte) 103, var35, var34.field7468 & 65535), class519.method2936((byte) 102, var35, var34.field7465 & 65535));
                            } else if (~var34.field7463 != 0) {
                                int var36 = var34.field7463;
                                arg8.method3487(-var14 + var16, var16 - var14, var16, var15 - -var14, var15, var14 + var15, var36, var36, var36);
                                arg8.method3487(var16, var16, -var14 + var16, var15, var14 + var15, var15, var36, var36, var36);
                            } else {
                                arg8.method3487(var16 - var14, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, var34.field7462 & 65535, var34.field7465 & 65535, 65535 & var34.field7468);
                                arg8.method3487(var16, var16, -var14 + var16, var15, var14 + var15, var15, var34.field7467 & 65535, 65535 & var34.field7468, 65535 & var34.field7465);
                            }
                        } else if (super.field1329[var17][var18] != null) {
                            class160 var19 = super.field1329[var17][var18];
                            for (int var20 = 0; ~var19.field2383 < ~var20; ++var20) {
                                arg4[var20] = var19.field2385[var20] * var14 / super.field7544 + var15;
                                arg11[var20] = var16 - var19.field2391[var20] * var14 / super.field7544;
                            }
                            for (int var21 = 0; var21 < var19.field2384; ++var21) {
                                short var22 = var19.field2387[var21];
                                short var23 = var19.field2381[var21];
                                short var24 = var19.field2389[var21];
                                int var25 = arg4[var22];
                                int var26 = arg4[var23];
                                int var27 = arg4[var24];
                                int var28 = arg11[var22];
                                int var29 = arg11[var23];
                                int var30 = arg11[var24];
                                if (var19.field2388 != null && ~var19.field2388[var21] != 0) {
                                    int var31 = var19.field2388[var21];
                                    arg8.method3487(var28, var29, var30, var25, var26, var27, class519.method2936((byte) 93, var31, var19.field2390[var22]), class519.method2936((byte) 103, var31, var19.field2390[var23]), class519.method2936((byte) 87, var31, var19.field2390[var24]));
                                } else if (var19.field2380 != null && var19.field2380[var21] != -1) {
                                    int var32 = super.field1341.method1925(var19.field2380[var21]);
                                    arg8.method3487(var28, var29, var30, var25, var26, var27, class519.method2936((byte) 79, var32, var19.field2390[var22]), class519.method2936((byte) 118, var32, var19.field2390[var23]), class519.method2936((byte) 121, var32, var19.field2390[var24]));
                                } else {
                                    int var33 = var19.field2382[var21];
                                    arg8.method3487(var28, var29, var30, var25, var26, var27, class519.method2936((byte) 113, var33, var19.field2390[var22]), class519.method2936((byte) 122, var33, var19.field2390[var23]), class519.method2936((byte) 124, var33, var19.field2390[var24]));
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var16 = arg2 + var13;
                var15 += var14;
            }
            arg8.field8696 = true;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V", line = 349)
    public final void method693(int arg0, int arg1) {
        ++field6902;
        class412 var3 = (class412) super.field1341.method395(Thread.currentThread());
        var3.field6106.field8704 = 0;
        if (super.field1342 == null) {
            if (super.field1326 != null) {
                this.method2809(arg0, 65535, var3.field2530, var3.field2569, arg1, var3.field2538, var3.field6106);
                return;
            }
        } else {
            this.method2811(arg1, arg0, var3.field2538, var3.field2569, -9757, super.field1341.field4493, var3.field6106, var3.field2530);
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V", line = 370)
    public static final void method2808(byte arg0) {
        ++field6903;
        class602.method3424((byte) 123);
        if (arg0 >= -48) {
            field6900 = null;
        }
        class584.field8319 = null;
        class28.field371 = null;
        class139.field2188 = null;
        class6.field59 = null;
        class134.field2161 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II[I[II[ILeq;)V", line = 390)
    private final void method2809(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int[] arg5, class613 arg6) {
        ++field6898;
        class535 var8 = super.field1326[arg0][arg4];
        if (var8 != null) {
            if (~(2 & var8.field7466) == -1) {
                int var9 = super.field7544 * arg0;
                int var10 = super.field7544 + var9;
                int var11 = super.field7544 * arg4;
                int var12 = super.field7544 + var11;
                int var14;
                int var16;
                int var17;
                int var20;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var30;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if (~(1 & var8.field7466) != -1) {
                    int var13 = super.field1322[arg0][arg4];
                    int var15;
                    if (~super.field1330 != 0) {
                        var14 = super.field1330;
                        var15 = super.field1330;
                        var16 = super.field1330;
                        var17 = super.field1330;
                    } else {
                        int var18 = super.field1338 * var13;
                        var17 = (super.field1324 * var9 + var18 - -(super.field1332 * var11) >> 15) + super.field1327;
                        if (~super.field1341.field4490 <= ~var17) {
                            return;
                        }
                        var16 = (super.field1332 * var11 + super.field1324 * var10 + var18 >> 15) + super.field1327;
                        if (var16 <= super.field1341.field4490) {
                            return;
                        }
                        var15 = (super.field1332 * var12 + super.field1324 * var10 + var18 >> 15) + super.field1327;
                        if (~var15 >= ~super.field1341.field4490) {
                            return;
                        }
                        var14 = (super.field1332 * var12 + super.field1324 * var9 + var18 >> 15) + super.field1327;
                        if (var14 <= super.field1341.field4490) {
                            return;
                        }
                    }
                    int var19 = super.field1325 * var13;
                    var20 = (super.field1321 * var9 + var19 - -(super.field1336 * var11) >> 15) + super.field1333;
                    int var21 = super.field1334 * var13;
                    var22 = (super.field1340 * var9 + (var21 - -(super.field1323 * var11)) >> 15) + super.field1337;
                    var23 = arg6.field8694 - -(super.field1341.field4485 * var20 / var17);
                    var24 = (super.field1321 * var10 + (var19 - -(super.field1336 * var11)) >> 15) + super.field1333;
                    var25 = super.field1341.field4505 * var22 / var17 + arg6.field8705;
                    var26 = super.field1341.field4485 * var24 / var16 + arg6.field8694;
                    var27 = (super.field1340 * var10 + super.field1323 * var11 + var21 >> 15) + super.field1337;
                    int var28 = (super.field1336 * var12 + super.field1321 * var10 + var19 >> 15) + super.field1333;
                    var29 = super.field1341.field4505 * var27 / var16 + arg6.field8705;
                    var30 = super.field1341.field4485 * var28 / var15 + arg6.field8694;
                    int var31 = super.field1337 - -(super.field1340 * var10 - -(super.field1323 * var12) + var21 >> 15);
                    var32 = (super.field1336 * var12 + super.field1321 * var9 + var19 >> 15) + super.field1333;
                    var33 = super.field1341.field4505 * var31 / var15 + arg6.field8705;
                    var34 = super.field1337 - -(super.field1323 * var12 + super.field1340 * var9 + var21 >> 15);
                    var35 = super.field1341.field4485 * var32 / var14 + arg6.field8694;
                    var36 = arg6.field8705 - -(super.field1341.field4505 * var34 / var14);
                } else {
                    int var37 = super.field1322[arg0][arg4];
                    int var38 = super.field1322[arg0 + 1][arg4];
                    int var39 = super.field1322[arg0 + 1][arg4 + 1];
                    int var40 = super.field1322[arg0][arg4 + 1];
                    int var41;
                    if (~super.field1330 != 0) {
                        var14 = super.field1330;
                        var41 = super.field1330;
                        var16 = super.field1330;
                        var17 = super.field1330;
                    } else {
                        var17 = super.field1327 - -(super.field1332 * var11 + super.field1338 * var37 + super.field1324 * var9 >> 15);
                        if (super.field1341.field4490 >= var17) {
                            return;
                        }
                        var16 = (super.field1338 * var38 + super.field1332 * var11 + super.field1324 * var10 >> 15) + super.field1327;
                        if (~super.field1341.field4490 <= ~var16) {
                            return;
                        }
                        var41 = (super.field1324 * var10 - (-(super.field1338 * var39) + -(super.field1332 * var12)) >> 15) + super.field1327;
                        if (var41 <= super.field1341.field4490) {
                            return;
                        }
                        var14 = (super.field1338 * var40 + super.field1324 * var9 - -(super.field1332 * var12) >> 15) + super.field1327;
                        if (~var14 >= ~super.field1341.field4490) {
                            return;
                        }
                    }
                    var20 = (super.field1325 * var37 + (super.field1321 * var9 - -(super.field1336 * var11)) >> 15) + super.field1333;
                    var22 = (super.field1323 * var11 + super.field1340 * var9 + super.field1334 * var37 >> 15) + super.field1337;
                    var23 = super.field1341.field4485 * var20 / var17 + arg6.field8694;
                    var25 = super.field1341.field4505 * var22 / var17 + arg6.field8705;
                    var24 = super.field1333 - -(super.field1321 * var10 + (super.field1325 * var38 - -(super.field1336 * var11)) >> 15);
                    var27 = super.field1337 - -(super.field1323 * var11 + super.field1340 * var10 + super.field1334 * var38 >> 15);
                    var26 = super.field1341.field4485 * var24 / var16 + arg6.field8694;
                    var29 = arg6.field8705 - -(super.field1341.field4505 * var27 / var16);
                    int var42 = (super.field1321 * var10 + (super.field1325 * var39 - -(super.field1336 * var12)) >> 15) + super.field1333;
                    var30 = super.field1341.field4485 * var42 / var41 + arg6.field8694;
                    int var43 = super.field1337 - -(super.field1323 * var12 + super.field1340 * var10 + super.field1334 * var39 >> 15);
                    var32 = (super.field1321 * var9 + super.field1336 * var12 + super.field1325 * var40 >> 15) + super.field1333;
                    var33 = super.field1341.field4505 * var43 / var41 + arg6.field8705;
                    var34 = (super.field1323 * var12 + (super.field1340 * var9 - -(super.field1334 * var40)) >> 15) + super.field1337;
                    var35 = super.field1341.field4485 * var32 / var14 + arg6.field8694;
                    var36 = arg6.field8705 - -(super.field1341.field4505 * var34 / var14);
                }
                if ((-var35 + var30) * (-var36 + var29) + -((-var35 + var26) * (-var36 + var33)) > 0) {
                    arg6.field8707 = ~var30 > -1 || var35 < 0 || var26 < 0 || ~arg6.field8697 > ~var30 || var35 > arg6.field8697 || arg6.field8697 < var26;
                    if (var8.field7464 >= 0) {
                        if (this.method700(super.field1341.field2443.method2387((byte) 127, var8.field7464).field8203)) {
                            arg6.field8704 = 100;
                        }
                        arg6.method3476(var33, var36, var29, var30, var35, var26, var8.field7462 & 65535, var8.field7465 & 65535, var8.field7468 & 65535, var20, var24, var32, var22, var27, var34, var17, var16, var14, var8.field7464);
                        arg6.field8704 = 0;
                    } else {
                        arg6.method3487(var33, var36, var29, var30, var35, var26, var8.field7462 & 65535, var8.field7465 & 65535, 65535 & var8.field7468);
                    }
                }
                if (~((-var26 + var23) * (-var29 + var36) + -((-var26 + var35) * (-var29 + var25))) < -1) {
                    arg6.field8707 = var23 < 0 || ~var26 > -1 || ~var35 > -1 || ~arg6.field8697 > ~var23 || ~var26 < ~arg6.field8697 || arg6.field8697 < var35;
                    if (~var8.field7464 <= -1) {
                        if (this.method700(super.field1341.field2443.method2387((byte) 127, var8.field7464).field8203)) {
                            arg6.field8704 = 100;
                        }
                        arg6.method3476(var25, var29, var36, var23, var26, var35, 65535 & var8.field7467, 65535 & var8.field7468, var8.field7465 & 65535, var20, var24, var32, var22, var27, var34, var17, var16, var14, var8.field7464);
                        arg6.field8704 = 0;
                        return;
                    }
                    arg6.method3487(var25, var29, var36, var23, var26, var35, 65535 & var8.field7467, 65535 & var8.field7468, 65535 & var8.field7465);
                }
            }
        } else {
            class160 var44 = super.field1329[arg0][arg4];
            if (arg1 != 65535) {
                field6900 = null;
            }
            if (var44 != null) {
                if (super.field1330 != -1) {
                    for (int var45 = 0; ~var44.field2383 < ~var45; ++var45) {
                        int var46 = var44.field2385[var45] - -(arg0 << super.field7537);
                        short var47 = var44.field2386[var45];
                        int var48 = (arg4 << super.field7537) + var44.field2391[var45];
                        int var49 = super.field1333 - -(super.field1336 * var48 + super.field1321 * var46 - -(super.field1325 * var47) >> 15);
                        int var50 = (super.field1340 * var46 - (-(super.field1334 * var47) - super.field1323 * var48) >> 15) + super.field1337;
                        arg2[var45] = super.field1341.field4485 * var49 / super.field1330 + arg6.field8694;
                        arg3[var45] = super.field1341.field4505 * var50 / super.field1330 + arg6.field8705;
                    }
                } else {
                    for (int var51 = 0; ~var44.field2383 < ~var51; ++var51) {
                        int var91 = (arg0 << super.field7537) + var44.field2385[var51];
                        short var92 = var44.field2386[var51];
                        int var93 = (arg4 << super.field7537) + var44.field2391[var51];
                        int var94 = (super.field1332 * var93 + super.field1338 * var92 + super.field1324 * var91 >> 15) + super.field1327;
                        if (~super.field1341.field4490 <= ~var94) {
                            return;
                        }
                        int var95 = (super.field1340 * var91 + super.field1323 * var93 - -(super.field1334 * var92) >> 15) + super.field1337;
                        int var96 = super.field1333 - -(super.field1325 * var92 + super.field1336 * var93 + super.field1321 * var91 >> 15);
                        arg2[var51] = super.field1341.field4485 * var96 / var94 + arg6.field8694;
                        arg3[var51] = super.field1341.field4505 * var95 / var94 + arg6.field8705;
                    }
                }
                if (var44.field2380 == null) {
                    for (int var52 = 0; var44.field2384 > var52; ++var52) {
                        short var53 = var44.field2387[var52];
                        short var54 = var44.field2381[var52];
                        short var55 = var44.field2389[var52];
                        int var56 = arg2[var53];
                        int var57 = arg2[var54];
                        int var58 = arg2[var55];
                        int var59 = arg3[var53];
                        int var60 = arg3[var54];
                        int var61 = arg3[var55];
                        if (~((var56 - var57) * (var61 - var60) - (var58 - var57) * (-var60 + var59)) < -1) {
                            int var62 = var44.field2382[var52];
                            if (var62 != -1) {
                                arg6.field8707 = ~var56 > -1 || var57 < 0 || ~var58 > -1 || ~var56 < ~arg6.field8697 || var57 > arg6.field8697 || var58 > arg6.field8697;
                                arg6.method3487(var59, var60, var61, var56, var57, var58, class519.method2936((byte) 118, var62, var44.field2390[var53]), class519.method2936((byte) 115, var62, var44.field2390[var54]), class519.method2936((byte) 92, var62, var44.field2390[var55]));
                            }
                        }
                    }
                } else {
                    int var63 = super.field1322[arg0][arg4];
                    int var64 = super.field1322[arg0 - -1][arg4];
                    int var65 = super.field1322[arg0][arg4 + 1];
                    int var66 = super.field7544 * arg0;
                    int var67 = super.field7544 + var66;
                    int var68 = super.field7544 * arg4;
                    int var69 = super.field7544 + var68;
                    int var70 = (super.field1336 * var68 + super.field1325 * var63 + super.field1321 * var66 >> 15) + super.field1333;
                    int var71 = (super.field1323 * var68 + super.field1340 * var66 + super.field1334 * var63 >> 15) + super.field1337;
                    int var72 = super.field1327 - -(super.field1338 * var63 + super.field1324 * var66 - -(super.field1332 * var68) >> 15);
                    int var73 = (super.field1336 * var68 + (super.field1321 * var67 - -(super.field1325 * var64)) >> 15) + super.field1333;
                    int var74 = super.field1337 - -(super.field1323 * var68 + (super.field1340 * var67 - -(super.field1334 * var64)) >> 15);
                    int var75 = (super.field1324 * var67 + super.field1338 * var64 + super.field1332 * var68 >> 15) + super.field1327;
                    int var76 = super.field1333 - -(super.field1325 * var65 + super.field1321 * var66 - -(super.field1336 * var69) >> 15);
                    int var77 = super.field1337 - -(super.field1340 * var66 + super.field1334 * var65 + super.field1323 * var69 >> 15);
                    int var78 = (super.field1332 * var69 + super.field1324 * var66 - -(super.field1338 * var65) >> 15) + super.field1327;
                    for (int var79 = 0; ~var44.field2384 < ~var79; ++var79) {
                        short var80 = var44.field2387[var79];
                        short var81 = var44.field2381[var79];
                        short var82 = var44.field2389[var79];
                        int var83 = arg2[var80];
                        int var84 = arg2[var81];
                        int var85 = arg2[var82];
                        int var86 = arg3[var80];
                        int var87 = arg3[var81];
                        int var88 = arg3[var82];
                        if ((-var84 + var83) * (-var87 + var88) + -((-var84 + var85) * (-var87 + var86)) > 0) {
                            arg6.field8707 = var83 < 0 || var84 < 0 || ~var85 > -1 || arg6.field8697 < var83 || ~arg6.field8697 > ~var84 || var85 > arg6.field8697;
                            short var89 = var44.field2380[var79];
                            if (~var89 == 0) {
                                int var90 = var44.field2382[var79];
                                if (var90 != -1) {
                                    arg6.method3487(var86, var87, var88, var83, var84, var85, class519.method2936((byte) 89, var90, var44.field2390[var80]), class519.method2936((byte) 93, var90, var44.field2390[var81]), class519.method2936((byte) 82, var90, var44.field2390[var82]));
                                }
                            } else {
                                if (this.method700(super.field1341.field2443.method2387((byte) 127, var89).field8203)) {
                                    arg6.field8704 = 100;
                                }
                                arg6.method3476(var86, var87, var88, var83, var84, var85, var44.field2390[var80], var44.field2390[var81], var44.field2390[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                arg6.field8704 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZI)V", line = 762)
    public static final void method2810(boolean arg0, int arg1) {
        ++field6905;
        if (arg0) {
            method2810(true, -8);
        }
        class21 var2 = class601.method3413(arg1, 5, (byte) 110);
        var2.method227(true);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II[I[IIZLeq;[I)V", line = 776)
    private final void method2811(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, boolean arg5, class613 arg6, int[] arg7) {
        ++field6899;
        class462 var9 = super.field1342[arg1][arg0];
        if (var9 != null) {
            if (~(var9.field6688 & 2) == -1) {
                int var10 = super.field7544 * arg1;
                int var11 = var10 - -super.field7544;
                int var12 = super.field7544 * arg0;
                int var13 = var12 - -super.field7544;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var20;
                int var21;
                int var22;
                int var23;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                if (~(var9.field6688 & 1) != -1 && !arg5) {
                    int var18 = super.field1322[arg1][arg0];
                    if (~super.field1330 == 0) {
                        int var19 = super.field1338 * var18;
                        var20 = (super.field1332 * var12 + super.field1324 * var10 + var19 >> 15) + super.field1327;
                        if (var20 <= super.field1341.field4490) {
                            return;
                        }
                        var21 = (super.field1332 * var12 + super.field1324 * var11 + var19 >> 15) + super.field1327;
                        if (~var21 >= ~super.field1341.field4490) {
                            return;
                        }
                        var22 = (super.field1332 * var13 + (super.field1324 * var11 - -var19) >> 15) + super.field1327;
                        if (super.field1341.field4490 >= var22) {
                            return;
                        }
                        var23 = super.field1327 - -(super.field1332 * var13 + super.field1324 * var10 + var19 >> 15);
                        if (~super.field1341.field4490 <= ~var23) {
                            return;
                        }
                    } else {
                        var23 = super.field1330;
                        var22 = super.field1330;
                        var21 = super.field1330;
                        var20 = super.field1330;
                    }
                    if (super.field1341.field4498) {
                        int var24 = -super.field1341.field4496 + var20;
                        if (var24 > 0) {
                            var14 = var24;
                            if (~var24 < -256) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - super.field1341.field4496;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - super.field1341.field4496;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field1341.field4496 + var23;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field1325 * var18;
                    int var29 = super.field1334 * var18;
                    var30 = super.field1333 - -(super.field1336 * var12 + super.field1321 * var10 + var28 >> 15);
                    var31 = super.field1341.field4485 * var30 / var20 + arg6.field8694;
                    var32 = (super.field1323 * var12 + super.field1340 * var10 + var29 >> 15) + super.field1337;
                    var33 = super.field1341.field4505 * var32 / var20 + arg6.field8705;
                    var34 = super.field1333 - -(super.field1321 * var11 - (-var28 - super.field1336 * var12) >> 15);
                    var35 = (super.field1323 * var12 + super.field1340 * var11 + var29 >> 15) + super.field1337;
                    var36 = super.field1341.field4485 * var34 / var21 + arg6.field8694;
                    var37 = super.field1333 - -(super.field1336 * var13 + (super.field1321 * var11 - -var28) >> 15);
                    var38 = super.field1341.field4505 * var35 / var21 + arg6.field8705;
                    var39 = super.field1341.field4485 * var37 / var22 + arg6.field8694;
                    var40 = (super.field1340 * var11 - (-(super.field1323 * var13) + -var29) >> 15) + super.field1337;
                    var41 = super.field1341.field4505 * var40 / var22 + arg6.field8705;
                    var42 = (super.field1321 * var10 + var28 - -(super.field1336 * var13) >> 15) + super.field1333;
                    var43 = (super.field1323 * var13 + (super.field1340 * var10 - -var29) >> 15) + super.field1337;
                    var44 = arg6.field8694 - -(super.field1341.field4485 * var42 / var23);
                    var45 = arg6.field8705 - -(super.field1341.field4505 * var43 / var23);
                } else {
                    int var46 = super.field1322[arg1][arg0];
                    int var47 = super.field1322[arg1 - -1][arg0];
                    int var48 = super.field1322[arg1 + 1][arg0 + 1];
                    int var49 = super.field1322[arg1][arg0 + 1];
                    if (super.field1330 == -1) {
                        var20 = super.field1327 - -(super.field1332 * var12 + super.field1338 * var46 + super.field1324 * var10 >> 15);
                        if (~var20 >= ~super.field1341.field4490) {
                            return;
                        }
                        var21 = (super.field1324 * var11 - -(super.field1338 * var47) - -(super.field1332 * var12) >> 15) + super.field1327;
                        if (super.field1341.field4490 >= var21) {
                            return;
                        }
                        var22 = super.field1327 - -(super.field1338 * var48 + super.field1324 * var11 - -(super.field1332 * var13) >> 15);
                        if (super.field1341.field4490 >= var22) {
                            return;
                        }
                        var23 = (super.field1332 * var13 + super.field1338 * var49 + super.field1324 * var10 >> 15) + super.field1327;
                        if (var23 <= super.field1341.field4490) {
                            return;
                        }
                    } else {
                        var23 = super.field1330;
                        var22 = super.field1330;
                        var21 = super.field1330;
                        var20 = super.field1330;
                    }
                    if (arg5) {
                        int var50 = -super.field1341.field4496 + var20;
                        if (var50 > 255) {
                            var50 = 255;
                        }
                        if (~var50 < -1) {
                            var14 = var50;
                            int var51 = var9.field6686 * var50 / 255;
                            if (~var51 < -1) {
                                var46 -= var51;
                            }
                        }
                        int var52 = -super.field1341.field4496 + var21;
                        if (var52 > 255) {
                            var52 = 255;
                        }
                        if (var52 > 0) {
                            var15 = var52;
                            int var53 = var9.field6685 * var52 / 255;
                            if (~var53 < -1) {
                                var47 -= var53;
                            }
                        }
                        int var54 = -super.field1341.field4496 + var22;
                        if (~var54 < -256) {
                            var54 = 255;
                        }
                        if (~var54 < -1) {
                            var16 = var54;
                            int var55 = var9.field6693 * var54 / 255;
                            if (~var55 < -1) {
                                var48 -= var55;
                            }
                        }
                        int var56 = -super.field1341.field4496 + var23;
                        if (~var56 < -256) {
                            var56 = 255;
                        }
                        if (var56 > 0) {
                            var17 = var56;
                            int var57 = var9.field6684 * var56 / 255;
                            if (~var57 < -1) {
                                var49 -= var57;
                            }
                        }
                    } else if (super.field1341.field4498) {
                        int var58 = -super.field1341.field4496 + var20;
                        if (var58 > 0) {
                            var14 = var58;
                            if (~var58 < -256) {
                                var14 = 255;
                            }
                        }
                        int var59 = -super.field1341.field4496 + var21;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field1341.field4496 + var22;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field1341.field4496 + var23;
                        if (var61 > 0) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    var30 = super.field1333 - -(super.field1336 * var12 + super.field1325 * var46 + super.field1321 * var10 >> 15);
                    var31 = arg6.field8694 - -(super.field1341.field4485 * var30 / var20);
                    var32 = (super.field1340 * var10 + (super.field1334 * var46 - -(super.field1323 * var12)) >> 15) + super.field1337;
                    var34 = (super.field1321 * var11 + super.field1336 * var12 + super.field1325 * var47 >> 15) + super.field1333;
                    var33 = super.field1341.field4505 * var32 / var20 + arg6.field8705;
                    var35 = super.field1337 - -(super.field1323 * var12 + super.field1340 * var11 + super.field1334 * var47 >> 15);
                    var36 = super.field1341.field4485 * var34 / var21 + arg6.field8694;
                    var37 = (super.field1325 * var48 + super.field1336 * var13 + super.field1321 * var11 >> 15) + super.field1333;
                    var38 = super.field1341.field4505 * var35 / var21 + arg6.field8705;
                    var39 = arg6.field8694 - -(super.field1341.field4485 * var37 / var22);
                    var40 = (super.field1323 * var13 + super.field1340 * var11 + super.field1334 * var48 >> 15) + super.field1337;
                    var41 = super.field1341.field4505 * var40 / var22 + arg6.field8705;
                    var42 = (super.field1336 * var13 + super.field1321 * var10 - -(super.field1325 * var49) >> 15) + super.field1333;
                    var43 = (super.field1340 * var10 - (-(super.field1334 * var49) - super.field1323 * var13) >> 15) + super.field1337;
                    var44 = super.field1341.field4485 * var42 / var23 + arg6.field8694;
                    var45 = super.field1341.field4505 * var43 / var23 + arg6.field8705;
                }
                boolean var62 = ~var9.field6683 != 0 && this.method700(super.field1341.field2443.method2387((byte) 127, var9.field6683).field8203);
                int var63 = var15 - -var17 + var16;
                if ((var38 - var45) * (-var44 + var39) - (var36 - var44) * (-var45 + var41) > 0) {
                    arg6.field8707 = var39 < 0 || var44 < 0 || ~var36 > -1 || ~arg6.field8697 > ~var39 || var44 > arg6.field8697 || arg6.field8697 < var36;
                    if (var63 >= 765) {
                        arg6.method3484(var41, var45, var38, var39, var44, var36, super.field1341.field4500);
                    } else {
                        if (var62) {
                            arg6.field8704 = 100;
                        }
                        if (var63 > 0) {
                            if (var9.field6683 < 0) {
                                arg6.method3480(var41, var45, var38, var39, var44, var36, class276.method1777((byte) 86, var16 << 24 | super.field1341.field4500, var9.field6692), class276.method1777((byte) 97, super.field1341.field4500 | var17 << 24, var9.field6687), class276.method1777((byte) 102, super.field1341.field4500 | var15 << 24, var9.field6690));
                            } else {
                                arg6.method3483(var41, var45, var38, var39, var44, var36, super.field1341.field4500, var16, var17, var15, var9.field6692, var9.field6687, var9.field6690, var37, var42, var34, var40, var43, var35, var22, var23, var21, var9.field6683);
                            }
                        } else if (~var9.field6683 <= -1) {
                            arg6.method3476(var41, var45, var38, var39, var44, var36, var9.field6692, var9.field6687, var9.field6690, var37, var42, var34, var40, var43, var35, var22, var23, var21, var9.field6683);
                        } else {
                            arg6.method3480(var41, var45, var38, var39, var44, var36, var9.field6692, var9.field6687, var9.field6690);
                        }
                        arg6.field8704 = 0;
                    }
                }
                int var64 = var14 - -var15 + var17;
                if (~((var45 - var38) * (-var36 + var31) - (var44 - var36) * (-var38 + var33)) < -1) {
                    arg6.field8707 = var31 < 0 || var36 < 0 || var44 < 0 || ~arg6.field8697 > ~var31 || arg6.field8697 < var36 || var44 > arg6.field8697;
                    if (~var64 <= -766) {
                        arg6.method3484(var33, var38, var45, var31, var36, var44, super.field1341.field4500);
                        return;
                    }
                    if (var62) {
                        arg6.field8704 = 100;
                    }
                    if (~var64 >= -1) {
                        if (~var9.field6683 <= -1) {
                            arg6.method3476(var33, var38, var45, var31, var36, var44, var9.field6689, var9.field6690, var9.field6687, var30, var34, var42, var32, var35, var43, var20, var21, var23, var9.field6683);
                        } else {
                            arg6.method3480(var33, var38, var45, var31, var36, var44, var9.field6689, var9.field6690, var9.field6687);
                        }
                    } else if (var9.field6683 < 0) {
                        arg6.method3480(var33, var38, var45, var31, var36, var44, class276.method1777((byte) 99, var14 << 24 | super.field1341.field4500, var9.field6689), class276.method1777((byte) 89, var15 << 24 | super.field1341.field4500, var9.field6690), class276.method1777((byte) 80, var17 << 24 | super.field1341.field4500, var9.field6687));
                    } else {
                        arg6.method3483(var33, var38, var45, var31, var36, var44, super.field1341.field4500, var14, var15, var17, var9.field6689, var9.field6690, var9.field6687, var30, var34, var42, var32, var35, var43, var20, var21, var23, var9.field6683);
                    }
                    arg6.field8704 = 0;
                }
            }
        } else {
            class3 var65 = super.field1335[arg1][arg0];
            if (var65 != null) {
                if (super.field1330 == -1) {
                    for (int var66 = 0; var65.field26 > var66; ++var66) {
                        int var67 = var65.field25[var66] - -(arg1 << super.field7537);
                        int var68 = var65.field21[var66];
                        int var69 = var65.field22[var66] - -(arg0 << super.field7537);
                        int var70 = (super.field1338 * var68 + (super.field1324 * var67 - -(super.field1332 * var69)) >> 15) + super.field1327;
                        if (~super.field1341.field4490 <= ~var70) {
                            return;
                        }
                        arg2[var66] = 0;
                        if (arg5) {
                            int var71 = -super.field1341.field4496 + var70;
                            if (~var71 < -256) {
                                var71 = 255;
                            }
                            if (var71 > 0) {
                                arg2[var66] = var71;
                                int var72 = var65.field30[var66] * var71 / 255;
                                if (~var72 < -1) {
                                    var68 -= var72;
                                }
                            }
                        } else if (super.field1341.field4498) {
                            int var73 = var70 - super.field1341.field4496;
                            if (~var73 < -1) {
                                arg2[var66] = var73;
                                if (~arg2[var66] < -256) {
                                    arg2[var66] = 255;
                                }
                            }
                        }
                        int var74 = (super.field1321 * var67 + (super.field1325 * var68 - -(super.field1336 * var69)) >> 15) + super.field1333;
                        int var75 = (super.field1334 * var68 + super.field1340 * var67 + super.field1323 * var69 >> 15) + super.field1337;
                        arg7[var66] = arg6.field8694 - -(super.field1341.field4485 * var74 / var70);
                        arg3[var66] = super.field1341.field4505 * var75 / var70 + arg6.field8705;
                    }
                } else {
                    for (int var76 = 0; var65.field26 > var76; ++var76) {
                        int var116 = (arg1 << super.field7537) + var65.field25[var76];
                        int var117 = var65.field21[var76];
                        int var118 = var65.field22[var76] - -(arg0 << super.field7537);
                        arg2[var76] = 0;
                        if (!arg5) {
                            if (super.field1341.field4498) {
                                int var119 = -super.field1341.field4496 + super.field1330;
                                if (var119 > 0) {
                                    arg2[var76] = var119;
                                    if (~arg2[var76] < -256) {
                                        arg2[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var120 = -super.field1341.field4496 + super.field1330;
                            if (~var120 < -256) {
                                var120 = 255;
                            }
                            if (~var120 < -1) {
                                arg2[var76] = var120;
                                int var121 = var65.field30[var76] * var120 / 255;
                                if (var121 > 0) {
                                    var117 -= var121;
                                }
                            }
                        }
                        int var122 = (super.field1334 * var117 + (super.field1340 * var116 - -(super.field1323 * var118)) >> 15) + super.field1337;
                        int var123 = (super.field1336 * var118 + super.field1325 * var117 + super.field1321 * var116 >> 15) + super.field1333;
                        arg7[var76] = super.field1341.field4485 * var123 / super.field1330 + arg6.field8694;
                        arg3[var76] = super.field1341.field4505 * var122 / super.field1330 + arg6.field8705;
                    }
                }
                if (var65.field29 == null) {
                    for (int var77 = 0; var77 < var65.field24; ++var77) {
                        int var78 = var77 * 3;
                        int var79 = var78 + 1;
                        int var80 = var79 - -1;
                        int var81 = arg7[var78];
                        int var82 = arg7[var79];
                        int var83 = arg7[var80];
                        int var84 = arg3[var78];
                        int var85 = arg3[var79];
                        int var86 = arg3[var80];
                        int var87 = arg2[var79] + arg2[var80] + arg2[var78];
                        if ((-var82 + var81) * (-var85 + var86) + -((-var82 + var83) * (-var85 + var84)) > 0) {
                            arg6.field8707 = var81 < 0 || var82 < 0 || var83 < 0 || ~arg6.field8697 > ~var81 || arg6.field8697 < var82 || ~arg6.field8697 > ~var83;
                            if (~var87 > -766) {
                                if (var87 > 0) {
                                    if (~(16777215 & var65.field28[var78]) != -1) {
                                        arg6.method3480(var84, var85, var86, var81, var82, var83, class481.method2772(var65.field28[var78], arg2[var78], super.field1341.field4500, 88), class481.method2772(var65.field28[var79], arg2[var79], super.field1341.field4500, arg4 ^ 9832), class481.method2772(var65.field28[var80], arg2[var80], super.field1341.field4500, 28));
                                    }
                                } else if (~(16777215 & var65.field28[var78]) != -1) {
                                    arg6.method3480(var84, var85, var86, var81, var82, var83, var65.field28[var78], var65.field28[var79], var65.field28[var80]);
                                }
                            } else {
                                arg6.method3484(var84, var85, var86, var81, var82, var83, super.field1341.field4500);
                            }
                        }
                    }
                } else {
                    int var88 = super.field1322[arg1][arg0];
                    int var89 = super.field1322[arg1 + 1][arg0];
                    int var90 = super.field1322[arg1][arg0 + 1];
                    int var91 = super.field7544 * arg1;
                    int var92 = super.field7544 + var91;
                    int var93 = super.field7544 * arg0;
                    int var94 = super.field7544 + var93;
                    int var95 = super.field1333 - -(super.field1325 * var88 + super.field1336 * var93 + super.field1321 * var91 >> 15);
                    int var96 = super.field1337 - -(super.field1323 * var93 + super.field1340 * var91 + super.field1334 * var88 >> 15);
                    int var97 = (super.field1332 * var93 + super.field1338 * var88 + super.field1324 * var91 >> 15) + super.field1327;
                    int var98 = (super.field1325 * var89 + (super.field1321 * var92 - -(super.field1336 * var93)) >> 15) + super.field1333;
                    int var99 = (super.field1323 * var93 + super.field1340 * var92 + super.field1334 * var89 >> 15) + super.field1337;
                    int var100 = (super.field1332 * var93 + super.field1338 * var89 + super.field1324 * var92 >> 15) + super.field1327;
                    int var101 = (super.field1336 * var94 + super.field1325 * var90 + super.field1321 * var91 >> 15) + super.field1333;
                    int var102 = (super.field1340 * var91 + super.field1334 * var90 + super.field1323 * var94 >> 15) + super.field1337;
                    int var103 = (super.field1324 * var91 - (-(super.field1338 * var90) + -(super.field1332 * var94)) >> 15) + super.field1327;
                    for (int var104 = 0; ~var65.field24 < ~var104; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 + 1;
                        int var108 = arg7[var105];
                        int var109 = arg7[var106];
                        int var110 = arg7[var107];
                        int var111 = arg3[var105];
                        int var112 = arg3[var106];
                        int var113 = arg3[var107];
                        int var114 = arg2[var106] + arg2[var107] + arg2[var105];
                        if (~((var113 - var112) * (-var109 + var108) + -((-var109 + var110) * (-var112 + var111))) < -1) {
                            arg6.field8707 = ~var108 > -1 || ~var109 > -1 || var110 < 0 || var108 > arg6.field8697 || ~arg6.field8697 > ~var109 || var110 > arg6.field8697;
                            short var115 = var65.field29[var104];
                            if (var114 >= 765) {
                                arg6.method3484(var111, var112, var113, var108, var109, var110, super.field1341.field4500);
                            } else {
                                if (~var115 != 0 && this.method700(super.field1341.field2443.method2387((byte) 127, var115).field8203)) {
                                    arg6.field8704 = 100;
                                }
                                if (~var114 < -1) {
                                    if (var115 != -1) {
                                        arg6.method3483(var111, var112, var113, var108, var109, var110, super.field1341.field4500, arg2[var105], arg2[var106], arg2[var107], var65.field28[var105], var65.field28[var106], var65.field28[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                    } else if ((16777215 & var65.field28[var105]) != 0) {
                                        arg6.method3480(var111, var112, var113, var108, var109, var110, class276.method1777((byte) 104, arg2[var105] << 24 | super.field1341.field4500, var65.field28[var105]), class276.method1777((byte) 70, arg2[var106] << 24 | super.field1341.field4500, var65.field28[var106]), class276.method1777((byte) 106, arg2[var107] << 24 | super.field1341.field4500, var65.field28[var107]));
                                    }
                                } else if (~var115 == 0) {
                                    if ((16777215 & var65.field28[var105]) != 0) {
                                        arg6.method3480(var111, var112, var113, var108, var109, var110, var65.field28[var105], var65.field28[var106], var65.field28[var107]);
                                    }
                                } else {
                                    arg6.method3476(var111, var112, var113, var108, var109, var110, var65.field28[var105], var65.field28[var106], var65.field28[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                }
                                arg6.field8704 = 0;
                            }
                        }
                    }
                }
            }
            if (arg4 != -9757) {
                field6900 = null;
            }
        }
    }
}
