import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class249 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lfe;")
    private static class384 field3570 = new class384(16);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3574 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[B")
    private static byte[] field3580 = new byte[1];

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3583 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[S")
    private static short[] field3578 = new short[1];

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Lum;")
    public static class347 field3582 = new class347();

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "F")
    public static float field3576;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "F")
    public static float field3581;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lhp;")
    public static class205 field3568;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lhe;")
    public static class239 field3572;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Luj;")
    public static class248 field3567;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lq;")
    public static class281 field3575;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lvo;")
    private static class31 field3569;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lna;")
    public static class34 field3573;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lhl;")
    public static class351 field3566;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lfe;")
    private static class384 field3587;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lkb;")
    private static class467 field3565;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lno;")
    public static class476 field3571;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "[B")
    private static byte[] field3590;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "[B")
    private static byte[] field3593;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "[B")
    private static byte[] field3600;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[B")
    private static byte[] field3601;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "[B")
    private static byte[] field3605;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
    private static int[] field3599;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[S")
    private static short[] field3585;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[S")
    private static short[] field3596;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[[[B")
    public static byte[][][] field3579;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "[[[Li;")
    private static class30[][][] field3603;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Luj;", line = 4)
    public static final class248 method1549(int arg0) {
        return (class248) field3570.method2310((byte) 107, (long) arg0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([B[B[SII)V", line = 11)
    private static final void method1550(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field3597];
        int[] var6 = new int[field3597];
        int[] var7 = new int[field3597];
        int[] var8 = new int[field3597];
        int[] var9 = new int[field3597];
        for (int var10 = -5; var10 < field3588; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field3597; var13++) {
                int var10002;
                if (var11 < field3588) {
                    int var28 = arg0[field3588 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class285 var29 = field3565.method2735((byte) 96, var28 - 1);
                        var5[var13] += var29.field4060;
                        var6[var13] += var29.field4065;
                        var7[var13] += var29.field4069;
                        var8[var13] += var29.field4067;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field3588 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class285 var31 = field3565.method2735((byte) 103, var30 - 1);
                        var5[var13] -= var31.field4060;
                        var6[var13] -= var31.field4065;
                        var7[var13] -= var31.field4069;
                        var8[var13] -= var31.field4067;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field3597; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field3597) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field3588 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field3588 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class310.method1860(var15 / var18, var16 / var18, var14 * 256 / var17, (byte) 20);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field3588 * var19 + var10;
                            int var27 = class65.field971[class397.method2372(-1198994943, class491.method2955(var25, 11620, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leq;Lqs;IIII)V", line = 156)
    private static final void method1551(class134 arg0, class410 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6011 = ((arg1.field6009 - field3592) * arg2 + arg4 >> 16) + field3594;
        arg1.field6012 = field3598 - ((arg1.field6014 - field3595) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lhe;Lvo;Lkb;Lhl;Lna;Lhp;Lno;)V", line = 160)
    public static final void method1552(class239 arg0, class31 arg1, class467 arg2, class351 arg3, class34 arg4, class205 arg5, class476 arg6) {
        field3572 = arg0;
        field3569 = arg1;
        field3565 = arg2;
        field3566 = arg3;
        field3573 = arg4;
        field3568 = arg5;
        field3571 = arg6;
        field3570.method2315((byte) -118);
        int var7 = field3572.method1444("details", (byte) 41);
        int[] var8 = field3572.method1454((byte) -91, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class248 var10 = class369.method2252(var7, 0, field3572, var8[var9]);
            field3570.method2317(-1, (long) var10.field3543, var10);
        }
        class33.method277(false, 120, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leq;IIII)Lum;", line = 188)
    private static final class347 method1553(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class410 var5 = (class410) field3582.method2096(-21400); var5 != null; var5 = (class410) field3582.method2084((byte) 19)) {
            method1551(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field3582;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Luj;", line = 200)
    public static final class248 method1554(int arg0, int arg1) {
        for (class248 var2 = (class248) field3570.method2316(4999); var2 != null; var2 = (class248) field3570.method2308((byte) 115)) {
            if (var2.field3562 && var2.method1545(arg1, -101, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V", line = 213)
    public static final void method1555() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field3575.field4014; var1++) {
            boolean var2 = field3567.method1544(field3575.field4013[var1] >> 14 & 0x3FFF, var0, field3575.field4013[var1] >> 28 & 0x3, -15842, field3575.field4013[var1] & 0x3FFF);
            if (var2) {
                class410 var3 = new class410(field3575.field4016[var1]);
                var3.field6009 = var0[1] - field3584;
                var3.field6014 = var0[2] - field3604;
                field3582.method2086((byte) -120, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()V", line = 234)
    public static final void method1556() {
        field3593 = new byte[field3597 * field3588];
        field3600 = new byte[field3597 * field3588];
        field3605 = new byte[field3597 * field3588];
        field3596 = new short[field3597 * field3588];
        field3590 = new byte[field3597 * field3588];
        field3587 = new class384(1024);
        field3603 = new class30[3][field3588 >> 6][field3597 >> 6];
        field3599 = new int[field3569.field520 + 1];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leq;)V", line = 246)
    public static final void method1557(class134 arg0) {
        int var1 = field3586 - field3592;
        int var2 = field3602 - field3595;
        int var3 = (field3589 - field3594 << 16) / var1;
        int var4 = (field3598 - field3591 << 16) / var2;
        method1561(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V", line = 259)
    private static final void method1558() {
        for (int var0 = 0; var0 < field3588; var0++) {
            for (int var11 = 0; var11 < field3597; var11++) {
                int var12 = field3596[field3588 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class367 var13 = (class367) field3587.method2310((byte) -92, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field5519.length; var14++) {
                                class486 var15 = field3566.method2132((byte) 126, var13.field5519[var14] & 0xFFFF);
                                int var16 = var15.field7040;
                                if (var15.field7043 != null) {
                                    class486 var17 = var15.method2834(field3571, false);
                                    if (var17 != null) {
                                        var16 = var17.field7040;
                                    }
                                }
                                if (var16 != -1) {
                                    class410 var18 = new class410(var16);
                                    var18.field6009 = var0;
                                    var18.field6014 = var11;
                                    field3582.method2086((byte) -118, var18);
                                }
                            }
                        }
                    } else {
                        class486 var19 = field3566.method2132((byte) 127, var12 - 1);
                        int var20 = var19.field7040;
                        if (var19.field7043 != null) {
                            class486 var21 = var19.method2834(field3571, false);
                            if (var21 != null) {
                                var20 = var21.field7040;
                            }
                        }
                        if (var20 != -1) {
                            class410 var22 = new class410(var20);
                            var22.field6009 = var0;
                            var22.field6014 = var11;
                            field3582.method2086((byte) -116, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field3603[0].length; var2++) {
                for (int var3 = 0; var3 < field3603[0][0].length; var3++) {
                    class30 var4 = field3603[var1][var2][var3];
                    if (var4 != null) {
                        for (class394 var5 = (class394) var4.method242(false); var5 != null; var5 = (class394) var4.method244((byte) -73)) {
                            if (var5.field5813 != null) {
                                for (int var6 = 0; var6 < var5.field5813.length; var6++) {
                                    class486 var7 = field3566.method2132((byte) 127, var5.field5813[var6] & 0xFFFF);
                                    int var8 = var7.field7040;
                                    if (var7.field7043 != null) {
                                        class486 var9 = var7.method2834(field3571, false);
                                        if (var9 != null) {
                                            var8 = var9.field7040;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class410 var10 = new class410(var8);
                                        var10.field6009 = ((field3584 >> 6) + var2) * 64 + var5.field5809 - field3584;
                                        var10.field6014 = ((field3604 >> 6) + var3) * 64 + var5.field5810 - field3604;
                                        field3582.method2086((byte) -121, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leq;IIIIIII[S[BZ)V", line = 416)
    private static final void method1559(class134 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method770(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field3599[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method770(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class378.method2289(field3577, arg2, field3599[arg6], arg0, arg5, arg7 >> 6 & 0x3, var12, field3579, arg4, arg3, var11, arg1, -4097);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class486 var18 = field3566.method2132((byte) 120, arg8[var16] & 0xFFFF);
                if (var18.field7069 == -1) {
                    int var19 = -3355444;
                    if (var18.field7041 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method740(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method793(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method740(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method793(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method740(arg1, arg2, arg4, -1, 0);
                            arg0.method793(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method740(var14, arg2, arg4, -1, 0);
                            arg0.method793(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method740(var14, arg2, arg4, -1, 0);
                            arg0.method793(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method740(arg1, arg2, arg4, -1, 0);
                            arg0.method793(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method793(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method793(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method793(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method793(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method793(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method793(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leq;Lae;IIII[I[I)V", line = 578)
    private static final void method1560(class134 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method941((byte) 125);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method941((byte) 123);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field3593[field3588 * arg5 + arg4] = (byte) var11;
                    field3600[field3588 * arg5 + arg4] = 0;
                } else {
                    field3600[field3588 * arg5 + arg4] = (byte) var11;
                    field3605[field3588 * arg5 + arg4] = 0;
                    field3593[field3588 * arg5 + arg4] = arg1.method946(52);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method941((byte) 126);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method941((byte) 127);
                var18 = arg1.method941((byte) 125);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method941((byte) 123);
            }
            if (var15 == 0) {
                field3593[field3588 * arg5 + arg4] = (byte) var16;
                field3600[field3588 * arg5 + arg4] = (byte) var17;
                field3605[field3588 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field3596[field3588 * arg5 + arg4] = (short) (arg1.method993((byte) -108) + 1);
                    field3590[field3588 * arg5 + arg4] = arg1.method946(110);
                } else if (var19 > 1) {
                    field3596[field3588 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method993((byte) -100);
                        var21[var22] = arg1.method946(100);
                    }
                    field3587.method2317(-1, (long) (arg4 << 16 | arg5), new class367(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method993((byte) -64);
                        var24[var25] = arg1.method946(28);
                    }
                }
                if (field3603[var15 - 1][arg2 - (field3584 >> 6)][arg3 - (field3604 >> 6)] == null) {
                    field3603[var15 - 1][arg2 - (field3584 >> 6)][arg3 - (field3604 >> 6)] = new class30();
                }
                class394 var26 = new class394(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field3603[var15 - 1][arg2 - (field3584 >> 6)][arg3 - (field3604 >> 6)].method250((byte) -72, var26);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Leq;IIII)V", line = 714)
    private static final void method1561(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field3586 - field3592;
        int var6 = field3602 - field3595;
        if (field3586 < field3588) {
            var5++;
        }
        if (field3602 < field3597) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field3594;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field3594;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field3592 + var7;
                if (var52 >= 0 && var52 < field3588) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field3598 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field3598 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field3595 + var53;
                            int var58 = field3588 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field3597) {
                                var59 = (field3601[var58] & 0xFF) << 16 | field3585[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field3600[var58] & 0xFF;
                                var61 = field3596[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field3567.field3551 != -1) {
                                    var62 = field3567.field3551 | 0xFF000000;
                                } else if ((field3602 + var53 & 0x4) == (field3592 + var7 & 0x4)) {
                                    var62 = field3599[field3569.field524 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method770(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1559(arg0, var49, var54, var51, var56, var59, var60, field3605[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class367 var63 = (class367) field3587.method2310((byte) -58, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method1559(arg0, var49, var54, var51, var56, var59, var60, field3605[var58], var63.field5519, var63.field5520, true);
                                }
                            } else {
                                field3578[0] = (short) (var61 - 1);
                                field3580[0] = field3590[var58];
                                method1559(arg0, var49, var54, var51, var56, var59, var60, field3605[var58], field3578, field3580, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field3598 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field3598 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field3567.field3551 != -1) {
                            var68 = field3567.field3551 | 0xFF000000;
                        } else if ((field3602 + var64 & 0x4) == (field3592 + var7 & 0x4)) {
                            var68 = field3599[field3569.field524 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method770(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field3594;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field3594;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field3592 + var8;
                if (var41 >= 0 && var41 < field3588) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field3598 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field3598 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field3595 + var42;
                            if (var46 >= 0 && var46 < field3597) {
                                int var47 = field3596[field3588 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1564(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class367 var48 = (class367) field3587.method2310((byte) 124, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method1564(arg0, var38, var43, var40, var45, var48.field5519, var48.field5520);
                                    }
                                } else {
                                    field3578[0] = (short) (var47 - 1);
                                    field3580[0] = field3590[field3588 * var46 + var41];
                                    method1564(arg0, var38, var43, var40, var45, field3578, field3580);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field3592 >> 6;
        int var10 = field3595 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field3586 >> 6;
        int var12 = field3602 >> 6;
        if (var11 >= field3603[0].length) {
            var11 = field3603[0].length - 1;
        }
        if (var12 >= field3603[0][0].length) {
            var12 = field3603[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class30 var28 = field3603[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field3584 >> 6) + var14) * 64;
                        int var30 = ((field3604 >> 6) + var27) * 64;
                        for (class394 var31 = (class394) var28.method242(false); var31 != null; var31 = (class394) var28.method244((byte) -73)) {
                            int var32 = var31.field5809 + var29 - field3584 - field3592;
                            int var33 = var31.field5810 + var30 - field3604 - field3595;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field3594;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field3594;
                            int var36 = field3598 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field3598 - (arg2 * var33 + arg4 >> 16);
                            method1559(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5807, var31.field5812 & 0xFF, var31.field5811, var31.field5813, var31.field5808, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class30 var17 = field3603[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field3584 >> 6) + var15) * 64;
                        int var19 = ((field3604 >> 6) + var16) * 64;
                        for (class394 var20 = (class394) var17.method242(false); var20 != null; var20 = (class394) var17.method244((byte) -73)) {
                            int var21 = var20.field5809 + var18 - field3584 - field3592;
                            int var22 = var20.field5810 + var19 - field3604 - field3595;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field3594;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field3594;
                            int var25 = field3598 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field3598 - (arg2 * var22 + arg4 >> 16);
                            method1564(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5813, var20.field5808);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Leq;)Lum;", line = 1057)
    public static final class347 method1562(class134 arg0) {
        int var1 = field3586 - field3592;
        int var2 = field3602 - field3595;
        int var3 = (field3589 - field3594 << 16) / var1;
        int var4 = (field3598 - field3591 << 16) / var2;
        return method1553(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leq;II)V", line = 1068)
    public static final void method1563(class134 arg0, int arg1, int arg2) {
        class156 var3 = new class156(field3572.method1469(field3567.field3546, (byte) 75, "area"));
        int var4 = var3.method941((byte) 123);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method941((byte) 123);
        }
        int var7 = var3.method941((byte) 125);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method941((byte) 124);
        }
        while (true) {
            while (var3.field2018 < var3.field2041.length) {
                if (var3.method941((byte) 123) == 0) {
                    int var22 = var3.method941((byte) 123);
                    int var23 = var3.method941((byte) 126);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field3584;
                            int var27 = var23 * 64 + var25 - field3604;
                            method1560(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method941((byte) 125);
                    int var29 = var3.method941((byte) 125);
                    int var30 = var3.method941((byte) 123);
                    int var31 = var3.method941((byte) 123);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field3584;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field3604;
                            method1560(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field3601 = new byte[field3597 * field3588];
            field3585 = new short[field3597 * field3588];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field3597 * field3588];
                for (int var13 = 0; var13 < field3603[var11].length; var13++) {
                    for (int var19 = 0; var19 < field3603[var11][0].length; var19++) {
                        class30 var20 = field3603[var11][var13][var19];
                        if (var20 != null) {
                            for (class394 var21 = (class394) var20.method242(false); var21 != null; var21 = (class394) var20.method244((byte) -73)) {
                                var12[(var19 * 64 + var21.field5810) * field3588 + var13 * 64 + var21.field5809] = (byte) var21.field5807;
                            }
                        }
                    }
                }
                method1550(var12, field3601, field3585, arg1, arg2);
                for (int var14 = 0; var14 < field3603[var11].length; var14++) {
                    for (int var15 = 0; var15 < field3603[var11][0].length; var15++) {
                        class30 var16 = field3603[var11][var14][var15];
                        if (var16 != null) {
                            for (class394 var17 = (class394) var16.method242(false); var17 != null; var17 = (class394) var16.method244((byte) -73)) {
                                int var18 = (var15 * 64 + var17.field5810) * field3588 + var14 * 64 + var17.field5809;
                                var17.field5807 = (field3601[var18] & 0xFF) << 16 | field3585[var18] & 0xFFFF;
                                if (var17.field5807 != 0) {
                                    var17.field5807 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1550(field3593, field3601, field3585, arg1, arg2);
            field3593 = null;
            method1558();
            return;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Leq;IIII[S[B)V", line = 1246)
    private static final void method1564(class134 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class486 var8 = field3566.method2132((byte) 127, arg5[var7] & 0xFFFF);
            int var9 = var8.field7069;
            if (var9 != -1) {
                class203 var10 = field3568.method1264(var9, (byte) -118);
                class307 var11 = var10.method1250(arg0, 0, var8.field7066 ? arg6[var7] >> 6 & 0x3 : 0, var8.field7050 ? var8.field7089 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method87() >> 2;
                    int var13 = arg4 * var11.method94() >> 2;
                    if (var10.field2821) {
                        int var14 = var8.field7036;
                        int var15 = var8.field7096;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field2818 == 0) {
                            var11.method1844(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method86(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field2818 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V", line = 1304)
    public static final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3592 = arg0 - field3584;
        field3602 = arg1 - field3604;
        field3586 = arg2 - field3584;
        field3595 = arg3 - field3604;
        field3594 = arg4;
        field3591 = arg5;
        field3589 = arg6;
        field3598 = arg7;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 1314)
    public static final void method1566(int arg0) {
        field3567 = (class248) field3570.method2310((byte) 123, (long) arg0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lps;III)I", line = 1318)
    private static final int method1567(class59 arg0, int arg1, int arg2, int arg3) {
        class117 var4 = field3569.method253(-2, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1506;
        if (var5 >= 0 && arg0.method432(var5, true).field1543) {
            var5 = -1;
        }
        int var9;
        if (var4.field1519 >= 0) {
            int var6 = var4.field1519;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class65.field971[class397.method2372(-1198994943, class404.method2421(var8, (byte) 107, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class65.field971[class397.method2372(-1198994943, class404.method2421(arg0.method432(var5, true).field1532, (byte) -58, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1502 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1502;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class65.field971[class397.method2372(-1198994943, class404.method2421(var12, (byte) 94, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lps;II)V", line = 1379)
    public static final void method1568(class59 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field3569.field520; var3++) {
            field3599[var3 + 1] = method1567(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "()V", line = 1389)
    public static void method1569() {
        field3569 = null;
        field3565 = null;
        field3566 = null;
        field3573 = null;
        field3568 = null;
        field3571 = null;
        field3567 = null;
        field3572 = null;
        field3570 = null;
        field3579 = null;
        field3578 = null;
        field3580 = null;
        field3575 = null;
        field3582 = null;
        field3599 = null;
        field3593 = null;
        field3601 = null;
        field3585 = null;
        field3600 = null;
        field3605 = null;
        field3596 = null;
        field3590 = null;
        field3587 = null;
        field3603 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)Lnf;", line = 1416)
    public static final class389 method1570(int arg0, int arg1) {
        class389 var2 = new class389();
        for (class248 var3 = (class248) field3570.method2316(4999); var3 != null; var3 = (class248) field3570.method2308((byte) 127)) {
            if (var3.field3562 && var3.method1545(arg1, -99, arg0)) {
                var2.method2342((byte) 90, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "()V", line = 1431)
    public static final void method1571() {
        field3593 = null;
        field3601 = null;
        field3585 = null;
        field3600 = null;
        field3605 = null;
        field3596 = null;
        field3590 = null;
        field3587 = null;
        field3603 = null;
        field3599 = null;
    }
}
