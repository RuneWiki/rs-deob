import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class138 extends class59 {

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public int field1987 = -1;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Z")
    public boolean field1985 = false;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Z")
    public boolean field1993 = false;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Z")
    public static boolean field1983 = false;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public int field1996;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Lmi;")
    public static class256 field1988;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lvl;")
    public static class73 field1979;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Lvl;")
    public static class73 field1992;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    public static final void method871(int arg0, int arg1) {
        if (arg0 != 24216) {
            method872(127, 101);
        }
        field1981++;
        class181 var2 = class95.method652(3, (byte) 34, arg1);
        var2.method1283(192);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)I")
    public static final int method872(int arg0, int arg1) {
        field1977++;
        if (arg1 < 0) {
            return 0;
        }
        class182 var2 = (class182) class38.field464.method1064(-1, (long) arg1);
        if (var2 == null) {
            return class13.method72(false, arg1).field2603;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2864.length; var4++) {
            if (var2.field2864[var4] == -1) {
                var3++;
            }
        }
        int var5 = var3 + class13.method72(false, arg1).field2603 - var2.field2864.length;
        int var6 = 85 / ((2 - arg0) / 48);
        return var5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
    public static final void method873(int arg0, byte arg1) {
        field1990++;
        class81 var2 = class108.field1568;
        synchronized (class108.field1568) {
            class216.field3371 = arg0;
            if (arg1 > -94) {
                field1992 = null;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public static void method874(byte arg0) {
        field1988 = null;
        field1979 = null;
        field1992 = null;
        if (arg0 != 82) {
            method875(-41, 97, (byte) -90, 56, (class191) null);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIBILpg;)V")
    public static final void method875(int arg0, int arg1, byte arg2, int arg3, class191 arg4) {
        field1994++;
        int var5 = 112 / ((arg2 + 56) / 55);
        for (class251 var6 = (class251) class241.field3882.method1548(0); var6 != null; var6 = (class251) class241.field3882.method1549(-81)) {
            if (var6.field4114 == arg1 && arg0 * 128 == var6.field4105 && (arg3 * 128) == var6.field4116 && var6.field4101.field3019 == arg4.field3019) {
                if (var6.field4099 != null) {
                    class81.field1231.method1931(var6.field4099);
                    var6.field4099 = null;
                }
                if (var6.field4102 != null) {
                    class81.field1231.method1931(var6.field4102);
                    var6.field4102 = null;
                }
                var6.method1764(64);
                return;
            }
        }
    }
}
