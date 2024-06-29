import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class325 extends class610 {

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "Lh;")
    private class609 field4801;

    @OriginalMember(owner = "client!bga", name = "n", descriptor = "Lvi;")
    private class495 field4800;

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "Luc;")
    public static class27 field4799 = new class27(4, -1);

    @OriginalMember(owner = "client!bga", name = "s", descriptor = "Z")
    public static boolean field4805 = false;

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field4809 = new String[100];

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "F")
    public static float field4802;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!bga", name = "x", descriptor = "Lml;")
    private class353 field4810;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method257(boolean arg0, int arg1) {
        if (arg1 > -19) {
            method1970(-11);
        }
        if (~super.field8473.field4283 < -1) {
            float var3 = -0.5F / (float) super.field8473.field4283;
            super.field8473.method1747(1, (byte) 108);
            class634.field8873[3] = super.field8473.field4294 * var3 + 0.25F;
            class634.field8873[2] = var3;
            class634.field8873[1] = 0.0F;
            class634.field8873[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class634.field8873, 0);
            OpenGL.glPopMatrix();
            super.field8473.method1784((float) super.field8473.field4283, 0.5F, (byte) -81);
            super.field8473.method1804(false, this.field4800);
            super.field8473.method1747(0, (byte) 108);
        }
        ++field4797;
        this.field4810.method2094((byte) 123, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)[Ll;", line = 45)
    public static final class18[] method1968(int arg0) {
        if (class273.field3857 == null) {
            class18[] var1 = class632.method3514(true, class503.field6878);
            class18[] var2 = new class18[var1.length];
            int var3 = 0;
            int var4 = class274.field3872.method2435(true, class429.field6020);
            label74: for (int var5 = 0; var5 < var1.length; ++var5) {
                class18 var9 = var1[var5];
                if ((var9.field272 <= 0 || ~var9.field272 <= -25) && ~var9.field271 <= -801 && ~var9.field270 <= -601 && (~var4 != -3 || ~var9.field271 >= -801 && ~var9.field270 >= -601) && (~var4 != -2 || ~var9.field271 >= -1025 && ~var9.field270 >= -769)) {
                    for (int var10 = 0; var3 > var10; ++var10) {
                        class18 var11 = var2[var10];
                        if (~var9.field271 == ~var11.field271 && ~var9.field270 == ~var11.field270) {
                            if (var11.field272 < var9.field272) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class273.field3857 = new class18[var3];
            class282.method1708(var2, 0, class273.field3857, 0, var3);
            int[] var6 = new int[class273.field3857.length];
            for (int var7 = 0; ~class273.field3857.length < ~var7; ++var7) {
                class18 var8 = class273.field3857[var7];
                var6[var7] = var8.field271 * var8.field270;
            }
            class603.method3343((byte) 104, var6, class273.field3857);
        }
        ++field4796;
        if (arg0 != 0) {
            field4799 = null;
        }
        return class273.field3857;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IILit;)V", line = 131)
    public final void method255(int arg0, int arg1, class591 arg2) {
        if (arg0 != 256) {
            this.method1969((byte) -103);
        }
        ++field4795;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)Z", line = 148)
    public final boolean method262(int arg0) {
        if (arg0 != -1) {
            this.method257(false, -46);
        }
        ++field4808;
        return true;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V", line = 159)
    private final void method1969(byte arg0) {
        this.field4810 = new class353(super.field8473, 2);
        ++field4798;
        this.field4810.method2097(0, -14434);
        super.field8473.method1747(1, (byte) 108);
        super.field8473.method1798(false, 260, 7681);
        super.field8473.method1797(0, (byte) 78, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field8473.method1747(0, (byte) 108);
        if (arg0 <= 68) {
            method1970(-19);
        }
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4801.field8462) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4810.method2099(6493);
        this.field4810.method2097(1, -14434);
        super.field8473.method1747(1, (byte) 108);
        super.field8473.method1798(false, 8448, 8448);
        super.field8473.method1797(0, (byte) 95, 768, 5890);
        OpenGL.glDisable(3168);
        super.field8473.method1747(0, (byte) 108);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4801.field8462) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4810.method2099(6493);
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Len;Lh;)V", line = 209)
    public class325(class289 arg0, class609 arg1) {
        super(arg0);
        this.field4801 = arg1;
        this.method1969((byte) 81);
        this.field4800 = new class495(super.field8473, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4800.method2767((byte) -37, false);
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V", line = 220)
    public final void method252(int arg0) {
        ++field4803;
        this.field4810.method2094((byte) 112, '\u0001');
        if (super.field8473.field4283 > 0) {
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            super.field8473.method1784(0.0F, 1.0F, (byte) -81);
            super.field8473.method1747(0, (byte) 108);
        }
        super.field8473.method1798(false, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        if (arg0 != 31130) {
            field4805 = true;
        }
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIB)V", line = 243)
    public final void method258(int arg0, int arg1, byte arg2) {
        if (arg2 != 70) {
            this.field4810 = null;
        }
        if ((arg1 & 1) == 1) {
            if (this.field4801.field8462) {
                super.field8473.method1804(false, this.field4801.field8468);
                class634.field8873[0] = 0.0F;
                class634.field8873[2] = 0.0F;
                class634.field8873[1] = 0.0F;
                class634.field8873[3] = (float) (super.field8473.field4221 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, class634.field8873, 0);
            } else {
                int var4 = super.field8473.field4221 % 4000 * 16 / 4000;
                super.field8473.method1804(false, this.field4801.field8465[var4]);
            }
        } else if (!this.field4801.field8462) {
            super.field8473.method1804(false, this.field4801.field8465[0]);
        } else {
            super.field8473.method1804(false, this.field4801.field8468);
            class634.field8873[3] = 0.0F;
            class634.field8873[2] = 0.0F;
            class634.field8873[1] = 0.0F;
            class634.field8873[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class634.field8873, 0);
        }
        ++field4804;
    }

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "(I)V", line = 288)
    public static void method1970(int arg0) {
        if (arg0 == 0) {
            field4799 = null;
            field4809 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZ)V", line = 299)
    public final void method254(boolean arg0, boolean arg1) {
        ++field4806;
        super.field8473.method1798(false, 8448, 260);
        if (!arg0) {
            field4799 = null;
        }
    }
}
