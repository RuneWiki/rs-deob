import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class220 extends class187 {

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[B")
    public byte[] field3494;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3498 = "Continue";

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field3496 = -1;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Leg;")
    public static class188 field3493 = new class188(64);

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field3502 = 0;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Ln;")
    public static class178 field3501;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IJ)V", line = 5)
    public static final void method1466(int arg0, long arg1) {
        field3499++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = arg0; var3 < class116.field1795; var3++) {
            if (class81.field1205[var3] == arg1) {
                class228.field3653++;
                class116.field1795--;
                for (int var4 = var3; var4 < class116.field1795; var4++) {
                    class120.field1851[var4] = class120.field1851[var4 + 1];
                    class95.field1455[var4] = class95.field1455[var4 + 1];
                    class30.field373[var4] = class30.field373[var4 + 1];
                    class81.field1205[var4] = class81.field1205[var4 + 1];
                    class229.field3673[var4] = class229.field3673[var4 + 1];
                    class291.field4454[var4] = class291.field4454[var4 + 1];
                }
                class315.field4968 = class71.field1068;
                class265.field4095.method2064(255, 46);
                class265.field4095.method2023(arg1, -21);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "([B)V", line = 55)
    public class220(byte[] arg0) {
        this.field3494 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 64)
    public static void method1467(int arg0) {
        field3493 = null;
        if (arg0 == 0) {
            field3498 = null;
            field3501 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILwe;Ljava/lang/Object;)V", line = 76)
    public static final void method1468(int arg0, class224 arg1, Object arg2) {
        field3495++;
        if (arg1.field3568 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field3568.peekEvent() != null; var3++) {
            class96.method657(1L, (byte) -115);
        }
        if (arg0 != 1001) {
            method1466(-25, -90L);
        }
        if (arg2 != null) {
            arg1.field3568.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILgn;)Lqk;", line = 123)
    public static final class264 method1469(int arg0, class303 arg1) {
        field3497++;
        if (arg0 != 32239) {
            method1469(-39, (class303) null);
        }
        class264 var2 = new class264();
        var2.field4070 = arg1.method1994(false);
        var2.field4072 = class188.method1288(var2.field4070, (byte) 104);
        return var2;
    }
}
