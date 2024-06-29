import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class101 extends class136 {

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "Lnc;")
    public class145 field1831;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "[I")
    public static int[] field1834 = new int[32];

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Li;")
    public static class88 field1836 = class208.method1425(105, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Li;")
    private static class88 field1841;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Li;")
    public static class88 field1839;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Li;")
    private static class88 field1845;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "Li;")
    public static class88 field1840;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "Li;")
    public static class88 field1844;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "J")
    public static long field1842;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "[I")
    public static int[] field1833;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lnb;BI)[Llj;")
    public static final class130[] method702(class144 arg0, byte arg1, int arg2) {
        if (arg1 != 30) {
            field1844 = null;
        }
        field1837++;
        return class212.method1453((byte) 53, arg2, arg0) ? class190.method1325((byte) -35) : null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Li;B)V")
    public static final void method703(class88 arg0, byte arg1) {
        field1835++;
        if (class88.field1647 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method630(false);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class88.field1647.length && class88.field1647[var2].field1219 != var3) {
            var2++;
        }
        if (class88.field1647.length <= var2 || class88.field1647[var2] == null) {
            return;
        }
        class146.field2749.method30((byte) -73, 49);
        class146.field2749.method328(class88.field1647[var2].field1219, (byte) -123);
        class226.field4238++;
        if (arg1 > -86) {
            method706(110, false);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)I")
    public static final int method704(int arg0, int arg1) {
        field1838++;
        if (arg1 != -321617529) {
            method704(119, -93);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1833 = null;
        field1841 = null;
        field1834 = null;
        field1839 = null;
        field1845 = null;
        field1840 = null;
        field1844 = null;
        int var1 = -3 / ((arg0 + 58) / 38);
        field1836 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lnc;)V")
    public class101(class145 arg0) {
        this.field1831 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)Laf;")
    public static final class7 method706(int arg0, boolean arg1) {
        field1830++;
        class7 var2 = (class7) class12.field174.method666((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            byte[] var3 = class139.field2580.method941((byte) 56, arg0, 4);
            class7 var4 = new class7();
            if (var3 != null) {
                var4.method38(73, new class46(var3), arg0);
            }
            class12.field174.method664((long) arg0, var4, false);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIJI)Z")
    public static final boolean method707(int arg0, int arg1, long arg2, int arg3) {
        field1832++;
        int var5 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        int var6 = (int) arg2 >> 14 & 0x1F;
        int var7 = (int) arg2 >> 20 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class148 var8 = class190.method1323(var5, -12450);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field2796;
                var9 = var8.field2776;
            } else {
                var9 = var8.field2796;
                var10 = var8.field2776;
            }
            int var11 = var8.field2783;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class207.method1423(3044, var10, 0, arg1, arg3, class240.field4458.field4089[0], var9, 0, 2, true, var11, class240.field4458.field4143[0]);
        } else {
            class207.method1423(3044, 0, var7, arg1, arg3, class240.field4458.field4089[0], 0, var6 + 1, 2, true, 0, class240.field4458.field4143[0]);
        }
        class155.field2999 = class172.field3341;
        class157.field3019 = 2;
        class147.field2759 = class226.field4241;
        class45.field796 = arg0;
        return true;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1834[var1] = var0 - 1;
            var0 += var0;
        }
        field1841 = class208.method1425(105, "red:");
        field1843 = 0;
        field1839 = field1841;
        field1845 = class208.method1425(105, "Please wait )2 attempting to reestablish)3");
        field1840 = field1845;
        field1844 = field1841;
    }
}
