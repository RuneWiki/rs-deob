import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class175 extends class509 {

    @OriginalMember(owner = "client!or", name = "k", descriptor = "Z")
    private boolean field2692 = false;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Z")
    private boolean field2700;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "[Lrh;")
    private class32[] field2695;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field2690 = -1;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "[[I")
    public static int[][] field2696 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "Lgw;")
    private class108 field2694;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BILin;)V")
    public final void method125(byte arg0, int arg1, class169 arg2) {
        super.field7409.method1749(25752, arg2);
        if (arg0 < 9) {
            this.method122(false, 72);
        }
        ++field2702;
        super.field7409.method1734(-50, arg1);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ltt;)V")
    public class175(class249 arg0) {
        super(arg0);
        if (arg0.field4025) {
            this.field2700 = ~arg0.field3996 > -4;
            int var2 = !this.field2700 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (var14 == 2) {
                                var15 = var12;
                            } else if (var14 == 3) {
                                var15 = -var12;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
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
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
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
            this.field2695 = new class32[3];
            this.field2695[0] = new class32(super.field7409, 6406, 64, false, var4, 6406);
            this.field2695[1] = new class32(super.field7409, 6406, 64, false, var5, 6406);
            this.field2695[2] = new class32(super.field7409, 6406, 64, false, var3, 6406);
            this.method1243(78);
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    private final void method1243(int arg0) {
        this.field2694 = new class108(super.field7409, 2);
        ++field2704;
        this.field2694.method848(0, true);
        super.field7409.method1756(1, 108);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        int var2 = -62 / ((23 - arg0) / 41);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field2700) {
            super.field7409.method1741(260, (byte) 107, 7681);
            super.field7409.method1780(770, 5890, 34176, 0);
            super.field7409.method1778(34167, 770, 1, 0);
        } else {
            super.field7409.method1741(7681, (byte) -123, 8448);
            super.field7409.method1780(768, 34168, 34176, 0);
            super.field7409.method1756(2, -12);
            super.field7409.method1741(260, (byte) 127, 7681);
            super.field7409.method1780(768, 34168, 34176, 0);
            super.field7409.method1780(770, 34168, 34176, 1);
            super.field7409.method1778(34167, 770, 1, 0);
        }
        super.field7409.method1756(0, -54);
        this.field2694.method851(77);
        this.field2694.method848(1, true);
        super.field7409.method1756(1, 108);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field2700) {
            super.field7409.method1741(8448, (byte) -100, 8448);
            super.field7409.method1780(768, 5890, 34176, 0);
            super.field7409.method1778(5890, 770, 1, 0);
        } else {
            super.field7409.method1741(8448, (byte) -100, 8448);
            super.field7409.method1780(768, 5890, 34176, 0);
            super.field7409.method1756(2, 117);
            super.field7409.method1741(8448, (byte) 105, 8448);
            super.field7409.method1780(768, 5890, 34176, 0);
            super.field7409.method1780(768, 34168, 34176, 1);
            super.field7409.method1778(5890, 770, 1, 0);
        }
        super.field7409.method1756(0, -107);
        this.field2694.method851(75);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        ++field2697;
        return arg0 == -32170;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BZ)V")
    public final void method128(byte arg0, boolean arg1) {
        ++field2689;
        super.field7409.method1741(8448, (byte) -93, 7681);
        if (arg0 <= 44) {
            this.field2700 = false;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ)V")
    public final void method123(int arg0, int arg1, boolean arg2) {
        if (this.field2692) {
            super.field7409.method1756(1, -92);
            super.field7409.method1749(25752, this.field2695[arg1 + -1]);
            super.field7409.method1756(0, -56);
        }
        ++field2693;
        if (arg2) {
            this.method124(66);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)V")
    public static final void method1244(int arg0, byte arg1) {
        ++field2703;
        if (class31.method189(14, arg0)) {
            class89.method774(class237.field3555[arg0], -1, (byte) 117);
            if (arg1 != -109) {
                field2690 = 100;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public final void method121(byte arg0) {
        ++field2698;
        if (!this.field2692) {
            super.field7409.method1778(5890, 770, 1, 0);
        } else {
            if (!this.field2700) {
                super.field7409.method1756(2, 123);
                super.field7409.method1749(arg0 + 25714, (class169) null);
            }
            super.field7409.method1756(1, -100);
            super.field7409.method1749(arg0 ^ 25790, (class169) null);
            super.field7409.method1756(0, 116);
            this.field2694.method850(false, '\u0001');
            this.field2692 = false;
        }
        super.field7409.method1741(8448, (byte) 109, 8448);
        if (arg0 != 38) {
            field2690 = 3;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
    public static void method1245(boolean arg0) {
        if (arg0) {
            field2696 = null;
        }
        field2696 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
    public final void method122(boolean arg0, int arg1) {
        if (this.field2694 != null && arg0) {
            if (!this.field2700) {
                super.field7409.method1756(2, arg1 + -105);
                super.field7409.method1749(25752, super.field7409.field4054);
                super.field7409.method1756(0, arg1 + -112);
            }
            this.field2694.method850(false, '\u0000');
            this.field2692 = true;
        } else {
            super.field7409.method1778(34168, 770, 1, 0);
        }
        ++field2701;
        if (arg1 != 64) {
            this.field2692 = true;
        }
    }
}
