import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class36 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lqe;")
    public static class168 field440 = class66.method448("Sprites geladen)3", 16);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Lqe;")
    private static class168 field442 = class66.method448("wave2:", 67);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lqe;")
    public static class168 field439 = field442;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[I")
    public static int[] field449 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lqe;")
    public static class168 field456 = field442;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Lqe;")
    private static class168 field458 = class66.method448("Your ignore list is full)3 Max of 100 users)3", -124);

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Lqe;")
    public static class168 field453 = field458;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "J")
    public long field455;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lqf;")
    public class13 field441;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lqf;")
    public class13 field446;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lqf;")
    public class13 field447;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static final void method220(boolean arg0) {
        if (arg0) {
            method221(null, true, -57, -9);
        }
        Object var1 = class229.field3882;
        synchronized (class229.field3882) {
            if (class154.field2676 != 0) {
                class154.field2676 = 1;
                try {
                    class229.field3882.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field450++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BZII)I")
    public static final int method221(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field445++;
        int var4 = -1;
        if (arg1) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                var4 = var4 >>> 8 ^ class145.field2530[(var4 ^ arg0[var5]) & 0xFF];
            }
            return ~var4;
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method222(byte arg0) {
        field439 = null;
        field458 = null;
        field449 = null;
        field456 = null;
        field442 = null;
        field440 = null;
        if (arg0 == 114) {
            field453 = null;
        }
    }
}
