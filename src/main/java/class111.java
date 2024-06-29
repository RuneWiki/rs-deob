import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class111 {

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Luc;")
    private class191 field2448 = new class191();

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lse;")
    private class175 field2452 = new class175();

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Ll;")
    private class107 field2453;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lg;")
    public static class61 field2443 = new class61();

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2456 = 0;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Ldd;")
    public static class35 field2457 = class180.method1196((byte) 126, "<col=c0ff00>");

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "[Lbe;")
    public static class16[] field2458 = new class16[4];

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Ldd;")
    public static class35 field2459 = class180.method1196((byte) -47, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Llb;")
    public final class109 method809(int arg0) {
        if (arg0 != 16) {
            field2458 = null;
        }
        field2445++;
        return this.field2453.method794((byte) 90);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method810(int arg0) {
        field2443 = null;
        field2457 = null;
        if (arg0 < -127) {
            field2458 = null;
            field2459 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)V")
    public final void method811(byte arg0, long arg1) {
        field2451++;
        class191 var4 = (class191) this.field2453.method796(true, arg1);
        if (var4 != null) {
            var4.method799(-24265);
            var4.method1256((byte) -38);
            this.field2455++;
        }
        int var5 = -15 / ((10 - arg0) / 47);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)J")
    public static final long method812(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        return var3 == null || var3.field1210 == null ? 0L : var3.field1210.field444;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public final void method813(int arg0) {
        field2444++;
        if (arg0 >= -106) {
            method810(65);
        }
        while (true) {
            class191 var2 = this.field2452.method1171(true);
            if (var2 == null) {
                this.field2455 = this.field2454;
                return;
            }
            var2.method799(-24265);
            var2.method1256((byte) 119);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lch;")
    public static final class29 method814(int arg0, int arg1) {
        if (arg0 > -106) {
            field2458 = null;
        }
        field2446++;
        class29 var2 = (class29) class186.field3795.method817(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field189.method39(16, -1, arg1);
        class29 var4 = new class29();
        if (var3 != null) {
            var4.method276(new class26(var3), (byte) 10);
        }
        class186.field3795.method816(var4, (long) arg1, 16);
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Llb;")
    public final class109 method815(byte arg0) {
        if (arg0 < 101) {
            return null;
        } else {
            field2447++;
            return this.field2453.method790(-127);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Luc;JI)V")
    public final void method816(class191 arg0, long arg1, int arg2) {
        if (this.field2455 == 0) {
            class191 var5 = this.field2452.method1171(true);
            var5.method799(arg2 ^ 0xFFFFA127);
            var5.method1256((byte) -55);
            if (this.field2448 == var5) {
                class191 var6 = this.field2452.method1171(true);
                var6.method799(-24265);
                var6.method1256((byte) -43);
            }
        } else {
            this.field2455--;
        }
        this.field2453.method789(arg0, true, arg1);
        field2450++;
        if (arg2 == 16) {
            this.field2452.method1168(arg0, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZJ)Luc;")
    public final class191 method817(boolean arg0, long arg1) {
        field2449++;
        class191 var4 = (class191) this.field2453.method796(arg0, arg1);
        if (!arg0) {
            this.method816(null, -118L, 40);
        }
        if (var4 != null) {
            this.field2452.method1168(var4, (byte) -23);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
    public class111(int arg0) {
        this.field2455 = arg0;
        int var2 = 1;
        this.field2454 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field2453 = new class107(var2);
    }
}
