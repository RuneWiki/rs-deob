import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class20 {

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "[I")
    public int[] field191 = new int[257];

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "[Z")
    public boolean[] field193 = new boolean[256];

    @OriginalMember(owner = "mapview!k", name = "t", descriptor = "[Z")
    public boolean[] field207 = new boolean[16];

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "[B")
    public byte[] field197 = new byte[18002];

    @OriginalMember(owner = "mapview!k", name = "w", descriptor = "[I")
    public int[] field210 = new int[256];

    @OriginalMember(owner = "mapview!k", name = "o", descriptor = "[[I")
    public int[][] field202 = new int[6][258];

    @OriginalMember(owner = "mapview!k", name = "q", descriptor = "I")
    public int field204 = 0;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "I")
    public int field194 = 0;

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "[[I")
    public int[][] field200 = new int[6][258];

    @OriginalMember(owner = "mapview!k", name = "p", descriptor = "[I")
    public int[] field203 = new int[6];

    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "[B")
    public byte[] field201 = new byte[18002];

    @OriginalMember(owner = "mapview!k", name = "z", descriptor = "[B")
    public byte[] field213 = new byte[256];

    @OriginalMember(owner = "mapview!k", name = "F", descriptor = "[[I")
    public int[][] field219 = new int[6][258];

    @OriginalMember(owner = "mapview!k", name = "A", descriptor = "[I")
    public int[] field214 = new int[16];

    @OriginalMember(owner = "mapview!k", name = "B", descriptor = "[[B")
    public byte[][] field215 = new byte[6][258];

    @OriginalMember(owner = "mapview!k", name = "I", descriptor = "[B")
    public byte[] field222 = new byte[4096];

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "[J")
    private static long[] field199 = new long[256];

    @OriginalMember(owner = "mapview!k", name = "v", descriptor = "Lta;")
    public static class37 field209 = method87(-84, "u_pass");

    @OriginalMember(owner = "mapview!k", name = "P", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "mapview!k", name = "N", descriptor = "Lta;")
    public static class37 field227;

    @OriginalMember(owner = "mapview!k", name = "Q", descriptor = "Lta;")
    public static class37 field230;

    @OriginalMember(owner = "mapview!k", name = "K", descriptor = "Lta;")
    public static class37 field224;

    @OriginalMember(owner = "mapview!k", name = "M", descriptor = "Lta;")
    public static class37 field226;

    @OriginalMember(owner = "mapview!k", name = "L", descriptor = "Lta;")
    public static class37 field225;

    @OriginalMember(owner = "mapview!k", name = "J", descriptor = "Lta;")
    public static class37 field223;

    @OriginalMember(owner = "mapview!k", name = "S", descriptor = "Lta;")
    public static class37 field232;

    @OriginalMember(owner = "mapview!k", name = "T", descriptor = "Lta;")
    public static class37 field233;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "B")
    public byte field190;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "mapview!k", name = "r", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "mapview!k", name = "s", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "mapview!k", name = "x", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "mapview!k", name = "y", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "mapview!k", name = "D", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "mapview!k", name = "E", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "mapview!k", name = "G", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "mapview!k", name = "O", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "mapview!k", name = "u", descriptor = "[B")
    public byte[] field208;

    @OriginalMember(owner = "mapview!k", name = "C", descriptor = "[B")
    public byte[] field216;

    @OriginalMember(owner = "mapview!k", name = "H", descriptor = "[B")
    public static byte[] field221;

    @OriginalMember(owner = "mapview!k", name = "R", descriptor = "[I")
    public static int[] field231;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILjava/lang/String;)Lta;", line = 5)
    public static final class37 method87(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        if (arg0 > -82) {
            method89((byte) 25);
        }
        class37 var4 = new class37();
        int var5 = 0;
        var4.field499 = new byte[var3];
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field499[var4.field509++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field499[var4.field509++] = (byte) var6;
            }
        }
        var4.method225((byte) -117);
        return var4.method238(-1);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I[BB)I", line = 60)
    public static final int method88(int arg0, byte[] arg1, byte arg2) {
        if (arg2 != 31) {
            method89((byte) 12);
        }
        return class23.method117(arg0, 0, arg1, arg2 ^ 0x1F98);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B)V", line = 112)
    public static void method89(byte arg0) {
        field230 = null;
        field225 = null;
        field209 = null;
        field221 = null;
        field232 = null;
        field226 = null;
        if (arg0 != 74) {
            method90(null, null, false, null);
        }
        field227 = null;
        field223 = null;
        field231 = null;
        field199 = null;
        field233 = null;
        field224 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field199[var0] = var1;
        }
        field229 = 0;
        field227 = method87(-110, "map");
        field230 = method87(-88, "loc)3dat");
        field224 = method87(-120, "Farming shop");
        field226 = method87(-104, "Hunter Store");
        field225 = method87(-127, "Cooking Range");
        field223 = method87(-115, "map");
        field232 = method87(-87, "37(U");
        field233 = method87(-89, "Bank");
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Lfa;Lta;ZLta;)[Lga;", line = 195)
    public static final class13[] method90(class11 arg0, class37 arg1, boolean arg2, class37 arg3) {
        if (arg2) {
            return (class13[]) null;
        } else {
            int var4 = arg0.method43(arg1, (byte) -66);
            int var5 = arg0.method50(true, arg3, var4);
            return class35.method205(var5, -10984, var4, arg0);
        }
    }
}
