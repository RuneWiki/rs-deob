import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class98 extends class273 {

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "[I")
    public static int[] field1944 = new int[200];

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "Ljd;")
    public static class86 field1947 = null;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "Ljd;")
    public static class86 field1937 = class122.method868("mapfunction", true);

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "Lwj;")
    public static class6 field1943 = null;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "Ljd;")
    public static class86 field1940 = class122.method868(")4p=", true);

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "Lnh;")
    public static class53 field1945 = new class53(64);

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!pk", name = "gb", descriptor = "Lbj;")
    public static class151 field1951;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "Lclient;")
    public static client field1942;

    @OriginalMember(owner = "client!pk", name = "eb", descriptor = "[I")
    public static int[] field1949;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IB)Z")
    public static final boolean method708(int arg0, byte arg1) {
        if (arg1 >= -4) {
            return false;
        } else {
            ++field1948;
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && ~arg0 >= -91;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZII)I")
    public static final int method709(boolean arg0, int arg1, int arg2) {
        ++field1946;
        int var3 = arg2 - -(arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        if (!arg0) {
            return -120;
        } else {
            int var5 = (var4 * 15731 * var4 - -789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return 255 & var5 >> 19;
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1944 = null;
        field1945 = null;
        field1949 = null;
        field1943 = null;
        field1942 = null;
        if (arg0 == 2) {
            field1940 = null;
            field1937 = null;
            field1951 = null;
            field1947 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (arg0 != -7420) {
            return null;
        } else {
            if (super.field4800.field3160) {
                int var4 = class143.field2711[arg1];
                for (int var5 = 0; ~class176.field3200 < ~var5; ++var5) {
                    var3[var5] = this.method712(var4, class114.field2184[var5], class177.method1249(arg0, -28367)) % 4096;
                }
            }
            ++field1941;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V")
    public static final void method711(int arg0) {
        if (class25.field601 != null) {
            class25.field601.method352(-12563);
        }
        ++field1950;
        if (class76.field1517 != null) {
            class76.field1517.method352(-12563);
        }
        class176.method1242(arg0, class31.field647, false, 22050);
        class25.field601 = class200.method1378(class157.field2954, 22050, 0, class50.field1057, false);
        class25.field601.method353(false, class227.field4114);
        class76.field1517 = class200.method1378(class157.field2954, 2048, 1, class50.field1057, false);
        class76.field1517.method353(false, class2.field18);
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(III)I")
    private final int method712(int arg0, int arg1, int arg2) {
        int var4 = arg1 - -(arg0 * 57);
        int var5 = var4 << 1 ^ var4;
        ++field1938;
        if (arg2 != 29237) {
            method710(76);
        }
        return -(((var5 * 15731 * var5 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
