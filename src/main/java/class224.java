import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class224 extends class353 {

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "[F")
    private float[] field2962 = new float[4];

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "Ltb;")
    private class451 field2957;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "Ltb;")
    private class451 field2956;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "Ltb;")
    private class451 field2974;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "Ltb;")
    private class451 field2968;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "Lfj;")
    private class75 field2959;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Z")
    private boolean field2955;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "J")
    public static long field2970 = 0L;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "Lvg;")
    public static class622 field2969 = new class622(22, 4);

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Lmv;")
    public static class295 field2958;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "Z")
    private boolean field2964;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "Z")
    private boolean field2971;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "[I")
    public static int[] field2975;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lkd;Lmv;)V", line = 3)
    public class224(class700 arg0, class295 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field9946) {
            this.field2957 = class361.method2218(34336, 0, arg0, arg1.method1817(127, "gl", "uw_ground_unlit"));
            this.field2956 = class361.method2218(34336, 0, arg0, arg1.method1817(-46, "gl", "uw_ground_lit"));
            this.field2974 = class361.method2218(34336, 0, arg0, arg1.method1817(126, "gl", "uw_model_unlit"));
            this.field2968 = class361.method2218(34336, 0, arg0, arg1.method1817(9, "gl", "uw_model_lit"));
            if (this.field2974 != null & this.field2956 != null & this.field2957 != null & this.field2968 != null) {
                this.field2959 = super.field5242.method3035(1, 2, (byte) -50, false, new int[] { 0, -1 });
                this.field2959.method432(false, false, (byte) 115);
                this.field2955 = true;
            } else {
                this.field2955 = false;
            }
        } else {
            this.field2955 = false;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZI)V", line = 29)
    public final void method486(int arg0, boolean arg1, int arg2) {
        ++field2967;
        if (arg1) {
            this.method1395(true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 41)
    public final void method490(int arg0) {
        ++field2960;
        super.field5242.method3050(1, arg0 ^ arg0);
        super.field5242.method3011(-128, (class689) null);
        super.field5242.method3013(class492.field6998, arg0 ^ -2144900449, class492.field6998);
        super.field5242.method3025(class283.field3777, -1, 0);
        super.field5242.method3025(class475.field6812, -1, 2);
        super.field5242.method3019(0, 0, class283.field3777);
        super.field5242.method3050(0, 0);
        if (this.field2971) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2971 = false;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILqda;I)V", line = 65)
    public final void method484(int arg0, class689 arg1, int arg2) {
        if (arg0 != 8056) {
            this.method484(114, (class689) null, 40);
        }
        ++field2954;
        super.field5242.method3011(-127, arg1);
        super.field5242.method3037(arg2, true);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(IZ)V", line = 78)
    public final void method485(int arg0, boolean arg1) {
        if (arg0 <= 1) {
            this.field2956 = null;
        }
        ++field2963;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 89)
    public final void method1395(boolean arg0) {
        ++field2966;
        if (!arg0) {
            this.field2971 = false;
        }
        if (this.field2971) {
            int var2 = super.field5242.method608();
            int var3 = super.field5242.method668();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5242.method3020(-75), (float) super.field5242.method3030(!arg0) / 255.0F);
            super.field5242.method3050(1, 0);
            super.field5242.method3028(super.field5242.method3053(0), false);
            super.field5242.method3050(0, 0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V", line = 118)
    public final void method491(int arg0, boolean arg1) {
        this.field2964 = arg1;
        ++field2973;
        super.field5242.method3050(1, 0);
        super.field5242.method3011(-128, this.field2959);
        super.field5242.method3013(class481.field6884, 63, class519.field7276);
        if (arg0 <= -121) {
            super.field5242.method3025(class475.field6812, -1, 0);
            super.field5242.method768(true, false, class283.field3777, 2, 3);
            super.field5242.method3019(0, 0, class11.field273);
            super.field5242.method3050(0, 0);
            this.method1396(1);
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 140)
    public final void method1396(int arg0) {
        ++field2965;
        int var2 = super.field5242.method3022(126);
        class300 var3 = super.field5242.method2998(false);
        if (this.field2964) {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field2956.field6511 : this.field2968.field6511);
        } else {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field2974.field6511 : this.field2957.field6511);
        }
        OpenGL.glEnable(34336);
        this.field2971 = true;
        var3.method1887(0.0F, 0.0F, this.field2962, 2, (float) var2, -1.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field2962[0], this.field2962[arg0], this.field2962[2], this.field2962[3]);
        this.method1395(true);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lr;JB)V", line = 171)
    public static final void method1397(class98 arg0, long arg1, byte arg2) {
        ++field2961;
        class596.field8627 = 0;
        if (arg2 != -23) {
            method1398(95);
        }
        class557.field8185 = class267.field3483;
        class299.field4394 = 0;
        class267.field3483 = 0;
        long var4 = class60.method371(false);
        for (class16 var6 = (class16) class165.field2320.method2370(-26173); var6 != null; var6 = (class16) class165.field2320.method2369((byte) 124)) {
            if (var6.method119(arg0, arg1)) {
                ++class596.field8627;
            }
        }
        if (class242.field3210 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class165.field2320.method2367(-116) + ", running: " + class596.field8627);
            System.out.println("Emitters: " + class299.field4394 + " Particles: " + class267.field3483 + ". Time taken: " + (class60.method371(false) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)Z", line = 207)
    public final boolean method493(byte arg0) {
        ++field2972;
        return arg0 >= -20 ? false : this.field2955;
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V", line = 223)
    public static void method1398(int arg0) {
        field2969 = null;
        field2958 = null;
        int var1 = 19 / ((arg0 - -42) / 53);
        field2975 = null;
    }
}
