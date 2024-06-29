import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class150 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lja;")
    public static class62 field3532 = class30.method243(43, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lja;")
    private static class62 field3530 = class30.method243(43, "Connection timed out)3");

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3528 = 0;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lja;")
    public static class62 field3536 = class30.method243(43, "huffman");

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[Lf;")
    public static class39[] field3531 = new class39[50];

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lja;")
    public static class62 field3535 = field3530;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field3525 = -1;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field3538 = 1;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lja;")
    public static class62 field3534 = class30.method243(43, "Abbrechen");

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lhe;")
    public static class54 field3540 = null;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lja;")
    public static class62 field3539 = class30.method243(43, "mapedge");

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILpd;Lpd;Lpd;)V")
    public static final void method1182(int arg0, class108 arg1, class108 arg2, class108 arg3) {
        field3533++;
        if (arg0 != 16711935) {
            return;
        }
        class128.field2898 = arg2;
        class60.field1464 = arg1;
        class122.field2784 = arg3;
        class131.field2990 = new class54[class128.field2898.method862((byte) -114)][];
        class27.field670 = new boolean[class128.field2898.method862((byte) -108)];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILpd;BI)[Lq;")
    public static final class114[] method1183(int arg0, class108 arg1, byte arg2, int arg3) {
        field3537++;
        if (arg2 != 57) {
            method1182(-75, null, null, null);
        }
        return class63.method478(arg3, arg0, arg1, (byte) 127) ? class40.method297((byte) -52) : null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1184(int arg0) {
        if (arg0 != 1061) {
            field3540 = null;
        }
        field3539 = null;
        field3540 = null;
        field3530 = null;
        field3536 = null;
        field3532 = null;
        field3531 = null;
        field3535 = null;
        field3534 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static final void method1185(boolean arg0) {
        field3526++;
        if (!class119.field2709) {
            class53.field1226[0] = class70.field1782;
            class146.field3437[0] = 1007;
            class60.field1479[0] = class83.field1991;
            class128.field2889 = 1;
        }
        if (class137.field3164 != -1) {
            class82.method644(class137.field3164, (byte) 115);
        }
        for (int var1 = 0; var1 < class102.field2371; var1++) {
            if (class18.field416[var1]) {
                class134.field3070[var1] = true;
            }
            class121.field2769[var1] = class18.field416[var1];
            class18.field416[var1] = false;
        }
        class118.field2687 = null;
        class26.field614 = -1;
        class120.field2741 = -1;
        class36.field859 = class86.field2060;
        if (class137.field3164 != -1) {
            class102.field2371 = 0;
            class27.method213(-128, 503, 0, -1, 0, 765, 0, 0, class137.field3164);
        }
        class29.method232(true);
        if (class119.field2709) {
            class94.method724((byte) 29);
        } else if (class120.field2741 != -1) {
            class135.method1083(class26.field614, 2, class120.field2741);
        }
        if (class1.field11 == 3) {
            class19.method142();
            for (int var2 = 0; var2 < class102.field2371; var2++) {
                if (class121.field2769[var2]) {
                    class19.method137(class13.field313[var2], class34.field824[var2], class130.field2979[var2], class111.field2558[var2], 16711935, 128);
                } else if (class134.field3070[var2]) {
                    class19.method137(class13.field313[var2], class34.field824[var2], class130.field2979[var2], class111.field2558[var2], 16711680, 128);
                }
            }
        }
        class60.method430(class155.field3598, class45.field1024, class40.field936.field134, (byte) -78, class40.field936.field136);
        class45.field1024 = 0;
        if (arg0) {
            method1183(64, null, (byte) -75, 79);
        }
    }
}
