import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class257 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3765 = "Loading world list data";

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3771 = 0;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Luc;")
    public static class51 field3768 = new class51(64);

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Z")
    public static boolean field3775 = true;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3773 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
    public static boolean field3777 = false;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZII[I[IIII)V", line = 19)
    private final void method1667(int arg0, int arg1, boolean arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
        if (arg3 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = -arg9;
                arg9 = arg8;
                arg8 = var16;
            } else if (arg0 == 3) {
                int var14 = arg9;
                arg9 = arg8;
                arg8 = var14;
            } else if (arg0 == 2) {
                int var15 = arg9;
                arg9 = -arg8 & 0x3FFF;
                arg8 = var15 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg9 = -arg9;
                arg8 = -arg8;
            } else if (arg0 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg8 = -arg8 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = arg9;
                arg9 = -arg8;
                arg8 = var13;
            } else if (arg0 == 3) {
                int var12 = arg9;
                arg9 = arg8;
                arg8 = var12;
            } else if (arg0 == 2) {
                int var11 = arg9;
                arg9 = arg8 & 0x3FFF;
                arg8 = -var11 & 0x3FFF;
            }
        }
        field3776++;
        if (arg1 < 82) {
            return;
        }
        if (arg4 == 65535) {
            this.method1666(arg0, arg5, arg9, arg7, arg8, arg3, arg2);
        } else {
            this.method1691(arg0, arg5, arg9, arg7, arg8, arg2, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[II[ZZLci;IIILci;ZLsn;)V", line = 125)
    private final void method1674(int arg0, int[] arg1, int arg2, boolean[] arg3, boolean arg4, class218 arg5, int arg6, int arg7, int arg8, class218 arg9, boolean arg10, class328 arg11) {
        if (arg8 > -107) {
            method1684(-84, 110, (class341) null);
        }
        field3763++;
        if (arg5 == null || arg0 == 0) {
            for (int var37 = 0; var37 < arg9.field3046; var37++) {
                short var38 = arg9.field3042[var37];
                if (arg3 == null || arg3[var38] == arg10 || arg11.field4838[var38] == 0) {
                    short var39 = arg9.field3038[var37];
                    if (var39 != -1) {
                        this.method1667(0, 101, arg4, arg7, arg2 & arg11.field4836[var39], arg11.field4841[var39], arg1, 0, 0, 0);
                    }
                    this.method1667(arg11.field4838[var38], 99, arg4, arg7, arg2 & arg11.field4836[var38], arg11.field4841[var38], arg1, arg9.field3044[var37], arg9.field3045[var37], arg9.field3050[var37]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg11.field4844; var15++) {
            boolean var16 = false;
            if (var13 < arg9.field3046 && arg9.field3042[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg5.field3046 && arg5.field3042[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg3 == null || arg10 == arg3[var15] || arg11.field4838[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg11.field4838[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg9.field3045[var13];
                        var21 = arg9.field3038[var13];
                        var22 = arg9.field3036[var13];
                        var23 = arg9.field3044[var13];
                        var24 = arg9.field3050[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = -1;
                        var22 = 0;
                        var23 = var18;
                        var24 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg5.field3050[var14];
                        var26 = arg5.field3036[var14];
                        var27 = arg5.field3038[var14];
                        var28 = arg5.field3045[var14];
                        var29 = arg5.field3044[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var29 = var18;
                        var28 = var18;
                        var27 = -1;
                        var26 = 0;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var34 = var24;
                        var35 = var20;
                        var33 = var23;
                    } else if (var19 == 2) {
                        int var30 = var25 - var24 & 0x3FFF;
                        int var31 = var29 - var23 & 0x3FFF;
                        int var32 = var28 - var20 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg0 * var31 / arg6 + var23 & 0x3FFF;
                        var34 = arg0 * var30 / arg6 + var24 & 0x3FFF;
                        var35 = arg0 * var32 / arg6 + var20 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var25 - var24 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = var24 + (arg0 * var36 / arg6) & 0x3F;
                        var35 = (var28 - var20) * arg0 / arg6 + var20;
                        var33 = (var29 - var23) * arg0 / arg6 + var23;
                    } else {
                        var34 = var24 + ((var25 - var24) * arg0 / arg6);
                        var35 = (var28 - var20) * arg0 / arg6 + var20;
                        var33 = (var29 - var23) * arg0 / arg6 + var23;
                    }
                    if (var21 != -1) {
                        this.method1667(0, 95, arg4, arg7, arg2 & arg11.field4836[var21], arg11.field4841[var21], arg1, 0, 0, 0);
                    } else if (var27 != -1) {
                        this.method1667(0, 83, arg4, arg7, arg11.field4836[var27] & arg2, arg11.field4841[var27], arg1, 0, 0, 0);
                    }
                    this.method1667(var19, 99, arg4, arg7, arg2 & arg11.field4836[var15], arg11.field4841[var15], arg1, var33, var35, var34);
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILul;ZILul;I)V", line = 330)
    public final void method1678(int arg0, int arg1, int arg2, int arg3, class255 arg4, boolean arg5, int arg6, class255 arg7, int arg8) {
        field3766++;
        if (arg1 == -1 || !this.method1670()) {
            return;
        }
        class218 var10 = arg7.field3717[arg1];
        class328 var11 = var10.field3047;
        class218 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field3717[arg6];
            if (var12.field3047 != var11) {
                var12 = null;
            }
        }
        this.method1674(arg2, (int[]) null, arg0, (boolean[]) null, arg5, var12, arg8, arg3, -128, var10, false, var11);
        this.method1681();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILda;IIIII)V", line = 366)
    public final void method1682(int arg0, class193 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3764++;
        boolean var8 = false;
        boolean var9 = false;
        int var11 = -arg0 / 2;
        int var12 = -arg2 / 2;
        int var13 = arg1.method725(arg5 + var11, arg3 + var12);
        int var14 = arg0 / 2;
        int var15 = -arg2 / 2;
        int var16 = arg1.method725(arg5 + var14, arg3 - -var15);
        int var17 = -arg0 / 2;
        int var18 = arg2 / 2;
        int var19 = arg1.method725(arg5 + var17, arg3 + var18);
        int var20 = arg0 / 2;
        int var21 = arg2 / 2;
        int var22 = arg1.method725(arg5 + var20, arg3 + var21);
        int var23 = var13 >= var16 ? var16 : var13;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var22 <= var16 ? var22 : var16;
        if (arg2 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method1687(var26);
            }
        }
        int var27 = var13 < var19 ? var13 : var19;
        if (arg0 != 0) {
            int var28 = (int) (Math.atan2((double) (var27 - var25), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                this.method1693(var28);
            }
        }
        int var29 = var13 + var22;
        if (var29 > var16 + var19) {
            var29 = var16 + var19;
        }
        int var30 = (var29 >> 1) - arg4;
        if (var30 != 0) {
            this.method1659(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILfb;)Ljava/lang/String;", line = 446)
    public static final String method1684(int arg0, int arg1, class341 arg2) {
        field3774++;
        try {
            int var3 = arg2.method2223(-1);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field5049 += class322.field4801.method2127(arg2.field5042, var4, -1, arg2.field5049, var3, arg0);
            return class338.method2200(true, 0, var4, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILul;)V", line = 493)
    public final void method1695(int arg0, int arg1, class255 arg2) {
        field3772++;
        if (arg1 == -1 || !this.method1670()) {
            return;
        }
        class218 var4 = arg2.field3717[arg1];
        class328 var5 = var4.field3047;
        for (int var6 = 0; var6 < var4.field3046; var6++) {
            short var7 = var4.field3042[var6];
            if (var5.field4835[var7]) {
                if (var4.field3038[var6] != -1) {
                    this.method1683(0, 0, 0, 0);
                }
                this.method1683(var5.field4838[var7], var4.field3050[var6], var4.field3044[var6], var4.field3045[var6]);
            }
        }
        if (arg0 != -17559) {
            this.method1696(-5, 38, false, 107, 98, true, (class255) null, (int[]) null, 18, 88, (class255) null);
        }
        this.method1681();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZIIZLul;[IIILul;)V", line = 536)
    public final void method1696(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, class255 arg6, int[] arg7, int arg8, int arg9, class255 arg10) {
        field3767++;
        if (arg4 == -1) {
            return;
        }
        if (!arg5) {
            this.method1700();
        }
        if (!this.method1670()) {
            return;
        }
        class218 var12 = arg6.field3717[arg4];
        class328 var13 = var12.field3047;
        class218 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field3717[arg3];
            if (var14.field3047 != var13) {
                var14 = null;
            }
        }
        this.method1674(arg9, arg7, arg0, (boolean[]) null, arg2, var14, arg8, arg1, -125, var12, false, var13);
        this.method1681();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[ZLul;BILul;IILul;IIIZLul;I)V", line = 569)
    public final void method1697(int arg0, boolean[] arg1, class255 arg2, byte arg3, int arg4, class255 arg5, int arg6, int arg7, class255 arg8, int arg9, int arg10, int arg11, boolean arg12, class255 arg13, int arg14) {
        field3769++;
        if (arg6 == -1) {
            return;
        }
        if (arg1 == null || arg9 == -1) {
            this.method1678(65535, arg6, arg7, 0, arg8, arg12, arg14, arg2, arg10);
        } else if (this.method1670()) {
            class218 var16 = arg2.field3717[arg6];
            class328 var17 = var16.field3047;
            class218 var18 = null;
            if (arg8 != null) {
                var18 = arg8.field3717[arg14];
                if (var18.field3047 != var17) {
                    var18 = null;
                }
            }
            if (arg3 == -40) {
                class218 var19 = arg13.field3717[arg9];
                class218 var20 = null;
                if (arg5 != null) {
                    var20 = arg5.field3717[arg11];
                    if (var20.field3047 != var17) {
                        var20 = null;
                    }
                }
                this.method1674(arg7, (int[]) null, 65535, arg1, arg12, var18, arg10, 0, arg3 - 74, var16, false, var17);
                this.method1666(0, new int[0], 0, 0, 0, 0, arg12);
                this.method1674(arg4, (int[]) null, 65535, arg1, arg12, var20, arg0, 0, arg3 ^ 0x4A, var19, true, var17);
                this.method1681();
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V", line = 635)
    public static void method1702(int arg0) {
        field3773 = null;
        field3768 = null;
        field3765 = null;
        if (arg0 != 12149) {
            field3768 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()[Ljq;")
    public abstract class230[] method1656();

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
    public abstract void method1657();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public abstract void method1658(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
    public abstract void method1659(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILda;Lda;III)V")
    public abstract void method1660(int arg0, int arg1, class193 arg2, class193 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lug;Laj;I)V")
    public abstract void method1661(class118 arg0, class137 arg1, int arg2);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public abstract void method1662(int arg0);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lc;)Lc;")
    public abstract class308 method1663(class308 arg0);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public abstract void method1664(int arg0);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(SS)V")
    public abstract void method1665(short arg0, short arg1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1666(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lqb;IIIZ)V")
    public abstract void method1668(class257 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
    public abstract int method1669();

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()Z")
    public abstract boolean method1670();

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()I")
    public abstract int method1671();

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "()I")
    public abstract int method1672();

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public abstract void method1673(int arg0);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "()I")
    public abstract int method1675();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIZ)Lqb;")
    public abstract class257 method1676(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public abstract void method1677(int arg0);

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "()I")
    public abstract int method1679();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lug;Laj;II)V")
    public abstract void method1680(class118 arg0, class137 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "()V")
    public abstract void method1681();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    public abstract void method1683(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "()I")
    public abstract int method1685();

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "()V")
    public abstract void method1686();

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    public abstract void method1687(int arg0);

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "()I")
    public abstract int method1688();

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(SS)V")
    public abstract void method1689(short arg0, short arg1);

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "()I")
    public abstract int method1690();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1691(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public abstract void method1692(int arg0);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
    public abstract void method1693(int arg0);

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "()[Lti;")
    public abstract class1[] method1694();

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILug;Z)Z")
    public abstract boolean method1698(int arg0, int arg1, class118 arg2, boolean arg3);

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "()Z")
    public abstract boolean method1699();

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "()I")
    public abstract int method1700();

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "()I")
    public abstract int method1701();
}
