import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class107 extends Canvas {

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field1903;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1897 = 50;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
    public static int[] field1899 = new int[field1897];

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lke;")
    public static class256 field1908 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    public static int[] field1904 = new int[field1897];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1898 = 2;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Z")
    public static boolean field1915 = true;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[I")
    public static int[] field1912 = new int[field1897];

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[I")
    public static int[] field1917 = new int[field1897];

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[I")
    public static int[] field1911 = new int[field1897];

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    public static int[] field1902 = new int[field1897];

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[I")
    public static int[] field1913 = new int[field1897];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[Lke;")
    public static class256[] field1901 = new class256[field1897];

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIILmc;JZ)V", line = 7)
    public static final void method753(int arg0, int arg1, int arg2, int arg3, class51 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class223 var8 = new class223();
        var8.field3905 = arg4;
        var8.field3904 = arg1 * 128 + 64;
        var8.field3901 = arg2 * 128 + 64;
        var8.field3900 = arg3;
        var8.field3902 = arg5;
        var8.field3903 = arg6;
        if (class41.field790[arg0][arg1][arg2] == null) {
            class41.field790[arg0][arg1][arg2] = new class271(arg0, arg1, arg2);
        }
        class41.field790[arg0][arg1][arg2].field4628 = var8;
    }

    @OriginalMember(owner = "client!mb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 41)
    public final void update(Graphics arg0) {
        this.field1903.update(arg0);
        field1914++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z[F)[F", line = 53)
    public static final float[] method754(boolean arg0, float[] arg1) {
        field1916++;
        if (arg1 == null) {
            return null;
        }
        float[] var2 = new float[arg1.length];
        if (arg0) {
            class299.method2095(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (float[]) null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 79)
    public static final void method755(byte arg0) {
        if (arg0 > -122) {
            return;
        }
        for (int var1 = 0; var1 < class209.field3774; var1++) {
            class94 var2 = class223.method1533(var1, 0);
            if (var2 != null && var2.field1685 == 0) {
                class201.field3658[var1] = 0;
                class97.field1741[var1] = 0;
            }
        }
        class172.field3052 = new class254(16);
        field1900++;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V", line = 128)
    public static void method756(byte arg0) {
        field1912 = null;
        field1908 = null;
        field1902 = null;
        if (arg0 < 15) {
            return;
        }
        field1913 = null;
        field1899 = null;
        field1901 = null;
        field1917 = null;
        field1904 = null;
        field1911 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 146)
    public static final void method757(byte arg0, int arg1) {
        field1910++;
        class17.field244--;
        if (class17.field244 == arg1) {
            return;
        }
        class299.method2093(class261.field4510, arg1 + 1, class261.field4510, arg1, class17.field244 - arg1);
        class299.method2093(class130.field2271, arg1 + 1, class130.field2271, arg1, class17.field244 - arg1);
        class299.method2090(class310.field5352, arg1 + 1, class310.field5352, arg1, class17.field244 - arg1);
        class299.method2091(class303.field5243, arg1 + 1, class303.field5243, arg1, class17.field244 - arg1);
        class299.method2094(class159.field2842, arg1 + 1, class159.field2842, arg1, class17.field244 - arg1);
        int var2 = -12 % ((71 - arg0) / 38);
        class299.method2090(class285.field4948, arg1 + 1, class285.field4948, arg1, class17.field244 - arg1);
        class299.method2090(class189.field3470, arg1 + 1, class189.field3470, arg1, class17.field244 - arg1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZIIII)V", line = 175)
    public static final void method758(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 3) {
            return;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        field1905++;
        if (class253.field4323) {
            int var6 = arg3 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = class200.field3643 + ((class161.field2862 - class200.field3643) * var6 / 100);
            if (class154.field2758 > var7) {
                var7 = class154.field2758;
            } else if (var7 > class297.field5150) {
                var7 = class297.field5150;
            }
            int var8 = arg3 * var7 * 512 / (arg4 * 334);
            if (class248.field4228 > var8) {
                short var9 = class248.field4228;
                var7 = arg4 * var9 * 334 / (arg3 * 512);
                if (class297.field5150 < var7) {
                    var7 = class297.field5150;
                    int var10 = arg3 * 512 * var7 / (var9 * 334);
                    int var11 = (arg4 - var10) / 2;
                    if (arg1) {
                        class60.method479();
                        class60.method482(arg5, arg0, var11, arg3, 0);
                        class60.method482(arg5 - (var11 - arg4), arg0, var11, arg3, 0);
                    }
                    arg5 += var11;
                    arg4 -= var11 * 2;
                }
            } else if (var8 > class250.field4253) {
                short var12 = class250.field4253;
                var7 = var12 * 334 * arg4 / (arg3 * 512);
                if (var7 < class154.field2758) {
                    var7 = class154.field2758;
                    int var13 = arg4 * 334 * var12 / (var7 * 512);
                    int var14 = (arg3 - var13) / 2;
                    if (arg1) {
                        class60.method479();
                        class60.method482(arg5, arg0, arg4, var14, 0);
                        class60.method482(arg5, arg0 + arg3 - var14, arg4, var14, 0);
                    }
                    arg0 += var14;
                    arg3 -= var14 * 2;
                }
            }
            class173.field3077 = arg3 * var7 / 334;
        }
        class249.field4236 = arg5;
        class197.field3606 = (short) arg3;
        class68.field1262 = (short) arg4;
        class310.field5340 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 273)
    public class107(Component arg0) {
        this.field1903 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 282)
    public final void paint(Graphics arg0) {
        this.field1903.paint(arg0);
        field1918++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[IIIIIIIIZI)V", line = 291)
    public static final void method759(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        int var11 = arg6;
        field1909++;
        if (class178.field3147 <= arg6) {
            return;
        }
        int var12 = arg6 + arg7;
        if (class178.field3141 > arg6) {
            var11 = class178.field3141;
        }
        if (var12 <= class178.field3141) {
            return;
        }
        if (class178.field3147 < var12) {
            var12 = class178.field3147;
        }
        int var13 = arg8;
        if (arg8 >= class178.field3143) {
            return;
        }
        if (class178.field3142 > arg8) {
            var13 = class178.field3142;
        }
        int var14 = arg2 + arg8;
        if (var14 <= class178.field3142) {
            return;
        }
        if (arg0 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg0 = 1;
        }
        if (class178.field3143 < var14) {
            var14 = class178.field3143;
        }
        if (arg0 == 10) {
            arg0 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        int var15 = var14 - arg8;
        if (arg0 == 11) {
            arg0 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        int var16 = class178.field3140 + var11 - var12;
        int var17 = var12 - arg6;
        if (arg4 != -1) {
            field1915 = false;
        }
        int var18 = arg7 - var17;
        int var19 = arg2 - var15;
        int var20 = class178.field3140 * var13 + var11;
        int var21 = var11 - arg6;
        int var22 = arg7 - var21;
        int var23 = var13 - arg8;
        int var24 = arg2 - var23;
        if (arg0 == 1) {
            if (arg3 == 0) {
                for (int var81 = var23; var81 < var15; var81++) {
                    for (int var82 = var21; var82 < var17; var82++) {
                        if (var81 >= var82) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 1) {
                for (int var87 = var24 - 1; var87 >= var19; var87--) {
                    for (int var88 = var21; var88 < var17; var88++) {
                        if (var88 <= var87) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 2) {
                for (int var83 = var23; var83 < var15; var83++) {
                    for (int var84 = var21; var84 < var17; var84++) {
                        if (var84 >= var83) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 3) {
                for (int var85 = var24 - 1; var85 >= var19; var85--) {
                    for (int var86 = var21; var86 < var17; var86++) {
                        if (var86 >= var85) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg0 == 2) {
            if (arg3 == 0) {
                for (int var31 = var24 - 1; var31 >= var19; var31--) {
                    for (int var32 = var21; var32 < var17; var32++) {
                        if (var31 >> 1 >= var32) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 1) {
                for (int var25 = var23; var25 < var15; var25++) {
                    for (int var26 = var21; var26 < var17; var26++) {
                        if (var20 >= 0 && arg1.length > var20) {
                            if (var26 >= var25 << 1) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        } else {
                            var20++;
                        }
                    }
                    var20 += var16;
                }
            } else if (arg3 == 2) {
                for (int var29 = var23; var29 < var15; var29++) {
                    for (int var30 = var22 - 1; var30 >= var18; var30--) {
                        if (var30 <= var29 >> 1) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 3) {
                for (int var27 = var24 - 1; var27 >= var19; var27--) {
                    for (int var28 = var22 - 1; var28 >= var18; var28--) {
                        if (var28 >= (var27 << 1)) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg0 == 3) {
            if (arg3 == 0) {
                for (int var39 = var24 - 1; var39 >= var19; var39--) {
                    for (int var40 = var22 - 1; var40 >= var18; var40--) {
                        if (var40 <= (var39 >> 1)) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 1) {
                for (int var33 = var24 - 1; var33 >= var19; var33--) {
                    for (int var34 = var21; var34 < var17; var34++) {
                        if (var34 >= var33 << 1) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 2) {
                for (int var35 = var23; var35 < var15; var35++) {
                    for (int var36 = var21; var36 < var17; var36++) {
                        if (var35 >> 1 >= var36) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 3) {
                for (int var37 = var23; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var18; var38--) {
                        if (var38 >= (var37 << 1)) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg0 == 4) {
            if (arg3 == 0) {
                for (int var47 = var24 - 1; var47 >= var19; var47--) {
                    for (int var48 = var21; var48 < var17; var48++) {
                        if (var48 >= (var47 >> 1)) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 1) {
                for (int var45 = var23; var45 < var15; var45++) {
                    for (int var46 = var21; var46 < var17; var46++) {
                        if (var46 <= var45 << 1) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 2) {
                for (int var43 = var23; var43 < var15; var43++) {
                    for (int var44 = var22 - 1; var44 >= var18; var44--) {
                        if (var44 >= (var43 >> 1)) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            } else if (arg3 == 3) {
                for (int var41 = var24 - 1; var41 >= var19; var41--) {
                    for (int var42 = var22 - 1; var42 >= var18; var42--) {
                        if (var42 <= (var41 << 1)) {
                            arg1[var20] = arg10;
                        } else if (arg9) {
                            arg1[var20] = arg5;
                        }
                        var20++;
                    }
                    var20 += var16;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg3 == 0) {
                    for (int var49 = var23; var49 < var15; var49++) {
                        for (int var50 = var21; var50 < var17; var50++) {
                            if ((arg7 / 2) >= var50) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var51 = var23; var51 < var15; var51++) {
                        for (int var52 = var21; var52 < var17; var52++) {
                            if (var51 <= (arg2 / 2)) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var55 = var23; var55 < var15; var55++) {
                        for (int var56 = var21; var56 < var17; var56++) {
                            if (arg7 / 2 <= var56) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var53 = var23; var53 < var15; var53++) {
                        for (int var54 = var21; var54 < var17; var54++) {
                            if ((arg2 / 2) <= var53) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg3 == 0) {
                    for (int var71 = var23; var71 < var15; var71++) {
                        for (int var72 = var21; var72 < var17; var72++) {
                            if (var72 <= (var71 - (arg2 / 2))) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var69 = var24 - 1; var69 >= var19; var69--) {
                        for (int var70 = var21; var70 < var17; var70++) {
                            if (var70 <= var69 - (arg2 / 2)) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var67 = var24 - 1; var67 >= var19; var67--) {
                        for (int var68 = var22 - 1; var68 >= var18; var68--) {
                            if ((var67 - (arg2 / 2)) >= var68) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var65 = var23; var65 < var15; var65++) {
                        for (int var66 = var22 - 1; var66 >= var18; var66--) {
                            if (var66 <= (var65 - arg2 / 2)) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg3 == 0) {
                    for (int var57 = var23; var57 < var15; var57++) {
                        for (int var58 = var21; var58 < var17; var58++) {
                            if (var58 >= var57 - (arg2 / 2)) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var63 = var24 - 1; var63 >= var19; var63--) {
                        for (int var64 = var21; var64 < var17; var64++) {
                            if (var64 >= var63 - (arg2 / 2)) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var61 = var24 - 1; var61 >= var19; var61--) {
                        for (int var62 = var22 - 1; var62 >= var18; var62--) {
                            if ((var61 - (arg2 / 2)) <= var62) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var59 = var23; var59 < var15; var59++) {
                        for (int var60 = var22 - 1; var60 >= var18; var60--) {
                            if (var60 >= (var59 - (arg2 / 2))) {
                                arg1[var20] = arg10;
                            } else if (arg9) {
                                arg1[var20] = arg5;
                            }
                            var20++;
                        }
                        var20 += var16;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var79 = var24 - 1; var79 >= var19; var79--) {
                for (int var80 = var22 - 1; var80 >= var18; var80--) {
                    if (var80 >= (var79 >> 1)) {
                        arg1[var20] = arg10;
                    } else if (arg9) {
                        arg1[var20] = arg5;
                    }
                    var20++;
                }
                var20 += var16;
            }
        } else if (arg3 == 1) {
            for (int var73 = var24 - 1; var73 >= var19; var73--) {
                for (int var74 = var21; var74 < var17; var74++) {
                    if (var74 <= var73 << 1) {
                        arg1[var20] = arg10;
                    } else if (arg9) {
                        arg1[var20] = arg5;
                    }
                    var20++;
                }
                var20 += var16;
            }
        } else if (arg3 == 2) {
            for (int var77 = var23; var77 < var15; var77++) {
                for (int var78 = var21; var78 < var17; var78++) {
                    if (var77 >> 1 <= var78) {
                        arg1[var20] = arg10;
                    } else if (arg9) {
                        arg1[var20] = arg5;
                    }
                    var20++;
                }
                var20 += var16;
            }
        } else if (arg3 == 3) {
            for (int var75 = var23; var75 < var15; var75++) {
                for (int var76 = var22 - 1; var76 >= var18; var76--) {
                    if (var75 << 1 >= var76) {
                        arg1[var20] = arg10;
                    } else if (arg9) {
                        arg1[var20] = arg5;
                    }
                    var20++;
                }
                var20 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([[B[[I[[F[[BI[[F[[II[[F[[[B[[B[[B)[Lgf;", line = 1476)
    public static final class113[] method760(byte[][] arg0, int[][] arg1, float[][] arg2, byte[][] arg3, int arg4, float[][] arg5, int[][] arg6, int arg7, float[][] arg8, byte[][][] arg9, byte[][] arg10, byte[][] arg11) {
        field1906++;
        class254 var12 = new class254(128);
        if (arg7 != 27564) {
            method760((byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), -108, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), 65, (float[][]) ((float[][]) null), (byte[][][]) ((byte[][][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null));
        }
        for (int var13 = 1; var13 <= 102; var13++) {
            for (int var14 = 1; var14 <= 102; var14++) {
                int var15 = arg3[var13][var14] & 0xFF;
                int var16 = arg11[var13][var14] & 0xFF;
                if (var16 != 0) {
                    class192 var17 = class252.method1695(var16 - 1, -31903);
                    if (var17.field3506 == -1) {
                        continue;
                    }
                    class113 var18 = class8.method56(var12, var17, (byte) 97);
                    byte var19 = arg10[var13][var14];
                    int[] var20 = class145.field2567[var19];
                    var18.field1996 += var20.length / 2;
                    var18.field1997++;
                    if (var17.field3521 && var15 != 0) {
                        var18.field1996 += class48.field861[var19];
                    }
                }
                if ((arg3[var13][var14] & 0xFF) != 0 || var16 != 0 && arg10[var13][var14] == 0) {
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = new int[8];
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = arg11[var13 - 1][var14] & 0xFF;
                    int var28 = arg11[var13][var14 - 1] & 0xFF;
                    int var29 = arg11[var13][var14 + 1] & 0xFF;
                    int var30 = arg11[var13 + 1][var14] & 0xFF;
                    int var31 = arg11[var13 - 1][var14 + 1] & 0xFF;
                    int var32 = arg11[var13 + 1][var14 - 1] & 0xFF;
                    int var33 = arg11[var13 - 1][var14 - 1] & 0xFF;
                    int var34 = arg11[var13 + 1][var14 + 1] & 0xFF;
                    if (var31 == 0 || var16 == var31) {
                        boolean var43 = false;
                    } else {
                        class192 var35 = class252.method1695(var31 - 1, -31903);
                        if (var35.field3521 && var35.field3506 != -1) {
                            byte var36 = arg0[var13 - 1][var14 + 1];
                            byte var37 = arg10[var13 - 1][var14 + 1];
                            int var38 = class243.field4139[(var36 + 2 & 0x3) + var37 * 4];
                            int var39 = class243.field4139[(var36 + 3 & 0x3) + var37 * 4];
                            if (class152.field2725[var39][1] && class152.field2725[var38][0]) {
                                boolean var40 = false;
                            } else {
                                for (int var41 = 0; var41 < 8; var41++) {
                                    if (var21 == var41) {
                                        var23[var21++] = var31;
                                        break;
                                    }
                                    if (var23[var41] == var31) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var42 = false;
                        }
                    }
                    if (var33 == 0 || var16 == var33) {
                        boolean var52 = false;
                    } else {
                        class192 var44 = class252.method1695(var33 - 1, -31903);
                        if (var44.field3521 && var44.field3506 != -1) {
                            byte var45 = arg0[var13 - 1][var14 - 1];
                            byte var46 = arg10[var13 - 1][var14 - 1];
                            int var47 = class243.field4139[(var45 & 0x3) + var46 * 4];
                            int var48 = class243.field4139[var46 * 4 + (var45 + 3 & 0x3)];
                            if (class152.field2725[var47][1] && class152.field2725[var48][0]) {
                                boolean var49 = false;
                            } else {
                                for (int var50 = 0; var50 < 8; var50++) {
                                    if (var21 == var50) {
                                        var23[var21++] = var33;
                                        break;
                                    }
                                    if (var23[var50] == var33) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var51 = false;
                        }
                    }
                    if (var32 == 0 || var16 == var32) {
                        boolean var61 = false;
                    } else {
                        class192 var53 = class252.method1695(var32 - 1, -31903);
                        if (var53.field3521 && var53.field3506 != -1) {
                            byte var54 = arg0[var13 + 1][var14 - 1];
                            byte var55 = arg10[var13 + 1][var14 - 1];
                            int var56 = class243.field4139[(var54 & 0x3) + var55 * 4];
                            int var57 = class243.field4139[(var54 + 1 & 0x3) + var55 * 4];
                            if (class152.field2725[var57][1] && class152.field2725[var56][0]) {
                                boolean var58 = false;
                            } else {
                                for (int var59 = 0; var59 < 8; var59++) {
                                    if (var21 == var59) {
                                        var23[var21++] = var32;
                                        break;
                                    }
                                    if (var23[var59] == var32) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var60 = false;
                        }
                    }
                    if (var34 == 0 || var16 == var34) {
                        boolean var70 = false;
                    } else {
                        class192 var62 = class252.method1695(var34 - 1, arg7 + -59467);
                        if (var62.field3521 && var62.field3506 != -1) {
                            byte var63 = arg10[var13 + 1][var14 + 1];
                            byte var64 = arg0[var13 + 1][var14 + 1];
                            int var65 = class243.field4139[var63 * 4 + (var64 + 2 & 0x3)];
                            int var66 = class243.field4139[(var64 + 1 & 0x3) + var63 * 4];
                            if (class152.field2725[var65][1] && class152.field2725[var66][0]) {
                                boolean var67 = false;
                            } else {
                                for (int var68 = 0; var68 < 8; var68++) {
                                    if (var21 == var68) {
                                        var23[var21++] = var34;
                                        break;
                                    }
                                    if (var23[var68] == var34) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            boolean var69 = false;
                        }
                    }
                    if (var29 != 0 && var16 != var29) {
                        class192 var71 = class252.method1695(var29 - 1, -31903);
                        if (var71.field3521 && var71.field3506 != -1) {
                            var24 = class243.field4139[(arg0[var13][var14 + 1] + 2 & 0x3) + arg10[var13][var14 + 1] * 4];
                            for (int var72 = 0; var72 < 8; var72++) {
                                if (var21 == var72) {
                                    var23[var21++] = var29;
                                    break;
                                }
                                if (var23[var72] == var29) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var27 != 0 && var16 != var27) {
                        class192 var73 = class252.method1695(var27 - 1, arg7 + -59467);
                        if (var73.field3521 && var73.field3506 != -1) {
                            var22 = class243.field4139[(arg0[var13 - 1][var14] + 3 & 0x3) + arg10[var13 - 1][var14] * 4];
                            for (int var74 = 0; var74 < 8; var74++) {
                                if (var21 == var74) {
                                    var23[var21++] = var27;
                                    break;
                                }
                                if (var23[var74] == var27) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var28 != 0 && var16 != var28) {
                        class192 var75 = class252.method1695(var28 - 1, -31903);
                        if (var75.field3521 && var75.field3506 != -1) {
                            var25 = class243.field4139[(arg0[var13][var14 - 1] & 0x3) + arg10[var13][var14 - 1] * 4];
                            for (int var76 = 0; var76 < 8; var76++) {
                                if (var21 == var76) {
                                    var23[var21++] = var28;
                                    break;
                                }
                                if (var23[var76] == var28) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var30 != 0 && var16 != var30) {
                        class192 var77 = class252.method1695(var30 - 1, -31903);
                        if (var77.field3521 && var77.field3506 != -1) {
                            var26 = class243.field4139[(arg0[var13 + 1][var14] + 1 & 0x3) + arg10[var13 + 1][var14] * 4];
                            for (int var78 = 0; var78 < 8; var78++) {
                                if (var21 == var78) {
                                    var23[var21++] = var30;
                                    break;
                                }
                                if (var23[var78] == var30) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var79 = 0; var79 < var21; var79++) {
                        int var80 = var23[var79];
                        boolean[] var81 = class152.field2725[var29 == var80 ? var24 : 0];
                        boolean[] var82 = class152.field2725[var27 == var80 ? var22 : 0];
                        boolean[] var83 = class152.field2725[var28 == var80 ? var25 : 0];
                        boolean[] var84 = class152.field2725[var30 == var80 ? var26 : 0];
                        class192 var85 = class252.method1695(var80 - 1, -31903);
                        class113 var86 = class8.method56(var12, var85, (byte) 121);
                        var86.field1996 += 5;
                        var86.field1996 += var81.length - 2;
                        var86.field1996 += var82.length - 2;
                        var86.field1996 += var83.length - 2;
                        var86.field1996 += var84.length - 2;
                        var86.field1997++;
                    }
                }
            }
        }
        for (class113 var87 = (class113) var12.method1743(true); var87 != null; var87 = (class113) var12.method1742((byte) 84)) {
            var87.method781();
        }
        for (int var88 = 1; var88 <= 102; var88++) {
            for (int var89 = 1; var89 <= 102; var89++) {
                int var90 = arg3[var88][var89] & 0xFF;
                int var91;
                if ((arg9[arg4][var88][var89] & 0x8) != 0) {
                    var91 = 0;
                } else if ((arg9[1][var88][var89] & 0x2) == 2 && arg4 > 0) {
                    var91 = arg4 - 1;
                } else {
                    var91 = arg4;
                }
                int var92 = arg11[var88][var89] & 0xFF;
                if (var92 != 0) {
                    class192 var93 = class252.method1695(var92 - 1, arg7 + -59467);
                    if (var93.field3506 == -1) {
                        continue;
                    }
                    class113 var94 = class8.method56(var12, var93, (byte) 113);
                    byte var95 = arg10[var88][var89];
                    byte var96 = arg0[var88][var89];
                    int var97 = class183.method1341((byte) 83, arg6[var88][var89], var93.field3506, var93.field3522);
                    int var98 = class183.method1341((byte) 83, arg6[var88 + 1][var89], var93.field3506, var93.field3522);
                    int var99 = class183.method1341((byte) 83, arg6[var88 + 1][var89 + 1], var93.field3506, var93.field3522);
                    int var100 = class183.method1341((byte) 83, arg6[var88][var89 + 1], var93.field3506, var93.field3522);
                    class205.method1453(var100, var97, var99, arg8, var98, var89, arg2, var88, arg1, (byte) 89, var91, arg5, var95, var96, var94, var90 != 0 && var93.field3521);
                }
                if ((arg3[var88][var89] & 0xFF) != 0 || var92 != 0 && arg10[var88][var89] == 0) {
                    int var101 = 0;
                    int[] var102 = new int[8];
                    int var103 = 0;
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = arg11[var88][var89 + 1] & 0xFF;
                    int var108 = arg11[var88][var89 - 1] & 0xFF;
                    int var109 = arg11[var88 - 1][var89] & 0xFF;
                    int var110 = arg11[var88 - 1][var89 + 1] & 0xFF;
                    int var111 = arg11[var88 + 1][var89] & 0xFF;
                    int var112 = arg11[var88 - 1][var89 - 1] & 0xFF;
                    int var113 = arg11[var88 + 1][var89 + 1] & 0xFF;
                    int var114 = arg11[var88 + 1][var89 - 1] & 0xFF;
                    if (var110 == 0 || var92 == var110) {
                        var110 = 0;
                    } else {
                        class192 var115 = class252.method1695(var110 - 1, -31903);
                        if (var115.field3521 && var115.field3506 != -1) {
                            byte var116 = arg0[var88 - 1][var89 + 1];
                            byte var117 = arg10[var88 - 1][var89 + 1];
                            int var118 = class243.field4139[(var116 + 2 & 0x3) + var117 * 4];
                            int var119 = class243.field4139[(var116 + 3 & 0x3) + var117 * 4];
                            if (class152.field2725[var119][1] && class152.field2725[var118][0]) {
                                var110 = 0;
                            } else {
                                for (int var120 = 0; var120 < 8; var120++) {
                                    if (var101 == var120) {
                                        var102[var101++] = var110;
                                        break;
                                    }
                                    if (var102[var120] == var110) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var110 = 0;
                        }
                    }
                    if (var112 == 0 || var92 == var112) {
                        var112 = 0;
                    } else {
                        class192 var121 = class252.method1695(var112 - 1, -31903);
                        if (var121.field3521 && var121.field3506 != -1) {
                            byte var122 = arg10[var88 - 1][var89 - 1];
                            byte var123 = arg0[var88 - 1][var89 - 1];
                            int var124 = class243.field4139[(var123 & 0x3) + var122 * 4];
                            int var125 = class243.field4139[(var123 + 3 & 0x3) + var122 * 4];
                            if (class152.field2725[var124][1] && class152.field2725[var125][0]) {
                                var112 = 0;
                            } else {
                                for (int var126 = 0; var126 < 8; var126++) {
                                    if (var101 == var126) {
                                        var102[var101++] = var112;
                                        break;
                                    }
                                    if (var102[var126] == var112) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var112 = 0;
                        }
                    }
                    if (var114 == 0 || var92 == var114) {
                        var114 = 0;
                    } else {
                        class192 var127 = class252.method1695(var114 - 1, -31903);
                        if (var127.field3521 && var127.field3506 != -1) {
                            byte var128 = arg0[var88 + 1][var89 - 1];
                            byte var129 = arg10[var88 + 1][var89 - 1];
                            int var130 = class243.field4139[var129 * 4 + (var128 + 1 & 0x3)];
                            int var131 = class243.field4139[(var128 & 0x3) + var129 * 4];
                            if (class152.field2725[var130][1] && class152.field2725[var131][0]) {
                                var114 = 0;
                            } else {
                                for (int var132 = 0; var132 < 8; var132++) {
                                    if (var101 == var132) {
                                        var102[var101++] = var114;
                                        break;
                                    }
                                    if (var102[var132] == var114) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var114 = 0;
                        }
                    }
                    if (var113 == 0 || var92 == var113) {
                        var113 = 0;
                    } else {
                        class192 var133 = class252.method1695(var113 - 1, -31903);
                        if (var133.field3521 && var133.field3506 != -1) {
                            byte var134 = arg0[var88 + 1][var89 + 1];
                            byte var135 = arg10[var88 + 1][var89 + 1];
                            int var136 = class243.field4139[(var134 + 2 & 0x3) + var135 * 4];
                            int var137 = class243.field4139[(var134 + 1 & 0x3) + var135 * 4];
                            if (class152.field2725[var136][1] && class152.field2725[var137][0]) {
                                var113 = 0;
                            } else {
                                for (int var138 = 0; var138 < 8; var138++) {
                                    if (var101 == var138) {
                                        var102[var101++] = var113;
                                        break;
                                    }
                                    if (var102[var138] == var113) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            var113 = 0;
                        }
                    }
                    if (var107 != 0 && var92 != var107) {
                        class192 var139 = class252.method1695(var107 - 1, -31903);
                        if (var139.field3521 && var139.field3506 != -1) {
                            var103 = class243.field4139[arg10[var88][var89 + 1] * 4 + (arg0[var88][var89 + 1] + 2 & 0x3)];
                            for (int var140 = 0; var140 < 8; var140++) {
                                if (var101 == var140) {
                                    var102[var101++] = var107;
                                    break;
                                }
                                if (var102[var140] == var107) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var109 != 0 && var92 != var109) {
                        class192 var141 = class252.method1695(var109 - 1, -31903);
                        if (var141.field3521 && var141.field3506 != -1) {
                            var104 = class243.field4139[arg10[var88 - 1][var89] * 4 + (arg0[var88 - 1][var89] + 3 & 0x3)];
                            for (int var142 = 0; var142 < 8; var142++) {
                                if (var101 == var142) {
                                    var102[var101++] = var109;
                                    break;
                                }
                                if (var102[var142] == var109) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var108 != 0 && var92 != var108) {
                        class192 var143 = class252.method1695(var108 - 1, -31903);
                        if (var143.field3521 && var143.field3506 != -1) {
                            var106 = class243.field4139[(arg0[var88][var89 - 1] & 0x3) + arg10[var88][var89 - 1] * 4];
                            for (int var144 = 0; var144 < 8; var144++) {
                                if (var101 == var144) {
                                    var102[var101++] = var108;
                                    break;
                                }
                                if (var102[var144] == var108) {
                                    break;
                                }
                            }
                        }
                    }
                    if (var111 != 0 && var92 != var111) {
                        class192 var145 = class252.method1695(var111 - 1, -31903);
                        if (var145.field3521 && var145.field3506 != -1) {
                            var105 = class243.field4139[(arg0[var88 + 1][var89] + 1 & 0x3) + arg10[var88 + 1][var89] * 4];
                            for (int var146 = 0; var146 < 8; var146++) {
                                if (var101 == var146) {
                                    var102[var101++] = var111;
                                    break;
                                }
                                if (var102[var146] == var111) {
                                    break;
                                }
                            }
                        }
                    }
                    for (int var147 = 0; var147 < var101; var147++) {
                        int var148 = var102[var147];
                        boolean[] var149 = class152.field2725[var107 == var148 ? var103 : 0];
                        boolean[] var150 = class152.field2725[var109 == var148 ? var104 : 0];
                        boolean[] var151 = class152.field2725[var108 == var148 ? var106 : 0];
                        boolean[] var152 = class152.field2725[var111 == var148 ? var105 : 0];
                        class192 var153 = class252.method1695(var148 - 1, arg7 ^ 0xFFFFE8CD);
                        class113 var154 = class8.method56(var12, var153, (byte) 118);
                        int var155 = class183.method1341((byte) 83, arg6[var88][var89], var153.field3506, var153.field3522) << 8 | 0xFF;
                        int var156 = class183.method1341((byte) 83, arg6[var88 + 1][var89], var153.field3506, var153.field3522) << 8 | 0xFF;
                        byte var157 = 6;
                        int var158 = class183.method1341((byte) 83, arg6[var88 + 1][var89 + 1], var153.field3506, var153.field3522) << 8 | 0xFF;
                        int var159 = class183.method1341((byte) 83, arg6[var88][var89 + 1], var153.field3506, var153.field3522) << 8 | 0xFF;
                        int var160 = var149.length + var157 - 2;
                        boolean var161 = var110 != var148 && var150[0] && var149[1];
                        int var162 = var150.length + var160 - 2;
                        boolean var163 = var113 != var148 && var149[0] && var152[1];
                        int var164 = var151.length + var162 - 2;
                        boolean var165 = var114 != var148 && var152[0] && var151[1];
                        int var166 = var152.length + var164 - 2;
                        boolean var167 = var112 != var148 && var151[0] && var150[1];
                        int[] var168 = new int[var166];
                        int var169 = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) -122, arg8, var155, true, (int[][]) null, var89, var154, var88, 64, 64, var156);
                        byte var170 = 0;
                        int var171 = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) 122, arg8, var155, var161, (int[][]) null, var89, var154, var88, 128, 0, var156);
                        int var172 = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) -123, arg8, var155, var163, (int[][]) null, var89, var154, var88, 128, 128, var156);
                        int var173 = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) 50, arg8, var155, var167, (int[][]) null, var89, var154, var88, 0, 0, var156);
                        int var174 = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) -119, arg8, var155, var165, (int[][]) null, var89, var154, var88, 0, 128, var156);
                        int var180 = var170 + 1;
                        var168[var170] = var169;
                        var168[var180++] = var172;
                        if (var149.length > 2) {
                            var168[var180++] = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) -124, arg8, var155, var149[2], (int[][]) null, var89, var154, var88, 128, 64, var156);
                        }
                        var168[var180++] = var171;
                        if (var150.length > 2) {
                            var168[var180++] = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) -116, arg8, var155, var150[2], (int[][]) null, var89, var154, var88, 64, 0, var156);
                        }
                        var168[var180++] = var173;
                        if (var151.length > 2) {
                            var168[var180++] = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) -127, arg8, var155, var151[2], (int[][]) null, var89, var154, var88, 0, 64, var156);
                        }
                        var168[var180++] = var174;
                        if (var152.length > 2) {
                            var168[var180++] = class284.method1987(0.0F, var159, arg1, var158, 0, arg2, arg5, (byte) 47, arg8, var155, var152[2], (int[][]) null, var89, var154, var88, 64, 128, var156);
                        }
                        var168[var180++] = var172;
                        var154.method777(var91, var88, var89, var168, (int[]) null, true);
                    }
                }
            }
        }
        for (class113 var175 = (class113) var12.method1743(true); var175 != null; var175 = (class113) var12.method1742((byte) 125)) {
            if (var175.field1981 == 0) {
                var175.method1199(21966);
            } else {
                var175.method776();
            }
        }
        int var176 = var12.method1745(arg7 - 27564);
        class113[] var177 = new class113[var176];
        var12.method1751(arg7 ^ 0x55553EF9, var177);
        long[] var178 = new long[var176];
        for (int var179 = 0; var179 < var176; var179++) {
            var178[var179] = var177[var179].field2895;
        }
        class90.method670(29252, var178, var177);
        return var177;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V", line = 2416)
    public static final void method761(byte arg0) {
        field1907++;
        int var1 = (class50.field926 >> 10) + (class134.field2336 >> 3);
        byte var2 = 0;
        byte var3 = 8;
        byte var4 = 8;
        byte var5 = 18;
        class196.field3583 = new int[var5];
        class77.field1460 = new byte[var5][];
        class111.field1945 = new int[var5];
        class35.field550 = new int[var5];
        int var6 = (class72.field1319 >> 10) + (class10.field147 >> 3);
        class17.field231 = new byte[var5][];
        class115.field2021 = new byte[var5][];
        class167.field2952 = new int[var5];
        class28.field383 = new int[var5];
        class13.field178 = new byte[var5][];
        class51.field939 = new byte[var5][];
        class44.field829 = new int[var5];
        class175.field3111 = new int[var5][4];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var6 - 6) / 8; var9 <= (var6 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class44.field829[var7] = var10;
                class28.field383[var7] = class246.field4184.method1006((byte) -107, class30.method214(new class256[] { class198.field3621, class305.method2125((byte) 53, var8), class179.field3170, class305.method2125((byte) 36, var9) }, 29784));
                class167.field2952[var7] = class246.field4184.method1006((byte) -128, class30.method214(new class256[] { class311.field5363, class305.method2125((byte) 80, var8), class179.field3170, class305.method2125((byte) 124, var9) }, 29784));
                class111.field1945[var7] = class246.field4184.method1006((byte) -104, class30.method214(new class256[] { class163.field2897, class305.method2125((byte) 38, var8), class179.field3170, class305.method2125((byte) 85, var9) }, 29784));
                class35.field550[var7] = class246.field4184.method1006((byte) 122, class30.method214(new class256[] { class290.field5021, class305.method2125((byte) 105, var8), class179.field3170, class305.method2125((byte) 78, var9) }, 29784));
                class196.field3583[var7] = class246.field4184.method1006((byte) -80, class30.method214(new class256[] { class233.field3989, class305.method2125((byte) 54, var8), class179.field3170, class305.method2125((byte) 65, var9) }, 29784));
                if (class111.field1945[var7] == -1) {
                    class28.field383[var7] = -1;
                    class167.field2952[var7] = -1;
                    class35.field550[var7] = -1;
                    class196.field3583[var7] = -1;
                }
                var7++;
            }
        }
        int var11 = var7;
        if (arg0 > -10) {
            field1911 = (int[]) null;
        }
        while (class111.field1945.length > var11) {
            class111.field1945[var11] = -1;
            class28.field383[var11] = -1;
            class167.field2952[var11] = -1;
            class35.field550[var11] = -1;
            class196.field3583[var11] = -1;
            var11++;
        }
        class23.method153(-17682, var2, var4, true, var3, var1, var6);
    }
}
