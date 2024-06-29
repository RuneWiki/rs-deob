import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lhb;")
    private static class44 field862 = class102.method810("Error loading your profile)3", -28606);

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lhb;")
    private static class44 field859 = class102.method810("Loading )2 please wait)3", -28606);

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lhb;")
    public static class44 field860 = class102.method810("::fpsoff", -28606);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lhb;")
    public static class44 field857 = field859;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lic;")
    public static class51 field871 = null;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lhb;")
    public static class44 field868 = class102.method810("backbase1", -28606);

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lhb;")
    public static class44 field864 = field862;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lhc;")
    public static class45 field865;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 18)
    public static void method339(byte arg0) {
        field862 = null;
        field857 = null;
        field865 = null;
        field864 = null;
        if (arg0 != 27) {
            method341(-128, 19, -94);
        }
        field859 = null;
        field868 = null;
        field860 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ltd;BLtd;)V", line = 39)
    public static final void method340(class116 arg0, byte arg1, class116 arg2) {
        class129.field3108 = arg0;
        class11.field216 = arg2;
        if (arg1 > 120) {
            field866++;
            class48.field1188 = class11.field216.method886(0, 3);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V", line = 60)
    public static final void method341(int arg0, int arg1, int arg2) {
        class47 var3 = class82.field2115[class79.field1993][arg2][arg1];
        field863++;
        if (var3 == null) {
            class89.field2283.method275(class79.field1993, arg2, arg1);
            return;
        }
        int var4 = -41 % ((arg0 - 29) / 43);
        int var5 = -99999999;
        class67 var6 = null;
        for (class67 var7 = (class67) var3.method443((byte) -111); var7 != null; var7 = (class67) var3.method434(true)) {
            class80 var12 = class42.method358(0, var7.field1682);
            int var13 = var12.field2056;
            if (var12.field2024 == 1) {
                var13 = (var7.field1693 + 1) * var13;
            }
            if (var5 < var13) {
                var6 = var7;
                var5 = var13;
            }
        }
        if (var6 == null) {
            class89.field2283.method275(class79.field1993, arg2, arg1);
            return;
        }
        class67 var8 = null;
        int var9 = (arg1 << 7) + arg2 + 1610612736;
        var3.method440(var6, (byte) -64);
        class67 var10 = null;
        for (class67 var11 = (class67) var3.method443((byte) -111); var11 != null; var11 = (class67) var3.method434(true)) {
            if (var6.field1682 != var11.field1682) {
                if (var8 == null) {
                    var8 = var11;
                }
                if (var8.field1682 != var11.field1682 && var10 == null) {
                    var10 = var11;
                }
            }
        }
        class89.field2283.method260(class79.field1993, arg2, arg1, class55.method507(arg1 * 128 + 64, class79.field1993, arg2 * 128 + 64, -1), var6, var9, var8, var10);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 164)
    public static final void method342(int arg0) {
        field867++;
        if (arg0 <= 49) {
            field861 = -25;
        }
        class4.field99.method335((byte) 126);
    }
}
