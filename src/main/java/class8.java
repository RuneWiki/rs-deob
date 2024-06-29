import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class8 {

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "[I")
    public int[] field158 = new int[6];

    @OriginalMember(owner = "mapview!e", name = "m", descriptor = "[I")
    public int[] field168 = new int[256];

    @OriginalMember(owner = "mapview!e", name = "n", descriptor = "[[I")
    public int[][] field169 = new int[6][258];

    @OriginalMember(owner = "mapview!e", name = "x", descriptor = "[Z")
    public boolean[] field179 = new boolean[16];

    @OriginalMember(owner = "mapview!e", name = "k", descriptor = "[B")
    public byte[] field166 = new byte[4096];

    @OriginalMember(owner = "mapview!e", name = "q", descriptor = "[B")
    public byte[] field172 = new byte[18002];

    @OriginalMember(owner = "mapview!e", name = "p", descriptor = "[B")
    public byte[] field171 = new byte[256];

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "[I")
    public int[] field160 = new int[257];

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "[[I")
    public int[][] field163 = new int[6][258];

    @OriginalMember(owner = "mapview!e", name = "F", descriptor = "[I")
    public int[] field187 = new int[16];

    @OriginalMember(owner = "mapview!e", name = "C", descriptor = "[Z")
    public boolean[] field184 = new boolean[256];

    @OriginalMember(owner = "mapview!e", name = "I", descriptor = "I")
    public int field189 = 0;

    @OriginalMember(owner = "mapview!e", name = "J", descriptor = "[B")
    public byte[] field190 = new byte[18002];

    @OriginalMember(owner = "mapview!e", name = "D", descriptor = "I")
    public int field185 = 0;

    @OriginalMember(owner = "mapview!e", name = "v", descriptor = "[[B")
    public byte[][] field177 = new byte[6][258];

    @OriginalMember(owner = "mapview!e", name = "s", descriptor = "[[I")
    public int[][] field174 = new int[6][258];

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "[I")
    public static int[] field159 = new int[256];

    @OriginalMember(owner = "mapview!e", name = "L", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "B")
    public byte field165;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "mapview!e", name = "l", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "mapview!e", name = "o", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "mapview!e", name = "r", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "mapview!e", name = "t", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "mapview!e", name = "u", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "mapview!e", name = "w", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "mapview!e", name = "y", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "mapview!e", name = "B", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "mapview!e", name = "E", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "mapview!e", name = "K", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field191;

    @OriginalMember(owner = "mapview!e", name = "z", descriptor = "[B")
    public byte[] field181;

    @OriginalMember(owner = "mapview!e", name = "A", descriptor = "[B")
    public byte[] field182;

    @OriginalMember(owner = "mapview!e", name = "G", descriptor = "[Lga;")
    public static class12[] field188;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IILt;B)Z", line = 12)
    public static final boolean method76(int arg0, int arg1, class34 arg2, byte arg3) {
        int var4 = 4 % ((10 - arg3) / 54);
        byte[] var5 = arg2.method225(0, arg0, arg1);
        if (var5 == null) {
            return false;
        } else {
            class33.method211(-1, var5);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(B)V", line = 70)
    public static void method77(byte arg0) {
        field188 = null;
        field159 = null;
        if (arg0 != 39) {
            method76(16, 124, null, (byte) 19);
        }
        field191 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(BII)V", line = 83)
    public static final void method78(byte arg0, int arg1, int arg2) {
        class23.field305 = arg1 >> 6;
        class18.field276 = arg2 >> 6;
        if (arg0 > -120) {
            field175 = -75;
        }
        class27.field352 = arg1 & 0x3F;
        class23.field304 = arg2 & 0x3F;
        class13.field234 = (class27.field352 << 6) + class23.field304;
        class24.method161(105);
    }

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
            field159[var0] = var1;
        }
        field192 = 0;
    }
}
