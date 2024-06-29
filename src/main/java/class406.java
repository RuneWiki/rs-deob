import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class406 extends class460 {

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "Z")
    private boolean field5831 = false;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "Luq;")
    private class458 field5828;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "Z")
    public static boolean field5822 = true;

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "[I")
    public static int[] field5830 = new int[3];

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "Lov;")
    public static class26 field5827;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BZ)V", line = 3)
    public final void method1177(byte arg0, boolean arg1) {
        super.field6621.method2328(8448, 40, 7681);
        ++field5826;
        int var3 = -86 / ((arg0 - -85) / 38);
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V", line = 13)
    public static void method2438(byte arg0) {
        field5830 = null;
        if (arg0 == 54) {
            field5827 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lkfa;)V", line = 24)
    public class406(class382 arg0) {
        super(arg0);
        if (arg0.field5542) {
            this.field5828 = new class458(arg0, 2);
            this.field5828.method2656(0, (byte) 76);
            super.field6621.method2308(1, -15115);
            super.field6621.method2328(34165, -124, 7681);
            super.field6621.method2262(34168, 2, 34176, 770);
            super.field6621.method2258(-122, 34167, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6621.method2308(0, -15115);
            this.field5828.method2657(0);
            this.field5828.method2656(1, (byte) 76);
            super.field6621.method2308(1, -15115);
            super.field6621.method2328(8448, 30, 8448);
            super.field6621.method2262(34166, 2, 34176, 770);
            super.field6621.method2258(-35, 5890, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6621.method2308(0, -15115);
            this.field5828.method2657(0);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V", line = 68)
    public final void method1174(byte arg0) {
        ++field5825;
        if (!this.field5831) {
            super.field6621.method2258(-93, 5890, 770, 0);
        } else {
            this.field5828.method2658(0, '\u0001');
            super.field6621.method2308(1, -15115);
            super.field6621.method2295((byte) 9, (class337) null);
            super.field6621.method2308(0, -15115);
        }
        super.field6621.method2328(8448, 60, 8448);
        if (arg0 > -56) {
            this.method1175(false, 77);
        }
        this.field5831 = false;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIIIII)V", line = 90)
    public static final void method2439(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5832;
        int var6 = 0;
        if (!arg0) {
            field5827 = null;
        }
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = var9 - (var12 + -1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 + -1) * var15;
        class223.method1484(class657.field9275[arg5], arg1 + arg3, -121, arg2, -arg3 + arg1);
        while (~var7 < -1) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var18 -= var15;
            --var7;
            int var21 = -var7 + arg5;
            int var22 = arg5 + var7;
            int var23 = arg1 - -var6;
            int var24 = -var6 + arg1;
            class223.method1484(class657.field9275[var21], var23, -99, arg2, var24);
            class223.method1484(class657.field9275[var22], var23, -114, arg2, var24);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V", line = 175)
    public static final void method2440(int arg0) {
        class133.field2155 = 1;
        class70.field1107 = -1;
        ++field5829;
        long var1 = 0L;
        if (arg0 < 72) {
            method2438((byte) 80);
        }
        if (class640.field9072 == null) {
            class562.method3287(35, -4);
        } else {
            class465 var3 = new class465(class94.method720(class477.method2793(class640.field9072, -15387), false));
            long var4 = var3.method2727(0);
            class177.field2824 = var3.method2727(0);
            class218.method1466(true, class618.method3494(var4, -32105), (byte) -74, "");
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)Z", line = 208)
    public final boolean method1168(int arg0) {
        if (arg0 != 2048) {
            field5830 = null;
        }
        ++field5823;
        return true;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(III)V", line = 222)
    public final void method1170(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            ++field5820;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILjo;I)V", line = 232)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        super.field6621.method2295((byte) -98, arg1);
        int var4 = 111 % ((65 - arg2) / 53);
        ++field5824;
        super.field6621.method2270(arg0, (byte) 110);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V", line = 251)
    public final void method1175(boolean arg0, int arg1) {
        ++field5821;
        class656 var3 = super.field6621.method2335(arg1);
        if (this.field5828 != null && var3 != null && arg0) {
            this.field5828.method2658(0, '\u0000');
            super.field6621.method2308(1, -15115);
            super.field6621.method2295((byte) -128, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6621.field5494.method1762(121), 0);
            OpenGL.glMatrixMode(5888);
            super.field6621.method2308(0, arg1 + -15115);
            this.field5831 = true;
        } else {
            super.field6621.method2258(-72, 34168, 770, 0);
        }
    }
}
