import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class102 extends class283 {

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Ldja;")
    private class311 field1363;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lpea;")
    private class725 field1365;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Llga;")
    public static class712 field1371 = new class712(4, 6);

    @OriginalMember(owner = "client!al", name = "t", descriptor = "[I")
    public static int[] field1376 = new int[500];

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lfo;")
    private class518 field1364;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "[J")
    public static long[] field1377;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1367;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BIIII)V", line = 4)
    public static final void method699(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1369;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        class168.method980(arg2, class300.field4036[arg4], -arg3 + arg1, arg1 + arg3, (byte) -126);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class300.field4036[arg4 - -var6];
                int[] var10 = class300.field4036[arg4 - var6];
                int var11 = arg1 + var5;
                int var12 = -var5 + arg1;
                class168.method980(arg2, var9, var12, var11, (byte) -128);
                class168.method980(arg2, var10, var12, var11, (byte) -1);
            }
            int var13 = arg1 + var6;
            int var14 = -var6 + arg1;
            int[] var15 = class300.field4036[arg4 + var5];
            int[] var16 = class300.field4036[-var5 + arg4];
            class168.method980(arg2, var15, var14, var13, (byte) 46);
            class168.method980(arg2, var16, var14, var13, (byte) -125);
        }
        if (arg0 > -96) {
            method703((byte) -76);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZZ)V", line = 58)
    public final void method141(boolean arg0, boolean arg1) {
        if (~super.field3749.field7652 < -1) {
            float var3 = -0.5F / (float) super.field3749.field7652;
            super.field3749.method2988(1, 847872872);
            class219.field2839[1] = 0.0F;
            class219.field2839[2] = var3;
            class219.field2839[3] = super.field3749.field7567 * var3 + 0.25F;
            class219.field2839[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class219.field2839, 0);
            OpenGL.glPopMatrix();
            super.field3749.method2991(0.5F, true, (float) super.field3749.field7652);
            super.field3749.method3006(1, this.field1365);
            super.field3749.method2988(0, 847872872);
        }
        ++field1368;
        this.field1364.method2853('\u0000', arg0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 92)
    public static void method700(int arg0) {
        field1377 = null;
        if (arg0 == 32132) {
            field1376 = null;
            field1371 = null;
            field1367 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lac;Ldja;)V", line = 106)
    public class102(class541 arg0, class311 arg1) {
        super(arg0);
        this.field1363 = arg1;
        this.method702((byte) -23);
        this.field1365 = new class725(super.field3749, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1365.method4069(3552, false);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JJ)J", line = 117)
    public static long method701(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 124)
    private final void method702(byte arg0) {
        ++field1373;
        this.field1364 = new class518(super.field3749, 2);
        this.field1364.method2852(0, arg0 + -30366);
        super.field3749.method2988(1, 847872872);
        super.field3749.method3042(260, arg0 + 8983, 7681);
        super.field3749.method2983(0, 768, -116, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field3749.method2988(0, arg0 ^ -847872895);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1363.field4207) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field1364.method2851((byte) -108);
        this.field1364.method2852(1, -30389);
        super.field3749.method2988(1, arg0 + 847872895);
        super.field3749.method3042(8448, 8960, 8448);
        super.field3749.method2983(0, 768, 87, 5890);
        OpenGL.glDisable(3168);
        super.field3749.method2988(0, 847872872);
        if (arg0 != -23) {
            this.field1363 = null;
        }
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1363.field4207) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field1364.method2851((byte) 54);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 169)
    public final void method137(int arg0, int arg1, int arg2) {
        if (arg2 > -2) {
            field1376 = null;
        }
        ++field1366;
        if (~(1 & arg0) == -2) {
            if (this.field1363.field4207) {
                super.field3749.method3006(1, this.field1363.field4205);
                class219.field2839[3] = (float) (super.field3749.field7532 % 4000) / 4000.0F;
                class219.field2839[0] = 0.0F;
                class219.field2839[1] = 0.0F;
                class219.field2839[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class219.field2839, 0);
            } else {
                int var4 = super.field3749.field7532 % 4000 * 16 / 4000;
                super.field3749.method3006(1, this.field1363.field4206[var4]);
            }
        } else if (this.field1363.field4207) {
            super.field3749.method3006(1, this.field1363.field4205);
            class219.field2839[2] = 0.0F;
            class219.field2839[3] = 0.0F;
            class219.field2839[0] = 0.0F;
            class219.field2839[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class219.field2839, 0);
        } else {
            super.field3749.method3006(1, this.field1363.field4206[0]);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z", line = 214)
    public final boolean method138(int arg0) {
        ++field1370;
        if (arg0 != 31565) {
            field1376 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V", line = 225)
    public final void method142(boolean arg0, int arg1) {
        if (arg1 != 255) {
            this.method138(-35);
        }
        super.field3749.method3042(8448, arg1 ^ 9215, 260);
        ++field1375;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 240)
    public static final void method703(byte arg0) {
        if (~class761.field10625 >= -2) {
            class11.field68.method2276((byte) -13, 2, class11.field68.field5496);
        } else {
            class11.field68.method2276((byte) -13, 4, class11.field68.field5496);
        }
        ++field1362;
        if (arg0 <= 45) {
            method703((byte) -21);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 268)
    public final void method144(byte arg0) {
        this.field1364.method2853('\u0001', false);
        ++field1374;
        if (super.field3749.field7652 > 0) {
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, (class221) null);
            super.field3749.method2991(1.0F, true, 0.0F);
            super.field3749.method2988(0, 847872872);
        }
        super.field3749.method3042(8448, 8960, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        if (arg0 <= 25) {
            field1377 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lcu;ZI)V", line = 292)
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        ++field1372;
        if (arg1) {
            this.field1365 = null;
        }
    }
}
