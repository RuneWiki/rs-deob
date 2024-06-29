import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class101 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Loh;")
    public static class263 field1919 = class253.method1681(-125, " (X");

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Loh;")
    public static class263 field1921 = class253.method1681(-120, "null");

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Llb;")
    public static class127 field1922 = new class127(200);

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Loh;")
    private static class263 field1926 = class253.method1681(-126, "Sat");

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Loh;")
    private static class263 field1927 = class253.method1681(-122, "Fri");

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Loh;")
    public static class263 field1931 = class253.method1681(-123, ")1");

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Z")
    public static boolean field1930 = true;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Loh;")
    private static class263 field1928 = class253.method1681(-128, "Sun");

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Loh;")
    private static class263 field1934 = class253.method1681(-122, "Tue");

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Loh;")
    private static class263 field1933 = class253.method1681(-118, "Wed");

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Z")
    public static boolean field1936 = false;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Loh;")
    private static class263 field1935 = class253.method1681(-123, "Thu");

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Loh;")
    private static class263 field1929 = class253.method1681(-124, "Mon");

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[Loh;")
    public static class263[] field1937 = new class263[] { field1928, field1929, field1934, field1933, field1935, field1927, field1926 };

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Llb;")
    public static class127 field1932 = new class127(64);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
    public static boolean field1925;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
    public static final void method683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class18.field419 = arg5;
        class214.field3811 = arg3;
        class109.field2048 = arg4;
        class241.field4237 = arg2;
        if (arg0 != 128) {
            return;
        }
        class40.field905 = arg1;
        if (class214.field3811 >= 100) {
            int var6 = class109.field2048 * 128 + 64;
            int var7 = class18.field419 * 128 + 64;
            int var8 = class120.method781(class12.field321, var6, false, var7) - class40.field905;
            int var9 = var6 - class127.field2357;
            int var10 = var7 - class152.field2738;
            int var11 = var8 - class87.field1750;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class73.field1528 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class215.field3816 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class73.field1528 < 128) {
                class73.field1528 = 128;
            }
            if (class73.field1528 > 383) {
                class73.field1528 = 383;
            }
        }
        class89.field1772 = 2;
        field1924++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        field1932 = null;
        field1929 = null;
        field1934 = null;
        field1935 = null;
        field1937 = null;
        field1928 = null;
        field1926 = null;
        if (arg0 != 1) {
            method684(-25);
        }
        field1931 = null;
        field1927 = null;
        field1922 = null;
        field1933 = null;
        field1921 = null;
        field1919 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)I")
    public static final int method685(int arg0, int arg1, int arg2) {
        field1920++;
        int var3 = arg0 - 1 & arg1 >> 31;
        return arg2 == -149566721 ? ((arg1 >>> 31) + arg1) % arg0 + var3 : 37;
    }
}
