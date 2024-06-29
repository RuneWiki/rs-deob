import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class232 implements class20 {

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "Ljn;")
    public class322 field3741;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "Lnha;")
    public class686 field3745;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/lang/String;")
    public String field3743;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)C")
    public static final char method1610(int arg0, byte arg1) {
        field3732++;
        if (arg0 != -21630) {
            method1612(-118);
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class173.field2952[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIB)I")
    public static final int method1611(int arg0, int arg1, int arg2, byte arg3) {
        field3735++;
        if (class211.field3511 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        int var5 = arg0 >> 9;
        if (var4 < 0 || var5 < 0 || (class191.field3229 - 1) < var4 || class314.field4720 - 1 < var5) {
            return 0;
        }
        int var6 = 122 / ((-arg3 - 32) / 54);
        int var7 = arg2;
        if (arg2 < 3 && (class434.field6341[1][var4][var5] & 0x2) != 0) {
            var7 = arg2 + 1;
        }
        return class211.field3511[var7].method2162(arg0, 1, arg1);
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    public static final void method1612(int arg0) {
        field3738++;
        if (arg0 != 0) {
            method1610(-40, (byte) -41);
        }
        if (!class658.field9364) {
            class393.field5872 += (-12.0F - class393.field5872) / 2.0F;
            class658.field9364 = true;
            class218.field3575 = true;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static final void method1613(byte arg0) {
        if (class731.field10266.toLowerCase().indexOf("microsoft") == -1) {
            if (class731.field10248 == null) {
                class496.field7190[222] = 59;
                class496.field7190[192] = 58;
            } else {
                class496.field7190[520] = 59;
                class496.field7190[192] = 28;
                class496.field7190[222] = 58;
            }
            class496.field7190[44] = 71;
            class496.field7190[45] = 26;
            class496.field7190[91] = 42;
            class496.field7190[61] = 27;
            class496.field7190[92] = 74;
            class496.field7190[47] = 73;
            class496.field7190[93] = 43;
            class496.field7190[59] = 57;
            class496.field7190[46] = 72;
        } else {
            class496.field7190[223] = 28;
            class496.field7190[220] = 74;
            class496.field7190[219] = 42;
            class496.field7190[187] = 27;
            class496.field7190[221] = 43;
            class496.field7190[189] = 26;
            class496.field7190[190] = 72;
            class496.field7190[222] = 59;
            class496.field7190[186] = 57;
            class496.field7190[192] = 58;
            class496.field7190[191] = 73;
            class496.field7190[188] = 71;
        }
        if (arg0 != -20) {
            method1610(-64, (byte) -34);
        }
        field3747++;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
    public static final void method1614(byte arg0) {
        class208.field3480.method2334(64);
        field3731++;
        class442.field6421 = 1;
        class140.field2198 = null;
        class259.field4052 = null;
        if (arg0 != -2) {
            method1612(76);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Lvj;")
    public final class26 method117(int arg0) {
        if (arg0 != 1) {
            this.field3733 = -23;
        }
        field3746++;
        return class701.field9906;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;Lnha;Ljn;IIIIIIIIII)V")
    public class232(String arg0, class686 arg1, class322 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field3739 = arg12;
        this.field3744 = arg8;
        this.field3730 = arg11;
        this.field3737 = arg10;
        this.field3729 = arg3;
        this.field3741 = arg2;
        this.field3733 = arg7;
        this.field3745 = arg1;
        this.field3734 = arg9;
        this.field3740 = arg4;
        this.field3743 = arg0;
        this.field3736 = arg6;
        this.field3728 = arg5;
    }
}
