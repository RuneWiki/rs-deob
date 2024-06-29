import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class231 extends class117 {

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "[I")
    public static int[] field3497 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILgj;IIZI)V", line = 6)
    public static final void method1717(int arg0, int arg1, class333 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3496++;
        class150.method1063(0, arg2.field5165, arg3, arg2.field5137, -3666, arg1, arg0, arg6, arg4);
        if (!arg5) {
            method1718(-93);
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 21)
    public static void method1718(int arg0) {
        field3497 = null;
        if (arg0 > -19) {
            field3497 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lqf;", line = 31)
    public static final class359 method1719(int arg0, int arg1) {
        field3495++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class119.field1677[var2] == null || class119.field1677[var2][var3] == null) {
            boolean var4 = class256.method1887(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return arg1 < 45 ? (class359) null : class119.field1677[var2][var3];
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(II)V", line = 63)
    public class231(int arg0, int arg1) {
        this.field3494 = arg0;
        this.field3498 = arg1;
    }
}
