import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class51 extends class489 {

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "Z")
    private boolean field752 = false;

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "Lbp;")
    private class458 field756;

    @OriginalMember(owner = "client!aha", name = "r", descriptor = "[I")
    public static int[] field761 = new int[13];

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!aha", name = "n", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!aha", name = "o", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!aha", name = "p", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!aha", name = "q", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!aha", name = "s", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!aha", name = "t", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method10(int arg0, boolean arg1) {
        ++field755;
        class45 var3 = super.field6956.method2168(-122);
        if (this.field756 != null && var3 != null && arg1) {
            this.field756.method2682('\u0000', 114);
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(-1, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6956.field4992.method3845(false), 0);
            OpenGL.glMatrixMode(5888);
            super.field6956.method2135(0, -5027);
            this.field752 = true;
        } else {
            super.field6956.method2189(34168, true, 0, 770);
        }
        int var4 = -10 / ((arg0 - -43) / 37);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIII)Lida;", line = 32)
    public static final class650 method424(int arg0, int arg1, int arg2, int arg3) {
        ++field763;
        class650 var4 = null;
        if (arg2 == 0) {
            ++class10.field117;
            var4 = class314.method1837(class47.field692, true, class625.field8727);
        }
        if (arg2 == 1) {
            var4 = class314.method1837(class703.field9907, true, class625.field8727);
            ++class70.field947;
        }
        var4.field8928.method1116(arg0 - -class753.field10509, 9571);
        var4.field8928.method1124((byte) 106, arg3 - -class63.field851);
        var4.field8928.method1132(108, !class333.field4297.method2924(-30303, 82) ? 0 : 1);
        if (arg1 < 68) {
            method426((byte) -22);
        }
        class571.field7966 = false;
        class721.field10159 = arg0;
        class333.field4292 = arg3;
        class652.method3520(6090);
        return var4;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIB)Lkba;", line = 66)
    public static final class24 method425(int arg0, int arg1, int arg2, byte arg3) {
        ++field762;
        class73 var4 = class495.field7002[arg1][arg2][arg0];
        if (var4 == null) {
            return null;
        } else {
            class24 var5 = null;
            if (arg3 != 90) {
                field761 = null;
            }
            int var6 = -1;
            for (class456 var7 = var4.field969; var7 != null; var7 = var7.field6389) {
                class451 var8 = var7.field6384;
                if (var8 instanceof class24) {
                    class24 var9 = (class24) var8;
                    int var10 = 256 * (-1 + var9.method253((byte) -27)) + 252;
                    int var11 = -var10 + var9.field5790 >> 9;
                    int var12 = var9.field5784 - var10 >> 9;
                    int var13 = var9.field5790 - -var10 >> 9;
                    int var14 = var9.field5784 + var10 >> 9;
                    if (var11 <= arg2 && arg0 >= var12 && var13 >= arg2 && arg0 <= var14) {
                        int var15 = (var13 - (-1 - -arg2)) * (1 - arg0 + var14);
                        if (~var15 < ~var6) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(BLkp;I)V", line = 125)
    public final void method12(byte arg0, class411 arg1, int arg2) {
        super.field6956.method2120(-1, arg1);
        if (arg0 < -66) {
            ++field759;
            super.field6956.method2153(109, arg2);
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(B)Z", line = 137)
    public final boolean method7(byte arg0) {
        ++field757;
        return arg0 <= 95 ? true : true;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)V", line = 150)
    public final void method8(int arg0, int arg1, int arg2) {
        ++field754;
        if (arg2 != 40) {
            this.field752 = true;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V", line = 171)
    public final void method6(int arg0) {
        if (!this.field752) {
            super.field6956.method2189(5890, true, 0, 770);
        } else {
            this.field756.method2682('\u0001', 123);
            super.field6956.method2135(1, -5027);
            super.field6956.method2120(~arg0, (class411) null);
            super.field6956.method2135(0, arg0 + -5027);
        }
        if (arg0 == 0) {
            ++field760;
            super.field6956.method2165((byte) 74, 8448, 8448);
            this.field752 = false;
        }
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(IZ)V", line = 193)
    public final void method9(int arg0, boolean arg1) {
        super.field6956.method2165((byte) 74, 7681, 8448);
        if (arg0 != -5) {
            field761 = null;
        }
        ++field753;
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(B)V", line = 204)
    public static void method426(byte arg0) {
        field761 = null;
        if (arg0 <= 64) {
            method426((byte) 22);
        }
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Leq;)V", line = 247)
    public class51(class357 arg0) {
        super(arg0);
        if (arg0.field5034) {
            this.field756 = new class458(arg0, 2);
            this.field756.method2686(0, (byte) -63);
            super.field6956.method2135(1, -5027);
            super.field6956.method2165((byte) 74, 7681, 34165);
            super.field6956.method2132(770, (byte) 123, 34168, 2);
            super.field6956.method2189(34167, true, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6956.method2135(0, -5027);
            this.field756.method2685(0);
            this.field756.method2686(1, (byte) -124);
            super.field6956.method2135(1, -5027);
            super.field6956.method2165((byte) 74, 8448, 8448);
            super.field6956.method2132(770, (byte) 1, 34166, 2);
            super.field6956.method2189(5890, true, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6956.method2135(0, -5027);
            this.field756.method2685(0);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V", line = 217)
    public static final void method427(int arg0, int arg1) {
        ++field758;
        if (~class521.field7342 != ~arg0) {
            class613.field8591 = class1.field3 = class263.field3336[arg0];
            class519.method2983(true);
            class470.field6753 = new int[class613.field8591][class1.field3];
            class269.field3399 = new int[4][class613.field8591 >> 3][class1.field3 >> 3];
            class706.field9951 = new int[class613.field8591][class1.field3];
            for (int var2 = 0; var2 < 4; ++var2) {
                class410.field5786[var2] = class6.method30(class613.field8591, class1.field3, true);
            }
            class406.field5734 = new byte[4][class613.field8591][class1.field3];
            class603.method3315(arg1 ^ -10964, class1.field3, 4, class613.field8591);
            if (arg1 != -10924) {
                field761 = null;
            }
            class197.method1239(class458.field6407, class613.field8591 >> 3, (byte) -24, class1.field3 >> 3);
            class521.field7342 = arg0;
        }
    }
}
