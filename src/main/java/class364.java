import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class364 extends class266 {

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "Lmc;")
    private class120 field5193;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "Ldb;")
    private class292 field5195;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "Lch;")
    private class426 field5190;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "Lof;")
    public static class568 field5198 = new class568(7, 7);

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    public static int field5201 = 0;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "Lsu;")
    public static class192 field5199 = new class192();

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lmc;Lpj;Ldb;)V", line = 3)
    public class364(class120 arg0, class132 arg1, class292 arg2) {
        super(arg0);
        this.field5193 = arg0;
        this.field5195 = arg2;
        if (this.field5195.method1832(-91) && this.field5193.field1661) {
            this.field5190 = class571.method3147(34336, 65280, arg1.method937("transparent_water", "gl", 0), this.field5193);
        } else {
            this.field5190 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(IZ)V", line = 19)
    public final void method144(int arg0, boolean arg1) {
        super.field3785.method3193(class24.field325, client.field3838, 0);
        ++field5188;
        if (arg0 != 1) {
            field5200 = 3;
        }
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)Z", line = 31)
    public final boolean method154(int arg0) {
        ++field5196;
        if (arg0 < 101) {
            field5198 = null;
        }
        return this.field5190 != null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V", line = 43)
    public final void method156(int arg0, int arg1, int arg2) {
        ++field5192;
        if (!this.field5195.field4397) {
            int var4 = super.field3785.field8003 % 4000 * 16 / 4000;
            super.field3785.method3232(false, this.field5195.field4393[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field3785.field8003 % 4000) / 4000.0F;
            super.field3785.method3232(false, this.field5195.field4390);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        if (arg2 != 0) {
            this.method148(8, false);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZ)V", line = 70)
    public final void method148(int arg0, boolean arg1) {
        ++field5191;
        OpenGL.glBindProgramARB(34336, this.field5190.field5995);
        OpenGL.glEnable(34336);
        super.field3785.method3177(arg0, 85, class85.field1174);
    }

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "(I)V", line = 80)
    public static void method2132(int arg0) {
        field5199 = null;
        field5198 = null;
        if (arg0 >= -74) {
            field5202 = -60;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V", line = 92)
    public final void method155(boolean arg0) {
        ++field5194;
        super.field3785.method3177(0, 69, class558.field7530);
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0) {
            this.method154(-88);
        }
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lek;IB)V", line = 106)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        if (arg2 >= -56) {
            field5200 = 1;
        }
        ++field5189;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/String;ILta;Z)V", line = 127)
    public static final void method2133(String arg0, int arg1, class194 arg2, boolean arg3) {
        ++field5197;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class226.field3256.method3318(arg1 + 112, arg0, 250, (class461[]) null);
        int var8 = 13 * class226.field3256.method3320(arg0, 250, (class461[]) null, 0);
        class630.field8790.method472(-var4 + var5, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class630.field8790.method399(-var4 + var5, -var4 + var6, var7 - -var4 + var4, var4 + var4 + var8, -1, arg1);
        arg2.method1310(1, (class212) null, arg0, var8, (int[]) null, 0, 1, (byte) 95, var7, -1, 0, (class461[]) null, -1, var6, var5, 0);
        class568.method3135(var4 + var8 + var4, 91, -var4 + var5, var4 + var7 + var4, -var4 + var6);
        if (arg3) {
            try {
                class630.field8790.method365();
            } catch (class211 var9) {
            }
        }
    }
}
