import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class211 implements Runnable {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[Lqh;")
    public volatile class202[] field3659 = new class202[2];

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
    public volatile boolean field3658 = false;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Z")
    public volatile boolean field3662 = false;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Loa;")
    public static class99 field3655 = class221.method1463(2844, "logo");

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Loa;")
    public static class99 field3656 = class221.method1463(2844, ")1");

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[I")
    public static int[] field3661 = new int[] { 0, 0, 0, 0, 0, 0, 0, 5, 0, 10, 2, 0, 0, 9, 0, 0, 6, 0, 5, 0, 0, 5, 14, 0, -2, 0, 0, -1, 10, 0, 0, -1, 0, 0, -2, 0, 0, 8, 7, 0, 0, 4, 6, 14, 1, 8, 0, 6, 0, 5, 0, 0, 0, 0, 6, 0, 10, 0, 0, 0, 0, 7, 0, 20, 0, -1, 0, 6, 3, 0, 0, 0, 0, 0, 8, 0, 6, 0, -2, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 2, 1, 0, 0, -1, 0, -1, 0, 0, 0, 7, 6, -2, 5, 4, 5, 3, -2, 0, 0, 0, 0, 6, 0, 0, 7, 12, 0, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, 8, 0, 10, 0, 0, 5, -1, 0, 1, 0, 0, 0, 12, 0, 0, 0, 0, 0, 24, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, -2, 0, 0, 0, 10, 0, 15, 0, 0, 8, 0, -2, 0, 1, -1, 0, 0, 0, 0, -1, 0, 0, -2, -1, 0, 0, 4, 0, -1, 0, 3, 0, 3, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 8, -2, 15, 0, 2, 2, 0, -1, 2, 0, 1, 6, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 };

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3663 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Ljd;")
    public class87 field3660;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[S")
    public static short[] field3657;

    @OriginalMember(owner = "client!cc", name = "run", descriptor = "()V")
    public final void run() {
        field3654++;
        this.field3662 = true;
        try {
            while (!this.field3658) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class202 var2 = this.field3659[var1];
                    if (var2 != null) {
                        var2.method1368(true);
                    }
                }
                class100.method711(0, 10L);
                class123.method813(false, this.field3660, (Object) null);
            }
        } catch (Exception var9) {
            class196.method1315(false, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field3662 = false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method1414(byte arg0) {
        field3655 = null;
        field3656 = null;
        field3661 = null;
        field3657 = null;
        int var1 = 62 % ((arg0 + 29) / 38);
    }
}
