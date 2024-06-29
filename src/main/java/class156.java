import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class156 extends class460 {

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "Z")
    private boolean field2565 = false;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
    private boolean field2566;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "[Lgfa;")
    private class656[] field2568;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "Lvo;")
    public static class345 field2569;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "Luq;")
    private class458 field2574;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1168(int arg0) {
        if (arg0 != 2048) {
            this.method1175(false, -4);
        }
        ++field2562;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjo;I)V", line = 16)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        ++field2560;
        int var4 = -38 % ((65 - arg2) / 53);
        super.field6621.method2295((byte) -117, arg1);
        super.field6621.method2270(arg0, (byte) 110);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)V", line = 31)
    public final void method1170(int arg0, int arg1, int arg2) {
        if (this.field2565) {
            super.field6621.method2308(1, -15115);
            super.field6621.method2295((byte) 105, this.field2568[arg1 + -1]);
            super.field6621.method2308(0, -15115);
        }
        ++field2573;
        if (arg2 != 1) {
            this.method1173(true);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;)V", line = 49)
    public static final void method1171(int arg0, String arg1) {
        ++field2563;
        if (arg0 >= 96) {
            if (class230.field3409 != null) {
                ++class28.field393;
                class699 var2 = class452.method2630(class699.field9897, class332.field4594, (byte) 125);
                var2.field9908.method2753((byte) 97, class252.method1609(0, arg1));
                var2.field9908.method2703(false, arg1);
                class149.method1134(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V", line = 68)
    public static final void method1172(boolean arg0) {
        ++field2559;
        int var1 = class88.field1318 * 512 + 256;
        int var2 = class522.field7694 * 512 + 256;
        int var3 = class603.method3433(var2, class416.field5926, var1, -125) + -class538.field7903;
        if (~class6.field52 > -101) {
            if (var1 > class551.field8078) {
                class551.field8078 += (-class551.field8078 + var1) * class6.field52 / 1000 + class583.field8546;
                if (class551.field8078 > var1) {
                    class551.field8078 = var1;
                }
            }
            if (~class277.field3933 > ~var3) {
                class277.field3933 += class583.field8546 - -((-class277.field3933 + var3) * class6.field52 / 1000);
                if (var3 < class277.field3933) {
                    class277.field3933 = var3;
                }
            }
            if (~class551.field8078 < ~var1) {
                class551.field8078 -= class583.field8546 - -((class551.field8078 - var1) * class6.field52 / 1000);
                if (class551.field8078 < var1) {
                    class551.field8078 = var1;
                }
            }
            if (var3 < class277.field3933) {
                class277.field3933 -= class583.field8546 - -((class277.field3933 - var3) * class6.field52 / 1000);
                if (class277.field3933 < var3) {
                    class277.field3933 = var3;
                }
            }
            if (class322.field4478 < var2) {
                class322.field4478 += (var2 - class322.field4478) * class6.field52 / 1000 + class583.field8546;
                if (class322.field4478 > var2) {
                    class322.field4478 = var2;
                }
            }
            if (class322.field4478 > var2) {
                class322.field4478 -= (-var2 + class322.field4478) * class6.field52 / 1000 + class583.field8546;
                if (~class322.field4478 > ~var2) {
                    class322.field4478 = var2;
                }
            }
        } else {
            class551.field8078 = class88.field1318 * 512 + 256;
            class322.field4478 = class522.field7694 * 512 + 256;
            class277.field3933 = class603.method3433(class322.field4478, class416.field5926, class551.field8078, -106) + -class538.field7903;
        }
        int var4 = class498.field7412 * 512 + 256;
        int var5 = class168.field2750 * 512 - -256;
        int var6 = class603.method3433(var4, class416.field5926, var5, -99) + -class320.field4409;
        int var7 = -class551.field8078 + var5;
        int var8 = -class277.field3933 + var6;
        int var9 = -class322.field4478 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 16383;
        if (~var11 > -1025) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 16383;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class666.field9366 < var11) {
            class666.field9366 += (-class666.field9366 + var11 >> 3) * class260.field3750 / 1000 + class208.field3211 << 3;
            if (var11 < class666.field9366) {
                class666.field9366 = var11;
            }
        }
        if (class666.field9366 > var11) {
            class666.field9366 -= (-var11 + class666.field9366 >> 3) * class260.field3750 / 1000 + class208.field3211 << 3;
            if (~class666.field9366 > ~var11) {
                class666.field9366 = var11;
            }
        }
        int var13 = -class432.field6220 + var12;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        if (!arg0) {
            int var14 = var13 >> 3;
            if (var14 > 0) {
                class432.field6220 += class260.field3750 * var14 / 1000 + class208.field3211 << 3;
                class432.field6220 &= 16383;
            }
            if (var14 < 0) {
                class432.field6220 -= -var14 * class260.field3750 / 1000 + class208.field3211 << 3;
                class432.field6220 &= 16383;
            }
            int var15 = var12 - class432.field6220;
            if (~var15 < -8193) {
                var15 -= 16384;
            }
            if (var15 < -8192) {
                var15 += 16384;
            }
            if (~var15 > -1 && var14 > 0 || ~var15 < -1 && ~var14 > -1) {
                class432.field6220 = var12;
            }
            class694.field9854 = 0;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V", line = 231)
    private final void method1173(boolean arg0) {
        this.field2574 = new class458(super.field6621, 2);
        ++field2570;
        if (arg0) {
            field2572 = 57;
        }
        this.field2574.method2656(0, (byte) 76);
        super.field6621.method2308(1, -15115);
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
        if (!this.field2566) {
            super.field6621.method2328(7681, -45, 8448);
            super.field6621.method2262(34168, 0, 34176, 768);
            super.field6621.method2308(2, -15115);
            super.field6621.method2328(260, -49, 7681);
            super.field6621.method2262(34168, 0, 34176, 768);
            super.field6621.method2262(34168, 1, 34176, 770);
            super.field6621.method2258(-46, 34167, 770, 0);
        } else {
            super.field6621.method2328(260, 89, 7681);
            super.field6621.method2262(5890, 0, 34176, 770);
            super.field6621.method2258(-38, 34167, 770, 0);
        }
        super.field6621.method2308(0, -15115);
        this.field2574.method2657(0);
        this.field2574.method2656(1, (byte) 76);
        super.field6621.method2308(1, -15115);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field2566) {
            super.field6621.method2328(8448, -41, 8448);
            super.field6621.method2262(5890, 0, 34176, 768);
            super.field6621.method2308(2, -15115);
            super.field6621.method2328(8448, 30, 8448);
            super.field6621.method2262(5890, 0, 34176, 768);
            super.field6621.method2262(34168, 1, 34176, 768);
            super.field6621.method2258(-47, 5890, 770, 0);
        } else {
            super.field6621.method2328(8448, -107, 8448);
            super.field6621.method2262(5890, 0, 34176, 768);
            super.field6621.method2258(-67, 5890, 770, 0);
        }
        super.field6621.method2308(0, -15115);
        this.field2574.method2657(0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 300)
    public final void method1174(byte arg0) {
        if (arg0 < -56) {
            if (this.field2565) {
                if (!this.field2566) {
                    super.field6621.method2308(2, -15115);
                    super.field6621.method2295((byte) 120, (class337) null);
                }
                super.field6621.method2308(1, -15115);
                super.field6621.method2295((byte) 65, (class337) null);
                super.field6621.method2308(0, -15115);
                this.field2574.method2658(0, '\u0001');
                this.field2565 = false;
            } else {
                super.field6621.method2258(-98, 5890, 770, 0);
            }
            ++field2564;
            super.field6621.method2328(8448, -107, 8448);
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lkfa;)V", line = 331)
    public class156(class382 arg0) {
        super(arg0);
        if (arg0.field5542) {
            this.field2566 = arg0.field5545 < 3;
            int var2 = !this.field2566 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (~var14 != -3) {
                                if (~var14 != -4) {
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
            this.field2568 = new class656[3];
            this.field2568[0] = new class656(super.field6621, 6406, 64, false, var4, 6406);
            this.field2568[1] = new class656(super.field6621, 6406, 64, false, var5, 6406);
            this.field2568[2] = new class656(super.field6621, 6406, 64, false, var3, 6406);
            this.method1173(false);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V", line = 442)
    public final void method1175(boolean arg0, int arg1) {
        if (this.field2574 != null && arg0) {
            if (!this.field2566) {
                super.field6621.method2308(2, -15115);
                super.field6621.method2295((byte) 97, super.field6621.field5523);
                super.field6621.method2308(0, -15115);
            }
            this.field2574.method2658(0, '\u0000');
            this.field2565 = true;
        } else {
            super.field6621.method2258(-105, 34168, 770, 0);
        }
        ++field2561;
        if (arg1 != 0) {
            this.field2574 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(III)Z", line = 470)
    public static final boolean method1176(int arg0, int arg1, int arg2) {
        ++field2571;
        if (arg1 != -1) {
            return true;
        } else {
            return ~(arg2 & 540800) != -1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V", line = 483)
    public final void method1177(byte arg0, boolean arg1) {
        ++field2567;
        super.field6621.method2328(8448, 48, 7681);
        int var3 = -62 % ((-85 - arg0) / 38);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V", line = 497)
    public static void method1178(int arg0) {
        field2569 = null;
        if (arg0 != 1705644067) {
            field2569 = null;
        }
    }
}
