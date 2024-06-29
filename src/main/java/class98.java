import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class98 extends class34 {

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    private final int field1933;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    private final int field1931;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    private final int field1936;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    private final int field1927;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    private final int field1929;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    private final int field1935;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    private final int field1932;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    private final int field1937;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Lob;")
    private static class141 field1930 = class175.method1195(40, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Lob;")
    public static class141 field1938 = field1930;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lvc;")
    public static class212 field1926 = new class212(64);

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "Lob;")
    private static class141 field1941 = class175.method1195(40, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Lob;")
    public static class141 field1942 = class175.method1195(40, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "Lob;")
    public static class141 field1939 = field1941;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "Lob;")
    public static class141 field1943 = class175.method1195(40, "(Y");

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "Lvc;")
    public static class212 field1940 = new class212(16);

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "Lob;")
    public static class141 field1944 = class175.method1195(40, "Freie Welt");

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "Lob;")
    public static class141 field1946 = class175.method1195(40, "::clientdrop");

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "[I")
    public static int[] field1947 = new int[2000];

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "Lob;")
    public static class141 field1945 = class175.method1195(40, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)V")
    public final void method24(int arg0, byte arg1, int arg2) {
        if (arg1 == 114) {
            ++field1928;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lob;Lpe;ILob;)[Lkc;")
    public static final class102[] method652(class141 arg0, class154 arg1, int arg2, class141 arg3) {
        int var4 = arg1.method1071((byte) -115, arg3);
        int var5 = arg1.method1059(var4, true, arg0);
        ++field1925;
        if (arg2 != -72515348) {
            field1939 = null;
        }
        return class85.method581(var4, arg2 + 72515384, var5, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1933 = arg7;
        this.field1931 = arg3;
        this.field1936 = arg0;
        this.field1927 = arg1;
        this.field1929 = arg2;
        this.field1935 = arg6;
        this.field1932 = arg4;
        this.field1937 = arg5;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method653(byte arg0) {
        field1926 = null;
        field1938 = null;
        field1942 = null;
        field1947 = null;
        if (arg0 >= 101) {
            field1944 = null;
            field1946 = null;
            field1939 = null;
            field1940 = null;
            field1945 = null;
            field1943 = null;
            field1930 = null;
            field1941 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)V")
    public final void method22(int arg0, int arg1, boolean arg2) {
        ++field1924;
        if (!arg2) {
            this.method24(17, (byte) 48, 49);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)V")
    public final void method27(byte arg0, int arg1, int arg2) {
        ++field1934;
        int var4 = this.field1936 * arg2 >> 12;
        int var5 = this.field1927 * arg1 >> 12;
        int var6 = this.field1929 * arg2 >> 12;
        int var7 = this.field1931 * arg1 >> 12;
        int var8 = this.field1935 * arg2 >> 12;
        int var9 = this.field1932 * arg2 >> 12;
        int var10 = this.field1933 * arg1 >> 12;
        if (arg0 != 94) {
            field1941 = null;
        }
        int var11 = this.field1937 * arg1 >> 12;
        class136.method854((byte) 42, var11, var8, var7, var6, var4, super.field689, var5, var10, var9);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public static final void method654(int arg0, int arg1, int arg2) {
        class153 var3 = class131.field2506[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2926 = null;
        }
    }
}
