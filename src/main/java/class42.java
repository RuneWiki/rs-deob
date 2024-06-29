import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class42 extends class348 {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Z")
    private boolean field452 = false;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Z")
    private boolean field458;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[Lea;")
    private class15[] field453;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lbi;")
    public static class104 field460 = new class104(43, -2);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lkp;")
    private class292 field457;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
    private final void method258(int arg0) {
        ++field459;
        this.field457 = new class292(super.field5398, 2);
        this.field457.method1965(0, (byte) -30);
        super.field5398.method1507(1, 0);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(arg0);
        if (!this.field458) {
            super.field5398.method1568(8448, arg0 + -2992, 7681);
            super.field5398.method1498(arg0 ^ 37520, 0, 34168, 768);
            super.field5398.method1507(2, 0);
            super.field5398.method1568(7681, arg0 + -2992, 260);
            super.field5398.method1498(34192, 0, 34168, 768);
            super.field5398.method1498(arg0 ^ 37520, 1, 34168, 770);
            super.field5398.method1539(0, 34167, 770, (byte) 115);
        } else {
            super.field5398.method1568(7681, 2896, 260);
            super.field5398.method1498(34192, 0, 5890, 770);
            super.field5398.method1539(0, 34167, 770, (byte) 117);
        }
        super.field5398.method1507(0, 0);
        this.field457.method1962(-6635);
        this.field457.method1965(1, (byte) -103);
        super.field5398.method1507(1, arg0 + -5888);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field458) {
            super.field5398.method1568(8448, arg0 + -2992, 8448);
            super.field5398.method1498(34192, 0, 5890, 768);
            super.field5398.method1539(0, 5890, 770, (byte) 126);
        } else {
            super.field5398.method1568(8448, 2896, 8448);
            super.field5398.method1498(34192, 0, 5890, 768);
            super.field5398.method1507(2, 0);
            super.field5398.method1568(8448, 2896, 8448);
            super.field5398.method1498(34192, 0, 5890, 768);
            super.field5398.method1498(arg0 ^ 37520, 1, 34168, 768);
            super.field5398.method1539(0, 5890, 770, (byte) 122);
        }
        super.field5398.method1507(0, 0);
        this.field457.method1962(-6635);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lna;)V")
    public class42(class211 arg0) {
        super(arg0);
        if (arg0.field3525) {
            this.field458 = arg0.field3556 < 3;
            int var2 = this.field458 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (var14 == 2) {
                                    var15 = var13;
                                } else if (var14 == 3) {
                                    var15 = -var13;
                                } else if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = var12;
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
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
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
            this.field453 = new class15[3];
            this.field453[0] = new class15(super.field5398, 6406, 64, false, var4, 6406);
            this.field453[1] = new class15(super.field5398, 6406, 64, false, var5, 6406);
            this.field453[2] = new class15(super.field5398, 6406, 64, false, var3, 6406);
            this.method258(5888);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([JIB[Ljava/lang/Object;I)V")
    public static final void method259(long[] arg0, int arg1, byte arg2, Object[] arg3, int arg4) {
        if (arg2 >= -33) {
            field454 = -61;
        }
        ++field461;
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; ~arg1 < ~var11; ++var11) {
                if (arg0[var11] < (long) (var11 & var10) + var7) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method259(arg0, var6 - 1, (byte) -105, arg3, arg4);
            method259(arg0, arg1, (byte) -106, arg3, var6 + 1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method260(int arg0) {
        if (arg0 != 26589) {
            field460 = null;
        }
        field460 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        if (arg1 > -30) {
            this.method261(true, (byte) 98);
        }
        ++field463;
        if (this.field457 != null && arg0) {
            if (!this.field458) {
                super.field5398.method1507(2, 0);
                super.field5398.method1540(106, super.field5398.field3532);
                super.field5398.method1507(0, 0);
            }
            this.field457.method1963(true, '\u0000');
            this.field452 = true;
        } else {
            super.field5398.method1539(0, 34168, 770, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        ++field450;
        int var3 = -27 / ((arg1 - -23) / 41);
        super.field5398.method1568(7681, 2896, 8448);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        if (arg2 > -51) {
            this.method264(-43, 95, (class427) null);
        }
        if (this.field452) {
            super.field5398.method1507(1, 0);
            super.field5398.method1540(82, this.field453[arg1 + -1]);
            super.field5398.method1507(0, 0);
        }
        ++field462;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        ++field456;
        int var4 = -108 % ((arg1 - -49) / 44);
        super.field5398.method1540(122, arg2);
        super.field5398.method1494(arg0, -25951);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        ++field455;
        int var2 = 55 / ((arg0 - 61) / 63);
        if (!this.field452) {
            super.field5398.method1539(0, 5890, 770, (byte) 119);
        } else {
            if (!this.field458) {
                super.field5398.method1507(2, 0);
                super.field5398.method1540(123, (class427) null);
            }
            super.field5398.method1507(1, 0);
            super.field5398.method1540(37, (class427) null);
            super.field5398.method1507(0, 0);
            this.field457.method1963(true, '\u0001');
            this.field452 = false;
        }
        super.field5398.method1568(8448, 2896, 8448);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public static final void method266(int arg0, int arg1) {
        ++field464;
        int var2 = -class252.field4079 + class88.field1278;
        if (~var2 <= -101) {
            class334.field5222 = 1;
        } else {
            int var3 = -62 / ((-63 - arg0) / 42);
            int var4 = (int) class135.field1824;
            if (var4 < class204.field3124 >> 8) {
                var4 = class204.field3124 >> 8;
            }
            if (class51.field689[4] && class453.field7023[4] + 128 > var4) {
                var4 = class453.field7023[4] + 128;
            }
            int var5 = 16383 & (int) class388.field5918 + class33.field339;
            class295.method1977(class532.method3165(class201.field3057, class358.field5565.field6417, false, class358.field5565.field6410) + -50, class254.field4115, 25034, class290.field4578, (var4 >> 3) * 3 + 600 << 0, var4, arg1, var5);
            float var6 = -((float) ((-var2 + 100) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F) + 1.0F;
            class163.field2367 = (int) ((float) (class163.field2367 - class61.field954) * var6 + (float) class61.field954);
            class98.field1404 = (int) ((float) (class98.field1404 - class231.field3817) * var6 + (float) class231.field3817);
            class371.field5703 = (int) ((float) (-class155.field2061 + class371.field5703) * var6 + (float) class155.field2061);
            class220.field3723 = (int) ((float) (class220.field3723 - class357.field5536) * var6 + (float) class357.field5536);
            int var7 = class387.field5912 - class322.field5008;
            if (~var7 < -8193) {
                var7 -= 16384;
            } else if (~var7 > 8191) {
                var7 += 16384;
            }
            class387.field5912 = (int) ((float) var7 * var6 + (float) class322.field5008);
            class387.field5912 &= 16383;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        ++field451;
        return arg0 != -233 ? true : true;
    }
}
