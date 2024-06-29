import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class18 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Lig;")
    public static class93 field434 = new class93(100);

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field437 = new int[] { 5, 0, 0, 0, 8, 0, 0, 0, 0, -2, -1, 0, 0, 0, 6, 0, 0, 0, 0, -1, -1, 5, 3, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 6, 20, 0, 0, 0, 2, 0, 0, 0, 12, 4, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 0, 14, 6, 7, 0, -2, 0, 4, 0, 6, 0, 0, 4, 4, 5, 0, -2, -2, 9, 10, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 2, 0, 2, 0, 0, 5, 0, -1, 0, 0, 0, 5, 3, 0, 2, 0, 0, 0, 0, 1, 0, 0, 7, 0, 0, 0, 0, 6, -1, -1, 0, 6, 0, -1, 0, 0, 0, 6, 0, 5, 0, -2, 0, 0, 3, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, -1, -1, -2, 2, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24, 0, 0, 0, 10, 8, 0, -1, 4, -2, 0, 0, 0, 6, 0, 0, -2, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lvd;")
    public static class222 field436 = class212.method1357("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 10731);

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lvd;")
    public static class222 field440 = class212.method1357(":assist:", 10731);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lig;")
    public static class93 field442 = new class93(64);

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lki;")
    public static class117 field443;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lpg;")
    public static class165 field435;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method150(int arg0, int arg1, int arg2, int arg3) {
        if (!class222.method1423(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class80.field1544[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class66.field1239) {
                    if (!class191.method1191(var4, var6, var5)) {
                        return false;
                    }
                    if (!class191.method1191(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class191.method1191(var4, var7, var5)) {
                        return false;
                    }
                    if (!class191.method1191(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class191.method1191(var4, var8, var5)) {
                    return false;
                }
                if (!class191.method1191(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class231.field4336) {
                    if (!class191.method1191(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class191.method1191(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class191.method1191(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class191.method1191(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class191.method1191(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class191.method1191(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class66.field1239) {
                    if (!class191.method1191(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class191.method1191(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class191.method1191(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class191.method1191(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class191.method1191(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class191.method1191(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class231.field4336) {
                    if (!class191.method1191(var4, var6, var5)) {
                        return false;
                    }
                    if (!class191.method1191(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class191.method1191(var4, var7, var5)) {
                        return false;
                    }
                    if (!class191.method1191(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class191.method1191(var4, var8, var5)) {
                    return false;
                }
                if (!class191.method1191(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class191.method1191(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class191.method1191(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class191.method1191(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class191.method1191(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class191.method1191(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BI)V")
    public abstract void method151(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)[B")
    public abstract byte[] method152(int arg0);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static void method153(int arg0) {
        field436 = null;
        if (arg0 != 16) {
            method150(14, -70, 108, 28);
        }
        field442 = null;
        field440 = null;
        field434 = null;
        field443 = null;
        field437 = null;
        field435 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1;
        class46.method339(1536, arg0);
        field441++;
        int var8 = arg0;
        int var9 = -arg0;
        int var10 = arg0 - arg2;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = -var10;
        int var12 = -1;
        if (arg5 >= class129.field2514 && class230.field4322 >= arg5) {
            int[] var13 = class156.field2981[arg5];
            int var14 = class22.method209(class112.field2107, arg4 - arg0, -89, class127.field2448);
            int var15 = class22.method209(class112.field2107, arg0 + arg4, 93, class127.field2448);
            int var16 = class22.method209(class112.field2107, arg4 - var10, 91, class127.field2448);
            int var17 = class22.method209(class112.field2107, arg4 + var10, -51, class127.field2448);
            class81.method532(var14, arg6, var13, var16, -7);
            class81.method532(var16, arg3, var13, var17, arg1 - 7);
            class81.method532(var17, arg6, var13, var15, -7);
        }
        int var18 = var10;
        int var19 = -1;
        while (var7 < var8) {
            var19 += 2;
            var11 += var19;
            var12 += 2;
            if (var11 >= 0 && var18 >= 1) {
                var18--;
                var11 -= var18 << 1;
                class92.field1730[var18] = var7;
            }
            var7++;
            var9 += var12;
            if (var9 >= 0) {
                var8--;
                int var20 = arg5 + var8;
                var9 -= var8 << 1;
                int var21 = arg5 - var8;
                if (class129.field2514 <= var20 && class230.field4322 >= var21) {
                    if (var10 <= var8) {
                        int var22 = class22.method209(class112.field2107, arg4 + var7, 114, class127.field2448);
                        int var23 = class22.method209(class112.field2107, arg4 - var7, 122, class127.field2448);
                        if (class230.field4322 >= var20) {
                            class81.method532(var23, arg6, class156.field2981[var20], var22, -7);
                        }
                        if (var21 >= class129.field2514) {
                            class81.method532(var23, arg6, class156.field2981[var21], var22, -7);
                        }
                    } else {
                        int var24 = class92.field1730[var8];
                        int var25 = class22.method209(class112.field2107, arg4 + var7, 82, class127.field2448);
                        int var26 = class22.method209(class112.field2107, arg4 - var7, 121, class127.field2448);
                        int var27 = class22.method209(class112.field2107, arg4 + var24, 89, class127.field2448);
                        int var28 = class22.method209(class112.field2107, arg4 - var24, 116, class127.field2448);
                        if (var20 <= class230.field4322) {
                            int[] var29 = class156.field2981[var20];
                            class81.method532(var26, arg6, var29, var28, arg1 - 7);
                            class81.method532(var28, arg3, var29, var27, -7);
                            class81.method532(var27, arg6, var29, var25, arg1 - 7);
                        }
                        if (var21 >= class129.field2514) {
                            int[] var30 = class156.field2981[var21];
                            class81.method532(var26, arg6, var30, var28, -7);
                            class81.method532(var28, arg3, var30, var27, -7);
                            class81.method532(var27, arg6, var30, var25, arg1 - 7);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class129.field2514 && class230.field4322 >= var31) {
                int var33 = arg4 - var8;
                int var34 = arg4 + var8;
                if (var34 >= class112.field2107 && class127.field2448 >= var33) {
                    int var35 = class22.method209(class112.field2107, var34, 98, class127.field2448);
                    int var36 = class22.method209(class112.field2107, var33, 99, class127.field2448);
                    if (var10 > var7) {
                        int var37 = var18 < var7 ? class92.field1730[var7] : var18;
                        int var38 = class22.method209(class112.field2107, arg4 + var37, 94, class127.field2448);
                        int var39 = class22.method209(class112.field2107, arg4 - var37, arg1 + -36, class127.field2448);
                        if (class230.field4322 >= var32) {
                            int[] var40 = class156.field2981[var32];
                            class81.method532(var36, arg6, var40, var39, arg1 ^ 0xFFFFFFF9);
                            class81.method532(var39, arg3, var40, var38, -7);
                            class81.method532(var38, arg6, var40, var35, arg1 ^ 0xFFFFFFF9);
                        }
                        if (var31 >= class129.field2514) {
                            int[] var41 = class156.field2981[var31];
                            class81.method532(var36, arg6, var41, var39, -7);
                            class81.method532(var39, arg3, var41, var38, -7);
                            class81.method532(var38, arg6, var41, var35, -7);
                        }
                    } else {
                        if (class230.field4322 >= var32) {
                            class81.method532(var36, arg6, class156.field2981[var32], var35, arg1 ^ 0xFFFFFFF9);
                        }
                        if (var31 >= class129.field2514) {
                            class81.method532(var36, arg6, class156.field2981[var31], var35, -7);
                        }
                    }
                }
            }
        }
    }
}
