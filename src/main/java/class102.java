import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class102 {

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    public static int[] field1857 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Z")
    public static boolean field1853 = false;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lha;")
    public static class46 field1858 = class271.method1828("zap", -46);

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lha;")
    public static class46 field1856 = class271.method1828(":duelstake:", -46);

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
    public static int[] field1860 = new int[2];

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lha;")
    public static class46 field1861 = class271.method1828("gelb:", -46);

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public static final void method774(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > arg2) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class6.field100[var5][arg1] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class6.field100[var6][arg1] = arg0;
            }
        }
        if (arg3 != 1) {
            method778((class181) null, false);
        }
        field1851++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z")
    public static final boolean method775(int arg0, int arg1) {
        if (arg1 > -12) {
            field1858 = null;
        }
        field1859++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method776(byte arg0) {
        field1856 = null;
        field1858 = null;
        field1860 = null;
        if (arg0 != -112) {
            field1857 = null;
        }
        field1861 = null;
        field1857 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)V")
    public static final void method777(int arg0, byte arg1, int arg2) {
        field1852++;
        class146 var3 = class6.method22((byte) 16, 5, arg0);
        if (arg1 != 118) {
            method774(-41, -122, -96, -70, 22);
        }
        var3.method1088(11102);
        var3.field2640 = arg2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lpi;Z)V")
    public static final void method778(class181 arg0, boolean arg1) {
        if (!arg1) {
            field1858 = null;
        }
        class126.field2312 = arg0;
        field1854++;
    }
}
