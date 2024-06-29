import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class199 extends class610 {

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Z")
    private boolean field2939 = false;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Z")
    private boolean field2941;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "[Lwg;")
    private class389[] field2937;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Llaa;")
    public static class106 field2932 = new class106(12, 0, 1, 0);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Z")
    public static boolean field2943 = true;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "F")
    public static float field2934;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lml;")
    private class353 field2942;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)V", line = 4)
    public final void method258(int arg0, int arg1, byte arg2) {
        ++field2929;
        if (this.field2939) {
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, this.field2937[arg1 + -1]);
            super.field8473.method1747(0, (byte) 108);
        }
        if (arg2 != 70) {
            this.field2942 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Len;)V", line = 24)
    public class199(class289 arg0) {
        super(arg0);
        if (arg0.field4325) {
            this.field2941 = ~arg0.field4326 > -4;
            int var2 = !this.field2941 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (var14 != 2) {
                                    if (var14 != 3) {
                                        if (~var14 == -5) {
                                            var15 = var11;
                                        } else {
                                            var15 = -var11;
                                        }
                                    } else {
                                        var15 = -var12;
                                    }
                                } else {
                                    var15 = var12;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field2937 = new class389[3];
            this.field2937[0] = new class389(super.field8473, 6406, 64, false, var4, 6406);
            this.field2937[1] = new class389(super.field8473, 6406, 64, false, var5, 6406);
            this.field2937[2] = new class389(super.field8473, 6406, 64, false, var3, 6406);
            this.method1344(7681);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 136)
    public final void method252(int arg0) {
        if (this.field2939) {
            if (!this.field2941) {
                super.field8473.method1747(2, (byte) 108);
                super.field8473.method1804(false, (class591) null);
            }
            super.field8473.method1747(1, (byte) 108);
            super.field8473.method1804(false, (class591) null);
            super.field8473.method1747(0, (byte) 108);
            this.field2942.method2094((byte) 124, '\u0001');
            this.field2939 = false;
        } else {
            super.field8473.method1811(770, 0, false, 5890);
        }
        ++field2944;
        if (arg0 == 31130) {
            super.field8473.method1798(false, 8448, 8448);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z", line = 165)
    public final boolean method262(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field2933;
            return true;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 180)
    public static void method1343(byte arg0) {
        if (arg0 <= 107) {
            field2932 = null;
        }
        field2932 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZZ)V", line = 200)
    public final void method254(boolean arg0, boolean arg1) {
        if (!arg0) {
            method1343((byte) -120);
        }
        super.field8473.method1798(!arg0, 7681, 8448);
        ++field2935;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V", line = 211)
    public final void method257(boolean arg0, int arg1) {
        if (this.field2942 != null && arg0) {
            if (!this.field2941) {
                super.field8473.method1747(2, (byte) 108);
                super.field8473.method1804(false, super.field8473.field4311);
                super.field8473.method1747(0, (byte) 108);
            }
            this.field2942.method2094((byte) 122, '\u0000');
            this.field2939 = true;
        } else {
            super.field8473.method1811(770, 0, false, 34168);
        }
        if (arg1 >= -19) {
            this.method258(-51, -79, (byte) -48);
        }
        ++field2940;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 237)
    private final void method1344(int arg0) {
        ++field2930;
        this.field2942 = new class353(super.field8473, 2);
        this.field2942.method2097(0, -14434);
        super.field8473.method1747(1, (byte) 108);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field2941) {
            super.field8473.method1798(false, 7681, 260);
            super.field8473.method1797(0, (byte) 83, 770, 5890);
            super.field8473.method1811(770, 0, false, 34167);
        } else {
            super.field8473.method1798(false, 8448, 7681);
            super.field8473.method1797(0, (byte) 68, 768, 34168);
            super.field8473.method1747(2, (byte) 108);
            super.field8473.method1798(false, 7681, 260);
            super.field8473.method1797(0, (byte) 123, 768, 34168);
            super.field8473.method1797(1, (byte) 105, 770, 34168);
            super.field8473.method1811(770, 0, false, 34167);
        }
        super.field8473.method1747(0, (byte) 108);
        this.field2942.method2099(6493);
        this.field2942.method2097(1, -14434);
        super.field8473.method1747(1, (byte) 108);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field2941) {
            super.field8473.method1798(false, 8448, 8448);
            super.field8473.method1797(0, (byte) 72, 768, 5890);
            super.field8473.method1811(770, 0, false, 5890);
        } else {
            super.field8473.method1798(false, 8448, 8448);
            super.field8473.method1797(0, (byte) 34, 768, 5890);
            super.field8473.method1747(2, (byte) 108);
            super.field8473.method1798(false, 8448, 8448);
            super.field8473.method1797(0, (byte) 50, 768, 5890);
            super.field8473.method1797(1, (byte) 79, 768, 34168);
            super.field8473.method1811(770, 0, false, 5890);
        }
        if (arg0 == 7681) {
            super.field8473.method1747(0, (byte) 108);
            this.field2942.method2099(6493);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILit;)V", line = 315)
    public final void method255(int arg0, int arg1, class591 arg2) {
        if (arg0 == 256) {
            ++field2936;
            super.field8473.method1804(false, arg2);
            super.field8473.method1801(arg1, 34166);
        }
    }
}
