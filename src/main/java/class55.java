import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class55 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Z")
    public boolean field878 = false;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field876 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field875 = 1338;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IZ[IIIIIIII)V", line = 5)
    private final void method571(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field883++;
        if (arg8 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = -arg4;
                arg4 = arg6;
                arg6 = var16;
            } else if (arg9 == 3) {
                int var14 = arg4;
                arg4 = arg6;
                arg6 = var14;
            } else if (arg9 == 2) {
                int var15 = arg4;
                arg4 = -arg6 & 0x3FFF;
                arg6 = var15 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg4 = -arg4;
                arg6 = -arg6;
            } else if (arg9 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = arg4;
                arg4 = -arg6;
                arg6 = var13;
            } else if (arg9 == 3) {
                int var12 = arg4;
                arg4 = arg6;
                arg6 = var12;
            } else if (arg9 == 2) {
                int var11 = arg4;
                arg4 = arg6 & 0x3FFF;
                arg6 = -var11 & 0x3FFF;
            }
        }
        if (arg7 == 65535) {
            this.method109(arg9, arg0, arg4, arg3, arg6, arg8, arg1);
        } else {
            this.method96(arg9, arg0, arg4, arg3, arg6, arg1, arg7, arg2);
        }
        if (arg5 != -26101) {
            this.method573(29, null, false, 23, true, null, 96, null, null, null, 55, true);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILbca;IIIIIZLbca;[II)V", line = 101)
    public final void method572(int arg0, class612 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class612 arg8, int[] arg9, int arg10) {
        field886++;
        if (arg2 == -1) {
            return;
        }
        this.method120();
        if (!this.method116()) {
            this.method80();
            return;
        }
        class669 var12 = arg8.field8772[arg2];
        class517 var13 = var12.field9612;
        class669 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field8772[arg5];
            if (var14.field9612 != var13) {
                var14 = null;
            }
        }
        this.method573(arg6, var14, false, arg10, false, arg9, arg4, null, var13, var12, arg3, arg7);
        this.method127();
        if (arg0 != 3239) {
            this.method77(-78, 34, 100, -19);
        }
        this.method80();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILdr;ZIZ[II[ZLpo;Ldr;IZ)V", line = 150)
    private final void method573(int arg0, class669 arg1, boolean arg2, int arg3, boolean arg4, int[] arg5, int arg6, boolean[] arg7, class517 arg8, class669 arg9, int arg10, boolean arg11) {
        field881++;
        if (arg4) {
            field875 = -117;
        }
        if (arg1 == null || arg6 == 0) {
            for (int var38 = 0; var38 < arg9.field9620; var38++) {
                short var39 = arg9.field9622[var38];
                if (arg7 == null || arg2 == arg7[var39] || arg8.field7564[var39] == 0) {
                    short var40 = arg9.field9619[var38];
                    if (var40 != -1) {
                        this.method571(arg8.field7562[var40], arg11, arg5, 0, 0, -26101, 0, arg8.field7567[var40] & arg0, arg10, 0);
                    }
                    this.method571(arg8.field7562[var39], arg11, arg5, arg9.field9626[var38], arg9.field9613[var38], -26101, arg9.field9627[var38], arg0 & arg8.field7567[var39], arg10, arg8.field7564[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg8.field7565; var15++) {
            boolean var16 = false;
            if (arg9.field9620 > var13 && arg9.field9622[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg1.field9620 > var14 && arg1.field9622[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg7 == null || arg2 == arg7[var15] || arg8.field7564[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field7564[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg9.field9627[var13];
                        var21 = arg9.field9613[var13];
                        var22 = arg9.field9614[var13];
                        var23 = arg9.field9626[var13];
                        var24 = arg9.field9619[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var23 = var18;
                        var24 = -1;
                        var21 = var18;
                        var22 = 0;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg1.field9613[var14];
                        var26 = arg1.field9614[var14];
                        var27 = arg1.field9627[var14];
                        var28 = arg1.field9619[var14];
                        var29 = arg1.field9626[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = 0;
                        var29 = var18;
                        var28 = -1;
                        var27 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var22 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var33 = var20;
                        var32 = var23;
                        var31 = var21;
                    } else if (var19 == 2) {
                        int var35 = var25 - var21 & 0x3FFF;
                        int var36 = var29 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var27 - var20 & 0x3FFF;
                        var32 = arg6 * var36 / arg3 + var23 & 0x3FFF;
                        var31 = var21 + (arg6 * var35 / arg3) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg6 * var37 / arg3 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var25 - var21 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var31 = arg6 * var34 / arg3 + var21 & 0x3FFF;
                        var33 = 0;
                        var32 = 0;
                    } else if (var19 == 7) {
                        int var30 = var25 - var21 & 0x3F;
                        if (var30 >= 32) {
                            var30 -= 64;
                        }
                        var31 = arg6 * var30 / arg3 + var21 & 0x3F;
                        var32 = var23 + ((var29 - var23) * arg6 / arg3);
                        var33 = (var27 - var20) * arg6 / arg3 + var20;
                    } else {
                        var33 = (var27 - var20) * arg6 / arg3 + var20;
                        var32 = (var29 - var23) * arg6 / arg3 + var23;
                        var31 = (var25 - var21) * arg6 / arg3 + var21;
                    }
                    if (var24 != -1) {
                        this.method571(arg8.field7562[var24], arg11, arg5, 0, 0, -26101, 0, arg0 & arg8.field7567[var24], arg10, 0);
                    } else if (var28 != -1) {
                        this.method571(arg8.field7562[var28], arg11, arg5, 0, 0, -26101, 0, arg8.field7567[var28] & arg0, arg10, 0);
                    }
                    this.method571(arg8.field7562[var15], arg11, arg5, var32, var31, -26101, var33, arg0 & arg8.field7567[var15], arg10, var19);
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

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILi;I)V", line = 364)
    public final void method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class37 arg7, int arg8) {
        field885++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg3 / 2;
        int var14 = -arg5 / 2;
        int var15 = arg7.method428(true, arg6 + var13, arg8 + var14);
        int var16 = arg3 / 2;
        int var17 = -arg5 / 2;
        int var18 = arg7.method428(true, arg6 + var16, arg8 - -var17);
        int var19 = -arg3 / 2;
        int var20 = arg5 / 2;
        if (arg2 != 16680) {
            return;
        }
        int var21 = arg7.method428(true, arg6 + var19, arg8 + var20);
        int var22 = arg3 / 2;
        int var23 = arg5 / 2;
        int var24 = arg7.method428(true, arg6 + var22, arg8 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg5 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg4 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg4;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg4) {
                        var29 = arg4;
                    }
                }
                this.method126(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg3 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg1 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg1;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg1 < var32) {
                        var32 = arg1;
                    }
                }
                this.method91(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg0;
        if (var34 != 0) {
            this.method64(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V", line = 484)
    public static final void method575() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class271.field3698.length; var1++) {
                if (class271.field3698[var1].method3154()) {
                    class664.field9396[var1] = class271.field3698[var1].method3153();
                } else {
                    synchronized (class271.field3698[var1]) {
                        class271.field3698[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class271.field3698[class271.field3698.length - 1].method3151();
                class585.method3396(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class271.field3698.length - 1; var4++) {
                        if (!class271.field3698[var4].method3154()) {
                            synchronized (class271.field3698[var4]) {
                                class271.field3698[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class271.field3698.length - 2; var6++) {
                            class271.field3698[var6].method3151();
                        }
                        class585.method3396(2);
                        while (!class271.field3698[0].method3154()) {
                            synchronized (class271.field3698[0]) {
                                class271.field3698[0].notify();
                            }
                            try {
                                class151.method974((byte) -102, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class271.field3698[0].method3151();
                        return;
                    }
                    try {
                        class151.method974((byte) -102, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class151.method974((byte) -102, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILbca;B)V", line = 584)
    public final void method576(int arg0, class612 arg1, byte arg2) {
        field882++;
        if (arg0 == -1) {
            return;
        }
        this.method120();
        if (!this.method116()) {
            this.method80();
            return;
        }
        if (arg2 < 43) {
            field876 = 93;
        }
        class669 var4 = arg1.field8772[arg0];
        class517 var5 = var4.field9612;
        for (int var6 = 0; var6 < var4.field9620; var6++) {
            short var7 = var4.field9622[var6];
            if (var5.field7563[var7]) {
                if (var4.field9619[var6] != -1) {
                    this.method69(0, 0, 0, 0);
                }
                this.method69(var5.field7564[var7], var4.field9613[var6], var4.field9626[var6], var4.field9627[var6]);
            }
        }
        this.method127();
        this.method80();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lii;Lii;B)V", line = 641)
    public static final void method577(class513 arg0, class513 arg1, byte arg2) {
        field887++;
        if (arg1.field7522 != null) {
            arg1.method3045(true);
        }
        arg1.field7522 = arg0.field7522;
        arg1.field7520 = arg0;
        if (arg2 != 42) {
            method577(null, null, (byte) 72);
        }
        arg1.field7522.field7520 = arg1;
        arg1.field7520.field7522 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 667)
    public static final void method578(boolean arg0) {
        if (!arg0) {
            field875 = -71;
        }
        field879++;
        class188.method1165((byte) -125);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 684)
    public static final void method579(int arg0) {
        field874++;
        if (!class36.field688) {
            return;
        }
        if (arg0 < 49) {
            method582(23, 73, -39, -7, 24, -119, -125, -24, 36, -53);
        }
        while (true) {
            while (class118.field1522 < class501.field7005.length) {
                class404 var1 = class501.field7005[class118.field1522];
                if (var1 != null && var1.field5696 == -1) {
                    if (class202.field2438 == null) {
                        class202.field2438 = class405.field5731.method46(-61, var1.field5703);
                    }
                    int var2 = class202.field2438.field8416;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field5696 = var2;
                    class118.field1522++;
                    class202.field2438 = null;
                } else {
                    class118.field1522++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIILbca;IIILbca;)V", line = 730)
    public final void method580(boolean arg0, int arg1, int arg2, int arg3, class612 arg4, int arg5, int arg6, int arg7, class612 arg8) {
        field880++;
        if (arg3 == -1) {
            return;
        }
        this.method120();
        if (!this.method116()) {
            this.method80();
            return;
        }
        class669 var10 = arg4.field8772[arg3];
        if (arg7 != -3651) {
            return;
        }
        class517 var11 = var10.field9612;
        class669 var12 = null;
        if (arg8 != null) {
            var12 = arg8.field8772[arg1];
            if (var12.field9612 != var11) {
                var12 = null;
            }
        }
        this.method573(65535, var12, false, arg5, false, null, arg6, null, var11, var10, arg2, arg0);
        this.method127();
        this.method80();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbca;Lbca;Lbca;[ZIIIILbca;IIIZII)V", line = 779)
    public final void method581(class612 arg0, class612 arg1, class612 arg2, boolean[] arg3, int arg4, int arg5, int arg6, int arg7, class612 arg8, int arg9, int arg10, int arg11, boolean arg12, int arg13, int arg14) {
        field877++;
        if (arg6 == -1) {
            return;
        }
        if (arg3 == null || arg4 == -1) {
            this.method580(arg12, arg13, 0, arg6, arg8, arg5, arg11, -3651, arg0);
            return;
        }
        this.method120();
        if (!this.method116()) {
            this.method80();
            return;
        }
        class669 var16 = arg8.field8772[arg6];
        class517 var17 = var16.field9612;
        class669 var18 = null;
        if (arg0 != null) {
            var18 = arg0.field8772[arg13];
            if (var18.field9612 != var17) {
                var18 = null;
            }
        }
        this.method573(65535, var18, false, arg5, false, null, arg11, arg3, var17, var16, 0, arg12);
        class669 var19 = arg2.field8772[arg4];
        class669 var20 = null;
        if (arg1 != null) {
            var20 = arg1.field8772[arg9];
            if (var20.field9612 != var17) {
                var20 = null;
            }
        }
        this.method109(0, new int[0], 0, 0, 0, 0, arg12);
        this.method573(65535, var20, true, arg14, false, null, arg7, arg3, var19.field9612, var19, 0, arg12);
        this.method127();
        if (arg10 == 128) {
            this.method80();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V", line = 844)
    public static final void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field884++;
        if (arg3 == arg4 && arg2 == arg7 && arg1 == arg8 && arg0 == arg5) {
            class435.method2604(arg8, arg4, arg0, arg2, false, arg6);
        } else {
            int var10 = arg4;
            int var11 = arg2;
            int var12 = arg4 * 3;
            int var13 = arg2 * 3;
            int var14 = arg3 * 3;
            int var15 = arg7 * 3;
            int var16 = arg1 * 3;
            int var17 = arg5 * 3;
            int var18 = var14 + arg8 - var16 - arg4;
            int var19 = arg0 + var15 - arg2 - var17;
            int var20 = var16 - (var14 - var12) - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg4;
                int var34 = (var28 + var30 + var32 >> 12) + arg2;
                class435.method2604(var33, var10, var34, var11, false, arg6);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg9 != -9990) {
            field875 = -118;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public abstract void method80();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;IZ)V")
    public abstract void method86(class394 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method73(int arg0);

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method72();

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method94();

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method112();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method88();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method74(int arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public abstract void method120();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class55 method97(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method69(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method79();

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method116();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method83();

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method99();

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method130(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class54 method133(class54 arg0);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()[Lnba;")
    public abstract class271[] method95();

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method91(int arg0);

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method70(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method77(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lmj;II)V")
    public abstract void method122(class394 arg0, class605 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method64(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method105();

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lfk;")
    public abstract class604[] method85();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method101(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method59(class55 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method87(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method61();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method124(int arg0, int arg1, class394 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method118();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method104(class394 arg0);

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method102(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method96(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method93(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lmj;I)V")
    public abstract void method67(class394 arg0, class605 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method119();

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method127();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
    public abstract void method114();

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method98(int arg0);

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method126(int arg0);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method65();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method109(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
    public abstract boolean method110();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method129(int arg0, int arg1, class394 arg2, boolean arg3);
}
