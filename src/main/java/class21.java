import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 {

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "[I")
    public int[] field208 = new int[257];

    @OriginalMember(owner = "mapview!ka", name = "p", descriptor = "[[I")
    public int[][] field210 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "[B")
    public byte[] field206 = new byte[4096];

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "I")
    public int field203 = 0;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "I")
    public int field207 = 0;

    @OriginalMember(owner = "mapview!ka", name = "D", descriptor = "[I")
    public int[] field224 = new int[256];

    @OriginalMember(owner = "mapview!ka", name = "x", descriptor = "[Z")
    public boolean[] field218 = new boolean[256];

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "[I")
    public int[] field205 = new int[6];

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "[[I")
    public int[][] field199 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "q", descriptor = "[B")
    public byte[] field211 = new byte[18002];

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "[I")
    public int[] field200 = new int[16];

    @OriginalMember(owner = "mapview!ka", name = "z", descriptor = "[B")
    public byte[] field220 = new byte[256];

    @OriginalMember(owner = "mapview!ka", name = "M", descriptor = "[[B")
    public byte[][] field233 = new byte[6][258];

    @OriginalMember(owner = "mapview!ka", name = "H", descriptor = "[Z")
    public boolean[] field228 = new boolean[16];

    @OriginalMember(owner = "mapview!ka", name = "w", descriptor = "[B")
    public byte[] field217 = new byte[18002];

    @OriginalMember(owner = "mapview!ka", name = "F", descriptor = "[[I")
    public int[][] field226 = new int[6][258];

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Lf;")
    public static class10 field201 = class23.method139("???", (byte) -113);

    @OriginalMember(owner = "mapview!ka", name = "B", descriptor = "I")
    public static int field222 = 1;

    @OriginalMember(owner = "mapview!ka", name = "G", descriptor = "Lf;")
    public static class10 field227 = class23.method139("Sandpit", (byte) -84);

    @OriginalMember(owner = "mapview!ka", name = "E", descriptor = "Lf;")
    public static class10 field225 = class23.method139("uitext has incorrect number of strings", (byte) -70);

    @OriginalMember(owner = "mapview!ka", name = "C", descriptor = "Lf;")
    public static class10 field223 = class23.method139("Dairy Churn", (byte) -112);

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "Lj;")
    private static class18 field202 = new class18();

    @OriginalMember(owner = "mapview!ka", name = "N", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "mapview!ka", name = "O", descriptor = "Lna;")
    public static class27 field235 = new class27();

    @OriginalMember(owner = "mapview!ka", name = "R", descriptor = "Lf;")
    public static class10 field238 = class23.method139("labels)3dat", (byte) -73);

    @OriginalMember(owner = "mapview!ka", name = "T", descriptor = "Lf;")
    public static class10 field240 = class23.method139("Slayer Master", (byte) -66);

    @OriginalMember(owner = "mapview!ka", name = "U", descriptor = "I")
    public static int field241 = 0;

    @OriginalMember(owner = "mapview!ka", name = "I", descriptor = "B")
    public byte field229;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "mapview!ka", name = "o", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "mapview!ka", name = "r", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "mapview!ka", name = "s", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "mapview!ka", name = "t", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "mapview!ka", name = "v", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "mapview!ka", name = "y", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "mapview!ka", name = "A", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "mapview!ka", name = "J", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "mapview!ka", name = "K", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "mapview!ka", name = "L", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "mapview!ka", name = "P", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "mapview!ka", name = "Q", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "mapview!ka", name = "S", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "mapview!ka", name = "u", descriptor = "Lfa;")
    public static class11 field215;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "[B")
    public byte[] field195;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "[B")
    public byte[] field196;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 15)
    public static final void method131(Component arg0, byte arg1) {
        if (arg1 > 87) {
            arg0.addMouseListener(class7.field65);
            arg0.addMouseMotionListener(class7.field65);
            arg0.addFocusListener(class7.field65);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([BI)[B", line = 57)
    public static final byte[] method132(byte[] arg0, int arg1) {
        class28 var2 = new class28(arg0);
        int var3 = -94 / ((28 - arg1) / 63);
        int var4 = var2.method182(-117);
        int var5 = var2.method181(-9110);
        if (var5 < 0 || class5.field38 != 0 && var5 > class5.field38) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var8 = new byte[var5];
            var2.method186(var5, 0, 78, var8);
            return var8;
        } else {
            int var6 = var2.method181(-9110);
            if (var6 < 0 || class5.field38 != 0 && var6 > class5.field38) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var4 == 1) {
                class3.method15(var7, var6, arg0, var5, 9);
            } else {
                field202.method111(var2, var7, (byte) 85);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 208)
    public static void method133(byte arg0) {
        field202 = null;
        field215 = null;
        field225 = null;
        field227 = null;
        if (arg0 != -2) {
            method131(null, (byte) -66);
        }
        field238 = null;
        field240 = null;
        field201 = null;
        field235 = null;
        field223 = null;
    }
}
