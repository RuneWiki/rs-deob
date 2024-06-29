import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class233 {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
    public boolean field3387 = false;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Z")
    public static boolean field3393 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "D")
    public static double field3385;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lof;")
    public static class477 field3384;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lkga;")
    public static class582 field3382;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;IB)V", line = 29)
    public final void method1580(class495 arg0, int arg1, byte arg2) {
        if (arg2 != 51) {
            this.method541();
        }
        field3389++;
        if (arg1 == -1) {
            return;
        }
        this.method549();
        if (!this.method526()) {
            this.method562();
            return;
        }
        class566 var4 = arg0.field6800[arg1];
        class760 var5 = var4.field7885;
        for (int var6 = 0; var6 < var4.field7894; var6++) {
            short var7 = var4.field7888[var6];
            if (var5.field10523[var7]) {
                if (var4.field7883[var6] != -1) {
                    this.method574(0, 0, 0, 0);
                }
                this.method574(var5.field10525[var7], var4.field7890[var6], var4.field7886[var6], var4.field7893[var6]);
            }
        }
        this.method567();
        this.method562();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILsk;IZIILsk;II)V", line = 78)
    public final void method1581(int arg0, class495 arg1, int arg2, boolean arg3, int arg4, int arg5, class495 arg6, int arg7, int arg8) {
        field3386++;
        if (~arg4 == arg0) {
            return;
        }
        this.method549();
        if (!this.method526()) {
            this.method562();
            return;
        }
        class566 var10 = arg1.field6800[arg4];
        class760 var11 = var10.field7885;
        class566 var12 = null;
        if (arg6 != null) {
            var12 = arg6.field6800[arg7];
            if (var12.field7885 != var11) {
                var12 = null;
            }
        }
        this.method1582(65535, null, arg5, arg3, arg8, var10, var12, var11, false, (byte) -125, null, arg2);
        this.method567();
        this.method562();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ZIZILaw;Law;Lvca;ZB[II)V", line = 113)
    private final void method1582(int arg0, boolean[] arg1, int arg2, boolean arg3, int arg4, class566 arg5, class566 arg6, class760 arg7, boolean arg8, byte arg9, int[] arg10, int arg11) {
        field3391++;
        if (arg6 == null || arg11 == 0) {
            for (int var38 = 0; var38 < arg5.field7894; var38++) {
                short var39 = arg5.field7888[var38];
                if (arg1 == null || arg1[var39] == arg8 || arg7.field10525[var39] == 0) {
                    short var40 = arg5.field7883[var38];
                    if (var40 != -1) {
                        this.method1587(0, 0, arg3, arg7.field10518[var40], arg0 & arg7.field10522[var40], arg10, 0, 0, arg2, -2);
                    }
                    this.method1587(arg7.field10525[var39], arg5.field7886[var38], arg3, arg7.field10518[var39], arg0 & arg7.field10522[var39], arg10, arg5.field7890[var38], arg5.field7893[var38], arg2, -2);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg9 >= -81) {
            this.field3387 = true;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg7.field10519; var15++) {
            boolean var16 = false;
            if (var13 < arg5.field7894 && arg5.field7888[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg6.field7894 > var14 && arg6.field7888[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg1 == null || arg1[var15] == arg8 || arg7.field10525[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg7.field10525[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var20 = arg5.field7886[var13];
                        var21 = arg5.field7883[var13];
                        var22 = arg5.field7893[var13];
                        var23 = arg5.field7895[var13];
                        var24 = arg5.field7890[var13];
                        var13++;
                    } else {
                        var21 = -1;
                        var20 = var18;
                        var23 = 0;
                        var24 = var18;
                        var22 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg6.field7886[var14];
                        var29 = arg6.field7883[var14];
                        var26 = arg6.field7895[var14];
                        var27 = arg6.field7890[var14];
                        var28 = arg6.field7893[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = 0;
                        var27 = var18;
                        var28 = var18;
                        var29 = -1;
                    }
                    int var30;
                    int var31;
                    int var32;
                    if ((var23 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var31 = var24;
                        var30 = var22;
                        var32 = var20;
                    } else if (var19 == 2) {
                        int var35 = var27 - var24 & 0x3FFF;
                        int var36 = var25 - var20 & 0x3FFF;
                        int var37 = var28 - var22 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg11 * var35 / arg4 + var24 & 0x3FFF;
                        var32 = arg11 * var36 / arg4 + var20 & 0x3FFF;
                        var30 = arg11 * var37 / arg4 + var22 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var27 - var24 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var31 = arg11 * var34 / arg4 + var24 & 0x3FFF;
                        var30 = 0;
                        var32 = 0;
                    } else if (var19 == 7) {
                        int var33 = var27 - var24 & 0x3F;
                        if (var33 >= 32) {
                            var33 -= 64;
                        }
                        var32 = var20 + ((var25 - var20) * arg11 / arg4);
                        var30 = (var28 - var22) * arg11 / arg4 + var22;
                        var31 = arg11 * var33 / arg4 + var24 & 0x3F;
                    } else {
                        var30 = var22 + ((var28 - var22) * arg11 / arg4);
                        var31 = (var27 - var24) * arg11 / arg4 + var24;
                        var32 = (var25 - var20) * arg11 / arg4 + var20;
                    }
                    if (var21 != -1) {
                        this.method1587(0, 0, arg3, arg7.field10518[var21], arg0 & arg7.field10522[var21], arg10, 0, 0, arg2, -2);
                    } else if (var29 != -1) {
                        this.method1587(0, 0, arg3, arg7.field10518[var29], arg7.field10522[var29] & arg0, arg10, 0, 0, arg2, -2);
                    }
                    this.method1587(var19, var32, arg3, arg7.field10518[var15], arg7.field10522[var15] & arg0, arg10, var31, var30, arg2, -2);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI[BLjava/lang/String;)I", line = 324)
    public static final int method1583(byte arg0, int arg1, byte[] arg2, String arg3) {
        field3383++;
        int var4 = arg1;
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class280.method1779(arg3.charAt(var6), (byte) -127);
            int var8 = var5 <= (var6 + 1) ? -1 : class280.method1779(arg3.charAt(var6 + 1), (byte) -128);
            int var9 = (var6 + 2) >= var5 ? -1 : class280.method1779(arg3.charAt(var6 + 2), (byte) -128);
            int var10 = var6 + 3 < var5 ? class280.method1779(arg3.charAt(var6 + 3), (byte) -125) : -1;
            arg2[arg1++] = (byte) class694.method3895(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg2[arg1++] = (byte) class694.method3895(class194.method1380(15, var8) << 4, var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg2[arg1++] = (byte) class694.method3895(class194.method1380(192, var9 << 6), var10);
        }
        if (arg0 != 37) {
            method1583((byte) -88, 109, null, null);
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIIBILsk;Lsk;IIZ)V", line = 381)
    public final void method1584(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class495 arg6, class495 arg7, int arg8, int arg9, boolean arg10) {
        field3388++;
        if (arg5 == -1) {
            return;
        }
        this.method549();
        if (!this.method526()) {
            this.method562();
            return;
        }
        class566 var12 = arg6.field6800[arg5];
        class760 var13 = var12.field7885;
        class566 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field6800[arg9];
            if (var14.field7885 != var13) {
                var14 = null;
            }
        }
        this.method1582(arg3, null, arg2, arg10, arg8, var12, var14, var13, false, (byte) -107, arg0, arg1);
        this.method567();
        this.method562();
        int var15 = -64 % ((arg4 + 58) / 63);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZIIILsk;[ZLsk;Lsk;Lsk;IIIII)V", line = 422)
    public final void method1585(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, class495 arg5, boolean[] arg6, class495 arg7, class495 arg8, class495 arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field3392++;
        if (arg10 == -1) {
            return;
        }
        if (arg6 == null || arg14 == -1) {
            this.method1581(0, arg8, arg13, arg0, arg10, 0, arg5, arg3, arg2);
            return;
        }
        this.method549();
        if (!this.method526()) {
            this.method562();
            return;
        }
        class566 var16 = arg8.field6800[arg10];
        class760 var17 = var16.field7885;
        class566 var18 = null;
        if (arg5 != null) {
            var18 = arg5.field6800[arg3];
            if (var18.field7885 != var17) {
                var18 = null;
            }
        }
        this.method1582(65535, arg6, 0, arg0, arg2, var16, var18, var17, arg1, (byte) -89, null, arg13);
        class566 var19 = arg7.field6800[arg14];
        class566 var20 = null;
        if (arg9 != null) {
            var20 = arg9.field6800[arg12];
            if (var20.field7885 != var17) {
                var20 = null;
            }
        }
        this.method577(0, new int[0], 0, 0, 0, 0, arg0);
        this.method1582(65535, arg6, 0, arg0, arg11, var19, var20, var19.field7885, true, (byte) -93, null, arg4);
        this.method567();
        this.method562();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIILs;)V", line = 479)
    public final void method1586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class419 arg8) {
        field3390++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg2 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg8.method2478(true, arg7 + var14, arg6 - -var13);
        int var16 = arg2 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg8.method2478(true, arg7 + var17, arg6 + var16);
        int var19 = -arg2 / 2;
        if (arg5 < 66) {
            return;
        }
        int var20 = arg3 / 2;
        int var21 = arg8.method2478(true, arg7 + var20, arg6 + var19);
        int var22 = arg2 / 2;
        int var23 = arg3 / 2;
        int var24 = arg8.method2478(true, arg7 + var23, arg6 + var22);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg3 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg4 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg4;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > arg4) {
                        var28 = arg4;
                    }
                }
                this.method550(var28);
            }
        }
        int var30 = var21 <= var15 ? var21 : var15;
        if (arg2 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg0 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg0;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg0) {
                        var31 = arg0;
                    }
                }
                this.method543(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg1;
        if (var34 != 0) {
            this.method568(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZ[II[IIIII)V", line = 625)
    private final void method1587(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = -arg6;
                arg6 = arg7;
                arg7 = var13;
            } else if (arg0 == 3) {
                int var12 = arg6;
                arg6 = arg7;
                arg7 = var12;
            } else if (arg0 == 2) {
                int var11 = arg6;
                arg6 = -arg7 & 0x3FFF;
                arg7 = var11 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg6 = -arg6;
                arg7 = -arg7;
            } else if (arg0 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = arg6;
                arg6 = -arg7;
                arg7 = var16;
            } else if (arg0 == 3) {
                int var15 = arg6;
                arg6 = arg7;
                arg7 = var15;
            } else if (arg0 == 2) {
                int var14 = arg6;
                arg6 = arg7 & 0x3FFF;
                arg7 = -var14 & 0x3FFF;
            }
        }
        field3394++;
        if (arg4 == 65535) {
            this.method577(arg0, arg3, arg6, arg1, arg7, arg8, arg2);
        } else {
            this.method565(arg0, arg3, arg6, arg1, arg7, arg2, arg4, arg5);
        }
        if (arg9 != -2) {
            this.method558();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILmb;Lmb;)V", line = 731)
    public static final void method1588(int arg0, int arg1, int arg2, class427 arg3, class427 arg4) {
        class172 var5 = class134.method1114(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2591 = arg3;
        var5.field2598 = arg4;
        int var6 = class678.field9594 == class454.field6207 ? 1 : 0;
        if (!arg3.method1170(16383)) {
            arg3.field10360 = class407.field5602[var6];
            class407.field5602[var6] = arg3;
        } else if (arg3.method1175((byte) 123)) {
            arg3.field10360 = class277.field3997[var6];
            class277.field3997[var6] = arg3;
        } else {
            arg3.field10360 = class5.field74[var6];
            class5.field74[var6] = arg3;
            class87.field1297 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method1170(16383)) {
            if (arg4.method1175((byte) 98)) {
                arg4.field10360 = class277.field3997[var6];
                class277.field3997[var6] = arg4;
                return;
            }
            arg4.field10360 = class5.field74[var6];
            class5.field74[var6] = arg4;
            class87.field1297 = true;
            return;
        }
        arg4.field10360 = class407.field5602[var6];
        class407.field5602[var6] = arg4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 788)
    public static void method1589(byte arg0) {
        field3384 = null;
        if (arg0 >= 126) {
            field3382 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method587();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method555(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method549();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method577(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method527();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method583();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method564(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method591();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldm;IZ)V")
    public abstract void method556(class765 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class233 method585(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method568(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldm;Let;II)V")
    public abstract void method546(class765 arg0, class749 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method581();

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method558();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method566();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILdm;ZI)Z")
    public abstract boolean method589(int arg0, int arg1, class765 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILdm;ZII)Z")
    public abstract boolean method584(int arg0, int arg1, class765 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method550(int arg0);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lpi;")
    public abstract class335[] method590();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method526();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method559(class233 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldm;)V")
    public abstract void method582(class765 arg0);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method565(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method525();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method599(int arg0);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method543(int arg0);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method576();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method594(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lgfa;")
    public abstract class740[] method588();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method572();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
    public abstract boolean method597();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method557(int arg0);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method547();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method578(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method562();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method596();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method563(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method534();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class115 method539(class115 arg0);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method530(int arg0);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method574(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method544();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method523(int arg0);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method541();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method554(int arg0, int arg1, class419 arg2, class419 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldm;Let;I)V")
    public abstract void method575(class765 arg0, class749 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method567();
}
