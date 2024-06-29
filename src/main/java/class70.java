import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class70 extends class159 {

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "Lcd;")
    private class23 field1068;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "Leja;")
    private class652 field1072;

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "Lst;")
    public static class335 field1063 = new class335(66, -1);

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "[Lgca;")
    public static class209[] field1066 = new class209[16];

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "Lhq;")
    private class367 field1061;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)Z")
    public final boolean method372(boolean arg0) {
        ++field1067;
        if (!arg0) {
            this.method373(false, (byte) -92);
        }
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
    public final void method369(byte arg0) {
        ++field1058;
        this.field1061.method2315(true, '\u0001');
        if (super.field2221.field9136 > 0) {
            super.field2221.method3738((byte) -63, 1);
            super.field2221.method3681((class559) null, 0);
            super.field2221.method3732(0.0F, 4, 1.0F);
            super.field2221.method3738((byte) -63, 0);
        }
        super.field2221.method3729((byte) 95, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        if (arg0 >= -59) {
            field1066 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZB)V")
    public final void method373(boolean arg0, byte arg1) {
        ++field1062;
        if (~super.field2221.field9136 < -1) {
            float var3 = -0.5F / (float) super.field2221.field9136;
            super.field2221.method3738((byte) -63, 1);
            class611.field8220[1] = 0.0F;
            class611.field8220[0] = 0.0F;
            class611.field8220[3] = super.field2221.field9100 * var3 + 0.25F;
            class611.field8220[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class611.field8220, 0);
            OpenGL.glPopMatrix();
            super.field2221.method3732((float) super.field2221.field9136, 4, 0.5F);
            super.field2221.method3681(this.field1072, 0);
            super.field2221.method3738((byte) -63, 0);
        }
        this.field1061.method2315(true, '\u0000');
        if (arg1 >= -109) {
            this.field1061 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)V")
    public static void method542(byte arg0) {
        field1063 = null;
        if (arg0 > -118) {
            method542((byte) 54);
        }
        field1066 = null;
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ldw;Lcd;)V")
    public class70(class664 arg0, class23 arg1) {
        super(arg0);
        this.field1068 = arg1;
        this.method546(-3525);
        this.field1072 = new class652(super.field2221, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1072.method3647(false, (byte) 20);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lwu;II)V")
    public final void method368(class559 arg0, int arg1, int arg2) {
        if (arg1 != 26264) {
            this.field1072 = null;
        }
        ++field1065;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIBI)I")
    public static final int method543(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field1059;
        if (class433.field6043 == null) {
            return 0;
        } else {
            if (arg4 <= 21) {
                method543(30, 15, 45, 2, (byte) -126, -102);
            }
            if (~arg0 > -4) {
                int var6 = arg2 >> 9;
                int var7 = arg1 >> 9;
                if (~arg3 > -1 || arg5 < 0 || class277.field4036 + -1 < arg3 || class667.field9202 + -1 < arg5) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > class277.field4036 + -1 || ~(class667.field9202 + -1) > ~var7) {
                    return 0;
                }
                boolean var8 = (class692.field9623[1][arg2 >> 9][arg1 >> 9] & 2) != 0;
                if (~(511 & arg2) == -1) {
                    boolean var9 = (class692.field9623[1][var6 + -1][arg1 >> 9] & 2) != 0;
                    boolean var10 = (2 & class692.field9623[1][var6][arg1 >> 9]) != 0;
                    if (var10 == !var9) {
                        var8 = ~(class692.field9623[1][arg3][arg5] & 2) != -1;
                    }
                }
                if (~(511 & arg1) == -1) {
                    boolean var11 = (class692.field9623[1][arg2 >> 9][var7 + -1] & 2) != 0;
                    boolean var12 = (class692.field9623[1][arg2 >> 9][var7] & 2) != 0;
                    if (var11 == !var12) {
                        var8 = (class692.field9623[1][arg3][arg5] & 2) != 0;
                    }
                }
                if (var8) {
                    ++arg0;
                }
            }
            return class433.field6043[arg0].method2172(arg2, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZII)V")
    public final void method367(boolean arg0, int arg1, int arg2) {
        ++field1060;
        if ((arg1 & 1) != 1) {
            if (!this.field1068.field284) {
                super.field2221.method3681(this.field1068.field280[0], 0);
            } else {
                super.field2221.method3681(this.field1068.field282, 0);
                class611.field8220[2] = 0.0F;
                class611.field8220[1] = 0.0F;
                class611.field8220[3] = 0.0F;
                class611.field8220[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class611.field8220, 0);
            }
        } else if (this.field1068.field284) {
            super.field2221.method3681(this.field1068.field282, 0);
            class611.field8220[0] = 0.0F;
            class611.field8220[3] = (float) (super.field2221.field9008 % 4000) / 4000.0F;
            class611.field8220[2] = 0.0F;
            class611.field8220[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class611.field8220, 0);
        } else {
            int var4 = super.field2221.field9008 % 4000 * 16 / 4000;
            super.field2221.method3681(this.field1068.field280[var4], 0);
        }
        if (!arg0) {
            this.field1068 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIII)V")
    public static final void method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1070;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (-var12 + 1) * var8 - -var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        if (arg2 > -69) {
            method545(-38L, -68);
        }
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 + -1) * var15;
        class102.method675(arg5, 63, -arg3 + arg4, arg3 + arg4, class538.field7454[arg1]);
        while (~var7 < -1) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            --var7;
            var18 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg4 + var6;
            int var24 = -var6 + arg4;
            class102.method675(arg5, 93, var24, var23, class538.field7454[var21]);
            class102.method675(arg5, 78, var24, var23, class538.field7454[var22]);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(BZ)V")
    public final void method370(byte arg0, boolean arg1) {
        if (arg0 >= 88) {
            ++field1064;
            super.field2221.method3729((byte) 95, 260, 8448);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(JI)V")
    public static final void method545(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        ++field1071;
        int var3 = -43 / ((arg1 - 55) / 58);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
    private final void method546(int arg0) {
        this.field1061 = new class367(super.field2221, 2);
        ++field1069;
        this.field1061.method2311(true, 0);
        super.field2221.method3738((byte) -63, 1);
        super.field2221.method3729((byte) 95, 7681, 260);
        super.field2221.method3718(34168, 107, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2221.method3738((byte) -63, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1068.field284) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field1061.method2314((byte) -117);
        this.field1061.method2311(true, 1);
        super.field2221.method3738((byte) -63, 1);
        super.field2221.method3729((byte) 95, 8448, 8448);
        super.field2221.method3718(5890, 111, 768, 0);
        OpenGL.glDisable(3168);
        super.field2221.method3738((byte) -63, 0);
        if (arg0 == -3525) {
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field1068.field284) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field1061.method2314((byte) -120);
        }
    }
}
