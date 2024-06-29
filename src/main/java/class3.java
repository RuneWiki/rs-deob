import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class3 {

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Lna;")
    public static class26 field31 = class33.method219("100(U", 104);

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "[I")
    public static int[] field30 = new int[256];

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Lna;")
    public static class26 field32 = class33.method219("Rare Trees", 80);

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Lna;")
    public static class26 field29 = class33.method219("Gem Shop", 97);

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lna;")
    public static class26 field35;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Lna;")
    public static class26 field34;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([BI)[B", line = 25)
    public static final byte[] method22(byte[] arg0, int arg1) {
        class40 var2 = new class40(arg0);
        int var3 = var2.method252(arg1 + 255);
        int var4 = var2.method248(arg1 + 255);
        if (arg1 != 0) {
            field30 = null;
        }
        if (var4 < 0 || class25.field370 != 0 && class25.field370 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method257(var5, var4, -13990, 0);
            return var5;
        } else {
            int var6 = var2.method248(255);
            if (var6 < 0 || class25.field370 != 0 && var6 > class25.field370) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class41.method263(var7, var6, arg0, var4, 9);
            } else {
                class23.field240.method87(var2, -27819, var7);
            }
            return var7;
        }
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
            field30[var0] = var1;
        }
        field35 = class33.method219("Woodcutting stump", 104);
        field34 = class33.method219("_", 98);
        field33 = 0;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 97)
    public static void method23(int arg0) {
        field31 = null;
        field29 = null;
        if (arg0 > 9) {
            field32 = null;
            field34 = null;
            field30 = null;
            field35 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lp;Lna;Lna;Lp;B)Lt;", line = 114)
    public static final class37 method24(class29 arg0, class26 arg1, class26 arg2, class29 arg3, byte arg4) {
        int var5 = arg0.method207(arg1, -19661);
        if (arg4 < 56) {
            return (class37) null;
        } else {
            int var6 = arg0.method201(-1, var5, arg2);
            return class12.method64(arg0, -7362, var5, arg3, var6);
        }
    }
}
