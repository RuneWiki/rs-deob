import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class54 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lo;")
    public static class84 field1121 = class15.method124("Last password change:*6n@gre@", 255);

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lo;")
    public static class84 field1122 = class15.method124("To play on this world move to a free area first", 255);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lo;")
    public static class84 field1119 = class15.method124("Press (Wchange your password(W on front page)3", 255);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lo;")
    public static class84 field1123 = class15.method124("@yel@*V", 255);

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lqc;")
    public static class97 field1120 = new class97(64);

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
    public static boolean field1124 = false;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field1128 = 0;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lo;")
    public static class84 field1127 = class15.method124("From", 255);

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lo;")
    public static class84 field1130 = class15.method124("We suspect someone knows your password)3", 255);

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lo;")
    public static class84 field1131 = class15.method124("yellow:", 255);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
    public static int[] field1125;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method455(boolean arg0) {
        class31.field626 = null;
        class93.field2045 = null;
        field1116++;
        class26.field462 = null;
        if (!arg0) {
            method455(true);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 32)
    public static void method456(byte arg0) {
        field1119 = null;
        field1122 = null;
        field1131 = null;
        if (arg0 < 121) {
            field1121 = null;
        }
        field1123 = null;
        field1120 = null;
        field1130 = null;
        field1127 = null;
        field1125 = null;
        field1121 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[B", line = 79)
    public static final synchronized byte[] method457(int arg0, int arg1) {
        field1117++;
        if (arg0 == 100 && class38.field737 > 0) {
            byte[] var2 = client.field323[--class38.field737];
            client.field323[class38.field737] = null;
            return var2;
        } else if (arg0 == 5000 && class44.field938 > 0) {
            byte[] var3 = class36.field717[--class44.field938];
            class36.field717[class44.field938] = null;
            return var3;
        } else if (~arg0 == arg1 && class11.field226 > 0) {
            byte[] var4 = class93.field2044[--class11.field226];
            class93.field2044[class11.field226] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
