import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 extends Canvas {

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field1433;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1411 = -1;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lqf;")
    public static class117 field1413 = class72.method514(125, "backtop1");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lqf;")
    public static class117 field1417 = class72.method514(107, "sch-Utteln:");

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1414 = 2;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1421 = 0;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lqf;")
    private static class117 field1422 = class72.method514(108, "Public chat");

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lqf;")
    public static class117 field1412 = field1422;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field1427 = -1;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lqf;")
    public static class117 field1431 = class72.method514(103, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "J")
    public static volatile long field1430 = 0L;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1420 = 0;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
    public static int[] field1424 = new int[5];

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lqf;")
    public static class117 field1432 = class72.method514(107, "<col=c0ff00>");

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Ldf;")
    public static class28 field1426;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Ldf;")
    public static class28 field1428;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lha;")
    public static class50 field1416;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljb;")
    public static class64 field1410;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Z")
    public static boolean field1436;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "[[[B")
    public static byte[][][] field1419;

    @OriginalMember(owner = "client!jf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1433.update(arg0);
        field1435++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILjb;)Z")
    public static final boolean method478(int arg0, int arg1, int arg2, class64 arg3) {
        field1425++;
        byte[] var4 = arg3.method458(false, arg1, arg2);
        if (arg0 != 12127) {
            method478(-48, -38, 28, null);
        }
        if (var4 == null) {
            return false;
        } else {
            class23.method184(var4, (byte) -75);
            return true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method479(int arg0) {
        field1434++;
        if (class133.field3142 == 1) {
            if (class153.field3788 >= 539 && class153.field3788 <= 573 && class102.field2462 >= 169 && class102.field2462 < 205 && class27.field529[0] != -1) {
                class64.field1281 = 0;
                class55.field1144 = true;
                class139.field3310 = true;
            }
            if (class153.field3788 >= 569 && class153.field3788 <= 599 && class102.field2462 >= 168 && class102.field2462 < 205 && class27.field529[1] != -1) {
                class139.field3310 = true;
                class55.field1144 = true;
                class64.field1281 = 1;
            }
            if (class153.field3788 >= 597 && class153.field3788 <= 627 && class102.field2462 >= 168 && class102.field2462 < 205 && class27.field529[2] != -1) {
                class55.field1144 = true;
                class64.field1281 = 2;
                class139.field3310 = true;
            }
            if (class153.field3788 >= 625 && class153.field3788 <= 669 && class102.field2462 >= 168 && class102.field2462 < 203 && class27.field529[3] != -1) {
                class64.field1281 = 3;
                class139.field3310 = true;
                class55.field1144 = true;
            }
            if (class153.field3788 >= 666 && class153.field3788 <= 696 && class102.field2462 >= 168 && class102.field2462 < 205 && class27.field529[4] != -1) {
                class55.field1144 = true;
                class139.field3310 = true;
                class64.field1281 = 4;
            }
            if (class153.field3788 >= 694 && class153.field3788 <= 724 && class102.field2462 >= 168 && class102.field2462 < 205 && class27.field529[5] != -1) {
                class139.field3310 = true;
                class55.field1144 = true;
                class64.field1281 = 5;
            }
            if (class153.field3788 >= 722 && class153.field3788 <= 756 && class102.field2462 >= 169 && class102.field2462 < 205 && class27.field529[6] != -1) {
                class139.field3310 = true;
                class55.field1144 = true;
                class64.field1281 = 6;
            }
            if (class153.field3788 >= 540 && class153.field3788 <= 574 && class102.field2462 >= 466 && class102.field2462 < 502 && class27.field529[7] != -1) {
                class64.field1281 = 7;
                class55.field1144 = true;
                class139.field3310 = true;
            }
            if (class153.field3788 >= 572 && class153.field3788 <= 602 && class102.field2462 >= 466 && class102.field2462 < 503 && class27.field529[8] != -1) {
                class64.field1281 = 8;
                class55.field1144 = true;
                class139.field3310 = true;
            }
            if (class153.field3788 >= 599 && class153.field3788 <= 629 && class102.field2462 >= 466 && class102.field2462 < 503 && class27.field529[9] != -1) {
                class139.field3310 = true;
                class55.field1144 = true;
                class64.field1281 = 9;
            }
            if (class153.field3788 >= 627 && class153.field3788 <= 671 && class102.field2462 >= 467 && class102.field2462 < 502 && class27.field529[10] != -1) {
                class139.field3310 = true;
                class55.field1144 = true;
                class64.field1281 = 10;
            }
            if (class153.field3788 >= 669 && class153.field3788 <= 699 && class102.field2462 >= 466 && class102.field2462 < 503 && class27.field529[11] != -1) {
                class139.field3310 = true;
                class64.field1281 = 11;
                class55.field1144 = true;
            }
            if (class153.field3788 >= 696 && class153.field3788 <= 726 && class102.field2462 >= 466 && class102.field2462 < 503 && class27.field529[12] != -1) {
                class55.field1144 = true;
                class139.field3310 = true;
                class64.field1281 = 12;
            }
            if (class153.field3788 >= 724 && class153.field3788 <= 758 && class102.field2462 >= 466 && class102.field2462 < 502 && class27.field529[13] != -1) {
                class139.field3310 = true;
                class64.field1281 = 13;
                class55.field1144 = true;
            }
        }
        if (arg0 <= 115) {
            method479(-5);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static void method480(boolean arg0) {
        field1431 = null;
        field1424 = null;
        if (!arg0) {
            field1430 = 103L;
        }
        field1419 = null;
        field1412 = null;
        field1422 = null;
        field1413 = null;
        field1432 = null;
        field1428 = null;
        field1417 = null;
        field1416 = null;
        field1426 = null;
        field1410 = null;
    }

    @OriginalMember(owner = "client!jf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1429++;
        this.field1433.paint(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class68(Component arg0) {
        this.field1433 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lcf;IIZ)V")
    public static final void method481(class21 arg0, int arg1, int arg2, boolean arg3) {
        if (arg0.field2017 == arg2 && arg2 != -1) {
            int var4 = class130.method1013(arg2, -110).field2319;
            if (var4 == 1) {
                arg0.field1994 = arg1;
                arg0.field1952 = 0;
                arg0.field2010 = 0;
                arg0.field2015 = 0;
            }
            if (var4 == 2) {
                arg0.field2010 = 0;
            }
        } else if (arg2 == -1 || arg0.field2017 == -1 || class130.method1013(arg2, -81).field2342 >= class130.method1013(arg0.field2017, -122).field2342) {
            arg0.field2015 = 0;
            arg0.field1952 = 0;
            arg0.field1994 = arg1;
            arg0.field1955 = arg0.field1963;
            arg0.field2017 = arg2;
            arg0.field2010 = 0;
        }
        field1415++;
        if (!arg3) {
            method479(-124);
        }
    }
}
