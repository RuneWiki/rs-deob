import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class237 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[J")
    public static long[] field3906 = new long[100];

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[Ldk;")
    public static class236[] field3908 = new class236[0];

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lea;")
    public static class61 field3898;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILeh;)Log;")
    public static final class41 method1565(int arg0, class101 arg1) {
        int var2 = -119 / ((arg0 + 62) / 43);
        field3910++;
        return new class41(arg1.method686(-3), arg1.method686(-3), arg1.method686(-3), arg1.method686(-3), arg1.method686(-3), arg1.method686(-3), arg1.method686(-3), arg1.method686(-3), arg1.method658(22292), arg1.method669((byte) 36));
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
    public static final Object method1566(boolean arg0, byte[] arg1, byte arg2) {
        field3907++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class85.field1532) {
            try {
                class246 var3 = (class246) Class.forName("vi").getDeclaredConstructor().newInstance();
                var3.method1649(-117, arg1);
                return var3;
            } catch (Throwable var4) {
                class85.field1532 = true;
            }
        }
        if (arg2 != -10) {
            field3898 = null;
        }
        return arg0 ? class157.method1082(0, arg1) : arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)I")
    public static final int method1567(byte arg0) {
        field3903++;
        if ((double) class151.field2534 == 3.0D) {
            return 37;
        } else if ((double) class151.field2534 == 4.0D) {
            return 50;
        } else if ((double) class151.field2534 == 6.0D) {
            return 75;
        } else {
            if (arg0 <= 49) {
                field3898 = null;
            }
            return (double) class151.field2534 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLdl;)V")
    public static final void method1568(byte arg0, class46 arg1) {
        if (arg0 != -60) {
            method1567((byte) 26);
        }
        field3909++;
        class46 var2 = class224.method1508((byte) -123, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class4.field38;
            var4 = class267.field4324;
        } else {
            var3 = var2.field715;
            var4 = var2.field701;
        }
        class245.method1638((byte) -34, false, var3, var4, arg1);
        class69.method422(113, var3, var4, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method1569(int arg0) {
        field3906 = null;
        field3898 = null;
        field3908 = null;
        if (arg0 != 25696) {
            method1572(true, 90, 94);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method1570(int arg0) {
        class195.field3154 = null;
        class225.method1513(class267.field4324, 0, client.field4545, class4.field38, 0, 0, -27680, -1, 0);
        if (arg0 >= -50) {
            method1567((byte) -37);
        }
        if (class195.field3154 != null) {
            class31.method210(class267.field4324, true, class4.field38, 0, class187.field3030.field709, 0, class147.field2499, -1412584499, class59.field1028, class195.field3154);
            class195.field3154 = null;
        }
        field3899++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
    public static final void method1571(byte arg0, int arg1) {
        if (!class261.field4256) {
            arg1 = -1;
        }
        int var2 = 87 / ((-arg0 - 55) / 47);
        field3900++;
        if (class9.field111 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class14 var3 = class112.method785(arg1, 33);
            class197 var4 = var3.method87(false);
            if (var4 == null) {
                arg1 = -1;
            } else {
                class127.field2238.method909(new Point(var3.field197, var3.field198), var4.field1230, class118.field2099, var4.field1227, 0, var4.method1314());
                class9.field111 = arg1;
            }
        }
        if (arg1 == -1 && class9.field111 != -1) {
            class127.field2238.method909(new Point(), -1, class118.field2099, -1, 0, (int[]) null);
            class9.field111 = -1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)I")
    public static final int method1572(boolean arg0, int arg1, int arg2) {
        field3902++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            if (!arg0) {
                method1567((byte) -76);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBI)V")
    public static final void method1573(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -23) {
            method1565(-66, (class101) null);
        }
        field3905++;
        for (int var5 = 0; var5 < class140.field2406; var5++) {
            if (arg4 < (class23.field364[var5] + class223.field3754[var5]) && class23.field364[var5] < (arg4 + arg1) && (class88.field1575[var5] + class176.field2884[var5]) > arg2 && class88.field1575[var5] < arg0 + arg2) {
                class239.field3937[var5] = true;
            }
        }
    }
}
