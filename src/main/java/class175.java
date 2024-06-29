import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class175 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[J")
    public static long[] field2917 = new long[32];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public static int[] field2920 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "S")
    public static short field2921 = 1;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lgi;")
    public static class164 field2919;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method1238(byte arg0) {
        field2917 = null;
        field2920 = null;
        field2919 = null;
        if (arg0 > -91) {
            method1240((byte) 117, 106, -28);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    public static final void method1239(int arg0, int arg1, int arg2, int arg3) {
        field2922++;
        if (arg1 == 1001) {
            class157.method1064(true, arg0, arg2, 10);
        } else if (arg1 == 1003) {
            class157.method1064(true, arg0, arg2, 11);
        } else if (arg1 == 1009) {
            class157.method1064(true, arg0, arg2, 12);
        } else if (arg1 == 1011) {
            class157.method1064(true, arg0, arg2, 13);
        } else if (arg1 == 1006) {
            class157.method1064(true, arg0, arg2, 14);
        }
        if (arg3 != 1006) {
            method1238((byte) -84);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)Z")
    public static final boolean method1240(byte arg0, int arg1, int arg2) {
        field2923++;
        if (!class41.field633) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class208.field3315[var3] == null || class208.field3315[var3][var4] == null) {
            return false;
        }
        class248 var5 = class208.field3315[var3][var4];
        if (arg1 == -1 && var5.field4038 == 0) {
            for (int var6 = 0; var6 < class291.field4776; var6++) {
                if (class26.field478[var6] == 33 || class26.field478[var6] == 1005 || class26.field478[var6] == 24 || class26.field478[var6] == 36 || class26.field478[var6] == 23) {
                    for (class248 var7 = class281.method1913(class144.field2320[var6], (byte) -106); var7 != null; var7 = class58.method370(false, var7)) {
                        if (var5.field3968 == var7.field3968) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class291.field4776; var8++) {
                if (class242.field3840[var8] == arg1 && class144.field2320[var8] == var5.field3968 && (class26.field478[var8] == 33 || class26.field478[var8] == 1005 || class26.field478[var8] == 24 || class26.field478[var8] == 36 || class26.field478[var8] == 23)) {
                    return true;
                }
            }
        }
        if (arg0 != 95) {
            method1238((byte) -71);
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(CLjava/lang/StringBuffer;IB)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1241(char arg0, StringBuffer arg1, int arg2, byte arg3) {
        field2918++;
        if (arg3 != -103) {
            return null;
        }
        int var4 = arg1.length();
        arg1.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg1.setCharAt(var5, arg0);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public static final void method1242(byte arg0) {
        field2924++;
        class275.field4497.method1876((byte) 121);
        class16.field303.method1876((byte) 125);
        if (arg0 != -15) {
            field2919 = null;
        }
    }
}
