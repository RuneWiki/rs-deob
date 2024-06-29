import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 extends class260 {

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "Loh;")
    public static class263 field801 = class253.method1681(-123, ":clanreq:");

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "Loh;")
    private static class263 field804 = class253.method1681(-123, "cyan:");

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "Loh;")
    public static class263 field798 = field804;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "Loh;")
    public static class263 field802 = field804;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "Lsg;")
    public static class159 field806;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
    public static void method214(int arg0) {
        field806 = null;
        if (arg0 != 29079) {
            field800 = 27;
        }
        field798 = null;
        field804 = null;
        field802 = null;
        field801 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class33() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZILue;Lue;)Lwf;")
    public static final class1 method215(int arg0, boolean arg1, int arg2, class86 arg3, class86 arg4) {
        boolean var5 = true;
        ++field795;
        int[] var6 = arg4.method577(2828, arg0);
        int var7 = 0;
        if (arg2 != 7589) {
            field802 = null;
        }
        while (~var7 > ~var6.length) {
            byte[] var8 = arg4.method589(-104, arg0, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 255) << 8 | 255 & var8[1];
                byte[] var10;
                if (!arg1) {
                    var10 = arg3.method589(-99, var9, 0);
                } else {
                    var10 = arg3.method589(-98, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
            ++var7;
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class1(arg4, arg3, arg0, arg1);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        int[][] var3 = super.field4509.method1667(arg0, arg1 ^ arg1);
        ++field797;
        if (super.field4509.field4346) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class49.field1052 < ~var7; ++var7) {
                this.method216(var7, arg0, 123);
                int[][] var8 = this.method1712((byte) 7, 0, class121.field2240);
                var4[var7] = var8[0][class52.field1112];
                var5[var7] = var8[1][class52.field1112];
                var6[var7] = var8[2][class52.field1112];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
    private final void method216(int arg0, int arg1, int arg2) {
        ++field803;
        int var4 = class70.field1409[arg0];
        int var5 = class275.field4825[arg1];
        if (arg2 <= 19) {
            this.method216(-106, -72, 28);
        }
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class121.field2240 = arg1;
            class52.field1112 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class52.field1112 = arg1;
            class121.field2240 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class121.field2240 = arg0;
            class52.field1112 = -arg1 + class49.field1052;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class52.field1112 = arg0;
            class121.field2240 = -arg1 + class60.field1235;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class52.field1112 = -arg0 + class49.field1052;
            class121.field2240 = -arg1 + class60.field1235;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class121.field2240 = class60.field1235 - arg0;
            class52.field1112 = -arg1 + class49.field1052;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class121.field2240 = -arg0 + class60.field1235;
            class52.field1112 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class52.field1112 = -arg0 + class49.field1052;
            class121.field2240 = arg1;
        }
        class121.field2240 &= class277.field4846;
        class52.field1112 &= class166.field3024;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        int[] var3 = super.field4511.method304(arg0, false);
        ++field796;
        if (arg1 != 255) {
            field800 = 5;
        }
        if (super.field4511.field1029) {
            for (int var4 = 0; class49.field1052 > var4; ++var4) {
                this.method216(var4, arg0, 22);
                int[] var5 = this.method1711(class121.field2240, 0, false);
                var3[var4] = var5[class52.field1112];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg1 != 5701) {
            method217(-79, (class194) null);
        }
        if (~arg0 == -1) {
            super.field4505 = arg2.method1301(arg1 ^ -13882) == 1;
        }
        ++field805;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(ILsi;)Lid;")
    public static final class146 method217(int arg0, class194 arg1) {
        if (arg0 != -4168) {
            return null;
        } else {
            ++field799;
            return new class146(arg1.method1298((byte) -109), arg1.method1298((byte) -128), arg1.method1298((byte) -118), arg1.method1298((byte) -94), arg1.method1298((byte) -99), arg1.method1298((byte) -115), arg1.method1298((byte) -76), arg1.method1298((byte) -87), arg1.method1277((byte) -122), arg1.method1301(-8317));
        }
    }
}
