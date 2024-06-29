import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class16 extends class35 {

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Lua;")
    public static class41 field133 = method86("Prev page", true);

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "Lua;")
    public static class41 field135 = method86("Loom", true);

    @OriginalMember(owner = "mapview!i", name = "o", descriptor = "Z")
    public static boolean field138 = false;

    @OriginalMember(owner = "mapview!i", name = "n", descriptor = "I")
    public static int field137 = 20;

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "I")
    public static int field139 = -1;

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "[I")
    public static int[] field136 = new int[128];

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "Lua;")
    public static class41 field140 = method86("Food Shop", true);

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "[[[[B")
    public static byte[][][][] field141 = new byte[5][][][];

    @OriginalMember(owner = "mapview!i", name = "s", descriptor = "Lua;")
    public static class41 field142 = method86("", true);

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "mapview!i", name = "t", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "(I)V", line = 11)
    public static void method83(int arg0) {
        if (arg0 <= 4) {
            field134 = -119;
        }
        field135 = null;
        field141 = null;
        field133 = null;
        field136 = null;
        field140 = null;
        field142 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I[Lua;)V", line = 30)
    public static final void method84(int arg0, class41[] arg1) {
        if (arg0 != 28659) {
            method84(-96, null);
        }
        class17.method90(0, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(III)V", line = 78)
    public static final void method85(int arg0, int arg1, int arg2) {
        class8.field91 = arg1 >> 6;
        field143 = arg2 >> 6;
        class4.field69 = arg1 & 0x3F;
        class14.field126 = arg2 & 0x3F;
        class42.field514 = (class4.field69 << 6) + class14.field126;
        int var3 = -92 % ((-arg0 - 68) / 51);
        class35.method201(123);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/String;Z)Lua;", line = 100)
    public static final class41 method86(String arg0, boolean arg1) {
        if (!arg1) {
            method83(70);
        }
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class41 var5 = new class41();
        var5.field509 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field509[var5.field503++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field509[var5.field503++] = (byte) var6;
            }
        }
        var5.method231(false);
        return var5.method228(true);
    }
}
