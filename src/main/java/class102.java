import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class102 extends class75 {

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    private int field1854 = -32768;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lli;")
    public static class185 field1847 = class245.method1649("Nehmen", -111);

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lli;")
    public static class185 field1856 = null;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Lli;")
    public static class185 field1860 = class245.method1649("Gegenstand f-Ur Mitglieder", 124);

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lhi;")
    public static class250 field1851;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lp;")
    public static class82 field1859;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method719(int arg0) {
        field1861++;
        class229.method1581(class149.field2813, false);
        class78.field1358++;
        if (class141.field2647 && class127.field2266) {
            int var1 = class18.field288;
            int var2 = var1 - class259.field4595;
            if (var2 < class130.field2317) {
                var2 = class130.field2317;
            }
            int var3 = class32.field528;
            int var4 = -46 / ((arg0 + 52) / 53);
            int var5 = var3 - class200.field3674;
            if (class154.field2923 > var5) {
                var5 = class154.field2923;
            }
            if (class154.field2923 + class178.field3263.field1498 < class149.field2813.field1498 + var5) {
                var5 = class154.field2923 + class178.field3263.field1498 - class149.field2813.field1498;
            }
            int var6 = class149.field2813.field1517;
            int var7 = var5 - class228.field4153;
            if ((var2 + class149.field2813.field1505) > (class130.field2317 + class178.field3263.field1505)) {
                var2 = class178.field3263.field1505 + class130.field2317 - class149.field2813.field1505;
            }
            int var8 = var2 + class178.field3263.field1565 - class130.field2317;
            int var9 = var5 + class178.field3263.field1590 - class154.field2923;
            int var10 = var2 - class187.field3462;
            if (class78.field1358 > class149.field2813.field1620 && (var6 < var10 || var10 < (-var6) || var6 < var7 || var7 < -var6)) {
                class180.field3305 = true;
            }
            if (class149.field2813.field1606 != null && class180.field3305) {
                class121 var11 = new class121();
                var11.field2196 = class149.field2813;
                var11.field2198 = class149.field2813.field1606;
                var11.field2197 = var9;
                var11.field2204 = var8;
                class274.method1877(var11, (byte) -77);
            }
            if (class144.field2747 == 0) {
                if (class180.field3305) {
                    if (class149.field2813.field1648 != null) {
                        class121 var12 = new class121();
                        var12.field2204 = var8;
                        var12.field2196 = class149.field2813;
                        var12.field2198 = class149.field2813.field1648;
                        var12.field2197 = var9;
                        var12.field2207 = class173.field3173;
                        class274.method1877(var12, (byte) -77);
                    }
                    if (class173.field3173 != null && client.method1507(class149.field2813) != null) {
                        class182.field3349.method577(241, 0);
                        class182.field3349.method842(class149.field2813.field1579, -6596);
                        class182.field3349.method843((byte) -113, class173.field3173.field1637);
                        class182.field3349.method849(class173.field3173.field1579, -430704232);
                        class46.field734++;
                        class182.field3349.method874(class149.field2813.field1637, 1538997896);
                    }
                } else if ((class48.field784 == 1 || class256.method1745(class127.field2283 - 1, (byte) 84)) && class127.field2283 > 2) {
                    class146.method1043(0);
                } else if (class127.field2283 > 0) {
                    class106.method751((byte) -99);
                }
                class149.field2813 = null;
            }
        } else if (class78.field1358 > 1) {
            class149.field2813 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1858++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method720(boolean arg0) {
        field1860 = null;
        field1856 = null;
        field1851 = null;
        field1847 = null;
        field1859 = null;
        if (arg0) {
            field1848 = -42;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()I")
    public final int method62() {
        field1849++;
        return this.field1854;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)I")
    public static final int method721(byte arg0, int arg1) {
        field1857++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 == -44) {
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10) {
        class98 var13 = class165.method1179(102, this.field1852).method954(0, (class2) null, this.field1850, 0);
        field1855++;
        if (var13 != null) {
            var13.method48(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1854 = var13.method62();
        }
    }
}
