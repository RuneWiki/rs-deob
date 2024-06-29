import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 {

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "Lh;")
    public static class15 field351 = method190(true, "Cookery Shop");

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "I")
    private static int field352 = 0;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Lh;")
    public static class15 field349 = method190(true, "Water Source");

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "Lh;")
    public static class15 field353 = method190(true, "world");

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "Lk;")
    public static class21 field354 = new class21();

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Lh;")
    public static class15 field356 = method190(true, "sprites");

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "I")
    public static volatile int field357 = 0;

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lv;")
    public static class35 field348;

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "[B")
    public static byte[] field359;

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "[I")
    public static int[] field358;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ZLjava/lang/String;)Lh;", line = 48)
    public static final class15 method190(boolean arg0, String arg1) {
        if (!arg0) {
            field350 = -62;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class15 var5 = new class15();
        var5.field247 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field247[var5.field250++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field247[var5.field250++] = (byte) var6;
            }
        }
        var5.method130(0);
        return var5.method135((byte) -122);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(II)[B", line = 88)
    public static final synchronized byte[] method191(int arg0, int arg1) {
        if (arg1 == 100 && class9.field146 > 0) {
            byte[] var2 = class21.field306[--class9.field146];
            class21.field306[class9.field146] = null;
            return var2;
        }
        if (arg0 != 19607) {
            method190(false, null);
        }
        if (arg1 == 5000 && field352 > 0) {
            byte[] var3 = class1.field77[--field352];
            class1.field77[field352] = null;
            return var3;
        } else if (arg1 == 30000 && class33.field436 > 0) {
            byte[] var4 = class29.field401[--class33.field436];
            class29.field401[class33.field436] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 148)
    public static void method192(byte arg0) {
        field348 = null;
        field349 = null;
        field356 = null;
        field358 = null;
        field359 = null;
        if (arg0 > -64) {
            method191(-126, -125);
        }
        field351 = null;
        field354 = null;
        field353 = null;
    }
}
