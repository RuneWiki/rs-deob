import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lhe;")
    public static class54 field517 = class6.method58("blinken2:", false);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lhe;")
    public static class54 field518 = class6.method58("<br>", false);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lhe;")
    private static class54 field520 = class6.method58("Enter your username (V password)3", false);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lhe;")
    public static class54 field519 = class6.method58("(U2", false);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lhe;")
    public static class54 field530 = class6.method58("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", false);

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lhe;")
    public static class54 field525 = field520;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lhe;")
    public static class54 field526 = class6.method58("sl_stars", false);

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lhe;")
    public static class54 field524 = class6.method58(")1j", false);

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "J")
    public static long field521;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lcb;")
    public static class17 field523;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILeb;BIZB)V")
    public static final void method154(int arg0, int arg1, class31 arg2, byte arg3, int arg4, boolean arg5, byte arg6) {
        field527++;
        long var7 = (long) ((arg4 << 16) + arg1);
        class84 var9 = (class84) class75.field1853.method246((byte) 117, var7);
        int var10 = 1 % ((-arg6 - 83) / 39);
        if (var9 != null) {
            return;
        }
        class84 var11 = (class84) class99.field2509.method246((byte) 117, var7);
        if (var11 != null) {
            return;
        }
        class84 var12 = (class84) class115.field2737.method246((byte) 117, var7);
        if (var12 == null) {
            if (!arg5) {
                class84 var13 = (class84) class72.field1803.method246((byte) 117, var7);
                if (var13 != null) {
                    return;
                }
            }
            class84 var14 = new class84();
            var14.field2101 = arg0;
            var14.field2083 = arg3;
            var14.field2092 = arg2;
            if (arg5) {
                class75.field1853.method241(var14, var7, false);
                class63.field1539++;
            } else {
                class4.field107.method1(var14, 3);
                class115.field2737.method241(var14, var7, false);
                class149.field3386++;
            }
        } else if (arg5) {
            var12.method936(-1);
            class75.field1853.method241(var12, var7, false);
            class63.field1539++;
            class149.field3386--;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method155(int arg0) {
        field520 = null;
        field524 = null;
        field525 = null;
        if (arg0 <= 83) {
            return;
        }
        field518 = null;
        field517 = null;
        field519 = null;
        field523 = null;
        field526 = null;
        field530 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method156(int arg0) {
        field516++;
        if (~class151.field3404 < arg0) {
            class77.method592(arg0 + 1);
        } else {
            class4.method28(40, 1);
            class9.field259 = class142.field3236;
            class142.field3236 = null;
        }
    }
}
