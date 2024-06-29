import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class105 extends class183 {

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Ldj;")
    private static class44 field1902 = class89.method650(255, "Cancel");

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "Ldj;")
    public static class44 field1920 = class89.method650(255, "leuchten2:");

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "[Ldj;")
    public static class44[] field1922 = new class44[100];

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Ldj;")
    public static class44 field1929 = field1902;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "Ldj;")
    public static class44 field1930 = class89.method650(255, "Standort");

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public int field1927;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "Ljb;")
    public class100 field1919;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lli;")
    public class129 field1911;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Lti;")
    public class209 field1928;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "Lhi;")
    public class86 field1925;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method765(int arg0) {
        field1922 = null;
        field1929 = null;
        field1902 = null;
        field1920 = null;
        field1930 = null;
        if (arg0 != 0) {
            method766(115, 3, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V")
    public static final void method766(int arg0, int arg1, byte arg2) {
        field1916++;
        class49 var3 = class45.method343(arg0, (byte) -98);
        if (arg2 != 6) {
            field1920 = null;
        }
        int var4 = var3.field907;
        int var5 = var3.field906;
        int var6 = var3.field916;
        int var7 = class4.field58[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class136.field2435[var4] = class238.method1545(class29.method202(~var8, class136.field2435[var4]), class29.method202(var8, arg1 << var5));
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public final void method767(int arg0) {
        this.field1928 = null;
        this.field1925 = null;
        field1901++;
        this.field1911 = null;
        if (arg0 > -15) {
            field1922 = null;
        }
        this.field1919 = null;
    }
}
