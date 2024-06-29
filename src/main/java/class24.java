import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public abstract class class24 {

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lv;")
    public static class40 field363 = method170("-5bersicht", (byte) -128);

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Lv;")
    public static class40 field365 = method170("download", (byte) 125);

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "Lv;")
    public static class40 field366 = method170("Food Shop", (byte) -114);

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "[B")
    public static byte[] field368;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "[B")
    public static byte[] field369;

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "[[[I")
    public static int[][][] field370;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/lang/String;B)Lv;", line = 8)
    public static final class40 method170(String arg0, byte arg1) {
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = 37 / ((arg1 + 30) / 41);
        int var5 = var2.length;
        class40 var6 = new class40();
        var6.field511 = new byte[var5];
        while (var5 > var3) {
            int var7 = var2[var3++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var5 <= var3) {
                    break;
                }
                int var8 = var2[var3++] & 0xFF;
                var6.field511[var6.field510++] = (byte) (var7 * 43 + var8 - 48 - 1720);
            } else if (var7 != 0) {
                var6.field511[var6.field510++] = (byte) var7;
            }
        }
        var6.method263(25877);
        return var6.method247((byte) 117);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIILo;)[Le;", line = 61)
    public static final class9[] method172(int arg0, int arg1, int arg2, class26 arg3) {
        if (arg2 == -22795) {
            return class25.method178(50, arg1, arg0, arg3) ? class15.method79(-22354) : null;
        } else {
            return (class9[]) null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 78)
    public static void method173(byte arg0) {
        if (arg0 >= -82) {
            field364 = 58;
        }
        field370 = null;
        field363 = null;
        field369 = null;
        field368 = null;
        field366 = null;
        field365 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)[B")
    public abstract byte[] method171(int arg0);

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([BB)V")
    public abstract void method174(byte[] arg0, byte arg1);
}
