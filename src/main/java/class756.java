import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class756 extends class573 {

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "Z")
    private boolean field10509 = false;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "[F")
    private float[] field10517 = new float[4];

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "Low;")
    private class351 field10514;

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "Low;")
    private class351 field10520;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "Low;")
    private class351 field10506;

    @OriginalMember(owner = "client!nca", name = "M", descriptor = "Low;")
    private class351 field10524;

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "Z")
    private boolean field10518;

    @OriginalMember(owner = "client!nca", name = "J", descriptor = "Ltr;")
    private class297 field10521;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "[I")
    public static int[] field10508 = new int[2];

    @OriginalMember(owner = "client!nca", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field10526 = new String[100];

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "Lvv;")
    public static class329 field10510 = new class329(128);

    @OriginalMember(owner = "client!nca", name = "P", descriptor = "I")
    public static int field10527 = -1;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "I")
    public static int field10507;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "I")
    public static int field10511;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
    public static int field10515;

    @OriginalMember(owner = "client!nca", name = "K", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!nca", name = "L", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!nca", name = "N", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "Z")
    private boolean field10516;

    @OriginalMember(owner = "client!nca", name = "H", descriptor = "Z")
    private boolean field10519;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
    public final void method1140(boolean arg0) {
        ++field10512;
        if (this.field10519) {
            int var2 = super.field7517.method402();
            int var3 = super.field7517.method424();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7517.method929(-118), (float) super.field7517.method872(-31039) / 255.0F);
            super.field7517.method934(1, (byte) -65);
            super.field7517.method870(super.field7517.method896(78), false);
            super.field7517.method934(0, (byte) -65);
        }
        if (!arg0) {
            this.method611(false, false);
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
    public final void method3152(byte arg0) {
        ++field10525;
        int var2 = super.field7517.method947(-8);
        int var3 = -122 % ((-46 - arg0) / 55);
        class615 var4 = super.field7517.method867(true);
        if (!this.field10516) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field10514.field4931 : this.field10506.field4931);
        } else {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field10524.field4931 : this.field10520.field4931);
        }
        OpenGL.glEnable(34336);
        this.field10519 = true;
        var4.method3365(this.field10517, -1.0F, true, 0.0F, 0.0F, (float) var2);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field10517[0], this.field10517[1], this.field10517[2], this.field10517[3]);
        this.method1140(true);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(Z)V")
    public final void method603(boolean arg0) {
        if (!arg0) {
            this.field10520 = null;
        }
        super.field7517.method934(1, (byte) -65);
        ++field10505;
        super.field7517.method823((class67) null, -8423);
        super.field7517.method849((byte) 107, class312.field4469, class312.field4469);
        super.field7517.method840(0, -56, class454.field6199);
        super.field7517.method840(2, 52, class362.field5101);
        super.field7517.method845(class454.field6199, (byte) 108, 0);
        super.field7517.method934(0, (byte) -65);
        if (this.field10509) {
            super.field7517.method840(0, 112, class454.field6199);
            super.field7517.method845(class454.field6199, (byte) 109, 0);
            this.field10509 = false;
        }
        if (this.field10519) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field10519 = false;
        }
    }

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "(I)V")
    public static void method4221(int arg0) {
        field10508 = null;
        if (arg0 == -25050) {
            field10510 = null;
            field10526 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V")
    public final void method610(boolean arg0, int arg1) {
        ++field10523;
        if (arg1 <= 109) {
            field10527 = -100;
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Llaa;Lwu;)V")
    public class756(class122 arg0, class376 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field2049) {
            this.field10514 = class187.method1287(34336, arg1.method2204("uw_ground_unlit", "gl", (byte) 83), arg0, (byte) -94);
            this.field10520 = class187.method1287(34336, arg1.method2204("uw_ground_lit", "gl", (byte) 68), arg0, (byte) -117);
            this.field10506 = class187.method1287(34336, arg1.method2204("uw_model_unlit", "gl", (byte) 110), arg0, (byte) -84);
            this.field10524 = class187.method1287(34336, arg1.method2204("uw_model_lit", "gl", (byte) 119), arg0, (byte) -106);
            if (!(this.field10524 != null & this.field10506 != null & this.field10520 != null & this.field10514 != null)) {
                this.field10518 = false;
            } else {
                this.field10521 = super.field7517.method927(2, new int[] { 0, -1 }, (byte) -36, false, 1);
                this.field10521.method595(1645, false, false);
                this.field10518 = true;
            }
        } else {
            this.field10518 = false;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)V")
    public final void method611(boolean arg0, boolean arg1) {
        this.field10516 = arg1;
        ++field10513;
        super.field7517.method934(1, (byte) -65);
        super.field7517.method823(this.field10521, -8423);
        super.field7517.method849((byte) 109, class99.field1265, class314.field4479);
        super.field7517.method840(0, -102, class362.field5101);
        super.field7517.method911(-8980, 2, class454.field6199, false, arg0);
        super.field7517.method845(class227.field3230, (byte) 124, 0);
        super.field7517.method934(0, (byte) -65);
        this.method3152((byte) 35);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        ++field10511;
        return arg0 != 4095 ? false : this.field10518;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)V")
    public final void method602(int arg0, int arg1, int arg2) {
        if (arg0 == -26427) {
            ++field10522;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lwc;IB)V")
    public final void method607(class67 arg0, int arg1, byte arg2) {
        if (arg0 == null) {
            if (!this.field10509) {
                super.field7517.method823(super.field7517.field1809, -8423);
                super.field7517.method887((byte) 106, 1);
                super.field7517.method840(0, -75, class227.field3230);
                super.field7517.method845(class227.field3230, (byte) 93, 0);
                this.field10509 = true;
            }
        } else {
            if (this.field10509) {
                super.field7517.method840(0, -77, class454.field6199);
                super.field7517.method845(class454.field6199, (byte) 110, 0);
                this.field10509 = false;
            }
            super.field7517.method823(arg0, -8423);
            super.field7517.method887((byte) 113, arg1);
        }
        ++field10515;
        if (arg2 <= 68) {
            this.field10519 = false;
        }
    }
}
