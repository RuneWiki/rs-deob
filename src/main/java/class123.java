import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class123 {

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field1857 = 8;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field1861 = 16777215;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
    public static int[] field1859 = new int[14];

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field1858 = -1;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field1864 = 1;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lvd;")
    public static class4 field1863;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lub;")
    public static class92 field1849;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lub;")
    public static class92 field1856;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    public boolean field1848;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BIIZII)V")
    public static final void method924(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 >= -34) {
            method929(-65, -76);
        }
        field1850++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        class94.field1484 = (short) arg5;
        class50.field817 = (short) arg4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILub;)[Lig;")
    public static final class9[] method925(int arg0, int arg1, int arg2, class92 arg3) {
        field1855++;
        if (arg1 > -113) {
            field1858 = 14;
        }
        return class246.method1668(arg0, arg3, arg2, -1) ? class216.method1492(0) : null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILha;)V")
    public final void method926(int arg0, int arg1, class31 arg2) {
        if (arg1 != -1) {
            return;
        }
        field1862++;
        while (true) {
            int var4 = arg2.method265(-94);
            if (var4 == 0) {
                return;
            }
            this.method928(arg2, var4, arg0, 5);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method927(int arg0) {
        field1849 = null;
        field1859 = null;
        field1856 = null;
        if (arg0 != 0) {
            method924((byte) 5, 34, 36, false, -101, -102);
        }
        field1863 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lha;III)V")
    private final void method928(class31 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 5) {
            this.field1861 = 53;
        }
        if (arg1 == 1) {
            this.field1857 = arg0.method260((byte) -67);
        } else if (arg1 == 2) {
            this.field1848 = true;
        } else if (arg1 == 3) {
            this.field1867 = arg0.method308((byte) 6);
            this.field1865 = arg0.method308((byte) -127);
            this.field1866 = arg0.method308((byte) 50);
        } else if (arg1 == 4) {
            this.field1860 = arg0.method265(-109);
        } else if (arg1 == 5) {
            this.field1852 = arg0.method260((byte) -67);
        } else if (arg1 == 6) {
            this.field1861 = arg0.method304((byte) 84);
        }
        field1851++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lhm;")
    public static final class179 method929(int arg0, int arg1) {
        if (arg0 != 22497) {
            return null;
        }
        class179 var2 = (class179) class281.field4433.method1173((long) arg1, true);
        field1854++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field1757.method721((byte) -117, class292.method1938(false, arg1), class240.method1640((byte) 121, arg1));
        class179 var4 = new class179();
        var4.field2796 = arg1;
        if (var3 != null) {
            var4.method1281(new class31(var3), false);
        }
        var4.method1278(false);
        if (var4.field2747 != -1) {
            var4.method1274(method929(22497, var4.field2747), method929(22497, var4.field2804), (byte) -66);
        }
        if (var4.field2805 != -1) {
            var4.method1283(method929(22497, var4.field2805), method929(22497, var4.field2814), arg0 ^ 0x117E);
        }
        if (!class237.field3745 && var4.field2769) {
            var4.field2790 = false;
            var4.field2774 = 0;
            var4.field2783 = class128.field1915;
            var4.field2754 = class278.field4414;
            var4.field2778 = class15.field195;
        }
        class281.field4433.method1167((byte) -112, var4, (long) arg1);
        return var4;
    }
}
