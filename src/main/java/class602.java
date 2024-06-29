import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class602 extends class702 {

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Z")
    private boolean field8673 = false;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Z")
    private boolean field8677;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "[Lsa;")
    private class187[] field8682;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Ljk;")
    public static class585 field8671 = new class585(17, 4);

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Lwd;")
    public static class248 field8681;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Lqt;")
    private class588 field8676;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field8684;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public final void method1002(boolean arg0) {
        if (arg0) {
            if (!this.field8673) {
                super.field9912.method2938(-124, 5890, 770, 0);
            } else {
                if (!this.field8677) {
                    super.field9912.method2975(2, 78);
                    super.field9912.method2932(arg0, (class197) null);
                }
                super.field9912.method2975(1, 122);
                super.field9912.method2932(true, (class197) null);
                super.field9912.method2975(0, 86);
                this.field8676.method3409((byte) 114, '\u0001');
                this.field8673 = false;
            }
            ++field8678;
            super.field9912.method2948(8448, 8448, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V")
    public final void method1000(boolean arg0, boolean arg1) {
        super.field9912.method2948(8448, 7681, (byte) 98);
        if (!arg0) {
            this.field8677 = true;
        }
        ++field8674;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method3469(int arg0, String arg1) {
        if (arg0 != 6298) {
            method3472(-105);
        }
        ++field8670;
        return class467.method2737(field8684 != null ? field8684 : (field8684 = method3473("gl")), (byte) 124, arg1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public final void method1001(int arg0, int arg1, int arg2) {
        int var4 = 90 / ((arg1 - 55) / 36);
        if (this.field8673) {
            super.field9912.method2975(1, 83);
            super.field9912.method2932(true, this.field8682[arg0 - 1]);
            super.field9912.method2975(0, 108);
        }
        ++field8669;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lkga;)V")
    public class602(class506 arg0) {
        super(arg0);
        if (arg0.field7410) {
            this.field8677 = arg0.field7319 < 3;
            int var2 = !this.field8677 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (var14 == 1) {
                            var15 = var12;
                        } else if (var14 == 2) {
                            var15 = var13;
                        } else if (var14 != 3) {
                            if (~var14 == -5) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
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
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field8682 = new class187[3];
            this.field8682[0] = new class187(super.field9912, 6406, 64, false, var4, 6406);
            this.field8682[1] = new class187(super.field9912, 6406, 64, false, var5, 6406);
            this.field8682[2] = new class187(super.field9912, 6406, 64, false, var3, 6406);
            this.method3471((byte) 118);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)Z")
    public final boolean method998(boolean arg0) {
        ++field8679;
        if (arg0) {
            field8681 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljf;II)V")
    public final void method1004(class197 arg0, int arg1, int arg2) {
        ++field8683;
        super.field9912.method2932(true, arg0);
        if (arg2 == 58) {
            super.field9912.method2985(arg1, -26973);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method3470(int arg0) {
        if (arg0 != 5890) {
            field8671 = null;
        }
        field8681 = null;
        field8671 = null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    private final void method3471(byte arg0) {
        this.field8676 = new class588(super.field9912, 2);
        ++field8672;
        this.field8676.method3405(0, (byte) 103);
        super.field9912.method2975(1, 95);
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
        if (arg0 < 116) {
            this.method998(true);
        }
        if (this.field8677) {
            super.field9912.method2948(260, 7681, (byte) -118);
            super.field9912.method2968(770, 0, (byte) 59, 5890);
            super.field9912.method2938(-128, 34167, 770, 0);
        } else {
            super.field9912.method2948(7681, 8448, (byte) -117);
            super.field9912.method2968(768, 0, (byte) 43, 34168);
            super.field9912.method2975(2, 109);
            super.field9912.method2948(260, 7681, (byte) 81);
            super.field9912.method2968(768, 0, (byte) -116, 34168);
            super.field9912.method2968(770, 1, (byte) -108, 34168);
            super.field9912.method2938(-126, 34167, 770, 0);
        }
        super.field9912.method2975(0, 109);
        this.field8676.method3410(1);
        this.field8676.method3405(1, (byte) 110);
        super.field9912.method2975(1, 95);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field8677) {
            super.field9912.method2948(8448, 8448, (byte) 126);
            super.field9912.method2968(768, 0, (byte) 106, 5890);
            super.field9912.method2938(-127, 5890, 770, 0);
        } else {
            super.field9912.method2948(8448, 8448, (byte) 24);
            super.field9912.method2968(768, 0, (byte) -112, 5890);
            super.field9912.method2975(2, 109);
            super.field9912.method2948(8448, 8448, (byte) -108);
            super.field9912.method2968(768, 0, (byte) -121, 5890);
            super.field9912.method2968(768, 1, (byte) 42, 34168);
            super.field9912.method2938(-127, 5890, 770, 0);
        }
        super.field9912.method2975(0, 73);
        this.field8676.method3410(1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
    public final void method1005(boolean arg0, int arg1) {
        if (this.field8676 != null && arg0) {
            if (!this.field8677) {
                super.field9912.method2975(2, 76);
                super.field9912.method2932(true, super.field9912.field7323);
                super.field9912.method2975(0, 106);
            }
            this.field8676.method3409((byte) 114, '\u0000');
            this.field8673 = true;
        } else {
            super.field9912.method2938(-126, 34168, 770, 0);
        }
        if (arg1 >= -102) {
            method3470(-54);
        }
        ++field8675;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)I")
    public static final int method3472(int arg0) {
        ++field8680;
        if (arg0 != 8448) {
            method3469(-80, (String) null);
        }
        return class407.field5785++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3473(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
