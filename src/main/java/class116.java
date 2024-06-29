import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class116 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[[I")
    public static int[][] field2140 = new int[5][5000];

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lsg;")
    private static class169 field2143 = class165.method1060(" has logged out)3", 1536);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lsg;")
    public static class169 field2139 = field2143;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lsg;")
    public static class169 field2141 = class165.method1060("leuchten2:", 1536);

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lua;")
    public static class181 field2144 = new class181(64);

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2146 = 0;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lsg;")
    public static class169 field2145 = class165.method1060("<col=ffff00>", 1536);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lga;")
    public static class57 field2148;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
    public static int[] field2147;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "[[[B")
    public static byte[][][] field2149;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ)V")
    public static final void method710(int arg0, int arg1, boolean arg2) {
        int[] var3 = new int[4];
        field2142++;
        var3[0] = arg1;
        if (!arg2) {
            field2146 = -73;
        }
        int[] var4 = new int[4];
        var4[0] = arg0;
        int var5 = 1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class122.field2250[var6] != arg1) {
                var3[var5] = class122.field2250[var6];
                var4[var5] = class115.field2090[var6];
                var5++;
            }
        }
        class122.field2250 = var3;
        class115.field2090 = var4;
        class154.method1004(class159.field3038, 0, class115.field2090, class159.field3038.length - 1, arg2, class122.field2250);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method711(byte arg0) {
        if (arg0 != -30) {
            field2144 = null;
        }
        field2141 = null;
        field2149 = null;
        field2139 = null;
        field2144 = null;
        field2140 = null;
        field2148 = null;
        field2143 = null;
        field2145 = null;
        field2147 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)J")
    public static final synchronized long method712(byte arg0) {
        field2138++;
        long var1 = System.currentTimeMillis();
        if (class99.field1858 > var1) {
            class190.field3751 += class99.field1858 - var1;
        }
        if (arg0 > -47) {
            method711((byte) -22);
        }
        class99.field1858 = var1;
        return var1 + class190.field3751;
    }
}
