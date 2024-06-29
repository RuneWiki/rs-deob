import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class64 extends class166 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Z")
    public boolean field1510;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "[Lha;")
    public class64[] field1520;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Lcd;")
    private static class23 field1529 = class54.method414("Could not complete login)3", -1);

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lcd;")
    public static class23 field1522 = field1529;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field1525 = 0;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Lcd;")
    public static class23 field1527 = class54.method414("oder ung-Ultiges Passwort)3", -1);

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Lcd;")
    private static class23 field1532 = class54.method414("Players", -1);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lcd;")
    public static class23 field1512 = field1532;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field1526 = 3353893;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Loh;")
    public class133 field1508;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lsg;")
    public class168 field1513;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lea;")
    public static class38 field1515;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "Lkh;")
    public static class97 field1524;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)[I")
    public final int[] method479(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field1532 = null;
        }
        field1511++;
        return this.field1520[arg2].field1510 ? this.field1520[arg2].method35(arg1, arg0 ^ 0x24CC) : this.field1520[arg2].method36(arg1, true)[0];
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public void method44(byte arg0) {
        field1516++;
        if (arg0 != -22) {
            this.method36(19, false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[I")
    public int[] method35(int arg0, int arg1) {
        field1519++;
        if (arg1 == -9421) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)I")
    public int method380(int arg0) {
        field1517++;
        if (arg0 != -1) {
            field1527 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method480(boolean arg0) {
        field1515 = null;
        field1512 = null;
        if (!arg0) {
            method480(false);
        }
        field1527 = null;
        field1529 = null;
        field1522 = null;
        field1532 = null;
        field1524 = null;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I")
    public int method41(int arg0) {
        if (arg0 != -1) {
            this.method482(-128, -33, (byte) 58);
        }
        field1528++;
        return -1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)[[I")
    public int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            this.method35(-95, -120);
        }
        field1523++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILva;)V")
    public void method37(byte arg0, int arg1, class189 arg2) {
        field1514++;
        int var4 = 23 / ((7 - arg0) / 43);
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public final void method481(int arg0) {
        int var2 = -5 / ((52 - arg0) / 54);
        field1521++;
        if (this.field1510) {
            this.field1513.method1028(-120);
            this.field1513 = null;
        } else {
            this.field1508.method848(100);
            this.field1508 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method482(int arg0, int arg1, byte arg2) {
        if (arg2 > -122) {
            return null;
        }
        field1533++;
        if (this.field1520[arg0].field1510) {
            int[] var4 = this.field1520[arg0].method35(arg1, -9421);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1520[arg0].method36(arg1, true);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V")
    public final void method483(int arg0, int arg1, int arg2) {
        field1530++;
        if (arg2 <= 56) {
            this.method36(-87, false);
        }
        int var4 = this.field1509 == 255 ? arg0 : this.field1509;
        if (this.field1510) {
            this.field1513 = new class168(var4, arg0, arg1);
        } else {
            this.field1508 = new class133(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IZ)V")
    public class64(int arg0, boolean arg1) {
        this.field1510 = arg1;
        this.field1520 = new class64[arg0];
    }
}
