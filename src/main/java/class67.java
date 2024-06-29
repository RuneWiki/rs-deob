import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 extends class208 {

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    public static int[] field995 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lve;")
    private static class255 field992 = class87.method607(66, " more options");

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lve;")
    public static class255 field1001 = field992;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lve;")
    public static class255 field1002 = class87.method607(48, "huffman");

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lve;")
    public static class255 field1000 = class87.method607(43, "mapfunction");

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[Lve;")
    public static class255[] field1005 = new class255[100];

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lrg;")
    public static class88 field996;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "[I")
    public static int[] field993;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z", line = 15)
    public static final boolean method407(int arg0, int arg1) {
        if (arg0 != 0) {
            field1002 = (class255) null;
        }
        field997++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZII)Lve;", line = 60)
    public static final class255 method408(byte arg0, boolean arg1, int arg2, int arg3) {
        field991++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        int var8 = -85 % ((arg0 + 37) / 37);
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = arg2 % arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var9 - 1] = (byte) (var10 + 48);
            arg2 /= arg3;
        }
        class255 var11 = new class255();
        var11.field4297 = var7;
        var11.field4343 = var6;
        return var11;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZI)I", line = 123)
    public static final int method409(int arg0, int arg1, boolean arg2, int arg3) {
        field1004++;
        if ((class166.field2800[arg1][arg3][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class166.field2800[1][arg3][arg0] & 0x2) == 0) {
            return arg2 ? 14 : arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V", line = 160)
    public static void method410(byte arg0) {
        field1005 = null;
        field992 = null;
        field1000 = null;
        field995 = null;
        field1002 = null;
        int var1 = -102 / ((54 - arg0) / 46);
        field1001 = null;
        field996 = null;
        field993 = null;
    }
}
