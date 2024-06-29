import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class293 extends class431 {

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lak;")
    public static class234 field4451 = new class234("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Lgu;")
    public static class412 field4455 = new class412(16);

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lul;")
    public static class406 field4448;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1906(int arg0, int arg1, int arg2) {
        field4450++;
        if (arg1 != 16152) {
            method1907(-11, true);
        }
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V", line = 14)
    public static final void method1907(int arg0, boolean arg1) {
        class92.method746(arg0 ^ 0x3A6B208C);
        field4449++;
        if (!class378.method2378(9, class429.field6373)) {
            return;
        }
        class345.field5101++;
        if (class345.field5101 < 50 && !arg1) {
            return;
        }
        class345.field5101 = arg0;
        if (!class191.field3222 && class162.field2413 != null) {
            class74.method640(arg0 - 29627, class186.field2822);
            class498.field7161++;
            try {
                class162.field2413.method1969(class71.field1020.field3572, 0, (byte) 1, class71.field1020.field3556);
                class71.field1020.field3556 = 0;
            } catch (IOException var2) {
                class191.field3222 = true;
            }
        }
        class92.method746(arg0 + 980099212);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 46)
    public static void method1908(byte arg0) {
        field4455 = null;
        field4451 = null;
        if (arg0 != -107) {
            method1906(-21, -20, 29);
        }
        field4448 = null;
    }
}
