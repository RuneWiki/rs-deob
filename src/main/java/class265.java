import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class265 extends class176 {

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[B")
    public byte[] field3699;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field3692 = 50;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public static int[] field3697 = new int[field3692];

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
    public static int[] field3696 = new int[field3692];

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
    public static int[] field3695 = new int[field3692];

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3694 = new String[field3692];

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
    public static int[] field3700 = new int[field3692];

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field3701 = 2;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[I")
    public static int[] field3702 = new int[field3692];

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[I")
    public static int[] field3693 = new int[field3692];

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        if (arg0 <= 29) {
            return;
        }
        field3697 = null;
        field3693 = null;
        field3700 = null;
        field3695 = null;
        field3694 = null;
        field3702 = null;
        field3696 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII)I")
    public static final int method1738(boolean arg0, int arg1, int arg2) {
        field3698++;
        int var3 = class387.method2266(arg1 - 1, true, arg2 - 1) + class387.method2266(arg1 - 1, true, arg2 + 1) + class387.method2266(arg1 - -1, arg0, arg2 + -1) + class387.method2266(arg1 - -1, true, arg2 + 1);
        int var4 = class387.method2266(arg1, true, arg2 - 1) + class387.method2266(arg1, true, arg2 + 1) + class387.method2266(arg1 + -1, true, arg2) + class387.method2266(arg1 - -1, true, arg2);
        int var5 = class387.method2266(arg1, arg0, arg2);
        return var3 / 16 + var4 / 8 + (var5 / 4);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    public class265(byte[] arg0) {
        this.field3699 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Lwe;")
    public static final class344 method1739(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8985;
    }
}
