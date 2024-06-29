import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class8 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
    public static int[] field90 = new int[250];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lf;")
    public static class534 field88;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lqo;")
    public static class550 field85;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 10)
    public static void method49(int arg0) {
        field85 = null;
        field88 = null;
        field90 = null;
        if (arg0 != -19951) {
            field88 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLwp;I)V", line = 22)
    public static final void method50(boolean arg0, class452 arg1, int arg2) {
        field86++;
        int var3 = arg1.field6340 == 0 ? arg1.field6483 : arg1.field6340;
        int var4 = arg1.field6444 == 0 ? arg1.field6443 : arg1.field6444;
        class272.method1597(35, arg0, var3, var4, arg1.field6339, class102.field1106[arg1.field6339 >> 16]);
        if (arg1.field6399 != null) {
            class272.method1597(23, arg0, var3, var4, arg1.field6339, arg1.field6399);
        }
        if (arg2 != -17006) {
            method51(42, -123);
        }
        class633 var5 = (class633) class14.field117.method3669((long) arg1.field6339, -1);
        if (var5 != null) {
            class440.method2539(84, var5.field8920, arg0, var3, var4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V", line = 51)
    public static final void method51(int arg0, int arg1) {
        class453.field6485 = -1;
        if (arg1 == 37) {
            class482.field6941 = 3.0F;
        } else if (arg1 == 50) {
            class482.field6941 = 4.0F;
        } else if (arg1 == 75) {
            class482.field6941 = 6.0F;
        } else if (arg1 == 100) {
            class482.field6941 = 8.0F;
        } else if (arg1 == 200) {
            class482.field6941 = 16.0F;
        }
        field84++;
        class453.field6485 = -1;
        int var2 = 27 / ((-arg0 - 77) / 33);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 88)
    public static final void method52(byte arg0) {
        field83++;
        class142.field1572 = null;
        class453.method2614(class146.field1618, class338.field4244, class209.field2466, 99, 0, 0, 0, -1, 0);
        if (class142.field1572 != null) {
            class446.method2588(-128, class338.field4244, 0, class146.field1618, class142.field1572, class480.field6918.field6317, 0, -1412584499, class122.field1367, class674.field9377);
            class142.field1572 = null;
        }
        if (arg0 != 99) {
            method51(-10, -8);
        }
    }
}
