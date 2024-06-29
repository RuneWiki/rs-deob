import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class539 extends class554 {

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "[F")
    private float[] field7541 = new float[4];

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "Lob;")
    private class385 field7533;

    @OriginalMember(owner = "client!nda", name = "B", descriptor = "Lob;")
    private class385 field7548;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "Lob;")
    private class385 field7534;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "Lob;")
    private class385 field7535;

    @OriginalMember(owner = "client!nda", name = "E", descriptor = "Z")
    private boolean field7550;

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "Lim;")
    public static class353 field7540 = new class353(48, 4);

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!nda", name = "w", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!nda", name = "x", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!nda", name = "y", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!nda", name = "z", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!nda", name = "D", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!nda", name = "F", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "Z")
    private boolean field7537;

    @OriginalMember(owner = "client!nda", name = "A", descriptor = "Z")
    private boolean field7547;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
    public final void method2174(int arg0) {
        if (arg0 != 1406) {
            this.method466((byte) 56, true);
        }
        ++field7549;
        if (this.field7537) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (-1280 + super.field7743.method954()), (float) (super.field7743.method954() + -768), 1.0F / (float) super.field7743.method3310((byte) -23), (float) super.field7743.method3363((byte) 37) / 255.0F);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        ++field7544;
        if (!arg1) {
            this.method464(false, 44, (class11) null);
        }
    }

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        ++field7545;
        return arg0 != 4096 ? true : this.field7550;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        ++field7538;
        if (arg1 < 74) {
            field7540 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        if (this.field7537) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field7537 = false;
        }
        if (arg0 != 4096) {
            this.method471(true, -110);
        }
        ++field7536;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(B)V")
    public static void method2997(byte arg0) {
        field7540 = null;
        if (arg0 > -127) {
            method2997((byte) -22);
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lph;Lkr;)V")
    public class539(class442 arg0, class329 arg1) {
        super(arg0);
        if (arg0.field6103) {
            this.field7533 = class225.method1431(arg0, (byte) 97, arg1.method2045("uw_ground_unlit", (byte) -22, "gl"), 34336);
            this.field7548 = class225.method1431(arg0, (byte) 116, arg1.method2045("uw_ground_lit", (byte) -22, "gl"), 34336);
            this.field7534 = class225.method1431(arg0, (byte) 124, arg1.method2045("uw_model_unlit", (byte) -22, "gl"), 34336);
            this.field7535 = class225.method1431(arg0, (byte) 96, arg1.method2045("uw_model_lit", (byte) -22, "gl"), 34336);
            this.field7550 = this.field7535 != null & this.field7534 != null & this.field7548 != null & this.field7533 != null;
        } else {
            this.field7550 = false;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)I")
    public static final int method2998(int arg0, int arg1, int arg2, int arg3) {
        ++field7551;
        if (arg3 != 255) {
            field7540 = null;
        }
        if (arg1 <= 243) {
            if (arg1 <= 217) {
                if (~arg1 >= -193) {
                    if (arg1 > 179) {
                        arg0 >>= 1;
                    }
                } else {
                    arg0 >>= 2;
                }
            } else {
                arg0 >>= 3;
            }
        } else {
            arg0 >>= 4;
        }
        return (arg0 >> 5 << 7) + (((255 & arg2) >> 2 << 10) - -(arg1 >> 1));
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        if (arg0) {
            super.field7743.method3344(29639, arg2);
            ++field7543;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        ++field7539;
        this.field7547 = arg1;
        if (arg0 != 61) {
            this.method466((byte) -76, false);
        }
    }

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "(I)V")
    public final void method2168(int arg0) {
        ++field7542;
        int var2 = super.field7743.method3294((byte) -62);
        class186 var3 = super.field7743.method3360(-1);
        var3.method1130(127, 0.0F, -1.0F, (float) var2, 0.0F, this.field7541);
        if (!this.field7547) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field7534.field5364 : this.field7533.field5364);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field7535.field5364 : this.field7548.field5364);
        }
        OpenGL.glEnable(34336);
        this.field7537 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field7541[0], this.field7541[1], this.field7541[2], this.field7541[3]);
        if (arg0 > 99) {
            this.method2174(1406);
        }
    }
}
