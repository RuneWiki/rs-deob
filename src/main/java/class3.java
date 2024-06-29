import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public abstract class class3 {

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "La;")
    public static class1 field34 = method36("Food Shop", -86);

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "[I")
    public static int[] field32 = new int[128];

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "La;")
    public static class1 field27 = method36("Magic Shop", -88);

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "La;")
    public static class1 field30 = method36("Candle Shop", -109);

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "I")
    public static int field37 = -1;

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "[I")
    public static int[] field38 = new int[256];

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "Z")
    public static boolean field39;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Lh;")
    public static class14 field36;

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "[B")
    public static byte[] field33;

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
            field38[var0] = var1;
        }
        field39 = true;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/String;I)La;", line = 62)
    public static final class1 method36(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class1 var5 = new class1();
        var5.field5 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field5[var5.field6++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field5[var5.field6++] = (byte) var6;
            }
        }
        if (arg1 >= -81) {
            method36(null, -120);
        }
        var5.method22(-80);
        return var5.method5(127);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 125)
    public static void method38(int arg0) {
        field30 = null;
        field27 = null;
        field32 = null;
        field34 = null;
        field36 = null;
        if (arg0 == -1) {
            field38 = null;
            field33 = null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([BB)V")
    public abstract void method35(byte[] arg0, byte arg1);

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)[B")
    public abstract byte[] method37(byte arg0);
}
