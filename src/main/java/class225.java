import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class225 extends class151 {

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public int field3769 = 0;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "[Llm;")
    public class43[] field3765 = new class43[5];

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "[I")
    public int[] field3768 = new int[5];

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field3751 = 0;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "Lbd;")
    private static class162 field3757 = class17.method142(0, "Started 3d Library");

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Lbd;")
    public static class162 field3750 = field3757;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "Llk;")
    public class138 field3775;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "Lph;")
    public class147 field3763;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "Lhc;")
    public class164 field3771;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Lf;")
    public class184 field3755;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Lnm;")
    public class225 field3761;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Lab;")
    public class273 field3753;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "Lhl;")
    public class80 field3766;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "Z")
    public boolean field3760;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "Z")
    public boolean field3762;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "Z")
    public boolean field3772;

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(III)V", line = 11)
    public class225(int arg0, int arg1, int arg2) {
        this.field3759 = arg1;
        this.field3758 = this.field3773 = arg0;
        this.field3764 = arg2;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(Z)V", line = 36)
    public static void method1626(boolean arg0) {
        if (arg0) {
            method1626(true);
        }
        field3757 = null;
        field3750 = null;
    }
}
