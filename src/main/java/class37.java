import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class37 {

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    private int field721;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "[[I")
    public int[][] field741;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    private int field732;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Leh;")
    private static class47 field718 = class195.method1282((byte) -4, "K");

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field740 = 0;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Leh;")
    public static class47 field725 = field718;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Leh;")
    public static class47 field719 = field718;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "Leh;")
    public static class47 field742 = class195.method1282((byte) -4, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Leh;")
    public static class47 field734 = class195.method1282((byte) -4, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Lpa;")
    public static class136 field743 = new class136(5);

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field745 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[Ldh;")
    public static class38[] field729;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "[Z")
    public static boolean[] field733;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIZI)V")
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field732;
        field737++;
        int var9 = arg0 - this.field735;
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        if (~arg6 == arg1 || arg6 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field721) {
                for (int var13 = var8; var13 < arg2 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field731) {
                        this.method314(var10, var12, 3, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIIIII)Z")
    public final boolean method311(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field730++;
        int var9 = arg4 + arg6 - 1;
        int var10 = arg0 + arg2 - 1;
        if (arg5 >= arg4 && arg5 <= var9 && arg3 >= arg0 && arg3 <= var10) {
            return true;
        } else if (arg4 - 1 == arg5 && arg3 >= arg0 && var10 >= arg3 && (this.field741[arg5 - this.field735][arg3 - this.field732] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else {
            if (arg1) {
                this.method319(false, 116, 31);
            }
            if (var9 + 1 == arg5 && arg0 <= arg3 && arg3 <= var10 && (this.field741[arg5 - this.field735][arg3 - this.field732] & 0x80) == 0 && (arg7 & 0x2) == 0) {
                return true;
            } else if (arg0 - 1 == arg3 && arg4 <= arg5 && arg5 <= var9 && (this.field741[arg5 - this.field735][arg3 - this.field732] & 0x2) == 0 && (arg7 & 0x4) == 0) {
                return true;
            } else {
                return var10 + 1 == arg3 && arg5 >= arg4 && var9 >= arg5 && (this.field741[arg5 - this.field735][arg3 - this.field732] & 0x20) == 0 && (arg7 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method312(byte arg0) {
        field718 = null;
        field729 = null;
        field743 = null;
        field725 = null;
        field734 = null;
        field733 = null;
        if (arg0 != -107) {
            method312((byte) -124);
        }
        field742 = null;
        field719 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lwh;IIIIIII)V")
    public static final void method313(class206 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class40.field790;
        int var10;
        int var11 = var10 = (arg7 << 7) - class87.field1866;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class41.field821[arg1][arg6][arg7] - class144.field2828;
        int var17 = class41.field821[arg1][arg6 + 1][arg7] - class144.field2828;
        int var18 = class41.field821[arg1][arg6 + 1][arg7 + 1] - class144.field2828;
        int var19 = class41.field821[arg1][arg6][arg7 + 1] - class144.field2828;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = (var20 << 9) / var24 + class17.field352;
        int var45 = (var23 << 9) / var24 + class17.field336;
        int var46 = (var26 << 9) / var30 + class17.field352;
        int var47 = (var29 << 9) / var30 + class17.field336;
        int var48 = (var32 << 9) / var36 + class17.field352;
        int var49 = (var35 << 9) / var36 + class17.field336;
        int var50 = (var38 << 9) / var42 + class17.field352;
        int var51 = (var41 << 9) / var42 + class17.field336;
        class17.field343 = 0;
        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
            if (class188.field3644 && class70.method628(class206.field4051, class191.field3691, var49, var51, var47, var48, var50, var46)) {
                class108.field2237 = arg6;
                class21.field396 = arg7;
            }
            class17.field347 = false;
            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class17.field335 || var50 > class17.field335 || var46 > class17.field335) {
                class17.field347 = true;
            }
            if (arg0.field4050 == -1) {
                if (arg0.field4049 != 12345678) {
                    class17.method191(var49, var51, var47, var48, var50, var46, arg0.field4049, arg0.field4055, arg0.field4057);
                }
            } else if (class106.field2224) {
                int var52 = class17.field354.method731(arg0.field4050, (byte) 60);
                class17.method191(var49, var51, var47, var48, var50, var46, class8.method52(var52, arg0.field4049), class8.method52(var52, arg0.field4055), class8.method52(var52, arg0.field4057));
            } else if (arg0.field4054) {
                class17.method178(var49, var51, var47, var48, var50, var46, arg0.field4049, arg0.field4055, arg0.field4057, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field4050);
            } else {
                class17.method178(var49, var51, var47, var48, var50, var46, arg0.field4049, arg0.field4055, arg0.field4057, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field4050);
            }
        }
        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
            return;
        }
        if (class188.field3644 && class70.method628(class206.field4051, class191.field3691, var45, var47, var51, var44, var46, var50)) {
            class108.field2237 = arg6;
            class21.field396 = arg7;
        }
        class17.field347 = false;
        if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class17.field335 || var46 > class17.field335 || var50 > class17.field335) {
            class17.field347 = true;
        }
        if (arg0.field4050 != -1) {
            if (!class106.field2224) {
                class17.method178(var45, var47, var51, var44, var46, var50, arg0.field4053, arg0.field4057, arg0.field4055, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field4050);
                return;
            }
            int var53 = class17.field354.method731(arg0.field4050, (byte) 60);
            class17.method191(var45, var47, var51, var44, var46, var50, class8.method52(var53, arg0.field4053), class8.method52(var53, arg0.field4057), class8.method52(var53, arg0.field4055));
        } else if (arg0.field4053 != 12345678) {
            class17.method191(var45, var47, var51, var44, var46, var50, arg0.field4053, arg0.field4057, arg0.field4055);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
    private final void method314(int arg0, int arg1, int arg2, int arg3) {
        this.field741[arg1][arg3] = class142.method1018(this.field741[arg1][arg3], ~arg0);
        if (arg2 != 3) {
            field742 = null;
        }
        field724++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field715++;
        if (arg1 == arg6 && arg0 == arg4) {
            return true;
        }
        int var8 = arg1 - this.field735;
        int var9 = arg6 - this.field735;
        int var10 = arg0 - this.field732;
        int var11 = arg4 - this.field732;
        if (arg2 == 0) {
            if (arg5 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field741[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field741[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field741[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field741[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field741[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field741[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field741[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field741[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg3 < 29) {
            return false;
        }
        if (arg2 == 9) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field741[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field741[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var11 && (this.field741[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIII)V")
    private final void method316(int arg0, int arg1, int arg2, int arg3) {
        field723++;
        this.field741[arg3][arg1] = class57.method495(this.field741[arg3][arg1], arg0);
        int var5 = 66 % ((arg2 + 45) / 42);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBIIZI)V")
    public final void method317(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 != 67) {
            this.field735 = 55;
        }
        int var7 = arg3 - this.field735;
        int var8 = arg0 - this.field732;
        field738++;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg2 + var7; var10++) {
            if (var10 >= 0 && this.field721 > var10) {
                for (int var11 = var8; var11 < arg5 + var8; var11++) {
                    if (var11 >= 0 && this.field731 > var11) {
                        this.method316(var9, var11, -98, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII)V")
    public final void method318(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field732;
        int var5 = arg2 - this.field735;
        field717++;
        if (arg0 > -21) {
            this.method323(-67, true, 83, -125, -6, -18);
        }
        this.field741[var5][var4] = class142.method1018(this.field741[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)V")
    public final void method319(boolean arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field732;
        field726++;
        if (!arg0) {
            field734 = null;
        }
        int var5 = arg1 - this.field735;
        this.field741[var5][var4] = class57.method495(this.field741[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    public final void method320(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field735;
        int var5 = arg1 - this.field732;
        field720++;
        this.field741[var4][var5] = class57.method495(this.field741[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIBIIZ)V")
    public final void method321(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        field728++;
        if (arg2 <= 122) {
            this.field741 = null;
        }
        int var7 = arg4 - this.field735;
        int var8 = arg0 - this.field732;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method316(128, var8, 97, var7);
                this.method316(8, var8, -99, var7 - 1);
            }
            if (arg1 == 1) {
                this.method316(2, var8, 50, var7);
                this.method316(32, var8 + 1, -126, var7);
            }
            if (arg1 == 2) {
                this.method316(8, var8, 57, var7);
                this.method316(128, var8, -101, var7 + 1);
            }
            if (arg1 == 3) {
                this.method316(32, var8, 45, var7);
                this.method316(2, var8 - 1, 123, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method316(1, var8, 49, var7);
                this.method316(16, var8 + 1, -122, var7 + -1);
            }
            if (arg1 == 1) {
                this.method316(4, var8, 61, var7);
                this.method316(64, var8 + 1, 90, var7 + 1);
            }
            if (arg1 == 2) {
                this.method316(16, var8, 117, var7);
                this.method316(1, var8 - 1, 127, var7 + 1);
            }
            if (arg1 == 3) {
                this.method316(64, var8, 95, var7);
                this.method316(4, var8 - 1, -121, var7 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method316(130, var8, 102, var7);
                this.method316(8, var8, -89, var7 - 1);
                this.method316(32, var8 + 1, -92, var7);
            }
            if (arg1 == 1) {
                this.method316(10, var8, 95, var7);
                this.method316(32, var8 + 1, -106, var7);
                this.method316(128, var8, 125, var7 + 1);
            }
            if (arg1 == 2) {
                this.method316(40, var8, 100, var7);
                this.method316(128, var8, 54, var7 + 1);
                this.method316(2, var8 - 1, 4, var7);
            }
            if (arg1 == 3) {
                this.method316(160, var8, -117, var7);
                this.method316(2, var8 - 1, 114, var7);
                this.method316(8, var8, -105, var7 - 1);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method316(65536, var8, 8, var7);
                this.method316(4096, var8, 76, var7 - 1);
            }
            if (arg1 == 1) {
                this.method316(1024, var8, 89, var7);
                this.method316(16384, var8 + 1, -95, var7);
            }
            if (arg1 == 2) {
                this.method316(4096, var8, -114, var7);
                this.method316(65536, var8, 120, var7 + 1);
            }
            if (arg1 == 3) {
                this.method316(16384, var8, -101, var7);
                this.method316(1024, var8 - 1, -114, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method316(512, var8, 94, var7);
                this.method316(8192, var8 + 1, 100, var7 - 1);
            }
            if (arg1 == 1) {
                this.method316(2048, var8, -91, var7);
                this.method316(32768, var8 + 1, -126, var7 + 1);
            }
            if (arg1 == 2) {
                this.method316(8192, var8, -106, var7);
                this.method316(512, var8 - 1, 59, var7 + 1);
            }
            if (arg1 == 3) {
                this.method316(32768, var8, -104, var7);
                this.method316(2048, var8 - 1, 114, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method316(66560, var8, 81, var7);
            this.method316(4096, var8, 94, var7 - 1);
            this.method316(16384, var8 + 1, 77, var7);
        }
        if (arg1 == 1) {
            this.method316(5120, var8, 29, var7);
            this.method316(16384, var8 + 1, -107, var7);
            this.method316(65536, var8, -117, var7 + 1);
        }
        if (arg1 == 2) {
            this.method316(20480, var8, -122, var7);
            this.method316(65536, var8, -103, var7 + 1);
            this.method316(1024, var8 - 1, -122, var7);
        }
        if (arg1 == 3) {
            this.method316(81920, var8, -101, var7);
            this.method316(1024, var8 - 1, -104, var7);
            this.method316(4096, var8, -115, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final void method322(int arg0) {
        for (int var2 = 0; var2 < this.field721; var2++) {
            for (int var4 = 0; var4 < this.field731; var4++) {
                if (var2 == 0 || var4 == 0 || var2 >= this.field721 - 5 || this.field731 - 5 <= var4) {
                    this.field741[var2][var4] = 16777215;
                } else {
                    this.field741[var2][var4] = 16777216;
                }
            }
        }
        field739++;
        int var3 = 106 % ((arg0 - 49) / 58);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIII)V")
    public final void method323(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field735;
        int var8 = arg5 - this.field732;
        int var9 = -31 / ((arg3 + 34) / 60);
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method314(128, var7, 3, var8);
                this.method314(8, var7 - 1, 3, var8);
            }
            if (arg4 == 1) {
                this.method314(2, var7, 3, var8);
                this.method314(32, var7, 3, var8 + 1);
            }
            if (arg4 == 2) {
                this.method314(8, var7, 3, var8);
                this.method314(128, var7 + 1, 3, var8);
            }
            if (arg4 == 3) {
                this.method314(32, var7, 3, var8);
                this.method314(2, var7, 3, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method314(1, var7, 3, var8);
                this.method314(16, var7 - 1, 3, var8 + 1);
            }
            if (arg4 == 1) {
                this.method314(4, var7, 3, var8);
                this.method314(64, var7 + 1, 3, var8 + 1);
            }
            if (arg4 == 2) {
                this.method314(16, var7, 3, var8);
                this.method314(1, var7 + 1, 3, var8 - 1);
            }
            if (arg4 == 3) {
                this.method314(64, var7, 3, var8);
                this.method314(4, var7 - 1, 3, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method314(130, var7, 3, var8);
                this.method314(8, var7 - 1, 3, var8);
                this.method314(32, var7, 3, var8 + 1);
            }
            if (arg4 == 1) {
                this.method314(10, var7, 3, var8);
                this.method314(32, var7, 3, var8 + 1);
                this.method314(128, var7 + 1, 3, var8);
            }
            if (arg4 == 2) {
                this.method314(40, var7, 3, var8);
                this.method314(128, var7 + 1, 3, var8);
                this.method314(2, var7, 3, var8 - 1);
            }
            if (arg4 == 3) {
                this.method314(160, var7, 3, var8);
                this.method314(2, var7, 3, var8 - 1);
                this.method314(8, var7 - 1, 3, var8);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg4 == 0) {
                    this.method314(65536, var7, 3, var8);
                    this.method314(4096, var7 - 1, 3, var8);
                }
                if (arg4 == 1) {
                    this.method314(1024, var7, 3, var8);
                    this.method314(16384, var7, 3, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method314(4096, var7, 3, var8);
                    this.method314(65536, var7 + 1, 3, var8);
                }
                if (arg4 == 3) {
                    this.method314(16384, var7, 3, var8);
                    this.method314(1024, var7, 3, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg4 == 0) {
                    this.method314(512, var7, 3, var8);
                    this.method314(8192, var7 - 1, 3, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method314(2048, var7, 3, var8);
                    this.method314(32768, var7 + 1, 3, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method314(8192, var7, 3, var8);
                    this.method314(512, var7 + 1, 3, var8 - 1);
                }
                if (arg4 == 3) {
                    this.method314(32768, var7, 3, var8);
                    this.method314(2048, var7 - 1, 3, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    this.method314(66560, var7, 3, var8);
                    this.method314(4096, var7 - 1, 3, var8);
                    this.method314(16384, var7, 3, var8 + 1);
                }
                if (arg4 == 1) {
                    this.method314(5120, var7, 3, var8);
                    this.method314(16384, var7, 3, var8 + 1);
                    this.method314(65536, var7 + 1, 3, var8);
                }
                if (arg4 == 2) {
                    this.method314(20480, var7, 3, var8);
                    this.method314(65536, var7 + 1, 3, var8);
                    this.method314(1024, var7, 3, var8 - 1);
                }
                if (arg4 == 3) {
                    this.method314(81920, var7, 3, var8);
                    this.method314(1024, var7, 3, var8 - 1);
                    this.method314(4096, var7 - 1, 3, var8);
                }
            }
        }
        field744++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIB)Z")
    public final boolean method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field722++;
        if (arg6 != -83) {
            return false;
        } else if (arg3 == arg5 && arg2 == arg4) {
            return true;
        } else {
            int var8 = arg2 - this.field732;
            int var9 = arg5 - this.field735;
            int var10 = arg4 - this.field732;
            int var11 = arg3 - this.field735;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var9 + 1 == var11 && var8 == var10 && (this.field741[var11][var8] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8 && (this.field741[var11][var8] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - 1 == var11 && var8 == var10 && (this.field741[var11][var8] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8 && (this.field741[var11][var8] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - 1 == var11 && var8 == var10 && (this.field741[var11][var8] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8 && (this.field741[var11][var8] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 + 1 == var11 && var8 == var10 && (this.field741[var11][var8] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8 && (this.field741[var11][var8] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var11 && var10 + 1 == var8 && (this.field741[var11][var8] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field741[var11][var8] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var8 == var10 && (this.field741[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10 && (this.field741[var11][var8] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V")
    public class37(int arg0, int arg1) {
        this.field731 = arg1;
        this.field721 = arg0;
        this.field741 = new int[this.field721][this.field731];
        this.field732 = 0;
        this.field735 = 0;
        this.method322(-60);
    }
}
