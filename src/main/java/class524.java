import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class524 extends class11 {

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Z")
    private boolean field7606 = false;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "Z")
    private boolean field7609;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "[Lvda;")
    private class158[] field7608;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Z")
    public static boolean field7615 = false;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Lub;")
    private class19 field7605;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "[[I")
    public static int[][] field7604;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILpm;)V", line = 3)
    public final void method65(int arg0, int arg1, class507 arg2) {
        ++field7612;
        super.field95.method2295(-93, arg2);
        super.field95.method2288(arg0, 7681);
        if (arg1 != -1) {
            this.field7605 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V", line = 15)
    private final void method3090(int arg0) {
        ++field7603;
        this.field7605 = new class19(super.field95, 2);
        this.field7605.method121((byte) -18, 0);
        super.field95.method2269((byte) 87, arg0);
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
        if (!this.field7609) {
            super.field95.method2320(8448, 7681, arg0 + -1);
            super.field95.method2291(34168, 0, 768, (byte) -35);
            super.field95.method2269((byte) -115, 2);
            super.field95.method2320(7681, 260, 0);
            super.field95.method2291(34168, 0, 768, (byte) -35);
            super.field95.method2291(34168, 1, 770, (byte) -35);
            super.field95.method2333(770, 34167, 0, (byte) 74);
        } else {
            super.field95.method2320(7681, 260, arg0 + -1);
            super.field95.method2291(5890, 0, 770, (byte) -35);
            super.field95.method2333(770, 34167, 0, (byte) 83);
        }
        super.field95.method2269((byte) -123, 0);
        this.field7605.method124(7);
        this.field7605.method121((byte) -18, 1);
        super.field95.method2269((byte) 100, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field7609) {
            super.field95.method2320(8448, 8448, 0);
            super.field95.method2291(5890, 0, 768, (byte) -35);
            super.field95.method2333(770, 5890, 0, (byte) 56);
        } else {
            super.field95.method2320(8448, 8448, 0);
            super.field95.method2291(5890, 0, 768, (byte) -35);
            super.field95.method2269((byte) 120, 2);
            super.field95.method2320(8448, 8448, 0);
            super.field95.method2291(5890, 0, 768, (byte) -35);
            super.field95.method2291(34168, 1, 768, (byte) -35);
            super.field95.method2333(770, 5890, 0, (byte) 85);
        }
        super.field95.method2269((byte) 22, 0);
        this.field7605.method124(7);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 81)
    public final void method63(int arg0) {
        if (this.field7606) {
            if (!this.field7609) {
                super.field95.method2269((byte) -116, 2);
                super.field95.method2295(-115, (class507) null);
            }
            super.field95.method2269((byte) 13, 1);
            super.field95.method2295(-62, (class507) null);
            super.field95.method2269((byte) -95, 0);
            this.field7605.method122('\u0001', (byte) 32);
            this.field7606 = false;
        } else {
            super.field95.method2333(770, 5890, 0, (byte) 110);
        }
        ++field7607;
        super.field95.method2320(8448, 8448, 0);
        int var2 = 89 / ((arg0 - -61) / 40);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z", line = 114)
    public final boolean method68(byte arg0) {
        if (arg0 != 95) {
            this.method65(-68, 103, (class507) null);
        }
        ++field7610;
        return true;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V", line = 127)
    public static void method3091(byte arg0) {
        if (arg0 != 28) {
            field7615 = true;
        }
        field7604 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZZ)V", line = 137)
    public final void method64(boolean arg0, boolean arg1) {
        ++field7614;
        super.field95.method2320(7681, 8448, 0);
        if (!arg0) {
            this.field7609 = true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)V", line = 149)
    public final void method62(int arg0, int arg1, byte arg2) {
        if (arg2 <= 124) {
            this.method64(true, false);
        }
        if (this.field7606) {
            super.field95.method2269((byte) -3, 1);
            super.field95.method2295(-111, this.field7608[arg0 + -1]);
            super.field95.method2269((byte) 23, 0);
        }
        ++field7611;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lad;)V", line = 167)
    public class524(class362 arg0) {
        super(arg0);
        if (arg0.field5391) {
            this.field7609 = arg0.field5418 < 3;
            int var2 = !this.field7609 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (var14 == 2) {
                                    var15 = var12;
                                } else if (var14 != 3) {
                                    if (~var14 == -5) {
                                        var15 = var11;
                                    } else {
                                        var15 = -var11;
                                    }
                                } else {
                                    var15 = -var12;
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
            this.field7608 = new class158[3];
            this.field7608[0] = new class158(super.field95, 6406, 64, false, var4, 6406);
            this.field7608[1] = new class158(super.field95, 6406, 64, false, var5, 6406);
            this.field7608[2] = new class158(super.field95, 6406, 64, false, var3, 6406);
            this.method3090(1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V", line = 291)
    public final void method67(int arg0, boolean arg1) {
        ++field7613;
        if (arg0 < 115) {
            this.method67(-119, true);
        }
        if (this.field7605 != null && arg1) {
            if (!this.field7609) {
                super.field95.method2269((byte) 4, 2);
                super.field95.method2295(-89, super.field95.field5435);
                super.field95.method2269((byte) -115, 0);
            }
            this.field7605.method122('\u0000', (byte) 125);
            this.field7606 = true;
        } else {
            super.field95.method2333(770, 34168, 0, (byte) 92);
        }
    }
}
