import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class9 {

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[B")
    public byte[] field89 = new byte[4096];

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[B")
    public byte[] field88 = new byte[18002];

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[I")
    public int[] field99 = new int[256];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "[B")
    public byte[] field85 = new byte[18002];

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "[I")
    public int[] field105 = new int[257];

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[[I")
    public int[][] field87 = new int[6][258];

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field86 = 0;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[Z")
    public boolean[] field93 = new boolean[256];

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[[B")
    public byte[][] field90 = new byte[6][258];

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public int field101 = 0;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[[I")
    public int[][] field92 = new int[6][258];

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "[I")
    public int[] field108 = new int[16];

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[I")
    public int[] field102 = new int[6];

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[Z")
    public boolean[] field100 = new boolean[16];

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "[B")
    public byte[] field114 = new byte[256];

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "[[I")
    public int[][] field123 = new int[6][258];

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Lec;")
    public static class25 field106 = new class25(64);

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Ljava/lang/String;")
    public static String field116 = "Loading defaults - ";

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
    public static volatile boolean field113 = true;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field111 = new String[100];

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "[I")
    public static int[] field121 = new int[14];

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "B")
    public byte field94;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Lfa;")
    public static class273 field119;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[B")
    public byte[] field117;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[B")
    public byte[] field95;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)J")
    public static final long method48(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        return var3 == null || var3.field2419 == null ? 0L : var3.field2419.field4766;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method49(int arg0) {
        if (arg0 != 4096) {
            field111 = null;
        }
        field116 = null;
        field111 = null;
        field121 = null;
        field106 = null;
        field119 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBII)V")
    public static final void method50(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class184.field2862 = -1;
        class120.field1849 = -1;
        float var5 = (float) class13.field165 / (float) class13.field175;
        if (arg2 < 76) {
            return;
        }
        field120++;
        int var6 = arg4;
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var6 = (int) ((float) arg1 * var5);
        } else {
            var7 = (int) ((float) arg4 / var5);
        }
        int var8 = arg3 - (arg1 - var7) / 2;
        int var9 = arg0 - (arg4 - var6) / 2;
        class187.field2897 = class13.field175 * var8 / var7;
        class44.field606 = class13.field165 * var9 / var6;
        class162.method1073(62);
    }
}
