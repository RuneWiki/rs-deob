import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class134 extends class692 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lan;")
    private class193 field2241;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lfv;")
    private class699 field2235;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lbfa;")
    private class264 field2236;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    public static int[] field2239;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 3)
    public static final void method1110(byte arg0) {
        class458.method2681(-1);
        ++field2244;
        int var1 = class420.field5820.field9469.method2839(17539);
        if (var1 != 2) {
            if (var1 == 3) {
                class731.method4054(2, 126, class709.field9923, class737.field10234, class492.field6745, 2, class448.field6174, class686.field9702);
            }
        } else {
            class643.method3648(class709.field9923, class686.field9702, 100, class448.field6174, 100, (byte) -64);
        }
        if (class420.field5820.field9469.method2838(30861)) {
            class617.method3547(class213.field3128, 119);
        }
        if (class686.field9702 != null) {
            class554.method3199(200);
        }
        if (arg0 >= 103) {
            class765.field10581 = class420.field5820.field9469.method2839(17539) != 0;
            class593.field8489 = class420.field5820.field9469.method2838(30861);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 49)
    public final void method1111(byte arg0) {
        this.field2236.method1700('\u0001', arg0 + 3597);
        if (arg0 == 114) {
            ++field2234;
            if (~super.field9753.field8251 < -1) {
                super.field9753.method3321(1, -19587);
                super.field9753.method3384((class377) null, (byte) 76);
                super.field9753.method3355(0.0F, 1.0F, -1);
                super.field9753.method3321(0, -19587);
            }
            super.field9753.method3359(8448, 8448, true);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z", line = 72)
    public final boolean method1112(int arg0) {
        ++field2240;
        if (arg0 >= -124) {
            this.method1111((byte) -96);
        }
        return true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZI)V", line = 83)
    public final void method1113(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            if ((1 & arg0) == 1) {
                if (!this.field2241.field2901) {
                    int var4 = super.field9753.field8133 % 4000 * 16 / 4000;
                    super.field9753.method3384(this.field2241.field2904[var4], (byte) 107);
                } else {
                    super.field9753.method3384(this.field2241.field2897, (byte) 53);
                    class491.field6734[0] = 0.0F;
                    class491.field6734[1] = 0.0F;
                    class491.field6734[3] = (float) (super.field9753.field8133 % 4000) / 4000.0F;
                    class491.field6734[2] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class491.field6734, 0);
                }
            } else if (this.field2241.field2901) {
                super.field9753.method3384(this.field2241.field2897, (byte) 93);
                class491.field6734[3] = 0.0F;
                class491.field6734[1] = 0.0F;
                class491.field6734[2] = 0.0F;
                class491.field6734[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class491.field6734, 0);
            } else {
                super.field9753.method3384(this.field2241.field2904[0], (byte) 117);
            }
            ++field2243;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Lq;", line = 128)
    public static final class172 method1114(int arg0, int arg1, int arg2) {
        if (class514.field7096[arg0][arg1][arg2] == null) {
            boolean var3 = class514.field7096[0][arg1][arg2] != null && class514.field7096[0][arg1][arg2].field2592 != null;
            if (var3 && arg0 >= class169.field2565 - 1) {
                return null;
            }
            class307.method1891(arg0, arg1, arg2);
        }
        return class514.field7096[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V", line = 141)
    private final void method1115(byte arg0) {
        if (arg0 != 51) {
            this.method1111((byte) -10);
        }
        ++field2238;
        this.field2236 = new class264(super.field9753, 2);
        this.field2236.method1704(0, -112);
        super.field9753.method3321(1, -19587);
        super.field9753.method3359(7681, 260, true);
        super.field9753.method3351(768, 0, 34168, (byte) -85);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field9753.method3321(0, -19587);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field2241.field2901) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field2236.method1701((byte) 113);
        this.field2236.method1704(1, arg0 + -165);
        super.field9753.method3321(1, -19587);
        super.field9753.method3359(8448, 8448, true);
        super.field9753.method3351(768, 0, 5890, (byte) -85);
        OpenGL.glDisable(3168);
        super.field9753.method3321(0, -19587);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field2241.field2901) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field2236.method1701((byte) 100);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Llea;Lan;)V", line = 185)
    public class134(class573 arg0, class193 arg1) {
        super(arg0);
        this.field2241 = arg1;
        this.method1115((byte) 51);
        this.field2235 = new class699(super.field9753, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field2235.method3918(false, (byte) 105);
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V", line = 197)
    public static void method1116(byte arg0) {
        field2239 = null;
        int var1 = 106 / ((-40 - arg0) / 54);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZB)V", line = 207)
    public final void method1117(boolean arg0, byte arg1) {
        ++field2237;
        super.field9753.method3359(260, 8448, true);
        if (arg1 != 57) {
            method1116((byte) -27);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V", line = 223)
    public final void method1118(boolean arg0, int arg1) {
        if (super.field9753.field8251 > 0) {
            float var3 = -0.5F / (float) super.field9753.field8251;
            super.field9753.method3321(1, arg1 ^ 17011);
            class491.field6734[2] = var3;
            class491.field6734[3] = super.field9753.field8209 * var3 + 0.25F;
            class491.field6734[0] = 0.0F;
            class491.field6734[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class491.field6734, 0);
            OpenGL.glPopMatrix();
            super.field9753.method3355((float) super.field9753.field8251, 0.5F, arg1 ^ 3825);
            super.field9753.method3384(this.field2235, (byte) 106);
            super.field9753.method3321(0, arg1 ^ 17011);
        }
        ++field2245;
        if (arg1 != -3826) {
            this.field2235 = null;
        }
        this.field2236.method1700('\u0000', 3711);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILfga;I)V", line = 259)
    public final void method1119(int arg0, class377 arg1, int arg2) {
        if (arg0 < 48) {
            this.method1112(100);
        }
        ++field2242;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[B)[B", line = 270)
    public static final byte[] method1120(boolean arg0, byte[] arg1) {
        ++field2246;
        int var2 = arg1.length;
        if (!arg0) {
            return null;
        } else {
            byte[] var3 = new byte[var2];
            class171.method1263(arg1, 0, var3, 0, var2);
            return var3;
        }
    }
}
