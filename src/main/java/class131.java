import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class131 extends class605 {

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Z")
    private boolean field1929 = false;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Z")
    private boolean field1936;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[Lqe;")
    private class431[] field1932;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "[[[I")
    public static int[][][] field1940 = new int[2][][];

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Lhg;")
    private class642 field1935;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    public static int[] field1934;

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lok;)V")
    public class131(class228 arg0) {
        super(arg0);
        if (arg0.field3493) {
            this.field1936 = ~arg0.field3460 > -4;
            int var2 = this.field1936 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 == 1) {
                                var15 = var12;
                            } else if (~var14 != -3) {
                                if (~var14 == -4) {
                                    var15 = -var13;
                                } else if (~var14 == -5) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
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
            this.field1932 = new class431[3];
            this.field1932[0] = new class431(super.field8542, 6406, 64, false, var4, 6406);
            this.field1932[1] = new class431(super.field8542, 6406, 64, false, var5, 6406);
            this.field1932[2] = new class431(super.field8542, 6406, 64, false, var3, 6406);
            this.method971(5890);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)V")
    public final void method47(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field1931;
            if (this.field1929) {
                super.field8542.method1500(33984, 1);
                super.field8542.method1505(-2, this.field1932[arg0 + -1]);
                super.field8542.method1500(33984, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method970(byte arg0) {
        field1934 = null;
        field1940 = null;
        if (arg0 < 90) {
            field1940 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    private final void method971(int arg0) {
        this.field1935 = new class642(super.field8542, 2);
        ++field1941;
        this.field1935.method3579((byte) -87, 0);
        super.field8542.method1500(33984, 1);
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
        if (this.field1936) {
            super.field8542.method1527(1, 260, 7681);
            super.field8542.method1503(0, 5890, (byte) 2, 770);
            super.field8542.method1574(34167, (byte) -128, 770, 0);
        } else {
            super.field8542.method1527(1, 7681, 8448);
            super.field8542.method1503(0, 34168, (byte) 2, 768);
            super.field8542.method1500(33984, 2);
            super.field8542.method1527(1, 260, 7681);
            super.field8542.method1503(0, 34168, (byte) 2, 768);
            super.field8542.method1503(1, 34168, (byte) 2, 770);
            super.field8542.method1574(34167, (byte) -128, 770, 0);
        }
        super.field8542.method1500(33984, 0);
        this.field1935.method3577((byte) -120);
        this.field1935.method3579((byte) -69, 1);
        super.field8542.method1500(33984, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field1936) {
            super.field8542.method1527(arg0 + -5889, 8448, 8448);
            super.field8542.method1503(0, 5890, (byte) 2, 768);
            super.field8542.method1500(33984, 2);
            super.field8542.method1527(1, 8448, 8448);
            super.field8542.method1503(0, 5890, (byte) 2, 768);
            super.field8542.method1503(1, 34168, (byte) 2, 768);
            super.field8542.method1574(5890, (byte) -128, 770, 0);
        } else {
            super.field8542.method1527(1, 8448, 8448);
            super.field8542.method1503(0, 5890, (byte) 2, 768);
            super.field8542.method1574(5890, (byte) -128, 770, 0);
        }
        super.field8542.method1500(33984, 0);
        this.field1935.method3577((byte) -34);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V")
    public final void method51(boolean arg0, int arg1) {
        ++field1937;
        if (this.field1935 != null && arg0) {
            if (!this.field1936) {
                super.field8542.method1500(33984, 2);
                super.field8542.method1505(-2, super.field8542.field3544);
                super.field8542.method1500(33984, 0);
            }
            this.field1935.method3574(61, '\u0000');
            this.field1929 = true;
        } else {
            super.field8542.method1574(34168, (byte) -128, 770, 0);
        }
        if (arg1 > -127) {
            field1930 = -2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILip;I)V")
    public final void method43(int arg0, class657 arg1, int arg2) {
        ++field1933;
        super.field8542.method1505(-2, arg1);
        if (arg2 != 0) {
            this.method45(-109);
        }
        super.field8542.method1497(arg0, (byte) -29);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z")
    public final boolean method48(boolean arg0) {
        if (arg0) {
            this.method45(-55);
        }
        ++field1942;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (this.field1929) {
            if (!this.field1936) {
                super.field8542.method1500(33984, 2);
                super.field8542.method1505(-2, (class657) null);
            }
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, (class657) null);
            super.field8542.method1500(33984, 0);
            this.field1935.method3574(117, '\u0001');
            this.field1929 = false;
        } else {
            super.field8542.method1574(5890, (byte) -128, 770, 0);
        }
        if (arg0 == 0) {
            ++field1939;
            super.field8542.method1527(arg0 + 1, 8448, 8448);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZB)V")
    public final void method46(boolean arg0, byte arg1) {
        ++field1938;
        super.field8542.method1527(1, 8448, 7681);
        if (arg1 > -16) {
            method970((byte) -47);
        }
    }
}
