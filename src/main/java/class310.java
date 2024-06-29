import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class310 extends class465 {

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Z")
    private boolean field4278 = false;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "Z")
    private boolean field4276;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "[Ljk;")
    private class592[] field4277;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "J")
    public static long field4270 = 0L;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public static int field4279 = 0;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Lu;")
    private class68 field4265;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "[S")
    public static short[] field4267;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method1853(int arg0, int arg1, byte arg2) {
        if (arg2 != -50) {
            field4267 = null;
        }
        ++field4274;
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lno;)V", line = 14)
    public class310(class658 arg0) {
        super(arg0);
        if (arg0.field9222) {
            this.field4276 = arg0.field9237 < 3;
            int var2 = this.field4276 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (~var14 == -3) {
                                var15 = var12;
                            } else if (var14 != 3) {
                                if (var14 == 4) {
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
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field4277 = new class592[3];
            this.field4277[0] = new class592(super.field6268, 6406, 64, false, var4, 6406);
            this.field4277[1] = new class592(super.field6268, 6406, 64, false, var5, 6406);
            this.field4277[2] = new class592(super.field6268, 6406, 64, false, var3, 6406);
            this.method1857(102);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V", line = 127)
    public final void method215(int arg0, int arg1, int arg2) {
        ++field4280;
        if (arg1 != 0) {
            method1854(false);
        }
        if (this.field4278) {
            super.field6268.method3629((byte) 106, 1);
            super.field6268.method3630(this.field4277[arg2 + -1], arg1 ^ -2);
            super.field6268.method3629((byte) 104, 0);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 144)
    public static final void method1854(boolean arg0) {
        if (arg0) {
            ++field4275;
            if (~class577.field7661 < -1) {
                int var1 = 0;
                for (int var2 = 0; class287.field4063.length > var2; ++var2) {
                    if (class287.field4063[var2].startsWith("--> ")) {
                        ++var1;
                        if (class577.field7661 == var1) {
                            class656.field8914 = class287.field4063[var2].substring(4);
                            return;
                        }
                    }
                }
            } else {
                class656.field8914 = "";
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 179)
    public final void method213(int arg0) {
        ++field4271;
        if (arg0 == 15495) {
            if (!this.field4278) {
                super.field6268.method3672(770, 0, 5890, arg0 + -21986);
            } else {
                if (!this.field4276) {
                    super.field6268.method3629((byte) 77, 2);
                    super.field6268.method3630((class367) null, -2);
                }
                super.field6268.method3629((byte) 30, 1);
                super.field6268.method3630((class367) null, -2);
                super.field6268.method3629((byte) -127, 0);
                this.field4265.method536((byte) 120, '\u0001');
                this.field4278 = false;
            }
            super.field6268.method3644(8448, 23560, 8448);
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z", line = 210)
    public final boolean method218(int arg0) {
        if (arg0 < 110) {
            return false;
        } else {
            ++field4268;
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V", line = 221)
    public final void method210(int arg0, boolean arg1) {
        int var3 = -9 % ((-30 - arg0) / 38);
        ++field4272;
        if (this.field4265 != null && arg1) {
            if (!this.field4276) {
                super.field6268.method3629((byte) -118, 2);
                super.field6268.method3630(super.field6268.field9285, -2);
                super.field6268.method3629((byte) 48, 0);
            }
            this.field4265.method536((byte) 117, '\u0000');
            this.field4278 = true;
        } else {
            super.field6268.method3672(770, 0, 34168, -6491);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BZ)V", line = 246)
    public final void method214(byte arg0, boolean arg1) {
        super.field6268.method3644(7681, 23560, 8448);
        if (arg0 == 99) {
            ++field4269;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Z", line = 257)
    public static final boolean method1855(byte arg0) {
        ++field4273;
        return arg0 != -92 ? false : class212.field3041;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V", line = 269)
    public static void method1856(boolean arg0) {
        if (!arg0) {
            field4270 = 57L;
        }
        field4267 = null;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 295)
    private final void method1857(int arg0) {
        this.field4265 = new class68(super.field6268, 2);
        ++field4264;
        this.field4265.method537(0, (byte) 3);
        super.field6268.method3629((byte) 124, 1);
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
        if (this.field4276) {
            super.field6268.method3644(7681, 23560, 260);
            super.field6268.method3609((byte) 27, 770, 0, 5890);
            super.field6268.method3672(770, 0, 34167, -6491);
        } else {
            super.field6268.method3644(8448, 23560, 7681);
            super.field6268.method3609((byte) 27, 768, 0, 34168);
            super.field6268.method3629((byte) 104, 2);
            super.field6268.method3644(7681, 23560, 260);
            super.field6268.method3609((byte) 27, 768, 0, 34168);
            super.field6268.method3609((byte) 27, 770, 1, 34168);
            super.field6268.method3672(770, 0, 34167, -6491);
        }
        super.field6268.method3629((byte) 83, 0);
        this.field4265.method539(true);
        this.field4265.method537(1, (byte) 3);
        super.field6268.method3629((byte) -109, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (arg0 <= 41) {
            field4267 = null;
        }
        if (!this.field4276) {
            super.field6268.method3644(8448, 23560, 8448);
            super.field6268.method3609((byte) 27, 768, 0, 5890);
            super.field6268.method3629((byte) 35, 2);
            super.field6268.method3644(8448, 23560, 8448);
            super.field6268.method3609((byte) 27, 768, 0, 5890);
            super.field6268.method3609((byte) 27, 768, 1, 34168);
            super.field6268.method3672(770, 0, 5890, -6491);
        } else {
            super.field6268.method3644(8448, 23560, 8448);
            super.field6268.method3609((byte) 27, 768, 0, 5890);
            super.field6268.method3672(770, 0, 5890, -6491);
        }
        super.field6268.method3629((byte) 96, 0);
        this.field4265.method539(true);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILhf;)V", line = 365)
    public final void method212(int arg0, int arg1, class367 arg2) {
        ++field4266;
        if (arg0 != 0) {
            this.field4265 = null;
        }
        super.field6268.method3630(arg2, -2);
        super.field6268.method3603((byte) -34, arg1);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIIII)V", line = 380)
    public static final void method1858(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4281;
        if (class269.method1639(arg1, 0)) {
            class148.method1063(arg2, (byte) 97, class601.field7977[arg1], arg3, arg0, -1);
            if (arg4 >= -27) {
                field4267 = null;
            }
        }
    }
}
