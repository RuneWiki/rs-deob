import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class75 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[Lja;")
    public static class72[] field1227 = new class72[6];

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1231 = 0;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[I")
    public static int[] field1230 = new int[25];

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V", line = 9)
    public static void method698(boolean arg0) {
        if (arg0) {
            field1227 = null;
            field1230 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 29)
    public static final void method699(int arg0) {
        int var1 = -27 / ((-arg0 - 35) / 33);
        field1233++;
        if (!class56.method499(-109) && class321.field5086 != class205.field3497) {
            class318.method2191(class218.field3632.field1975[0], false, class181.field3047, class218.field3632.field2034[0], class144.field2626, (byte) -128, class205.field3497, false);
        } else if (class68.field1123 != class205.field3497 && class176.method1362(class205.field3497, (byte) -54)) {
            class68.field1123 = class205.field3497;
            class126.method1049(4892);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILuk;IJIIII)Z", line = 60)
    public static final boolean method700(int arg0, int arg1, int arg2, int arg3, class104 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class258.method1791(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
