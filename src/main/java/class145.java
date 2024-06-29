import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class145 {

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "Lpq;")
    public static class159 field1844;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "[[[Laf;")
    public static class651[][][] field1841;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLoa;Lss;)I", line = 10)
    public static final int method987(boolean arg0, class689 arg1, class283 arg2) {
        field1842++;
        if (arg2.field3816 != -1) {
            return arg2.field3816;
        }
        if (arg2.field3824 != -1) {
            class568 var3 = arg1.field9731.method1728(-96, arg1.method1791() ? arg2.field3824 : arg2.field3825);
            if (!var3.field7857) {
                return var3.field7858;
            }
        }
        if (arg0) {
            method987(false, null, null);
        }
        return arg2.field3820;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 36)
    public static void method988(int arg0) {
        int var1 = -89 % ((arg0 - 67) / 55);
        field1844 = null;
        field1841 = null;
    }
}
