import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class299 extends class468 {

    @OriginalMember(owner = "client!pb", name = "zb", descriptor = "Luv;")
    public static class2 field4439 = new class2(17, 3);

    @OriginalMember(owner = "client!pb", name = "Ab", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!pb", name = "Bb", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!pb", name = "Cb", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!pb", name = "Db", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!pb", name = "Eb", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!pb", name = "Fb", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BF)V", line = 9)
    public final void method1854(byte arg0, float arg1) {
        ++field4443;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field6868[super.field6830++] = (byte) var3;
        super.field6868[super.field6830++] = (byte) (var3 >> 8);
        if (arg0 != -80) {
            method1859(-115);
        }
        super.field6868[super.field6830++] = (byte) (var3 >> 16);
        super.field6868[super.field6830++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(II)Ltq;", line = 25)
    public static final class68 method1855(int arg0, int arg1) {
        ++field4440;
        class68 var2 = (class68) class195.field2877.method1781((long) arg1, 24);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 >= -20) {
                method1859(-90);
            }
            byte[] var3 = class166.field2469.method541(0, arg1, (byte) -122);
            if (var3 != null && ~var3.length < -2) {
                class68 var4 = class420.method2503(var3, (byte) 107);
                class195.field2877.method1780(var4, -20892, (long) arg1);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V", line = 49)
    public class299(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(FI)V", line = 54)
    public final void method1856(float arg0, int arg1) {
        ++field4442;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field6868[super.field6830++] = (byte) (var3 >> 24);
        super.field6868[super.field6830++] = (byte) (var3 >> 16);
        super.field6868[super.field6830++] = (byte) (var3 >> 8);
        if (arg1 != 191) {
            method1857(73, 1, 19, (class249) null, (class127) null, -37, (class310) null, 94);
        }
        super.field6868[super.field6830++] = (byte) var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILma;Ll;ILgo;I)V", line = 74)
    public static final void method1857(int arg0, int arg1, int arg2, class249 arg3, class127 arg4, int arg5, class310 arg6, int arg7) {
        ++field4441;
        if (arg4 != null) {
            int var8;
            if (~class350.field5388 != -5) {
                var8 = (int) class311.field4836 + class469.field6881 & 16383;
            } else {
                var8 = (int) class311.field4836 & 16383;
            }
            int var9 = -64 % ((arg1 - -16) / 58);
            int var10 = 10 + Math.max(arg6.field4661 / 2, arg6.field4736 / 2);
            int var11 = arg2 * arg2 + arg7 * arg7;
            if (~(var10 * var10) <= ~var11) {
                int var12 = class445.field6545[var8];
                int var13 = class445.field6544[var8];
                if (~class350.field5388 != -5) {
                    var12 = var12 * 256 / (class230.field3230 - -256);
                    var13 = var13 * 256 / (class230.field3230 + 256);
                }
                int var14 = arg7 * var12 - -(arg2 * var13) >> 15;
                int var15 = arg7 * var13 + -(arg2 * var12) >> 15;
                arg4.method294(arg6.field4661 / 2 + arg5 + var14 + -(arg4.method468() / 2), -var15 + arg6.field4736 / 2 + arg0 + -(arg4.method467() / 2), arg3, arg5, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILgo;IZ)V", line = 118)
    public static final void method1858(int arg0, class310 arg1, int arg2, boolean arg3) {
        if (arg3) {
            field4439 = null;
        }
        class300.field4450 = arg0;
        ++field4445;
        class84.field1339 = arg1;
        class487.field7252 = arg2;
    }

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "(I)V", line = 132)
    public static final void method1859(int arg0) {
        if (class109.field1628.toLowerCase().indexOf("microsoft") != -1) {
            class55.field744[188] = 71;
            class55.field744[223] = 28;
            class55.field744[219] = 42;
            class55.field744[191] = 73;
            class55.field744[187] = 27;
            class55.field744[192] = 58;
            class55.field744[190] = 72;
            class55.field744[186] = 57;
            class55.field744[221] = 43;
            class55.field744[189] = 26;
            class55.field744[220] = 74;
            class55.field744[222] = 59;
        } else {
            class55.field744[92] = 74;
            class55.field744[45] = 26;
            class55.field744[61] = 27;
            class55.field744[91] = 42;
            class55.field744[46] = 72;
            class55.field744[59] = 57;
            class55.field744[44] = 71;
            class55.field744[47] = 73;
            if (class109.field1631 == null) {
                class55.field744[192] = 58;
                class55.field744[222] = 59;
            } else {
                class55.field744[222] = 58;
                class55.field744[520] = 59;
                class55.field744[192] = 28;
            }
            class55.field744[93] = 43;
        }
        ++field4444;
        if (arg0 >= -75) {
            method1860(-19);
        }
    }

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "(I)V", line = 182)
    public static void method1860(int arg0) {
        if (arg0 != 31348) {
            method1858(-115, (class310) null, -15, true);
        }
        field4439 = null;
    }
}
