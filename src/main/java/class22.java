import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class22 implements Runnable {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[Lvf;")
    public volatile class194[] field450 = new class194[2];

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Z")
    public volatile boolean field455 = false;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
    public volatile boolean field451 = false;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lcf;")
    public static class25 field452 = new class25();

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lcd;")
    private static class23 field458 = class54.method414("Loading config )2 ", -1);

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lcd;")
    public static class23 field459 = class54.method414("Sie befinden sich in einem Mitglieder)2Gebiet(Q", -1);

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lcd;")
    public static class23 field460 = class54.method414("mapmarker", -1);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lcd;")
    public static class23 field456 = class54.method414("AUS", -1);

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lcd;")
    public static class23 field463 = class54.method414("<col=ff3000>", -1);

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lcd;")
    public static class23 field464 = field458;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lpc;")
    public class137 field453;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[Lea;")
    public static class38[] field461;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method131(int arg0) {
        field464 = null;
        field460 = null;
        field463 = null;
        field458 = null;
        int var1 = 71 % ((arg0 - 71) / 35);
        field452 = null;
        field459 = null;
        field456 = null;
        field461 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method132(int arg0) {
        class91.field1943.method997(false);
        field457++;
        if (arg0 != 10) {
            field456 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "run", descriptor = "()V")
    public final void run() {
        this.field451 = true;
        field454++;
        try {
            while (!this.field455) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class194 var2 = this.field450[var1];
                    if (var2 != null) {
                        var2.method1251(true);
                    }
                }
                class53.method409(10L, -25391);
                class63.method468(null, -40, this.field453);
            }
        } catch (Exception var9) {
            class186.method1145(null, var9, 46);
        } finally {
            Object var6 = null;
            this.field451 = false;
        }
    }
}
