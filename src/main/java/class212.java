import java.util.Date;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class212 implements class323 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Z")
    private boolean field3408 = false;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    private int field3403 = -1;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3406 = "Take";

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "[I")
    public static int[] field3415 = new int[5];

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Z")
    public static boolean field3418 = false;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Lbm;")
    public static class307 field3416;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 7)
    public static void method1430(int arg0) {
        if (arg0 != -11514) {
            field3416 = (class307) null;
        }
        field3415 = null;
        field3406 = null;
        field3416 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 22)
    public static final String method1431(long arg0, byte arg1) {
        field3417++;
        class133.field2249.setTime(new Date(arg0));
        int var3 = -114 / ((-arg1 - 70) / 38);
        int var4 = class133.field2249.get(7);
        int var5 = class133.field2249.get(5);
        int var6 = class133.field2249.get(2);
        int var7 = class133.field2249.get(1);
        int var8 = class133.field2249.get(11);
        int var9 = class133.field2249.get(12);
        int var10 = class133.field2249.get(13);
        return class280.field4304[var4 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class106.field1846[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIIII)V", line = 48)
    public static final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3407++;
        int var11 = arg5 - arg6;
        int var12 = arg7 - arg0;
        if (class9.field199 > arg5) {
            var11++;
        }
        if (class163.field2629 > arg7) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg1 + (arg8 * var13) >> 16;
            int var15 = (var13 + 1) * arg8 + arg1 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = var13 + arg0 >> 6;
                if (var17 >= 0 && var17 <= (class336.field5155.length - 1)) {
                    byte[][] var18 = class97.field1721[var17];
                    int[][] var19 = class336.field5155[var17];
                    int var20 = arg10 + var15;
                    byte[][] var21 = class51.field1021[var17];
                    int var22 = arg10 + var14;
                    byte[][] var23 = class313.field4764[var17];
                    byte[][] var24 = class103.field1781[var17];
                    byte[][] var25 = class169.field2704[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = (var26 + 1) * arg3 + arg2 >> 16;
                        int var28 = arg3 * var26 + arg2 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg4 + var28;
                            int var31 = arg6 + var26 >> 6;
                            int var32 = arg4 + var27;
                            int var33 = arg0 + var13 & 0x3F;
                            int var34 = arg6 + var26 & 0x3F;
                            int var35 = (var34 << 6) + var33;
                            int var36;
                            if (var31 < 0 || (var19.length - 1) < var31 || var19[var31] == null) {
                                if (class104.field1803.field5027 != -1) {
                                    var36 = class104.field1803.field5027;
                                } else if ((arg0 + var13 & 0x4) == (arg6 + var26 & 0x4)) {
                                    var36 = class94.field1686[class344.field5338 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || var19.length - 1 < var31) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class270.method1811(var22, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var31][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var18[var31] == null ? 0 : class94.field1686[var18[var31][var35] & 0xFF];
                            int var38 = var23[var31] == null ? 0 : class94.field1686[var23[var31][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class270.method1811(var22, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    byte var39 = var21[var31] == null ? 0 : var21[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class270.method1811(var22, var30, var16, var29, var37);
                                    } else {
                                        class164.method1047(var29, class270.field4170, var22, var40 >> 2, var37, var39 & 0x3, 2, true, var16, var36, var30);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var25[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class270.method1811(var22, var30, var16, var29, var38);
                                    }
                                    class164.method1047(var29, class270.field4170, var22, var42 >> 2, var38, var41 & 0x3, 2, var37 == 0, var16, 0, var30);
                                }
                            }
                            if (var24[var31] != null) {
                                int var43 = var24[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var22;
                                    } else {
                                        var44 = var20 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var30;
                                    } else {
                                        var45 = var32 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class270.method1804(var22, var30, var29, var46);
                                    } else if (var43 == 2) {
                                        class270.method1812(var22, var30, var16, var46);
                                    } else if (var43 == 3) {
                                        class270.method1804(var44, var30, var29, var46);
                                    } else if (var43 == 4) {
                                        class270.method1812(var22, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class270.method1804(var22, var30, var29, 16777215);
                                        class270.method1812(var22, var30, var16, var46);
                                    } else if (var43 == 10) {
                                        class270.method1804(var44, var30, var29, 16777215);
                                        class270.method1812(var22, var30, var16, var46);
                                    } else if (var43 == 11) {
                                        class270.method1804(var44, var30, var29, 16777215);
                                        class270.method1812(var22, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class270.method1804(var22, var30, var29, 16777215);
                                        class270.method1812(var22, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class270.method1812(var22, var30, 1, var46);
                                    } else if (var43 == 18) {
                                        class270.method1812(var44, var30, 1, var46);
                                    } else if (var43 == 19) {
                                        class270.method1812(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class270.method1812(var22, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class270.method1812(var22 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class270.method1812(var22 + var48, var30 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg10 + var15;
                    int var50 = arg10 + var14;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52;
                        if (class104.field1803.field5027 != -1) {
                            var52 = class104.field1803.field5027;
                        } else if ((arg0 + var13 & 0x4) == (arg6 + var51 & 0x4)) {
                            var52 = class94.field1686[class344.field5338 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = ((var51 + 1) * arg3 + arg2 >> 16) + arg4;
                        int var54 = (arg3 * var51 + arg2 >> 16) + arg4;
                        int var55 = var53 - var54;
                        class270.method1811(var50, var54, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = arg8 * var56 + arg1 >> 16;
            int var58 = (var56 + 1) * arg8 + arg1 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg10 + var57;
                int var61 = var56 + arg0 >> 6;
                var10000 = arg10 + var58;
                if (var61 >= 0 && var61 <= class190.field3085.length - 1) {
                    int[][] var63 = class190.field3085[var61];
                    for (int var64 = -2; var64 < (var11 + 2); var64++) {
                        int var65 = arg3 * var64 + arg2 >> 16;
                        int var66 = (var64 + 1) * arg3 + arg2 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg4 + var65;
                            var10000 = arg4 + var66;
                            int var70 = var64 + arg6 >> 6;
                            if (var70 >= 0 && var70 <= (var63.length - 1)) {
                                int var71 = ((arg6 + var64 & 0x3F) << 6) + (arg0 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        class327 var74 = class106.method693(var73 - 1, -2);
                                        boolean var75 = (var72 >> 15 & 0x1) == 1;
                                        int var76 = (var72 & 0x6629) >> 13;
                                        class113 var77 = var74.method2268(var75, 21130, var76);
                                        if (var77 != null) {
                                            int var78 = var77.field1968 * var59 / 4;
                                            int var79 = var77.field1970 * var67 / 4;
                                            if (var74.field4998) {
                                                int var80 = var72 >> 16 & 0xF;
                                                int var81 = var72 >> 20 & 0xF;
                                                if ((var76 & 0x1) == 1) {
                                                    int var82 = var80;
                                                    var80 = var81;
                                                    var81 = var82;
                                                }
                                                var78 = var59 * var80;
                                                var79 = var67 * var81;
                                            }
                                            if (var78 != 0 && var79 != 0) {
                                                if (var74.field4996 == 0) {
                                                    var77.method725(var60, var68 + var67 - var79, var78, var79);
                                                } else {
                                                    var77.method733(var60, var68 + var67 - var79, var78, var79, var74.field4996);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg9 <= 36) {
            field3406 = (String) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V", line = 475)
    public final void method185() {
        field3413++;
        GL var1 = class249.field3898;
        if (this.field3408) {
            var1.glCallList(this.field3403 + 1);
            this.field3408 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lpb;", line = 493)
    public static final class2 method1433(int arg0, int arg1, int arg2) {
        field3414++;
        class2 var3 = (class2) class234.field3677.method303((long) arg1 << 32 | (long) arg0, (byte) 123);
        if (arg2 != -13802) {
            method1433(-39, 67, 45);
        }
        if (var3 == null) {
            var3 = new class2(arg1, arg0);
            class234.field3677.method310(var3.field702, var3, 25357);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V", line = 515)
    public final void method188() {
        GL var1 = class249.field3898;
        field3404++;
        class249.method1681(1);
        if (class125.field2169 == null || this.field3403 < 0 || !class334.field5115) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field3403);
        var1.glActiveTexture(33985);
        class125.field2169.method924();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class326.field4981 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class283.field4380 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field3408 = true;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 617)
    public class212() {
        if (class249.field3879) {
            GL var1 = class249.field3898;
            this.field3403 = var1.glGenLists(2);
            var1.glNewList(this.field3403, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 34165);
            var1.glTexEnvi(8960, 34178, 34168);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34167);
            var1.glTexGeni(8192, 9472, 34066);
            var1.glTexGeni(8193, 9472, 34066);
            var1.glTexGeni(8194, 9472, 34066);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glActiveTexture(33984);
            var1.glEndList();
            var1.glNewList(this.field3403 + 1, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34178, 34166);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            var1.glEndList();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 546)
    public static int method1434(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lbm;ZII)Lmg;", line = 554)
    public static final class113 method1435(class307 arg0, boolean arg1, int arg2, int arg3) {
        field3411++;
        if (arg1) {
            method1431(59L, (byte) -93);
        }
        return class135.method885(arg2, arg0, -10948, arg3) ? class177.method1121(0) : null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I", line = 574)
    public final int method187() {
        field3405++;
        return 4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 584)
    public final void method186(int arg0) {
        field3409++;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)I", line = 595)
    public static final int method1436(int arg0, int arg1, int arg2) {
        field3402++;
        if (arg1 != 1) {
            return 103;
        }
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }
}
