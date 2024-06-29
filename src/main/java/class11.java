import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 {

    @OriginalMember(owner = "mapview!f", name = "m", descriptor = "[I")
    public int[] field150 = new int[257];

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "[Z")
    public boolean[] field138 = new boolean[256];

    @OriginalMember(owner = "mapview!f", name = "n", descriptor = "[[I")
    public int[][] field151 = new int[6][258];

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "[B")
    public byte[] field160 = new byte[256];

    @OriginalMember(owner = "mapview!f", name = "t", descriptor = "I")
    public int field157 = 0;

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "[I")
    public int[] field142 = new int[256];

    @OriginalMember(owner = "mapview!f", name = "l", descriptor = "[[I")
    public int[][] field149 = new int[6][258];

    @OriginalMember(owner = "mapview!f", name = "z", descriptor = "[Z")
    public boolean[] field163 = new boolean[16];

    @OriginalMember(owner = "mapview!f", name = "D", descriptor = "[B")
    public byte[] field167 = new byte[18002];

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "[B")
    public byte[] field141 = new byte[18002];

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "[B")
    public byte[] field166 = new byte[4096];

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "I")
    public int field139 = 0;

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "[[I")
    public int[][] field140 = new int[6][258];

    @OriginalMember(owner = "mapview!f", name = "x", descriptor = "[I")
    public int[] field161 = new int[6];

    @OriginalMember(owner = "mapview!f", name = "J", descriptor = "[I")
    public int[] field173 = new int[16];

    @OriginalMember(owner = "mapview!f", name = "K", descriptor = "[[B")
    public byte[][] field174 = new byte[6][258];

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "Z")
    public static boolean field153 = true;

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "Lh;")
    public static class15 field155 = class18.method153("mapscene", 1);

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "[I")
    public static int[] field144 = new int[128];

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "Lh;")
    public static class15 field148 = class18.method153("Brewery", 1);

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "B")
    public byte field152;

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "mapview!f", name = "v", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "mapview!f", name = "A", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "mapview!f", name = "E", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "mapview!f", name = "F", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "mapview!f", name = "G", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "mapview!f", name = "H", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "mapview!f", name = "I", descriptor = "Lh;")
    public static class15 field172;

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "[B")
    public byte[] field145;

    @OriginalMember(owner = "mapview!f", name = "s", descriptor = "[B")
    public byte[] field156;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 21)
    public static final int method92(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        if (arg0 != 26138) {
            field172 = null;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(B)V", line = 95)
    public static final void method93(byte arg0) {
        class25 var1 = class21.field288;
        synchronized (class21.field288) {
            class21.field301 = class22.field302;
            if (class19.field265 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class21.field295[var2] = false;
                }
                class19.field265 = class9.field129;
            } else {
                while (class9.field129 != class19.field265) {
                    int var3 = class12.field176[class9.field129];
                    class9.field129 = class9.field129 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class21.field295[var3] = true;
                    } else {
                        class21.field295[~var3] = false;
                    }
                }
            }
            if (arg0 == 27) {
                class22.field302 = class9.field115;
            }
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)V", line = 167)
    public static void method94(int arg0) {
        field148 = null;
        field155 = null;
        field172 = null;
        field144 = null;
        if (arg0 >= -61) {
            field155 = null;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([BII)I", line = 213)
    public static final int method95(byte[] arg0, int arg1, int arg2) {
        return arg1 == 14869 ? class30.method204(0, arg2, arg1 ^ 0xFFFFC5EA, arg0) : 18;
    }
}
