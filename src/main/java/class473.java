import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class473 extends class101 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lnd;")
    public static class366 field7233 = new class366(3, 16);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lig;")
    public static class154 field7232;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lap;")
    public static class319 field7234;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static final void method2847(byte arg0) {
        if (arg0 != 0) {
            return;
        }
        field7231++;
        int var1 = class463.field7116.method84(class30.field395, (byte) 90);
        if (var1 == 0) {
            class64.field1061 = null;
            class38.method208(0, 1);
        } else if (var1 == 1) {
            class338.method2091((byte) 0, 0);
            class38.method208(512, 1);
            if (class146.field2369 != null) {
                class448.method2682(0);
            }
        } else {
            class338.method2091((byte) (class338.field5055 - 4 & 0xFF), 0);
            class38.method208(2, 1);
        }
        class48.field743 = class362.field5339;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lqh;I)I")
    public static final int method2848(class47 arg0, int arg1) {
        if (arg1 != 0) {
            field7233 = null;
        }
        field7230++;
        int var2 = arg0.field698;
        class14 var3 = arg0.method892((byte) -110);
        if (arg0.field2196) {
            var2 = arg0.field689;
        } else if (arg0.field2201 == var3.field173 || arg0.field2201 == var3.field201 || arg0.field2201 == var3.field168 || arg0.field2201 == var3.field151) {
            var2 = arg0.field673;
        } else if (arg0.field2201 == var3.field190 || arg0.field2201 == var3.field169 || arg0.field2201 == var3.field187 || arg0.field2201 == var3.field172) {
            var2 = arg0.field692;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method2849(int arg0) {
        field7233 = null;
        field7232 = null;
        if (arg0 != -21891) {
            method2847((byte) -42);
        }
        field7234 = null;
    }
}
