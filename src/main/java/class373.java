import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class373 extends class366 {

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "Lfj;")
    private class609 field5840;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Lci;")
    private class415 field5828;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public static int field5837 = 0;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public static int field5831 = 0;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "Lrl;")
    public static class672 field5830 = new class672(65, -1);

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "Lrl;")
    public static class672 field5843 = new class672(33, 1);

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "F")
    public static float field5842;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "Lsr;")
    private class231 field5833;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public final void method1132(int arg0) {
        ++field5829;
        this.field5833.method1687('\u0001', arg0 ^ 4864);
        if (~super.field5742.field1422 < -1) {
            super.field5742.method834(true, 1);
            super.field5742.method856(false, (class386) null);
            super.field5742.method848(1.0F, arg0 ^ 103, 0.0F);
            super.field5742.method834(true, 0);
        }
        super.field5742.method857(arg0 + 8960, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        if (arg0 != 0) {
            this.method1137(true);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2452(String arg0, int arg1) {
        if (arg1 == -3206) {
            System.exit(1);
            ++field5839;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Ler;Lfj;)V")
    public class373(class92 arg0, class609 arg1) {
        super(arg0);
        this.field5840 = arg1;
        this.method2456(-27170);
        this.field5828 = new class415(super.field5742, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5828.method2643(false, (byte) -91);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)Z")
    public final boolean method1137(boolean arg0) {
        ++field5841;
        if (arg0) {
            field5842 = -0.28680998F;
        }
        return true;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(ZI)V")
    public static final void method2453(boolean arg0, int arg1) {
        ++field5835;
        if (arg0 && class378.field5872 != null) {
            class610.field8677 = class378.field5872.field5635;
        } else {
            class610.field8677 = -1;
        }
        class378.field5872 = null;
        class167.field2803 = null;
        class260.field4160 = null;
        class579.field8251 = 0;
        class378.method2495();
        class378.field5883.method3474(22090);
        class182.field3063 = null;
        class286.field4544 = null;
        class642.field9031 = null;
        class2.field16 = -1;
        class294.field4614 = null;
        class413.field6346 = null;
        class522.field7574 = null;
        class55.field717 = -1;
        class238.field3776 = null;
        class683.field9587 = null;
        class338.field5492 = null;
        int var2 = 111 / ((37 - arg1) / 54);
        class378.field5880 = null;
        if (class378.field5873 != null) {
            class378.field5873.method3285(-1);
            class378.field5873.method3287(9729, 128, 64);
        }
        if (class378.field5869 != null) {
            class378.field5869.method1888((byte) -106, 64, 64);
        }
        if (class378.field5874 != null) {
            class378.field5874.method97(64, (byte) 107);
        }
        class585.field8317.method719(64, 97);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        if (~super.field5742.field1422 < -1) {
            float var3 = -0.5F / (float) super.field5742.field1422;
            super.field5742.method834(true, 1);
            class192.field3185[1] = 0.0F;
            class192.field3185[2] = var3;
            class192.field3185[3] = super.field5742.field1415 * var3 + 0.25F;
            class192.field3185[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class192.field3185, 0);
            OpenGL.glPopMatrix();
            super.field5742.method848(0.5F, -66, (float) super.field5742.field1422);
            super.field5742.method856(false, this.field5828);
            super.field5742.method834(true, 0);
        }
        ++field5824;
        this.field5833.method1687('\u0000', arg1 + 4864);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg1 != 0) {
            this.method1132(106);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
    public final void method1136(int arg0, int arg1, int arg2) {
        if (arg0 != -6561) {
            method2455((byte) -54);
        }
        if ((arg2 & 1) != 1) {
            if (!this.field5840.field8644) {
                super.field5742.method856(false, this.field5840.field8642[0]);
            } else {
                super.field5742.method856(false, this.field5840.field8647);
                class192.field3185[1] = 0.0F;
                class192.field3185[2] = 0.0F;
                class192.field3185[0] = 0.0F;
                class192.field3185[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class192.field3185, 0);
            }
        } else if (!this.field5840.field8644) {
            int var4 = super.field5742.field1330 % 4000 * 16 / 4000;
            super.field5742.method856(false, this.field5840.field8642[var4]);
        } else {
            super.field5742.method856(false, this.field5840.field8647);
            class192.field3185[2] = 0.0F;
            class192.field3185[3] = (float) (super.field5742.field1330 % 4000) / 4000.0F;
            class192.field3185[0] = 0.0F;
            class192.field3185[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class192.field3185, 0);
        }
        ++field5838;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2454(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field5832;
        int var7 = class160.method1320(arg3 ^ 89, arg5, class545.field7931, class585.field8331);
        int var8 = class160.method1320(0, arg0, class545.field7931, class585.field8331);
        int var9 = class160.method1320(0, arg6, class576.field8218, class340.field5510);
        int var10 = class160.method1320(0, arg1, class576.field8218, class340.field5510);
        int var11 = class160.method1320(arg3 + -89, arg2 + arg5, class545.field7931, class585.field8331);
        int var12 = class160.method1320(0, arg0 - arg2, class545.field7931, class585.field8331);
        for (int var13 = var7; var11 > var13; ++var13) {
            class367.method2427(3803, arg4, var10, class39.field527[var13], var9);
        }
        for (int var14 = var8; var12 < var14; --var14) {
            class367.method2427(arg3 + 3714, arg4, var10, class39.field527[var14], var9);
        }
        if (arg3 == 89) {
            int var15 = class160.method1320(0, arg6 - -arg2, class576.field8218, class340.field5510);
            int var16 = class160.method1320(arg3 + -89, -arg2 + arg1, class576.field8218, class340.field5510);
            for (int var17 = var11; ~var12 <= ~var17; ++var17) {
                int[] var18 = class39.field527[var17];
                class367.method2427(3803, arg4, var15, var18, var9);
                class367.method2427(arg3 + 3714, arg4, var10, var18, var16);
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
    public static void method2455(byte arg0) {
        field5830 = null;
        if (arg0 == -34) {
            field5843 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILep;I)V")
    public final void method1130(int arg0, class386 arg1, int arg2) {
        if (arg0 != 1) {
            field5837 = -14;
        }
        ++field5827;
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
    private final void method2456(int arg0) {
        ++field5825;
        if (arg0 != -27170) {
            method2454(11, 73, 15, (byte) -114, -118, -122, -77);
        }
        this.field5833 = new class231(super.field5742, 2);
        this.field5833.method1689(-31885, 0);
        super.field5742.method834(true, 1);
        super.field5742.method857(arg0 + 36130, 260, 7681);
        super.field5742.method844(768, 34168, 0, (byte) -102);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5742.method834(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5840.field8644) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5833.method1690(arg0 ^ -27215);
        this.field5833.method1689(-31885, 1);
        super.field5742.method834(true, 1);
        super.field5742.method857(8960, 8448, 8448);
        super.field5742.method844(768, 5890, 0, (byte) -102);
        OpenGL.glDisable(3168);
        super.field5742.method834(true, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5840.field8644) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5833.method1690(arg0 + 27280);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILpca;)Ljava/lang/String;")
    public static final String method2457(int arg0, int arg1, class665 arg2) {
        ++field5834;
        int var3 = 26 / ((-9 - arg1) / 33);
        if (!client.method1955(arg2).method742(arg0, -84) && arg2.field9408 == null) {
            return null;
        } else if (arg2.field9327 != null && arg2.field9327.length > arg0 && arg2.field9327[arg0] != null && ~arg2.field9327[arg0].trim().length() != -1) {
            return arg2.field9327[arg0];
        } else {
            return class518.field7505 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZZ)V")
    public final void method1131(boolean arg0, boolean arg1) {
        ++field5826;
        if (!arg1) {
            this.field5840 = null;
        }
        super.field5742.method857(8960, 8448, 260);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lk;I)[Lica;")
    public static final class615[] method2458(class525 arg0, int arg1) {
        ++field5836;
        if (!arg0.method3166((byte) -12)) {
            return new class615[0];
        } else {
            class701 var2 = arg0.method3174(true);
            while (~var2.field9884 == -1) {
                class549.method3313(10L, 125);
            }
            if (var2.field9884 == 2) {
                return new class615[0];
            } else {
                int[] var3 = (int[]) var2.field9885;
                class615[] var4 = new class615[var3.length >> 2];
                for (int var5 = arg1; ~var5 > ~var4.length; ++var5) {
                    class615 var6 = new class615();
                    var4[var5] = var6;
                    var6.field8738 = var3[var5 << 2];
                    var6.field8734 = var3[(var5 << 2) + 1];
                    var6.field8739 = var3[(var5 << 2) + 2];
                    var6.field8737 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }
}
