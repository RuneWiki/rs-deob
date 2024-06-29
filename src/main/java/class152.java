import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class152 extends class263 {

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "Z")
    private boolean field2439 = false;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
    private boolean field2429;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "[Lsl;")
    private class304[] field2435;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "Lnd;")
    public static class366 field2436 = new class366(10, 2);

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "Lkq;")
    private class403 field2438;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[[Lja;")
    public static class174[][] field2427;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Z")
    public final boolean method675(int arg0) {
        if (arg0 > -112) {
            this.method670((byte) 124);
        }
        ++field2433;
        return true;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public final void method670(byte arg0) {
        if (arg0 == -94) {
            if (!this.field2439) {
                super.field3984.method2575((byte) -109, 5890, 770, 0);
            } else {
                if (!this.field2429) {
                    super.field3984.method2582((byte) 118, 2);
                    super.field3984.method2586((class194) null, false);
                }
                super.field3984.method2582((byte) -29, 1);
                super.field3984.method2586((class194) null, false);
                super.field3984.method2582((byte) -42, 0);
                this.field2438.method2392((byte) 0, '\u0001');
                this.field2439 = false;
            }
            ++field2437;
            super.field3984.method2624((byte) 107, 8448, 8448);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lce;IZ)V")
    public final void method671(class194 arg0, int arg1, boolean arg2) {
        ++field2432;
        super.field3984.method2586(arg0, false);
        if (!arg2) {
            field2427 = null;
        }
        super.field3984.method2610(0, arg1);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lbl;)V")
    public class152(class442 arg0) {
        super(arg0);
        if (arg0.field6819) {
            this.field2429 = ~arg0.field6762 > -4;
            int var2 = this.field2429 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 == 1) {
                                var15 = var13;
                            } else if (~var14 != -3) {
                                if (var14 != 3) {
                                    if (var14 == 4) {
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
            this.field2435 = new class304[3];
            this.field2435[0] = new class304(super.field3984, 6406, 64, false, var4, 6406);
            this.field2435[1] = new class304(super.field3984, 6406, 64, false, var5, 6406);
            this.field2435[2] = new class304(super.field3984, 6406, 64, false, var3, 6406);
            this.method980(260);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
    public final void method673(int arg0, int arg1, int arg2) {
        ++field2430;
        if (arg2 == 6908) {
            if (this.field2439) {
                super.field3984.method2582((byte) 117, 1);
                super.field3984.method2586(this.field2435[arg0 - 1], false);
                super.field3984.method2582((byte) 121, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
    public static void method979(int arg0) {
        field2427 = null;
        field2436 = null;
        if (arg0 != 12770) {
            method979(122);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V")
    public final void method669(boolean arg0, byte arg1) {
        int var3 = 113 / ((arg1 - 24) / 34);
        ++field2431;
        if (this.field2438 != null && arg0) {
            if (!this.field2429) {
                super.field3984.method2582((byte) -106, 2);
                super.field3984.method2586(super.field3984.field6728, false);
                super.field3984.method2582((byte) -34, 0);
            }
            this.field2438.method2392((byte) 0, '\u0000');
            this.field2439 = true;
        } else {
            super.field3984.method2575((byte) -96, 34168, 770, 0);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)V")
    public final void method666(int arg0, boolean arg1) {
        ++field2440;
        if (arg0 != -2560) {
            field2427 = null;
        }
        super.field3984.method2624((byte) 107, 7681, 8448);
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V")
    private final void method980(int arg0) {
        this.field2438 = new class403(super.field3984, 2);
        ++field2428;
        this.field2438.method2390(0, -32245);
        super.field3984.method2582((byte) 17, 1);
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
        if (this.field2429) {
            super.field3984.method2624((byte) 107, 7681, 260);
            super.field3984.method2597(5890, (byte) 91, 770, 0);
            super.field3984.method2575((byte) -117, 34167, 770, 0);
        } else {
            super.field3984.method2624((byte) 107, 8448, 7681);
            super.field3984.method2597(34168, (byte) -96, 768, 0);
            super.field3984.method2582((byte) 115, 2);
            super.field3984.method2624((byte) 107, 7681, 260);
            super.field3984.method2597(34168, (byte) 114, 768, 0);
            super.field3984.method2597(34168, (byte) -107, 770, 1);
            super.field3984.method2575((byte) -99, 34167, 770, 0);
        }
        super.field3984.method2582((byte) -88, 0);
        this.field2438.method2391(arg0 ^ -372);
        this.field2438.method2390(1, -32245);
        super.field3984.method2582((byte) -84, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        if (arg0 == 260) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field2429) {
                super.field3984.method2624((byte) 107, 8448, 8448);
                super.field3984.method2597(5890, (byte) 101, 768, 0);
                super.field3984.method2575((byte) -116, 5890, 770, 0);
            } else {
                super.field3984.method2624((byte) 107, 8448, 8448);
                super.field3984.method2597(5890, (byte) -27, 768, 0);
                super.field3984.method2582((byte) 113, 2);
                super.field3984.method2624((byte) 107, 8448, 8448);
                super.field3984.method2597(5890, (byte) 107, 768, 0);
                super.field3984.method2597(34168, (byte) -99, 768, 1);
                super.field3984.method2575((byte) -64, 5890, 770, 0);
            }
            super.field3984.method2582((byte) 126, 0);
            this.field2438.method2391(arg0 + -332);
        }
    }
}
