import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public abstract class class28 {

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Z")
    public static boolean field402 = false;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Lia;")
    public static class15 field405 = method196("Overview", false);

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Lia;")
    public static class15 field404 = method196("mapscene", false);

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 13)
    public static void method193(int arg0) {
        if (arg0 != 11877) {
            field405 = null;
        }
        field405 = null;
        field404 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/String;Z)Lia;", line = 63)
    public static final class15 method196(String arg0, boolean arg1) {
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        if (arg1) {
            return (class15) null;
        }
        class15 var4 = new class15();
        var4.field148 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field148[var4.field142++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field148[var4.field142++] = (byte) var6;
            }
        }
        var4.method110(6332);
        return var4.method107(66);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "([BI)V")
    public abstract void method194(byte[] arg0, int arg1);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)[B")
    public abstract byte[] method195(byte arg0);
}
