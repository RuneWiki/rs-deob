import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class126 {

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "S")
    public static short field1849 = 205;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field1861 = 50;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
    public static int[] field1858 = new int[field1861];

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
    public static int[] field1848 = new int[field1861];

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "[I")
    public static int[] field1853 = new int[field1861];

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[I")
    public static int[] field1855 = new int[field1861];

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1860 = new String[field1861];

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    public static int[] field1846 = new int[field1861];

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field1862 = -1;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    public static int[] field1852 = new int[field1861];

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
    public static int[] field1864 = new int[field1861];

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[I")
    public static int[] field1859;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)V")
    public static final void method906(int arg0, boolean arg1) {
        class101.field1490 = 1000 / arg0;
        field1854++;
        if (!arg1) {
            field1861 = -14;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method907(int arg0) {
        field1856++;
        class82.method597(false, arg0 ^ 0xFFFFCA77);
        System.gc();
        if (arg0 != 13751) {
            method911(-64);
        }
        class256.method1811(25, true);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method908(int arg0) {
        field1865++;
        int var1 = 109 % ((62 - arg0) / 58);
        if (class223.field3572 != null) {
            class223.field3572.method1599(-41);
        }
        if (class240.field3830 != null) {
            class240.field3830.method1599(-115);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
    public static void method909(int arg0) {
        field1858 = null;
        field1864 = null;
        field1855 = null;
        field1853 = null;
        field1860 = null;
        if (arg0 == 0) {
            field1859 = null;
            field1848 = null;
            field1846 = null;
            field1852 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static final void method910(boolean arg0) {
        if (!arg0) {
            field1859 = null;
        }
        class59.field832.method1558(-70);
        field1847++;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static final void method911(int arg0) {
        field1863++;
        if (arg0 != -17712) {
            field1853 = null;
        }
        if (class38.field533 == 30) {
            class256.method1811(25, true);
        }
    }
}
