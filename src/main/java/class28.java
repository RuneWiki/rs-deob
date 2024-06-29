import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class28 extends class30 {

    @OriginalMember(owner = "mapview!na", name = "o", descriptor = "[I")
    public static int[] field351 = new int[128];

    @OriginalMember(owner = "mapview!na", name = "q", descriptor = "Lu;")
    public static class38 field353 = method177("Platelegs Shop", (byte) -84);

    @OriginalMember(owner = "mapview!na", name = "v", descriptor = "Lu;")
    public static class38 field358 = method177("100(U", (byte) -84);

    @OriginalMember(owner = "mapview!na", name = "u", descriptor = "Lu;")
    public static class38 field357 = method177("Scimitar Shop", (byte) -84);

    @OriginalMember(owner = "mapview!na", name = "s", descriptor = "Lu;")
    public static class38 field355 = method177("b12_full", (byte) -84);

    @OriginalMember(owner = "mapview!na", name = "x", descriptor = "Lu;")
    public static class38 field360 = method177("Cooking Range", (byte) -84);

    @OriginalMember(owner = "mapview!na", name = "r", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "mapview!na", name = "t", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "mapview!na", name = "n", descriptor = "Lu;")
    public class38 field350;

    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "[I")
    public static int[] field349;

    @OriginalMember(owner = "mapview!na", name = "p", descriptor = "[Lu;")
    public static class38[] field352;

    @OriginalMember(owner = "mapview!na", name = "w", descriptor = "[[[I")
    public static int[][][] field359;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "(B)V", line = 16)
    public static void method176(byte arg0) {
        field358 = null;
        field360 = null;
        field351 = null;
        field359 = null;
        field357 = null;
        field353 = null;
        if (arg0 != 35) {
            method177(null, (byte) 121);
        }
        field355 = null;
        field352 = null;
        field349 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/lang/String;B)Lu;", line = 68)
    public static final class38 method177(String arg0, byte arg1) {
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        if (arg1 != -84) {
            return (class38) null;
        }
        int var4 = var2.length;
        class38 var5 = new class38();
        var5.field483 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field483[var5.field494++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field483[var5.field494++] = (byte) var6;
            }
        }
        var5.method228((byte) 116);
        return var5.method243(27114);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)B", line = 121)
    public static final byte method178(int arg0) {
        if (arg0 <= 41) {
            field352 = null;
        }
        return class3.field30 == null ? 0 : class3.field30[class22.field213];
    }
}
