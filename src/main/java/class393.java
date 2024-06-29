import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class393 extends class548 {

    @OriginalMember(owner = "client!om", name = "r", descriptor = "Z")
    private boolean field5659 = false;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
    private boolean field5658;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "[Liv;")
    private class107[] field5660;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field5663 = 104;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Lik;")
    private class222 field5667;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "Lof;")
    public static class647 field5664;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Ljava/awt/Frame;")
    public static Frame field5661;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method756(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field5666;
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lru;II)V", line = 17)
    public final void method760(class205 arg0, int arg1, int arg2) {
        super.field7571.method1595((byte) 125, arg0);
        ++field5665;
        super.field7571.method1601(25456, arg2);
        if (arg1 != -1) {
            field5664 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)I", line = 29)
    public static final int method2417(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & arg2) * arg1 >> 7;
        ++field5656;
        if (~var3 <= -3) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (65408 & arg0) + var3;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 49)
    private final void method2418(byte arg0) {
        ++field5655;
        this.field5667 = new class222(super.field7571, 2);
        this.field5667.method1416(0, -28867);
        super.field7571.method1631(1, 12);
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
        if (!this.field5658) {
            super.field7571.method1630(7681, 8448, 127);
            super.field7571.method1600(17104, 34168, 0, 768);
            super.field7571.method1631(2, arg0 + -90);
            super.field7571.method1630(260, 7681, 103);
            super.field7571.method1600(17104, 34168, 0, 768);
            super.field7571.method1600(arg0 ^ 17058, 34168, 1, 770);
            super.field7571.method1581(770, 13112, 0, 34167);
        } else {
            super.field7571.method1630(260, 7681, 127);
            super.field7571.method1600(17104, 5890, 0, 770);
            super.field7571.method1581(770, arg0 + 12998, 0, 34167);
        }
        super.field7571.method1631(0, 100);
        this.field5667.method1418(4864);
        this.field5667.method1416(1, -28867);
        super.field7571.method1631(1, -96);
        if (arg0 != 114) {
            this.field5660 = null;
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field5658) {
            super.field7571.method1630(8448, 8448, 111);
            super.field7571.method1600(arg0 ^ 17058, 5890, 0, 768);
            super.field7571.method1631(2, -74);
            super.field7571.method1630(8448, 8448, 101);
            super.field7571.method1600(arg0 ^ 17058, 5890, 0, 768);
            super.field7571.method1600(arg0 + 16990, 34168, 1, 768);
            super.field7571.method1581(770, 13112, 0, 5890);
        } else {
            super.field7571.method1630(8448, 8448, 95);
            super.field7571.method1600(arg0 ^ 17058, 5890, 0, 768);
            super.field7571.method1581(770, 13112, 0, 5890);
        }
        super.field7571.method1631(0, -72);
        this.field5667.method1418(4864);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 118)
    public static void method2419(byte arg0) {
        int var1 = -72 / ((arg0 - -62) / 41);
        field5661 = null;
        field5664 = null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Llf;)V", line = 130)
    public class393(class250 arg0) {
        super(arg0);
        if (arg0.field3603) {
            this.field5658 = ~arg0.field3569 > -4;
            int var2 = this.field5658 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (~var14 != -3) {
                                if (~var14 != -4) {
                                    if (~var14 == -5) {
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
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field5660 = new class107[3];
            this.field5660[0] = new class107(super.field7571, 6406, 64, false, var4, 6406);
            this.field5660[1] = new class107(super.field7571, 6406, 64, false, var5, 6406);
            this.field5660[2] = new class107(super.field7571, 6406, 64, false, var3, 6406);
            this.method2418((byte) 114);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 247)
    public final void method759(int arg0) {
        if (this.field5659) {
            if (!this.field5658) {
                super.field7571.method1631(2, -74);
                super.field7571.method1595((byte) 74, (class205) null);
            }
            super.field7571.method1631(1, arg0 + -109);
            super.field7571.method1595((byte) 100, (class205) null);
            super.field7571.method1631(0, 30);
            this.field5667.method1413('\u0001', 0);
            this.field5659 = false;
        } else {
            super.field7571.method1581(770, arg0 + 13109, 0, 5890);
        }
        ++field5669;
        if (arg0 != 3) {
            this.method754(false, false);
        }
        super.field7571.method1630(8448, 8448, 100);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZ)V", line = 278)
    public final void method754(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field5658 = true;
        }
        if (this.field5667 != null && arg0) {
            if (!this.field5658) {
                super.field7571.method1631(2, 41);
                super.field7571.method1595((byte) 79, super.field7571.field3576);
                super.field7571.method1631(0, 20);
            }
            this.field5667.method1413('\u0000', 0);
            this.field5659 = true;
        } else {
            super.field7571.method1581(770, 13112, 0, 34168);
        }
        ++field5657;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([J[II)V", line = 311)
    public static final void method2420(long[] arg0, int[] arg1, int arg2) {
        if (arg2 > -67) {
            method2419((byte) -125);
        }
        ++field5668;
        class151.method1061(arg0, arg0.length + -1, 0, 1, arg1);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V", line = 322)
    public final void method753(int arg0, int arg1, int arg2) {
        if (this.field5659) {
            super.field7571.method1631(1, 127);
            super.field7571.method1595((byte) 120, this.field5660[arg1 + -1]);
            super.field7571.method1631(0, arg2 ^ 14145);
        }
        if (arg2 != 14106) {
            method2417(-49, 12, -6);
        }
        ++field5662;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V", line = 340)
    public final void method758(boolean arg0, int arg1) {
        ++field5654;
        if (arg1 != 0) {
            this.field5667 = null;
        }
        super.field7571.method1630(8448, 7681, 118);
    }
}
