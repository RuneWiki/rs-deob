import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class168 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lud;")
    public static class35 field2473;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field2469;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1244(boolean arg0) {
        field2471++;
        int var1 = 0;
        if (!arg0) {
            method1244(true);
        }
        while (class435.field6078.length > var1) {
            for (int var2 = 0; var2 < class435.field6078[0].length; var2++) {
                for (int var3 = 0; var3 < class435.field6078[0][0].length; var3++) {
                    class435.field6078[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 47)
    public static void method1245(byte arg0) {
        field2469 = null;
        if (arg0 == -60) {
            field2473 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([IB[J)V", line = 58)
    public static final void method1246(int[] arg0, byte arg1, long[] arg2) {
        field2472++;
        if (arg1 >= -29) {
            method1244(false);
        }
        class118.method952(0, arg2.length - 1, (byte) -89, arg2, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z", line = 69)
    public static final boolean method1247(int arg0) {
        field2470++;
        boolean var1 = true;
        if (class701.field9850 == null) {
            if (class501.field7161.method1472(-25711, class429.field6000)) {
                class701.field9850 = class55.method496(class501.field7161, class429.field6000);
            } else {
                var1 = false;
            }
        }
        if (class684.field9642 == null) {
            if (class501.field7161.method1472(-25711, class109.field1781)) {
                class684.field9642 = class55.method496(class501.field7161, class109.field1781);
            } else {
                var1 = false;
            }
        }
        if (class389.field5437 == null) {
            if (class501.field7161.method1472(-25711, class634.field9080)) {
                class389.field5437 = class55.method496(class501.field7161, class634.field9080);
            } else {
                var1 = false;
            }
        }
        if (class224.field3207 == null) {
            if (class722.field10091.method1472(-25711, class49.field702)) {
                class224.field3207 = class251.method1709(class722.field10091, 1, class49.field702);
            } else {
                var1 = false;
            }
        }
        if (class128.field1938 == null) {
            if (class501.field7161.method1472(-25711, class49.field702)) {
                class128.field1938 = class55.method505(class501.field7161, class49.field702);
            } else {
                var1 = false;
            }
        }
        int var2 = 96 / ((-arg0 - 19) / 41);
        return var1;
    }
}
