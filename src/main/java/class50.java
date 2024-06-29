import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class50 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "[[S")
    public static short[][] field883 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Ljd;")
    public static class85 field881 = null;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[[B")
    public static byte[][] field886 = new byte[250][];

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ljd;")
    public static class85 field879 = class221.method1499("Fertigkeit)2", (byte) -63);

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Ljg;")
    public class163 field885;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Lge;")
    public static class68 field880;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public int[] field874;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
    public static final int method334(int arg0, int arg1) {
        if (arg0 != -27106) {
            return -49;
        }
        field877++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method335(byte arg0) {
        field881 = null;
        field883 = null;
        field880 = null;
        field879 = null;
        if (arg0 != -61) {
            field879 = null;
        }
        field886 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljd;Lik;B)I")
    public static final int method336(class85 arg0, class247 arg1, byte arg2) {
        field882++;
        int var3 = arg1.field4224;
        arg1.method1688(116, arg0.field1538);
        if (arg2 <= 89) {
            return 59;
        } else {
            arg1.field4224 += class82.field1502.method132(arg0.field1548, arg0.field1538, -1, arg1.field4238, 0, arg1.field4224);
            return arg1.field4224 - var3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIII)I")
    public static final int method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg1;
            arg1 = var7;
        }
        int var8 = arg3 & 0x3;
        field884++;
        if (var8 == 0) {
            return arg6;
        }
        if (arg5 > -109) {
            method335((byte) 18);
        }
        if (var8 == 1) {
            return 8 - arg4 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)V")
    public static final void method338(int arg0, byte arg1) {
        if (arg1 != 54) {
            return;
        }
        for (class105 var2 = (class105) class273.field4821.method1392((byte) -120); var2 != null; var2 = (class105) class273.field4821.method1399(arg1 ^ 0xFFFFFFB7)) {
            if ((var2.field4377 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1753(137);
            }
        }
        field887++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IJ)V")
    public static final void method339(int arg0, long arg1) {
        field875++;
        if (arg0 != -27106 || arg1 == 0L) {
            return;
        }
        if (!(class45.field810 < 100 || class108.field1898 == 1) || class45.field810 >= 200) {
            class148.method972(class184.field3153, (byte) -47, class100.field1795, 0);
            return;
        }
        class85 var3 = class116.method814(arg1, -86).method587((byte) -84);
        for (int var4 = 0; var4 < class45.field810; var4++) {
            if (class28.field428[var4] == arg1) {
                class148.method972(class172.method1150(new class85[] { var3, class213.field3741 }, 0), (byte) -111, class100.field1795, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class56.field978; var5++) {
            if (class137.field2379[var5] == arg1) {
                class148.method972(class172.method1150(new class85[] { class207.field3623, var3, class196.field3374 }, 0), (byte) -44, class100.field1795, 0);
                return;
            }
        }
        if (var3.method612((byte) 115, class22.field308.field762)) {
            class148.method972(class68.field1291, (byte) -68, class100.field1795, 0);
            return;
        }
        class1.field5[class45.field810] = var3;
        class28.field428[class45.field810] = arg1;
        class222.field3890[class45.field810] = 0;
        class190.field3267[class45.field810] = class100.field1795;
        class220.field3863++;
        class183.field3117[class45.field810] = 0;
        client.field2560[class45.field810] = false;
        class207.field3613 = class43.field755;
        class45.field810++;
        class207.field3618.method483(-24260, 176);
        class207.field3618.method1674((byte) 101, arg1);
    }
}
