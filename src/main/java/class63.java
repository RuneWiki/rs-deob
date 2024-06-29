import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class63 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1617 = 0;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1618 = 0;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1616 = 0;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1622 = 0;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lwd;")
    private static class150 field1628 = class2.method9(true, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lwd;")
    public static class150 field1625 = field1628;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lwd;")
    public static class150 field1626 = class2.method9(true, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lof;")
    public static class103 field1627 = new class103();

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Lwd;")
    private static class150 field1631 = class2.method9(true, " million");

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "Lwd;")
    public static class150 field1634 = field1631;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "J")
    public static long field1621;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I")
    public static final int method499(int arg0, int arg1, int arg2, int arg3) {
        field1615++;
        if (arg1 <= 5) {
            return -57;
        } else {
            int var4 = 256 - arg0;
            return ((arg2 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg0 & 0xFF0000) + ((arg2 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) >> 8;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method500(byte arg0) {
        int var1 = 85 / ((arg0 + 9) / 37);
        class96.field2213.method431(0);
        field1629++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIILff;IZ)V")
    public static final void method501(byte arg0, int arg1, int arg2, class42 arg3, int arg4, boolean arg5) {
        class66.field1690 = arg2;
        class18.field490 = 1;
        class74.field1846 = arg4;
        class16.field426 = 10000;
        class5.field106 = arg3;
        class130.field3066 = arg5;
        field1630++;
        class37.field1016 = arg1;
        int var6 = -113 % ((arg0 + 42) / 59);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method502(int arg0) {
        field1626 = null;
        field1634 = null;
        field1631 = null;
        field1628 = null;
        if (arg0 != 738874376) {
            method499(102, 52, -2, 34);
        }
        field1625 = null;
        field1627 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIB)V")
    public static final void method503(int arg0, int arg1, int arg2, byte arg3) {
        field1623++;
        if (arg3 != -42) {
            field1628 = null;
        }
        if (class119.field2757 == 0 || arg1 == 0 || class17.field464 >= 50) {
            return;
        }
        class133.field3133[class17.field464] = arg2;
        class5.field102[class17.field464] = arg1;
        class55.field1437[class17.field464] = arg0;
        class97.field2232[class17.field464] = null;
        class24.field686[class17.field464] = 0;
        class17.field464++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
    public abstract int method358(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public abstract void method354(byte arg0);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
    public abstract void method351(byte arg0);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public static final void method504(int arg0) {
        field1632++;
        class112.field2591.method431(0);
        if (arg0 != 16711680) {
            method504(32);
        }
    }
}
