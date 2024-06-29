import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 {

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "[I")
    public int[] field327 = new int[16];

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "[B")
    public byte[] field330 = new byte[4096];

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "[B")
    public byte[] field336 = new byte[18002];

    @OriginalMember(owner = "mapview!n", name = "w", descriptor = "[[B")
    public byte[][] field345 = new byte[6][258];

    @OriginalMember(owner = "mapview!n", name = "u", descriptor = "[B")
    public byte[] field343 = new byte[256];

    @OriginalMember(owner = "mapview!n", name = "y", descriptor = "[Z")
    public boolean[] field347 = new boolean[256];

    @OriginalMember(owner = "mapview!n", name = "C", descriptor = "[I")
    public int[] field351 = new int[6];

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "[Z")
    public boolean[] field332 = new boolean[16];

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "I")
    public int field333 = 0;

    @OriginalMember(owner = "mapview!n", name = "q", descriptor = "[B")
    public byte[] field339 = new byte[18002];

    @OriginalMember(owner = "mapview!n", name = "D", descriptor = "[I")
    public int[] field352 = new int[257];

    @OriginalMember(owner = "mapview!n", name = "I", descriptor = "[I")
    public int[] field356 = new int[256];

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "I")
    public int field337 = 0;

    @OriginalMember(owner = "mapview!n", name = "L", descriptor = "[[I")
    public int[][] field359 = new int[6][258];

    @OriginalMember(owner = "mapview!n", name = "M", descriptor = "[[I")
    public int[][] field360 = new int[6][258];

    @OriginalMember(owner = "mapview!n", name = "B", descriptor = "[[I")
    public int[][] field350 = new int[6][258];

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Z")
    public static boolean field325 = false;

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "La;")
    public static class1 field326 = class3.method36("Potters Wheel", -117);

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "La;")
    public static class1 field324 = class3.method36("fonts", -110);

    @OriginalMember(owner = "mapview!n", name = "G", descriptor = "La;")
    public static class1 field355 = class3.method36("u_pass", -87);

    @OriginalMember(owner = "mapview!n", name = "J", descriptor = "La;")
    public static class1 field357 = class3.method36("???", -106);

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "La;")
    public static class1 field335 = class3.method36("Furnace", -122);

    @OriginalMember(owner = "mapview!n", name = "E", descriptor = "B")
    public byte field353;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "mapview!n", name = "r", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "mapview!n", name = "s", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "mapview!n", name = "t", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "mapview!n", name = "v", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "mapview!n", name = "z", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "mapview!n", name = "A", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "mapview!n", name = "F", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "mapview!n", name = "K", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "mapview!n", name = "N", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "[B")
    public byte[] field338;

    @OriginalMember(owner = "mapview!n", name = "x", descriptor = "[B")
    public byte[] field346;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 73)
    public static void method168(int arg0) {
        field324 = null;
        field357 = null;
        field335 = null;
        if (arg0 != 48) {
            method171((byte) 103);
        }
        field355 = null;
        field326 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIBII)V", line = 89)
    public static final void method169(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg4 != 4096) {
            return;
        }
        int var5 = arg0 >> 6;
        int var6 = arg1 >> 6;
        if (class10.field110[arg3][var6][var5] == null) {
            class10.field110[arg3][var6][var5] = new byte[4096];
        }
        class10.field110[arg3][var6][var5][mapview.method165(arg1 << 6, 4032) + mapview.method165(arg0, 63)] = arg2;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ZIIZ)La;", line = 129)
    public static final class1 method170(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var4 = 1;
        for (int var5 = arg1 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        if (!arg3) {
            field325 = true;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg1 % arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            arg1 /= arg2;
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class1 var10 = new class1();
        var10.field5 = var7;
        var10.field6 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 211)
    public static final void method171(byte arg0) {
        class27.field378 = null;
        class13.field123 = null;
        if (arg0 < 111) {
            method171((byte) -7);
        }
        class29.field403 = null;
        class30.field411 = null;
        class2.field22 = null;
        class30.field410 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)Laa;", line = 280)
    public static final class2 method172(int arg0) {
        try {
            if (arg0 != -32354) {
                method172(80);
            }
            return (class2) Class.forName("ra").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class10();
        }
    }
}
