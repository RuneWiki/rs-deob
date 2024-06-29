import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class115 {

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field1972 = -1;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
    public static int[] field1965 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field1979 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljj;")
    public static class134 field1964;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Ljj;")
    public static class134 field1966;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjj;ZLjj;Z)Lse;")
    public static final class10 method819(int arg0, class134 arg1, boolean arg2, class134 arg3, boolean arg4) {
        field1978++;
        int[] var5 = arg3.method919(-115, arg0);
        boolean var6 = arg2;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg3.method932(var5[var7], 1, arg0);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg1.method932(var9, 1, 0);
                } else {
                    var10 = arg1.method932(0, 1, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class10(arg3, arg1, arg0, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLjava/lang/String;)I")
    public static final int method820(int arg0, byte arg1, String arg2) {
        field1977++;
        int var3 = 22 / ((21 - arg1) / 32);
        return class191.method1294(true, arg2, arg0, 47);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method821(int arg0) {
        if (arg0 >= -117) {
            field1965 = null;
        }
        class79.field1092.method1831(-111);
        class196.field3166.method1831(-125);
        field1959++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Z")
    public static final boolean method822(byte arg0, int arg1) {
        field1969++;
        if (class61.field824 == arg1) {
            return false;
        }
        if (arg0 != 78) {
            field1965 = null;
        }
        class161.field2616 = new int[104][104];
        class140.field2298 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class61.field839[var2] = new class281(104, 104);
        }
        class61.field824 = arg1;
        class244.field3913 = new class48[4][104][104];
        class243.field3894 = new byte[4][104][104];
        class134.field2251 = new byte[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method823(String arg0, byte arg1, int arg2) {
        class12.field158++;
        class83.field1148.method1238(147, -136478397);
        class83.field1148.method1739(class238.method1570(arg0, (byte) 109), -1961);
        field1962++;
        if (arg1 > -42) {
            method820(61, (byte) 39, (String) null);
        }
        class83.field1148.method1744(-92, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([[II)V")
    public static final void method824(int[][] arg0, int arg1) {
        field1961++;
        if (arg1 == -23780) {
            class85.field1162 = arg0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method825(int arg0) {
        field1964 = null;
        field1965 = null;
        field1966 = null;
        int var1 = 40 % ((11 - arg0) / 51);
    }
}
