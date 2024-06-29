import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class14 {

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "I")
    public static int field107 = -1;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "mapview!h", name = "h", descriptor = "Lt;")
    public static class31 field110 = method84(117, " )2 ");

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Lt;")
    public static class31 field103 = method84(127, "Magic Shop");

    @OriginalMember(owner = "mapview!h", name = "l", descriptor = "Z")
    public static volatile boolean field114 = false;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "mapview!h", name = "j", descriptor = "Lt;")
    public static class31 field112 = method84(108, "map");

    @OriginalMember(owner = "mapview!h", name = "f", descriptor = "Lt;")
    public static class31 field108 = method84(110, "Mining Site");

    @OriginalMember(owner = "mapview!h", name = "k", descriptor = "Lt;")
    public static class31 field113 = method84(119, "labels)3dat");

    @OriginalMember(owner = "mapview!h", name = "i", descriptor = "[Z")
    public static boolean[] field111 = new boolean[112];

    @OriginalMember(owner = "mapview!h", name = "o", descriptor = "[J")
    public static long[] field117 = new long[32];

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Lt;")
    public static class31 field105 = method84(113, "Dungeon");

    @OriginalMember(owner = "mapview!h", name = "n", descriptor = "Lt;")
    public static class31 field116 = method84(127, "null");

    @OriginalMember(owner = "mapview!h", name = "g", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "mapview!h", name = "m", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(JB)V", line = 10)
    public static final void method80(long arg0, byte arg1) {
        if (arg1 >= -54) {
            field105 = null;
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(B)V", line = 40)
    public static void method81(byte arg0) {
        field110 = null;
        field108 = null;
        field105 = null;
        field113 = null;
        field116 = null;
        if (arg0 != -103) {
            field115 = -26;
        }
        field111 = null;
        field117 = null;
        field103 = null;
        field112 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V", line = 67)
    public static final void method82(int arg0) {
        class33.field351 = null;
        class22.field194 = null;
        class12.field92 = null;
        if (arg0 == -27498) {
            class24.field208 = null;
            class20.field182 = null;
            class18.field159 = null;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(I)Lf;", line = 86)
    public static final class10 method83(int arg0) {
        class10 var1 = new class10(class20.field182, class24.field208, class18.field159, class22.field194, class33.field351);
        method82(-27498);
        if (arg0 != 0) {
            field112 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(ILjava/lang/String;)Lt;", line = 107)
    public static final class31 method84(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class31 var5 = new class31();
        var5.field336 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field336[var5.field339++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field336[var5.field339++] = (byte) var6;
            }
        }
        var5.method191(-81);
        return arg0 <= 107 ? (class31) null : var5.method185(true);
    }
}
