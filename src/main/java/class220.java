import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class220 extends class318 {

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Z")
    private boolean field3618 = false;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Z")
    private boolean field3613;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[Lgl;")
    private class428[] field3610;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field3611 = 0;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "[I")
    public static int[] field3617 = new int[2];

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "F")
    public static float field3615;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lrn;")
    private class178 field3612;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
    private final void method1582(byte arg0) {
        ++field3605;
        if (arg0 == 53) {
            this.field3612 = new class178(super.field4800, 2);
            this.field3612.method1192(0, (byte) 105);
            super.field4800.method1307(1, (byte) 92);
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
            if (!this.field3613) {
                super.field4800.method1242(34162, 8448, 7681);
                super.field4800.method1266(768, 0, 34168, 8960);
                super.field4800.method1307(2, (byte) 92);
                super.field4800.method1242(34162, 7681, 260);
                super.field4800.method1266(768, 0, 34168, 8960);
                super.field4800.method1266(770, 1, 34168, arg0 + 8907);
                super.field4800.method1296(770, 34167, 0, (byte) -64);
            } else {
                super.field4800.method1242(34162, 7681, 260);
                super.field4800.method1266(770, 0, 5890, 8960);
                super.field4800.method1296(770, 34167, 0, (byte) 63);
            }
            super.field4800.method1307(0, (byte) 92);
            this.field3612.method1196(124);
            this.field3612.method1192(1, (byte) 75);
            super.field4800.method1307(1, (byte) 92);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field3613) {
                super.field4800.method1242(34162, 8448, 8448);
                super.field4800.method1266(768, 0, 5890, arg0 ^ 9013);
                super.field4800.method1307(2, (byte) 92);
                super.field4800.method1242(34162, 8448, 8448);
                super.field4800.method1266(768, 0, 5890, 8960);
                super.field4800.method1266(768, 1, 34168, 8960);
                super.field4800.method1296(770, 5890, 0, (byte) -107);
            } else {
                super.field4800.method1242(34162, 8448, 8448);
                super.field4800.method1266(768, 0, 5890, 8960);
                super.field4800.method1296(770, 5890, 0, (byte) -90);
            }
            super.field4800.method1307(0, (byte) 92);
            this.field3612.method1196(114);
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lkd;)V")
    public class220(class188 arg0) {
        super(arg0);
        if (arg0.field3069) {
            this.field3613 = ~arg0.field3097 > -4;
            int var2 = this.field3613 ? 48 : 127;
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
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 != 2) {
                                if (~var14 == -4) {
                                    var15 = -var12;
                                } else if (~var14 == -5) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
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
            this.field3610 = new class428[3];
            this.field3610[0] = new class428(super.field4800, 6406, 64, false, var4, 6406);
            this.field3610[1] = new class428(super.field4800, 6406, 64, false, var5, 6406);
            this.field3610[2] = new class428(super.field4800, 6406, 64, false, var3, 6406);
            this.method1582((byte) 53);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lav;IB)V")
    public final void method715(class454 arg0, int arg1, byte arg2) {
        ++field3608;
        super.field4800.method1289(-19391, arg0);
        super.field4800.method1248(arg1, true);
        if (arg2 > -108) {
            this.field3613 = true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public final void method723(byte arg0) {
        ++field3603;
        if (arg0 <= 91) {
            this.method721(24);
        }
        if (!this.field3618) {
            super.field4800.method1296(770, 5890, 0, (byte) -70);
        } else {
            if (!this.field3613) {
                super.field4800.method1307(2, (byte) 92);
                super.field4800.method1289(-19391, (class454) null);
            }
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            super.field4800.method1307(0, (byte) 92);
            this.field3612.method1191('\u0001', (byte) -100);
            this.field3618 = false;
        }
        super.field4800.method1242(34162, 8448, 8448);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
    public final void method722(int arg0, boolean arg1) {
        super.field4800.method1242(34162, 7681, 8448);
        int var3 = 3 / ((-23 - arg0) / 46);
        ++field3616;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method1583(int arg0) {
        if (arg0 > 24) {
            field3617 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public static final void method1584(int arg0) {
        class446.field6540.method93((byte) 121);
        ++field3607;
        int var1 = -92 / ((68 - arg0) / 38);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
    public final boolean method721(int arg0) {
        ++field3604;
        return arg0 != 0 ? true : true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZ)V")
    public final void method718(boolean arg0, boolean arg1) {
        if (this.field3612 != null && arg0) {
            if (!this.field3613) {
                super.field4800.method1307(2, (byte) 92);
                super.field4800.method1289(-19391, super.field4800.field3068);
                super.field4800.method1307(0, (byte) 92);
            }
            this.field3612.method1191('\u0000', (byte) 103);
            this.field3618 = true;
        } else {
            super.field4800.method1296(770, 34168, 0, (byte) -51);
        }
        if (arg1) {
            method1583(-19);
        }
        ++field3609;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method719(int arg0, int arg1, int arg2) {
        if (this.field3618) {
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, this.field3610[arg1 + -1]);
            super.field4800.method1307(0, (byte) 92);
        }
        ++field3606;
        if (arg2 != 0) {
            method1586(-48, -74, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)Z")
    public static final boolean method1585(int arg0, int arg1, int arg2) {
        int var3 = 4 % ((-60 - arg2) / 42);
        ++field3614;
        return ~(arg0 & 65536) != -1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)V")
    public static final void method1586(int arg0, int arg1, byte arg2) {
        ++field3602;
        class358 var3 = class39.field531[arg0][arg1];
        if (arg2 != -119) {
            field3617 = null;
        }
        if (var3 != null) {
            class345.field5098 = var3.field5302;
            class532.field7799 = var3.field5312;
            class386.field5807 = var3.field5297;
        }
        class426.method2664(-53);
    }
}
