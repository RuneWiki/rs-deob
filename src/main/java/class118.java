import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class118 extends class140 {

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Z")
    private boolean field1662 = false;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Z")
    private boolean field1666;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "[Lci;")
    private class384[] field1675;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "[I")
    public static int[] field1672 = new int[14];

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "Lwl;")
    private class348 field1671;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "[[I")
    public static int[][] field1670;

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lte;)V")
    public class118(class527 arg0) {
        super(arg0);
        if (arg0.field7853) {
            this.field1666 = ~arg0.field7807 > -4;
            int var2 = !this.field1666 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (var14 == 1) {
                            var15 = var12;
                        } else if (~var14 != -3) {
                            if (var14 == 3) {
                                var15 = -var13;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
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
            this.field1675 = new class384[3];
            this.field1675[0] = new class384(super.field1984, 6406, 64, false, var4, 6406);
            this.field1675[1] = new class384(super.field1984, 6406, 64, false, var5, 6406);
            this.field1675[2] = new class384(super.field1984, 6406, 64, false, var3, 6406);
            this.method853((byte) 112);
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
    public final void method143(int arg0) {
        ++field1674;
        if (!this.field1662) {
            super.field1984.method3107(5890, (byte) -47, 770, 0);
        } else {
            if (!this.field1666) {
                super.field1984.method3111(33984, 2);
                super.field1984.method3152(-2, (class228) null);
            }
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(arg0 + 5, (class228) null);
            super.field1984.method3111(33984, 0);
            this.field1671.method2110('\u0001', (byte) -124);
            this.field1662 = false;
        }
        if (arg0 == -7) {
            super.field1984.method3183(8448, arg0 ^ 125, 8448);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILjl;)V")
    public final void method146(int arg0, int arg1, class228 arg2) {
        if (arg0 == -7) {
            super.field1984.method3152(-2, arg2);
            ++field1668;
            super.field1984.method3121(-27745, arg1);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method849(byte arg0, String arg1) {
        ++field1667;
        if (arg0 > -112) {
            return 67;
        } else {
            int var2 = arg1.length();
            int var3 = 0;
            for (int var4 = 0; var4 < var2; ++var4) {
                char var5 = arg1.charAt(var4);
                if (~var5 < -128) {
                    if (~var5 >= -2048) {
                        var3 += 2;
                    } else {
                        var3 += 3;
                    }
                } else {
                    ++var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIBII)I")
    public static final int method850(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = arg1 & 3;
        if ((arg2 & 1) == 1) {
            int var8 = arg3;
            arg3 = arg6;
            arg6 = var8;
        }
        ++field1673;
        if (arg4 != 103) {
            method852(100, -56, -12, 51, false);
        }
        if (~var7 == -1) {
            return arg0;
        } else if (var7 == 1) {
            return -arg3 + 7 + -arg5 + 1;
        } else {
            return var7 == 2 ? -arg6 + 8 + -arg0 : arg5;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public static void method851(byte arg0) {
        field1670 = null;
        field1672 = null;
        if (arg0 >= -2) {
            method851((byte) -16);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
    public final void method144(int arg0, int arg1, int arg2) {
        if (this.field1662) {
            super.field1984.method3111(33984, 1);
            super.field1984.method3152(-2, this.field1675[arg2 + -1]);
            super.field1984.method3111(33984, 0);
        }
        if (arg1 != -4741) {
            field1665 = -18;
        }
        ++field1677;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIZ)V")
    public static final void method852(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            for (int var5 = 0; ~class533.field7942 < ~var5; ++var5) {
                Rectangle var6 = class621.field9154[var5];
                if (var6.x + var6.width > arg0 && var6.x < arg0 + arg3 && ~arg1 > ~(var6.y + var6.height) && ~var6.y > ~(arg1 + arg2)) {
                    class104.field1511[var5] = true;
                }
            }
            ++field1664;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
    public final boolean method149(int arg0) {
        if (arg0 >= -36) {
            this.method853((byte) -28);
        }
        ++field1669;
        return true;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZB)V")
    public final void method148(boolean arg0, byte arg1) {
        if (this.field1671 != null && arg0) {
            if (!this.field1666) {
                super.field1984.method3111(arg1 + 34070, 2);
                super.field1984.method3152(-2, super.field1984.field7796);
                super.field1984.method3111(33984, 0);
            }
            this.field1671.method2110('\u0000', (byte) -127);
            this.field1662 = true;
        } else {
            super.field1984.method3107(34168, (byte) -110, 770, 0);
        }
        ++field1663;
        if (arg1 != -86) {
            this.field1675 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
    private final void method853(byte arg0) {
        this.field1671 = new class348(super.field1984, 2);
        ++field1676;
        this.field1671.method2113(0, 25033);
        super.field1984.method3111(33984, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        int var2 = 32 / ((arg0 - -1) / 40);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field1666) {
            super.field1984.method3183(260, -126, 7681);
            super.field1984.method3157(5890, 0, true, 770);
            super.field1984.method3107(34167, (byte) -17, 770, 0);
        } else {
            super.field1984.method3183(7681, -125, 8448);
            super.field1984.method3157(34168, 0, true, 768);
            super.field1984.method3111(33984, 2);
            super.field1984.method3183(260, -127, 7681);
            super.field1984.method3157(34168, 0, true, 768);
            super.field1984.method3157(34168, 1, true, 770);
            super.field1984.method3107(34167, (byte) -31, 770, 0);
        }
        super.field1984.method3111(33984, 0);
        this.field1671.method2114(0);
        this.field1671.method2113(1, 25033);
        super.field1984.method3111(33984, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field1666) {
            super.field1984.method3183(8448, -125, 8448);
            super.field1984.method3157(5890, 0, true, 768);
            super.field1984.method3111(33984, 2);
            super.field1984.method3183(8448, -128, 8448);
            super.field1984.method3157(5890, 0, true, 768);
            super.field1984.method3157(34168, 1, true, 768);
            super.field1984.method3107(5890, (byte) -15, 770, 0);
        } else {
            super.field1984.method3183(8448, -124, 8448);
            super.field1984.method3157(5890, 0, true, 768);
            super.field1984.method3107(5890, (byte) -116, 770, 0);
        }
        super.field1984.method3111(33984, 0);
        this.field1671.method2114(0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)V")
    public final void method145(int arg0, boolean arg1) {
        super.field1984.method3183(8448, arg0 ^ 122, 7681);
        ++field1678;
        if (arg0 != -7) {
            method851((byte) 125);
        }
    }
}
