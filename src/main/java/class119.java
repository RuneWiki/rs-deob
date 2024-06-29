import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class119 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[[I")
    public int[][] field2127 = new int[6][258];

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "[[B")
    public byte[][] field2142 = new byte[6][258];

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "[I")
    public int[] field2143 = new int[16];

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    public int[] field2133 = new int[257];

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public int field2148 = 0;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[[I")
    public int[][] field2132 = new int[6][258];

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "[I")
    public int[] field2151 = new int[6];

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "[[I")
    public int[][] field2141 = new int[6][258];

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[Z")
    public boolean[] field2138 = new boolean[16];

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
    public int[] field2137 = new int[256];

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "[B")
    public byte[] field2144 = new byte[4096];

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "[B")
    public byte[] field2145 = new byte[18002];

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public int field2153 = 0;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "[Z")
    public boolean[] field2149 = new boolean[256];

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "[B")
    public byte[] field2150 = new byte[18002];

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "[B")
    public byte[] field2159 = new byte[256];

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Lia;")
    public static class257 field2154 = class28.method234(-35, "p11_full");

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lia;")
    public static class257 field2135 = class28.method234(98, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "Lia;")
    public static class257 field2156 = class28.method234(98, "Konfig geladen)3");

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "B")
    public byte field2130;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[B")
    public byte[] field2124;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "[B")
    public byte[] field2146;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
    public static int[] field2128;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method842(int arg0) {
        field2135 = null;
        if (arg0 == 9806) {
            field2128 = null;
            field2154 = null;
            field2156 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZ)V")
    public static final void method843(byte arg0, boolean arg1) {
        field2155++;
        byte var2 = 4;
        byte[][] var3 = class135.field2409;
        int var4 = 108 / ((arg0 - 28) / 40);
        int var5 = var3.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var12 = (class197.field3328[var6] >> 8) * 64 - class244.field4232;
            int var13 = (class197.field3328[var6] & 0xFF) * 64 - class231.field3878;
            byte[] var14 = var3[var6];
            if (var14 != null) {
                class39.method319((byte) 75);
                class233.method1536(class237.field4059 * 8 - 48, class173.field2961, var13, var12, var14, -125, class258.field4481 * 8 - 48, arg1);
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class197.field3328[var7] >> 8) * 64 - class244.field4232;
            byte[] var9 = var3[var7];
            int var10 = (class197.field3328[var7] & 0xFF) * 64 - class231.field3878;
            if (var9 == null && class258.field4481 < 800) {
                class39.method319((byte) 74);
                for (int var11 = 0; var11 < var2; var11++) {
                    class62.method469(var11, var10, -23262, var8, 64, 64);
                }
            }
        }
    }
}
