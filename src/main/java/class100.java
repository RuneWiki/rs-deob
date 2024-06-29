import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class100 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lgd;")
    private static class40 field2375 = class14.method90(false, "Invalid username or password)3");

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lgd;")
    public static class40 field2378 = field2375;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lgd;")
    public static class40 field2370 = class14.method90(false, "Registrierter Benutzer");

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lgd;")
    private static class40 field2373 = class14.method90(false, "From");

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lgd;")
    public static class40 field2372 = field2373;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lhb;")
    public static class43 field2376 = new class43(5000);

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lgd;")
    private static class40 field2381 = class14.method90(false, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lgd;")
    public static class40 field2382 = field2381;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lwe;")
    public static class137 field2383;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Loc;")
    public static class86 field2374;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 7)
    public static void method703(byte arg0) {
        field2373 = null;
        field2376 = null;
        field2383 = null;
        if (arg0 != 61) {
            field2373 = null;
        }
        field2382 = null;
        field2374 = null;
        field2375 = null;
        field2372 = null;
        field2381 = null;
        field2370 = null;
        field2378 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLgd;ZLgd;)V", line = 26)
    public static final void method704(boolean arg0, class40 arg1, boolean arg2, class40 arg3) {
        field2380++;
        if (!arg2) {
            field2375 = null;
        }
        if (class64.field1571) {
            class64.field1571 = false;
            class136.method1073(205);
            class34.method215((byte) 44);
            class11.method60((byte) -13);
            class129.method1019((byte) -104);
            class87.method573(true, class76.field1765, class1.field23, class133.field3238, class94.field2163);
            class48.method371(-1, class107.field2604, class18.field440 == -1, (byte) -128, class126.field3014);
            class114.field2748 = true;
            class12.field300 = true;
            class30.field762 = true;
        }
        short var4 = 151;
        class113.method880(-28475);
        int var6 = var4 - 3;
        class133.field3238.method349(arg3, 257, var6, 0);
        class133.field3238.method349(arg3, 256, var6 - 1, 16777215);
        if (arg1 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = class133.field3238.method367(arg1) + 4;
                class27.method164(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class133.field3238.method349(arg1, 257, var6, 0);
            class133.field3238.method349(arg1, 256, var6 - 1, 16777215);
        }
        class70.method490((byte) 113);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 86)
    public static final void method705(int arg0, int arg1, int arg2) {
        field2379++;
        long var3 = (long) ((arg1 << arg2) + arg0);
        class85 var5 = (class85) class128.field3027.method142(var3, arg2 - 861056576);
        if (var5 != null) {
            class91.field2054.method509(var5, arg2 - 861079710);
        }
    }
}
