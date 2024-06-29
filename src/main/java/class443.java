import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class443 extends class398 {

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Lal;")
    private class170 field6441;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lbs;")
    private class148 field6434;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field6426 = -1;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lpca;")
    public static class529 field6428 = new class529();

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Liba;")
    public static class211 field6439 = new class211(13, 3);

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lbq;")
    private class646 field6427;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "[I")
    public static int[] field6438;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)V")
    public final void method91(boolean arg0, int arg1) {
        if (super.field6009.field4068 > 0) {
            float var3 = -0.5F / (float) super.field6009.field4068;
            super.field6009.method1745(true, 1);
            class654.field9363[3] = super.field6009.field4151 * var3 + 0.25F;
            class654.field9363[1] = 0.0F;
            class654.field9363[0] = 0.0F;
            class654.field9363[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class654.field9363, 0);
            OpenGL.glPopMatrix();
            super.field6009.method1737((float) super.field6009.field4068, (byte) -98, 0.5F);
            super.field6009.method1709((byte) -100, this.field6434);
            super.field6009.method1745(true, 0);
        }
        if (arg1 != -5191) {
            this.method86(0, (byte) -37, 59);
        }
        ++field6430;
        this.field6427.method3678('\u0000', 85);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljw;I)Ljava/lang/String;")
    public static final String method2616(class426 arg0, int arg1) {
        if (arg1 < 44) {
            field6428 = null;
        }
        ++field6436;
        return arg0.field6225 != null && ~arg0.field6225.length() < -1 ? arg0.field6222 + class279.field3657.method1654(-91, class262.field3401) + arg0.field6225 : arg0.field6222;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Luca;Lal;)V")
    public class443(class287 arg0, class170 arg1) {
        super(arg0);
        this.field6441 = arg1;
        this.method2619(110);
        this.field6434 = new class148(super.field6009, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6434.method1060(-3351, false);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public final void method92(int arg0) {
        this.field6427.method3678('\u0001', 106);
        ++field6432;
        if (super.field6009.field4068 > 0) {
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -64, (class517) null);
            super.field6009.method1737(0.0F, (byte) -110, 1.0F);
            super.field6009.method1745(true, 0);
        }
        super.field6009.method1701(8448, arg0 ^ 513, 8448);
        OpenGL.glMatrixMode(5890);
        if (arg0 != 512) {
            this.method94(-23, false);
        }
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILvaa;B)V")
    public final void method93(int arg0, class517 arg1, byte arg2) {
        ++field6431;
        int var4 = -115 / ((76 - arg2) / 41);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static void method2617(boolean arg0) {
        field6438 = null;
        if (arg0) {
            method2616((class426) null, 76);
        }
        field6428 = null;
        field6439 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBI)V")
    public final void method86(int arg0, byte arg1, int arg2) {
        if (arg1 != 82) {
            this.field6441 = null;
        }
        ++field6442;
        if (~(arg2 & 1) != -2) {
            if (this.field6441.field2403) {
                super.field6009.method1709((byte) -100, this.field6441.field2405);
                class654.field9363[0] = 0.0F;
                class654.field9363[3] = 0.0F;
                class654.field9363[2] = 0.0F;
                class654.field9363[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class654.field9363, 0);
            } else {
                super.field6009.method1709((byte) -60, this.field6441.field2406[0]);
            }
        } else if (this.field6441.field2403) {
            super.field6009.method1709((byte) -114, this.field6441.field2405);
            class654.field9363[3] = (float) (super.field6009.field4020 % 4000) / 4000.0F;
            class654.field9363[0] = 0.0F;
            class654.field9363[2] = 0.0F;
            class654.field9363[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class654.field9363, 0);
        } else {
            int var4 = super.field6009.field4020 % 4000 * 16 / 4000;
            super.field6009.method1709((byte) -65, this.field6441.field2406[var4]);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)V")
    public final void method94(int arg0, boolean arg1) {
        ++field6429;
        super.field6009.method1701(260, 1, 8448);
        if (arg0 != 0) {
            this.method91(false, 19);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Z")
    public final boolean method87(int arg0) {
        ++field6435;
        if (arg0 != 3) {
            this.field6434 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILpo;II)Z")
    public static final boolean method2618(int arg0, int arg1, class332 arg2, int arg3, int arg4) {
        ++field6440;
        if (!class512.field7212) {
            return false;
        } else if (~class56.field890 > -101) {
            return false;
        } else if (!class636.method3638(-20628, arg1, arg0, arg3)) {
            return false;
        } else {
            int var5 = arg3 << class125.field1831;
            int var6 = arg1 << class125.field1831;
            int var7 = -1 + class178.field2480[arg0].method3822(arg1, arg3, 0);
            int var8 = arg2.method271(false) + var7;
            if (~arg2.field4824 == -2) {
                if (!class433.method2575(false, var6, var5, class263.field3412 + var6, var5, var5, var8, var8, var7, var6)) {
                    return false;
                } else if (!class433.method2575(false, var6, var5, class263.field3412 + var6, var5, var5, var7, var8, var7, class263.field3412 + var6)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else if (arg2.field4824 == 2) {
                if (!class433.method2575(false, class263.field3412 + var6, class263.field3412 + var5, class263.field3412 + var6, var5, var5, var8, var8, var7, class263.field3412 + var6)) {
                    return false;
                } else if (!class433.method2575(false, class263.field3412 + var6, class263.field3412 + var5, var6 - -class263.field3412, class263.field3412 + var5, var5, var8, var7, var7, class263.field3412 + var6)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else if (arg2.field4824 == 4) {
                if (!class433.method2575(false, var6, class263.field3412 + var5, class263.field3412 + var6, class263.field3412 + var5, class263.field3412 + var5, var8, var8, var7, var6)) {
                    return false;
                } else if (!class433.method2575(false, var6, class263.field3412 + var5, var6 - -class263.field3412, class263.field3412 + var5, class263.field3412 + var5, var7, var8, var7, class263.field3412 + var6)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else if (arg2.field4824 == 8) {
                if (!class433.method2575(false, var6, class263.field3412 + var5, var6, var5, var5, var8, var8, var7, var6)) {
                    return false;
                } else if (!class433.method2575(false, var6, class263.field3412 + var5, var6, class263.field3412 + var5, var5, var8, var7, var7, var6)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else if (~arg2.field4824 == -17) {
                if (!class682.method3825(class41.field615 + var6, var7, class41.field615, var8, class41.field615, (byte) -90, var5)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else if (arg2.field4824 == 32) {
                if (!class682.method3825(class41.field615 + var6, var7, class41.field615, var8, class41.field615, (byte) -45, class41.field615 + var5)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else if (~arg2.field4824 == -65) {
                if (!class682.method3825(var6, var7, class41.field615, var8, class41.field615, (byte) -99, class41.field615 + var5)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else if (arg2.field4824 == 128) {
                if (!class682.method3825(var6, var7, class41.field615, var8, class41.field615, (byte) -87, var5)) {
                    return false;
                } else {
                    ++class90.field1369;
                    return true;
                }
            } else {
                if (arg4 < 70) {
                    field6428 = null;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    private final void method2619(int arg0) {
        ++field6433;
        this.field6427 = new class646(super.field6009, 2);
        this.field6427.method3680(0, (byte) 107);
        super.field6009.method1745(true, 1);
        super.field6009.method1701(7681, 1, 260);
        super.field6009.method1755(34168, 34176, 768, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field6009.method1745(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6441.field2403) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6427.method3679(-88);
        this.field6427.method3680(1, (byte) -124);
        super.field6009.method1745(true, 1);
        super.field6009.method1701(8448, 1, 8448);
        super.field6009.method1755(5890, 34176, 768, 0);
        OpenGL.glDisable(3168);
        super.field6009.method1745(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6441.field2403) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        if (arg0 < 99) {
            this.method86(-112, (byte) 89, 74);
        }
        this.field6427.method3679(-71);
    }
}
