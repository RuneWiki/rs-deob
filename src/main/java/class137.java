import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class137 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field1924 = 0;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[[B")
    public byte[][] field1923 = new byte[6][258];

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[I")
    public int[] field1919 = new int[16];

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[Z")
    public boolean[] field1929 = new boolean[16];

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "[[I")
    public int[][] field1937 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[[I")
    public int[][] field1931 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "[B")
    public byte[] field1936 = new byte[4096];

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public int field1943 = 0;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "[Z")
    public boolean[] field1949 = new boolean[256];

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "[B")
    public byte[] field1933 = new byte[256];

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
    public int[] field1932 = new int[257];

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "[I")
    public int[] field1947 = new int[256];

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[B")
    public byte[] field1934 = new byte[18002];

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "[[I")
    public int[][] field1950 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "[I")
    public int[] field1955 = new int[6];

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "[B")
    public byte[] field1956 = new byte[18002];

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field1922 = 0;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "[S")
    public static short[] field1938 = new short[] { 3, 40, 17, 36, 9, 45, 25, 38 };

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field1951 = 2;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "B")
    public byte field1935;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public int field1945;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public int field1946;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public int field1948;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[B")
    public byte[] field1921;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "[B")
    public byte[] field1941;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[Lkh;")
    public static class11[] field1928;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Loj;")
    public static final class213 method819(byte arg0) {
        field1926++;
        if (arg0 > -17) {
            return null;
        }
        class213 var1 = (class213) class288.field4071.method1606(8);
        if (var1 == null) {
            return new class213();
        } else {
            class247.field3359--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
    public static final void method820(byte arg0, int arg1, int arg2) {
        field1927++;
        class189 var3 = new class189(16);
        if (arg0 != 94) {
            field1938 = null;
        }
        for (class111 var4 = (class111) class319.field4527.method1212(arg0 - 208); var4 != null; var4 = (class111) class319.field4527.method1207(false)) {
            var4.method2290((byte) 98);
            int var5 = (int) (var4.field5248 >> 28);
            int var6 = (int) (var4.field5248 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field5248 & 0x3FFFL) - arg2;
            if (var7 >= 0 && var6 >= 0 && class279.field3935 > var7 && class164.field2287 > var6) {
                var3.method1202(arg0 - 95, (long) (var7 | var5 << 28 | var6 << 14), var4);
            }
        }
        class319.field4527 = var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        field1938 = null;
        if (arg0 == 0) {
            field1928 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZII)V")
    public static final void method822(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0) {
            method819((byte) 52);
        }
        if (class341.field5018 == 0) {
            class193.method1236(4079, false);
        } else {
            class211.field2882 = class341.field5018;
            client.method1065((byte) -77, 0);
        }
        field1920++;
        class297.field4238 = arg4;
        class45.field554 = arg2;
        class379.field5569 = arg1;
        class106.method578(arg3);
    }
}
