import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class17 {

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "[I")
    public int[] field193 = new int[16];

    @OriginalMember(owner = "mapview!j", name = "x", descriptor = "[[I")
    public int[][] field208 = new int[6][258];

    @OriginalMember(owner = "mapview!j", name = "u", descriptor = "[I")
    public int[] field205 = new int[6];

    @OriginalMember(owner = "mapview!j", name = "s", descriptor = "I")
    public int field203 = 0;

    @OriginalMember(owner = "mapview!j", name = "F", descriptor = "[[I")
    public int[][] field215 = new int[6][258];

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "I")
    public int field190 = 0;

    @OriginalMember(owner = "mapview!j", name = "D", descriptor = "[B")
    public byte[] field213 = new byte[18002];

    @OriginalMember(owner = "mapview!j", name = "I", descriptor = "[[B")
    public byte[][] field218 = new byte[6][258];

    @OriginalMember(owner = "mapview!j", name = "J", descriptor = "[B")
    public byte[] field219 = new byte[18002];

    @OriginalMember(owner = "mapview!j", name = "p", descriptor = "[B")
    public byte[] field200 = new byte[4096];

    @OriginalMember(owner = "mapview!j", name = "w", descriptor = "[Z")
    public boolean[] field207 = new boolean[16];

    @OriginalMember(owner = "mapview!j", name = "K", descriptor = "[I")
    public int[] field220 = new int[257];

    @OriginalMember(owner = "mapview!j", name = "o", descriptor = "[B")
    public byte[] field199 = new byte[256];

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "[I")
    public int[] field186 = new int[256];

    @OriginalMember(owner = "mapview!j", name = "v", descriptor = "[Z")
    public boolean[] field206 = new boolean[256];

    @OriginalMember(owner = "mapview!j", name = "E", descriptor = "[[I")
    public int[][] field214 = new int[6][258];

    @OriginalMember(owner = "mapview!j", name = "r", descriptor = "I")
    public static int field202 = -1;

    @OriginalMember(owner = "mapview!j", name = "z", descriptor = "Lt;")
    public static class36 field210 = class3.method8(13631, "Spinning Wheel");

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Laa;")
    public static class2 field194 = new class2();

    @OriginalMember(owner = "mapview!j", name = "N", descriptor = "Lt;")
    public static class36 field223 = class3.method8(13631, "Food Shop");

    @OriginalMember(owner = "mapview!j", name = "y", descriptor = "B")
    public byte field209;

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "mapview!j", name = "q", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "mapview!j", name = "t", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "mapview!j", name = "C", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "mapview!j", name = "H", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "mapview!j", name = "L", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "mapview!j", name = "M", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "mapview!j", name = "O", descriptor = "Lma;")
    public static class24 field224;

    @OriginalMember(owner = "mapview!j", name = "G", descriptor = "Lc;")
    public static class5 field216;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "[B")
    public byte[] field185;

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "[B")
    public byte[] field192;

    @OriginalMember(owner = "mapview!j", name = "A", descriptor = "[I")
    public static int[] field211;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 8)
    public static final void method90(int arg0) {
        class9.field91 = null;
        class20.field257 = null;
        if (arg0 != -2) {
            method90(68);
        }
        field211 = null;
        class6.field61 = null;
        class35.field480 = null;
        class35.field485 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I[B)V", line = 36)
    public static final void method91(int arg0, byte[] arg1) {
        class39 var2 = new class39(arg1);
        var2.field519 = arg1.length - 2;
        class32.field451 = var2.method254(65280);
        class9.field91 = new int[class32.field451];
        class35.field485 = new int[class32.field451];
        field211 = new int[class32.field451];
        class35.field480 = new int[class32.field451];
        class6.field61 = new byte[class32.field451][];
        var2.field519 = arg1.length - class32.field451 * 8 - 7;
        class14.field172 = var2.method254(65280);
        class1.field1 = var2.method254(65280);
        int var3 = (var2.method256(1795441960) & 0xFF) + 1;
        if (arg0 >= -24) {
            field211 = null;
        }
        for (int var4 = 0; var4 < class32.field451; var4++) {
            class9.field91[var4] = var2.method254(65280);
        }
        for (int var5 = 0; var5 < class32.field451; var5++) {
            class35.field485[var5] = var2.method254(65280);
        }
        for (int var6 = 0; var6 < class32.field451; var6++) {
            field211[var6] = var2.method254(65280);
        }
        for (int var7 = 0; var7 < class32.field451; var7++) {
            class35.field480[var7] = var2.method254(65280);
        }
        var2.field519 = arg1.length + 3 - class32.field451 * 8 - var3 * 3 - 7;
        class20.field257 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class20.field257[var8] = var2.method252(-2);
            if (class20.field257[var8] == 0) {
                class20.field257[var8] = 1;
            }
        }
        var2.field519 = 0;
        for (int var9 = 0; var9 < class32.field451; var9++) {
            int var10 = field211[var9];
            int var11 = class35.field480[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class6.field61[var9] = var13;
            int var14 = var2.method256(1795441960);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method248(65280);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method248(65280);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(III)V", line = 171)
    public static final void method92(int arg0, int arg1, int arg2) {
        class6.field60 = arg0 & 0x3F;
        class33.field461 = arg1 & 0x3F;
        class2.field10 = arg1 >> 6;
        if (arg2 != 14737) {
            method91(38, null);
        }
        class1.field7 = arg0 >> 6;
        class6.field65 = (class6.field60 << 6) + class33.field461;
        class20.method112(-4);
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)V", line = 195)
    public static void method93(int arg0) {
        field210 = null;
        field216 = null;
        field224 = null;
        field194 = null;
        field223 = null;
        if (arg0 != -14652) {
            field210 = null;
        }
        field211 = null;
    }
}
