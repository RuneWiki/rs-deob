import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class275 extends class200 {

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "Lid;")
    public static class149 field4917 = null;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "Lid;")
    public static class149 field4923 = class60.method382("document)3cookie=(R", (byte) 89);

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lid;")
    private static class149 field4918 = class60.method382("wave2:", (byte) 90);

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "Lid;")
    public static class149 field4922 = field4918;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Lid;")
    public static class149 field4920 = field4918;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        int[] var3 = super.field3638.method1879(arg0, true);
        ++field4916;
        if (super.field3638.field4887) {
            class209.method1427(var3, 0, class137.field2515, class93.field1644[arg0]);
        }
        return arg1 != 55 ? null : var3;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(BII)V")
    public static final void method1901(byte arg0, int arg1, int arg2) {
        ++field4919;
        if (class104.method735(arg1, false)) {
            if (arg0 < 3) {
                field4920 = null;
            }
            class66.method412(arg2, class14.field206[arg1], false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class275() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V")
    public static void method1902(int arg0) {
        field4920 = null;
        field4918 = null;
        if (arg0 == -1) {
            field4917 = null;
            field4923 = null;
            field4922 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public static final void method1903(int arg0) {
        ++field4921;
        if (arg0 == 128) {
            for (int var1 = 0; var1 < class184.field3327; ++var1) {
                int var10002 = class119.field2048[var1]--;
                if (class119.field2048[var1] >= -10) {
                    class4 var3 = class139.field2542[var1];
                    if (var3 == null) {
                        var3 = class4.method21(class226.field3964, class18.field276[var1], 0);
                        if (var3 == null) {
                            continue;
                        }
                        class119.field2048[var1] += var3.method18();
                        class139.field2542[var1] = var3;
                    }
                    if (~class119.field2048[var1] > -1) {
                        int var4;
                        if (class157.field2883[var1] == 0) {
                            var4 = class57.field1005;
                        } else {
                            int var5 = (class157.field2883[var1] & 255) * 128;
                            int var6 = (16739447 & class157.field2883[var1]) >> 16;
                            int var7 = var6 * 128 + 64 + -class77.field1449.field2347;
                            if (var7 < 0) {
                                var7 = -var7;
                            }
                            int var8 = class157.field2883[var1] >> 8 & 255;
                            int var9 = var8 * 128 + -class77.field1449.field2340 + 64;
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = var7 + -128 + var9;
                            if (var5 < var10) {
                                class119.field2048[var1] = -100;
                                continue;
                            }
                            if (~var10 > -1) {
                                var10 = 0;
                            }
                            var4 = (-var10 + var5) * class133.field2432 / var5;
                        }
                        if (var4 > 0) {
                            class42 var11 = var3.method19().method244(class167.field3097);
                            class238 var12 = class238.method1611(var11, 100, var4);
                            var12.method1606(class101.field1776[var1] + -1);
                            class246.field4318.method813(var12);
                        }
                        class119.field2048[var1] = -100;
                    }
                } else {
                    --class184.field3327;
                    for (int var2 = var1; class184.field3327 > var2; ++var2) {
                        class18.field276[var2] = class18.field276[var2 + 1];
                        class139.field2542[var2] = class139.field2542[var2 + 1];
                        class101.field1776[var2] = class101.field1776[var2 + 1];
                        class119.field2048[var2] = class119.field2048[var2 + 1];
                        class157.field2883[var2] = class157.field2883[var2 - -1];
                    }
                    --var1;
                }
            }
            if (class71.field1241 && !class113.method792(0)) {
                if (~class44.field667 != -1 && class133.field2425 != -1) {
                    class78.method592(0, false, class133.field2425, class230.field4010, class44.field667, (byte) -37);
                }
                class71.field1241 = false;
            } else if (class44.field667 != 0 && ~class133.field2425 != 0 && !class113.method792(0)) {
                class208.field3720.method162(2, 137);
                ++class5.field63;
                class208.field3720.method517(class133.field2425, arg0 ^ 245);
                class133.field2425 = -1;
            }
        }
    }
}
