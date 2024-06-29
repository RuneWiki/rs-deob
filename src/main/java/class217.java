import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class217 extends class182 {

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
    private boolean field2851 = false;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "Z")
    private boolean field2847;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "[Ld;")
    private class327[] field2848;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "Lvu;")
    public static class204 field2853 = new class204();

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Lcl;")
    private class75 field2843;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZZ)V")
    public final void method84(boolean arg0, boolean arg1) {
        if (this.field2843 != null && arg1) {
            if (!this.field2847) {
                super.field2540.method2625(20296, 2);
                super.field2540.method2627(120, super.field2540.field6480);
                super.field2540.method2625(20296, 0);
            }
            this.field2843.method412('\u0000', -104);
            this.field2851 = true;
        } else {
            super.field2540.method2637(770, -513, 0, 34168);
        }
        ++field2849;
        if (!arg0) {
            this.method79(false, 93);
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V")
    public static void method1377(byte arg0) {
        field2853 = null;
        if (arg0 != 22) {
            method1377((byte) 11);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILvfa;B)V")
    public final void method83(int arg0, class262 arg1, byte arg2) {
        if (arg2 > 87) {
            ++field2844;
            super.field2540.method2627(114, arg1);
            super.field2540.method2650((byte) -38, arg0);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V")
    public final void method81(int arg0, int arg1, int arg2) {
        ++field2845;
        if (arg0 != 2) {
            this.field2847 = true;
        }
        if (this.field2851) {
            super.field2540.method2625(20296, 1);
            super.field2540.method2627(arg0 + 47, this.field2848[arg2 + -1]);
            super.field2540.method2625(20296, 0);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
    private final void method1378(int arg0) {
        this.field2843 = new class75(super.field2540, 2);
        ++field2846;
        this.field2843.method414((byte) 126, 0);
        super.field2540.method2625(20296, 1);
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
        if (!this.field2847) {
            super.field2540.method2669(8448, -123, 7681);
            super.field2540.method2636(0, 768, 34168, -114);
            super.field2540.method2625(20296, 2);
            super.field2540.method2669(7681, 54, 260);
            super.field2540.method2636(0, 768, 34168, -105);
            super.field2540.method2636(1, 770, 34168, -114);
            super.field2540.method2637(770, -513, 0, 34167);
        } else {
            super.field2540.method2669(7681, 91, 260);
            super.field2540.method2636(0, 770, 5890, -97);
            super.field2540.method2637(770, -513, 0, 34167);
        }
        super.field2540.method2625(20296, 0);
        this.field2843.method415(false);
        this.field2843.method414((byte) 126, 1);
        super.field2540.method2625(20296, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field2847) {
            super.field2540.method2669(8448, -107, 8448);
            super.field2540.method2636(0, 768, 5890, -99);
            super.field2540.method2625(20296, 2);
            super.field2540.method2669(8448, 9, 8448);
            super.field2540.method2636(0, 768, 5890, -112);
            super.field2540.method2636(1, 768, 34168, -118);
            super.field2540.method2637(770, -513, 0, 5890);
        } else {
            super.field2540.method2669(8448, -98, 8448);
            super.field2540.method2636(0, 768, 5890, -106);
            super.field2540.method2637(770, -513, 0, 5890);
        }
        int var2 = 106 % ((-73 - arg0) / 35);
        super.field2540.method2625(20296, 0);
        this.field2843.method415(false);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        if (!this.field2851) {
            super.field2540.method2637(770, -513, 0, 5890);
        } else {
            if (!this.field2847) {
                super.field2540.method2625(20296, 2);
                super.field2540.method2627(103, (class262) null);
            }
            super.field2540.method2625(20296, 1);
            super.field2540.method2627(81, (class262) null);
            super.field2540.method2625(20296, 0);
            this.field2843.method412('\u0001', -117);
            this.field2851 = false;
        }
        if (arg0 == 26813) {
            ++field2850;
            super.field2540.method2669(8448, -120, 8448);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z")
    public final boolean method77(byte arg0) {
        if (arg0 != -96) {
            this.field2847 = true;
        }
        ++field2852;
        return true;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lag;)V")
    public class217(class469 arg0) {
        super(arg0);
        if (arg0.field6446) {
            this.field2847 = ~arg0.field6503 > -4;
            int var2 = !this.field2847 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 == -4) {
                                var15 = -var12;
                            } else if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
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
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field2848 = new class327[3];
            this.field2848[0] = new class327(super.field2540, 6406, 64, false, var4, 6406);
            this.field2848[1] = new class327(super.field2540, 6406, 64, false, var5, 6406);
            this.field2848[2] = new class327(super.field2540, 6406, 64, false, var3, 6406);
            this.method1378(32);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)V")
    public final void method79(boolean arg0, int arg1) {
        ++field2854;
        if (arg1 > -21) {
            this.field2851 = true;
        }
        super.field2540.method2669(7681, -118, 8448);
    }
}
