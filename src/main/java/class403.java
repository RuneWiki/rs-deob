import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class403 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
    public static boolean field5981 = false;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field5984 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lhn;")
    public static class509 field5983 = new class509(77, 6);

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "F")
    public static float field5986;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Luq;IIZI)V", line = 6)
    public static final void method2519(class114 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5982++;
        int var5 = arg0.field1642;
        int var6 = arg0.field1627;
        if (arg0.field1675 == 0) {
            arg0.field1642 = arg0.field1641;
        } else if (arg0.field1675 == 1) {
            arg0.field1642 = arg2 - arg0.field1641;
        } else if (arg0.field1675 == 2) {
            arg0.field1642 = arg0.field1641 * arg2 >> 14;
        }
        if (~arg0.field1740 == arg4) {
            arg0.field1627 = arg0.field1643;
        } else if (arg0.field1740 == 1) {
            arg0.field1627 = arg1 - arg0.field1643;
        } else if (arg0.field1740 == 2) {
            arg0.field1627 = arg0.field1643 * arg1 >> 14;
        }
        if (arg0.field1675 == 4) {
            arg0.field1642 = arg0.field1627 * arg0.field1597 / arg0.field1639;
        }
        if (arg0.field1740 == 4) {
            arg0.field1627 = arg0.field1642 * arg0.field1639 / arg0.field1597;
        }
        if (class64.field780 && (client.method1387(arg0).field5805 != 0 || arg0.field1585 == 0)) {
            if (arg0.field1627 < 5 && arg0.field1642 < 5) {
                arg0.field1642 = 5;
                arg0.field1627 = 5;
            } else {
                if (arg0.field1627 <= 0) {
                    arg0.field1627 = 5;
                }
                if (arg0.field1642 <= 0) {
                    arg0.field1642 = 5;
                }
            }
        }
        if (class396.field5910 == arg0.field1592) {
            class474.field6836 = arg0;
        }
        if (arg3 && arg0.field1580 != null && arg0.field1642 != var5 || arg0.field1627 != var6) {
            class405 var7 = new class405();
            var7.field6004 = arg0;
            var7.field6008 = arg0.field1580;
            class186.field2821.method994(var7, -3610);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lh;", line = 81)
    public static final class473 method2520(int arg0) {
        field5979++;
        if (arg0 != -3) {
            method2525(-128, 73);
        }
        try {
            return (class473) Class.forName("qh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILcl;II)V", line = 98)
    public static final void method2521(int arg0, class177 arg1, int arg2, int arg3) {
        if (arg1.field1959 == arg3 && arg3 != -1) {
            class189 var4 = class242.field3846.method2238(arg3, (byte) 78);
            int var5 = var4.field3192;
            if (var5 == 1) {
                arg1.field1903 = 0;
                arg1.field1899 = 1;
                arg1.field1907 = arg2;
                arg1.field1939 = 0;
                arg1.field1943 = 0;
                class501.method2969(var4, arg1.field5837, class398.field5947 == arg1, arg1.field1939, -126, arg1.field5826, arg1.field5833);
            }
            if (var5 == 2) {
                arg1.field1943 = 0;
            }
        } else if (arg3 == -1 || arg1.field1959 == -1 || class242.field3846.method2238(arg3, (byte) 78).field3175 >= class242.field3846.method2238(arg1.field1959, (byte) 78).field3175) {
            arg1.field1943 = 0;
            arg1.field1903 = 0;
            arg1.field1899 = 1;
            arg1.field1983 = arg1.field1981;
            arg1.field1939 = 0;
            arg1.field1907 = arg2;
            arg1.field1959 = arg3;
            if (arg1.field1959 != -1) {
                class501.method2969(class242.field3846.method2238(arg1.field1959, (byte) 78), arg1.field5837, class398.field5947 == arg1, arg1.field1939, -58, arg1.field5826, arg1.field5833);
            }
        }
        field5985++;
        int var6 = -99 % ((arg0 + 9) / 57);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)V", line = 151)
    public static final void method2523(byte arg0, int arg1) {
        if (arg0 <= 82) {
            method2524(-69);
        }
        if (class150.field2249 == null || class150.field2249.length < arg1) {
            class150.field2249 = new int[arg1];
        }
        field5980++;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 181)
    public static void method2524(int arg0) {
        int var1 = 100 % ((30 - arg0) / 53);
        field5983 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Z", line = 190)
    public static final boolean method2525(int arg0, int arg1) {
        field5978++;
        if (arg1 != -23) {
            method2524(17);
        }
        return arg0 == 22 || arg0 == 51 || arg0 == 1007 || arg0 == 3 || arg0 == 2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFIFIIII[FFI)V")
    public abstract void method2522(float arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, float arg9, int arg10);
}
