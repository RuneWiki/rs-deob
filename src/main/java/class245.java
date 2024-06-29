import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class245 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3980 = "";

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3987 = 0;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    public static int[] field3984 = new int[32];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3983 = "green:";

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3988 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[I")
    public static int[][] field3985;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static final void method1686(int arg0) {
        if (class222.field3412 != null) {
            class222.field3412.method554(true);
        }
        if (class183.field2844 != null) {
            class183.field2844.method554(true);
        }
        field3986++;
        class239.method1639(22050, -81, class155.field2407, 2);
        if (arg0 <= 87) {
            field3987 = 123;
        }
        class222.field3412 = class51.method382(22050, 0, class179.field2788, -1, class230.field3651);
        class222.field3412.method560(class241.field3916, (byte) -17);
        class183.field2844 = class51.method382(2048, 1, class179.field2788, -1, class230.field3651);
        class183.field2844.method560(class257.field4118, (byte) -117);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method1687(int arg0) {
        field3983 = null;
        field3985 = null;
        field3980 = null;
        field3984 = null;
        if (arg0 != 0) {
            field3988 = -67;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)[B")
    public abstract byte[] method109(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;IZB)Z")
    public static final boolean method1688(String arg0, int arg1, boolean arg2, byte arg3) {
        field3978++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = 99 % ((arg3 - 9) / 48);
        int var8 = arg0.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg0.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var12) {
                return false;
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg1 * var6 + var12;
            if ((var11 / arg1) != var6) {
                return false;
            }
            var5 = true;
            var6 = var11;
        }
        return var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BI)V")
    public abstract void method110(byte[] arg0, int arg1);
}
