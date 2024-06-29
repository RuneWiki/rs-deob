import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class305 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lth;")
    public static class57 field4886;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lwf;I)Lwf;", line = 5)
    public static final class250 method2174(class250 arg0, int arg1) {
        field4890++;
        class250 var2 = client.method344(arg0);
        if (var2 == null) {
            var2 = arg0.field4077;
        }
        return arg1 == 1 ? var2 : (class250) null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 31)
    public static void method2175(byte arg0) {
        if (arg0 != -3) {
            field4886 = (class57) null;
        }
        field4886 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lug;I)V", line = 44)
    public static final void method2176(class220 arg0, int arg1) {
        if (class332.field5261 == arg0.field3479 || arg0.field3547 == -1 || arg0.field3559 != 0 || (arg0.field3558 + 1) > class198.method1524(arg0.field3547, 100).field651[arg0.field3517]) {
            int var2 = arg0.field3479 - arg0.field3515;
            int var3 = class332.field5261 - arg0.field3515;
            int var4 = arg0.field3563 * 128 + (arg0.method1634(-1) * 64);
            int var5 = arg0.field3530 * 128 + (arg0.method1634(-1) * 64);
            int var6 = arg0.field3495 * 128 + arg0.method1634(-1) * 64;
            int var7 = arg0.field3524 * 128 + arg0.method1634(-1) * 64;
            arg0.field3577 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field3511 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        field4887++;
        arg0.field3573 = 0;
        if (arg0.field3569 == 0) {
            arg0.field3549 = 1024;
        }
        if (arg0.field3569 == 1) {
            arg0.field3549 = 1536;
        }
        if (arg0.field3569 == 2) {
            arg0.field3549 = 0;
        }
        if (arg0.field3569 == 3) {
            arg0.field3549 = 512;
        }
        int var8 = 60 / ((-arg1 - 24) / 50);
        arg0.field3477 = arg0.field3549;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 91)
    public static final void method2177(String arg0, int arg1, int arg2) {
        field4889++;
        int var3 = 100 % ((57 - arg2) / 43);
        class321 var4 = class46.method370(2, (byte) -106, arg1);
        var4.method2265(false);
        var4.field5099 = arg0;
    }
}
