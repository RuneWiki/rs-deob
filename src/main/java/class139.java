import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class139 extends class390 {

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Z")
    public static boolean field1986 = false;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Laq;")
    public static class90 field1981 = new class90();

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[B")
    public static byte[] field1997 = new byte[520];

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lnq;")
    public static class268 field1994;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[I")
    public static int[] field1995;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "[I")
    public static int[] field1996;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
    public final int method950(boolean arg0) {
        if (!arg0) {
            field1996 = null;
        }
        field1978++;
        return (this.field1985 & 0x1ED24F) >> 18;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        field1993++;
        if (arg0 != -18995) {
            method958(-66, true);
        }
        return (this.field1985 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/lang/Class;)Lkr;")
    public static final class447 method952(int arg0, int arg1, int arg2, Class arg3) {
        class125 var4 = class328.field4549[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class123 var5 = var4.field1749; var5 != null; var5 = var5.field1711) {
            class447 var6 = var5.field1709;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6261 == arg1 && var6.field6258 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)Z")
    public final boolean method953(boolean arg0) {
        field1984++;
        if (arg0) {
            return (this.field1985 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
    public final int method954(int arg0) {
        field1987++;
        if (arg0 != 1) {
            this.method960(false, -77);
        }
        return class231.method1591(this.field1985, false);
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Z")
    public final boolean method955(int arg0) {
        if (arg0 >= -39) {
            method957(109);
        }
        field1980++;
        return (this.field1985 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method956(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1988++;
        if (class154.field2161 <= arg5 && class233.field3350 >= arg5 && class154.field2161 <= arg1 && arg1 <= class233.field3350 && class154.field2161 <= arg8 && class233.field3350 >= arg8 && arg7 >= class154.field2161 && arg7 <= class233.field3350 && class290.field4058 <= arg2 && class442.field6212 >= arg2 && class290.field4058 <= arg0 && class442.field6212 >= arg0 && class290.field4058 <= arg6 && arg6 <= class442.field6212 && class290.field4058 <= arg9 && arg9 <= class442.field6212) {
            class7.method41(arg2, arg3, arg5, arg9, arg8, 117, arg7, arg1, arg0, arg6);
        } else {
            class151.method1030(arg2, -125, arg3, arg7, arg6, arg9, arg0, arg5, arg8, arg1);
        }
        if (arg4 != -19) {
            field1986 = false;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static void method957(int arg0) {
        if (arg0 != 95) {
            return;
        }
        field1995 = null;
        field1997 = null;
        field1981 = null;
        field1996 = null;
        field1994 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
    public class139(int arg0, int arg1) {
        this.field1979 = arg1;
        this.field1985 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
    public static final void method958(int arg0, boolean arg1) {
        field1991++;
        if (class446.field6250 == arg0) {
            return;
        }
        if (class446.field6250 == 0) {
            class103.method740((byte) 126);
        }
        if (arg0 == 40) {
            class368.method2370(24);
        }
        if (arg0 != 40 && class439.field6181 != null) {
            class439.field6181.method2210(-2);
            class439.field6181 = null;
        }
        if (class446.field6250 == 25 || class446.field6250 == 28) {
            class129.field1810.field3713 = 2;
            class348.field4781.field3713 = 2;
            class212.field2970.field3713 = 2;
            class415.field5889.field3713 = 2;
            class415.field5897.field3713 = 2;
            class437.field6146.field3713 = 2;
            class364.field5135.field3713 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class109.field1574 = 1;
            class53.field744 = 0;
            class279.field3919 = 0;
            class275.field3831 = 0;
            class18.field321 = 1;
            class18.method251((byte) 103, true);
            class129.field1810.field3713 = 1;
            class348.field4781.field3713 = 1;
            class212.field2970.field3713 = 1;
            class415.field5889.field3713 = 1;
            class415.field5897.field3713 = 1;
            class437.field6146.field3713 = 1;
            class364.field5135.field3713 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class45.method402(-6594);
        }
        if (arg0 == 5) {
            class334.method2144(class212.field2969, -117, class64.field949);
        } else {
            class105.method749(49);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg1) {
            field1982 = 39;
        }
        boolean var3 = class446.field6250 == 5 || class446.field6250 == 10 || class446.field6250 == 28;
        if (var2 != var3) {
            if (var2) {
                class434.field6125 = class349.field4808;
                if (class52.field731 == 0) {
                    class187.method1210((byte) -110, 2);
                } else {
                    class393.method2488(class349.field4808, 0, class362.field5004, 2, false, 255, (byte) 53);
                }
                class306.field4231.method1286(-5716, false);
            } else {
                class187.method1210((byte) -126, 2);
                class306.field4231.method1286(-5716, true);
                if (class200.field2763 != null) {
                    class200.field2763.method1335((byte) 88);
                    class200.field2763 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class64.field949.method75();
        }
        class446.field6250 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IC)Z")
    public static final boolean method959(int arg0, char arg1) {
        if (arg0 < 83) {
            field1986 = true;
        }
        field1983++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)Z")
    public final boolean method960(boolean arg0, int arg1) {
        field1992++;
        if (!arg0) {
            field1995 = null;
        }
        return (this.field1985 >> arg1 + 1 & 0x1) != 0;
    }
}
