import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class72 {

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public static int field937 = 0;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "Lnq;")
    public static class310 field935;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "Lw;")
    public class451 field932;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "Lba;")
    public class629 field934;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 5)
    public static final void method426(int arg0) {
        field933++;
        class428 var1 = null;
        try {
            if (arg0 < 48) {
                return;
            }
            var1 = class112.method622(-15, "2");
            class138 var2 = new class138(class637.field8699 * 6 + 3);
            var2.method951((byte) -82, 1);
            var2.method915(class637.field8699, 1502242504);
            for (int var3 = 0; var3 < class85.field1042.length; var3++) {
                if (class521.field7223[var3]) {
                    var2.method915(var3, 1502242504);
                    var2.method906(-1, class85.field1042[var3]);
                }
            }
            var1.method2465(var2.field1712, 0, -20626, var2.field1745);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2467((byte) 106);
            }
        } catch (Exception var4) {
        }
        class125.field1607 = class669.method3713(0);
        class674.field9548 = false;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 53)
    public static void method427(int arg0) {
        if (arg0 != -2) {
            field935 = null;
        }
        field935 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 67)
    public static final void method428(String arg0, byte arg1, int arg2) {
        field936++;
        int var3 = class654.field9256;
        int[] var4 = class123.field1595;
        boolean var5 = false;
        if (arg1 > -64) {
            return;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class519 var7 = class292.field3912[var4[var6]];
            if (var7 != null && class596.field8164 != var7 && var7.field7191 != null && var7.field7191.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg2 == 1) {
                    class389.method2326((byte) 118, class5.field45);
                    class610.field8317++;
                    class253.field3491.method896(1464076016, var4[var6]);
                    class253.field3491.method920(0, false);
                } else if (arg2 == 4) {
                    class389.method2326((byte) 118, class679.field9656);
                    class155.field1926++;
                    class253.field3491.method915(var4[var6], 1502242504);
                    class253.field3491.method956((byte) 114, 0);
                } else if (arg2 == 5) {
                    class192.field2489++;
                    class389.method2326((byte) 118, class8.field68);
                    class253.field3491.method951((byte) -82, 0);
                    class253.field3491.method913(var4[var6], 116);
                } else if (arg2 == 6) {
                    class389.method2326((byte) 118, class63.field852);
                    class603.field8229++;
                    class253.field3491.method913(var4[var6], 109);
                    class253.field3491.method920(0, false);
                } else if (arg2 == 7) {
                    class389.method2326((byte) 118, class267.field3669);
                    class368.field5296++;
                    class253.field3491.method951((byte) -82, 0);
                    class253.field3491.method913(var4[var6], 105);
                }
                break;
            }
        }
        if (!var5) {
            class365.method2239(4, 19074, class243.field3232.method1491(class350.field5121, (byte) 126) + arg0);
        }
    }
}
