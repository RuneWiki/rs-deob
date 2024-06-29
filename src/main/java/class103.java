import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class103 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lwb;")
    public static class130 field2518 = class26.method212("Bitte starten Sie eine Mitgliedschaft", -32376);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lwb;")
    private static class130 field2522 = class26.method212("You are standing in a members)2only area)3", -32376);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lwb;")
    public static class130 field2519 = field2522;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lwb;")
    public static class130 field2526 = class26.method212("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", -32376);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lwb;")
    public static class130 field2524 = class26.method212("Absender:", -32376);

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lwb;")
    private static class130 field2520 = class26.method212("Loaded update list", -32376);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lwb;")
    public static class130 field2521 = class26.method212("blinken1:", -32376);

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lwb;")
    public static class130 field2529 = field2520;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lwb;")
    public static class130 field2530 = class26.method212("welle2:", -32376);

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[Lfe;")
    public static class36[] field2527 = new class36[2048];

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 15)
    public static void method793(byte arg0) {
        field2530 = null;
        field2524 = null;
        field2522 = null;
        field2526 = null;
        field2520 = null;
        field2527 = null;
        field2518 = null;
        field2519 = null;
        field2529 = null;
        if (arg0 < -69) {
            field2521 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I", line = 52)
    public static final int method794(int arg0, int arg1, int arg2) {
        if (arg2 <= 35) {
            field2519 = null;
        }
        field2532++;
        int var3 = class117.method902(arg0 - 1, arg1 + -1, -1826975373) + class117.method902(arg0 + 1, arg1 + -1, -1826975373) + class117.method902(arg0 - 1, arg1 - -1, -1826975373) + class117.method902(arg0 - -1, arg1 - -1, -1826975373);
        int var4 = class117.method902(arg0 - 1, arg1, -1826975373) + class117.method902(arg0 + 1, arg1, -1826975373) + class117.method902(arg0, arg1 - 1, -1826975373) + class117.method902(arg0, arg1 + 1, -1826975373);
        int var5 = class117.method902(arg0, arg1, -1826975373);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 91)
    public static final void method795(int arg0) {
        field2523++;
        if (class130.field3083 != null) {
            class35 var1 = class130.field3083;
            synchronized (class130.field3083) {
                class130.field3083 = null;
            }
        }
        if (arg0 != -17) {
            field2519 = null;
        }
    }
}
