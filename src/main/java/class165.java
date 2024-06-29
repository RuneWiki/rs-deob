import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class165 extends class210 {

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lbt;")
    public static class363 field2180 = new class363(50);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "Lct;")
    public static class104 field2175;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lct;")
    public static class104 field2176;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -11473) {
            field2175 = null;
        }
        ++field2182;
        if (~arg1 <= ~class9.field128 && class63.field838 >= arg6 && arg4 >= class248.field3659 && ~class146.field1978 <= ~arg7) {
            class223.method1529(arg5, arg7, arg1, arg2, arg0, arg4, arg6, -110);
        } else {
            class446.method2737(arg5, arg7, arg2, (byte) 34, arg0, arg1, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public static void method1090(int arg0) {
        field2180 = null;
        if (arg0 > -111) {
            method1089(-71, -122, -112, -4, 86, 45, 30, 121);
        }
        field2175 = null;
        field2176 = null;
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        ++field2178;
        int var1 = 68 % ((14 - arg0) / 59);
        class326.field4793.method2313(105);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
    public static final int method1092(boolean arg0, int arg1) {
        ++field2179;
        if (arg1 != 17838) {
            field2180 = null;
        }
        long var2 = class43.method364(-16756);
        for (class331 var4 = arg0 ? (class331) class346.field5101.method608((byte) 123) : (class331) class346.field5101.method604(-112); var4 != null; var4 = (class331) class346.field5101.method604(-126)) {
            if (~(4611686018427387903L & var4.field4908) > ~var2) {
                if (~(var4.field4908 & 4611686018427387904L) != -1L) {
                    int var5 = (int) var4.field3907;
                    class31.field426[var5] = class14.field227[var5];
                    var4.method1820(-25246);
                    return var5;
                }
                var4.method1820(-25246);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
    public static final void method1093(boolean arg0) {
        ++field2181;
        class363 var1 = class124.field1645;
        synchronized (class124.field1645) {
            class124.field1645.method2307(23);
        }
        class363 var2 = field2180;
        synchronized (field2180) {
            field2180.method2307(23);
        }
        class363 var3 = class459.field6785;
        synchronized (class459.field6785) {
            class459.field6785.method2307(-94);
            if (arg0) {
                method1091(-94);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class165() {
        super(1, true);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field2177;
        if (arg1 != -38) {
            this.method361(75, (byte) 29);
        }
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class202.field2852; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }
}
