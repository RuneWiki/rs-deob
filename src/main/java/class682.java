import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class682 extends class715 {

    @OriginalMember(owner = "client!vha", name = "r", descriptor = "Z")
    private boolean field9597 = false;

    @OriginalMember(owner = "client!vha", name = "y", descriptor = "[F")
    private float[] field9604 = new float[4];

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "Ltea;")
    private class237 field9594;

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "Ltea;")
    private class237 field9592;

    @OriginalMember(owner = "client!vha", name = "v", descriptor = "Ltea;")
    private class237 field9601;

    @OriginalMember(owner = "client!vha", name = "D", descriptor = "Ltea;")
    private class237 field9609;

    @OriginalMember(owner = "client!vha", name = "q", descriptor = "Lwda;")
    private class636 field9596;

    @OriginalMember(owner = "client!vha", name = "B", descriptor = "Z")
    private boolean field9607;

    @OriginalMember(owner = "client!vha", name = "n", descriptor = "I")
    public static int field9593 = 1;

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!vha", name = "s", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!vha", name = "t", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!vha", name = "u", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!vha", name = "w", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!vha", name = "C", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!vha", name = "F", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!vha", name = "x", descriptor = "Z")
    private boolean field9603;

    @OriginalMember(owner = "client!vha", name = "A", descriptor = "Z")
    private boolean field9606;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        ++field9599;
        if (arg0 > -105) {
            field9593 = 104;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        if (arg1 != null) {
            if (this.field9597) {
                super.field9979.method2767(0, 25103, class68.field1225);
                super.field9979.method2755(false, 0, class68.field1225);
                this.field9597 = false;
            }
            super.field9979.method2732(-97, arg1);
            super.field9979.method2721(arg2, true);
        } else if (!this.field9597) {
            super.field9979.method2732(-58, super.field9979.field6529);
            super.field9979.method2721(1, true);
            super.field9979.method2767(0, 25103, class44.field665);
            super.field9979.method2755(false, 0, class44.field665);
            this.field9597 = true;
        }
        ++field9598;
        int var4 = 125 % ((arg0 - 31) / 50);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        if (arg1 == 1782) {
            ++field9605;
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V")
    public final void method2085(byte arg0) {
        ++field9610;
        int var2 = super.field9979.method2737(62);
        class25 var3 = super.field9979.method2775(0);
        if (this.field9603) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field9609.field3351 : this.field9592.field3351);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field9601.field3351 : this.field9594.field3351);
        }
        OpenGL.glEnable(34336);
        this.field9606 = true;
        var3.method161(0.0F, 0.0F, -1.0F, this.field9604, (byte) -48, (float) var2);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field9604[0], this.field9604[1], this.field9604[2], this.field9604[3]);
        this.method886(-95);
        if (arg0 > -45) {
            this.method687(-23, -19, -48);
        }
    }

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        ++field9602;
        super.field9979.method2753((byte) -17, 1);
        super.field9979.method2732(-74, (class355) null);
        super.field9979.method2769(class571.field8118, class571.field8118, 18721);
        super.field9979.method2767(0, 25103, class68.field1225);
        super.field9979.method2767(2, 25103, class142.field2176);
        super.field9979.method2755(false, 0, class68.field1225);
        int var2 = -89 % ((-71 - arg0) / 42);
        super.field9979.method2753((byte) -17, 0);
        if (this.field9597) {
            super.field9979.method2767(0, 25103, class68.field1225);
            super.field9979.method2755(false, 0, class68.field1225);
            this.field9597 = false;
        }
        if (this.field9606) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field9606 = false;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
    public final void method886(int arg0) {
        if (this.field9606) {
            int var2 = super.field9979.method531();
            int var3 = super.field9979.method534();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9979.method2720((byte) -126), (float) super.field9979.method2733(false) / 255.0F);
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2730(super.field9979.method2756(-14), -32755);
            super.field9979.method2753((byte) -17, 0);
        }
        ++field9595;
        if (arg0 >= -37) {
            this.field9594 = null;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            this.field9596 = null;
        }
        ++field9608;
        return this.field9607;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        this.field9603 = arg0;
        ++field9600;
        super.field9979.method2753((byte) -17, 1);
        if (arg1 != 4) {
            this.method690((byte) -104);
        }
        super.field9979.method2732(arg1 + -121, this.field9596);
        super.field9979.method2769(class140.field2165, class218.field3121, 18721);
        super.field9979.method2767(0, arg1 ^ 25099, class142.field2176);
        super.field9979.method1020(false, true, (byte) 65, 2, class68.field1225);
        super.field9979.method2755(false, 0, class44.field665);
        super.field9979.method2753((byte) -17, 0);
        this.method2085((byte) -120);
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Leea;Leq;)V")
    public class682(class132 arg0, class209 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field2097) {
            this.field9594 = class569.method3325(arg1.method1475("uw_ground_unlit", (byte) 116, "gl"), 34336, (byte) 56, arg0);
            this.field9592 = class569.method3325(arg1.method1475("uw_ground_lit", (byte) 116, "gl"), 34336, (byte) 56, arg0);
            this.field9601 = class569.method3325(arg1.method1475("uw_model_unlit", (byte) 116, "gl"), 34336, (byte) 56, arg0);
            this.field9609 = class569.method3325(arg1.method1475("uw_model_lit", (byte) 116, "gl"), 34336, (byte) 56, arg0);
            if (this.field9601 != null & this.field9594 != null & this.field9592 != null & this.field9609 != null) {
                this.field9596 = super.field9979.method2740(false, 1, 2, new int[] { 0, -1 }, (byte) -100);
                this.field9596.method427(false, (byte) 66, false);
                this.field9607 = true;
            } else {
                this.field9607 = false;
            }
        } else {
            this.field9607 = false;
        }
    }
}
