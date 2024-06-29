import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class98 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "J")
    public long field1484;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lqf;")
    public class64 field1474;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lqf;")
    public class64 field1480;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lqf;")
    public class64 field1481;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I", line = 5)
    public static final int method865(int arg0) {
        if (arg0 == 1653211349) {
            field1473++;
            return ((class239.field3720 == 0 ? 0 : 1) << 21) + ((class224.field3509 == 0 ? 0 : 1) << 20) + ((class110.field1686 ? 1 : 0) << 19) + (class64.field989 << 17) + ((class164.field2603 ? 1 : 0) << 15) + ((class290.field4504 ? 1 : 0) << 9) + ((class86.field1241 ? 1 : 0) << 7) + ((class121.field1878 ? 1 : 0) << 6) + ((class274.field4252 ? 1 : 0) << 4) + ((class190.field2985 ? 1 : 0) << 3) + ((class139.field2321 & 0x7) - -((class327.field5034 ? 1 : 0) << 5)) + ((class108.field1626 ? 1 : 0) << 8) - (-((class101.field1529 ? 1 : 0) << 10) + -(class19.field311 & 0x3 << 11) + -((class59.field927 ? 1 : 0) << 13) + -((class343.field5451 ? 1 : 0) << 16) + (-((class287.field4454 == 0 ? 0 : 1) << 22) - (class273.method2000() << 23)));
        } else {
            return -32;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Ljo;", line = 22)
    public static final class57 method866(boolean arg0) {
        if (arg0) {
            return (class57) null;
        } else {
            field1476++;
            return class351.field5602;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I", line = 40)
    public static final int method867(int arg0, int arg1) {
        if (arg0 != -1290128404) {
            field1483 = 22;
        }
        field1471++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;BILua;)Ltn;", line = 62)
    public static final class252 method868(int arg0, Component arg1, byte arg2, int arg3, class323 arg4) {
        field1470++;
        if (class294.field4571 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class252 var5 = (class252) Class.forName("mb").getDeclaredConstructor().newInstance();
                int var6 = 0 % ((arg2 + 57) / 44);
                var5.field3897 = arg3;
                var5.field3871 = new int[(class61.field946 ? 2 : 1) * 256];
                var5.method119(arg1);
                var5.field3898 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3898 > 16384) {
                    var5.field3898 = 16384;
                }
                var5.method116(var5.field3898);
                if (class317.field4893 > 0 && class153.field2481 == null) {
                    class153.field2481 = new class106();
                    class153.field2481.field1602 = arg4;
                    arg4.method2290((byte) -127, class153.field2481, class317.field4893);
                }
                if (class153.field2481 != null) {
                    if (class153.field2481.field1596[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class153.field2481.field1596[arg0] = var5;
                }
                return var5;
            } catch (Throwable var11) {
                try {
                    class312 var8 = new class312(arg4, arg0);
                    var8.field3897 = arg3;
                    var8.field3871 = new int[(class61.field946 ? 2 : 1) * 256];
                    var8.method119(arg1);
                    var8.field3898 = 16384;
                    var8.method116(var8.field3898);
                    if (class317.field4893 > 0 && class153.field2481 == null) {
                        class153.field2481 = new class106();
                        class153.field2481.field1602 = arg4;
                        arg4.method2290((byte) -105, class153.field2481, class317.field4893);
                    }
                    if (class153.field2481 != null) {
                        if (class153.field2481.field1596[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class153.field2481.field1596[arg0] = var8;
                    }
                    return var8;
                } catch (Throwable var10) {
                    return new class252();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
