import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class199 extends class467 {

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Ljb;")
    public class499 field2810;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "Ljb;")
    public class499 field2817;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field2818;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Ljava/lang/String;")
    public String field2805;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
    public boolean field2804;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "[J")
    public static long[] field2811;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field2813;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    public static final int method1392(int arg0, int arg1) {
        field2807++;
        if (arg0 != -1) {
            field2806 = -117;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        field2811 = null;
        if (arg0 <= 0) {
            method1392(124, -65);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 3) {
            field2816 = 43;
        }
        field2802++;
        if (arg0 < 0 || arg7 < 0 || arg0 >= (class96.field1403 - 1) || arg7 >= (class485.field7122 - 1)) {
            return;
        }
        if (class380.field5802 == null) {
            return;
        }
        if (arg2 == 0) {
            class196 var8 = (class196) class456.method2743(arg4, arg0, arg7);
            class196 var9 = (class196) class493.method2924(arg4, arg0, arg7);
            if (var8 != null && arg1 != 2) {
                if (var8 instanceof class26) {
                    ((class26) var8).field423.method2596(arg6, arg5 ^ 0xFFFFFFFC);
                } else {
                    class309.method1991(arg6, arg7, arg3, arg2, var8.method50(25707), arg1, arg4, arg0, -29070);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class26) {
                    ((class26) var9).field423.method2596(arg6, -1);
                    return;
                }
                class309.method1991(arg6, arg7, arg3, arg2, var9.method50(arg5 + 25704), arg1, arg4, arg0, -29070);
                return;
            }
            return;
        }
        if (arg2 != 1) {
            if (arg2 == 2) {
                class196 var11 = (class196) class432.method2587(arg4, arg0, arg7, field2818 == null ? (field2818 = method1395("ou")) : field2818);
                if (var11 == null) {
                    return;
                }
                if (arg1 == 11) {
                    arg1 = 10;
                }
                if (!(var11 instanceof class425)) {
                    class309.method1991(arg6, arg7, arg3, arg2, var11.method50(25707), arg1, arg4, arg0, -29070);
                    return;
                }
                ((class425) var11).field6322.method2596(arg6, arg5 - 4);
            } else if (arg2 == 3) {
                class196 var10 = (class196) class380.method2357(arg4, arg0, arg7);
                if (var10 != null) {
                    if (!(var10 instanceof class353)) {
                        class309.method1991(arg6, arg7, arg3, arg2, var10.method50(25707), arg1, arg4, arg0, -29070);
                        return;
                    }
                    ((class353) var10).field5466.method2596(arg6, -1);
                    return;
                }
            }
            return;
        }
        class196 var12 = (class196) class174.method1214(arg4, arg0, arg7);
        if (var12 == null) {
            return;
        }
        if (var12 instanceof class249) {
            ((class249) var12).field3447.method2596(arg6, -1);
            return;
        }
        int var13 = var12.method50(25707);
        if (arg1 != 4 && arg1 != 5) {
            if (arg1 != 6) {
                if (arg1 == 7) {
                    class309.method1991(arg6, arg7, (arg3 + 2 & 0x3) + 4, arg2, var13, 4, arg4, arg0, -29070);
                } else if (arg1 == 8) {
                    class309.method1991(arg6, arg7, arg3 + 4, arg2, var13, 4, arg4, arg0, -29070);
                    class309.method1991(arg6, arg7, (arg3 + 2 & 0x3) + 4, arg2, var13, 4, arg4, arg0, -29070);
                    return;
                }
                return;
            }
            class309.method1991(arg6, arg7, arg3 + 4, arg2, var13, 4, arg4, arg0, arg5 ^ 0xFFFF8E71);
            return;
        }
        class309.method1991(arg6, arg7, arg3, arg2, var13, 4, arg4, arg0, -29070);
        return;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1395(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
