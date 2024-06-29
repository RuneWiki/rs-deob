import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class137 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Z")
    public static boolean field2277 = false;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lbe;")
    public static class283 field2282 = class153.method941(-40, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lbe;")
    private static class283 field2284 = class153.method941(-92, "glow2:");

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lbe;")
    public static class283 field2286 = field2284;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lbe;")
    public static class283 field2288 = class153.method941(-48, "blinken3:");

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lbe;")
    public static class283 field2278 = field2284;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lbe;")
    public static class283 field2290 = class153.method941(126, "::clientdrop");

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method851(int arg0, byte arg1) {
        class54.field727[2] = (float) class178.method1174(255, arg0) / 255.0F;
        field2279++;
        class54.field727[0] = (float) class178.method1174(255, arg0 >> 16) / 255.0F;
        class54.field727[1] = (float) class178.method1174(255, arg0 >> 8) / 255.0F;
        class225.method1474(-119, 3);
        int var2 = 70 % ((arg1 + 46) / 63);
        class225.method1474(110, 4);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ls;", line = 32)
    public static final class257 method852(Throwable arg0, String arg1) {
        field2285++;
        class257 var2;
        if (arg0 instanceof class257) {
            var2 = (class257) arg0;
            var2.field4340 = var2.field4340 + ' ' + arg1;
        } else {
            var2 = new class257(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIIII)V", line = 48)
    public static final void method853(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 27) {
            return;
        }
        if (arg4 - arg3 >= class269.field4551 && arg3 + arg4 <= class166.field2765 && class217.field3677 <= arg1 - arg3 && (arg1 + arg3) <= class247.field4220) {
            class254.method1724(arg2, 2, arg4, arg1, arg3);
        } else {
            class124.method782(arg3, arg4, arg2, 0, arg1);
        }
        field2287++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 79)
    public static void method854(byte arg0) {
        field2288 = null;
        if (arg0 < 8) {
            method854((byte) 53);
        }
        field2284 = null;
        field2278 = null;
        field2286 = null;
        field2282 = null;
        field2290 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)[Lqb;", line = 95)
    public static final class95[] method855(int arg0) {
        class95[] var1 = new class95[class160.field2613];
        field2289++;
        for (int var2 = 0; var2 < class160.field2613; var2++) {
            var1[var2] = new class95(class197.field3372, class193.field3301, class247.field4226[var2], class232.field3933[var2], class202.field3451[var2], class201.field3440[var2], class256.field4329[var2], class296.field5018);
        }
        int var3 = -118 / ((55 - arg0) / 47);
        class88.method571(-4);
        return var1;
    }
}
