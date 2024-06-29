import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class110 extends class228 {

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    private int field1973 = 2048;

    @OriginalMember(owner = "client!fi", name = "kb", descriptor = "I")
    private int field1980 = 3072;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    private int field1972 = 1024;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Loa;")
    private static class99 field1963 = class221.method1463(2844, "Created gameworld");

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Loa;")
    public static class99 field1964 = class221.method1463(2844, " ");

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "Loa;")
    private static class99 field1968 = class221.method1463(2844, "wishes to trade with you)3");

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "Loa;")
    public static class99 field1967 = field1968;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "Loa;")
    private static class99 field1969 = class221.method1463(2844, "Loading world list data");

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "Loa;")
    public static class99 field1979 = field1969;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "Loa;")
    public static class99 field1975 = field1963;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(B)V")
    public static void method759(byte arg0) {
        field1979 = null;
        field1968 = null;
        field1969 = null;
        field1963 = null;
        if (arg0 > -96) {
            field1979 = null;
        }
        field1975 = null;
        field1964 = null;
        field1967 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class284[] var7 = class284.field4935;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class284 var9 = var7[var8];
            if (var9 != null && ~var9.field4944 == -3) {
                class259.method1676((-class280.field4910 + var9.field4936 << 7) + var9.field4932, arg6 >> 1, 126, (-class215.field3731 + var9.field4948 << 7) - -var9.field4939, arg2, arg0 >> 1, arg1, var9.field4946 * 2);
                if (~class13.field125 < 0 && class56.field926 % 20 < 10) {
                    class53.field872[var9.field4947].method38(class13.field125 + arg3 - 12, arg5 + -28 + class198.field3448);
                }
            }
        }
        ++field1962;
        if (arg4 != 1588033089) {
            field1975 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field3943 = arg1.method1693((byte) -114) == 1;
                }
            } else {
                this.field1980 = arg1.method1740((byte) 48);
            }
        } else {
            this.field1972 = arg1.method1740((byte) 72);
        }
        if (arg2 != -7618) {
            this.method18(36, (class261) null, 3);
        }
        ++field1976;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field1978;
        if (arg0 != -27) {
            method761((byte) -3, -58);
        }
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[][] var4 = this.method1502(255, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class234.field4046 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field1973 >> 12) + this.field1972;
                var10[var11] = this.field1972 - -(var6[var11] * this.field1973 >> 12);
                var9[var11] = (var7[var11] * this.field1973 >> 12) + this.field1972;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (arg1 != -3) {
            return null;
        } else {
            if (super.field3952.field3276) {
                int[] var4 = this.method1500(arg0, 0, (byte) 118);
                for (int var5 = 0; ~var5 > ~class234.field4046; ++var5) {
                    var3[var5] = (var4[var5] * this.field1973 >> 12) + this.field1972;
                }
            }
            ++field1966;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)V")
    public static final void method761(byte arg0, int arg1) {
        if (class75.field1318 == null || class75.field1318.length < arg1) {
            class75.field1318 = new int[arg1];
        }
        if (arg0 >= -86) {
            field1970 = 62;
        }
        ++field1977;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field1974;
        this.field1973 = -this.field1972 + this.field1980;
        if (arg0 != -8) {
            field1979 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, false);
    }
}
