import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 {

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Lt;")
    public static class36 field21 = method8(13631, "Guide");

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Lt;")
    public static class36 field20 = method8(13631, "Staff Shop");

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Lt;")
    public static class36 field26 = method8(13631, "world");

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lt;")
    public static class36 field25 = method8(13631, "Next page");

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Lka;")
    public static class20 field27 = null;

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "J")
    public static long field24;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "[B")
    public static byte[] field22;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)V", line = 10)
    public static void method6(byte arg0) {
        int var1 = -40 % ((arg0 + 65) / 56);
        field25 = null;
        field26 = null;
        field20 = null;
        field21 = null;
        field22 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(B)V", line = 63)
    public static final void method7(byte arg0) {
        int var1 = 104 / ((arg0 + 41) / 51);
        if (class11.field150.toLowerCase().indexOf("microsoft") != -1) {
            class33.field462[220] = 74;
            class33.field462[221] = 43;
            class33.field462[187] = 27;
            class33.field462[223] = 28;
            class33.field462[222] = 59;
            class33.field462[188] = 71;
            class33.field462[219] = 42;
            class33.field462[190] = 72;
            class33.field462[192] = 58;
            class33.field462[191] = 73;
            class33.field462[189] = 26;
            class33.field462[186] = 57;
            return;
        }
        class33.field462[92] = 74;
        class33.field462[93] = 43;
        class33.field462[59] = 57;
        class33.field462[44] = 71;
        class33.field462[46] = 72;
        class33.field462[47] = 73;
        class33.field462[61] = 27;
        if (class11.field162 == null) {
            class33.field462[192] = 58;
            class33.field462[222] = 59;
        } else {
            class33.field462[520] = 59;
            class33.field462[192] = 28;
            class33.field462[222] = 58;
        }
        class33.field462[91] = 42;
        class33.field462[45] = 26;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILjava/lang/String;)Lt;", line = 111)
    public static final class36 method8(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class36 var4 = new class36();
        var4.field491 = new byte[var3];
        if (arg0 != 13631) {
            field26 = null;
        }
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field491[var4.field492++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field491[var4.field492++] = (byte) var6;
            }
        }
        var4.method208((byte) 81);
        return var4.method203((byte) -115);
    }
}
