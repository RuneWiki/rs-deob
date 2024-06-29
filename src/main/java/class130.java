import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class130 extends class366 {

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Z")
    private boolean field2127 = false;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Z")
    private boolean field2130;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "[Lqn;")
    private class58[] field2131;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "[I")
    public static int[] field2138 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Lsr;")
    private class231 field2136;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Lufa;")
    public static class632 field2132;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 3)
    public static void method1128(int arg0) {
        if (arg0 != 9472) {
            method1128(103);
        }
        field2132 = null;
        field2138 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 14)
    public static final void method1129(int arg0, int arg1) {
        ++field2139;
        class674.field9510 = arg1;
        class49 var2 = class393.field6137;
        synchronized (class393.field6137) {
            class393.field6137.method569(0);
        }
        class49 var3 = class567.field8140;
        synchronized (class567.field8140) {
            class567.field8140.method569(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILep;I)V", line = 31)
    public final void method1130(int arg0, class386 arg1, int arg2) {
        super.field5742.method856(false, arg1);
        ++field2140;
        super.field5742.method816(arg2, arg0 ^ -126);
        if (arg0 != 1) {
            this.method1135(3);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZ)V", line = 44)
    public final void method1131(boolean arg0, boolean arg1) {
        if (arg1) {
            super.field5742.method857(8960, 7681, 8448);
            ++field2133;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ler;)V", line = 136)
    public class130(class92 arg0) {
        super(arg0);
        if (arg0.field1371) {
            this.field2130 = ~arg0.field1369 > -4;
            int var2 = this.field2130 ? 48 : 127;
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
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
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
            this.field2131 = new class58[3];
            this.field2131[0] = new class58(super.field5742, 6406, 64, false, var4, 6406);
            this.field2131[1] = new class58(super.field5742, 6406, 64, false, var5, 6406);
            this.field2131[2] = new class58(super.field5742, 6406, 64, false, var3, 6406);
            this.method1135(29);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 62)
    public final void method1132(int arg0) {
        if (arg0 == 0) {
            if (!this.field2127) {
                super.field5742.method820(5890, 770, 0, arg0 ^ 121);
            } else {
                if (!this.field2130) {
                    super.field5742.method834(true, 2);
                    super.field5742.method856(false, (class386) null);
                }
                super.field5742.method834(true, 1);
                super.field5742.method856(false, (class386) null);
                super.field5742.method834(true, 0);
                this.field2136.method1687('\u0001', 4864);
                this.field2127 = false;
            }
            ++field2134;
            super.field5742.method857(8960, 8448, 8448);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V", line = 90)
    public final void method1133(boolean arg0, int arg1) {
        ++field2128;
        if (arg1 == 0) {
            if (this.field2136 != null && arg0) {
                if (!this.field2130) {
                    super.field5742.method834(true, 2);
                    super.field5742.method856(false, super.field5742.field1393);
                    super.field5742.method834(true, 0);
                }
                this.field2136.method1687('\u0000', 4864);
                this.field2127 = true;
            } else {
                super.field5742.method820(34168, 770, 0, 121);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V", line = 116)
    public static final void method1134(byte arg0, int arg1, int arg2) {
        if (~class5.field33 != -2) {
            if (~class5.field33 == -3) {
                class235.method1699(arg1, (byte) 103, arg2);
            }
        } else {
            class548.method3312(class703.field9896, arg2, arg1, (byte) 118);
        }
        if (arg0 == 35) {
            ++field2135;
            class5.field33 = 0;
            class703.field9896 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 252)
    private final void method1135(int arg0) {
        this.field2136 = new class231(super.field5742, 2);
        ++field2126;
        this.field2136.method1689(-31885, 0);
        super.field5742.method834(true, 1);
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
        if (!this.field2130) {
            super.field5742.method857(8960, 8448, 7681);
            super.field5742.method844(768, 34168, 0, (byte) -102);
            super.field5742.method834(true, 2);
            super.field5742.method857(8960, 7681, 260);
            super.field5742.method844(768, 34168, 0, (byte) -102);
            super.field5742.method844(770, 34168, 1, (byte) -102);
            super.field5742.method820(34167, 770, 0, 121);
        } else {
            super.field5742.method857(8960, 7681, 260);
            super.field5742.method844(770, 5890, 0, (byte) -102);
            super.field5742.method820(34167, 770, 0, 121);
        }
        super.field5742.method834(true, 0);
        this.field2136.method1690(30);
        this.field2136.method1689(-31885, 1);
        super.field5742.method834(true, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        int var2 = 21 / ((arg0 - -18) / 46);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field2130) {
            super.field5742.method857(8960, 8448, 8448);
            super.field5742.method844(768, 5890, 0, (byte) -102);
            super.field5742.method834(true, 2);
            super.field5742.method857(8960, 8448, 8448);
            super.field5742.method844(768, 5890, 0, (byte) -102);
            super.field5742.method844(768, 34168, 1, (byte) -102);
            super.field5742.method820(5890, 770, 0, 121);
        } else {
            super.field5742.method857(8960, 8448, 8448);
            super.field5742.method844(768, 5890, 0, (byte) -102);
            super.field5742.method820(5890, 770, 0, 121);
        }
        super.field5742.method834(true, 0);
        this.field2136.method1690(-116);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V", line = 322)
    public final void method1136(int arg0, int arg1, int arg2) {
        ++field2137;
        if (this.field2127) {
            super.field5742.method834(true, 1);
            super.field5742.method856(false, this.field2131[arg2 + -1]);
            super.field5742.method834(true, 0);
        }
        if (arg0 != -6561) {
            this.field2136 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z", line = 342)
    public final boolean method1137(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field2129;
            return true;
        }
    }
}
