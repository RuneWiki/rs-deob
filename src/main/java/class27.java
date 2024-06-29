import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 extends class207 {

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "D")
    public static double field269;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method156(boolean arg0) {
        ++field273;
        class394.method2422(class125.field1721.field5144.method3724(43), -2);
        int var1 = (class435.field6273 >> 12) + (class120.field1625 >> 3);
        int var2 = (class223.field2892 >> 12) - -(class259.field3849 >> 3);
        class184.field2420 = class625.field8475.field2813 = 0;
        class625.field8475.method4163(8, (byte) 93, 8);
        byte var3 = 18;
        class550.field7592 = new int[var3];
        class542.field7496 = new int[var3];
        class754.field10206 = new byte[var3][];
        class92.field1289 = new int[var3][4];
        class361.field5245 = new byte[var3][];
        class238.field3158 = new int[var3];
        class168.field2216 = new byte[var3][];
        class649.field8753 = new int[var3];
        class639.field8603 = new int[var3];
        class328.field4651 = new byte[var3][];
        class294.field4168 = new byte[var3][];
        class592.field8095 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class102.field1467 >> 4)) / 8; ((class102.field1467 >> 4) + var1) / 8 >= var5; ++var5) {
            for (int var8 = (-(class393.field5663 >> 4) + var2) / 8; ~var8 >= ~((var2 - -(class393.field5663 >> 4)) / 8); ++var8) {
                int var9 = (var5 << 8) + var8;
                class649.field8753[var4] = var9;
                class592.field8095[var4] = class577.field7862.method1173(arg0, "m" + var5 + "_" + var8);
                class238.field3158[var4] = class577.field7862.method1173(false, "l" + var5 + "_" + var8);
                class550.field7592[var4] = class577.field7862.method1173(false, "n" + var5 + "_" + var8);
                class542.field7496[var4] = class577.field7862.method1173(false, "um" + var5 + "_" + var8);
                class639.field8603[var4] = class577.field7862.method1173(false, "ul" + var5 + "_" + var8);
                if (class550.field7592[var4] == -1) {
                    class592.field8095[var4] = -1;
                    class238.field3158[var4] = -1;
                    class542.field7496[var4] = -1;
                    class639.field8603[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; ~class550.field7592.length < ~var6; ++var6) {
            class550.field7592[var6] = -1;
            class592.field8095[var6] = -1;
            class238.field3158[var6] = -1;
            class542.field7496[var6] = -1;
            class639.field8603[var6] = -1;
        }
        byte var7;
        if (class780.field10712 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class775.method4264((byte) -87, var2, arg0, var1, var7);
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lrd;)V", line = 92)
    public class27(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(IB)I", line = 95)
    public final int method39(int arg0, byte arg1) {
        ++field266;
        if (arg1 != 69) {
            field269 = -0.7506695766845903D;
        }
        if (super.field2668.method2254(59)) {
            return 3;
        } else {
            return ~super.field2668.field5167.method1438(43) == -1 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I", line = 114)
    public final int method36(int arg0) {
        ++field265;
        return arg0 > -14 ? -22 : 2;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 125)
    public final void method37(int arg0) {
        int var2 = 23 / ((arg0 - -58) / 48);
        ++field268;
        if (super.field2668.method2254(117)) {
            super.field2669 = 0;
        }
        if (super.field2668.field5167.method1438(43) == 0) {
            super.field2669 = 0;
        }
        if (~super.field2669 > -1 || ~super.field2669 < -3) {
            super.field2669 = this.method36(-121);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)V", line = 144)
    public final void method41(int arg0, byte arg1) {
        ++field270;
        super.field2669 = arg0;
        if (arg1 >= -7) {
            method157(-47, -101, 103);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)V", line = 155)
    public static final void method157(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field269 = -0.9894869176803579D;
        }
        ++field271;
        class778 var3 = class389.method2406(-108, (long) arg0 << 32 | (long) arg2, 19);
        var3.method4276(0);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)Z", line = 168)
    public final boolean method158(byte arg0) {
        if (arg0 != 8) {
            return false;
        } else {
            ++field267;
            if (super.field2668.method2254(125)) {
                return false;
            } else {
                return super.field2668.field5167.method1438(43) != 0;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)I", line = 187)
    public final int method159(int arg0) {
        if (arg0 != 43) {
            field269 = -0.88687273822033D;
        }
        ++field272;
        return super.field2669;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(ILrd;)V", line = 199)
    public class27(int arg0, class355 arg1) {
        super(arg0, arg1);
    }
}
