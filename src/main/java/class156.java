import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class156 extends class151 {

    @OriginalMember(owner = "client!va", name = "u", descriptor = "J")
    public long field2747;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
    public static boolean field2746 = true;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Lbd;")
    public static class162 field2749 = class17.method142(0, "mapfunction");

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lbd;")
    public static class162 field2752 = class17.method142(0, "mapdots");

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLda;)Lgg;", line = 4)
    public static final class34 method1210(int arg0, byte arg1, class143 arg2) {
        field2754++;
        if (arg1 <= 14) {
            field2745 = -68;
        }
        return class212.method1555(79, arg2, arg0) ? class217.method1575((byte) 35) : null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Lab;", line = 22)
    public static final class273 method1211(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3753;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lbd;", line = 30)
    public static final class162 method1212(int arg0, int arg1) {
        if (arg0 == 10) {
            field2753++;
            return class128.method1028(arg1, false, 10, 24825);
        } else {
            return (class162) null;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)Llk;", line = 45)
    public static final class138 method1213(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3775;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)I", line = 61)
    public static final int method1214(int arg0, int arg1, int arg2) {
        class101 var3 = (class101) class40.field651.method1672((long) arg0, 19760);
        field2751++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 > -93) {
                field2752 = (class162) null;
            }
            for (int var5 = 0; var5 < var3.field1849.length; var5++) {
                if (var3.field1847[var5] == arg2) {
                    var4 += var3.field1849[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 96)
    public static void method1215(int arg0) {
        field2749 = null;
        if (arg0 >= -91) {
            method1211(20, 11, 2);
        }
        field2752 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V", line = 116)
    public static final void method1216(byte arg0, int arg1) {
        field2757++;
        if (arg0 > -79) {
            field2752 = (class162) null;
        }
        class251 var2 = class240.field3998;
        synchronized (class240.field3998) {
            class305.field5141 = arg1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZIIIIB[II)V", line = 129)
    public static final void method1217(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int[] arg9, int arg10) {
        if (arg8 != -87) {
            field2750 = 25;
        }
        field2755++;
        int var11 = arg10;
        if (class316.field5333 <= arg10) {
            return;
        }
        if (class316.field5332 > arg10) {
            var11 = class316.field5332;
        }
        int var12 = arg10 + arg1;
        if (class316.field5332 >= var12) {
            return;
        }
        if (class316.field5333 < var12) {
            var12 = class316.field5333;
        }
        int var13 = arg5;
        if (class316.field5334 <= arg5) {
            return;
        }
        int var14 = arg2 + arg5;
        if (class316.field5330 > arg5) {
            var13 = class316.field5330;
        }
        if (var14 <= class316.field5330) {
            return;
        }
        if (var14 > class316.field5334) {
            var14 = class316.field5334;
        }
        int var15 = var14 - arg5;
        int var16 = class316.field5331 + var11 - var12;
        int var17 = var12 - arg10;
        if (arg4 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg4 = 1;
        }
        int var18 = arg1 - var17;
        if (arg4 == 11) {
            arg4 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        int var19 = class316.field5331 * var13 + var11;
        int var20 = var11 - arg10;
        int var21 = arg2 - var15;
        int var22 = arg1 - var20;
        int var23 = var13 - arg5;
        int var24 = arg2 - var23;
        if (arg4 == 1) {
            if (arg6 == 0) {
                for (int var87 = var23; var87 < var15; var87++) {
                    for (int var88 = var20; var88 < var17; var88++) {
                        if (var88 <= var87) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 1) {
                for (int var85 = var24 - 1; var85 >= var21; var85--) {
                    for (int var86 = var20; var86 < var17; var86++) {
                        if (var85 >= var86) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 2) {
                for (int var83 = var23; var83 < var15; var83++) {
                    for (int var84 = var20; var84 < var17; var84++) {
                        if (var83 <= var84) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 3) {
                for (int var81 = var24 - 1; var81 >= var21; var81--) {
                    for (int var82 = var20; var82 < var17; var82++) {
                        if (var81 <= var82) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            }
        } else if (arg4 == 2) {
            if (arg6 == 0) {
                for (int var73 = var24 - 1; var73 >= var21; var73--) {
                    for (int var74 = var20; var74 < var17; var74++) {
                        if (var74 <= var73 >> 1) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 1) {
                for (int var75 = var23; var75 < var15; var75++) {
                    for (int var76 = var20; var76 < var17; var76++) {
                        if (var19 >= 0 && arg9.length > var19) {
                            if ((var75 << 1) <= var76) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        } else {
                            var19++;
                        }
                    }
                    var19 += var16;
                }
            } else if (arg6 == 2) {
                for (int var77 = var23; var77 < var15; var77++) {
                    for (int var78 = var22 - 1; var78 >= var18; var78--) {
                        if (var78 <= var77 >> 1) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 3) {
                for (int var79 = var24 - 1; var79 >= var21; var79--) {
                    for (int var80 = var22 - 1; var80 >= var18; var80--) {
                        if (var79 << 1 <= var80) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            }
        } else if (arg4 == 3) {
            if (arg6 == 0) {
                for (int var31 = var24 - 1; var31 >= var21; var31--) {
                    for (int var32 = var22 - 1; var32 >= var18; var32--) {
                        if (var32 <= (var31 >> 1)) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 1) {
                for (int var29 = var24 - 1; var29 >= var21; var29--) {
                    for (int var30 = var20; var30 < var17; var30++) {
                        if (var30 >= (var29 << 1)) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 2) {
                for (int var25 = var23; var25 < var15; var25++) {
                    for (int var26 = var20; var26 < var17; var26++) {
                        if (var25 >> 1 >= var26) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 3) {
                for (int var27 = var23; var27 < var15; var27++) {
                    for (int var28 = var22 - 1; var28 >= var18; var28--) {
                        if ((var27 << 1) <= var28) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            }
        } else if (arg4 == 4) {
            if (arg6 == 0) {
                for (int var33 = var24 - 1; var33 >= var21; var33--) {
                    for (int var34 = var20; var34 < var17; var34++) {
                        if (var34 >= var33 >> 1) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 1) {
                for (int var35 = var23; var35 < var15; var35++) {
                    for (int var36 = var20; var36 < var17; var36++) {
                        if (var35 << 1 >= var36) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 2) {
                for (int var37 = var23; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var18; var38--) {
                        if (var38 >= var37 >> 1) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            } else if (arg6 == 3) {
                for (int var39 = var24 - 1; var39 >= var21; var39--) {
                    for (int var40 = var22 - 1; var40 >= var18; var40--) {
                        if (var39 << 1 >= var40) {
                            arg9[var19] = arg7;
                        } else if (arg3) {
                            arg9[var19] = arg0;
                        }
                        var19++;
                    }
                    var19 += var16;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg6 == 0) {
                    for (int var41 = var23; var41 < var15; var41++) {
                        for (int var42 = var20; var42 < var17; var42++) {
                            if (var42 <= arg1 / 2) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var43 = var23; var43 < var15; var43++) {
                        for (int var44 = var20; var44 < var17; var44++) {
                            if (var43 <= arg2 / 2) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var63 = var23; var63 < var15; var63++) {
                        for (int var64 = var20; var64 < var17; var64++) {
                            if ((arg1 / 2) <= var64) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var45 = var23; var45 < var15; var45++) {
                        for (int var46 = var20; var46 < var17; var46++) {
                            if (var45 >= (arg2 / 2)) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg6 == 0) {
                    for (int var61 = var23; var61 < var15; var61++) {
                        for (int var62 = var20; var62 < var17; var62++) {
                            if ((var61 - (arg2 / 2)) >= var62) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var47 = var24 - 1; var47 >= var21; var47--) {
                        for (int var48 = var20; var48 < var17; var48++) {
                            if (var47 - (arg2 / 2) >= var48) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var49 = var24 - 1; var49 >= var21; var49--) {
                        for (int var50 = var22 - 1; var50 >= var18; var50--) {
                            if (var49 - (arg2 / 2) >= var50) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var51 = var23; var51 < var15; var51++) {
                        for (int var52 = var22 - 1; var52 >= var18; var52--) {
                            if (var52 <= var51 - arg2 / 2) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg6 == 0) {
                    for (int var53 = var23; var53 < var15; var53++) {
                        for (int var54 = var20; var54 < var17; var54++) {
                            if (var54 >= var53 - (arg2 / 2)) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var59 = var24 - 1; var59 >= var21; var59--) {
                        for (int var60 = var20; var60 < var17; var60++) {
                            if (var59 - (arg2 / 2) <= var60) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var55 = var24 - 1; var55 >= var21; var55--) {
                        for (int var56 = var22 - 1; var56 >= var18; var56--) {
                            if (var56 >= (var55 - (arg2 / 2))) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var57 = var23; var57 < var15; var57++) {
                        for (int var58 = var22 - 1; var58 >= var18; var58--) {
                            if (var57 - (arg2 / 2) <= var58) {
                                arg9[var19] = arg7;
                            } else if (arg3) {
                                arg9[var19] = arg0;
                            }
                            var19++;
                        }
                        var19 += var16;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var71 = var24 - 1; var71 >= var21; var71--) {
                for (int var72 = var22 - 1; var72 >= var18; var72--) {
                    if ((var71 >> 1) <= var72) {
                        arg9[var19] = arg7;
                    } else if (arg3) {
                        arg9[var19] = arg0;
                    }
                    var19++;
                }
                var19 += var16;
            }
        } else if (arg6 == 1) {
            for (int var65 = var24 - 1; var65 >= var21; var65--) {
                for (int var66 = var20; var66 < var17; var66++) {
                    if (var66 <= (var65 << 1)) {
                        arg9[var19] = arg7;
                    } else if (arg3) {
                        arg9[var19] = arg0;
                    }
                    var19++;
                }
                var19 += var16;
            }
        } else if (arg6 == 2) {
            for (int var67 = var23; var67 < var15; var67++) {
                for (int var68 = var20; var68 < var17; var68++) {
                    if (var68 >= (var67 >> 1)) {
                        arg9[var19] = arg7;
                    } else if (arg3) {
                        arg9[var19] = arg0;
                    }
                    var19++;
                }
                var19 += var16;
            }
        } else if (arg6 == 3) {
            for (int var69 = var23; var69 < var15; var69++) {
                for (int var70 = var22 - 1; var70 >= var18; var70--) {
                    if (var69 << 1 >= var70) {
                        arg9[var19] = arg7;
                    } else if (arg3) {
                        arg9[var19] = arg0;
                    }
                    var19++;
                }
                var19 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILib;IBII)Ljava/awt/Frame;", line = 1316)
    public static final Frame method1218(int arg0, class28 arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -23) {
            return (Frame) null;
        }
        field2758++;
        if (!arg1.method240(0)) {
            return null;
        }
        if (arg4 == 0) {
            class97[] var6 = class167.method1305(arg1, 10);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1770 == arg5 && var6[var8].field1765 == arg2 && (arg0 == 0 || var6[var8].field1772 == arg0) && (!var7 || var6[var8].field1761 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field1761;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class166 var9 = arg1.method231(arg4, arg5, arg2, arg0, (byte) -128);
        while (var9.field2934 == 0) {
            class177.method1342(10L, 1);
        }
        Frame var10 = (Frame) var9.field2933;
        if (var10 == null) {
            return null;
        } else if (var9.field2934 == 2) {
            class59.method411(arg1, var10, (byte) -96);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 1389)
    public static final void method1219(int arg0) {
        field2756++;
        boolean var1 = false;
        if (arg0 < 31) {
            field2748 = -47;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class293.field4931 - 1; var2++) {
                if (class105.field1911[var2] < 1000 && class105.field1911[var2 + 1] > 1000) {
                    var1 = false;
                    class162 var3 = class31.field516[var2];
                    class31.field516[var2] = class31.field516[var2 + 1];
                    class31.field516[var2 + 1] = var3;
                    class162 var4 = class1.field9[var2];
                    class1.field9[var2] = class1.field9[var2 + 1];
                    class1.field9[var2 + 1] = var4;
                    int var5 = class126.field2292[var2];
                    class126.field2292[var2] = class126.field2292[var2 + 1];
                    class126.field2292[var2 + 1] = var5;
                    int var6 = class35.field589[var2];
                    class35.field589[var2] = class35.field589[var2 + 1];
                    class35.field589[var2 + 1] = var6;
                    short var7 = class105.field1911[var2];
                    class105.field1911[var2] = class105.field1911[var2 + 1];
                    class105.field1911[var2 + 1] = var7;
                    long var8 = class240.field4002[var2];
                    class240.field4002[var2] = class240.field4002[var2 + 1];
                    class240.field4002[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 1445)
    public class156() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(J)V", line = 1447)
    public class156(long arg0) {
        this.field2747 = arg0;
    }
}
