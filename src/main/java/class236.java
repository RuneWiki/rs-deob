import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class236 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4223 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[J")
    public static long[] field4225 = new long[256];

    @OriginalMember(owner = "client!re", name = "i", descriptor = "S")
    public static short field4230 = 32767;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lli;")
    public static class185 field4231;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lja;")
    public static class53 field4226;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lwc;")
    public static final class85 method1604(int arg0) {
        if (arg0 > -24) {
            method1604(-17);
        }
        field4229++;
        return class65.field1124;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1605(int arg0) {
        field4226 = null;
        field4231 = null;
        field4225 = null;
        if (arg0 != -12720) {
            field4231 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)I")
    public static final int method1606(int arg0, int arg1, int arg2, int arg3) {
        field4224++;
        if (class201.field3694 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg0 < 32) {
            return -67;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        if (arg3 < 3 && (class239.field4262[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var9 = (128 - var8) * class201.field3694[var6][var4][var5] + class201.field3694[var6][var4 + 1][var5] * var8 >> 7;
        int var10 = (128 - var8) * class201.field3694[var6][var4][var5 + 1] + class201.field3694[var6][var4 + 1][var5 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4225[var0] = var1;
        }
        field4231 = class245.method1649("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", -79);
    }
}
