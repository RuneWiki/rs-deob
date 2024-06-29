import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class124 extends class243 {

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "[Z")
    public static boolean[] field1625 = new boolean[8];

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "Ld;")
    public static class152 field1622;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)Lgga;")
    public static final class294 method797(int arg0) {
        if (arg0 != -3) {
            return null;
        } else {
            ++field1621;
            return class642.field8928;
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(III)I")
    public static final int method798(int arg0, int arg1, int arg2) {
        ++field1624;
        if (~arg1 == 0) {
            return 12345678;
        } else {
            int var3 = (arg1 & 127) * arg0 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            if (arg2 >= -73) {
                field1625 = null;
            }
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field1623;
        if (arg0 != 255) {
            field1625 = null;
        }
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int var4 = class685.field9613[arg1];
            for (int var5 = 0; ~var5 > ~class687.field9628; ++var5) {
                var3[var5] = this.method801(class666.field9279[var5], (byte) 3, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method799(boolean arg0) {
        field1625 = null;
        field1622 = null;
        if (arg0) {
            field1622 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Lvg;")
    public static final class54 method800(byte arg0, int arg1) {
        ++field1627;
        if (arg0 != -107) {
            return null;
        } else {
            class54[] var2 = class635.method3574((byte) 67);
            for (int var3 = 0; var3 < var2.length; ++var3) {
                class54 var4 = var2[var3];
                if (var4.field552 == arg1) {
                    return var4;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI)I")
    private final int method801(int arg0, byte arg1, int arg2) {
        ++field1626;
        int var4 = arg2 * 57 + arg0;
        if (arg1 != 3) {
            method798(-5, 93, 26);
        }
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * var5 * 15731 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }
}
