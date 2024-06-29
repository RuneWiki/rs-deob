import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class218 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lsb;")
    public static class98 field3758 = class47.method368("::qa_op_test", 0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lsb;")
    public static class98 field3752 = class47.method368("sl_stars", 0);

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lsb;")
    private static class98 field3760 = class47.method368("cyan:", 0);

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lsb;")
    public static class98 field3759 = field3760;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Lsb;")
    public static class98 field3756 = field3760;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lac;")
    public static class188 field3757;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lhj;ILhj;)V")
    public static final void method1501(class202 arg0, int arg1, class202 arg2) {
        field3754++;
        if (arg0.field3449 != null) {
            arg0.method1368((byte) 3);
        }
        arg0.field3449 = arg2;
        if (arg1 != -789221) {
            method1505(108, false, -48, -104, 104, false, 117);
        }
        arg0.field3455 = arg2.field3455;
        arg0.field3449.field3455 = arg0;
        arg0.field3455.field3449 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)I")
    public static final int method1502(int arg0, int arg1, int arg2) {
        field3763++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (arg1 * var4 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method1503(byte arg0) {
        class211.field3614.method1565(-1);
        class156.field2843.method1565(-1);
        class121.field2230.method1565(-1);
        field3753++;
        if (arg0 > -47) {
            field3758 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method1504(int arg0) {
        field3757 = null;
        int var1 = 6 % ((11 - arg0) / 63);
        field3756 = null;
        field3759 = null;
        field3752 = null;
        field3760 = null;
        field3758 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZIIIZI)V")
    public static final void method1505(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3762++;
        class90.field1582 = arg6;
        class232.field3987 = arg4;
        class13.field249 = arg2;
        if (arg5) {
            return;
        }
        class8.field133 = arg3;
        class254.field4443 = arg0;
        if (arg1 && class254.field4443 >= 100) {
            class6.field86 = class8.field133 * 128 + 64;
            class20.field361 = class90.field1582 * 128 + 64;
            class122.field2239 = class70.method480(class265.field4640, (byte) 126, class6.field86, class20.field361) - class13.field249;
        }
        class207.field3549 = 2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZIZI)Lac;")
    public static final class188 method1506(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 < 116) {
            method1505(-17, true, 51, -51, 2, false, 66);
        }
        field3761++;
        class171 var5 = null;
        if (class207.field3537 != null) {
            var5 = new class171(arg4, class207.field3537, class51.field833[arg4], 1000000);
        }
        return new class188(var5, class264.field4624, arg4, arg1, arg3, arg0);
    }
}
