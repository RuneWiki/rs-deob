import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class300 extends class424 {

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field4096 = 204;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    private int field4101 = 1;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    private int field4098 = 1;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "[I")
    public static int[] field4099 = new int[32];

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "Lhc;")
    public static class368 field4103 = new class368("wave2:", "", "", "");

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "S")
    public static short field4104 = 32767;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "Lij;")
    public static class316 field4102;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "Lwn;")
    public static class77 field4105;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
    public static final void method1825(int arg0, int arg1) {
        ++field4095;
        if (~class356.field4780 != ~arg0) {
            if (arg1 != -1) {
                method1826((byte) -96, (String) null);
            }
            class11.field107 = class264.field3620 = class53.field677[arg0];
            class354.field4765.method238(50, (int) ((double) class11.field107 * 34.46D));
            class177.field2515 = new int[class11.field107][class264.field3620];
            class49.field629 = new int[class11.field107][class264.field3620];
            class22.field274 = new int[4][class11.field107 >> 3][class264.field3620 >> 3];
            for (int var2 = 0; var2 < 4; ++var2) {
                class403.field5567[var2] = client.method1639(class11.field107, 1, class264.field3620);
            }
            class237.field3379 = new byte[4][class11.field107][class264.field3620];
            class266.method1698(class11.field107, class264.field3620, arg1 + 80, 4);
            class227.method1485(class264.field3620 >> 3, class11.field107 >> 3, class354.field4765, (byte) 73);
            class356.field4780 = arg0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1826(byte arg0, String arg1) {
        ++field4093;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class353.field4751; ++var2) {
                if (arg1.equalsIgnoreCase(class196.field2851[var2])) {
                    return true;
                }
            }
            if (arg0 != -121) {
                field4104 = -42;
            }
            return arg1.equalsIgnoreCase(class359.field4970.field5869);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZLij;IB)V")
    public static final void method1827(int arg0, int arg1, boolean arg2, class316 arg3, int arg4, byte arg5) {
        class10.field78 = 1;
        class82.field1136 = arg3;
        class277.field3784 = 10000;
        if (arg5 == -74) {
            class448.field6350 = arg2;
            class346.field4682 = arg0;
            class380.field5248 = arg4;
            class451.field6495 = arg1;
            ++field4097;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field4100;
        if (arg1 != -10) {
            field4104 = 83;
        }
        int[] var3 = super.field5892.method783(arg0, (byte) 98);
        if (super.field5892.field1427) {
            for (int var4 = 0; ~var4 > ~class303.field4135; ++var4) {
                int var5 = class332.field4478[var4];
                int var6 = class409.field5711[arg0];
                int var7 = this.field4098 * var5 >> 12;
                int var8 = this.field4101 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4098) * this.field4098;
                int var10 = var6 % (4096 / this.field4101) * this.field4101;
                if (~var10 > ~this.field4096) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4096 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field4096) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4096 = arg0.method2297(13352);
                }
            } else {
                this.field4101 = arg0.method2306((byte) 30);
            }
        } else {
            this.field4098 = arg0.method2306((byte) 34);
        }
        if (arg1 != -48) {
            this.field4096 = 53;
        }
        ++field4094;
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V")
    public static void method1828(int arg0) {
        field4102 = null;
        field4099 = null;
        if (arg0 != 4) {
            method1828(-82);
        }
        field4103 = null;
        field4105 = null;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
    public class300() {
        super(0, true);
    }
}
