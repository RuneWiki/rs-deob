import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class301 {

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "F")
    public static float field4539 = 0.0F;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method1935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4540++;
        if (arg1 != 3553) {
            field4539 = -1.079072F;
        }
        for (int var6 = arg2; var6 <= arg3; var6++) {
            class503.method3027(arg0, (byte) 127, arg4, arg5, class316.field4797[var6]);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1936(int arg0) {
        if (arg0 == 34037) {
            field4536++;
            class90.method817();
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lpb;BI)V", line = 41)
    public static final void method1937(class469 arg0, byte arg1, int arg2) {
        if (class174.field2830) {
            class174.field2830 = false;
            arg2 = 0;
        }
        field4538++;
        if (arg1 != -58 || class260.field3970 != null && class260.field3970.method2804(arg0, arg1 ^ 0xFFFF8ECE)) {
            return;
        }
        class260.field3970 = arg0;
        class25.field375 = class423.method2578(-19698);
        class389.field5851 = arg2;
        class473.field7023 = arg2;
        if (class473.field7023 == 0) {
            class100.method891(97);
            return;
        }
        class265.field4037 = class175.field2855;
        class459.field6823 = class461.field6861;
        class1.field42 = class390.field5856;
        class470.field6979 = class498.field7316;
        class87.field1785 = class329.field4996;
        class484.field7128 = class91.field1818;
        class308.field4676 = class296.field4491;
        class296.field4498 = class439.field6519;
        class271.field4115 = class362.field5295;
        class236.field3630 = class151.field2494;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILda;IZ[BI)Lal;", line = 83)
    public static final class67 method1938(int arg0, int arg1, int arg2, class44 arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        if (arg0 > -78) {
            return null;
        }
        field4537++;
        if (!arg3.field878 && (!class388.method2381(arg1, 90) || !class388.method2381(arg7, 117))) {
            return arg3.field898 ? new class67(arg3, 34037, arg2, arg1, arg7, arg5, arg6, arg4) : new class67(arg3, arg2, arg1, arg7, class184.method1256(arg1, (byte) 101), class184.method1256(arg7, (byte) 96), arg6, arg4);
        } else {
            return new class67(arg3, 3553, arg2, arg1, arg7, arg5, arg6, arg4);
        }
    }
}
