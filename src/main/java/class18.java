import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class18 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field342 = 0;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public int field359 = 0;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lae;")
    public static class6 field345 = class64.method474(109, "::");

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lae;")
    private static class6 field351 = class64.method474(108, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field340 = 0;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Lae;")
    public static class6 field355 = field351;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lae;")
    public static class6 field357 = class64.method474(120, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Lae;")
    public static class6 field354 = class64.method474(114, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lae;")
    private static class6 field352 = class64.method474(126, "Moderator option: Mute player for 48 hours: <OFF>");

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Lae;")
    public static class6 field361 = field352;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Lae;")
    public static class6 field353 = class64.method474(125, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static volatile int field360 = -1;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lgd;")
    public class42 field339;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field349;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)[Lva;", line = 7)
    public static final class128[] method177(byte arg0) {
        field358++;
        if (arg0 != 68) {
            field361 = null;
        }
        class128[] var1 = new class128[class21.field507];
        for (int var2 = 0; var2 < class21.field507; var2++) {
            class128 var3 = var1[var2] = new class128();
            var3.field3105 = class19.field374;
            var3.field3106 = class90.field2154;
            var3.field3107 = class58.field1251[var2];
            var3.field3102 = class72.field1653[var2];
            var3.field3103 = class64.field1388[var2];
            var3.field3104 = class139.field3369[var2];
            var3.field3108 = class103.field2429;
            var3.field3109 = class47.field1068[var2];
        }
        class25.method230(false);
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V", line = 48)
    public static final void method178(int arg0, int arg1) {
        if (arg0 == -3) {
            class67.method486(8845, class20.field390, class20.field429, class105.field2489);
        } else if (arg0 == -2) {
            class67.method486(arg1 ^ 0x2295, class21.field504, class20.field445, class20.field422);
        } else if (arg0 == -1) {
            class67.method486(8845, class20.field399, class20.field432, class107.field2573);
        } else if (arg0 == 3) {
            class67.method486(arg1 + 8821, class139.field3381, class20.field426, class20.field435);
        } else if (arg0 == 4) {
            class67.method486(8845, class34.field811, class20.field437, class129.field3116);
        } else if (arg0 == 5) {
            class67.method486(8845, class7.field134, class20.field441, class50.field1125);
        } else if (arg0 == 6) {
            class67.method486(8845, class126.field3074, class20.field425, class122.field3008);
        } else if (arg0 == 7) {
            class67.method486(8845, class130.field3161, class20.field434, class12.field224);
        } else if (arg0 == 8) {
            class67.method486(8845, class80.field1947, class20.field451, class19.field378);
        } else if (arg0 == 9) {
            class67.method486(8845, class40.field881, class20.field455, class41.field918);
        } else if (arg0 == 10) {
            class67.method486(8845, class123.field3022, class20.field454, class19.field379);
        } else if (arg0 == 11) {
            class67.method486(8845, class7.field146, class20.field439, class41.field932);
        } else if (arg0 == 12) {
            class67.method486(arg1 + 8821, class61.field1324, class20.field448, class82.field2015);
        } else if (arg0 == 13) {
            class67.method486(8845, class20.field398, class20.field447, class30.field746);
        } else if (arg0 == 14) {
            class67.method486(8845, class37.field844, class20.field418, class122.field3019);
        } else if (arg0 == 16) {
            class67.method486(8845, class54.field1191, class20.field452, class50.field1110);
        } else if (arg0 == 17) {
            class67.method486(arg1 + 8821, class88.field2113, class20.field431, class20.field402);
        } else if (arg0 == 18) {
            class67.method486(8845, class133.field3259, class20.field453, class20.field394);
        } else if (arg0 == 19) {
            class67.method486(8845, class35.field830, class130.field3159, field355);
        } else if (arg0 == 20) {
            class67.method486(8845, class20.field396, class20.field450, class19.field384);
        } else if (arg0 == 22) {
            class67.method486(arg1 ^ 0x2295, class27.field670, class20.field433, class133.field3263);
        } else if (arg0 == 23) {
            class67.method486(8845, class37.field838, class20.field430, client.field457);
        } else if (arg0 == 24) {
            class67.method486(arg1 ^ 0x2295, class40.field887, class20.field419, class117.field2760);
        } else if (arg0 == 25) {
            class67.method486(arg1 + 8821, class20.field388, class20.field443, class123.field3030);
        } else if (arg0 == 26) {
            class67.method486(8845, class105.field2490, class20.field440, class50.field1123);
        } else if (arg0 == 27) {
            class67.method486(8845, class12.field237, class20.field424, class20.field436);
        } else {
            class67.method486(8845, class20.field416, class20.field442, class6.field124);
        }
        if (arg1 != 24) {
            method179(-6);
        }
        field350++;
        class139.method1122((byte) 40, 10);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 177)
    public static void method179(int arg0) {
        field354 = null;
        field355 = null;
        field352 = null;
        field357 = null;
        field361 = null;
        field349 = null;
        int var1 = 104 / ((arg0 + 2) / 60);
        field345 = null;
        field353 = null;
        field351 = null;
    }
}
