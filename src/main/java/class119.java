import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class119 extends class354 {

    @OriginalMember(owner = "client!cw", name = "N", descriptor = "Lao;")
    public static class188 field1875 = new class188(27, 18);

    @OriginalMember(owner = "client!cw", name = "O", descriptor = "I")
    public static int field1876 = 2;

    @OriginalMember(owner = "client!cw", name = "I", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!cw", name = "J", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!cw", name = "K", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!cw", name = "L", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!cw", name = "M", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!cw", name = "P", descriptor = "Lhh;")
    public static class84 field1877;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field1874;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int var4 = class278.field4009[arg0];
            for (int var5 = 0; ~var5 > ~class404.field5952; ++var5) {
                var3[var5] = this.method866(class154.field2358[var5], (byte) 122, var4) % 4096;
            }
        }
        if (arg1 != -95) {
            field1875 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
    public class119() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(IBI)I")
    private final int method866(int arg0, byte arg1, int arg2) {
        ++field1870;
        int var4 = arg2 * 57 + arg0;
        if (arg1 <= 109) {
            method867(-13, (class13) null, 75, (byte) 123);
        }
        int var5 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILkh;IB)V")
    public static final void method867(int arg0, class13 arg1, int arg2, byte arg3) {
        ++field1872;
        if (~arg1.field320 == ~arg2 && ~arg2 != 0) {
            class357 var4 = class311.field4455.method1233(true, arg2);
            int var5 = var4.field5404;
            if (var5 == 1) {
                arg1.field383 = 0;
                arg1.field348 = 1;
                arg1.field307 = 0;
                arg1.field345 = arg0;
                arg1.field322 = 0;
                class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field322, var4, false, arg1.field5529);
            }
            if (~var5 == -3) {
                arg1.field307 = 0;
            }
        } else if (~arg2 == 0 || ~arg1.field320 == 0 || class311.field4455.method1233(true, arg2).field5389 >= class311.field4455.method1233(true, arg1.field320).field5389) {
            arg1.field348 = 1;
            arg1.field322 = 0;
            arg1.field307 = 0;
            arg1.field383 = 0;
            arg1.field320 = arg2;
            arg1.field411 = arg1.field412;
            arg1.field345 = arg0;
            if (arg1.field320 != -1) {
                class435.method2635(arg1.field5538, 232, arg1.field5539, arg1.field322, class311.field4455.method1233(true, arg1.field320), false, arg1.field5529);
            }
        }
        int var6 = -44 / ((-68 - arg3) / 45);
    }

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "(Z)V")
    public static void method868(boolean arg0) {
        field1875 = null;
        field1877 = null;
        if (arg0) {
            field1875 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lqs;[[BB)V")
    public static final void method869(class425 arg0, byte[][] arg1, byte arg2) {
        ++field1871;
        int var3 = class222.field3218.length;
        if (arg2 != -119) {
            method869((class425) null, (byte[][]) null, (byte) 114);
        }
        for (int var4 = 0; ~var3 < ~var4; ++var4) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class274.field3954[var4] >> 8) * 64 - class483.field7082;
                int var7 = (class274.field3954[var4] & 255) * 64 + -class465.field6840;
                class292.method1811(true);
                arg0.method2596(class255.field3679, (byte) 52, var6, var5, class394.field5821, var7);
            }
        }
    }
}
