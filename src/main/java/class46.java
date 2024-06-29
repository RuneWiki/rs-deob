import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class46 extends class277 {

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Z")
    private boolean field609 = false;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Z")
    private boolean field610;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "[Lwaa;")
    private class33[] field605;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Loga;")
    public static class182 field612;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lfb;")
    private class52 field602;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method275(boolean arg0) {
        class323.field4144.method2406(18385);
        ++field611;
        if (!arg0) {
            field612 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V", line = 14)
    public final void method276(int arg0, int arg1, int arg2) {
        if (arg1 == 50) {
            if (this.field609) {
                super.field3475.method3027(1, true);
                super.field3475.method2960(this.field605[arg0 + -1], -2);
                super.field3475.method3027(0, true);
            }
            ++field607;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lqj;)V", line = 34)
    public class46(class548 arg0) {
        super(arg0);
        if (arg0.field7556) {
            this.field610 = arg0.field7561 < 3;
            int var2 = this.field610 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 == -2) {
                                var15 = var12;
                            } else if (~var14 != -3) {
                                if (~var14 != -4) {
                                    if (var14 != 4) {
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
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
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
            this.field605 = new class33[3];
            this.field605[0] = new class33(super.field3475, 6406, 64, false, var4, 6406);
            this.field605[1] = new class33(super.field3475, 6406, 64, false, var5, 6406);
            this.field605[2] = new class33(super.field3475, 6406, 64, false, var3, 6406);
            this.method283(-25549);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IZ)V", line = 145)
    public final void method277(int arg0, boolean arg1) {
        if (this.field602 != null && arg1) {
            if (!this.field610) {
                super.field3475.method3027(2, true);
                super.field3475.method2960(super.field3475.field7569, -2);
                super.field3475.method3027(0, true);
            }
            this.field602.method333(-29240, '\u0000');
            this.field609 = true;
        } else {
            super.field3475.method3015(34168, 770, 0, true);
        }
        ++field601;
        int var3 = -80 / ((arg0 - 65) / 60);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 169)
    public final void method278(int arg0) {
        if (arg0 != 1268) {
            this.method284((byte) -67);
        }
        ++field604;
        if (!this.field609) {
            super.field3475.method3015(5890, 770, 0, true);
        } else {
            if (!this.field610) {
                super.field3475.method3027(2, true);
                super.field3475.method2960((class615) null, -2);
            }
            super.field3475.method3027(1, true);
            super.field3475.method2960((class615) null, -2);
            super.field3475.method3027(0, true);
            this.field602.method333(-29240, '\u0001');
            this.field609 = false;
        }
        super.field3475.method2983(8448, arg0 ^ -465307964, 8448);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILrg;)V", line = 199)
    public final void method279(int arg0, int arg1, class615 arg2) {
        if (arg1 != 7) {
            this.field602 = null;
        }
        ++field613;
        super.field3475.method2960(arg2, -2);
        super.field3475.method3005(false, arg0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V", line = 212)
    public final void method280(int arg0, boolean arg1) {
        if (arg0 <= -64) {
            ++field600;
            super.field3475.method2983(8448, -465309136, 7681);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBLkp;I)V", line = 223)
    public static final void method281(int arg0, byte arg1, class507 arg2, int arg3) {
        ++field608;
        if (class358.field4562 == null && !class84.field1188) {
            if (arg2 != null && class168.method968(-108, arg2) != null) {
                class358.field4562 = arg2;
                class34.field473 = class168.method968(45, arg2);
                class222.field2716 = arg0;
                class26.field387 = arg3;
                class659.field9348 = false;
                if (arg1 >= -99) {
                    method281(-121, (byte) -96, (class507) null, 56);
                }
                class276.field3458 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V", line = 249)
    public static void method282(boolean arg0) {
        if (!arg0) {
            method282(false);
        }
        field612 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 259)
    private final void method283(int arg0) {
        this.field602 = new class52(super.field3475, 2);
        ++field606;
        this.field602.method331(0, 0);
        super.field3475.method3027(1, true);
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
        if (!this.field610) {
            super.field3475.method2983(7681, -465309136, 8448);
            super.field3475.method2966(0, 768, 768, 34168);
            super.field3475.method3027(2, true);
            super.field3475.method2983(260, -465309136, 7681);
            super.field3475.method2966(0, 768, 768, 34168);
            super.field3475.method2966(1, 770, 768, 34168);
            super.field3475.method3015(34167, 770, 0, true);
        } else {
            super.field3475.method2983(260, arg0 ^ 465333763, 7681);
            super.field3475.method2966(0, 770, 768, 5890);
            super.field3475.method3015(34167, 770, 0, true);
        }
        super.field3475.method3027(0, true);
        this.field602.method332((byte) 57);
        this.field602.method331(1, arg0 ^ arg0);
        super.field3475.method3027(1, true);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field610) {
            super.field3475.method2983(8448, -465309136, 8448);
            super.field3475.method2966(0, 768, 768, 5890);
            super.field3475.method3027(2, true);
            super.field3475.method2983(8448, arg0 ^ 465333763, 8448);
            super.field3475.method2966(0, 768, 768, 5890);
            super.field3475.method2966(1, 768, arg0 ^ -24781, 34168);
            super.field3475.method3015(5890, 770, 0, true);
        } else {
            super.field3475.method2983(8448, -465309136, 8448);
            super.field3475.method2966(0, 768, 768, 5890);
            super.field3475.method3015(5890, 770, 0, true);
        }
        super.field3475.method3027(0, true);
        this.field602.method332((byte) 66);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z", line = 335)
    public final boolean method284(byte arg0) {
        if (arg0 > -93) {
            this.method276(63, 9, 96);
        }
        ++field603;
        return true;
    }
}
