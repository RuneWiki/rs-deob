import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class273 {

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lmb;")
    public static class258 field4109 = null;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
    public static boolean field4114 = false;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Ldp;")
    public static class174 field4105;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Lpi;")
    public static class220 field4110;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Ldj;")
    public static class304 field4112;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 17)
    public static final void method1954(int arg0, int arg1) {
        if (arg0 != 27950) {
            field4109 = null;
        }
        field4107++;
        class153.field2328 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZBI)Ljava/lang/String;", line = 28)
    public static final String method1955(int arg0, boolean arg1, byte arg2, int arg3) {
        field4108++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg1 && arg0 >= 0) {
            int var4 = 2;
            for (int var5 = arg0 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg2 < 66) {
                field4113 = 92;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg3;
                int var9 = var8 - arg0 * arg3;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 86)
    public static void method1956(byte arg0) {
        if (arg0 <= -4) {
            field4109 = null;
            field4112 = null;
            field4105 = null;
            field4110 = null;
        }
    }
}
