import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class190 extends class187 {

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "Z")
    private boolean field2928 = false;

    @OriginalMember(owner = "client!dca", name = "s", descriptor = "Z")
    private boolean field2924;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "[Lbja;")
    private class34[] field2922;

    @OriginalMember(owner = "client!dca", name = "t", descriptor = "Lvl;")
    public static class15 field2925 = new class15(15, 3);

    @OriginalMember(owner = "client!dca", name = "x", descriptor = "I")
    public static int field2929 = -1;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!dca", name = "u", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!dca", name = "v", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!dca", name = "y", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "Lcga;")
    private class509 field2923;

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lhk;)V")
    public class190(class111 arg0) {
        super(arg0);
        if (arg0.field2045) {
            this.field2924 = arg0.field2059 < 3;
            int var2 = this.field2924 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 == 1) {
                                var15 = var12;
                            } else if (var14 == 2) {
                                var15 = var13;
                            } else if (var14 == 3) {
                                var15 = -var13;
                            } else if (~var14 == -5) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field2922 = new class34[3];
            this.field2922[0] = new class34(super.field2885, 6406, 64, false, var4, 6406);
            this.field2922[1] = new class34(super.field2885, 6406, 64, false, var5, 6406);
            this.field2922[2] = new class34(super.field2885, 6406, 64, false, var3, 6406);
            this.method1396(true);
        }
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)V")
    public static void method1395(int arg0) {
        int var1 = 23 / ((arg0 - 32) / 45);
        field2925 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V")
    public final void method172(int arg0, boolean arg1) {
        ++field2926;
        super.field2885.method990(8448, 7681, -29641);
        if (arg0 < 56) {
            this.method170(-22, false, 118);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        if (arg0 != 20220) {
            this.field2928 = false;
        }
        ++field2919;
        return true;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        ++field2917;
        if (!this.field2928) {
            super.field2885.method980(0, 5890, true, 770);
        } else {
            if (!this.field2924) {
                super.field2885.method1002(2, -5172);
                super.field2885.method939((class18) null, 8448);
            }
            super.field2885.method1002(1, -5172);
            super.field2885.method939((class18) null, 8448);
            super.field2885.method1002(0, -5172);
            this.field2923.method2906('\u0001', 121);
            this.field2928 = false;
        }
        if (!arg0) {
            this.field2923 = null;
        }
        super.field2885.method990(8448, 8448, -29641);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZI)V")
    public final void method170(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field2929 = -85;
        }
        if (this.field2928) {
            super.field2885.method1002(1, -5172);
            super.field2885.method939(this.field2922[arg0 + -1], 8448);
            super.field2885.method1002(0, -5172);
        }
        ++field2918;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IBLqk;)V")
    public final void method167(int arg0, byte arg1, class18 arg2) {
        if (arg1 == -126) {
            super.field2885.method939(arg2, 8448);
            ++field2927;
            super.field2885.method999(true, arg0);
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(Z)V")
    private final void method1396(boolean arg0) {
        this.field2923 = new class509(super.field2885, 2);
        ++field2920;
        this.field2923.method2902(0, 4864);
        super.field2885.method1002(1, -5172);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        if (arg0) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (!this.field2924) {
                super.field2885.method990(7681, 8448, -29641);
                super.field2885.method988(34168, 6, 0, 768);
                super.field2885.method1002(2, -5172);
                super.field2885.method990(260, 7681, -29641);
                super.field2885.method988(34168, 6, 0, 768);
                super.field2885.method988(34168, 6, 1, 770);
                super.field2885.method980(0, 34167, arg0, 770);
            } else {
                super.field2885.method990(260, 7681, -29641);
                super.field2885.method988(5890, 6, 0, 770);
                super.field2885.method980(0, 34167, true, 770);
            }
            super.field2885.method1002(0, -5172);
            this.field2923.method2901(4);
            this.field2923.method2902(1, 4864);
            super.field2885.method1002(1, -5172);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field2924) {
                super.field2885.method990(8448, 8448, -29641);
                super.field2885.method988(5890, 6, 0, 768);
                super.field2885.method980(0, 5890, arg0, 770);
            } else {
                super.field2885.method990(8448, 8448, -29641);
                super.field2885.method988(5890, 6, 0, 768);
                super.field2885.method1002(2, -5172);
                super.field2885.method990(8448, 8448, -29641);
                super.field2885.method988(5890, 6, 0, 768);
                super.field2885.method988(34168, 6, 1, 768);
                super.field2885.method980(0, 5890, true, 770);
            }
            super.field2885.method1002(0, -5172);
            this.field2923.method2901(4);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZB)V")
    public final void method168(boolean arg0, byte arg1) {
        int var3 = -60 % ((arg1 - 36) / 48);
        if (this.field2923 != null && arg0) {
            if (!this.field2924) {
                super.field2885.method1002(2, -5172);
                super.field2885.method939(super.field2885.field1973, 8448);
                super.field2885.method1002(0, -5172);
            }
            this.field2923.method2906('\u0000', 71);
            this.field2928 = true;
        } else {
            super.field2885.method980(0, 34168, true, 770);
        }
        ++field2921;
    }
}
