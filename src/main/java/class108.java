import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class108 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1695 = 1;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lna;")
    public static class26[] field1699 = new class26[1000];

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1700 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lna;")
    public static class26 field1698 = class69.method505("<col=ffff00>", (byte) -121);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lve;")
    public static class266 field1693;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILcd;)V", line = 4)
    public static final void method765(int arg0, class69 arg1) {
        field1697++;
        long var2 = 0L;
        int var4 = -1;
        if (arg0 <= 17) {
            field1700 = -43;
        }
        int var5 = 0;
        if (arg1.field1081 == 0) {
            var2 = class107.method760(arg1.field1068, arg1.field1082, arg1.field1066);
        }
        int var6 = 0;
        if (arg1.field1081 == 1) {
            var2 = class295.method2075(arg1.field1068, arg1.field1082, arg1.field1066);
        }
        if (arg1.field1081 == 2) {
            var2 = class132.method890(arg1.field1068, arg1.field1082, arg1.field1066);
        }
        if (arg1.field1081 == 3) {
            var2 = class55.method403(arg1.field1068, arg1.field1082, arg1.field1066);
        }
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
            var5 = ((int) var2 & 0x7E076) >> 14;
        }
        arg1.field1072 = var4;
        arg1.field1071 = var5;
        arg1.field1075 = var6;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLve;)V", line = 142)
    public static final void method766(byte arg0, class266 arg1) {
        class142.field2181 = arg1;
        int var2 = 113 / ((1 - arg0) / 63);
        field1696++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 204)
    public static void method767(byte arg0) {
        field1699 = null;
        field1698 = null;
        field1693 = null;
        if (arg0 <= 52) {
            field1699 = (class26[]) null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 241)
    public static final void method768(byte arg0) {
        field1702++;
        if (arg0 >= -94) {
            method766((byte) -90, (class266) null);
        }
        int var1 = class89.field1474.method1199(class196.field3046);
        for (int var2 = 0; var2 < class126.field1955; var2++) {
            int var3 = class89.field1474.method1199(class82.method641(var2, true));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        int var4 = class126.field1955 * 15 + 21;
        int var5 = class11.field150;
        var1 += 8;
        int var6 = class187.field2959 - (var1 / 2);
        if ((var4 + var5) > class141.field2153) {
            var5 = class141.field2153 - var4;
        }
        if (class38.field622 < var1 + var6) {
            var6 = class38.field622 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class133.field2025 == 1) {
            if (class261.field4265 == class187.field2959 && class89.field1478 == class11.field150) {
                class118.field1861 = class126.field1955 * 15 + (class266.field4385 ? 26 : 22);
                class133.field2025 = 0;
                class315.field5395 = var5;
                class150.field2342 = var6;
                class11.field153 = true;
                class66.field1034 = var1;
            }
        } else if (class205.field3210 == class187.field2959 && class11.field152 == class11.field150) {
            class150.field2342 = var6;
            class133.field2025 = 0;
            class66.field1034 = var1;
            class315.field5395 = var5;
            class118.field1861 = (class266.field4385 ? 26 : 22) + class126.field1955 * 15;
            class11.field153 = true;
        } else {
            class89.field1478 = class11.field152;
            class261.field4265 = class205.field3210;
            class133.field2025 = 1;
        }
    }
}
