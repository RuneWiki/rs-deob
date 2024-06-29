import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 extends class5 {

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
    private int field1934 = 0;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field1922 = 0;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "Lhb;")
    public static class44 field1929 = class102.method810("Gegenstand f-Ur Mitglieder", -28606);

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "Z")
    public static boolean field1931 = false;

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "Lhb;")
    private static class44 field1939 = class102.method810("Drop", -28606);

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "[Lqd;")
    public static class100[] field1940 = new class100[256];

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Lhb;")
    private static class44 field1918 = class102.method810("Please subscribe)1 or use a different world)3", -28606);

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "Lhb;")
    public static class44 field1941 = field1918;

    @OriginalMember(owner = "client!me", name = "vb", descriptor = "Lhb;")
    public static class44 field1945 = class102.method810("(U2", -28606);

    @OriginalMember(owner = "client!me", name = "ob", descriptor = "Lhb;")
    public static class44 field1938 = field1939;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "[I")
    public static int[] field1933 = new int[25];

    @OriginalMember(owner = "client!me", name = "xb", descriptor = "I")
    public static volatile int field1947 = 0;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "Lhb;")
    public static class44 field1927 = class102.method810("@or1@", -28606);

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Lfc;")
    public static class34 field1917 = new class34(50);

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!me", name = "sb", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!me", name = "tb", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!me", name = "wb", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "Lhc;")
    public static class45 field1924;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
    public static int[] field1921;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lwd;IBI)V", line = 16)
    private final void method639(class131 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 126) {
            this.method640((byte) 127, null, 78);
        }
        if (arg1 == 1) {
            this.field1934 = arg0.method974(255);
        }
        field1942++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLwd;I)V", line = 38)
    public final void method640(byte arg0, class131 arg1, int arg2) {
        int var4 = -43 / ((52 - arg0) / 57);
        field1923++;
        while (true) {
            int var5 = arg1.method971(true);
            if (var5 == 0) {
                return;
            }
            this.method639(arg1, var5, (byte) 127, arg2);
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V", line = 108)
    public static void method641(int arg0) {
        field1918 = null;
        field1921 = null;
        field1941 = null;
        field1940 = null;
        field1938 = null;
        field1924 = null;
        field1933 = null;
        field1929 = null;
        field1939 = null;
        field1917 = null;
        field1945 = null;
        field1927 = null;
        if (arg0 != -2) {
            method641(-18);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V", line = 138)
    private final void method642(int arg0, int arg1) {
        double var3 = (double) (arg1 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field1943++;
        double var7 = var5;
        double var9 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var9 < var5) {
            var7 = var9;
        }
        double var11 = var5;
        if (var5 < var9) {
            var11 = var9;
        }
        if (var3 < var7) {
            var7 = var3;
        }
        double var13 = 0.0D;
        if (var3 > var11) {
            var11 = var3;
        }
        double var15 = (var7 + var11) / 2.0D;
        this.field1936 = (int) (var15 * 256.0D);
        if (arg0 < 49) {
            this.method643((byte) 28);
        }
        double var17 = 0.0D;
        if (this.field1936 < 0) {
            this.field1936 = 0;
        } else if (this.field1936 > 255) {
            this.field1936 = 255;
        }
        if (var7 != var11) {
            if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7);
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 2.0D;
            } else if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7) + 4.0D;
            }
            if (var15 < 0.5D) {
                var17 = (var11 - var7) / (var7 + var11);
            }
            if (var15 >= 0.5D) {
                var17 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        double var19 = var13 / 6.0D;
        if (var15 > 0.5D) {
            this.field1944 = (int) ((1.0D - var15) * var17 * 512.0D);
        } else {
            this.field1944 = (int) (var15 * var17 * 512.0D);
        }
        this.field1930 = (int) (var17 * 256.0D);
        if (this.field1944 < 1) {
            this.field1944 = 1;
        }
        this.field1920 = (int) ((double) this.field1944 * var19);
        if (this.field1930 < 0) {
            this.field1930 = 0;
        } else if (this.field1930 > 255) {
            this.field1930 = 255;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V", line = 240)
    public final void method643(byte arg0) {
        field1925++;
        this.method642(71, this.field1934);
        if (arg0 != -28) {
            this.method642(-61, -72);
        }
    }
}
