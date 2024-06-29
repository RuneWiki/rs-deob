import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class272 implements class245 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Llj;")
    private class59 field4421 = new class59(256);

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lek;")
    private class206 field4433;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lek;")
    private class206 field4420;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[Ljn;")
    private class142[] field4429;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field4427 = -1;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "B")
    public static byte field4424 = 0;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4435 = "Loaded world list data";

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)Z", line = 10)
    public final boolean method1733(int arg0, int arg1) {
        int var3 = 33 / ((arg1 - 18) / 40);
        class216 var4 = this.method70(50, arg0);
        field4430++;
        return var4 != null && var4.method1508(this.field4420, (byte) -56, this);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lqe;IIIIIIIZ)V", line = 22)
    public static final void method1918(class209 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class1.field3;
        int var11;
        int var12 = var11 = (arg7 << 7) - class105.field1915;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class144.field2427[arg1][arg6][arg7] - class267.field4370;
        int var18 = class144.field2427[arg1][arg6 + 1][arg7] - class267.field4370;
        int var19 = class144.field2427[arg1][arg6 + 1][arg7 + 1] - class267.field4370;
        int var20 = class144.field2427[arg1][arg6][arg7 + 1] - class267.field4370;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class305.field4964;
        int var46 = (var24 << 9) / var25 + class305.field4963;
        int var47 = (var27 << 9) / var31 + class305.field4964;
        int var48 = (var30 << 9) / var31 + class305.field4963;
        int var49 = (var33 << 9) / var37 + class305.field4964;
        int var50 = (var36 << 9) / var37 + class305.field4963;
        int var51 = (var39 << 9) / var43 + class305.field4964;
        int var52 = (var42 << 9) / var43 + class305.field4963;
        class305.field4958 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class31.field712 && class335.method2361(class305.field4964 + class205.field3413, class305.field4963 + class274.field4472, var50, var52, var48, var49, var51, var47)) {
                class7.field241 = arg6;
                class267.field4364 = arg7;
            }
            if (!class241.field4016 && !arg8) {
                class305.field4967 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class305.field4962 || var51 > class305.field4962 || var47 > class305.field4962) {
                    class305.field4967 = true;
                }
                if (arg0.field3488 == -1) {
                    if (arg0.field3486 != 12345678) {
                        class305.method2224(var50, var52, var48, var49, var51, var47, arg0.field3486, arg0.field3500, arg0.field3499);
                    }
                } else if (!class358.field5697) {
                    int var53 = class305.field4968.method85(arg0.field3488, (byte) -82);
                    class305.method2224(var50, var52, var48, var49, var51, var47, class257.method1798(var53, arg0.field3486), class257.method1798(var53, arg0.field3500), class257.method1798(var53, arg0.field3499));
                } else if (arg0.field3493) {
                    class305.method2231(var50, var52, var48, var49, var51, var47, arg0.field3486, arg0.field3500, arg0.field3499, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3488);
                } else {
                    class305.method2231(var50, var52, var48, var49, var51, var47, arg0.field3486, arg0.field3500, arg0.field3499, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3488);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class31.field712 && class335.method2361(class305.field4964 + class205.field3413, class305.field4963 + class274.field4472, var46, var48, var52, var45, var47, var51)) {
            class7.field241 = arg6;
            class267.field4364 = arg7;
        }
        if (class241.field4016 || arg8) {
            return;
        }
        class305.field4967 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class305.field4962 || var47 > class305.field4962 || var51 > class305.field4962) {
            class305.field4967 = true;
        }
        if (arg0.field3488 == -1) {
            if (arg0.field3491 != 12345678) {
                class305.method2224(var46, var48, var52, var45, var47, var51, arg0.field3491, arg0.field3499, arg0.field3500);
            }
        } else if (class358.field5697) {
            class305.method2231(var46, var48, var52, var45, var47, var51, arg0.field3491, arg0.field3499, arg0.field3500, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3488);
        } else {
            int var54 = class305.field4968.method85(arg0.field3488, (byte) -82);
            class305.method2224(var46, var48, var52, var45, var47, var51, class257.method1798(var54, arg0.field3491), class257.method1798(var54, arg0.field3499), class257.method1798(var54, arg0.field3500));
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V", line = 181)
    public static final void method1919(byte arg0, int arg1, int arg2) {
        field4431++;
        class173.field2874 = new class124(arg1);
        class235.field3846 = new class124(arg2);
        if (arg0 < 124) {
            field4427 = 26;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Ljn;", line = 194)
    public final class142 method1732(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field4420 = (class206) null;
        }
        field4425++;
        return this.field4429[arg1];
    }

    @OriginalMember(owner = "client!le", name = "h", descriptor = "(II)Lpl;", line = 213)
    public class216 method70(int arg0, int arg1) {
        class301 var3 = this.field4421.method487(89, (long) arg1);
        field4419++;
        if (var3 != null) {
            return (class216) var3;
        }
        byte[] var4 = this.field4433.method1407(-31, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 50) {
            this.field4433 = (class206) null;
        }
        class216 var5 = new class216(new class146(var4));
        this.field4421.method491((long) arg1, -1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)V", line = 237)
    public static final void method1920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4428++;
        if (arg0 == arg5) {
            class282.method2005(arg2, arg1, (byte) -95, arg5, arg4, arg6, arg3);
        } else if (arg7 == 2) {
            if (class190.field3224 <= arg3 - arg5 && class289.field4704 >= arg3 + arg5 && arg6 - arg0 >= class87.field1520 && (arg0 + arg6) <= class177.field2930) {
                class71.method545(arg3, arg6, arg4, arg5, 0, arg0, arg2, arg1);
            } else {
                class189.method1312(arg7 + 329014591, arg0, arg1, arg4, arg3, arg2, arg5, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 261)
    public static final void method1921(byte arg0) {
        if (arg0 == -123) {
            field4422++;
            class331.field5290.method889((byte) -120);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(FZIIII)[I", line = 282)
    public final int[] method1734(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4434++;
        if (arg3 != 2) {
            this.method70(13, 108);
        }
        return this.method70(50, arg5).method1503(arg1, (double) arg0, this, this.field4429[arg5].field2397, this.field4420, arg4, 21374, arg2);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 293)
    public static void method1922(boolean arg0) {
        field4435 = null;
        if (!arg0) {
            field4424 = 82;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lek;Lek;Lek;)V", line = 318)
    public class272(class206 arg0, class206 arg1, class206 arg2) {
        this.field4433 = arg1;
        this.field4420 = arg2;
        class146 var4 = new class146(arg0.method1404(0, 0, (byte) -128));
        int var5 = var4.method989(84);
        this.field4429 = new class142[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1005((byte) 122) == 1) {
                this.field4429[var6] = new class142();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field4429[var7] != null) {
                this.field4429[var7].field2393 = var4.method1005((byte) 122) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field4429[var8] != null) {
                this.field4429[var8].field2385 = var4.method1005((byte) 122) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field4429[var9] != null) {
                this.field4429[var9].field2392 = var4.method1005((byte) 122) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field4429[var10] != null) {
                this.field4429[var10].field2391 = var4.method1005((byte) 122) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field4429[var11] != null) {
                this.field4429[var11].field2400 = var4.method1029(-2);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field4429[var12] != null) {
                this.field4429[var12].field2394 = var4.method1029(-2);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field4429[var13] != null) {
                this.field4429[var13].field2387 = var4.method1029(-2);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field4429[var14] != null) {
                this.field4429[var14].field2390 = var4.method1029(-2);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field4429[var15] != null) {
                this.field4429[var15].field2389 = (short) var4.method989(79);
            }
        }
        if (var4.field2496.length > var4.field2435) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field4429[var16] != null) {
                    var4.method1029(-2);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field4429[var17] != null) {
                    var4.method1029(-2);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field4429[var18] != null) {
                    var4.method1005((byte) 122);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field4429[var19] != null) {
                    this.field4429[var19].field2397 = var4.method1005((byte) 122) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field4429[var20] != null) {
                    var4.method1029(-2);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field4429[var21] != null) {
                    var4.method1005((byte) 122);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field4429[var22] != null) {
                    var4.method1005((byte) 122);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field4429[var23] != null) {
                    var4.method1005((byte) 122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)J", line = 307)
    public static final long method1923(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        return var3 == null || var3.field5102 == null ? 0L : var3.field5102.field469;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIBII)V", line = 524)
    public static final void method1924(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var8 = 91 / ((-arg5 - 64) / 50);
        field4432++;
        if (arg3 < 1 || arg1 < 1 || arg3 > 102 || arg1 > 102) {
            return;
        }
        if (!class14.method137(256) && (class282.field4615[0][arg3][arg1] & 0x2) == 0) {
            int var9 = arg2;
            if ((class282.field4615[arg2][arg3][arg1] & 0x8) != 0) {
                var9 = 0;
            }
            if (class208.field3479 != var9) {
                return;
            }
        }
        int var10 = arg2;
        if (arg2 < 3 && (class282.field4615[1][arg3][arg1] & 0x2) == 2) {
            var10 = arg2 + 1;
        }
        class153.method1092(arg2, false, arg6, arg3, var10, class23.field576[arg2], arg1);
        if (arg7 >= 0) {
            boolean var11 = class349.field5590;
            class349.field5590 = true;
            class227.method1579(arg2, arg3, false, -15255, arg0, arg1, arg4, arg7, false, class23.field576[arg2], var10);
            class349.field5590 = var11;
        }
    }
}
