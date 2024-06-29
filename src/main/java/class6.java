import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 {

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "[B")
    public byte[] field107 = new byte[18002];

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "[Z")
    public boolean[] field105 = new boolean[256];

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "I")
    public int field106 = 0;

    @OriginalMember(owner = "mapview!ca", name = "q", descriptor = "[B")
    public byte[] field119 = new byte[256];

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "[Z")
    public boolean[] field113 = new boolean[16];

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "[[I")
    public int[][] field110 = new int[6][258];

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "[I")
    public int[] field117 = new int[256];

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "[I")
    public int[] field115 = new int[257];

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "[B")
    public byte[] field112 = new byte[18002];

    @OriginalMember(owner = "mapview!ca", name = "r", descriptor = "[I")
    public int[] field120 = new int[16];

    @OriginalMember(owner = "mapview!ca", name = "B", descriptor = "[[I")
    public int[][] field130 = new int[6][258];

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "[B")
    public byte[] field109 = new byte[4096];

    @OriginalMember(owner = "mapview!ca", name = "z", descriptor = "[[I")
    public int[][] field128 = new int[6][258];

    @OriginalMember(owner = "mapview!ca", name = "J", descriptor = "I")
    public int field138 = 0;

    @OriginalMember(owner = "mapview!ca", name = "D", descriptor = "[[B")
    public byte[][] field132 = new byte[6][258];

    @OriginalMember(owner = "mapview!ca", name = "I", descriptor = "[I")
    public int[] field137 = new int[6];

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "mapview!ca", name = "u", descriptor = "Lk;")
    public static class21 field123 = class14.method92((byte) 57, "???");

    @OriginalMember(owner = "mapview!ca", name = "w", descriptor = "I")
    public static volatile int field125 = 0;

    @OriginalMember(owner = "mapview!ca", name = "x", descriptor = "Lk;")
    public static class21 field126 = class14.method92((byte) 57, "Guide");

    @OriginalMember(owner = "mapview!ca", name = "C", descriptor = "Lk;")
    public static class21 field131 = class14.method92((byte) 57, "loc)3dat");

    @OriginalMember(owner = "mapview!ca", name = "K", descriptor = "B")
    public byte field139;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "mapview!ca", name = "s", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "mapview!ca", name = "t", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "mapview!ca", name = "v", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "mapview!ca", name = "y", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "mapview!ca", name = "A", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "mapview!ca", name = "E", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "mapview!ca", name = "F", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "mapview!ca", name = "G", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "mapview!ca", name = "H", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "mapview!ca", name = "L", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "mapview!ca", name = "M", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "[B")
    public byte[] field114;

    @OriginalMember(owner = "mapview!ca", name = "p", descriptor = "[B")
    public byte[] field118;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 6)
    public static void method54(int arg0) {
        if (arg0 <= -59) {
            field131 = null;
            field123 = null;
            field126 = null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(I)Lr;", line = 76)
    public static final class30 method55(int arg0) {
        try {
            if (arg0 != 16) {
                field123 = null;
            }
            return (class30) Class.forName("n").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class10();
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "(I)V", line = 137)
    public static final void method56(int arg0) {
        if (arg0 == -1 && class28.field341 != null) {
            class14 var1 = class28.field341;
            synchronized (class28.field341) {
                class28.field341 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIZZ)Lk;", line = 160)
    public static final class21 method57(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        int var5 = arg0 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        if (!arg2) {
            method54(-1);
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            arg0 /= arg1;
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class21 var10 = new class21();
        var10.field259 = var7;
        var10.field256 = var6;
        return var10;
    }
}
