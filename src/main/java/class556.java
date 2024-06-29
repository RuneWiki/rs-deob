import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class556 extends Exception {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Len;")
    public static class107 field7918;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Lpp;")
    public static class83 field7917;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILuw;Luw;)V")
    public static final void method3239(int arg0, int arg1, int arg2, class194 arg3, class194 arg4) {
        class114 var5 = class378.method2384(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field1762 = arg3;
        var5.field1764 = arg4;
        int var6 = class211.field3511 == class152.field2374 ? 1 : 0;
        if (!arg3.method95(0)) {
            arg3.field9472 = class24.field240[var6];
            class24.field240[var6] = arg3;
        } else if (arg3.method86(0)) {
            arg3.field9472 = class231.field3722[var6];
            class231.field3722[var6] = arg3;
        } else {
            arg3.field9472 = class335.field4904[var6];
            class335.field4904[var6] = arg3;
            class245.field3947 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method95(0)) {
            if (arg4.method86(0)) {
                arg4.field9472 = class231.field3722[var6];
                class231.field3722[var6] = arg4;
                return;
            }
            arg4.field9472 = class335.field4904[var6];
            class335.field4904[var6] = arg4;
            class245.field3947 = true;
            return;
        }
        arg4.field9472 = class24.field240[var6];
        class24.field240[var6] = arg4;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Z")
    public static final boolean method3240(int arg0, int arg1) {
        field7920++;
        if (arg0 != 65532) {
            method3241(2, null, -46, (byte) -37);
        }
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILraa;IB)V")
    public static final void method3241(int arg0, class353 arg1, int arg2, byte arg3) {
        if (arg3 >= -16) {
            field7918 = null;
        }
        field7919++;
        class570 var4 = arg1.method2262(class364.field5573, -77);
        if (var4 == null) {
            return;
        }
        class364.field5573.method240(arg2, arg0, arg1.field5230 + arg2, arg1.field5280 + arg0);
        if (class129.field2118 >= 3) {
            class364.field5573.method287(-16777216, var4, arg2, arg0);
        } else {
            class548.field7818.method192((float) arg1.field5230 / 2.0F + (float) arg2, (float) arg1.field5280 / 2.0F + (float) arg0, 4096, (int) (-class261.field4064) & 0x3FFF << 2, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public static void method3242(byte arg0) {
        field7917 = null;
        field7918 = null;
        if (arg0 >= -117) {
            field7918 = null;
        }
    }
}
