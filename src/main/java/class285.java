import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class285 extends class189 {

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Lpq;")
    private class132 field4170;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "Lnm;")
    private class335 field4175;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Leh;")
    public static class246 field4171 = new class246(96, 5);

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "[C")
    public static char[] field4181 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field4182 = 0;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field4183 = 328;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lgk;")
    private class336 field4167;

    static {
        new class530("Use", "Benutzen", "Utiliser", "Usar");
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method53(byte arg0) {
        int var2 = -63 / ((arg0 - -58) / 43);
        ++field4180;
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(ZI)V", line = 18)
    public final void method55(boolean arg0, int arg1) {
        int var3 = 30 / ((36 - arg1) / 46);
        if (~super.field2702.field7445 < -1) {
            float var4 = -0.5F / (float) super.field2702.field7445;
            super.field2702.method2940(1, (byte) 96);
            class286.field4187[2] = var4;
            class286.field4187[0] = 0.0F;
            class286.field4187[3] = super.field2702.field7405 * var4 + 0.25F;
            class286.field4187[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class286.field4187, 0);
            OpenGL.glPopMatrix();
            super.field2702.method2988((byte) -121, (float) super.field2702.field7445, 0.5F);
            super.field2702.method2968(this.field4175, -51);
            super.field2702.method2940(0, (byte) 86);
        }
        ++field4168;
        this.field4167.method2006('\u0000', -14591);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)V", line = 51)
    public final void method52(byte arg0, int arg1, int arg2) {
        ++field4174;
        if (arg0 != 117) {
            method1763((byte) -4);
        }
        if ((arg2 & 1) != 1) {
            if (this.field4170.field1736) {
                super.field2702.method2968(this.field4170.field1741, arg0 + -164);
                class286.field4187[0] = 0.0F;
                class286.field4187[2] = 0.0F;
                class286.field4187[3] = 0.0F;
                class286.field4187[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class286.field4187, 0);
            } else {
                super.field2702.method2968(this.field4170.field1731[0], -103);
            }
        } else if (!this.field4170.field1736) {
            int var4 = super.field2702.field7313 % 4000 * 16 / 4000;
            super.field2702.method2968(this.field4170.field1731[var4], arg0 + -192);
        } else {
            super.field2702.method2968(this.field4170.field1741, -91);
            class286.field4187[2] = 0.0F;
            class286.field4187[1] = 0.0F;
            class286.field4187[3] = (float) (super.field2702.field7313 % 4000) / 4000.0F;
            class286.field4187[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class286.field4187, 0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lsv;IB)V", line = 96)
    public final void method51(class478 arg0, int arg1, byte arg2) {
        if (arg2 != -58) {
            this.method1764((byte) 107);
        }
        ++field4169;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lih;Lpq;)V", line = 108)
    public class285(class503 arg0, class132 arg1) {
        super(arg0);
        this.field4170 = arg1;
        this.method1764((byte) -90);
        this.field4175 = new class335(super.field2702, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4175.method2001(false, (byte) -114);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 120)
    public final void method48(boolean arg0) {
        if (arg0) {
            ++field4176;
            this.field4167.method2006('\u0001', -14591);
            if (~super.field2702.field7445 < -1) {
                super.field2702.method2940(1, (byte) 112);
                super.field2702.method2968((class478) null, -67);
                super.field2702.method2988((byte) -120, 0.0F, 1.0F);
                super.field2702.method2940(0, (byte) 96);
            }
            super.field2702.method2935((byte) 87, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 146)
    public static void method1763(byte arg0) {
        if (arg0 != 71) {
            field4182 = -24;
        }
        field4171 = null;
        field4181 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)V", line = 158)
    public final void method47(boolean arg0, int arg1) {
        if (arg1 == 2) {
            ++field4179;
            super.field2702.method2935((byte) 87, 8448, 260);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V", line = 169)
    private final void method1764(byte arg0) {
        int var2 = -116 / ((arg0 - -17) / 51);
        ++field4173;
        this.field4167 = new class336(super.field2702, 2);
        this.field4167.method2012(4864, 0);
        super.field2702.method2940(1, (byte) 102);
        super.field2702.method2935((byte) 87, 260, 7681);
        super.field2702.method2969(0, 4611, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2702.method2940(0, (byte) 100);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4170.field1736) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4167.method2013(4864);
        this.field4167.method2012(4864, 1);
        super.field2702.method2940(1, (byte) 92);
        super.field2702.method2935((byte) 87, 8448, 8448);
        super.field2702.method2969(0, 4611, 5890, 768);
        OpenGL.glDisable(3168);
        super.field2702.method2940(0, (byte) 107);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4170.field1736) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4167.method2013(4864);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZII)Ljava/lang/String;", line = 212)
    public static final String method1765(boolean arg0, boolean arg1, int arg2, int arg3) {
        ++field4178;
        if (~arg2 <= -3 && arg2 <= 36) {
            if (arg1 && arg3 >= 0) {
                int var4 = 2;
                for (int var5 = arg3 / arg2; var5 != 0; var5 /= arg2) {
                    ++var4;
                }
                if (!arg0) {
                    field4183 = -127;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                    int var8 = arg3;
                    arg3 /= arg2;
                    int var9 = -(arg2 * arg3) + var8;
                    if (~var9 <= -11) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg3, arg2);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }
}
