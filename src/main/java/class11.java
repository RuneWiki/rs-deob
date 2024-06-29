import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class11 {

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Lt;")
    public static class31 field185 = method64(124, "Gem Shop");

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "Lt;")
    public static class31 field184 = method64(97, "Dairy Churn");

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Lp;")
    public static class28 field186 = new class28();

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lt;")
    public static class31 field187 = method64(94, "Mini)2Game");

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ILjava/lang/String;)Lt;", line = 10)
    public static final class31 method64(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = 66 % ((28 - arg0) / 53);
        int var4 = 0;
        int var5 = var2.length;
        class31 var6 = new class31();
        var6.field349 = new byte[var5];
        while (var5 > var4) {
            int var7 = var2[var4++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var5 <= var4) {
                    break;
                }
                int var8 = var2[var4++] & 0xFF;
                var6.field349[var6.field345++] = (byte) ((var7 - 40) * 43 + var8 - 48);
            } else if (var7 != 0) {
                var6.field349[var6.field345++] = (byte) var7;
            }
        }
        var6.method180(-126);
        return var6.method169((byte) -6);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V", line = 62)
    public static void method65(byte arg0) {
        field186 = null;
        field185 = null;
        field187 = null;
        int var1 = -69 % ((arg0 - 69) / 43);
        field184 = null;
    }
}
