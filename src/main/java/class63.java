import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 {

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public int field1524 = 0;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public int field1542 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1523 = -1;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lad;")
    public static class5 field1527 = class88.method674("Wen m-Ochten Sie hinzuf-Ugen?", 101);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lad;")
    public static class5 field1528 = class88.method674("", -75);

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[[B")
    public static byte[][] field1521 = new byte[250][];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lad;")
    public static class5 field1530 = class88.method674("titlebutton", -76);

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lad;")
    public static class5 field1522 = class88.method674("Name eingeben:", 26);

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lad;")
    public static class5 field1537 = class88.method674("Bitte laden Sie die Seite neu)3", -66);

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lad;")
    public static class5 field1539 = class88.method674("welle2:", 123);

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lad;")
    public static class5 field1529 = class88.method674("chatback", 43);

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Z")
    public static boolean field1543 = false;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lra;")
    public class103 field1531;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Z")
    public static boolean field1540;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[B")
    public static byte[] field1525;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 29)
    public static final void method501(byte arg0) {
        field1533++;
        class129.field3127.method101((byte) -127);
        int var1 = -25 / ((-arg0 - 74) / 37);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 53)
    public static void method502(int arg0) {
        field1525 = null;
        if (arg0 < 36) {
            return;
        }
        field1539 = null;
        field1528 = null;
        field1530 = null;
        field1527 = null;
        field1521 = null;
        field1537 = null;
        field1529 = null;
        field1522 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V", line = 76)
    public static final void method503(byte arg0) {
        class90.field2118 = null;
        int var1 = -64 % ((31 - arg0) / 32);
        class133.field3207 = null;
        class12.field353 = null;
        field1535++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lad;Lad;Lrd;B)Lvd;", line = 109)
    public static final class130 method504(class5 arg0, class5 arg1, class106 arg2, byte arg3) {
        field1519++;
        if (arg3 != 26) {
            method501((byte) 51);
        }
        int var4 = arg2.method870(arg1, -115);
        int var5 = arg2.method858(var4, (byte) 78, arg0);
        return class95.method726(var4, arg2, var5, 31912);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILrd;Lrd;)V", line = 131)
    public static final void method505(int arg0, class106 arg1, class106 arg2) {
        class104.field2529 = arg1;
        field1538++;
        class102.field2499 = arg2;
        if (arg0 != 3) {
            field1530 = null;
        }
        class102.field2488 = class102.field2499.method869(22222, 3);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 161)
    public static final void method506(boolean arg0) {
        if (!arg0) {
            field1540 = true;
        }
        class102.field2494.method101((byte) -128);
        field1541++;
        class7.field257.method101((byte) -124);
    }
}
