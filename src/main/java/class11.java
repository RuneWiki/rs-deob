import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 {

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "[[I")
    public int[][] field194 = new int[6][258];

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "[I")
    public int[] field189 = new int[6];

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "[[I")
    public int[][] field185 = new int[6][258];

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "[B")
    public byte[] field208 = new byte[18002];

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "[Z")
    public boolean[] field196 = new boolean[16];

    @OriginalMember(owner = "mapview!f", name = "n", descriptor = "[I")
    public int[] field193 = new int[257];

    @OriginalMember(owner = "mapview!f", name = "I", descriptor = "[Z")
    public boolean[] field212 = new boolean[256];

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "[[B")
    public byte[][] field204 = new byte[6][258];

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "[[I")
    public int[][] field190 = new int[6][258];

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "[I")
    public int[] field202 = new int[16];

    @OriginalMember(owner = "mapview!f", name = "t", descriptor = "[B")
    public byte[] field199 = new byte[256];

    @OriginalMember(owner = "mapview!f", name = "L", descriptor = "[B")
    public byte[] field215 = new byte[18002];

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "[I")
    public int[] field182 = new int[256];

    @OriginalMember(owner = "mapview!f", name = "M", descriptor = "[B")
    public byte[] field216 = new byte[4096];

    @OriginalMember(owner = "mapview!f", name = "G", descriptor = "I")
    public int field210 = 0;

    @OriginalMember(owner = "mapview!f", name = "K", descriptor = "I")
    public int field214 = 0;

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "Lh;")
    public static class15 field180 = class26.method190(true, "Makeover Mage");

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "Lh;")
    public static class15 field184 = class26.method190(true, "Key");

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "Lh;")
    public static class15 field207 = class26.method190(true, "Guide");

    @OriginalMember(owner = "mapview!f", name = "A", descriptor = "[J")
    public static long[] field206 = new long[32];

    @OriginalMember(owner = "mapview!f", name = "E", descriptor = "B")
    public byte field209;

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "mapview!f", name = "l", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "mapview!f", name = "m", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "mapview!f", name = "s", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "mapview!f", name = "v", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "mapview!f", name = "x", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "mapview!f", name = "z", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "mapview!f", name = "H", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "mapview!f", name = "J", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "mapview!f", name = "N", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "[B")
    public byte[] field197;

    @OriginalMember(owner = "mapview!f", name = "O", descriptor = "[B")
    public byte[] field218;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Z)La;", line = 124)
    public static final class1 method89(boolean arg0) {
        try {
            if (arg0) {
                field206 = null;
            }
            return (class1) Class.forName("ma").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class31();
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(Z)V", line = 146)
    public static void method90(boolean arg0) {
        if (!arg0) {
            method89(false);
        }
        field206 = null;
        field184 = null;
        field180 = null;
        field207 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(B)V", line = 163)
    public static final void method91(byte arg0) {
        class9 var1 = class15.field251;
        synchronized (class15.field251) {
            class7.field139 = class26.field357;
            field183 = class7.field137;
            class33.field439 = class25.field342;
            class6.field124 = class18.field285;
            class31.field421 = class2.field97;
            if (arg0 > -24) {
                field183 = 42;
            }
            class22.field319 = mapview.field29;
            class18.field285 = 0;
        }
    }
}
