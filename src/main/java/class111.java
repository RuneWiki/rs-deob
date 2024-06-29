import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class111 extends class271 {

    @OriginalMember(owner = "client!uq", name = "P", descriptor = "I")
    public int field1589 = -1;

    @OriginalMember(owner = "client!uq", name = "D", descriptor = "I")
    public int field1578 = 12800;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
    public int field1583 = 0;

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "Z")
    public boolean field1588 = true;

    @OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
    public int field1582 = 12800;

    @OriginalMember(owner = "client!uq", name = "T", descriptor = "I")
    public int field1593 = -1;

    @OriginalMember(owner = "client!uq", name = "V", descriptor = "I")
    public int field1595 = 0;

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "Ljava/lang/String;")
    public String field1576;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!uq", name = "E", descriptor = "Ljava/lang/String;")
    public String field1579;

    @OriginalMember(owner = "client!uq", name = "F", descriptor = "Lvp;")
    public class123 field1580;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "Lri;")
    public static class73 field1577 = new class73(4, -2);

    @OriginalMember(owner = "client!uq", name = "R", descriptor = "Lng;")
    public static class226 field1591 = new class226(8);

    @OriginalMember(owner = "client!uq", name = "W", descriptor = "Lng;")
    public static class226 field1596 = new class226(260);

    @OriginalMember(owner = "client!uq", name = "X", descriptor = "Lvp;")
    public static class123 field1597 = new class123();

    @OriginalMember(owner = "client!uq", name = "Y", descriptor = "Llt;")
    public static class475 field1598 = new class475("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!uq", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field1599 = new String[100];

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!uq", name = "Q", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!uq", name = "S", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!uq", name = "U", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V", line = 9)
    public final void method678(boolean arg0) {
        this.field1595 = 0;
        field1590++;
        this.field1578 = 12800;
        this.field1583 = 0;
        this.field1582 = 12800;
        class306 var2 = (class306) this.field1580.method816(101);
        if (!arg0) {
            this.method682(-8, null, (byte) 92, 7, -123);
        }
        while (var2 != null) {
            if (this.field1595 < var2.field4398) {
                this.field1595 = var2.field4398;
            }
            if (var2.field4400 < this.field1582) {
                this.field1582 = var2.field4400;
            }
            if (var2.field4396 < this.field1578) {
                this.field1578 = var2.field4396;
            }
            if (var2.field4401 > this.field1583) {
                this.field1583 = var2.field4401;
            }
            var2 = (class306) this.field1580.method812(121);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII)Z", line = 52)
    public final boolean method679(byte arg0, int arg1, int arg2) {
        field1587++;
        if (arg0 != 108) {
            field1598 = null;
        }
        for (class306 var4 = (class306) this.field1580.method816(108); var4 != null; var4 = (class306) this.field1580.method812(arg0 + 6)) {
            if (var4.method1926(-42, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)I", line = 81)
    public static final int method680(boolean arg0, int arg1) {
        if (arg0) {
            field1597 = null;
        }
        field1592++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([IIBI)Z", line = 92)
    public final boolean method681(int[] arg0, int arg1, byte arg2, int arg3) {
        field1594++;
        int var5 = -83 / ((57 - arg2) / 51);
        for (class306 var6 = (class306) this.field1580.method816(101); var6 != null; var6 = (class306) this.field1580.method812(99)) {
            if (var6.method1926(-118, arg1, arg3)) {
                var6.method1925((byte) -101, arg1, arg0, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[IBII)Z", line = 119)
    public final boolean method682(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        field1585++;
        class306 var6 = (class306) this.field1580.method816(113);
        if (arg2 <= 56) {
            this.field1582 = -86;
        }
        while (var6 != null) {
            if (var6.method1930(334, arg4, arg0, arg3)) {
                var6.method1925((byte) -108, arg4, arg1, arg3);
                return true;
            }
            var6 = (class306) this.field1580.method812(86);
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V", line = 144)
    public static void method683(byte arg0) {
        field1577 = null;
        field1597 = null;
        field1598 = null;
        if (arg0 >= 48) {
            field1596 = null;
            field1591 = null;
            field1599 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 220)
    public class111(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field1576 = arg1;
        this.field1586 = arg3;
        this.field1593 = arg4;
        this.field1588 = arg5;
        this.field1581 = arg0;
        this.field1579 = arg2;
        this.field1589 = arg6;
        if (this.field1589 == 255) {
            this.field1589 = 0;
        }
        this.field1580 = new class123();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[IIZ)Z", line = 174)
    public final boolean method684(int arg0, int[] arg1, int arg2, boolean arg3) {
        field1584++;
        if (arg3) {
            this.field1593 = 110;
        }
        for (class306 var5 = (class306) this.field1580.method816(104); var5 != null; var5 = (class306) this.field1580.method812(110)) {
            if (var5.method1924((byte) 11, arg2, arg0)) {
                var5.method1929(-9341, arg0, arg1, arg2);
                return true;
            }
        }
        return false;
    }
}
