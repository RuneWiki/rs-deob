import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field1447 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field1452 = 0;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lge;")
    public static class41 field1451 = new class41(30);

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lwb;")
    public static class130 field1463 = class26.method212("Verbindung abgebrochen)3", -32376);

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "[[[I")
    public static int[][][] field1464 = new int[4][13][13];

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lwb;")
    private static class130 field1468 = class26.method212("Your account is already logged in)3", -32376);

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lwb;")
    public static class130 field1469 = class26.method212("compass", -32376);

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Z")
    public static boolean field1462 = false;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "Lwb;")
    public static class130 field1471 = class26.method212("Wen m-Ochten Sie der Liste hinzuf-Ugen?", -32376);

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lwb;")
    public static class130 field1460 = field1468;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lwb;")
    public static class130 field1470 = class26.method212("redstone3", -32376);

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "[[I")
    public static int[][] field1473 = new int[104][104];

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Ldc;")
    public class22 field1467;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Lk;")
    public static class60 field1472;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILk;I)[Lec;", line = 6)
    public static final class28[] method477(int arg0, int arg1, class60 arg2, int arg3) {
        field1456++;
        if (class24.method210(arg2, (byte) 127, arg3, arg1)) {
            if (arg0 >= -26) {
                field1466 = 53;
            }
            return class130.method975(107);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Lqd;", line = 35)
    public static final class100 method478(int arg0) {
        field1457++;
        class100 var1 = new class100();
        var1.field2411 = class97.field2352;
        var1.field2405 = class106.field2580;
        var1.field2406 = class31.field876[0];
        var1.field2408 = client.field548[0];
        var1.field2407 = class115.field2839[0];
        var1.field2409 = class26.field758[0];
        var1.field2410 = class31.field869;
        if (arg0 != 14858) {
            field1461 = -6;
        }
        var1.field2412 = class119.field2920[0];
        class15.method116((byte) -55);
        return var1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 61)
    public static final void method479(boolean arg0) {
        field1454++;
        class69.method559(class112.field2768, 116);
        if (class52.field1367 != -1) {
            class69.method559(class52.field1367, 122);
        }
        class31.field860 = 0;
        class52.field1365.method181(14664);
        class64.field1626 = class12.method87(class64.field1626);
        class49.method433();
        class90.method667(0, 0, -36, -1, 0, class112.field2768, 0, 765, 503);
        if (class52.field1367 != -1) {
            class90.method667(0, 0, -36, -1, 0, class52.field1367, 0, 765, 503);
        }
        if (arg0) {
            return;
        }
        if (field1462) {
            class8.method66(true);
        } else {
            class79.method607(-25634);
            class111.method852((byte) -126);
        }
        try {
            Graphics var1 = class84.field2003.getGraphics();
            class52.field1365.method187(0, var1, -26826, 0);
        } catch (Exception var2) {
            class84.field2003.repaint();
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V", line = 99)
    public static void method480(boolean arg0) {
        field1468 = null;
        field1469 = null;
        field1473 = null;
        field1464 = null;
        field1470 = null;
        field1472 = null;
        field1451 = null;
        field1463 = null;
        field1471 = null;
        if (!arg0) {
            method477(-2, 57, null, 83);
        }
        field1460 = null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 128)
    public static final void method481(int arg0) {
        field1459++;
        if (class93.field2250 == null) {
            return;
        }
        if (class30.field839 < 0) {
            if (class45.field1202 > 0) {
                class45.field1202--;
                if (class45.field1202 == 0) {
                    if (class88.field2127 == null) {
                        class93.field2250.method179((byte) 60, 256);
                    } else {
                        class93.field2250.method179((byte) -126, class14.field399);
                        class30.field839 = class14.field399;
                        class93.field2250.method177(class88.field2127, false, class14.field399, class7.field254);
                        class88.field2127 = null;
                    }
                    class132.field3186 = 0;
                }
            }
        } else if (class45.field1202 > 0) {
            class132.field3186 += class2.field34;
            class93.field2250.method171(class30.field839, arg0 + 19029, class132.field3186);
            class45.field1202--;
            if (class45.field1202 == 0) {
                class93.field2250.method176(76);
                class45.field1202 = 20;
                class30.field839 = -1;
            }
        }
        if (arg0 != 0) {
            method481(108);
        }
        class93.field2250.method172(-121);
    }
}
