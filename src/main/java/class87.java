import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class87 {

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lbe;")
    public static class283 field1473 = class153.method941(126, ":allyreq:");

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lbe;")
    public static class283 field1477 = class153.method941(-77, "<img=0>");

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ltf;")
    public static class242 field1466 = new class242(64);

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lbe;")
    public static class283 field1478 = class153.method941(125, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lbe;")
    public static class283 field1479 = class153.method941(-120, "<col=ffffff>");

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lbe;")
    public static class283 field1480 = class153.method941(-96, "null");

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
    public static int[] field1471;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Z", line = 17)
    public static final boolean method558(byte arg0) {
        field1463++;
        class12 var1 = class278.field4645;
        synchronized (class278.field4645) {
            if (arg0 != -125) {
                return false;
            } else if (class7.field75 == class186.field3195) {
                return false;
            } else {
                class35.field523 = class122.field2042[class7.field75];
                class215.field3652 = class163.field2675[class7.field75];
                class7.field75 = class7.field75 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)V", line = 38)
    public static final void method559(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1479 = (class283) null;
        }
        class167.method1035();
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        field1469++;
        class1.field2 = class37.method233(class150.field2460, 0, 0, -22013, arg0, arg2);
        if (class1.field2 == null) {
            class143.method903((byte) -113);
            return;
        }
        class297.field5039 = arg0;
        class104.field1784 = arg2;
        class202.method1293(class150.field2460, 102);
        class202.method1291(0, (byte) 109);
        class245.method1669(false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V", line = 74)
    public static final void method561(int arg0, boolean arg1) {
        if (!arg1) {
            method561(25, true);
        }
        field1476++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class72.method481(-464325408);
        } else if (arg0 == 2) {
            class46.method273(-6);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 118)
    public static void method563(int arg0) {
        if (arg0 != 64) {
            method561(-106, true);
        }
        field1466 = null;
        field1471 = null;
        field1479 = null;
        field1478 = null;
        field1473 = null;
        field1480 = null;
        field1477 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public abstract void method560(int arg0, int arg1);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
    public abstract void method562(int arg0, int arg1, int arg2);
}
