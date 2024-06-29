import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class131 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lvd;")
    private static class222 field2536 = class212.method1357("Your ignore list is full)3 Max of 100 users)3", 10731);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[S")
    public static short[] field2535 = new short[500];

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lvd;")
    private static class222 field2542 = class212.method1357("Login server offline)3", 10731);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lvd;")
    private static class222 field2538 = class212.method1357("World", 10731);

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2537 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lvd;")
    public static class222 field2541 = field2536;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lvd;")
    public static class222 field2543 = field2538;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lvd;")
    public static class222 field2540 = field2542;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static volatile int field2544 = 0;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lvd;")
    public static class222 field2546 = field2538;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lvd;")
    public static class222 field2545 = class212.method1357("gr-Un:", 10731);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lvd;")
    public static class222 field2547 = class212.method1357("<col=40ff00>", 10731);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lte;")
    public static class203 field2539;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public static final void method820(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class184.field3411; var3++) {
            for (int var4 = 0; var4 < class126.field2409; var4++) {
                for (int var5 = 0; var5 < class181.field3357; var5++) {
                    class121 var6 = class204.field3800[var3][var4][var5];
                    if (var6 != null) {
                        class94 var7 = var6.field2306;
                        if (var7 != null && var7.field1764.method331()) {
                            class153.method986(var7.field1764, var3, var4, var5, 1, 1);
                            if (var7.field1771 != null && var7.field1771.method331()) {
                                class153.method986(var7.field1771, var3, var4, var5, 1, 1);
                                var7.field1764.method333(var7.field1771, 0, 0, 0, false);
                                var7.field1771 = var7.field1771.method329(arg0, arg1, arg2);
                            }
                            var7.field1764 = var7.field1764.method329(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2299; var8++) {
                            class23 var10 = var6.field2297[var8];
                            if (var10 != null && var10.field543.method331()) {
                                class153.method986(var10.field543, var3, var4, var5, var10.field549 + 1 - var10.field534, var10.field535 - var10.field539 + 1);
                                var10.field543 = var10.field543.method329(arg0, arg1, arg2);
                            }
                        }
                        class5 var9 = var6.field2300;
                        if (var9 != null && var9.field90.method331()) {
                            class145.method914(var9.field90, var3, var4, var5);
                            var9.field90 = var9.field90.method329(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        field2546 = null;
        field2547 = null;
        field2542 = null;
        field2538 = null;
        field2543 = null;
        field2535 = null;
        field2536 = null;
        field2541 = null;
        field2545 = null;
        field2539 = null;
        field2540 = null;
        if (arg0 != 21334) {
            method821(-2);
        }
    }
}
