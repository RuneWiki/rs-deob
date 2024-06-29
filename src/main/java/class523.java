import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class523 extends class249 {

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Z")
    private boolean field7479 = false;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
    private boolean field7473;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[Lnc;")
    private class24[] field7481;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "J")
    public static long field7475 = -1L;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Z")
    public static boolean field7476 = false;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Lmia;")
    public static class63 field7472 = new class63(60, -1);

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field7482 = 0;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "[I")
    public static int[] field7483 = new int[6];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Ljr;")
    private class112 field7469;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lme;ZI)V")
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field7469 = null;
        }
        super.field3613.method1088(arg0, -27749);
        ++field7485;
        super.field3613.method1066(arg2, 260);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lwh;)V")
    public class523(class148 arg0) {
        super(arg0);
        if (arg0.field2213) {
            this.field7473 = ~arg0.field2239 > -4;
            int var2 = this.field7473 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (~var14 == -3) {
                            var15 = var12;
                        } else if (~var14 == -4) {
                            var15 = -var12;
                        } else if (~var14 == -5) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
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
            this.field7481 = new class24[3];
            this.field7481[0] = new class24(super.field3613, 6406, 64, false, var4, 6406);
            this.field7481[1] = new class24(super.field3613, 6406, 64, false, var5, 6406);
            this.field7481[2] = new class24(super.field3613, 6406, 64, false, var3, 6406);
            this.method3073(3170);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        if (arg0 != 2) {
            field7472 = null;
        }
        ++field7474;
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILha;Lnn;)V")
    public static final void method3071(int arg0, int arg1, class60 arg2, class417 arg3) {
        int var4 = -82 % ((74 - arg1) / 32);
        ++field7470;
        if (class754.field10533 != null && ~arg0 >= ~arg3.field6254) {
            for (int var5 = 0; ~class754.field10533.length < ~var5; ++var5) {
                if (~class754.field10533[var5] != 999999 && (arg3.field6242[0] <= class754.field10533[var5] || class754.field10533[var5] >= arg3.field6242[1] || ~arg3.field6242[2] >= ~class754.field10533[var5] || ~arg3.field6242[3] >= ~class754.field10533[var5]) && (class515.field7303[var5] >= arg3.field6249[0] || class515.field7303[var5] >= arg3.field6249[1] || ~arg3.field6249[2] >= ~class515.field7303[var5] || ~class515.field7303[var5] <= ~arg3.field6249[3]) && (~class506.field7199[var5] >= ~arg3.field6249[0] || class506.field7199[var5] <= arg3.field6249[1] || class506.field7199[var5] <= arg3.field6249[2] || ~arg3.field6249[3] <= ~class506.field7199[var5]) && (class426.field6317[var5] >= arg3.field6239[0] || ~class426.field6317[var5] <= ~arg3.field6239[1] || ~arg3.field6239[2] >= ~class426.field6317[var5] || ~arg3.field6239[3] >= ~class426.field6317[var5]) && (~class474.field6893[var5] >= ~arg3.field6239[0] || class474.field6893[var5] <= arg3.field6239[1] || class474.field6893[var5] <= arg3.field6239[2] || class474.field6893[var5] <= arg3.field6239[3])) {
                    return;
                }
            }
        }
        if (~arg3.field6241 == -2) {
            int var6 = -class736.field10315 + arg3.field6243 + class60.field843;
            if (var6 >= 0 && ~(class60.field843 - -class60.field843) <= ~var6) {
                int var7 = arg3.field6248 - -class60.field843 + -class116.field1600;
                if (var7 < 0) {
                    var7 = 0;
                } else if (~var7 < ~(class60.field843 + class60.field843)) {
                    return;
                }
                int var8 = -class116.field1600 + arg3.field6245 + class60.field843;
                if (~var8 < ~(class60.field843 + class60.field843)) {
                    var8 = class60.field843 + class60.field843;
                } else if (~var8 > -1) {
                    return;
                }
                boolean var9 = false;
                while (var7 <= var8) {
                    if (class464.field6819[var6][var7++]) {
                        var9 = true;
                        break;
                    }
                }
                if (var9) {
                    float var10 = (float) (-arg3.field6249[0] + class499.field7101);
                    if (var10 < 0.0F) {
                        var10 *= -1.0F;
                    }
                    if (!((float) class574.field8113 > var10)) {
                        if (class384.method2467(0, (byte) 75, arg3)) {
                            if (class384.method2467(1, (byte) 18, arg3)) {
                                if (class384.method2467(2, (byte) -7, arg3)) {
                                    if (class384.method2467(3, (byte) -125, arg3)) {
                                        class85.field1210[class266.field3799++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (arg3.field6241 == 2) {
            int var11 = -class116.field1600 + arg3.field6248 - -class60.field843;
            if (~var11 <= -1 && var11 <= class60.field843 + class60.field843) {
                int var12 = arg3.field6243 - class736.field10315 + class60.field843;
                if (var12 >= 0) {
                    if (class60.field843 + class60.field843 < var12) {
                        return;
                    }
                } else {
                    var12 = 0;
                }
                int var13 = -class736.field10315 + arg3.field6252 - -class60.field843;
                if (var13 <= class60.field843 + class60.field843) {
                    if (~var13 > -1) {
                        return;
                    }
                } else {
                    var13 = class60.field843 - -class60.field843;
                }
                boolean var14 = false;
                while (~var12 >= ~var13) {
                    if (class464.field6819[var12++][var11]) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    float var15 = (float) (class310.field4389 - arg3.field6239[0]);
                    if (var15 < 0.0F) {
                        var15 *= -1.0F;
                    }
                    if (!((float) class574.field8113 > var15)) {
                        if (class384.method2467(0, (byte) -107, arg3)) {
                            if (class384.method2467(1, (byte) -102, arg3)) {
                                if (class384.method2467(2, (byte) -125, arg3)) {
                                    if (class384.method2467(3, (byte) 30, arg3)) {
                                        class85.field1210[class266.field3799++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (~arg3.field6241 != -17 && arg3.field6241 != 8) {
            if (~arg3.field6241 == -5) {
                float var16 = (float) (arg3.field6242[0] + -class518.field7397);
                if (!(var16 <= (float) class664.field9302)) {
                    int var17 = arg3.field6248 - class116.field1600 - -class60.field843;
                    if (var17 >= 0) {
                        if (~(class60.field843 + class60.field843) > ~var17) {
                            return;
                        }
                    } else {
                        var17 = 0;
                    }
                    int var18 = arg3.field6245 - -class60.field843 + -class116.field1600;
                    if (class60.field843 + class60.field843 < var18) {
                        var18 = class60.field843 - -class60.field843;
                    } else if (var18 < 0) {
                        return;
                    }
                    int var19 = arg3.field6243 - -class60.field843 + -class736.field10315;
                    if (~var19 > -1) {
                        var19 = 0;
                    } else if (~(class60.field843 - -class60.field843) > ~var19) {
                        return;
                    }
                    int var20 = -class736.field10315 + class60.field843 + arg3.field6252;
                    if (class60.field843 + class60.field843 < var20) {
                        var20 = class60.field843 + class60.field843;
                    } else if (~var20 > -1) {
                        return;
                    }
                    boolean var21 = false;
                    label292: for (int var22 = var19; var22 <= var20; ++var22) {
                        for (int var23 = var17; ~var23 >= ~var18; ++var23) {
                            if (class464.field6819[var22][var23]) {
                                var21 = true;
                                break label292;
                            }
                        }
                    }
                    if (var21) {
                        if (class384.method2467(0, (byte) 48, arg3)) {
                            if (class384.method2467(1, (byte) -106, arg3)) {
                                if (class384.method2467(2, (byte) -118, arg3)) {
                                    if (class384.method2467(3, (byte) 47, arg3)) {
                                        class85.field1210[class266.field3799++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int var24 = -class736.field10315 + class60.field843 + arg3.field6243;
            if (var24 >= 0 && class60.field843 + class60.field843 >= var24) {
                int var25 = arg3.field6248 - class116.field1600 - -class60.field843;
                if (var25 >= 0 && class60.field843 + class60.field843 >= var25) {
                    if (class464.field6819[var24][var25]) {
                        float var26 = (float) (class499.field7101 - arg3.field6249[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        float var27 = (float) (class310.field4389 - arg3.field6239[0]);
                        if (var27 < 0.0F) {
                            var27 *= -1.0F;
                        }
                        if (!(var26 < (float) class574.field8113) || !((float) class574.field8113 > var27)) {
                            if (class384.method2467(0, (byte) 8, arg3)) {
                                if (class384.method2467(1, (byte) -105, arg3)) {
                                    if (class384.method2467(2, (byte) 54, arg3)) {
                                        if (class384.method2467(3, (byte) -94, arg3)) {
                                            class85.field1210[class266.field3799++] = arg3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    public final void method607(int arg0, int arg1, int arg2) {
        if (this.field7479) {
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088(this.field7481[arg0 + -1], -27749);
            super.field3613.method1024(0, (byte) -11);
        }
        ++field7484;
        if (arg1 != -13582) {
            field7483 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
    public final void method610(int arg0, boolean arg1) {
        if (arg0 != 1) {
            field7482 = 117;
        }
        ++field7478;
        if (this.field7469 != null && arg1) {
            if (!this.field7473) {
                super.field3613.method1024(2, (byte) -11);
                super.field3613.method1088(super.field3613.field2219, -27749);
                super.field3613.method1024(0, (byte) -11);
            }
            this.field7469.method838('\u0000', true);
            this.field7479 = true;
        } else {
            super.field3613.method1086(34168, 0, 770, 56);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method611(int arg0) {
        ++field7480;
        if (this.field7479) {
            if (!this.field7473) {
                super.field3613.method1024(2, (byte) -11);
                super.field3613.method1088((class195) null, -27749);
            }
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088((class195) null, -27749);
            super.field3613.method1024(0, (byte) -11);
            this.field7469.method838('\u0001', true);
            this.field7479 = false;
        } else {
            super.field3613.method1086(5890, 0, 770, 25);
        }
        if (arg0 != 2) {
            this.method607(-83, 46, -29);
        }
        super.field3613.method1043((byte) -102, 8448, 8448);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method3072(byte arg0) {
        if (arg0 != 9) {
            field7482 = -69;
        }
        field7472 = null;
        field7483 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)V")
    public final void method608(boolean arg0, boolean arg1) {
        super.field3613.method1043((byte) -120, 7681, 8448);
        if (!arg0) {
            field7472 = null;
        }
        ++field7471;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    private final void method3073(int arg0) {
        this.field7469 = new class112(super.field3613, 2);
        ++field7468;
        this.field7469.method841(arg0 + -3268, 0);
        super.field3613.method1024(1, (byte) -11);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(arg0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field7473) {
            super.field3613.method1043((byte) 91, 7681, 260);
            super.field3613.method1052(5890, arg0 ^ 35298, 0, 770);
            super.field3613.method1086(34167, 0, 770, 85);
        } else {
            super.field3613.method1043((byte) 67, 8448, 7681);
            super.field3613.method1052(34168, arg0 ^ 35298, 0, 768);
            super.field3613.method1024(2, (byte) -11);
            super.field3613.method1043((byte) -97, 7681, 260);
            super.field3613.method1052(34168, 34176, 0, 768);
            super.field3613.method1052(34168, 34176, 1, 770);
            super.field3613.method1086(34167, 0, 770, arg0 + -3088);
        }
        super.field3613.method1024(0, (byte) -11);
        this.field7469.method840(arg0 + -3056);
        this.field7469.method841(-120, 1);
        super.field3613.method1024(1, (byte) -11);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field7473) {
            super.field3613.method1043((byte) 96, 8448, 8448);
            super.field3613.method1052(5890, 34176, 0, 768);
            super.field3613.method1086(5890, 0, 770, 120);
        } else {
            super.field3613.method1043((byte) 121, 8448, 8448);
            super.field3613.method1052(5890, 34176, 0, 768);
            super.field3613.method1024(2, (byte) -11);
            super.field3613.method1043((byte) -58, 8448, 8448);
            super.field3613.method1052(5890, arg0 ^ 35298, 0, 768);
            super.field3613.method1052(34168, arg0 + 31006, 1, 768);
            super.field3613.method1086(5890, 0, 770, 107);
        }
        super.field3613.method1024(0, (byte) -11);
        this.field7469.method840(-128);
    }
}
