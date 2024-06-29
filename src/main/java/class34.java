import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class34 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Led;")
    public static class43 field620 = class191.method1219(" loggt sich aus)3", false);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Led;")
    public static class43 field621 = class191.method1219("Null", false);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Led;")
    private static class43 field625 = class191.method1219("Try again in 60 secs)3)3)3", false);

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Led;")
    public static class43 field626 = field625;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
    public static boolean field624 = false;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method193(byte arg0) {
        field625 = null;
        field620 = null;
        field626 = null;
        if (arg0 >= -108) {
            field621 = null;
        }
        field621 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    public static final void method194(int arg0, int arg1) {
        field622++;
        if (!class54.method335(-758973232, arg1)) {
            return;
        }
        class129[] var2 = class12.field177[arg1];
        int var3 = 53 % ((arg0 - 57) / 42);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class129 var5 = var2[var4];
            if (var5 != null) {
                var5.field2674 = 0;
                var5.field2589 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLob;)Z")
    public static final boolean method195(boolean arg0, class129 arg1) {
        field627++;
        if (arg1.field2588 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0) {
            return false;
        }
        while (var2 < arg1.field2588.length) {
            int var3 = class36.method204(arg1, -1, var2);
            int var4 = arg1.field2701[var2];
            if (arg1.field2588[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2588[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field2588[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method196(int arg0) {
        if (arg0 != -16866) {
            field626 = null;
        }
        class198.field3902.method1108((byte) -90);
        field623++;
    }
}
