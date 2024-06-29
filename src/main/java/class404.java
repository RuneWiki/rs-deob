import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class404 extends class631 {

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Z")
    private boolean field5718 = false;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Z")
    private boolean field5719;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[Lku;")
    private class375[] field5721;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field5716 = -1;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lup;")
    private class274 field5723;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Ljava/lang/Object;")
    public static Object field5717;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method1507(byte arg0) {
        int var2 = -56 % ((-9 - arg0) / 53);
        ++field5710;
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZ)V", line = 15)
    public final void method1509(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method2514((byte) 83);
        }
        if (this.field5723 != null && arg1) {
            if (!this.field5719) {
                super.field8722.method884(2, true);
                super.field8722.method926(super.field8722.field1838, 67);
                super.field8722.method884(0, true);
            }
            this.field5723.method1783(-96, '\u0000');
            this.field5718 = true;
        } else {
            super.field8722.method948(34168, 0, 770, (byte) 75);
        }
        ++field5722;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V", line = 43)
    public final void method1506(int arg0, boolean arg1) {
        if (arg0 == 17660) {
            super.field8722.method946(false, 8448, 7681);
            ++field5711;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V", line = 55)
    public final void method1512(int arg0, int arg1, int arg2) {
        if (arg1 < 72) {
            this.method1509(true, true);
        }
        ++field5712;
        if (this.field5718) {
            super.field8722.method884(1, true);
            super.field8722.method926(this.field5721[arg0 + -1], 102);
            super.field8722.method884(0, true);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILta;)V", line = 73)
    public final void method1508(int arg0, int arg1, class210 arg2) {
        int var4 = -72 % ((arg1 - 52) / 62);
        ++field5713;
        super.field8722.method926(arg2, 81);
        super.field8722.method891(arg0, (byte) 17);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 86)
    public final void method1513(int arg0) {
        if (!this.field5718) {
            super.field8722.method948(5890, 0, 770, (byte) -89);
        } else {
            if (!this.field5719) {
                super.field8722.method884(2, true);
                super.field8722.method926((class210) null, 97);
            }
            super.field8722.method884(1, true);
            super.field8722.method926((class210) null, 44);
            super.field8722.method884(0, true);
            this.field5723.method1783(-35, '\u0001');
            this.field5718 = false;
        }
        ++field5720;
        if (arg0 <= 74) {
            this.method1513(-69);
        }
        super.field8722.method946(false, 8448, 8448);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 116)
    public static void method2513(byte arg0) {
        field5717 = null;
        if (arg0 != 52) {
            method2513((byte) -52);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 126)
    private final void method2514(byte arg0) {
        ++field5714;
        this.field5723 = new class274(super.field8722, 2);
        this.field5723.method1785(0, 111);
        super.field8722.method884(1, true);
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
        if (this.field5719) {
            super.field8722.method946(false, 260, 7681);
            super.field8722.method883((byte) 34, 0, 770, 5890);
            super.field8722.method948(34167, 0, 770, (byte) 71);
        } else {
            super.field8722.method946(false, 7681, 8448);
            super.field8722.method883((byte) 34, 0, 768, 34168);
            super.field8722.method884(2, true);
            super.field8722.method946(false, 260, 7681);
            super.field8722.method883((byte) 34, 0, 768, 34168);
            super.field8722.method883((byte) 34, 1, 770, 34168);
            super.field8722.method948(34167, 0, 770, (byte) -106);
        }
        super.field8722.method884(0, true);
        this.field5723.method1784(-50135600);
        this.field5723.method1785(1, 95);
        super.field8722.method884(1, true);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 > 104) {
            OpenGL.glMatrixMode(5888);
            if (!this.field5719) {
                super.field8722.method946(false, 8448, 8448);
                super.field8722.method883((byte) 34, 0, 768, 5890);
                super.field8722.method884(2, true);
                super.field8722.method946(false, 8448, 8448);
                super.field8722.method883((byte) 34, 0, 768, 5890);
                super.field8722.method883((byte) 34, 1, 768, 34168);
                super.field8722.method948(5890, 0, 770, (byte) 110);
            } else {
                super.field8722.method946(false, 8448, 8448);
                super.field8722.method883((byte) 34, 0, 768, 5890);
                super.field8722.method948(5890, 0, 770, (byte) -111);
            }
            super.field8722.method884(0, true);
            this.field5723.method1784(-50135600);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Leea;)V", line = 198)
    public class404(class131 arg0) {
        super(arg0);
        if (arg0.field1886) {
            this.field5719 = arg0.field1861 < 3;
            int var2 = !this.field5719 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (var14 != 2) {
                            if (~var14 == -4) {
                                var15 = -var12;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
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
            this.field5721 = new class375[3];
            this.field5721[0] = new class375(super.field8722, 6406, 64, false, var4, 6406);
            this.field5721[1] = new class375(super.field8722, 6406, 64, false, var5, 6406);
            this.field5721[2] = new class375(super.field8722, 6406, 64, false, var3, 6406);
            this.method2514((byte) 113);
        }
    }
}
