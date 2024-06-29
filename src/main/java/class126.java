import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class126 extends class389 {

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "Lki;")
    public static class364 field1630 = new class364();

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "Lwk;")
    public class227 field1632;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "[Lxa;")
    public static class511[] field1633;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "[Lxa;")
    public static class511[] field1635;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V")
    public static void method920(int arg0) {
        if (arg0 == 438104291) {
            field1633 = null;
            field1630 = null;
            field1635 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V")
    public static final void method921(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6895 != null) {
            var3.field6895 = null;
        }
        if (var3.field6893 != null) {
            var3.field6893 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)V")
    public static final void method922(boolean arg0) {
        field1628++;
        if (class302.method1772((byte) -30, class566.field7391) || class61.method517((byte) -41, class566.field7391)) {
            class229.method1439(class499.field6555 >> 12, 5000, 119, class549.field7132 >> 12);
        } else {
            int var1 = class233.field3130.field3030[0] >> 3;
            int var2 = class233.field3130.field3039[0] >> 3;
            if (var1 >= 0 && var1 < class611.field8258 >> 3 && var2 >= 0 && var2 < (class656.field9155 >> 3)) {
                class229.method1439(var1, 5000, -18, var2);
            } else {
                class229.method1439(class611.field8258 >> 4, 0, 125, class656.field9155 >> 4);
            }
        }
        if (!arg0) {
            method921(10, 23, 90);
        }
        class629.method3489(16711680);
        class445.method2523(42);
        class325.method1877((byte) 61);
        class611.method3312(9);
    }
}
