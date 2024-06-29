import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class298 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lke;")
    public static class256 field5161 = class316.method2202("<col=ffff00>", 27626);

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lke;")
    public static class256 field5162 = class316.method2202("<col=00ffff>", 27626);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field5165 = 0;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lng;")
    public static class138 field5160;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lng;")
    public static class138 field5163;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 14)
    public static void method2085(boolean arg0) {
        field5162 = null;
        if (arg0) {
            method2087(123, 44);
        }
        field5160 = null;
        field5161 = null;
        field5163 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILng;Z)Lpb;", line = 27)
    public static final class285 method2086(int arg0, class138 arg1, boolean arg2) {
        field5166++;
        byte[] var3 = arg1.method1002((byte) -78, arg0);
        if (arg2) {
            field5165 = -46;
        }
        return var3 == null ? null : new class285(var3);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)Z", line = 67)
    public static final boolean method2087(int arg0, int arg1) {
        field5164++;
        if (class111.field1944[arg0]) {
            return true;
        } else if (class238.field4053.method993(arg0, -2)) {
            int var2 = class238.field4053.method991(arg0, -1);
            if (var2 == 0) {
                class111.field1944[arg0] = true;
                return true;
            }
            if (arg1 != 20330) {
                field5163 = (class138) null;
            }
            if (class50.field921[arg0] == null) {
                class50.field921[arg0] = new class188[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class50.field921[arg0][var3] == null) {
                    byte[] var4 = class238.field4053.method1016(arg0, 100, var3);
                    if (var4 != null) {
                        class188 var5 = class50.field921[arg0][var3] = new class188();
                        var5.field3342 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1368(-4, new class41(var4));
                        } else {
                            var5.method1361(-84, new class41(var4));
                        }
                    }
                }
            }
            class111.field1944[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
