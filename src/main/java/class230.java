import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class230 extends class182 {

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Lkh;")
    public static class117 field4140 = class224.method1450((byte) 119, "blinken2:");

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Lkh;")
    private static class117 field4137 = class224.method1450((byte) -25, "Allocated memory");

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field4145 = 0;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field4146 = 0;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[I")
    public static int[] field4142 = new int[5];

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Lkh;")
    public static class117 field4132 = field4137;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    private int field4144;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "Lai;")
    public static class10 field4139;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Lkh;")
    public class117 field4138;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "Lpa;")
    public static class165 field4143;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static final void method1483(int arg0) {
        field4148++;
        class97.field1772.method503(arg0 + 32302);
        class3.field46.method410((byte) 71);
        class6.field95.method503(10);
        if (arg0 != -32292) {
            field4137 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLnc;)V")
    public final void method1484(byte arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method998(98);
            if (var3 == 0) {
                field4133++;
                if (arg0 > -88) {
                    method1488(6, 21);
                    return;
                }
                return;
            }
            this.method1487(var3, arg1, (byte) 19);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public static void method1485(int arg0) {
        if (arg0 != 23180) {
            method1485(104);
        }
        field4132 = null;
        field4139 = null;
        field4140 = null;
        field4143 = null;
        field4142 = null;
        field4137 = null;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Z")
    public final boolean method1486(int arg0) {
        field4147++;
        if (arg0 != 0) {
            field4140 = null;
        }
        return this.field4144 == 115;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILnc;B)V")
    private final void method1487(int arg0, class145 arg1, byte arg2) {
        field4141++;
        if (arg0 == 1) {
            this.field4144 = arg1.method998(arg2 ^ 0x6F);
        } else if (arg0 == 2) {
            this.field4135 = arg1.method1018(arg2 - 1068451619);
        } else if (arg0 == 5) {
            this.field4138 = arg1.method1038(87);
        }
        if (arg2 != 19) {
            field4143 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public static final void method1488(int arg0, int arg1) {
        field4136++;
        class248 var2 = (class248) class136.field2457.method460((long) arg0, 1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field4552.length; var3++) {
            var2.field4552[var3] = -1;
            var2.field4553[var3] = 0;
        }
        if (arg1 != -6) {
            field4132 = null;
        }
    }
}
