import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class63 implements class321 {

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    private int field839 = -1;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Z")
    private boolean field848 = false;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field835 = "level: ";

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Z")
    public static boolean field842 = false;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field846 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field837 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lii;")
    public static class250 field841 = new class250(512);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field851 = 2;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field853 = "Loading config - ";

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "[I")
    public static int[] field854;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()V", line = 7)
    public final void method351() {
        GL var1 = class73.field1051;
        field843++;
        class73.method548(1);
        if (class61.field806 == null || this.field839 < 0 || !class309.field4812) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field839);
        var1.glActiveTexture(33985);
        class61.field806.method1798();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class299.field4607 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class94.field1334 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field848 = true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(SB)Z", line = 34)
    public static final boolean method429(short arg0, byte arg1) {
        field850++;
        if (arg0 == 40 || arg0 == 4 || arg0 == 2 || arg0 == 30 || arg0 == 23 || arg0 == 47 || arg0 == 21 || arg0 == 16) {
            return true;
        }
        if (arg1 != -52) {
            field847 = 24;
        }
        if (arg0 == 29 || arg0 == 34 || arg0 == 1003 || arg0 == 1007) {
            return true;
        } else if (arg0 == 57 || arg0 == 18 || arg0 == 33 || arg0 == 49 || arg0 == 7) {
            return true;
        } else {
            return arg0 == 10 || arg0 == 31 || arg0 == 45 || arg0 == 48 || arg0 == 50 || arg0 == 51;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Laj;IIIIIIIZ)V", line = 59)
    public static final void method430(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class336.field5227;
        int var11;
        int var12 = var11 = (arg7 << 7) - class262.field4035;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class203.field3111[arg1][arg6][arg7] - class295.field4557;
        int var18 = class203.field3111[arg1][arg6 + 1][arg7] - class295.field4557;
        int var19 = class203.field3111[arg1][arg6 + 1][arg7 + 1] - class295.field4557;
        int var20 = class203.field3111[arg1][arg6][arg7 + 1] - class295.field4557;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class164.field2667;
        int var46 = (var24 << 9) / var25 + class164.field2666;
        int var47 = (var27 << 9) / var31 + class164.field2667;
        int var48 = (var30 << 9) / var31 + class164.field2666;
        int var49 = (var33 << 9) / var37 + class164.field2667;
        int var50 = (var36 << 9) / var37 + class164.field2666;
        int var51 = (var39 << 9) / var43 + class164.field2667;
        int var52 = (var42 << 9) / var43 + class164.field2666;
        class164.field2665 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class95.field1368 && class205.method1482(class71.field1019 + class164.field2667, class240.field3669 + class164.field2666, var50, var52, var48, var49, var51, var47)) {
                class257.field3933 = arg6;
                class264.field4101 = arg7;
            }
            if (!class73.field1058 && !arg8) {
                class164.field2658 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class164.field2661 || var51 > class164.field2661 || var47 > class164.field2661) {
                    class164.field2658 = true;
                }
                if (arg0.field2047 == -1) {
                    if (arg0.field2054 != 12345678) {
                        class164.method1230(var50, var52, var48, var49, var51, var47, arg0.field2054, arg0.field2046, arg0.field2045);
                    }
                } else if (!class258.field3983) {
                    int var53 = class164.field2662.method672(-28889, arg0.field2047);
                    class164.method1230(var50, var52, var48, var49, var51, var47, class220.method1568(var53, arg0.field2054), class220.method1568(var53, arg0.field2046), class220.method1568(var53, arg0.field2045));
                } else if (arg0.field2055) {
                    class164.method1239(var50, var52, var48, var49, var51, var47, arg0.field2054, arg0.field2046, arg0.field2045, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2047);
                } else {
                    class164.method1239(var50, var52, var48, var49, var51, var47, arg0.field2054, arg0.field2046, arg0.field2045, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2047);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class95.field1368 && class205.method1482(class71.field1019 + class164.field2667, class240.field3669 + class164.field2666, var46, var48, var52, var45, var47, var51)) {
            class257.field3933 = arg6;
            class264.field4101 = arg7;
        }
        if (class73.field1058 || arg8) {
            return;
        }
        class164.field2658 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class164.field2661 || var47 > class164.field2661 || var51 > class164.field2661) {
            class164.field2658 = true;
        }
        if (arg0.field2047 == -1) {
            if (arg0.field2044 != 12345678) {
                class164.method1230(var46, var48, var52, var45, var47, var51, arg0.field2044, arg0.field2045, arg0.field2046);
            }
        } else if (class258.field3983) {
            class164.method1239(var46, var48, var52, var45, var47, var51, arg0.field2044, arg0.field2045, arg0.field2046, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2047);
        } else {
            int var54 = class164.field2662.method672(-28889, arg0.field2047);
            class164.method1230(var46, var48, var52, var45, var47, var51, class220.method1568(var54, arg0.field2044), class220.method1568(var54, arg0.field2045), class220.method1568(var54, arg0.field2046));
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I", line = 219)
    public static final int method431(int arg0) {
        if (arg0 != 1) {
            return -20;
        }
        field838++;
        if (class170.field2747 != null) {
            return 3;
        } else if (class73.field1058 && field842) {
            return 2;
        } else if (class73.field1058 && !field842) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()I", line = 243)
    public final int method352() {
        field845++;
        return 4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 252)
    public static void method432(byte arg0) {
        if (arg0 <= 78) {
            field851 = 15;
        }
        field854 = null;
        field835 = null;
        field853 = null;
        field841 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIBIIIII)V", line = 267)
    public static final void method433(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field840++;
        if (arg2 != -34) {
            method430((class135) null, -105, 32, -43, -17, 34, -88, -107, false);
        }
        if (arg0 < 1 || arg5 < 1 || arg0 > 102 || arg5 > 102) {
            return;
        }
        if (!class110.method841((byte) 88) && (class324.field5005[0][arg0][arg5] & 0x2) == 0) {
            int var8 = arg3;
            if ((class324.field5005[arg3][arg0][arg5] & 0x8) != 0) {
                var8 = 0;
            }
            if (class170.field2749 != var8) {
                return;
            }
        }
        int var9 = arg3;
        if (arg3 < 3 && (class324.field5005[1][arg0][arg5] & 0x2) == 2) {
            var9 = arg3 + 1;
        }
        class40.method304(arg0, arg5, arg3, class91.field1323[arg3], 1, arg7, var9);
        if (arg1 >= 0) {
            boolean var10 = class320.field4958;
            class320.field4958 = true;
            class278.method1928(arg0, false, class91.field1323[arg3], false, arg6, arg4, -90, var9, arg3, arg1, arg5);
            class320.field4958 = var10;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 325)
    public final void method353(int arg0) {
        field844++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)Lnf;", line = 333)
    public static final class262 method434(int arg0, int arg1, byte arg2) {
        if (arg2 < 93) {
            return (class262) null;
        }
        field836++;
        for (class262 var3 = (class262) class224.field3418.method1706(0); var3 != null; var3 = (class262) class224.field3418.method1705((byte) 48)) {
            if (var3.field4038 && var3.method1841(arg1, 88, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 358)
    public final void method355() {
        GL var1 = class73.field1051;
        if (this.field848) {
            var1.glCallList(this.field839 + 1);
            this.field848 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
        field849++;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 389)
    public class63() {
        if (class73.field1070) {
            GL var1 = class73.field1051;
            this.field839 = var1.glGenLists(2);
            var1.glNewList(this.field839, 4864);
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
            var1.glNewList(this.field839 + 1, 4864);
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
}
