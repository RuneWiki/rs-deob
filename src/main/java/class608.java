import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class608 extends class521 {

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "[F")
    private float[] field8839 = new float[4];

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "Z")
    private boolean field8828;

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "Loi;")
    private class63 field8840;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "Loi;")
    private class63 field8833;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "Loi;")
    private class63 field8831;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "Loi;")
    private class63 field8836;

    @OriginalMember(owner = "client!pca", name = "D", descriptor = "Lvj;")
    public static class373 field8844 = new class373(20, 0);

    @OriginalMember(owner = "client!pca", name = "F", descriptor = "Lvj;")
    public static class373 field8846 = new class373(24, 0);

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!pca", name = "C", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!pca", name = "G", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "Z")
    private boolean field8838;

    @OriginalMember(owner = "client!pca", name = "E", descriptor = "Z")
    private boolean field8845;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "(I)V", line = 4)
    public final void method2833(int arg0) {
        int var2 = 108 % ((87 - arg0) / 38);
        ++field8827;
        int var3 = super.field7319.method2476((byte) 61);
        class335 var4 = super.field7319.method2450(1);
        var4.method1879((byte) 88, -1.0F, 0.0F, 0.0F, (float) var3, this.field8839);
        if (!this.field8838) {
            OpenGL.glBindProgramARB(34336, var3 == Integer.MAX_VALUE ? this.field8840.field629 : this.field8831.field629);
        } else {
            OpenGL.glBindProgramARB(34336, var3 != Integer.MAX_VALUE ? this.field8836.field629 : this.field8833.field629);
        }
        OpenGL.glEnable(34336);
        this.field8845 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field8839[0], this.field8839[1], this.field8839[2], this.field8839[3]);
        this.method636(256);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V", line = 32)
    public final void method455(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method2833(-74);
        }
        ++field8843;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILhv;I)V", line = 43)
    public final void method446(int arg0, class440 arg1, int arg2) {
        if (arg2 != 26440) {
            field8847 = -17;
        }
        super.field7319.method2459(87, arg1);
        ++field8832;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BZ)V", line = 60)
    public final void method454(byte arg0, boolean arg1) {
        if (arg0 != 21) {
            this.method448(true);
        }
        this.field8838 = arg1;
        ++field8842;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V", line = 73)
    public static void method3502(byte arg0) {
        if (arg0 <= -127) {
            field8846 = null;
            field8844 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZ)V", line = 84)
    public final void method449(int arg0, boolean arg1) {
        if (arg0 != 256) {
            this.field8845 = false;
        }
        ++field8841;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(III)V", line = 100)
    public static final void method3503(int arg0, int arg1, int arg2) {
        ++field8830;
        int var3 = class410.field5340.method1241(class31.field237.method987(class31.field247, 22), (byte) 0);
        class99 var4 = (class99) class89.field1096.method1050((byte) 73);
        if (arg0 != 31911) {
            field8846 = null;
        }
        while (var4 != null) {
            int var8 = class605.method3479(true, var4);
            if (~var8 < ~var3) {
                var3 = var8;
            }
            var4 = (class99) class89.field1096.method1047(arg0 + -39873);
        }
        var3 += 8;
        int var5 = class199.field2397 * 16 + 21;
        int var6 = -(var3 / 2) + arg2;
        if (~(var3 + var6) < ~class185.field2239) {
            var6 = -var3 + class185.field2239;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg1;
        if (~class426.field5495 > ~(var5 + arg1)) {
            var7 = -var5 + class426.field5495;
        }
        if (~var7 > -1) {
            var7 = 0;
        }
        class308.field3933 = var6;
        class594.field8623 = class199.field2397 * 16 - -(!class590.field8552 ? 22 : 26);
        class609.field8848 = var3;
        class473.field6634 = true;
        class521.field7314 = var7;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V", line = 154)
    public final void method448(boolean arg0) {
        if (this.field8845) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field8845 = false;
        }
        ++field8835;
        if (arg0) {
            this.method448(true);
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Ltm;Ldn;)V", line = 173)
    public class608(class327 arg0, class438 arg1) {
        super(arg0);
        if (!arg0.field4264) {
            this.field8828 = false;
        } else {
            this.field8840 = class272.method1520(arg0, (byte) -115, arg1.method2570((byte) 40, "uw_ground_unlit", "gl"), 34336);
            this.field8833 = class272.method1520(arg0, (byte) -127, arg1.method2570((byte) 43, "uw_ground_lit", "gl"), 34336);
            this.field8831 = class272.method1520(arg0, (byte) -124, arg1.method2570((byte) 18, "uw_model_unlit", "gl"), 34336);
            this.field8836 = class272.method1520(arg0, (byte) 104, arg1.method2570((byte) 115, "uw_model_lit", "gl"), 34336);
            this.field8828 = this.field8831 != null & this.field8840 != null & this.field8833 != null & this.field8836 != null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 191)
    public final void method636(int arg0) {
        if (arg0 != 256) {
            this.field8845 = true;
        }
        ++field8834;
        if (this.field8845) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field7319.method1129() + -1280), (float) (-768 + super.field7319.method1129()), 1.0F / (float) super.field7319.method2460(-81), (float) super.field7319.method2469(false) / 255.0F);
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(B)V", line = 205)
    public static final void method3504(byte arg0) {
        if (arg0 != 7) {
            method3504((byte) -98);
        }
        class337.field4387.method3687(arg0 ^ 1405);
        ++field8829;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Z", line = 217)
    public final boolean method452(int arg0) {
        if (arg0 < 49) {
            return false;
        } else {
            ++field8837;
            return this.field8828;
        }
    }
}
