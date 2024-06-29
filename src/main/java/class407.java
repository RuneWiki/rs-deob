import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class407 extends class262 {

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "[F")
    private float[] field5780 = new float[4];

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Lqd;")
    private class415 field5772;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Lqd;")
    private class415 field5779;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Lqd;")
    private class415 field5768;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Lqd;")
    private class415 field5767;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Z")
    private boolean field5781;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lco;")
    private class103 field5774;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "[I")
    public static int[] field5764 = new int[1];

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field5785 = 0;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "F")
    public static float field5769;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lpe;")
    public static class564 field5771;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Z")
    private boolean field5766;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Z")
    private boolean field5776;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 8)
    public final void method593(int arg0) {
        ++field5770;
        if (this.field5776) {
            int var2 = super.field3601.method287();
            int var3 = super.field3601.method260();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3601.method2332(0), (float) super.field3601.method2375(80) / 255.0F);
            super.field3601.method2318(1, -30954);
            super.field3601.method2331(true, super.field3601.method2380(-126));
            super.field3601.method2318(0, -30954);
        }
        int var6 = 44 / ((-41 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)V", line = 33)
    public static void method2465(int arg0) {
        if (arg0 == 0) {
            field5764 = null;
            field5771 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILoa;B)V", line = 48)
    public final void method371(int arg0, class644 arg1, byte arg2) {
        if (arg2 <= 80) {
            this.method882(27);
        }
        super.field3601.method2316((byte) 98, arg1);
        ++field5783;
        super.field3601.method2362(arg0, false);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V", line = 68)
    public final void method377(int arg0, boolean arg1) {
        ++field5773;
        this.field5766 = arg1;
        super.field3601.method2318(1, -30954);
        super.field3601.method2316((byte) 117, this.field5774);
        super.field3601.method2303((byte) 58, class231.field3011, class442.field6300);
        super.field3601.method2301(0, class308.field4083, 2);
        super.field3601.method512(true, 2, 9494, class519.field7612, false);
        super.field3601.method2348(0, 6655, class141.field1760);
        super.field3601.method2318(0, -30954);
        this.method882(-53);
        if (arg0 < 37) {
            this.field5780 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ldda;Ljn;)V", line = 144)
    public class407(class349 arg0, class668 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field4668) {
            this.field5772 = class400.method2419(arg1.method3778(65, "gl", "uw_ground_unlit"), arg0, -31, 34336);
            this.field5779 = class400.method2419(arg1.method3778(-128, "gl", "uw_ground_lit"), arg0, -120, 34336);
            this.field5768 = class400.method2419(arg1.method3778(57, "gl", "uw_model_unlit"), arg0, -36, 34336);
            this.field5767 = class400.method2419(arg1.method3778(-39, "gl", "uw_model_lit"), arg0, -120, 34336);
            if (!(this.field5768 != null & this.field5772 != null & this.field5779 != null & this.field5767 != null)) {
                this.field5781 = false;
            } else {
                this.field5774 = super.field3601.method2307(1, false, new int[] { 0, -1 }, 2, 0);
                this.field5774.method757(false, false, -81);
                this.field5781 = true;
            }
        } else {
            this.field5781 = false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V", line = 91)
    public final void method372(boolean arg0, int arg1) {
        ++field5784;
        if (arg1 != 0) {
            method2465(87);
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 106)
    public final void method374(int arg0) {
        ++field5765;
        super.field3601.method2318(1, -30954);
        super.field3601.method2316((byte) 100, (class644) null);
        super.field3601.method2303((byte) -107, class652.field9230, class652.field9230);
        if (arg0 < 42) {
            this.method377(34, false);
        }
        super.field3601.method2301(0, class519.field7612, 2);
        super.field3601.method2301(2, class308.field4083, 2);
        super.field3601.method2348(0, 6655, class519.field7612);
        super.field3601.method2318(0, -30954);
        if (this.field5776) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5776 = false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZI)V", line = 134)
    public final void method373(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++field5778;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Z", line = 170)
    public final boolean method375(int arg0) {
        ++field5777;
        if (arg0 != -18095) {
            this.method373(96, true, 1);
        }
        return this.field5781;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V", line = 183)
    public final void method882(int arg0) {
        ++field5782;
        int var2 = super.field3601.method2358(-22872);
        if (arg0 > -34) {
            this.method593(-71);
        }
        class653 var3 = super.field3601.method2343(12328);
        if (!this.field5766) {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field5772.field5871 : this.field5768.field5871);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field5779.field5871 : this.field5767.field5871);
        }
        OpenGL.glEnable(34336);
        this.field5776 = true;
        var3.method3687(0.0F, -1.0F, -7354, this.field5780, (float) var2, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field5780[0], this.field5780[1], this.field5780[2], this.field5780[3]);
        this.method593(-108);
    }
}
