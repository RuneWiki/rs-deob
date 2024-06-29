import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class219 extends class266 {

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[F")
    private float[] field3171 = new float[4];

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "Z")
    private boolean field3173;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Lch;")
    private class426 field3181;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "Lch;")
    private class426 field3183;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lch;")
    private class426 field3166;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Lch;")
    private class426 field3175;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "S")
    public static short field3174 = 205;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3170 = 1337;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
    private boolean field3180;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
    private boolean field3185;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
    public final void method148(int arg0, boolean arg1) {
        this.field3185 = arg1;
        if (arg0 != 0) {
            this.method155(true);
        }
        ++field3186;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lmc;Lpj;)V")
    public class219(class120 arg0, class132 arg1) {
        super(arg0);
        if (!arg0.field1661) {
            this.field3173 = false;
        } else {
            this.field3181 = class571.method3147(34336, 65280, arg1.method937("uw_ground_unlit", "gl", 0), arg0);
            this.field3183 = class571.method3147(34336, 65280, arg1.method937("uw_ground_lit", "gl", 0), arg0);
            this.field3166 = class571.method3147(34336, 65280, arg1.method937("uw_model_unlit", "gl", 0), arg0);
            this.field3175 = class571.method3147(34336, 65280, arg1.method937("uw_model_lit", "gl", 0), arg0);
            this.field3173 = this.field3166 != null & this.field3181 != null & this.field3183 != null & this.field3175 != null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public final void method147(int arg0) {
        ++field3168;
        int var2 = super.field3785.method3180(false);
        class367 var3 = super.field3785.method3206(1);
        var3.method2150(-1.0F, this.field3171, 0.0F, 0.0F, (float) var2, (byte) 127);
        if (this.field3185) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field3175.field5995 : this.field3183.field5995);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field3166.field5995 : this.field3181.field5995);
        }
        OpenGL.glEnable(34336);
        this.field3180 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3171[arg0], this.field3171[1], this.field3171[2], this.field3171[3]);
        this.method151(-56);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
    public final void method156(int arg0, int arg1, int arg2) {
        ++field3177;
        if (arg2 != 0) {
            this.method150((class467) null, 62, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)Z")
    public final boolean method154(int arg0) {
        if (arg0 <= 101) {
            return true;
        } else {
            ++field3179;
            return this.field3173;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lek;IB)V")
    public final void method150(class467 arg0, int arg1, byte arg2) {
        super.field3785.method3232(false, arg0);
        if (arg2 >= -56) {
            this.method154(-8);
        }
        ++field3178;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)V")
    public static final void method1413(boolean arg0, int arg1) {
        if (arg0) {
            method1415(-82, -71, (String) null);
        }
        ++field3184;
        class679 var2 = class669.method3708(10, arg1, 1403048928);
        var2.method3749(-41);
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (this.field3180) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (-1280 + super.field3785.method474()), (float) (super.field3785.method474() - 768), 1.0F / (float) super.field3785.method3241(0), (float) super.field3785.method3247(-15077) / 255.0F);
        }
        if (arg0 >= -1) {
            this.method148(-108, false);
        }
        ++field3165;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IZ)V")
    public final void method144(int arg0, boolean arg1) {
        ++field3167;
        if (arg0 != 1) {
            this.method155(true);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILpj;)V")
    public static final void method1414(int arg0, class132 arg1) {
        class264.field3749 = 0;
        ++field3176;
        class166.field2512 = 0;
        class381.field5356 = new class663();
        class552.field7482 = new class619[1024];
        if (arg0 == 28817) {
            class632.field8852 = new class401[class342.field4964[class684.field9621] + 1];
            class105.field1408 = 0;
            class627.field8754 = 0;
            class85.method656(arg1, true);
            class493.method2762((byte) 58, arg1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1415(int arg0, int arg1, String arg2) {
        ++field3172;
        class679 var3 = class669.method3708(2, arg0, 1403048928);
        var3.method3748(true);
        var3.field9565 = arg2;
        if (arg1 != 11447) {
            method1415(72, 29, (String) null);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public final void method155(boolean arg0) {
        if (arg0) {
            this.field3175 = null;
        }
        if (this.field3180) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3180 = false;
        }
        ++field3169;
    }
}
