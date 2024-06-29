import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class144 extends class369 {

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Z")
    private boolean field2389 = false;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Z")
    private boolean field2381;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "[Lq;")
    private class429[] field2390;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Ljv;")
    private class80 field2383;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BII)Z")
    public static final boolean method1133(byte arg0, int arg1, int arg2) {
        ++field2386;
        int var3 = 52 % ((arg0 - 68) / 41);
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method371(int arg0) {
        ++field2391;
        if (this.field2389) {
            if (!this.field2381) {
                super.field5255.method190(-15039, 2);
                super.field5255.method256((byte) -84, (class36) null);
            }
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -87, (class36) null);
            super.field5255.method190(-15039, 0);
            this.field2383.method740('\u0001', 28666);
            this.field2389 = false;
        } else {
            super.field5255.method274(false, 0, 770, 5890);
        }
        if (arg0 < -75) {
            super.field5255.method175(8448, (byte) -75, 8448);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI)I")
    public static final int method1134(int arg0, byte arg1, int arg2) {
        ++field2392;
        if (arg1 >= -14) {
            return 64;
        } else {
            return arg2 != 1 && arg2 != 3 ? class645.field8872[3 & arg0] : class717.field9760[arg0 & 3];
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lud;BI)V")
    public final void method373(class36 arg0, byte arg1, int arg2) {
        if (arg1 >= -89) {
            this.field2390 = null;
        }
        super.field5255.method256((byte) -115, arg0);
        ++field2385;
        super.field5255.method237(0, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
    private final void method1135(int arg0) {
        this.field2383 = new class80(super.field5255, 2);
        if (arg0 >= -7) {
            this.method373((class36) null, (byte) 112, -64);
        }
        ++field2387;
        this.field2383.method741((byte) 105, 0);
        super.field5255.method190(-15039, 1);
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
        if (!this.field2381) {
            super.field5255.method175(7681, (byte) 126, 8448);
            super.field5255.method239(34168, 768, (byte) -87, 0);
            super.field5255.method190(-15039, 2);
            super.field5255.method175(260, (byte) 124, 7681);
            super.field5255.method239(34168, 768, (byte) -87, 0);
            super.field5255.method239(34168, 770, (byte) -87, 1);
            super.field5255.method274(false, 0, 770, 34167);
        } else {
            super.field5255.method175(260, (byte) 104, 7681);
            super.field5255.method239(5890, 770, (byte) -87, 0);
            super.field5255.method274(false, 0, 770, 34167);
        }
        super.field5255.method190(-15039, 0);
        this.field2383.method737(-1);
        this.field2383.method741((byte) 114, 1);
        super.field5255.method190(-15039, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field2381) {
            super.field5255.method175(8448, (byte) -9, 8448);
            super.field5255.method239(5890, 768, (byte) -87, 0);
            super.field5255.method190(-15039, 2);
            super.field5255.method175(8448, (byte) 92, 8448);
            super.field5255.method239(5890, 768, (byte) -87, 0);
            super.field5255.method239(34168, 768, (byte) -87, 1);
            super.field5255.method274(false, 0, 770, 5890);
        } else {
            super.field5255.method175(8448, (byte) 115, 8448);
            super.field5255.method239(5890, 768, (byte) -87, 0);
            super.field5255.method274(false, 0, 770, 5890);
        }
        super.field5255.method190(-15039, 0);
        this.field2383.method737(-1);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)V")
    public final void method372(int arg0, int arg1, byte arg2) {
        ++field2380;
        if (this.field2389) {
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -91, this.field2390[arg0 + -1]);
            super.field5255.method190(-15039, 0);
        }
        if (arg2 > -42) {
            this.method369(true, true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Z")
    public final boolean method368(int arg0) {
        ++field2388;
        return arg0 <= -5;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZZ)V")
    public final void method369(boolean arg0, boolean arg1) {
        if (!arg1) {
            ++field2379;
            if (this.field2383 != null && arg0) {
                if (!this.field2381) {
                    super.field5255.method190(-15039, 2);
                    super.field5255.method256((byte) -120, super.field5255.field649);
                    super.field5255.method190(-15039, 0);
                }
                this.field2383.method740('\u0000', 28666);
                this.field2389 = true;
            } else {
                super.field5255.method274(false, 0, 770, 34168);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)V")
    public final void method366(boolean arg0, byte arg1) {
        super.field5255.method175(8448, (byte) 121, 7681);
        ++field2382;
        int var3 = 96 / ((arg1 - -60) / 38);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lqo;)V")
    public class144(class22 arg0) {
        super(arg0);
        if (arg0.field685) {
            this.field2381 = arg0.field617 < 3;
            int var2 = this.field2381 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (var14 == 1) {
                            var15 = var12;
                        } else if (~var14 != -3) {
                            if (var14 != 3) {
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
            this.field2390 = new class429[3];
            this.field2390[0] = new class429(super.field5255, 6406, 64, false, var4, 6406);
            this.field2390[1] = new class429(super.field5255, 6406, 64, false, var5, 6406);
            this.field2390[2] = new class429(super.field5255, 6406, 64, false, var3, 6406);
            this.method1135(-88);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILua;)V")
    public static final void method1136(int arg0, int arg1, class665 arg2) {
        ++field2384;
        boolean var3 = ~arg2.method3733((byte) -24, arg0) == -2;
        if (var3) {
            class131.field2196[class495.field6867++] = arg1;
        }
        int var4 = arg2.method3733((byte) -24, 2);
        class598 var5 = class49.field1040[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field8184 = false;
            } else if (~class561.field7752 == ~arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class753 var6 = class217.field3154[arg1] = new class753();
                var6.field10515 = (var5.field5926 << 28) + (var5.field5746[0] + class221.field3177 >> 6 << 14) + (class367.field5236 - -var5.field5743[0] >> 6);
                if (~var5.field8169 != 0) {
                    var6.field10518 = var5.field8169;
                } else {
                    var6.field10518 = var5.field5643.method1611((byte) -91);
                }
                var6.field10521 = var5.field8199;
                var6.field10520 = var5.field5701;
                if (var5.field8198 > 0) {
                    class67.method673(var5, -28482);
                }
                class49.field1040[arg1] = null;
                if (arg2.method3733((byte) -24, 1) != 0) {
                    class2.method2(arg1, (byte) 105, arg2);
                }
            }
        } else if (~var4 == -2) {
            int var7 = arg2.method3733((byte) -24, 3);
            int var8 = var5.field5746[0];
            int var9 = var5.field5743[0];
            if (~var7 != -1) {
                if (var7 != 1) {
                    if (~var7 != -3) {
                        if (~var7 == -4) {
                            --var8;
                        } else if (~var7 != -5) {
                            if (var7 != 5) {
                                if (var7 != 6) {
                                    if (var7 == 7) {
                                        ++var9;
                                        ++var8;
                                    }
                                } else {
                                    ++var9;
                                }
                            } else {
                                ++var9;
                                --var8;
                            }
                        } else {
                            ++var8;
                        }
                    } else {
                        ++var8;
                        --var9;
                    }
                } else {
                    --var9;
                }
            } else {
                --var9;
                --var8;
            }
            if (!var3) {
                var5.method3403(var9, -26443, class318.field4386[arg1], var8);
            } else {
                var5.field8176 = var9;
                var5.field8184 = true;
                var5.field8194 = var8;
            }
        } else if (~var4 == -3) {
            int var10 = arg2.method3733((byte) -24, 4);
            int var11 = var5.field5746[0];
            int var12 = var5.field5743[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (~var10 != -2) {
                if (var10 != 2) {
                    if (~var10 != -4) {
                        if (var10 == 4) {
                            var11 += 2;
                            var12 -= 2;
                        } else if (~var10 != -6) {
                            if (var10 == 6) {
                                --var12;
                                var11 += 2;
                            } else if (~var10 == -8) {
                                var11 -= 2;
                            } else if (~var10 == -9) {
                                var11 += 2;
                            } else if (var10 == 9) {
                                ++var12;
                                var11 -= 2;
                            } else if (~var10 != -11) {
                                if (var10 == 11) {
                                    var12 += 2;
                                    var11 -= 2;
                                } else if (~var10 == -13) {
                                    var12 += 2;
                                    --var11;
                                } else if (~var10 != -14) {
                                    if (~var10 == -15) {
                                        var12 += 2;
                                        ++var11;
                                    } else if (~var10 == -16) {
                                        var11 += 2;
                                        var12 += 2;
                                    }
                                } else {
                                    var12 += 2;
                                }
                            } else {
                                ++var12;
                                var11 += 2;
                            }
                        } else {
                            var11 -= 2;
                            --var12;
                        }
                    } else {
                        var12 -= 2;
                        ++var11;
                    }
                } else {
                    var12 -= 2;
                }
            } else {
                var12 -= 2;
                --var11;
            }
            if (!var3) {
                var5.method3403(var12, -26443, class318.field4386[arg1], var11);
            } else {
                var5.field8184 = true;
                var5.field8194 = var11;
                var5.field8176 = var12;
            }
        } else {
            int var13 = arg2.method3733((byte) -24, 1);
            if (~var13 == -1) {
                int var14 = arg2.method3733((byte) -24, 12);
                int var15 = var14 >> 10;
                int var16 = 31 & var14 >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = 31 & var14;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field5746[0] + var16;
                int var19 = var5.field5743[0] + var17;
                if (!var3) {
                    var5.method3403(var19, -26443, class318.field4386[arg1], var18);
                } else {
                    var5.field8176 = var19;
                    var5.field8194 = var18;
                    var5.field8184 = true;
                }
                var5.field5926 = var5.field5921 = (byte) (3 & var5.field5926 + var15);
                if (class334.method2118(var19, var18, true)) {
                    ++var5.field5921;
                }
                if (class561.field7752 == arg1) {
                    if (class382.field5551 != var5.field5926) {
                        class30.field778 = true;
                    }
                    class382.field5551 = var5.field5926;
                }
            } else {
                int var20 = arg2.method3733((byte) -24, 30);
                int var21 = var20 >> 28;
                int var22 = 16383 & var20 >> 14;
                int var23 = 16383 & var20;
                int var24 = (var5.field5746[0] + class221.field3177 + var22 & 16383) - class221.field3177;
                int var25 = (16383 & class367.field5236 + var23 + var5.field5743[0]) + -class367.field5236;
                if (var3) {
                    var5.field8184 = true;
                    var5.field8176 = var25;
                    var5.field8194 = var24;
                } else {
                    var5.method3403(var25, -26443, class318.field4386[arg1], var24);
                }
                var5.field5926 = var5.field5921 = (byte) (var5.field5926 + var21 & 3);
                if (class334.method2118(var25, var24, true)) {
                    ++var5.field5921;
                }
                if (~class561.field7752 == ~arg1) {
                    class382.field5551 = var5.field5926;
                }
            }
        }
    }
}
