import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class248 extends class460 {

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "Ldk;")
    private class477 field3192;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "Lwf;")
    private class125 field3198;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "Lws;")
    public static class333 field3191 = new class333();

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "[I")
    public static int[] field3196 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "Lqda;")
    private class93 field3195;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
    public static void method1481(int arg0) {
        field3196 = null;
        field3191 = null;
        if (arg0 != -29140) {
            field3196 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        ++field3203;
        if (arg1 == -32460) {
            if (super.field5744.field7701 > 0) {
                float var3 = -0.5F / (float) super.field5744.field7701;
                super.field5744.method3126(1, -82);
                class223.field2621[2] = var3;
                class223.field2621[3] = super.field5744.field7723 * var3 + 0.25F;
                class223.field2621[0] = 0.0F;
                class223.field2621[1] = 0.0F;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class223.field2621, 0);
                OpenGL.glPopMatrix();
                super.field5744.method3166(0, 0.5F, (float) super.field5744.field7701);
                super.field5744.method3194((byte) 75, this.field3198);
                super.field5744.method3126(0, -96);
            }
            this.field3195.method688((byte) 124, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (arg2 > -110) {
            this.field3192 = null;
        }
        ++field3199;
        if ((1 & arg0) != 1) {
            if (!this.field3192.field5943) {
                super.field5744.method3194((byte) 75, this.field3192.field5937[0]);
            } else {
                super.field5744.method3194((byte) 75, this.field3192.field5935);
                class223.field2621[3] = 0.0F;
                class223.field2621[2] = 0.0F;
                class223.field2621[1] = 0.0F;
                class223.field2621[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class223.field2621, 0);
            }
        } else if (!this.field3192.field5943) {
            int var4 = super.field5744.field7595 % 4000 * 16 / 4000;
            super.field5744.method3194((byte) 75, this.field3192.field5937[var4]);
        } else {
            super.field5744.method3194((byte) 75, this.field3192.field5935);
            class223.field2621[1] = 0.0F;
            class223.field2621[0] = 0.0F;
            class223.field2621[2] = 0.0F;
            class223.field2621[3] = (float) (super.field5744.field7595 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, class223.field2621, 0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
    private final void method1482(int arg0) {
        ++field3194;
        this.field3195 = new class93(super.field5744, 2);
        this.field3195.method684(0, (byte) -127);
        super.field5744.method3126(1, -126);
        super.field5744.method3185(7681, arg0, (byte) 105);
        super.field5744.method3175(34168, arg0 ^ 261, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5744.method3126(0, -82);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3192.field5943) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field3195.method690(true);
        this.field3195.method684(1, (byte) -126);
        super.field5744.method3126(1, -73);
        super.field5744.method3185(8448, 8448, (byte) 93);
        super.field5744.method3175(5890, 1, 0, 768);
        OpenGL.glDisable(3168);
        super.field5744.method3126(0, -68);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3192.field5943) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field3195.method690(true);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        ++field3201;
        int var4 = -12 % ((arg1 - 25) / 59);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        if (arg0 < 100) {
            field3191 = null;
        }
        super.field5744.method3185(260, 8448, (byte) 115);
        ++field3202;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1483(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3190;
        if (arg2 > -19) {
            field3191 = null;
        }
        int var7 = class654.method3659(-7690, arg1, class377.field4848, class125.field1524);
        int var8 = class654.method3659(-7690, arg6, class377.field4848, class125.field1524);
        int var9 = class654.method3659(-7690, arg5, class337.field4186, class292.field3700);
        int var10 = class654.method3659(-7690, arg0, class337.field4186, class292.field3700);
        int var11 = class654.method3659(-7690, arg1 + arg4, class377.field4848, class125.field1524);
        int var12 = class654.method3659(-7690, -arg4 + arg6, class377.field4848, class125.field1524);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class390.method2223(var9, arg3, class30.field364[var13], (byte) -63, var10);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class390.method2223(var9, arg3, class30.field364[var14], (byte) -100, var10);
        }
        int var15 = class654.method3659(-7690, arg5 - -arg4, class337.field4186, class292.field3700);
        int var16 = class654.method3659(-7690, -arg4 + arg0, class337.field4186, class292.field3700);
        for (int var17 = var11; var12 >= var17; ++var17) {
            int[] var18 = class30.field364[var17];
            class390.method2223(var9, arg3, var18, (byte) -72, var15);
            class390.method2223(var16, arg3, var18, (byte) -111, var10);
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        ++field3197;
        return arg0 != -24566 ? true : true;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        if (arg0 != 0) {
            field3191 = null;
        }
        this.field3195.method688((byte) 112, '\u0001');
        ++field3200;
        if (~super.field5744.field7701 < -1) {
            super.field5744.method3126(1, -78);
            super.field5744.method3194((byte) 75, (class185) null);
            super.field5744.method3166(arg0, 1.0F, 0.0F);
            super.field5744.method3126(0, -92);
        }
        super.field5744.method3185(8448, 8448, (byte) -75);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Ljaa;Ldk;)V")
    public class248(class576 arg0, class477 arg1) {
        super(arg0);
        this.field3192 = arg1;
        this.method1482(260);
        this.field3198 = new class125(super.field5744, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3198.method827(false, -99);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1484(String arg0, int arg1) {
        ++field3193;
        if (!class72.field941.field5919) {
            return -1;
        } else if (class186.field2190.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class164.method1001(arg0, arg1 + 1758845477);
            if (var2 == null) {
                return -1;
            } else {
                String var3 = class413.field5287 + var2;
                if (!class340.field4339.method1663(arg1 ^ -8581, var3, "")) {
                    return -1;
                } else if (!class340.field4339.method1640(-21656, var3)) {
                    return class340.field4339.method1643(var3, true);
                } else {
                    byte[] var4 = class340.field4339.method1649(-1, "", var3);
                    File var5 = class31.method207(16, var2);
                    if (arg1 != 8580) {
                        return 11;
                    } else if (var4 != null && var5 != null) {
                        boolean var6 = true;
                        byte[] var7 = class569.method3020((byte) -120, var5);
                        if (var7 != null && var4.length == var7.length) {
                            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                                if (~var4[var8] != ~var7[var8]) {
                                    var6 = false;
                                    break;
                                }
                            }
                        } else {
                            var6 = false;
                        }
                        try {
                            if (!var6) {
                                class72.field941.method2587(-27251, var5, var4);
                            }
                        } catch (Throwable var9) {
                            return -1;
                        }
                        class185.method1098(arg0, var5, arg1 ^ -8654);
                        return 100;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }
}
