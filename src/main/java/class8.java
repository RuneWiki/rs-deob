import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public abstract class class8 {

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "[[B")
    public static byte[][] field134 = new byte[250][];

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "[I")
    public static int[] field135 = new int[128];

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Lt;")
    public static class31 field133 = class11.method64(112, "Herbalist");

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lt;")
    public static class31 field137 = class11.method64(-27, "Hair Dressers");

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Lt;")
    public static class31 field132 = class11.method64(114, "Mace Shop");

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "Lt;")
    public static class31 field139 = class11.method64(91, "Slayer Master");

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(BI[B)I", line = 9)
    public static final int method56(byte arg0, int arg1, byte[] arg2) {
        if (arg0 < 7) {
            field138 = -126;
        }
        return class15.method84(61694024, arg1, arg2, 0);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 38)
    public static void method57(int arg0) {
        field132 = null;
        field139 = null;
        if (arg0 != -37) {
            method58(4, 6, 112, false);
        }
        field135 = null;
        field134 = null;
        field137 = null;
        field133 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIIZ)Lt;", line = 53)
    public static final class31 method58(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg2 != 39) {
            return (class31) null;
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
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg1;
            arg0 /= arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class31 var10 = new class31();
        var10.field349 = var7;
        var10.field345 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)V")
    public abstract void method59(int arg0);

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(III)I")
    public abstract int method60(int arg0, int arg1, int arg2);
}
