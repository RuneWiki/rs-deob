import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class124 {

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Z")
    public static boolean field1676 = false;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[I")
    public static int[] field1672 = new int[2];

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1680 = "";

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "F")
    public static float field1674 = 128.0F;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "C")
    public static char field1673;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lcg;B)Lwn;", line = 6)
    public static final class278 method892(class316 arg0, byte arg1) {
        field1679++;
        return arg1 == 14 ? new class278(arg0.method2161(28984), arg0.method2161(arg1 + 28970), arg0.method2161(28984), arg0.method2161(arg1 ^ 0x7136), arg0.method2161(28984), arg0.method2161(28984), arg0.method2161(28984), arg0.method2161(28984), arg0.method2210((byte) -5), arg0.method2219(16448)) : (class278) null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 19)
    public static void method893(int arg0) {
        if (arg0 < 26) {
            method893(-54);
        }
        field1680 = null;
        field1672 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 128) {
            field1673 = (char) 65469;
        }
        field1671++;
        class143 var5 = class163.method1176((byte) 89, arg4, 8);
        var5.method1032((byte) 127);
        var5.field1958 = arg1;
        var5.field1963 = arg3;
        var5.field1965 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V", line = 55)
    public static final void method895(int arg0, int arg1) {
        class8.field84.method720(arg1, 1088);
        if (arg0 == 8) {
            field1678++;
        }
    }
}
