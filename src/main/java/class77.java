import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class77 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "[[I")
    public static int[][] field1414 = new int[5][5000];

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lmh;")
    public static class128 field1412 = class22.method156(122, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Z")
    public static boolean field1419 = false;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1411 = 0;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1413 = -2;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Lmh;")
    public static class128 field1420 = class22.method156(122, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "[[Z")
    public static boolean[][] field1423 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1417 = 0;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Ldj;")
    public static class314 field1416;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[[B")
    public static byte[][] field1422;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 7)
    private static final void method495(int arg0) {
        class167.field2861 = null;
        class234.field4036 = null;
        class208.field3641 = null;
        class97.field1673 = null;
        class117.field1986 = null;
        class42.field854 = null;
        class96.field1612 = null;
        class222.field3896 = null;
        class61.field1159 = null;
        class298.field5077 = null;
        class96.field1610 = null;
        client.field4159 = null;
        class34.field724 = null;
        class288.field4921 = null;
        class132.field2292 = null;
        class112.field1879 = null;
        field1421++;
        class32.field708 = null;
        class242.field4147 = null;
        class283.field4869 = null;
        class200.field3541 = null;
        if (arg0 != -1) {
            method497(-119);
        }
        class221.field3887 = null;
        class294.field5036 = null;
        class152.field2621 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 60)
    public static final void method496(int arg0) {
        class288.method1989();
        class228.field3971 = -1;
        class70.field1314 = null;
        class248.method1726(16);
        field1424++;
        class111.field1863.method1451(20650);
        class120.field2019 = new class285();
        ((class163) class141.field2419).method1076((byte) 76);
        class46.field931 = 0;
        class46.field919 = new class97[255];
        class126.method799();
        class312.method2123();
        method495(-1);
        class88.method547(-1741557305);
        class57.method379((byte) 60);
        for (int var1 = 0; var1 < 2048; var1++) {
            class123 var2 = class140.field2405[var1];
            if (var2 != null) {
                var2.field2056 = null;
            }
        }
        if (arg0 > -124) {
            method495(-103);
        }
        if (class247.field4247) {
            class312.method2115(104, 104);
        }
        class145.method976((byte) 94, class4.field74, class107.field1822);
        class232.method1596(18284, class4.field74);
        if (class105.field1799 == 5) {
            class260.method1821((byte) 27, class4.field74);
        }
        if (class105.field1799 == 10) {
            class192.method1288((byte) 86, false);
        }
        if (class105.field1799 == 30) {
            class298.method2039((byte) -52, 25);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 117)
    public static void method497(int arg0) {
        field1412 = null;
        field1416 = null;
        field1420 = null;
        field1414 = (int[][]) null;
        field1422 = (byte[][]) null;
        if (arg0 == 0) {
            field1423 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lcb;ILjava/awt/Frame;)V", line = 142)
    public static final void method498(class270 arg0, int arg1, Frame arg2) {
        if (arg1 != 100) {
            field1419 = false;
        }
        while (true) {
            class23 var3 = arg0.method1889(2, arg2);
            while (var3.field560 == 0) {
                class177.method1213(0, 10L);
            }
            if (var3.field560 == 1) {
                field1410++;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class177.method1213(0, 100L);
        }
    }
}
