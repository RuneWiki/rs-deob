import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class199 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lve;")
    public static class255 field3422 = class87.method607(97, " (X");

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3427 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V", line = 16)
    public static final void method1428(boolean arg0, int arg1) {
        if (arg0) {
            if (class264.field4459 != -1) {
                class103.method794(class264.field4459, -1);
            }
            for (class155 var2 = (class155) class158.field2675.method288((byte) -42); var2 != null; var2 = (class155) class158.field2675.method289(108)) {
                class22.method120(true, var2, 92);
            }
            class264.field4459 = -1;
            class158.field2675 = new class47(8);
            class26.method142(-21223);
            class264.field4459 = class252.field4243;
            class155.method1141(-107, false);
            class282.method1994(-1);
            class229.method1592(-1, class264.field4459);
        }
        field3424++;
        int var3 = -16 % ((-arg1 - 76) / 38);
        class276.field4742 = new class242();
        class276.field4742.field5130 = 3000;
        class276.field4742.field5173 = 3000;
        if (!class281.field4827) {
            class148.method1100(1, class220.field3707);
            class256.method1798(-115, 10);
            return;
        }
        if (class3.field50 == 2) {
            class221.field3723 = class111.field1876 << 7;
            class256.field4373 = class47.field696 << 7;
        } else {
            class282.method1992((byte) -10);
        }
        class185.method1294(0);
        class249.method1715((byte) 95);
        class256.method1798(-109, 28);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I", line = 98)
    public static final int method1429(int arg0, byte arg1) {
        field3425++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 != 0) {
            method1429(-88, (byte) 65);
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 219)
    public static void method1430(int arg0) {
        field3422 = null;
        if (arg0 != 0) {
            field3422 = (class255) null;
        }
    }
}
