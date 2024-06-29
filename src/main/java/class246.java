import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class246 extends class337 {

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "Z")
    private boolean field3154 = false;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "Z")
    private boolean field3144;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "[Lkh;")
    private class15[] field3147;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "Lrg;")
    public static class548 field3153 = new class548(6, -1);

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "Z")
    public static boolean field3158 = false;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "Z")
    public static boolean field3160 = true;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    public static int field3156 = 0;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "Lam;")
    private class538 field3146;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3155;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)V", line = 3)
    private final void method1386(byte arg0) {
        this.field3146 = new class538(super.field4382, 2);
        ++field3150;
        this.field3146.method3139(0, 0);
        super.field4382.method3078(arg0 + 34001, 1);
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
        if (!this.field3144) {
            super.field4382.method3099(8448, 7681, 8);
            super.field4382.method3126(false, 0, 768, 34168);
            super.field4382.method3078(arg0 + 34001, 2);
            super.field4382.method3099(7681, 260, 8);
            super.field4382.method3126(false, 0, 768, 34168);
            super.field4382.method3126(false, 1, 770, 34168);
            super.field4382.method3098(770, 0, (byte) 14, 34167);
        } else {
            super.field4382.method3099(7681, 260, 8);
            super.field4382.method3126(false, 0, 770, 5890);
            super.field4382.method3098(770, 0, (byte) 14, 34167);
        }
        super.field4382.method3078(33984, 0);
        this.field3146.method3144(-106);
        this.field3146.method3139(1, 0);
        super.field4382.method3078(33984, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field3144) {
            super.field4382.method3099(8448, 8448, 8);
            super.field4382.method3126(false, 0, 768, 5890);
            super.field4382.method3098(770, 0, (byte) 14, 5890);
        } else {
            super.field4382.method3099(8448, 8448, arg0 ^ -25);
            super.field4382.method3126(false, 0, 768, 5890);
            super.field4382.method3078(33984, 2);
            super.field4382.method3099(8448, 8448, arg0 + 25);
            super.field4382.method3126(false, 0, 768, 5890);
            super.field4382.method3126(false, 1, 768, 34168);
            super.field4382.method3098(770, 0, (byte) 14, 5890);
        }
        super.field4382.method3078(33984, 0);
        if (arg0 == -17) {
            this.field3146.method3144(-123);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method1387(int arg0, int arg1, int arg2) {
        int var3 = 111 / ((arg2 - 19) / 63);
        ++field3151;
        return class422.method2391((byte) 62, arg0, arg1) || class416.method2374(arg1, arg0, (byte) -61);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BZ)V", line = 84)
    public final void method252(byte arg0, boolean arg1) {
        ++field3157;
        if (arg0 > 10) {
            if (this.field3146 != null && arg1) {
                if (!this.field3144) {
                    super.field4382.method3078(33984, 2);
                    super.field4382.method3083((byte) 76, super.field4382.field7802);
                    super.field4382.method3078(33984, 0);
                }
                this.field3146.method3141(37, '\u0000');
                this.field3154 = true;
            } else {
                super.field4382.method3098(770, 0, (byte) 14, 34168);
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V", line = 110)
    public final void method251(byte arg0) {
        if (arg0 > -21) {
            field3160 = false;
        }
        ++field3145;
        if (!this.field3154) {
            super.field4382.method3098(770, 0, (byte) 14, 5890);
        } else {
            if (!this.field3144) {
                super.field4382.method3078(33984, 2);
                super.field4382.method3083((byte) 77, (class238) null);
            }
            super.field4382.method3078(33984, 1);
            super.field4382.method3083((byte) 117, (class238) null);
            super.field4382.method3078(33984, 0);
            this.field3146.method3141(16, '\u0001');
            this.field3154 = false;
        }
        super.field4382.method3099(8448, 8448, 8);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZI)V", line = 141)
    public final void method256(boolean arg0, int arg1) {
        super.field4382.method3099(7681, 8448, 8);
        if (arg1 != 28300) {
            method1387(-117, 0, -125);
        }
        ++field3148;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IBLuu;)V", line = 154)
    public final void method253(int arg0, byte arg1, class238 arg2) {
        super.field4382.method3083((byte) 99, arg2);
        if (arg1 == 93) {
            ++field3159;
            super.field4382.method3063(arg0, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)Z", line = 169)
    public final boolean method257(byte arg0) {
        if (arg0 <= 115) {
            this.field3154 = true;
        }
        ++field3149;
        return true;
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lmh;)V", line = 180)
    public class246(class537 arg0) {
        super(arg0);
        if (arg0.field7772) {
            this.field3144 = ~arg0.field7759 > -4;
            int var2 = this.field3144 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 == 1) {
                            var15 = var13;
                        } else if (var14 == 2) {
                            var15 = var12;
                        } else if (~var14 == -4) {
                            var15 = -var12;
                        } else if (var14 != 4) {
                            var15 = -var11;
                        } else {
                            var15 = var11;
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
            this.field3147 = new class15[3];
            this.field3147[0] = new class15(super.field4382, 6406, 64, false, var4, 6406);
            this.field3147[1] = new class15(super.field4382, 6406, 64, false, var5, 6406);
            this.field3147[2] = new class15(super.field4382, 6406, 64, false, var3, 6406);
            this.method1386((byte) -17);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V", line = 293)
    public static void method1388(int arg0) {
        field3155 = null;
        field3153 = null;
        if (arg0 != -7) {
            method1387(85, 46, -71);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZII)V", line = 305)
    public final void method258(boolean arg0, int arg1, int arg2) {
        if (this.field3154) {
            super.field4382.method3078(33984, 1);
            super.field4382.method3083((byte) 79, this.field3147[arg1 - 1]);
            super.field4382.method3078(33984, 0);
        }
        if (arg0) {
            method1388(-61);
        }
        ++field3152;
    }
}
