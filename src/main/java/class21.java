import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 {

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "[I")
    public int[] field188 = new int[256];

    @OriginalMember(owner = "mapview!ka", name = "t", descriptor = "[[I")
    public int[][] field206 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "[B")
    public byte[] field194 = new byte[18002];

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "[Z")
    public boolean[] field195 = new boolean[256];

    @OriginalMember(owner = "mapview!ka", name = "v", descriptor = "[I")
    public int[] field208 = new int[257];

    @OriginalMember(owner = "mapview!ka", name = "z", descriptor = "I")
    public int field212 = 0;

    @OriginalMember(owner = "mapview!ka", name = "B", descriptor = "[[I")
    public int[][] field214 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "[I")
    public int[] field200 = new int[6];

    @OriginalMember(owner = "mapview!ka", name = "G", descriptor = "[B")
    public byte[] field219 = new byte[18002];

    @OriginalMember(owner = "mapview!ka", name = "w", descriptor = "[[I")
    public int[][] field209 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "H", descriptor = "[I")
    public int[] field220 = new int[16];

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "[Z")
    public boolean[] field191 = new boolean[16];

    @OriginalMember(owner = "mapview!ka", name = "x", descriptor = "[B")
    public byte[] field210 = new byte[256];

    @OriginalMember(owner = "mapview!ka", name = "u", descriptor = "[[B")
    public byte[][] field207 = new byte[6][258];

    @OriginalMember(owner = "mapview!ka", name = "D", descriptor = "[B")
    public byte[] field216 = new byte[4096];

    @OriginalMember(owner = "mapview!ka", name = "q", descriptor = "I")
    public int field203 = 0;

    @OriginalMember(owner = "mapview!ka", name = "p", descriptor = "I")
    public static int field202 = -1;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "Lua;")
    public static class41 field199 = class16.method86("50(U", true);

    @OriginalMember(owner = "mapview!ka", name = "C", descriptor = "[I")
    public static int[] field215 = new int[256];

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Lua;")
    public static class41 field193 = class16.method86("Summoning Store", true);

    @OriginalMember(owner = "mapview!ka", name = "E", descriptor = "I")
    public static int field217 = 500;

    @OriginalMember(owner = "mapview!ka", name = "P", descriptor = "Lua;")
    public static class41 field227;

    @OriginalMember(owner = "mapview!ka", name = "A", descriptor = "B")
    public byte field213;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "mapview!ka", name = "o", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "mapview!ka", name = "r", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "mapview!ka", name = "F", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "mapview!ka", name = "J", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "mapview!ka", name = "K", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "mapview!ka", name = "L", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "mapview!ka", name = "O", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "mapview!ka", name = "I", descriptor = "Lp;")
    public static class30 field221;

    @OriginalMember(owner = "mapview!ka", name = "s", descriptor = "Ljava/awt/Image;")
    public static Image field205;

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "[B")
    public byte[] field198;

    @OriginalMember(owner = "mapview!ka", name = "M", descriptor = "[B")
    public byte[] field225;

    @OriginalMember(owner = "mapview!ka", name = "y", descriptor = "[Lba;")
    public static class5[] field211;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field215[var0] = var1;
        }
        field227 = class16.method86("???", true);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B[B)Lna;", line = 107)
    public static final class27 method112(byte arg0, byte[] arg1) {
        if (arg1 == null) {
            return null;
        }
        class27 var2 = new class27(arg1, class23.field245, class43.field541, class9.field95, class1.field3, class39.field478);
        class37.method209(854741736);
        if (arg0 > -18) {
            method113(-39);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 168)
    public static void method113(int arg0) {
        field193 = null;
        field227 = null;
        field215 = null;
        field199 = null;
        field211 = null;
        field221 = null;
        if (arg0 >= -118) {
            field221 = null;
        }
        field205 = null;
    }
}
