import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class196 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[S")
    public static short[] field3850 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lea;")
    public static class38 field3848 = class9.method46((byte) 120, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lea;")
    private static class38 field3849 = class9.method46((byte) 109, "Select");

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "[Lea;")
    public static class38[] field3858 = new class38[1000];

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lea;")
    public static class38 field3851 = class9.method46((byte) 111, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field3857 = -1;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lea;")
    public static class38 field3856 = class9.method46((byte) 117, "swe");

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lea;")
    public static class38 field3853 = field3849;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Ldd;")
    public static class32 field3860;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
    public static int[] field3854;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[[[B")
    public static byte[][][] field3852;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method1294(byte arg0) {
        field3856 = null;
        field3853 = null;
        if (arg0 != -15) {
            field3856 = null;
        }
        field3854 = null;
        field3860 = null;
        field3849 = null;
        field3848 = null;
        field3858 = null;
        field3851 = null;
        field3852 = null;
        field3850 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZZ)V")
    public static final void method1295(boolean arg0, boolean arg1) {
        field3859++;
        if (class195.field3842.field406 >> 7 == class185.field3674 && class195.field3842.field382 >> 7 == class191.field3763) {
            class185.field3674 = 0;
        }
        int var2 = class50.field1247;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class144 var5;
            if (arg1) {
                var4 = 33538048;
                var5 = class195.field3842;
            } else {
                var5 = class175.field3550[class65.field1556[var3]];
                var4 = class65.field1556[var3] << 14;
            }
            if (var5 != null && var5.method108(20542)) {
                int var6 = var5.field406 >> 7;
                var5.field3012 = false;
                int var7 = var5.field382 >> 7;
                if ((class31.field610 && class50.field1247 > 50 || class50.field1247 > 200) && !arg1 && var5.field441 == var5.field387) {
                    var5.field3012 = true;
                }
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field2996 == null || class45.field1098 < var5.field3011 || class45.field1098 >= var5.field2995) {
                        if ((var5.field406 & 0x7F) == 64 && (var5.field382 & 0x7F) == 64) {
                            if (class179.field3622[var6][var7] == class172.field3523) {
                                continue;
                            }
                            class179.field3622[var6][var7] = class172.field3523;
                        }
                        var5.field3025 = class38.method257(class10.field224, -169496123, var5.field382, var5.field406);
                        class101.field2268.method1135(class10.field224, var5.field406, var5.field382, var5.field3025, 60, var5, var5.field403, var4, var5.field375);
                    } else {
                        var5.field3012 = false;
                        var5.field3025 = class38.method257(class10.field224, -169496123, var5.field382, var5.field406);
                        class101.field2268.method1114(class10.field224, var5.field406, var5.field382, var5.field3025, 60, var5, var5.field403, var4, var5.field2991, var5.field3010, var5.field3023, var5.field3004);
                    }
                }
            }
        }
        if (!arg0) {
            field3849 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Ljc;")
    public static final class83 method1296(int arg0, int arg1) {
        field3861++;
        class83 var2 = (class83) class141.field2969.method1078((byte) 25, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -112 / ((arg1 - 27) / 59);
        byte[] var4 = class199.field3930.method215(arg0, 8, 1);
        class83 var5 = new class83();
        if (var4 != null) {
            var5.method709(15, new class66(var4));
        }
        class141.field2969.method1076((long) arg0, -4, var5);
        return var5;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ldd;I)V")
    public static final void method1297(class32 arg0, int arg1) {
        if (arg1 != 0) {
            field3858 = null;
        }
        class111.field2466 = arg0;
        field3855++;
    }
}
