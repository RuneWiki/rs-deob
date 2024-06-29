import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class19 {

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "[Z")
    public boolean[] field190 = new boolean[16];

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "[I")
    public int[] field188 = new int[257];

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "[I")
    public int[] field198 = new int[256];

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "[[I")
    public int[][] field192 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "I")
    public int field194 = 0;

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "[Z")
    public boolean[] field201 = new boolean[256];

    @OriginalMember(owner = "mapview!ka", name = "w", descriptor = "[B")
    public byte[] field210 = new byte[4096];

    @OriginalMember(owner = "mapview!ka", name = "u", descriptor = "[I")
    public int[] field208 = new int[6];

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "[[I")
    public int[][] field191 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "E", descriptor = "[B")
    public byte[] field218 = new byte[18002];

    @OriginalMember(owner = "mapview!ka", name = "z", descriptor = "[[B")
    public byte[][] field213 = new byte[6][258];

    @OriginalMember(owner = "mapview!ka", name = "G", descriptor = "[[I")
    public int[][] field220 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "v", descriptor = "[I")
    public int[] field209 = new int[16];

    @OriginalMember(owner = "mapview!ka", name = "H", descriptor = "[B")
    public byte[] field221 = new byte[256];

    @OriginalMember(owner = "mapview!ka", name = "A", descriptor = "I")
    public int field214 = 0;

    @OriginalMember(owner = "mapview!ka", name = "L", descriptor = "[B")
    public byte[] field225 = new byte[18002];

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "[J")
    public static long[] field199 = new long[32];

    @OriginalMember(owner = "mapview!ka", name = "r", descriptor = "Lia;")
    public static class15 field205 = class28.method196("Short)2cut", false);

    @OriginalMember(owner = "mapview!ka", name = "q", descriptor = "Lia;")
    public static class15 field204 = class28.method196("b12_full", false);

    @OriginalMember(owner = "mapview!ka", name = "F", descriptor = "Lia;")
    public static class15 field219 = class28.method196("uitext has incorrect number of strings", false);

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "B")
    public byte field195;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "mapview!ka", name = "o", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "mapview!ka", name = "p", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "mapview!ka", name = "s", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "mapview!ka", name = "t", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "mapview!ka", name = "y", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "mapview!ka", name = "B", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "mapview!ka", name = "D", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "mapview!ka", name = "J", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "mapview!ka", name = "K", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "mapview!ka", name = "x", descriptor = "[B")
    public byte[] field211;

    @OriginalMember(owner = "mapview!ka", name = "C", descriptor = "[B")
    public byte[] field216;

    @OriginalMember(owner = "mapview!ka", name = "I", descriptor = "[[Ld;")
    public static class6[][] field222;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 10)
    public static void method142(byte arg0) {
        field219 = null;
        if (arg0 >= -33) {
            method145(49, 28);
        }
        field199 = null;
        field205 = null;
        field222 = null;
        field204 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(B)[Lda;", line = 37)
    public static final class7[] method143(byte arg0) {
        class7[] var1 = new class7[mapview.field336];
        if (arg0 < 25) {
            field199 = null;
        }
        for (int var2 = 0; var2 < mapview.field336; var2++) {
            class7 var3 = new class7();
            var3.field61 = class6.field60[var2];
            var3.field64 = class30.field425[var2];
            var3.field63 = class33.field471[var2];
            var3.field62 = class25.field358[var2];
            int var4 = var3.field63 * var3.field62;
            byte[] var5 = class9.field78[var2];
            var3.field65 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field65[var6] = class10.field79[class29.method201(255, var5[var6])];
            }
            var1[var2] = var3;
        }
        class39.method252(0);
        return var1;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 97)
    public static final Object method144(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 != 18002) {
            return (Object) null;
        } else if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !mapview.field311) {
                try {
                    class28 var3 = (class28) Class.forName("ga").getDeclaredConstructor().newInstance();
                    var3.method194(arg1, arg0 ^ 0xFFFFB9EA);
                    return var3;
                } catch (Throwable var5) {
                    mapview.field311 = true;
                }
            }
            return arg2 ? class12.method64((byte) 119, arg1) : arg1;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(II)Lia;", line = 231)
    public static final class15 method145(int arg0, int arg1) {
        if (arg0 != -137) {
            method145(83, -61);
        }
        return class33.method227(arg0 ^ 0xFFFFFF12, 10, arg1, false);
    }
}
