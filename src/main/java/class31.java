import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
    public static int[] field648 = new int[500];

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lv;")
    private static class146 field659 = class159.method1226((byte) -37, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field655 = 0;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lv;")
    public static class146 field658 = field659;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lv;")
    public static class146 field647 = field659;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lua;")
    public static class140 field650 = new class140(64);

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "[[B")
    public static byte[][] field662 = new byte[50][];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[B")
    public byte[] field642;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "[B")
    public byte[] field645;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "[Lie;")
    public static class61[] field661;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZII)I")
    public static final int method210(boolean arg0, int arg1, int arg2) {
        field643++;
        int var3 = method213(arg2 + 45365, (byte) -114, 4, arg1 + 91923) + (method213(arg2 + 10294, (byte) -114, 2, arg1 + 37821) - 128 >> 1) + (method213(arg2, (byte) -114, 1, arg1) - 128 >> 2) - 128;
        if (arg0) {
            return 79;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
    public static final boolean method211(int arg0, int arg1) {
        if (arg0 != -14931) {
            method210(false, -34, 1);
        }
        field651++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method212(int arg0) {
        if (arg0 != 128) {
            field648 = null;
        }
        field662 = null;
        field650 = null;
        field659 = null;
        field648 = null;
        field658 = null;
        field661 = null;
        field647 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBII)I")
    private static final int method213(int arg0, byte arg1, int arg2, int arg3) {
        field654++;
        if (arg1 != -114) {
            field658 = null;
        }
        int var4 = arg0 / arg2;
        int var5 = arg0 & arg2 - 1;
        int var6 = arg3 / arg2;
        int var7 = class40.method266(var4, 16, var6);
        int var8 = arg3 & arg2 - 1;
        int var9 = class40.method266(var4 + 1, 16, var6);
        int var10 = class40.method266(var4, 16, var6 + 1);
        int var11 = class40.method266(var4 + 1, 16, var6 + 1);
        int var12 = class72.method514(var9, var7, 1255230384, var5, arg2);
        int var13 = class72.method514(var11, var10, arg1 + 1255230498, var5, arg2);
        return class72.method514(var13, var12, arg1 + 1255230498, var8, arg2);
    }
}
