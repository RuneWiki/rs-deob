import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class61 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[I")
    public int[] field1125 = new int[16];

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
    public int[] field1130 = new int[256];

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "[B")
    public byte[] field1146 = new byte[18002];

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "[I")
    public int[] field1149 = new int[6];

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[[I")
    public int[][] field1137 = new int[6][258];

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "[B")
    public byte[] field1129 = new byte[256];

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "[B")
    public byte[] field1158 = new byte[4096];

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[I")
    public int[] field1128 = new int[257];

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "[Z")
    public boolean[] field1132 = new boolean[16];

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "[[I")
    public int[][] field1154 = new int[6][258];

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[Z")
    public boolean[] field1124 = new boolean[256];

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "[B")
    public byte[] field1148 = new byte[18002];

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public int field1150 = 0;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[[B")
    public byte[][] field1131 = new byte[6][258];

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public int field1134 = 0;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "[[I")
    public int[][] field1162 = new int[6][258];

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "J")
    public static long field1139 = 0L;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "B")
    public byte field1153;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "[B")
    public byte[] field1142;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "[B")
    public byte[] field1147;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "[I")
    public static int[] field1151;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "[Lqg;")
    public static class231[] field1159;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 14)
    public static final void method401(byte arg0) {
        class79.field1441 = null;
        field1138++;
        if (arg0 < 107) {
            field1159 = (class231[]) null;
        }
        class179.method1224();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I", line = 26)
    public static final int method402(int arg0) {
        field1136++;
        if (arg0 != 6) {
            field1159 = (class231[]) null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 77)
    public static final void method403(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (int var1 = 0; var1 < class313.field5292; var1++) {
            class4 var2 = class7.method41(var1, (byte) 101);
            if (var2 != null && var2.field84 == 0) {
                class34.field732[var1] = 0;
                class104.field1778[var1] = 0;
            }
        }
        class301.field5114 = new class120(16);
        field1140++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ldj;Ldj;I)V", line = 106)
    public static final void method404(class314 arg0, class314 arg1, int arg2) {
        class97.field1665 = arg1;
        field1155++;
        if (arg2 == 15828) {
            class4.field78 = arg0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 191)
    public static void method405(int arg0) {
        field1151 = null;
        if (arg0 != 256) {
            field1139 = 58L;
        }
        field1159 = null;
    }
}
