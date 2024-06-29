import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class268 extends class321 {

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Lkca;")
    public static class73 field3763 = new class73(42, 11);

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "[I")
    public static int[] field3765 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Z")
    public static boolean field3767 = true;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "J")
    public static long field3768;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lkea;")
    public static class203 field3766;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field3763 = null;
        if (arg0 == -16543) {
            field3765 = null;
            field3766 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    public static final void method1753(int arg0, int arg1) {
        ++field3762;
        if (arg0 >= -96) {
            field3768 = -89L;
        }
        if (class227.method1477(arg1, -1)) {
            class620.method3565(-1, class297.field4403[arg1], 2961);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIF)V")
    public class268(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
    public static final void method1754(int arg0) {
        class87.field993 = arg0;
        for (int var1 = 0; var1 < class588.field8441; ++var1) {
            for (int var2 = 0; var2 < class91.field1047; ++var2) {
                if (class431.field6408[arg0][var1][var2] == null) {
                    class431.field6408[arg0][var1][var2] = new class99(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIII)V")
    public final void method1755(boolean arg0, int arg1, int arg2, int arg3) {
        super.field4640 = arg1;
        if (!arg0) {
            method1752(83);
        }
        super.field4646 = arg3;
        ++field3761;
        super.field4638 = arg2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(FI)V")
    public final void method1756(float arg0, int arg1) {
        if (arg1 != 99999) {
            field3768 = -19L;
        }
        ++field3764;
        super.field4643 = arg0;
    }
}
