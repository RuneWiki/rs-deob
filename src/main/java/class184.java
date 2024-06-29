import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class184 extends RuntimeException {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/lang/String;")
    public String field3621;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3616;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Led;")
    public static class43 field3620 = class191.method1219("Unerwartete Antwort vom Anmelde)2Server)3", false);

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[I")
    public static int[] field3625 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Led;")
    private static class43 field3626 = class191.method1219("Members object", false);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Led;")
    public static class43 field3627 = class191.method1219("Musik)2Engine vorbereitet)3", false);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Led;")
    public static class43 field3619 = class191.method1219("<col=ff0000>", false);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Led;")
    public static class43 field3618 = class191.method1219("Hierhin gehen", false);

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3630 = 0;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Led;")
    public static class43 field3633 = field3626;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Led;")
    public static class43 field3623 = class191.method1219(")3", false);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lga;")
    public static class58 field3631;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lig;")
    public static class80 field3632;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field3620 = null;
        field3633 = null;
        field3619 = null;
        field3632 = null;
        field3618 = null;
        field3631 = null;
        if (arg0 <= 100) {
            field3632 = null;
        }
        field3623 = null;
        field3627 = null;
        field3625 = null;
        field3626 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILga;)Z")
    public static final boolean method1185(int arg0, int arg1, int arg2, class58 arg3) {
        if (arg2 < 98) {
            method1186(false);
        }
        byte[] var4 = arg3.method367(arg0, arg1, (byte) -34);
        field3622++;
        if (var4 == null) {
            return false;
        } else {
            class101.method626(-127, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Lnb;")
    public static final class120 method1186(boolean arg0) {
        if (!arg0) {
            method1186(true);
        }
        class120 var1 = new class120();
        var1.field2386 = class69.field1382;
        var1.field2392 = class66.field1328[0];
        var1.field2389 = class52.field1055[0];
        var1.field2387 = class30.field573[0];
        field3634++;
        byte[] var2 = class1.field1[0];
        var1.field2390 = class79.field1567;
        var1.field2391 = class114.field2220[0];
        int var3 = var1.field2389 * var1.field2387;
        var1.field2388 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field2388[var4] = class17.field274[class7.method38(255, var2[var4])];
        }
        class60.method382((byte) -98);
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLed;)V")
    public static final void method1187(boolean arg0, class43 arg1) {
        field3624++;
        if (class144.field2957 >= 2) {
            if (arg1.method250(63, class167.field3331)) {
                System.gc();
            }
            if (arg1.method250(63, class189.field3696)) {
                class54.method332((byte) 30);
            }
            if (arg1.method250(63, class76.field1505)) {
                class34.field624 = true;
            }
            if (arg1.method250(63, class22.field385)) {
                class34.field624 = false;
            }
            if (arg1.method250(63, class53.field1068)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class147.field3011[var2].field3094[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method240(-1, class150.field3039) && class81.field1612 != 0) {
                class139.method899(false, arg1.method238(29, 6).method264(10));
            }
            if (arg1.method250(63, class103.field1967) && class81.field1612 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method240(-1, class5.field102)) {
                class23.field448 = arg1.method238(119, 12).method247((byte) -106).method264(10);
                class81.method504(class167.method1036(new class43[] { class4.field91, class30.method161(class23.field448, 10) }, true), null, 0, (byte) 85);
            }
            if (arg1.method250(63, class64.field1310)) {
                class121.field2415 = true;
            }
        }
        class29.field522.method338(253, 66);
        class101.field1932++;
        if (arg0) {
            class29.field522.method539(arg1.method248((byte) 60) - 1, 27678);
            class29.field522.method535(arg1.method238(53, 2), (byte) 0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class184(Throwable arg0, String arg1) {
        this.field3621 = arg1;
        this.field3616 = arg0;
    }
}
