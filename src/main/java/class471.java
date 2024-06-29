import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class471 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Z")
    public boolean field6676 = false;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[B")
    public static byte[] field6687 = new byte[2048];

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Lcq;")
    public static class466 field6691;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lcq;")
    public static class466 field6690 = field6691 = new class466(false);

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lgda;")
    public static class53 field6692 = new class53(25, 3);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnga;IZ)V")
    public abstract void method264(class513 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method263();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method260();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIII[II[IBII)V")
    private final void method2809(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, byte arg7, int arg8, int arg9) {
        if (arg7 <= 39) {
            method2819((byte) 83);
        }
        if (arg5 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = -arg8;
                arg8 = arg2;
                arg2 = var16;
            } else if (arg1 == 3) {
                int var14 = arg8;
                arg8 = arg2;
                arg2 = var14;
            } else if (arg1 == 2) {
                int var15 = arg8;
                arg8 = -arg2 & 0x3FFF;
                arg2 = var15 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg8 = -arg8;
                arg2 = -arg2;
            } else if (arg1 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg2 = -arg2 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = arg8;
                arg8 = -arg2;
                arg2 = var13;
            } else if (arg1 == 3) {
                int var11 = arg8;
                arg8 = arg2;
                arg2 = var11;
            } else if (arg1 == 2) {
                int var12 = arg8;
                arg8 = arg2 & 0x3FFF;
                arg2 = -var12 & 0x3FFF;
            }
        }
        field6683++;
        if (arg3 == 65535) {
            this.method232(arg1, arg4, arg8, arg9, arg2, arg5, arg0);
        } else {
            this.method248(arg1, arg4, arg8, arg9, arg2, arg0, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method265();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method228();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method231(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Liaa;IIIZIILiaa;I)V")
    public final void method2810(class494 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class494 arg7, int arg8) {
        field6680++;
        if (arg2 == -1) {
            return;
        }
        this.method256();
        if (!this.method254()) {
            this.method220();
            return;
        }
        class250 var10 = arg0.field7125[arg2];
        class79 var11 = var10.field3317;
        class250 var12 = null;
        if (arg7 != null) {
            var12 = arg7.field7125[arg3];
            if (var12.field3317 != var11) {
                var12 = null;
            }
        }
        this.method2817((byte) -102, arg6, null, null, 65535, false, arg1, arg5, var11, var12, var10, arg4);
        this.method246();
        if (arg8 != 1000) {
            this.method253();
        }
        this.method220();
    }

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class180 method217(class180 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILnga;ZII)Z")
    public abstract boolean method229(int arg0, int arg1, class513 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method261(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method235(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method230();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method248(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method245();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lde;")
    public abstract class531[] method227();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method268(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lee;B)Ltb;")
    public static final class399 method2811(class675 arg0, byte arg1) {
        field6678++;
        if (arg1 >= -92) {
            field6687 = null;
        }
        return new class399(arg0.method3706((byte) -121), arg0.method3706((byte) 81), arg0.method3706((byte) -103), arg0.method3706((byte) -99), arg0.method3706((byte) -124), arg0.method3706((byte) 57), arg0.method3706((byte) 16), arg0.method3706((byte) -118), arg0.method3756(false), arg0.method3750((byte) 35));
    }

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method254();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILnga;ZI)Z")
    public abstract boolean method233(int arg0, int arg1, class513 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method218();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIILlv;)Z")
    public static final boolean method2812(boolean arg0, int arg1, int arg2, int arg3, class444 arg4) {
        field6679++;
        if (!class734.field10226 || !class377.field5290) {
            return false;
        } else if (class744.field10348 < 100) {
            return false;
        } else if (class662.method3629(arg2, 843095752, arg3, arg1)) {
            if (!arg0) {
                method2819((byte) -83);
            }
            int var5 = arg1 << class660.field9038;
            int var6 = arg3 << class660.field9038;
            int var7 = class459.field6474[arg2].method1816((byte) 126, arg3, arg1) - 1;
            int var8 = arg4.method749(32767) + var7;
            if (arg4.field6312 == 1) {
                if (!class553.method3203(var5, var8, class586.field8250 + var6, 0, var5, var7, var5, var6, var8, var6)) {
                    return false;
                } else if (class553.method3203(var5, var8, class586.field8250 + var6, 0, var5, var7, var5, var6, var7, class586.field8250 + var6)) {
                    class354.field5057++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field6312 == 2) {
                if (!class553.method3203(var5, var8, class586.field8250 + var6, 0, var5, var7, class586.field8250 + var5, class586.field8250 + var6, var8, class586.field8250 + var6)) {
                    return false;
                } else if (class553.method3203(var5, var7, class586.field8250 + var6, 0, class586.field8250 + var5, var7, var5 + class586.field8250, var6 - -class586.field8250, var8, var6 + class586.field8250)) {
                    class354.field5057++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field6312 == 4) {
                if (!class553.method3203(var5 + class586.field8250, var8, class586.field8250 + var6, 0, class586.field8250 + var5, var7, var5 + class586.field8250, var6, var8, var6)) {
                    return false;
                } else if (class553.method3203(class586.field8250 + var5, var8, class586.field8250 + var6, 0, class586.field8250 + var5, var7, class586.field8250 + var5, var6, var7, class586.field8250 + var6)) {
                    class354.field5057++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field6312 == 8) {
                if (!class553.method3203(var5, var8, var6, 0, var5, var7, class586.field8250 + var5, var6, var8, var6)) {
                    return false;
                } else if (class553.method3203(var5, var7, var6, 0, class586.field8250 + var5, var7, var5 + class586.field8250, var6, var8, var6)) {
                    class354.field5057++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field6312 == 16) {
                if (class263.method1723(var8, class197.field2617, class197.field2617, var6 + class197.field2617, (byte) 116, var7, var5)) {
                    class354.field5057++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field6312 == 32) {
                if (class263.method1723(var8, class197.field2617, class197.field2617, class197.field2617 + var6, (byte) 108, var7, class197.field2617 + var5)) {
                    class354.field5057++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field6312 == 64) {
                if (class263.method1723(var8, class197.field2617, class197.field2617, var6, (byte) 107, var7, class197.field2617 + var5)) {
                    class354.field5057++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field6312 != 128) {
                return true;
            } else if (class263.method1723(var8, class197.field2617, class197.field2617, var6, (byte) 69, var7, var5)) {
                class354.field5057++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method237(class471 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLpda;)V")
    public static final void method2813(byte arg0, class629 arg1) {
        field6689++;
        arg1.field8719 = false;
        if (arg1.field8718 != null) {
            arg1.field8718.field8725 = 0;
        }
        for (class629 var2 = arg1.method1361(); var2 != null; var2 = arg1.method1400()) {
            method2813((byte) 42, var2);
        }
        if (arg0 != 42) {
            method2816(27);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class471 method226(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method244(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method242(int arg0);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method252(int arg0);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method246();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method223(int arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method236();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII[ZLiaa;IIILiaa;IZLiaa;Liaa;)V")
    public final void method2814(int arg0, int arg1, int arg2, int arg3, int arg4, boolean[] arg5, class494 arg6, int arg7, int arg8, int arg9, class494 arg10, int arg11, boolean arg12, class494 arg13, class494 arg14) {
        field6686++;
        if (arg9 == -1) {
            return;
        }
        if (arg5 == null || arg3 == -1) {
            this.method2810(arg13, arg1, arg9, arg2, arg12, 0, arg8, arg6, 1000);
            return;
        }
        this.method256();
        if (!this.method254()) {
            this.method220();
            return;
        }
        class250 var16 = arg13.field7125[arg9];
        class79 var17 = var16.field3317;
        class250 var18 = null;
        if (arg6 != null) {
            var18 = arg6.field7125[arg2];
            if (var18.field3317 != var17) {
                var18 = null;
            }
        }
        this.method2817((byte) -85, arg8, arg5, null, 65535, false, arg1, 0, var17, var18, var16, arg12);
        class250 var19 = arg10.field7125[arg3];
        class250 var20 = null;
        if (arg14 != null) {
            var20 = arg14.field7125[arg11];
            if (var20.field3317 != var17) {
                var20 = null;
            }
        }
        int var21 = -58 % ((arg7 + 65) / 33);
        this.method232(0, new int[0], 0, 0, 0, 0, arg12);
        this.method2817((byte) -49, arg4, arg5, null, 65535, true, arg0, 0, var19.field3317, var20, var19, arg12);
        this.method246();
        this.method220();
    }

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method250(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILiaa;)V")
    public final void method2815(int arg0, int arg1, class494 arg2) {
        field6685++;
        if (arg0 == -1) {
            return;
        }
        this.method256();
        if (!this.method254()) {
            this.method220();
            return;
        }
        class250 var4 = arg2.field7125[arg0];
        if (arg1 != 30626) {
            field6687 = null;
        }
        class79 var5 = var4.field3317;
        for (int var6 = 0; var6 < var4.field3318; var6++) {
            short var7 = var4.field3323[var6];
            if (var5.field1011[var7]) {
                if (var4.field3329[var6] != -1) {
                    this.method268(0, 0, 0, 0);
                }
                this.method268(var5.field1007[var7], var4.field3324[var6], var4.field3322[var6], var4.field3326[var6]);
            }
        }
        this.method246();
        this.method220();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method2816(int arg0) {
        field6692 = null;
        field6691 = null;
        if (arg0 < 113) {
            method2812(false, 54, 102, 54, null);
        }
        field6687 = null;
        field6690 = null;
    }

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method249(int arg0);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method224();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method266();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method220();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method255(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnga;)V")
    public abstract void method239(class513 arg0);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method258(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI[Z[IIZIILjv;Lae;Lae;Z)V")
    private final void method2817(byte arg0, int arg1, boolean[] arg2, int[] arg3, int arg4, boolean arg5, int arg6, int arg7, class79 arg8, class250 arg9, class250 arg10, boolean arg11) {
        field6684++;
        if (arg9 == null || arg6 == 0) {
            for (int var38 = 0; var38 < arg10.field3318; var38++) {
                short var39 = arg10.field3323[var38];
                if (arg2 == null || arg5 == arg2[var39] || arg8.field1007[var39] == 0) {
                    short var40 = arg10.field3329[var38];
                    if (var40 != -1) {
                        this.method2809(arg11, 0, 0, arg8.field1012[var40] & arg4, arg8.field1010[var40], arg7, arg3, (byte) 71, 0, 0);
                    }
                    this.method2809(arg11, arg8.field1007[var39], arg10.field3326[var38], arg4 & arg8.field1012[var39], arg8.field1010[var39], arg7, arg3, (byte) 70, arg10.field3324[var38], arg10.field3322[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg0 >= -32) {
            field6692 = null;
        }
        for (int var15 = 0; var15 < arg8.field1005; var15++) {
            boolean var16 = false;
            if (arg10.field3318 > var13 && arg10.field3323[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg9.field3318 && arg9.field3323[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg2 == null || arg5 == arg2[var15] || arg8.field1007[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field1007[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg10.field3326[var13];
                        var21 = arg10.field3324[var13];
                        var22 = arg10.field3328[var13];
                        var23 = arg10.field3329[var13];
                        var24 = arg10.field3322[var13];
                        var13++;
                    } else {
                        var21 = var18;
                        var20 = var18;
                        var24 = var18;
                        var23 = -1;
                        var22 = 0;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg9.field3326[var14];
                        var26 = arg9.field3329[var14];
                        var27 = arg9.field3324[var14];
                        var28 = arg9.field3322[var14];
                        var29 = arg9.field3328[var14];
                        var14++;
                    } else {
                        var28 = var18;
                        var26 = -1;
                        var25 = var18;
                        var29 = 0;
                        var27 = var18;
                    }
                    if (var23 != -1) {
                        this.method2809(arg11, 0, 0, arg8.field1012[var23] & arg4, arg8.field1010[var23], arg7, arg3, (byte) 73, 0, 0);
                    } else if (var26 != -1) {
                        this.method2809(arg11, 0, 0, arg4 & arg8.field1012[var26], arg8.field1010[var26], arg7, arg3, (byte) 43, 0, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var34 = var21;
                        var33 = var24;
                        var35 = var20;
                    } else if (var19 == 2) {
                        int var30 = var27 - var21 & 0x3FFF;
                        int var31 = var28 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var25 - var20 & 0x3FFF;
                        var33 = arg6 * var31 / arg1 + var24 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg6 * var30 / arg1 + var21 & 0x3FFF;
                        var35 = arg6 * var32 / arg1 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var27 - var21 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var34 = var21 + (arg6 * var36 / arg1) & 0x3FFF;
                        var35 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var37 = var27 - var21 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = arg6 * var37 / arg1 + var21 & 0x3F;
                        var33 = (var28 - var24) * arg6 / arg1 + var24;
                        var35 = (var25 - var20) * arg6 / arg1 + var20;
                    } else {
                        var33 = (var28 - var24) * arg6 / arg1 + var24;
                        var35 = var20 + ((var25 - var20) * arg6 / arg1);
                        var34 = var21 + ((var27 - var21) * arg6 / arg1);
                    }
                    this.method2809(arg11, var19, var35, arg8.field1012[var15] & arg4, arg8.field1010[var15], arg7, arg3, (byte) 106, var34, var33);
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method232(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnga;Lfn;I)V")
    public abstract void method221(class513 arg0, class137 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method222();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILs;IIIIIII)V")
    public final void method2818(int arg0, class278 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6682++;
        if (arg5 != -3) {
            field6691 = null;
        }
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg1.method1815(arg6 + var14, arg2 - -var13, -16);
        int var16 = arg7 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg1.method1815(arg6 + var17, arg2 + var16, arg5 ^ 0x7F);
        int var19 = -arg7 / 2;
        int var20 = arg3 / 2;
        int var21 = arg1.method1815(arg6 + var20, arg2 + var19, arg5 ^ 0x7E);
        int var22 = arg7 / 2;
        int var23 = arg3 / 2;
        int var24 = arg1.method1815(arg6 + var23, arg2 - -var22, -128);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg3 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg0 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg0;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg0) {
                        var28 = arg0;
                    }
                }
                this.method238(var28);
            }
        }
        int var30 = var21 <= var15 ? var21 : var15;
        int var31 = var15 + var24;
        if (arg7 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg4 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg4;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg4 < var32) {
                        var32 = arg4;
                    }
                }
                this.method249(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (var34 != 0) {
            this.method235(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method253();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method225(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)I")
    public static final int method2819(byte arg0) {
        field6681++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class202.field2644.field4385 && !class202.field2644.field4367) {
            var1 = true;
            if (class470.field6666.field5558 < 512 && class470.field6666.field5558 != 0) {
                var1 = false;
            }
            if (class316.field4377.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class245.field3273) {
            var1 = false;
        }
        if (class380.field5440) {
            var2 = false;
        }
        if (class87.field1064) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class645.method3563(arg0 + 79);
        }
        int var4 = -1;
        if (arg0 != -76) {
            field6690 = null;
        }
        int var5 = -1;
        if (var1) {
            try {
                var4 = class752.method4186(1000, 2, (byte) 83);
            } catch (Exception var15) {
            }
        }
        int var6 = -1;
        if (var3) {
            try {
                var6 = class752.method4186(1000, 3, (byte) 83);
                if (class557.field7812.field6521.method2556(false) == 3) {
                    class603 var7 = class268.field3831.method451();
                    long var8 = var7.field8478 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field8480;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class752.method4186(1000, 1, (byte) 83);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class645.method3563(3);
        }
        int var11 = (int) ((float) var5 * 1.1F);
        int var12 = (int) ((float) var6 * 1.1F);
        if (var4 > var12 && var4 > var11) {
            return class631.method3520(var4, -11904);
        } else if (var11 >= var12) {
            return class63.method536(-57, 1, var11);
        } else {
            return class63.method536(arg0 - 19, 3, var12);
        }
    }

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method243();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method238(int arg0);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lok;")
    public abstract class253[] method241();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method256();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIIBLiaa;IIILiaa;[I)V")
    public final void method2820(int arg0, boolean arg1, int arg2, int arg3, byte arg4, class494 arg5, int arg6, int arg7, int arg8, class494 arg9, int[] arg10) {
        if (arg4 > -34) {
            field6691 = null;
        }
        field6677++;
        if (arg2 == -1) {
            return;
        }
        this.method256();
        if (!this.method254()) {
            this.method220();
            return;
        }
        class250 var12 = arg5.field7125[arg2];
        class79 var13 = var12.field3317;
        class250 var14 = null;
        if (arg9 != null) {
            var14 = arg9.field7125[arg0];
            if (var14.field3317 != var13) {
                var14 = null;
            }
        }
        this.method2817((byte) -84, arg7, null, arg10, arg3, false, arg8, arg6, var13, var14, var12, arg1);
        this.method246();
        this.method220();
    }

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method234();

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method259();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()Z")
    public abstract boolean method257();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnga;Lfn;II)V")
    public abstract void method262(class513 arg0, class137 arg1, int arg2, int arg3);
}
