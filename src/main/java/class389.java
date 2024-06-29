import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class389 extends class648 {

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Z")
    private boolean field5851 = false;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "[F")
    private float[] field5857 = new float[4];

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Ldw;")
    private class720 field5863;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Ldw;")
    private class720 field5861;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Ldw;")
    private class720 field5846;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Ldw;")
    private class720 field5852;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "Lch;")
    private class465 field5869;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
    private boolean field5848;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lqe;")
    public static class469 field5853 = new class469(114, 10);

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field5865 = -1;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Lqe;")
    public static class469 field5860 = new class469(3, 10);

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Z")
    private boolean field5850;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "Z")
    private boolean field5867;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public static void method2495(int arg0) {
        field5860 = null;
        field5853 = null;
        if (arg0 != 3942) {
            field5865 = -98;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lbca;II)V")
    public final void method1455(class663 arg0, int arg1, int arg2) {
        ++field5858;
        if (arg1 != 12885) {
            field5860 = null;
        }
        if (arg0 != null) {
            if (this.field5851) {
                super.field9139.method2329(0, (byte) -128, class331.field4759);
                super.field9139.method2407(0, class331.field4759, 53);
                this.field5851 = false;
            }
            super.field9139.method2294(arg0, -2);
            super.field9139.method2353((byte) -122, arg2);
        } else if (!this.field5851) {
            super.field9139.method2294(super.field9139.field5583, -2);
            super.field9139.method2353((byte) -111, 1);
            super.field9139.method2329(0, (byte) -128, class328.field4670);
            super.field9139.method2407(0, class328.field4670, 75);
            this.field5851 = true;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
    public static final int method2496(int arg0, int arg1) {
        if (arg0 > -39) {
            field5860 = null;
        }
        ++field5849;
        return 127 & arg1 >> 11;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public final void method1450(int arg0) {
        ++field5855;
        super.field9139.method2375((byte) 114, 1);
        super.field9139.method2294((class663) null, -2);
        super.field9139.method2300(class336.field4874, class336.field4874, 0);
        super.field9139.method2329(0, (byte) -126, class331.field4759);
        super.field9139.method2329(2, (byte) -124, class469.field6850);
        super.field9139.method2407(0, class331.field4759, 106);
        super.field9139.method2375((byte) -123, 0);
        if (this.field5851) {
            super.field9139.method2329(0, (byte) -128, class331.field4759);
            super.field9139.method2407(0, class331.field4759, 84);
            this.field5851 = false;
        }
        if (arg0 > -67) {
            this.field5867 = true;
        }
        if (this.field5850) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5850 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)V")
    public final void method2497(boolean arg0) {
        ++field5868;
        int var2 = super.field9139.method2393((byte) 70);
        class441 var3 = super.field9139.method2347((byte) -79);
        if (!arg0) {
            if (this.field5867) {
                OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field5852.field10100 : this.field5861.field10100);
            } else {
                OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field5846.field10100 : this.field5863.field10100);
            }
            OpenGL.glEnable(34336);
            this.field5850 = true;
            var3.method2740((byte) -123, this.field5857, 0.0F, (float) var2, 0.0F, -1.0F);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field5857[0], this.field5857[1], this.field5857[2], this.field5857[3]);
            this.method2498(true);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lno;Lvd;)V")
    public class389(class704 arg0, class39 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field9917) {
            this.field5863 = class234.method1558(34336, arg1.method233(-101, "gl", "uw_ground_unlit"), true, arg0);
            this.field5861 = class234.method1558(34336, arg1.method233(-122, "gl", "uw_ground_lit"), true, arg0);
            this.field5846 = class234.method1558(34336, arg1.method233(-118, "gl", "uw_model_unlit"), true, arg0);
            this.field5852 = class234.method1558(34336, arg1.method233(-126, "gl", "uw_model_lit"), true, arg0);
            if (this.field5852 != null & this.field5863 != null & this.field5861 != null & this.field5846 != null) {
                this.field5869 = super.field9139.method2358(126, false, 1, new int[] { 0, -1 }, 2);
                this.field5869.method1272(false, (byte) -84, false);
                this.field5848 = true;
            } else {
                this.field5848 = false;
            }
        } else {
            this.field5848 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(Z)V")
    public final void method2498(boolean arg0) {
        ++field5866;
        if (arg0) {
            if (this.field5850) {
                int var2 = super.field9139.method514();
                int var3 = super.field9139.method457();
                float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
                float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9139.method2361(120), (float) super.field9139.method2416(1) / 255.0F);
                super.field9139.method2375((byte) -91, 1);
                super.field9139.method2415(super.field9139.method2333(-16), 0);
                super.field9139.method2375((byte) -97, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V")
    public final void method1451(boolean arg0, boolean arg1) {
        this.field5867 = arg1;
        ++field5862;
        super.field9139.method2375((byte) -119, 1);
        super.field9139.method2294(this.field5869, -2);
        super.field9139.method2300(class499.field7099, class49.field706, 0);
        super.field9139.method2329(0, (byte) -127, class469.field6850);
        super.field9139.method2340(class331.field4759, true, 2, arg0, !arg0);
        super.field9139.method2407(0, class328.field4670, 101);
        super.field9139.method2375((byte) 18, 0);
        this.method2497(arg0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)V")
    public final void method1453(byte arg0, int arg1, int arg2) {
        if (arg0 >= 33) {
            ++field5859;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V")
    public static final void method2499(byte arg0, int arg1) {
        ++field5854;
        if (~class358.field5197 != ~arg1) {
            class194.field2946 = class255.field3656 = class32.field329[arg1];
            class149.method1106(-3);
            class504.field7161 = new int[4][class194.field2946 >> 3][class255.field3656 >> 3];
            class426.field6326 = new int[class194.field2946][class255.field3656];
            class740.field10379 = new int[class194.field2946][class255.field3656];
            if (arg0 != -3) {
                field5865 = -62;
            }
            for (int var2 = 0; var2 < 4; ++var2) {
                class326.field4655[var2] = class244.method1628(false, class255.field3656, class194.field2946);
            }
            class238.field3469 = new byte[4][class194.field2946][class255.field3656];
            class208.method1405(2620, 4, class255.field3656, class194.field2946);
            class143.method989(arg0 ^ 4659, class736.field10316, class194.field2946 >> 3, class255.field3656 >> 3);
            class358.field5197 = arg1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z")
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            return true;
        } else {
            ++field5864;
            return this.field5848;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
    public final void method1448(boolean arg0, int arg1) {
        ++field5856;
        if (arg1 != 0) {
            field5865 = -38;
        }
    }
}
