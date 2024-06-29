import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class247 extends class141 {

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Z")
    private boolean field3683 = false;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Luv;")
    private class250 field3682;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lwp;")
    public static class122 field3688 = new class122();

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Lbd;")
    public static class44 field3691 = new class44("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
    public final void method51(int arg0, boolean arg1) {
        ++field3689;
        class221 var3 = super.field2178.method357(-107);
        if (arg0 == -21897) {
            if (this.field3682 != null && var3 != null && arg1) {
                this.field3682.method1625('\u0000', (byte) -36);
                super.field2178.method277(1, (byte) 85);
                super.field2178.method285(false, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field2178.field736.method3141(arg0 ^ 22008), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field2178.method277(0, (byte) 96);
                this.field3683 = true;
            } else {
                super.field2178.method200(34168, 0, 770, (byte) -108);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        ++field3694;
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBI)V")
    public static final void method1615(int arg0, int arg1, byte arg2, int arg3) {
        if (~arg3 == -1004) {
            class281.method1809(class474.field6907, arg1, arg0);
        } else if (~arg3 != -1005) {
            if (arg3 != 1011) {
                if (arg3 == 1006) {
                    class281.method1809(class271.field4076, arg1, arg0);
                } else if (arg3 == 1009) {
                    class281.method1809(class215.field3239, arg1, arg0);
                }
            } else {
                class281.method1809(class193.field2804, arg1, arg0);
            }
        } else {
            class281.method1809(class73.field1192, arg1, arg0);
        }
        ++field3685;
        if (arg2 != 17) {
            method1617(71, -118, (int[]) null, (int[]) null, false);
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public static void method1616(int arg0) {
        if (arg0 == -24214) {
            field3691 = null;
            field3688 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        super.field2178.method275(8448, 7681, 127);
        if (arg1 != 0) {
            field3688 = null;
        }
        ++field3686;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lei;II)V")
    public final void method57(class120 arg0, int arg1, int arg2) {
        ++field3684;
        super.field2178.method285(false, arg0);
        if (arg2 <= 89) {
            field3693 = -80;
        }
        super.field2178.method249(arg1, -2);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II[I[IZ)V")
    public static final void method1617(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        if (arg0 > arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
            for (int var10 = arg1; ~arg0 < ~var10; ++var10) {
                if (arg3[var10] < (var10 & var9) + var7) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method1617(var6 + -1, arg1, arg2, arg3, false);
            method1617(arg0, var6 + 1, arg2, arg3, false);
        }
        ++field3690;
        if (arg4) {
            method1615(-36, -54, (byte) 49, 34);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lbt;)V")
    public class247(class33 arg0) {
        super(arg0);
        if (arg0.field648) {
            this.field3682 = new class250(arg0, 2);
            this.field3682.method1622(0, (byte) 69);
            super.field2178.method277(1, (byte) 50);
            super.field2178.method275(34165, 7681, 121);
            super.field2178.method333(false, 34168, 770, 2);
            super.field2178.method200(34167, 0, 770, (byte) -119);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2178.method277(0, (byte) 56);
            this.field3682.method1624(-22853);
            this.field3682.method1622(1, (byte) 69);
            super.field2178.method277(1, (byte) 103);
            super.field2178.method275(8448, 8448, 126);
            super.field2178.method333(false, 34166, 770, 2);
            super.field2178.method200(5890, 0, 770, (byte) 120);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2178.method277(0, (byte) 56);
            this.field3682.method1624(-22853);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        int var2 = 37 / ((-51 - arg0) / 45);
        ++field3687;
        if (this.field3683) {
            this.field3682.method1625('\u0001', (byte) -36);
            super.field2178.method277(1, (byte) 55);
            super.field2178.method285(false, (class120) null);
            super.field2178.method277(0, (byte) 80);
        } else {
            super.field2178.method200(5890, 0, 770, (byte) 125);
        }
        super.field2178.method275(8448, 8448, 121);
        this.field3683 = false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public final void method49(int arg0, int arg1, int arg2) {
        ++field3692;
        if (arg0 != 1400) {
            this.method55(-62);
        }
    }
}
