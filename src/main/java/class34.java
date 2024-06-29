import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class34 implements class6 {

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lhj;")
    public static class69 field478 = class181.method1318(" <col=ffff00>", (byte) -109);

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lhj;")
    public static class69 field474 = class181.method1318("<col=00ff00>", (byte) -121);

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lmh;")
    public static class148 field473;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lkk;Z)V")
    public static final void method181(class222 arg0, boolean arg1) {
        field477++;
        if (!arg1) {
            method185(-53, (byte) -29, (class69) null);
        }
        int var2 = arg0.field4028 - class180.field3272;
        int var3 = arg0.field4031 * 128 + (arg0.method813(15963) * 64);
        int var4 = arg0.field4057 * 128 + arg0.method813(15963) * 64;
        if (arg0.field4058 == 0) {
            arg0.field4052 = 1024;
        }
        arg0.field4011 = 0;
        if (arg0.field4058 == 1) {
            arg0.field4052 = 1536;
        }
        arg0.field4005 += (var4 - arg0.field4005) / var2;
        arg0.field3985 += (var3 - arg0.field3985) / var2;
        if (arg0.field4058 == 2) {
            arg0.field4052 = 0;
        }
        if (arg0.field4058 == 3) {
            arg0.field4052 = 512;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lfh;I)Lik;")
    public static final class246 method182(class128 arg0, int arg1) {
        if (arg1 != 12) {
            method183(-50);
        }
        field479++;
        return new class246(arg0.method955((byte) -54), arg0.method955((byte) -82), arg0.method955((byte) 115), arg0.method955((byte) 115), arg0.method952((byte) -67), arg0.method952((byte) -82), arg0.method937(false));
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([IJII)Lhj;")
    public final class69 method28(int[] arg0, long arg1, int arg2, int arg3) {
        field475++;
        if (arg2 == 0) {
            class235 var6 = class22.method126(arg0[0], (byte) -38);
            return var6.method1662(57, (int) arg1);
        } else if (arg2 == 1 || arg2 == 10) {
            class205 var7 = class83.method585((int) arg1, arg3 + 30324);
            return var7.field3741;
        } else if (arg2 == 6 || arg2 == 7) {
            return class22.method126(arg0[0], (byte) -38).method1662(arg3 + 30361, (int) arg1);
        } else {
            if (arg3 != -30325) {
                field478 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method183(int arg0) {
        field478 = null;
        int var1 = 121 % ((-arg0 - 21) / 56);
        field473 = null;
        field474 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static final void method184(boolean arg0) {
        if (class261.field4656[98]) {
            class157.field2920 += (12 - class157.field2920) / 2;
        } else if (class261.field4656[99]) {
            class157.field2920 += (-class157.field2920 - 12) / 2;
        } else {
            class157.field2920 /= 2;
        }
        class207.field3775 += class157.field2920 / 2;
        if (class261.field4656[96]) {
            class21.field298 += (-class21.field298 - 24) / 2;
        } else if (class261.field4656[97]) {
            class21.field298 += (24 - class21.field298) / 2;
        } else {
            class21.field298 /= 2;
        }
        client.field2812 += class21.field298 / 2;
        int var1 = class41.field588 + class156.field2904.field3985;
        field481++;
        int var2 = class156.field2904.field4005 + class21.field294;
        if ((class27.field381 - var1) < -500 || class27.field381 - var1 > 500 || class167.field3083 - var2 < -500 || (class167.field3083 - var2) > 500) {
            class27.field381 = var1;
            class167.field3083 = var2;
        }
        if (class27.field381 != var1) {
            class27.field381 += (var1 - class27.field381) / 16;
        }
        if (class167.field3083 != var2) {
            class167.field3083 += (var2 - class167.field3083) / 16;
        }
        if (!arg0) {
            class126.method900(arg0);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLhj;)V")
    public static final void method185(int arg0, byte arg1, class69 arg2) {
        field480++;
        class135 var3 = class8.method38((byte) 126, 2, arg0);
        int var4 = 14 / ((-arg1 - 58) / 32);
        var3.method1011((byte) 122);
        var3.field2533 = arg2;
    }
}
