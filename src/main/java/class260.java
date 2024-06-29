import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class260 implements class226 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lom;")
    private class344 field3811;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lti;")
    private class409 field3816;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Lom;")
    private class344 field3820;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3817 = -1;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lbca;")
    public static class615 field3819 = new class615(0, -1);

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "J")
    public static long field3821 = 20000000L;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3823 = 0;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lla;")
    private class421 field3813;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZ)V")
    public final void method1432(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field3816 = null;
        }
        field3814++;
        if (arg0) {
            int var3 = this.field3816.field5912.method2056(77, this.field3816.field5922, class575.field8355) + this.field3816.field5919;
            int var4 = this.field3816.field5915.method3156(class693.field9762, 4416, this.field3816.field5923) + this.field3816.field5925;
            this.field3813.method2554(this.field3816.field5909, var4, null, this.field3816.field5910, 103, this.field3816.field5913, this.field3816.field5923, this.field3816.field5921, null, null, this.field3816.field5920, this.field3816.field5922, 0, var3, this.field3816.field5911, 0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        if (arg0 == -10) {
            field3818++;
            class11 var2 = class492.method2951(this.field3816.field5914, this.field3820, (byte) -122);
            this.field3813 = class623.field9017.method160(var2, class279.method1840(this.field3811, this.field3816.field5914), true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1705(int arg0) {
        if (arg0 != 0) {
            method1705(-89);
        }
        field3819 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
    public final boolean method1398(byte arg0) {
        field3815++;
        boolean var2 = true;
        if (arg0 <= 112) {
            method1705(52);
        }
        if (!this.field3811.method2230((byte) 90, this.field3816.field5914)) {
            var2 = false;
        }
        if (!this.field3820.method2230((byte) -97, this.field3816.field5914)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIZIFBII)[[I")
    public static final int[][] method1706(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, byte arg6, int arg7, int arg8) {
        if (arg6 != -118) {
            method1705(-116);
        }
        field3812++;
        int[][] var9 = new int[arg4][arg2];
        class255 var10 = new class255();
        var10.field3783 = arg7;
        var10.field3779 = (int) (arg5 * 4096.0F);
        var10.field3772 = arg8;
        var10.field3784 = arg3;
        var10.field3788 = arg0;
        var10.method617(4095);
        class453.method2728(arg4, arg2, (byte) 109);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method1695(var11, var9[var11], false);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lom;Lom;Lti;)V")
    public class260(class344 arg0, class344 arg1, class409 arg2) {
        this.field3811 = arg0;
        this.field3816 = arg2;
        this.field3820 = arg1;
    }
}
