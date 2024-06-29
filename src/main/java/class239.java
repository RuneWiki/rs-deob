import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class239 extends class457 {

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Lmc;")
    private class88 field3355;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Lih;")
    private class492 field3357;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "Z")
    public static boolean field3361 = false;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Lwu;")
    public static class251 field3360 = new class251();

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "[I")
    public static int[] field3363;

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lef;Lmc;)V", line = 4)
    public class239(class338 arg0, class88 arg1) {
        super(arg0);
        this.field3355 = arg1;
        this.field3357 = new class492(arg0, 2);
        this.field3357.method2884(4864, 0);
        super.field6706.method1950(-29847, 1);
        if (this.field3355.field1289) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6706.method1950(-29847, 0);
        this.field3357.method2883(-30137);
        this.field3357.method2884(4864, 1);
        super.field6706.method1950(-29847, 1);
        if (this.field3355.field1289) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6706.method1950(-29847, 0);
        this.field3357.method2883(-30137);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lmk;II)V", line = 38)
    public final void method431(class40 arg0, int arg1, int arg2) {
        super.field6706.method1996(2, arg0);
        if (arg1 != 384) {
            method1459(-110);
        }
        ++field3356;
        super.field6706.method1974(arg2, 4609);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIII[BI)Z", line = 51)
    public static final boolean method1458(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        ++field3354;
        boolean var6 = true;
        if (arg5 > -123) {
            field3361 = false;
        }
        class391 var7 = new class391(arg4);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method2322((byte) 83);
            if (~var9 == -1) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2332(2);
                    if (~var13 == -1) {
                        continue label58;
                    }
                    var10 += var13 + -1;
                    int var14 = 63 & var10;
                    int var15 = (4076 & var10) >> 6;
                    int var16 = var7.method2348(-2) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = arg1 + var14;
                    if (var17 > 0 && ~var18 < -1 && var17 < arg3 + -1 && arg2 + -1 > var18) {
                        class220 var19 = class78.field1141.method2103(var8, true);
                        if (~var16 != -23 || class20.field269.field7649 || var19.field3119 != 0 || ~var19.field3146 == -2 || var19.field3144) {
                            var11 = true;
                            if (!var19.method1366((byte) -113)) {
                                var6 = false;
                                ++class445.field6556;
                            }
                        }
                    }
                }
                int var12 = var7.method2332(2);
                if (var12 == 0) {
                    break;
                }
                var7.method2348(-2);
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)V", line = 135)
    public static void method1459(int arg0) {
        field3363 = null;
        if (arg0 == 0) {
            field3360 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIZ)V", line = 150)
    public final void method430(int arg0, int arg1, boolean arg2) {
        ++field3353;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) (((29 & arg1) >> 3) + 1) * 5.0E-4F;
        if (arg2) {
            this.method435(true, (byte) 62);
        }
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        super.field6706.method1950(-29847, 1);
        boolean var7 = (128 & arg1) != 0;
        if (!var7) {
            class169.field2525[1] = 0.0F;
            class169.field2525[0] = 0.0F;
            class169.field2525[2] = var6;
            class169.field2525[3] = 0.0F;
        } else {
            class169.field2525[1] = 0.0F;
            class169.field2525[2] = 0.0F;
            class169.field2525[0] = var6;
            class169.field2525[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class169.field2525, 0);
        class169.field2525[1] = var6;
        class169.field2525[0] = 0.0F;
        class169.field2525[3] = (float) super.field6706.field4743 * var4 % 1.0F;
        class169.field2525[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class169.field2525, 0);
        if (!this.field3355.field1289) {
            int var8 = (int) ((float) super.field6706.field4743 * var5 * 16.0F);
            super.field6706.method1996(2, this.field3355.field1286[var8 % 16]);
        } else {
            class169.field2525[1] = 0.0F;
            class169.field2525[3] = (float) super.field6706.field4743 * var5 % 1.0F;
            class169.field2525[0] = 0.0F;
            class169.field2525[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class169.field2525, 0);
        }
        super.field6706.method1950(-29847, 0);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Z", line = 210)
    public final boolean method429(int arg0) {
        if (arg0 != 0) {
            this.field3355 = null;
        }
        ++field3364;
        return true;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 221)
    public final void method433(byte arg0) {
        this.field3357.method2881(0, '\u0001');
        ++field3358;
        super.field6706.method1950(-29847, 1);
        super.field6706.method1996(arg0 + -6, (class40) null);
        if (arg0 == 8) {
            super.field6706.method1950(-29847, 0);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V", line = 235)
    public final void method434(int arg0, boolean arg1) {
        ++field3359;
        this.field3357.method2881(0, '\u0000');
        if (arg0 == 28037) {
            if (this.field3355.field1289) {
                super.field6706.method1950(-29847, 1);
                super.field6706.method1996(2, this.field3355.field1283);
                super.field6706.method1950(-29847, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZB)V", line = 257)
    public final void method435(boolean arg0, byte arg1) {
        ++field3362;
        if (arg1 < 32) {
            this.method435(true, (byte) -83);
        }
    }
}
