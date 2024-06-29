import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class178 implements class190 {

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Ltha;")
    private class372 field2438 = class432.field6028;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Z")
    private boolean field2447;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lhj;")
    public class47 field2431;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljt;")
    public class38 field2430;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    private int field2439;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Liv;")
    public class25 field2442;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lkr;")
    public static class602 field2433 = new class602(69, 0);

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "Lpb;")
    public static class79 field2448 = new class79(2);

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Lst;")
    public static class335 field2451 = new class335(55, 12);

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field2453 = -1;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lfd;")
    public static class298 field2446;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field2452;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([BIIII)V", line = 9)
    public final void method1116(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field2444++;
        if (arg2 > 0 && !class88.method611(arg2, arg4 ^ 0x2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class88.method611(arg3, 2)) {
            int var6 = this.field2442.field313;
            int var7 = arg4;
            int var8 = arg2 >= arg3 ? arg3 : arg2;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var7, this.method1122(109), arg2, arg3, 0, class71.method547(this.field2442, -8807), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            int var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg3 = var10;
                arg2 = var9;
                var11 = var15;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V", line = 106)
    private final void method1117(byte arg0, int arg1) {
        this.field2431.field3331 -= arg1;
        field2436++;
        if (arg0 == -61) {
            this.field2431.field3331 += this.method1125(3);
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 119)
    public final void method1118(int arg0) {
        field2440++;
        if (arg0 <= 105) {
            field2448 = null;
        }
        int var2 = this.field2431.method1494((byte) -123);
        int var3 = this.field2431.field714[var2];
        if (this.field2445 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field2445);
            this.field2431.field714[var2] = this.field2445;
        }
        OpenGL.glBindTexture(this.field2445, this.field2428);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILs;)V", line = 148)
    public static final void method1119(int arg0, class341 arg1) {
        class433.field6043[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 153)
    private final void method1120(byte arg0) {
        if (arg0 != -19) {
            this.method1117((byte) 90, 73);
        }
        field2443++;
        if (this.field2428 > 0) {
            this.field2431.method269(this.field2428, (byte) 120, this.method1125(3));
            this.field2428 = 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ltha;B)V", line = 172)
    public final void method1121(class372 arg0, byte arg1) {
        if (arg1 != 66) {
            this.method1126(null, -23, 28, -36, 115);
        }
        field2441++;
        if (this.field2438 != arg0) {
            this.field2438 = arg0;
            this.method1124(-91);
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)I", line = 192)
    public final int method1122(int arg0) {
        field2449++;
        if (class38.field472 == this.field2430) {
            if (class218.field2855 == this.field2442) {
                return 6407;
            }
            if (class623.field8394 == this.field2442) {
                return 6408;
            }
            if (class401.field5747 == this.field2442) {
                return 6406;
            }
            if (class762.field10618 == this.field2442) {
                return 6409;
            }
            if (class718.field9995 == this.field2442) {
                return 6410;
            }
            if (class397.field5707 == this.field2442) {
                return 6145;
            }
        } else if (class38.field475 == this.field2430) {
            if (class218.field2855 == this.field2442) {
                return 34843;
            }
            if (class623.field8394 == this.field2442) {
                return 34842;
            }
            if (class401.field5747 == this.field2442) {
                return 34844;
            }
            if (class762.field10618 == this.field2442) {
                return 34846;
            }
            if (class718.field9995 == this.field2442) {
                return 34847;
            }
            if (class397.field5707 == this.field2442) {
                return 6145;
            }
        } else if (class38.field476 == this.field2430) {
            if (class218.field2855 == this.field2442) {
                return 34837;
            }
            if (class623.field8394 == this.field2442) {
                return 34836;
            }
            if (class401.field5747 == this.field2442) {
                return 34838;
            }
            if (class762.field10618 == this.field2442) {
                return 34840;
            }
            if (class718.field9995 == this.field2442) {
                return 34841;
            }
            if (class397.field5707 == this.field2442) {
                return 6145;
            }
        }
        if (arg0 <= 99) {
            field2452 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIII[I)V", line = 287)
    public final void method1123(boolean arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2434++;
        if (arg2 > 0 && !class88.method611(arg2, 2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class88.method611(arg1, 2)) {
            throw new IllegalArgumentException("");
        } else if (class623.field8394 == this.field2442) {
            int var6 = 0;
            if (arg0) {
                int var7 = arg1 > arg2 ? arg2 : arg1;
                int var8 = arg2 >> 1;
                int var9 = arg1 >> 1;
                int[] var10 = arg4;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg3, var6, this.method1122(123), arg2, arg1, 0, 32993, this.field2431.field716, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg2 + var13;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var10[var13++];
                            int var21 = var18 >> 16 & 0xFF;
                            int var22 = var10[var14++];
                            int var23 = var18 & 0xFF;
                            int var24 = var18 >> 24 & 0xFF;
                            int var25 = (var18 & 0xFFD8) >> 8;
                            int var26 = (var20 & 0xFF) + var23;
                            int var27 = (var20 >> 8 & 0xFF) + var25;
                            int var28 = ((var20 & 0xFFA9DA) >> 16) + var21;
                            int var29 = (var20 >> 24 & 0xFF) + var24;
                            int var30 = (var19 >> 24 & 0xFF) + var29;
                            int var31 = (var19 & 0xFF) + var26;
                            int var32 = ((var19 & 0xFFC53E) >> 16) + var28;
                            int var33 = (var19 >> 8 & 0xFF) + var27;
                            int var34 = (var22 >> 24 & 0xFF) + var30;
                            int var35 = ((var22 & 0xFF2F) >> 8) + var33;
                            int var36 = (var22 & 0xFF) + var31;
                            int var37 = ((var22 & 0xFF282D) >> 16) + var32;
                            var11[var12++] = class678.method3817(class678.method3817(class678.method3817(class665.method3759(1020, var37) << 14, class665.method3759(1020, var34) << 22), class665.method3759(var35, 1020) << 6), class665.method3759(255, var36 >> 2));
                        }
                        var13 += arg2;
                        var14 += arg2;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    arg1 = var9;
                    var10 = var16;
                    arg2 = var8;
                    var6++;
                    var7 >>= 0x1;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V", line = 396)
    protected final void finalize() throws Throwable {
        this.method1120((byte) -19);
        field2437++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V", line = 405)
    private final void method1124(int arg0) {
        this.field2431.method1458(399403340, this);
        if (arg0 >= -84) {
            field2450 = -66;
        }
        field2435++;
        if (class432.field6028 == this.field2438) {
            OpenGL.glTexParameteri(this.field2445, 10241, this.field2447 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2445, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2445, 10241, this.field2447 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2445, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lhj;ILiv;Ljt;IZ)V", line = 551)
    public class178(class47 arg0, int arg1, class25 arg2, class38 arg3, int arg4, boolean arg5) {
        this.field2447 = arg5;
        this.field2431 = arg0;
        this.field2430 = arg3;
        this.field2439 = arg4;
        this.field2442 = arg2;
        this.field2445 = arg1;
        OpenGL.glGenTextures(1, class539.field7504, 0);
        this.field2428 = class539.field7504[0];
        this.method1124(-92);
        this.method1117((byte) -61, 0);
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)I", line = 434)
    private final int method1125(int arg0) {
        field2429++;
        if (arg0 == 3) {
            int var2 = this.field2430.field460 * this.field2439 * this.field2442.field313;
            return this.field2447 ? var2 * 4 / 3 : var2;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([FIIII)V", line = 454)
    public final void method1126(float[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field2432++;
        if (arg3 > 0 && !class88.method611(arg3, 2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 255) {
            if (arg1 > 0 && !class88.method611(arg1, 2)) {
                throw new IllegalArgumentException("");
            }
            int var6 = this.field2442.field313;
            int var7 = 0;
            int var8 = arg1 <= arg3 ? arg1 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg1 >> 1;
            float[] var11 = arg0;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var7, this.method1122(103), arg3, arg1, 0, class71.method547(this.field2442, arg4 - 9062), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg3 = var9;
                arg1 = var10;
                var11 = var15;
                var9 >>= 0x1;
                var7++;
                var8 >>= 0x1;
                var10 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V", line = 570)
    public static void method1127(byte arg0) {
        field2446 = null;
        if (arg0 > 50) {
            field2433 = null;
            field2448 = null;
            field2451 = null;
            field2452 = null;
        }
    }
}
