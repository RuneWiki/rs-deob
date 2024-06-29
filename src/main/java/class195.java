import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class195 implements class41 {

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "[F")
    private float[] field3540 = new float[4];

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "[I")
    public static int[] field3530 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lsf;")
    public static class108 field3533 = class140.method973(255, " GMT");

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "F")
    public static float field3521;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    private int field3525;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Lik;")
    public static class262 field3524;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "[I")
    public static int[] field3528;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[S")
    public static short[] field3527;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 7)
    public final void method219(int arg0) {
        GL var2 = class231.field4052;
        field3539++;
        float var3 = (float) (((arg0 & 0x1B) >> 3) + 1) * 0.01F;
        float var4 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field3540[3] = 0.0F;
            this.field3540[0] = var5;
            this.field3540[1] = 0.0F;
            this.field3540[2] = 0.0F;
        } else {
            this.field3540[2] = var5;
            this.field3540[0] = 0.0F;
            this.field3540[1] = 0.0F;
            this.field3540[3] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class249.field4305 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class151.field2744 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class149.field2722), (float) (-class58.field871), (float) (-class86.field1366));
        var2.glTexGenfv(8192, 9474, this.field3540, 0);
        this.field3540[2] = 0.0F;
        this.field3540[0] = 0.0F;
        this.field3540[3] = (float) class231.field4050 * var4;
        this.field3540[1] = var5;
        var2.glTexGenfv(8193, 9474, this.field3540, 0);
        var2.glPopMatrix();
        if (class138.field2435) {
            this.field3540[1] = 0.0F;
            this.field3540[3] = (float) class231.field4050 * var3;
            this.field3540[2] = 0.0F;
            this.field3540[0] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3540, 0);
        } else {
            int var7 = (int) ((float) class231.field4050 * var3 * 64.0F);
            var2.glBindTexture(3553, class138.field2431[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILca;)V", line = 71)
    public static final void method1388(int arg0, class98 arg1) {
        if (arg0 != -82) {
            field3537 = 126;
        }
        field3523++;
        if (class301.field5245 == arg1.field1630) {
            class47.field692[arg1.field1653] = true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V", line = 86)
    public static final void method1389(int arg0, byte arg1) {
        field3531++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class98.method670(10);
        } else if (arg0 == 2) {
            class177.method1256(-6105);
        } else {
            throw new RuntimeException();
        }
        if (arg1 >= -55) {
            method1392(false, (byte) 45, -96, 117, 20, 105, -24, -61, (class249) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 114)
    public final void method220() {
        GL var1 = class231.field4052;
        field3538++;
        var1.glCallList(this.field3525);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 125)
    public static void method1390(byte arg0) {
        int var1 = -25 % ((arg0 + 18) / 56);
        field3527 = null;
        field3524 = null;
        field3528 = null;
        field3530 = null;
        field3533 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[[IZ[[I[[FILcl;BIZ[Z[[FII[[F[IIIIZIZ)V", line = 146)
    public static final void method1391(int arg0, int[][] arg1, boolean arg2, int[][] arg3, float[][] arg4, int arg5, class133 arg6, byte arg7, int arg8, boolean arg9, boolean[] arg10, float[][] arg11, int arg12, int arg13, float[][] arg14, int[] arg15, int arg16, int arg17, int arg18, boolean arg19, int arg20, boolean arg21) {
        int var22 = (arg21 ? 255 : 0) + (arg8 << 8);
        field3532++;
        int var23 = (arg9 ? 255 : 0) + (arg0 << 8);
        if (arg12 != 255) {
            field3534 = -40;
        }
        int var24 = (arg20 << 8) + (arg19 ? 255 : 0);
        int var25 = (arg18 << 8) + (arg2 ? 255 : 0);
        int[] var26 = new int[arg15.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg15[var27 + var27];
            int var29 = arg15[var27 + var27 + 1];
            int[][] var30 = arg3 == null || arg10 == null || !arg10[var27] ? arg1 : arg3;
            var26[var27] = class121.method846(arg11, var30, -31999, arg3, arg7, false, var23, var28, arg4, var24, arg14, arg13, var22, (float) arg16, var29, arg6, var25, arg17);
        }
        arg6.method914(arg5, arg17, arg13, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZBIIIIIILrm;)V", line = 182)
    public static final void method1392(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class249 arg8) {
        if (arg5 >= 0 && arg5 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg0) {
                class166.field2980[arg3][arg5][arg4] = 0;
            }
            while (true) {
                int var9 = arg8.method1731(true);
                if (var9 == 0) {
                    if (arg0) {
                        class278.field4883[0][arg5][arg4] = class104.field1809[0][arg5][arg4];
                    } else if (arg3 == 0) {
                        class278.field4883[0][arg5][arg4] = -class9.method47(arg5 + arg2 + 932731, -91, arg4 + arg7 + 556238) * 8;
                    } else {
                        class278.field4883[arg3][arg5][arg4] = class278.field4883[arg3 - 1][arg5][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg8.method1731(true);
                    if (arg0) {
                        class278.field4883[0][arg5][arg4] = var10 * 8 + class104.field1809[0][arg5][arg4];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg3 == 0) {
                            class278.field4883[0][arg5][arg4] = -var10 * 8;
                        } else {
                            class278.field4883[arg3][arg5][arg4] = class278.field4883[arg3 - 1][arg5][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class327.field5586[arg3][arg5][arg4] = arg8.method1721((byte) 76);
                    class95.field1516[arg3][arg5][arg4] = (byte) ((var9 - 2) / 4);
                    class265.field4670[arg3][arg5][arg4] = (byte) class162.method1118(3, arg6 + var9 - 2);
                } else if (var9 > 81) {
                    class216.field3840[arg3][arg5][arg4] = (byte) (var9 - 81);
                } else if (!arg0) {
                    class166.field2980[arg3][arg5][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg8.method1731(true);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg8.method1731(true);
                    break;
                }
                if (var11 <= 49) {
                    arg8.method1731(true);
                }
            }
        }
        field3535++;
        int var12 = -47 % ((arg1 + 57) / 56);
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()V", line = 288)
    public final void method223() {
        GL var1 = class231.field4052;
        field3526++;
        var1.glCallList(this.field3525 + 1);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 297)
    private final void method1393(int arg0) {
        field3536++;
        GL var2 = class231.field4052;
        this.field3525 = var2.glGenLists(2);
        var2.glNewList(this.field3525, 4864);
        var2.glActiveTexture(33985);
        if (class138.field2435) {
            var2.glBindTexture(32879, class138.field2434);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field3525 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class138.field2435) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        if (arg0 == 2048) {
            var2.glDisable(3168);
            var2.glDisable(3169);
            var2.glActiveTexture(33984);
            var2.glEndList();
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()I", line = 351)
    public final int method218() {
        field3529++;
        return 0;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 361)
    public class195() {
        this.method1393(2048);
    }
}
