import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 {

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "[B")
    public byte[] field358 = new byte[18002];

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "[B")
    public byte[] field367 = new byte[18002];

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "[[I")
    public int[][] field364 = new int[6][258];

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "[I")
    public int[] field363 = new int[6];

    @OriginalMember(owner = "mapview!n", name = "t", descriptor = "[I")
    public int[] field373 = new int[256];

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "I")
    public int field356 = 0;

    @OriginalMember(owner = "mapview!n", name = "v", descriptor = "[I")
    public int[] field375 = new int[257];

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "I")
    public int field368 = 0;

    @OriginalMember(owner = "mapview!n", name = "C", descriptor = "[B")
    public byte[] field382 = new byte[256];

    @OriginalMember(owner = "mapview!n", name = "s", descriptor = "[I")
    public int[] field372 = new int[16];

    @OriginalMember(owner = "mapview!n", name = "r", descriptor = "[[I")
    public int[][] field371 = new int[6][258];

    @OriginalMember(owner = "mapview!n", name = "H", descriptor = "[B")
    public byte[] field387 = new byte[4096];

    @OriginalMember(owner = "mapview!n", name = "L", descriptor = "[[B")
    public byte[][] field391 = new byte[6][258];

    @OriginalMember(owner = "mapview!n", name = "y", descriptor = "[[I")
    public int[][] field378 = new int[6][258];

    @OriginalMember(owner = "mapview!n", name = "N", descriptor = "[Z")
    public boolean[] field393 = new boolean[256];

    @OriginalMember(owner = "mapview!n", name = "M", descriptor = "[Z")
    public boolean[] field392 = new boolean[16];

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "I")
    public static int field354 = 50;

    @OriginalMember(owner = "mapview!n", name = "q", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "Lna;")
    public static class26 field357 = class33.method219("-5bersicht", 122);

    @OriginalMember(owner = "mapview!n", name = "A", descriptor = "I")
    public static int field380 = -1;

    @OriginalMember(owner = "mapview!n", name = "x", descriptor = "B")
    public byte field377;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "mapview!n", name = "u", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "mapview!n", name = "w", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "mapview!n", name = "B", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "mapview!n", name = "E", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "mapview!n", name = "F", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "mapview!n", name = "G", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "mapview!n", name = "J", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "mapview!n", name = "K", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "[B")
    public byte[] field361;

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "[B")
    public byte[] field366;

    @OriginalMember(owner = "mapview!n", name = "D", descriptor = "[B")
    public static byte[] field383;

    @OriginalMember(owner = "mapview!n", name = "z", descriptor = "[I")
    public static int[] field379;

    @OriginalMember(owner = "mapview!n", name = "I", descriptor = "[[Lta;")
    public static class38[][] field388;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)Z", line = 21)
    public static final boolean method161(int arg0) {
        class30 var1 = class10.field95;
        synchronized (class10.field95) {
            if (arg0 != -15107) {
                return true;
            } else if (class24.field251 == class21.field228) {
                return false;
            } else {
                class23.field249 = class12.field120[class21.field228];
                class12.field122 = class8.field83[class21.field228];
                class21.field228 = class21.field228 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ZII)B", line = 46)
    public static final byte method162(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field388 = null;
        }
        int var3 = arg1 >> 6;
        int var4 = arg2 >> 6;
        if (field388[var4][var3] == null) {
            return 0;
        } else if (field388[var4][var3].field503 == null) {
            return field388[var4][var3].field505;
        } else {
            return field388[var4][var3].field503[(arg2 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 68)
    public static void method163(int arg0) {
        field357 = null;
        field379 = null;
        field383 = null;
        if (arg0 != 127) {
            field357 = null;
        }
        field388 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIZ)Lna;", line = 90)
    public static final class26 method164(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != 39) {
            return (class26) null;
        } else if (arg1 >= 2 && arg1 <= 36) {
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
            class26 var10 = new class26();
            var10.field405 = var7;
            var10.field404 = var6;
            return var10;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }
}
