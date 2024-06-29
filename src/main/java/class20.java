import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 extends class497 {

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Z")
    private boolean field283 = false;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Z")
    private boolean field285;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[Lefa;")
    private class196[] field293;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lmga;")
    public static class739 field289 = new class739(49, 8);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lpba;")
    private class352 field292;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZ)I")
    public static final int method156(int arg0, int arg1, int arg2, boolean arg3) {
        ++field284;
        int var4 = arg1 & 3;
        if (var4 == 0) {
            return arg2;
        } else {
            if (!arg3) {
                field289 = null;
            }
            if (~var4 == -2) {
                return -arg0 + 4095;
            } else {
                return ~var4 == -3 ? -arg2 + 4095 : arg0;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Z")
    public final boolean method157(int arg0) {
        if (arg0 != -6808) {
            return true;
        } else {
            ++field291;
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILil;I)V")
    public final void method158(int arg0, class7 arg1, int arg2) {
        if (arg0 != 9) {
            this.field293 = null;
        }
        super.field6867.method1653((byte) 124, arg1);
        ++field294;
        super.field6867.method1589(arg0 ^ -11, arg2);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public static void method159(int arg0) {
        field289 = null;
        if (arg0 <= 80) {
            method159(17);
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    private final void method160(int arg0) {
        this.field292 = new class352(super.field6867, 2);
        ++field286;
        this.field292.method2218(0, false);
        super.field6867.method1637(33984, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        int var2 = 92 / ((arg0 - -58) / 41);
        OpenGL.glMatrixMode(5888);
        if (!this.field285) {
            super.field6867.method1622(8448, 7681, (byte) 126);
            super.field6867.method1641(34168, 768, 0, 34192);
            super.field6867.method1637(33984, 2);
            super.field6867.method1622(7681, 260, (byte) -76);
            super.field6867.method1641(34168, 768, 0, 34192);
            super.field6867.method1641(34168, 770, 1, 34192);
            super.field6867.method1657((byte) 90, 770, 0, 34167);
        } else {
            super.field6867.method1622(7681, 260, (byte) 9);
            super.field6867.method1641(5890, 770, 0, 34192);
            super.field6867.method1657((byte) 90, 770, 0, 34167);
        }
        super.field6867.method1637(33984, 0);
        this.field292.method2220(27294);
        this.field292.method2218(1, false);
        super.field6867.method1637(33984, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field285) {
            super.field6867.method1622(8448, 8448, (byte) 127);
            super.field6867.method1641(5890, 768, 0, 34192);
            super.field6867.method1637(33984, 2);
            super.field6867.method1622(8448, 8448, (byte) -73);
            super.field6867.method1641(5890, 768, 0, 34192);
            super.field6867.method1641(34168, 768, 1, 34192);
            super.field6867.method1657((byte) 90, 770, 0, 5890);
        } else {
            super.field6867.method1622(8448, 8448, (byte) -124);
            super.field6867.method1641(5890, 768, 0, 34192);
            super.field6867.method1657((byte) 90, 770, 0, 5890);
        }
        super.field6867.method1637(33984, 0);
        this.field292.method2220(27294);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ldia;)V")
    public class20(class246 arg0) {
        super(arg0);
        if (arg0.field3672) {
            this.field285 = ~arg0.field3605 > -4;
            int var2 = this.field285 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 == -2) {
                                var15 = var12;
                            } else if (~var14 == -3) {
                                var15 = var13;
                            } else if (~var14 != -4) {
                                if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = -var12;
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
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field293 = new class196[3];
            this.field293[0] = new class196(super.field6867, 6406, 64, false, var4, 6406);
            this.field293[1] = new class196(super.field6867, 6406, 64, false, var5, 6406);
            this.field293[2] = new class196(super.field6867, 6406, 64, false, var3, 6406);
            this.method160(59);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    public final void method161(int arg0) {
        ++field295;
        if (!this.field283) {
            super.field6867.method1657((byte) 90, 770, 0, 5890);
        } else {
            if (!this.field285) {
                super.field6867.method1637(33984, 2);
                super.field6867.method1653((byte) 77, (class7) null);
            }
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 107, (class7) null);
            super.field6867.method1637(33984, 0);
            this.field292.method2219('\u0001', (byte) -89);
            this.field283 = false;
        }
        super.field6867.method1622(8448, 8448, (byte) 26);
        if (arg0 != -1756) {
            method156(-9, 38, -40, false);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
    public final void method162(int arg0, int arg1, int arg2) {
        ++field290;
        if (this.field283) {
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 93, this.field293[arg1 + -1]);
            super.field6867.method1637(33984, 0);
        }
        if (arg0 < 122) {
            this.field285 = false;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(ZZ)V")
    public final void method163(boolean arg0, boolean arg1) {
        ++field298;
        if (arg1) {
            this.method160(-7);
        }
        if (this.field292 != null && arg0) {
            if (!this.field285) {
                super.field6867.method1637(33984, 2);
                super.field6867.method1653((byte) 81, super.field6867.field3637);
                super.field6867.method1637(33984, 0);
            }
            this.field292.method2219('\u0000', (byte) -89);
            this.field283 = true;
        } else {
            super.field6867.method1657((byte) 90, 770, 0, 34168);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
    public final void method164(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method159(-105);
        }
        ++field297;
        super.field6867.method1622(7681, 8448, (byte) -68);
    }
}
