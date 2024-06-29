import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class89 extends class127 {

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "Lbd;")
    public static class162 field1583 = class17.method142(0, " weitere Optionen");

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "Lbd;")
    private static class162 field1581 = class17.method142(0, " ");

    @OriginalMember(owner = "client!mk", name = "db", descriptor = "Lbd;")
    public static class162 field1588 = class17.method142(0, "www");

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "Lbd;")
    public static class162 field1584 = class17.method142(0, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!mk", name = "gb", descriptor = "Lbd;")
    public static class162 field1591 = field1581;

    @OriginalMember(owner = "client!mk", name = "jb", descriptor = "Lbd;")
    public static class162 field1594 = class17.method142(0, ")4j");

    @OriginalMember(owner = "client!mk", name = "ib", descriptor = "J")
    public static long field1593 = 0L;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "B")
    public byte field1580;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!mk", name = "ab", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!mk", name = "bb", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!mk", name = "cb", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!mk", name = "eb", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!mk", name = "fb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!mk", name = "kb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!mk", name = "hb", descriptor = "Lb;")
    public class94 field1592;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "[[Z")
    public static boolean[][] field1582;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V", line = 10)
    public static final void method676(int arg0, int arg1, int arg2, int arg3) {
        if (class154.field2727 != 0 && arg2 != 0 && class255.field4233 < 50 && arg1 != -1) {
            class270.field4518[class255.field4233] = arg1;
            class29.field495[class255.field4233] = arg2;
            class237.field3948[class255.field4233] = arg3;
            class194.field3270[class255.field4233] = null;
            class30.field504[class255.field4233] = 0;
            class255.field4233++;
        }
        field1589++;
        if (arg0 <= 31) {
            field1583 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(B)V", line = 39)
    public static void method677(byte arg0) {
        if (arg0 != -57) {
            method676(22, -13, -29, 84);
        }
        field1588 = null;
        field1583 = null;
        field1591 = null;
        field1582 = (boolean[][]) null;
        field1581 = null;
        field1594 = null;
        field1584 = null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)I", line = 55)
    public final int method650(boolean arg0) {
        field1590++;
        if (arg0) {
            method677((byte) 118);
        }
        return this.field1592 == null ? 0 : this.field1592.field1653 * 100 / (this.field1592.field1681.length - this.field1580);
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(B)V", line = 77)
    public static final void method678(byte arg0) {
        field1585++;
        class308.method2091();
        for (int var1 = 0; var1 < 4; var1++) {
            class267.field4473[var1].method1369(16777216);
        }
        if (arg0 != -1) {
            method676(109, -126, 32, -107);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I", line = 113)
    public static final int method679(int arg0, int arg1, int arg2) {
        field1586++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (arg2 > -30) {
                method676(-54, -119, 65, -84);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(Z)[B", line = 160)
    public final byte[] method652(boolean arg0) {
        if (arg0) {
            this.field1592 = (class94) null;
        }
        field1579++;
        if (this.field2311 || this.field1592.field1681.length - this.field1580 > this.field1592.field1653) {
            throw new RuntimeException();
        }
        return this.field1592.field1681;
    }
}
