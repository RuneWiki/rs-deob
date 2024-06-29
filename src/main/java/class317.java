import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class317 {

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field5343;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field5345;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field5347;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[[B")
    public static byte[][] field5339 = new byte[50][];

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lbd;")
    public static class162 field5346 = class17.method142(0, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5337 = 50;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Lbd;")
    public static class162 field5352 = class17.method142(0, "(U1");

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lbd;")
    private static class162 field5349 = class17.method142(0, "Loaded textures");

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lbd;")
    public static class162 field5340 = field5349;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lda;")
    public static class143 field5342;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[[B")
    public static byte[][] field5350;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[[[B")
    public static byte[][][] field5341;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2177(int arg0, int arg1) {
        int var2 = -117 / ((arg1 + 67) / 33);
        field5338++;
        class63 var3 = class46.method332(4, arg0, -12770);
        var3.method427(-22507);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)Lbd;", line = 24)
    public static final class162 method2178(long arg0, byte arg1) {
        field5344++;
        int var3 = -71 / ((-arg1 - 68) / 34);
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var4 = arg0;
            int var6 = 0;
            while (var4 != 0L) {
                var6++;
                var4 /= 37L;
            }
            byte[] var7 = new byte[var6];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var6--;
                var7[var6] = class218.field3634[(int) (var8 - (arg0 * 37L))];
            }
            class162 var10 = new class162();
            var10.field2817 = var7;
            var10.field2865 = var7.length;
            return var10;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Lbd;", line = 66)
    public static final class162 method2179(int arg0, byte arg1) {
        if (arg1 < 102) {
            method2180((byte) -78);
        }
        field5348++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class162 var2 = new class162();
        var2.field2817 = new byte[1];
        var2.field2865 = 1;
        var2.field2817[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(III)V", line = 105)
    public class317(int arg0, int arg1, int arg2) {
        this.field5343 = arg2;
        this.field5345 = arg1;
        this.field5347 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 128)
    public static void method2180(byte arg0) {
        field5350 = (byte[][]) null;
        if (arg0 <= 68) {
            field5340 = (class162) null;
        }
        field5340 = null;
        field5339 = (byte[][]) null;
        field5341 = (byte[][][]) null;
        field5352 = null;
        field5349 = null;
        field5346 = null;
        field5342 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public abstract void method421(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(III)V")
    public abstract void method424(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III)V")
    public abstract void method422(int arg0, int arg1, int arg2);
}
