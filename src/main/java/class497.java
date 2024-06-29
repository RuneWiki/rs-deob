import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class497 {

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
    public boolean field7195 = false;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7203 = new String[] { method3766(method3765("NF\fp")), method3766(method3765("KRN_\u0018\b")), method3766(method3765("[\u001dN2&")), method3766(method3765("KRNJ\u0019\b")), method3766(method3765("KRNK\u0019\b")), method3766(method3765("KRNY\u0018\b")), method3766(method3765("KRNX\u0018\b")), method3766(method3765("KRNT\u0018\b")), method3766(method3765("KRN^\u0018\b")), method3766(method3765("KRNZ\u0018\b")), method3766(method3765("KRN]\u0018\b")), method3766(method3765("KRN[\u0018\b")) };

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lel;")
    public static class573 field7193 = new class573(76, 2);

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lqq;")
    public static class501 field7202;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILqq;ZII)Z")
    public abstract boolean method314(int arg0, int arg1, class501 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lhja;")
    public abstract class426[] method345();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZB)Z")
    public static final boolean method3755(boolean arg0, byte arg1) {
        try {
            field7198++;
            if (!arg0) {
                return false;
            }
            int var2 = arg1 & 0xFF;
            if (var2 == 0) {
                return false;
            } else {
                return var2 < 128 || var2 >= 160 || class118.field1403[var2 - 128] != '\u0000';
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7203[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method331(int arg0);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method325(int arg0);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method330();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method313();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method342();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method348(int arg0);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method344(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class497 method332(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqq;Lng;I)V")
    public abstract void method333(class501 arg0, class359 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkl;ZIILkl;Lkl;I[ZLkl;IIIIII)V")
    public final void method3756(class87 arg0, boolean arg1, int arg2, int arg3, class87 arg4, class87 arg5, int arg6, boolean[] arg7, class87 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        try {
            field7200++;
            if (arg13 != -1) {
                if (arg7 == null || arg14 == -1) {
                    this.method3764(arg10, arg0, arg11, arg4, arg1, arg13, 2, arg12, 0);
                } else {
                    this.method316();
                    if (this.method334()) {
                        class18 var16 = arg4.field976[arg13];
                        class311 var17 = var16.field220;
                        class18 var18 = null;
                        if (arg0 != null) {
                            var18 = arg0.field976[arg11];
                            if (var18.field220 != var17) {
                                var18 = null;
                            }
                        }
                        this.method3759(arg12, var18, false, arg7, var17, true, 0, var16, arg10, arg1, null, 65535);
                        class18 var19 = arg5.field976[arg14];
                        class18 var20 = null;
                        if (arg8 != null) {
                            var20 = arg8.field976[arg2];
                            if (var20.field220 != var17) {
                                var20 = null;
                            }
                        }
                        this.method320(0, new int[0], 0, 0, 0, 0, arg1);
                        this.method3759(arg6, var20, true, arg7, var19.field220, true, 0, var19, arg3, arg1, null, 65535);
                        this.method337();
                        if (arg9 != -11) {
                            this.field7195 = false;
                        }
                        this.method315();
                    } else {
                        this.method315();
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field7203[1] + (arg0 == null ? field7203[0] : field7203[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field7203[0] : field7203[2]) + ',' + (arg5 == null ? field7203[0] : field7203[2]) + ',' + arg6 + ',' + (arg7 == null ? field7203[0] : field7203[2]) + ',' + (arg8 == null ? field7203[0] : field7203[2]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLkl;)V")
    public final void method3757(int arg0, boolean arg1, class87 arg2) {
        try {
            field7194++;
            if (arg0 != -1) {
                if (arg1) {
                    field7193 = null;
                }
                this.method316();
                if (this.method334()) {
                    class18 var4 = arg2.field976[arg0];
                    class311 var5 = var4.field220;
                    for (int var6 = 0; var6 < var4.field224; var6++) {
                        short var7 = var4.field213[var6];
                        if (var5.field4924[var7]) {
                            if (var4.field210[var6] != -1) {
                                this.method309(0, 0, 0, 0);
                            }
                            this.method309(var5.field4931[var7], var4.field211[var6], var4.field209[var6], var4.field223[var6]);
                        }
                    }
                    this.method337();
                    this.method315();
                } else {
                    this.method315();
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7203[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7203[0] : field7203[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method335();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method320(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method3758(int arg0) {
        try {
            field7193 = null;
            if (arg0 != 0) {
                field7193 = null;
            }
            field7202 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7203[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method307();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method312(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILqk;Z[ZLpfa;ZILqk;IZ[II)V")
    private final void method3759(int arg0, class18 arg1, boolean arg2, boolean[] arg3, class311 arg4, boolean arg5, int arg6, class18 arg7, int arg8, boolean arg9, int[] arg10, int arg11) {
        try {
            field7192++;
            if (arg1 == null || arg0 == 0) {
                for (int var13 = 0; var13 < arg7.field224; var13++) {
                    short var14 = arg7.field213[var13];
                    if (arg3 == null || arg2 == arg3[var14] || arg4.field4931[var14] == 0) {
                        short var15 = arg7.field210[var13];
                        if (var15 != -1) {
                            this.method3761(arg4.field4930[var15], 0, arg6, 0, 0, arg10, arg9, true, arg4.field4922[var15] & arg11, 0);
                        }
                        this.method3761(arg4.field4930[var14], arg4.field4931[var14], arg6, arg7.field209[var13], arg7.field211[var13], arg10, arg9, true, arg4.field4922[var14] & arg11, arg7.field223[var13]);
                    }
                }
            } else if (arg5) {
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < arg4.field4923; var18++) {
                    boolean var19 = false;
                    if (var16 < arg7.field224 && arg7.field213[var16] == var18) {
                        var19 = true;
                    }
                    boolean var20 = false;
                    if (arg1.field224 > var17 && arg1.field213[var17] == var18) {
                        var20 = true;
                    }
                    if (var19 || var20) {
                        if (arg3 == null || arg2 == arg3[var18] || arg4.field4931[var18] == 0) {
                            short var21 = 0;
                            int var22 = arg4.field4931[var18];
                            if (var22 == 3 || var22 == 10) {
                                var21 = 128;
                            }
                            short var23;
                            short var24;
                            short var25;
                            short var26;
                            byte var27;
                            if (var19) {
                                var23 = arg7.field223[var16];
                                var24 = arg7.field209[var16];
                                var25 = arg7.field210[var16];
                                var26 = arg7.field211[var16];
                                var27 = arg7.field221[var16];
                                var16++;
                            } else {
                                var24 = var21;
                                var23 = var21;
                                var25 = -1;
                                var27 = 0;
                                var26 = var21;
                            }
                            short var28;
                            short var29;
                            short var30;
                            short var31;
                            byte var32;
                            if (var20) {
                                var28 = arg1.field223[var17];
                                var29 = arg1.field210[var17];
                                var30 = arg1.field211[var17];
                                var31 = arg1.field209[var17];
                                var32 = arg1.field221[var17];
                                var17++;
                            } else {
                                var30 = var21;
                                var31 = var21;
                                var28 = var21;
                                var29 = -1;
                                var32 = 0;
                            }
                            if (var25 != -1) {
                                this.method3761(arg4.field4930[var25], 0, arg6, 0, 0, arg10, arg9, arg5, arg4.field4922[var25] & arg11, 0);
                            } else if (var29 != -1) {
                                this.method3761(arg4.field4930[var29], 0, arg6, 0, 0, arg10, arg9, arg5, arg11 & arg4.field4922[var29], 0);
                            }
                            int var33;
                            int var34;
                            int var35;
                            if ((var27 & 0x2) != 0 || (var32 & 0x1) != 0) {
                                var33 = var24;
                                var34 = var23;
                                var35 = var26;
                            } else if (var22 == 2) {
                                int var38 = var30 - var26 & 0x3FFF;
                                int var39 = var31 - var24 & 0x3FFF;
                                if (var38 >= 8192) {
                                    var38 -= 16384;
                                }
                                int var40 = var28 - var23 & 0x3FFF;
                                if (var39 >= 8192) {
                                    var39 -= 16384;
                                }
                                var35 = arg0 * var38 / arg8 + var26 & 0x3FFF;
                                if (var40 >= 8192) {
                                    var40 -= 16384;
                                }
                                var33 = arg0 * var39 / arg8 + var24 & 0x3FFF;
                                var34 = var23 + (arg0 * var40 / arg8) & 0x3FFF;
                            } else if (var22 == 9) {
                                int var37 = var30 - var26 & 0x3FFF;
                                if (var37 >= 8192) {
                                    var37 -= 16384;
                                }
                                var34 = 0;
                                var33 = 0;
                                var35 = arg0 * var37 / arg8 + var26 & 0x3FFF;
                            } else if (var22 == 7) {
                                int var36 = var30 - var26 & 0x3F;
                                if (var36 >= 32) {
                                    var36 -= 64;
                                }
                                var35 = arg0 * var36 / arg8 + var26 & 0x3F;
                                var33 = (var31 - var24) * arg0 / arg8 + var24;
                                var34 = var23 + ((var28 - var23) * arg0 / arg8);
                            } else {
                                var35 = (var30 - var26) * arg0 / arg8 + var26;
                                var34 = (var28 - var23) * arg0 / arg8 + var23;
                                var33 = (var31 - var24) * arg0 / arg8 + var24;
                            }
                            this.method3761(arg4.field4930[var18], var22, arg6, var33, var35, arg10, arg9, true, arg11 & arg4.field4922[var18], var34);
                        } else {
                            if (var20) {
                                var17++;
                            }
                            if (var19) {
                                var16++;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var42) {
            throw class759.method5498(var42, field7203[5] + arg0 + ',' + (arg1 == null ? field7203[0] : field7203[2]) + ',' + arg2 + ',' + (arg3 == null ? field7203[0] : field7203[2]) + ',' + (arg4 == null ? field7203[0] : field7203[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7203[0] : field7203[2]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field7203[0] : field7203[2]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method316();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IIIZILkl;ILkl;I)V")
    public final void method3760(int arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6, class87 arg7, int arg8, class87 arg9, int arg10) {
        try {
            field7201++;
            if (arg6 != -1) {
                if (arg0 != -30113) {
                    this.field7195 = true;
                }
                this.method316();
                if (this.method334()) {
                    class18 var12 = arg9.field976[arg6];
                    class311 var13 = var12.field220;
                    class18 var14 = null;
                    if (arg7 != null) {
                        var14 = arg7.field976[arg3];
                        if (var14.field220 != var13) {
                            var14 = null;
                        }
                    }
                    this.method3759(arg8, var14, false, null, var13, true, arg10, var12, arg1, arg5, arg2, arg4);
                    this.method337();
                    this.method315();
                } else {
                    this.method315();
                }
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field7203[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7203[0] : field7203[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7203[0] : field7203[2]) + ',' + arg8 + ',' + (arg9 == null ? field7203[0] : field7203[2]) + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method305();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method340();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Ljk;")
    public abstract class659[] method324();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method329(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method339(int arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method326();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method303(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
    public abstract boolean method343();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqq;IZ)V")
    public abstract void method304(class501 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method341();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method337();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method310();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method334();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method327();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method302(int arg0, int arg1, class294 arg2, class294 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIII[IZZII)V")
    private final void method3761(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, boolean arg7, int arg8, int arg9) {
        try {
            field7197++;
            if (arg2 == 1) {
                if (arg1 == 0 || arg1 == 1) {
                    int var16 = -arg4;
                    arg4 = arg9;
                    arg9 = var16;
                } else if (arg1 == 3) {
                    int var15 = arg4;
                    arg4 = arg9;
                    arg9 = var15;
                } else if (arg1 == 2) {
                    int var14 = arg4;
                    arg4 = -arg9 & 0x3FFF;
                    arg9 = var14 & 0x3FFF;
                }
            } else if (arg2 == 2) {
                if (arg1 == 0 || arg1 == 1) {
                    arg4 = -arg4;
                    arg9 = -arg9;
                } else if (arg1 == 2) {
                    arg9 = -arg9 & 0x3FFF;
                    arg4 = -arg4 & 0x3FFF;
                }
            } else if (arg2 == 3) {
                if (arg1 == 0 || arg1 == 1) {
                    int var13 = arg4;
                    arg4 = -arg9;
                    arg9 = var13;
                } else if (arg1 == 3) {
                    int var12 = arg4;
                    arg4 = arg9;
                    arg9 = var12;
                } else if (arg1 == 2) {
                    int var11 = arg4;
                    arg4 = arg9 & 0x3FFF;
                    arg9 = -var11 & 0x3FFF;
                }
            }
            if (arg8 == 65535) {
                this.method320(arg1, arg0, arg4, arg3, arg9, arg2, arg6);
            } else {
                this.method319(arg1, arg0, arg4, arg3, arg9, arg6, arg8, arg5);
            }
            if (!arg7) {
                field7199 = 38;
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field7203[4] + (arg0 == null ? field7203[0] : field7203[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field7203[0] : field7203[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method300(class497 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIIIIILs;I)V")
    public final void method3762(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class294 arg7, int arg8) {
        try {
            field7191++;
            boolean var10 = false;
            boolean var11 = false;
            if (arg1 != 62) {
                field7202 = null;
            }
            boolean var12 = false;
            int var13 = -arg6 / 2;
            int var14 = -arg0 / 2;
            int var15 = arg7.method2404((byte) 111, arg8 + var13, arg4 + var14);
            int var16 = arg6 / 2;
            int var17 = -arg0 / 2;
            int var18 = arg7.method2404((byte) 127, arg8 + var16, arg4 + var17);
            int var19 = -arg6 / 2;
            int var20 = arg0 / 2;
            int var21 = arg7.method2404((byte) 125, arg8 + var19, arg4 + var20);
            int var22 = arg6 / 2;
            int var23 = arg0 / 2;
            int var24 = arg7.method2404((byte) 117, arg8 + var22, arg4 + var23);
            int var25 = var18 > var15 ? var15 : var18;
            int var26 = var21 < var24 ? var21 : var24;
            int var27 = var24 <= var18 ? var24 : var18;
            if (arg0 != 0) {
                int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
                if (var28 != 0) {
                    if (arg2 != 0) {
                        if (var28 > 8192) {
                            int var29 = 16384 - arg2;
                            if (var29 > var28) {
                                var28 = var29;
                            }
                        } else if (arg2 < var28) {
                            var28 = arg2;
                        }
                    }
                    this.method325(var28);
                }
            }
            int var30 = var21 > var15 ? var15 : var21;
            if (arg6 != 0) {
                int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
                if (var31 != 0) {
                    if (arg3 != 0) {
                        if (var31 > 8192) {
                            int var32 = 16384 - arg3;
                            if (var31 < var32) {
                                var31 = var32;
                            }
                        } else if (arg3 < var31) {
                            var31 = arg3;
                        }
                    }
                    this.method344(var31);
                }
            }
            int var33 = var15 + var24;
            if (var33 > (var18 + var21)) {
                var33 = var18 + var21;
            }
            int var34 = (var33 >> 1) - arg5;
            if (var34 != 0) {
                this.method298(0, var34, 0);
            }
        } catch (RuntimeException var36) {
            throw class759.method5498(var36, field7203[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7203[0] : field7203[2]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method311(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method336();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method306();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method315();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method298(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method338(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZB)V")
    public static final void method3763(boolean arg0, byte arg1) {
        try {
            field7196++;
            for (class142 var2 = (class142) class743.field10807.method3863((byte) 64); var2 != null; var2 = (class142) class743.field10807.method3862(-353)) {
                if (var2.field1700 != null) {
                    class594.field8714.method4980(var2.field1700);
                    var2.field1700 = null;
                }
                if (var2.field1712 != null) {
                    class594.field8714.method4980(var2.field1712);
                    var2.field1712 = null;
                }
                var2.method1824(1);
            }
            if (arg1 >= -34) {
                field7193 = null;
            }
            if (arg0) {
                for (class142 var3 = (class142) class278.field4182.method3863((byte) 64); var3 != null; var3 = (class142) class278.field4182.method3862(-353)) {
                    if (var3.field1700 != null) {
                        class594.field8714.method4980(var3.field1700);
                        var3.field1700 = null;
                    }
                    var3.method1824(1);
                }
                for (class142 var4 = (class142) class761.field11026.method971(347); var4 != null; var4 = (class142) class761.field11026.method973(true)) {
                    if (var4.field1700 != null) {
                        class594.field8714.method4980(var4.field1700);
                        var4.field1700 = null;
                    }
                    var4.method1824(1);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7203[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqq;)V")
    public abstract void method349(class501 arg0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method321();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method322();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqq;Lng;II)V")
    public abstract void method323(class501 arg0, class359 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method319(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class194 method301(class194 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILqq;ZI)Z")
    public abstract boolean method297(int arg0, int arg1, class501 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILkl;ILkl;ZIIII)V")
    public final void method3764(int arg0, class87 arg1, int arg2, class87 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field7190++;
            if (arg5 != -1) {
                this.method316();
                if (this.method334()) {
                    class18 var10 = arg3.field976[arg5];
                    class311 var11 = var10.field220;
                    class18 var12 = null;
                    if (arg1 != null) {
                        var12 = arg1.field976[arg2];
                        if (var12.field220 != var11) {
                            var12 = null;
                        }
                    }
                    this.method3759(arg7, var12, false, null, var11, true, arg8, var10, arg0, arg4, null, 65535);
                    this.method337();
                    this.method315();
                    if (arg6 != 2) {
                        field7193 = null;
                    }
                } else {
                    this.method315();
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field7203[9] + arg0 + ',' + (arg1 == null ? field7203[0] : field7203[2]) + ',' + arg2 + ',' + (arg3 == null ? field7203[0] : field7203[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3765(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3766(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
