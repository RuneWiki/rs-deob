import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class664 extends class165 {

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "Z")
    private boolean field9370 = false;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "Z")
    private boolean field9369;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "[Lrh;")
    private class633[] field9372;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "[I")
    public static int[] field9363 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "Lrj;")
    private class359 field9374;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V")
    public static void method3811(byte arg0) {
        field9363 = null;
        if (arg0 > -84) {
            field9363 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Z")
    public final boolean method672(byte arg0) {
        if (arg0 <= 11) {
            return false;
        } else {
            ++field9362;
            return true;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI)V")
    public final void method675(int arg0, byte arg1, int arg2) {
        if (this.field9370) {
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154(this.field9372[arg0 + -1], -2);
            super.field2260.method2196(0, (byte) 89);
        }
        if (arg1 >= 3) {
            ++field9367;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Z")
    public static final boolean method3812(int arg0, int arg1, int arg2) {
        ++field9371;
        if (arg0 != 256) {
            method3811((byte) -101);
        }
        return (arg1 & 256) != 0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lvj;I)Lwia;")
    public static final class679 method3813(class26 arg0, int arg1) {
        ++field9364;
        class92 var2 = class327.method1910((byte) -17)[arg0.method194((byte) 119)];
        class482 var3 = class488.method2860((byte) 107)[arg0.method194((byte) 119)];
        int var4 = arg0.method173(arg1 + 19261);
        if (arg1 != -19264) {
            method3811((byte) 28);
        }
        int var5 = arg0.method173(-3);
        int var6 = arg0.method193(2);
        int var7 = arg0.method193(2);
        int var8 = arg0.method173(-3);
        int var9 = arg0.method189(255);
        int var10 = arg0.method189(255);
        return new class679(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lep;)V")
    public class664(class371 arg0) {
        super(arg0);
        if (arg0.field5019) {
            this.field9369 = ~arg0.field5074 > -4;
            int var2 = this.field9369 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (var14 == 1) {
                            var15 = var12;
                        } else if (~var14 != -3) {
                            if (~var14 != -4) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
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
            this.field9372 = new class633[3];
            this.field9372[0] = new class633(super.field2260, 6406, 64, false, var4, 6406);
            this.field9372[1] = new class633(super.field2260, 6406, 64, false, var5, 6406);
            this.field9372[2] = new class633(super.field2260, 6406, 64, false, var3, 6406);
            this.method3814(0);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZLhl;)V")
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        ++field9368;
        super.field2260.method2154(arg2, -2);
        super.field2260.method2208(arg0, 6406);
        if (!arg1) {
            method3813((class26) null, 54);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    private final void method3814(int arg0) {
        ++field9361;
        this.field9374 = new class359(super.field2260, 2);
        this.field9374.method2024(0, 119);
        super.field2260.method2196(1, (byte) 89);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, (float) arg0);
        OpenGL.glMatrixMode(5888);
        if (this.field9369) {
            super.field2260.method2207(260, 7681, arg0 + -25248);
            super.field2260.method2202(arg0 ^ 390803672, 770, 5890, 0);
            super.field2260.method2190(0, 770, true, 34167);
        } else {
            super.field2260.method2207(7681, 8448, arg0 ^ -25248);
            super.field2260.method2202(390803672, 768, 34168, 0);
            super.field2260.method2196(2, (byte) 89);
            super.field2260.method2207(260, 7681, -25248);
            super.field2260.method2202(390803672, 768, 34168, 0);
            super.field2260.method2202(arg0 + 390803672, 770, 34168, 1);
            super.field2260.method2190(0, 770, true, 34167);
        }
        super.field2260.method2196(0, (byte) 89);
        this.field9374.method2022(0);
        this.field9374.method2024(1, 69);
        super.field2260.method2196(1, (byte) 89);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field9369) {
            super.field2260.method2207(8448, 8448, -25248);
            super.field2260.method2202(390803672, 768, 5890, 0);
            super.field2260.method2196(2, (byte) 89);
            super.field2260.method2207(8448, 8448, -25248);
            super.field2260.method2202(390803672, 768, 5890, 0);
            super.field2260.method2202(390803672, 768, 34168, 1);
            super.field2260.method2190(0, 770, true, 5890);
        } else {
            super.field2260.method2207(8448, 8448, arg0 + -25248);
            super.field2260.method2202(390803672, 768, 5890, 0);
            super.field2260.method2190(0, 770, true, 5890);
        }
        super.field2260.method2196(0, (byte) 89);
        this.field9374.method2022(arg0);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)V")
    public final void method678(boolean arg0, int arg1) {
        ++field9365;
        super.field2260.method2207(8448, 7681, -25248);
        if (arg1 != 0) {
            method3812(53, -111, -48);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZ)V")
    public final void method673(int arg0, boolean arg1) {
        ++field9373;
        if (this.field9374 != null && arg1) {
            if (!this.field9369) {
                super.field2260.method2196(2, (byte) 89);
                super.field2260.method2154(super.field2260.field5056, -2);
                super.field2260.method2196(0, (byte) 89);
            }
            this.field9374.method2021(-106, '\u0000');
            this.field9370 = true;
        } else {
            super.field2260.method2190(0, 770, true, 34168);
        }
        if (arg0 > -115) {
            this.field9370 = true;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public final void method679(byte arg0) {
        if (this.field9370) {
            if (!this.field9369) {
                super.field2260.method2196(2, (byte) 89);
                super.field2260.method2154((class396) null, -2);
            }
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154((class396) null, -2);
            super.field2260.method2196(0, (byte) 89);
            this.field9374.method2021(-112, '\u0001');
            this.field9370 = false;
        } else {
            super.field2260.method2190(0, 770, true, 5890);
        }
        if (arg0 < -97) {
            ++field9366;
            super.field2260.method2207(8448, 8448, -25248);
        }
    }
}
