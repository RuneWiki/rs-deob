import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class341 extends class92 {

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "[F")
    private float[] field4899 = new float[4];

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "Z")
    private boolean field4904;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "Lqg;")
    private class201 field4907;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "Lqg;")
    private class201 field4901;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "Lqg;")
    private class201 field4902;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "Lqg;")
    private class201 field4896;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "Lfea;")
    public static class47 field4897 = new class47();

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field4914 = 0;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Z")
    private boolean field4903;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "Z")
    private boolean field4912;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 3)
    public final void method669(byte arg0) {
        if (arg0 > 55) {
            if (this.field4903) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field4903 = false;
            }
            ++field4900;
        }
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V", line = 23)
    public final void method821(int arg0) {
        ++field4905;
        int var2 = super.field1635.method3599((byte) -77);
        class516 var3 = super.field1635.method3609(arg0 ^ -63);
        var3.method2912((float) var2, (byte) -109, -1.0F, 0.0F, this.field4899, 0.0F);
        if (this.field4912) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field4901.field2839 : this.field4896.field2839);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field4907.field2839 : this.field4902.field2839);
        }
        OpenGL.glEnable(34336);
        this.field4903 = true;
        OpenGL.glProgramLocalParameter4fARB(34336, arg0, this.field4899[0], this.field4899[1], this.field4899[2], this.field4899[3]);
        this.method812((byte) -31);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V", line = 49)
    public static final void method2088(int arg0, int arg1) {
        ++field4908;
        class343.field4929 = arg0;
        if (arg1 != -2718) {
            field4914 = -125;
        }
        class490.field6891 = 2;
        long var2 = 0L;
        if (class258.field3752 == null) {
            class276.method1780(16711935, 35);
        } else {
            class268 var4 = new class268(class230.method1513((byte) -123, class639.method3689(class258.field3752, (byte) 67)));
            long var5 = var4.method1690(false);
            class301.field4353 = var4.method1690(false);
            class480.method2765(true, 0, "", class555.method3108(var5, 0));
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 77)
    public final void method812(byte arg0) {
        ++field4913;
        if (this.field4903) {
            OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field1635.method531() + -1280), (float) (super.field1635.method531() - 768), 1.0F / (float) super.field1635.method3611(50), (float) super.field1635.method3610(arg0 + 32) / 255.0F);
        }
        if (arg0 != -31) {
            this.method669((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZB)V", line = 92)
    public final void method671(boolean arg0, byte arg1) {
        this.field4912 = arg0;
        if (arg1 != 107) {
            this.method675(true, 49, -64);
        }
        ++field4895;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)V", line = 105)
    public final void method676(boolean arg0, int arg1) {
        ++field4909;
        if (arg1 > -65) {
            field4897 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Llh;Lgp;)V", line = 117)
    public class341(class125 arg0, class561 arg1) {
        super(arg0);
        if (!arg0.field2060) {
            this.field4904 = false;
        } else {
            this.field4907 = class491.method2804(arg0, arg1.method3193(-14855, "gl", "uw_ground_unlit"), 34336, -6876);
            this.field4901 = class491.method2804(arg0, arg1.method3193(-14855, "gl", "uw_ground_lit"), 34336, -6876);
            this.field4902 = class491.method2804(arg0, arg1.method3193(-14855, "gl", "uw_model_unlit"), 34336, -6876);
            this.field4896 = class491.method2804(arg0, arg1.method3193(-14855, "gl", "uw_model_lit"), 34336, -6876);
            this.field4904 = this.field4907 != null & this.field4901 != null & this.field4902 != null & this.field4896 != null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZII)V", line = 138)
    public final void method675(boolean arg0, int arg1, int arg2) {
        ++field4911;
        if (!arg0) {
            this.method676(true, -19);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Z", line = 156)
    public final boolean method673(int arg0) {
        if (arg0 != -1) {
            field4914 = -53;
        }
        ++field4898;
        return this.field4904;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILqv;)V", line = 168)
    public final void method672(int arg0, int arg1, class96 arg2) {
        ++field4906;
        if (arg0 == 0) {
            super.field1635.method3577(arg2, true);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILhn;IIIII)V", line = 181)
    public static final void method2089(int arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4910;
        class276.method1778(arg1.field5109, arg5, arg4, arg2, arg0, arg1.field5116, arg1.field5108, arg3, arg6, -256);
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V", line = 190)
    public static void method2090(int arg0) {
        field4897 = null;
        if (arg0 > -10) {
            method2089(24, (class85) null, 116, -43, -1, -84, 76);
        }
    }
}
