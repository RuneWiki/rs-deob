import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class635 extends class36 {

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    private int field8725 = -1;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    private int field8728 = -1;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public int field8723;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public int field8722;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public int field8729;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Loea;")
    public static class597 field8727;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V")
    public final void method3618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field870.method256((byte) -110, this);
        ++field8726;
        OpenGL.glCopyTexSubImage3D(super.field868, 0, arg3, arg7, arg5, arg4, arg1, arg2, arg6);
        OpenGL.glFlush();
        if (arg0 != -26823) {
            field8727 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public final void method457(int arg0) {
        ++field8724;
        OpenGL.glFramebufferTexture3DEXT(this.field8728, this.field8725, super.field868, 0, 0, 0);
        this.field8725 = -1;
        if (arg0 != -3022) {
            method3620(112, -107, -46, -98, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -114, (byte) 75, -105, 62, true, false, 110, -31, true);
        }
        this.field8728 = -1;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lqo;IIII[BI)V")
    public class635(class22 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field8723 = arg2;
        this.field8722 = arg4;
        this.field8729 = arg3;
        super.field870.method256((byte) -84, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field868, 0, super.field877, this.field8723, this.field8729, this.field8722, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public static void method3619(int arg0) {
        int var1 = -121 / ((-52 - arg0) / 60);
        field8727 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method3620(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class151.field2492 = true;
        class390.field5647 = class44.field982.method318() > 0;
        class148.field2474 = arg15;
        class134.field2256 = arg1 >> class130.field2185;
        class492.field6813 = arg3 >> class130.field2185;
        class119.field2020 = arg1;
        class364.field5216 = arg3;
        class285.field3980 = arg2;
        class237.field3442 = class134.field2256 - class708.field9611;
        if (class237.field3442 < 0) {
            class232.field3369 = -class237.field3442;
            class237.field3442 = 0;
        } else {
            class232.field3369 = 0;
        }
        class38.field943 = class492.field6813 - class708.field9611;
        if (class38.field943 < 0) {
            class214.field3048 = -class38.field943;
            class38.field943 = 0;
        } else {
            class214.field3048 = 0;
        }
        class581.field7952 = class708.field9611 + class134.field2256;
        if (class581.field7952 > class434.field6208) {
            class581.field7952 = class434.field6208;
        }
        class241.field3522 = class708.field9611 + class492.field6813;
        if (class241.field3522 > class432.field6185) {
            class241.field3522 = class432.field6185;
        }
        boolean[][] var19 = class196.field2890;
        boolean[][] var20 = class272.field3824;
        if (class148.field2474) {
            for (int var21 = 0; var21 < class708.field9611 + class708.field9611 + 2; ++var21) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class708.field9611 + class708.field9611 + 2; ++var24) {
                    if (var24 > 1) {
                        class651.field8948[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class134.field2256 - class708.field9611 + var21;
                    int var26 = class492.field6813 - class708.field9611 + var24;
                    if (var25 >= 0 && var26 >= 0 && var25 < class434.field6208 && var26 < class432.field6185) {
                        int var27 = var25 << class130.field2185;
                        int var28 = var26 << class130.field2185;
                        int var29 = class465.field6517[class465.field6517.length - 1].method1851((byte) -86, var26, var25) - (1000 << class130.field2185 - 7);
                        int var30 = class344.field4822 != null ? class344.field4822[0].method1851((byte) -86, var26, var25) + class1.field3 : class465.field6517[0].method1851((byte) -86, var26, var25) + class1.field3;
                        var23 = arg16 >= 0 ? class44.field982.method333(var27, var29, var28, var27, var30, var28, arg16) : class44.field982.method309(var27, var29, var28, var27, var30, var28);
                        class272.field3824[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class272.field3824[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class651.field8948[var24 - 1] & class651.field8948[var24] & var22 & var23;
                        class196.field2890[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class651.field8948[class708.field9611 + class708.field9611] = var22;
                class651.field8948[class708.field9611 + class708.field9611 + 1] = var23;
            }
            if (arg16 >= 0) {
                class151.field2492 = false;
            } else {
                class598.field8211 = arg5;
                class391.field5756 = arg6;
                class659.field9030 = arg7;
                class271.field3813 = arg8;
                client.field4224 = arg9;
                class167.method1258(arg10, (byte) 39, class44.field982);
            }
        } else {
            if (class524.field7259 == null) {
                class524.field7259 = new boolean[class434.field6208 + class434.field6208 + 1][class434.field6208 + class432.field6185 + 1];
            }
            for (int var32 = 0; var32 < class524.field7259.length; ++var32) {
                for (int var42 = 0; var42 < class524.field7259[0].length; ++var42) {
                    class524.field7259[var32][var42] = true;
                }
            }
            class272.field3824 = class524.field7259;
            class196.field2890 = class524.field7259;
            class237.field3442 = 0;
            class38.field943 = 0;
            class581.field7952 = class434.field6208;
            class241.field3522 = class432.field6185;
            class151.field2492 = false;
        }
        class174.method1306(class44.field982, -69);
        if (!class545.field7511.field6263) {
            class174 var33 = class545.field7511.field6262;
            for (class228 var34 = (class228) var33.method1301(8); var34 != null; var34 = (class228) var33.method1307((byte) 125)) {
                var34.method4018(false);
                class520.method3028(var34, 6);
            }
        }
        if (class390.field5647) {
            for (int var35 = 0; var35 < class234.field3398; ++var35) {
                class394.field5788[var35].method8(8688, arg14, arg0);
            }
        }
        if (class719.field9783) {
            class684.field9265 = class44.field982.method188();
            class44.field982.method206(class593.field8118);
            int var36 = (class593.field8118[2] - class593.field8118[0]) / class165.field2594;
            for (int var37 = 0; var37 < class165.field2594 - 1; ++var37) {
                class691.field9346[var37] = (var37 + 1) * var36 + class488.field6756[var37];
            }
            for (int var38 = 0; var38 < class170.field2657.length; ++var38) {
                class170.field2657[var38].method3922();
            }
        }
        if (class135.field2273 != null) {
            if (class719.field9783) {
                class115.method1019(0);
            }
            class174.method1308(true);
            class44.field982.method277(-1, 1583160, 40, 127);
            class548.method3155(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class719.field9783) {
                class169.method1279();
            }
            class44.field982.method332();
            class174.method1308(false);
        }
        class548.method3155(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class719.field9783) {
            for (int var39 = 0; var39 < class510.field7094; ++var39) {
                class608.field8345[var39] = class375.field5307[var39];
            }
            class115.method1019(0);
            for (int var40 = 0; var40 < class170.field2657.length; ++var40) {
                class170.field2657[var40].method3922();
            }
        }
        if (class719.field9783) {
            class169.method1279();
            for (int var41 = 0; var41 < class510.field7094; ++var41) {
                class375.field5307[var41] = class608.field8345[var41];
            }
            if (class9.field124 == 2) {
                int var10002;
                if (class499.field6971[0] < class499.field6971[1]) {
                    if (class691.field9346[0] + class488.field6756[0] > class593.field8118[0]) {
                        var10002 = class488.field6756[0]++;
                    }
                } else if (class499.field6971[0] > class499.field6971[1] && class691.field9346[0] + class488.field6756[0] < class593.field8118[2]) {
                    var10002 = class488.field6756[0]--;
                }
            }
        }
        if (!class148.field2474) {
            class196.field2890 = var19;
            class272.field3824 = var20;
        }
        class614.method3483();
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lqo;IIII)V")
    public class635(class22 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field8723 = arg2;
        this.field8729 = arg3;
        this.field8722 = arg4;
        super.field870.method256((byte) -123, this);
        OpenGL.glTexImage3Dub(super.field868, 0, super.field877, this.field8723, this.field8729, this.field8722, 0, class397.method2484(true, super.field877), 5121, (byte[]) null, 0);
        this.method456(9728, true);
    }
}
