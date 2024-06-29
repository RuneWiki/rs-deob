import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Lta;")
    public static class37 field2 = class20.method87(-106, "Mining Site");

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "[I")
    public static int[] field1 = new int[256];

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "I")
    public static int field5 = -1;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Lta;")
    public static class37 field3 = class20.method87(-102, "???");

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lta;")
    public static class37 field7;

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "Lta;")
    public static class37 field8;

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "Lta;")
    public static class37 field9;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "Lta;")
    public static class37 field11;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Lf;")
    public static class10 field6;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "[I")
    public static int[] field10;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ZZII)Lta;", line = 12)
    public static final class37 method1(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = 1;
        int var5 = arg3 / arg2;
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg1) {
            var6 = var4 + 1;
        }
        if (arg0) {
            field2 = null;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg3 /= arg2;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class37 var10 = new class37();
        var10.field509 = var6;
        var10.field499 = var7;
        return var10;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 96)
    public static void method2(int arg0) {
        field1 = null;
        field7 = null;
        field9 = null;
        field3 = null;
        field10 = null;
        field2 = null;
        if (arg0 > -99) {
            method1(true, true, 62, -15);
        }
        field8 = null;
        field6 = null;
        field11 = null;
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
            field1[var0] = var1;
        }
        field7 = class20.method87(-111, "Fishing Shop");
        field8 = class20.method87(-124, "Overview");
        field9 = class20.method87(-126, "Silver Shop");
        field11 = class20.method87(-113, "Loading )3)3)3");
    }
}
