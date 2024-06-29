import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 extends class110 {

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Leh;")
    private static class47 field466 = class195.method1282((byte) -4, "glow3:");

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Leh;")
    public static class47 field468 = field466;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Leh;")
    private static class47 field467 = class195.method1282((byte) -4, "Service unavailable)3");

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Leh;")
    public static class47 field465 = field466;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Leh;")
    public static class47 field464 = field467;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Leh;")
    private static class47 field470 = class195.method1282((byte) -4, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Leh;")
    public static class47 field473 = field470;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "[B")
    public static byte[] field471 = new byte[520];

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Leh;")
    public class47 field469;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public static void method232(boolean arg0) {
        field473 = null;
        field464 = null;
        field466 = null;
        field467 = null;
        field465 = null;
        field468 = null;
        field471 = null;
        if (!arg0) {
            method232(true);
        }
        field470 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[BI)I")
    public static final int method233(int arg0, int arg1, byte[] arg2, int arg3) {
        field472++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class118.field2395[(arg2[var5] ^ var4) & 0xFF];
        }
        return arg0 == 255 ? ~var4 : 103;
    }
}
