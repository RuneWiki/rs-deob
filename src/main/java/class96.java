import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class96 {

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Ljava/lang/String;")
    private String field1513 = "null";

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "C")
    public char field1505;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "C")
    public char field1508;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lkea;")
    public class213 field1507;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lkea;")
    private class213 field1511;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLmo;)V", line = 8)
    public final void method780(byte arg0, class695 arg1) {
        field1517++;
        if (arg0 != 9) {
            return;
        }
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                return;
            }
            this.method786(var3, arg0 ^ 0xFFFFFF91, arg1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 29)
    public final int method781(int arg0, int arg1) {
        if (arg1 >= -39) {
            this.method785((byte) 24);
        }
        field1514++;
        if (this.field1507 == null) {
            return this.field1516;
        } else {
            class111 var3 = (class111) this.field1507.method1405((long) arg0, (byte) -34);
            return var3 == null ? this.field1516 : var3.field1683;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 49)
    private final void method782(byte arg0) {
        if (arg0 <= 10) {
            this.method783(48, (byte) 77);
        }
        this.field1511 = new class213(this.field1507.method1408((byte) -49));
        field1518++;
        for (class500 var2 = (class500) this.field1507.method1407(102); var2 != null; var2 = (class500) this.field1507.method1413(true)) {
            class412 var3 = new class412(var2.field7083, (int) var2.field9386);
            this.field1511.method1403((byte) -18, var3, class617.method3425(-75, var2.field7083));
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 74)
    public final String method783(int arg0, byte arg1) {
        field1512++;
        if (this.field1507 == null) {
            return this.field1513;
        }
        if (arg1 != -71) {
            this.method783(64, (byte) -39);
        }
        class500 var3 = (class500) this.field1507.method1405((long) arg0, (byte) -86);
        return var3 == null ? this.field1513 : var3.field7083;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z", line = 96)
    public final boolean method784(int arg0, int arg1) {
        field1506++;
        if (this.field1507 == null) {
            return false;
        }
        if (this.field1511 == null) {
            this.method785((byte) 38);
        }
        if (arg1 != -4136) {
            this.method787(127, null);
        }
        class111 var3 = (class111) this.field1511.method1405((long) arg0, (byte) -56);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 120)
    private final void method785(byte arg0) {
        int var2 = -12 / ((arg0 + 30) / 49);
        this.field1511 = new class213(this.field1507.method1408((byte) -77));
        field1515++;
        for (class111 var3 = (class111) this.field1507.method1407(-125); var3 != null; var3 = (class111) this.field1507.method1413(true)) {
            class111 var4 = new class111((int) var3.field9386);
            this.field1511.method1403((byte) -18, var4, (long) var3.field1683);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILmo;)V", line = 141)
    private final void method786(int arg0, int arg1, class695 arg2) {
        if (arg1 > -99) {
            this.method780((byte) -48, null);
        }
        if (arg0 == 1) {
            this.field1505 = class178.method1210(32062, arg2.method3827((byte) 63));
        } else if (arg0 == 2) {
            this.field1508 = class178.method1210(32062, arg2.method3827((byte) -117));
        } else if (arg0 == 3) {
            this.field1513 = arg2.method3836(false);
        } else if (arg0 == 4) {
            this.field1516 = arg2.method3880(8);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method3847((byte) 118);
            this.field1507 = new class213(class2.method9(var4, -105));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3880(8);
                class665 var7;
                if (arg0 == 5) {
                    var7 = new class500(arg2.method3836(false));
                } else {
                    var7 = new class111(arg2.method3880(8));
                }
                this.field1507.method1403((byte) -18, var7, (long) var6);
            }
        }
        field1510++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 196)
    public final boolean method787(int arg0, String arg1) {
        field1509++;
        if (this.field1507 == null) {
            return false;
        }
        if (this.field1511 == null) {
            this.method782((byte) 36);
        }
        if (arg0 != 2) {
            this.field1508 = 'r';
        }
        for (class412 var3 = (class412) this.field1511.method1405(class617.method3425(72, arg1), (byte) -118); var3 != null; var3 = (class412) this.field1511.method1411((byte) 30)) {
            if (var3.field6002.equals(arg1)) {
                return true;
            }
        }
        return false;
    }
}
